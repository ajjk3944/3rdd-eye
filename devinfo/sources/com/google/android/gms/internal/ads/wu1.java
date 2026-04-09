package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class wu1 implements ke, oy1, sw1 {

    /* renamed from: a, reason: collision with root package name */
    public final w5 f18197a;

    /* renamed from: b, reason: collision with root package name */
    public final tg f18198b;

    /* renamed from: c, reason: collision with root package name */
    public final fh f18199c;

    /* renamed from: d, reason: collision with root package name */
    public final ai f18200d;

    /* renamed from: e, reason: collision with root package name */
    public final SparseArray f18201e;

    /* renamed from: f, reason: collision with root package name */
    public yf0 f18202f;
    public hp1 g;

    /* renamed from: h, reason: collision with root package name */
    public no0 f18203h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f18204i;

    public wu1(w5 w5Var) {
        w5Var.getClass();
        this.f18197a = w5Var;
        String str = bq0.f9768a;
        Looper looperMyLooper = Looper.myLooper();
        this.f18202f = new yf0((looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper).getThread());
        tg tgVar = new tg();
        this.f18198b = tgVar;
        this.f18199c = new fh();
        ai aiVar = new ai();
        aiVar.f9330a = tgVar;
        v41 v41Var = x41.f18307b;
        aiVar.f9331b = u51.f17096e;
        aiVar.f9332c = z51.g;
        this.f18200d = aiVar;
        this.f18201e = new SparseArray();
    }

    @Override // com.google.android.gms.internal.ads.ke
    public final void A1() {
        l(m(), 5, new su1(23));
    }

    @Override // com.google.android.gms.internal.ads.ke
    public final void B1() {
        l(m(), 7, new su1(26));
    }

    @Override // com.google.android.gms.internal.ads.ke
    public final void D1() {
        l(m(), 6, new su1(24));
    }

    @Override // com.google.android.gms.internal.ads.ke
    public final void E1() {
        l(p(), 21, new uu1(1));
    }

    @Override // com.google.android.gms.internal.ads.ke
    public final void I1() {
        l(m(), 12, new su1(28));
    }

    @Override // com.google.android.gms.internal.ads.ke
    public final void J1() {
        l(p(), 23, new uu1(0));
    }

    @Override // com.google.android.gms.internal.ads.ke
    public final void L1() {
        l(p(), 22, new su1(4));
    }

    @Override // com.google.android.gms.internal.ads.ke
    public final void M1() {
        l(p(), 24, new su1(12));
    }

    @Override // com.google.android.gms.internal.ads.ke
    public final void R1(int i4) {
        qu1 qu1VarM = m();
        l(qu1VarM, 4, new s9(qu1VarM, i4));
    }

    @Override // com.google.android.gms.internal.ads.ke
    public final void S1(vr vrVar) {
        qu1 qu1VarP = p();
        l(qu1VarP, 25, new at1(qu1VarP, vrVar));
    }

    @Override // com.google.android.gms.internal.ads.ke
    public final void T1(us1 us1Var) {
        jy1 jy1Var;
        l((us1Var == null || (jy1Var = us1Var.f17315h) == null) ? m() : o(jy1Var), 10, new su1(27));
    }

    @Override // com.google.android.gms.internal.ads.ke
    public final void U1(int i4, ye yeVar, ye yeVar2) {
        if (i4 == 1) {
            this.f18204i = false;
            i4 = 1;
        }
        hp1 hp1Var = this.g;
        hp1Var.getClass();
        ai aiVar = this.f18200d;
        aiVar.f9333d = ai.w(hp1Var, (x41) aiVar.f9331b, (jy1) aiVar.f9334e, (tg) aiVar.f9330a);
        qu1 qu1VarM = m();
        l(qu1VarM, 11, new s9(qu1VarM, i4, yeVar, yeVar2));
    }

    @Override // com.google.android.gms.internal.ads.ke
    public final void V1(us1 us1Var) {
        jy1 jy1Var;
        qu1 qu1VarM = (us1Var == null || (jy1Var = us1Var.f17315h) == null) ? m() : o(jy1Var);
        l(qu1VarM, 10, new kh0(22, qu1VarM, us1Var));
    }

    @Override // com.google.android.gms.internal.ads.ke
    public final void a() {
        hp1 hp1Var = this.g;
        hp1Var.getClass();
        ai aiVar = this.f18200d;
        aiVar.f9333d = ai.w(hp1Var, (x41) aiVar.f9331b, (jy1) aiVar.f9334e, (tg) aiVar.f9330a);
        aiVar.u(hp1Var.l1());
        l(m(), 0, new su1(17));
    }

    @Override // com.google.android.gms.internal.ads.ke
    public final void c() {
        l(m(), 14, new su1(29));
    }

    @Override // com.google.android.gms.internal.ads.ke
    public final void d() {
        l(m(), 3, new su1(20));
    }

    @Override // com.google.android.gms.internal.ads.ke
    public final void e() {
        l(m(), 13, new su1(21));
    }

    @Override // com.google.android.gms.internal.ads.ke
    public final void f() {
        l(m(), 2, new su1(19));
    }

    @Override // com.google.android.gms.internal.ads.oy1
    public final void g(int i4, jy1 jy1Var, cy1 cy1Var, a0.c0 c0Var, int i10) {
        l(q(i4, jy1Var), 1000, new su1(13));
    }

    @Override // com.google.android.gms.internal.ads.oy1
    public final void h(int i4, jy1 jy1Var, cy1 cy1Var, a0.c0 c0Var) {
        l(q(i4, jy1Var), AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE, new su1(15));
    }

    @Override // com.google.android.gms.internal.ads.oy1
    public final void i(int i4, jy1 jy1Var, cy1 cy1Var, a0.c0 c0Var, IOException iOException, boolean z3) {
        qu1 qu1VarQ = q(i4, jy1Var);
        l(qu1VarQ, 1003, new ne0(qu1VarQ, cy1Var, c0Var, iOException, z3));
    }

    @Override // com.google.android.gms.internal.ads.oy1
    public final void j(int i4, jy1 jy1Var, cy1 cy1Var, a0.c0 c0Var) {
        l(q(i4, jy1Var), 1001, new su1(14));
    }

    @Override // com.google.android.gms.internal.ads.oy1
    public final void k(int i4, jy1 jy1Var, a0.c0 c0Var) {
        qu1 qu1VarQ = q(i4, jy1Var);
        l(qu1VarQ, TTAdConstant.IMAGE_MODE_CAROUSEL_IMG, new l90(26, qu1VarQ, c0Var));
    }

    public final void l(qu1 qu1Var, int i4, rd0 rd0Var) {
        this.f18201e.put(i4, qu1Var);
        yf0 yf0Var = this.f18202f;
        yf0Var.c(i4, rd0Var);
        yf0Var.d();
    }

    public final qu1 m() {
        return o((jy1) this.f18200d.f9333d);
    }

    public final qu1 n(uh uhVar, int i4, jy1 jy1Var) {
        jy1 jy1Var2 = true == uhVar.g() ? null : jy1Var;
        this.f18197a.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z3 = false;
        if (uhVar.equals(this.g.l1()) && i4 == this.g.o1()) {
            z3 = true;
        }
        long jR = 0;
        if (jy1Var2 == null || !jy1Var2.b()) {
            if (z3) {
                jR = this.g.F();
            } else if (!uhVar.g()) {
                uhVar.b(i4, this.f18199c, 0L).getClass();
                jR = bq0.r(0L);
            }
        } else if (z3 && this.g.z() == jy1Var2.f12876b && this.g.t1() == jy1Var2.f12877c) {
            jR = this.g.q1();
        }
        return new qu1(jElapsedRealtime, uhVar, i4, jy1Var2, jR, this.g.l1(), this.g.o1(), (jy1) this.f18200d.f9333d, this.g.q1(), this.g.r1());
    }

    public final qu1 o(jy1 jy1Var) {
        this.g.getClass();
        uh uhVar = jy1Var == null ? null : (uh) ((z51) this.f18200d.f9332c).get(jy1Var);
        if (jy1Var != null && uhVar != null) {
            return n(uhVar, uhVar.o(jy1Var.f12875a, this.f18198b).f16811c, jy1Var);
        }
        int iO1 = this.g.o1();
        uh uhVarL1 = this.g.l1();
        if (iO1 >= uhVarL1.a()) {
            uhVarL1 = uh.f17203a;
        }
        return n(uhVarL1, iO1, null);
    }

    public final qu1 p() {
        return o((jy1) this.f18200d.f9335f);
    }

    public final qu1 q(int i4, jy1 jy1Var) {
        hp1 hp1Var = this.g;
        hp1Var.getClass();
        if (jy1Var != null) {
            return ((uh) ((z51) this.f18200d.f9332c).get(jy1Var)) != null ? o(jy1Var) : n(uh.f17203a, i4, jy1Var);
        }
        uh uhVarL1 = hp1Var.l1();
        if (i4 >= uhVarL1.a()) {
            uhVarL1 = uh.f17203a;
        }
        return n(uhVarL1, i4, null);
    }

    public final void r(ou1 ou1Var, Looper looper) {
        boolean z3 = true;
        if (this.g != null && !((x41) this.f18200d.f9331b).isEmpty()) {
            z3 = false;
        }
        mq0.c0(z3);
        ou1Var.getClass();
        this.g = ou1Var;
        w5 w5Var = this.f18197a;
        this.f18203h = w5Var.A(looper, null);
        yf0 yf0Var = this.f18202f;
        ce1 ce1Var = new ce1(this, false, ou1Var, 27);
        yf0Var.getClass();
        this.f18202f = new yf0((CopyOnWriteArraySet) yf0Var.f18732f, looper, looper.getThread(), w5Var, ce1Var, yf0Var.f18728b);
    }

    @Override // com.google.android.gms.internal.ads.ke
    public final void z1() {
        l(m(), -1, new su1(22));
    }

    @Override // com.google.android.gms.internal.ads.ke
    public final void zzc() {
        l(m(), 1, new su1(18));
    }

    @Override // com.google.android.gms.internal.ads.ke
    public final void b() {
    }
}
