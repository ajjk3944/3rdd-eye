package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.view.View;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.singular.sdk.internal.Constants;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzdka {
    private final zzdpc zza;
    private final zzdnr zzb;
    private final zzcns zzc;
    private final zzdiu zzd;

    public zzdka(zzdpc zzdpcVar, zzdnr zzdnrVar, zzcns zzcnsVar, zzdiu zzdiuVar) {
        this.zza = zzdpcVar;
        this.zzb = zzdnrVar;
        this.zzc = zzcnsVar;
        this.zzd = zzdiuVar;
    }

    public static /* synthetic */ void zzb(zzdka zzdkaVar, zzcfe zzcfeVar, Map map) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Hiding native ads overlay.");
        zzcfeVar.zzF().setVisibility(8);
        zzdkaVar.zzc.zze(false);
    }

    public static /* synthetic */ void zzd(zzdka zzdkaVar, zzcfe zzcfeVar, Map map) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Showing native ads overlay.");
        zzcfeVar.zzF().setVisibility(0);
        zzdkaVar.zzc.zze(true);
    }

    public static /* synthetic */ void zze(zzdka zzdkaVar, Map map, boolean z10, int i, String str, String str2) {
        HashMap map2 = new HashMap();
        map2.put("messageType", "htmlLoaded");
        map2.put(FacebookMediationAdapter.KEY_ID, (String) map.get(FacebookMediationAdapter.KEY_ID));
        zzdkaVar.zzb.zzj("sendMessageToNativeJs", map2);
    }

    public final View zza() throws zzcfq {
        zzcfe zzcfeVarZza = this.zza.zza(com.google.android.gms.ads.internal.client.zzr.zzc(), null, null);
        zzcfeVarZza.zzF().setVisibility(8);
        zzcfeVarZza.zzag("/sendMessageToSdk", new zzbkd() { // from class: com.google.android.gms.internal.ads.zzdju
            @Override // com.google.android.gms.internal.ads.zzbkd
            public final void zza(Object obj, Map map) {
                this.zza.zzb.zzj("sendMessageToNativeJs", map);
            }
        });
        zzcfeVarZza.zzag("/adMuted", new zzbkd() { // from class: com.google.android.gms.internal.ads.zzdjv
            @Override // com.google.android.gms.internal.ads.zzbkd
            public final void zza(Object obj, Map map) {
                this.zza.zzd.zzi();
            }
        });
        WeakReference weakReference = new WeakReference(zzcfeVarZza);
        zzbkd zzbkdVar = new zzbkd() { // from class: com.google.android.gms.internal.ads.zzdjw
            @Override // com.google.android.gms.internal.ads.zzbkd
            public final void zza(Object obj, final Map map) {
                zzcfe zzcfeVar = (zzcfe) obj;
                zzcgw zzcgwVarZzN = zzcfeVar.zzN();
                final zzdka zzdkaVar = this.zza;
                zzcgwVarZzN.zzC(new zzcgu() { // from class: com.google.android.gms.internal.ads.zzdjz
                    @Override // com.google.android.gms.internal.ads.zzcgu
                    public final void zza(boolean z10, int i, String str, String str2) {
                        zzdka.zze(zzdkaVar, map, z10, i, str, str2);
                    }
                });
                String str = (String) map.get("overlayHtml");
                String str2 = (String) map.get("baseUrl");
                if (TextUtils.isEmpty(str2)) {
                    zzcfeVar.loadData(str, "text/html", Constants.ENCODING);
                } else {
                    zzcfeVar.loadDataWithBaseURL(str2, str, "text/html", Constants.ENCODING, null);
                }
            }
        };
        zzdnr zzdnrVar = this.zzb;
        zzdnrVar.zzm(weakReference, "/loadHtml", zzbkdVar);
        zzdnrVar.zzm(new WeakReference(zzcfeVarZza), "/showOverlay", new zzbkd() { // from class: com.google.android.gms.internal.ads.zzdjx
            @Override // com.google.android.gms.internal.ads.zzbkd
            public final void zza(Object obj, Map map) {
                zzdka.zzd(this.zza, (zzcfe) obj, map);
            }
        });
        zzdnrVar.zzm(new WeakReference(zzcfeVarZza), "/hideOverlay", new zzbkd() { // from class: com.google.android.gms.internal.ads.zzdjy
            @Override // com.google.android.gms.internal.ads.zzbkd
            public final void zza(Object obj, Map map) {
                zzdka.zzb(this.zza, (zzcfe) obj, map);
            }
        });
        return zzcfeVarZza.zzF();
    }
}
