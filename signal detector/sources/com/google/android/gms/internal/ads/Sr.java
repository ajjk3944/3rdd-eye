package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class Sr implements Ls {

    /* renamed from: a, reason: collision with root package name */
    public final q2.d1 f11251a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11252b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f11253c;

    /* renamed from: d, reason: collision with root package name */
    public final String f11254d;

    /* renamed from: e, reason: collision with root package name */
    public final float f11255e;

    /* renamed from: f, reason: collision with root package name */
    public final int f11256f;

    /* renamed from: g, reason: collision with root package name */
    public final int f11257g;

    /* renamed from: h, reason: collision with root package name */
    public final String f11258h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f11259j;

    /* renamed from: k, reason: collision with root package name */
    public final J.c f11260k;

    /* renamed from: l, reason: collision with root package name */
    public final Rr f11261l;

    public Sr(q2.d1 d1Var, String str, boolean z6, String str2, float f2, int i, int i3, String str3, int i6, boolean z7, J.c cVar, Rr rr) {
        M2.u.f(d1Var, "the adSize must not be null");
        this.f11251a = d1Var;
        this.f11252b = str;
        this.f11253c = z6;
        this.f11254d = str2;
        this.f11255e = f2;
        this.f11256f = i;
        this.f11257g = i3;
        this.f11258h = str3;
        this.i = i6;
        this.f11259j = z7;
        this.f11260k = cVar;
        this.f11261l = rr;
    }

    public final void a(Bundle bundle) {
        q2.d1 d1Var = this.f11251a;
        int i = d1Var.f23192e;
        boolean z6 = d1Var.f23187C;
        AbstractC0582Jp.v(bundle, "smart_w", "full", i == -1);
        int i3 = d1Var.f23189b;
        AbstractC0582Jp.v(bundle, "smart_h", "auto", i3 == -2);
        AbstractC0582Jp.N(bundle, "ene", true, d1Var.f23196j);
        AbstractC0582Jp.v(bundle, "rafmt", "102", d1Var.f23199m);
        AbstractC0582Jp.v(bundle, "rafmt", "103", d1Var.f23200n);
        AbstractC0582Jp.v(bundle, "rafmt", "105", z6);
        AbstractC0582Jp.N(bundle, "inline_adaptive_slot", true, this.f11259j);
        AbstractC0582Jp.N(bundle, "interscroller_slot", true, z6);
        AbstractC0582Jp.X("format", bundle, this.f11252b);
        AbstractC0582Jp.v(bundle, "fluid", "height", this.f11253c);
        AbstractC0582Jp.v(bundle, "sz", this.f11254d, !TextUtils.isEmpty(r2));
        bundle.putFloat("u_sd", this.f11255e);
        bundle.putInt("sw", this.f11256f);
        bundle.putInt("sh", this.f11257g);
        String str = this.f11258h;
        AbstractC0582Jp.v(bundle, "sc", str, true ^ TextUtils.isEmpty(str));
        int i6 = this.i;
        if (i6 != -1) {
            bundle.putInt("u_mso", i6);
        }
        J.c cVar = this.f11260k;
        if (cVar != null) {
            bundle.putInt("sam_t", cVar.f2008b);
            bundle.putInt("sam_b", cVar.f2010d);
            bundle.putInt("sam_l", cVar.f2007a);
            bundle.putInt("sam_r", cVar.f2009c);
        }
        Rr rr = this.f11261l;
        if (rr != null) {
            bundle.putInt("rc_tl", rr.f11054a);
            bundle.putInt("rc_tr", rr.f11055b);
            bundle.putInt("rc_bl", rr.f11056c);
            bundle.putInt("rc_br", rr.f11057d);
        }
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        q2.d1[] d1VarArr = d1Var.f23194g;
        if (d1VarArr == null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("height", i3);
            bundle2.putInt("width", i);
            bundle2.putBoolean("is_fluid_height", d1Var.i);
            arrayList.add(bundle2);
        } else {
            for (q2.d1 d1Var2 : d1VarArr) {
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean("is_fluid_height", d1Var2.i);
                bundle3.putInt("height", d1Var2.f23189b);
                bundle3.putInt("width", d1Var2.f23192e);
                arrayList.add(bundle3);
            }
        }
        bundle.putParcelableArrayList("valid_ad_sizes", arrayList);
    }

    @Override // com.google.android.gms.internal.ads.Ls
    public final /* synthetic */ void b(Object obj) {
        a(((C0797Wj) obj).f12308a);
    }

    @Override // com.google.android.gms.internal.ads.Ls
    public final /* synthetic */ void d(Object obj) {
        a(((C0797Wj) obj).f12309b);
    }
}
