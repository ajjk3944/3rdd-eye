package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class X8 {

    /* renamed from: a, reason: collision with root package name */
    public final Wc f40379a;

    /* renamed from: b, reason: collision with root package name */
    public final Wc f40380b;

    public X8() {
        this(new C4788m8(), new C4583ea(), new C4495b());
    }

    public X8(C4788m8 c4788m8, C4583ea c4583ea, C4495b c4495b) {
        Wc wc = new Wc(c4788m8);
        this.f40379a = wc;
        wc.a(Y8.NONE, c4788m8);
        wc.a(Y8.EXTERNALLY_ENCRYPTED_EVENT_CRYPTER, c4583ea);
        wc.a(Y8.AES_VALUE_ENCRYPTION, c4495b);
        this.f40380b = new Wc(c4788m8);
    }
}
