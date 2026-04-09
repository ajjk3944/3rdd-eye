package com.amazonaws.auth;

/* loaded from: classes.dex */
public class BasicAWSCredentials implements AWSCredentials {

    /* renamed from: a, reason: collision with root package name */
    private final String f34059a;

    /* renamed from: b, reason: collision with root package name */
    private final String f34060b;

    public BasicAWSCredentials(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("Access key cannot be null.");
        }
        if (str2 == null) {
            throw new IllegalArgumentException("Secret key cannot be null.");
        }
        this.f34059a = str;
        this.f34060b = str2;
    }

    @Override // com.amazonaws.auth.AWSCredentials
    public String b() {
        return this.f34059a;
    }

    @Override // com.amazonaws.auth.AWSCredentials
    public String c() {
        return this.f34060b;
    }
}
