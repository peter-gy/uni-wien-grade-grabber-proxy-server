package hu.gyarmatip.uniwiengradegrabberproxyserver.service;

import hu.gyarmatip.uniwiengradegrabberproxyserver.model.ResourceNode;

import java.util.List;

public interface ResourceProviderService {

    /**
     * Returns a list of ResourceNode objects representing top modules.
     * An example for the name of a node of such:
     * "UA 033 521 Bachelorstudium Informatik UG2002 von 01.10.2019"
     * @param cookies the u:space session related cookies as a single String
     * @return a list of top module ResourceNode objects
     */
    List<ResourceNode> getTopModules(String cookies);

    /**
     * Returns a list of ResourceNode objects representing module groups, which are the children of
     * the top module node specified by the supplied topModuleTreeId.
     * An example for the name of such a node:
     * "Pflichtmodulgruppe Studieneingangs- und Orientierungsphase"
     * @param topModuleTreeId the id of the parent node
     * @param cookie the u:space session related cookies as a single String
     * @return a list of module group ResourceNode objects
     */
    List<ResourceNode> getModuleGroups(float topModuleTreeId, String cookie);

    /**
     * Returns a list of ResourceNode objects representing modules, which are the children of
     * the module group node specified by the supplied topModuleTreeId.
     * An example for the name of such a node:
     * "VU Datenbanksysteme"
     * @param moduleGroupTreeId the id of the parent node
     * @param cookie the u:space session related cookies as a single String
     * @return a list of module group ResourceNode objects
     */
    List<ResourceNode> getModules(float moduleGroupTreeId, String cookie);
}
