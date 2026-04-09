package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzane implements zzamx {
    private final zzaob zza;
    private long zzf;
    private String zzh;
    private zzaez zzi;
    private zzand zzj;
    private boolean zzk;
    private boolean zzm;
    private final String zzb = "video/mp2t";
    private final boolean[] zzg = new boolean[3];
    private final zzanp zzc = new zzanp(7, 128);
    private final zzanp zzd = new zzanp(8, 128);
    private final zzanp zze = new zzanp(6, 128);
    private long zzl = -9223372036854775807L;
    private final zzen zzn = new zzen();

    public zzane(zzaob zzaobVar, boolean z10, boolean z11, String str) {
        this.zza = zzaobVar;
    }

    private final void zzf(long j4, int i, int i10, long j10) {
        if (!this.zzk) {
            zzanp zzanpVar = this.zzc;
            zzanpVar.zzd(i10);
            zzanp zzanpVar2 = this.zzd;
            zzanpVar2.zzd(i10);
            if (this.zzk) {
                if (zzanpVar.zze()) {
                    zzfu zzfuVarZzg = zzfv.zzg(zzanpVar.zza, 4, zzanpVar.zzb);
                    this.zza.zzf(zzfuVarZzg.zzm);
                    this.zzj.zzb(zzfuVarZzg);
                    zzanpVar.zzb();
                } else if (zzanpVar2.zze()) {
                    this.zzj.zza(zzfv.zzf(zzanpVar2.zza, 4, zzanpVar2.zzb));
                    zzanpVar2.zzb();
                }
            } else if (zzanpVar.zze() && zzanpVar2.zze()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Arrays.copyOf(zzanpVar.zza, zzanpVar.zzb));
                arrayList.add(Arrays.copyOf(zzanpVar2.zza, zzanpVar2.zzb));
                zzfu zzfuVarZzg2 = zzfv.zzg(zzanpVar.zza, 4, zzanpVar.zzb);
                zzft zzftVarZzf = zzfv.zzf(zzanpVar2.zza, 4, zzanpVar2.zzb);
                String strZzc = zzdk.zzc(zzfuVarZzg2.zza, zzfuVarZzg2.zzb, zzfuVarZzg2.zzc);
                zzaez zzaezVar = this.zzi;
                zzx zzxVar = new zzx();
                zzxVar.zzS(this.zzh);
                zzxVar.zzG(this.zzb);
                zzxVar.zzah("video/avc");
                zzxVar.zzE(strZzc);
                zzxVar.zzam(zzfuVarZzg2.zze);
                zzxVar.zzQ(zzfuVarZzg2.zzf);
                zzi zziVar = new zzi();
                zziVar.zzc(zzfuVarZzg2.zzj);
                zziVar.zzb(zzfuVarZzg2.zzk);
                zziVar.zzd(zzfuVarZzg2.zzl);
                zziVar.zzf(zzfuVarZzg2.zzh + 8);
                zziVar.zza(zzfuVarZzg2.zzi + 8);
                zzxVar.zzF(zziVar.zzg());
                zzxVar.zzad(zzfuVarZzg2.zzg);
                zzxVar.zzT(arrayList);
                int i11 = zzfuVarZzg2.zzm;
                zzxVar.zzY(i11);
                zzaezVar.zzm(zzxVar.zzan());
                this.zzk = true;
                this.zza.zzf(i11);
                this.zzj.zzb(zzfuVarZzg2);
                this.zzj.zza(zzftVarZzf);
                zzanpVar.zzb();
                zzanpVar2.zzb();
            }
        }
        zzanp zzanpVar3 = this.zze;
        if (zzanpVar3.zzd(i10)) {
            int iZzc = zzfv.zzc(zzanpVar3.zza, zzanpVar3.zzb);
            zzen zzenVar = this.zzn;
            zzenVar.zzJ(zzanpVar3.zza, iZzc);
            zzenVar.zzL(4);
            this.zza.zzc(j10, zzenVar);
        }
        if (this.zzj.zze(j4, i, this.zzk)) {
            this.zzm = false;
        }
    }

    private final void zzg(byte[] bArr, int i, int i10) {
        if (!this.zzk) {
            this.zzc.zza(bArr, i, i10);
            this.zzd.zza(bArr, i, i10);
        }
        this.zze.zza(bArr, i, i10);
    }

    private final void zzh(long j4, int i, long j10) {
        if (!this.zzk) {
            this.zzc.zzc(i);
            this.zzd.zzc(i);
        }
        this.zze.zzc(i);
        this.zzj.zzd(j4, i, j10, this.zzm);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0043  */
    @Override // com.google.android.gms.internal.ads.zzamx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(com.google.android.gms.internal.ads.zzen r16) {
        /*
            r15 = this;
            r7 = 3
            com.google.android.gms.internal.ads.zzaez r1 = r15.zzi
            com.google.android.gms.internal.ads.zzdd.zzb(r1)
            java.lang.String r1 = com.google.android.gms.internal.ads.zzex.zza
            int r1 = r16.zzc()
            int r8 = r16.zzd()
            byte[] r9 = r16.zzN()
            long r2 = r15.zzf
            int r4 = r16.zza()
            long r4 = (long) r4
            long r2 = r2 + r4
            r15.zzf = r2
            com.google.android.gms.internal.ads.zzaez r2 = r15.zzi
            int r3 = r16.zza()
            r4 = r16
            r2.zzr(r4, r3)
        L29:
            boolean[] r2 = r15.zzg
            int r2 = com.google.android.gms.internal.ads.zzfv.zza(r9, r1, r8, r2)
            if (r2 == r8) goto L6a
            int r3 = r2 + 3
            r3 = r9[r3]
            r10 = r3 & 31
            if (r2 <= 0) goto L43
            int r3 = r2 + (-1)
            r4 = r9[r3]
            if (r4 != 0) goto L43
            r2 = 4
            r12 = r2
            r11 = r3
            goto L45
        L43:
            r11 = r2
            r12 = r7
        L45:
            int r2 = r11 - r1
            if (r2 <= 0) goto L4c
            r15.zzg(r9, r1, r11)
        L4c:
            int r3 = r8 - r11
            long r4 = r15.zzf
            long r13 = (long) r3
            long r4 = r4 - r13
            if (r2 >= 0) goto L57
            int r1 = -r2
        L55:
            r13 = r4
            goto L59
        L57:
            r1 = 0
            goto L55
        L59:
            long r5 = r15.zzl
            r0 = r15
            r4 = r1
            r1 = r13
            r0.zzf(r1, r3, r4, r5)
            long r4 = r15.zzl
            r3 = r10
            r0.zzh(r1, r3, r4)
            int r1 = r11 + r12
            goto L29
        L6a:
            r15.zzg(r9, r1, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzane.zza(com.google.android.gms.internal.ads.zzen):void");
    }

    @Override // com.google.android.gms.internal.ads.zzamx
    public final void zzb(zzadw zzadwVar, zzaol zzaolVar) {
        zzaolVar.zzc();
        this.zzh = zzaolVar.zzb();
        zzaez zzaezVarZzw = zzadwVar.zzw(zzaolVar.zza(), 2);
        this.zzi = zzaezVarZzw;
        this.zzj = new zzand(zzaezVarZzw, false, false);
        this.zza.zzd(zzadwVar, zzaolVar);
    }

    @Override // com.google.android.gms.internal.ads.zzamx
    public final void zzc(boolean z10) {
        zzdd.zzb(this.zzi);
        String str = zzex.zza;
        if (z10) {
            this.zza.zze();
            zzf(this.zzf, 0, 0, this.zzl);
            zzh(this.zzf, 9, this.zzl);
            zzf(this.zzf, 0, 0, this.zzl);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamx
    public final void zzd(long j4, int i) {
        this.zzl = j4;
        int i10 = i & 2;
        this.zzm = (i10 != 0) | this.zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzamx
    public final void zze() {
        this.zzf = 0L;
        this.zzm = false;
        this.zzl = -9223372036854775807L;
        zzfv.zzi(this.zzg);
        this.zzc.zzb();
        this.zzd.zzb();
        this.zze.zzb();
        this.zza.zzb();
        zzand zzandVar = this.zzj;
        if (zzandVar != null) {
            zzandVar.zzc();
        }
    }
}
