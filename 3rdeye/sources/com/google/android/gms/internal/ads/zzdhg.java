package com.google.android.gms.internal.ads;

import a6.C1653b;
import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.PlatformVersion;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzdhg implements zzdiu {
    private com.google.android.gms.ads.internal.client.zzdf zzC;
    private final zzcyb zzD;
    private final zzdjo zzE;
    private final com.google.android.gms.ads.internal.zzb zzF;
    private final Context zza;
    private final zzdix zzb;
    private final JSONObject zzc;
    private final zzdnr zzd;
    private final zzdim zze;
    private final zzavs zzf;
    private final zzcwj zzg;
    private final zzcvp zzh;
    private final zzddu zzi;
    private final zzfbt zzj;
    private final VersionInfoParcel zzk;
    private final zzfco zzl;
    private final zzcni zzm;
    private final zzdjs zzn;
    private final Clock zzo;
    private final zzddq zzp;
    private final zzfjq zzq;
    private final zzdph zzr;
    private final zzfhm zzs;
    private final zzecd zzt;
    private boolean zzv;
    private boolean zzu = false;
    private boolean zzw = false;
    private boolean zzx = false;
    private Point zzy = new Point();
    private Point zzz = new Point();
    private long zzA = 0;
    private long zzB = 0;

    public zzdhg(Context context, zzdix zzdixVar, JSONObject jSONObject, zzdnr zzdnrVar, zzdim zzdimVar, zzavs zzavsVar, zzcwj zzcwjVar, zzcvp zzcvpVar, zzddu zzdduVar, zzfbt zzfbtVar, VersionInfoParcel versionInfoParcel, zzfco zzfcoVar, zzcni zzcniVar, zzdjs zzdjsVar, Clock clock, zzddq zzddqVar, zzfjq zzfjqVar, zzfhm zzfhmVar, zzecd zzecdVar, zzdph zzdphVar, zzdjo zzdjoVar, zzcyb zzcybVar, com.google.android.gms.ads.internal.zzb zzbVar, zzbxy zzbxyVar) {
        this.zza = context;
        this.zzb = zzdixVar;
        this.zzc = jSONObject;
        this.zzd = zzdnrVar;
        this.zze = zzdimVar;
        this.zzf = zzavsVar;
        this.zzg = zzcwjVar;
        this.zzh = zzcvpVar;
        this.zzi = zzdduVar;
        this.zzj = zzfbtVar;
        this.zzk = versionInfoParcel;
        this.zzl = zzfcoVar;
        this.zzm = zzcniVar;
        this.zzn = zzdjsVar;
        this.zzo = clock;
        this.zzp = zzddqVar;
        this.zzq = zzfjqVar;
        this.zzs = zzfhmVar;
        this.zzt = zzecdVar;
        this.zzr = zzdphVar;
        this.zzE = zzdjoVar;
        this.zzD = zzcybVar;
        this.zzF = zzbVar;
    }

    private final String zzG(View view) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzdM)).booleanValue()) {
            return null;
        }
        try {
            return this.zzf.zzc().zzh(this.zza, view, null);
        } catch (Exception unused) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Exception getting data.");
            return null;
        }
    }

    private final String zzH(View view, Map map) {
        if (map != null && view != null) {
            for (Map.Entry entry : map.entrySet()) {
                if (view.equals((View) ((WeakReference) entry.getValue()).get())) {
                    return (String) entry.getKey();
                }
            }
        }
        int iZzc = this.zze.zzc();
        if (iZzc == 1) {
            return "1099";
        }
        if (iZzc == 2) {
            return "2099";
        }
        if (iZzc != 6) {
            return null;
        }
        return "3099";
    }

    private final void zzI() {
        com.google.android.gms.ads.internal.zzb zzbVar;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zznE)).booleanValue() || (zzbVar = this.zzF) == null) {
            return;
        }
        zzbVar.zza();
    }

    private final boolean zzJ(String str) {
        JSONObject jSONObjectOptJSONObject = this.zzc.optJSONObject("allow_pub_event_reporting");
        return jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optBoolean(str, false);
    }

    private final boolean zzK() {
        return this.zzc.optBoolean("allow_custom_click_gesture", false);
    }

    private final boolean zzL(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, boolean z10, View view) throws JSONException {
        JSONException jSONException;
        JSONObject jSONObject6;
        zzdnr zzdnrVar;
        try {
            jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.zzc);
            jSONObject6.put("asset_view_signal", jSONObject2);
            jSONObject6.put("ad_view_signal", jSONObject);
            jSONObject6.put("scroll_view_signal", jSONObject3);
            jSONObject6.put("lock_screen_signal", jSONObject4);
            jSONObject6.put("provided_signals", jSONObject5);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzdM)).booleanValue()) {
                try {
                    jSONObject6.put("view_signals", str);
                } catch (JSONException e4) {
                    jSONException = e4;
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to create impression JSON.", jSONException);
                    return false;
                }
            }
            jSONObject6.put("policy_validator_enabled", z10);
            jSONObject6.put("screen", com.google.android.gms.ads.internal.util.zzbv.zzf(this.zza));
            zzdhf zzdhfVar = null;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zziQ)).booleanValue()) {
                this.zzd.zzl("/clickRecorded", new zzdhc(this, zzdhfVar));
            } else {
                this.zzd.zzl("/logScionEvent", new zzdhb(this, zzdhfVar));
            }
            zzdnrVar = this.zzd;
            zzdnrVar.zzl("/nativeImpression", new zzdhd(this, view, zzdhfVar));
        } catch (JSONException e10) {
            e = e10;
        }
        try {
            zzdnrVar.zzl("/nativeImpressionFlowControl", new zzdhe(this, this.zzq, this.zzj.zzax, this.zzs, null));
            zzcag.zza(zzdnrVar.zzg("google.afma.nativeAds.handleImpression", jSONObject6), "Error during performing handleImpression");
            if (this.zzu) {
                return true;
            }
            zzfbt zzfbtVar = this.zzj;
            this.zzu = com.google.android.gms.ads.internal.zzv.zzu().zzn(this.zza, this.zzk.afmaVersion, zzfbtVar.zzC.toString(), this.zzl.zzf);
            return true;
        } catch (JSONException e11) {
            e = e11;
            jSONException = e;
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to create impression JSON.", jSONException);
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zzA(zzbie zzbieVar) {
        if (this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.zzn.zzc(zzbieVar);
        } else {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("setUnconfirmedClickListener: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zzB(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        this.zzy = new Point();
        this.zzz = new Point();
        if (!this.zzv) {
            this.zzp.zza(view);
            this.zzv = true;
        }
        view.setOnTouchListener(onTouchListener);
        view.setClickable(true);
        view.setOnClickListener(onClickListener);
        this.zzm.zzi(this);
        boolean zZzj = com.google.android.gms.ads.internal.util.zzbv.zzj(this.zzk.clientJarVersion);
        if (map != null) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                View view2 = (View) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                if (view2 != null) {
                    if (zZzj) {
                        view2.setOnTouchListener(onTouchListener);
                    }
                    view2.setClickable(true);
                    view2.setOnClickListener(onClickListener);
                }
            }
        }
        if (map2 != null) {
            Iterator it2 = map2.entrySet().iterator();
            while (it2.hasNext()) {
                View view3 = (View) ((WeakReference) ((Map.Entry) it2.next()).getValue()).get();
                if (view3 != null) {
                    if (zZzj) {
                        view3.setOnTouchListener(onTouchListener);
                    }
                    view3.setClickable(false);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zzC(View view, Map map) {
        this.zzy = new Point();
        this.zzz = new Point();
        if (view != null) {
            this.zzp.zzb(view);
        }
        this.zzv = false;
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final boolean zzD() {
        if (zza() == 0) {
            return true;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzlM)).booleanValue()) {
            return this.zzl.zzi.zzj;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final boolean zzE() {
        return zzK();
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final boolean zzF(Bundle bundle) {
        if (zzJ("impression_reporting")) {
            return zzL(null, null, null, null, ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzlI)).booleanValue() ? zzG(null) : null, com.google.android.gms.ads.internal.client.zzbb.zzb().zzp(bundle, null), false, null);
        }
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzg("The ad slot cannot handle external impression events. You must be in the allow list to be able to report your impression events.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final int zza() {
        zzbgc zzbgcVar = this.zzl.zzi;
        if (zzbgcVar == null) {
            return 0;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzlM)).booleanValue()) {
            return zzbgcVar.zzi;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final JSONObject zzf(View view, Map map, Map map2, ImageView.ScaleType scaleType) throws JSONException {
        Context context = this.zza;
        JSONObject jSONObjectZzd = com.google.android.gms.ads.internal.util.zzbv.zzd(context, map, map2, view, scaleType);
        JSONObject jSONObjectZzh = com.google.android.gms.ads.internal.util.zzbv.zzh(context, view);
        JSONObject jSONObjectZzg = com.google.android.gms.ads.internal.util.zzbv.zzg(view);
        JSONObject jSONObjectZze = com.google.android.gms.ads.internal.util.zzbv.zze(context, view);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("asset_view_signal", jSONObjectZzd);
            jSONObject.put("ad_view_signal", jSONObjectZzh);
            jSONObject.put("scroll_view_signal", jSONObjectZzg);
            jSONObject.put("lock_screen_signal", jSONObjectZze);
            return jSONObject;
        } catch (JSONException e4) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to create native ad view signals JSON.", e4);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final JSONObject zzg(View view, Map map, Map map2, ImageView.ScaleType scaleType) throws JSONException {
        JSONObject jSONObjectZzf = zzf(view, map, map2, scaleType);
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.zzx && zzK()) {
                jSONObject.put("custom_click_gesture_eligible", true);
            }
            if (jSONObjectZzf != null) {
                jSONObject.put("nas", jSONObjectZzf);
                return jSONObject;
            }
        } catch (JSONException e4) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to create native click meta data JSON.", e4);
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zzi() {
        try {
            com.google.android.gms.ads.internal.client.zzdf zzdfVar = this.zzC;
            if (zzdfVar != null) {
                zzdfVar.zze();
            }
        } catch (RemoteException e4) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zzj() {
        if (this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.zzn.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zzk() {
        this.zzd.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zzl(com.google.android.gms.ads.internal.client.zzdj zzdjVar) {
        try {
            if (this.zzw) {
                return;
            }
            if (zzdjVar == null) {
                zzdim zzdimVar = this.zze;
                if (zzdimVar.zzk() != null) {
                    this.zzw = true;
                    this.zzq.zzd(zzdimVar.zzk().zzf(), this.zzj.zzax, this.zzs, null);
                    zzi();
                    return;
                }
            }
            this.zzw = true;
            this.zzq.zzd(zzdjVar.zzf(), this.zzj.zzax, this.zzs, null);
            zzi();
        } catch (RemoteException e4) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zzm(View view, View view2, Map map, Map map2, boolean z10, ImageView.ScaleType scaleType) throws JSONException {
        Context context = this.zza;
        JSONObject jSONObjectZzd = com.google.android.gms.ads.internal.util.zzbv.zzd(context, map, map2, view2, scaleType);
        JSONObject jSONObjectZzh = com.google.android.gms.ads.internal.util.zzbv.zzh(context, view2);
        JSONObject jSONObjectZzg = com.google.android.gms.ads.internal.util.zzbv.zzg(view2);
        JSONObject jSONObjectZze = com.google.android.gms.ads.internal.util.zzbv.zze(context, view2);
        String strZzH = zzH(view, map);
        zzp(true == ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzdT)).booleanValue() ? view2 : view, jSONObjectZzh, jSONObjectZzd, jSONObjectZzg, jSONObjectZze, strZzH, com.google.android.gms.ads.internal.util.zzbv.zzc(strZzH, context, this.zzz, this.zzy), null, z10, false);
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zzn(String str) throws JSONException {
        zzp(null, null, null, null, null, str, null, null, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zzo(Bundle bundle) throws JSONException {
        if (bundle == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Click data is null. No click is reported.");
        } else if (zzJ("click_reporting")) {
            Bundle bundle2 = bundle.getBundle("click_signal");
            zzp(null, null, null, null, null, bundle2 != null ? bundle2.getString("asset_id") : null, null, com.google.android.gms.ads.internal.client.zzbb.zzb().zzp(bundle, null), false, false);
        } else {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("The ad slot cannot handle external click events. You must be part of the allow list to be able to report your click events.");
        }
    }

    public final void zzp(View view, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, JSONObject jSONObject6, boolean z10, boolean z11) throws JSONException {
        String strZzd;
        try {
            zzI();
            JSONObject jSONObject7 = new JSONObject();
            JSONObject jSONObject8 = this.zzc;
            jSONObject7.put("ad", jSONObject8);
            jSONObject7.put("asset_view_signal", jSONObject2);
            jSONObject7.put("ad_view_signal", jSONObject);
            jSONObject7.put("click_signal", jSONObject5);
            jSONObject7.put("scroll_view_signal", jSONObject3);
            jSONObject7.put("lock_screen_signal", jSONObject4);
            zzdix zzdixVar = this.zzb;
            zzdim zzdimVar = this.zze;
            jSONObject7.put("has_custom_click_handler", zzdixVar.zzc(zzdimVar.zzA()) != null);
            jSONObject7.put("provided_signals", jSONObject6);
            JSONObject jSONObject9 = new JSONObject();
            jSONObject9.put("asset_id", str);
            jSONObject9.put(C1653b.KEY_TEMPLATE, zzdimVar.zzc());
            jSONObject9.put("view_aware_api_used", z10);
            zzbgc zzbgcVar = this.zzl.zzi;
            jSONObject9.put("custom_mute_requested", zzbgcVar != null && zzbgcVar.zzg);
            jSONObject9.put("custom_mute_enabled", (zzdimVar.zzH().isEmpty() || zzdimVar.zzk() == null) ? false : true);
            if (this.zzn.zza() != null && jSONObject8.optBoolean("custom_one_point_five_click_enabled", false)) {
                jSONObject9.put("custom_one_point_five_click_eligible", true);
            }
            jSONObject9.put("timestamp", this.zzo.currentTimeMillis());
            if (this.zzx && zzK()) {
                jSONObject9.put("custom_click_gesture_eligible", true);
            }
            if (z11) {
                jSONObject9.put("is_custom_click_gesture", true);
            }
            jSONObject9.put("has_custom_click_handler", zzdixVar.zzc(zzdimVar.zzA()) != null);
            try {
                JSONObject jSONObjectOptJSONObject = jSONObject8.optJSONObject("tracking_urls_and_actions");
                if (jSONObjectOptJSONObject == null) {
                    jSONObjectOptJSONObject = new JSONObject();
                }
                strZzd = this.zzf.zzc().zzd(this.zza, jSONObjectOptJSONObject.optString("click_string"), view);
            } catch (Exception e4) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Exception obtaining click signals", e4);
                strZzd = null;
            }
            jSONObject9.put("click_signals", strZzd);
            jSONObject9.put("open_chrome_custom_tab", true);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zziU)).booleanValue() && PlatformVersion.isAtLeastR()) {
                jSONObject9.put("try_fallback_for_deep_link", true);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zziV)).booleanValue() && PlatformVersion.isAtLeastR()) {
                jSONObject9.put("in_app_link_handling_for_android_11_enabled", true);
            }
            jSONObject7.put("click", jSONObject9);
            JSONObject jSONObject10 = new JSONObject();
            long jCurrentTimeMillis = this.zzo.currentTimeMillis();
            jSONObject10.put("time_from_last_touch_down", jCurrentTimeMillis - this.zzA);
            jSONObject10.put("time_from_last_touch", jCurrentTimeMillis - this.zzB);
            jSONObject7.put("touch_signal", jSONObject10);
            if (this.zzj.zzb()) {
                JSONObject jSONObject11 = (JSONObject) this.zzc.get("tracking_urls_and_actions");
                String string = jSONObject11 != null ? jSONObject11.getString("gws_query_id") : null;
                if (string != null) {
                    this.zzt.zzq(string, this.zze);
                }
            }
            zzcag.zza(this.zzd.zzg("google.afma.nativeAds.handleClick", jSONObject7), "Error during performing handleClick");
        } catch (JSONException e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to create click JSON.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zzq(View view, View view2, Map map, Map map2, boolean z10, ImageView.ScaleType scaleType, int i) throws JSONException {
        Point point;
        Point point2;
        JSONObject jSONObject;
        JSONObject jSONObject2 = this.zzc;
        boolean z11 = false;
        if (jSONObject2.optBoolean("allow_sdk_custom_click_gesture", false)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzlM)).booleanValue()) {
                z11 = true;
            }
        }
        if (!z11) {
            if (!this.zzx) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zze("Custom click reporting failed. enableCustomClickGesture is not set.");
                return;
            } else if (!zzK()) {
                int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zze("Custom click reporting failed. Ad unit id not in the allow list.");
                return;
            }
        }
        Context context = this.zza;
        JSONObject jSONObjectZzd = com.google.android.gms.ads.internal.util.zzbv.zzd(context, map, map2, view2, scaleType);
        JSONObject jSONObjectZzh = com.google.android.gms.ads.internal.util.zzbv.zzh(context, view2);
        boolean z12 = z11;
        JSONObject jSONObjectZzg = com.google.android.gms.ads.internal.util.zzbv.zzg(view2);
        JSONObject jSONObjectZze = com.google.android.gms.ads.internal.util.zzbv.zze(context, view2);
        String strZzH = zzH(view, map);
        JSONObject jSONObjectZzc = com.google.android.gms.ads.internal.util.zzbv.zzc(strZzH, context, this.zzz, this.zzy);
        if (z12) {
            try {
                point = this.zzz;
                point2 = this.zzy;
                try {
                    jSONObject = new JSONObject();
                } catch (Exception e4) {
                    e = e4;
                    jSONObject = null;
                }
            } catch (JSONException e10) {
                int i12 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Error occurred while adding CustomClickGestureSignals to adJson.", e10);
                com.google.android.gms.ads.internal.zzv.zzp().zzw(e10, "FirstPartyNativeAdCore.performCustomClickGesture");
            }
            try {
                JSONObject jSONObject3 = new JSONObject();
                JSONObject jSONObject4 = new JSONObject();
                if (point != null) {
                    jSONObject3.put("x", point.x);
                    jSONObject3.put("y", point.y);
                }
                if (point2 != null) {
                    jSONObject4.put("x", point2.x);
                    jSONObject4.put("y", point2.y);
                }
                jSONObject.put("start_point", jSONObject3);
                jSONObject.put("end_point", jSONObject4);
                jSONObject.put("duration_ms", i);
            } catch (Exception e11) {
                e = e11;
                int i13 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Error occurred while grabbing custom click gesture signals.", e);
                jSONObject2.put("custom_click_gesture_signal", jSONObject);
                zzp(view2, jSONObjectZzh, jSONObjectZzd, jSONObjectZzg, jSONObjectZze, strZzH, jSONObjectZzc, null, z10, true);
            }
            jSONObject2.put("custom_click_gesture_signal", jSONObject);
        }
        zzp(view2, jSONObjectZzh, jSONObjectZzd, jSONObjectZzg, jSONObjectZze, strZzH, jSONObjectZzc, null, z10, true);
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zzr(View view, Map map, Map map2, ImageView.ScaleType scaleType) throws JSONException {
        Context context = this.zza;
        JSONObject jSONObjectZzd = com.google.android.gms.ads.internal.util.zzbv.zzd(context, map, map2, view, scaleType);
        JSONObject jSONObjectZzh = com.google.android.gms.ads.internal.util.zzbv.zzh(context, view);
        JSONObject jSONObjectZzg = com.google.android.gms.ads.internal.util.zzbv.zzg(view);
        JSONObject jSONObjectZze = com.google.android.gms.ads.internal.util.zzbv.zze(context, view);
        boolean zZzi = com.google.android.gms.ads.internal.util.zzbv.zzi(context, this.zzj);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.zzc);
            jSONObject.put("asset_view_signal", jSONObjectZzd);
            jSONObject.put("ad_view_signal", jSONObjectZzh);
            jSONObject.put("scroll_view_signal", jSONObjectZzg);
            jSONObject.put("lock_screen_signal", jSONObjectZze);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzdM)).booleanValue()) {
                jSONObject.put("view_signals", zzG(view));
            }
            jSONObject.put("policy_validator_enabled", zZzi);
            jSONObject.put("screen", com.google.android.gms.ads.internal.util.zzbv.zzf(context));
            zzcag.zza(this.zzd.zzg("google.afma.nativeAds.handleNativeAdSignalsLogging", jSONObject), "Error during performing handleNativeAdSignalsLogging");
        } catch (JSONException e4) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to create native ad signals logging JSON.", e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zzs() throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.zzc);
            zzcag.zza(this.zzd.zzg("google.afma.nativeAds.handleDownloadedImpression", jSONObject), "Error during performing handleDownloadedImpression");
        } catch (JSONException e4) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zzt(View view, Map map, Map map2, ImageView.ScaleType scaleType) throws JSONException {
        Context context = this.zza;
        zzL(com.google.android.gms.ads.internal.util.zzbv.zzh(context, view), com.google.android.gms.ads.internal.util.zzbv.zzd(context, map, map2, view, scaleType), com.google.android.gms.ads.internal.util.zzbv.zzg(view), com.google.android.gms.ads.internal.util.zzbv.zze(context, view), zzG(view), null, com.google.android.gms.ads.internal.util.zzbv.zzi(context, this.zzj), view);
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zzu() throws JSONException {
        zzL(null, null, null, null, null, null, false, null);
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zzv(View view, MotionEvent motionEvent, View view2) {
        this.zzy = com.google.android.gms.ads.internal.util.zzbv.zza(motionEvent, view2);
        long jCurrentTimeMillis = this.zzo.currentTimeMillis();
        this.zzB = jCurrentTimeMillis;
        if (motionEvent.getAction() == 0) {
            this.zzr.zzb(motionEvent);
            this.zzA = jCurrentTimeMillis;
            this.zzz = this.zzy;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        Point point = this.zzy;
        motionEventObtain.setLocation(point.x, point.y);
        this.zzf.zzd(motionEventObtain);
        motionEventObtain.recycle();
        zzI();
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zzw(Bundle bundle) {
        if (bundle == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Touch event data is null. No touch event is reported.");
        } else {
            if (!zzJ("touch_reporting")) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("The ad slot cannot handle external touch events. You must be in the allow list to be able to report your touch events.");
                return;
            }
            this.zzf.zzc().zzl((int) bundle.getFloat("x"), (int) bundle.getFloat("y"), bundle.getInt("duration_ms"));
            zzI();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zzx(View view) {
        if (!this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("setClickConfirmingView: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
            return;
        }
        zzdjs zzdjsVar = this.zzn;
        if (view == null) {
            return;
        }
        view.setOnClickListener(zzdjsVar);
        view.setClickable(true);
        zzdjsVar.zzc = new WeakReference(view);
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zzy() {
        this.zzx = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zzz(com.google.android.gms.ads.internal.client.zzdf zzdfVar) {
        this.zzC = zzdfVar;
    }
}
