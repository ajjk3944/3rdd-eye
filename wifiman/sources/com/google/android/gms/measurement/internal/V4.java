package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
final class V4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f36235a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f36236b = null;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f36237c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ String f36238d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ C4945r4 f36239e;

    V4(C4945r4 c4945r4, AtomicReference atomicReference, String str, String str2, String str3) {
        this.f36235a = atomicReference;
        this.f36237c = str2;
        this.f36238d = str3;
        this.f36239e = c4945r4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f36239e.f36331a.I().U(this.f36235a, null, this.f36237c, this.f36238d);
    }
}
