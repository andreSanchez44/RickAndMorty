package com.example.rickandmortyapi;

import java.util.List;

public class ResultCharacter {
        static class Info{
            public int count;
            public int pages;
            public String next;
            public String prev;
        }
        public Info info;

        static class Result{
            public int id;
            public String name;
            public String status;
            public String species;
            public String type;
            public String gender;
            public String image;
        }

        public List<Result> results;
}
