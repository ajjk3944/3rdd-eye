package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* renamed from: com.google.android.gms.internal.mlkit_vision_internal_vkp.v1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4745v1 extends A1 {

    /* renamed from: d, reason: collision with root package name */
    private final int f35733d;

    /* renamed from: e, reason: collision with root package name */
    private final int f35734e;

    C4745v1(byte[] bArr, int i10, int i11) {
        super(bArr);
        B1.y(i10, i10 + i11, bArr.length);
        this.f35733d = i10;
        this.f35734e = i11;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.A1
    protected final int T() {
        return this.f35733d;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.A1, com.google.android.gms.internal.mlkit_vision_internal_vkp.B1
    public final byte g(int i10) {
        B1.S(i10, this.f35734e);
        return this.f35554c[this.f35733d + i10];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.A1, com.google.android.gms.internal.mlkit_vision_internal_vkp.B1
    final byte j(int i10) {
        return this.f35554c[this.f35733d + i10];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.A1, com.google.android.gms.internal.mlkit_vision_internal_vkp.B1
    public final int m() {
        return this.f35734e;
    }
}
