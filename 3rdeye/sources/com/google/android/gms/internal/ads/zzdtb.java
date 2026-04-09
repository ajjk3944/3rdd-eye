package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.admanager.AppEventListener;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzdtb implements AppEventListener, zzcyt, com.google.android.gms.ads.internal.client.zza, zzcvr, zzcwl, zzcwm, zzcxf, zzcvu, zzfgt {
    private final List zza;
    private final zzdsp zzb;
    private long zzc;

    public zzdtb(zzdsp zzdspVar, zzcgz zzcgzVar) {
        this.zzb = zzdspVar;
        this.zza = Collections.singletonList(zzcgzVar);
    }

    private final void zzg(Class cls, String str, Object... objArr) throws IOException {
        this.zzb.zza(this.zza, "Event-".concat(cls.getSimpleName()), str, objArr);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() throws IOException {
        zzg(com.google.android.gms.ads.internal.client.zza.class, "onAdClicked", new Object[0]);
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final void onAppEvent(String str, String str2) throws IOException {
        zzg(AppEventListener.class, "onAppEvent", str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcvr
    public final void zza() throws IOException {
        zzg(zzcvr.class, "onAdClosed", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcvr
    public final void zzb() throws IOException {
        zzg(zzcvr.class, "onAdLeftApplication", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcvr
    public final void zzc() throws IOException {
        zzg(zzcvr.class, "onAdOpened", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzfgt
    public final void zzd(zzfgm zzfgmVar, String str) throws IOException {
        zzg(zzfgl.class, "onTaskSucceeded", str);
    }

    @Override // com.google.android.gms.internal.ads.zzcvu
    public final void zzdD(com.google.android.gms.ads.internal.client.zze zzeVar) throws IOException {
        zzg(zzcvu.class, "onAdFailedToLoad", Integer.valueOf(zzeVar.zza), zzeVar.zzb, zzeVar.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzfgt
    public final void zzdE(zzfgm zzfgmVar, String str) throws IOException {
        zzg(zzfgl.class, "onTaskCreated", str);
    }

    @Override // com.google.android.gms.internal.ads.zzfgt
    public final void zzdF(zzfgm zzfgmVar, String str, Throwable th) throws IOException {
        zzg(zzfgl.class, "onTaskFailed", str, th.getClass().getSimpleName());
    }

    @Override // com.google.android.gms.internal.ads.zzfgt
    public final void zzdG(zzfgm zzfgmVar, String str) throws IOException {
        zzg(zzfgl.class, "onTaskStarted", str);
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzdj(Context context) throws IOException {
        zzg(zzcwm.class, "onDestroy", context);
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzdl(Context context) throws IOException {
        zzg(zzcwm.class, "onPause", context);
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzdm(Context context) throws IOException {
        zzg(zzcwm.class, "onResume", context);
    }

    @Override // com.google.android.gms.internal.ads.zzcyt
    public final void zzdn(zzbvo zzbvoVar) throws IOException {
        this.zzc = com.google.android.gms.ads.internal.zzv.zzD().elapsedRealtime();
        zzg(zzcyt.class, "onAdRequest", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcvr
    public final void zzdu(zzbwa zzbwaVar, String str, String str2) throws IOException {
        zzg(zzcvr.class, "onRewarded", zzbwaVar, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcvr
    public final void zze() throws IOException {
        zzg(zzcvr.class, "onRewardedVideoCompleted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcvr
    public final void zzf() throws IOException {
        zzg(zzcvr.class, "onRewardedVideoStarted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcwl
    public final void zzs() throws IOException {
        zzg(zzcwl.class, "onAdImpression", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcxf
    public final void zzt() throws IOException {
        com.google.android.gms.ads.internal.util.zze.zza("Ad Request Latency : " + (com.google.android.gms.ads.internal.zzv.zzD().elapsedRealtime() - this.zzc));
        zzg(zzcxf.class, "onAdLoaded", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcyt
    public final void zzdo(zzfcf zzfcfVar) {
    }
}
