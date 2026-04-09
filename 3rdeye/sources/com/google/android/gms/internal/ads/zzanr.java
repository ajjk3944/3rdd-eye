package com.google.android.gms.internal.ads;

import N7.H7;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzanr implements zzaom {
    private final zzamx zza;
    private final zzem zzb = new zzem(new byte[10], 10);
    private int zzc = 0;
    private int zzd;
    private zzeu zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private int zzi;
    private int zzj;
    private boolean zzk;

    public zzanr(zzamx zzamxVar) {
        this.zza = zzamxVar;
    }

    private final void zze(int i) {
        this.zzc = i;
        this.zzd = 0;
    }

    private final boolean zzf(zzen zzenVar, byte[] bArr, int i) {
        int iMin = Math.min(zzenVar.zza(), i - this.zzd);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            zzenVar.zzM(iMin);
        } else {
            zzenVar.zzH(bArr, this.zzd, iMin);
        }
        int i10 = this.zzd + iMin;
        this.zzd = i10;
        return i10 == i;
    }

    @Override // com.google.android.gms.internal.ads.zzaom
    public final void zza(zzen zzenVar, int i) throws zzaz {
        int i10;
        int i11;
        int i12;
        long jZzb;
        long j4;
        zzdd.zzb(this.zze);
        int i13 = -1;
        int i14 = 2;
        if ((i & 1) != 0) {
            int i15 = this.zzc;
            if (i15 != 0 && i15 != 1) {
                if (i15 != 2) {
                    int i16 = this.zzj;
                    if (i16 != -1) {
                        zzea.zzf("PesReader", "Unexpected start indicator: expected " + i16 + " more bytes");
                    }
                    this.zza.zzc(zzenVar.zzd() == 0);
                } else {
                    zzea.zzf("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            zze(1);
        }
        int i17 = i;
        while (zzenVar.zza() > 0) {
            int i18 = this.zzc;
            if (i18 == 0) {
                i10 = i14;
                i11 = i13;
                zzenVar.zzM(zzenVar.zza());
            } else if (i18 != 1) {
                if (i18 != i14) {
                    int iZza = zzenVar.zza();
                    int i19 = this.zzj;
                    int i20 = i19 == i13 ? 0 : iZza - i19;
                    if (i20 > 0) {
                        iZza -= i20;
                        zzenVar.zzK(zzenVar.zzc() + iZza);
                    }
                    zzamx zzamxVar = this.zza;
                    zzamxVar.zza(zzenVar);
                    int i21 = this.zzj;
                    if (i21 != i13) {
                        int i22 = i21 - iZza;
                        this.zzj = i22;
                        if (i22 == 0) {
                            zzamxVar.zzc(false);
                            zze(1);
                        }
                    }
                } else {
                    int iMin = Math.min(10, this.zzi);
                    zzem zzemVar = this.zzb;
                    if (zzf(zzenVar, zzemVar.zza, iMin) && zzf(zzenVar, null, this.zzi)) {
                        zzemVar.zzl(0);
                        if (this.zzf) {
                            zzemVar.zzn(4);
                            long jZzd = zzemVar.zzd(3);
                            zzemVar.zzn(1);
                            int iZzd = zzemVar.zzd(15) << 15;
                            zzemVar.zzn(1);
                            long jZzd2 = zzemVar.zzd(15);
                            zzemVar.zzn(1);
                            if (this.zzh || !this.zzg) {
                                j4 = jZzd;
                            } else {
                                zzemVar.zzn(4);
                                j4 = jZzd;
                                zzemVar.zzn(1);
                                int iZzd2 = zzemVar.zzd(15) << 15;
                                zzemVar.zzn(1);
                                long jZzd3 = zzemVar.zzd(15);
                                zzemVar.zzn(1);
                                this.zze.zzb(jZzd3 | (zzemVar.zzd(3) << 30) | iZzd2);
                                this.zzh = true;
                            }
                            jZzb = this.zze.zzb(jZzd2 | (j4 << 30) | iZzd);
                        } else {
                            jZzb = -9223372036854775807L;
                        }
                        i17 |= true != this.zzk ? 0 : 4;
                        this.zza.zzd(jZzb, i17);
                        zze(3);
                        i13 = -1;
                        i14 = 2;
                    }
                }
                i10 = i14;
                i11 = i13;
            } else {
                zzem zzemVar2 = this.zzb;
                if (zzf(zzenVar, zzemVar2.zza, 9)) {
                    zzemVar2.zzl(0);
                    int iZzd3 = zzemVar2.zzd(24);
                    if (iZzd3 != 1) {
                        H7.r(iZzd3, "Unexpected start code prefix: ", "PesReader");
                        this.zzj = -1;
                        i11 = -1;
                        i12 = 0;
                        i10 = 2;
                    } else {
                        zzemVar2.zzn(8);
                        int iZzd4 = zzemVar2.zzd(16);
                        zzemVar2.zzn(5);
                        this.zzk = zzemVar2.zzp();
                        i10 = 2;
                        zzemVar2.zzn(2);
                        this.zzf = zzemVar2.zzp();
                        this.zzg = zzemVar2.zzp();
                        zzemVar2.zzn(6);
                        int iZzd5 = zzemVar2.zzd(8);
                        this.zzi = iZzd5;
                        i11 = -1;
                        if (iZzd4 == 0) {
                            this.zzj = -1;
                        } else {
                            int i23 = (iZzd4 - 3) - iZzd5;
                            this.zzj = i23;
                            if (i23 < 0) {
                                H7.r(i23, "Found negative packet payload size: ", "PesReader");
                                this.zzj = -1;
                            }
                        }
                        i12 = 2;
                    }
                    zze(i12);
                } else {
                    i11 = -1;
                    i10 = 2;
                }
            }
            i13 = i11;
            i14 = i10;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaom
    public final void zzb(zzeu zzeuVar, zzadw zzadwVar, zzaol zzaolVar) {
        this.zze = zzeuVar;
        this.zza.zzb(zzadwVar, zzaolVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaom
    public final void zzc() {
        this.zzc = 0;
        this.zzd = 0;
        this.zzh = false;
        this.zza.zze();
    }

    public final boolean zzd(boolean z10) {
        return this.zzc == 3 && this.zzj == -1;
    }
}
