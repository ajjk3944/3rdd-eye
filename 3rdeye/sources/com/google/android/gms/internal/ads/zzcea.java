package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzcea implements zzgj {
    private final zzgj zza;
    private final long zzb;
    private final zzgj zzc;
    private long zzd;
    private Uri zze;

    public zzcea(zzgj zzgjVar, int i, zzgj zzgjVar2) {
        this.zza = zzgjVar;
        this.zzb = i;
        this.zzc = zzgjVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzl
    public final int zza(byte[] bArr, int i, int i10) throws IOException {
        int i11;
        long j4 = this.zzd;
        long j10 = this.zzb;
        if (j4 < j10) {
            int iZza = this.zza.zza(bArr, i, (int) Math.min(i10, j10 - j4));
            long j11 = this.zzd + iZza;
            this.zzd = j11;
            i11 = iZza;
            j4 = j11;
        } else {
            i11 = 0;
        }
        if (j4 < j10) {
            return i11;
        }
        int iZza2 = this.zzc.zza(bArr, i + i11, i10 - i11);
        int i12 = i11 + iZza2;
        this.zzd += iZza2;
        return i12;
    }

    @Override // com.google.android.gms.internal.ads.zzgj
    public final long zzb(zzgo zzgoVar) throws IOException {
        Uri uri;
        zzgo zzgoVar2;
        Uri uri2 = zzgoVar.zza;
        this.zze = uri2;
        long j4 = zzgoVar.zze;
        long j10 = this.zzb;
        zzgo zzgoVar3 = null;
        if (j4 >= j10) {
            uri = uri2;
            zzgoVar2 = null;
        } else {
            long j11 = zzgoVar.zzf;
            long jMin = j10 - j4;
            if (j11 != -1) {
                jMin = Math.min(j11, jMin);
            }
            uri = uri2;
            zzgoVar2 = new zzgo(uri, j4, jMin, null);
        }
        long j12 = zzgoVar.zzf;
        if (j12 == -1 || j4 + j12 > j10) {
            zzgoVar3 = new zzgo(uri, Math.max(j10, j4), j12 != -1 ? Math.min(j12, (j4 + j12) - j10) : -1L, null);
        }
        long jZzb = zzgoVar2 != null ? this.zza.zzb(zzgoVar2) : 0L;
        long jZzb2 = zzgoVar3 != null ? this.zzc.zzb(zzgoVar3) : 0L;
        this.zzd = j4;
        if (jZzb == -1 || jZzb2 == -1) {
            return -1L;
        }
        return jZzb + jZzb2;
    }

    @Override // com.google.android.gms.internal.ads.zzgj
    public final Uri zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgj
    public final void zzd() throws IOException {
        this.zza.zzd();
        this.zzc.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzgj
    public final Map zze() {
        return zzfyi.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzgj
    public final void zzf(zzhj zzhjVar) {
    }
}
