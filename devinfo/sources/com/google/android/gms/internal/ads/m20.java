package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class m20 implements fs1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13730a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f13731b;

    public /* synthetic */ m20(int i4, Object obj) {
        this.f13730a = i4;
        this.f13731b = obj;
    }

    @Override // com.google.android.gms.internal.ads.js1
    public final Object a() {
        Object f51Var;
        int i4 = this.f13730a;
        int i10 = 0;
        int i11 = 5;
        int i12 = 10;
        int i13 = 8;
        int i14 = 11;
        Object obj = this.f13731b;
        switch (i4) {
            case 0:
                return new l20(i10, new nk(((a10) ((f20) obj).f10966b).b(), 3));
            case 1:
                return (ViewGroup) ((fk0) obj).f11194b;
            case 2:
                return ((v30) obj).b();
            case 3:
                yv yvVar = (yv) obj;
                return new q80(new b40((qz) ((y30) yvVar.f18883b).f18622b.f9454e, (qd0) yvVar.f18884c.a(), ((v40) yvVar.f18885d).b()), fx.f11274a);
            case 4:
                hw hwVar = (hw) obj;
                d40 d40Var = new d40((qz) ((y30) hwVar.f11994b).f18622b.f9454e, (Executor) hwVar.f11995c.a());
                if (((Boolean) va.s.f36163e.f36166c.a(sk.Rd)).booleanValue()) {
                    q80 q80Var = new q80(d40Var, fx.f11274a);
                    int i15 = e51.f10709c;
                    f51Var = new f51(q80Var);
                } else {
                    int i16 = e51.f10709c;
                    f51Var = a61.j;
                }
                al0.z(f51Var);
                return f51Var;
            case 5:
                return ((k50) obj).b();
            case 6:
                a40 a40Var = (a40) obj;
                return new m40(new bw(((a10) a40Var.f9202b).b(), ((b60) a40Var.f9203c).b().g));
            case 7:
                return new p40(((hs1) obj).a());
            case 8:
                return new o50(((v40) obj).c());
            case 9:
                return (l90) obj;
            case 10:
                ka0 ka0Var = (ka0) ((n90) obj).f14185a.f13426b;
                al0.z(ka0Var);
                Set setSingleton = ka0Var.f13094d != null ? Collections.singleton("banner") : Collections.EMPTY_SET;
                al0.z(setSingleton);
                return setSingleton;
            case 11:
                ha0 ha0Var = (ha0) ((h50) obj).f11711b.a();
                al0.z(ha0Var);
                JSONObject jSONObject = ha0Var.f11790b;
                if (jSONObject == null) {
                    try {
                        jSONObject = new JSONObject(ha0Var.f12183a.f18120z);
                    } catch (JSONException unused) {
                        return null;
                    }
                }
                return jSONObject;
            case 12:
                w90 w90Var = new w90(((x90) obj).f18330b.b());
                ea0 ea0Var = new ea0();
                ea0Var.f10748a = w90Var;
                return ea0Var;
            case 13:
                ga0 ga0Var = (ga0) ((mx0) obj).f14041b;
                al0.z(ga0Var);
                return ga0Var;
            case 14:
                return new r20(1, (qz) ((fs1) obj).a());
            case 15:
                return new q80(new r20(1, (qz) ((fs1) ((m20) obj).f13731b).a()), fx.f11279f);
            case 16:
                s00 s00Var = (s00) obj;
                p4.g gVar = (p4.g) s00Var.f15820b.a();
                ex exVar = fx.f11274a;
                al0.z(exVar);
                return new ad0(new yf0(gVar, new kh0(11, exVar), (bd0) s00Var.f15821c.a(), new tk0((byte) 0, 16)));
            case 17:
                ex exVar2 = fx.f11274a;
                al0.z(exVar2);
                hw hwVar2 = (hw) obj;
                Set setSingleton2 = ((Boolean) va.s.f36163e.f36166c.a(sk.U5)).booleanValue() ? Collections.singleton(new q80(new jd0((li) ((es1) hwVar2.f11994b).a(), ((hs1) hwVar2.f11995c).a()), exVar2)) : Collections.EMPTY_SET;
                al0.z(setSingleton2);
                return setSingleton2;
            case 18:
                a40 a40Var2 = (a40) obj;
                kg0 kg0Var = new kg0(((a10) a40Var2.f9202b).b(), (dw) a40Var2.f9203c.a());
                ex exVar3 = fx.f11274a;
                al0.z(exVar3);
                return new q80(kg0Var, exVar3);
            case 19:
                hw hwVar3 = (hw) obj;
                eh0 eh0Var = (eh0) ((es1) hwVar3.f11994b).a();
                hw hwVar4 = (hw) hwVar3.f11995c;
                jd0 jd0Var = new jd0(eh0Var, new fh0(((hw) hwVar4.f11994b).b(), ((x00) hwVar4.f11995c).a()));
                ex exVar4 = fx.f11274a;
                al0.z(exVar4);
                return new q80(jd0Var, exVar4);
            case 20:
                return new el0(5, (Bundle) ((z50) obj).f19021b.f18644c);
            case 21:
                al0.z(fx.f11274a);
                al0.z(((iu) ((jo0) obj).f12805b.f34474c).f12476d);
                return new ho0();
            case 22:
                final Context context = ((y00) obj).f18599b.f17809b;
                al0.z(context);
                ex exVar5 = fx.f11274a;
                al0.z(exVar5);
                return t6.i0.e(tw0.f16979a, null, zj.s.f38317a, xk.x.b(new xk.s0(exVar5)), new mk.a() { // from class: com.google.android.gms.internal.ads.uw0
                    @Override // mk.a
                    public final /* synthetic */ Object invoke() {
                        return com.google.android.gms.internal.play_billing.m1.i(context, "ad_quality_data.pb");
                    }
                });
            case 23:
                az0 az0Var = (az0) ((es1) new aw((d80) ((kh0) ((tx0) obj).a()).f13160b).f9453d).a();
                al0.z(az0Var);
                return az0Var;
            case 24:
                d80 d80Var = (d80) ((ne0) ((tx0) obj).a()).f14280b;
                gs1 gs1Var = (gs1) d80Var.f10364b;
                gs1 gs1Var2 = (gs1) d80Var.f10366d;
                int i17 = 7;
                es1 es1VarB = es1.b(new pj0(gs1Var, gs1Var2, (es1) d80Var.f10369h, i17));
                int i18 = 13;
                es1 es1VarB2 = es1.b(new g30(gs1Var, es1VarB, i18));
                es1 es1Var = (es1) d80Var.f10370i;
                es1 es1Var2 = (es1) d80Var.f10365c;
                gs1 gs1Var3 = (gs1) d80Var.f10367e;
                es1 es1VarB3 = es1.b(new v90(es1VarB2, es1Var, es1Var2, gs1Var3, 1));
                es1 es1Var3 = (es1) d80Var.f10374n;
                es1 es1VarB4 = es1.b(new zm0(es1Var3, i18));
                es1 es1Var4 = (es1) d80Var.f10375o;
                es1 es1VarB5 = es1.b(new md0(2, es1.b(new ic0(es1.b(new gl(i11, es1VarB4, es1Var, es1Var4)), es1.b(new gl(6, es1.b(new zm0(es1Var3, 15)), es1Var, es1Var4)), es1.b(new gl(i17, es1.b(new zm0(es1Var3, 17)), es1Var, es1Var4)), es1.b(new gl(2, es1.b(new zm0(es1Var3, i12)), es1Var, es1Var4)), es1.b(new gl(3, es1.b(new zm0(es1Var3, 11)), es1Var, es1Var4)), es1.b(new gl(4, es1.b(new zm0(es1Var3, 12)), es1Var, es1Var4)), es1.b(new zm0(es1Var3, 14)), gs1Var2, es1Var)), es1.b(new gl(8, es1.b(new gl(gs1Var, es1VarB2, es1Var)), es1Var, gs1Var2)), gs1Var3));
                es1 es1VarB6 = es1.b(new zm0(es1Var3, 16));
                es1 es1VarB7 = es1.b(a80.L);
                az0 az0Var2 = (az0) es1.b(new gj0(es1.b(new j90(es1VarB3, es1.b(new k50(gs1Var, es1VarB2, es1VarB5, es1Var, gs1Var2, es1.b(new md0(1, es1VarB6, es1VarB7, es1Var)), es1VarB)), es1VarB5, es1Var, (es1) d80Var.f10368f, gs1Var3)), es1.b(new k30(es1.b(new k30(gs1Var, es1.b(new pj0(gs1Var, gs1Var3, (es1) d80Var.f10371k, 6)), es1VarB, gs1Var3, es1VarB7)), es1VarB5, es1VarB3, es1Var, gs1Var2)), es1VarB5, gs1Var3, 1)).a();
                al0.z(az0Var2);
                return az0Var2;
            default:
                d80 d80Var2 = (d80) ((rg0) ((tx0) obj).a()).f15651b;
                es1 es1Var5 = (es1) d80Var2.f10365c;
                es1 es1Var6 = (es1) d80Var2.f10370i;
                gs1 gs1Var4 = (gs1) d80Var2.f10367e;
                es1 es1VarB8 = es1.b(new pj0(es1Var5, es1Var6, gs1Var4, i13));
                es1 es1VarB9 = es1.b(nn1.f14361z);
                gs1 gs1Var5 = (gs1) d80Var2.f10364b;
                gs1 gs1Var6 = (gs1) d80Var2.f10366d;
                es1 es1VarB10 = es1.b(new j90((js1) gs1Var5, (js1) gs1Var6, (js1) gs1Var4, (js1) d80Var2.g, (js1) es1Var6, (js1) es1VarB9, 14));
                es1 es1Var7 = (es1) d80Var2.f10374n;
                es1 es1VarB11 = es1.b(new zm0(es1Var7, 18));
                es1 es1Var8 = (es1) d80Var2.f10375o;
                es1 es1VarB12 = es1.b(new gj0(es1.b(new gl(9, es1VarB11, es1Var6, es1Var8)), es1.b(new gl(i12, es1.b(new zm0(es1Var7, 19)), es1Var6, es1Var8)), es1.b(new gl(i14, es1.b(new zm0(es1Var7, 20)), es1Var6, es1Var8)), es1Var6, 2));
                az0 az0Var3 = (az0) es1.b(new gj0(es1.b(new j90(es1VarB8, es1VarB10, es1VarB12, es1Var6, (es1) d80Var2.f10368f, gs1Var4)), es1.b(new u20(es1VarB8, es1VarB12, (es1) d80Var2.f10371k, es1Var6, gs1Var4, gs1Var6)), es1VarB12, gs1Var4, 1)).a();
                al0.z(az0Var3);
                return az0Var3;
        }
    }

    public ga0 b() {
        ga0 ga0Var = (ga0) ((mx0) this.f13731b).f14041b;
        al0.z(ga0Var);
        return ga0Var;
    }
}
