package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzhgj {
    private final List zza;
    private final List zzb;

    public /* synthetic */ zzhgj(int i, int i10, zzhgi zzhgiVar) {
        this.zza = zzhfv.zzc(i);
        this.zzb = zzhfv.zzc(i10);
    }

    public final zzhgj zza(zzhgh zzhghVar) {
        this.zzb.add(zzhghVar);
        return this;
    }

    public final zzhgj zzb(zzhgh zzhghVar) {
        this.zza.add(zzhghVar);
        return this;
    }

    public final zzhgk zzc() {
        return new zzhgk(this.zza, this.zzb, null);
    }
}
