package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.Map;
import q2.C2841s;

/* renamed from: com.google.android.gms.internal.ads.Nn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0648Nn implements Nu {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10062a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f10063b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f10064c;

    public C0648Nn(A8 a8, Map map) {
        this.f10063b = map;
        this.f10064c = a8;
    }

    @Override // com.google.android.gms.internal.ads.Nu
    public final void a(String str) {
        int i = this.f10062a;
    }

    @Override // com.google.android.gms.internal.ads.Nu
    public final void p(Ku ku, String str, Throwable th) {
        switch (this.f10062a) {
            case 0:
                Map map = (Map) this.f10063b;
                if (map.containsKey(ku)) {
                    ((A8) this.f10064c).b(((C0631Mn) map.get(ku)).f9905c);
                    return;
                }
                return;
            default:
                if (((Boolean) C2841s.f23267e.f23270c.a(H9.W6)).booleanValue() && Ku.RENDERER == ku) {
                    C0514Fp c0514Fp = (C0514Fp) this.f10063b;
                    if (c0514Fp.e() != 0) {
                        p2.j.f22785C.f22797k.getClass();
                        long jElapsedRealtime = SystemClock.elapsedRealtime() - c0514Fp.e();
                        synchronized (c0514Fp) {
                            synchronized (c0514Fp.f8198j) {
                                c0514Fp.f8194e = jElapsedRealtime;
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.Nu
    public final void x(Ku ku, String str) {
        switch (this.f10062a) {
            case 0:
                Map map = (Map) this.f10063b;
                if (map.containsKey(ku)) {
                    ((A8) this.f10064c).b(((C0631Mn) map.get(ku)).f9903a);
                    return;
                }
                return;
            default:
                if (((Boolean) C2841s.f23267e.f23270c.a(H9.W6)).booleanValue()) {
                    if (Ku.RENDERER == ku) {
                        C0514Fp c0514Fp = (C0514Fp) this.f10063b;
                        p2.j.f22785C.f22797k.getClass();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        synchronized (c0514Fp) {
                            synchronized (c0514Fp.i) {
                                c0514Fp.f8193d = jElapsedRealtime;
                            }
                        }
                        return;
                    }
                    if (Ku.PRELOADED_LOADER == ku || Ku.SERVER_TRANSACTION == ku) {
                        C0514Fp c0514Fp2 = (C0514Fp) this.f10063b;
                        p2.j.f22785C.f22797k.getClass();
                        c0514Fp2.a(SystemClock.elapsedRealtime());
                        C0531Gp c0531Gp = (C0531Gp) this.f10064c;
                        ((C0697Ql) c0531Gp.f663b).i(new U1.b(c0531Gp, c0514Fp2.b(), 6));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.Nu
    public final void y(Ku ku, String str) {
        switch (this.f10062a) {
            case 0:
                Map map = (Map) this.f10063b;
                if (map.containsKey(ku)) {
                    ((A8) this.f10064c).b(((C0631Mn) map.get(ku)).f9904b);
                    return;
                }
                return;
            default:
                if (((Boolean) C2841s.f23267e.f23270c.a(H9.W6)).booleanValue() && Ku.RENDERER == ku) {
                    C0514Fp c0514Fp = (C0514Fp) this.f10063b;
                    if (c0514Fp.e() != 0) {
                        p2.j.f22785C.f22797k.getClass();
                        long jElapsedRealtime = SystemClock.elapsedRealtime() - c0514Fp.e();
                        synchronized (c0514Fp) {
                            synchronized (c0514Fp.f8198j) {
                                c0514Fp.f8194e = jElapsedRealtime;
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public C0648Nn(C0514Fp c0514Fp, C0531Gp c0531Gp) {
        this.f10063b = c0514Fp;
        this.f10064c = c0531Gp;
    }

    private final void b(String str) {
    }

    private final void c(String str) {
    }
}
