package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzmh {
    public static final zzmh zza = new zzmh(new zzmg());
    public final zzfyk zzb;
    public final Double zzc = null;
    public final Double zzd = null;
    public final boolean zze = true;
    public final boolean zzf = false;

    private zzmh(zzmg zzmgVar) {
        this.zzb = zzmgVar.zza;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzmh) && this.zzb.equals(((zzmh) obj).zzb);
    }

    public final int hashCode() {
        return Objects.hash(this.zzb, null, null, Boolean.TRUE, Boolean.FALSE);
    }
}
