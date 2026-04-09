package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class bz1 {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f25475a;

        static {
            int[] iArr = new int[lz1.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int i = lz1.f30136d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f25475a = iArr;
        }
    }

    public static az1 a(y5 y5Var) {
        z5 z5VarB;
        lz1 lz1VarC = (y5Var == null || (z5VarB = y5Var.b()) == null) ? null : z5VarB.c();
        int i = lz1VarC == null ? -1 : a.f25475a[lz1VarC.ordinal()];
        if (i != -1) {
            if (i == 1) {
                return new wh2();
            }
            if (i != 2) {
                throw new b9.j();
            }
        }
        return new j00();
    }
}
