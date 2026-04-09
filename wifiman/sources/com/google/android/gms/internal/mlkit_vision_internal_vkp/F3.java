package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* loaded from: classes.dex */
public final class F3 extends AbstractC4516a2 implements A2 {
    private static final F3 zzb;
    private int zzd;
    private T zzf;
    private float zzg;
    private byte zzh = 2;
    private int zze = 2;

    static {
        F3 f32 = new F3();
        zzb = f32;
        AbstractC4516a2.p(F3.class, f32);
    }

    private F3() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzh);
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0001\u0003\u0000\u0001\u0001\u0007\u0003\u0000\u0000\u0001\u0001᠌\u0000\u0002ᐉ\u0001\u0007ခ\u0002", new Object[]{"zzd", "zze", D3.f35582a, "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new F3();
        }
        AbstractC4758w3 abstractC4758w3 = null;
        if (i11 == 4) {
            return new E3(abstractC4758w3);
        }
        if (i11 == 5) {
            return zzb;
        }
        this.zzh = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
