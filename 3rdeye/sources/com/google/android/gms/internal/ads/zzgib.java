package com.google.android.gms.internal.ads;

import N7.C1154e9;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzgib extends zzgfo {
    private final String zza;
    private final zzgia zzb;

    private zzgib(String str, zzgia zzgiaVar) {
        this.zza = str;
        this.zzb = zzgiaVar;
    }

    public static zzgib zzc(String str, zzgia zzgiaVar) {
        return new zzgib(str, zzgiaVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgib)) {
            return false;
        }
        zzgib zzgibVar = (zzgib) obj;
        return zzgibVar.zza.equals(this.zza) && zzgibVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Objects.hash(zzgib.class, this.zza, this.zzb);
    }

    public final String toString() {
        return C1154e9.j(new StringBuilder("LegacyKmsAead Parameters (keyUri: "), this.zza, ", variant: ", this.zzb.toString(), ")");
    }

    @Override // com.google.android.gms.internal.ads.zzgfa
    public final boolean zza() {
        return this.zzb != zzgia.zzb;
    }

    public final zzgia zzb() {
        return this.zzb;
    }

    public final String zzd() {
        return this.zza;
    }
}
