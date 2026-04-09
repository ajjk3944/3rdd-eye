package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzagf implements zzadt {
    private final zzen zza = new zzen(4);
    private final zzaeu zzb = new zzaeu(-1, -1, "image/heif");

    private final boolean zza(zzadu zzaduVar, int i) throws IOException {
        zzen zzenVar = this.zza;
        zzenVar.zzI(4);
        ((zzadj) zzaduVar).zzm(zzenVar.zzN(), 0, 4, false);
        return zzenVar.zzu() == ((long) i);
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final int zzb(zzadu zzaduVar, zzaep zzaepVar) throws IOException {
        return this.zzb.zzb(zzaduVar, zzaepVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final /* synthetic */ List zzd() {
        return zzfyf.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final void zze(zzadw zzadwVar) {
        this.zzb.zze(zzadwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final void zzf(long j4, long j10) {
        this.zzb.zzf(j4, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final boolean zzi(zzadu zzaduVar) throws IOException {
        ((zzadj) zzaduVar).zzl(4, false);
        return zza(zzaduVar, 1718909296) && zza(zzaduVar, 1751476579);
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final /* synthetic */ zzadt zzc() {
        return this;
    }
}
