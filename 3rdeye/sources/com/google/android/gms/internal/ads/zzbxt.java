package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzbxt implements zzbxy {
    public static final /* synthetic */ int zzb = 0;
    private static final List zzc = Collections.synchronizedList(new ArrayList());
    boolean zza;
    private final zzhcu zzd;
    private final LinkedHashMap zze;
    private final Context zzh;
    private final zzbxv zzi;
    private final List zzf = new ArrayList();
    private final List zzg = new ArrayList();
    private final Object zzj = new Object();
    private HashSet zzk = new HashSet();
    private boolean zzl = false;
    private boolean zzm = false;

    public zzbxt(Context context, VersionInfoParcel versionInfoParcel, zzbxv zzbxvVar, String str, zzbxu zzbxuVar) {
        Preconditions.checkNotNull(zzbxvVar, "SafeBrowsing config is not present.");
        this.zzh = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zze = new LinkedHashMap();
        this.zzi = zzbxvVar;
        Iterator it = zzbxvVar.zze.iterator();
        while (it.hasNext()) {
            this.zzk.add(((String) it.next()).toLowerCase(Locale.ENGLISH));
        }
        this.zzk.remove("cookie".toLowerCase(Locale.ENGLISH));
        zzhcu zzhcuVarZzc = zzhet.zzc();
        zzhcuVarZzc.zzn(9);
        if (str != null) {
            zzhcuVarZzc.zzj(str);
            zzhcuVarZzc.zzh(str);
        }
        zzhcv zzhcvVarZzc = zzhcw.zzc();
        String str2 = this.zzi.zza;
        if (str2 != null) {
            zzhcvVarZzc.zza(str2);
        }
        zzhcuVarZzc.zzg((zzhcw) zzhcvVarZzc.zzbr());
        zzhek zzhekVarZzc = zzhel.zzc();
        zzhekVarZzc.zzc(Wrappers.packageManager(this.zzh).isCallerInstantApp());
        String str3 = versionInfoParcel.afmaVersion;
        if (str3 != null) {
            zzhekVarZzc.zza(str3);
        }
        long apkVersion = GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zzh);
        if (apkVersion > 0) {
            zzhekVarZzc.zzb(apkVersion);
        }
        zzhcuVarZzc.zzf((zzhel) zzhekVarZzc.zzbr());
        this.zzd = zzhcuVarZzc;
    }

    public static /* synthetic */ A4.a zzb(zzbxt zzbxtVar, Map map) {
        int length;
        zzhei zzheiVar;
        A4.a aVarZzm;
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONArray jSONArrayOptJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                    if (jSONArrayOptJSONArray != null) {
                        Object obj = zzbxtVar.zzj;
                        synchronized (obj) {
                            try {
                                length = jSONArrayOptJSONArray.length();
                                synchronized (obj) {
                                    zzheiVar = (zzhei) zzbxtVar.zze.get(str);
                                }
                            } finally {
                            }
                        }
                        if (zzheiVar == null) {
                            zzbxx.zza("Cannot find the corresponding resource object for " + str);
                        } else {
                            for (int i = 0; i < length; i++) {
                                zzheiVar.zza(jSONArrayOptJSONArray.getJSONObject(i).getString("threat_type"));
                            }
                            zzbxtVar.zza = (length > 0) | zzbxtVar.zza;
                        }
                    }
                }
            } catch (JSONException e4) {
                if (((Boolean) zzbfk.zza.zze()).booleanValue()) {
                    int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to get SafeBrowsing metadata", e4);
                }
                return zzgdb.zzg(new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (zzbxtVar.zza) {
            synchronized (zzbxtVar.zzj) {
                zzbxtVar.zzd.zzn(10);
            }
        }
        boolean z10 = zzbxtVar.zza;
        if (!(z10 && zzbxtVar.zzi.zzg) && (!(zzbxtVar.zzm && zzbxtVar.zzi.zzf) && (z10 || !zzbxtVar.zzi.zzd))) {
            return zzgdb.zzh(null);
        }
        synchronized (zzbxtVar.zzj) {
            try {
                Iterator it = zzbxtVar.zze.values().iterator();
                while (it.hasNext()) {
                    zzbxtVar.zzd.zzc((zzhej) ((zzhei) it.next()).zzbr());
                }
                zzhcu zzhcuVar = zzbxtVar.zzd;
                zzhcuVar.zza(zzbxtVar.zzf);
                zzhcuVar.zzb(zzbxtVar.zzg);
                if (zzbxx.zzb()) {
                    StringBuilder sb = new StringBuilder("Sending SB report\n  url: " + zzhcuVar.zzl() + "\n  clickUrl: " + zzhcuVar.zzk() + "\n  resources: \n");
                    for (zzhej zzhejVar : zzhcuVar.zzm()) {
                        sb.append("    [");
                        sb.append(zzhejVar.zzc());
                        sb.append("] ");
                        sb.append(zzhejVar.zzg());
                    }
                    zzbxx.zza(sb.toString());
                }
                A4.a aVarZzb = new com.google.android.gms.ads.internal.util.zzbo(zzbxtVar.zzh).zzb(1, zzbxtVar.zzi.zzb, null, ((zzhet) zzhcuVar.zzbr()).zzaV());
                if (zzbxx.zzb()) {
                    aVarZzb.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbxq
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i11 = zzbxt.zzb;
                            zzbxx.zza("Pinged SB successfully.");
                        }
                    }, zzcad.zza);
                }
                aVarZzm = zzgdb.zzm(aVarZzb, new zzfut() { // from class: com.google.android.gms.internal.ads.zzbxr
                    @Override // com.google.android.gms.internal.ads.zzfut
                    public final Object apply(Object obj2) {
                        int i11 = zzbxt.zzb;
                        return null;
                    }
                }, zzcad.zzg);
            } finally {
            }
        }
        return aVarZzm;
    }

    public static /* synthetic */ void zzd(zzbxt zzbxtVar, Bitmap bitmap) {
        zzgxl zzgxlVarZzt = zzgxn.zzt();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, zzgxlVarZzt);
        synchronized (zzbxtVar.zzj) {
            zzhcu zzhcuVar = zzbxtVar.zzd;
            zzhec zzhecVarZzc = zzhee.zzc();
            zzhecVarZzc.zza(zzgxlVarZzt.zzb());
            zzhecVarZzc.zzb("image/png");
            zzhecVarZzc.zzc(2);
            zzhcuVar.zzi((zzhee) zzhecVarZzc.zzbr());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxy
    public final zzbxv zza() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzbxy
    public final void zze(String str, Map map, int i) {
        synchronized (this.zzj) {
            if (i == 3) {
                try {
                    this.zzm = true;
                } catch (Throwable th) {
                    throw th;
                }
            }
            LinkedHashMap linkedHashMap = this.zze;
            if (linkedHashMap.containsKey(str)) {
                if (i == 3) {
                    ((zzhei) linkedHashMap.get(str)).zze(4);
                }
                return;
            }
            zzhei zzheiVarZzd = zzhej.zzd();
            int iZza = zzheh.zza(i);
            if (iZza != 0) {
                zzheiVarZzd.zze(iZza);
            }
            zzheiVarZzd.zzb(linkedHashMap.size());
            zzheiVarZzd.zzd(str);
            zzhdh zzhdhVarZzc = zzhdk.zzc();
            if (!this.zzk.isEmpty() && map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str2 = entry.getKey() != null ? (String) entry.getKey() : "";
                    String str3 = entry.getValue() != null ? (String) entry.getValue() : "";
                    if (this.zzk.contains(str2.toLowerCase(Locale.ENGLISH))) {
                        zzhdf zzhdfVarZzc = zzhdg.zzc();
                        zzhdfVarZzc.zza(zzgxn.zzw(str2));
                        zzhdfVarZzc.zzb(zzgxn.zzw(str3));
                        zzhdhVarZzc.zza((zzhdg) zzhdfVarZzc.zzbr());
                    }
                }
            }
            zzheiVarZzd.zzc((zzhdk) zzhdhVarZzc.zzbr());
            linkedHashMap.put(str, zzheiVarZzd);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxy
    public final void zzf() {
        synchronized (this.zzj) {
            this.zze.keySet();
            A4.a aVarZzh = zzgdb.zzh(Collections.EMPTY_MAP);
            zzgci zzgciVar = new zzgci() { // from class: com.google.android.gms.internal.ads.zzbxo
                @Override // com.google.android.gms.internal.ads.zzgci
                public final A4.a zza(Object obj) {
                    return zzbxt.zzb(this.zza, (Map) obj);
                }
            };
            zzgdm zzgdmVar = zzcad.zzg;
            A4.a aVarZzn = zzgdb.zzn(aVarZzh, zzgciVar, zzgdmVar);
            A4.a aVarZzo = zzgdb.zzo(aVarZzn, 10L, TimeUnit.SECONDS, zzcad.zzd);
            zzgdb.zzr(aVarZzn, new zzbxs(this, aVarZzo), zzgdmVar);
            zzc.add(aVarZzo);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x003a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzbxy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzg(android.view.View r8) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzbxv r0 = r7.zzi
            boolean r0 = r0.zzc
            if (r0 != 0) goto L8
            goto L88
        L8:
            boolean r0 = r7.zzl
            if (r0 != 0) goto L88
            com.google.android.gms.ads.internal.zzv.zzr()
            r0 = 1
            r1 = 0
            if (r8 != 0) goto L15
            goto L76
        L15:
            boolean r2 = r8.isDrawingCacheEnabled()     // Catch: java.lang.RuntimeException -> L27
            r8.setDrawingCacheEnabled(r0)     // Catch: java.lang.RuntimeException -> L27
            android.graphics.Bitmap r3 = r8.getDrawingCache()     // Catch: java.lang.RuntimeException -> L27
            if (r3 == 0) goto L29
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r3)     // Catch: java.lang.RuntimeException -> L27
            goto L2a
        L27:
            r2 = move-exception
            goto L30
        L29:
            r3 = r1
        L2a:
            r8.setDrawingCacheEnabled(r2)     // Catch: java.lang.RuntimeException -> L2e
            goto L38
        L2e:
            r2 = move-exception
            goto L31
        L30:
            r3 = r1
        L31:
            int r4 = com.google.android.gms.ads.internal.util.zze.zza
            java.lang.String r4 = "Fail to capture the web view"
            com.google.android.gms.ads.internal.util.client.zzo.zzh(r4, r2)
        L38:
            if (r3 != 0) goto L75
            int r2 = r8.getWidth()     // Catch: java.lang.RuntimeException -> L63
            int r3 = r8.getHeight()     // Catch: java.lang.RuntimeException -> L63
            if (r2 == 0) goto L65
            if (r3 != 0) goto L47
            goto L65
        L47:
            int r4 = r8.getWidth()     // Catch: java.lang.RuntimeException -> L63
            int r5 = r8.getHeight()     // Catch: java.lang.RuntimeException -> L63
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.RGB_565     // Catch: java.lang.RuntimeException -> L63
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r4, r5, r6)     // Catch: java.lang.RuntimeException -> L63
            android.graphics.Canvas r5 = new android.graphics.Canvas     // Catch: java.lang.RuntimeException -> L63
            r5.<init>(r4)     // Catch: java.lang.RuntimeException -> L63
            r6 = 0
            r8.layout(r6, r6, r2, r3)     // Catch: java.lang.RuntimeException -> L63
            r8.draw(r5)     // Catch: java.lang.RuntimeException -> L63
            r1 = r4
            goto L76
        L63:
            r8 = move-exception
            goto L6d
        L65:
            java.lang.String r8 = "Width or height of view is zero"
            int r2 = com.google.android.gms.ads.internal.util.zze.zza     // Catch: java.lang.RuntimeException -> L63
            com.google.android.gms.ads.internal.util.client.zzo.zzj(r8)     // Catch: java.lang.RuntimeException -> L63
            goto L76
        L6d:
            int r2 = com.google.android.gms.ads.internal.util.zze.zza
            java.lang.String r2 = "Fail to capture the webview"
            com.google.android.gms.ads.internal.util.client.zzo.zzh(r2, r8)
            goto L76
        L75:
            r1 = r3
        L76:
            if (r1 != 0) goto L7e
            java.lang.String r8 = "Failed to capture the webview bitmap."
            com.google.android.gms.internal.ads.zzbxx.zza(r8)
            return
        L7e:
            r7.zzl = r0
            com.google.android.gms.internal.ads.zzbxp r8 = new com.google.android.gms.internal.ads.zzbxp
            r8.<init>()
            com.google.android.gms.ads.internal.util.zzs.zzh(r8)
        L88:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbxt.zzg(android.view.View):void");
    }

    @Override // com.google.android.gms.internal.ads.zzbxy
    public final void zzh(String str) {
        synchronized (this.zzj) {
            try {
                if (str == null) {
                    this.zzd.zzd();
                } else {
                    this.zzd.zze(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxy
    public final boolean zzi() {
        return PlatformVersion.isAtLeastKitKat() && this.zzi.zzc && !this.zzl;
    }
}
