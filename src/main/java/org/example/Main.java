package org.example;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Gson gson = new Gson();
        String json = gson.toJson(new String[]{"Maven", "IntelliJ", "Dependências"});
        System.out.println(json);
    }
}
