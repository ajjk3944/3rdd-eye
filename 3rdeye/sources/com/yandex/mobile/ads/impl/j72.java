package com.yandex.mobile.ads.impl;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
final class j72 implements b32 {

    /* renamed from: b, reason: collision with root package name */
    private final f72 f29010b;

    /* renamed from: c, reason: collision with root package name */
    private final long[] f29011c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<String, i72> f29012d;

    /* renamed from: e, reason: collision with root package name */
    private final Map<String, g72> f29013e;

    /* renamed from: f, reason: collision with root package name */
    private final Map<String, String> f29014f;

    public j72(f72 f72Var, HashMap map, HashMap map2, HashMap map3) {
        this.f29010b = f72Var;
        this.f29013e = map2;
        this.f29014f = map3;
        this.f29012d = Collections.unmodifiableMap(map);
        this.f29011c = f72Var.b();
    }

    @Override // com.yandex.mobile.ads.impl.b32
    public final long a(int i) {
        return this.f29011c[i];
    }

    @Override // com.yandex.mobile.ads.impl.b32
    public final List<av> b(long j4) {
        return this.f29010b.a(j4, this.f29012d, this.f29013e, this.f29014f);
    }

    @Override // com.yandex.mobile.ads.impl.b32
    public final int a() {
        return this.f29011c.length;
    }

    @Override // com.yandex.mobile.ads.impl.b32
    public final int a(long j4) {
        int iA = s82.a(this.f29011c, j4, false);
        if (iA < this.f29011c.length) {
            return iA;
        }
        return -1;
    }
}
