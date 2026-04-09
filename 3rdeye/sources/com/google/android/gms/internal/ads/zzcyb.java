package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzcyb extends zzdbm implements zzcwl, zzcxq {
    private final zzfbt zzb;
    private final AtomicBoolean zzc;
    private final zzfcf zzd;

    public zzcyb(Set set, zzfbt zzfbtVar, zzfcf zzfcfVar) {
        super(set);
        this.zzc = new AtomicBoolean();
        this.zzb = zzfbtVar;
        this.zzd = zzfcfVar;
    }

    private final void zzb() {
        final com.google.android.gms.ads.internal.client.zzt zztVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzia)).booleanValue() && this.zzc.compareAndSet(false, true) && (zztVar = this.zzb.zzae) != null && zztVar.zza == 3) {
            zzq(new zzdbl() { // from class: com.google.android.gms.internal.ads.zzcxz
                @Override // com.google.android.gms.internal.ads.zzdbl
                public final void zza(Object obj) {
                    ((zzcyd) obj).zzh(zztVar);
                }
            });
        }
    }

    public final void zza(final com.google.android.gms.ads.internal.client.zzt zztVar) {
        if (com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzf(this.zzd) && this.zzb.zzaB) {
            zzq(new zzdbl() { // from class: com.google.android.gms.internal.ads.zzcya
                @Override // com.google.android.gms.internal.ads.zzdbl
                public final void zza(Object obj) {
                    ((zzcyd) obj).zzh(zztVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxq
    public final void zzg() {
        if (this.zzb.zzb == 1) {
            zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwl
    public final void zzs() {
        int i = this.zzb.zzb;
        if (i == 2 || i == 5 || i == 4 || i == 6 || i == 7) {
            zzb();
        }
    }
}
