package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzcuy {
    private Context zza;
    private zzfco zzb;
    private Bundle zzc;
    private zzfcg zzd;
    private zzcur zze;
    private zzedj zzf;
    private int zzg = 0;

    public final zzcuy zze(zzedj zzedjVar) {
        this.zzf = zzedjVar;
        return this;
    }

    public final zzcuy zzf(Context context) {
        this.zza = context;
        return this;
    }

    public final zzcuy zzg(Bundle bundle) {
        this.zzc = bundle;
        return this;
    }

    public final zzcuy zzh(zzcur zzcurVar) {
        this.zze = zzcurVar;
        return this;
    }

    public final zzcuy zzi(int i) {
        this.zzg = i;
        return this;
    }

    public final zzcuy zzj(zzfcg zzfcgVar) {
        this.zzd = zzfcgVar;
        return this;
    }

    public final zzcuy zzk(zzfco zzfcoVar) {
        this.zzb = zzfcoVar;
        return this;
    }

    public final zzcva zzl() {
        return new zzcva(this, null);
    }
}
