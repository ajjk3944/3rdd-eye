package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import io.appmetrica.analytics.impl.Aa;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzeno implements zzetu {
    final Context zza;
    private final String zzb;
    private final String zzc;
    private final long zzd;
    private final zzcsl zze;
    private final zzfdv zzf;
    private final zzfco zzg;
    private final com.google.android.gms.ads.internal.util.zzg zzh = com.google.android.gms.ads.internal.zzv.zzp().zzi();
    private final zzdrw zzi;
    private final zzcsz zzj;

    public zzeno(Context context, String str, String str2, zzcsl zzcslVar, zzfdv zzfdvVar, zzfco zzfcoVar, zzdrw zzdrwVar, zzcsz zzcszVar, long j4) {
        this.zza = context;
        this.zzb = str;
        this.zzc = str2;
        this.zze = zzcslVar;
        this.zzf = zzfdvVar;
        this.zzg = zzfcoVar;
        this.zzi = zzdrwVar;
        this.zzj = zzcszVar;
        this.zzd = j4;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final int zza() {
        return 12;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final A4.a zzb() {
        Bundle bundle = new Bundle();
        zzdrw zzdrwVar = this.zzi;
        Map mapZzb = zzdrwVar.zzb();
        String str = this.zzb;
        mapZzb.put("seq_num", str);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzco)).booleanValue()) {
            zzdrwVar.zzd("tsacc", String.valueOf(com.google.android.gms.ads.internal.zzv.zzD().currentTimeMillis() - this.zzd));
            com.google.android.gms.ads.internal.zzv.zzr();
            zzdrwVar.zzd(Aa.f39095g, true != com.google.android.gms.ads.internal.util.zzs.zzH(this.zza) ? "1" : CommonUrlParts.Values.FALSE_INTEGER);
        }
        zzcsl zzcslVar = this.zze;
        zzfco zzfcoVar = this.zzg;
        zzcslVar.zzk(zzfcoVar.zzd);
        bundle.putAll(this.zzf.zzb());
        return zzgdb.zzh(new zzenp(this.zza, bundle, str, this.zzc, this.zzh, zzfcoVar.zzf, this.zzj));
    }
}
