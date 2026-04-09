package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* renamed from: com.google.android.gms.internal.mlkit_vision_internal_vkp.v3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4747v3 extends Y1 implements A2 {
    private static final C4747v3 zzd;
    private int zze;
    private int zzf;
    private byte zzg = 2;

    static {
        C4747v3 c4747v3 = new C4747v3();
        zzd = c4747v3;
        AbstractC4516a2.p(C4747v3.class, c4747v3);
    }

    private C4747v3() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzg);
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzd, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zze", "zzf", C4736u3.f35732a});
        }
        if (i11 == 3) {
            return new C4747v3();
        }
        AbstractC4714s3 abstractC4714s3 = null;
        if (i11 == 4) {
            return new C4725t3(abstractC4714s3);
        }
        if (i11 == 5) {
            return zzd;
        }
        this.zzg = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
