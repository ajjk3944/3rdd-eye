package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class K3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f35959a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f35960b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f35961c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ long f35962d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ A3 f35963e;

    K3(A3 a32, String str, String str2, String str3, long j10) {
        this.f35959a = str;
        this.f35960b = str2;
        this.f35961c = str3;
        this.f35962d = j10;
        this.f35963e = a32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.f35959a;
        if (str == null) {
            this.f35963e.f35772a.J(this.f35960b, null);
        } else {
            this.f35963e.f35772a.J(this.f35960b, new C4970u5(this.f35961c, str, this.f35962d));
        }
    }
}
