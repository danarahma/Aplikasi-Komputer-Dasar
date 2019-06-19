package khandana.com.kp.multiplechoicequiz;

import java.util.Random;

public class QuestionBank {

    private String textQuestions [] = {
            "Kata Komputer berasal dari bahasa latin, yaitu?",
            "Berikut ini elemen-elemen dari komputer, kecuali?",
            "Salah satu elemen dari sebuah komputer yang sifat alatnya bisa dilihat dan diraba secara langsung ialah?",
            "Pengguna komputer yang mengoperasikan komputer disebut?",
            "Perangkat keras yang berfungsi memasukkan huruf, angka, karakter ialah?",
            "Siapa tokoh yang mematenkan Keyboard ?",
            "Berikut jenis-jenis keyboard, kecuali?",
            "Perangkat keras yang berfungsi memindahkan cursor/pointer ialah?",
            "Apa kepanjangan dari GUI?",
            "Perangkat keras yang berfungsi untuk menerima dan melaksanakan perintah dan data dalam sebuah komputer ialah?",
            "Apa kepanjangan dari CPU?",
            "Berikut ini fungsi komponen di dalam CPU, kecuali?",
            "Perangkat keras yang digunakan untuk menampilkan suatu program di komputer?",
            "Perangkat keras yang berfungsi untuk menghasilkan cetakan dari komputer?",
            "Ada berapa jenis Printer?"
    };

    // array of multiple choices for each question
    private String multipleChoice [][] = {
            {"Comuter", "Computare", "Comote", "Compute"},
            {"Brainware", "Hardware", "Software", "Tupperware"},
            {"Brainware", "Hardware", "Software", "Tupperware"},
            {"Brainware", "Hardware", "Software", "Tupperware"},
            {"Mouse", "Printer", "Keyboard", "CPU"},
            {"Thomas A. Edinson", "Christopher Latham", "Alex Graham Bell", "Walt Disney"},
            {"QWERTY", "DVORAK", "KLOCKENBERG", "REMINGTON"},
            {"Mouse", "Printer", "Keyboard", "CPU"},
            {"Graphical Ubuntu Internet", "Globe User Interface","Graphical User Interface","Global Unity Interface"},
            {"Mouse", "Printer", "Keyboard", "CPU"},
            {"Center Processing Unit","Central Processing Unit", "Central Process Unit", "Central Process Unity"},
            {"Unit Kontrol", "Center","Register", "Aritmatic Logic Unit"},
            {"Mouse", "Monitor", "Keyboard", "Printer"},
            {"Mouse", "Monitor", "Keyboard", "Printer"},
            {"1","2","3","4"}
    };

    private String mCorrectAnswers[] = {"Computare", "Tupperware", "Hardware", "Brainware",
            "Keyboard", "Christopher Latham","REMINGTON","Mouse", "Graphical User Interface","CPU","Central Processing Unit",
            "Center","Monitor","Printer","3"};

    public int getLength(){
        return textQuestions.length;
    }

    public String getQuestion(int a) {
        String question = textQuestions[a];
        return question;
    }

    public String getChoice(int index, int num) {
        String choice0 = multipleChoice[index][num-1];
        return choice0;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }
}