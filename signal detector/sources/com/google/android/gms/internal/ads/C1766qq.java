package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.qq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1766qq {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f16403a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f16404b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0855Zq f16405c;

    public C1766qq(C0855Zq c0855Zq, C1560n c1560n, Executor executor) {
        this.f16405c = c0855Zq;
        this.f16403a = new WeakReference(c1560n);
        this.f16404b = executor;
    }
}
