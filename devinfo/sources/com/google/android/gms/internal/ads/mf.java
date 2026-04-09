package com.google.android.gms.internal.ads;

import android.app.AppOpsManager$OnOpActiveChangedListener;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class mf implements AppOpsManager$OnOpActiveChangedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13884a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13885b;

    public /* synthetic */ mf(int i4, Object obj) {
        this.f13884a = i4;
        this.f13885b = obj;
    }

    public final void onOpActiveChanged(String str, int i4, String str2, boolean z3) {
        switch (this.f13884a) {
            case 0:
                if (z3) {
                    nf nfVar = (nf) this.f13885b;
                    nfVar.f14282a = System.currentTimeMillis();
                    nfVar.f14285d = true;
                    return;
                }
                nf nfVar2 = (nf) this.f13885b;
                long j = nfVar2.f14283b;
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (j > 0) {
                    long j8 = nfVar2.f14283b;
                    if (jCurrentTimeMillis >= j8) {
                        nfVar2.f14284c = jCurrentTimeMillis - j8;
                    }
                }
                nfVar2.f14285d = false;
                return;
            default:
                e21 e21Var = (e21) this.f13885b;
                synchronized (e21Var) {
                    try {
                        if (z3) {
                            e21Var.f10681c = System.currentTimeMillis();
                            e21Var.f10684f = true;
                        } else {
                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                            long j9 = e21Var.f10682d;
                            if (j9 > 0 && jCurrentTimeMillis2 >= j9) {
                                e21Var.f10683e = jCurrentTimeMillis2 - j9;
                            }
                            e21Var.f10684f = false;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
        }
    }
}
