package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import j$.util.Objects;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ck0 implements zh0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10144a;

    /* renamed from: b, reason: collision with root package name */
    public final w81 f10145b;

    /* renamed from: c, reason: collision with root package name */
    public final sr0 f10146c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f10147d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f10148e;

    public /* synthetic */ ck0(sr0 sr0Var, w81 w81Var, Object obj, Object obj2, int i4) {
        this.f10144a = i4;
        this.f10146c = sr0Var;
        this.f10145b = w81Var;
        this.f10148e = obj2;
        this.f10147d = obj;
    }

    public static final String c(int i4, String str) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 20 + String.valueOf(i4).length());
        sb2.append("Error from: ");
        sb2.append(str);
        sb2.append(", code: ");
        sb2.append(i4);
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zh0
    public final boolean a(dq0 dq0Var, wp0 wp0Var) {
        aq0 aq0Var;
        switch (this.f10144a) {
            case 0:
                return !wp0Var.f18108t.isEmpty();
            default:
                return (((xk) this.f10147d) == null || (aq0Var = wp0Var.f18106s) == null || aq0Var.f9386a == null) ? false : true;
        }
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [com.google.android.gms.internal.ads.mg, com.google.android.gms.internal.ads.u60] */
    @Override // com.google.android.gms.internal.ads.zh0
    public final vd.b b(dq0 dq0Var, wp0 wp0Var) {
        ci0 ci0VarA;
        switch (this.f10144a) {
            case 0:
                Iterator it = wp0Var.f18108t.iterator();
                while (true) {
                    if (it.hasNext()) {
                        try {
                            ci0VarA = ((bi0) this.f10147d).a((String) it.next(), wp0Var.f18112v);
                        } catch (kq0 unused) {
                        }
                    } else {
                        ci0VarA = null;
                    }
                }
                if (ci0VarA == null) {
                    return yo0.w(new ej0(3, "Unable to instantiate mediation adapter class."));
                }
                gx gxVar = new gx();
                ci0VarA.f10136c.r2(new m8.s(this, ci0VarA, gxVar));
                if (wp0Var.M) {
                    Bundle bundle = ((hq0) dq0Var.f10543a.f15651b).f11944d.f36198m;
                    Bundle bundle2 = bundle.getBundle(AdMobAdapter.class.getName());
                    if (bundle2 == null) {
                        bundle2 = new Bundle();
                        bundle.putBundle(AdMobAdapter.class.getName(), bundle2);
                    }
                    bundle2.putBoolean("render_test_ad_label", true);
                }
                sr0 sr0Var = this.f10146c;
                qr0 qr0Var = qr0.ADAPTER_LOAD_AD_SYN;
                Objects.requireNonNull(sr0Var);
                bk0 bk0Var = new bk0(this, dq0Var, wp0Var, ci0VarA);
                w81 w81Var = this.f10145b;
                ai aiVar = new ai(sr0Var, qr0Var, null, sr0.f16524d, Collections.EMPTY_LIST, ((ex) w81Var).e(new go0(2, bk0Var)));
                ai aiVarA = ((sr0) aiVar.f9335f).a(qr0.ADAPTER_LOAD_AD_ACK, aiVar.t());
                vq vqVar = new vq(1, gxVar);
                ex exVar = fx.g;
                ai aiVar2 = new ai((sr0) aiVarA.f9335f, aiVarA.f9332c, (String) aiVarA.f9330a, (vd.b) aiVarA.f9331b, (List) aiVarA.f9333d, yo0.F((vd.b) aiVarA.f9334e, vqVar, exVar));
                return ((sr0) aiVar2.f9335f).a(qr0.ADAPTER_WRAP_ADAPTER, aiVar2.t()).g(new bk0(this, dq0Var, wp0Var, ci0VarA)).t();
            default:
                gx gxVar2 = new gx();
                ne0 ne0Var = new ne0(8);
                r7 r7Var = new r7(this, gxVar2, dq0Var, wp0Var, ne0Var, 4, false);
                synchronized (ne0Var) {
                    ne0Var.f14280b = r7Var;
                }
                aq0 aq0Var = wp0Var.f18106s;
                wk wkVar = new wk(ne0Var, aq0Var.f9387b, aq0Var.f9386a);
                qr0 qr0Var2 = qr0.CUSTOM_RENDER_SYN;
                sr0 sr0Var2 = this.f10146c;
                Objects.requireNonNull(sr0Var2);
                rt rtVar = new rt(19, this, wkVar);
                w81 w81Var2 = this.f10145b;
                ai aiVar3 = new ai(sr0Var2, qr0Var2, null, sr0.f16524d, Collections.EMPTY_LIST, ((ex) w81Var2).e(new go0(2, rtVar)));
                ai aiVarA2 = ((sr0) aiVar3.f9335f).a(qr0.CUSTOM_RENDER_ACK, aiVar3.t());
                vq vqVar2 = new vq(1, gxVar2);
                ex exVar2 = fx.g;
                return new ai((sr0) aiVarA2.f9335f, aiVarA2.f9332c, (String) aiVarA2.f9330a, (vd.b) aiVarA2.f9331b, (List) aiVarA2.f9333d, yo0.F((vd.b) aiVarA2.f9334e, vqVar2, exVar2)).t();
        }
    }
}
