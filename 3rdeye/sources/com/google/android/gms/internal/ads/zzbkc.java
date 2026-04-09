package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.singular.sdk.internal.SingularParamsBase;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzbkc {
    public static final zzbkd zza = new zzbkd() { // from class: com.google.android.gms.internal.ads.zzbja
        @Override // com.google.android.gms.internal.ads.zzbkd
        public final void zza(Object obj, Map map) {
            zzcgl zzcglVar = (zzcgl) obj;
            zzbkd zzbkdVar = zzbkc.zza;
            String str = (String) map.get("urls");
            if (TextUtils.isEmpty(str)) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("URLs missing in canOpenURLs GMSG.");
                return;
            }
            String[] strArrSplit = str.split(StringUtils.COMMA);
            HashMap map2 = new HashMap();
            PackageManager packageManager = zzcglVar.getContext().getPackageManager();
            for (String str2 : strArrSplit) {
                String[] strArrSplit2 = str2.split(";", 2);
                Boolean boolValueOf = Boolean.valueOf(packageManager.resolveActivity(new Intent(strArrSplit2.length > 1 ? strArrSplit2[1].trim() : "android.intent.action.VIEW", Uri.parse(strArrSplit2[0].trim())), 65536) != null);
                map2.put(str2, boolValueOf);
                com.google.android.gms.ads.internal.util.zze.zza("/canOpenURLs;" + str2 + ";" + boolValueOf);
            }
            ((zzbmy) zzcglVar).zzd("openableURLs", map2);
        }
    };
    public static final zzbkd zzb = new zzbkd() { // from class: com.google.android.gms.internal.ads.zzbjc
        @Override // com.google.android.gms.internal.ads.zzbkd
        public final void zza(Object obj, Map map) {
            zzcgl zzcglVar = (zzcgl) obj;
            zzbkd zzbkdVar = zzbkc.zza;
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zziw)).booleanValue()) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("canOpenAppGmsgHandler disabled.");
                return;
            }
            String str = (String) map.get("package_name");
            if (TextUtils.isEmpty(str)) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Package name missing in canOpenApp GMSG.");
                return;
            }
            HashMap map2 = new HashMap();
            Boolean boolValueOf = Boolean.valueOf(zzcglVar.getContext().getPackageManager().getLaunchIntentForPackage(str) != null);
            map2.put(str, boolValueOf);
            com.google.android.gms.ads.internal.util.zze.zza("/canOpenApp;" + str + ";" + boolValueOf);
            ((zzbmy) zzcglVar).zzd("openableApp", map2);
        }
    };
    public static final zzbkd zzc = new zzbkd() { // from class: com.google.android.gms.internal.ads.zzbjf
        @Override // com.google.android.gms.internal.ads.zzbkd
        public final void zza(Object obj, Map map) throws JSONException, URISyntaxException {
            zzbkc.zzb((zzcgl) obj, map);
        }
    };
    public static final zzbkd zzd = new zzbju();
    public static final zzbkd zze = new zzbjv();
    public static final zzbkd zzf = new zzbkd() { // from class: com.google.android.gms.internal.ads.zzbjg
        @Override // com.google.android.gms.internal.ads.zzbkd
        public final void zza(Object obj, Map map) {
            zzcgl zzcglVar = (zzcgl) obj;
            zzbkd zzbkdVar = zzbkc.zza;
            String str = (String) map.get(SingularParamsBase.Constants.IDENTIFIER_UNIQUE_ID_KEY);
            if (str == null) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("URL missing from httpTrack GMSG.");
            } else {
                zzcev zzcevVar = (zzcev) zzcglVar;
                new com.google.android.gms.ads.internal.util.zzbw(zzcglVar.getContext(), ((zzcgs) zzcglVar).zzm().afmaVersion, str, null, zzcevVar.zzD() != null ? zzcevVar.zzD().zzax : null).zzb();
            }
        }
    };
    public static final zzbkd zzg = new zzbjw();
    public static final zzbkd zzh = new zzbjx();
    public static final zzbkd zzi = new zzbkd() { // from class: com.google.android.gms.internal.ads.zzbjd
        @Override // com.google.android.gms.internal.ads.zzbkd
        public final void zza(Object obj, Map map) throws NumberFormatException {
            zzcgr zzcgrVar = (zzcgr) obj;
            zzbkd zzbkdVar = zzbkc.zza;
            String str = (String) map.get("tx");
            String str2 = (String) map.get("ty");
            String str3 = (String) map.get("td");
            try {
                int i = Integer.parseInt(str);
                int i10 = Integer.parseInt(str2);
                int i11 = Integer.parseInt(str3);
                zzavs zzavsVarZzI = zzcgrVar.zzI();
                if (zzavsVarZzI != null) {
                    zzavsVarZzI.zzc().zzl(i, i10, i11);
                }
            } catch (NumberFormatException unused) {
                int i12 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not parse touch parameters from gmsg.");
            }
        }
    };
    public static final zzbkd zzj = new zzbjy();
    public static final zzbkd zzk = new zzbjz();
    public static final zzbkd zzl = new zzccz();
    public static final zzbkd zzm = new zzcda();
    public static final zzbkd zzn = new zzbiw();
    public static final zzbkt zzo = new zzbkt();
    public static final zzbkd zzp = new zzbka();
    public static final zzbkd zzq = new zzbkb();
    public static final zzbkd zzr = new zzbjh();
    public static final zzbkd zzs = new zzbji();
    public static final zzbkd zzt = new zzbjj();
    public static final zzbkd zzu = new zzbjk();
    public static final zzbkd zzv = new zzbjl();
    public static final zzbkd zzw = new zzbjm();
    public static final zzbkd zzx = new zzbjn();
    public static final zzbkd zzy = new zzbjo();
    public static final zzbkd zzz = new zzbjp();
    public static final zzbkd zzA = new zzbjq();
    public static final zzbkd zzB = new zzbjs();
    public static final zzbkd zzC = new zzbjt();

    public static A4.a zza(zzcfe zzcfeVar, String str) {
        Uri uriZza = Uri.parse(str);
        try {
            zzavs zzavsVarZzI = zzcfeVar.zzI();
            zzfcs zzfcsVarZzS = zzcfeVar.zzS();
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzmk)).booleanValue() || zzfcsVarZzS == null) {
                if (zzavsVarZzI != null && zzavsVarZzI.zzf(uriZza)) {
                    uriZza = zzavsVarZzI.zza(uriZza, zzcfeVar.getContext(), zzcfeVar.zzF(), zzcfeVar.zzi());
                }
            } else if (zzavsVarZzI != null && zzavsVarZzI.zzf(uriZza)) {
                uriZza = zzfcsVarZzS.zza(uriZza, zzcfeVar.getContext(), zzcfeVar.zzF(), zzcfeVar.zzi());
            }
        } catch (zzavt unused) {
            String strConcat = "Unable to append parameter to URL: ".concat(str);
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj(strConcat);
        }
        Map map = new HashMap();
        if (zzcfeVar.zzD() != null) {
            map = zzcfeVar.zzD().zzaw;
        }
        final String strZzb = zzbyo.zzb(uriZza, zzcfeVar.getContext(), map);
        long jLongValue = ((Long) zzbfb.zze.zze()).longValue();
        if (jLongValue <= 0 || jLongValue > 252130000) {
            return zzgdb.zzh(strZzb);
        }
        zzgcs zzgcsVarZzw = zzgcs.zzw(zzcfeVar.zzT());
        zzfut zzfutVar = new zzfut() { // from class: com.google.android.gms.internal.ads.zzbix
            @Override // com.google.android.gms.internal.ads.zzfut
            public final Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                zzbkd zzbkdVar = zzbkc.zza;
                if (!((Boolean) zzbfb.zzi.zze()).booleanValue()) {
                    return "failure_click_attok";
                }
                com.google.android.gms.ads.internal.zzv.zzp().zzw(th, "prepareClickUrl.attestation1");
                return "failure_click_attok";
            }
        };
        zzgdm zzgdmVar = zzcad.zzg;
        return (zzgcs) zzgdb.zze((zzgcs) zzgdb.zzm((zzgcs) zzgdb.zze(zzgcsVarZzw, Throwable.class, zzfutVar, zzgdmVar), new zzfut() { // from class: com.google.android.gms.internal.ads.zzbiy
            /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
            /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
            @Override // com.google.android.gms.internal.ads.zzfut
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object apply(java.lang.Object r6) {
                /*
                    r5 = this;
                    java.lang.String r6 = (java.lang.String) r6
                    com.google.android.gms.internal.ads.zzbkd r0 = com.google.android.gms.internal.ads.zzbkc.zza
                    java.lang.String r0 = r1
                    if (r6 != 0) goto L9
                    goto L74
                L9:
                    com.google.android.gms.internal.ads.zzbem r1 = com.google.android.gms.internal.ads.zzbfb.zzf
                    java.lang.Object r1 = r1.zze()
                    java.lang.Boolean r1 = (java.lang.Boolean) r1
                    boolean r1 = r1.booleanValue()
                    if (r1 != 0) goto L18
                    goto L39
                L18:
                    java.lang.String r1 = ".googleadservices.com"
                    java.lang.String r2 = ".googlesyndication.com"
                    java.lang.String r3 = ".doubleclick.net"
                    java.lang.String[] r1 = new java.lang.String[]{r3, r1, r2}
                    android.net.Uri r2 = android.net.Uri.parse(r0)
                    java.lang.String r2 = r2.getHost()
                    r3 = 0
                L2b:
                    r4 = 3
                    if (r3 >= r4) goto L74
                    r4 = r1[r3]
                    boolean r4 = r2.endsWith(r4)
                    if (r4 != 0) goto L39
                    int r3 = r3 + 1
                    goto L2b
                L39:
                    com.google.android.gms.internal.ads.zzbem r1 = com.google.android.gms.internal.ads.zzbfb.zza
                    java.lang.Object r1 = r1.zze()
                    java.lang.String r1 = (java.lang.String) r1
                    com.google.android.gms.internal.ads.zzbem r2 = com.google.android.gms.internal.ads.zzbfb.zzb
                    java.lang.Object r2 = r2.zze()
                    java.lang.String r2 = (java.lang.String) r2
                    boolean r3 = android.text.TextUtils.isEmpty(r1)
                    if (r3 != 0) goto L53
                    java.lang.String r0 = r0.replace(r1, r6)
                L53:
                    boolean r1 = android.text.TextUtils.isEmpty(r2)
                    if (r1 != 0) goto L74
                    android.net.Uri r1 = android.net.Uri.parse(r0)
                    java.lang.String r3 = r1.getQueryParameter(r2)
                    boolean r3 = android.text.TextUtils.isEmpty(r3)
                    if (r3 == 0) goto L74
                    android.net.Uri$Builder r0 = r1.buildUpon()
                    android.net.Uri$Builder r6 = r0.appendQueryParameter(r2, r6)
                    java.lang.String r6 = r6.toString()
                    return r6
                L74:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbiy.apply(java.lang.Object):java.lang.Object");
            }
        }, zzgdmVar), Throwable.class, new zzfut() { // from class: com.google.android.gms.internal.ads.zzbiz
            @Override // com.google.android.gms.internal.ads.zzfut
            public final Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                zzbkd zzbkdVar = zzbkc.zza;
                if (((Boolean) zzbfb.zzi.zze()).booleanValue()) {
                    com.google.android.gms.ads.internal.zzv.zzp().zzw(th, "prepareClickUrl.attestation2");
                }
                return strZzb;
            }
        }, zzgdmVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:(3:56|8|9)|(12:66|11|12|(10:18|(1:20)|21|(1:23)|24|(1:26)|27|(1:29)|30|(2:32|(1:34)))|35|60|36|(1:41)(1:42)|64|43|71|49)(1:16)|15|(0)|35|60|36|(0)(0)|64|43|71|49|6) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d2, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d3, code lost:
    
        com.google.android.gms.ads.internal.zzv.zzp().zzw(r0, r1.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e8, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e9, code lost:
    
        r1 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh("Error constructing openable urls response.", r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e3  */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void zzb(com.google.android.gms.internal.ads.zzcgl r17, java.util.Map r18) throws org.json.JSONException, java.net.URISyntaxException {
        /*
            Method dump skipped, instructions count: 289
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbkc.zzb(com.google.android.gms.internal.ads.zzcgl, java.util.Map):void");
    }

    public static void zzc(Map map, zzddw zzddwVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzkX)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("1") && zzddwVar != null) {
            zzddwVar.zzdf();
        }
    }
}
