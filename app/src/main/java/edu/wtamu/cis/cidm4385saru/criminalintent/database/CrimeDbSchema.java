package edu.wtamu.cis.cidm4385saru.criminalintent.database;

/**
 * Created by sarup on 3/24/2018.
 */

public class CrimeDbSchema {
    public static final class CrimeTable{
        public static final String NAME = "crimes";

        public static final class Cols{
            public static final String UUID = "uuid";
            public static final String TITLE= "title";
            public static final String DATE = "date";
            public static final String SOLVED = "solved";
        }
    }
}
