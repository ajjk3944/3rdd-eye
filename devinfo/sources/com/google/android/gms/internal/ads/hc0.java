package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class hc0 {

    /* renamed from: b, reason: collision with root package name */
    public final km.n f11828b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f11829c;

    /* renamed from: d, reason: collision with root package name */
    public final qd0 f11830d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f11831e;

    /* renamed from: f, reason: collision with root package name */
    public final oe f11832f;
    public final za.a g;

    /* renamed from: i, reason: collision with root package name */
    public final lh0 f11834i;
    public final ct0 j;

    /* renamed from: k, reason: collision with root package name */
    public final qh0 f11835k;

    /* renamed from: l, reason: collision with root package name */
    public final jq0 f11836l;

    /* renamed from: m, reason: collision with root package name */
    public x71 f11837m;

    /* renamed from: a, reason: collision with root package name */
    public final cc0 f11827a = new cc0();

    /* renamed from: h, reason: collision with root package name */
    public final lo f11833h = new lo();

    public hc0(gc0 gc0Var) {
        this.f11829c = gc0Var.f11486b;
        this.f11831e = gc0Var.f11489e;
        this.f11832f = gc0Var.f11490f;
        this.g = gc0Var.g;
        this.f11828b = gc0Var.f11485a;
        this.f11834i = gc0Var.f11488d;
        this.j = gc0Var.f11491h;
        this.f11830d = gc0Var.f11487c;
        this.f11835k = gc0Var.f11492i;
        this.f11836l = gc0Var.j;
    }

    public final synchronized vd.b a(String str, JSONObject jSONObject) {
        x71 x71Var = this.f11837m;
        if (x71Var == null) {
            return s81.f15906b;
        }
        return yo0.F(x71Var, new s40(this, str, jSONObject, 2), this.f11831e);
    }

    public final synchronized void b(String str, oo ooVar) {
        x71 x71Var = this.f11837m;
        if (x71Var == null) {
            return;
        }
        rt rtVar = new rt(this, str, ooVar, 14);
        x71Var.a(new q81(0, x71Var, rtVar), this.f11831e);
    }

    public final synchronized void c(String str, oo ooVar) {
        x71 x71Var = this.f11837m;
        if (x71Var == null) {
            return;
        }
        l90 l90Var = new l90(this, str, ooVar);
        x71Var.a(new q81(0, x71Var, l90Var), this.f11831e);
    }

    public final synchronized void d(Map map) {
        x71 x71Var = this.f11837m;
        if (x71Var == null) {
            return;
        }
        ix0 ix0Var = new ix0(this, map);
        x71Var.a(new q81(0, x71Var, ix0Var), this.f11831e);
    }
}
