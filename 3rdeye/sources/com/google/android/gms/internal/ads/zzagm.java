package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzagm implements zzadw {
    private final long zzb;
    private final zzadw zzc;

    public zzagm(long j4, zzadw zzadwVar) {
        this.zzb = j4;
        this.zzc = zzadwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzadw
    public final void zzG() {
        this.zzc.zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzadw
    public final void zzP(zzaes zzaesVar) {
        this.zzc.zzP(new zzagl(this, zzaesVar, zzaesVar));
    }

    @Override // com.google.android.gms.internal.ads.zzadw
    public final zzaez zzw(int i, int i10) {
        return this.zzc.zzw(i, i10);
    }
}
