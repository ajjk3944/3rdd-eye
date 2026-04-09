package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* renamed from: com.google.android.gms.internal.mlkit_vision_internal_vkp.q5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4695q5 extends AbstractC4516a2 implements A2 {
    private static final C4695q5 zzb;
    private int zzd;
    private int zze;
    private int zzg;
    private boolean zzh;
    private byte zzi = 2;
    private InterfaceC4582g2 zzf = AbstractC4516a2.k();

    static {
        C4695q5 c4695q5 = new C4695q5();
        zzb = c4695q5;
        AbstractC4516a2.p(C4695q5.class, c4695q5);
    }

    private C4695q5() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzi);
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0001\u0004\u0000\u0001\u0003\u0006\u0004\u0000\u0001\u0002\u0003ᔄ\u0000\u0004Л\u0005င\u0001\u0006ဇ\u0002", new Object[]{"zzd", "zze", "zzf", C4738u5.class, "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new C4695q5();
        }
        AbstractC4662n5 abstractC4662n5 = null;
        if (i11 == 4) {
            return new C4684p5(abstractC4662n5);
        }
        if (i11 == 5) {
            return zzb;
        }
        this.zzi = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
