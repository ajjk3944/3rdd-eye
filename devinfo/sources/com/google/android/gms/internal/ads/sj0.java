package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IInterface;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class sj0 implements fi0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16023a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f16024b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f16025c;

    /* renamed from: d, reason: collision with root package name */
    public final w10 f16026d;

    public /* synthetic */ sj0(Context context, Executor executor, w10 w10Var, int i4) {
        this.f16023a = i4;
        this.f16024b = context;
        this.f16025c = executor;
        this.f16026d = w10Var;
    }

    public static final void c(dq0 dq0Var, wp0 wp0Var, ci0 ci0Var) {
        try {
            qq0 qq0Var = (qq0) ci0Var.f10135b;
            va.z2 z2Var = ((hq0) dq0Var.f10543a.f15651b).f11944d;
            try {
                qq0Var.f15399a.o3(wp0Var.f18112v.toString(), z2Var);
            } catch (Throwable th2) {
                throw new kq0(th2);
            }
        } catch (Exception e2) {
            za.i.i("Fail to load ad from adapter ".concat(String.valueOf(ci0Var.f10134a)), e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.fi0
    public final void a(dq0 dq0Var, wp0 wp0Var, ci0 ci0Var) {
        kq0 kq0Var;
        switch (this.f16023a) {
            case 0:
                JSONObject jSONObject = wp0Var.f18112v;
                IInterface iInterface = ci0Var.f10136c;
                Object obj = ci0Var.f10135b;
                Context context = this.f16024b;
                try {
                    hq0 hq0Var = (hq0) dq0Var.f10543a.f15651b;
                    s9 s9Var = hq0Var.f11954p;
                    va.z2 z2Var = hq0Var.f11944d;
                    if (s9Var.f15910b == 3) {
                        qq0 qq0Var = (qq0) obj;
                        try {
                            qq0Var.f15399a.F2(new vb.b(context), z2Var, jSONObject.toString(), (fr) iInterface);
                            return;
                        } finally {
                        }
                    }
                    qq0 qq0Var2 = (qq0) obj;
                    try {
                        qq0Var2.f15399a.R0(new vb.b(context), z2Var, jSONObject.toString(), (fr) iInterface);
                        return;
                    } finally {
                    }
                } catch (Exception e2) {
                    za.i.i("Fail to load ad from adapter ".concat(String.valueOf(ci0Var.f10134a)), e2);
                    return;
                }
                za.i.i("Fail to load ad from adapter ".concat(String.valueOf(ci0Var.f10134a)), e2);
                return;
            default:
                qq0 qq0Var3 = (qq0) ci0Var.f10135b;
                if (qq0Var3.a()) {
                    c(dq0Var, wp0Var, ci0Var);
                    return;
                }
                aw awVar = new aw(this, dq0Var, wp0Var, ci0Var, 19);
                IInterface iInterface2 = ci0Var.f10136c;
                wi0 wi0Var = (wi0) iInterface2;
                synchronized (wi0Var) {
                    wi0Var.f18030c = awVar;
                }
                Context context2 = this.f16024b;
                hq0 hq0Var2 = (hq0) dq0Var.f10543a.f15651b;
                wu wuVar = (wu) iInterface2;
                String string = wp0Var.f18112v.toString();
                try {
                    qq0Var3.f15399a.G0(new vb.b(context2), hq0Var2.f11944d, wuVar, string);
                    return;
                } finally {
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.fi0
    public final Object b(dq0 dq0Var, wp0 wp0Var, ci0 ci0Var) {
        switch (this.f16023a) {
            case 0:
                pq0 pq0Var = new pq0(dq0Var, wp0Var, ci0Var.f10134a);
                qc0 qc0Var = new qc0(new rt(this, ci0Var, wp0Var, 18), null, 0);
                w10 w10Var = this.f16026d;
                v10 v10Var = new v10(w10Var.f17822c, w10Var.f17823d, pq0Var, qc0Var);
                ((s60) v10Var.L.a()).m1(new r20(0, (qq0) ci0Var.f10135b), this.f16025c);
                ((vi0) ci0Var.f10136c).i4((uj0) v10Var.f17427g0.a());
                return v10Var.Z();
            default:
                pq0 pq0Var2 = new pq0(dq0Var, wp0Var, ci0Var.f10134a);
                qc0 qc0Var2 = new qc0(new ki0(this, ci0Var, wp0Var, 1), null, 0);
                w10 w10Var2 = this.f16026d;
                v10 v10Var2 = new v10(w10Var2.f17822c, w10Var2.f17823d, pq0Var2, qc0Var2);
                ((s60) v10Var2.L.a()).m1(new r20(0, (qq0) ci0Var.f10135b), this.f16025c);
                t60 t60Var = (t60) v10Var2.S.a();
                e60 e60Var = (e60) v10Var2.T.a();
                c70 c70Var = (c70) v10Var2.Y.a();
                w80 w80Var = (w80) v10Var2.f17425e0.a();
                wi0 wi0Var = (wi0) ci0Var.f10136c;
                xj0 xj0Var = new xj0(this, c70Var, e60Var, t60Var, w80Var);
                synchronized (wi0Var) {
                    wi0Var.f18028a = xj0Var;
                }
                return v10Var2.Z();
        }
    }
}
