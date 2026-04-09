package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class hw implements fs1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11993a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f11994b;

    /* renamed from: c, reason: collision with root package name */
    public final js1 f11995c;

    public /* synthetic */ hw(Object obj, js1 js1Var, int i4) {
        this.f11993a = i4;
        this.f11994b = obj;
        this.f11995c = js1Var;
    }

    @Override // com.google.android.gms.internal.ads.js1
    public final Object a() {
        switch (this.f11993a) {
            case 0:
                Context context = (Context) ((gs1) this.f11994b).f11600a;
                zv zvVar = (zv) this.f11995c;
                return new gw(context, new ce1((tb.a) zvVar.f19188c.f11600a, false, (xv) zvVar.f19187b.a(), 7));
            case 1:
                return new ce1(((hs1) this.f11994b).a(), false, ((hs1) this.f11995c).a(), 9);
            case 2:
                return ((aw) this.f11994b).v(((ks1) this.f11995c).a());
            case 3:
                return new jl0(((yv) this.f11994b).d(), ((Integer) va.s.f36163e.f36166c.a(sk.Jd)).intValue(), (ScheduledExecutorService) this.f11995c.a());
            case 4:
                return new jl0(new el0(2, ((rc0) this.f11994b).f15615b.b()), ((Integer) va.s.f36163e.f36166c.a(sk.Od)).intValue(), (ScheduledExecutorService) this.f11995c.a());
            case 5:
                return new jl0(((yv) this.f11994b).e(), ((Integer) va.s.f36163e.f36166c.a(sk.Kd)).intValue(), (ScheduledExecutorService) this.f11995c.a());
            case 6:
                Boolean bool = (Boolean) va.s.f36163e.f36166c.a(sk.f16351u6);
                bool.booleanValue();
                return true == bool.booleanValue() ? ((v30) this.f11994b).d() : ((el) this.f11995c).c();
            case 7:
                return new d40((qz) ((y30) this.f11994b).f18622b.f9454e, (Executor) this.f11995c.a());
            case 8:
                String str = (String) ((es1) this.f11995c).a();
                ei0 ei0Var = (ei0) ((y50) this.f11994b).f18647f;
                return ei0Var != null ? ei0Var : new ei0(str);
            case 9:
                ((a10) this.f11995c).b();
                Context context2 = ((y50) this.f11994b).f18642a;
                al0.z(context2);
                return context2;
            case 10:
                Set setA = ((ks1) this.f11995c).a();
                e80 e80Var = (e80) this.f11994b;
                if (((h60) e80Var.f10742p) == null) {
                    e80Var.f10742p = new h60(setA);
                }
                h60 h60Var = (h60) e80Var.f10742p;
                al0.z(h60Var);
                return h60Var;
            case 11:
                return new a90((ad0) ((js1) this.f11994b).a(), ((v40) this.f11995c).f17495b.v());
            case 12:
                Set setX = ((l90) this.f11994b).x((n50) ((es1) this.f11995c).a());
                al0.z(setX);
                return setX;
            case 13:
                return new q80(new w30(1, (qz) ((l90) this.f11994b).f13427c), (Executor) this.f11995c.a());
            case 14:
                wp0 wp0VarB = ((v40) this.f11994b).b();
                JSONObject jSONObject = (JSONObject) ((t90) this.f11995c).f16758b.f9451b;
                al0.z(jSONObject);
                return new ha0(wp0VarB, jSONObject);
            case 15:
                return new q80(new mc0(((x90) this.f11994b).f18330b.b()), (Executor) this.f11995c.a());
            case 16:
                ex exVar = fx.f11274a;
                al0.z(exVar);
                return new pq0(exVar, ((ob0) this.f11994b).a(), (od0) ((es1) this.f11995c).a(), false, 16);
            case 17:
                ca0 ca0Var = (ca0) ((zm0) this.f11994b).a();
                ga0 ga0VarB = ((m20) this.f11995c).b();
                wb0 wb0Var = new wb0("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
                wb0Var.f17961a = ga0VarB.j();
                wb0Var.f17962b = ga0VarB.X();
                wb0Var.f17963c = ca0Var;
                wb0Var.f17964d = false;
                wb0Var.f17965e = false;
                if (ga0VarB.r() != null) {
                    ga0VarB.r().m0(wb0Var);
                }
                return wb0Var;
            case 18:
                return new nc0((t60) ((es1) this.f11994b).a(), ((v40) this.f11995c).b());
            case 19:
                return new ed0(pq0.o(((z00) this.f11994b).f18951b.b()), (dd0) ((es1) this.f11995c).a());
            case 20:
                return new jd0((li) ((es1) this.f11994b).a(), ((hs1) this.f11995c).a());
            case 21:
                return new fe0((r10) ((gs1) this.f11994b).f11600a, new mx0(26, (zo) ((ee0) this.f11995c).f10768b.f11600a));
            case 22:
                ex exVar2 = fx.f11275b;
                al0.z(exVar2);
                ex exVar3 = fx.f11274a;
                al0.z(exVar3);
                return new aw(exVar2, exVar3, new dg0((Context) ((xe0) this.f11994b).f18379b.a(), exVar3, 0), es1.c((g40) this.f11995c), 16, false);
            case 23:
                Map map = ((is1) this.f11994b).f10546a;
                ex exVar4 = fx.f11274a;
                al0.z(exVar4);
                return new mg0(map, exVar4, new m70(((f60) this.f11995c).f11019b.a()));
            case 24:
                ex exVar5 = fx.f11274a;
                al0.z(exVar5);
                return new pq0(exVar5, ((f20) this.f11994b).b(), es1.c((g40) this.f11995c), false, 17);
            case 25:
                return b();
            case 26:
                return new dh0(((g40) this.f11994b).c(), ((x00) this.f11995c).a());
            case 27:
                return new fh0(((hw) this.f11994b).b(), ((x00) this.f11995c).a());
            case 28:
                eh0 eh0Var = (eh0) ((es1) this.f11994b).a();
                hw hwVar = (hw) this.f11995c;
                return new jd0(eh0Var, new fh0(((hw) hwVar.f11994b).b(), ((x00) hwVar.f11995c).a()));
            default:
                return new jl0(((m50) this.f11994b).b(), ((Integer) va.s.f36163e.f36166c.a(sk.Gd)).intValue(), (ScheduledExecutorService) this.f11995c.a());
        }
    }

    public l90 b() {
        return new l90(15, new ch0(((a10) ((f20) this.f11994b).f10966b).b()), (w81) this.f11995c.a());
    }
}
