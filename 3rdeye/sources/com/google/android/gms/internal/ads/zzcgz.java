package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public abstract class zzcgz implements zzcky {
    private static zzcgz zza;

    private static synchronized zzcgz zzE(Context context, zzbpo zzbpoVar, int i, boolean z10, int i10, zzcif zzcifVar) {
        try {
            zzcgz zzcgzVar = zza;
            if (zzcgzVar != null) {
                return zzcgzVar;
            }
            long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzv.zzD().currentTimeMillis();
            zzbdc.zza(context);
            if (((Boolean) zzbeu.zze.zze()).booleanValue()) {
                zzbcm.zzd(context);
            }
            zzfdk zzfdkVarZzd = zzfdk.zzd(context);
            VersionInfoParcel versionInfoParcelZzc = zzfdkVarZzd.zzc(ModuleDescriptor.MODULE_VERSION, false, i10);
            zzfdkVarZzd.zzf(zzbpoVar);
            zzciu zzciuVar = new zzciu(null);
            zzcha zzchaVar = new zzcha();
            zzchaVar.zzf(versionInfoParcelZzc);
            zzchaVar.zze(context);
            zzchaVar.zzd(jCurrentTimeMillis);
            zzciuVar.zzb(new zzchc(zzchaVar, null));
            zzciuVar.zzc(new zzcjo(zzcifVar));
            zzcgz zzcgzVarZza = zzciuVar.zza();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zznF)).booleanValue()) {
                com.google.android.gms.ads.internal.zzv.zzq().zzb(zzffm.zzc(), zzcgzVarZza.zzi());
                com.google.android.gms.ads.internal.zzv.zzq().zzc();
            }
            com.google.android.gms.ads.internal.zzv.zzp().zzu(context, versionInfoParcelZzc);
            com.google.android.gms.ads.internal.zzv.zzc().zzi(context);
            com.google.android.gms.ads.internal.zzv.zzr().zzm(context);
            com.google.android.gms.ads.internal.zzv.zzr().zzl(context);
            com.google.android.gms.ads.internal.util.zzd.zza(context);
            com.google.android.gms.ads.internal.zzv.zzb().zzd(context);
            com.google.android.gms.ads.internal.zzv.zzx().zzb(context);
            ((com.google.android.gms.ads.internal.util.zzcb) ((zzcij) zzcgzVarZza).zzaj.zzb()).zzc();
            zzbyn.zzb(context);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzgq)).booleanValue()) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzaK)).booleanValue()) {
                    new zzebf(context, versionInfoParcelZzc, new zzbca(new zzbcg(context)), new zzeak(new zzeag(context), (zzgdm) ((zzcij) zzcgzVarZza).zzd.zzb())).zzb(com.google.android.gms.ads.internal.zzv.zzp().zzi().zzN());
                }
            }
            zza = zzcgzVarZza;
            return zzcgzVarZza;
        } catch (Throwable th) {
            throw th;
        }
    }

    public static zzcgz zza(Context context, zzbpo zzbpoVar, int i) {
        return zzE(context, zzbpoVar, ModuleDescriptor.MODULE_VERSION, false, i, new zzcif());
    }

    public abstract Executor zzA();

    public abstract ScheduledExecutorService zzB();

    public abstract zzbzf zzC();

    @Override // com.google.android.gms.internal.ads.zzcky
    public final zzbzf zzD() {
        return zzC();
    }

    public abstract zzcjz zzb();

    public abstract zzcoa zzc();

    public abstract zzcpr zzd();

    public abstract zzcyo zze();

    public abstract zzdfx zzf();

    public abstract zzdgt zzg();

    public abstract zzdok zzh();

    public abstract zzdsc zzi();

    public abstract zzdtm zzj();

    public abstract zzdvb zzk();

    public abstract zzdvy zzl();

    public abstract zzecd zzm();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzv zzn();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzab zzo();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzau zzp();

    @Override // com.google.android.gms.internal.ads.zzcky
    public final zzeux zzq(zzbvo zzbvoVar, int i) {
        return zzr(new zzewa(zzbvoVar, i));
    }

    public abstract zzeux zzr(zzewa zzewaVar);

    public abstract zzewt zzs();

    public abstract zzeyh zzt();

    public abstract zzezy zzu();

    public abstract zzfbm zzv();

    public abstract zzfdd zzw();

    public abstract zzfdn zzx();

    public abstract zzfhp zzy();

    public abstract zzfkb zzz();
}
