package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import q2.C2841s;
import t2.C2909E;
import t2.C2911G;

/* renamed from: com.google.android.gms.internal.ads.ds, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1066ds implements Ls {

    /* renamed from: a, reason: collision with root package name */
    public final Context f13814a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f13815b;

    /* renamed from: c, reason: collision with root package name */
    public final String f13816c;

    /* renamed from: d, reason: collision with root package name */
    public final String f13817d;

    /* renamed from: e, reason: collision with root package name */
    public final C2909E f13818e;

    /* renamed from: f, reason: collision with root package name */
    public final String f13819f;

    /* renamed from: g, reason: collision with root package name */
    public final C0576Jj f13820g;

    public C1066ds(Context context, Bundle bundle, String str, String str2, C2909E c2909e, String str3, C0576Jj c0576Jj) {
        this.f13814a = context;
        this.f13815b = bundle;
        this.f13816c = str;
        this.f13817d = str2;
        this.f13818e = c2909e;
        this.f13819f = str3;
        this.f13820g = c0576Jj;
    }

    public final void a(Bundle bundle) {
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.v6)).booleanValue()) {
            try {
                C2911G c2911g = p2.j.f22785C.f22790c;
                bundle.putString("_app_id", C2911G.O(this.f13814a));
            } catch (RemoteException | RuntimeException e6) {
                p2.j.f22785C.f22795h.f("AppStatsSignal_AppId", e6);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Ls
    public final void b(Object obj) {
        Bundle bundle = ((C0797Wj) obj).f12308a;
        bundle.putBundle("quality_signals", this.f13815b);
        bundle.putString("seq_num", this.f13816c);
        if (!this.f13818e.E()) {
            bundle.putString("session_id", this.f13817d);
        }
        bundle.putBoolean("client_purpose_one", !r0.E());
        a(bundle);
        String str = this.f13819f;
        if (str != null) {
            Bundle bundle2 = new Bundle();
            C0576Jj c0576Jj = this.f13820g;
            Long l2 = (Long) c0576Jj.f9344d.get(str);
            bundle2.putLong("dload", l2 == null ? -1L : l2.longValue());
            Integer num = (Integer) c0576Jj.f9342b.get(str);
            bundle2.putInt("pcc", num == null ? 0 : num.intValue());
            bundle.putBundle("ad_unit_quality_signals", bundle2);
        }
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.Xa)).booleanValue()) {
            p2.j jVar = p2.j.f22785C;
            if (jVar.f22795h.f8978l.get() > 0) {
                bundle.putInt("nrwv", jVar.f22795h.f8978l.get());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Ls
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        Bundle bundle = ((C0797Wj) obj).f12309b;
        bundle.putBundle("quality_signals", this.f13815b);
        a(bundle);
    }
}
