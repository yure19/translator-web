package com.translator.domain;

import org.springframework.stereotype.Repository;

@Repository
public class TranslatorInput {
    private String source;
    private String target;
    private String esPhrase;

    public String getSource() {
        return source;
    }

    public String getTarget() {
        return target;
    }

    public String getEsPhrase() {
        return esPhrase;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setEsPhrase(String esPhrase) {
        this.esPhrase = esPhrase;
    }

    public void setTarget(String target) {
        this.target = target;
    }
}
