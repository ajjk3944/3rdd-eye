package com.google.android.gms.internal.ads;

import N7.C1094a9;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzfof extends zzfob {
    private final String zza;
    private final boolean zzb;
    private final boolean zzc;
    private final long zzd;
    private final long zze;

    public /* synthetic */ zzfof(String str, boolean z10, boolean z11, boolean z12, long j4, boolean z13, long j10, zzfoe zzfoeVar) {
        this.zza = str;
        this.zzb = z10;
        this.zzc = z11;
        this.zzd = j4;
        this.zze = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfob) {
            zzfob zzfobVar = (zzfob) obj;
            if (this.zza.equals(zzfobVar.zzd()) && this.zzb == zzfobVar.zzh() && this.zzc == zzfobVar.zzg()) {
                zzfobVar.zzf();
                if (this.zzd == zzfobVar.zzb()) {
                    zzfobVar.zze();
                    if (this.zze == zzfobVar.zza()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((this.zza.hashCode() ^ 1000003) * 1000003) ^ (true != this.zzb ? 1237 : 1231)) * 1000003) ^ (true != this.zzc ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ ((int) this.zzd)) * 1000003) ^ 1237) * 1000003) ^ ((int) this.zze);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdShield2Options{clientVersion=");
        sb.append(this.zza);
        sb.append(", shouldGetAdvertisingId=");
        sb.append(this.zzb);
        sb.append(", isGooglePlayServicesAvailable=");
        sb.append(this.zzc);
        sb.append(", enableQuerySignalsTimeout=false, querySignalsTimeoutMs=");
        sb.append(this.zzd);
        sb.append(", enableQuerySignalsCache=false, querySignalsCacheTtlSeconds=");
        return C1094a9.f(sb, this.zze, "}");
    }

    @Override // com.google.android.gms.internal.ads.zzfob
    public final long zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzfob
    public final long zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzfob
    public final String zzd() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfob
    public final boolean zze() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfob
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfob
    public final boolean zzg() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfob
    public final boolean zzh() {
        return this.zzb;
    }
}
