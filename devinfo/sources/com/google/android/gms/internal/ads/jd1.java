package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class jd1 {

    /* renamed from: b, reason: collision with root package name */
    public static final jd1 f12719b = new jd1();

    /* renamed from: c, reason: collision with root package name */
    public static final id1 f12720c = new id1();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f12721a = new AtomicReference();

    public final id1 a() {
        id1 id1Var = (id1) this.f12721a.get();
        return id1Var == null ? f12720c : id1Var;
    }
}
