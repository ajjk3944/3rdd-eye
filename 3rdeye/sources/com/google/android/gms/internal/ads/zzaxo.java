package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzaxo extends zzayi {
    private final zzaww zzh;

    public zzaxo(zzawv zzawvVar, String str, String str2, zzasr zzasrVar, int i, int i10, zzaww zzawwVar) {
        super(zzawvVar, "L3kNtlg7QY6D9Xl7pPswVVS/MCBOYXcB4vflYd8GjH187tfdUwj4wLKq5xN70kha", "7KShiw4CrXn9e1sAZ1bf68KLoTIikFllvC3ALPO42ag=", zzasrVar, i, 85);
        this.zzh = zzawwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzayi
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        Method method = this.zze;
        zzaww zzawwVar = this.zzh;
        long[] jArr = (long[]) method.invoke(null, Long.valueOf(zzawwVar.zzd()), Long.valueOf(zzawwVar.zzh()), Long.valueOf(zzawwVar.zzb()), Long.valueOf(zzawwVar.zzf()));
        zzasr zzasrVar = this.zzd;
        synchronized (zzasrVar) {
            zzasrVar.zzt(jArr[0]);
            zzasrVar.zzs(jArr[1]);
        }
    }
}
