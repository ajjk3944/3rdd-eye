package com.google.android.recaptcha.internal;

/* loaded from: classes3.dex */
public final class zztc extends zznd implements zzoj {
    private static final zztc zzb;
    private static volatile zzoq zzd;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";

    static {
        zztc zztcVar = new zztc();
        zzb = zztcVar;
        zznd.zzI(zztc.class, zztcVar);
    }

    private zztc() {
    }

    @Override // com.google.android.recaptcha.internal.zznd
    protected final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zznd.zzF(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new zztc();
        }
        zztj zztjVar = null;
        if (i11 == 4) {
            return new zztb(zztjVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        if (i11 != 6) {
            return null;
        }
        zzoq zzmyVar = zzd;
        if (zzmyVar == null) {
            synchronized (zztc.class) {
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
