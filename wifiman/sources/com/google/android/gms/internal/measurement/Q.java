package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class Q implements P {

    /* renamed from: a, reason: collision with root package name */
    private final Z2 f35095a;

    /* renamed from: b, reason: collision with root package name */
    private final String f35096b;

    public Q(Z2 z22, String str) {
        this.f35095a = z22;
        this.f35096b = str;
    }

    @Override // com.google.android.gms.internal.measurement.P
    public final Z2 a(InterfaceC4449s interfaceC4449s) {
        Z2 z2D = this.f35095a.d();
        z2D.e(this.f35096b, interfaceC4449s);
        return z2D;
    }
}
