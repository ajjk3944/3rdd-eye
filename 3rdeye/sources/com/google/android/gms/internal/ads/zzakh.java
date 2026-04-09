package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.KotlinVersion;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzakh extends zzakf {
    private zzakg zza;
    private int zzb;
    private boolean zzc;
    private zzafe zzd;
    private zzafc zze;

    @Override // com.google.android.gms.internal.ads.zzakf
    public final long zza(zzen zzenVar) {
        if ((zzenVar.zzN()[0] & 1) == 1) {
            return -1L;
        }
        byte b10 = zzenVar.zzN()[0];
        zzakg zzakgVar = this.zza;
        zzdd.zzb(zzakgVar);
        int i = !zzakgVar.zzd[(b10 >> 1) & (KotlinVersion.MAX_COMPONENT_VALUE >>> (8 - zzakgVar.zze))].zza ? zzakgVar.zza.zze : zzakgVar.zza.zzf;
        int i10 = this.zzc ? (this.zzb + i) / 4 : 0;
        if (zzenVar.zzb() < zzenVar.zzd() + 4) {
            byte[] bArrCopyOf = Arrays.copyOf(zzenVar.zzN(), zzenVar.zzd() + 4);
            zzenVar.zzJ(bArrCopyOf, bArrCopyOf.length);
        } else {
            zzenVar.zzK(zzenVar.zzd() + 4);
        }
        long j4 = i10;
        byte[] bArrZzN = zzenVar.zzN();
        bArrZzN[zzenVar.zzd() - 4] = (byte) (j4 & 255);
        bArrZzN[zzenVar.zzd() - 3] = (byte) ((j4 >>> 8) & 255);
        bArrZzN[zzenVar.zzd() - 2] = (byte) ((j4 >>> 16) & 255);
        bArrZzN[zzenVar.zzd() - 1] = (byte) ((j4 >>> 24) & 255);
        this.zzc = true;
        this.zzb = i;
        return j4;
    }

    @Override // com.google.android.gms.internal.ads.zzakf
    public final void zzb(boolean z10) {
        super.zzb(z10);
        if (z10) {
            this.zza = null;
            this.zzd = null;
            this.zze = null;
        }
        this.zzb = 0;
        this.zzc = false;
    }

    @Override // com.google.android.gms.internal.ads.zzakf
    public final boolean zzc(zzen zzenVar, long j4, zzakc zzakcVar) throws IOException {
        zzakg zzakgVar;
        int i;
        int iZzb;
        int i10;
        int[] iArr;
        int i11;
        long jFloor;
        if (this.zza != null) {
            zzakcVar.zza.getClass();
            return false;
        }
        zzafe zzafeVar = this.zzd;
        int i12 = 1;
        if (zzafeVar == null) {
            zzaff.zzd(1, zzenVar, false);
            int iZzj = zzenVar.zzj();
            int iZzm = zzenVar.zzm();
            int iZzj2 = zzenVar.zzj();
            int iZzi = zzenVar.zzi();
            int i13 = iZzi <= 0 ? -1 : iZzi;
            int iZzi2 = zzenVar.zzi();
            int i14 = iZzi2 <= 0 ? -1 : iZzi2;
            int iZzi3 = zzenVar.zzi();
            int i15 = iZzi3 <= 0 ? -1 : iZzi3;
            int iZzm2 = zzenVar.zzm();
            this.zzd = new zzafe(iZzj, iZzm, iZzj2, i13, i14, i15, (int) Math.pow(2.0d, iZzm2 & 15), (int) Math.pow(2.0d, (iZzm2 & 240) >> 4), 1 == (zzenVar.zzm() & 1), Arrays.copyOf(zzenVar.zzN(), zzenVar.zzd()));
        } else {
            int i16 = 4;
            zzafc zzafcVar = this.zze;
            if (zzafcVar == null) {
                this.zze = zzaff.zzc(zzenVar, true, true);
            } else {
                byte[] bArr = new byte[zzenVar.zzd()];
                System.arraycopy(zzenVar.zzN(), 0, bArr, 0, zzenVar.zzd());
                int i17 = zzafeVar.zza;
                int i18 = 5;
                zzaff.zzd(5, zzenVar, false);
                int iZzm3 = zzenVar.zzm() + 1;
                zzafb zzafbVar = new zzafb(zzenVar.zzN());
                zzafbVar.zzc(zzenVar.zzc() * 8);
                int i19 = 0;
                while (true) {
                    int i20 = 2;
                    int i21 = 16;
                    if (i19 >= iZzm3) {
                        int i22 = i12;
                        int i23 = 6;
                        int iZzb2 = zzafbVar.zzb(6) + i22;
                        for (int i24 = 0; i24 < iZzb2; i24++) {
                            if (zzafbVar.zzb(16) != 0) {
                                throw zzaz.zza("placeholder of time domain transforms not zeroed out", null);
                            }
                        }
                        int iZzb3 = zzafbVar.zzb(6) + i22;
                        int i25 = 0;
                        while (true) {
                            int i26 = 3;
                            if (i25 < iZzb3) {
                                int iZzb4 = zzafbVar.zzb(i21);
                                if (iZzb4 == 0) {
                                    int i27 = 8;
                                    zzafbVar.zzc(8);
                                    zzafbVar.zzc(16);
                                    zzafbVar.zzc(16);
                                    zzafbVar.zzc(6);
                                    zzafbVar.zzc(8);
                                    int iZzb5 = zzafbVar.zzb(4) + 1;
                                    int i28 = 0;
                                    while (i28 < iZzb5) {
                                        zzafbVar.zzc(i27);
                                        i28++;
                                        i27 = 8;
                                    }
                                } else {
                                    if (iZzb4 != i22) {
                                        throw zzaz.zza("floor type greater than 1 not decodable: " + iZzb4, null);
                                    }
                                    int iZzb6 = zzafbVar.zzb(5);
                                    int[] iArr2 = new int[iZzb6];
                                    int i29 = -1;
                                    for (int i30 = 0; i30 < iZzb6; i30++) {
                                        int iZzb7 = zzafbVar.zzb(4);
                                        iArr2[i30] = iZzb7;
                                        if (iZzb7 > i29) {
                                            i29 = iZzb7;
                                        }
                                    }
                                    int i31 = i29 + 1;
                                    int[] iArr3 = new int[i31];
                                    int i32 = 0;
                                    while (i32 < i31) {
                                        int i33 = 1;
                                        iArr3[i32] = zzafbVar.zzb(i26) + 1;
                                        int iZzb8 = zzafbVar.zzb(2);
                                        if (iZzb8 > 0) {
                                            i10 = 8;
                                            zzafbVar.zzc(8);
                                        } else {
                                            i10 = 8;
                                        }
                                        int i34 = i31;
                                        int i35 = 0;
                                        while (true) {
                                            int i36 = i33 << iZzb8;
                                            iArr = iArr2;
                                            if (i35 < i36) {
                                                zzafbVar.zzc(i10);
                                                i35++;
                                                iArr2 = iArr;
                                                i10 = 8;
                                                i33 = 1;
                                            }
                                        }
                                        i32++;
                                        iArr2 = iArr;
                                        i31 = i34;
                                        i26 = 3;
                                    }
                                    int[] iArr4 = iArr2;
                                    zzafbVar.zzc(2);
                                    int iZzb9 = zzafbVar.zzb(4);
                                    int i37 = 0;
                                    int i38 = 0;
                                    for (int i39 = 0; i39 < iZzb6; i39++) {
                                        i37 += iArr3[iArr4[i39]];
                                        while (i38 < i37) {
                                            zzafbVar.zzc(iZzb9);
                                            i38++;
                                        }
                                    }
                                }
                                i25++;
                                i23 = 6;
                                i21 = 16;
                                i22 = 1;
                            } else {
                                int i40 = 1;
                                int iZzb10 = zzafbVar.zzb(i23) + 1;
                                int i41 = 0;
                                while (i41 < iZzb10) {
                                    if (zzafbVar.zzb(16) > 2) {
                                        throw zzaz.zza("residueType greater than 2 is not decodable", null);
                                    }
                                    zzafbVar.zzc(24);
                                    zzafbVar.zzc(24);
                                    zzafbVar.zzc(24);
                                    int iZzb11 = zzafbVar.zzb(i23) + i40;
                                    int i42 = 8;
                                    zzafbVar.zzc(8);
                                    int[] iArr5 = new int[iZzb11];
                                    for (int i43 = 0; i43 < iZzb11; i43++) {
                                        iArr5[i43] = ((zzafbVar.zzd() ? zzafbVar.zzb(5) : 0) * 8) + zzafbVar.zzb(3);
                                    }
                                    int i44 = 0;
                                    while (i44 < iZzb11) {
                                        int i45 = 0;
                                        while (i45 < i42) {
                                            if ((iArr5[i44] & (1 << i45)) != 0) {
                                                zzafbVar.zzc(i42);
                                            }
                                            i45++;
                                            i42 = 8;
                                        }
                                        i44++;
                                        i42 = 8;
                                    }
                                    i41++;
                                    i23 = 6;
                                    i40 = 1;
                                }
                                int iZzb12 = zzafbVar.zzb(i23) + 1;
                                for (int i46 = 0; i46 < iZzb12; i46++) {
                                    int iZzb13 = zzafbVar.zzb(16);
                                    if (iZzb13 != 0) {
                                        zzea.zzc("VorbisUtil", "mapping type other than 0 not supported: " + iZzb13);
                                    } else {
                                        if (zzafbVar.zzd()) {
                                            i = 1;
                                            iZzb = zzafbVar.zzb(4) + 1;
                                        } else {
                                            i = 1;
                                            iZzb = 1;
                                        }
                                        if (zzafbVar.zzd()) {
                                            int iZzb14 = zzafbVar.zzb(8) + i;
                                            for (int i47 = 0; i47 < iZzb14; i47++) {
                                                int i48 = i17 - 1;
                                                zzafbVar.zzc(zzaff.zza(i48));
                                                zzafbVar.zzc(zzaff.zza(i48));
                                            }
                                        }
                                        if (zzafbVar.zzb(2) != 0) {
                                            throw zzaz.zza("to reserved bits must be zero after mapping coupling steps", null);
                                        }
                                        if (iZzb > 1) {
                                            for (int i49 = 0; i49 < i17; i49++) {
                                                zzafbVar.zzc(4);
                                            }
                                        }
                                        for (int i50 = 0; i50 < iZzb; i50++) {
                                            zzafbVar.zzc(8);
                                            zzafbVar.zzc(8);
                                            zzafbVar.zzc(8);
                                        }
                                    }
                                }
                                int iZzb15 = zzafbVar.zzb(6);
                                int i51 = iZzb15 + 1;
                                zzafd[] zzafdVarArr = new zzafd[i51];
                                for (int i52 = 0; i52 < i51; i52++) {
                                    zzafdVarArr[i52] = new zzafd(zzafbVar.zzd(), zzafbVar.zzb(16), zzafbVar.zzb(16), zzafbVar.zzb(8));
                                }
                                if (!zzafbVar.zzd()) {
                                    throw zzaz.zza("framing bit after modes not set as expected", null);
                                }
                                zzakgVar = new zzakg(zzafeVar, zzafcVar, bArr, zzafdVarArr, zzaff.zza(iZzb15));
                            }
                        }
                    } else {
                        if (zzafbVar.zzb(24) != 5653314) {
                            throw zzaz.zza("expected code book to start with [0x56, 0x43, 0x42] at " + zzafbVar.zza(), null);
                        }
                        int iZzb16 = zzafbVar.zzb(16);
                        int iZzb17 = zzafbVar.zzb(24);
                        if (zzafbVar.zzd()) {
                            zzafbVar.zzc(i18);
                            for (int iZzb18 = 0; iZzb18 < iZzb17; iZzb18 += zzafbVar.zzb(zzaff.zza(iZzb17 - iZzb18))) {
                            }
                        } else {
                            boolean zZzd = zzafbVar.zzd();
                            for (int i53 = 0; i53 < iZzb17; i53++) {
                                if (!zZzd) {
                                    zzafbVar.zzc(i18);
                                } else if (zzafbVar.zzd()) {
                                    zzafbVar.zzc(i18);
                                }
                            }
                        }
                        int i54 = i16;
                        int iZzb19 = zzafbVar.zzb(i54);
                        if (iZzb19 > 2) {
                            throw zzaz.zza("lookup type greater than 2 not decodable: " + iZzb19, null);
                        }
                        if (iZzb19 != i12) {
                            if (iZzb19 != 2) {
                                i11 = i12;
                            }
                            i19++;
                            i12 = i11;
                            i16 = 4;
                            i18 = 5;
                        } else {
                            i20 = iZzb19;
                        }
                        zzafbVar.zzc(32);
                        zzafbVar.zzc(32);
                        int iZzb20 = zzafbVar.zzb(i54) + i12;
                        zzafbVar.zzc(i12);
                        if (i20 != i12) {
                            i11 = i12;
                            jFloor = iZzb16 * iZzb17;
                        } else if (iZzb16 != 0) {
                            i11 = i12;
                            jFloor = (long) Math.floor(Math.pow(iZzb17, 1.0d / iZzb16));
                        } else {
                            i11 = i12;
                            jFloor = 0;
                        }
                        zzafbVar.zzc((int) (jFloor * iZzb20));
                        i19++;
                        i12 = i11;
                        i16 = 4;
                        i18 = 5;
                    }
                }
            }
        }
        zzakgVar = null;
        this.zza = zzakgVar;
        if (zzakgVar == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        zzafe zzafeVar2 = zzakgVar.zza;
        arrayList.add(zzafeVar2.zzg);
        arrayList.add(zzakgVar.zzc);
        zzav zzavVarZzb = zzaff.zzb(zzfyf.zzm(zzakgVar.zzb.zza));
        zzx zzxVar = new zzx();
        zzxVar.zzG("audio/ogg");
        zzxVar.zzah("audio/vorbis");
        zzxVar.zzC(zzafeVar2.zzd);
        zzxVar.zzac(zzafeVar2.zzc);
        zzxVar.zzD(zzafeVar2.zza);
        zzxVar.zzai(zzafeVar2.zzb);
        zzxVar.zzT(arrayList);
        zzxVar.zzaa(zzavVarZzb);
        zzakcVar.zza = zzxVar.zzan();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzakf
    public final void zzi(long j4) {
        super.zzi(j4);
        this.zzc = j4 != 0;
        zzafe zzafeVar = this.zzd;
        this.zzb = zzafeVar != null ? zzafeVar.zze : 0;
    }
}
