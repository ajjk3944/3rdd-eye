package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
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

/* loaded from: classes2.dex */
public final class zzeeg {
    private static final Pattern zza = Pattern.compile("\\?");
    private final zzcma zzb;
    private final Context zzc;
    private final VersionInfoParcel zzd;
    private final zzfjk zze;
    private final Executor zzf;
    private final ScheduledExecutorService zzg;
    private final String zzh;
    private final zzfoo zzi;
    private final zzdxt zzj;
    private final zzfqk zzk;
    private final zzdej zzl;
    private final Object zzm = new Object();
    private String zzn;
    private List zzo;

    @Nullable
    private Bundle zzp;
    private final zzcac zzq;

    public zzeeg(zzcma zzcmaVar, Context context, VersionInfoParcel versionInfoParcel, zzfjk zzfjkVar, Executor executor, String str, zzfoo zzfooVar, zzdxt zzdxtVar, zzcac zzcacVar, zzehb zzehbVar, ScheduledExecutorService scheduledExecutorService, zzfqk zzfqkVar, zzdej zzdejVar) {
        this.zzb = zzcmaVar;
        this.zzc = context;
        this.zzd = versionInfoParcel;
        this.zze = zzfjkVar;
        this.zzf = executor;
        this.zzh = str;
        this.zzi = zzfooVar;
        zzcmaVar.zzB();
        this.zzj = zzdxtVar;
        this.zzq = zzcacVar;
        this.zzg = scheduledExecutorService;
        this.zzk = zzfqkVar;
        this.zzl = zzdejVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.google.common.util.concurrent.a zzg(@androidx.annotation.Nullable java.lang.String r18, final java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeeg.zzg(java.lang.String, java.lang.String):com.google.common.util.concurrent.a");
    }

    private final void zzh(zzdxh zzdxhVar) {
        Bundle bundleZze = this.zzj.zze();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzif)).booleanValue()) {
            bundleZze.putLong(zzdxhVar.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
    }

    private final String zzi(String str) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray("ad_types");
            if (jSONArray != null && "unknown".equals(jSONArray.getString(0))) {
                jSONObject.put("ad_types", new JSONArray().put(this.zzh));
            }
            return jSONObject.toString();
        } catch (JSONException e10) {
            String strConcat = "Failed to update the ad types for rendering. ".concat(e10.toString());
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(strConcat);
            return str;
        }
    }

    private static final String zzj(String str) {
        try {
            return new JSONObject(str).optString("request_id", "");
        } catch (JSONException unused) {
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x01ee A[Catch: all -> 0x00e4, TryCatch #3 {all -> 0x00e4, blocks: (B:21:0x0080, B:23:0x009e, B:25:0x00a6, B:27:0x00b3, B:29:0x00cd, B:33:0x00fd, B:36:0x0109, B:38:0x0111, B:40:0x0117, B:44:0x0120, B:53:0x0158, B:47:0x0134, B:52:0x0143, B:55:0x015d, B:32:0x00e7, B:56:0x0171, B:63:0x018e, B:66:0x0196, B:70:0x01b8, B:72:0x01cd, B:76:0x01ee, B:78:0x0203, B:81:0x0217, B:83:0x021d, B:84:0x022a, B:86:0x022c, B:89:0x0235, B:88:0x0232, B:77:0x01f8, B:73:0x01e0, B:69:0x01a4, B:60:0x017e, B:61:0x0183), top: B:119:0x0080, inners: #1, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f8 A[Catch: all -> 0x00e4, TryCatch #3 {all -> 0x00e4, blocks: (B:21:0x0080, B:23:0x009e, B:25:0x00a6, B:27:0x00b3, B:29:0x00cd, B:33:0x00fd, B:36:0x0109, B:38:0x0111, B:40:0x0117, B:44:0x0120, B:53:0x0158, B:47:0x0134, B:52:0x0143, B:55:0x015d, B:32:0x00e7, B:56:0x0171, B:63:0x018e, B:66:0x0196, B:70:0x01b8, B:72:0x01cd, B:76:0x01ee, B:78:0x0203, B:81:0x0217, B:83:0x021d, B:84:0x022a, B:86:0x022c, B:89:0x0235, B:88:0x0232, B:77:0x01f8, B:73:0x01e0, B:69:0x01a4, B:60:0x017e, B:61:0x0183), top: B:119:0x0080, inners: #1, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0215 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0232 A[Catch: all -> 0x00e4, TryCatch #3 {all -> 0x00e4, blocks: (B:21:0x0080, B:23:0x009e, B:25:0x00a6, B:27:0x00b3, B:29:0x00cd, B:33:0x00fd, B:36:0x0109, B:38:0x0111, B:40:0x0117, B:44:0x0120, B:53:0x0158, B:47:0x0134, B:52:0x0143, B:55:0x015d, B:32:0x00e7, B:56:0x0171, B:63:0x018e, B:66:0x0196, B:70:0x01b8, B:72:0x01cd, B:76:0x01ee, B:78:0x0203, B:81:0x0217, B:83:0x021d, B:84:0x022a, B:86:0x022c, B:89:0x0235, B:88:0x0232, B:77:0x01f8, B:73:0x01e0, B:69:0x01a4, B:60:0x017e, B:61:0x0183), top: B:119:0x0080, inners: #1, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x023d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.common.util.concurrent.a zza() {
        /*
            Method dump skipped, instructions count: 695
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeeg.zza():com.google.common.util.concurrent.a");
    }

    public final /* synthetic */ com.google.common.util.concurrent.a zzb(zzbsp zzbspVar, JSONObject jSONObject) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcM)).booleanValue()) {
            this.zzj.zze().putLong(zzdxh.SCAR_PRELOADER_PROCESSING_DONE.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        return zzbspVar.zzb(jSONObject);
    }

    public final /* synthetic */ com.google.common.util.concurrent.a zzc(JSONObject jSONObject) {
        zzfiz zzfizVar = new zzfiz(this.zze);
        String string = jSONObject.toString();
        return zzgzo.zza(new zzfjc(zzfizVar, zzfjb.zza(new StringReader(string), this.zzp)));
    }

    public final /* synthetic */ String zzd(zzegy zzegyVar) throws zzenv {
        zzh(zzdxh.RENDERING_ADSTRING_TYPE2_FETCH_START);
        int i10 = 0;
        int i11 = -1;
        while (true) {
            try {
                if (i10 >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzie)).intValue()) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i11).length() + 40);
                    sb.append("Received HTTP error code from ad server:");
                    sb.append(i11);
                    throw new zzenv(1, sb.toString());
                }
                zzegz zzegzVarZzb = new zzeha(this.zzc, this.zzd.afmaVersion, this.zzq, Binder.getCallingUid(), null).zza(zzegyVar);
                int i12 = zzegzVarZzb.zza;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzif)).booleanValue()) {
                    this.zzj.zzd("fr", String.valueOf(i10));
                }
                if (i12 == 200) {
                    zzh(zzdxh.RENDERING_ADSTRING_TYPE2_FETCH_END);
                    return zzegzVarZzb.zzc;
                }
                i10++;
                i11 = i12;
            } catch (Exception e10) {
                throw new zzenv(1, e10.getMessage() == null ? "Fetch failed." : e10.getMessage(), e10);
            }
        }
    }

    public final /* synthetic */ com.google.common.util.concurrent.a zze(List list, Exception exc) {
        zzenv zzenvVar;
        com.google.android.gms.ads.internal.zzt.zzh().zzh(exc, "PreloadedLoader.getTypeTwoAdResponseString");
        if (exc instanceof TimeoutException) {
            zzenvVar = new zzenv(1, "Timed out waiting for ad response.");
        } else if (exc instanceof zzenv) {
            zzenvVar = (zzenv) exc;
        } else {
            zzenvVar = new zzenv(1, exc.getMessage() == null ? "Fetch failed." : exc.getMessage());
        }
        String message = zzenvVar.getMessage() == null ? "" : zzenvVar.getMessage();
        if (list != null && !list.isEmpty()) {
            String str = "0.6.0.0";
            if (!TextUtils.isEmpty(message)) {
                if (message.contains("Timed out waiting for ad response.")) {
                    message = "timeout";
                    str = "0.2.0.0";
                } else if (message.contains("Received HTTP error code from ad server:")) {
                    List listZze = zzgrr.zza(zzgqq.zzc(':')).zze(message);
                    if (listZze.size() == 2) {
                        message = (String) listZze.get(1);
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(zzfqg.zzd(zzfqg.zzd((String) it.next(), "@gw_adnetstatus@", str), "@error_code@", message));
            }
            this.zzk.zza(arrayList, null);
        }
        return zzgzo.zzc(zzenvVar);
    }

    public final /* synthetic */ zzdej zzf() {
        return this.zzl;
    }
}
