package com.google.android.recaptcha.internal;

/* loaded from: classes3.dex */
public final class zzsg extends zznd implements zzoj {
    private static final zzsg zzb;
    private static volatile zzoq zzd;
    private int zze;
    private String zzf = "";

    static {
        zzsg zzsgVar = new zzsg();
        zzb = zzsgVar;
        zznd.zzI(zzsg.class, zzsgVar);
    }

    private zzsg() {
    }

    public static zzsf zzf() {
        return (zzsf) zzb.zzq();
    }

    static /* synthetic */ void zzi(zzsg zzsgVar, String str) {
        zzsgVar.zze |= 1;
        zzsgVar.zzf = str;
    }

    @Override // com.google.android.recaptcha.internal.zznd
    protected final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zznd.zzF(zzb, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ለ\u0000", new Object[]{"zze", "zzf"});
        }
        if (i11 == 3) {
            return new zzsg();
        }
        zzsn zzsnVar = null;
        if (i11 == 4) {
            return new zzsf(zzsnVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        if (i11 != 6) {
            return null;
        }
        zzoq zzmyVar = zzd;
        if (zzmyVar == null) {
            synchronized (zzsg.class) {
                try {
                    zzmyVar = zzd;
                    if (zzmyVar == null) {
                        zzmyVar = new zzmy(zzb);
                        zzd = zzmyVar;
                    }
                } finally {
                }
            }
        }
        return zzmyVar;
    }
}
