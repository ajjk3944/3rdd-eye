package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class f10 extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    public f10(String str, j00 j00Var) {
        String strValueOf = String.valueOf(j00Var);
        super(r5.c.m(new StringBuilder(str.length() + 1 + strValueOf.length()), str, " ", strValueOf));
    }
}
