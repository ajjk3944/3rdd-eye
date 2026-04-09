package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* renamed from: com.google.android.gms.internal.mlkit_vision_internal_vkp.p2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4681p2 implements InterfaceC4768x2 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4768x2[] f35712a;

    C4681p2(InterfaceC4768x2... interfaceC4768x2Arr) {
        this.f35712a = interfaceC4768x2Arr;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.InterfaceC4768x2
    public final InterfaceC4757w2 zzb(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            InterfaceC4768x2 interfaceC4768x2 = this.f35712a[i10];
            if (interfaceC4768x2.zzc(cls)) {
                return interfaceC4768x2.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.InterfaceC4768x2
    public final boolean zzc(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            if (this.f35712a[i10].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
