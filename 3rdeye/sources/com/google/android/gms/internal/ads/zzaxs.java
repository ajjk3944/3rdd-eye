package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzaxs extends zzayi {
    private final zzawn zzh;

    public zzaxs(zzawv zzawvVar, String str, String str2, zzasr zzasrVar, int i, int i10, zzawn zzawnVar) {
        super(zzawvVar, "LLos9e8Ql/sv7oIXEM/FCVf2w4qxksYVSJjnFOiKAZfJ/fOB+3TAGyZw1OkiJRsU", "lmzfMnrRinUoapvwdylnImZxEAh1S0BzbHZ4/bdyts0=", zzasrVar, i, 94);
        this.zzh = zzawnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzayi
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        int iIntValue = ((Integer) this.zze.invoke(null, this.zzh.zza())).intValue();
        zzasr zzasrVar = this.zzd;
        synchronized (zzasrVar) {
            zzasrVar.zzab(zzatd.zza(iIntValue));
        }
    }
}
