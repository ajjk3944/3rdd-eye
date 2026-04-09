package com.google.android.recaptcha.internal;

import Ii.AbstractC3063k;
import Ii.N;
import Ii.O;
import Yg.J;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class zzft implements zzfo {
    private final N zza;
    private final zzgf zzb;
    private final zzhx zzc;
    private final Map zzd;

    public zzft(N n10, zzgf zzgfVar, zzhx zzhxVar, Map map) {
        this.zza = n10;
        this.zzb = zzgfVar;
        this.zzc = zzhxVar;
        this.zzd = map;
    }

    public static final /* synthetic */ void zzf(zzft zzftVar, zzuf zzufVar, zzgd zzgdVar) throws zzce {
        zzjh zzjhVarZzb = zzjh.zzb();
        int iZza = zzgdVar.zza();
        zzgx zzgxVar = (zzgx) zzftVar.zzd.get(Integer.valueOf(zzufVar.zzf()));
        if (zzgxVar == null) {
            throw new zzce(5, 2, null);
        }
        int iZzg = zzufVar.zzg();
        zzue[] zzueVarArr = (zzue[]) zzufVar.zzj().toArray(new zzue[0]);
        zzgxVar.zza(iZzg, zzgdVar, (zzue[]) Arrays.copyOf(zzueVarArr, zzueVarArr.length));
        if (iZza == zzgdVar.zza()) {
            zzgdVar.zzg(zzgdVar.zza() + 1);
        }
        zzjhVarZzb.zzf();
        long jZza = zzjhVarZzb.zza(TimeUnit.MICROSECONDS);
        int i10 = zzbk.zza;
        int iZzk = zzufVar.zzk();
        if (iZzk == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        zzbk.zza(iZzk - 2, jZza);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzg(List list, zzgd zzgdVar, InterfaceC5380e interfaceC5380e) {
        Object objG = O.g(new zzfq(zzgdVar, list, this, null), interfaceC5380e);
        return objG == AbstractC5467b.g() ? objG : J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzh(Exception exc, zzgd zzgdVar, InterfaceC5380e interfaceC5380e) {
        Object objG = O.g(new zzfr(exc, zzgdVar, this, null), interfaceC5380e);
        return objG == AbstractC5467b.g() ? objG : J.f24997a;
    }

    @Override // com.google.android.recaptcha.internal.zzfo
    public final void zza(String str) {
        AbstractC3063k.d(this.zza, null, null, new zzfs(new zzgd(this.zzb), this, str, null), 3, null);
    }
}
