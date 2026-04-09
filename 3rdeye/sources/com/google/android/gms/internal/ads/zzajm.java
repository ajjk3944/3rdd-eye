package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzajm {
    private static final int[] zza = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static zzaew zza(zzadu zzaduVar) throws IOException {
        return zzc(zzaduVar, true, false);
    }

    public static zzaew zzb(zzadu zzaduVar, boolean z10) throws IOException {
        return zzc(zzaduVar, false, z10);
    }

    private static zzaew zzc(zzadu zzaduVar, boolean z10, boolean z11) throws IOException {
        zzaew zzaewVar;
        long j4;
        zzen zzenVar;
        int i;
        int i10;
        int[] iArr;
        long jZzd = zzaduVar.zzd();
        long j10 = -1;
        long j11 = 4096;
        if (jZzd != -1 && jZzd <= 4096) {
            j11 = jZzd;
        }
        zzen zzenVar2 = new zzen(64);
        int i11 = (int) j11;
        int i12 = 0;
        int i13 = 0;
        boolean z12 = false;
        while (i13 < i11) {
            zzenVar2.zzI(8);
            boolean z13 = true;
            if (!zzaduVar.zzm(zzenVar2.zzN(), i12, 8, true)) {
                break;
            }
            long jZzu = zzenVar2.zzu();
            int iZzg = zzenVar2.zzg();
            if (jZzu == 1) {
                j4 = j10;
                zzaduVar.zzh(zzenVar2.zzN(), 8, 8);
                i = 16;
                zzenVar2.zzK(16);
                jZzu = zzenVar2.zzt();
                zzenVar = zzenVar2;
            } else {
                j4 = j10;
                if (jZzu == 0) {
                    long jZzd2 = zzaduVar.zzd();
                    if (jZzd2 != j4) {
                        jZzu = (jZzd2 - zzaduVar.zze()) + 8;
                    }
                }
                zzenVar = zzenVar2;
                i = 8;
            }
            long j12 = jZzu;
            zzaewVar = null;
            long j13 = i;
            if (j12 < j13) {
                return new zzaii(iZzg, j12, i);
            }
            i13 += i;
            if (iZzg == 1836019574) {
                i11 += (int) j12;
                if (jZzd != -1 && i11 > jZzd) {
                    i11 = (int) jZzd;
                }
                zzenVar2 = zzenVar;
                j10 = j4;
                i12 = 0;
            } else {
                if (iZzg == 1836019558 || iZzg == 1836475768) {
                    i12 = 1;
                    break;
                }
                z12 |= !(iZzg != 1835295092);
                long j14 = jZzd;
                if ((i13 + j12) - j13 >= i11) {
                    i12 = 0;
                    break;
                }
                int i14 = (int) (j12 - j13);
                i13 += i14;
                if (iZzg != 1718909296) {
                    i10 = 0;
                    if (i14 != 0) {
                        zzaduVar.zzg(i14);
                    }
                } else {
                    if (i14 < 8) {
                        return new zzaii(1718909296, i14, 8);
                    }
                    zzenVar.zzI(i14);
                    i10 = 0;
                    zzaduVar.zzh(zzenVar.zzN(), 0, i14);
                    int iZzg2 = zzenVar.zzg();
                    boolean zZzd = zzd(iZzg2, z11) | z12;
                    zzenVar.zzM(4);
                    int iZza = zzenVar.zza() / 4;
                    if (!zZzd && iZza > 0) {
                        iArr = new int[iZza];
                        int i15 = 0;
                        while (true) {
                            if (i15 >= iZza) {
                                z13 = zZzd;
                                break;
                            }
                            int iZzg3 = zzenVar.zzg();
                            iArr[i15] = iZzg3;
                            if (zzd(iZzg3, z11)) {
                                break;
                            }
                            i15++;
                        }
                    } else {
                        z13 = zZzd;
                        iArr = null;
                    }
                    if (!z13) {
                        return new zzajr(iZzg2, iArr);
                    }
                    z12 = z13;
                }
                i12 = i10;
                zzenVar2 = zzenVar;
                j10 = j4;
                jZzd = j14;
            }
        }
        zzaewVar = null;
        return !z12 ? zzaji.zza : z10 != i12 ? i12 != 0 ? zzajc.zza : zzajc.zzb : zzaewVar;
    }

    private static boolean zzd(int i, boolean z10) {
        if ((i >>> 8) == 3368816) {
            return true;
        }
        if (i == 1751476579) {
            if (z10) {
                return true;
            }
            i = 1751476579;
        }
        int[] iArr = zza;
        for (int i10 = 0; i10 < 29; i10++) {
            if (iArr[i10] == i) {
                return true;
            }
        }
        return false;
    }
}
