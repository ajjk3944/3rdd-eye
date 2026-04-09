package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.RemoteException;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.AppLovinMediationProvider;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzdvb implements zzdwc, zzdum {
    private final zzdvm zza;
    private final zzdwd zzb;
    private final zzdun zzc;
    private final zzduw zzd;
    private final zzdul zze;
    private final zzdvy zzf;
    private final zzdvi zzg;
    private final zzdvi zzh;
    private final String zzi;
    private final Context zzj;
    private final String zzk;
    private JSONObject zzp;
    private boolean zzs;
    private int zzt;
    private boolean zzu;
    private final Map zzl = new HashMap();
    private final Map zzm = new HashMap();
    private final Map zzn = new HashMap();
    private String zzo = JsonUtils.EMPTY_JSON;
    private long zzq = Long.MAX_VALUE;
    private zzdux zzr = zzdux.NONE;
    private zzdva zzv = zzdva.UNKNOWN;
    private long zzw = 0;
    private String zzx = "";

    public zzdvb(zzdvm zzdvmVar, zzdwd zzdwdVar, zzdun zzdunVar, Context context, VersionInfoParcel versionInfoParcel, zzduw zzduwVar, zzdvy zzdvyVar, zzdvi zzdviVar, zzdvi zzdviVar2, String str) {
        this.zza = zzdvmVar;
        this.zzb = zzdwdVar;
        this.zzc = zzdunVar;
        this.zze = new zzdul(context);
        this.zzi = versionInfoParcel.afmaVersion;
        this.zzk = str;
        this.zzd = zzduwVar;
        this.zzf = zzdvyVar;
        this.zzg = zzdviVar;
        this.zzh = zzdviVar2;
        this.zzj = context;
        com.google.android.gms.ads.internal.zzv.zzu().zzg(this);
    }

    private final synchronized void zzA(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            zzx(jSONObject.optBoolean("isTestMode", false), false);
            zzw((zzdux) Enum.valueOf(zzdux.class, jSONObject.optString("gesture", "NONE")), false);
            this.zzo = jSONObject.optString("networkExtras", JsonUtils.EMPTY_JSON);
            this.zzq = jSONObject.optLong("networkExtrasExpirationSecs", Long.MAX_VALUE);
        } catch (JSONException unused) {
        }
    }

    private final synchronized JSONObject zzt() throws JSONException {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject();
            for (Map.Entry entry : this.zzl.entrySet()) {
                JSONArray jSONArray = new JSONArray();
                for (zzdup zzdupVar : (List) entry.getValue()) {
                    if (zzdupVar.zzg()) {
                        jSONArray.put(zzdupVar.zzd());
                    }
                }
                if (jSONArray.length() > 0) {
                    jSONObject.put((String) entry.getKey(), jSONArray);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return jSONObject;
    }

    private final void zzu() throws JSONException {
        this.zzu = true;
        this.zzd.zzc();
        this.zza.zzi(this);
        this.zzb.zzd(this);
        this.zzc.zzd(this);
        this.zzf.zzf(this);
        zzbct zzbctVar = zzbdc.zzjJ;
        if (!TextUtils.isEmpty((CharSequence) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbctVar))) {
            this.zzg.zzb(PreferenceManager.getDefaultSharedPreferences(this.zzj), Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbctVar)).split(StringUtils.COMMA)));
        }
        zzbct zzbctVar2 = zzbdc.zzjK;
        if (!TextUtils.isEmpty((CharSequence) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbctVar2))) {
            this.zzh.zzb(this.zzj.getSharedPreferences(AppLovinMediationProvider.ADMOB, 0), Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbctVar2)).split(StringUtils.COMMA)));
        }
        zzA(com.google.android.gms.ads.internal.zzv.zzp().zzi().zzk());
        this.zzx = com.google.android.gms.ads.internal.zzv.zzp().zzi().zzl();
    }

    private final void zzv() {
        com.google.android.gms.ads.internal.zzv.zzp().zzi().zzB(zzd());
    }

    private final synchronized void zzw(zzdux zzduxVar, boolean z10) {
        try {
            if (this.zzr != zzduxVar) {
                if (zzq()) {
                    zzy();
                }
                this.zzr = zzduxVar;
                if (zzq()) {
                    zzz();
                }
                if (z10) {
                    zzv();
                }
            }
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002d A[Catch: all -> 0x0027, TryCatch #0 {all -> 0x0027, blocks: (B:3:0x0001, B:6:0x0006, B:8:0x000a, B:10:0x001c, B:15:0x0029, B:20:0x0038, B:16:0x002d, B:18:0x0033), top: B:27:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final synchronized void zzx(boolean r2, boolean r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.zzs     // Catch: java.lang.Throwable -> L27
            if (r0 != r2) goto L6
            goto L3d
        L6:
            r1.zzs = r2     // Catch: java.lang.Throwable -> L27
            if (r2 == 0) goto L2d
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.internal.ads.zzbdc.zzjv     // Catch: java.lang.Throwable -> L27
            com.google.android.gms.internal.ads.zzbda r0 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch: java.lang.Throwable -> L27
            java.lang.Object r2 = r0.zzb(r2)     // Catch: java.lang.Throwable -> L27
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L27
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L27
            if (r2 == 0) goto L29
            com.google.android.gms.ads.internal.util.zzay r2 = com.google.android.gms.ads.internal.zzv.zzu()     // Catch: java.lang.Throwable -> L27
            boolean r2 = r2.zzl()     // Catch: java.lang.Throwable -> L27
            if (r2 != 0) goto L2d
            goto L29
        L27:
            r2 = move-exception
            goto L3f
        L29:
            r1.zzz()     // Catch: java.lang.Throwable -> L27
            goto L36
        L2d:
            boolean r2 = r1.zzq()     // Catch: java.lang.Throwable -> L27
            if (r2 != 0) goto L36
            r1.zzy()     // Catch: java.lang.Throwable -> L27
        L36:
            if (r3 == 0) goto L3d
            r1.zzv()     // Catch: java.lang.Throwable -> L27
            monitor-exit(r1)
            return
        L3d:
            monitor-exit(r1)
            return
        L3f:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L27
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdvb.zzx(boolean, boolean):void");
    }

    private final synchronized void zzy() {
        int iOrdinal = this.zzr.ordinal();
        if (iOrdinal == 1) {
            this.zzb.zzb();
        } else {
            if (iOrdinal != 2) {
                return;
            }
            this.zzc.zzb();
        }
    }

    private final synchronized void zzz() {
        int iOrdinal = this.zzr.ordinal();
        if (iOrdinal == 1) {
            this.zzb.zzc();
        } else {
            if (iOrdinal != 2) {
                return;
            }
            this.zzc.zzc();
        }
    }

    public final zzdux zza() {
        return this.zzr;
    }

    public final synchronized A4.a zzb(String str) {
        zzcai zzcaiVar;
        try {
            zzcaiVar = new zzcai();
            Map map = this.zzm;
            if (map.containsKey(str)) {
                zzcaiVar.zzc((zzdup) map.get(str));
            } else {
                Map map2 = this.zzn;
                if (!map2.containsKey(str)) {
                    map2.put(str, new ArrayList());
                }
                ((List) map2.get(str)).add(zzcaiVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return zzcaiVar;
    }

    public final synchronized String zzc() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzjg)).booleanValue() && zzq()) {
            if (this.zzq < com.google.android.gms.ads.internal.zzv.zzD().currentTimeMillis() / 1000) {
                this.zzo = JsonUtils.EMPTY_JSON;
                this.zzq = Long.MAX_VALUE;
                return "";
            }
            if (!this.zzo.equals(JsonUtils.EMPTY_JSON)) {
                return this.zzo;
            }
        }
        return "";
    }

    public final synchronized String zzd() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        try {
            jSONObject.put("isTestMode", this.zzs);
            jSONObject.put("gesture", this.zzr);
            if (this.zzq > com.google.android.gms.ads.internal.zzv.zzD().currentTimeMillis() / 1000) {
                jSONObject.put("networkExtras", this.zzo);
                jSONObject.put("networkExtrasExpirationSecs", this.zzq);
            }
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    public final synchronized JSONObject zze() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        try {
            jSONObject = new JSONObject();
            try {
                jSONObject.put("platform", "ANDROID");
                String str = this.zzk;
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put("sdkVersion", "afma-sdk-a-v" + str);
                }
                jSONObject.put("internalSdkVersion", this.zzi);
                jSONObject.put("osVersion", Build.VERSION.RELEASE);
                jSONObject.put("adapters", this.zzd.zza());
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzjG)).booleanValue()) {
                    String strZzn = com.google.android.gms.ads.internal.zzv.zzp().zzn();
                    if (!TextUtils.isEmpty(strZzn)) {
                        jSONObject.put("plugin", strZzn);
                    }
                }
                if (this.zzq < com.google.android.gms.ads.internal.zzv.zzD().currentTimeMillis() / 1000) {
                    this.zzo = JsonUtils.EMPTY_JSON;
                }
                jSONObject.put("networkExtras", this.zzo);
                jSONObject.put("adSlots", zzt());
                jSONObject.put("appInfo", this.zze.zza());
                String strZzc = com.google.android.gms.ads.internal.zzv.zzp().zzi().zzg().zzc();
                if (!TextUtils.isEmpty(strZzc)) {
                    jSONObject.put("cld", new JSONObject(strZzc));
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzjw)).booleanValue() && (jSONObject2 = this.zzp) != null) {
                    String str2 = "Server data: " + jSONObject2.toString();
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zze(str2);
                    jSONObject.put("serverData", this.zzp);
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzjv)).booleanValue()) {
                    jSONObject.put("openAction", this.zzv);
                    jSONObject.put("gesture", this.zzr);
                }
                jSONObject.put("isGamRegisteredTestDevice", com.google.android.gms.ads.internal.zzv.zzu().zzl());
                com.google.android.gms.ads.internal.zzv.zzr();
                com.google.android.gms.ads.internal.client.zzbb.zzb();
                jSONObject.put("isSimulator", com.google.android.gms.ads.internal.util.client.zzf.zzw());
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzjI)).booleanValue()) {
                    jSONObject.put("uiStorage", new JSONObject(this.zzx));
                }
                if (!TextUtils.isEmpty((CharSequence) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzjK))) {
                    jSONObject.put("gmaDisk", this.zzh.zza());
                }
                if (!TextUtils.isEmpty((CharSequence) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzjJ))) {
                    jSONObject.put("userDisk", this.zzg.zza());
                }
            } catch (JSONException e4) {
                com.google.android.gms.ads.internal.zzv.zzp().zzv(e4, "Inspector.toJson");
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzk("Ad inspector encountered an error", e4);
            }
        } catch (Throwable th) {
            throw th;
        }
        return jSONObject;
    }

    public final synchronized void zzf(String str, zzdup zzdupVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzjg)).booleanValue() && zzq()) {
            if (this.zzt >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzji)).intValue()) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Maximum number of ad requests stored reached. Dropping the current request.");
                return;
            }
            Map map = this.zzl;
            if (!map.containsKey(str)) {
                map.put(str, new ArrayList());
            }
            this.zzt++;
            ((List) map.get(str)).add(zzdupVar);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzjE)).booleanValue()) {
                String strZzc = zzdupVar.zzc();
                this.zzm.put(strZzc, zzdupVar);
                Map map2 = this.zzn;
                if (map2.containsKey(strZzc)) {
                    List list = (List) map2.get(strZzc);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((zzcai) it.next()).zzc(zzdupVar);
                    }
                    list.clear();
                }
            }
        }
    }

    public final void zzg() throws JSONException {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzjg)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzjv)).booleanValue() && com.google.android.gms.ads.internal.zzv.zzp().zzi().zzM()) {
                zzu();
                return;
            }
            String strZzk = com.google.android.gms.ads.internal.zzv.zzp().zzi().zzk();
            if (TextUtils.isEmpty(strZzk)) {
                return;
            }
            try {
                if (new JSONObject(strZzk).optBoolean("isTestMode", false)) {
                    zzu();
                }
            } catch (JSONException unused) {
            }
        }
    }

    public final synchronized void zzh(com.google.android.gms.ads.internal.client.zzdn zzdnVar, zzdva zzdvaVar) {
        if (!zzq()) {
            try {
                zzdnVar.zze(zzfdp.zzd(18, null, null));
                return;
            } catch (RemoteException unused) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.");
                return;
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzjg)).booleanValue()) {
            this.zzv = zzdvaVar;
            this.zza.zzj(zzdnVar, new zzbkx(this), new zzbkq(this.zzf), new zzbke(this));
            return;
        } else {
            try {
                zzdnVar.zze(zzfdp.zzd(1, null, null));
                return;
            } catch (RemoteException unused2) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Ad inspector had an internal error.");
                return;
            }
        }
    }

    public final synchronized void zzi(String str, long j4) {
        this.zzo = str;
        this.zzq = j4;
        zzv();
    }

    public final synchronized void zzj(String str) {
        this.zzx = str;
        com.google.android.gms.ads.internal.zzv.zzp().zzi().zzC(this.zzx);
    }

    public final synchronized void zzk(long j4) {
        this.zzw += j4;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzl(boolean r2) throws org.json.JSONException {
        /*
            r1 = this;
            boolean r0 = r1.zzu
            if (r0 != 0) goto La
            if (r2 == 0) goto L15
            r1.zzu()
            goto Lc
        La:
            if (r2 == 0) goto L15
        Lc:
            boolean r2 = r1.zzs
            if (r2 == 0) goto L11
            goto L15
        L11:
            r1.zzz()
            return
        L15:
            boolean r2 = r1.zzq()
            if (r2 != 0) goto L1e
            r1.zzy()
        L1e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdvb.zzl(boolean):void");
    }

    public final void zzm(zzdux zzduxVar) {
        zzw(zzduxVar, true);
    }

    public final synchronized void zzn(JSONObject jSONObject) {
        this.zzp = jSONObject;
    }

    public final void zzo(boolean z10) throws JSONException {
        if (!this.zzu && z10) {
            zzu();
        }
        zzx(z10, true);
    }

    public final boolean zzp() {
        return this.zzp != null;
    }

    public final synchronized boolean zzq() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzjv)).booleanValue()) {
            return this.zzs || com.google.android.gms.ads.internal.zzv.zzu().zzl();
        }
        return this.zzs;
    }

    public final synchronized boolean zzr() {
        return this.zzs;
    }

    public final boolean zzs() {
        return this.zzw < ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzjB)).longValue();
    }
}
