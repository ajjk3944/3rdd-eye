package com.google.android.gms.internal.ads;

import android.webkit.CookieManager;
import j$.util.Objects;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class s00 implements fs1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15819a;

    /* renamed from: b, reason: collision with root package name */
    public final es1 f15820b;

    /* renamed from: c, reason: collision with root package name */
    public final es1 f15821c;

    public /* synthetic */ s00(es1 es1Var, es1 es1Var2, int i4) {
        this.f15819a = i4;
        this.f15820b = es1Var;
        this.f15821c = es1Var2;
    }

    @Override // com.google.android.gms.internal.ads.js1
    public final Object a() {
        ex exVar;
        switch (this.f15819a) {
            case 0:
                return new r00((o00) this.f15820b.a(), (qd0) this.f15821c.a());
            case 1:
                return new t00((ScheduledExecutorService) this.f15821c.a());
            case 2:
                return ((Boolean) va.s.f36163e.f36166c.a(sk.f16349u3)).booleanValue() ? new oe((me) this.f15821c.a()) : new oe((me) this.f15820b.a());
            case 3:
                vg vgVar = (vg) this.f15820b.a();
                uq uqVar = (uq) this.f15821c.a();
                pk pkVar = sk.A6;
                va.s sVar = va.s.f36163e;
                if (((Boolean) sVar.f36166c.a(pkVar)).booleanValue()) {
                    exVar = fx.f11276c;
                } else {
                    exVar = ((Boolean) sVar.f36166c.a(sk.f16433z6)).booleanValue() ? fx.f11274a : fx.f11279f;
                }
                al0.z(exVar);
                return new e30(vgVar.f17616c, uqVar, exVar);
            case 4:
                j30 j30Var = (j30) this.f15820b.a();
                ex exVar2 = fx.f11274a;
                al0.z(exVar2);
                Set setSingleton = ((JSONObject) this.f15821c.a()) == null ? Collections.EMPTY_SET : Collections.singleton(new q80(j30Var, exVar2));
                al0.z(setSingleton);
                return setSingleton;
            case 5:
                j30 j30Var2 = (j30) this.f15820b.a();
                ex exVar3 = fx.f11274a;
                al0.z(exVar3);
                Set setSingleton2 = ((JSONObject) this.f15821c.a()) == null ? Collections.EMPTY_SET : Collections.singleton(new q80(j30Var2, exVar3));
                al0.z(setSingleton2);
                return setSingleton2;
            case 6:
                j30 j30Var3 = (j30) this.f15820b.a();
                ex exVar4 = fx.f11274a;
                al0.z(exVar4);
                Set setSingleton3 = ((JSONObject) this.f15821c.a()) == null ? Collections.EMPTY_SET : Collections.singleton(new q80(j30Var3, exVar4));
                al0.z(setSingleton3);
                return setSingleton3;
            case 7:
                j30 j30Var4 = (j30) this.f15820b.a();
                ex exVar5 = fx.f11274a;
                al0.z(exVar5);
                Set setSingleton4 = ((JSONObject) this.f15821c.a()) == null ? Collections.EMPTY_SET : Collections.singleton(new q80(j30Var4, exVar5));
                al0.z(setSingleton4);
                return setSingleton4;
            case 8:
                return new d90((c70) this.f15820b.a(), (n80) this.f15821c.a());
            case 9:
                return new wd0((ud0) this.f15821c.a(), (String) this.f15820b.a());
            case 10:
                return new bf0((re0) this.f15820b.a(), (dd0) this.f15821c.a());
            case 11:
                sr0 sr0Var = (sr0) this.f15820b.a();
                ua.j.C.f35264f.getClass();
                CookieManager cookieManagerD = ja.c.D();
                Objects.requireNonNull(sr0Var);
                qe qeVar = new qe(4, cookieManagerD);
                w81 w81Var = sr0Var.f16525a;
                s81 s81Var = sr0.f16524d;
                List list = Collections.EMPTY_LIST;
                vd.b bVarE = ((ex) w81Var).e(qeVar);
                TimeUnit timeUnit = TimeUnit.SECONDS;
                ai aiVar = new ai(sr0Var, qr0.WEBVIEW_COOKIE, null, s81Var, list, yo0.E(bVarE, 1L, TimeUnit.SECONDS, sr0Var.f16526b));
                k20 k20Var = new k20(14);
                sr0 sr0Var2 = (sr0) aiVar.f9335f;
                return new ai(sr0Var2, aiVar.f9332c, (String) aiVar.f9330a, (vd.b) aiVar.f9331b, (List) aiVar.f9333d, yo0.D((vd.b) aiVar.f9334e, Exception.class, k20Var, sr0Var2.f16525a)).t();
            case 12:
                ex exVar6 = fx.f11274a;
                al0.z(exVar6);
                nm0 nm0Var = new nm0(exVar6, 2);
                tb.a aVar = (tb.a) this.f15820b.a();
                al0.z(exVar6);
                return new mm0(nm0Var, ((Long) ll.f13524f.u()).longValue(), aVar, exVar6, (qd0) this.f15821c.a());
            case 13:
                return new vp0((tb.a) this.f15820b.a(), (qd0) this.f15821c.a());
            case 14:
                return new hn0((String) this.f15820b.a(), ((Integer) this.f15821c.a()).intValue());
            case 15:
                return new lt0((mt0) this.f15820b.a(), (gt0) this.f15821c.a());
            case 16:
                p4.g gVar = (p4.g) this.f15820b.a();
                ex exVar7 = fx.f11274a;
                al0.z(exVar7);
                return new yf0(gVar, new kh0(11, exVar7), (bd0) this.f15821c.a(), new tk0((byte) 0, 16));
            case 17:
                Executor executor = (Executor) this.f15820b.a();
                return new ey0(executor);
            default:
                return new g21((nx0) this.f15820b.a(), (oy0) this.f15821c.a());
        }
    }
}
