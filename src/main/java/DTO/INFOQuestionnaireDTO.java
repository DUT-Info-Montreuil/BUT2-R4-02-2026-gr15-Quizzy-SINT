package DTO;

public class INFOQuestionnaireDTO {

    private int idQuestionnaire;
    private String libelle;
    private int compteurQuestion;
    private int[] tabDifficulte; // longueur 3 : [0]=simple, [1]=intermediaire, [2]=experte

    public INFOQuestionnaireDTO() {
        this.tabDifficulte = new int[3];
    }

    public INFOQuestionnaireDTO(int idQuestionnaire, String libelle, int compteurQuestion, int[] tabDifficulte) {
        this.idQuestionnaire = idQuestionnaire;
        this.libelle = libelle;
        setCompteurQuestion(compteurQuestion);
        setTabDifficulte(tabDifficulte);
    }

    public int getIdQuestionnaire() {
        return idQuestionnaire;
    }

    public void setIdQuestionnaire(int idQuestionnaire) {
        this.idQuestionnaire = idQuestionnaire;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public int getCompteurQuestion() {
        return compteurQuestion;
    }

    public void setCompteurQuestion(int compteurQuestion) {
        if (compteurQuestion < 0) {
            throw new IllegalArgumentException("compteurQuestion doit être positif");
        }
        this.compteurQuestion = compteurQuestion;
    }

    public int[] getTabDifficulte() {
        return tabDifficulte;
    }

    public void setTabDifficulte(int[] tabDifficulte) {
        if (tabDifficulte == null || tabDifficulte.length != 3) {
            throw new IllegalArgumentException("tabDifficulte doit être un tableau de longueur 3");
        }
        this.tabDifficulte = tabDifficulte;
    }

    @Override
    public String toString() {
        return "INFOQuestionnaireDTO{" +
                "idQuestionnaire=" + idQuestionnaire +
                ", libelle='" + libelle + '\'' +
                ", compteurQuestion=" + compteurQuestion +
                '}';
    }
}