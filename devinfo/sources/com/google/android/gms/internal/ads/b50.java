package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.LinkedList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b50 implements w60, va.a, n70, p60, g60, y70 {

    /* renamed from: a, reason: collision with root package name */
    public final tb.a f9593a;

    /* renamed from: b, reason: collision with root package name */
    public final vw f9594b;

    public b50(tb.a aVar, vw vwVar) {
        this.f9593a = aVar;
        this.f9594b = vwVar;
    }

    @Override // com.google.android.gms.internal.ads.w60
    public final void e() {
        vw vwVar = this.f9594b;
        synchronized (vwVar.f17739d) {
            try {
                if (vwVar.f17744k != -1) {
                    vwVar.f17736a.getClass();
                    vwVar.f17742h = SystemClock.elapsedRealtime();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.n70
    public final void l(dq0 dq0Var) {
        tb.a aVar = this.f9593a;
        vw vwVar = this.f9594b;
        aVar.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        synchronized (vwVar.f17739d) {
            try {
                vwVar.f17744k = jElapsedRealtime;
                if (jElapsedRealtime != -1) {
                    vwVar.f17737b.a(vwVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.y70
    public final void m(pj pjVar) {
        vw vwVar = this.f9594b;
        synchronized (vwVar.f17739d) {
            vwVar.f17737b.f();
        }
    }

    @Override // com.google.android.gms.internal.ads.p60
    public final void n() {
        vw vwVar = this.f9594b;
        synchronized (vwVar.f17739d) {
            try {
                if (vwVar.f17744k != -1 && vwVar.g == -1) {
                    vwVar.f17736a.getClass();
                    vwVar.g = SystemClock.elapsedRealtime();
                    vwVar.f17737b.a(vwVar);
                }
                vwVar.f17737b.d();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // va.a
    public final void onAdClicked() {
        vw vwVar = this.f9594b;
        synchronized (vwVar.f17739d) {
            try {
                if (vwVar.f17744k != -1) {
                    uw uwVar = new uw(vwVar);
                    uwVar.f17366c.f17736a.getClass();
                    uwVar.f17364a = SystemClock.elapsedRealtime();
                    vwVar.f17738c.add(uwVar);
                    vwVar.f17743i++;
                    bx bxVar = vwVar.f17737b;
                    bxVar.c();
                    bxVar.a(vwVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.y70
    public final void u(pj pjVar) {
        vw vwVar = this.f9594b;
        synchronized (vwVar.f17739d) {
            vwVar.f17737b.g();
        }
    }

    @Override // com.google.android.gms.internal.ads.g60
    public final void v() {
        vw vwVar = this.f9594b;
        synchronized (vwVar.f17739d) {
            try {
                if (vwVar.f17744k != -1) {
                    LinkedList linkedList = vwVar.f17738c;
                    if (!linkedList.isEmpty()) {
                        uw uwVar = (uw) linkedList.getLast();
                        if (uwVar.f17365b == -1) {
                            uwVar.f17366c.f17736a.getClass();
                            uwVar.f17365b = SystemClock.elapsedRealtime();
                            vwVar.f17737b.a(vwVar);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.g60
    public final void E() {
    }

    @Override // com.google.android.gms.internal.ads.y70
    public final void H1() {
    }

    @Override // com.google.android.gms.internal.ads.g60
    public final void c() {
    }

    @Override // com.google.android.gms.internal.ads.g60
    public final void d() {
    }

    @Override // com.google.android.gms.internal.ads.g60
    public final void j() {
    }

    @Override // com.google.android.gms.internal.ads.y70
    public final void k(boolean z3) {
    }

    @Override // com.google.android.gms.internal.ads.y70
    public final void p(boolean z3) {
    }

    @Override // com.google.android.gms.internal.ads.y70
    public final void r(pj pjVar) {
    }

    @Override // com.google.android.gms.internal.ads.n70
    public final void t(iu iuVar) {
    }

    @Override // com.google.android.gms.internal.ads.g60
    public final void q(pu puVar, String str, String str2) {
    }
}
