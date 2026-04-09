package com.google.android.gms.internal.ads;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Arrays;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzewm implements zzetu {
    private final zzbzq zza;
    private final boolean zzb;
    private final boolean zzc;
    private final ScheduledExecutorService zzd;
    private final zzgdm zze;
    private final int zzf;
    private final int zzg;

    public zzewm(zzbzq zzbzqVar, boolean z10, boolean z11, zzbzf zzbzfVar, zzgdm zzgdmVar, String str, ScheduledExecutorService scheduledExecutorService, int i, int i10) {
        this.zza = zzbzqVar;
        this.zzb = z10;
        this.zzc = z11;
        this.zze = zzgdmVar;
        this.zzd = scheduledExecutorService;
        this.zzf = i;
        this.zzg = i10;
    }

    public static /* synthetic */ zzewn zzc(zzewm zzewmVar, Exception exc) {
        zzewmVar.zza.zzw(exc, "TrustlessTokenSignal");
        return new zzewn(null);
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final int zza() {
        return 50;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final A4.a zzb() {
        boolean zContains;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzhf)).booleanValue() && this.zzc) {
            return zzgdb.zzh(new zzewn(null));
        }
        if (this.zzg == 2) {
            return zzgdb.zzh(new zzewn(null));
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzhh)).booleanValue()) {
            zContains = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzhi)).split(StringUtils.COMMA)).contains(String.valueOf(this.zzf));
        } else {
            zContains = this.zzb;
        }
        if (!zContains) {
            return zzgdb.zzh(new zzewn(null));
        }
        A4.a aVarZzh = zzgdb.zzh(null);
        zzfut zzfutVar = new zzfut() { // from class: com.google.android.gms.internal.ads.zzewk
            @Override // com.google.android.gms.internal.ads.zzfut
            public final Object apply(Object obj) {
                return new zzewn((String) obj);
            }
        };
        zzgdm zzgdmVar = this.zze;
        return zzgdb.zze(zzgdb.zzo(zzgdb.zzm(aVarZzh, zzfutVar, zzgdmVar), ((Long) zzbfq.zzb.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzd), Exception.class, new zzfut() { // from class: com.google.android.gms.internal.ads.zzewl
            @Override // com.google.android.gms.internal.ads.zzfut
            public final Object apply(Object obj) {
                return zzewm.zzc(this.zza, (Exception) obj);
            }
        }, zzgdmVar);
    }
}
