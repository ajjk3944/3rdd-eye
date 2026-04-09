package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzeam implements zzcxf, zzcvu {
    private static final Object zza = new Object();
    private static int zzb;
    private final com.google.android.gms.ads.internal.util.zzg zzc;
    private final zzeaw zzd;

    public zzeam(zzeaw zzeawVar, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zzd = zzeawVar;
        this.zzc = zzgVar;
    }

    private final void zzb(boolean z10) {
        int i;
        int iIntValue;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzgq)).booleanValue() && !this.zzc.zzN()) {
            Object obj = zza;
            synchronized (obj) {
                i = zzb;
                iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzgr)).intValue();
            }
            if (i < iIntValue) {
                this.zzd.zzd(z10);
                synchronized (obj) {
                    zzb++;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvu
    public final void zzdD(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzb(false);
    }

    @Override // com.google.android.gms.internal.ads.zzcxf
    public final void zzt() {
        zzb(true);
    }
}
