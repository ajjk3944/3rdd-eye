package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class k90 implements q40 {

    /* renamed from: a, reason: collision with root package name */
    public final Map f13083a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f13084b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f13085c;

    /* renamed from: d, reason: collision with root package name */
    public final es1 f13086d;

    /* renamed from: e, reason: collision with root package name */
    public final ka0 f13087e;

    public k90(Map map, Map map2, Map map3, es1 es1Var, ka0 ka0Var) {
        this.f13083a = map;
        this.f13084b = map2;
        this.f13085c = map3;
        this.f13086d = es1Var;
        this.f13087e = ka0Var;
    }

    @Override // com.google.android.gms.internal.ads.q40
    public final zh0 a(int i4, String str) {
        zh0 zh0VarA;
        zh0 zh0Var = (zh0) this.f13083a.get(str);
        if (zh0Var != null) {
            return zh0Var;
        }
        if (i4 != 1) {
            if (i4 != 4) {
                return null;
            }
            cj0 cj0Var = (cj0) this.f13085c.get(str);
            if (cj0Var != null) {
                return new ai0(cj0Var, o5.g);
            }
            zh0VarA = (zh0) this.f13084b.get(str);
            if (zh0VarA == null) {
                return null;
            }
        } else if (this.f13087e.f13094d == null || (zh0VarA = ((q40) this.f13086d.a()).a(i4, str)) == null) {
            return null;
        }
        return new ai0(zh0VarA, o5.f14545f);
    }
}
