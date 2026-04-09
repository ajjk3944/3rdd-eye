package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzaxt extends zzayi {
    private final zzavy zzh;
    private final long zzi;
    private final long zzj;

    public zzaxt(zzawv zzawvVar, String str, String str2, zzasr zzasrVar, int i, int i10, zzavy zzavyVar, long j4, long j10) {
        super(zzawvVar, "Q2alXHIIp2vvtZN4ZNw4W3dXvS5FZxkSx8F3noC2XP6gq0/XB0ulYQV32h8ZSW0i", "bHzouddPHTqhUNsOeni/FRK++KVVMe5yU+yUqilZ/gg=", zzasrVar, i, 11);
        this.zzh = zzavyVar;
        this.zzi = j4;
        this.zzj = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzayi
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        zzavy zzavyVar = this.zzh;
        if (zzavyVar != null) {
            zzavw zzavwVar = new zzavw((String) this.zze.invoke(null, zzavyVar.zzb(), Long.valueOf(this.zzi), Long.valueOf(this.zzj)));
            zzasr zzasrVar = this.zzd;
            synchronized (zzasrVar) {
                try {
                    zzasrVar.zzx(zzavwVar.zza.longValue());
                    if (zzavwVar.zzb.longValue() >= 0) {
                        zzasrVar.zzO(zzavwVar.zzb.longValue());
                    }
                    if (zzavwVar.zzc.longValue() >= 0) {
                        zzasrVar.zzf(zzavwVar.zzc.longValue());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
