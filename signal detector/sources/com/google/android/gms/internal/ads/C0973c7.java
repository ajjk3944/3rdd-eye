package com.google.android.gms.internal.ads;

import android.app.AppOpsManager$OnOpActiveChangedListener;

/* renamed from: com.google.android.gms.internal.ads.c7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0973c7 implements AppOpsManager$OnOpActiveChangedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13533a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13534b;

    public /* synthetic */ C0973c7(int i, Object obj) {
        this.f13533a = i;
        this.f13534b = obj;
    }

    public final void onOpActiveChanged(String str, int i, String str2, boolean z6) {
        switch (this.f13533a) {
            case 0:
                if (z6) {
                    C1028d7 c1028d7 = (C1028d7) this.f13534b;
                    c1028d7.f13728a = System.currentTimeMillis();
                    c1028d7.f13731d = true;
                    return;
                }
                C1028d7 c1028d72 = (C1028d7) this.f13534b;
                long j6 = c1028d72.f13729b;
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (j6 > 0) {
                    long j7 = c1028d72.f13729b;
                    if (jCurrentTimeMillis >= j7) {
                        c1028d72.f13730c = jCurrentTimeMillis - j7;
                    }
                }
                c1028d72.f13731d = false;
                return;
            default:
                C1786rA c1786rA = (C1786rA) this.f13534b;
                synchronized (c1786rA) {
                    try {
                        if (z6) {
                            c1786rA.f16475c = System.currentTimeMillis();
                            c1786rA.f16478f = true;
                        } else {
                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                            long j8 = c1786rA.f16476d;
                            if (j8 > 0 && jCurrentTimeMillis2 >= j8) {
                                c1786rA.f16477e = jCurrentTimeMillis2 - j8;
                            }
                            c1786rA.f16478f = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }
}
