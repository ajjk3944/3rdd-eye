package com.singular.sdk.internal;

import java.util.Map;

/* loaded from: classes2.dex */
public abstract class GeneralHttpServiceBase {
    private String baseUrl;

    public interface CompletionHandler {
        void onFailure(String str);

        void onSuccess(String str, int i);
    }

    private GeneralHttpServiceBase() {
    }

    public String getBaseUrl() {
        return this.baseUrl;
    }

    public abstract void sendRequest(String str, Map<String, String> map, Map<String, String> map2, CompletionHandler completionHandler);

    public GeneralHttpServiceBase(String str) {
        this.baseUrl = str;
    }
}
