package com.google.android.gms.internal.ads;

import q2.C2841s;
import t2.AbstractC2907C;
import t2.C2909E;

/* renamed from: com.google.android.gms.internal.ads.gf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1217gf {

    /* renamed from: a, reason: collision with root package name */
    public final C2909E f14335a;

    public C1217gf(C2909E c2909e) {
        this.f14335a = c2909e;
    }

    public final void a(int i, long j6) {
        long j7;
        E9 e9 = H9.f8660R0;
        C2841s c2841s = C2841s.f23267e;
        if (((Boolean) c2841s.f23270c.a(e9)).booleanValue()) {
            return;
        }
        C2909E c2909e = this.f14335a;
        c2909e.m();
        synchronized (c2909e.f23548a) {
            j7 = c2909e.f23546D;
        }
        if (j6 - j7 < 0) {
            AbstractC2907C.m("Receiving npa decision in the past, ignoring.");
            return;
        }
        if (((Boolean) c2841s.f23270c.a(H9.f8666S0)).booleanValue()) {
            c2909e.c(i);
            c2909e.d(j6);
        } else {
            c2909e.c(-1);
            c2909e.d(j6);
        }
    }
}
