package com.s15851.bmicalculator


class Questions {

    var mQuestions = arrayOf(
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
    )

    private val mChoices =
        arrayOf(
            arrayOf("Do lekarza POZ", "Do szpitala", "Do sanepidu", "Na 112"),
            arrayOf("Od grudnia", "Od stycznia", "Od lutego", "Od marca"),
            arrayOf(
                "Tak ale tylko do pracy bądź na zakupy",
                "Tylko do apteki",
                "Tak w każdym przypadku",
                "Jest zakaz wychodzenia z domu"
            ),
            arrayOf(
                "Gorączka, kaszel, duszności, problemy z oddychaniem",
                "Gorączka, wymioty",
                "Wysypka i wymioty",
                "Problemy z oddychaniem i biegunka"
            ),
            arrayOf("2 dni", "7 dni", "10 dni", "14 dni"),
            arrayOf(
                "Noworodki",
                "Dzieci",
                "Młodzież",
                "Osoby starsze i w przewlekle chore"
            ),
            arrayOf(
                "Pierwszym zakażonym w dziejach był król",
                "Wyodrębniono go z rośliny – wilczomlecza, czyli korony cierniowej",
                "Cząsteczki wirusa są otoczone strukturą w formie pierścienia",
                "Pierwotnym ogniskiem pandemii było Wuhan – dawne miasto królewskie Chin"
            ),
            arrayOf("Covid-19", "Coronaviridae", "nCoV-2019", "SARS-CoV-2"),
            arrayOf("Zapalenie płuc", "Covid-19", "Bezdech", "Krztusiec"),
            arrayOf(
                "Jeść dużo owoców",
                "Zażywać profilaktycznie leki na grypę",
                "Myć ręce, nie dotykać twarzy i przebywać w otoczeniu zarażonych",
                "Wychodzić z domu tylko w maseczce"
            ),
            arrayOf("10 sekund", "20 sekund", "2 minuty", "Tyle sekund, ile ważymy"),
            arrayOf(
                "Zażywać dużo witaminy C",
                "Pójść do lekarza",
                "Zadzwonić po teleporadę do lekarza lub specjalną infolinię",
                "Nic, poczekać aż się rozwinie"
            ),
            arrayOf("Tak", "Tak, ale częste mycie", "Nie, to mit", "Nie zawsze"),
            arrayOf(
                "Tak",
                "Tak, ale poprzez regularne nacieranie",
                "Nie",
                "Nie w każdym przypadku"
            )
        )
    private val mCorrectAnswers = arrayOf(
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
    )

    fun getQuestion(a: Int): String {
        return mQuestions[a]
    }

    fun getChoice1(a: Int): String {
        return mChoices[a][0]
    }

    fun getChoice2(a: Int): String {
        return mChoices[a][1]
    }

    fun getChoice3(a: Int): String {
        return mChoices[a][2]
    }

    fun getChoice4(a: Int): String {
        return mChoices[a][3]
    }

    fun getCorrectAnswer(a: Int): String {
        return mCorrectAnswers[a]
    }
}
