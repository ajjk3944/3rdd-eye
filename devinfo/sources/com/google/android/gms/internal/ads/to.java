package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class to implements xa.a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f16891a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f16892b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ va.a f16893c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ HashMap f16894d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Map f16895e;

    public to(uo uoVar, boolean z3, va.a aVar, HashMap map, Map map2) {
        this.f16892b = z3;
        this.f16893c = aVar;
        this.f16894d = map;
        this.f16895e = map2;
        Objects.requireNonNull(uoVar);
        this.f16891a = false;
    }

    @Override // xa.a
    public final void S(boolean z3) {
        if (this.f16891a) {
            return;
        }
        va.a aVar = this.f16893c;
        if (z3 && this.f16892b) {
            ((t80) aVar).x();
        }
        this.f16891a = true;
        String str = (String) this.f16895e.get("event_id");
        Boolean boolValueOf = Boolean.valueOf(z3);
        HashMap map = this.f16894d;
        map.put(str, boolValueOf);
        ((vp) aVar).a("openIntentAsync", map);
    }

    @Override // xa.a
    public final void L1(int i4) {
    }
}
