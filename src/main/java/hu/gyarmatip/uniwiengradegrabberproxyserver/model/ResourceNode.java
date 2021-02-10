package hu.gyarmatip.uniwiengradegrabberproxyserver.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class ResourceNode extends TreeNode {
    private float              sid;                // sid
    private String             name;               // textKurz
    private String             type;               // typ
    private String             prerequisites;      // voraussetzungen
    private float              completedCredits;   // ectsIst
    private float              maxCredits;         // ectsSoll
    private int                idealSemesterLow;   // semesterEmpfVon
    private int                idealSemesterHigh;  // semesterEmpfBis
    private float              studyPathPercent;   // prozentStudienpfad
    private List<ResourceNode> children;           // children
    private List<Performance>  performances;       // leistungsdaten
    private List<StudyContent> studyContentList;   // lehrinhaltList

    public static class Performance extends TreeNode {
        private float   id;             // leistungId
        private int     number;         // leistungsnummer
        private String  name;           // leistungKurz
        private String  examiner;       // pruefer
        private boolean passed;         // bestanden
        private int     dateTimestamp;  // datum
        private String  grade;          // note
        private float   credits;        // ects
        private float   sws;            // sws
        private String  semester;       // semester
    }

    public static class StudyContent {
        private String number;  // lehrinhaltNr
    }
}
