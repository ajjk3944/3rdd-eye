package com.google.android.gms.internal.ads;

import B4.i;
import N7.B8;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzggp extends zzgfo {
    private final int zza;
    private final int zzb;
    private final int zzc = 16;
    private final zzggn zzd;

    public /* synthetic */ zzggp(int i, int i10, int i11, zzggn zzggnVar, zzggo zzggoVar) {
        this.zza = i;
        this.zzb = i10;
        this.zzd = zzggnVar;
    }

    public static zzggm zzd() {
        return new zzggm(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzggp)) {
            return false;
        }
        zzggp zzggpVar = (zzggp) obj;
        return zzggpVar.zza == this.zza && zzggpVar.zzb == this.zzb && zzggpVar.zzd == this.zzd;
    }

    public final int hashCode() {
        return Objects.hash(zzggp.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), 16, this.zzd);
    }

    public final String toString() {
        StringBuilder sbK = B8.k("AesEax Parameters (variant: ", String.valueOf(this.zzd), ", ");
        sbK.append(this.zzb);
        sbK.append("-byte IV, 16-byte tag, and ");
        return i.j(sbK, this.zza, "-byte key)");
    }

    @Override // com.google.android.gms.internal.ads.zzgfa
    public final boolean zza() {
        return this.zzd != zzggn.zzc;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zza;
    }

    public final zzggn zze() {
        return this.zzd;
    }
}
