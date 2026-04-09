package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IInterface;
import android.os.RemoteException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ni0 implements fi0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14293a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f14294b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f14295c;

    public /* synthetic */ ni0(int i4, Context context, Object obj) {
        this.f14293a = i4;
        this.f14294b = context;
        this.f14295c = obj;
    }

    @Override // com.google.android.gms.internal.ads.fi0
    public final void a(dq0 dq0Var, wp0 wp0Var, ci0 ci0Var) throws kq0 {
        switch (this.f14293a) {
            case 0:
                try {
                    is isVar = (is) ci0Var.f10135b;
                    isVar.U2(wp0Var.Z);
                    isVar.l2(wp0Var.U, wp0Var.f18112v.toString(), ((hq0) dq0Var.f10543a.f15651b).f11944d, new vb.b(this.f14294b), new mi0(ci0Var), (fr) ci0Var.f10136c);
                    return;
                } catch (RemoteException e2) {
                    ya.a0.n("Remote exception loading an app open RTB ad", e2);
                    throw new kq0(e2);
                }
            case 1:
                try {
                    is isVar2 = (is) ci0Var.f10135b;
                    isVar2.U2(wp0Var.Z);
                    isVar2.K0(wp0Var.U, wp0Var.f18112v.toString(), ((hq0) dq0Var.f10543a.f15651b).f11944d, new vb.b(this.f14294b), new zi0(this, ci0Var), (fr) ci0Var.f10136c);
                    return;
                } catch (RemoteException e10) {
                    ya.a0.n("Remote exception loading a interstitial RTB ad", e10);
                    throw new kq0(e10);
                }
            default:
                try {
                    Object obj = ci0Var.f10135b;
                    IInterface iInterface = ci0Var.f10136c;
                    is isVar3 = (is) obj;
                    String str = wp0Var.Z;
                    JSONObject jSONObject = wp0Var.f18112v;
                    isVar3.U2(str);
                    hq0 hq0Var = (hq0) dq0Var.f10543a.f15651b;
                    int i4 = hq0Var.f11954p.f15910b;
                    Context context = this.f14294b;
                    if (i4 == 3) {
                        isVar3.q3(wp0Var.U, jSONObject.toString(), hq0Var.f11944d, new vb.b(context), new tj0(this, ci0Var), (fr) iInterface);
                    } else {
                        isVar3.B0(wp0Var.U, jSONObject.toString(), hq0Var.f11944d, new vb.b(context), new tj0(this, ci0Var), (fr) iInterface);
                    }
                    return;
                } catch (RemoteException e11) {
                    ya.a0.n("Remote exception loading a rewarded RTB ad", e11);
                    return;
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.fi0
    public final Object b(dq0 dq0Var, wp0 wp0Var, ci0 ci0Var) {
        switch (this.f14293a) {
            case 0:
                aw awVar = new aw(wp0Var, (is) ci0Var.f10135b, pa.b.APP_OPEN_AD);
                pq0 pq0Var = new pq0(dq0Var, wp0Var, ci0Var.f10134a);
                l90 l90Var = new l90(11, awVar, (Object) null);
                s9 s9Var = new s9(wp0Var.f18073a0, 1);
                n10 n10Var = (n10) this.f14295c;
                k10 k10Var = n10Var.f14105c;
                n10 n10Var2 = n10Var.f14106d;
                l10 l10Var = new l10(k10Var, n10Var2, pq0Var, l90Var, s9Var);
                es1 es1Var = l10Var.Q;
                awVar.f9454e = (o60) es1Var.a();
                ((vi0) ci0Var.f10136c).i4(new ak0((e60) l10Var.U.a(), (s80) l10Var.W.a(), (o60) es1Var.a(), (t60) l10Var.T.a(), (v60) l10Var.X.a(), (v70) n10Var2.R.a(), (c70) l10Var.Y.a(), (z80) l10Var.Z.a(), (s70) l10Var.f13323a0.a(), (m60) l10Var.f13325c0.a()));
                return l10Var.Z();
            case 1:
                aw awVar2 = new aw(wp0Var, (is) ci0Var.f10135b, pa.b.INTERSTITIAL);
                pq0 pq0Var2 = new pq0(dq0Var, wp0Var, ci0Var.f10134a);
                l90 l90Var2 = new l90(11, awVar2, (Object) null);
                t10 t10Var = (t10) this.f14295c;
                k10 k10Var2 = t10Var.f16640b;
                t10 t10Var2 = t10Var.f16641c;
                s10 s10Var = new s10(k10Var2, t10Var2, pq0Var2, l90Var2);
                es1 es1Var2 = s10Var.P;
                awVar2.f9454e = (o60) es1Var2.a();
                ((vi0) ci0Var.f10136c).i4(new ak0((e60) s10Var.T.a(), (s80) s10Var.W.a(), (o60) es1Var2.a(), (t60) s10Var.S.a(), (v60) s10Var.X.a(), (v70) t10Var2.R.a(), (c70) s10Var.Z.a(), (z80) s10Var.f15834a0.a(), (s70) s10Var.f15835b0.a(), (m60) s10Var.f15837d0.a()));
                return s10Var.Z();
            default:
                aw awVar3 = new aw(wp0Var, (is) ci0Var.f10135b, pa.b.REWARDED);
                pq0 pq0Var3 = new pq0(dq0Var, wp0Var, ci0Var.f10134a);
                qc0 qc0Var = new qc0(awVar3, null, 0);
                w10 w10Var = (w10) this.f14295c;
                k10 k10Var3 = w10Var.f17822c;
                w10 w10Var2 = w10Var.f17823d;
                v10 v10Var = new v10(k10Var3, w10Var2, pq0Var3, qc0Var);
                es1 es1Var3 = v10Var.P;
                awVar3.f9454e = (o60) es1Var3.a();
                ((vi0) ci0Var.f10136c).i4(new zj0((e60) v10Var.T.a(), (s80) v10Var.V.a(), (o60) es1Var3.a(), (t60) v10Var.S.a(), (v60) v10Var.W.a(), (m60) v10Var.f17423c0.a(), (v70) w10Var2.V.a(), (z80) v10Var.Z.a(), (c70) v10Var.Y.a(), (w80) v10Var.f17425e0.a(), (s70) v10Var.f17421a0.a()));
                return v10Var.Z();
        }
    }
}
