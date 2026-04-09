package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class g50 {

    /* renamed from: c, reason: collision with root package name */
    private static final g50 f27540c = new g50(1, "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCznqFqHos01bT613or9cQ8OWXEB0nvx8UZ//V75T+fb1IDn1/lPBwGY/OK5RfQYuqeIKoKasqfwtRo3sr8dJ+SDm29Brh3lV9r+apohla+GIAyYd5wcJugMfVH5z9SBxh19ukg+GiIvvDpmgi0M8gNVo6Nk21tkEgFxc9FfdT/HwIDAQAB");

    /* renamed from: a, reason: collision with root package name */
    private final String f27541a;

    /* renamed from: b, reason: collision with root package name */
    private final int f27542b;

    public g50(int i, String publicKey) {
        kotlin.jvm.internal.l.f(publicKey, "publicKey");
        this.f27541a = publicKey;
        this.f27542b = i;
    }

    public final String b() {
        return this.f27541a;
    }

    public final int c() {
        return this.f27542b;
    }

    public final String d() {
        return this.f27541a;
    }

    public final int e() {
        return this.f27542b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g50)) {
            return false;
        }
        g50 g50Var = (g50) obj;
        return kotlin.jvm.internal.l.b(this.f27541a, g50Var.f27541a) && this.f27542b == g50Var.f27542b;
    }

    public final int hashCode() {
        return this.f27542b + (this.f27541a.hashCode() * 31);
    }

    public final String toString() {
        return "EncryptionParameters(publicKey=" + this.f27541a + ", version=" + this.f27542b + ")";
    }
}
