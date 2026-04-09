package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final class GO implements D6, InterfaceC1964uQ, AP {

    /* renamed from: a, reason: collision with root package name */
    public final C1994v2 f8364a;

    /* renamed from: b, reason: collision with root package name */
    public final I7 f8365b;

    /* renamed from: c, reason: collision with root package name */
    public final U7 f8366c;

    /* renamed from: d, reason: collision with root package name */
    public final C1677p8 f8367d;

    /* renamed from: e, reason: collision with root package name */
    public final SparseArray f8368e;

    /* renamed from: f, reason: collision with root package name */
    public C1009cp f8369f;

    /* renamed from: g, reason: collision with root package name */
    public VL f8370g;

    /* renamed from: h, reason: collision with root package name */
    public C1231gt f8371h;
    public boolean i;

    public GO(C1994v2 c1994v2) {
        c1994v2.getClass();
        this.f8364a = c1994v2;
        String str = Vt.f12096a;
        Looper looperMyLooper = Looper.myLooper();
        this.f8369f = new C1009cp((looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper).getThread());
        I7 i7 = new I7();
        this.f8365b = i7;
        this.f8366c = new U7();
        C1677p8 c1677p8 = new C1677p8();
        c1677p8.f16137a = i7;
        JB jb = LB.f9635b;
        c1677p8.f16138b = C1197gC.f14227e;
        c1677p8.f16139c = C1465lC.f15361g;
        this.f8367d = c1677p8;
        this.f8368e = new SparseArray();
    }

    @Override // com.google.android.gms.internal.ads.D6
    public final void A() {
        t(y(), 24, new DO(5));
    }

    public final void B(C2232zO c2232zO, Looper looper) {
        boolean z6 = true;
        if (this.f8370g != null && !((LB) this.f8367d.f16138b).isEmpty()) {
            z6 = false;
        }
        AbstractC0582Jp.h0(z6);
        c2232zO.getClass();
        this.f8370g = c2232zO;
        C1994v2 c1994v2 = this.f8364a;
        this.f8371h = c1994v2.B(looper, null);
        C1009cp c1009cp = this.f8369f;
        Vu vu = new Vu(this, c2232zO);
        c1009cp.getClass();
        this.f8369f = new C1009cp((CopyOnWriteArraySet) c1009cp.f13677f, looper, looper.getThread(), c1994v2, vu, c1009cp.f13673b);
    }

    @Override // com.google.android.gms.internal.ads.D6
    public final void b() {
        t(u(), 14, new DO(22));
    }

    @Override // com.google.android.gms.internal.ads.D6
    public final void c() {
        VL vl = this.f8370g;
        vl.getClass();
        C1677p8 c1677p8 = this.f8367d;
        c1677p8.f16140d = C1677p8.x(vl, (LB) c1677p8.f16138b, (C1749qQ) c1677p8.f16141e, (I7) c1677p8.f16137a);
        c1677p8.v(vl.y1());
        t(u(), 0, new DO(10));
    }

    @Override // com.google.android.gms.internal.ads.D6
    public final void d() {
        t(u(), 3, new DO(13));
    }

    @Override // com.google.android.gms.internal.ads.D6
    public final void e() {
        t(u(), 13, new DO(14));
    }

    @Override // com.google.android.gms.internal.ads.D6
    public final void e0(int i) {
        BO boU = u();
        t(boU, 4, new V0.m(boU, i));
    }

    @Override // com.google.android.gms.internal.ads.D6
    public final void f() {
        t(u(), 1, new DO(11));
    }

    @Override // com.google.android.gms.internal.ads.D6
    public final void f0(C1161fd c1161fd) {
        BO boY = y();
        t(boY, 25, new Wu(boY, c1161fd, 10));
    }

    @Override // com.google.android.gms.internal.ads.D6
    public final void g() {
        t(u(), -1, new DO(15));
    }

    @Override // com.google.android.gms.internal.ads.D6
    public final void g0(HN hn) {
        C1749qQ c1749qQ;
        t((hn == null || (c1749qQ = hn.f8910h) == null) ? u() : x(c1749qQ), 10, new DO(20));
    }

    @Override // com.google.android.gms.internal.ads.D6
    public final void h() {
        t(u(), 5, new DO(16));
    }

    @Override // com.google.android.gms.internal.ads.D6
    public final void h0(int i, Q6 q6, Q6 q62) {
        if (i == 1) {
            this.i = false;
            i = 1;
        }
        VL vl = this.f8370g;
        vl.getClass();
        C1677p8 c1677p8 = this.f8367d;
        c1677p8.f16140d = C1677p8.x(vl, (LB) c1677p8.f16138b, (C1749qQ) c1677p8.f16141e, (I7) c1677p8.f16137a);
        BO boU = u();
        t(boU, 11, new V0.m(boU, i, q6, q62));
    }

    @Override // com.google.android.gms.internal.ads.D6
    public final void i() {
        t(u(), 7, new DO(19));
    }

    @Override // com.google.android.gms.internal.ads.D6
    public final void i0(HN hn) {
        C1749qQ c1749qQ;
        BO boU = (hn == null || (c1749qQ = hn.f8910h) == null) ? u() : x(c1749qQ);
        t(boU, 10, new C2255zu(boU, hn));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1964uQ
    public final void j(int i, C1749qQ c1749qQ, C1319iQ c1319iQ, C1587nQ c1587nQ) {
        t(z(i, c1749qQ), BackupConstant.SCENE_BACKUP_RENDER_FAIL, new DO(8));
    }

    @Override // com.google.android.gms.internal.ads.D6
    public final void k() {
        t(u(), 6, new DO(17));
    }

    @Override // com.google.android.gms.internal.ads.D6
    public final void l() {
        t(y(), 21, new DO(24));
    }

    @Override // com.google.android.gms.internal.ads.D6
    public final void m() {
        t(u(), 2, new DO(12));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1964uQ
    public final void n(int i, C1749qQ c1749qQ, C1319iQ c1319iQ, C1587nQ c1587nQ, IOException iOException, boolean z6) {
        BO boZ = z(i, c1749qQ);
        t(boZ, BackupConstant.SCENE_CLOSED_WITHOUT_SHOW, new C1014cu(boZ, c1319iQ, c1587nQ, iOException, z6));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1964uQ
    public final void o(int i, C1749qQ c1749qQ, C1319iQ c1319iQ, C1587nQ c1587nQ) {
        t(z(i, c1749qQ), BackupConstant.SCENE_RENDER_FAIL, new DO(7));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1964uQ
    public final void p(int i, C1749qQ c1749qQ, C1587nQ c1587nQ) {
        BO boZ = z(i, c1749qQ);
        t(boZ, 1004, new C1879sw(boZ, 9, c1587nQ));
    }

    @Override // com.google.android.gms.internal.ads.D6
    public final void q() {
        t(u(), 12, new DO(21));
    }

    @Override // com.google.android.gms.internal.ads.D6
    public final void r() {
        t(y(), 23, new DO(23));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1964uQ
    public final void s(int i, C1749qQ c1749qQ, C1319iQ c1319iQ, C1587nQ c1587nQ, int i3) {
        t(z(i, c1749qQ), TTAdConstant.STYLE_SIZE_RADIO_1_1, new DO(6));
    }

    public final void t(BO bo, int i, InterfaceC0801Wn interfaceC0801Wn) {
        this.f8368e.put(i, bo);
        C1009cp c1009cp = this.f8369f;
        c1009cp.c(i, interfaceC0801Wn);
        c1009cp.d();
    }

    public final BO u() {
        return x((C1749qQ) this.f8367d.f16140d);
    }

    public final BO v(AbstractC1353j8 abstractC1353j8, int i, C1749qQ c1749qQ) {
        C1749qQ c1749qQ2 = true == abstractC1353j8.g() ? null : c1749qQ;
        this.f8364a.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z6 = false;
        if (abstractC1353j8.equals(this.f8370g.y1()) && i == this.f8370g.B1()) {
            z6 = true;
        }
        long jR = 0;
        if (c1749qQ2 == null || !c1749qQ2.b()) {
            if (z6) {
                jR = this.f8370g.O();
            } else if (!abstractC1353j8.g()) {
                abstractC1353j8.b(i, this.f8366c, 0L).getClass();
                jR = Vt.r(0L);
            }
        } else if (z6 && this.f8370g.m() == c1749qQ2.f16375b && this.f8370g.G1() == c1749qQ2.f16376c) {
            jR = this.f8370g.D1();
        }
        return new BO(jElapsedRealtime, abstractC1353j8, i, c1749qQ2, jR, this.f8370g.y1(), this.f8370g.B1(), (C1749qQ) this.f8367d.f16140d, this.f8370g.D1(), this.f8370g.E1());
    }

    @Override // com.google.android.gms.internal.ads.D6
    public final void w() {
        t(y(), 22, new ZJ(27, (byte) 0));
    }

    public final BO x(C1749qQ c1749qQ) {
        this.f8370g.getClass();
        AbstractC1353j8 abstractC1353j8 = c1749qQ == null ? null : (AbstractC1353j8) ((C1465lC) this.f8367d.f16139c).get(c1749qQ);
        if (c1749qQ != null && abstractC1353j8 != null) {
            return v(abstractC1353j8, abstractC1353j8.o(c1749qQ.f16374a, this.f8365b).f9072c, c1749qQ);
        }
        int iB1 = this.f8370g.B1();
        AbstractC1353j8 abstractC1353j8Y1 = this.f8370g.y1();
        if (iB1 >= abstractC1353j8Y1.a()) {
            abstractC1353j8Y1 = AbstractC1353j8.f14909a;
        }
        return v(abstractC1353j8Y1, iB1, null);
    }

    public final BO y() {
        return x((C1749qQ) this.f8367d.f16142f);
    }

    public final BO z(int i, C1749qQ c1749qQ) {
        VL vl = this.f8370g;
        vl.getClass();
        if (c1749qQ != null) {
            return ((AbstractC1353j8) ((C1465lC) this.f8367d.f16139c).get(c1749qQ)) != null ? x(c1749qQ) : v(AbstractC1353j8.f14909a, i, c1749qQ);
        }
        AbstractC1353j8 abstractC1353j8Y1 = vl.y1();
        if (i >= abstractC1353j8Y1.a()) {
            abstractC1353j8Y1 = AbstractC1353j8.f14909a;
        }
        return v(abstractC1353j8Y1, i, null);
    }

    @Override // com.google.android.gms.internal.ads.D6
    public final void a() {
    }
}
