package ga.code.android_quiz_v2;

public class Questions {
    public String mQuestions[] = {
            "Wie viel Kilogramm Fleisch hatten die Menschen in der Steinzeit zu essen, wenn sie ein Mammut erlegten? Tipp: Ein Mammut wog ungefähr 6 Tonnen.",
            "Welche Motive sind bei Höhlenmalereien zu sehen?",
            "Wie groß ist ein ausgewachsenes Mammut?",
            "Welches ist das Universalwerkzeug der Steinzeit?",
            "Wie lange glaubst du benötigt man, um 1 Kilogramm Getreide mit Techniken der Jungsteinzeit zu mahlen?",
            "Wie lange war der Limes?"

    };

    private String mChoices[][] = {
            {"Die Menschen hatten ungefähr 1 Tonne Mammutfleisch, das sie verarbeiten konnten.", "Gar keins, die Menschen der Steinzeit jagten keine Mammuts.", "Die Menschen hatten ungefähr 4 Tonnen Mammutfleisch, das sie verarbeiten konnten."},
            {"Autos, Busse und Flugzeuge", "Tiere der Urgeschichte und Jagdszenen", "Comics"},
            {"Ein ausgewachsenes Mammut kann eine Schulterhöhe von bis zu 10 Meter erreichen.", "Ein ausgewachsenes Mammut kann eine Schulterhöhe von 1,5 bis 4 Meter erreichen.", "Ein ausgewachsenes Mammut kann eine Schulterhöhe bis zu 2 Meter erreichen."},
            {"Die Bohrmaschine kann als Universalwerkzeug der Steinzeit bezeichnet werden.","Die Menschen hatten noch kein Werkzeug in der Steinzeit.","Das Universalwerkzeug ist der Faustkeil."},
            {"Für ein Kilo feines Mehl musste man ungefähr 1 Stunde Getreide mahlen!","Für ein Kilo feines Mehl musste man ungefähr 6 Stunden Getreide mahlen!","Für ein Kilo feines Mehl musste man ungefähr 10 Stunden Getreide mahlen!"},
            {"über 1.000 Kilometer","über 5.000 Kilometer","über 10.000 Kilometer"}

    };

    private String mCorrectAnswers[] = {"Die Menschen hatten ungefähr 1 Tonne Mammutfleisch, das sie verarbeiten konnten.",
            "Tiere der Urgeschichte und Jagdszenen",
            "Ein ausgewachsenes Mammut kann eine Schulterhöhe von 1,5 bis 4 Meter erreichen.",
            "Das Universalwerkzeug ist der Faustkeil.",
            "Für ein Kilo feines Mehl musste man ungefähr 6 Stunden Getreide mahlen!",
            "über 5.000 Kilometer"};

    public String getQuestions(int a){
        String question = mQuestions[a];
        return question;

    }

    public String getChoice1(int a){
        String choice = mChoices[a][0];
        return choice;
    }

    public String getChoice2(int a){
        String choice = mChoices[a][1];
        return choice;
    }

    public String getChoice3(int a){
        String choice = mChoices[a][2];
        return choice;
    }

    public String getCorrectAnswer(int a){
        String answer = mCorrectAnswers[a];
        return answer;
    }

}


