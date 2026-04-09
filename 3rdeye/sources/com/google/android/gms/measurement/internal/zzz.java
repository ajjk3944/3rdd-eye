package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzny;

/* compiled from: com.google.android.gms:play-services-measurement@@21.1.1 */
/* loaded from: classes2.dex */
final class zzz extends zzy {
    final /* synthetic */ zzaa zza;
    private final com.google.android.gms.internal.measurement.zzes zzh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzz(zzaa zzaaVar, String str, int i, com.google.android.gms.internal.measurement.zzes zzesVar) {
        super(str, i);
        this.zza = zzaaVar;
        this.zzh = zzesVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzy
    public final int zza() {
        return this.zzh.zza();
    }

    @Override // com.google.android.gms.measurement.internal.zzy
    public final boolean zzb() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzy
    public final boolean zzc() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean zzd(Long l5, Long l10, com.google.android.gms.internal.measurement.zzgl zzglVar, boolean z10) {
        zzny.zzc();
        boolean zZzs = this.zza.zzs.zzf().zzs(this.zzb, zzeb.zzU);
        boolean zZzg = this.zzh.zzg();
        boolean zZzh = this.zzh.zzh();
        boolean zZzi = this.zzh.zzi();
        byte b10 = zZzg || zZzh || zZzi;
        Boolean boolZzj = null;
        boolZzj = null;
        boolZzj = null;
        boolZzj = null;
        boolZzj = null;
        if (z10 && b10 != true) {
            this.zza.zzs.zzay().zzj().zzc("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.zzc), this.zzh.zzj() ? Integer.valueOf(this.zzh.zza()) : null);
            return true;
        }
        com.google.android.gms.internal.measurement.zzel zzelVarZzb = this.zzh.zzb();
        boolean zZzg2 = zzelVarZzb.zzg();
        if (zzglVar.zzr()) {
            if (zzelVarZzb.zzi()) {
                boolZzj = zzy.zzj(zzy.zzh(zzglVar.zzb(), zzelVarZzb.zzc()), zZzg2);
            } else {
                this.zza.zzs.zzay().zzk().zzb("No number filter for long property. property", this.zza.zzs.zzj().zzf(zzglVar.zzf()));
            }
        } else if (zzglVar.zzq()) {
            if (zzelVarZzb.zzi()) {
                boolZzj = zzy.zzj(zzy.zzg(zzglVar.zza(), zzelVarZzb.zzc()), zZzg2);
            } else {
                this.zza.zzs.zzay().zzk().zzb("No number filter for double property. property", this.zza.zzs.zzj().zzf(zzglVar.zzf()));
            }
        } else if (!zzglVar.zzt()) {
            this.zza.zzs.zzay().zzk().zzb("User property has no value, property", this.zza.zzs.zzj().zzf(zzglVar.zzf()));
        } else if (zzelVarZzb.zzk()) {
            boolZzj = zzy.zzj(zzy.zzf(zzglVar.zzg(), zzelVarZzb.zzd(), this.zza.zzs.zzay()), zZzg2);
        } else if (!zzelVarZzb.zzi()) {
            this.zza.zzs.zzay().zzk().zzb("No string or number filter defined. property", this.zza.zzs.zzj().zzf(zzglVar.zzf()));
        } else if (zzlb.zzx(zzglVar.zzg())) {
            boolZzj = zzy.zzj(zzy.zzi(zzglVar.zzg(), zzelVarZzb.zzc()), zZzg2);
        } else {
            this.zza.zzs.zzay().zzk().zzc("Invalid user property value for Numeric number filter. property, value", this.zza.zzs.zzj().zzf(zzglVar.zzf()), zzglVar.zzg());
        }
        this.zza.zzs.zzay().zzj().zzb("Property filter result", boolZzj == null ? "null" : boolZzj);
        if (boolZzj == null) {
            return false;
        }
        this.zzd = Boolean.TRUE;
        if (zZzi && !boolZzj.booleanValue()) {
            return true;
        }
        if (!z10 || this.zzh.zzg()) {
            this.zze = boolZzj;
        }
        if (boolZzj.booleanValue() && b10 != false && zzglVar.zzs()) {
            long jZzc = zzglVar.zzc();
            if (l5 != null) {
                jZzc = l5.longValue();
            }
            if (zZzs && this.zzh.zzg() && !this.zzh.zzh() && l10 != null) {
                jZzc = l10.longValue();
            }
            if (this.zzh.zzh()) {
                this.zzg = Long.valueOf(jZzc);
            } else {
                this.zzf = Long.valueOf(jZzc);
            }
        }
        return true;
    }
}
