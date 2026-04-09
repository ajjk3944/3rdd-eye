package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class ti0 implements e81 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16823a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16824b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16825c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f16826d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f16827e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f16828f;

    public /* synthetic */ ti0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i4) {
        this.f16823a = i4;
        this.f16824b = obj;
        this.f16825c = obj2;
        this.f16826d = obj3;
        this.f16827e = obj4;
        this.f16828f = obj5;
    }

    @Override // com.google.android.gms.internal.ads.e81
    public final vd.b c(Object obj) {
        c71 c71VarB;
        switch (this.f16823a) {
            case 0:
                ui0 ui0Var = (ui0) this.f16824b;
                Uri uri = (Uri) this.f16825c;
                dq0 dq0Var = (dq0) this.f16826d;
                wp0 wp0Var = (wp0) this.f16827e;
                yp0 yp0Var = (yp0) this.f16828f;
                try {
                    Intent intent = new u.l().a().f34718a;
                    intent.setData(uri);
                    xa.e eVar = new xa.e(intent, null);
                    gx gxVar = new gx();
                    t10 t10Var = (t10) ui0Var.f17209c;
                    s10 s10Var = new s10(t10Var.f16640b, t10Var.f16641c, new pq0(dq0Var, wp0Var, (String) null), new l90(11, new pq0(ui0Var, gxVar, wp0Var, 22), (Object) null));
                    gxVar.b(new AdOverlayInfoParcel(eVar, null, (c70) s10Var.Z.a(), null, new za.a(0, 0, false), null, null, yp0Var.f18820b));
                    ((vp0) ui0Var.f17211e).d(2, 3);
                    return yo0.e(s10Var.Z());
                } catch (Throwable th2) {
                    za.i.f("Error in CustomTabsAdRenderer", th2);
                    throw th2;
                }
            default:
                ai aiVar = (ai) this.f16824b;
                ce1 ce1Var = (ce1) this.f16825c;
                uo0 uo0Var = (uo0) this.f16826d;
                ep0 ep0Var = (ep0) this.f16827e;
                x50 x50Var = (x50) this.f16828f;
                wo0 wo0Var = (wo0) obj;
                if (wo0Var != null) {
                    uo0 uo0Var2 = new uo0(uo0Var.f17273a, uo0Var.f17274b, uo0Var.f17275c, uo0Var.f17276d, uo0Var.f17277e, uo0Var.f17278f, wo0Var.f18064a);
                    ar0 ar0Var = wo0Var.f18066c;
                    if (ar0Var != null) {
                        aiVar.f9334e = null;
                        ((g) aiVar.f9332c).a(uo0Var2);
                        return aiVar.q(ar0Var, ce1Var);
                    }
                    g gVar = (g) aiVar.f9332c;
                    synchronized (gVar) {
                        gVar.f11324a = 2;
                        c71VarB = gVar.f() ? null : ((fu0) gVar.f11328e).b(uo0Var2);
                    }
                    if (c71VarB != null) {
                        aiVar.f9334e = null;
                        return yo0.F(c71VarB, new fp(12, aiVar), (Executor) aiVar.f9335f);
                    }
                    gVar.a(uo0Var2);
                    ce1Var = new ce1(18, (dp0) ce1Var.f10095c, wo0Var.f18065b);
                }
                vd.b bVarO = ((l90) aiVar.f9330a).o(ce1Var, ep0Var, x50Var);
                aiVar.f9334e = x50Var;
                return bVarO;
        }
    }
}
