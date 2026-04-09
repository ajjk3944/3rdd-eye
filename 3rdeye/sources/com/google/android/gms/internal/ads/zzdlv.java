package com.google.android.gms.internal.ads;

import N7.C1154e9;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.github.appintro.AppIntroBaseFragmentKt;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.ImagesContract;
import com.singular.sdk.internal.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzdlv {
    private final Context zza;
    private final zzdlb zzb;
    private final zzavs zzc;
    private final VersionInfoParcel zzd;
    private final com.google.android.gms.ads.internal.zza zze;
    private final zzbca zzf;
    private final Executor zzg;
    private final zzbgc zzh;
    private final zzdmn zzi;
    private final zzdpc zzj;
    private final ScheduledExecutorService zzk;
    private final zzdnx zzl;
    private final zzdsc zzm;
    private final zzfjq zzn;
    private final zzebs zzo;
    private final zzecd zzp;
    private final zzfcs zzq;
    private final zzdrw zzr;

    public zzdlv(Context context, zzdlb zzdlbVar, zzavs zzavsVar, VersionInfoParcel versionInfoParcel, com.google.android.gms.ads.internal.zza zzaVar, zzbca zzbcaVar, Executor executor, zzfco zzfcoVar, zzdmn zzdmnVar, zzdpc zzdpcVar, ScheduledExecutorService scheduledExecutorService, zzdsc zzdscVar, zzfjq zzfjqVar, zzebs zzebsVar, zzdnx zzdnxVar, zzecd zzecdVar, zzfcs zzfcsVar, zzdrw zzdrwVar) {
        this.zza = context;
        this.zzb = zzdlbVar;
        this.zzc = zzavsVar;
        this.zzd = versionInfoParcel;
        this.zze = zzaVar;
        this.zzf = zzbcaVar;
        this.zzg = executor;
        this.zzh = zzfcoVar.zzi;
        this.zzi = zzdmnVar;
        this.zzj = zzdpcVar;
        this.zzk = scheduledExecutorService;
        this.zzm = zzdscVar;
        this.zzn = zzfjqVar;
        this.zzo = zzebsVar;
        this.zzl = zzdnxVar;
        this.zzp = zzecdVar;
        this.zzq = zzfcsVar;
        this.zzr = zzdrwVar;
    }

    public static /* synthetic */ zzbfx zza(zzdlv zzdlvVar, JSONObject jSONObject, List list) throws JSONException {
        if (list == null || list.isEmpty()) {
            return null;
        }
        String strOptString = jSONObject.optString("text");
        Integer numZzs = zzs(jSONObject, AppIntroBaseFragmentKt.ARG_BG_COLOR);
        Integer numZzs2 = zzs(jSONObject, "text_color");
        int iOptInt = jSONObject.optInt("text_size", -1);
        boolean zOptBoolean = jSONObject.optBoolean("allow_pub_rendering");
        int iOptInt2 = jSONObject.optInt("animation_ms", 1000);
        return new zzbfx(strOptString, list, numZzs, numZzs2, iOptInt > 0 ? Integer.valueOf(iOptInt) : null, jSONObject.optInt("presentation_ms", 4000) + iOptInt2, zzdlvVar.zzh.zze, zOptBoolean);
    }

    public static /* synthetic */ A4.a zzb(zzdlv zzdlvVar, String str, zzbxy zzbxyVar, com.google.android.gms.ads.internal.zzb zzbVar, Object obj) throws zzcfq {
        com.google.android.gms.ads.internal.zzv.zzB();
        Context context = zzdlvVar.zza;
        zzecd zzecdVar = zzdlvVar.zzp;
        zzcfe zzcfeVarZza = zzcfr.zza(context, zzcgy.zza(), "native-omid", false, false, zzdlvVar.zzc, null, zzdlvVar.zzd, null, null, zzdlvVar.zze, zzdlvVar.zzf, null, null, zzecdVar, zzdlvVar.zzq, zzdlvVar.zzm);
        final zzcah zzcahVarZza = zzcah.zza(zzcfeVarZza);
        zzcfeVarZza.zzN().zzC(new zzcgu() { // from class: com.google.android.gms.internal.ads.zzdlm
            @Override // com.google.android.gms.internal.ads.zzcgu
            public final void zza(boolean z10, int i, String str2, String str3) {
                zzcahVarZza.zzb();
            }
        });
        zzcfeVarZza.loadData(Base64.encodeToString(str.getBytes(), 1), "text/html", "base64");
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zznE)).booleanValue()) {
            if (zzbxyVar != null) {
                zzcfeVarZza.zzN().zzL(zzbxyVar);
            }
            zzcfeVarZza.zzN().zzD(zzbVar);
        }
        return zzcahVarZza;
    }

    public static /* synthetic */ A4.a zzc(zzdlv zzdlvVar, com.google.android.gms.ads.internal.client.zzr zzrVar, zzfbt zzfbtVar, zzfbw zzfbwVar, com.google.android.gms.ads.internal.zzb zzbVar, zzbxy zzbxyVar, String str, String str2, Object obj) throws zzcfq {
        zzcfe zzcfeVarZza = zzdlvVar.zzj.zza(zzrVar, zzfbtVar, zzfbwVar);
        final zzcah zzcahVarZza = zzcah.zza(zzcfeVarZza);
        zzdnu zzdnuVarZzb = zzdlvVar.zzl.zzb();
        zzcgw zzcgwVarZzN = zzcfeVarZza.zzN();
        zzbct zzbctVar = zzbdc.zznE;
        zzcgwVarZzN.zzX(zzdnuVarZzb, zzdnuVarZzb, zzdnuVarZzb, zzdnuVarZzb, zzdnuVarZzb, false, null, !((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbctVar)).booleanValue() ? new com.google.android.gms.ads.internal.zzb(zzdlvVar.zza, null, null) : zzbVar, null, true != ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbctVar)).booleanValue() ? null : zzbxyVar, zzdlvVar.zzo, zzdlvVar.zzn, zzdlvVar.zzm, null, zzdnuVarZzb, null, null, null, null);
        zzcfeVarZza.zzag("/getNativeAdViewSignals", zzbkc.zzs);
        zzcfeVarZza.zzag("/getNativeClickMeta", zzbkc.zzt);
        zzcfeVarZza.zzN().zzG(true);
        zzcfeVarZza.zzN().zzC(new zzcgu() { // from class: com.google.android.gms.internal.ads.zzdlr
            @Override // com.google.android.gms.internal.ads.zzcgu
            public final void zza(boolean z10, int i, String str3, String str4) {
                zzcah zzcahVar = zzcahVarZza;
                if (z10) {
                    zzcahVar.zzb();
                    return;
                }
                zzcahVar.zzd(new zzegx(1, "Image Web View failed to load. Error code: " + i + ", Description: " + str3 + ", Failing URL: " + str4));
            }
        });
        zzcfeVarZza.zzae(str, str2, null);
        return zzcahVarZza;
    }

    public static final com.google.android.gms.ads.internal.client.zzfa zzk(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("mute");
        if (jSONObjectOptJSONObject2 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("default_reason")) == null) {
            return null;
        }
        return zzt(jSONObjectOptJSONObject);
    }

    public static final List zzl(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("mute");
        if (jSONObjectOptJSONObject == null) {
            return zzfyf.zzn();
        }
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("reasons");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return zzfyf.zzn();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            com.google.android.gms.ads.internal.client.zzfa zzfaVarZzt = zzt(jSONArrayOptJSONArray.optJSONObject(i));
            if (zzfaVarZzt != null) {
                arrayList.add(zzfaVarZzt);
            }
        }
        return zzfyf.zzl(arrayList);
    }

    private final com.google.android.gms.ads.internal.client.zzr zzm(int i, int i10) {
        if (i == 0) {
            if (i10 == 0) {
                return com.google.android.gms.ads.internal.client.zzr.zzc();
            }
            i = 0;
        }
        return new com.google.android.gms.ads.internal.client.zzr(this.zza, new AdSize(i, i10));
    }

    private static A4.a zzn(A4.a aVar, Object obj) {
        final Object obj2 = null;
        return zzgdb.zzf(aVar, Exception.class, new zzgci(obj2) { // from class: com.google.android.gms.internal.ads.zzdln
            @Override // com.google.android.gms.internal.ads.zzgci
            public final A4.a zza(Object obj3) {
                com.google.android.gms.ads.internal.util.zze.zzb("Error during loading assets.", (Exception) obj3);
                return zzgdb.zzh(null);
            }
        }, zzcad.zzg);
    }

    private static A4.a zzo(boolean z10, final A4.a aVar, Object obj) {
        return z10 ? zzgdb.zzn(aVar, new zzgci() { // from class: com.google.android.gms.internal.ads.zzdlp
            @Override // com.google.android.gms.internal.ads.zzgci
            public final A4.a zza(Object obj2) {
                return obj2 != null ? aVar : zzgdb.zzg(new zzegx(1, "Retrieve required value in native ad response failed."));
            }
        }, zzcad.zzg) : zzn(aVar, null);
    }

    private final A4.a zzp(JSONObject jSONObject, boolean z10, zzdrk zzdrkVar) {
        if (jSONObject == null) {
            return zzgdb.zzh(null);
        }
        final String strOptString = jSONObject.optString(ImagesContract.URL);
        if (TextUtils.isEmpty(strOptString)) {
            return zzgdb.zzh(null);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzcv)).booleanValue() && zzdrkVar != null) {
            C1154e9.l(this.zzr.zza(), zzdrkVar.zza());
        }
        final double dOptDouble = jSONObject.optDouble("scale", 1.0d);
        boolean zOptBoolean = jSONObject.optBoolean("is_transparent", true);
        final int iOptInt = jSONObject.optInt("width", -1);
        final int iOptInt2 = jSONObject.optInt("height", -1);
        if (z10) {
            return zzgdb.zzh(new zzbga(null, Uri.parse(strOptString), dOptDouble, iOptInt, iOptInt2));
        }
        return zzo(jSONObject.optBoolean("require"), zzgdb.zzm(this.zzb.zzb(strOptString, dOptDouble, zOptBoolean), new zzfut() { // from class: com.google.android.gms.internal.ads.zzdll
            @Override // com.google.android.gms.internal.ads.zzfut
            public final Object apply(Object obj) {
                return new zzbga(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(strOptString), dOptDouble, iOptInt, iOptInt2);
            }
        }, this.zzg), null);
    }

    private final A4.a zzq(JSONArray jSONArray, boolean z10, boolean z11, zzdrk zzdrkVar) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return zzgdb.zzh(Collections.EMPTY_LIST);
        }
        ArrayList arrayList = new ArrayList();
        int length = z11 ? jSONArray.length() : 1;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzcv)).booleanValue()) {
            C1154e9.l(this.zzr.zza(), zzdrkVar.zza());
        }
        for (int i = 0; i < length; i++) {
            arrayList.add(zzp(jSONArray.optJSONObject(i), z10, null));
        }
        return zzgdb.zzm(zzgdb.zzd(arrayList), new zzfut() { // from class: com.google.android.gms.internal.ads.zzdli
            @Override // com.google.android.gms.internal.ads.zzfut
            public final Object apply(Object obj) {
                ArrayList arrayList2 = new ArrayList();
                for (zzbga zzbgaVar : (List) obj) {
                    if (zzbgaVar != null) {
                        arrayList2.add(zzbgaVar);
                    }
                }
                return arrayList2;
            }
        }, this.zzg);
    }

    private final A4.a zzr(JSONObject jSONObject, zzfbt zzfbtVar, zzfbw zzfbwVar, com.google.android.gms.ads.internal.zzb zzbVar, zzbxy zzbxyVar) {
        final A4.a aVarZze = this.zzi.zze(jSONObject.optString("base_url"), jSONObject.optString("html"), zzfbtVar, zzfbwVar, zzm(jSONObject.optInt("width", 0), jSONObject.optInt("height", 0)), zzbVar, zzbxyVar);
        return zzgdb.zzn(aVarZze, new zzgci() { // from class: com.google.android.gms.internal.ads.zzdlo
            @Override // com.google.android.gms.internal.ads.zzgci
            public final A4.a zza(Object obj) throws zzegx {
                zzcfe zzcfeVar = (zzcfe) obj;
                if (zzcfeVar == null || zzcfeVar.zzq() == null) {
                    throw new zzegx(1, "Retrieve video view in html5 ad response failed.");
                }
                return aVarZze;
            }
        }, zzcad.zzg);
    }

    private static Integer zzs(JSONObject jSONObject, String str) throws JSONException {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt(Constants.REVENUE_AMOUNT_KEY), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    private static final com.google.android.gms.ads.internal.client.zzfa zzt(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String strOptString = jSONObject.optString("reason");
        String strOptString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2)) {
            return null;
        }
        return new com.google.android.gms.ads.internal.client.zzfa(strOptString, strOptString2);
    }

    public final A4.a zzd(JSONObject jSONObject, String str, zzdrk zzdrkVar) {
        final JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("attribution");
        if (jSONObjectOptJSONObject == null) {
            return zzgdb.zzh(null);
        }
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("images");
        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("image");
        if (jSONArrayOptJSONArray == null && jSONObjectOptJSONObject2 != null) {
            jSONArrayOptJSONArray = new JSONArray();
            jSONArrayOptJSONArray.put(jSONObjectOptJSONObject2);
        }
        return zzo(jSONObjectOptJSONObject.optBoolean("require"), zzgdb.zzm(zzq(jSONArrayOptJSONArray, false, true, zzdrkVar), new zzfut() { // from class: com.google.android.gms.internal.ads.zzdlq
            @Override // com.google.android.gms.internal.ads.zzfut
            public final Object apply(Object obj) {
                return zzdlv.zza(this.zza, jSONObjectOptJSONObject, (List) obj);
            }
        }, this.zzg), null);
    }

    public final A4.a zze(JSONObject jSONObject, String str, zzdrk zzdrkVar) {
        return zzp(jSONObject.optJSONObject(str), this.zzh.zzb, zzdrkVar);
    }

    public final A4.a zzf(JSONObject jSONObject, String str, zzdrk zzdrkVar) {
        zzbgc zzbgcVar = this.zzh;
        return zzq(jSONObject.optJSONArray("images"), zzbgcVar.zzb, zzbgcVar.zzd, zzdrkVar);
    }

    public final A4.a zzg(JSONObject jSONObject, String str, final zzfbt zzfbtVar, final zzfbw zzfbwVar, final com.google.android.gms.ads.internal.zzb zzbVar, final zzbxy zzbxyVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzkm)).booleanValue()) {
            return zzgdb.zzh(null);
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("images");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return zzgdb.zzh(null);
        }
        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(0);
        if (jSONObjectOptJSONObject == null) {
            return zzgdb.zzh(null);
        }
        final String strOptString = jSONObjectOptJSONObject.optString("base_url");
        final String strOptString2 = jSONObjectOptJSONObject.optString("html");
        final com.google.android.gms.ads.internal.client.zzr zzrVarZzm = zzm(jSONObjectOptJSONObject.optInt("width", 0), jSONObjectOptJSONObject.optInt("height", 0));
        if (TextUtils.isEmpty(strOptString2)) {
            return zzgdb.zzh(null);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzcv)).booleanValue()) {
            C1154e9.l(this.zzr.zza(), zzdrk.NATIVE_ASSETS_LOADING_IMAGE_COMPOSITION_START.zza());
        }
        final A4.a aVarZzn = zzgdb.zzn(zzgdb.zzh(null), new zzgci() { // from class: com.google.android.gms.internal.ads.zzdls
            @Override // com.google.android.gms.internal.ads.zzgci
            public final A4.a zza(Object obj) {
                return zzdlv.zzc(this.zza, zzrVarZzm, zzfbtVar, zzfbwVar, zzbVar, zzbxyVar, strOptString, strOptString2, obj);
            }
        }, zzcad.zzf);
        return zzgdb.zzn(aVarZzn, new zzgci() { // from class: com.google.android.gms.internal.ads.zzdlj
            @Override // com.google.android.gms.internal.ads.zzgci
            public final A4.a zza(Object obj) throws zzegx {
                if (((zzcfe) obj) != null) {
                    return aVarZzn;
                }
                throw new zzegx(1, "Retrieve Web View from image ad response failed.");
            }
        }, zzcad.zzg);
    }

    public final A4.a zzh(A4.a aVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzcv)).booleanValue()) {
            C1154e9.l(this.zzr.zza(), zzdrk.NATIVE_ASSETS_LOADING_MEDIA_START.zza());
        }
        zzcai zzcaiVar = new zzcai();
        zzgdb.zzr(aVar, new zzdlu(this, zzcaiVar), zzcad.zzf);
        return zzcaiVar;
    }

    public final A4.a zzi(JSONObject jSONObject, final com.google.android.gms.ads.internal.zzb zzbVar, final zzbxy zzbxyVar) {
        if (!jSONObject.optBoolean("enable_omid")) {
            return zzgdb.zzh(null);
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("omid_settings");
        if (jSONObjectOptJSONObject == null) {
            return zzgdb.zzh(null);
        }
        final String strOptString = jSONObjectOptJSONObject.optString("omid_html");
        if (TextUtils.isEmpty(strOptString)) {
            return zzgdb.zzh(null);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzcv)).booleanValue()) {
            C1154e9.l(this.zzr.zza(), zzdrk.NATIVE_ASSETS_LOADING_OMID_START.zza());
        }
        return zzgdb.zzn(zzgdb.zzh(null), new zzgci() { // from class: com.google.android.gms.internal.ads.zzdlk
            @Override // com.google.android.gms.internal.ads.zzgci
            public final A4.a zza(Object obj) {
                return zzdlv.zzb(this.zza, strOptString, zzbxyVar, zzbVar, obj);
            }
        }, zzcad.zzf);
    }

    public final A4.a zzj(JSONObject jSONObject, zzfbt zzfbtVar, zzfbw zzfbwVar, com.google.android.gms.ads.internal.zzb zzbVar, zzbxy zzbxyVar) {
        A4.a aVarZzd;
        zzdlv zzdlvVar;
        JSONObject jSONObjectZzh = com.google.android.gms.ads.internal.util.zzbs.zzh(jSONObject, "html_containers", "instream");
        if (jSONObjectZzh != null) {
            return zzr(jSONObjectZzh, zzfbtVar, zzfbwVar, zzbVar, zzbxyVar);
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("video");
        if (jSONObjectOptJSONObject == null) {
            return zzgdb.zzh(null);
        }
        String strOptString = jSONObjectOptJSONObject.optString("vast_xml");
        boolean z10 = false;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzkl)).booleanValue() && jSONObjectOptJSONObject.has("html")) {
            z10 = true;
        }
        if (!TextUtils.isEmpty(strOptString)) {
            if (!z10) {
                aVarZzd = this.zzi.zzd(jSONObjectOptJSONObject, zzbVar, zzbxyVar);
                zzdlvVar = this;
            }
            return zzn(zzgdb.zzo(aVarZzd, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzea)).intValue(), TimeUnit.SECONDS, zzdlvVar.zzk), null);
        }
        if (!z10) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Required field 'vast_xml' or 'html' is missing");
            return zzgdb.zzh(null);
        }
        zzdlvVar = this;
        aVarZzd = zzdlvVar.zzr(jSONObjectOptJSONObject, zzfbtVar, zzfbwVar, zzbVar, zzbxyVar);
        return zzn(zzgdb.zzo(aVarZzd, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzea)).intValue(), TimeUnit.SECONDS, zzdlvVar.zzk), null);
    }
}
