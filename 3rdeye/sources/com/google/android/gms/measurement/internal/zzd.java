package com.google.android.gms.measurement.internal;

import N7.C1094a9;
import android.os.Bundle;
import androidx.work.s;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;
import java.util.Map;
import m0.C5308a;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: classes2.dex */
public final class zzd extends zze {
    private final Map zza;
    private final Map zzb;
    private long zzc;

    public zzd(zzfy zzfyVar) {
        super(zzfyVar);
        this.zzb = new C5308a();
        this.zza = new C5308a();
    }

    public static /* synthetic */ void zza(zzd zzdVar, String str, long j4) {
        zzdVar.zzg();
        Preconditions.checkNotEmpty(str);
        if (zzdVar.zzb.isEmpty()) {
            zzdVar.zzc = j4;
        }
        Integer num = (Integer) zzdVar.zzb.get(str);
        if (num != null) {
            zzdVar.zzb.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (zzdVar.zzb.size() >= 100) {
            s.m(zzdVar.zzs, "Too many ads visible");
        } else {
            zzdVar.zzb.put(str, 1);
            zzdVar.zza.put(str, Long.valueOf(j4));
        }
    }

    public static /* synthetic */ void zzb(zzd zzdVar, String str, long j4) {
        zzdVar.zzg();
        Preconditions.checkNotEmpty(str);
        Integer num = (Integer) zzdVar.zzb.get(str);
        if (num == null) {
            zzdVar.zzs.zzay().zzd().zzb("Call to endAdUnitExposure for unknown ad unit id", str);
            return;
        }
        zzik zzikVarZzj = zzdVar.zzs.zzs().zzj(false);
        int iIntValue = num.intValue() - 1;
        if (iIntValue != 0) {
            zzdVar.zzb.put(str, Integer.valueOf(iIntValue));
            return;
        }
        zzdVar.zzb.remove(str);
        Long l5 = (Long) zzdVar.zza.get(str);
        if (l5 == null) {
            a.k(zzdVar.zzs, "First ad unit exposure time was never set");
        } else {
            long jLongValue = l5.longValue();
            zzdVar.zza.remove(str);
            zzdVar.zzi(str, j4 - jLongValue, zzikVarZzj);
        }
        if (zzdVar.zzb.isEmpty()) {
            long j10 = zzdVar.zzc;
            if (j10 == 0) {
                a.k(zzdVar.zzs, "First ad exposure time was never set");
            } else {
                zzdVar.zzh(j4 - j10, zzikVarZzj);
                zzdVar.zzc = 0L;
            }
        }
    }

    private final void zzh(long j4, zzik zzikVar) {
        if (zzikVar == null) {
            C1094a9.j(this.zzs, "Not logging ad exposure. No active activity");
            return;
        }
        if (j4 < 1000) {
            this.zzs.zzay().zzj().zzb("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j4));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("_xt", j4);
        zzlh.zzK(zzikVar, bundle, true);
        this.zzs.zzq().zzG("am", "_xa", bundle);
    }

    private final void zzi(String str, long j4, zzik zzikVar) {
        if (zzikVar == null) {
            C1094a9.j(this.zzs, "Not logging ad unit exposure. No active activity");
            return;
        }
        if (j4 < 1000) {
            this.zzs.zzay().zzj().zzb("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j4));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("_ai", str);
        bundle.putLong("_xt", j4);
        zzlh.zzK(zzikVar, bundle, true);
        this.zzs.zzq().zzG("am", "_xu", bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzj(long j4) {
        Iterator it = this.zza.keySet().iterator();
        while (it.hasNext()) {
            this.zza.put((String) it.next(), Long.valueOf(j4));
        }
        if (this.zza.isEmpty()) {
            return;
        }
        this.zzc = j4;
    }

    public final void zzd(String str, long j4) throws IllegalStateException {
        if (str == null || str.length() == 0) {
            a.k(this.zzs, "Ad unit id must be a non-empty string");
        } else {
            this.zzs.zzaz().zzp(new zza(this, str, j4));
        }
    }

    public final void zze(String str, long j4) throws IllegalStateException {
        if (str == null || str.length() == 0) {
            a.k(this.zzs, "Ad unit id must be a non-empty string");
        } else {
            this.zzs.zzaz().zzp(new zzb(this, str, j4));
        }
    }

    public final void zzf(long j4) {
        zzik zzikVarZzj = this.zzs.zzs().zzj(false);
        for (String str : this.zza.keySet()) {
            zzi(str, j4 - ((Long) this.zza.get(str)).longValue(), zzikVarZzj);
        }
        if (!this.zza.isEmpty()) {
            zzh(j4 - this.zzc, zzikVarZzj);
        }
        zzj(j4);
    }
}
