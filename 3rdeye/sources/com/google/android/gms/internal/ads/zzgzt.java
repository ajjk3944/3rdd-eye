package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
final class zzgzt {
    public static final List zza(Object obj, long j4) {
        zzgzh zzgzhVar = (zzgzh) zzhbs.zzh(obj, j4);
        if (zzgzhVar.zzc()) {
            return zzgzhVar;
        }
        int size = zzgzhVar.size();
        zzgzh zzgzhVarZzf = zzgzhVar.zzf(size == 0 ? 10 : size + size);
        zzhbs.zzv(obj, j4, zzgzhVarZzf);
        return zzgzhVarZzf;
    }
}
