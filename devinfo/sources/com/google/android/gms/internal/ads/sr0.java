package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class sr0 {

    /* renamed from: d, reason: collision with root package name */
    public static final s81 f16524d = s81.f15906b;

    /* renamed from: a, reason: collision with root package name */
    public final w81 f16525a;

    /* renamed from: b, reason: collision with root package name */
    public final ScheduledExecutorService f16526b;

    /* renamed from: c, reason: collision with root package name */
    public final rr0 f16527c;

    public sr0(w81 w81Var, ScheduledExecutorService scheduledExecutorService, rr0 rr0Var) {
        this.f16525a = w81Var;
        this.f16526b = scheduledExecutorService;
        this.f16527c = rr0Var;
    }

    public final ai a(Object obj, vd.b bVar) {
        return new ai(this, obj, null, bVar, Collections.singletonList(bVar), bVar);
    }
}
