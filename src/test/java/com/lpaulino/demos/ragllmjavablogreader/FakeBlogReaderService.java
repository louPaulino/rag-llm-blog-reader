package com.lpaulino.demos.ragllmjavablogreader;

public class FakeBlogReaderService implements BlogReaderService {
    @Override
    public String prepare() {
        return null;
    }

    @Override
    public String sendBody(String html) {
        return null;
    }

    @Override
    public String sumUp() {
        return "MockGPT";
    }
}