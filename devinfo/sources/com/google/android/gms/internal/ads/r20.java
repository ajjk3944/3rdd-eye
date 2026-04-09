package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class r20 implements r60 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15506a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f15507b;

    public /* synthetic */ r20(int i4, Object obj) {
        this.f15506a = i4;
        this.f15507b = obj;
    }

    @Override // com.google.android.gms.internal.ads.r60
    public final void f(Context context) throws kq0 {
        switch (this.f15506a) {
            case 0:
                try {
                    try {
                        ((qq0) this.f15507b).f15399a.C1();
                        return;
                    } catch (Throwable th2) {
                        throw new kq0(th2);
                    }
                } catch (kq0 e2) {
                    za.i.i("Cannot invoke onDestroy for the mediation adapter.", e2);
                    return;
                }
            default:
                qz qzVar = (qz) this.f15507b;
                if (qzVar != null) {
                    qzVar.destroy();
                    return;
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.r60
    public final void h(Context context) throws kq0 {
        switch (this.f15506a) {
            case 0:
                try {
                    try {
                        ((qq0) this.f15507b).f15399a.B1();
                        return;
                    } catch (Throwable th2) {
                        throw new kq0(th2);
                    }
                } catch (kq0 e2) {
                    za.i.i("Cannot invoke onPause for the mediation adapter.", e2);
                    return;
                }
            default:
                qz qzVar = (qz) this.f15507b;
                if (qzVar != null) {
                    qzVar.onPause();
                    return;
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.r60
    public final void k(Context context) {
        kq0 kq0Var;
        switch (this.f15506a) {
            case 0:
                try {
                    try {
                        cr crVar = ((qq0) this.f15507b).f15399a;
                        crVar.F1();
                        if (context != null) {
                            try {
                                crVar.w(new vb.b(context));
                                return;
                            } finally {
                            }
                        }
                        return;
                    } finally {
                    }
                } catch (kq0 e2) {
                    za.i.i("Cannot invoke onResume for the mediation adapter.", e2);
                    return;
                }
            default:
                qz qzVar = (qz) this.f15507b;
                if (qzVar != null) {
                    qzVar.onResume();
                    return;
                }
                return;
        }
    }
}
