package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class p40 implements q40 {

    /* renamed from: a, reason: collision with root package name */
    public final Map f14894a;

    public p40(Map map) {
        this.f14894a = map;
    }

    @Override // com.google.android.gms.internal.ads.q40
    public final zh0 a(int i4, String str) {
        return (zh0) this.f14894a.get(str);
    }
}
