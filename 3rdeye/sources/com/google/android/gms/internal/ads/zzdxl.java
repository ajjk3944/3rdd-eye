package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.InputStreamReader;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzdxl implements zzdyo {
    private static final Pattern zza = Pattern.compile("Received error HTTP response code: (.*)");
    private final zzdwm zzb;
    private final zzgdm zzc;
    private final zzfco zzd;
    private final ScheduledExecutorService zze;
    private final zzeao zzf;
    private final zzfhm zzg;
    private final Context zzh;

    public zzdxl(Context context, zzfco zzfcoVar, zzdwm zzdwmVar, zzgdm zzgdmVar, ScheduledExecutorService scheduledExecutorService, zzeao zzeaoVar, zzfhm zzfhmVar) {
        this.zzh = context;
        this.zzd = zzfcoVar;
        this.zzb = zzdwmVar;
        this.zzc = zzgdmVar;
        this.zze = scheduledExecutorService;
        this.zzf = zzeaoVar;
        this.zzg = zzfhmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdyo
    public final A4.a zzc(zzbvo zzbvoVar) {
        Context context = this.zzh;
        A4.a aVarZzc = this.zzb.zzc(zzbvoVar);
        zzfhb zzfhbVarZza = zzfha.zza(context, 11);
        zzfhl.zzd(aVarZzc, zzfhbVarZza);
        A4.a aVarZzn = zzgdb.zzn(aVarZzc, new zzgci() { // from class: com.google.android.gms.internal.ads.zzdxi
            @Override // com.google.android.gms.internal.ads.zzgci
            public final A4.a zza(Object obj) {
                zzdyq zzdyqVar = (zzdyq) obj;
                return zzgdb.zzh(new zzfcf(new zzfcc(this.zza.zzd), zzfce.zza(new InputStreamReader(zzdyqVar.zzb()), zzdyqVar.zza().zzm)));
            }
        }, this.zzc);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzfM)).booleanValue()) {
            aVarZzn = zzgdb.zzf(zzgdb.zzo(aVarZzn, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzfN)).intValue(), TimeUnit.SECONDS, this.zze), TimeoutException.class, new zzgci() { // from class: com.google.android.gms.internal.ads.zzdxj
                @Override // com.google.android.gms.internal.ads.zzgci
                public final A4.a zza(Object obj) {
                    return zzgdb.zzg(new zzdwe(5));
                }
            }, zzcad.zzg);
        }
        zzfhl.zza(aVarZzn, this.zzg, zzfhbVarZza);
        zzgdb.zzr(aVarZzn, new zzdxk(this), zzcad.zzg);
        return aVarZzn;
    }
}
