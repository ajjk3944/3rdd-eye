package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class cm0 implements pn0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f10167a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f10168b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10169c;

    /* renamed from: d, reason: collision with root package name */
    public final String f10170d;

    /* renamed from: e, reason: collision with root package name */
    public final ya.c0 f10171e;

    /* renamed from: f, reason: collision with root package name */
    public final String f10172f;
    public final e50 g;

    public cm0(Context context, Bundle bundle, String str, String str2, ya.c0 c0Var, String str3, e50 e50Var) {
        this.f10167a = context;
        this.f10168b = bundle;
        this.f10169c = str;
        this.f10170d = str2;
        this.f10171e = c0Var;
        this.f10172f = str3;
        this.g = e50Var;
    }

    public final void a(Bundle bundle) {
        if (((Boolean) va.s.f36163e.f36166c.a(sk.f16367v6)).booleanValue()) {
            try {
                ya.f0 f0Var = ua.j.C.f35261c;
                bundle.putString("_app_id", ya.f0.O(this.f10167a));
            } catch (RemoteException | RuntimeException e2) {
                ua.j.C.f35265h.f("AppStatsSignal_AppId", e2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final void c(Object obj) {
        Bundle bundle = ((t50) obj).f16705a;
        bundle.putBundle("quality_signals", this.f10168b);
        bundle.putString("seq_num", this.f10169c);
        if (!this.f10171e.E()) {
            bundle.putString("session_id", this.f10170d);
        }
        bundle.putBoolean("client_purpose_one", !r0.E());
        a(bundle);
        String str = this.f10172f;
        if (str != null) {
            Bundle bundle2 = new Bundle();
            e50 e50Var = this.g;
            Long l10 = (Long) e50Var.f10708d.get(str);
            bundle2.putLong("dload", l10 == null ? -1L : l10.longValue());
            Integer num = (Integer) e50Var.f10706b.get(str);
            bundle2.putInt("pcc", num == null ? 0 : num.intValue());
            bundle.putBundle("ad_unit_quality_signals", bundle2);
        }
        if (((Boolean) va.s.f36163e.f36166c.a(sk.Za)).booleanValue()) {
            ua.j jVar = ua.j.C;
            if (jVar.f35265h.f19202l.get() > 0) {
                bundle.putInt("nrwv", jVar.f35265h.f19202l.get());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final /* bridge */ /* synthetic */ void h(Object obj) {
        Bundle bundle = ((t50) obj).f16706b;
        bundle.putBundle("quality_signals", this.f10168b);
        a(bundle);
    }
}
