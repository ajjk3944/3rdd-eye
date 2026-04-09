package com.google.android.gms.internal.mlkit_vision_internal_vkp;

import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.mlkit_vision_internal_vkp.a3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4517a3 extends AbstractC4528b3 {
    C4517a3(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4528b3
    public final double a(Object obj, long j10) {
        return Double.longBitsToDouble(this.f35672a.getLong(obj, j10));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4528b3
    public final float b(Object obj, long j10) {
        return Float.intBitsToFloat(this.f35672a.getInt(obj, j10));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4528b3
    public final void c(Object obj, long j10, boolean z10) {
        if (AbstractC4539c3.f35681h) {
            AbstractC4539c3.d(obj, j10, z10 ? (byte) 1 : (byte) 0);
        } else {
            AbstractC4539c3.e(obj, j10, z10 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4528b3
    public final void d(Object obj, long j10, byte b10) {
        if (AbstractC4539c3.f35681h) {
            AbstractC4539c3.d(obj, j10, b10);
        } else {
            AbstractC4539c3.e(obj, j10, b10);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4528b3
    public final void e(Object obj, long j10, double d10) {
        this.f35672a.putLong(obj, j10, Double.doubleToLongBits(d10));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4528b3
    public final void f(Object obj, long j10, float f10) {
        this.f35672a.putInt(obj, j10, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4528b3
    public final boolean g(Object obj, long j10) {
        return AbstractC4539c3.f35681h ? AbstractC4539c3.y(obj, j10) : AbstractC4539c3.z(obj, j10);
    }
}
