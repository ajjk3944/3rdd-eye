package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzhfz implements zzhfy, zzhfs {
    private static final zzhfz zza = new zzhfz(null);
    private final Object zzb;

    private zzhfz(Object obj) {
        this.zzb = obj;
    }

    public static zzhfy zza(Object obj) {
        zzhgg.zza(obj, "instance cannot be null");
        return new zzhfz(obj);
    }

    public static zzhfy zzc(Object obj) {
        return obj == null ? zza : new zzhfz(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, com.google.android.gms.internal.ads.zzhgm
    public final Object zzb() {
        return this.zzb;
    }
}
