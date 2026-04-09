package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.f4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4347f4 {

    /* renamed from: a, reason: collision with root package name */
    private final zzjr f35221a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f35222b;

    public final V3 a() {
        this.f35221a.E();
        return new C4365h4(this.f35222b);
    }

    public final zzjr b() {
        return this.f35221a;
    }

    private C4347f4(int i10) {
        byte[] bArr = new byte[i10];
        this.f35222b = bArr;
        this.f35221a = zzjr.D(bArr);
    }
}
