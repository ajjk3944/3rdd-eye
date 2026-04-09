package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzflq {
    private final String zza;
    private final String zzb;

    private zzflq(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public static zzflq zza(String str, String str2) {
        zzfmz.zzb(str, "Name is null or empty");
        zzfmz.zzb(str2, "Version is null or empty");
        return new zzflq(str, str2);
    }

    public final String zzb() {
        return this.zza;
    }

    public final String zzc() {
        return this.zzb;
    }
}
