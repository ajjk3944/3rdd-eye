package com.google.android.gms.internal.ads;

import kotlin.KotlinVersion;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzais implements zzaio {
    private final zzen zza;
    private final int zzb;
    private final int zzc;
    private int zzd;
    private int zze;

    public zzais(zzfd zzfdVar) {
        zzen zzenVar = zzfdVar.zza;
        this.zza = zzenVar;
        zzenVar.zzL(12);
        this.zzc = zzenVar.zzp() & KotlinVersion.MAX_COMPONENT_VALUE;
        this.zzb = zzenVar.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzaio
    public final int zza() {
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzaio
    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzaio
    public final int zzc() {
        int i = this.zzc;
        if (i == 8) {
            return this.zza.zzm();
        }
        if (i == 16) {
            return this.zza.zzq();
        }
        int i10 = this.zzd;
        this.zzd = i10 + 1;
        if (i10 % 2 != 0) {
            return this.zze & 15;
        }
        int iZzm = this.zza.zzm();
        this.zze = iZzm;
        return (iZzm & 240) >> 4;
    }
}
