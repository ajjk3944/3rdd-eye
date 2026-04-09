package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzdug {
    private final Context zzf;
    private final WeakReference zzg;
    private final zzdps zzh;
    private final Executor zzi;
    private final Executor zzj;
    private final ScheduledExecutorService zzk;
    private final zzdsn zzl;
    private final VersionInfoParcel zzm;
    private final zzdcv zzo;
    private final zzfhp zzp;
    private boolean zza = false;
    private boolean zzb = false;
    private boolean zzc = false;
    private final zzcai zze = new zzcai();
    private final Map zzn = new ConcurrentHashMap();
    private boolean zzq = true;
    private final long zzd = com.google.android.gms.ads.internal.zzv.zzD().elapsedRealtime();

    public zzdug(Executor executor, Context context, WeakReference weakReference, Executor executor2, zzdps zzdpsVar, ScheduledExecutorService scheduledExecutorService, zzdsn zzdsnVar, VersionInfoParcel versionInfoParcel, zzdcv zzdcvVar, zzfhp zzfhpVar) {
        this.zzh = zzdpsVar;
        this.zzf = context;
        this.zzg = weakReference;
        this.zzi = executor2;
        this.zzk = scheduledExecutorService;
        this.zzj = executor;
        this.zzl = zzdsnVar;
        this.zzm = versionInfoParcel;
        this.zzo = zzdcvVar;
        this.zzp = zzfhpVar;
        zzv("com.google.android.gms.ads.MobileAds", false, "", 0);
    }

    public static /* synthetic */ Object zzf(zzdug zzdugVar, zzfhb zzfhbVar) {
        zzdugVar.zze.zzc(Boolean.TRUE);
        zzfhbVar.zzg(true);
        zzdugVar.zzp.zzc(zzfhbVar.zzm());
        return null;
    }

    public static /* synthetic */ void zzi(zzdug zzdugVar, Object obj, zzcai zzcaiVar, String str, long j4, zzfhb zzfhbVar) {
        synchronized (obj) {
            try {
                if (!zzcaiVar.isDone()) {
                    zzdugVar.zzv(str, false, "Timeout.", (int) (com.google.android.gms.ads.internal.zzv.zzD().elapsedRealtime() - j4));
                    zzdugVar.zzl.zzb(str, "timeout");
                    zzdugVar.zzo.zzb(str, "timeout");
                    zzfhp zzfhpVar = zzdugVar.zzp;
                    zzfhbVar.zzc("Timeout");
                    zzfhbVar.zzg(false);
                    zzfhpVar.zzc(zzfhbVar.zzm());
                    zzcaiVar.zzc(Boolean.FALSE);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ void zzj(zzdug zzdugVar) {
        zzdugVar.zzl.zze();
        zzdugVar.zzo.zze();
        zzdugVar.zzb = true;
    }

    public static /* synthetic */ void zzl(zzdug zzdugVar) {
        synchronized (zzdugVar) {
            try {
                if (zzdugVar.zzc) {
                    return;
                }
                zzdugVar.zzv("com.google.android.gms.ads.MobileAds", false, "Timeout.", (int) (com.google.android.gms.ads.internal.zzv.zzD().elapsedRealtime() - zzdugVar.zzd));
                zzdugVar.zzl.zzb("com.google.android.gms.ads.MobileAds", "timeout");
                zzdugVar.zzo.zzb("com.google.android.gms.ads.MobileAds", "timeout");
                zzdugVar.zze.zzd(new Exception());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ void zzm(zzdug zzdugVar, String str, zzbmf zzbmfVar, zzfdm zzfdmVar, List list) {
        try {
            try {
                if (Objects.equals(str, "com.google.ads.mediation.admob.AdMobAdapter")) {
                    zzbmfVar.zzf();
                    return;
                }
                Context context = (Context) zzdugVar.zzg.get();
                if (context == null) {
                    context = zzdugVar.zzf;
                }
                zzfdmVar.zzi(context, zzbmfVar, list);
            } catch (RemoteException e4) {
                throw new zzfwc(e4);
            } catch (zzfcv unused) {
                zzbmfVar.zze("Failed to initialize adapter. " + str + " does not implement the initialize() method.");
            }
        } catch (RemoteException e10) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e10);
        }
    }

    public static /* bridge */ /* synthetic */ void zzo(zzdug zzdugVar, String str) throws JSONException {
        final zzdug zzdugVar2 = zzdugVar;
        Context context = zzdugVar2.zzf;
        int i = 5;
        final zzfhb zzfhbVarZza = zzfha.zza(context, 5);
        zzfhbVarZza.zzi();
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(str).getJSONObject("initializer_settings").getJSONObject("config");
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                final String next = itKeys.next();
                final zzfhb zzfhbVarZza2 = zzfha.zza(context, i);
                zzfhbVarZza2.zzi();
                zzfhbVarZza2.zzd(next);
                final Object obj = new Object();
                final zzcai zzcaiVar = new zzcai();
                A4.a aVarZzo = zzgdb.zzo(zzcaiVar, ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzbY)).longValue(), TimeUnit.SECONDS, zzdugVar2.zzk);
                zzdugVar2.zzl.zzc(next);
                zzdugVar2.zzo.zzc(next);
                final long jElapsedRealtime = com.google.android.gms.ads.internal.zzv.zzD().elapsedRealtime();
                aVarZzo.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdtw
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzdug.zzi(this.zza, obj, zzcaiVar, next, jElapsedRealtime, zzfhbVarZza2);
                    }
                }, zzdugVar2.zzi);
                arrayList.add(aVarZzo);
                try {
                } catch (JSONException e4) {
                    e = e4;
                    zzdugVar2 = zzdugVar;
                }
                try {
                    final zzduf zzdufVar = new zzduf(zzdugVar, obj, next, jElapsedRealtime, zzfhbVarZza2, zzcaiVar);
                    zzdugVar2 = zzdugVar;
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
                    final ArrayList arrayList2 = new ArrayList();
                    if (jSONObjectOptJSONObject != null) {
                        try {
                            JSONArray jSONArray = jSONObjectOptJSONObject.getJSONArray("data");
                            int i10 = 0;
                            while (i10 < jSONArray.length()) {
                                JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                                String strOptString = jSONObject2.optString("format", "");
                                JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("data");
                                Bundle bundle = new Bundle();
                                if (jSONObjectOptJSONObject2 != null) {
                                    Iterator<String> itKeys2 = jSONObjectOptJSONObject2.keys();
                                    while (itKeys2.hasNext()) {
                                        String next2 = itKeys2.next();
                                        bundle.putString(next2, jSONObjectOptJSONObject2.optString(next2, ""));
                                        jSONArray = jSONArray;
                                    }
                                }
                                JSONArray jSONArray2 = jSONArray;
                                arrayList2.add(new zzbml(strOptString, bundle));
                                i10++;
                                jSONArray = jSONArray2;
                            }
                        } catch (JSONException unused) {
                        }
                    }
                    zzdugVar2.zzv(next, false, "", 0);
                    try {
                        final zzfdm zzfdmVarZzc = zzdugVar2.zzh.zzc(next, new JSONObject());
                        zzdugVar2.zzj.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdub
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzdug.zzm(this.zza, next, zzdufVar, zzfdmVarZzc, arrayList2);
                            }
                        });
                    } catch (zzfcv e10) {
                        try {
                            String str2 = "Failed to create Adapter.";
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zznh)).booleanValue()) {
                                str2 = "Failed to create Adapter. " + e10.getMessage();
                            }
                            zzdufVar.zze(str2);
                        } catch (RemoteException e11) {
                            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e11);
                        }
                    }
                    i = 5;
                } catch (JSONException e12) {
                    e = e12;
                    zzdugVar2 = zzdugVar;
                    com.google.android.gms.ads.internal.util.zze.zzb("Malformed CLD response", e);
                    zzdugVar2.zzo.zza("MalformedJson");
                    zzdugVar2.zzl.zza("MalformedJson");
                    zzdugVar2.zze.zzd(e);
                    com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "AdapterInitializer.updateAdapterStatus");
                    zzfhp zzfhpVar = zzdugVar2.zzp;
                    zzfhbVarZza.zzh(e);
                    zzfhbVarZza.zzg(false);
                    zzfhpVar.zzc(zzfhbVarZza.zzm());
                }
            }
            zzgdb.zza(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdtx
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    zzdug.zzf(this.zza, zzfhbVarZza);
                    return null;
                }
            }, zzdugVar2.zzi);
        } catch (JSONException e13) {
            e = e13;
            com.google.android.gms.ads.internal.util.zze.zzb("Malformed CLD response", e);
            zzdugVar2.zzo.zza("MalformedJson");
            zzdugVar2.zzl.zza("MalformedJson");
            zzdugVar2.zze.zzd(e);
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "AdapterInitializer.updateAdapterStatus");
            zzfhp zzfhpVar2 = zzdugVar2.zzp;
            zzfhbVarZza.zzh(e);
            zzfhbVarZza.zzg(false);
            zzfhpVar2.zzc(zzfhbVarZza.zzm());
        }
    }

    private final synchronized A4.a zzu() {
        String strZzc = com.google.android.gms.ads.internal.zzv.zzp().zzi().zzg().zzc();
        if (!TextUtils.isEmpty(strZzc)) {
            return zzgdb.zzh(strZzc);
        }
        final zzcai zzcaiVar = new zzcai();
        com.google.android.gms.ads.internal.zzv.zzp().zzi().zzo(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdty
            @Override // java.lang.Runnable
            public final void run() {
                zzdug zzdugVar = this.zza;
                zzdugVar.zzi.execute(new Runnable(zzdugVar, zzcaiVar) { // from class: com.google.android.gms.internal.ads.zzdua
                    public final /* synthetic */ zzcai zza;

                    {
                        this.zza = zzcaiVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        String strZzc2 = com.google.android.gms.ads.internal.zzv.zzp().zzi().zzg().zzc();
                        boolean zIsEmpty = TextUtils.isEmpty(strZzc2);
                        zzcai zzcaiVar2 = this.zza;
                        if (zIsEmpty) {
                            zzcaiVar2.zzd(new Exception());
                        } else {
                            zzcaiVar2.zzc(strZzc2);
                        }
                    }
                });
            }
        });
        return zzcaiVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzv(String str, boolean z10, String str2, int i) {
        this.zzn.put(str, new zzbmb(str, z10, i, str2));
    }

    public final List zzg() {
        ArrayList arrayList = new ArrayList();
        Map map = this.zzn;
        for (String str : map.keySet()) {
            zzbmb zzbmbVar = (zzbmb) map.get(str);
            arrayList.add(new zzbmb(str, zzbmbVar.zzb, zzbmbVar.zzc, zzbmbVar.zzd));
        }
        return arrayList;
    }

    public final void zzq() {
        this.zzq = false;
    }

    public final void zzr() {
        if (!((Boolean) zzbfi.zza.zze()).booleanValue()) {
            if (this.zzm.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzbX)).intValue() && this.zzq) {
                if (this.zza) {
                    return;
                }
                synchronized (this) {
                    try {
                        if (this.zza) {
                            return;
                        }
                        this.zzl.zzf();
                        this.zzo.zzf();
                        zzcai zzcaiVar = this.zze;
                        Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzduc
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzdug.zzj(this.zza);
                            }
                        };
                        Executor executor = this.zzi;
                        zzcaiVar.addListener(runnable, executor);
                        this.zza = true;
                        A4.a aVarZzu = zzu();
                        this.zzk.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdtv
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzdug.zzl(this.zza);
                            }
                        }, ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzbZ)).longValue(), TimeUnit.SECONDS);
                        zzgdb.zzr(aVarZzu, new zzdue(this), executor);
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        if (this.zza) {
            return;
        }
        zzv("com.google.android.gms.ads.MobileAds", true, "", 0);
        this.zze.zzc(Boolean.FALSE);
        this.zza = true;
        this.zzb = true;
    }

    public final void zzs(final zzbmi zzbmiVar) {
        this.zze.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdtz
            @Override // java.lang.Runnable
            public final void run() {
                zzdug zzdugVar = this.zza;
                try {
                    zzbmiVar.zzb(zzdugVar.zzg());
                } catch (RemoteException e4) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzh("", e4);
                }
            }
        }, this.zzj);
    }

    public final boolean zzt() {
        return this.zzb;
    }
}
