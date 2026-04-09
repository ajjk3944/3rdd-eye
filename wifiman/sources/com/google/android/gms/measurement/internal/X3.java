package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class X3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ L f36287a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f36288b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ A3 f36289c;

    X3(A3 a32, L l10, String str) {
        this.f36287a = l10;
        this.f36288b = str;
        this.f36289c = a32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f36289c.f35772a.K0();
        this.f36289c.f35772a.v(this.f36287a, this.f36288b);
    }
}
