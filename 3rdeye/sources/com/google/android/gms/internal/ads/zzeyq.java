package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbch;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzeyq implements zzezk {
    private final zzezk zza;
    private final zzezk zzb;
    private final zzfex zzc;
    private final String zzd;
    private zzcux zze;
    private final Executor zzf;

    public zzeyq(zzezk zzezkVar, zzezk zzezkVar2, zzfex zzfexVar, String str, Executor executor) {
        this.zza = zzezkVar;
        this.zzb = zzezkVar2;
        this.zzc = zzfexVar;
        this.zzd = str;
        this.zzf = executor;
    }

    public static /* synthetic */ A4.a zzb(final zzeyq zzeyqVar, zzezl zzezlVar, zzeyp zzeypVar, zzezj zzezjVar, zzcux zzcuxVar, zzeyv zzeyvVar) {
        if (zzeyvVar != null) {
            zzeyp zzeypVar2 = new zzeyp(zzeypVar.zza, zzeypVar.zzb, zzeypVar.zzc, zzeypVar.zzd, zzeypVar.zze, zzeypVar.zzf, zzeyvVar.zza);
            zzfek zzfekVar = zzeyvVar.zzc;
            if (zzfekVar != null) {
                zzeyqVar.zze = null;
                zzeyqVar.zzc.zzf(zzeypVar2);
                return zzeyqVar.zzg(zzfekVar, zzezlVar);
            }
            zzfex zzfexVar = zzeyqVar.zzc;
            A4.a aVarZza = zzfexVar.zza(zzeypVar2);
            if (aVarZza != null) {
                zzeyqVar.zze = null;
                return zzgdb.zzn(aVarZza, new zzgci() { // from class: com.google.android.gms.internal.ads.zzeym
                    @Override // com.google.android.gms.internal.ads.zzgci
                    public final A4.a zza(Object obj) {
                        return zzeyq.zze(this.zza, (zzfeu) obj);
                    }
                }, zzeyqVar.zzf);
            }
            zzfexVar.zzf(zzeypVar2);
            zzezlVar = new zzezl(zzezlVar.zzb, zzeyvVar.zzb);
        }
        A4.a aVarZzb = ((zzeza) zzeyqVar.zza).zzb(zzezlVar, zzezjVar, zzcuxVar);
        zzeyqVar.zze = zzcuxVar;
        return aVarZzb;
    }

    public static /* synthetic */ A4.a zze(zzeyq zzeyqVar, zzfeu zzfeuVar) throws zzdwe {
        zzfek zzfekVar;
        zzfew zzfewVar;
        if (zzfeuVar == null || (zzfekVar = zzfeuVar.zza) == null || (zzfewVar = zzfeuVar.zzb) == null) {
            throw new zzdwe(1, "Empty prefetch");
        }
        zzbch.zzb.zzc zzcVarZzd = zzbch.zzb.zzd();
        zzbch.zzb.zza.C0336zza c0336zzaZza = zzbch.zzb.zza.zza();
        c0336zzaZza.zzf(zzbch.zzb.zzd.IN_MEMORY);
        c0336zzaZza.zzh(zzbch.zzb.zze.zzi());
        zzcVarZzd.zzd(c0336zzaZza);
        zzfekVar.zza.zzb().zzc().zzm(zzcVarZzd.zzbr());
        return zzeyqVar.zzg(zzfekVar, ((zzeyp) zzfewVar).zzb);
    }

    private final A4.a zzg(zzfek zzfekVar, zzezl zzezlVar) {
        zzcux zzcuxVar = zzfekVar.zza;
        this.zze = zzcuxVar;
        if (zzfekVar.zzc != null) {
            if (zzcuxVar.zze() != null) {
                zzfekVar.zzc.zzo().zzl(zzfekVar.zza.zze());
            }
            return zzgdb.zzh(zzfekVar.zzc);
        }
        zzcuxVar.zzb().zzk(zzfekVar.zzb);
        return ((zzeza) this.zza).zzb(zzezlVar, null, zzfekVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzezk
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized zzcux zzd() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzezk
    public final /* bridge */ /* synthetic */ A4.a zzc(zzezl zzezlVar, zzezj zzezjVar, Object obj) {
        return zzf(zzezlVar, zzezjVar, null);
    }

    public final synchronized A4.a zzf(final zzezl zzezlVar, final zzezj zzezjVar, zzcux zzcuxVar) {
        zzcuw zzcuwVarZza = zzezjVar.zza(zzezlVar.zzb);
        zzcuwVarZza.zza(new zzeyr(this.zzd));
        final zzcux zzcuxVar2 = (zzcux) zzcuwVarZza.zzh();
        zzcuxVar2.zzf();
        zzcuxVar2.zzf();
        com.google.android.gms.ads.internal.client.zzm zzmVar = zzcuxVar2.zzf().zzd;
        if (zzmVar.zzs != null || zzmVar.zzx != null) {
            this.zze = zzcuxVar2;
            return ((zzeza) this.zza).zzb(zzezlVar, zzezjVar, zzcuxVar2);
        }
        zzfco zzfcoVarZzf = zzcuxVar2.zzf();
        com.google.android.gms.ads.internal.client.zzm zzmVar2 = zzfcoVarZzf.zzd;
        String str = zzfcoVarZzf.zzf;
        com.google.android.gms.ads.internal.client.zzx zzxVar = zzfcoVarZzf.zzj;
        Executor executor = this.zzf;
        final zzeyp zzeypVar = new zzeyp(zzezjVar, zzezlVar, zzmVar2, str, executor, zzxVar, null);
        return (zzgcs) zzgdb.zzn(zzgcs.zzw(((zzeyw) this.zzb).zzb(zzezlVar, zzezjVar, zzcuxVar2)), new zzgci() { // from class: com.google.android.gms.internal.ads.zzeyn
            @Override // com.google.android.gms.internal.ads.zzgci
            public final A4.a zza(Object obj) {
                return zzeyq.zzb(this.zza, zzezlVar, zzeypVar, zzezjVar, zzcuxVar2, (zzeyv) obj);
            }
        }, executor);
    }
}
