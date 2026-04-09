package com.yandex.mobile.ads.impl;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes3.dex */
public final class qc {

    /* renamed from: a, reason: collision with root package name */
    private final String f32134a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f32135b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f32136c;

    public qc(String algorithm, byte[] password, byte[] iV) {
        kotlin.jvm.internal.l.f(algorithm, "algorithm");
        kotlin.jvm.internal.l.f(password, "password");
        kotlin.jvm.internal.l.f(iV, "iV");
        this.f32134a = algorithm;
        this.f32135b = password;
        this.f32136c = iV;
    }

    public final byte[] a(byte[] input) throws Exception {
        kotlin.jvm.internal.l.f(input, "input");
        SecretKeySpec secretKeySpec = new SecretKeySpec(this.f32135b, "AES");
        Cipher cipher = Cipher.getInstance(this.f32134a);
        cipher.init(1, secretKeySpec, new IvParameterSpec(this.f32136c));
        byte[] bArrDoFinal = cipher.doFinal(input);
        kotlin.jvm.internal.l.e(bArrDoFinal, "doFinal(...)");
        return bArrDoFinal;
    }
}
