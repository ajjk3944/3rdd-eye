package com.google.android.gms.internal.ads;

import f4.InterfaceFutureC2326a;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.gms.internal.ads.dA, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1031dA implements Wz {

    /* renamed from: a, reason: collision with root package name */
    public final Jz f13734a;

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f13735b;

    /* renamed from: c, reason: collision with root package name */
    public final C1948uA f13736c;

    public C1031dA(Jz jz, ExecutorService executorService, C1948uA c1948uA) {
        this.f13734a = jz;
        this.f13735b = executorService;
        this.f13736c = c1948uA;
    }

    @Override // com.google.android.gms.internal.ads.Vz
    public final InterfaceFutureC2326a a() {
        return AbstractC1984ut.e(Boolean.TRUE);
    }

    @Override // com.google.android.gms.internal.ads.Wz
    public final InterfaceFutureC2326a b() {
        TD tdZ = AbstractC1984ut.z(new CallableC0976cA(this, 0), this.f13735b);
        this.f13736c.e(15314, tdZ);
        return tdZ;
    }

    @Override // com.google.android.gms.internal.ads.Vz
    public final TD c() {
        TD tdZ = AbstractC1984ut.z(new CallableC0976cA(this, 1), this.f13735b);
        this.f13736c.e(15302, tdZ);
        return tdZ;
    }

    @Override // com.google.android.gms.internal.ads.Vz
    public final InterfaceFutureC2326a d(Ly ly, byte[] bArr, byte[] bArr2) {
        TD tdZ = AbstractC1984ut.z(new CallableC0647Nm(this, ly, bArr, bArr2, 6), this.f13735b);
        this.f13736c.e(15321, tdZ);
        return tdZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.Vz
    public final InterfaceFutureC2326a e(Ly ly, byte[] bArr) {
        TD tdZ = AbstractC1984ut.z(new CallableC0814Xj(this, ly, bArr, 3), this.f13735b);
        this.f13736c.e(15305, tdZ);
        return tdZ;
    }
}
