package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* renamed from: com.google.android.gms.internal.mlkit_vision_internal_vkp.q2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4692q2 implements K2 {

    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC4768x2 f35715b = new C4670o2();

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4768x2 f35716a;

    public C4692q2() {
        V1 v1A = V1.a();
        int i10 = G2.f35591d;
        C4681p2 c4681p2 = new C4681p2(v1A, f35715b);
        byte[] bArr = AbstractC4593h2.f35692b;
        this.f35716a = c4681p2;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.K2
    public final J2 zza(Class cls) {
        int i10 = L2.f35610b;
        if (!AbstractC4516a2.class.isAssignableFrom(cls)) {
            int i11 = G2.f35591d;
        }
        InterfaceC4757w2 interfaceC4757w2Zzb = this.f35716a.zzb(cls);
        if (interfaceC4757w2Zzb.zzb()) {
            int i12 = G2.f35591d;
            return D2.c(L2.s(), Q1.a(), interfaceC4757w2Zzb.zza());
        }
        int i13 = G2.f35591d;
        return C2.y(cls, interfaceC4757w2Zzb, F2.a(), AbstractC4648m2.a(), L2.s(), interfaceC4757w2Zzb.zzc() + (-1) != 1 ? Q1.a() : null, AbstractC4746v2.a());
    }
}
