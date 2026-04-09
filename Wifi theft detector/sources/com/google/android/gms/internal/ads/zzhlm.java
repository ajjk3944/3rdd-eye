package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzhlm extends RuntimeException {
    public zzhlm(String str) {
        super(str);
    }

    public static Object zza(zzhll zzhllVar) {
        try {
            return zzhllVar.zza();
        } catch (Exception e10) {
            throw new zzhlm(e10);
        }
    }

    public zzhlm(String str, Throwable th) {
        super(str, th);
    }

    public zzhlm(Throwable th) {
        super(th);
    }
}
