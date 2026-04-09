package com.google.android.gms.ads.nonagon.signalgeneration;

import A4.a;
import N7.C1154e9;
import android.os.Bundle;
import com.google.android.gms.internal.ads.zzbdc;
import com.google.android.gms.internal.ads.zzbzc;
import com.google.android.gms.internal.ads.zzcad;
import com.google.android.gms.internal.ads.zzcuu;
import com.google.android.gms.internal.ads.zzcuv;
import com.google.android.gms.internal.ads.zzcvi;
import com.google.android.gms.internal.ads.zzdel;
import com.google.android.gms.internal.ads.zzdrk;
import com.google.android.gms.internal.ads.zzfgm;
import com.google.android.gms.internal.ads.zzfgs;
import com.google.android.gms.internal.ads.zzgdb;
import com.google.android.gms.internal.ads.zzhfy;
import com.google.android.gms.internal.ads.zzhgg;
import com.google.android.gms.internal.ads.zzhgh;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes.dex */
public final class zzbg implements zzhfy {
    private final zzhgh zza;
    private final zzhgh zzb;
    private final zzhgh zzc;
    private final zzhgh zzd;
    private final zzhgh zze;
    private final zzhgh zzf;
    private final zzhgh zzg;
    private final zzhgh zzh;
    private final zzhgh zzi;

    public zzbg(zzhgh zzhghVar, zzhgh zzhghVar2, zzhgh zzhghVar3, zzhgh zzhghVar4, zzhgh zzhghVar5, zzhgh zzhghVar6, zzhgh zzhghVar7, zzhgh zzhghVar8, zzhgh zzhghVar9) {
        this.zza = zzhghVar;
        this.zzb = zzhghVar2;
        this.zzc = zzhghVar3;
        this.zzd = zzhghVar4;
        this.zze = zzhghVar5;
        this.zzf = zzhghVar6;
        this.zzg = zzhghVar7;
        this.zzh = zzhghVar8;
        this.zzi = zzhghVar9;
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, com.google.android.gms.internal.ads.zzhgm
    public final /* bridge */ /* synthetic */ Object zzb() throws JSONException {
        a aVarZza;
        zzau zzauVar = (zzau) this.zza.zzb();
        zzfgs zzfgsVar = (zzfgs) this.zzb.zzb();
        zzbi zzbiVarZzb = ((zzbj) this.zzc).zzb();
        zzcuu zzcuuVarZzb = ((zzcuv) this.zzd).zzb();
        zzdel zzdelVar = (zzdel) this.zze.zzb();
        zzb zzbVar = (zzb) this.zzf.zzb();
        zzbzc zzbzcVar = (zzbzc) this.zzg.zzb();
        int iIntValue = ((Integer) this.zzh.zzb()).intValue();
        Bundle bundle = ((zzcvi) this.zzi).zza().zzs;
        zzbk zzbkVarZza = null;
        if (iIntValue == 1 && zzbzcVar != null) {
            C1154e9.l(bundle, zzdrk.READ_FROM_DISK_START.zza());
            zzbkVarZza = zzbVar.zza(zzbzcVar, zzauVar, bundle);
            C1154e9.l(bundle, zzdrk.READ_FROM_DISK_END.zza());
        }
        if (zzbkVarZza != null) {
            zzdelVar.zza(zzbkVarZza);
            aVarZza = zzgdb.zzh(zzbkVarZza);
        } else {
            aVarZza = zzfgsVar.zzb(zzfgm.GENERATE_SIGNALS, zzcuuVarZzb.zzc()).zzf(zzbiVarZzb).zzi(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzfN)).intValue(), TimeUnit.SECONDS).zza();
            zzgdb.zzr(aVarZza, new zzaw(zzdelVar), zzcad.zza);
        }
        zzhgg.zzb(aVarZza);
        return aVarZza;
    }
}
