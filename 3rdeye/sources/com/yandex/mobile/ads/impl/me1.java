package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class me1 {
    public static t92 a(bd2 bd2Var, nc2 videoAdPosition) {
        kotlin.jvm.internal.l.f(videoAdPosition, "videoAdPosition");
        int iOrdinal = videoAdPosition.ordinal();
        ij1 ij1Var = iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? ij1.f28710f : ij1.f28710f : ij1.f28709e : ij1.f28708d : ij1.f28707c;
        if (bd2Var != null) {
            t92 t92VarA = t92.a(bd2Var.a() / 1000, ij1Var);
            kotlin.jvm.internal.l.c(t92VarA);
            return t92VarA;
        }
        t92 t92VarA2 = t92.a(ij1Var);
        kotlin.jvm.internal.l.c(t92VarA2);
        return t92VarA2;
    }
}
