package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
final class zzgye {
    private final Object zza;
    private final int zzb;

    public zzgye(Object obj, int i) {
        this.zza = obj;
        this.zzb = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgye)) {
            return false;
        }
        zzgye zzgyeVar = (zzgye) obj;
        return this.zza == zzgyeVar.zza && this.zzb == zzgyeVar.zzb;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * 65535) + this.zzb;
    }
}
