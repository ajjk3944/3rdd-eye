package com.applovin.impl.privacy.cmp;

import com.applovin.sdk.AppLovinCmpError;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class CmpErrorImpl implements AppLovinCmpError {

    /* renamed from: a, reason: collision with root package name */
    private final AppLovinCmpError.Code f5090a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5091b;

    /* renamed from: c, reason: collision with root package name */
    private final int f5092c;

    /* renamed from: d, reason: collision with root package name */
    private final String f5093d;

    public CmpErrorImpl(AppLovinCmpError.Code code, String str) {
        this(code, str, -1, "");
    }

    @Override // com.applovin.sdk.AppLovinCmpError
    public int getCmpCode() {
        return this.f5092c;
    }

    @Override // com.applovin.sdk.AppLovinCmpError
    public String getCmpMessage() {
        return this.f5093d;
    }

    @Override // com.applovin.sdk.AppLovinCmpError
    public AppLovinCmpError.Code getCode() {
        return this.f5090a;
    }

    @Override // com.applovin.sdk.AppLovinCmpError
    public String getMessage() {
        return this.f5091b;
    }

    public String toString() {
        return "CmpErrorImpl(code=" + getCode() + ", message=" + getMessage() + ", cmpCode=" + getCmpCode() + ", cmpMessage=" + getCmpMessage() + ")";
    }

    public CmpErrorImpl(AppLovinCmpError.Code code, String str, int i4, String str2) {
        this.f5090a = code;
        this.f5091b = str;
        this.f5092c = i4;
        this.f5093d = str2;
    }
}
