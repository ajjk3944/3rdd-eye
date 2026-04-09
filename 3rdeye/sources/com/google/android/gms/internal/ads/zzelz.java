package com.google.android.gms.internal.ads;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzelz implements zzetu {
    private final zzgdm zza;
    private final zzfco zzb;
    private final int zzc;

    public zzelz(zzgdm zzgdmVar, zzfco zzfcoVar, zzfdd zzfddVar, int i) {
        this.zza = zzgdmVar;
        this.zzb = zzfcoVar;
        this.zzc = i;
    }

    public static /* synthetic */ zzema zzc(zzelz zzelzVar) throws GeneralSecurityException {
        boolean zEquals;
        String strZza = null;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzhg)).booleanValue()) {
            zzfco zzfcoVar = zzelzVar.zzb;
            if (zzelzVar.zzc != 2) {
                String strZzc = com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzc(zzfcoVar.zzd);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzhh)).booleanValue()) {
                    zEquals = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzhi)).split(StringUtils.COMMA)).contains(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzb(strZzc));
                } else {
                    zEquals = Objects.equals(strZzc, "requester_type_2");
                }
                if (zEquals) {
                    strZza = zzfdd.zza();
                }
            }
        }
        return new zzema(strZza);
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final int zza() {
        return 5;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final A4.a zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzely
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzelz.zzc(this.zza);
            }
        });
    }
}
