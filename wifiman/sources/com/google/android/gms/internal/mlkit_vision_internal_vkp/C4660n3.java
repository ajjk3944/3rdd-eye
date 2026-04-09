package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* renamed from: com.google.android.gms.internal.mlkit_vision_internal_vkp.n3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4660n3 extends AbstractC4516a2 implements A2 {
    private static final C4660n3 zzb;
    private int zzd;
    private float zzh;
    private byte zzi = 2;
    private String zze = "";
    private String zzf = "";
    private InterfaceC4582g2 zzg = AbstractC4516a2.k();

    static {
        C4660n3 c4660n3 = new C4660n3();
        zzb = c4660n3;
        AbstractC4516a2.p(C4660n3.class, c4660n3);
    }

    private C4660n3() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzi);
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0003Л\u0004ခ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg", H0.class, "zzh"});
        }
        if (i11 == 3) {
            return new C4660n3();
        }
        AbstractC4638l3 abstractC4638l3 = null;
        if (i11 == 4) {
            return new C4649m3(abstractC4638l3);
        }
        if (i11 == 5) {
            return zzb;
        }
        this.zzi = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
