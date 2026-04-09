package com.google.android.gms.internal.ads;

import android.os.Binder;
import android.os.Bundle;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzdxg {
    private final ScheduledExecutorService zza;
    private final zzgdm zzb;
    private final zzgdm zzc;
    private final zzdyc zzd;
    private final zzhfs zze;

    public zzdxg(ScheduledExecutorService scheduledExecutorService, zzgdm zzgdmVar, zzgdm zzgdmVar2, zzdyc zzdycVar, zzhfs zzhfsVar) {
        this.zza = scheduledExecutorService;
        this.zzb = zzgdmVar;
        this.zzc = zzgdmVar2;
        this.zzd = zzdycVar;
        this.zze = zzhfsVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ zzdyq zza(zzdxg zzdxgVar, zzbvo zzbvoVar) {
        return (zzdyq) zzdxgVar.zzd.zza(zzbvoVar).get(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzfN)).intValue(), TimeUnit.SECONDS);
    }

    public static /* synthetic */ A4.a zzb(zzdxg zzdxgVar, final zzbvo zzbvoVar, int i, Throwable th) {
        Bundle bundle;
        if (zzbvoVar != null && (bundle = zzbvoVar.zzm) != null) {
            bundle.putBoolean("ls", true);
        }
        return zzgdb.zzn(((zzdzt) zzdxgVar.zze.zzb()).zzd(zzbvoVar, i), new zzgci() { // from class: com.google.android.gms.internal.ads.zzdxd
            @Override // com.google.android.gms.internal.ads.zzgci
            public final A4.a zza(Object obj) {
                return zzgdb.zzh(new zzdyq((InputStream) obj, zzbvoVar));
            }
        }, zzdxgVar.zzb);
    }

    public final A4.a zzc(final zzbvo zzbvoVar) {
        A4.a aVarZzb;
        String str = zzbvoVar.zzd;
        com.google.android.gms.ads.internal.zzv.zzr();
        if (com.google.android.gms.ads.internal.util.zzs.zzD(str)) {
            aVarZzb = zzgdb.zzg(new zzdyp(1));
        } else {
            aVarZzb = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzhE)).booleanValue() ? this.zzc.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzdxe
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzdxg.zza(this.zza, zzbvoVar);
                }
            }) : this.zzd.zza(zzbvoVar);
        }
        final int callingUid = Binder.getCallingUid();
        return (zzgcs) zzgdb.zzf((zzgcs) zzgdb.zzo(zzgcs.zzw(aVarZzb), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzfN)).intValue(), TimeUnit.SECONDS, this.zza), Throwable.class, new zzgci() { // from class: com.google.android.gms.internal.ads.zzdxf
            @Override // com.google.android.gms.internal.ads.zzgci
            public final A4.a zza(Object obj) {
                return zzdxg.zzb(this.zza, zzbvoVar, callingUid, (Throwable) obj);
            }
        }, this.zzb);
    }
}
