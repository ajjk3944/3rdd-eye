package com.amazonaws.auth;

/* loaded from: classes.dex */
public class BasicSessionCredentials implements AWSSessionCredentials {

    /* renamed from: a, reason: collision with root package name */
    private final String f34061a;

    /* renamed from: b, reason: collision with root package name */
    private final String f34062b;

    /* renamed from: c, reason: collision with root package name */
    private final String f34063c;

    public BasicSessionCredentials(String str, String str2, String str3) {
        this.f34061a = str;
        this.f34062b = str2;
        this.f34063c = str3;
    }

    @Override // com.amazonaws.auth.AWSSessionCredentials
    public String a() {
        return this.f34063c;
    }

    @Override // com.amazonaws.auth.AWSCredentials
    public String b() {
        return this.f34061a;
    }

    @Override // com.amazonaws.auth.AWSCredentials
    public String c() {
        return this.f34062b;
    }
}
