package com.google.android.gms.internal.mlkit_vision_internal_vkp;

import sun.misc.Unsafe;

/* loaded from: classes.dex */
final class Z2 extends AbstractC4528b3 {
    Z2(Unsafe unsafe) {
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

    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.mlkit_vision_internal_vkp.c3.n(java.lang.Object, long, boolean):void */
    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.mlkit_vision_internal_vkp.c3.o(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 'z' boolean)' in method call: com.google.android.gms.internal.mlkit_vision_internal_vkp.c3.n(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 'z10' boolean)' in method call: com.google.android.gms.internal.mlkit_vision_internal_vkp.c3.o(java.lang.Object, long, boolean):void */
    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4528b3
    public final void c(Object obj, long j10, boolean z10) {
        if (AbstractC4539c3.f35681h) {
            AbstractC4539c3.n(obj, j10, z10);
        } else {
            AbstractC4539c3.o(obj, j10, z10);
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
