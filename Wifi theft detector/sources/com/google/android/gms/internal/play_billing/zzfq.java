package com.google.android.gms.internal.play_billing;

/* loaded from: classes2.dex */
public final class zzfq extends zzhk implements zzin {
    private static final zzfq zzb;
    private int zzd;
    private String zze = "";

    static {
        zzfq zzfqVar = new zzfq();
        zzb = zzfqVar;
        zzhk.zzx(zzfq.class, zzfqVar);
    }

    private zzfq() {
    }

    public static zzfp zza() {
        return (zzfp) zzb.zzm();
    }

    public static /* synthetic */ void zzc(zzfq zzfqVar, String str) {
        zzfqVar.zzd |= 1;
        zzfqVar.zze = str;
    }

    @Override // com.google.android.gms.internal.play_billing.zzhk
    public final Object zzd(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzhk.zzu(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i11 == 3) {
            return new zzfq();
        }
        zzfr zzfrVar = null;
        if (i11 == 4) {
            return new zzfp(zzfrVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
