package com.google.android.gms.internal.ads;

import android.os.Binder;
import android.os.Bundle;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzdwm {
    private final zzgdm zza;
    private final zzgdm zzb;
    private final zzdxw zzc;
    private final zzhfs zzd;

    public zzdwm(zzgdm zzgdmVar, zzgdm zzgdmVar2, zzdxw zzdxwVar, zzhfs zzhfsVar) {
        this.zza = zzgdmVar;
        this.zzb = zzgdmVar2;
        this.zzc = zzdxwVar;
        this.zzd = zzhfsVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ zzdyq zza(zzdwm zzdwmVar, zzbvo zzbvoVar) {
        return (zzdyq) zzdwmVar.zzc.zza(zzbvoVar).get(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzfN)).intValue(), TimeUnit.SECONDS);
    }

    public static /* synthetic */ A4.a zzb(zzdwm zzdwmVar, final zzbvo zzbvoVar, int i, zzdyp zzdypVar) {
        Bundle bundle;
        if (zzbvoVar != null && (bundle = zzbvoVar.zzm) != null) {
            bundle.putBoolean("ls", true);
        }
        return zzgdb.zzn(((zzdzt) zzdwmVar.zzd.zzb()).zzc(zzbvoVar, i), new zzgci() { // from class: com.google.android.gms.internal.ads.zzdwi
            @Override // com.google.android.gms.internal.ads.zzgci
            public final A4.a zza(Object obj) {
                return zzgdb.zzh(new zzdyq((InputStream) obj, zzbvoVar));
            }
        }, zzdwmVar.zzb);
    }

    public final A4.a zzc(final zzbvo zzbvoVar) {
        String str = zzbvoVar.zzd;
        com.google.android.gms.ads.internal.zzv.zzr();
        A4.a aVarZzg = com.google.android.gms.ads.internal.util.zzs.zzD(str) ? zzgdb.zzg(new zzdyp(1)) : zzgdb.zzf(this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzdwj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzdwm.zza(this.zza, zzbvoVar);
            }
        }), ExecutionException.class, new zzgci() { // from class: com.google.android.gms.internal.ads.zzdwk
            @Override // com.google.android.gms.internal.ads.zzgci
            public final A4.a zza(Object obj) {
                Throwable cause = (ExecutionException) obj;
                if (cause.getCause() != null) {
                    cause = cause.getCause();
                }
                return zzgdb.zzg(cause);
            }
        }, this.zzb);
        final int callingUid = Binder.getCallingUid();
        return zzgdb.zzf(aVarZzg, zzdyp.class, new zzgci() { // from class: com.google.android.gms.internal.ads.zzdwl
            @Override // com.google.android.gms.internal.ads.zzgci
            public final A4.a zza(Object obj) {
                return zzdwm.zzb(this.zza, zzbvoVar, callingUid, (zzdyp) obj);
            }
        }, this.zzb);
    }
}
