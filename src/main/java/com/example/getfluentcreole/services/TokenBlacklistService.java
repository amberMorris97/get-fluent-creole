package com.example.getfluentcreole.services;

import java.util.HashSet;
import java.util.Set;

public class TokenBlacklistService {

    private Set<String> blacklist = new HashSet<>();

    public void addTokenToBlacklist(String token) {
        blacklist.add(token);
    }

    public boolean isTokenBlacklisted(String token) {
        return blacklist.contains(token);
    }
}
