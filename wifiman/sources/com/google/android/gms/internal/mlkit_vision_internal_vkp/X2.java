package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* loaded from: classes.dex */
final class X2 extends V2 {
    X2() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.V2
    final /* bridge */ /* synthetic */ Object a(Object obj) {
        AbstractC4516a2 abstractC4516a2 = (AbstractC4516a2) obj;
        W2 w22 = abstractC4516a2.zzc;
        if (w22 != W2.c()) {
            return w22;
        }
        W2 w2F = W2.f();
        abstractC4516a2.zzc = w2F;
        return w2F;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.V2
    final /* bridge */ /* synthetic */ void b(Object obj, int i10, B1 b12) {
        ((W2) obj).j((i10 << 3) | 2, b12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.V2
    final /* bridge */ /* synthetic */ void c(Object obj, int i10, long j10) {
        ((W2) obj).j(i10 << 3, Long.valueOf(j10));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.V2
    final void d(Object obj) {
        ((AbstractC4516a2) obj).zzc.h();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.V2
    final /* synthetic */ void e(Object obj, Object obj2) {
        ((AbstractC4516a2) obj).zzc = (W2) obj2;
    }
}
