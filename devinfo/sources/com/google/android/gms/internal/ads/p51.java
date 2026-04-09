package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class p51 extends f41 implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final transient Map f14901d;

    /* renamed from: e, reason: collision with root package name */
    public transient int f14902e;

    /* renamed from: f, reason: collision with root package name */
    public final transient q31 f14903f;

    public p51(Map map, q31 q31Var) {
        mq0.m(map.isEmpty());
        this.f14901d = map;
        this.f14903f = q31Var;
    }

    @Override // com.google.android.gms.internal.ads.f41
    public final Collection a() {
        return new e41(0, this);
    }

    @Override // com.google.android.gms.internal.ads.f41
    public final Map b() {
        Map map = this.f14901d;
        return map instanceof NavigableMap ? new x31(this, (NavigableMap) map) : map instanceof SortedMap ? new a41(this, (SortedMap) map) : new v31(this, map);
    }

    public final void e() {
        Map map = this.f14901d;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        map.clear();
        this.f14902e = 0;
    }
}
