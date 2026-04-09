package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class jd0 implements tr0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12716a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Object f12717b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f12718c;

    public jd0(li liVar, Map map) {
        this.f12717b = map;
        this.f12718c = liVar;
    }

    @Override // com.google.android.gms.internal.ads.tr0
    public final void a(String str) {
        int i4 = this.f12716a;
    }

    @Override // com.google.android.gms.internal.ads.tr0
    public final void b(qr0 qr0Var, String str, Throwable th2) {
        switch (this.f12716a) {
            case 0:
                Map map = (Map) this.f12717b;
                if (map.containsKey(qr0Var)) {
                    ((li) this.f12718c).b(((id0) map.get(qr0Var)).f12214c);
                    return;
                }
                return;
            default:
                if (((Boolean) va.s.f36163e.f36166c.a(sk.W6)).booleanValue() && qr0.RENDERER == qr0Var) {
                    eh0 eh0Var = (eh0) this.f12717b;
                    if (eh0Var.e() != 0) {
                        ua.j.C.f35267k.getClass();
                        long jElapsedRealtime = SystemClock.elapsedRealtime() - eh0Var.e();
                        synchronized (eh0Var) {
                            synchronized (eh0Var.j) {
                                eh0Var.f10789e = jElapsedRealtime;
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.tr0
    public final void m(qr0 qr0Var, String str) {
        switch (this.f12716a) {
            case 0:
                Map map = (Map) this.f12717b;
                if (map.containsKey(qr0Var)) {
                    ((li) this.f12718c).b(((id0) map.get(qr0Var)).f12212a);
                    return;
                }
                return;
            default:
                if (((Boolean) va.s.f36163e.f36166c.a(sk.W6)).booleanValue()) {
                    if (qr0.RENDERER == qr0Var) {
                        eh0 eh0Var = (eh0) this.f12717b;
                        ua.j.C.f35267k.getClass();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        synchronized (eh0Var) {
                            synchronized (eh0Var.f10792i) {
                                eh0Var.f10788d = jElapsedRealtime;
                            }
                        }
                        return;
                    }
                    if (qr0.PRELOADED_LOADER == qr0Var || qr0.SERVER_TRANSACTION == qr0Var) {
                        eh0 eh0Var2 = (eh0) this.f12717b;
                        ua.j.C.f35267k.getClass();
                        eh0Var2.a(SystemClock.elapsedRealtime());
                        fh0 fh0Var = (fh0) this.f12718c;
                        ((l90) fh0Var.f1326b).g(new androidx.recyclerview.widget.d(fh0Var, eh0Var2.b(), 5));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.tr0
    public final void p(qr0 qr0Var, String str) {
        switch (this.f12716a) {
            case 0:
                Map map = (Map) this.f12717b;
                if (map.containsKey(qr0Var)) {
                    ((li) this.f12718c).b(((id0) map.get(qr0Var)).f12213b);
                    return;
                }
                return;
            default:
                if (((Boolean) va.s.f36163e.f36166c.a(sk.W6)).booleanValue() && qr0.RENDERER == qr0Var) {
                    eh0 eh0Var = (eh0) this.f12717b;
                    if (eh0Var.e() != 0) {
                        ua.j.C.f35267k.getClass();
                        long jElapsedRealtime = SystemClock.elapsedRealtime() - eh0Var.e();
                        synchronized (eh0Var) {
                            synchronized (eh0Var.j) {
                                eh0Var.f10789e = jElapsedRealtime;
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public jd0(eh0 eh0Var, fh0 fh0Var) {
        this.f12717b = eh0Var;
        this.f12718c = fh0Var;
    }

    private final void c(String str) {
    }

    private final void d(String str) {
    }
}
