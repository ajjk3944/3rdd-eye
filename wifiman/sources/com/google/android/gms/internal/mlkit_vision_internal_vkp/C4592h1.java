package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* renamed from: com.google.android.gms.internal.mlkit_vision_internal_vkp.h1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4592h1 extends AbstractC4516a2 implements A2 {
    private static final C4592h1 zzb;
    private int zzd;
    private float zze;
    private float zzf;
    private float zzg;
    private boolean zzl;
    private float zzm;
    private float zzn;
    private byte zzo = 2;
    private String zzh = "";
    private int zzi = -1;
    private float zzj = -1.0f;
    private float zzk = -1.0f;

    static {
        C4592h1 c4592h1 = new C4592h1();
        zzb = c4592h1;
        AbstractC4516a2.p(C4592h1.class, c4592h1);
    }

    private C4592h1() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzo);
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0001\n\u0000\u0001\u0001\u000b\n\u0000\u0000\u0001\u0001ᔁ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ဈ\u0003\u0005င\u0004\u0007ခ\u0005\bခ\u0006\tဇ\u0007\nခ\b\u000bခ\t", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn"});
        }
        if (i11 == 3) {
            return new C4592h1();
        }
        AbstractC4570f1 abstractC4570f1 = null;
        if (i11 == 4) {
            return new C4581g1(abstractC4570f1);
        }
        if (i11 == 5) {
            return zzb;
        }
        this.zzo = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
