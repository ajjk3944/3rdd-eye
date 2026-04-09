package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.Mj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0627Mj {

    /* renamed from: a, reason: collision with root package name */
    public static final C2057wB f9890a = new C2057wB();

    static {
        JB jb = LB.f9635b;
        new C0627Mj(C1197gC.f14227e);
        String str = Vt.f12096a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public C0627Mj(C1197gC c1197gC) {
        JB jb = LB.f9635b;
        Object[] array = (c1197gC == null ? AbstractC0582Jp.i(c1197gC.listIterator(0)) : c1197gC).toArray();
        int length = array.length;
        AbstractC1984ut.k(length, array);
        Arrays.sort(array, f9890a);
        LB.o(length, array);
    }
}
