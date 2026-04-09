package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class yv implements fs1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18882a;

    /* renamed from: b, reason: collision with root package name */
    public final js1 f18883b;

    /* renamed from: c, reason: collision with root package name */
    public final js1 f18884c;

    /* renamed from: d, reason: collision with root package name */
    public final js1 f18885d;

    public /* synthetic */ yv(js1 js1Var, js1 js1Var2, js1 js1Var3, int i4) {
        this.f18882a = i4;
        this.f18883b = js1Var;
        this.f18884c = js1Var2;
        this.f18885d = js1Var3;
    }

    @Override // com.google.android.gms.internal.ads.js1
    public final Object a() {
        Set setSingleton;
        switch (this.f18882a) {
            case 0:
                ya.c0 c0Var = (ya.c0) ((gs1) this.f18884c).f11600a;
                return new xv(c0Var);
            case 1:
                pk pkVar = sk.T;
                va.s sVar = va.s.f36163e;
                Integer num = (Integer) sVar.f36166c.a(pkVar);
                num.getClass();
                int iIntValue = num.intValue();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) ((es1) this.f18883b).a();
                kh0 kh0VarB = ((d10) this.f18884c).b();
                tb.a aVar = (tb.a) ((es1) this.f18885d).a();
                if (((Boolean) sVar.f36166c.a(sk.O)).booleanValue()) {
                    return new et0(iIntValue, scheduledExecutorService, kh0VarB, aVar);
                }
                return null;
            case 2:
                za.a aVarB = ((g10) this.f18883b).b();
                JSONObject jSONObject = (JSONObject) ((es1) this.f18884c).a();
                String str = (String) ((fs1) this.f18885d).a();
                boolean zEquals = "native".equals(str);
                ya.f0 f0Var = ua.j.C.f35261c;
                return new vg(UUID.randomUUID().toString(), aVarB, str, jSONObject, zEquals);
            case 3:
                return new b40((qz) ((y30) this.f18883b).f18622b.f9454e, (qd0) this.f18884c.a(), ((v40) this.f18885d).b());
            case 4:
                Context context = (Context) this.f18883b.a();
                za.a aVarB2 = ((g10) this.f18884c).b();
                wp0 wp0VarB = ((v40) this.f18885d).b();
                tv tvVar = wp0VarB.A;
                if (tvVar == null) {
                    return null;
                }
                aq0 aq0Var = wp0VarB.f18106s;
                return new sv(context, aVarB2, tvVar, aq0Var != null ? aq0Var.f9387b : null);
            case 5:
                l60 l60Var = new l60(((f60) this.f18883b).f11019b.a());
                Set setA = ((ks1) this.f18884c).a();
                ex exVar = fx.f11274a;
                al0.z(exVar);
                return new m60(l60Var, setA, exVar, (ScheduledExecutorService) this.f18885d.a());
            case 6:
                return new d70(((ks1) this.f18883b).a(), ((v40) this.f18884c).b(), ((v40) this.f18885d).c());
            case 7:
                return new r80((Context) this.f18883b.a(), ((ks1) this.f18884c).a(), ((v40) this.f18885d).b());
            case 8:
                ga0 ga0VarB = ((m20) this.f18883b).b();
                ha0 ha0Var = (ha0) ((h50) this.f18884c).f11711b.a();
                al0.z(ha0Var);
                Executor executor = (Executor) this.f18885d.a();
                ex exVar2 = fx.f11274a;
                al0.z(exVar2);
                return new cb0(ga0VarB, ha0Var, executor, exVar2);
            case 9:
                return c();
            case 10:
                int i4 = ((b60) this.f18885d).b().f11954p.f15910b;
                if (i4 != 0) {
                    return i4 + (-1) != 0 ? ((el) this.f18884c).c() : ((el) this.f18883b).c();
                }
                throw null;
            case 11:
                String str2 = ((iu) ((jo0) this.f18883b).f12805b.f34474c).f12479h;
                al0.z(str2);
                Context contextB = ((a10) this.f18884c).b();
                ex exVar3 = fx.f11274a;
                al0.z(exVar3);
                Map mapA = ((hs1) this.f18885d).a();
                if (((Boolean) va.s.f36163e.f36166c.a(sk.U5)).booleanValue()) {
                    li liVar = new li(new m8.s(contextB, 2));
                    synchronized (liVar) {
                        if (liVar.f13496c) {
                            try {
                                hk hkVar = liVar.f13495b;
                                hkVar.b();
                                ((ik) hkVar.f14755b).B(str2);
                            } catch (NullPointerException e2) {
                                ua.j.C.f35265h.f("AdMobClearcutLogger.modify", e2);
                            }
                        }
                    }
                    setSingleton = Collections.singleton(new q80(new jd0(liVar, mapA), exVar3));
                } else {
                    setSingleton = Collections.EMPTY_SET;
                }
                al0.z(setSingleton);
                return setSingleton;
            case 12:
                return new td0((od0) ((es1) this.f18883b).a(), ((ks1) this.f18884c).a(), (tb.a) this.f18885d.a());
            case 13:
                ex exVar4 = fx.f11274a;
                al0.z(exVar4);
                za.l lVar = (za.l) this.f18883b.a();
                fb.w wVar = (fb.w) this.f18884c;
                return new ud0(exVar4, lVar, new yb.e((Context) wVar.f23987b.a(), (za.a) ((g10) wVar.f23988c).a()), new gb.a(0), ((a10) this.f18885d).b());
            case 14:
                Context contextB2 = ((a10) this.f18883b).b();
                WeakReference weakReference = ((y00) this.f18884c).f18599b.f17811d;
                al0.z(weakReference);
                hf0 hf0Var = (hf0) ((es1) this.f18885d).a();
                ex exVar5 = fx.f11274a;
                al0.z(exVar5);
                return new pf0(contextB2, weakReference, hf0Var, exVar5);
            case 15:
                return b();
            case 16:
                return d();
            case 17:
                z00 z00Var = (z00) this.f18883b;
                ex exVar6 = fx.f11274a;
                al0.z(exVar6);
                im0 im0Var = new im0(z00Var.f18951b.b(), exVar6);
                tb.a aVar2 = (tb.a) ((es1) this.f18884c).a();
                al0.z(exVar6);
                return new mm0(im0Var, ((Long) ll.f13521c.u()).longValue(), aVar2, exVar6, (qd0) ((es1) this.f18885d).a());
            case 18:
                Context contextB3 = ((z00) this.f18883b).f18951b.b();
                ex exVar7 = fx.f11274a;
                al0.z(exVar7);
                vl0 vl0Var = new vl0(contextB3, exVar7, 6);
                tb.a aVar3 = (tb.a) ((es1) this.f18884c).a();
                al0.z(exVar7);
                return new mm0(vl0Var, 2147483647L, aVar3, exVar7, (qd0) ((es1) this.f18885d).a());
            case 19:
                d10 d10Var = (d10) this.f18883b;
                ex exVar8 = fx.f11274a;
                al0.z(exVar8);
                wn0 wn0Var = new wn0(exVar8, d10Var.f10289b.b(), (tf0) d10Var.f10290c.a());
                tb.a aVar4 = (tb.a) ((es1) this.f18884c).a();
                al0.z(exVar8);
                return new mm0(wn0Var, ((Long) ll.f13522d.u()).longValue(), aVar4, exVar8, (qd0) ((es1) this.f18885d).a());
            case 20:
                el0 el0Var = new el0(0, ((a10) ((gl0) this.f18883b).f11546a).b());
                tb.a aVar5 = (tb.a) ((es1) this.f18884c).a();
                ex exVar9 = fx.f11274a;
                al0.z(exVar9);
                return new mm0(el0Var, 2147483647L, aVar5, exVar9, (qd0) ((es1) this.f18885d).a());
            case 21:
                xl0 xl0VarA = ((yl0) this.f18883b).a();
                tb.a aVar6 = (tb.a) ((es1) this.f18884c).a();
                ex exVar10 = fx.f11274a;
                al0.z(exVar10);
                return new mm0(xl0VarA, ((Long) ll.f13519a.u()).longValue(), aVar6, exVar10, (qd0) ((es1) this.f18885d).a());
            case 22:
                xl0 xl0VarA2 = ((em0) this.f18883b).a();
                tb.a aVar7 = (tb.a) ((es1) this.f18884c).a();
                ex exVar11 = fx.f11274a;
                al0.z(exVar11);
                return new mm0(xl0VarA2, 2147483647L, aVar7, exVar11, (qd0) ((es1) this.f18885d).a());
            case 23:
                vl0 vl0VarA = ((gm0) this.f18883b).a();
                tb.a aVar8 = (tb.a) ((es1) this.f18884c).a();
                ex exVar12 = fx.f11274a;
                al0.z(exVar12);
                return new mm0(vl0VarA, ((Long) ll.f13520b.u()).longValue(), aVar8, exVar12, (qd0) ((es1) this.f18885d).a());
            case 24:
                xl0 xl0VarA3 = ((xm0) this.f18883b).a();
                tb.a aVar9 = (tb.a) ((es1) this.f18884c).a();
                ex exVar13 = fx.f11274a;
                al0.z(exVar13);
                return new mm0(xl0VarA3, ((Long) ll.f13523e.u()).longValue(), aVar9, exVar13, (qd0) ((es1) this.f18885d).a());
            case 25:
                dn0 dn0VarA = ((fn0) this.f18883b).a();
                tb.a aVar10 = (tb.a) ((es1) this.f18884c).a();
                ex exVar14 = fx.f11274a;
                al0.z(exVar14);
                return new mm0(dn0VarA, 2147483647L, aVar10, exVar14, (qd0) ((es1) this.f18885d).a());
            case 26:
                hl0 hl0VarA = ((nn0) this.f18883b).a();
                tb.a aVar11 = (tb.a) ((es1) this.f18884c).a();
                ex exVar15 = fx.f11274a;
                al0.z(exVar15);
                return new mm0(hl0VarA, ((Long) ll.g.u()).longValue(), aVar11, exVar15, (qd0) ((es1) this.f18885d).a());
            case 27:
                vl0 vl0VarA2 = ((yn0) this.f18883b).a();
                tb.a aVar12 = (tb.a) ((es1) this.f18884c).a();
                ex exVar16 = fx.f11274a;
                al0.z(exVar16);
                return new mm0(vl0VarA2, ((Long) ll.f13525h.u()).longValue(), aVar12, exVar16, (qd0) ((es1) this.f18885d).a());
            case 28:
                return e();
            default:
                al0.z(((iu) ((jo0) this.f18883b).f12805b.f34474c).f12476d);
                zw zwVar = (zw) this.f18884c.a();
                ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) this.f18885d.a();
                ex exVar17 = fx.f11274a;
                al0.z(exVar17);
                return new ol0(zwVar, scheduledExecutorService2, exVar17);
        }
    }

    public r7 b() {
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f18883b.a();
        ex exVar = fx.f11274a;
        al0.z(exVar);
        ex exVar2 = fx.f11275b;
        al0.z(exVar2);
        Context contextB = ((a10) ((f20) this.f18884c).f10966b).b();
        al0.z(exVar);
        return new r7(scheduledExecutorService, exVar, exVar2, new dg0(contextB, exVar, 1), es1.c((g40) this.f18885d), 3);
    }

    public aw c() {
        ex exVar = fx.f11274a;
        al0.z(exVar);
        nb0 nb0VarB = ((ob0) this.f18883b).a();
        hw hwVar = (hw) this.f18884c;
        al0.z(exVar);
        return new aw(exVar, nb0VarB, new pq0(exVar, ((ob0) hwVar.f11994b).a(), (od0) ((es1) hwVar.f11995c).a(), false, 16), (od0) ((es1) this.f18885d).a(), 13, false);
    }

    public hl0 d() {
        ex exVar = fx.f11274a;
        al0.z(exVar);
        return new hl0(exVar, ((a10) this.f18883b).b(), ((b60) this.f18884c).b(), (ViewGroup) ((fk0) ((m20) this.f18885d).f13731b).f11194b, 0);
    }

    public hl0 e() {
        ex exVar = fx.f11274a;
        al0.z(exVar);
        return new hl0(exVar, (ViewGroup) ((fk0) ((m20) this.f18883b).f13731b).f11194b, (Context) ((es1) this.f18884c).a(), ((ks1) this.f18885d).a());
    }
}
