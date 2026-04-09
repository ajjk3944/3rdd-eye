package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes2.dex */
public final class zzagb implements zzafy {
    public zzagb(long j10) {
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final long zza() {
        return C.TIME_UNSET;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final zzafw zzc(long j10) {
        zzafz zzafzVar = new zzafz(j10, 0L);
        return new zzafw(zzafzVar, zzafzVar);
    }
}
