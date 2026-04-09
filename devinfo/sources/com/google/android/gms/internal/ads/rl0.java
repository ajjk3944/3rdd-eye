package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class rl0 implements pn0 {

    /* renamed from: a, reason: collision with root package name */
    public final va.c3 f15689a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15690b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f15691c;

    /* renamed from: d, reason: collision with root package name */
    public final String f15692d;

    /* renamed from: e, reason: collision with root package name */
    public final float f15693e;

    /* renamed from: f, reason: collision with root package name */
    public final int f15694f;
    public final int g;

    /* renamed from: h, reason: collision with root package name */
    public final String f15695h;

    /* renamed from: i, reason: collision with root package name */
    public final int f15696i;
    public final boolean j;

    /* renamed from: k, reason: collision with root package name */
    public final v3.b f15697k;

    /* renamed from: l, reason: collision with root package name */
    public final pl0 f15698l;

    public rl0(va.c3 c3Var, String str, boolean z3, String str2, float f10, int i4, int i10, String str3, int i11, boolean z10, v3.b bVar, pl0 pl0Var) {
        pb.y.i(c3Var, "the adSize must not be null");
        this.f15689a = c3Var;
        this.f15690b = str;
        this.f15691c = z3;
        this.f15692d = str2;
        this.f15693e = f10;
        this.f15694f = i4;
        this.g = i10;
        this.f15695h = str3;
        this.f15696i = i11;
        this.j = z10;
        this.f15697k = bVar;
        this.f15698l = pl0Var;
    }

    public final void a(Bundle bundle) {
        va.c3 c3Var = this.f15689a;
        int i4 = c3Var.f36042e;
        boolean z3 = c3Var.f36050o;
        mq0.v(bundle, "smart_w", "full", i4 == -1);
        int i10 = c3Var.f36039b;
        mq0.v(bundle, "smart_h", "auto", i10 == -2);
        mq0.M(bundle, "ene", true, c3Var.j);
        mq0.v(bundle, "rafmt", "102", c3Var.f36048m);
        mq0.v(bundle, "rafmt", "103", c3Var.f36049n);
        mq0.v(bundle, "rafmt", "105", z3);
        mq0.M(bundle, "inline_adaptive_slot", true, this.j);
        mq0.M(bundle, "interscroller_slot", true, z3);
        mq0.V("format", this.f15690b, bundle);
        mq0.v(bundle, "fluid", "height", this.f15691c);
        mq0.v(bundle, "sz", this.f15692d, !TextUtils.isEmpty(r2));
        bundle.putFloat("u_sd", this.f15693e);
        bundle.putInt("sw", this.f15694f);
        bundle.putInt("sh", this.g);
        String str = this.f15695h;
        mq0.v(bundle, "sc", str, true ^ TextUtils.isEmpty(str));
        int i11 = this.f15696i;
        if (i11 != -1) {
            bundle.putInt("u_mso", i11);
        }
        v3.b bVar = this.f15697k;
        if (bVar != null) {
            bundle.putInt("sam_t", bVar.f35794b);
            bundle.putInt("sam_b", bVar.f35796d);
            bundle.putInt("sam_l", bVar.f35793a);
            bundle.putInt("sam_r", bVar.f35795c);
        }
        pl0 pl0Var = this.f15698l;
        if (pl0Var != null) {
            bundle.putInt("rc_tl", pl0Var.f15037a);
            bundle.putInt("rc_tr", pl0Var.f15038b);
            bundle.putInt("rc_bl", pl0Var.f15039c);
            bundle.putInt("rc_br", pl0Var.f15040d);
        }
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        va.c3[] c3VarArr = c3Var.g;
        if (c3VarArr == null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("height", i10);
            bundle2.putInt("width", i4);
            bundle2.putBoolean("is_fluid_height", c3Var.f36045i);
            arrayList.add(bundle2);
        } else {
            for (va.c3 c3Var2 : c3VarArr) {
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean("is_fluid_height", c3Var2.f36045i);
                bundle3.putInt("height", c3Var2.f36039b);
                bundle3.putInt("width", c3Var2.f36042e);
                arrayList.add(bundle3);
            }
        }
        bundle.putParcelableArrayList("valid_ad_sizes", arrayList);
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final /* synthetic */ void c(Object obj) {
        a(((t50) obj).f16705a);
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final /* synthetic */ void h(Object obj) {
        a(((t50) obj).f16706b);
    }
}
