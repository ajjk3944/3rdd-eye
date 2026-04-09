package defpackage;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class x24 implements or3 {
    public final /* synthetic */ int a = 0;
    public final byte[] b;
    public final byte[] c;
    public final Object d;

    public x24(or3 or3Var, byte[] bArr, byte[] bArr2) {
        this.d = or3Var;
        this.b = bArr;
        this.c = bArr2;
    }

    public static byte[] a(fw3 fw3Var) {
        i04 i04Var = (i04) fw3Var.j;
        Integer num = (Integer) fw3Var.k;
        int iOrdinal = i04Var.ordinal();
        if (iOrdinal == 1) {
            return sv3.b(num.intValue()).b();
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return sv3.a.b();
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("unknown output prefix type");
            }
        }
        return sv3.a(num.intValue()).b();
    }

    @Override // defpackage.or3
    public final void b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        switch (this.a) {
            case 0:
                or3 or3Var = (or3) this.d;
                byte[] bArr3 = this.b;
                int length = bArr3.length;
                byte[] bArr4 = this.c;
                if (length == 0 && bArr4.length == 0) {
                    or3Var.b(bArr, bArr2);
                    return;
                } else {
                    if (!ow3.c(bArr3, bArr)) {
                        throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
                    }
                    if (bArr4.length != 0) {
                        bArr2 = i41.L(bArr2, bArr4);
                    }
                    or3Var.b(Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
                    return;
                }
            default:
                byte[] bArr5 = this.b;
                int length2 = bArr5.length;
                byte[] bArr6 = this.c;
                if (length2 == 0 && bArr6.length == 0) {
                    c(bArr, bArr2);
                    return;
                } else {
                    if (!ow3.c(bArr5, bArr)) {
                        throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
                    }
                    if (bArr6.length != 0) {
                        bArr2 = i41.L(bArr2, bArr6);
                    }
                    c(Arrays.copyOfRange(bArr, length2, bArr.length), bArr2);
                    return;
                }
        }
    }

    public void c(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = bArr;
        if (bArr3.length != 64) {
            throw new GeneralSecurityException("The length of the signature is not 64.");
        }
        byte[] bArrB = ((v34) this.d).b();
        if (bArr3.length == 64) {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr3, 32, 64);
            int i = 31;
            while (true) {
                if (i < 0) {
                    break;
                }
                int i2 = bArrCopyOfRange[i] & 255;
                int i3 = ou1.t[i] & 255;
                if (i2 == i3) {
                    i--;
                    bArr3 = bArr;
                } else if (i2 < i3) {
                    MessageDigest messageDigest = (MessageDigest) m34.e.a.l("SHA-512");
                    messageDigest.update(bArr3, 0, 32);
                    messageDigest.update(bArrB);
                    messageDigest.update(bArr2);
                    byte[] bArrDigest = messageDigest.digest();
                    long jD0 = ou1.d0(0, bArrDigest) & 2097151;
                    long jE0 = ou1.e0(2, bArrDigest) >> 5;
                    long jD02 = ou1.d0(5, bArrDigest) >> 2;
                    long jE02 = ou1.e0(7, bArrDigest) >> 7;
                    long jE03 = ou1.e0(10, bArrDigest) >> 4;
                    long jD03 = ou1.d0(13, bArrDigest) >> 1;
                    long jE04 = ou1.e0(15, bArrDigest) >> 6;
                    long jD04 = ou1.d0(18, bArrDigest) >> 3;
                    long jD05 = ou1.d0(21, bArrDigest) & 2097151;
                    long jE05 = ou1.e0(23, bArrDigest) >> 5;
                    long jD06 = ou1.d0(26, bArrDigest) >> 2;
                    long jE06 = ou1.e0(28, bArrDigest) >> 7;
                    long jE07 = ou1.e0(31, bArrDigest) >> 4;
                    long jD07 = ou1.d0(34, bArrDigest) >> 1;
                    long jE08 = ou1.e0(36, bArrDigest) >> 6;
                    long jD08 = ou1.d0(39, bArrDigest) >> 3;
                    long jD09 = ou1.d0(42, bArrDigest) & 2097151;
                    long jE09 = ou1.e0(44, bArrDigest) >> 5;
                    long jD010 = (ou1.d0(47, bArrDigest) >> 2) & 2097151;
                    long jE010 = (ou1.e0(49, bArrDigest) >> 7) & 2097151;
                    long jE011 = (ou1.e0(52, bArrDigest) >> 4) & 2097151;
                    long jD011 = (ou1.d0(55, bArrDigest) >> 1) & 2097151;
                    long jE012 = (ou1.e0(57, bArrDigest) >> 6) & 2097151;
                    long jE013 = ou1.e0(60, bArrDigest) >> 3;
                    long j = (jE011 * 666643) + jD05;
                    long j2 = (jE010 * 666643) + jD04;
                    long j3 = (jD010 * 666643) + (jE04 & 2097151);
                    long j4 = (j3 + 1048576) >> 21;
                    long j5 = j4 << 21;
                    long j6 = (jD010 * 654183) + (jE010 * 470296) + j;
                    long j7 = (j6 + 1048576) >> 21;
                    long j8 = j7 << 21;
                    long j9 = (jD010 * 136657) + (((jE011 * 654183) + ((jD011 * 470296) + ((jE012 * 666643) + (jD06 & 2097151)))) - (jE010 * 997805));
                    long j10 = (j9 + 1048576) >> 21;
                    long j11 = j10 << 21;
                    long j12 = ((jE011 * 136657) + (((jE012 * 654183) + ((jE013 * 470296) + (jE07 & 2097151))) - (jD011 * 997805))) - (jE010 * 683901);
                    long j13 = (j12 + 1048576) >> 21;
                    long j14 = ((jE012 * 136657) + ((jE08 & 2097151) - (jE013 * 997805))) - (jD011 * 683901);
                    long j15 = (j14 + 1048576) >> 21;
                    long j16 = j15 << 21;
                    long j17 = jD09 - (jE013 * 683901);
                    long j18 = (j17 + 1048576) >> 21;
                    long j19 = (jD010 * 470296) + j2 + j4;
                    long j20 = (j19 + 1048576) >> 21;
                    long j21 = j20 << 21;
                    long j22 = (((jE010 * 654183) + ((jE011 * 470296) + ((jD011 * 666643) + (jE05 & 2097151)))) - (jD010 * 997805)) + j7;
                    long j23 = (j22 + 1048576) >> 21;
                    long j24 = j23 << 21;
                    long j25 = (((jE010 * 136657) + (((jD011 * 654183) + ((jE012 * 470296) + ((jE013 * 666643) + (jE06 & 2097151)))) - (jE011 * 997805))) - (jD010 * 683901)) + j10;
                    long j26 = (j25 + 1048576) >> 21;
                    long j27 = j26 << 21;
                    long j28 = (((jD011 * 136657) + (((jE013 * 654183) + (jD07 & 2097151)) - (jE012 * 997805))) - (jE011 * 683901)) + j13;
                    long j29 = (j28 + 1048576) >> 21;
                    long j30 = (((jE013 * 136657) + jD08) - (jE012 * 683901)) + j15;
                    long j31 = (j30 + 1048576) >> 21;
                    long j32 = (j12 - (j13 << 21)) + j26;
                    long j33 = (j32 * 666643) + jD0;
                    long j34 = (j33 + 1048576) >> 21;
                    long j35 = j34 << 21;
                    long j36 = (j14 - j16) + j29;
                    long j37 = j28 - (j29 << 21);
                    long j38 = (j32 * 654183) + (j37 * 470296) + (j36 * 666643) + (jD02 & 2097151);
                    long j39 = (j38 + 1048576) >> 21;
                    long j40 = j39 << 21;
                    long j41 = (j17 - (j18 << 21)) + j31;
                    long j42 = j30 - (j31 << 21);
                    long j43 = (j32 * 136657) + (((j36 * 654183) + ((j42 * 470296) + ((j41 * 666643) + (jE03 & 2097151)))) - (j37 * 997805));
                    long j44 = (j43 + 1048576) >> 21;
                    long j45 = j44 << 21;
                    long j46 = (jE09 & 2097151) + j18;
                    long j47 = ((j36 * 136657) + (((j41 * 654183) + ((j46 * 470296) + (j3 - j5))) - (j42 * 997805))) - (j37 * 683901);
                    long j48 = (j47 + 1048576) >> 21;
                    long j49 = j48 << 21;
                    long j50 = ((j41 * 136657) + (((j6 - j8) + j20) - (j46 * 997805))) - (j42 * 683901);
                    long j51 = (j50 + 1048576) >> 21;
                    long j52 = j51 << 21;
                    long j53 = ((j9 - j11) + j23) - (j46 * 683901);
                    long j54 = (j53 + 1048576) >> 21;
                    long j55 = j54 << 21;
                    long j56 = (j32 * 470296) + (j37 * 666643) + (jE0 & 2097151) + j34;
                    long j57 = (j56 + 1048576) >> 21;
                    long j58 = (((j37 * 654183) + ((j36 * 470296) + ((j42 * 666643) + (jE02 & 2097151)))) - (j32 * 997805)) + j39;
                    long j59 = (j58 + 1048576) >> 21;
                    long j60 = (((j37 * 136657) + (((j42 * 654183) + ((j41 * 470296) + ((j46 * 666643) + (jD03 & 2097151)))) - (j36 * 997805))) - (j32 * 683901)) + j44;
                    long j61 = (j60 + 1048576) >> 21;
                    long j62 = (((j42 * 136657) + (((j46 * 654183) + (j19 - j21)) - (j41 * 997805))) - (j36 * 683901)) + j48;
                    long j63 = (j62 + 1048576) >> 21;
                    long j64 = (((j46 * 136657) + (j22 - j24)) - (j41 * 683901)) + j51;
                    long j65 = (j64 + 1048576) >> 21;
                    long j66 = (j25 - j27) + j54;
                    long j67 = (j66 + 1048576) >> 21;
                    long j68 = j67 << 21;
                    long j69 = (j67 * 666643) + (j33 - j35);
                    long j70 = j69 >> 21;
                    long j71 = j70 << 21;
                    long j72 = (j67 * 470296) + (j56 - (j57 << 21)) + j70;
                    long j73 = j72 >> 21;
                    long j74 = j73 << 21;
                    long j75 = (j67 * 654183) + (j38 - j40) + j57 + j73;
                    long j76 = j75 >> 21;
                    long j77 = j76 << 21;
                    long j78 = ((j58 - (j59 << 21)) - (j67 * 997805)) + j76;
                    long j79 = j78 >> 21;
                    long j80 = j79 << 21;
                    long j81 = (j67 * 136657) + (j43 - j45) + j59 + j79;
                    long j82 = j81 >> 21;
                    long j83 = j82 << 21;
                    long j84 = ((j60 - (j61 << 21)) - (j67 * 683901)) + j82;
                    long j85 = j84 >> 21;
                    long j86 = j85 << 21;
                    long j87 = (j47 - j49) + j61 + j85;
                    long j88 = j87 >> 21;
                    long j89 = j88 << 21;
                    long j90 = (j62 - (j63 << 21)) + j88;
                    long j91 = j90 >> 21;
                    long j92 = j91 << 21;
                    long j93 = (j50 - j52) + j63 + j91;
                    long j94 = j93 >> 21;
                    long j95 = j94 << 21;
                    long j96 = (j64 - (j65 << 21)) + j94;
                    long j97 = j96 >> 21;
                    long j98 = j97 << 21;
                    long j99 = (j53 - j55) + j65 + j97;
                    long j100 = j99 >> 21;
                    long j101 = j100 << 21;
                    long j102 = (j66 - j68) + j100;
                    long j103 = j102 >> 21;
                    long j104 = j103 << 21;
                    long j105 = (666643 * j103) + (j69 - j71);
                    long j106 = j105 >> 21;
                    long j107 = j106 << 21;
                    long j108 = (470296 * j103) + (j72 - j74) + j106;
                    long j109 = j108 >> 21;
                    long j110 = j109 << 21;
                    long j111 = (654183 * j103) + (j75 - j77) + j109;
                    long j112 = j111 >> 21;
                    long j113 = j112 << 21;
                    long j114 = ((j78 - j80) - (997805 * j103)) + j112;
                    long j115 = j114 >> 21;
                    long j116 = j115 << 21;
                    long j117 = (136657 * j103) + (j81 - j83) + j115;
                    long j118 = j117 >> 21;
                    long j119 = j118 << 21;
                    long j120 = ((j84 - j86) - (j103 * 683901)) + j118;
                    long j121 = j120 >> 21;
                    long j122 = j121 << 21;
                    long j123 = (j87 - j89) + j121;
                    long j124 = j123 >> 21;
                    long j125 = j124 << 21;
                    long j126 = (j90 - j92) + j124;
                    long j127 = j126 >> 21;
                    long j128 = j127 << 21;
                    long j129 = (j93 - j95) + j127;
                    long j130 = j129 >> 21;
                    long j131 = j130 << 21;
                    long j132 = (j96 - j98) + j130;
                    long j133 = j132 >> 21;
                    long j134 = j133 << 21;
                    long j135 = (j99 - j101) + j133;
                    long j136 = j135 >> 21;
                    bArrDigest[0] = (byte) (j105 - j107);
                    long j137 = j126 - j128;
                    long j138 = j123 - j125;
                    long j139 = j120 - j122;
                    long j140 = j117 - j119;
                    long j141 = j114 - j116;
                    long j142 = j111 - j113;
                    long j143 = j108 - j110;
                    bArrDigest[1] = (byte) (r13 >> 8);
                    bArrDigest[2] = (byte) ((r13 >> 16) | (j143 << 5));
                    bArrDigest[3] = (byte) (j143 >> 3);
                    bArrDigest[4] = (byte) (j143 >> 11);
                    bArrDigest[5] = (byte) ((j143 >> 19) | (j142 << 2));
                    bArrDigest[6] = (byte) (j142 >> 6);
                    bArrDigest[7] = (byte) ((j142 >> 14) | (j141 << 7));
                    bArrDigest[8] = (byte) (j141 >> 1);
                    bArrDigest[9] = (byte) (j141 >> 9);
                    bArrDigest[10] = (byte) ((j141 >> 17) | (j140 << 4));
                    bArrDigest[11] = (byte) (j140 >> 4);
                    bArrDigest[12] = (byte) (j140 >> 12);
                    bArrDigest[13] = (byte) ((j140 >> 20) | (j139 + j139));
                    bArrDigest[14] = (byte) (j139 >> 7);
                    bArrDigest[15] = (byte) ((j139 >> 15) | (j138 << 6));
                    bArrDigest[16] = (byte) (j138 >> 2);
                    bArrDigest[17] = (byte) (j138 >> 10);
                    bArrDigest[18] = (byte) ((j138 >> 18) | (j137 << 3));
                    long j144 = j135 - (j136 << 21);
                    long j145 = (j102 - j104) + j136;
                    long j146 = j132 - j134;
                    bArrDigest[19] = (byte) (j137 >> 5);
                    bArrDigest[20] = (byte) (j137 >> 13);
                    bArrDigest[21] = (byte) (j129 - j131);
                    bArrDigest[22] = (byte) (r9 >> 8);
                    bArrDigest[23] = (byte) ((r9 >> 16) | (j146 << 5));
                    bArrDigest[24] = (byte) (j146 >> 3);
                    bArrDigest[25] = (byte) (j146 >> 11);
                    bArrDigest[26] = (byte) ((j146 >> 19) | (j144 << 2));
                    bArrDigest[27] = (byte) (j144 >> 6);
                    bArrDigest[28] = (byte) ((j144 >> 14) | (j145 << 7));
                    bArrDigest[29] = (byte) (j145 >> 1);
                    bArrDigest[30] = (byte) (j145 >> 9);
                    bArrDigest[31] = (byte) (j145 >> 17);
                    long[] jArr = new long[10];
                    long[] jArrK = pu1.K(bArrB);
                    long[] jArr2 = new long[10];
                    jArr2[0] = 1;
                    long[] jArr3 = new long[10];
                    long[] jArr4 = new long[10];
                    long[] jArr5 = new long[10];
                    long[] jArr6 = new long[10];
                    long[] jArr7 = new long[10];
                    pu1.I(jArr4, jArrK);
                    pu1.G(jArr5, jArr4, pu3.a);
                    pu1.y(jArr4, jArr4, jArr2);
                    pu1.u(jArr5, jArr5, jArr2);
                    long[] jArr8 = new long[10];
                    pu1.I(jArr8, jArr5);
                    pu1.G(jArr8, jArr8, jArr5);
                    pu1.I(jArr, jArr8);
                    pu1.G(jArr, jArr, jArr5);
                    pu1.G(jArr, jArr, jArr4);
                    long[] jArr9 = new long[10];
                    long[] jArr10 = new long[10];
                    long[] jArr11 = new long[10];
                    pu1.I(jArr9, jArr);
                    pu1.I(jArr10, jArr9);
                    pu1.I(jArr10, jArr10);
                    pu1.G(jArr10, jArr, jArr10);
                    pu1.G(jArr9, jArr9, jArr10);
                    pu1.I(jArr9, jArr9);
                    pu1.G(jArr9, jArr10, jArr9);
                    pu1.I(jArr10, jArr9);
                    for (int i4 = 1; i4 < 5; i4++) {
                        pu1.I(jArr10, jArr10);
                    }
                    pu1.G(jArr9, jArr10, jArr9);
                    pu1.I(jArr10, jArr9);
                    for (int i5 = 1; i5 < 10; i5++) {
                        pu1.I(jArr10, jArr10);
                    }
                    pu1.G(jArr10, jArr10, jArr9);
                    pu1.I(jArr11, jArr10);
                    for (int i6 = 1; i6 < 20; i6++) {
                        pu1.I(jArr11, jArr11);
                    }
                    pu1.G(jArr10, jArr11, jArr10);
                    pu1.I(jArr10, jArr10);
                    for (int i7 = 1; i7 < 10; i7++) {
                        pu1.I(jArr10, jArr10);
                    }
                    pu1.G(jArr9, jArr10, jArr9);
                    pu1.I(jArr10, jArr9);
                    for (int i8 = 1; i8 < 50; i8++) {
                        pu1.I(jArr10, jArr10);
                    }
                    pu1.G(jArr10, jArr10, jArr9);
                    pu1.I(jArr11, jArr10);
                    for (int i9 = 1; i9 < 100; i9++) {
                        pu1.I(jArr11, jArr11);
                    }
                    pu1.G(jArr10, jArr11, jArr10);
                    pu1.I(jArr10, jArr10);
                    for (int i10 = 1; i10 < 50; i10++) {
                        pu1.I(jArr10, jArr10);
                    }
                    pu1.G(jArr9, jArr10, jArr9);
                    pu1.I(jArr9, jArr9);
                    pu1.I(jArr9, jArr9);
                    pu1.G(jArr, jArr9, jArr);
                    pu1.G(jArr, jArr, jArr8);
                    pu1.G(jArr, jArr, jArr4);
                    pu1.I(jArr6, jArr);
                    pu1.G(jArr6, jArr6, jArr5);
                    pu1.y(jArr7, jArr6, jArr4);
                    if (ou1.T(jArr7)) {
                        pu1.u(jArr7, jArr6, jArr4);
                        if (ou1.T(jArr7)) {
                            throw new GeneralSecurityException("Cannot convert given bytes to extended projective coordinates. No square root exists for modulo 2^255-19");
                        }
                        pu1.G(jArr, jArr, pu3.c);
                    }
                    if (!ou1.T(jArr) && ((bArrB[31] & 255) >> 7) != 0) {
                        throw new GeneralSecurityException("Cannot convert given bytes to extended projective coordinates. Computed x is zero and encoded x's least significant bit is not zero");
                    }
                    if ((pu1.M(jArr)[0] & 1) == ((bArrB[31] & 255) >> 7)) {
                        for (int i11 = 0; i11 < 10; i11++) {
                            jArr[i11] = -jArr[i11];
                        }
                    }
                    pu1.G(jArr3, jArr, jArrK);
                    jr3 jr3Var = new jr3(jArr, jArrK, jArr2, 2);
                    ou3[] ou3VarArr = new ou3[8];
                    ou3VarArr[0] = new ou3(new mr2(jr3Var, jArr3, 13, false));
                    wt2 wt2Var = new wt2(new jr3(2), new long[10], 6, false);
                    ou1.Z(wt2Var, jr3Var);
                    mr2 mr2Var = new mr2(wt2Var);
                    for (int i12 = 1; i12 < 8; i12++) {
                        ou1.W(wt2Var, mr2Var, ou3VarArr[i12 - 1]);
                        ou3VarArr[i12] = new ou3(new mr2(wt2Var));
                    }
                    byte[] bArrC0 = ou1.c0(bArrDigest);
                    byte[] bArrC02 = ou1.c0(bArrCopyOfRange);
                    wt2 wt2Var2 = new wt2(6);
                    mr2 mr2Var2 = new mr2(13);
                    int i13 = 255;
                    while (i13 >= 0 && bArrC0[i13] == 0 && bArrC02[i13] == 0) {
                        i13--;
                    }
                    while (i13 >= 0) {
                        ou1.Z(wt2Var2, new jr3(wt2Var2));
                        byte b = bArrC0[i13];
                        if (b > 0) {
                            mr2.x(mr2Var2, wt2Var2);
                            ou1.W(wt2Var2, mr2Var2, ou3VarArr[bArrC0[i13] / 2]);
                        } else if (b < 0) {
                            mr2.x(mr2Var2, wt2Var2);
                            ou1.Y(wt2Var2, mr2Var2, ou3VarArr[(-bArrC0[i13]) / 2]);
                        }
                        byte b2 = bArrC02[i13];
                        if (b2 > 0) {
                            mr2.x(mr2Var2, wt2Var2);
                            ou1.W(wt2Var2, mr2Var2, pu3.e[bArrC02[i13] / 2]);
                        } else if (b2 < 0) {
                            mr2.x(mr2Var2, wt2Var2);
                            ou1.Y(wt2Var2, mr2Var2, pu3.e[(-bArrC02[i13]) / 2]);
                        }
                        i13--;
                    }
                    byte[] bArrH = new jr3(wt2Var2).h();
                    for (int i14 = 0; i14 < 32; i14++) {
                        if (bArrH[i14] == bArr[i14]) {
                        }
                    }
                    return;
                }
            }
        }
        throw new GeneralSecurityException("Signature check failed.");
    }

    public x24(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (!yb.x(1)) {
            throw new IllegalStateException(new GeneralSecurityException("Can not use Ed25519 in FIPS-mode."));
        }
        if (bArr.length != 32) {
            throw new IllegalArgumentException("Given public key's length is not 32.");
        }
        this.d = v34.a(bArr);
        this.b = bArr2;
        this.c = bArr3;
        if (pu3.a == null) {
            throw new IllegalStateException("Could not initialize Ed25519.");
        }
    }
}
