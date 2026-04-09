package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzdno implements Callable {
    private final com.google.android.gms.ads.internal.zza zza;
    private final Context zzb;
    private final zzdsc zzc;
    private final zzebs zzd;
    private final Executor zze;
    private final zzavs zzf;
    private final VersionInfoParcel zzg;
    private final zzfjq zzh;
    private final zzecd zzi;
    private final zzfcs zzj;

    public zzdno(Context context, Executor executor, zzavs zzavsVar, VersionInfoParcel versionInfoParcel, com.google.android.gms.ads.internal.zza zzaVar, zzcfr zzcfrVar, zzebs zzebsVar, zzfjq zzfjqVar, zzdsc zzdscVar, zzecd zzecdVar, zzfcs zzfcsVar) {
        this.zzb = context;
        this.zze = executor;
        this.zzf = zzavsVar;
        this.zzg = versionInfoParcel;
        this.zza = zzaVar;
        this.zzd = zzebsVar;
        this.zzh = zzfjqVar;
        this.zzc = zzdscVar;
        this.zzi = zzecdVar;
        this.zzj = zzfcsVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzdnr zzdnrVar = new zzdnr(this);
        zzdnrVar.zzk();
        return zzdnrVar;
    }
}
