package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzaxm extends zzayi {
    private final long zzh;

    public zzaxm(zzawv zzawvVar, String str, String str2, zzasr zzasrVar, long j4, int i, int i10) {
        super(zzawvVar, "bz3lIaHWpCquphICM8d57wBZcB7vA3QBLpLSSF22FzCVTv7HI8nqsTojeybBUatg", "nJy2u10FH1OsIt1ONuXNmQ7d3Q3+he826LogUVDBAds=", zzasrVar, i, 25);
        this.zzh = j4;
    }

    @Override // com.google.android.gms.internal.ads.zzayi
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        long jLongValue = ((Long) this.zze.invoke(null, new Object[0])).longValue();
        zzasr zzasrVar = this.zzd;
        synchronized (zzasrVar) {
            try {
                zzasrVar.zzr(jLongValue);
                long j4 = this.zzh;
                if (j4 != 0) {
                    zzasrVar.zzR(jLongValue - j4);
                    zzasrVar.zzS(j4);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
