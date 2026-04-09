package com.google.android.recaptcha.internal;

/* loaded from: classes3.dex */
public final class zztq extends zznd implements zzoj {
    private static final zztq zzb;
    private static volatile zzoq zzd;
    private String zze = "";
    private String zzf = "";

    static {
        zztq zztqVar = new zztq();
        zzb = zztqVar;
        zznd.zzI(zztq.class, zztqVar);
    }

    private zztq() {
    }

    public static zztp zzf() {
        return (zztp) zzb.zzq();
    }

    static /* synthetic */ void zzi(zztq zztqVar, String str) {
        str.getClass();
        zztqVar.zze = str;
    }

    @Override // com.google.android.recaptcha.internal.zznd
    protected final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zznd.zzF(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"zze", "zzf"});
        }
        if (i11 == 3) {
            return new zztq();
        }
        zzug zzugVar = null;
        if (i11 == 4) {
            return new zztp(zzugVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        if (i11 != 6) {
            return null;
        }
        zzoq zzmyVar = zzd;
        if (zzmyVar == null) {
            synchronized (zztq.class) {
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
