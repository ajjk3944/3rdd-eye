package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzdij {
    private zzbgk zza;

    public zzdij(zzdhu zzdhuVar) {
        this.zza = zzdhuVar;
    }

    public final synchronized zzbgk zza() {
        return this.zza;
    }

    public final synchronized void zzb(zzbgk zzbgkVar) {
        this.zza = zzbgkVar;
    }
}
