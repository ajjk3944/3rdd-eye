package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class JQ extends XP {

    /* renamed from: h, reason: collision with root package name */
    public final KD f9301h;
    public final C2255zu i;

    /* renamed from: j, reason: collision with root package name */
    public final C1994v2 f9302j;

    /* renamed from: k, reason: collision with root package name */
    public final int f9303k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f9304l;

    /* renamed from: m, reason: collision with root package name */
    public long f9305m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f9306n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f9307o;

    /* renamed from: p, reason: collision with root package name */
    public InterfaceC1958uK f9308p;

    /* renamed from: q, reason: collision with root package name */
    public C1241h2 f9309q;

    public /* synthetic */ JQ(C1241h2 c1241h2, KD kd, C2255zu c2255zu, C1994v2 c1994v2, int i) {
        C1994v2 c1994v22 = C1994v2.f17213k;
        this.f9309q = c1241h2;
        this.f9301h = kd;
        this.i = c2255zu;
        this.f9302j = c1994v22;
        this.f9303k = i;
        this.f9304l = true;
        this.f9305m = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.XP
    public final synchronized void a(C1241h2 c1241h2) {
        this.f9309q = c1241h2;
    }

    @Override // com.google.android.gms.internal.ads.XP
    public final void b(InterfaceC1695pQ interfaceC1695pQ) {
        HQ hq = (HQ) interfaceC1695pQ;
        if (hq.f8930J) {
            for (LQ lq : hq.f8927G) {
                lq.r();
                if (lq.f9708g != null) {
                    lq.f9708g = null;
                    lq.f9707f = null;
                }
            }
        }
        C1338iu c1338iu = hq.f8955j;
        r rVar = (r) c1338iu.f14823c;
        if (rVar != null) {
            rVar.a(true);
        }
        ExecutorC2099x executorC2099x = (ExecutorC2099x) c1338iu.f14822b;
        executorC2099x.execute(new RunnableC1883t(0, hq));
        ((ExecutorService) ((Executor) executorC2099x.f17530b)).shutdown();
        hq.f8923C.removeCallbacksAndMessages(null);
        hq.f8924D = null;
        hq.b0 = true;
    }

    @Override // com.google.android.gms.internal.ads.XP
    public final InterfaceC1695pQ c(C1749qQ c1749qQ, InterfaceC1292i interfaceC1292i, long j6) {
        XD xdMo10a = this.f9301h.mo10a();
        InterfaceC1958uK interfaceC1958uK = this.f9308p;
        if (interfaceC1958uK != null) {
            xdMo10a.c(interfaceC1958uK);
        }
        N0 n02 = f().f14415b;
        n02.getClass();
        Uri uri = n02.f9935a;
        this.f12428g.getClass();
        return new HQ(uri, xdMo10a, new C2041vw((InterfaceC2208z0) this.i.f17990b), this.f9302j, new C2233zP(this.f12425d.f17875b, c1749qQ), new C2233zP(this.f12424c.f17875b, c1749qQ), this, interfaceC1292i, this.f9303k, Vt.s(-9223372036854775807L));
    }

    @Override // com.google.android.gms.internal.ads.XP
    public final synchronized C1241h2 f() {
        return this.f9309q;
    }

    @Override // com.google.android.gms.internal.ads.XP
    public final void h(InterfaceC1958uK interfaceC1958uK) {
        this.f9308p = interfaceC1958uK;
        Looper.myLooper().getClass();
        this.f12428g.getClass();
        t();
    }

    @Override // com.google.android.gms.internal.ads.XP
    public final void j() {
    }

    @Override // com.google.android.gms.internal.ads.XP
    public final void r() {
    }

    public final void s(long j6, L0 l02, boolean z6) {
        if (j6 == -9223372036854775807L) {
            j6 = this.f9305m;
        }
        boolean zC = l02.c();
        if (!this.f9304l && this.f9305m == j6 && this.f9306n == zC && this.f9307o == z6) {
            return;
        }
        this.f9305m = j6;
        this.f9306n = zC;
        this.f9307o = z6;
        this.f9304l = false;
        t();
    }

    public final void t() {
        long j6 = this.f9305m;
        boolean z6 = this.f9306n;
        boolean z7 = this.f9307o;
        C1241h2 c1241h2F = f();
        AbstractC1353j8 pq = new PQ(j6, j6, z6, c1241h2F, z7 ? c1241h2F.f14416c : null);
        if (this.f9304l) {
            pq = new IQ(pq);
        }
        k(pq);
    }
}
