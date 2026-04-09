package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzgij {
    public static final zzgij zza = new zzgij("ASSUME_AES_GCM");
    public static final zzgij zzb = new zzgij("ASSUME_XCHACHA20POLY1305");
    public static final zzgij zzc = new zzgij("ASSUME_CHACHA20POLY1305");
    public static final zzgij zzd = new zzgij("ASSUME_AES_CTR_HMAC");
    public static final zzgij zze = new zzgij("ASSUME_AES_EAX");
    public static final zzgij zzf = new zzgij("ASSUME_AES_GCM_SIV");
    private final String zzg;

    private zzgij(String str) {
        this.zzg = str;
    }

    public final String toString() {
        return this.zzg;
    }
}
