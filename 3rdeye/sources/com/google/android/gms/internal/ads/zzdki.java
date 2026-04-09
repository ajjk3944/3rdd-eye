package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzdki {
    private final zzdpc zza;
    private final zzdnr zzb;
    private ViewTreeObserver.OnScrollChangedListener zzc = null;

    public zzdki(zzdpc zzdpcVar, zzdnr zzdnrVar) {
        this.zza = zzdpcVar;
        this.zzb = zzdnrVar;
    }

    public static /* synthetic */ void zzb(zzdki zzdkiVar, WindowManager windowManager, View view, zzcfe zzcfeVar, Map map) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zze("Hide native ad policy validator overlay.");
        zzcfeVar.zzF().setVisibility(8);
        if (zzcfeVar.zzF().getWindowToken() != null) {
            windowManager.removeView(zzcfeVar.zzF());
        }
        zzcfeVar.destroy();
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (zzdkiVar.zzc == null || viewTreeObserver == null || !viewTreeObserver.isAlive()) {
            return;
        }
        viewTreeObserver.removeOnScrollChangedListener(zzdkiVar.zzc);
    }

    public static /* synthetic */ void zzc(final zzdki zzdkiVar, final View view, final WindowManager windowManager, zzcfe zzcfeVar, final Map map) throws NumberFormatException {
        final zzcfe zzcfeVar2;
        zzcfeVar.zzN().zzC(new zzcgu() { // from class: com.google.android.gms.internal.ads.zzdkg
            @Override // com.google.android.gms.internal.ads.zzcgu
            public final void zza(boolean z10, int i, String str, String str2) {
                zzdki.zzd(this.zza, map, z10, i, str, str2);
            }
        });
        if (map == null) {
            return;
        }
        Context context = view.getContext();
        int iZzf = zzf(context, (String) map.get("validator_width"), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzio)).intValue());
        int iZzf2 = zzf(context, (String) map.get("validator_height"), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzip)).intValue());
        int iZzf3 = zzf(context, (String) map.get("validator_x"), 0);
        int iZzf4 = zzf(context, (String) map.get("validator_y"), 0);
        zzcfeVar.zzaj(zzcgy.zzb(iZzf, iZzf2));
        try {
            zzcfeVar.zzG().getSettings().setUseWideViewPort(((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zziq)).booleanValue());
            zzcfeVar.zzG().getSettings().setLoadWithOverviewMode(((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzir)).booleanValue());
        } catch (NullPointerException unused) {
        }
        final WindowManager.LayoutParams layoutParamsZzb = com.google.android.gms.ads.internal.util.zzbv.zzb();
        layoutParamsZzb.x = iZzf3;
        layoutParamsZzb.y = iZzf4;
        windowManager.updateViewLayout(zzcfeVar.zzF(), layoutParamsZzb);
        final String str = (String) map.get("orientation");
        Rect rect = new Rect();
        if (view.getGlobalVisibleRect(rect)) {
            final int i = (("1".equals(str) || "2".equals(str)) ? rect.bottom : rect.top) - iZzf4;
            zzcfeVar2 = zzcfeVar;
            zzdkiVar.zzc = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.google.android.gms.internal.ads.zzdkh
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final void onScrollChanged() {
                    Rect rect2 = new Rect();
                    if (view.getGlobalVisibleRect(rect2)) {
                        zzcfe zzcfeVar3 = zzcfeVar2;
                        if (zzcfeVar3.zzF().getWindowToken() == null) {
                            return;
                        }
                        int i10 = i;
                        WindowManager.LayoutParams layoutParams = layoutParamsZzb;
                        String str2 = str;
                        if ("1".equals(str2) || "2".equals(str2)) {
                            layoutParams.y = rect2.bottom - i10;
                        } else {
                            layoutParams.y = rect2.top - i10;
                        }
                        windowManager.updateViewLayout(zzcfeVar3.zzF(), layoutParams);
                    }
                }
            };
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnScrollChangedListener(zzdkiVar.zzc);
            }
        } else {
            zzcfeVar2 = zzcfeVar;
        }
        String str2 = (String) map.get("overlay_url");
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        zzcfeVar2.loadUrl(str2);
    }

    public static /* synthetic */ void zzd(zzdki zzdkiVar, Map map, boolean z10, int i, String str, String str2) {
        HashMap map2 = new HashMap();
        map2.put("messageType", "validatorHtmlLoaded");
        map2.put(FacebookMediationAdapter.KEY_ID, (String) map.get(FacebookMediationAdapter.KEY_ID));
        zzdkiVar.zzb.zzj("sendMessageToNativeJs", map2);
    }

    private static final int zzf(Context context, String str, int i) throws NumberFormatException {
        try {
            i = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
        }
        com.google.android.gms.ads.internal.client.zzbb.zzb();
        return com.google.android.gms.ads.internal.util.client.zzf.zzC(context, i);
    }

    public final View zza(final View view, final WindowManager windowManager) throws zzcfq {
        zzcfe zzcfeVarZza = this.zza.zza(com.google.android.gms.ads.internal.client.zzr.zzc(), null, null);
        zzcfeVarZza.zzF().setVisibility(4);
        zzcfeVarZza.zzF().setContentDescription("policy_validator");
        zzcfeVarZza.zzag("/sendMessageToSdk", new zzbkd() { // from class: com.google.android.gms.internal.ads.zzdkc
            @Override // com.google.android.gms.internal.ads.zzbkd
            public final void zza(Object obj, Map map) {
                this.zza.zzb.zzj("sendMessageToNativeJs", map);
            }
        });
        zzcfeVarZza.zzag("/hideValidatorOverlay", new zzbkd() { // from class: com.google.android.gms.internal.ads.zzdkd
            @Override // com.google.android.gms.internal.ads.zzbkd
            public final void zza(Object obj, Map map) {
                zzdki.zzb(this.zza, windowManager, view, (zzcfe) obj, map);
            }
        });
        zzcfeVarZza.zzag("/open", new zzbkp(null, null, null, null, null));
        WeakReference weakReference = new WeakReference(zzcfeVarZza);
        zzbkd zzbkdVar = new zzbkd() { // from class: com.google.android.gms.internal.ads.zzdke
            @Override // com.google.android.gms.internal.ads.zzbkd
            public final void zza(Object obj, Map map) throws NumberFormatException {
                zzdki.zzc(this.zza, view, windowManager, (zzcfe) obj, map);
            }
        };
        zzdnr zzdnrVar = this.zzb;
        zzdnrVar.zzm(weakReference, "/loadNativeAdPolicyViolations", zzbkdVar);
        zzdnrVar.zzm(new WeakReference(zzcfeVarZza), "/showValidatorOverlay", new zzbkd() { // from class: com.google.android.gms.internal.ads.zzdkf
            @Override // com.google.android.gms.internal.ads.zzbkd
            public final void zza(Object obj, Map map) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zze("Show native ad policy validator overlay.");
                ((zzcfe) obj).zzF().setVisibility(0);
            }
        });
        return zzcfeVarZza.zzF();
    }
}
