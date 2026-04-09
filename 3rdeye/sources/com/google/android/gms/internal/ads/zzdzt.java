package com.google.android.gms.internal.ads;

import N7.C1154e9;
import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.IOUtils;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzdzt extends zzbvb {
    private final Context zza;
    private final zzgdm zzb;
    private final zzeab zzc;
    private final zzcky zzd;
    private final ArrayDeque zze;
    private final zzfhp zzf;
    private final zzbvw zzg;

    public zzdzt(Context context, zzgdm zzgdmVar, zzbvw zzbvwVar, zzcky zzckyVar, zzeab zzeabVar, ArrayDeque arrayDeque, zzdzy zzdzyVar, zzfhp zzfhpVar) {
        zzbdc.zza(context);
        this.zza = context;
        this.zzb = zzgdmVar;
        this.zzg = zzbvwVar;
        this.zzc = zzeabVar;
        this.zzd = zzckyVar;
        this.zze = arrayDeque;
        this.zzf = zzfhpVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InputStream zzk(zzdzt zzdztVar, A4.a aVar, A4.a aVar2, zzbvo zzbvoVar, zzfhb zzfhbVar) {
        String strZze = ((zzbvq) aVar.get()).zze();
        zzdztVar.zzo(new zzdzq((zzbvq) aVar.get(), (JSONObject) aVar2.get(), zzbvoVar.zzh, strZze, zzfhbVar));
        return new ByteArrayInputStream(strZze.getBytes(StandardCharsets.UTF_8));
    }

    private final synchronized zzdzq zzl(String str) {
        Iterator it = this.zze.iterator();
        while (it.hasNext()) {
            zzdzq zzdzqVar = (zzdzq) it.next();
            if (zzdzqVar.zzc.equals(str)) {
                it.remove();
                return zzdzqVar;
            }
        }
        return null;
    }

    private static A4.a zzm(A4.a aVar, zzfgs zzfgsVar, zzbou zzbouVar, zzfhm zzfhmVar, zzfhb zzfhbVar) {
        zzbok zzbokVarZza = zzbouVar.zza("AFMA_getAdDictionary", zzbor.zza, new zzbom() { // from class: com.google.android.gms.internal.ads.zzdzk
            @Override // com.google.android.gms.internal.ads.zzbom
            public final Object zza(JSONObject jSONObject) {
                return new zzbvq(jSONObject);
            }
        });
        zzfhl.zzd(aVar, zzfhbVar);
        zzffy zzffyVarZza = zzfgsVar.zzb(zzfgm.BUILD_URL, aVar).zzf(zzbokVarZza).zza();
        zzfhl.zzc(zzffyVarZza, zzfhmVar, zzfhbVar);
        return zzffyVarZza;
    }

    private static A4.a zzn(final zzbvo zzbvoVar, zzfgs zzfgsVar, final zzeux zzeuxVar) {
        zzgci zzgciVar = new zzgci() { // from class: com.google.android.gms.internal.ads.zzdze
            @Override // com.google.android.gms.internal.ads.zzgci
            public final A4.a zza(Object obj) {
                return zzeuxVar.zzb().zza(com.google.android.gms.ads.internal.client.zzbb.zzb().zzn((Bundle) obj), zzbvoVar.zzm, false);
            }
        };
        return zzfgsVar.zzb(zzfgm.GMS_SIGNALS, zzgdb.zzh(zzbvoVar.zza)).zzf(zzgciVar).zze(new zzffw() { // from class: com.google.android.gms.internal.ads.zzdzf
            @Override // com.google.android.gms.internal.ads.zzffw
            public final Object zza(Object obj) {
                JSONObject jSONObject = (JSONObject) obj;
                com.google.android.gms.ads.internal.util.zze.zza("Ad request signals:");
                com.google.android.gms.ads.internal.util.zze.zza(jSONObject.toString(2));
                return jSONObject;
            }
        }).zza();
    }

    private final synchronized void zzo(zzdzq zzdzqVar) {
        zzp();
        this.zze.addLast(zzdzqVar);
    }

    private final synchronized void zzp() {
        int iIntValue = ((Long) zzbfj.zzb.zze()).intValue();
        while (true) {
            ArrayDeque arrayDeque = this.zze;
            if (arrayDeque.size() >= iIntValue) {
                arrayDeque.removeFirst();
            }
        }
    }

    private final void zzq(A4.a aVar, zzbvg zzbvgVar, zzbvo zzbvoVar) {
        zzgdb.zzr(zzgdb.zzn(aVar, new zzgci(this) { // from class: com.google.android.gms.internal.ads.zzdzl
            @Override // com.google.android.gms.internal.ads.zzgci
            public final A4.a zza(Object obj) throws IOException {
                final InputStream inputStream = (InputStream) obj;
                ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe = ParcelFileDescriptor.createPipe();
                ParcelFileDescriptor parcelFileDescriptor = parcelFileDescriptorArrCreatePipe[0];
                final ParcelFileDescriptor parcelFileDescriptor2 = parcelFileDescriptorArrCreatePipe[1];
                zzcad.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfdo
                    @Override // java.lang.Runnable
                    public final void run() throws IOException {
                        InputStream inputStream2 = inputStream;
                        try {
                            try {
                                ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptor2);
                                try {
                                    IOUtils.copyStream(inputStream2, autoCloseOutputStream);
                                    autoCloseOutputStream.close();
                                    if (inputStream2 != null) {
                                        inputStream2.close();
                                    }
                                } finally {
                                }
                            } catch (IOException unused) {
                            }
                        } finally {
                        }
                    }
                });
                return zzgdb.zzh(parcelFileDescriptor);
            }
        }, zzcad.zza), new zzdzp(this, zzbvoVar, zzbvgVar), zzcad.zzg);
    }

    public final A4.a zzb(final zzbvo zzbvoVar, int i) {
        if (!((Boolean) zzbfj.zza.zze()).booleanValue()) {
            return zzgdb.zzg(new Exception("Split request is disabled."));
        }
        zzfei zzfeiVar = zzbvoVar.zzi;
        if (zzfeiVar == null) {
            return zzgdb.zzg(new Exception("Pool configuration missing from request."));
        }
        if (zzfeiVar.zzc == 0 || zzfeiVar.zzd == 0) {
            return zzgdb.zzg(new Exception("Caching is disabled."));
        }
        Context context = this.zza;
        zzbou zzbouVarZzb = com.google.android.gms.ads.internal.zzv.zzg().zzb(context, VersionInfoParcel.forPackage(), this.zzf);
        zzeux zzeuxVarZzq = this.zzd.zzq(zzbvoVar, i);
        zzfgs zzfgsVarZze = zzeuxVarZzq.zze();
        final A4.a aVarZzn = zzn(zzbvoVar, zzfgsVarZze, zzeuxVarZzq);
        zzfhm zzfhmVarZzf = zzeuxVarZzq.zzf();
        final zzfhb zzfhbVarZza = zzfha.zza(context, 9);
        final A4.a aVarZzm = zzm(aVarZzn, zzfgsVarZze, zzbouVarZzb, zzfhmVarZzf, zzfhbVarZza);
        return zzfgsVarZze.zza(zzfgm.GET_URL_AND_CACHE_KEY, aVarZzn, aVarZzm).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdzi
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzdzt.zzk(this.zza, aVarZzm, aVarZzn, zzbvoVar, zzfhbVarZza);
            }
        }).zza();
    }

    public final A4.a zzc(final zzbvo zzbvoVar, int i) {
        zzdzq zzdzqVarZzl;
        zzffy zzffyVarZza;
        zzbol zzbolVarZzg = com.google.android.gms.ads.internal.zzv.zzg();
        Context context = this.zza;
        zzbou zzbouVarZzb = zzbolVarZzg.zzb(context, VersionInfoParcel.forPackage(), this.zzf);
        zzeux zzeuxVarZzq = this.zzd.zzq(zzbvoVar, i);
        zzbok zzbokVarZza = zzbouVarZzb.zza("google.afma.response.normalize", zzdzs.zza, zzbor.zzb);
        if (((Boolean) zzbfj.zza.zze()).booleanValue()) {
            zzdzqVarZzl = zzl(zzbvoVar.zzh);
            if (zzdzqVarZzl == null) {
                com.google.android.gms.ads.internal.util.zze.zza("Request contained a PoolKey but no matching parameters were found.");
            }
        } else {
            String str = zzbvoVar.zzj;
            zzdzqVarZzl = null;
            if (str != null && !str.isEmpty()) {
                com.google.android.gms.ads.internal.util.zze.zza("Request contained a PoolKey but split request is disabled.");
            }
        }
        zzfhb zzfhbVarZza = zzdzqVarZzl == null ? zzfha.zza(context, 9) : zzdzqVarZzl.zzd;
        zzfhm zzfhmVarZzf = zzeuxVarZzq.zzf();
        zzfhmVarZzf.zzd(zzbvoVar.zza.getStringArrayList("ad_types"));
        zzeaa zzeaaVar = new zzeaa(zzbvoVar.zzg, zzfhmVarZzf, zzfhbVarZza);
        zzdzx zzdzxVar = new zzdzx(context, zzbvoVar.zzb.afmaVersion, this.zzg, i);
        zzfgs zzfgsVarZze = zzeuxVarZzq.zze();
        zzfhb zzfhbVarZza2 = zzfha.zza(context, 11);
        if (zzdzqVarZzl == null) {
            final A4.a aVarZzn = zzn(zzbvoVar, zzfgsVarZze, zzeuxVarZzq);
            final A4.a aVarZzm = zzm(aVarZzn, zzfgsVarZze, zzbouVarZzb, zzfhmVarZzf, zzfhbVarZza);
            zzfhb zzfhbVarZza3 = zzfha.zza(context, 10);
            final zzffy zzffyVarZza2 = zzfgsVarZze.zza(zzfgm.HTTP, aVarZzm, aVarZzn).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdzg
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Bundle bundle;
                    zzbvq zzbvqVar = (zzbvq) aVarZzm.get();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzco)).booleanValue() && (bundle = zzbvoVar.zzm) != null) {
                        bundle.putLong(zzdrk.GET_AD_DICTIONARY_SDKCORE_START.zza(), zzbvqVar.zzc());
                        bundle.putLong(zzdrk.GET_AD_DICTIONARY_SDKCORE_END.zza(), zzbvqVar.zzb());
                    }
                    return new zzdzz((JSONObject) aVarZzn.get(), zzbvqVar);
                }
            }).zze(zzeaaVar).zze(new zzfhh(zzfhbVarZza3)).zze(zzdzxVar).zza();
            zzfhl.zza(zzffyVarZza2, zzfhmVarZzf, zzfhbVarZza3);
            zzfhl.zzd(zzffyVarZza2, zzfhbVarZza2);
            zzffyVarZza = zzfgsVarZze.zza(zzfgm.PRE_PROCESS, aVarZzn, aVarZzm, zzffyVarZza2).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdzh
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Bundle bundle;
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzco)).booleanValue() && (bundle = zzbvoVar.zzm) != null) {
                        C1154e9.l(bundle, zzdrk.HTTP_RESPONSE_READY.zza());
                    }
                    return new zzdzs((zzdzw) zzffyVarZza2.get(), (JSONObject) aVarZzn.get(), (zzbvq) aVarZzm.get());
                }
            }).zzf(zzbokVarZza).zza();
        } else {
            zzdzz zzdzzVar = new zzdzz(zzdzqVarZzl.zzb, zzdzqVarZzl.zza);
            zzfhb zzfhbVarZza4 = zzfha.zza(context, 10);
            final zzffy zzffyVarZza3 = zzfgsVarZze.zzb(zzfgm.HTTP, zzgdb.zzh(zzdzzVar)).zze(zzeaaVar).zze(new zzfhh(zzfhbVarZza4)).zze(zzdzxVar).zza();
            zzfhl.zza(zzffyVarZza3, zzfhmVarZzf, zzfhbVarZza4);
            final A4.a aVarZzh = zzgdb.zzh(zzdzqVarZzl);
            zzfhl.zzd(zzffyVarZza3, zzfhbVarZza2);
            zzffyVarZza = zzfgsVarZze.zza(zzfgm.PRE_PROCESS, zzffyVarZza3, aVarZzh).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdzd
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    zzdzw zzdzwVar = (zzdzw) zzffyVarZza3.get();
                    A4.a aVar = aVarZzh;
                    return new zzdzs(zzdzwVar, ((zzdzq) aVar.get()).zzb, ((zzdzq) aVar.get()).zza);
                }
            }).zzf(zzbokVarZza).zza();
        }
        zzfhl.zza(zzffyVarZza, zzfhmVarZzf, zzfhbVarZza2);
        return zzffyVarZza;
    }

    public final A4.a zzd(final zzbvo zzbvoVar, int i) {
        zzbol zzbolVarZzg = com.google.android.gms.ads.internal.zzv.zzg();
        Context context = this.zza;
        zzbou zzbouVarZzb = zzbolVarZzg.zzb(context, VersionInfoParcel.forPackage(), this.zzf);
        if (!((Boolean) zzbfo.zza.zze()).booleanValue()) {
            return zzgdb.zzg(new Exception("Signal collection disabled."));
        }
        zzeux zzeuxVarZzq = this.zzd.zzq(zzbvoVar, i);
        final zzetx zzetxVarZza = zzeuxVarZzq.zza();
        zzbok zzbokVarZza = zzbouVarZzb.zza("google.afma.request.getSignals", zzbor.zza, zzbor.zzb);
        zzfhb zzfhbVarZza = zzfha.zza(context, 22);
        zzfgs zzfgsVarZze = zzeuxVarZzq.zze();
        zzfgm zzfgmVar = zzfgm.GET_SIGNALS;
        Bundle bundle = zzbvoVar.zza;
        zzffy zzffyVarZza = zzfgsVarZze.zzb(zzfgmVar, zzgdb.zzh(bundle)).zze(new zzfhh(zzfhbVarZza)).zzf(new zzgci() { // from class: com.google.android.gms.internal.ads.zzdzm
            @Override // com.google.android.gms.internal.ads.zzgci
            public final A4.a zza(Object obj) throws JSONException {
                return zzetxVarZza.zza(com.google.android.gms.ads.internal.client.zzbb.zzb().zzn((Bundle) obj), zzbvoVar.zzm, false);
            }
        }).zzb(zzfgm.JS_SIGNALS).zzf(zzbokVarZza).zza();
        zzfhm zzfhmVarZzf = zzeuxVarZzq.zzf();
        zzfhmVarZzf.zzd(bundle.getStringArrayList("ad_types"));
        zzfhmVarZzf.zzf(bundle.getBundle("extras"));
        zzfhl.zzb(zzffyVarZza, zzfhmVarZzf, zzfhbVarZza);
        if (((Boolean) zzbfc.zzf.zze()).booleanValue()) {
            zzeab zzeabVar = this.zzc;
            Objects.requireNonNull(zzeabVar);
            zzffyVarZza.addListener(new zzdzj(zzeabVar), this.zzb);
        }
        return zzffyVarZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbvc
    public final void zze(zzbvo zzbvoVar, zzbvg zzbvgVar) {
        zzq(zzb(zzbvoVar, Binder.getCallingUid()), zzbvgVar, zzbvoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbvc
    public final void zzf(zzbvo zzbvoVar, zzbvg zzbvgVar) {
        Bundle bundle;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzco)).booleanValue() && (bundle = zzbvoVar.zzm) != null) {
            C1154e9.l(bundle, zzdrk.SERVICE_CONNECTED.zza());
        }
        zzq(zzd(zzbvoVar, Binder.getCallingUid()), zzbvgVar, zzbvoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbvc
    public final void zzg(zzbvo zzbvoVar, zzbvg zzbvgVar) {
        Bundle bundle;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzco)).booleanValue() && (bundle = zzbvoVar.zzm) != null) {
            C1154e9.l(bundle, zzdrk.SERVICE_CONNECTED.zza());
        }
        A4.a aVarZzc = zzc(zzbvoVar, Binder.getCallingUid());
        zzq(aVarZzc, zzbvgVar, zzbvoVar);
        if (((Boolean) zzbfc.zze.zze()).booleanValue()) {
            zzeab zzeabVar = this.zzc;
            Objects.requireNonNull(zzeabVar);
            aVarZzc.addListener(new zzdzj(zzeabVar), this.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvc
    public final void zzh(String str, zzbvg zzbvgVar) {
        zzq(zzj(str), zzbvgVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbvc
    public final void zzi(zzbuy zzbuyVar, zzbvh zzbvhVar) {
        if (((Boolean) zzbfq.zza.zze()).booleanValue()) {
            this.zzd.zzD();
            String str = zzbuyVar.zza;
            zzgdb.zzr(zzgdb.zzh(null), new zzdzn(this, zzbvhVar, zzbuyVar), zzcad.zzg);
        } else {
            try {
                zzbvhVar.zzf("", zzbuyVar);
            } catch (RemoteException e4) {
                com.google.android.gms.ads.internal.util.zze.zzb("Service can't call client", e4);
            }
        }
    }

    public final A4.a zzj(String str) {
        if (((Boolean) zzbfj.zza.zze()).booleanValue()) {
            return zzl(str) == null ? zzgdb.zzg(new Exception("URL to be removed not found for cache key: ".concat(String.valueOf(str)))) : zzgdb.zzh(new zzdzo(this));
        }
        return zzgdb.zzg(new Exception("Split request is disabled."));
    }
}
