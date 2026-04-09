package com.google.android.gms.internal.ads;

import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzang implements zzamx {
    private final zzaob zza;
    private String zzb;
    private zzaez zzc;
    private zzanf zzd;
    private boolean zze;
    private long zzl;
    private final boolean[] zzf = new boolean[3];
    private final zzanp zzg = new zzanp(32, 128);
    private final zzanp zzh = new zzanp(33, 128);
    private final zzanp zzi = new zzanp(34, 128);
    private final zzanp zzj = new zzanp(39, 128);
    private final zzanp zzk = new zzanp(40, 128);
    private long zzm = -9223372036854775807L;
    private final zzen zzn = new zzen();

    public zzang(zzaob zzaobVar, String str) {
        this.zza = zzaobVar;
    }

    private final void zzf(long j4, int i, int i10, long j10) {
        this.zzd.zza(j4, i, this.zze);
        if (!this.zze) {
            zzanp zzanpVar = this.zzg;
            zzanpVar.zzd(i10);
            zzanp zzanpVar2 = this.zzh;
            zzanpVar2.zzd(i10);
            zzanp zzanpVar3 = this.zzi;
            zzanpVar3.zzd(i10);
            if (zzanpVar.zze() && zzanpVar2.zze() && zzanpVar3.zze()) {
                String str = this.zzb;
                int i11 = zzanpVar.zzb;
                byte[] bArr = new byte[zzanpVar2.zzb + i11 + zzanpVar3.zzb];
                System.arraycopy(zzanpVar.zza, 0, bArr, 0, i11);
                System.arraycopy(zzanpVar2.zza, 0, bArr, zzanpVar.zzb, zzanpVar2.zzb);
                System.arraycopy(zzanpVar3.zza, 0, bArr, zzanpVar.zzb + zzanpVar2.zzb, zzanpVar3.zzb);
                String strZzd = null;
                zzfp zzfpVarZzd = zzfv.zzd(zzanpVar2.zza, 3, zzanpVar2.zzb, null);
                zzfk zzfkVar = zzfpVarZzd.zzb;
                if (zzfkVar != null) {
                    int i12 = zzfkVar.zzf;
                    int[] iArr = zzfkVar.zze;
                    int i13 = zzfkVar.zzd;
                    strZzd = zzdk.zzd(zzfkVar.zza, zzfkVar.zzb, zzfkVar.zzc, i13, iArr, i12);
                }
                zzx zzxVar = new zzx();
                zzxVar.zzS(str);
                zzxVar.zzG("video/mp2t");
                zzxVar.zzah("video/hevc");
                zzxVar.zzE(strZzd);
                zzxVar.zzam(zzfpVarZzd.zze);
                zzxVar.zzQ(zzfpVarZzd.zzf);
                zzxVar.zzK(zzfpVarZzd.zzg);
                zzxVar.zzJ(zzfpVarZzd.zzh);
                zzi zziVar = new zzi();
                zziVar.zzc(zzfpVarZzd.zzk);
                zziVar.zzb(zzfpVarZzd.zzl);
                zziVar.zzd(zzfpVarZzd.zzm);
                zziVar.zzf(zzfpVarZzd.zzc + 8);
                zziVar.zza(zzfpVarZzd.zzd + 8);
                zzxVar.zzF(zziVar.zzg());
                zzxVar.zzad(zzfpVarZzd.zzi);
                zzxVar.zzY(zzfpVarZzd.zzj);
                zzxVar.zzZ(zzfpVarZzd.zza + 1);
                zzxVar.zzT(Collections.singletonList(bArr));
                zzz zzzVarZzan = zzxVar.zzan();
                this.zzc.zzm(zzzVarZzan);
                int i14 = zzzVarZzan.zzq;
                zzfve.zzl(i14 != -1);
                this.zza.zzf(i14);
                this.zze = true;
            }
        }
        zzanp zzanpVar4 = this.zzj;
        if (zzanpVar4.zzd(i10)) {
            int iZzc = zzfv.zzc(zzanpVar4.zza, zzanpVar4.zzb);
            zzen zzenVar = this.zzn;
            zzenVar.zzJ(zzanpVar4.zza, iZzc);
            zzenVar.zzM(5);
            this.zza.zzc(j10, zzenVar);
        }
        zzanp zzanpVar5 = this.zzk;
        if (zzanpVar5.zzd(i10)) {
            int iZzc2 = zzfv.zzc(zzanpVar5.zza, zzanpVar5.zzb);
            zzen zzenVar2 = this.zzn;
            zzenVar2.zzJ(zzanpVar5.zza, iZzc2);
            zzenVar2.zzM(5);
            this.zza.zzc(j10, zzenVar2);
        }
    }

    private final void zzg(byte[] bArr, int i, int i10) {
        this.zzd.zzb(bArr, i, i10);
        if (!this.zze) {
            this.zzg.zza(bArr, i, i10);
            this.zzh.zza(bArr, i, i10);
            this.zzi.zza(bArr, i, i10);
        }
        this.zzj.zza(bArr, i, i10);
        this.zzk.zza(bArr, i, i10);
    }

    private final void zzh(long j4, int i, int i10, long j10) {
        this.zzd.zzd(j4, i, i10, j10, this.zze);
        if (!this.zze) {
            this.zzg.zzc(i10);
            this.zzh.zzc(i10);
            this.zzi.zzc(i10);
        }
        this.zzj.zzc(i10);
        this.zzk.zzc(i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004d  */
    @Override // com.google.android.gms.internal.ads.zzamx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(com.google.android.gms.internal.ads.zzen r18) {
        /*
            r17 = this;
            r0 = r17
            r7 = 3
            com.google.android.gms.internal.ads.zzaez r1 = r0.zzc
            com.google.android.gms.internal.ads.zzdd.zzb(r1)
            java.lang.String r1 = com.google.android.gms.internal.ads.zzex.zza
        La:
            int r1 = r18.zza()
            if (r1 <= 0) goto L78
            int r1 = r18.zzc()
            int r8 = r18.zzd()
            byte[] r9 = r18.zzN()
            long r2 = r0.zzl
            int r4 = r18.zza()
            long r4 = (long) r4
            long r2 = r2 + r4
            r0.zzl = r2
            com.google.android.gms.internal.ads.zzaez r2 = r0.zzc
            int r3 = r18.zza()
            r10 = r18
            r2.zzr(r10, r3)
        L31:
            if (r1 >= r8) goto La
            boolean[] r2 = r0.zzf
            int r2 = com.google.android.gms.internal.ads.zzfv.zza(r9, r1, r8, r2)
            if (r2 == r8) goto L75
            int r3 = r2 + 3
            r3 = r9[r3]
            r3 = r3 & 126(0x7e, float:1.77E-43)
            if (r2 <= 0) goto L4d
            int r4 = r2 + (-1)
            r5 = r9[r4]
            if (r5 != 0) goto L4d
            r2 = 4
            r12 = r2
            r11 = r4
            goto L4f
        L4d:
            r11 = r2
            r12 = r7
        L4f:
            int r2 = r11 - r1
            if (r2 <= 0) goto L56
            r0.zzg(r9, r1, r11)
        L56:
            r1 = r3
            int r3 = r8 - r11
            long r4 = r0.zzl
            long r13 = (long) r3
            long r4 = r4 - r13
            if (r2 >= 0) goto L61
            int r2 = -r2
            goto L62
        L61:
            r2 = 0
        L62:
            int r13 = r1 >> 1
            r15 = r4
            r4 = r2
            r1 = r15
            long r5 = r0.zzm
            r0.zzf(r1, r3, r4, r5)
            long r5 = r0.zzm
            r4 = r13
            r0.zzh(r1, r3, r4, r5)
            int r1 = r11 + r12
            goto L31
        L75:
            r0.zzg(r9, r1, r8)
        L78:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzang.zza(com.google.android.gms.internal.ads.zzen):void");
    }

    @Override // com.google.android.gms.internal.ads.zzamx
    public final void zzb(zzadw zzadwVar, zzaol zzaolVar) {
        zzaolVar.zzc();
        this.zzb = zzaolVar.zzb();
        zzaez zzaezVarZzw = zzadwVar.zzw(zzaolVar.zza(), 2);
        this.zzc = zzaezVarZzw;
        this.zzd = new zzanf(zzaezVarZzw);
        this.zza.zzd(zzadwVar, zzaolVar);
    }

    @Override // com.google.android.gms.internal.ads.zzamx
    public final void zzc(boolean z10) {
        zzdd.zzb(this.zzc);
        String str = zzex.zza;
        if (z10) {
            this.zza.zze();
            zzf(this.zzl, 0, 0, this.zzm);
            zzh(this.zzl, 0, 48, this.zzm);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamx
    public final void zzd(long j4, int i) {
        this.zzm = j4;
    }

    @Override // com.google.android.gms.internal.ads.zzamx
    public final void zze() {
        this.zzl = 0L;
        this.zzm = -9223372036854775807L;
        zzfv.zzi(this.zzf);
        this.zzg.zzb();
        this.zzh.zzb();
        this.zzi.zzb();
        this.zzj.zzb();
        this.zzk.zzb();
        this.zza.zzb();
        zzanf zzanfVar = this.zzd;
        if (zzanfVar != null) {
            zzanfVar.zzc();
        }
    }
}
