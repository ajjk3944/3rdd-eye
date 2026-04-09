package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* loaded from: classes.dex */
public final class G extends AbstractC4516a2 implements A2 {
    private static final G zzb;
    private int zzd;
    private float zze;
    private boolean zzf;

    static {
        G g10 = new G();
        zzb = g10;
        AbstractC4516a2.p(G.class, g10);
    }

    private G() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.AbstractC4516a2
    protected final Object v(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC4516a2.m(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ခ\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new G();
        }
        E e10 = null;
        if (i11 == 4) {
            return new F(e10);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
