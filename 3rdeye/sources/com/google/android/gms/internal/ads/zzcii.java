package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzcii extends zzeux {
    private final zzcij zzA;
    final zzhgh zza;
    final zzhgh zzb;
    final zzhgh zzc;
    final zzhgh zzd;
    final zzhgh zze;
    final zzhgh zzf;
    final zzhgh zzg;
    final zzhgh zzh;
    final zzhgh zzi;
    final zzhgh zzj;
    final zzhgh zzk;
    final zzhgh zzl;
    final zzhgh zzm;
    final zzhgh zzn;
    final zzhgh zzo;
    final zzhgh zzp;
    final zzhgh zzq;
    final zzhgh zzr;
    final zzhgh zzs;
    final zzhgh zzt;
    final zzhgh zzu;
    final zzhgh zzv;
    final zzhgh zzw;
    final zzhgh zzx;
    final zzhgh zzy;
    private final zzewa zzz;

    public zzcii(zzcij zzcijVar, zzewa zzewaVar) {
        this.zzA = zzcijVar;
        this.zzz = zzewaVar;
        this.zza = zzhfx.zzc(new zzfhn(zzcijVar.zzx));
        zzewc zzewcVar = new zzewc(zzewaVar);
        this.zzb = zzewcVar;
        zzewd zzewdVar = new zzewd(zzewaVar);
        this.zzc = zzewdVar;
        zzewf zzewfVar = new zzewf(zzewaVar);
        this.zzd = zzewfVar;
        zzcku zzckuVar = zzckt.zza;
        zzhgh zzhghVar = zzcijVar.zzf;
        zzhgh zzhghVar2 = zzcijVar.zzc;
        this.zze = new zzeuw(zzckuVar, zzhghVar, zzhghVar2, zzffm.zza(), zzewcVar, zzewdVar, zzewfVar);
        this.zzf = new zzevk(zzckn.zza, zzffm.zza(), zzhghVar);
        zzewb zzewbVar = new zzewb(zzewaVar);
        this.zzg = zzewbVar;
        this.zzh = new zzevs(zzckp.zza, zzffm.zza(), zzewbVar);
        this.zzi = new zzevz(zzckr.zza, zzhghVar2, zzhghVar);
        this.zzj = new zzews(zzffm.zza());
        zzewe zzeweVar = new zzewe(zzewaVar);
        this.zzk = zzeweVar;
        zzewh zzewhVar = new zzewh(zzewaVar);
        this.zzl = zzewhVar;
        zzewi zzewiVar = new zzewi(zzewaVar);
        this.zzm = zzewiVar;
        zzhgh zzhghVar3 = zzcijVar.zzak;
        this.zzn = new zzewo(zzhghVar3, zzeweVar, zzewfVar, zzckv.zza, zzffm.zza(), zzewbVar, zzhghVar2, zzewhVar, zzewiVar);
        this.zzo = new zzevg(zzewbVar, zzckl.zza, zzhghVar3, zzhghVar2, zzffm.zza());
        zzewg zzewgVar = new zzewg(zzewaVar);
        this.zzp = zzewgVar;
        zzhgh zzhghVarZzc = zzhfx.zzc(zzdqw.zza());
        this.zzq = zzhghVarZzc;
        zzhgh zzhghVarZzc2 = zzhfx.zzc(zzdqu.zza());
        this.zzr = zzhghVarZzc2;
        zzhgh zzhghVarZzc3 = zzhfx.zzc(zzdqy.zza());
        this.zzs = zzhghVarZzc3;
        zzhgh zzhghVarZzc4 = zzhfx.zzc(zzdra.zza());
        this.zzt = zzhghVarZzc4;
        zzhgb zzhgbVarZzc = zzhgc.zzc(4);
        zzhgbVarZzc.zzb(zzfgm.GMS_SIGNALS, zzhghVarZzc);
        zzhgbVarZzc.zzb(zzfgm.BUILD_URL, zzhghVarZzc2);
        zzhgbVarZzc.zzb(zzfgm.HTTP, zzhghVarZzc3);
        zzhgbVarZzc.zzb(zzfgm.PRE_PROCESS, zzhghVarZzc4);
        zzhgc zzhgcVarZzc = zzhgbVarZzc.zzc();
        this.zzu = zzhgcVarZzc;
        zzhgh zzhghVarZzc5 = zzhfx.zzc(new zzdrb(zzewgVar, zzcijVar.zzf, zzffm.zza(), zzhgcVarZzc));
        this.zzv = zzhghVarZzc5;
        zzhgj zzhgjVarZza = zzhgk.zza(0, 1);
        zzhgjVarZza.zza(zzhghVarZzc5);
        zzhgk zzhgkVarZzc = zzhgjVarZza.zzc();
        this.zzw = zzhgkVarZzc;
        zzfgv zzfgvVar = new zzfgv(zzhgkVarZzc);
        this.zzx = zzfgvVar;
        this.zzy = zzhfx.zzc(new zzfgu(zzffm.zza(), zzcijVar.zzc, zzfgvVar));
    }

    @Override // com.google.android.gms.internal.ads.zzeux
    public final zzetx zza() {
        zzcij zzcijVar = this.zzA;
        Context contextZzc = zzchg.zzc(zzcijVar.zzbo);
        zzhgh zzhghVar = this.zza;
        zzhgh zzhghVar2 = this.zzo;
        zzhgh zzhghVar3 = this.zzn;
        zzhgh zzhghVar4 = this.zzj;
        zzhgh zzhghVar5 = this.zzi;
        zzhgh zzhghVar6 = this.zzh;
        zzhgh zzhghVar7 = this.zzf;
        zzhgh zzhghVar8 = this.zze;
        return zzewj.zza(contextZzc, zzckq.zza(), zzckw.zza(), zzcijVar.zzbn.zzb(), zzc(), zzd(), zzhfx.zza(zzhghVar8), zzhfx.zza(zzhghVar7), zzhfx.zza(zzhghVar6), zzhfx.zza(zzhghVar5), zzhfx.zza(zzhghVar4), zzhfx.zza(zzhghVar3), zzhfx.zza(zzhghVar2), zzffm.zzc(), (zzfhm) zzhghVar.zzb(), (zzdsc) zzcijVar.zzK.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzeux
    public final zzetx zzb() {
        zzcij zzcijVar = this.zzA;
        Context contextZzc = zzchg.zzc(zzcijVar.zzbo);
        zzewa zzewaVar = this.zzz;
        zzgdm zzgdmVarZzc = zzffm.zzc();
        zzevq zzevqVar = new zzevq(zzckq.zza(), zzffm.zzc(), zzewb.zzc(zzewaVar));
        zzhgh zzhghVar = zzcijVar.zzc;
        return new zzetx(contextZzc, zzgdmVarZzc, zzfyk.zzs(new zzesg(zzevqVar, 0L, (ScheduledExecutorService) zzhghVar.zzb()), new zzesg(new zzevx(zzcks.zza(), (ScheduledExecutorService) zzhghVar.zzb(), zzchg.zzc(zzcijVar.zzbo)), ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzes)).longValue(), (ScheduledExecutorService) zzhghVar.zzb()), new zzesg(zzeuw.zza(zzcku.zza(), zzchg.zzc(zzcijVar.zzbo), (ScheduledExecutorService) zzhghVar.zzb(), zzffm.zzc(), zzewaVar.zza(), zzewd.zzc(zzewaVar), zzewf.zzc(zzewaVar)), 0L, (ScheduledExecutorService) zzhghVar.zzb()), new zzesg(new zzewq(zzffm.zzc()), 0L, (ScheduledExecutorService) zzhghVar.zzb()), new zzevi(zzcko.zza(), zzffm.zzc(), zzchg.zzc(zzcijVar.zzbo)), zzd(), zzc(), (zzetu) zzcijVar.zzbn.zzb(), zzevg.zza(zzewb.zzc(zzewaVar), zzckm.zza(), (zzbzq) zzcijVar.zzak.zzb(), (ScheduledExecutorService) zzhghVar.zzb(), zzffm.zzc())), (zzfhm) this.zza.zzb(), (zzdsc) zzcijVar.zzK.zzb());
    }

    public final zzeva zzc() {
        zzewa zzewaVar = this.zzz;
        return new zzeva(zzcku.zza(), zzffm.zzc(), zzewaVar.zzf(), zzewaVar.zzd(), zzewaVar.zza());
    }

    public final zzevu zzd() {
        zzewa zzewaVar = this.zzz;
        zzbcl zzbclVarZza = zzckj.zza();
        zzgdm zzgdmVarZzc = zzffm.zzc();
        List listZzh = zzewaVar.zzh();
        zzhgg.zzb(listZzh);
        return new zzevu(zzbclVarZza, zzgdmVarZzc, listZzh);
    }

    @Override // com.google.android.gms.internal.ads.zzeux
    public final zzfgs zze() {
        return (zzfgs) this.zzy.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzeux
    public final zzfhm zzf() {
        return (zzfhm) this.zza.zzb();
    }
}
