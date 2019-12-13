package com.example.programinglanguage;

import java.util.ArrayList;

public class ProgramData {

    private static String[] programName = {
            "Kotlin",
            "Java",
            "Python",
            "C++"
    };

    private static String[] programingDetail = {
            "Kotlin is a cross-platform, statically typed, general-purpose programming language with type inference. Kotlin is designed to interoperate fully with Java, and the JVM version of its standard library depends on the Java Class Library, but type inference allows its syntax to be more concise",
            "Java is the most famous language in programing",
            "Python is an interpreted, high-level, general-purpose programming language. Created by Guido van Rossum and first released in 1991, Python's design philosophy emphasizes code readability with its notable use of significant whitespace",
            "C++ or also known as C Shrap"

    };

    private static int[] programingPhoto = {
            R.drawable.kotlin,
            R.drawable.java,
            R.drawable.python,
            R.drawable.sharp
    };

    static ArrayList<ProgramingLanguage> getProgramData() {
        ArrayList<ProgramingLanguage> prolist = new ArrayList<>();

        for (int position = 0; position < programName.length; position++) {
            ProgramingLanguage programingLanguage = new ProgramingLanguage();

            programingLanguage.setProgramName(programName[position]);
            programingLanguage.setProgramDetail(programingDetail[position]);
            programingLanguage.setProgramingPhoto(programingPhoto[position]);
            prolist.add(programingLanguage);
        }
        return prolist;
    }
}
