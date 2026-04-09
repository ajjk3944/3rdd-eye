package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzbsa extends zzbrm {
    private final RtbAdapter zza;
    private MediationInterstitialAd zzb;
    private MediationRewardedAd zzc;
    private MediationAppOpenAd zzd;
    private String zze = "";

    public zzbsa(RtbAdapter rtbAdapter) {
        this.zza = rtbAdapter;
    }

    private final Bundle zzv(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        Bundle bundle;
        Bundle bundle2 = zzmVar.zzm;
        return (bundle2 == null || (bundle = bundle2.getBundle(this.zza.getClass().getName())) == null) ? new Bundle() : bundle;
    }

    private static final Bundle zzw(String str) throws RemoteException {
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Server parameters: ".concat(String.valueOf(str)));
        try {
            Bundle bundle = new Bundle();
            if (str == null) {
                return bundle;
            }
            JSONObject jSONObject = new JSONObject(str);
            Bundle bundle2 = new Bundle();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                bundle2.putString(next, jSONObject.getString(next));
            }
            return bundle2;
        } catch (JSONException e4) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e4);
            throw new RemoteException();
        }
    }

    private static final boolean zzx(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        if (zzmVar.zzf) {
            return true;
        }
        com.google.android.gms.ads.internal.client.zzbb.zzb();
        return com.google.android.gms.ads.internal.util.client.zzf.zzw();
    }

    private static final String zzy(String str, com.google.android.gms.ads.internal.client.zzm zzmVar) {
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return zzmVar.zzu;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrn
    public final com.google.android.gms.ads.internal.client.zzed zze() {
        MediationExtrasReceiver mediationExtrasReceiver = this.zza;
        if (mediationExtrasReceiver instanceof com.google.android.gms.ads.mediation.zza) {
            try {
                return ((com.google.android.gms.ads.mediation.zza) mediationExtrasReceiver).getVideoController();
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("", th);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbrn
    public final zzbsc zzf() throws RemoteException {
        return zzbsc.zza(this.zza.getVersionInfo());
    }

    @Override // com.google.android.gms.internal.ads.zzbrn
    public final zzbsc zzg() throws RemoteException {
        return zzbsc.zza(this.zza.getSDKVersionInfo());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    @Override // com.google.android.gms.internal.ads.zzbrn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzh(com.google.android.gms.dynamic.IObjectWrapper r5, java.lang.String r6, android.os.Bundle r7, android.os.Bundle r8, com.google.android.gms.ads.internal.client.zzr r9, com.google.android.gms.internal.ads.zzbrq r10) throws android.os.RemoteException {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.zzbry r0 = new com.google.android.gms.internal.ads.zzbry     // Catch: java.lang.Throwable -> L71
            r0.<init>(r4, r10)     // Catch: java.lang.Throwable -> L71
            com.google.android.gms.ads.mediation.rtb.RtbAdapter r10 = r4.zza     // Catch: java.lang.Throwable -> L71
            com.google.android.gms.ads.mediation.MediationConfiguration r1 = new com.google.android.gms.ads.mediation.MediationConfiguration     // Catch: java.lang.Throwable -> L71
            int r2 = r6.hashCode()     // Catch: java.lang.Throwable -> L71
            switch(r2) {
                case -1396342996: goto L4d;
                case -1052618729: goto L43;
                case -239580146: goto L39;
                case 604727084: goto L2f;
                case 1167692200: goto L25;
                case 1778294298: goto L1b;
                case 1911491517: goto L11;
                default: goto L10;
            }
        L10:
            goto L57
        L11:
            java.lang.String r2 = "rewarded_interstitial"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L57
            r6 = 3
            goto L58
        L1b:
            java.lang.String r2 = "app_open_ad"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L57
            r6 = 6
            goto L58
        L25:
            java.lang.String r2 = "app_open"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L57
            r6 = 5
            goto L58
        L2f:
            java.lang.String r2 = "interstitial"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L57
            r6 = 1
            goto L58
        L39:
            java.lang.String r2 = "rewarded"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L57
            r6 = 2
            goto L58
        L43:
            java.lang.String r2 = "native"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L57
            r6 = 4
            goto L58
        L4d:
            java.lang.String r2 = "banner"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L57
            r6 = 0
            goto L58
        L57:
            r6 = -1
        L58:
            switch(r6) {
                case 0: goto L8a;
                case 1: goto L87;
                case 2: goto L84;
                case 3: goto L81;
                case 4: goto L7e;
                case 5: goto L7b;
                case 6: goto L5c;
                default: goto L5b;
            }
        L5b:
            goto L73
        L5c:
            com.google.android.gms.internal.ads.zzbct r6 = com.google.android.gms.internal.ads.zzbdc.zzmc     // Catch: java.lang.Throwable -> L71
            com.google.android.gms.internal.ads.zzbda r2 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch: java.lang.Throwable -> L71
            java.lang.Object r6 = r2.zzb(r6)     // Catch: java.lang.Throwable -> L71
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L71
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> L71
            if (r6 == 0) goto L73
            com.google.android.gms.ads.AdFormat r6 = com.google.android.gms.ads.AdFormat.APP_OPEN_AD     // Catch: java.lang.Throwable -> L71
            goto L8c
        L71:
            r6 = move-exception
            goto Lb0
        L73:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L71
            java.lang.String r7 = "Internal Error"
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L71
            throw r6     // Catch: java.lang.Throwable -> L71
        L7b:
            com.google.android.gms.ads.AdFormat r6 = com.google.android.gms.ads.AdFormat.APP_OPEN_AD     // Catch: java.lang.Throwable -> L71
            goto L8c
        L7e:
            com.google.android.gms.ads.AdFormat r6 = com.google.android.gms.ads.AdFormat.NATIVE     // Catch: java.lang.Throwable -> L71
            goto L8c
        L81:
            com.google.android.gms.ads.AdFormat r6 = com.google.android.gms.ads.AdFormat.REWARDED_INTERSTITIAL     // Catch: java.lang.Throwable -> L71
            goto L8c
        L84:
            com.google.android.gms.ads.AdFormat r6 = com.google.android.gms.ads.AdFormat.REWARDED     // Catch: java.lang.Throwable -> L71
            goto L8c
        L87:
            com.google.android.gms.ads.AdFormat r6 = com.google.android.gms.ads.AdFormat.INTERSTITIAL     // Catch: java.lang.Throwable -> L71
            goto L8c
        L8a:
            com.google.android.gms.ads.AdFormat r6 = com.google.android.gms.ads.AdFormat.BANNER     // Catch: java.lang.Throwable -> L71
        L8c:
            r1.<init>(r6, r8)     // Catch: java.lang.Throwable -> L71
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L71
            r6.<init>()     // Catch: java.lang.Throwable -> L71
            r6.add(r1)     // Catch: java.lang.Throwable -> L71
            com.google.android.gms.ads.mediation.rtb.RtbSignalData r8 = new com.google.android.gms.ads.mediation.rtb.RtbSignalData     // Catch: java.lang.Throwable -> L71
            java.lang.Object r1 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r5)     // Catch: java.lang.Throwable -> L71
            android.content.Context r1 = (android.content.Context) r1     // Catch: java.lang.Throwable -> L71
            int r2 = r9.zze     // Catch: java.lang.Throwable -> L71
            int r3 = r9.zzb     // Catch: java.lang.Throwable -> L71
            java.lang.String r9 = r9.zza     // Catch: java.lang.Throwable -> L71
            com.google.android.gms.ads.AdSize r9 = com.google.android.gms.ads.zzc.zzc(r2, r3, r9)     // Catch: java.lang.Throwable -> L71
            r8.<init>(r1, r6, r7, r9)     // Catch: java.lang.Throwable -> L71
            r10.collectSignals(r8, r0)     // Catch: java.lang.Throwable -> L71
            return
        Lb0:
            java.lang.String r7 = "Error generating signals for RTB"
            com.google.android.gms.ads.internal.util.client.zzo.zzh(r7, r6)
            java.lang.String r7 = "adapter.collectSignals"
            com.google.android.gms.internal.ads.zzbpl.zza(r5, r6, r7)
            android.os.RemoteException r5 = new android.os.RemoteException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbsa.zzh(com.google.android.gms.dynamic.IObjectWrapper, java.lang.String, android.os.Bundle, android.os.Bundle, com.google.android.gms.ads.internal.client.zzr, com.google.android.gms.internal.ads.zzbrq):void");
    }

    @Override // com.google.android.gms.internal.ads.zzbrn
    public final void zzi(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbqy zzbqyVar, zzbpu zzbpuVar) throws RemoteException {
        try {
            this.zza.loadRtbAppOpenAd(new MediationAppOpenAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzw(str2), zzv(zzmVar), zzx(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzy(str2, zzmVar), this.zze), new zzbrx(this, zzbqyVar, zzbpuVar));
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Adapter failed to render app open ad.", th);
            zzbpl.zza(iObjectWrapper, th, "adapter.loadRtbAppOpenAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrn
    public final void zzj(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbrb zzbrbVar, zzbpu zzbpuVar, com.google.android.gms.ads.internal.client.zzr zzrVar) throws RemoteException {
        try {
            this.zza.loadRtbBannerAd(new MediationBannerAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzw(str2), zzv(zzmVar), zzx(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzy(str2, zzmVar), com.google.android.gms.ads.zzc.zzc(zzrVar.zze, zzrVar.zzb, zzrVar.zza), this.zze), new zzbrs(this, zzbrbVar, zzbpuVar));
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Adapter failed to render banner ad.", th);
            zzbpl.zza(iObjectWrapper, th, "adapter.loadRtbBannerAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrn
    public final void zzk(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbrb zzbrbVar, zzbpu zzbpuVar, com.google.android.gms.ads.internal.client.zzr zzrVar) throws RemoteException {
        try {
            zzbrt zzbrtVar = new zzbrt(this, zzbrbVar, zzbpuVar);
            RtbAdapter rtbAdapter = this.zza;
            zzw(str2);
            zzv(zzmVar);
            zzx(zzmVar);
            Location location = zzmVar.zzk;
            zzy(str2, zzmVar);
            com.google.android.gms.ads.zzc.zzc(zzrVar.zze, zzrVar.zzb, zzrVar.zza);
            zzbrtVar.onFailure(new AdError(7, rtbAdapter.getClass().getSimpleName().concat(" does not support interscroller ads."), MobileAds.ERROR_DOMAIN));
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Adapter failed to render interscroller ad.", th);
            zzbpl.zza(iObjectWrapper, th, "adapter.loadRtbInterscrollerAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrn
    public final void zzl(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbre zzbreVar, zzbpu zzbpuVar) throws RemoteException {
        try {
            this.zza.loadRtbInterstitialAd(new MediationInterstitialAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzw(str2), zzv(zzmVar), zzx(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzy(str2, zzmVar), this.zze), new zzbru(this, zzbreVar, zzbpuVar));
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Adapter failed to render interstitial ad.", th);
            zzbpl.zza(iObjectWrapper, th, "adapter.loadRtbInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrn
    public final void zzm(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbrh zzbrhVar, zzbpu zzbpuVar) throws RemoteException {
        zzn(str, str2, zzmVar, iObjectWrapper, zzbrhVar, zzbpuVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbrn
    public final void zzn(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbrh zzbrhVar, zzbpu zzbpuVar, zzbgc zzbgcVar) throws RemoteException {
        try {
            this.zza.loadRtbNativeAdMapper(new MediationNativeAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzw(str2), zzv(zzmVar), zzx(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzy(str2, zzmVar), this.zze, zzbgcVar), new zzbrv(this, zzbrhVar, zzbpuVar));
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Adapter failed to render native ad.", th);
            zzbpl.zza(iObjectWrapper, th, "adapter.loadRtbNativeAdMapper");
            String message = th.getMessage();
            if (TextUtils.isEmpty(message) || !message.equals("Method is not found")) {
                throw new RemoteException();
            }
            try {
                this.zza.loadRtbNativeAd(new MediationNativeAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzw(str2), zzv(zzmVar), zzx(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzy(str2, zzmVar), this.zze, zzbgcVar), new zzbrw(this, zzbrhVar, zzbpuVar));
            } catch (Throwable th2) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Adapter failed to render native ad.", th2);
                zzbpl.zza(iObjectWrapper, th2, "adapter.loadRtbNativeAd");
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrn
    public final void zzo(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbrk zzbrkVar, zzbpu zzbpuVar) throws RemoteException {
        try {
            this.zza.loadRtbRewardedInterstitialAd(new MediationRewardedAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzw(str2), zzv(zzmVar), zzx(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzy(str2, zzmVar), this.zze), new zzbrz(this, zzbrkVar, zzbpuVar));
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Adapter failed to render rewarded interstitial ad.", th);
            zzbpl.zza(iObjectWrapper, th, "adapter.loadRtbRewardedInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrn
    public final void zzp(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbrk zzbrkVar, zzbpu zzbpuVar) throws RemoteException {
        try {
            this.zza.loadRtbRewardedAd(new MediationRewardedAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzw(str2), zzv(zzmVar), zzx(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzy(str2, zzmVar), this.zze), new zzbrz(this, zzbrkVar, zzbpuVar));
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Adapter failed to render rewarded ad.", th);
            zzbpl.zza(iObjectWrapper, th, "adapter.loadRtbRewardedAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrn
    public final void zzq(String str) {
        this.zze = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbrn
    public final boolean zzr(IObjectWrapper iObjectWrapper) throws RemoteException {
        MediationAppOpenAd mediationAppOpenAd = this.zzd;
        if (mediationAppOpenAd == null) {
            return false;
        }
        try {
            mediationAppOpenAd.showAd((Context) ObjectWrapper.unwrap(iObjectWrapper));
            return true;
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", th);
            zzbpl.zza(iObjectWrapper, th, "adapter.showRtbAppOpenAd");
            return true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrn
    public final boolean zzs(IObjectWrapper iObjectWrapper) throws RemoteException {
        MediationInterstitialAd mediationInterstitialAd = this.zzb;
        if (mediationInterstitialAd == null) {
            return false;
        }
        try {
            mediationInterstitialAd.showAd((Context) ObjectWrapper.unwrap(iObjectWrapper));
            return true;
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", th);
            zzbpl.zza(iObjectWrapper, th, "adapter.showRtbInterstitialAd");
            return true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrn
    public final boolean zzt(IObjectWrapper iObjectWrapper) throws RemoteException {
        MediationRewardedAd mediationRewardedAd = this.zzc;
        if (mediationRewardedAd == null) {
            return false;
        }
        try {
            mediationRewardedAd.showAd((Context) ObjectWrapper.unwrap(iObjectWrapper));
            return true;
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", th);
            zzbpl.zza(iObjectWrapper, th, "adapter.showRtbRewardedAd");
            return true;
        }
    }
}
