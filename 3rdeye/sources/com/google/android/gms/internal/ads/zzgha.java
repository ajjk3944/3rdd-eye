package com.google.android.gms.internal.ads;

import B4.i;
import N7.B8;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzgha extends zzgfo {
    private final int zza;
    private final int zzb = 12;
    private final int zzc = 16;
    private final zzggy zzd;

    public /* synthetic */ zzgha(int i, int i10, int i11, zzggy zzggyVar, zzggz zzggzVar) {
        this.zza = i;
        this.zzd = zzggyVar;
    }

    public static zzggx zzc() {
        return new zzggx(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgha)) {
            return false;
        }
        zzgha zzghaVar = (zzgha) obj;
        return zzghaVar.zza == this.zza && zzghaVar.zzd == this.zzd;
    }

    public final int hashCode() {
        return Objects.hash(zzgha.class, Integer.valueOf(this.zza), 12, 16, this.zzd);
    }

    public final String toString() {
        return i.j(B8.k("AesGcm Parameters (variant: ", String.valueOf(this.zzd), ", 12-byte IV, 16-byte tag, and "), this.zza, "-byte key)");
    }

    @Override // com.google.android.gms.internal.ads.zzgfa
    public final boolean zza() {
        return this.zzd != zzggy.zzc;
    }

    public final int zzb() {
        return this.zza;
    }

    public final zzggy zzd() {
        return this.zzd;
    }
}
