package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
final class Y4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f36302a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f36303b = null;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f36304c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ String f36305d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ boolean f36306e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ C4945r4 f36307f;

    Y4(C4945r4 c4945r4, AtomicReference atomicReference, String str, String str2, String str3, boolean z10) {
        this.f36302a = atomicReference;
        this.f36304c = str2;
        this.f36305d = str3;
        this.f36306e = z10;
        this.f36307f = c4945r4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f36307f.f36331a.I().V(this.f36302a, null, this.f36304c, this.f36305d, this.f36306e);
    }
}
