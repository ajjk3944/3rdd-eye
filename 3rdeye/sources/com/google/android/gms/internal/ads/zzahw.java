package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import io.appmetrica.analytics.impl.Oo;
import java.io.IOException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import kotlin.KotlinVersion;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzahw implements zzadt {
    private static final byte[] zza = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    private static final byte[] zzb;
    private static final byte[] zzc;
    private static final byte[] zzd;
    private static final UUID zze;
    private static final Map zzf;
    private long zzA;
    private boolean zzB;
    private zzahu zzC;
    private boolean zzD;
    private int zzE;
    private long zzF;
    private boolean zzG;
    private long zzH;
    private long zzI;
    private long zzJ;
    private zzeb zzK;
    private zzeb zzL;
    private boolean zzM;
    private boolean zzN;
    private int zzO;
    private long zzP;
    private long zzQ;
    private int zzR;
    private int zzS;
    private int[] zzT;
    private int zzU;
    private int zzV;
    private int zzW;
    private int zzX;
    private boolean zzY;
    private long zzZ;
    private int zzaa;
    private int zzab;
    private int zzac;
    private boolean zzad;
    private boolean zzae;
    private boolean zzaf;
    private int zzag;
    private byte zzah;
    private boolean zzai;
    private zzadw zzaj;
    private final zzahr zzak;
    private final zzahy zzg;
    private final SparseArray zzh;
    private final boolean zzi;
    private final boolean zzj;
    private final zzakp zzk;
    private final zzen zzl;
    private final zzen zzm;
    private final zzen zzn;
    private final zzen zzo;
    private final zzen zzp;
    private final zzen zzq;
    private final zzen zzr;
    private final zzen zzs;
    private final zzen zzt;
    private final zzen zzu;
    private ByteBuffer zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    static {
        String str = zzex.zza;
        zzb = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        zzc = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        zzd = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        zze = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        Oo.i(0, map, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        Oo.i(180, map, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        zzf = Collections.unmodifiableMap(map);
    }

    @Deprecated
    public zzahw() {
        this(new zzahr(), 2, zzakp.zza);
    }

    private final int zzp(zzadu zzaduVar, zzahu zzahuVar, int i, boolean z10) throws IOException {
        int i10;
        if ("S_TEXT/UTF8".equals(zzahuVar.zzc)) {
            zzx(zzaduVar, zza, i);
            int i11 = this.zzab;
            zzw();
            return i11;
        }
        if ("S_TEXT/ASS".equals(zzahuVar.zzc) || "S_TEXT/SSA".equals(zzahuVar.zzc)) {
            zzx(zzaduVar, zzc, i);
            int i12 = this.zzab;
            zzw();
            return i12;
        }
        if ("S_TEXT/WEBVTT".equals(zzahuVar.zzc)) {
            zzx(zzaduVar, zzd, i);
            int i13 = this.zzab;
            zzw();
            return i13;
        }
        zzaez zzaezVar = zzahuVar.zzX;
        if (!this.zzad) {
            if (zzahuVar.zzh) {
                this.zzW &= -1073741825;
                if (!this.zzae) {
                    zzen zzenVar = this.zzn;
                    zzaduVar.zzi(zzenVar.zzN(), 0, 1);
                    this.zzaa++;
                    if ((zzenVar.zzN()[0] & 128) == 128) {
                        throw zzaz.zza("Extension bit is set in signal byte", null);
                    }
                    this.zzah = zzenVar.zzN()[0];
                    this.zzae = true;
                }
                byte b10 = this.zzah;
                if ((b10 & 1) == 1) {
                    int i14 = b10 & 2;
                    this.zzW |= 1073741824;
                    if (!this.zzai) {
                        zzen zzenVar2 = this.zzs;
                        zzaduVar.zzi(zzenVar2.zzN(), 0, 8);
                        this.zzaa += 8;
                        this.zzai = true;
                        zzen zzenVar3 = this.zzn;
                        zzenVar3.zzN()[0] = (byte) ((i14 != 2 ? 0 : 128) | 8);
                        zzenVar3.zzL(0);
                        zzaezVar.zzs(zzenVar3, 1, 1);
                        this.zzab++;
                        zzenVar2.zzL(0);
                        zzaezVar.zzs(zzenVar2, 8, 1);
                        this.zzab += 8;
                    }
                    if (i14 == 2) {
                        if (!this.zzaf) {
                            zzen zzenVar4 = this.zzn;
                            zzaduVar.zzi(zzenVar4.zzN(), 0, 1);
                            this.zzaa++;
                            zzenVar4.zzL(0);
                            this.zzag = zzenVar4.zzm();
                            this.zzaf = true;
                        }
                        int i15 = this.zzag * 4;
                        zzen zzenVar5 = this.zzn;
                        zzenVar5.zzI(i15);
                        zzaduVar.zzi(zzenVar5.zzN(), 0, i15);
                        this.zzaa += i15;
                        int i16 = (this.zzag >> 1) + 1;
                        int i17 = (i16 * 6) + 2;
                        ByteBuffer byteBuffer = this.zzv;
                        if (byteBuffer == null || byteBuffer.capacity() < i17) {
                            this.zzv = ByteBuffer.allocate(i17);
                        }
                        this.zzv.position(0);
                        this.zzv.putShort((short) i16);
                        int i18 = 0;
                        int i19 = 0;
                        while (true) {
                            i10 = this.zzag;
                            if (i18 >= i10) {
                                break;
                            }
                            int iZzp = zzenVar5.zzp();
                            int i20 = iZzp - i19;
                            if (i18 % 2 == 0) {
                                this.zzv.putShort((short) i20);
                            } else {
                                this.zzv.putInt(i20);
                            }
                            i18++;
                            i19 = iZzp;
                        }
                        int i21 = (i - this.zzaa) - i19;
                        if ((i10 & 1) == 1) {
                            this.zzv.putInt(i21);
                        } else {
                            this.zzv.putShort((short) i21);
                            this.zzv.putInt(0);
                        }
                        zzen zzenVar6 = this.zzt;
                        zzenVar6.zzJ(this.zzv.array(), i17);
                        zzaezVar.zzs(zzenVar6, i17, 1);
                        this.zzab += i17;
                    }
                }
            } else {
                byte[] bArr = zzahuVar.zzi;
                if (bArr != null) {
                    this.zzq.zzJ(bArr, bArr.length);
                }
            }
            if (!"A_OPUS".equals(zzahuVar.zzc) ? zzahuVar.zzg > 0 : z10) {
                this.zzW |= 268435456;
                this.zzu.zzI(0);
                int iZzd = (this.zzq.zzd() + i) - this.zzaa;
                zzen zzenVar7 = this.zzn;
                zzenVar7.zzI(4);
                zzenVar7.zzN()[0] = (byte) ((iZzd >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
                zzenVar7.zzN()[1] = (byte) ((iZzd >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
                zzenVar7.zzN()[2] = (byte) ((iZzd >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                zzenVar7.zzN()[3] = (byte) (iZzd & KotlinVersion.MAX_COMPONENT_VALUE);
                zzaezVar.zzs(zzenVar7, 4, 2);
                this.zzab += 4;
            }
            this.zzad = true;
        }
        zzen zzenVar8 = this.zzq;
        int iZzd2 = zzenVar8.zzd() + i;
        if (!"V_MPEG4/ISO/AVC".equals(zzahuVar.zzc) && !"V_MPEGH/ISO/HEVC".equals(zzahuVar.zzc)) {
            if (zzahuVar.zzU != null) {
                zzdd.zzf(zzenVar8.zzd() == 0);
                zzahuVar.zzU.zzd(zzaduVar);
            }
            while (true) {
                int i22 = this.zzaa;
                if (i22 >= iZzd2) {
                    break;
                }
                int iZzq = zzq(zzaduVar, zzaezVar, iZzd2 - i22);
                this.zzaa += iZzq;
                this.zzab += iZzq;
            }
        } else {
            zzen zzenVar9 = this.zzm;
            byte[] bArrZzN = zzenVar9.zzN();
            bArrZzN[0] = 0;
            bArrZzN[1] = 0;
            bArrZzN[2] = 0;
            int i23 = zzahuVar.zzY;
            int i24 = 4 - i23;
            while (this.zzaa < iZzd2) {
                int i25 = this.zzac;
                if (i25 == 0) {
                    int iMin = Math.min(i23, zzenVar8.zza());
                    zzaduVar.zzi(bArrZzN, i24 + iMin, i23 - iMin);
                    if (iMin > 0) {
                        zzenVar8.zzH(bArrZzN, i24, iMin);
                    }
                    this.zzaa += i23;
                    zzenVar9.zzL(0);
                    this.zzac = zzenVar9.zzp();
                    zzen zzenVar10 = this.zzl;
                    zzenVar10.zzL(0);
                    zzaezVar.zzr(zzenVar10, 4);
                    this.zzab += 4;
                } else {
                    int iZzq2 = zzq(zzaduVar, zzaezVar, i25);
                    this.zzaa += iZzq2;
                    this.zzab += iZzq2;
                    this.zzac -= iZzq2;
                }
            }
        }
        if ("A_VORBIS".equals(zzahuVar.zzc)) {
            zzen zzenVar11 = this.zzo;
            zzenVar11.zzL(0);
            zzaezVar.zzr(zzenVar11, 4);
            this.zzab += 4;
        }
        int i26 = this.zzab;
        zzw();
        return i26;
    }

    private final int zzq(zzadu zzaduVar, zzaez zzaezVar, int i) throws IOException {
        zzen zzenVar = this.zzq;
        int iZza = zzenVar.zza();
        if (iZza <= 0) {
            return zzaezVar.zzf(zzaduVar, i, false);
        }
        int iMin = Math.min(i, iZza);
        zzaezVar.zzr(zzenVar, iMin);
        return iMin;
    }

    private final long zzr(long j4) throws zzaz {
        long j10 = this.zzy;
        if (j10 != -9223372036854775807L) {
            return zzex.zzu(j4, j10, 1000L, RoundingMode.DOWN);
        }
        throw zzaz.zza("Can't scale timecode prior to timecodeScale being set.", null);
    }

    private final void zzs(int i) throws zzaz {
        if (this.zzK == null || this.zzL == null) {
            throw zzaz.zza("Element " + i + " must be in a Cues", null);
        }
    }

    private final void zzt(int i) throws zzaz {
        if (this.zzC != null) {
            return;
        }
        throw zzaz.zza("Element " + i + " must be in a TrackEntry", null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzu(com.google.android.gms.internal.ads.zzahu r18, long r19, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahw.zzu(com.google.android.gms.internal.ads.zzahu, long, int, int, int):void");
    }

    private final void zzv(zzadu zzaduVar, int i) throws IOException {
        zzen zzenVar = this.zzn;
        if (zzenVar.zzd() >= i) {
            return;
        }
        if (zzenVar.zzb() < i) {
            int iZzb = zzenVar.zzb();
            zzenVar.zzF(Math.max(iZzb + iZzb, i));
        }
        zzaduVar.zzi(zzenVar.zzN(), zzenVar.zzd(), i - zzenVar.zzd());
        zzenVar.zzK(i);
    }

    private final void zzw() {
        this.zzaa = 0;
        this.zzab = 0;
        this.zzac = 0;
        this.zzad = false;
        this.zzae = false;
        this.zzaf = false;
        this.zzag = 0;
        this.zzah = (byte) 0;
        this.zzai = false;
        this.zzq.zzI(0);
    }

    private final void zzx(zzadu zzaduVar, byte[] bArr, int i) throws IOException {
        int length = bArr.length;
        int i10 = length + i;
        zzen zzenVar = this.zzr;
        if (zzenVar.zzb() < i10) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i10 + i);
            zzenVar.zzJ(bArrCopyOf, bArrCopyOf.length);
        } else {
            System.arraycopy(bArr, 0, zzenVar.zzN(), 0, length);
        }
        zzaduVar.zzi(zzenVar.zzN(), length, i);
        zzenVar.zzL(0);
        zzenVar.zzK(i10);
    }

    private static byte[] zzy(long j4, String str, long j10) {
        zzdd.zzd(j4 != -9223372036854775807L);
        Locale locale = Locale.US;
        int i = (int) (j4 / 3600000000L);
        Integer numValueOf = Integer.valueOf(i);
        long j11 = j4 - (i * 3600000000L);
        int i10 = (int) (j11 / 60000000);
        Integer numValueOf2 = Integer.valueOf(i10);
        long j12 = j11 - (i10 * 60000000);
        int i11 = (int) (j12 / 1000000);
        String str2 = String.format(locale, str, numValueOf, numValueOf2, Integer.valueOf(i11), Integer.valueOf((int) ((j12 - (i11 * 1000000)) / j10)));
        String str3 = zzex.zza;
        return str2.getBytes(StandardCharsets.UTF_8);
    }

    private static int[] zzz(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        int length = iArr.length;
        return length >= i ? iArr : new int[Math.max(length + length, i)];
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final int zzb(zzadu zzaduVar, zzaep zzaepVar) throws IOException {
        int i = 0;
        this.zzN = false;
        while (!this.zzN) {
            if (this.zzak.zzc(zzaduVar)) {
                long jZzf = zzaduVar.zzf();
                if (this.zzG) {
                    this.zzI = jZzf;
                    zzaepVar.zza = this.zzH;
                    this.zzG = false;
                    return 1;
                }
                if (this.zzD) {
                    long j4 = this.zzI;
                    if (j4 != -1) {
                        zzaepVar.zza = j4;
                        this.zzI = -1L;
                        return 1;
                    }
                }
            } else {
                while (true) {
                    SparseArray sparseArray = this.zzh;
                    if (i >= sparseArray.size()) {
                        return -1;
                    }
                    zzahu zzahuVar = (zzahu) sparseArray.valueAt(i);
                    zzahuVar.zzX.getClass();
                    zzafa zzafaVar = zzahuVar.zzU;
                    if (zzafaVar != null) {
                        zzafaVar.zza(zzahuVar.zzX, zzahuVar.zzj);
                    }
                    i++;
                }
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final /* synthetic */ List zzd() {
        return zzfyf.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final void zze(zzadw zzadwVar) {
        if (this.zzj) {
            zzadwVar = new zzaks(zzadwVar, this.zzk);
        }
        this.zzaj = zzadwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final void zzf(long j4, long j10) {
        this.zzJ = -9223372036854775807L;
        int i = 0;
        this.zzO = 0;
        this.zzak.zzb();
        this.zzg.zze();
        zzw();
        while (true) {
            SparseArray sparseArray = this.zzh;
            if (i >= sparseArray.size()) {
                return;
            }
            zzafa zzafaVar = ((zzahu) sparseArray.valueAt(i)).zzU;
            if (zzafaVar != null) {
                zzafaVar.zzb();
            }
            i++;
        }
    }

    public final void zzh(int i, int i10, zzadu zzaduVar) throws IOException {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        long j4;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20 = i;
        int i21 = 1;
        int i22 = 0;
        if (i20 != 161 && i20 != 163) {
            if (i20 == 165) {
                if (this.zzO != 2) {
                    return;
                }
                zzahu zzahuVar = (zzahu) this.zzh.get(this.zzU);
                if (this.zzX != 4 || !"V_VP9".equals(zzahuVar.zzc)) {
                    zzaduVar.zzk(i10);
                    return;
                }
                zzen zzenVar = this.zzu;
                zzenVar.zzI(i10);
                zzaduVar.zzi(zzenVar.zzN(), 0, i10);
                return;
            }
            if (i20 == 16877) {
                zzt(i);
                zzahu zzahuVar2 = this.zzC;
                if (zzahuVar2.zzZ != 1685485123 && zzahuVar2.zzZ != 1685480259) {
                    zzaduVar.zzk(i10);
                    return;
                }
                byte[] bArr = new byte[i10];
                zzahuVar2.zzO = bArr;
                zzaduVar.zzi(bArr, 0, i10);
                return;
            }
            if (i20 == 16981) {
                zzt(i);
                byte[] bArr2 = new byte[i10];
                this.zzC.zzi = bArr2;
                zzaduVar.zzi(bArr2, 0, i10);
                return;
            }
            if (i20 == 18402) {
                byte[] bArr3 = new byte[i10];
                zzaduVar.zzi(bArr3, 0, i10);
                zzt(i);
                this.zzC.zzj = new zzaey(1, bArr3, 0, 0);
                return;
            }
            if (i20 == 21419) {
                zzen zzenVar2 = this.zzp;
                Arrays.fill(zzenVar2.zzN(), (byte) 0);
                zzaduVar.zzi(zzenVar2.zzN(), 4 - i10, i10);
                zzenVar2.zzL(0);
                this.zzE = (int) zzenVar2.zzu();
                return;
            }
            if (i20 == 25506) {
                zzt(i);
                byte[] bArr4 = new byte[i10];
                this.zzC.zzk = bArr4;
                zzaduVar.zzi(bArr4, 0, i10);
                return;
            }
            if (i20 != 30322) {
                throw zzaz.zza("Unexpected id: " + i20, null);
            }
            zzt(i);
            byte[] bArr5 = new byte[i10];
            this.zzC.zzw = bArr5;
            zzaduVar.zzi(bArr5, 0, i10);
            return;
        }
        int i23 = 8;
        if (this.zzO == 0) {
            zzahy zzahyVar = this.zzg;
            this.zzU = (int) zzahyVar.zzd(zzaduVar, false, true, 8);
            this.zzV = zzahyVar.zza();
            this.zzQ = -9223372036854775807L;
            this.zzO = 1;
            this.zzn.zzI(0);
        }
        zzahu zzahuVar3 = (zzahu) this.zzh.get(this.zzU);
        if (zzahuVar3 == null) {
            zzaduVar.zzk(i10 - this.zzV);
            this.zzO = 0;
            return;
        }
        zzahuVar3.zzX.getClass();
        if (this.zzO == 1) {
            zzv(zzaduVar, 3);
            zzen zzenVar3 = this.zzn;
            int i24 = (zzenVar3.zzN()[2] & 6) >> 1;
            if (i24 == 0) {
                this.zzS = 1;
                int[] iArrZzz = zzz(this.zzT, 1);
                this.zzT = iArrZzz;
                iArrZzz[0] = (i10 - this.zzV) - 3;
            } else {
                zzv(zzaduVar, 4);
                int i25 = (zzenVar3.zzN()[3] & 255) + 1;
                this.zzS = i25;
                int[] iArrZzz2 = zzz(this.zzT, i25);
                this.zzT = iArrZzz2;
                if (i24 == 2) {
                    int i26 = (i10 - this.zzV) - 4;
                    int i27 = this.zzS;
                    Arrays.fill(iArrZzz2, 0, i27, i26 / i27);
                } else {
                    if (i24 != 1) {
                        if (i24 != 3) {
                            throw zzaz.zza("Unexpected lacing value: 2", null);
                        }
                        int i28 = 0;
                        int i29 = 0;
                        int i30 = 4;
                        while (true) {
                            int i31 = this.zzS - 1;
                            if (i28 >= i31) {
                                i11 = i21;
                                i13 = i22;
                                this.zzT[i31] = ((i10 - this.zzV) - i30) - i29;
                                break;
                            }
                            this.zzT[i28] = i22;
                            int i32 = i30 + 1;
                            zzv(zzaduVar, i32);
                            if (zzenVar3.zzN()[i30] == 0) {
                                throw zzaz.zza("No valid varint length mask found", null);
                            }
                            int i33 = i21;
                            int i34 = i22;
                            while (true) {
                                if (i34 >= i23) {
                                    i14 = i22;
                                    i15 = i23;
                                    j4 = 0;
                                    break;
                                }
                                i15 = i23;
                                int i35 = i33 << (7 - i34);
                                if ((zzenVar3.zzN()[i30] & i35) != 0) {
                                    i32 += i34;
                                    zzv(zzaduVar, i32);
                                    i14 = i22;
                                    j4 = zzenVar3.zzN()[i30] & 255 & (~i35);
                                    int i36 = i30 + 1;
                                    while (i36 < i32) {
                                        j4 = (j4 << i15) | (zzenVar3.zzN()[i36] & 255);
                                        i36++;
                                        i34 = i34;
                                    }
                                    int i37 = i34;
                                    if (i28 > 0) {
                                        j4 -= (1 << ((i37 * 7) + 6)) - 1;
                                    }
                                } else {
                                    i34++;
                                    i23 = i15;
                                }
                            }
                            i30 = i32;
                            if (j4 < -2147483648L || j4 > 2147483647L) {
                                break;
                            }
                            int[] iArr = this.zzT;
                            int i38 = (int) j4;
                            if (i28 != 0) {
                                i38 += iArr[i28 - 1];
                            }
                            iArr[i28] = i38;
                            i29 += i38;
                            i28++;
                            i21 = i33;
                            i22 = i14;
                            i23 = i15;
                        }
                        throw zzaz.zza("EBML lacing sample size out of range.", null);
                    }
                    int i39 = 0;
                    int i40 = 0;
                    int i41 = 4;
                    while (true) {
                        i16 = this.zzS - 1;
                        if (i39 >= i16) {
                            break;
                        }
                        this.zzT[i39] = 0;
                        while (true) {
                            i17 = i41 + 1;
                            zzv(zzaduVar, i17);
                            int i42 = zzenVar3.zzN()[i41] & 255;
                            int[] iArr2 = this.zzT;
                            i18 = iArr2[i39] + i42;
                            iArr2[i39] = i18;
                            if (i42 != 255) {
                                break;
                            } else {
                                i41 = i17;
                            }
                        }
                        i40 += i18;
                        i39++;
                        i41 = i17;
                    }
                    this.zzT[i16] = ((i10 - this.zzV) - i41) - i40;
                }
            }
            i11 = 1;
            i13 = 0;
            this.zzP = this.zzJ + zzr((zzenVar3.zzN()[i13] << 8) | (zzenVar3.zzN()[i11] & 255));
            if (zzahuVar3.zze == 2) {
                i19 = i11;
            } else if (i20 == 163) {
                i19 = (zzenVar3.zzN()[2] & 128) == 128 ? i11 : i13;
                i20 = 163;
            } else {
                i19 = i13;
            }
            this.zzW = i19;
            this.zzO = 2;
            this.zzR = i13;
            i12 = 163;
        } else {
            i11 = 1;
            i12 = 163;
        }
        if (i20 == i12) {
            while (true) {
                int i43 = this.zzR;
                if (i43 >= this.zzS) {
                    this.zzO = 0;
                    return;
                }
                int iZzp = zzp(zzaduVar, zzahuVar3, this.zzT[i43], false);
                zzahu zzahuVar4 = zzahuVar3;
                zzu(zzahuVar4, this.zzP + ((this.zzR * zzahuVar3.zzf) / 1000), this.zzW, iZzp, 0);
                this.zzR++;
                zzahuVar3 = zzahuVar4;
            }
        } else {
            while (true) {
                int i44 = this.zzR;
                if (i44 >= this.zzS) {
                    return;
                }
                int[] iArr3 = this.zzT;
                boolean z10 = i11;
                iArr3[i44] = zzp(zzaduVar, zzahuVar3, iArr3[i44], z10);
                this.zzR += z10 ? 1 : 0;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final boolean zzi(zzadu zzaduVar) throws IOException {
        return new zzahx().zza(zzaduVar);
    }

    public final void zzj(int i) throws zzaz {
        int i10;
        zzaes zzaerVar;
        int i11;
        int i12 = 0;
        zzdd.zzb(this.zzaj);
        if (i == 160) {
            if (this.zzO == 2) {
                zzahu zzahuVar = (zzahu) this.zzh.get(this.zzU);
                zzahuVar.zzX.getClass();
                if (this.zzZ > 0 && "A_OPUS".equals(zzahuVar.zzc)) {
                    zzen zzenVar = this.zzu;
                    byte[] bArrArray = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.zzZ).array();
                    zzenVar.zzJ(bArrArray, bArrArray.length);
                }
                int i13 = 0;
                for (int i14 = 0; i14 < this.zzS; i14++) {
                    i13 += this.zzT[i14];
                }
                int i15 = 0;
                while (i15 < this.zzS) {
                    long j4 = this.zzP + ((zzahuVar.zzf * i15) / 1000);
                    int i16 = this.zzW;
                    if (i15 == 0) {
                        if (!this.zzY) {
                            i16 |= 1;
                        }
                        i10 = 0;
                    } else {
                        i10 = i15;
                    }
                    int i17 = this.zzT[i10];
                    int i18 = i13 - i17;
                    zzu(zzahuVar, j4, i16, i17, i18);
                    i15 = i10 + 1;
                    i13 = i18;
                }
                this.zzO = 0;
                return;
            }
            return;
        }
        if (i != 174) {
            if (i == 19899) {
                int i19 = this.zzE;
                if (i19 != -1) {
                    long j10 = this.zzF;
                    if (j10 != -1) {
                        if (i19 == 475249515) {
                            this.zzH = j10;
                            return;
                        }
                        return;
                    }
                }
                throw zzaz.zza("Mandatory element SeekID or SeekPosition not found", null);
            }
            if (i == 25152) {
                zzt(i);
                zzahu zzahuVar2 = this.zzC;
                if (zzahuVar2.zzh) {
                    if (zzahuVar2.zzj == null) {
                        throw zzaz.zza("Encrypted Track found but ContentEncKeyID was not found", null);
                    }
                    zzahuVar2.zzl = new zzs(null, new zzr(zzh.zza, null, "video/webm", this.zzC.zzj.zzb));
                    return;
                }
                return;
            }
            if (i == 28032) {
                zzt(i);
                zzahu zzahuVar3 = this.zzC;
                if (zzahuVar3.zzh && zzahuVar3.zzi != null) {
                    throw zzaz.zza("Combining encryption and compression is not supported", null);
                }
                return;
            }
            if (i == 357149030) {
                if (this.zzy == -9223372036854775807L) {
                    this.zzy = 1000000L;
                }
                long j11 = this.zzz;
                if (j11 != -9223372036854775807L) {
                    this.zzA = zzr(j11);
                    return;
                }
                return;
            }
            if (i == 374648427) {
                if (this.zzh.size() == 0) {
                    throw zzaz.zza("No valid tracks were found", null);
                }
                this.zzaj.zzG();
                return;
            }
            if (i != 475249515) {
                return;
            }
            if (!this.zzD) {
                zzadw zzadwVar = this.zzaj;
                zzeb zzebVar = this.zzK;
                zzeb zzebVar2 = this.zzL;
                if (this.zzx == -1 || this.zzA == -9223372036854775807L || zzebVar == null || zzebVar.zza() == 0 || zzebVar2 == null || zzebVar2.zza() != zzebVar.zza()) {
                    zzaerVar = new zzaer(this.zzA, 0L);
                } else {
                    int iZza = zzebVar.zza();
                    int[] iArrCopyOf = new int[iZza];
                    long[] jArrCopyOf = new long[iZza];
                    long[] jArrCopyOf2 = new long[iZza];
                    long[] jArrCopyOf3 = new long[iZza];
                    for (int i20 = 0; i20 < iZza; i20++) {
                        jArrCopyOf3[i20] = zzebVar.zzb(i20);
                        jArrCopyOf[i20] = zzebVar2.zzb(i20) + this.zzx;
                    }
                    while (true) {
                        i11 = iZza - 1;
                        if (i12 >= i11) {
                            break;
                        }
                        int i21 = i12 + 1;
                        iArrCopyOf[i12] = (int) (jArrCopyOf[i21] - jArrCopyOf[i12]);
                        jArrCopyOf2[i12] = jArrCopyOf3[i21] - jArrCopyOf3[i12];
                        i12 = i21;
                    }
                    int i22 = i11;
                    while (i22 > 0 && jArrCopyOf3[i22] > this.zzA) {
                        i22--;
                    }
                    iArrCopyOf[i22] = (int) ((this.zzx + this.zzw) - jArrCopyOf[i22]);
                    jArrCopyOf2[i22] = this.zzA - jArrCopyOf3[i22];
                    if (i22 < i11) {
                        zzea.zzf("MatroskaExtractor", "Discarding trailing cue points with timestamps greater than total duration");
                        int i23 = i22 + 1;
                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, i23);
                        jArrCopyOf = Arrays.copyOf(jArrCopyOf, i23);
                        jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i23);
                        jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i23);
                    }
                    zzaerVar = new zzadh(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
                }
                zzadwVar.zzP(zzaerVar);
                this.zzD = true;
            }
            this.zzK = null;
            this.zzL = null;
            return;
        }
        zzahu zzahuVar4 = this.zzC;
        zzdd.zzb(zzahuVar4);
        String str = zzahuVar4.zzc;
        if (str == null) {
            throw zzaz.zza("CodecId is missing in TrackEntry element", null);
        }
        switch (str) {
            case "V_VP8":
            case "V_VP9":
            case "V_AV1":
            case "V_MPEG2":
            case "V_MPEG4/ISO/SP":
            case "V_MPEG4/ISO/ASP":
            case "V_MPEG4/ISO/AP":
            case "V_MPEG4/ISO/AVC":
            case "V_MPEGH/ISO/HEVC":
            case "V_MS/VFW/FOURCC":
            case "V_THEORA":
            case "A_OPUS":
            case "A_VORBIS":
            case "A_AAC":
            case "A_MPEG/L2":
            case "A_MPEG/L3":
            case "A_AC3":
            case "A_EAC3":
            case "A_TRUEHD":
            case "A_DTS":
            case "A_DTS/EXPRESS":
            case "A_DTS/LOSSLESS":
            case "A_FLAC":
            case "A_MS/ACM":
            case "A_PCM/INT/LIT":
            case "A_PCM/INT/BIG":
            case "A_PCM/FLOAT/IEEE":
            case "S_TEXT/UTF8":
            case "S_TEXT/ASS":
            case "S_TEXT/SSA":
            case "S_TEXT/WEBVTT":
            case "S_VOBSUB":
            case "S_HDMV/PGS":
            case "S_DVBSUB":
                zzahuVar4.zze(this.zzaj, zzahuVar4.zzd);
                this.zzh.put(zzahuVar4.zzd, zzahuVar4);
                break;
        }
        this.zzC = null;
    }

    public final void zzk(int i, double d10) throws zzaz {
        if (i == 181) {
            zzt(i);
            this.zzC.zzR = (int) d10;
            return;
        }
        if (i == 17545) {
            this.zzz = (long) d10;
            return;
        }
        switch (i) {
            case 21969:
                zzt(i);
                this.zzC.zzE = (float) d10;
                break;
            case 21970:
                zzt(i);
                this.zzC.zzF = (float) d10;
                break;
            case 21971:
                zzt(i);
                this.zzC.zzG = (float) d10;
                break;
            case 21972:
                zzt(i);
                this.zzC.zzH = (float) d10;
                break;
            case 21973:
                zzt(i);
                this.zzC.zzI = (float) d10;
                break;
            case 21974:
                zzt(i);
                this.zzC.zzJ = (float) d10;
                break;
            case 21975:
                zzt(i);
                this.zzC.zzK = (float) d10;
                break;
            case 21976:
                zzt(i);
                this.zzC.zzL = (float) d10;
                break;
            case 21977:
                zzt(i);
                this.zzC.zzM = (float) d10;
                break;
            case 21978:
                zzt(i);
                this.zzC.zzN = (float) d10;
                break;
            default:
                switch (i) {
                    case 30323:
                        zzt(i);
                        this.zzC.zzt = (float) d10;
                        break;
                    case 30324:
                        zzt(i);
                        this.zzC.zzu = (float) d10;
                        break;
                    case 30325:
                        zzt(i);
                        this.zzC.zzv = (float) d10;
                        break;
                }
        }
    }

    public final void zzl(int i, long j4) throws zzaz {
        boolean z10;
        if (i == 20529) {
            if (j4 == 0) {
                return;
            }
            throw zzaz.zza("ContentEncodingOrder " + j4 + " not supported", null);
        }
        if (i == 20530) {
            if (j4 == 1) {
                return;
            }
            throw zzaz.zza("ContentEncodingScope " + j4 + " not supported", null);
        }
        switch (i) {
            case 131:
                zzt(i);
                this.zzC.zze = (int) j4;
                return;
            case 136:
                z10 = j4 == 1;
                zzt(i);
                this.zzC.zzW = z10;
                return;
            case 155:
                this.zzQ = zzr(j4);
                return;
            case 159:
                zzt(i);
                this.zzC.zzP = (int) j4;
                return;
            case 176:
                zzt(i);
                this.zzC.zzm = (int) j4;
                return;
            case 179:
                zzs(i);
                this.zzK.zzc(zzr(j4));
                return;
            case 186:
                zzt(i);
                this.zzC.zzn = (int) j4;
                return;
            case 215:
                zzt(i);
                this.zzC.zzd = (int) j4;
                return;
            case 231:
                this.zzJ = zzr(j4);
                return;
            case 238:
                this.zzX = (int) j4;
                return;
            case 241:
                if (this.zzM) {
                    return;
                }
                zzs(i);
                this.zzL.zzc(j4);
                this.zzM = true;
                return;
            case 251:
                this.zzY = true;
                return;
            case 16871:
                zzt(i);
                this.zzC.zzZ = (int) j4;
                return;
            case 16980:
                if (j4 == 3) {
                    return;
                }
                throw zzaz.zza("ContentCompAlgo " + j4 + " not supported", null);
            case 17029:
                if (j4 < 1 || j4 > 2) {
                    throw zzaz.zza("DocTypeReadVersion " + j4 + " not supported", null);
                }
                return;
            case 17143:
                if (j4 == 1) {
                    return;
                }
                throw zzaz.zza("EBMLReadVersion " + j4 + " not supported", null);
            case 18401:
                if (j4 == 5) {
                    return;
                }
                throw zzaz.zza("ContentEncAlgo " + j4 + " not supported", null);
            case 18408:
                if (j4 == 1) {
                    return;
                }
                throw zzaz.zza("AESSettingsCipherMode " + j4 + " not supported", null);
            case 21420:
                this.zzF = j4 + this.zzx;
                return;
            case 21432:
                int i10 = (int) j4;
                zzt(i);
                if (i10 == 0) {
                    this.zzC.zzx = 0;
                    return;
                }
                if (i10 == 1) {
                    this.zzC.zzx = 2;
                    return;
                } else if (i10 == 3) {
                    this.zzC.zzx = 1;
                    return;
                } else {
                    if (i10 != 15) {
                        return;
                    }
                    this.zzC.zzx = 3;
                    return;
                }
            case 21680:
                zzt(i);
                this.zzC.zzp = (int) j4;
                return;
            case 21682:
                zzt(i);
                this.zzC.zzr = (int) j4;
                return;
            case 21690:
                zzt(i);
                this.zzC.zzq = (int) j4;
                return;
            case 21930:
                z10 = j4 == 1;
                zzt(i);
                this.zzC.zzV = z10;
                return;
            case 21938:
                zzt(i);
                zzahu zzahuVar = this.zzC;
                zzahuVar.zzy = true;
                zzahuVar.zzo = (int) j4;
                return;
            case 21998:
                zzt(i);
                this.zzC.zzg = (int) j4;
                return;
            case 22186:
                zzt(i);
                this.zzC.zzS = j4;
                return;
            case 22203:
                zzt(i);
                this.zzC.zzT = j4;
                return;
            case 25188:
                zzt(i);
                this.zzC.zzQ = (int) j4;
                return;
            case 30114:
                this.zzZ = j4;
                return;
            case 30321:
                int i11 = (int) j4;
                zzt(i);
                if (i11 == 0) {
                    this.zzC.zzs = 0;
                    return;
                }
                if (i11 == 1) {
                    this.zzC.zzs = 1;
                    return;
                } else if (i11 == 2) {
                    this.zzC.zzs = 2;
                    return;
                } else {
                    if (i11 != 3) {
                        return;
                    }
                    this.zzC.zzs = 3;
                    return;
                }
            case 2352003:
                zzt(i);
                this.zzC.zzf = (int) j4;
                return;
            case 2807729:
                this.zzy = j4;
                return;
            default:
                switch (i) {
                    case 21945:
                        int i12 = (int) j4;
                        zzt(i);
                        if (i12 == 1) {
                            this.zzC.zzB = 2;
                            return;
                        } else {
                            if (i12 != 2) {
                                return;
                            }
                            this.zzC.zzB = 1;
                            return;
                        }
                    case 21946:
                        zzt(i);
                        int iZzb = zzk.zzb((int) j4);
                        if (iZzb != -1) {
                            this.zzC.zzA = iZzb;
                            return;
                        }
                        return;
                    case 21947:
                        zzt(i);
                        this.zzC.zzy = true;
                        int iZza = zzk.zza((int) j4);
                        if (iZza != -1) {
                            this.zzC.zzz = iZza;
                            return;
                        }
                        return;
                    case 21948:
                        zzt(i);
                        this.zzC.zzC = (int) j4;
                        return;
                    case 21949:
                        zzt(i);
                        this.zzC.zzD = (int) j4;
                        return;
                    default:
                        return;
                }
        }
    }

    public final void zzm(int i, long j4, long j10) throws zzaz {
        zzdd.zzb(this.zzaj);
        if (i == 160) {
            this.zzY = false;
            this.zzZ = 0L;
            return;
        }
        if (i == 174) {
            zzahu zzahuVar = new zzahu();
            this.zzC = zzahuVar;
            zzahuVar.zza = this.zzB;
            return;
        }
        if (i == 187) {
            this.zzM = false;
            return;
        }
        if (i == 19899) {
            this.zzE = -1;
            this.zzF = -1L;
            return;
        }
        if (i == 20533) {
            zzt(i);
            this.zzC.zzh = true;
            return;
        }
        if (i == 21968) {
            zzt(i);
            this.zzC.zzy = true;
            return;
        }
        if (i == 408125543) {
            long j11 = this.zzx;
            if (j11 != -1 && j11 != j4) {
                throw zzaz.zza("Multiple Segment elements not supported", null);
            }
            this.zzx = j4;
            this.zzw = j10;
            return;
        }
        if (i == 475249515) {
            this.zzK = new zzeb(32);
            this.zzL = new zzeb(32);
        } else if (i == 524531317 && !this.zzD) {
            if (this.zzi && this.zzH != -1) {
                this.zzG = true;
            } else {
                this.zzaj.zzP(new zzaer(this.zzA, 0L));
                this.zzD = true;
            }
        }
    }

    public final void zzn(int i, String str) throws zzaz {
        if (i == 134) {
            zzt(i);
            this.zzC.zzc = str;
            return;
        }
        if (i == 17026) {
            if ("webm".equals(str) || "matroska".equals(str)) {
                this.zzB = Objects.equals(str, "webm");
                return;
            }
            throw zzaz.zza("DocType " + str + " not supported", null);
        }
        if (i == 21358) {
            zzt(i);
            this.zzC.zzb = str;
        } else {
            if (i != 2274716) {
                return;
            }
            zzt(i);
            this.zzC.zzaa = str;
        }
    }

    public zzahw(zzahr zzahrVar, int i, zzakp zzakpVar) {
        this.zzx = -1L;
        this.zzy = -9223372036854775807L;
        this.zzz = -9223372036854775807L;
        this.zzA = -9223372036854775807L;
        this.zzH = -1L;
        this.zzI = -1L;
        this.zzJ = -9223372036854775807L;
        this.zzak = zzahrVar;
        zzahrVar.zza(new zzaht(this, null));
        this.zzk = zzakpVar;
        this.zzi = 1 == ((i & 1) ^ 1);
        this.zzj = (i & 2) == 0;
        this.zzg = new zzahy();
        this.zzh = new SparseArray();
        this.zzn = new zzen(4);
        this.zzo = new zzen(ByteBuffer.allocate(4).putInt(-1).array());
        this.zzp = new zzen(4);
        this.zzl = new zzen(zzfv.zza);
        this.zzm = new zzen(4);
        this.zzq = new zzen();
        this.zzr = new zzen();
        this.zzs = new zzen(8);
        this.zzt = new zzen();
        this.zzu = new zzen();
        this.zzT = new int[1];
    }

    public zzahw(zzakp zzakpVar, int i) {
        this(new zzahr(), 0, zzakpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final /* synthetic */ zzadt zzc() {
        return this;
    }
}
