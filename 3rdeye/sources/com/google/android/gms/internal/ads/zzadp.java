package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzadp implements zzaez {
    private final byte[] zza = new byte[4096];

    @Override // com.google.android.gms.internal.ads.zzaez
    public final /* synthetic */ int zzf(zzl zzlVar, int i, boolean z10) {
        return zzaex.zza(this, zzlVar, i, z10);
    }

    @Override // com.google.android.gms.internal.ads.zzaez
    public final int zzg(zzl zzlVar, int i, boolean z10, int i10) throws IOException {
        int iZza = zzlVar.zza(this.zza, 0, Math.min(4096, i));
        if (iZza != -1) {
            return iZza;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.gms.internal.ads.zzaez
    public final /* synthetic */ void zzr(zzen zzenVar, int i) {
        zzaex.zzb(this, zzenVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zzaez
    public final void zzs(zzen zzenVar, int i, int i10) {
        zzenVar.zzM(i);
    }

    @Override // com.google.android.gms.internal.ads.zzaez
    public final /* synthetic */ void zzl(long j4) {
    }

    @Override // com.google.android.gms.internal.ads.zzaez
    public final void zzm(zzz zzzVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzaez
    public final void zzt(long j4, int i, int i10, int i11, zzaey zzaeyVar) {
    }
}
