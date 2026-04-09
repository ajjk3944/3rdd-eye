package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.util.Base64;
import android.view.InputEvent;
import android.view.View;
import j$.util.Objects;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class qq implements e81 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15394a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f15395b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f15396c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f15397d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f15398e;

    public /* synthetic */ qq(int i4, Object obj, Object obj2, Object obj3, String str) {
        this.f15394a = i4;
        this.f15396c = obj;
        this.f15397d = obj2;
        this.f15395b = str;
        this.f15398e = obj3;
    }

    public vd.b a(Object obj) {
        gx gxVar = new gx();
        hq hqVarC = ((y50) this.f15398e).c();
        ya.a0.m("callJs > getEngine: Promise created");
        hqVarC.v(new aw(this, hqVarC, obj, gxVar, 7), new rt(this, gxVar, hqVarC, 6));
        return gxVar;
    }

    @Override // com.google.android.gms.internal.ads.e81
    public final vd.b c(Object obj) throws zz {
        vd.b bVarW;
        s81 s81VarE;
        switch (this.f15394a) {
            case 0:
                return a(obj);
            case 1:
                t20 t20Var = (t20) this.f15396c;
                Uri.Builder builder = (Uri.Builder) this.f15397d;
                String str = (String) this.f15395b;
                InputEvent inputEvent = (InputEvent) this.f15398e;
                if (((Integer) obj).intValue() != 1) {
                    builder.appendQueryParameter((String) va.s.f36163e.f36166c.a(sk.f16405xb), "10");
                    return yo0.e(builder.toString());
                }
                Uri.Builder builderBuildUpon = builder.build().buildUpon();
                pk pkVar = sk.f16422yb;
                rk rkVar = va.s.f36163e.f36166c;
                builderBuildUpon.appendQueryParameter((String) rkVar.a(pkVar), "1");
                builderBuildUpon.appendQueryParameter((String) rkVar.a(sk.f16405xb), "12");
                if (str.contains((CharSequence) rkVar.a(sk.f16438zb))) {
                    builderBuildUpon.authority((String) rkVar.a(sk.Ab));
                }
                yh0 yh0Var = t20Var.f16672c;
                Uri uriBuild = builderBuildUpon.build();
                yh0Var.getClass();
                try {
                    n5.a aVar = yh0Var.f18753a;
                    Objects.requireNonNull(aVar);
                    bVarW = aVar.d(uriBuild, inputEvent);
                } catch (Exception e2) {
                    bVarW = yo0.w(e2);
                }
                return yo0.F(n81.s(bVarW), new fp(2, builder), t20Var.f16675f);
            case 2:
                nb0 nb0Var = (nb0) this.f15396c;
                String str2 = (String) this.f15395b;
                uv uvVar = (uv) this.f15397d;
                ua.a aVar2 = (ua.a) this.f15398e;
                nb0Var.getClass();
                hl hlVar = ua.j.C.f35262d;
                qz qzVarF = hl.f(nb0Var.f14220a, new h0(0, 0, 0), "native-omid", false, false, nb0Var.f14222c, null, nb0Var.f14223d, null, nb0Var.f14224e, nb0Var.f14225f, null, null, nb0Var.f14233p, nb0Var.f14234q, nb0Var.f14230m);
                gi giVar = new gi(qzVarF);
                qzVarF.X().g = new wz(giVar, 1);
                qzVarF.loadData(Base64.encodeToString(str2.getBytes(), 1), "text/html", "base64");
                if (((Boolean) va.s.f36163e.f36166c.a(sk.Ve)).booleanValue()) {
                    if (uvVar != null) {
                        qzVarF.X().f12103y = uvVar;
                    }
                    qzVarF.X().f12101w = aVar2;
                }
                return giVar;
            case 3:
                pq0 pq0Var = (pq0) this.f15396c;
                return yo0.F(((qg0) this.f15397d).j((iu) this.f15398e), (e81) this.f15395b, (w81) pq0Var.f15073b);
            case 4:
                rj0 rj0Var = (rj0) this.f15396c;
                wp0 wp0Var = (wp0) this.f15397d;
                dq0 dq0Var = (dq0) this.f15398e;
                zh0 zh0Var = (zh0) this.f15395b;
                yr0 yr0VarC = d7.C(12, rj0Var.j);
                yr0VarC.c0(wp0Var.E);
                yr0VarC.b();
                vd.b bVarE = yo0.E(zh0Var.b(dq0Var, wp0Var), wp0Var.R, TimeUnit.MILLISECONDS, rj0Var.f15661f);
                rj0Var.f15662h.d(dq0Var, wp0Var, bVarE, rj0Var.f15658c);
                yr1.H(bVarE, rj0Var.f15664k, yr0VarC, false);
                return bVarE;
            case 5:
                fu0 fu0Var = (fu0) this.f15396c;
                rg0 rg0Var = (rg0) this.f15397d;
                pq0 pq0Var2 = (pq0) this.f15398e;
                uo0 uo0Var = (uo0) this.f15395b;
                ar0 ar0Var = (ar0) obj;
                synchronized (fu0Var) {
                    try {
                        fu0Var.f11262b = true;
                        ar0Var.f9390a = (x50) ((kh0) rg0Var.f15651b).f13160b;
                        if (fu0Var.f11261a) {
                            s81VarE = yo0.e(new gr0(ar0Var, uo0Var));
                        } else {
                            pq0Var2.t(uo0Var.g, ar0Var);
                            s81VarE = s81.f15906b;
                        }
                    } finally {
                    }
                }
                return s81VarE;
            case 6:
                return ((az0) ((px0) this.f15396c).f15135b.f10931f.get()).c((Context) this.f15397d, (View) this.f15398e, (Activity) this.f15395b);
            default:
                return ((az0) ((px0) this.f15396c).f15135b.f10931f.get()).g((Context) this.f15397d, (String) this.f15395b, (View) this.f15398e);
        }
    }

    public qq(y50 y50Var, String str, nq nqVar, mq mqVar) {
        this.f15394a = 0;
        this.f15398e = y50Var;
        this.f15395b = str;
        this.f15397d = nqVar;
        this.f15396c = mqVar;
    }

    public /* synthetic */ qq(nb0 nb0Var, String str, sv svVar, ua.a aVar) {
        this.f15394a = 2;
        this.f15396c = nb0Var;
        this.f15395b = str;
        this.f15397d = svVar;
        this.f15398e = aVar;
    }

    public /* synthetic */ qq(Object obj, Object obj2, Object obj3, Object obj4, int i4) {
        this.f15394a = i4;
        this.f15396c = obj;
        this.f15397d = obj2;
        this.f15398e = obj3;
        this.f15395b = obj4;
    }
}
