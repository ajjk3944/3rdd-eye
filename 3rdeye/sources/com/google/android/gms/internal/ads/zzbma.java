package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzbma implements zzapu {
    private volatile zzbln zza;
    private final Context zzb;

    public zzbma(Context context) {
        this.zzb = context;
    }

    public static /* bridge */ /* synthetic */ void zzc(zzbma zzbmaVar) {
        if (zzbmaVar.zza == null) {
            return;
        }
        zzbmaVar.zza.disconnect();
        Binder.flushPendingCommands();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzapu
    public final zzapx zza(zzaqb zzaqbVar) throws zzaqk {
        Parcelable.Creator<zzblo> creator = zzblo.CREATOR;
        Map mapZzl = zzaqbVar.zzl();
        int size = mapZzl.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i = 0;
        for (Map.Entry entry : mapZzl.entrySet()) {
            strArr[i] = (String) entry.getKey();
            strArr2[i] = (String) entry.getValue();
            i++;
        }
        zzblo zzbloVar = new zzblo(zzaqbVar.zzk(), strArr, strArr2);
        long jElapsedRealtime = com.google.android.gms.ads.internal.zzv.zzD().elapsedRealtime();
        try {
            zzcai zzcaiVar = new zzcai();
            this.zza = new zzbln(this.zzb, com.google.android.gms.ads.internal.zzv.zzv().zzb(), new zzbly(this, zzcaiVar), new zzblz(this, zzcaiVar));
            this.zza.checkAvailabilityAndConnect();
            zzblw zzblwVar = new zzblw(this, zzbloVar);
            zzgdm zzgdmVar = zzcad.zza;
            A4.a aVarZzo = zzgdb.zzo(zzgdb.zzn(zzcaiVar, zzblwVar, zzgdmVar), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzeG)).intValue(), TimeUnit.MILLISECONDS, zzcad.zzd);
            aVarZzo.addListener(new zzblx(this), zzgdmVar);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) aVarZzo.get();
            com.google.android.gms.ads.internal.util.zze.zza("Http assets remote cache took " + (com.google.android.gms.ads.internal.zzv.zzD().elapsedRealtime() - jElapsedRealtime) + "ms");
            zzblq zzblqVar = (zzblq) new zzbvm(parcelFileDescriptor).zza(zzblq.CREATOR);
            if (zzblqVar != null) {
                if (zzblqVar.zza) {
                    throw new zzaqk(zzblqVar.zzb);
                }
                String[] strArr3 = zzblqVar.zze;
                String[] strArr4 = zzblqVar.zzf;
                if (strArr3.length == strArr4.length) {
                    HashMap map = new HashMap();
                    for (int i10 = 0; i10 < strArr3.length; i10++) {
                        map.put(strArr3[i10], strArr4[i10]);
                    }
                    return new zzapx(zzblqVar.zzc, zzblqVar.zzd, map, zzblqVar.zzg, zzblqVar.zzh);
                }
            }
            return null;
        } catch (InterruptedException | ExecutionException unused) {
            com.google.android.gms.ads.internal.util.zze.zza("Http assets remote cache took " + (com.google.android.gms.ads.internal.zzv.zzD().elapsedRealtime() - jElapsedRealtime) + "ms");
            return null;
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.zze.zza("Http assets remote cache took " + (com.google.android.gms.ads.internal.zzv.zzD().elapsedRealtime() - jElapsedRealtime) + "ms");
            throw th;
        }
    }
}
