package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class kn0 implements qn0 {

    /* renamed from: k, reason: collision with root package name */
    public static final tm0 f13207k = new tm0(new JSONArray().toString(), "", new Bundle());

    /* renamed from: a, reason: collision with root package name */
    public final w81 f13208a;

    /* renamed from: b, reason: collision with root package name */
    public final ScheduledExecutorService f13209b;

    /* renamed from: c, reason: collision with root package name */
    public final kk0 f13210c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f13211d;

    /* renamed from: e, reason: collision with root package name */
    public final hq0 f13212e;

    /* renamed from: f, reason: collision with root package name */
    public final ik0 f13213f;
    public final ed0 g;

    /* renamed from: h, reason: collision with root package name */
    public final se0 f13214h;

    /* renamed from: i, reason: collision with root package name */
    public final int f13215i;
    public final String j;

    public kn0(w81 w81Var, ScheduledExecutorService scheduledExecutorService, String str, kk0 kk0Var, Context context, hq0 hq0Var, ik0 ik0Var, ed0 ed0Var, se0 se0Var, int i4) {
        this.f13208a = w81Var;
        this.f13209b = scheduledExecutorService;
        this.j = str;
        this.f13210c = kk0Var;
        this.f13211d = context;
        this.f13212e = hq0Var;
        this.f13213f = ik0Var;
        this.g = ed0Var;
        this.f13214h = se0Var;
        this.f13215i = i4;
    }

    @Override // com.google.android.gms.internal.ads.qn0
    public final int a() {
        return 32;
    }

    @Override // com.google.android.gms.internal.ads.qn0
    public final vd.b b() {
        int i4 = this.f13215i;
        tm0 tm0Var = f13207k;
        if (i4 == 2) {
            return yo0.e(tm0Var);
        }
        hq0 hq0Var = this.f13212e;
        if (hq0Var.f11957s) {
            if (!Arrays.asList(((String) va.s.f36163e.f36166c.a(sk.f16070c2)).split(",")).contains(u6.t.v(u6.t.x(hq0Var.f11944d)))) {
                return yo0.e(tm0Var);
            }
        }
        return yo0.B(new kh0(4, this), this.f13208a);
    }

    public final void c(ArrayList arrayList, Map map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            nk0 nk0Var = (nk0) ((Map.Entry) it.next()).getValue();
            String str = nk0Var.f14310a;
            Bundle bundle = this.f13212e.f11944d.f36198m;
            arrayList.add(d(str, Collections.singletonList(nk0Var.f14314e), bundle != null ? bundle.getBundle(str) : null, nk0Var.f14311b, nk0Var.f14312c));
        }
    }

    public final n81 d(String str, List list, Bundle bundle, boolean z3, boolean z10) {
        in0 in0Var = new in0(this, str, list, bundle, z3, z10);
        w81 w81Var = this.f13208a;
        n81 n81VarS = n81.s(yo0.B(in0Var, w81Var));
        pk pkVar = sk.W1;
        va.s sVar = va.s.f36163e;
        if (!((Boolean) sVar.f36166c.a(pkVar)).booleanValue()) {
            n81VarS = (n81) yo0.E(n81VarS, ((Long) sVar.f36166c.a(sk.P1)).longValue(), TimeUnit.MILLISECONDS, this.f13209b);
        }
        return yo0.C(n81VarS, Throwable.class, new ko(str, 3), w81Var);
    }
}
