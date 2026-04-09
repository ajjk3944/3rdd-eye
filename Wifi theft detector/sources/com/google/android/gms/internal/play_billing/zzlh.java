package com.google.android.gms.internal.play_billing;

/* loaded from: classes2.dex */
public final class zzlh extends zzhk implements zzin {
    private static final zzlh zzb;
    private zzho zzd = zzhk.zzs();

    static {
        zzlh zzlhVar = new zzlh();
        zzb = zzlhVar;
        zzhk.zzx(zzlh.class, zzlhVar);
    }

    private zzlh() {
    }

    @Override // com.google.android.gms.internal.play_billing.zzhk
    public final Object zzd(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzhk.zzu(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", zzlf.class});
        }
        if (i11 == 3) {
            return new zzlh();
        }
        zzlg zzlgVar = null;
        if (i11 == 4) {
            return new zzlc(zzlgVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
