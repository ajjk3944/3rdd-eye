package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzfjq {
    private final Context zza;
    private final Executor zzb;
    private final zzgdn zzc;
    private final com.google.android.gms.ads.internal.util.client.zzu zzd;
    private final zzfji zze;
    private final zzfhp zzf;

    public zzfjq(Context context, Executor executor, zzgdn zzgdnVar, com.google.android.gms.ads.internal.util.client.zzu zzuVar, zzfji zzfjiVar, zzfhp zzfhpVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzgdnVar;
        this.zzd = zzuVar;
        this.zze = zzfjiVar;
        this.zzf = zzfhpVar;
    }

    public final void zzd(final String str, com.google.android.gms.ads.internal.util.client.zzv zzvVar, zzfhm zzfhmVar, zzcyb zzcybVar) {
        A4.a aVarZzb;
        zzfhb zzfhbVarZza = null;
        if (zzfhp.zza() && ((Boolean) zzbev.zzd.zze()).booleanValue()) {
            zzfhbVarZza = zzfha.zza(this.zza, 14);
            zzfhbVarZza.zzi();
        }
        if (zzvVar != null) {
            aVarZzb = new zzfjh(zzvVar.zzb(), this.zzd, this.zzc, this.zze).zzd(str);
        } else {
            aVarZzb = this.zzc.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzfjo
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.zza.zzd.zza(str);
                }
            });
        }
        zzgdb.zzr(aVarZzb, new zzfjp(this, zzfhbVarZza, zzfhmVar, zzcybVar), this.zzb);
    }

    public final void zze(List list, com.google.android.gms.ads.internal.util.client.zzv zzvVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzd((String) it.next(), zzvVar, null, null);
        }
    }
}
