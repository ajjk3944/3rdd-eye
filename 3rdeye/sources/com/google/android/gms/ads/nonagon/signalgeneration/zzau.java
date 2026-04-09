package com.google.android.gms.ads.nonagon.signalgeneration;

import A4.a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzbv;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzavs;
import com.google.android.gms.internal.ads.zzavt;
import com.google.android.gms.internal.ads.zzbct;
import com.google.android.gms.internal.ads.zzbdc;
import com.google.android.gms.internal.ads.zzbeh;
import com.google.android.gms.internal.ads.zzbev;
import com.google.android.gms.internal.ads.zzbfh;
import com.google.android.gms.internal.ads.zzbud;
import com.google.android.gms.internal.ads.zzbug;
import com.google.android.gms.internal.ads.zzbyx;
import com.google.android.gms.internal.ads.zzbzc;
import com.google.android.gms.internal.ads.zzcad;
import com.google.android.gms.internal.ads.zzcgz;
import com.google.android.gms.internal.ads.zzdnr;
import com.google.android.gms.internal.ads.zzdsh;
import com.google.android.gms.internal.ads.zzfcs;
import com.google.android.gms.internal.ads.zzfdn;
import com.google.android.gms.internal.ads.zzfhm;
import com.google.android.gms.internal.ads.zzfhp;
import com.google.android.gms.internal.ads.zzfjq;
import com.google.android.gms.internal.ads.zzfut;
import com.google.android.gms.internal.ads.zzfvv;
import com.google.android.gms.internal.ads.zzgch;
import com.google.android.gms.internal.ads.zzgci;
import com.google.android.gms.internal.ads.zzgcs;
import com.google.android.gms.internal.ads.zzgdb;
import com.google.android.gms.internal.ads.zzgdm;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;
import s.C5537a;
import s.f;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes.dex */
public final class zzau extends zzbyx {
    protected static final List zza = new ArrayList(Arrays.asList("/aclk", "/pcs/click", "/dbm/clk"));
    protected static final List zzb = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com"));
    protected static final List zzc = new ArrayList(Arrays.asList("/pagead/adview", "/pcs/view", "/pagead/conversion", "/dbm/ad"));
    protected static final List zzd = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"));
    public static final /* synthetic */ int zze = 0;
    private final List zzB;
    private final List zzC;
    private final List zzD;
    private final List zzE;
    private final zzbeh zzI;
    private final zzo zzJ;
    private final zzf zzK;
    private final zzcgz zzf;
    private Context zzg;
    private final zzavs zzh;
    private final zzfcs zzi;
    private final zzfdn zzj;
    private final zzgdm zzk;
    private final ScheduledExecutorService zzl;
    private zzbug zzm;
    private final zzdsh zzp;
    private final zzfjq zzq;
    private final VersionInfoParcel zzy;
    private String zzz;
    private Point zzn = new Point();
    private Point zzo = new Point();
    private final AtomicInteger zzx = new AtomicInteger(0);
    private final AtomicBoolean zzF = new AtomicBoolean(false);
    private final AtomicBoolean zzG = new AtomicBoolean(false);
    private final AtomicInteger zzH = new AtomicInteger(0);
    private final boolean zzr = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzhr)).booleanValue();
    private final boolean zzs = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzhq)).booleanValue();
    private final boolean zzt = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzht)).booleanValue();
    private final boolean zzu = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzhv)).booleanValue();
    private final String zzv = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzhu);
    private final String zzw = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzhw);
    private final String zzA = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzhx);

    public zzau(zzcgz zzcgzVar, Context context, zzavs zzavsVar, zzfdn zzfdnVar, zzgdm zzgdmVar, ScheduledExecutorService scheduledExecutorService, zzdsh zzdshVar, zzfjq zzfjqVar, VersionInfoParcel versionInfoParcel, zzbeh zzbehVar, zzfcs zzfcsVar, zzo zzoVar, zzf zzfVar) {
        List listZzZ;
        this.zzf = zzcgzVar;
        this.zzg = context;
        this.zzh = zzavsVar;
        this.zzi = zzfcsVar;
        this.zzj = zzfdnVar;
        this.zzk = zzgdmVar;
        this.zzl = scheduledExecutorService;
        this.zzp = zzdshVar;
        this.zzq = zzfjqVar;
        this.zzy = versionInfoParcel;
        this.zzI = zzbehVar;
        this.zzJ = zzoVar;
        this.zzK = zzfVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzhy)).booleanValue()) {
            this.zzB = zzZ((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzhz));
            this.zzC = zzZ((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzhA));
            this.zzD = zzZ((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzhB));
            listZzZ = zzZ((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzhC));
        } else {
            this.zzB = zza;
            this.zzC = zzb;
            this.zzD = zzc;
            listZzZ = zzd;
        }
        this.zzE = listZzZ;
    }

    public static /* synthetic */ ArrayList zzC(zzau zzauVar, List list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (!zzauVar.zzQ(uri) || TextUtils.isEmpty(str)) {
                arrayList.add(uri);
            } else {
                arrayList.add(zzaa(uri, "nas", str));
            }
        }
        return arrayList;
    }

    public static /* synthetic */ ArrayList zzD(zzau zzauVar, List list, IObjectWrapper iObjectWrapper) throws Exception {
        zzavs zzavsVar = zzauVar.zzh;
        String strZzh = zzavsVar.zzc() != null ? zzavsVar.zzc().zzh(zzauVar.zzg, (View) ObjectWrapper.unwrap(iObjectWrapper), null) : "";
        if (TextUtils.isEmpty(strZzh)) {
            throw new Exception("Failed to get view signals.");
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (zzauVar.zzQ(uri)) {
                arrayList.add(zzaa(uri, "ms", strZzh));
            } else {
                String strValueOf = String.valueOf(uri);
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Not a Google URL: ".concat(strValueOf));
                arrayList.add(uri);
            }
        }
        if (arrayList.isEmpty()) {
            throw new Exception("Empty impression URLs result.");
        }
        return arrayList;
    }

    public static /* synthetic */ void zzH(zzau zzauVar, zzdnr[] zzdnrVarArr) {
        zzdnr zzdnrVar = zzdnrVarArr[0];
        if (zzdnrVar != null) {
            zzauVar.zzj.zzb(zzgdb.zzh(zzdnrVar));
        }
    }

    public static /* bridge */ /* synthetic */ void zzJ(zzau zzauVar, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (zzauVar.zzP((Uri) it.next())) {
                zzauVar.zzx.getAndIncrement();
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.ads.nonagon.signalgeneration.zzac zzR(android.content.Context r11, java.lang.String r12, java.lang.String r13, com.google.android.gms.ads.internal.client.zzr r14, com.google.android.gms.ads.internal.client.zzm r15, int r16, java.lang.String r17, android.os.Bundle r18, com.google.android.gms.internal.ads.zzbzc r19) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.nonagon.signalgeneration.zzau.zzR(android.content.Context, java.lang.String, java.lang.String, com.google.android.gms.ads.internal.client.zzr, com.google.android.gms.ads.internal.client.zzm, int, java.lang.String, android.os.Bundle, com.google.android.gms.internal.ads.zzbzc):com.google.android.gms.ads.nonagon.signalgeneration.zzac");
    }

    private final a zzS(final String str) {
        final zzdnr[] zzdnrVarArr = new zzdnr[1];
        a aVarZza = this.zzj.zza();
        zzgci zzgciVar = new zzgci() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzaf
            @Override // com.google.android.gms.internal.ads.zzgci
            public final a zza(Object obj) {
                return zzau.zzx(this.zza, zzdnrVarArr, str, (zzdnr) obj);
            }
        };
        zzgdm zzgdmVar = this.zzk;
        a aVarZzn = zzgdb.zzn(aVarZza, zzgciVar, zzgdmVar);
        aVarZzn.addListener(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzag
            @Override // java.lang.Runnable
            public final void run() {
                zzau.zzH(this.zza, zzdnrVarArr);
            }
        }, zzgdmVar);
        return (zzgcs) zzgdb.zze((zzgcs) zzgdb.zzm((zzgcs) zzgdb.zzo(zzgcs.zzw(aVarZzn), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzhP)).intValue(), TimeUnit.MILLISECONDS, this.zzl), new zzfut() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzam
            @Override // com.google.android.gms.internal.ads.zzfut
            public final Object apply(Object obj) {
                int i = zzau.zze;
                return ((JSONObject) obj).optString("nas");
            }
        }, zzgdmVar), Exception.class, new zzfut() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzan
            @Override // com.google.android.gms.internal.ads.zzfut
            public final Object apply(Object obj) {
                int i = zzau.zze;
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzh("", (Exception) obj);
                return null;
            }
        }, zzgdmVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzT() {
        zzau zzauVar;
        a aVarZzb;
        if (((Boolean) zzbfh.zze.zze()).booleanValue()) {
            this.zzJ.zze();
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzlp)).booleanValue()) {
            aVarZzb = zzgdb.zzk(new zzgch() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzad
                @Override // com.google.android.gms.internal.ads.zzgch
                public final a zza() {
                    zzau zzauVar2 = this.zza;
                    return zzauVar2.zzR(zzauVar2.zzg, null, AdFormat.BANNER.name(), null, null, 0, null, new Bundle(), null).zzb();
                }
            }, zzcad.zza);
            zzauVar = this;
        } else {
            zzauVar = this;
            aVarZzb = zzauVar.zzR(this.zzg, null, AdFormat.BANNER.name(), null, null, 0, null, new Bundle(), null).zzb();
        }
        zzgdb.zzr(aVarZzb, new zzat(this), zzauVar.zzf.zzA());
    }

    private final void zzU() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzjO)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzjR)).booleanValue()) {
                return;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzjV)).booleanValue() && this.zzF.getAndSet(true)) {
                return;
            }
            zzT();
        }
    }

    private final void zzV(List list, final IObjectWrapper iObjectWrapper, zzbud zzbudVar, boolean z10) {
        a aVarZzb;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzhO)).booleanValue()) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("The updating URL feature is not enabled.");
            try {
                zzbudVar.zze("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e4) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("", e4);
                return;
            }
        }
        Iterator it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (zzP((Uri) it.next())) {
                i10++;
            }
        }
        if (i10 > 1) {
            String strValueOf = String.valueOf(list);
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Multiple google urls found: ".concat(strValueOf));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            final Uri uri = (Uri) it2.next();
            if (zzP(uri)) {
                zzgdm zzgdmVar = this.zzk;
                aVarZzb = zzgdmVar.zzb(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzah
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return zzau.zzn(this.zza, uri, iObjectWrapper);
                    }
                });
                if (zzY()) {
                    aVarZzb = zzgdb.zzn(aVarZzb, new zzgci() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzai
                        @Override // com.google.android.gms.internal.ads.zzgci
                        public final a zza(Object obj) {
                            zzau zzauVar = this.zza;
                            return zzgdb.zzm(zzauVar.zzS("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new zzfut() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzaj
                                @Override // com.google.android.gms.internal.ads.zzfut
                                public final Object apply(Object obj2) {
                                    return zzau.zzd(zzauVar, uri, (String) obj2);
                                }
                            }, zzauVar.zzk);
                        }
                    }, zzgdmVar);
                } else {
                    int i12 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Asset view map is empty.");
                }
            } else {
                String strValueOf2 = String.valueOf(uri);
                int i13 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Not a Google URL: ".concat(strValueOf2));
                aVarZzb = zzgdb.zzh(uri);
            }
            arrayList.add(aVarZzb);
        }
        zzgdb.zzr(zzgdb.zzd(arrayList), new zzas(this, zzbudVar, z10), this.zzf.zzA());
    }

    private final void zzW(final List list, final IObjectWrapper iObjectWrapper, zzbud zzbudVar, boolean z10) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzhO)).booleanValue()) {
            try {
                zzbudVar.zze("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e4) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzh("", e4);
                return;
            }
        }
        zzgdm zzgdmVar = this.zzk;
        a aVarZzb = zzgdmVar.zzb(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzao
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzau.zzD(this.zza, list, iObjectWrapper);
            }
        });
        if (zzY()) {
            aVarZzb = zzgdb.zzn(aVarZzb, new zzgci() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzap
                @Override // com.google.android.gms.internal.ads.zzgci
                public final a zza(Object obj) {
                    zzau zzauVar = this.zza;
                    return zzgdb.zzm(zzauVar.zzS("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new zzfut() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzae
                        @Override // com.google.android.gms.internal.ads.zzfut
                        public final Object apply(Object obj2) {
                            return zzau.zzC(this.zza, list, (String) obj2);
                        }
                    }, zzauVar.zzk);
                }
            }, zzgdmVar);
        } else {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Asset view map is empty.");
        }
        zzgdb.zzr(aVarZzb, new zzar(this, zzbudVar, z10), this.zzf.zzA());
    }

    private static boolean zzX(Uri uri, List list, List list2) {
        String host = uri.getHost();
        String path = uri.getPath();
        if (host != null && path != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (path.contains((String) it.next())) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (host.endsWith((String) it2.next())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    private final boolean zzY() {
        Map map;
        zzbug zzbugVar = this.zzm;
        return (zzbugVar == null || (map = zzbugVar.zzb) == null || map.isEmpty()) ? false : true;
    }

    private static final List zzZ(String str) {
        String[] strArrSplit = TextUtils.split(str, StringUtils.COMMA);
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArrSplit) {
            if (!zzfvv.zzd(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Uri zzaa(Uri uri, String str, String str2) {
        String string = uri.toString();
        int iIndexOf = string.indexOf("&adurl=");
        if (iIndexOf == -1) {
            iIndexOf = string.indexOf("?adurl=");
        }
        if (iIndexOf == -1) {
            return uri.buildUpon().appendQueryParameter(str, str2).build();
        }
        int i = iIndexOf + 1;
        StringBuilder sb = new StringBuilder(string.substring(0, i));
        com.google.android.gms.measurement.internal.a.l(sb, str, "=", str2, "&");
        sb.append(string.substring(i));
        return Uri.parse(sb.toString());
    }

    public static /* synthetic */ Uri zzd(zzau zzauVar, Uri uri, String str) {
        return !TextUtils.isEmpty(str) ? zzaa(uri, "nas", str) : uri;
    }

    public static /* synthetic */ Uri zzn(zzau zzauVar, Uri uri, IObjectWrapper iObjectWrapper) throws Exception {
        zzfcs zzfcsVar;
        try {
            uri = (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzmk)).booleanValue() || (zzfcsVar = zzauVar.zzi) == null) ? zzauVar.zzh.zza(uri, zzauVar.zzg, (View) ObjectWrapper.unwrap(iObjectWrapper), null) : zzfcsVar.zza(uri, zzauVar.zzg, (View) ObjectWrapper.unwrap(iObjectWrapper), null);
        } catch (zzavt e4) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzk("", e4);
        }
        if (uri.getQueryParameter("ms") != null) {
            return uri;
        }
        throw new Exception("Failed to append spam signals to click url.");
    }

    public static /* bridge */ /* synthetic */ zzfhm zzs(a aVar, zzbzc zzbzcVar) {
        if (!zzfhp.zza() || !((Boolean) zzbev.zze.zze()).booleanValue()) {
            return null;
        }
        try {
            zzfhm zzfhmVarZza = ((zzac) zzgdb.zzp(aVar)).zza();
            zzfhmVarZza.zzd(new ArrayList(Collections.singletonList(zzbzcVar.zzb)));
            com.google.android.gms.ads.internal.client.zzm zzmVar = zzbzcVar.zzd;
            zzfhmVarZza.zzb(zzmVar == null ? "" : zzmVar.zzp);
            zzfhmVarZza.zzf(zzmVar.zzm);
            return zzfhmVarZza;
        } catch (ExecutionException e4) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e4, "SignalGeneratorImpl.getConfiguredCriticalUserJourney");
            return null;
        }
    }

    public static /* synthetic */ a zzx(zzau zzauVar, zzdnr[] zzdnrVarArr, String str, zzdnr zzdnrVar) throws JSONException {
        zzdnrVarArr[0] = zzdnrVar;
        Context context = zzauVar.zzg;
        zzbug zzbugVar = zzauVar.zzm;
        Map map = zzbugVar.zzb;
        JSONObject jSONObjectZzd = zzbv.zzd(context, map, map, zzbugVar.zza, null);
        JSONObject jSONObjectZzh = zzbv.zzh(zzauVar.zzg, zzauVar.zzm.zza);
        JSONObject jSONObjectZzg = zzbv.zzg(zzauVar.zzm.zza);
        JSONObject jSONObjectZze = zzbv.zze(zzauVar.zzg, zzauVar.zzm.zza);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("asset_view_signal", jSONObjectZzd);
        jSONObject.put("ad_view_signal", jSONObjectZzh);
        jSONObject.put("scroll_view_signal", jSONObjectZzg);
        jSONObject.put("lock_screen_signal", jSONObjectZze);
        if ("google.afma.nativeAds.getPublisherCustomRenderedClickSignals".equals(str)) {
            jSONObject.put("click_signal", zzbv.zzc(null, zzauVar.zzg, zzauVar.zzo, zzauVar.zzn));
        }
        return zzdnrVar.zzg(str, jSONObject);
    }

    public final boolean zzP(Uri uri) {
        return zzX(uri, this.zzB, this.zzC);
    }

    public final boolean zzQ(Uri uri) {
        return zzX(uri, this.zzD, this.zzE);
    }

    @Override // com.google.android.gms.internal.ads.zzbyy
    public final IObjectWrapper zze(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, String str, IObjectWrapper iObjectWrapper3) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzkb)).booleanValue()) {
            return ObjectWrapper.wrap(null);
        }
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        f fVar = (f) ObjectWrapper.unwrap(iObjectWrapper2);
        C5537a c5537a = (C5537a) ObjectWrapper.unwrap(iObjectWrapper3);
        zzbeh zzbehVar = this.zzI;
        zzbehVar.zzg(context, fVar, str, c5537a);
        if (((Boolean) zzbfh.zze.zze()).booleanValue()) {
            this.zzJ.zze();
        }
        if (((Boolean) zzbfh.zzc.zze()).booleanValue()) {
            this.zzK.zzb(null);
        }
        return ObjectWrapper.wrap(zzbehVar.zzb());
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00cd  */
    @Override // com.google.android.gms.internal.ads.zzbyy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzf(com.google.android.gms.dynamic.IObjectWrapper r11, final com.google.android.gms.internal.ads.zzbzc r12, com.google.android.gms.internal.ads.zzbyv r13) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.nonagon.signalgeneration.zzau.zzf(com.google.android.gms.dynamic.IObjectWrapper, com.google.android.gms.internal.ads.zzbzc, com.google.android.gms.internal.ads.zzbyv):void");
    }

    @Override // com.google.android.gms.internal.ads.zzbyy
    public final void zzg(zzbug zzbugVar) {
        this.zzm = zzbugVar;
        this.zzj.zzc(1);
    }

    @Override // com.google.android.gms.internal.ads.zzbyy
    public final void zzh(List list, IObjectWrapper iObjectWrapper, zzbud zzbudVar) {
        zzV(list, iObjectWrapper, zzbudVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzbyy
    public final void zzi(List list, IObjectWrapper iObjectWrapper, zzbud zzbudVar) {
        zzW(list, iObjectWrapper, zzbudVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzbyy
    @SuppressLint({"AddJavascriptInterface"})
    public final void zzj(IObjectWrapper iObjectWrapper) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzjN)).booleanValue()) {
            zzbct zzbctVar = zzbdc.zzhF;
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbctVar)).booleanValue()) {
                zzU();
            }
            WebView webView = (WebView) ObjectWrapper.unwrap(iObjectWrapper);
            if (webView == null) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("The webView cannot be null.");
                return;
            }
            zzf zzfVar = this.zzK;
            final zzj zzjVar = new zzj(webView, zzfVar, zzcad.zzf);
            webView.addJavascriptInterface(new TaggingLibraryJsInterface(webView, this.zzh, this.zzp, this.zzq, this.zzi, this.zzJ, zzfVar, zzjVar), "gmaSdk");
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzjX)).booleanValue()) {
                com.google.android.gms.ads.internal.zzv.zzp().zzs();
            }
            if (((Boolean) zzbfh.zzc.zze()).booleanValue()) {
                zzfVar.zzb(webView);
                if (((Boolean) zzbfh.zzd.zze()).booleanValue()) {
                    zzcad.zzd.scheduleWithFixedDelay(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzi
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzjVar.zzb();
                        }
                    }, 0L, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzjY)).intValue(), TimeUnit.MILLISECONDS);
                }
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbctVar)).booleanValue()) {
                zzU();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbyy
    public final void zzk(IObjectWrapper iObjectWrapper) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzhO)).booleanValue()) {
            MotionEvent motionEvent = (MotionEvent) ObjectWrapper.unwrap(iObjectWrapper);
            zzbug zzbugVar = this.zzm;
            this.zzn = zzbv.zza(motionEvent, zzbugVar == null ? null : zzbugVar.zza);
            if (motionEvent.getAction() == 0) {
                this.zzo = this.zzn;
            }
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            Point point = this.zzn;
            motionEventObtain.setLocation(point.x, point.y);
            this.zzh.zzd(motionEventObtain);
            motionEventObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbyy
    public final void zzl(List list, IObjectWrapper iObjectWrapper, zzbud zzbudVar) {
        zzV(list, iObjectWrapper, zzbudVar, false);
    }

    @Override // com.google.android.gms.internal.ads.zzbyy
    public final void zzm(List list, IObjectWrapper iObjectWrapper, zzbud zzbudVar) {
        zzW(list, iObjectWrapper, zzbudVar, false);
    }
}
