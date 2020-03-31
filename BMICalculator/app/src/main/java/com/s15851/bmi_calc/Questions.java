package com.s15851.bmi_calc;

public class Questions {

    public String mQuestions[] = {
            "Gdzie powinien zadzwonić chory, który stwierdzi  u siebie objawy zakażenia koronawirusem?",
            "Od jak dawna panuje w Polsce koronawirus?",
            "Czy przy pandemii koronawirusa można wychodzić z domu?",
            "Jakie są typowe objawy zakażenia koronawirusem?",
            "Ile trwa kwarantanna dla osób przekraczających granicę Polski po ogłoszeniu pandemii?",
            "Kto jest najbardziej narażony za zakażenie się koronawirusem?",
            "Dlaczego w nazwie wirusa występuje część „korona”?",
            "Jak brzmi poprawna nazwa nowego koronawirusa?",
            "Jaką chorobę powoduje nowy koronawirus?",
            "Jak chronić się przed koronawirusem?",
            "Ile powinno trwać właściwe mycie rąk?",
            "Co należy zrobić, kiedy podejrzewamy zakażenie?",
            "Czy mycie rąk może uchronić przed zakażeniem koronawirusem?",
            "Czy alkohol wysoko procentowy zwalcza koronawirusa?"
    };

    private String mChoices[][] = {
            {"Do lekarza POZ", "Do szpitala", "Do sanepidu", "Na 112"},
            {"Od grudnia", "Od stycznia", "Od lutego", "Od marca"},
            {"Tak ale tylko do pracy bądź na zakupy", "Tylko do apteki", "Tak w każdym przypadku", "Jest zakaz wychodzenia z domu"},
            {"Gorączka, kaszel, duszności, problemy z oddychaniem", "Gorączka, wymioty", "Wysypka i wymioty", "Problemy z oddychaniem i biegunka"},
            {"2 dni", "7 dni", "10 dni", "14 dni"},
            {"Noworodki", "Dzieci", "Młodzież", "Osoby starsze i w przewlekle chore"},
            {"Pierwszym zakażonym w dziejach był król", "Wyodrębniono go z rośliny – wilczomlecza, czyli korony cierniowej", "Cząsteczki wirusa są otoczone strukturą w formie pierścienia", "Pierwotnym ogniskiem pandemii było Wuhan – dawne miasto królewskie Chin"},
            {"Covid-19", "Coronaviridae", "nCoV-2019", "SARS-CoV-2"},
            {"Zapalenie płuc", "Covid-19", "Bezdech", "Krztusiec"},
            {"Jeść dużo owoców", "Zażywać profilaktycznie leki na grypę", "Myć ręce, nie dotykać twarzy i przebywać w otoczeniu zarażonych", "Wychodzić z domu tylko w maseczce"},
            {"10 sekund", "20 sekund", "2 minuty", "Tyle sekund, ile ważymy"},
            {"Zażywać dużo witaminy C", "Pójść do lekarza", "Zadzwonić po teleporadę do lekarza lub specjalną infolinię", "Nic, poczekać aż się rozwinie"},
            {"Tak", "Tak, ale częste mycie", "Nie, to mit", "Nie zawsze"},
            {"Tak", "Tak, ale poprzez regularne nacieranie", "Nie", "Nie w każdym przypadku"},
    };

    private String mCorrectAnswers[] = {
            "Do sanepidu",
            "Od lutego",
            "Tak ale tylko do pracy bądź na zakupy",
            "Gorączka, kaszel, duszności, problemy z oddychaniem",
            "14 dni",
            "Osoby starsze i w przewlekle chore",
            "Cząsteczki wirusa są otoczone strukturą w formie pierścienia",
            "SARS-CoV-2",
            "Covid-19",
            "Myć ręce, nie dotykać twarzy i nie przebywać w otoczeniu zarażonych",
            "20 sekund",
            "Zadzwonić po teleporadę do lekarza lub specjalną infolinię",
            "Tak, ale częste mycie",
            "Nie"
    };

    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    };

    public String getChoice1(int a) {
        String choice = mChoices[a][0];
        return choice;
    };

    public String getChoice2(int a) {
        String choice = mChoices[a][1];
        return choice;
    };

    public String getChoice3(int a) {
        String choice = mChoices[a][2];
        return choice;
    };

    public String getChoice4(int a) {
        String choice = mChoices[a][3];
        return choice;
    };

    public String getChoice5(int a) {
        String choice = mChoices[a][4];
        return choice;
    };

    public String getChoice6(int a) {
        String choice = mChoices[a][5];
        return choice;
    };

    public String getChoice7(int a) {
        String choice = mChoices[a][6];
        return choice;
    };

    public String getChoice8(int a) {
        String choice = mChoices[a][7];
        return choice;
    };

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    };
}
