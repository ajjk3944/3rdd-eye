package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;
import s.g;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzeet implements zzede {
    private final Context zza;
    private final zzdfy zzb;
    private final Executor zzc;
    private final zzfbs zzd;
    private final zzdsc zze;

    public zzeet(Context context, Executor executor, zzdfy zzdfyVar, zzfbs zzfbsVar, zzdsc zzdscVar) {
        this.zza = context;
        this.zzb = zzdfyVar;
        this.zzc = executor;
        this.zzd = zzfbsVar;
        this.zze = zzdscVar;
    }

    public static /* synthetic */ A4.a zzd(zzeet zzeetVar, Uri uri, zzfcf zzfcfVar, zzfbt zzfbtVar, zzfbw zzfbwVar, Object obj) {
        try {
            Intent intent = new g.d().a().f45885a;
            intent.setData(uri);
            com.google.android.gms.ads.internal.overlay.zzc zzcVar = new com.google.android.gms.ads.internal.overlay.zzc(intent, null);
            zzcai zzcaiVar = new zzcai();
            zzdev zzdevVarZzd = zzeetVar.zzb.zzd(new zzcrl(zzfcfVar, zzfbtVar, null), new zzdey(new zzees(zzeetVar, zzcaiVar, zzfbtVar), null));
            zzcaiVar.zzc(new AdOverlayInfoParcel(zzcVar, null, zzdevVarZzd.zza(), null, new VersionInfoParcel(0, 0, false), null, null, zzfbwVar.zzb));
            zzeetVar.zzd.zza();
            return zzgdb.zzh(zzdevVarZzd.zzg());
        } catch (Throwable th) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error in CustomTabsAdRenderer", th);
            throw th;
        }
    }

    private static String zze(zzfbt zzfbtVar) {
        try {
            return zzfbtVar.zzv.getString("tab_url");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzede
    public final A4.a zza(final zzfcf zzfcfVar, final zzfbt zzfbtVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zznl)).booleanValue()) {
            zzdsb zzdsbVarZza = this.zze.zza();
            zzdsbVarZza.zzb("action", "cstm_tbs_rndr");
            zzdsbVarZza.zzj();
        }
        String strZze = zze(zzfbtVar);
        final Uri uri = strZze != null ? Uri.parse(strZze) : null;
        final zzfbw zzfbwVar = zzfcfVar.zzb.zzb;
        return zzgdb.zzn(zzgdb.zzh(null), new zzgci() { // from class: com.google.android.gms.internal.ads.zzeer
            @Override // com.google.android.gms.internal.ads.zzgci
            public final A4.a zza(Object obj) {
                return zzeet.zzd(this.zza, uri, zzfcfVar, zzfbtVar, zzfbwVar, obj);
            }
        }, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzede
    public final boolean zzb(zzfcf zzfcfVar, zzfbt zzfbtVar) {
        Context context = this.zza;
        return (context instanceof Activity) && zzbed.zzg(context) && !TextUtils.isEmpty(zze(zzfbtVar));
    }
}
