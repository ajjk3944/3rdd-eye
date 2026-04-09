package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class R4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f36194a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f36195b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ Object f36196c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ long f36197d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ C4945r4 f36198e;

    R4(C4945r4 c4945r4, String str, String str2, Object obj, long j10) {
        this.f36194a = str;
        this.f36195b = str2;
        this.f36196c = obj;
        this.f36197d = j10;
        this.f36198e = c4945r4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f36198e.m0(this.f36194a, this.f36195b, this.f36196c, this.f36197d);
    }
}
