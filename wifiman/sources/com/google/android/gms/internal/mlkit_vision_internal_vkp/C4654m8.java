package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* renamed from: com.google.android.gms.internal.mlkit_vision_internal_vkp.m8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4654m8 extends AbstractC4516a2 implements A2 {
    private static final C4654m8 zzb;
    private int zzd;
    private int zzf;
    private int zzg;
    private float zzi;
    private InterfaceC4582g2 zze = AbstractC4516a2.k();
    private String zzh = "";

    static {
        C4654m8 c4654m8 = new C4654m8();
        zzb = c4654m8;
        AbstractC4516a2.p(C4654m8.class, c4654m8);
    }

    private C4654m8() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001c\u0002င\u0000\u0003င\u0001\u0004ဈ\u0002\u0005ခ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new C4654m8();
        }
        AbstractC4632k8 abstractC4632k8 = null;
        if (i11 == 4) {
            return new C4643l8(abstractC4632k8);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
