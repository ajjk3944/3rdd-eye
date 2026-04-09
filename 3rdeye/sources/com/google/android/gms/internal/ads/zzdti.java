package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.vungle.ads.internal.g;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzdti {
    private final zzblc zza;

    public zzdti(zzblc zzblcVar) {
        this.zza = zzblcVar;
    }

    private final void zzs(zzdtg zzdtgVar) throws JSONException, RemoteException {
        String strZza = zzdtg.zza(zzdtgVar);
        String strConcat = "Dispatching AFMA event on publisher webview: ".concat(strZza);
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi(strConcat);
        this.zza.zzb(strZza);
    }

    public final void zza() throws RemoteException {
        zzs(new zzdtg("initialize", null));
    }

    public final void zzb(long j4) throws JSONException, RemoteException {
        zzdtg zzdtgVar = new zzdtg(g.PLACEMENT_TYPE_INTERSTITIAL, null);
        zzdtgVar.zza = Long.valueOf(j4);
        zzdtgVar.zzc = "onAdClicked";
        this.zza.zzb(zzdtg.zza(zzdtgVar));
    }

    public final void zzc(long j4) throws JSONException, RemoteException {
        zzdtg zzdtgVar = new zzdtg(g.PLACEMENT_TYPE_INTERSTITIAL, null);
        zzdtgVar.zza = Long.valueOf(j4);
        zzdtgVar.zzc = "onAdClosed";
        zzs(zzdtgVar);
    }

    public final void zzd(long j4, int i) throws JSONException, RemoteException {
        zzdtg zzdtgVar = new zzdtg(g.PLACEMENT_TYPE_INTERSTITIAL, null);
        zzdtgVar.zza = Long.valueOf(j4);
        zzdtgVar.zzc = "onAdFailedToLoad";
        zzdtgVar.zzd = Integer.valueOf(i);
        zzs(zzdtgVar);
    }

    public final void zze(long j4) throws JSONException, RemoteException {
        zzdtg zzdtgVar = new zzdtg(g.PLACEMENT_TYPE_INTERSTITIAL, null);
        zzdtgVar.zza = Long.valueOf(j4);
        zzdtgVar.zzc = "onAdLoaded";
        zzs(zzdtgVar);
    }

    public final void zzf(long j4) throws RemoteException {
        zzdtg zzdtgVar = new zzdtg(g.PLACEMENT_TYPE_INTERSTITIAL, null);
        zzdtgVar.zza = Long.valueOf(j4);
        zzdtgVar.zzc = "onNativeAdObjectNotAvailable";
        zzs(zzdtgVar);
    }

    public final void zzg(long j4) throws JSONException, RemoteException {
        zzdtg zzdtgVar = new zzdtg(g.PLACEMENT_TYPE_INTERSTITIAL, null);
        zzdtgVar.zza = Long.valueOf(j4);
        zzdtgVar.zzc = "onAdOpened";
        zzs(zzdtgVar);
    }

    public final void zzh(long j4) throws RemoteException {
        zzdtg zzdtgVar = new zzdtg("creation", null);
        zzdtgVar.zza = Long.valueOf(j4);
        zzdtgVar.zzc = "nativeObjectCreated";
        zzs(zzdtgVar);
    }

    public final void zzi(long j4) throws RemoteException {
        zzdtg zzdtgVar = new zzdtg("creation", null);
        zzdtgVar.zza = Long.valueOf(j4);
        zzdtgVar.zzc = "nativeObjectNotCreated";
        zzs(zzdtgVar);
    }

    public final void zzj(long j4) throws JSONException, RemoteException {
        zzdtg zzdtgVar = new zzdtg(g.PLACEMENT_TYPE_REWARDED, null);
        zzdtgVar.zza = Long.valueOf(j4);
        zzdtgVar.zzc = "onAdClicked";
        zzs(zzdtgVar);
    }

    public final void zzk(long j4) throws JSONException, RemoteException {
        zzdtg zzdtgVar = new zzdtg(g.PLACEMENT_TYPE_REWARDED, null);
        zzdtgVar.zza = Long.valueOf(j4);
        zzdtgVar.zzc = "onRewardedAdClosed";
        zzs(zzdtgVar);
    }

    public final void zzl(long j4, zzbwq zzbwqVar) throws JSONException, RemoteException {
        zzdtg zzdtgVar = new zzdtg(g.PLACEMENT_TYPE_REWARDED, null);
        zzdtgVar.zza = Long.valueOf(j4);
        zzdtgVar.zzc = "onUserEarnedReward";
        zzdtgVar.zze = zzbwqVar.zzf();
        zzdtgVar.zzf = Integer.valueOf(zzbwqVar.zze());
        zzs(zzdtgVar);
    }

    public final void zzm(long j4, int i) throws JSONException, RemoteException {
        zzdtg zzdtgVar = new zzdtg(g.PLACEMENT_TYPE_REWARDED, null);
        zzdtgVar.zza = Long.valueOf(j4);
        zzdtgVar.zzc = "onRewardedAdFailedToLoad";
        zzdtgVar.zzd = Integer.valueOf(i);
        zzs(zzdtgVar);
    }

    public final void zzn(long j4, int i) throws JSONException, RemoteException {
        zzdtg zzdtgVar = new zzdtg(g.PLACEMENT_TYPE_REWARDED, null);
        zzdtgVar.zza = Long.valueOf(j4);
        zzdtgVar.zzc = "onRewardedAdFailedToShow";
        zzdtgVar.zzd = Integer.valueOf(i);
        zzs(zzdtgVar);
    }

    public final void zzo(long j4) throws JSONException, RemoteException {
        zzdtg zzdtgVar = new zzdtg(g.PLACEMENT_TYPE_REWARDED, null);
        zzdtgVar.zza = Long.valueOf(j4);
        zzdtgVar.zzc = "onAdImpression";
        zzs(zzdtgVar);
    }

    public final void zzp(long j4) throws JSONException, RemoteException {
        zzdtg zzdtgVar = new zzdtg(g.PLACEMENT_TYPE_REWARDED, null);
        zzdtgVar.zza = Long.valueOf(j4);
        zzdtgVar.zzc = "onRewardedAdLoaded";
        zzs(zzdtgVar);
    }

    public final void zzq(long j4) throws RemoteException {
        zzdtg zzdtgVar = new zzdtg(g.PLACEMENT_TYPE_REWARDED, null);
        zzdtgVar.zza = Long.valueOf(j4);
        zzdtgVar.zzc = "onNativeAdObjectNotAvailable";
        zzs(zzdtgVar);
    }

    public final void zzr(long j4) throws JSONException, RemoteException {
        zzdtg zzdtgVar = new zzdtg(g.PLACEMENT_TYPE_REWARDED, null);
        zzdtgVar.zza = Long.valueOf(j4);
        zzdtgVar.zzc = "onRewardedAdOpened";
        zzs(zzdtgVar);
    }
}
