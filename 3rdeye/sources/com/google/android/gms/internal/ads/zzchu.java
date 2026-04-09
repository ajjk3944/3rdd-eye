package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzchu implements zzhfy {
    private final zzchc zza;

    public zzchu(zzchc zzchcVar) {
        this.zza = zzchcVar;
    }

    public static VersionInfoParcel zzc(zzchc zzchcVar) {
        VersionInfoParcel versionInfoParcelZze = zzchcVar.zze();
        zzhgg.zzb(versionInfoParcelZze);
        return versionInfoParcelZze;
    }

    public final VersionInfoParcel zza() {
        return zzc(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, com.google.android.gms.internal.ads.zzhgm
    public final /* synthetic */ Object zzb() {
        return zzc(this.zza);
    }
}
