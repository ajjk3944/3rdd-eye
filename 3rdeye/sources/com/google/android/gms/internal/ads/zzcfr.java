package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.TrafficStats;
import android.os.StrictMode;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzcfr {
    public static final zzcfe zza(final Context context, final zzcgy zzcgyVar, final String str, final boolean z10, final boolean z11, final zzavs zzavsVar, final zzbej zzbejVar, final VersionInfoParcel versionInfoParcel, zzbdr zzbdrVar, final com.google.android.gms.ads.internal.zzn zznVar, final com.google.android.gms.ads.internal.zza zzaVar, final zzbca zzbcaVar, final zzfbt zzfbtVar, final zzfbw zzfbwVar, final zzecd zzecdVar, final zzfcs zzfcsVar, final zzdsc zzdscVar) throws zzcfq {
        zzbdc.zza(context);
        try {
            final zzbdr zzbdrVar2 = null;
            zzfvw zzfvwVar = new zzfvw(context, zzcgyVar, str, z10, z11, zzavsVar, zzbejVar, versionInfoParcel, zzbdrVar2, zznVar, zzaVar, zzbcaVar, zzfbtVar, zzfbwVar, zzfcsVar, zzdscVar, zzecdVar) { // from class: com.google.android.gms.internal.ads.zzcfp
                public final /* synthetic */ Context zza;
                public final /* synthetic */ zzcgy zzb;
                public final /* synthetic */ String zzc;
                public final /* synthetic */ boolean zzd;
                public final /* synthetic */ boolean zze;
                public final /* synthetic */ zzavs zzf;
                public final /* synthetic */ zzbej zzg;
                public final /* synthetic */ VersionInfoParcel zzh;
                public final /* synthetic */ com.google.android.gms.ads.internal.zzn zzi;
                public final /* synthetic */ com.google.android.gms.ads.internal.zza zzj;
                public final /* synthetic */ zzbca zzk;
                public final /* synthetic */ zzfbt zzl;
                public final /* synthetic */ zzfbw zzm;
                public final /* synthetic */ zzfcs zzn;
                public final /* synthetic */ zzdsc zzo;
                public final /* synthetic */ zzecd zzp;

                {
                    this.zzi = zznVar;
                    this.zzj = zzaVar;
                    this.zzk = zzbcaVar;
                    this.zzl = zzfbtVar;
                    this.zzm = zzfbwVar;
                    this.zzn = zzfcsVar;
                    this.zzo = zzdscVar;
                    this.zzp = zzecdVar;
                }

                @Override // com.google.android.gms.internal.ads.zzfvw
                public final Object zza() {
                    zzcgy zzcgyVar2 = this.zzb;
                    String str2 = this.zzc;
                    boolean z12 = this.zzd;
                    zzbca zzbcaVar2 = this.zzk;
                    boolean z13 = this.zze;
                    zzavs zzavsVar2 = this.zzf;
                    zzfbt zzfbtVar2 = this.zzl;
                    zzbej zzbejVar2 = this.zzg;
                    com.google.android.gms.ads.internal.zzn zznVar2 = this.zzi;
                    zzfbw zzfbwVar2 = this.zzm;
                    Context context2 = this.zza;
                    VersionInfoParcel versionInfoParcel2 = this.zzh;
                    com.google.android.gms.ads.internal.zza zzaVar2 = this.zzj;
                    zzfcs zzfcsVar2 = this.zzn;
                    zzdsc zzdscVar2 = this.zzo;
                    zzecd zzecdVar2 = this.zzp;
                    try {
                        TrafficStats.setThreadStatsTag(264);
                        int i = zzcgd.zza;
                        zzcfw zzcfwVar = new zzcfw(new zzcgd(new zzcgx(context2), zzcgyVar2, str2, z12, z13, zzavsVar2, zzbejVar2, versionInfoParcel2, null, zznVar2, zzaVar2, zzbcaVar2, zzfbtVar2, zzfbwVar2, zzfcsVar2), zzdscVar2);
                        zzcfwVar.setWebViewClient(com.google.android.gms.ads.internal.zzv.zzs().zzc(zzcfwVar, zzbcaVar2, z13, zzecdVar2));
                        zzcfwVar.setWebChromeClient(new zzcfd(zzcfwVar));
                        return zzcfwVar;
                    } finally {
                        TrafficStats.clearThreadStatsTag();
                    }
                }
            };
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                Object objZza = zzfvwVar.zza();
                StrictMode.setThreadPolicy(threadPolicy);
                return (zzcfe) objZza;
            } catch (Throwable th) {
                StrictMode.setThreadPolicy(threadPolicy);
                throw th;
            }
        } catch (Throwable th2) {
            throw new zzcfq("Webview initialization failed.", th2);
        }
    }
}
