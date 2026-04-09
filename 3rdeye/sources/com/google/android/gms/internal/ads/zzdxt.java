package com.google.android.gms.internal.ads;

import N7.C1154e9;
import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzdxt {
    private static final Pattern zza = Pattern.compile("\\?");
    private final zzcgz zzb;
    private final Context zzc;
    private final VersionInfoParcel zzd;
    private final zzfco zze;
    private final Executor zzf;
    private final ScheduledExecutorService zzg;
    private final String zzh;
    private final zzfhm zzi;
    private final zzdrw zzj;
    private final zzfjq zzk;
    private final zzcyr zzl;
    private final Object zzm = new Object();
    private String zzn;
    private List zzo;
    private Bundle zzp;
    private final zzbvw zzq;

    public zzdxt(zzcgz zzcgzVar, Context context, VersionInfoParcel versionInfoParcel, zzfco zzfcoVar, Executor executor, String str, zzfhm zzfhmVar, zzdrw zzdrwVar, zzbvw zzbvwVar, zzdzy zzdzyVar, ScheduledExecutorService scheduledExecutorService, zzfjq zzfjqVar, zzcyr zzcyrVar) {
        this.zzb = zzcgzVar;
        this.zzc = context;
        this.zzd = versionInfoParcel;
        this.zze = zzfcoVar;
        this.zzf = executor;
        this.zzh = str;
        this.zzi = zzfhmVar;
        zzcgzVar.zzw();
        this.zzj = zzdrwVar;
        this.zzq = zzbvwVar;
        this.zzg = scheduledExecutorService;
        this.zzk = zzfjqVar;
        this.zzl = zzcyrVar;
    }

    public static /* synthetic */ A4.a zzb(zzdxt zzdxtVar, List list, Exception exc) {
        zzegx zzegxVar;
        com.google.android.gms.ads.internal.zzv.zzp().zzv(exc, "PreloadedLoader.getTypeTwoAdResponseString");
        if (exc instanceof TimeoutException) {
            zzegxVar = new zzegx(1, "Timed out waiting for ad response.");
        } else if (exc instanceof zzegx) {
            zzegxVar = (zzegx) exc;
        } else {
            zzegxVar = new zzegx(1, exc.getMessage() == null ? "Fetch failed." : exc.getMessage());
        }
        String message = zzegxVar.getMessage() == null ? "" : zzegxVar.getMessage();
        if (list != null && !list.isEmpty()) {
            String str = "0.6.0.0";
            if (!TextUtils.isEmpty(message)) {
                if (message.contains("Timed out waiting for ad response.")) {
                    message = "timeout";
                    str = "0.2.0.0";
                } else if (message.contains("Received HTTP error code from ad server:")) {
                    List listZzf = zzfvt.zzb(zzfup.zzc(':')).zzf(message);
                    if (listZzf.size() == 2) {
                        message = (String) listZzf.get(1);
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(zzfjm.zzc(zzfjm.zzc((String) it.next(), "@gw_adnetstatus@", str), "@error_code@", message));
            }
            zzdxtVar.zzk.zze(arrayList, null);
        }
        return zzgdb.zzg(zzegxVar);
    }

    public static /* synthetic */ A4.a zzc(zzdxt zzdxtVar, JSONObject jSONObject) {
        zzfcc zzfccVar = new zzfcc(zzdxtVar.zze);
        String string = jSONObject.toString();
        return zzgdb.zzh(new zzfcf(zzfccVar, zzfce.zza(new StringReader(string), zzdxtVar.zzp)));
    }

    public static /* synthetic */ A4.a zzd(zzdxt zzdxtVar, zzbok zzbokVar, JSONObject jSONObject) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzcq)).booleanValue()) {
            C1154e9.l(zzdxtVar.zzj.zza(), zzdrk.SCAR_PRELOADER_PROCESSING_DONE.zza());
        }
        return zzbokVar.zzb(jSONObject);
    }

    public static /* synthetic */ String zzf(zzdxt zzdxtVar, zzdzv zzdzvVar) throws zzegx {
        zzdxtVar.zzi(zzdrk.RENDERING_ADSTRING_TYPE2_FETCH_START);
        int i = 0;
        int i10 = -1;
        while (true) {
            try {
                if (i >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzhn)).intValue()) {
                    throw new zzegx(1, "Received HTTP error code from ad server:" + i10);
                }
                zzdzw zzdzwVarZzb = new zzdzx(zzdxtVar.zzc, zzdxtVar.zzd.afmaVersion, zzdxtVar.zzq, Binder.getCallingUid()).zza(zzdzvVar);
                int i11 = zzdzwVarZzb.zza;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzho)).booleanValue()) {
                    zzdxtVar.zzj.zzd("fr", String.valueOf(i));
                }
                if (i11 == 200) {
                    zzdxtVar.zzi(zzdrk.RENDERING_ADSTRING_TYPE2_FETCH_END);
                    return zzdzwVarZzb.zzc;
                }
                i++;
                i10 = i11;
            } catch (Exception e4) {
                throw new zzegx(1, e4.getMessage() == null ? "Fetch failed." : e4.getMessage(), e4);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final A4.a zzg(java.lang.String r18, final java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdxt.zzg(java.lang.String, java.lang.String):A4.a");
    }

    private final String zzh(String str) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray("ad_types");
            if (jSONArray != null && "unknown".equals(jSONArray.getString(0))) {
                jSONObject.put("ad_types", new JSONArray().put(this.zzh));
            }
            return jSONObject.toString();
        } catch (JSONException e4) {
            String strConcat = "Failed to update the ad types for rendering. ".concat(e4.toString());
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj(strConcat);
            return str;
        }
    }

    private final void zzi(zzdrk zzdrkVar) {
        Bundle bundleZza = this.zzj.zza();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzho)).booleanValue()) {
            C1154e9.l(bundleZza, zzdrkVar.zza());
        }
    }

    private static final String zzj(String str) {
        try {
            return new JSONObject(str).optString(CommonUrlParts.REQUEST_ID, "");
        } catch (JSONException unused) {
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00f8 A[Catch: all -> 0x00e5, TRY_ENTER, TryCatch #3 {all -> 0x00e5, blocks: (B:21:0x0078, B:23:0x0096, B:25:0x009c, B:27:0x00b3, B:29:0x00bb, B:37:0x00f8, B:39:0x0100, B:41:0x0106, B:45:0x010f, B:56:0x0149, B:48:0x0121, B:55:0x0132, B:58:0x014e, B:34:0x00e8, B:59:0x0164, B:66:0x017d, B:69:0x0185, B:73:0x01a9, B:75:0x01be, B:79:0x01e1, B:81:0x01f6, B:84:0x020a, B:86:0x0210, B:87:0x021d, B:89:0x021f, B:92:0x0228, B:91:0x0225, B:80:0x01eb, B:76:0x01d1, B:72:0x0193, B:63:0x016d, B:64:0x0172), top: B:123:0x0078, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01e1 A[Catch: all -> 0x00e5, TryCatch #3 {all -> 0x00e5, blocks: (B:21:0x0078, B:23:0x0096, B:25:0x009c, B:27:0x00b3, B:29:0x00bb, B:37:0x00f8, B:39:0x0100, B:41:0x0106, B:45:0x010f, B:56:0x0149, B:48:0x0121, B:55:0x0132, B:58:0x014e, B:34:0x00e8, B:59:0x0164, B:66:0x017d, B:69:0x0185, B:73:0x01a9, B:75:0x01be, B:79:0x01e1, B:81:0x01f6, B:84:0x020a, B:86:0x0210, B:87:0x021d, B:89:0x021f, B:92:0x0228, B:91:0x0225, B:80:0x01eb, B:76:0x01d1, B:72:0x0193, B:63:0x016d, B:64:0x0172), top: B:123:0x0078, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01eb A[Catch: all -> 0x00e5, TryCatch #3 {all -> 0x00e5, blocks: (B:21:0x0078, B:23:0x0096, B:25:0x009c, B:27:0x00b3, B:29:0x00bb, B:37:0x00f8, B:39:0x0100, B:41:0x0106, B:45:0x010f, B:56:0x0149, B:48:0x0121, B:55:0x0132, B:58:0x014e, B:34:0x00e8, B:59:0x0164, B:66:0x017d, B:69:0x0185, B:73:0x01a9, B:75:0x01be, B:79:0x01e1, B:81:0x01f6, B:84:0x020a, B:86:0x0210, B:87:0x021d, B:89:0x021f, B:92:0x0228, B:91:0x0225, B:80:0x01eb, B:76:0x01d1, B:72:0x0193, B:63:0x016d, B:64:0x0172), top: B:123:0x0078, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0208 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0225 A[Catch: all -> 0x00e5, TryCatch #3 {all -> 0x00e5, blocks: (B:21:0x0078, B:23:0x0096, B:25:0x009c, B:27:0x00b3, B:29:0x00bb, B:37:0x00f8, B:39:0x0100, B:41:0x0106, B:45:0x010f, B:56:0x0149, B:48:0x0121, B:55:0x0132, B:58:0x014e, B:34:0x00e8, B:59:0x0164, B:66:0x017d, B:69:0x0185, B:73:0x01a9, B:75:0x01be, B:79:0x01e1, B:81:0x01f6, B:84:0x020a, B:86:0x0210, B:87:0x021d, B:89:0x021f, B:92:0x0228, B:91:0x0225, B:80:0x01eb, B:76:0x01d1, B:72:0x0193, B:63:0x016d, B:64:0x0172), top: B:123:0x0078, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0230  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final A4.a zze() {
        /*
            Method dump skipped, instructions count: 682
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdxt.zze():A4.a");
    }
}
