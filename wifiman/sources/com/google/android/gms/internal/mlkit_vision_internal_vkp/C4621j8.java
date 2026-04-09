package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* renamed from: com.google.android.gms.internal.mlkit_vision_internal_vkp.j8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4621j8 extends AbstractC4516a2 implements A2 {
    private static final C4621j8 zzb;
    private int zzd;
    private C8 zze;
    private C4667o zzf;
    private C4660n3 zzg;
    private C4763w8 zzh;
    private C4687p8 zzi;
    private C4654m8 zzj;
    private C4730t8 zzk;
    private byte zzl = 2;

    static {
        C4621j8 c4621j8 = new C4621j8();
        zzb = c4621j8;
        AbstractC4516a2.p(C4621j8.class, c4621j8);
    }

    private C4621j8() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzl);
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဉ\u0001\u0003ᐉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i11 == 3) {
            return new C4621j8();
        }
        AbstractC4599h8 abstractC4599h8 = null;
        if (i11 == 4) {
            return new C4610i8(abstractC4599h8);
        }
        if (i11 == 5) {
            return zzb;
        }
        this.zzl = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
