package com.google.android.gms.internal.ads;

import android.os.Binder;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzdzb {
    private final zzgdm zza;
    private final zzdyg zzb;
    private final zzhfs zzc;

    public zzdzb(zzgdm zzgdmVar, zzdyg zzdygVar, zzhfs zzhfsVar) {
        this.zza = zzgdmVar;
        this.zzb = zzdygVar;
        this.zzc = zzhfsVar;
    }

    private final A4.a zzg(final zzbvo zzbvoVar, zzdza zzdzaVar, final zzdza zzdzaVar2, final zzgci zzgciVar) {
        String str = zzbvoVar.zzd;
        com.google.android.gms.ads.internal.zzv.zzr();
        zzgcs zzgcsVarZzw = zzgcs.zzw(com.google.android.gms.ads.internal.util.zzs.zzD(str) ? zzgdb.zzg(new zzdyp(1)) : zzgdb.zzf(zzdzaVar.zza(zzbvoVar), ExecutionException.class, new zzgci() { // from class: com.google.android.gms.internal.ads.zzdyz
            @Override // com.google.android.gms.internal.ads.zzgci
            public final A4.a zza(Object obj) {
                Throwable cause = (ExecutionException) obj;
                if (cause.getCause() != null) {
                    cause = cause.getCause();
                }
                return zzgdb.zzg(cause);
            }
        }, this.zza));
        zzgci zzgciVar2 = new zzgci() { // from class: com.google.android.gms.internal.ads.zzdyx
            @Override // com.google.android.gms.internal.ads.zzgci
            public final A4.a zza(Object obj) {
                return zzgdb.zzh(((zzdyq) obj).zzb());
            }
        };
        zzgdm zzgdmVar = this.zza;
        return (zzgcs) zzgdb.zzf((zzgcs) zzgdb.zzn((zzgcs) zzgdb.zzn(zzgcsVarZzw, zzgciVar2, zzgdmVar), zzgciVar, zzgdmVar), zzdyp.class, new zzgci() { // from class: com.google.android.gms.internal.ads.zzdyy
            @Override // com.google.android.gms.internal.ads.zzgci
            public final A4.a zza(Object obj) {
                zzdzb zzdzbVar = this.zza;
                return zzgdb.zzn(zzdzaVar2.zza(zzbvoVar), zzgciVar, zzdzbVar.zza);
            }
        }, zzgdmVar);
    }

    public final A4.a zze(final zzbvo zzbvoVar) {
        zzgci zzgciVar = new zzgci() { // from class: com.google.android.gms.internal.ads.zzdyu
            @Override // com.google.android.gms.internal.ads.zzgci
            public final A4.a zza(Object obj) {
                String str = new String(zzgav.zzb((InputStream) obj), StandardCharsets.UTF_8);
                zzbvo zzbvoVar2 = zzbvoVar;
                zzbvoVar2.zzj = str;
                return zzgdb.zzh(zzbvoVar2);
            }
        };
        final zzdyg zzdygVar = this.zzb;
        Objects.requireNonNull(zzdygVar);
        return zzg(zzbvoVar, new zzdza() { // from class: com.google.android.gms.internal.ads.zzdyv
            @Override // com.google.android.gms.internal.ads.zzdza
            public final A4.a zza(zzbvo zzbvoVar2) {
                return zzdygVar.zza(zzbvoVar2);
            }
        }, new zzdza() { // from class: com.google.android.gms.internal.ads.zzdyw
            @Override // com.google.android.gms.internal.ads.zzdza
            public final A4.a zza(zzbvo zzbvoVar2) {
                return ((zzdzt) this.zza.zzc.zzb()).zzb(zzbvoVar2, Binder.getCallingUid());
            }
        }, zzgciVar);
    }

    public final A4.a zzf(zzbvo zzbvoVar) {
        return zzg(zzbvoVar, new zzdza() { // from class: com.google.android.gms.internal.ads.zzdys
            @Override // com.google.android.gms.internal.ads.zzdza
            public final A4.a zza(zzbvo zzbvoVar2) {
                return this.zza.zzb.zzd(zzbvoVar2.zzh);
            }
        }, new zzdza() { // from class: com.google.android.gms.internal.ads.zzdyt
            @Override // com.google.android.gms.internal.ads.zzdza
            public final A4.a zza(zzbvo zzbvoVar2) {
                return ((zzdzt) this.zza.zzc.zzb()).zzj(zzbvoVar2.zzh);
            }
        }, new zzgci() { // from class: com.google.android.gms.internal.ads.zzdyr
            @Override // com.google.android.gms.internal.ads.zzgci
            public final A4.a zza(Object obj) {
                return zzgdb.zzh(null);
            }
        });
    }
}
