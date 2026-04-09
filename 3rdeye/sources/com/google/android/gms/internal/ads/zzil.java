package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzil implements zzlb {
    private final zzml zza;
    private final zzik zzb;
    private zzma zzc;
    private zzlb zzd;
    private boolean zze = true;
    private boolean zzf;

    public zzil(zzik zzikVar, zzdj zzdjVar) {
        this.zzb = zzikVar;
        this.zza = new zzml(zzdjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzlb
    public final long zza() {
        if (this.zze) {
            return this.zza.zza();
        }
        zzlb zzlbVar = this.zzd;
        zzlbVar.getClass();
        return zzlbVar.zza();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long zzb(boolean r6) {
        /*
            r5 = this;
            com.google.android.gms.internal.ads.zzma r0 = r5.zzc
            if (r0 == 0) goto L69
            boolean r0 = r0.zzW()
            if (r0 != 0) goto L69
            if (r6 == 0) goto L15
            com.google.android.gms.internal.ads.zzma r0 = r5.zzc
            int r0 = r0.zzcU()
            r1 = 2
            if (r0 != r1) goto L69
        L15:
            com.google.android.gms.internal.ads.zzma r0 = r5.zzc
            boolean r0 = r0.zzX()
            if (r0 != 0) goto L28
            if (r6 != 0) goto L69
            com.google.android.gms.internal.ads.zzma r6 = r5.zzc
            boolean r6 = r6.zzQ()
            if (r6 == 0) goto L28
            goto L69
        L28:
            com.google.android.gms.internal.ads.zzlb r6 = r5.zzd
            r6.getClass()
            long r0 = r6.zza()
            boolean r2 = r5.zze
            if (r2 == 0) goto L4d
            com.google.android.gms.internal.ads.zzml r2 = r5.zza
            long r3 = r2.zza()
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 >= 0) goto L43
            r2.zze()
            goto L75
        L43:
            r3 = 0
            r5.zze = r3
            boolean r3 = r5.zzf
            if (r3 == 0) goto L4d
            r2.zzd()
        L4d:
            com.google.android.gms.internal.ads.zzml r2 = r5.zza
            r2.zzb(r0)
            com.google.android.gms.internal.ads.zzbb r6 = r6.zzc()
            com.google.android.gms.internal.ads.zzbb r0 = r2.zzc()
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L75
            r2.zzg(r6)
            com.google.android.gms.internal.ads.zzik r0 = r5.zzb
            r0.zzc(r6)
            goto L75
        L69:
            r6 = 1
            r5.zze = r6
            boolean r6 = r5.zzf
            if (r6 == 0) goto L75
            com.google.android.gms.internal.ads.zzml r6 = r5.zza
            r6.zzd()
        L75:
            long r0 = r5.zza()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzil.zzb(boolean):long");
    }

    @Override // com.google.android.gms.internal.ads.zzlb
    public final zzbb zzc() {
        zzlb zzlbVar = this.zzd;
        return zzlbVar != null ? zzlbVar.zzc() : this.zza.zzc();
    }

    public final void zzd(zzma zzmaVar) {
        if (zzmaVar == this.zzc) {
            this.zzd = null;
            this.zzc = null;
            this.zze = true;
        }
    }

    public final void zze(zzma zzmaVar) throws zzin {
        zzlb zzlbVar;
        zzlb zzlbVarZzl = zzmaVar.zzl();
        if (zzlbVarZzl == null || zzlbVarZzl == (zzlbVar = this.zzd)) {
            return;
        }
        if (zzlbVar != null) {
            throw zzin.zzd(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.zzd = zzlbVarZzl;
        this.zzc = zzmaVar;
        zzlbVarZzl.zzg(this.zza.zzc());
    }

    public final void zzf(long j4) {
        this.zza.zzb(j4);
    }

    @Override // com.google.android.gms.internal.ads.zzlb
    public final void zzg(zzbb zzbbVar) {
        zzlb zzlbVar = this.zzd;
        if (zzlbVar != null) {
            zzlbVar.zzg(zzbbVar);
            zzbbVar = this.zzd.zzc();
        }
        this.zza.zzg(zzbbVar);
    }

    public final void zzh() {
        this.zzf = true;
        this.zza.zzd();
    }

    public final void zzi() {
        this.zzf = false;
        this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzlb
    public final boolean zzj() {
        if (this.zze) {
            return false;
        }
        zzlb zzlbVar = this.zzd;
        zzlbVar.getClass();
        return zzlbVar.zzj();
    }
}
