package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.OutOfContextTestingActivity;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzdvy extends com.google.android.gms.ads.internal.client.zzdv {
    final Map zza = new HashMap();
    private final Context zzb;
    private final WeakReference zzc;
    private final zzdvm zzd;
    private final zzgdm zze;
    private zzdvb zzf;

    public zzdvy(Context context, WeakReference weakReference, zzdvm zzdvmVar, zzdvz zzdvzVar, zzgdm zzgdmVar) {
        this.zzb = context;
        this.zzc = weakReference;
        this.zzd = zzdvmVar;
        this.zze = zzgdmVar;
    }

    private final Context zzj() {
        Context context = (Context) this.zzc.get();
        return context == null ? this.zzb : context;
    }

    private static AdRequest zzk() {
        Bundle bundle = new Bundle();
        bundle.putString("request_origin", "inspector_ooct");
        return new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzl(Object obj) {
        ResponseInfo responseInfo;
        com.google.android.gms.ads.internal.client.zzea zzeaVarZzc;
        if (obj instanceof LoadAdError) {
            responseInfo = ((LoadAdError) obj).getResponseInfo();
        } else if (obj instanceof AppOpenAd) {
            responseInfo = ((AppOpenAd) obj).getResponseInfo();
        } else if (obj instanceof InterstitialAd) {
            responseInfo = ((InterstitialAd) obj).getResponseInfo();
        } else if (obj instanceof RewardedAd) {
            responseInfo = ((RewardedAd) obj).getResponseInfo();
        } else if (obj instanceof RewardedInterstitialAd) {
            responseInfo = ((RewardedInterstitialAd) obj).getResponseInfo();
        } else if (obj instanceof AdView) {
            responseInfo = ((AdView) obj).getResponseInfo();
        } else {
            if (!(obj instanceof NativeAd)) {
                return "";
            }
            responseInfo = ((NativeAd) obj).getResponseInfo();
        }
        if (responseInfo == null || (zzeaVarZzc = responseInfo.zzc()) == null) {
            return "";
        }
        try {
            return zzeaVarZzc.zzh();
        } catch (RemoteException unused) {
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzm(String str, String str2) {
        try {
            zzgdb.zzr(this.zzf.zzb(str), new zzdvw(this, str2), this.zze);
        } catch (NullPointerException e4) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e4, "OutOfContextTester.setAdAsOutOfContext");
            this.zzd.zzk(str2);
        }
    }

    private final synchronized void zzn(String str, String str2) {
        try {
            zzgdb.zzr(this.zzf.zzb(str), new zzdvx(this, str2), this.zze);
        } catch (NullPointerException e4) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e4, "OutOfContextTester.setAdAsShown");
            this.zzd.zzk(str2);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdw
    public final void zze(String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        ViewGroup viewGroup = (ViewGroup) ObjectWrapper.unwrap(iObjectWrapper2);
        if (context == null || viewGroup == null) {
            return;
        }
        Map map = this.zza;
        Object obj = map.get(str);
        if (obj != null) {
            map.remove(str);
        }
        if (obj instanceof AdView) {
            zzdvz.zza(context, viewGroup, (AdView) obj);
        } else if (obj instanceof NativeAd) {
            zzdvz.zzb(context, viewGroup, (NativeAd) obj);
        }
    }

    public final void zzf(zzdvb zzdvbVar) {
        this.zzf = zzdvbVar;
    }

    public final synchronized void zzg(String str, Object obj, String str2) {
        this.zza.put(str, obj);
        zzm(zzl(obj), str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void zzh(final java.lang.String r7, java.lang.String r8, final java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdvy.zzh(java.lang.String, java.lang.String, java.lang.String):void");
    }

    public final synchronized void zzi(String str, String str2) {
        Map map;
        Object obj;
        try {
            Activity activityZzg = this.zzd.zzg();
            if (activityZzg != null && (obj = (map = this.zza).get(str)) != null) {
                zzbct zzbctVar = zzbdc.zzjF;
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbctVar)).booleanValue() || (obj instanceof AppOpenAd) || (obj instanceof InterstitialAd) || (obj instanceof RewardedAd) || (obj instanceof RewardedInterstitialAd)) {
                    map.remove(str);
                }
                zzn(zzl(obj), str2);
                if (obj instanceof AppOpenAd) {
                    ((AppOpenAd) obj).show(activityZzg);
                    return;
                }
                if (obj instanceof InterstitialAd) {
                    ((InterstitialAd) obj).show(activityZzg);
                    return;
                }
                if (obj instanceof RewardedAd) {
                    ((RewardedAd) obj).show(activityZzg, new OnUserEarnedRewardListener() { // from class: com.google.android.gms.internal.ads.zzdvo
                        @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
                        public final void onUserEarnedReward(RewardItem rewardItem) {
                        }
                    });
                    return;
                }
                if (obj instanceof RewardedInterstitialAd) {
                    ((RewardedInterstitialAd) obj).show(activityZzg, new OnUserEarnedRewardListener() { // from class: com.google.android.gms.internal.ads.zzdvp
                        @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
                        public final void onUserEarnedReward(RewardItem rewardItem) {
                        }
                    });
                    return;
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbctVar)).booleanValue() && ((obj instanceof AdView) || (obj instanceof NativeAd))) {
                    Intent intent = new Intent();
                    Context contextZzj = zzj();
                    intent.setClassName(contextZzj, OutOfContextTestingActivity.CLASS_NAME);
                    intent.putExtra(OutOfContextTestingActivity.AD_UNIT_KEY, str);
                    com.google.android.gms.ads.internal.zzv.zzr();
                    com.google.android.gms.ads.internal.util.zzs.zzU(contextZzj, intent);
                }
            }
        } finally {
        }
    }
}
