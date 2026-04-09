package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* renamed from: com.google.android.gms.internal.mlkit_vision_internal_vkp.w0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4755w0 extends AbstractC4516a2 implements A2 {
    private static final C4755w0 zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private InterfaceC4560e2 zzg = AbstractC4516a2.i();

    static {
        C4755w0 c4755w0 = new C4755w0();
        zzb = c4755w0;
        AbstractC4516a2.p(C4755w0.class, c4755w0);
    }

    private C4755w0() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0001\u0002င\u0000\u0003ࠞ", new Object[]{"zzd", "zzf", "zze", "zzg", C4766x0.f35736a});
        }
        if (i11 == 3) {
            return new C4755w0();
        }
        W w10 = null;
        if (i11 == 4) {
            return new C4744v0(w10);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
