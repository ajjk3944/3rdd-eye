package com.google.android.gms.internal.ads;

import B4.i;
import N7.B8;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzghl extends zzgfo {
    private final int zza;
    private final zzghj zzb;

    public /* synthetic */ zzghl(int i, zzghj zzghjVar, zzghk zzghkVar) {
        this.zza = i;
        this.zzb = zzghjVar;
    }

    public static zzghi zzc() {
        return new zzghi(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzghl)) {
            return false;
        }
        zzghl zzghlVar = (zzghl) obj;
        return zzghlVar.zza == this.zza && zzghlVar.zzb == this.zzb;
    }

    public final int hashCode() {
        return Objects.hash(zzghl.class, Integer.valueOf(this.zza), this.zzb);
    }

    public final String toString() {
        return i.j(B8.k("AesGcmSiv Parameters (variant: ", String.valueOf(this.zzb), ", "), this.zza, "-byte key)");
    }

    @Override // com.google.android.gms.internal.ads.zzgfa
    public final boolean zza() {
        return this.zzb != zzghj.zzc;
    }

    public final int zzb() {
        return this.zza;
    }

    public final zzghj zzd() {
        return this.zzb;
    }
}
