package io.appmetrica.analytics.networktasks.internal;

import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class ResponseDataHolder {

    /* renamed from: a, reason: collision with root package name */
    private int f42430a;

    /* renamed from: b, reason: collision with root package name */
    private byte[] f42431b;

    /* renamed from: c, reason: collision with root package name */
    private Map f42432c;

    /* renamed from: d, reason: collision with root package name */
    private final ResponseValidityChecker f42433d;

    public ResponseDataHolder(ResponseValidityChecker responseValidityChecker) {
        this.f42433d = responseValidityChecker;
    }

    public int getResponseCode() {
        return this.f42430a;
    }

    public byte[] getResponseData() {
        return this.f42431b;
    }

    public Map<String, List<String>> getResponseHeaders() {
        return this.f42432c;
    }

    public boolean isValidResponse() {
        return this.f42433d.isResponseValid(this.f42430a);
    }

    public void setResponseCode(int i) {
        this.f42430a = i;
    }

    public void setResponseData(byte[] bArr) {
        this.f42431b = bArr;
    }

    public void setResponseHeaders(Map<String, List<String>> map) {
        this.f42432c = map;
    }
}
