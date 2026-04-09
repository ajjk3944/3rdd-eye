package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* renamed from: com.google.android.gms.internal.mlkit_vision_internal_vkp.s4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4715s4 extends AbstractC4516a2 implements A2 {
    private static final C4715s4 zzb;
    private int zzd;
    private float zze;
    private float zzf;
    private float zzg;
    private int zzh = 15000;
    private int zzi;
    private float zzj;

    static {
        C4715s4 c4715s4 = new C4715s4();
        zzb = c4715s4;
        AbstractC4516a2.p(C4715s4.class, c4715s4);
    }

    private C4715s4() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006ခ\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", C4694q4.f35718a, "zzi", C4704r4.f35723a, "zzj"});
        }
        if (i11 == 3) {
            return new C4715s4();
        }
        AbstractC4562e4 abstractC4562e4 = null;
        if (i11 == 4) {
            return new C4683p4(abstractC4562e4);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
