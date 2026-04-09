package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzggc {
    public static final zzggc zza = new zzggc("SHA1");
    public static final zzggc zzb = new zzggc("SHA224");
    public static final zzggc zzc = new zzggc("SHA256");
    public static final zzggc zzd = new zzggc("SHA384");
    public static final zzggc zze = new zzggc("SHA512");
    private final String zzf;

    private zzggc(String str) {
        this.zzf = str;
    }

    public final String toString() {
        return this.zzf;
    }
}
