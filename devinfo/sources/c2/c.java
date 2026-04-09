package c2;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.lifecycle.h1;
import androidx.lifecycle.k1;
import com.google.android.gms.internal.ads.v81;
import com.google.android.gms.internal.play_billing.m1;
import g2.q0;
import i2.d1;
import i2.u1;
import i2.w1;
import j2.r1;
import me.t1;
import nm.n0;
import u0.u0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c extends nk.l implements mk.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2589a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2590b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2591c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i4, Object obj, Object obj2) {
        super(0);
        this.f2589a = i4;
        this.f2590b = obj;
        this.f2591c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v133, types: [java.lang.Object, yj.f] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, yj.f] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, yj.f] */
    /* JADX WARN: Type inference failed for: r0v52, types: [java.lang.Object, yj.f] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, yj.f] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [i1.m] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [i1.m] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v3, types: [w0.e] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [w0.e] */
    @Override // mk.a
    public final Object invoke() throws Exception {
        h1 h1VarB;
        h1 h1VarB2;
        h1 h1VarB3;
        h1 h1VarB4;
        p2.p pVar;
        i2.e0 e0Var;
        o1.c cVar;
        h1 h1VarB5;
        switch (this.f2589a) {
            case 0:
                ((d) this.f2590b).d((i1.m) this.f2591c);
                return yj.u.f37649a;
            case 1:
                ((nk.u) this.f2590b).f29986a = i2.k.h((g3.u) this.f2591c, q0.f24400a);
                return yj.u.f37649a;
            case 2:
                k1 k1Var = (k1) this.f2591c.getValue();
                androidx.lifecycle.n nVar = k1Var instanceof androidx.lifecycle.n ? (androidx.lifecycle.n) k1Var : null;
                return (nVar == null || (h1VarB = nVar.b()) == null) ? ((gh.d) this.f2590b).b() : h1VarB;
            case 3:
                k1 k1Var2 = (k1) this.f2591c.getValue();
                androidx.lifecycle.n nVar2 = k1Var2 instanceof androidx.lifecycle.n ? (androidx.lifecycle.n) k1Var2 : null;
                return (nVar2 == null || (h1VarB2 = nVar2.b()) == null) ? ((hh.k) this.f2590b).b() : h1VarB2;
            case 4:
                k1 k1Var3 = (k1) this.f2591c.getValue();
                androidx.lifecycle.n nVar3 = k1Var3 instanceof androidx.lifecycle.n ? (androidx.lifecycle.n) k1Var3 : null;
                return (nVar3 == null || (h1VarB3 = nVar3.b()) == null) ? ((hh.v) this.f2590b).b() : h1VarB3;
            case 5:
                com.google.android.gms.internal.consent_sdk.a0 a0Var = ((i2.e0) this.f2590b).G;
                nk.u uVar = (nk.u) this.f2591c;
                if ((((i1.m) a0Var.g).f25557d & 8) != 0) {
                    for (i1.m mVar = (w1) a0Var.f19259f; mVar != null; mVar = mVar.f25558e) {
                        if ((mVar.f25556c & 8) != 0) {
                            i2.j jVarE = mVar;
                            ?? eVar = 0;
                            while (jVarE != 0) {
                                if (jVarE instanceof u1) {
                                    u1 u1Var = (u1) jVarE;
                                    if (u1Var.v()) {
                                        p2.l lVar = new p2.l();
                                        uVar.f29986a = lVar;
                                        lVar.f31098d = true;
                                    }
                                    if (u1Var.Y()) {
                                        ((p2.l) uVar.f29986a).f31097c = true;
                                    }
                                    u1Var.l((p2.x) uVar.f29986a);
                                } else if ((jVarE.f25556c & 8) != 0 && (jVarE instanceof i2.j)) {
                                    i1.m mVar2 = jVarE.f25691p;
                                    int i4 = 0;
                                    jVarE = jVarE;
                                    eVar = eVar;
                                    while (mVar2 != null) {
                                        if ((mVar2.f25556c & 8) != 0) {
                                            i4++;
                                            eVar = eVar;
                                            if (i4 == 1) {
                                                jVarE = mVar2;
                                            } else {
                                                if (eVar == 0) {
                                                    eVar = new w0.e(new i1.m[16]);
                                                }
                                                if (jVarE != 0) {
                                                    eVar.b(jVarE);
                                                    jVarE = 0;
                                                }
                                                eVar.b(mVar2);
                                            }
                                        }
                                        mVar2 = mVar2.f25559f;
                                        jVarE = jVarE;
                                        eVar = eVar;
                                    }
                                    if (i4 == 1) {
                                    }
                                }
                                jVarE = i2.k.e(eVar);
                            }
                        }
                    }
                }
                return yj.u.f37649a;
            case 6:
                mk.c cVar2 = (mk.c) this.f2590b;
                p1.h0 h0Var = d1.N;
                cVar2.invoke(h0Var);
                d1 d1Var = (d1) this.f2591c;
                p1.j0 j0Var = d1Var.D;
                p1.j0 j0Var2 = h0Var.f30973l;
                boolean z3 = j0Var != j0Var2;
                boolean z10 = d1Var.E;
                boolean z11 = h0Var.f30974m;
                boolean z12 = z10 != z11;
                if (z3 || z12) {
                    d1Var.D = j0Var2;
                    d1Var.E = z11;
                    if (d1Var.F && (z12 || (z11 && z3))) {
                        d1Var.f25610o.F();
                    }
                }
                d1Var.F = true;
                h0Var.f30979r = h0Var.f30973l.a(h0Var.f30975n, h0Var.f30977p, h0Var.f30976o);
                return yj.u.f37649a;
            case 7:
                k1 k1Var4 = (k1) this.f2591c.getValue();
                androidx.lifecycle.n nVar4 = k1Var4 instanceof androidx.lifecycle.n ? (androidx.lifecycle.n) k1Var4 : null;
                return (nVar4 == null || (h1VarB4 = nVar4.b()) == null) ? ((ih.b) this.f2590b).b() : h1VarB4;
            case 8:
                return Boolean.valueOf(super/*android.view.ViewGroup*/.dispatchKeyEvent((KeyEvent) this.f2591c));
            case 9:
                return Boolean.valueOf(super/*android.view.ViewGroup*/.dispatchGenericMotionEvent((MotionEvent) this.f2591c));
            case 10:
                j2.x xVar = (j2.x) this.f2591c;
                r1 r1Var = (r1) this.f2590b;
                p2.i iVar = r1Var.f27307e;
                p2.i iVar2 = r1Var.f27308f;
                Float f10 = r1Var.f27305c;
                Float f11 = r1Var.f27306d;
                float fFloatValue = (iVar == null || f10 == null) ? 0.0f : ((Number) iVar.f31051a.invoke()).floatValue() - f10.floatValue();
                float fFloatValue2 = (iVar2 == null || f11 == null) ? 0.0f : ((Number) iVar2.f31051a.invoke()).floatValue() - f11.floatValue();
                if (fFloatValue != 0.0f || fFloatValue2 != 0.0f) {
                    int iA = xVar.A(r1Var.f27303a);
                    p2.q qVar = (p2.q) xVar.s().b(xVar.f27342l);
                    if (qVar != null) {
                        try {
                            f4.f fVar = xVar.f27344n;
                            if (fVar != null) {
                                fVar.f23651a.setBoundsInScreen(xVar.k(qVar));
                            }
                        } catch (IllegalStateException unused) {
                        }
                    }
                    p2.q qVar2 = (p2.q) xVar.s().b(xVar.f27343m);
                    if (qVar2 != null) {
                        try {
                            f4.f fVar2 = xVar.f27345o;
                            if (fVar2 != null) {
                                fVar2.f23651a.setBoundsInScreen(xVar.k(qVar2));
                            }
                        } catch (IllegalStateException unused2) {
                        }
                    }
                    xVar.f27336d.invalidate();
                    p2.q qVar3 = (p2.q) xVar.s().b(iA);
                    if (qVar3 != null && (pVar = qVar3.f31107a) != null && (e0Var = pVar.f31103c) != null) {
                        if (iVar != null) {
                            xVar.f27347q.h(iA, iVar);
                        }
                        if (iVar2 != null) {
                            xVar.f27348r.h(iA, iVar2);
                        }
                        xVar.w(e0Var);
                    }
                }
                if (iVar != null) {
                    r1Var.f27305c = (Float) iVar.f31051a.invoke();
                }
                if (iVar2 != null) {
                    r1Var.f27306d = (Float) iVar2.f31051a.invoke();
                }
                return yj.u.f37649a;
            case 11:
                ((m1.b) this.f2590b).f28858q.invoke((m1.c) this.f2591c);
                return yj.u.f37649a;
            case 12:
                mk.a aVar = (mk.a) this.f2590b;
                if (aVar != null && (cVar = (o1.c) aVar.invoke()) != null) {
                    return cVar;
                }
                d1 d1Var2 = (d1) this.f2591c;
                if (!d1Var2.z0().f25565n) {
                    d1Var2 = null;
                }
                if (d1Var2 != null) {
                    return com.bumptech.glide.e.i(0L, t1.F(d1Var2.f24410c));
                }
                return null;
            case 13:
                ((nk.u) this.f2590b).f29986a = ((n1.s) this.f2591c).r0();
                return yj.u.f37649a;
            case 14:
                nm.e0 e0Var2 = ((nm.o) this.f2590b).f30109a;
                nm.c0 c0VarD = e0Var2.d();
                u0.d1 d1Var3 = e0Var2.f30022k;
                ck.c cVar3 = null;
                d3.i iVar3 = c0VarD != null ? new d3.i(c0VarD.b()) : null;
                nm.c0 c0VarD2 = e0Var2.d();
                if ((c0VarD2 != null ? Integer.valueOf(c0VarD2.a()) : null) != null) {
                    e0Var2.f30030s.setValue(d1Var3.getValue());
                    xk.x.v(e0Var2.f30015b, null, null, new j0(e0Var2, e0Var2.e(), cVar3, 2), 3);
                }
                e0Var2.f30024m.setValue(new o1.b(0L));
                d1Var3.setValue(null);
                e0Var2.f30025n.setValue(new d3.i(iVar3 != null ? iVar3.f21959a : 0L));
                n0 n0Var = e0Var2.f30019f;
                xk.x.v(n0Var.f30105b, null, null, new nm.l0(n0Var, cVar3, 1), 3);
                e0Var2.f30026o.setValue(null);
                e0Var2.f30027p.setValue(null);
                ((mk.a) this.f2591c).invoke();
                return yj.u.f37649a;
            case 15:
                return Boolean.valueOf(nk.k.a(this.f2590b, ((nm.e0) this.f2591c).f30022k.getValue()));
            case 16:
                return Float.valueOf(((Number) ((mk.a) ((u0) this.f2590b).getValue()).invoke()).floatValue() / (((Number) ((u0) this.f2591c).getValue()).floatValue() / 1000.0f));
            case 17:
                SharedPreferences sharedPreferences = ((Context) this.f2590b).getSharedPreferences((String) this.f2591c, 0);
                nk.k.d(sharedPreferences, "context.getSharedPrefere…me, Context.MODE_PRIVATE)");
                return sharedPreferences;
            case 18:
                Context context = (Context) this.f2590b;
                nk.k.d(context, "applicationContext");
                String str = ((v81) this.f2591c).f17560b;
                nk.k.e(str, "name");
                return m1.i(context, str.concat(".preferences_pb"));
            default:
                k1 k1Var5 = (k1) this.f2591c.getValue();
                androidx.lifecycle.n nVar5 = k1Var5 instanceof androidx.lifecycle.n ? (androidx.lifecycle.n) k1Var5 : null;
                return (nVar5 == null || (h1VarB5 = nVar5.b()) == null) ? ((th.f) this.f2590b).b() : h1VarB5;
        }
    }
}
