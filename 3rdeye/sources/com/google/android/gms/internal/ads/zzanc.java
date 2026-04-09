package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzanc implements zzamx {
    private static final float[] zza = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    private final zzaop zzb;
    private zzanb zzg;
    private long zzh;
    private String zzi;
    private zzaez zzj;
    private boolean zzk;
    private final boolean[] zzd = new boolean[4];
    private final zzana zze = new zzana(128);
    private long zzl = -9223372036854775807L;
    private final zzanp zzf = new zzanp(178, 128);
    private final zzen zzc = new zzen();

    public zzanc(zzaop zzaopVar, String str) {
        this.zzb = zzaopVar;
    }

    @Override // com.google.android.gms.internal.ads.zzamx
    public final void zza(zzen zzenVar) {
        int i;
        int i10 = 3;
        zzdd.zzb(this.zzg);
        zzdd.zzb(this.zzj);
        int iZzc = zzenVar.zzc();
        int iZzd = zzenVar.zzd();
        byte[] bArrZzN = zzenVar.zzN();
        this.zzh += zzenVar.zza();
        this.zzj.zzr(zzenVar, zzenVar.zza());
        while (true) {
            int iZza = zzfv.zza(bArrZzN, iZzc, iZzd, this.zzd);
            if (iZza == iZzd) {
                break;
            }
            int i11 = iZza + 3;
            int i12 = zzenVar.zzN()[i11] & 255;
            int i13 = iZza - iZzc;
            if (!this.zzk) {
                if (i13 > 0) {
                    this.zze.zza(bArrZzN, iZzc, iZza);
                }
                int i14 = i13 < 0 ? -i13 : 0;
                zzana zzanaVar = this.zze;
                if (zzanaVar.zzc(i12, i14)) {
                    zzaez zzaezVar = this.zzj;
                    int i15 = zzanaVar.zzb;
                    String str = this.zzi;
                    str.getClass();
                    byte[] bArrCopyOf = Arrays.copyOf(zzanaVar.zzc, zzanaVar.zza);
                    zzem zzemVar = new zzem(bArrCopyOf, bArrCopyOf.length);
                    zzemVar.zzo(i15);
                    zzemVar.zzo(4);
                    zzemVar.zzm();
                    zzemVar.zzn(8);
                    if (zzemVar.zzp()) {
                        zzemVar.zzn(4);
                        zzemVar.zzn(i10);
                    }
                    int iZzd2 = zzemVar.zzd(4);
                    float f10 = 1.0f;
                    if (iZzd2 == 15) {
                        int iZzd3 = zzemVar.zzd(8);
                        int iZzd4 = zzemVar.zzd(8);
                        if (iZzd4 == 0) {
                            zzea.zzf("H263Reader", "Invalid aspect ratio");
                        } else {
                            f10 = iZzd3 / iZzd4;
                        }
                    } else if (iZzd2 < 7) {
                        f10 = zza[iZzd2];
                    } else {
                        zzea.zzf("H263Reader", "Invalid aspect ratio");
                    }
                    float f11 = f10;
                    if (zzemVar.zzp()) {
                        zzemVar.zzn(2);
                        zzemVar.zzn(1);
                        if (zzemVar.zzp()) {
                            zzemVar.zzn(15);
                            zzemVar.zzm();
                            zzemVar.zzn(15);
                            zzemVar.zzm();
                            zzemVar.zzn(15);
                            zzemVar.zzm();
                            zzemVar.zzn(3);
                            zzemVar.zzn(11);
                            zzemVar.zzm();
                            zzemVar.zzn(15);
                            zzemVar.zzm();
                        }
                    }
                    if (zzemVar.zzd(2) != 0) {
                        zzea.zzf("H263Reader", "Unhandled video object layer shape");
                    }
                    zzemVar.zzm();
                    int iZzd5 = zzemVar.zzd(16);
                    zzemVar.zzm();
                    if (zzemVar.zzp()) {
                        if (iZzd5 == 0) {
                            zzea.zzf("H263Reader", "Invalid vop_increment_time_resolution");
                        } else {
                            int i16 = iZzd5 - 1;
                            int i17 = 0;
                            while (i16 > 0) {
                                i16 >>= 1;
                                i17++;
                            }
                            zzemVar.zzn(i17);
                        }
                    }
                    zzemVar.zzm();
                    int iZzd6 = zzemVar.zzd(13);
                    zzemVar.zzm();
                    int iZzd7 = zzemVar.zzd(13);
                    zzemVar.zzm();
                    zzemVar.zzm();
                    zzx zzxVar = new zzx();
                    zzxVar.zzS(str);
                    zzxVar.zzG("video/mp2t");
                    zzxVar.zzah("video/mp4v-es");
                    zzxVar.zzam(iZzd6);
                    zzxVar.zzQ(iZzd7);
                    zzxVar.zzad(f11);
                    zzxVar.zzT(Collections.singletonList(bArrCopyOf));
                    zzaezVar.zzm(zzxVar.zzan());
                    this.zzk = true;
                }
            }
            this.zzg.zza(bArrZzN, iZzc, iZza);
            zzanp zzanpVar = this.zzf;
            if (i13 > 0) {
                zzanpVar.zza(bArrZzN, iZzc, iZza);
                i = 0;
            } else {
                i = -i13;
            }
            if (zzanpVar.zzd(i)) {
                int iZzc2 = zzfv.zzc(zzanpVar.zza, zzanpVar.zzb);
                zzen zzenVar2 = this.zzc;
                String str2 = zzex.zza;
                zzenVar2.zzJ(zzanpVar.zza, iZzc2);
                this.zzb.zzb(this.zzl, zzenVar2);
            }
            if (i12 == 178) {
                if (zzenVar.zzN()[iZza + 2] == 1) {
                    zzanpVar.zzc(178);
                }
                i12 = 178;
            }
            int i18 = iZzd - iZza;
            this.zzg.zzb(this.zzh - i18, i18, this.zzk);
            this.zzg.zzc(i12, this.zzl);
            iZzc = i11;
            i10 = 3;
        }
        if (!this.zzk) {
            this.zze.zza(bArrZzN, iZzc, iZzd);
        }
        this.zzg.zza(bArrZzN, iZzc, iZzd);
        this.zzf.zza(bArrZzN, iZzc, iZzd);
    }

    @Override // com.google.android.gms.internal.ads.zzamx
    public final void zzb(zzadw zzadwVar, zzaol zzaolVar) {
        zzaolVar.zzc();
        this.zzi = zzaolVar.zzb();
        zzaez zzaezVarZzw = zzadwVar.zzw(zzaolVar.zza(), 2);
        this.zzj = zzaezVarZzw;
        this.zzg = new zzanb(zzaezVarZzw);
        this.zzb.zzc(zzadwVar, zzaolVar);
    }

    @Override // com.google.android.gms.internal.ads.zzamx
    public final void zzc(boolean z10) {
        zzdd.zzb(this.zzg);
        if (z10) {
            this.zzg.zzb(this.zzh, 0, this.zzk);
            this.zzg.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamx
    public final void zzd(long j4, int i) {
        this.zzl = j4;
    }

    @Override // com.google.android.gms.internal.ads.zzamx
    public final void zze() {
        zzfv.zzi(this.zzd);
        this.zze.zzb();
        zzanb zzanbVar = this.zzg;
        if (zzanbVar != null) {
            zzanbVar.zzd();
        }
        this.zzf.zzb();
        this.zzh = 0L;
        this.zzl = -9223372036854775807L;
    }
}
