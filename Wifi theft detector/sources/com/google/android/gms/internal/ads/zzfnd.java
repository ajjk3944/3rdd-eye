package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzfnd {
    final /* synthetic */ zzfnm zza;
    private final Object zzb;
    private final List zzc;

    public /* synthetic */ zzfnd(zzfnm zzfnmVar, Object obj, List list, byte[] bArr) {
        Objects.requireNonNull(zzfnmVar);
        this.zza = zzfnmVar;
        this.zzb = obj;
        this.zzc = list;
    }

    public final zzfnl zza(Callable callable) {
        List list = this.zzc;
        zzgzn zzgznVarZzp = zzgzo.zzp(list);
        com.google.common.util.concurrent.a aVarZza = zzgznVarZzp.zza(zzfnc.zza, zzcei.zzg);
        zzfnm zzfnmVar = this.zza;
        return new zzfnl(zzfnmVar, this.zzb, null, aVarZza, list, zzgznVarZzp.zza(callable, zzfnmVar.zze()), null);
    }
}
