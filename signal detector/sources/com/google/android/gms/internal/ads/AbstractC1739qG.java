package com.google.android.gms.internal.ads;

import java.security.SecureRandom;

/* renamed from: com.google.android.gms.internal.ads.qG, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1739qG {

    /* renamed from: a, reason: collision with root package name */
    public static final T2.i f16338a = new T2.i(4);

    public static byte[] a(int i) {
        byte[] bArr = new byte[i];
        ((SecureRandom) f16338a.get()).nextBytes(bArr);
        return bArr;
    }
}
