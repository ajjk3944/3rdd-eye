package com.google.android.recaptcha.internal;

/* loaded from: classes3.dex */
public final class zzth extends zznd implements zzoj {
    private static final zzth zzb;
    private static volatile zzoq zzd;
    private int zze = 0;
    private Object zzf;

    static {
        zzth zzthVar = new zzth();
        zzb = zzthVar;
        zznd.zzI(zzth.class, zzthVar);
    }

    private zzth() {
    }

    static /* synthetic */ void zzM(zzth zzthVar, float f10) {
        zzthVar.zze = 9;
        zzthVar.zzf = Float.valueOf(f10);
    }

    static /* synthetic */ void zzN(zzth zzthVar, int i10) {
        zzthVar.zze = 4;
        zzthVar.zzf = Integer.valueOf(i10);
    }

    static /* synthetic */ void zzO(zzth zzthVar, int i10) {
        zzthVar.zze = 5;
        zzthVar.zzf = Integer.valueOf(i10);
    }

    static /* synthetic */ void zzP(zzth zzthVar, long j10) {
        zzthVar.zze = 7;
        zzthVar.zzf = Long.valueOf(j10);
    }

    static /* synthetic */ void zzQ(zzth zzthVar, String str) {
        str.getClass();
        zzthVar.zze = 11;
        zzthVar.zzf = str;
    }

    public static zztg zzf() {
        return (zztg) zzb.zzq();
    }

    static /* synthetic */ void zzi(zzth zzthVar, boolean z10) {
        zzthVar.zze = 1;
        zzthVar.zzf = Boolean.valueOf(z10);
    }

    static /* synthetic */ void zzj(zzth zzthVar, zzle zzleVar) {
        zzthVar.zze = 2;
        zzthVar.zzf = zzleVar;
    }

    static /* synthetic */ void zzk(zzth zzthVar, String str) {
        str.getClass();
        zzthVar.zze = 3;
        zzthVar.zzf = str;
    }

    static /* synthetic */ void zzl(zzth zzthVar, double d10) {
        zzthVar.zze = 10;
        zzthVar.zzf = Double.valueOf(d10);
    }

    @Override // com.google.android.recaptcha.internal.zznd
    protected final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zznd.zzF(zzb, "\u0000\u000b\u0001\u0000\u0001\u000b\u000b\u0000\u0000\u0000\u0001:\u0000\u0002=\u0000\u0003Ȼ\u0000\u0004B\u0000\u0005B\u0000\u0006>\u0000\u0007C\u0000\b6\u0000\t4\u0000\n3\u0000\u000bȻ\u0000", new Object[]{"zzf", "zze"});
        }
        if (i11 == 3) {
            return new zzth();
        }
        zztj zztjVar = null;
        if (i11 == 4) {
            return new zztg(zztjVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        if (i11 != 6) {
            return null;
        }
        zzoq zzmyVar = zzd;
        if (zzmyVar == null) {
            synchronized (zzth.class) {
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
