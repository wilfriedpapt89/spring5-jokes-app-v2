package com.willpapt.spring5jokesappv2.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

public class JokerServiceImpl implements JokerService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokerServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
