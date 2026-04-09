package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* loaded from: classes.dex */
final class V1 implements InterfaceC4768x2 {

    /* renamed from: a, reason: collision with root package name */
    private static final V1 f35647a = new V1();

    private V1() {
    }

    public static V1 a() {
        return f35647a;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.InterfaceC4768x2
    public final InterfaceC4757w2 zzb(Class cls) {
        if (!AbstractC4516a2.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (InterfaceC4757w2) AbstractC4516a2.e(cls.asSubclass(AbstractC4516a2.class)).v(3, null, null);
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.InterfaceC4768x2
    public final boolean zzc(Class cls) {
        return AbstractC4516a2.class.isAssignableFrom(cls);
    }
}
