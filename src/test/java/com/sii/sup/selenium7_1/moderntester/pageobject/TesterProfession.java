package com.sii.sup.selenium7_1.moderntester.pageobject;

public enum TesterProfession {
    ManualTester("Manual tester"), AutomationTester("Automation Tester"), Other("Other"), NONE("NONE");
    private final String profession;

   TesterProfession(String profession) {
        this.profession = profession;
    }

    public String getProfession() {
        return profession;
    }
}
