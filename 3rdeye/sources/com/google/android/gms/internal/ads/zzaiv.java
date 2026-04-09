package com.google.android.gms.internal.ads;

import N7.H7;
import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import kotlin.KotlinVersion;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzaiv {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb;

    static {
        String str = zzex.zza;
        zzb = "OpusHead".getBytes(StandardCharsets.UTF_8);
    }

    public static int zza(int i) {
        return (i >> 24) & KotlinVersion.MAX_COMPONENT_VALUE;
    }

    public static zzav zzb(zzfc zzfcVar) {
        zzfa zzfaVar;
        zzfd zzfdVarZzb = zzfcVar.zzb(1751411826);
        zzfd zzfdVarZzb2 = zzfcVar.zzb(1801812339);
        zzfd zzfdVarZzb3 = zzfcVar.zzb(1768715124);
        if (zzfdVarZzb != null && zzfdVarZzb2 != null && zzfdVarZzb3 != null && zzi(zzfdVarZzb.zza) == 1835299937) {
            zzen zzenVar = zzfdVarZzb2.zza;
            zzenVar.zzL(12);
            int iZzg = zzenVar.zzg();
            String[] strArr = new String[iZzg];
            for (int i = 0; i < iZzg; i++) {
                int iZzg2 = zzenVar.zzg();
                zzenVar.zzM(4);
                strArr[i] = zzenVar.zzB(iZzg2 - 8, StandardCharsets.UTF_8);
            }
            zzen zzenVar2 = zzfdVarZzb3.zza;
            zzenVar2.zzL(8);
            ArrayList arrayList = new ArrayList();
            while (zzenVar2.zza() > 8) {
                int iZzg3 = zzenVar2.zzg() + zzenVar2.zzc();
                int iZzg4 = zzenVar2.zzg() - 1;
                if (iZzg4 < 0 || iZzg4 >= iZzg) {
                    H7.r(iZzg4, "Skipped metadata with unknown key index: ", "BoxParsers");
                } else {
                    String str = strArr[iZzg4];
                    while (true) {
                        int iZzc = zzenVar2.zzc();
                        if (iZzc >= iZzg3) {
                            zzfaVar = null;
                            break;
                        }
                        int iZzg5 = zzenVar2.zzg();
                        if (zzenVar2.zzg() == 1684108385) {
                            int iZzg6 = zzenVar2.zzg();
                            int iZzg7 = zzenVar2.zzg();
                            int i10 = iZzg5 - 16;
                            byte[] bArr = new byte[i10];
                            zzenVar2.zzH(bArr, 0, i10);
                            zzfaVar = new zzfa(str, bArr, iZzg7, iZzg6);
                            break;
                        }
                        zzenVar2.zzL(iZzc + iZzg5);
                    }
                    if (zzfaVar != null) {
                        arrayList.add(zzfaVar);
                    }
                }
                zzenVar2.zzL(iZzg3);
            }
            if (!arrayList.isEmpty()) {
                return new zzav(arrayList);
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzav zzc(com.google.android.gms.internal.ads.zzfd r14) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaiv.zzc(com.google.android.gms.internal.ads.zzfd):com.google.android.gms.internal.ads.zzav");
    }

    public static zzfh zzd(zzen zzenVar) {
        long jZzt;
        long jZzt2;
        zzenVar.zzL(8);
        if (zza(zzenVar.zzg()) == 0) {
            jZzt = zzenVar.zzu();
            jZzt2 = zzenVar.zzu();
        } else {
            jZzt = zzenVar.zzt();
            jZzt2 = zzenVar.zzt();
        }
        return new zzfh(jZzt, jZzt2, zzenVar.zzu());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzajq zze(com.google.android.gms.internal.ads.zzajn r52, com.google.android.gms.internal.ads.zzfc r53, com.google.android.gms.internal.ads.zzaeh r54) throws com.google.android.gms.internal.ads.zzaz {
        /*
            Method dump skipped, instructions count: 1639
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaiv.zze(com.google.android.gms.internal.ads.zzajn, com.google.android.gms.internal.ads.zzfc, com.google.android.gms.internal.ads.zzaeh):com.google.android.gms.internal.ads.zzajq");
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x012a, code lost:
    
        r3 = 10;
        r38 = -9223372036854775807L;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:538:0x0c40  */
    /* JADX WARN: Removed duplicated region for block: B:539:0x0c42  */
    /* JADX WARN: Removed duplicated region for block: B:595:0x0e29  */
    /* JADX WARN: Removed duplicated region for block: B:596:0x0e2f  */
    /* JADX WARN: Removed duplicated region for block: B:617:0x0edf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:623:0x0245 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0211  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List zzf(com.google.android.gms.internal.ads.zzfc r85, com.google.android.gms.internal.ads.zzaeh r86, long r87, com.google.android.gms.internal.ads.zzs r89, boolean r90, boolean r91, com.google.android.gms.internal.ads.zzfut r92) throws com.google.android.gms.internal.ads.zzaz {
        /*
            Method dump skipped, instructions count: 3817
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaiv.zzf(com.google.android.gms.internal.ads.zzfc, com.google.android.gms.internal.ads.zzaeh, long, com.google.android.gms.internal.ads.zzs, boolean, boolean, com.google.android.gms.internal.ads.zzfut):java.util.List");
    }

    public static void zzg(zzen zzenVar) {
        int iZzc = zzenVar.zzc();
        zzenVar.zzM(4);
        if (zzenVar.zzg() != 1751411826) {
            iZzc += 4;
        }
        zzenVar.zzL(iZzc);
    }

    private static int zzh(zzen zzenVar) {
        int iZzm = zzenVar.zzm();
        int i = iZzm & 127;
        while ((iZzm & 128) == 128) {
            iZzm = zzenVar.zzm();
            i = (i << 7) | (iZzm & 127);
        }
        return i;
    }

    private static int zzi(zzen zzenVar) {
        zzenVar.zzL(16);
        return zzenVar.zzg();
    }

    private static Pair zzj(zzen zzenVar, int i, int i10) throws zzaz {
        Integer num;
        zzajo zzajoVar;
        Pair pairCreate;
        int i11;
        int i12;
        Integer num2;
        boolean z10;
        int iZzc = zzenVar.zzc();
        while (iZzc - i < i10) {
            zzenVar.zzL(iZzc);
            int iZzg = zzenVar.zzg();
            zzadx.zzb(iZzg > 0, "childAtomSize must be positive");
            if (zzenVar.zzg() == 1936289382) {
                int i13 = iZzc + 8;
                int i14 = 0;
                int i15 = -1;
                Integer numValueOf = null;
                String strZzB = null;
                while (i13 - iZzc < iZzg) {
                    zzenVar.zzL(i13);
                    int iZzg2 = zzenVar.zzg();
                    int iZzg3 = zzenVar.zzg();
                    if (iZzg3 == 1718775137) {
                        numValueOf = Integer.valueOf(zzenVar.zzg());
                    } else if (iZzg3 == 1935894637) {
                        zzenVar.zzM(4);
                        strZzB = zzenVar.zzB(4, StandardCharsets.UTF_8);
                    } else if (iZzg3 == 1935894633) {
                        i15 = i13;
                        i14 = iZzg2;
                    }
                    i13 += iZzg2;
                }
                byte[] bArr = null;
                if ("cenc".equals(strZzB) || "cbc1".equals(strZzB) || "cens".equals(strZzB) || "cbcs".equals(strZzB)) {
                    zzadx.zzb(numValueOf != null, "frma atom is mandatory");
                    zzadx.zzb(i15 != -1, "schi atom is mandatory");
                    int i16 = i15 + 8;
                    while (true) {
                        if (i16 - i15 >= i14) {
                            num = numValueOf;
                            zzajoVar = null;
                            break;
                        }
                        zzenVar.zzL(i16);
                        int iZzg4 = zzenVar.zzg();
                        if (zzenVar.zzg() == 1952804451) {
                            int iZza = zza(zzenVar.zzg());
                            zzenVar.zzM(1);
                            if (iZza == 0) {
                                zzenVar.zzM(1);
                                i12 = 0;
                                i11 = 0;
                            } else {
                                int iZzm = zzenVar.zzm();
                                i11 = iZzm & 15;
                                i12 = (iZzm & 240) >> 4;
                            }
                            if (zzenVar.zzm() == 1) {
                                num2 = numValueOf;
                                z10 = true;
                            } else {
                                num2 = numValueOf;
                                z10 = false;
                            }
                            int iZzm2 = zzenVar.zzm();
                            byte[] bArr2 = new byte[16];
                            zzenVar.zzH(bArr2, 0, 16);
                            if (z10 && iZzm2 == 0) {
                                int iZzm3 = zzenVar.zzm();
                                byte[] bArr3 = new byte[iZzm3];
                                zzenVar.zzH(bArr3, 0, iZzm3);
                                bArr = bArr3;
                            }
                            num = num2;
                            zzajoVar = new zzajo(z10, strZzB, iZzm2, bArr2, i12, i11, bArr);
                        } else {
                            i16 += iZzg4;
                        }
                    }
                    zzadx.zzb(zzajoVar != null, "tenc atom is mandatory");
                    String str = zzex.zza;
                    pairCreate = Pair.create(num, zzajoVar);
                } else {
                    pairCreate = null;
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            iZzc += iZzg;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x017a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.google.android.gms.internal.ads.zzk zzk(com.google.android.gms.internal.ads.zzen r15) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaiv.zzk(com.google.android.gms.internal.ads.zzen):com.google.android.gms.internal.ads.zzk");
    }

    private static zzav zzl(zzen zzenVar) {
        short sZzE = zzenVar.zzE();
        zzenVar.zzM(2);
        String strZzB = zzenVar.zzB(sZzE, StandardCharsets.UTF_8);
        int iMax = Math.max(strZzB.lastIndexOf(43), strZzB.lastIndexOf(45));
        try {
            return new zzav(-9223372036854775807L, new zzfg(Float.parseFloat(strZzB.substring(0, iMax)), Float.parseFloat(strZzB.substring(iMax, strZzB.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    private static zzaij zzm(zzen zzenVar, int i) {
        zzenVar.zzL(i + 8);
        zzenVar.zzM(4);
        return new zzaij(zzenVar.zzu(), zzenVar.zzu());
    }

    private static zzail zzn(zzen zzenVar, int i) {
        zzenVar.zzL(i + 12);
        zzenVar.zzM(1);
        zzh(zzenVar);
        zzenVar.zzM(2);
        int iZzm = zzenVar.zzm();
        if ((iZzm & 128) != 0) {
            zzenVar.zzM(2);
        }
        if ((iZzm & 64) != 0) {
            zzenVar.zzM(zzenVar.zzm());
        }
        if ((iZzm & 32) != 0) {
            zzenVar.zzM(2);
        }
        zzenVar.zzM(1);
        zzh(zzenVar);
        String strZzd = zzay.zzd(zzenVar.zzm());
        if ("audio/mpeg".equals(strZzd) || "audio/vnd.dts".equals(strZzd) || "audio/vnd.dts.hd".equals(strZzd)) {
            return new zzail(strZzd, null, -1L, -1L);
        }
        zzenVar.zzM(4);
        long jZzu = zzenVar.zzu();
        long jZzu2 = zzenVar.zzu();
        zzenVar.zzM(1);
        int iZzh = zzh(zzenVar);
        long j4 = jZzu2;
        byte[] bArr = new byte[iZzh];
        zzenVar.zzH(bArr, 0, iZzh);
        if (j4 <= 0) {
            j4 = -1;
        }
        return new zzail(strZzd, bArr, j4, jZzu > 0 ? jZzu : -1L);
    }

    private static String zzo(int i) {
        char[] cArr = {(char) (((i >> 10) & 31) + 96), (char) (((i >> 5) & 31) + 96), (char) ((i & 31) + 96)};
        for (int i10 = 0; i10 < 3; i10++) {
            char c10 = cArr[i10];
            if (c10 < 'a' || c10 > 'z') {
                return null;
            }
        }
        return new String(cArr);
    }

    private static ByteBuffer zzp() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:246:0x04de A[PHI: r1 r16 r27
  0x04de: PHI (r1v38 java.lang.String) = (r1v29 java.lang.String), (r1v39 java.lang.String), (r1v29 java.lang.String), (r1v29 java.lang.String) binds: [B:222:0x044d, B:224:0x045b, B:220:0x0424, B:218:0x0406] A[DONT_GENERATE, DONT_INLINE]
  0x04de: PHI (r16v3 com.google.android.gms.internal.ads.zzail) = 
  (r16v2 com.google.android.gms.internal.ads.zzail)
  (r16v4 com.google.android.gms.internal.ads.zzail)
  (r16v2 com.google.android.gms.internal.ads.zzail)
  (r16v2 com.google.android.gms.internal.ads.zzail)
 binds: [B:222:0x044d, B:224:0x045b, B:220:0x0424, B:218:0x0406] A[DONT_GENERATE, DONT_INLINE]
  0x04de: PHI (r27v1 int) = (r27v2 int), (r27v2 int), (r27v3 int), (r27v3 int) binds: [B:222:0x044d, B:224:0x045b, B:220:0x0424, B:218:0x0406] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x015d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void zzq(com.google.android.gms.internal.ads.zzen r30, int r31, int r32, int r33, int r34, java.lang.String r35, boolean r36, com.google.android.gms.internal.ads.zzs r37, com.google.android.gms.internal.ads.zzaiq r38, int r39) throws com.google.android.gms.internal.ads.zzaz {
        /*
            Method dump skipped, instructions count: 1363
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaiv.zzq(com.google.android.gms.internal.ads.zzen, int, int, int, int, java.lang.String, boolean, com.google.android.gms.internal.ads.zzs, com.google.android.gms.internal.ads.zzaiq, int):void");
    }
}
