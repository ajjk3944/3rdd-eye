package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.aD, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0870aD extends AbstractC0582Jp {
    @Override // com.google.android.gms.internal.ads.AbstractC0582Jp
    public final boolean M(AbstractC1198gD abstractC1198gD, C1143fD c1143fD, C1143fD c1143fD2) {
        synchronized (abstractC1198gD) {
            try {
                if (abstractC1198gD.f14236c != c1143fD) {
                    return false;
                }
                abstractC1198gD.f14236c = c1143fD2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0582Jp
    public final boolean S(YC yc, VC vc, VC vc2) {
        synchronized (yc) {
            try {
                if (yc.f14235b != vc) {
                    return false;
                }
                yc.f14235b = vc2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0582Jp
    public final C1143fD U(YC yc) {
        C1143fD c1143fD;
        C1143fD c1143fD2 = C1143fD.f14042c;
        synchronized (yc) {
            try {
                c1143fD = yc.f14236c;
                if (c1143fD != c1143fD2) {
                    yc.f14236c = c1143fD2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1143fD;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0582Jp
    public final VC a0(YC yc) {
        VC vc;
        VC vc2 = VC.f11966d;
        synchronized (yc) {
            try {
                vc = yc.f14235b;
                if (vc != vc2) {
                    yc.f14235b = vc2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return vc;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0582Jp
    public final boolean e0(AbstractC1198gD abstractC1198gD, Object obj, Object obj2) {
        synchronized (abstractC1198gD) {
            try {
                if (abstractC1198gD.f14234a != obj) {
                    return false;
                }
                abstractC1198gD.f14234a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0582Jp
    public final void k(C1143fD c1143fD, Thread thread) {
        c1143fD.f14043a = thread;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0582Jp
    public final void w(C1143fD c1143fD, C1143fD c1143fD2) {
        c1143fD.f14044b = c1143fD2;
    }
}
