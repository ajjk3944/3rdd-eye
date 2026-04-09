package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class xk1 implements u91 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18414a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f18415b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f18416c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f18417d;

    public xk1(u91 u91Var, byte[] bArr, byte[] bArr2) {
        this.f18417d = u91Var;
        this.f18415b = bArr;
        this.f18416c = bArr2;
    }

    public static byte[] b(be1 be1Var) {
        ii1 ii1Var = (ii1) be1Var.f9661e;
        Integer num = (Integer) be1Var.f9662f;
        int iOrdinal = ii1Var.ordinal();
        if (iOrdinal == 1) {
            return nd1.b(num.intValue()).b();
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return nd1.f14254a.b();
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("unknown output prefix type");
            }
        }
        return nd1.a(num.intValue()).b();
    }

    @Override // com.google.android.gms.internal.ads.u91
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int i4 = this.f18414a;
        byte[] bArr3 = this.f18415b;
        byte[] bArr4 = this.f18416c;
        switch (i4) {
            case 0:
                u91 u91Var = (u91) this.f18417d;
                int length = bArr3.length;
                if (length == 0 && bArr4.length == 0) {
                    u91Var.a(bArr, bArr2);
                    return;
                } else {
                    if (!je1.c(bArr3, bArr)) {
                        throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
                    }
                    if (bArr4.length != 0) {
                        bArr2 = mq0.q(bArr2, bArr4);
                    }
                    u91Var.a(Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
                    return;
                }
            default:
                int length2 = bArr3.length;
                if (length2 == 0 && bArr4.length == 0) {
                    c(bArr, bArr2);
                    return;
                } else {
                    if (!je1.c(bArr3, bArr)) {
                        throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
                    }
                    if (bArr4.length != 0) {
                        bArr2 = mq0.q(bArr2, bArr4);
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
        byte[] bArrB = ((vl1) this.f18417d).b();
        if (bArr3.length == 64) {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr3, 32, 64);
            int i4 = 31;
            while (true) {
                if (i4 < 0) {
                    break;
                }
                int i10 = bArrCopyOfRange[i4] & 255;
                int i11 = nn1.C[i4] & 255;
                if (i10 == i11) {
                    i4--;
                    bArr3 = bArr;
                } else if (i10 < i11) {
                    MessageDigest messageDigest = (MessageDigest) ml1.f13941e.f13943a.g("SHA-512");
                    messageDigest.update(bArr3, 0, 32);
                    messageDigest.update(bArrB);
                    messageDigest.update(bArr2);
                    byte[] bArrDigest = messageDigest.digest();
                    long jM = nn1.M(0, bArrDigest) & 2097151;
                    long jN = nn1.N(2, bArrDigest) >> 5;
                    long jM2 = nn1.M(5, bArrDigest) >> 2;
                    long jN2 = nn1.N(7, bArrDigest) >> 7;
                    long jN3 = nn1.N(10, bArrDigest) >> 4;
                    long jM3 = nn1.M(13, bArrDigest) >> 1;
                    long jN4 = nn1.N(15, bArrDigest) >> 6;
                    long jM4 = nn1.M(18, bArrDigest) >> 3;
                    long jM5 = nn1.M(21, bArrDigest) & 2097151;
                    long jN5 = nn1.N(23, bArrDigest) >> 5;
                    long jM6 = nn1.M(26, bArrDigest) >> 2;
                    long jN6 = nn1.N(28, bArrDigest) >> 7;
                    long jN7 = nn1.N(31, bArrDigest) >> 4;
                    long jM7 = nn1.M(34, bArrDigest) >> 1;
                    long jN8 = nn1.N(36, bArrDigest) >> 6;
                    long jM8 = nn1.M(39, bArrDigest) >> 3;
                    long jM9 = nn1.M(42, bArrDigest) & 2097151;
                    long jN9 = nn1.N(44, bArrDigest) >> 5;
                    long jM10 = (nn1.M(47, bArrDigest) >> 2) & 2097151;
                    long jN10 = (nn1.N(49, bArrDigest) >> 7) & 2097151;
                    long jN11 = (nn1.N(52, bArrDigest) >> 4) & 2097151;
                    long jM11 = (nn1.M(55, bArrDigest) >> 1) & 2097151;
                    long jN12 = (nn1.N(57, bArrDigest) >> 6) & 2097151;
                    long jN13 = nn1.N(60, bArrDigest) >> 3;
                    long j = (jN11 * 666643) + jM5;
                    long j8 = (jN10 * 666643) + jM4;
                    long j9 = (jM10 * 666643) + (jN4 & 2097151);
                    long j10 = (j9 + 1048576) >> 21;
                    long j11 = j10 << 21;
                    long j12 = (jM10 * 654183) + (jN10 * 470296) + j;
                    long j13 = (j12 + 1048576) >> 21;
                    long j14 = j13 << 21;
                    long j15 = (jM10 * 136657) + (((jN11 * 654183) + ((jM11 * 470296) + ((jN12 * 666643) + (jM6 & 2097151)))) - (jN10 * 997805));
                    long j16 = (j15 + 1048576) >> 21;
                    long j17 = j16 << 21;
                    long j18 = ((jN11 * 136657) + (((jN12 * 654183) + ((jN13 * 470296) + (jN7 & 2097151))) - (jM11 * 997805))) - (jN10 * 683901);
                    long j19 = (j18 + 1048576) >> 21;
                    long j20 = ((jN12 * 136657) + ((jN8 & 2097151) - (jN13 * 997805))) - (jM11 * 683901);
                    long j21 = (j20 + 1048576) >> 21;
                    long j22 = j21 << 21;
                    long j23 = jM9 - (jN13 * 683901);
                    long j24 = (j23 + 1048576) >> 21;
                    long j25 = (jM10 * 470296) + j8 + j10;
                    long j26 = (j25 + 1048576) >> 21;
                    long j27 = j26 << 21;
                    long j28 = (((jN10 * 654183) + ((jN11 * 470296) + ((jM11 * 666643) + (jN5 & 2097151)))) - (jM10 * 997805)) + j13;
                    long j29 = (j28 + 1048576) >> 21;
                    long j30 = j29 << 21;
                    long j31 = (((jN10 * 136657) + (((jM11 * 654183) + ((jN12 * 470296) + ((jN13 * 666643) + (jN6 & 2097151)))) - (jN11 * 997805))) - (jM10 * 683901)) + j16;
                    long j32 = (j31 + 1048576) >> 21;
                    long j33 = j32 << 21;
                    long j34 = (((jM11 * 136657) + (((jN13 * 654183) + (jM7 & 2097151)) - (jN12 * 997805))) - (jN11 * 683901)) + j19;
                    long j35 = (j34 + 1048576) >> 21;
                    long j36 = (((jN13 * 136657) + jM8) - (jN12 * 683901)) + j21;
                    long j37 = (j36 + 1048576) >> 21;
                    long j38 = (j18 - (j19 << 21)) + j32;
                    long j39 = (j38 * 666643) + jM;
                    long j40 = (j39 + 1048576) >> 21;
                    long j41 = j40 << 21;
                    long j42 = (j20 - j22) + j35;
                    long j43 = j34 - (j35 << 21);
                    long j44 = (j38 * 654183) + (j43 * 470296) + (j42 * 666643) + (jM2 & 2097151);
                    long j45 = (j44 + 1048576) >> 21;
                    long j46 = j45 << 21;
                    long j47 = (j23 - (j24 << 21)) + j37;
                    long j48 = j36 - (j37 << 21);
                    long j49 = (j38 * 136657) + (((j42 * 654183) + ((j48 * 470296) + ((j47 * 666643) + (jN3 & 2097151)))) - (j43 * 997805));
                    long j50 = (j49 + 1048576) >> 21;
                    long j51 = j50 << 21;
                    long j52 = (jN9 & 2097151) + j24;
                    long j53 = ((j42 * 136657) + (((j47 * 654183) + ((j52 * 470296) + (j9 - j11))) - (j48 * 997805))) - (j43 * 683901);
                    long j54 = (j53 + 1048576) >> 21;
                    long j55 = j54 << 21;
                    long j56 = ((j47 * 136657) + (((j12 - j14) + j26) - (j52 * 997805))) - (j48 * 683901);
                    long j57 = (j56 + 1048576) >> 21;
                    long j58 = j57 << 21;
                    long j59 = ((j15 - j17) + j29) - (j52 * 683901);
                    long j60 = (j59 + 1048576) >> 21;
                    long j61 = j60 << 21;
                    long j62 = (j38 * 470296) + (j43 * 666643) + (jN & 2097151) + j40;
                    long j63 = (j62 + 1048576) >> 21;
                    long j64 = (((j43 * 654183) + ((j42 * 470296) + ((j48 * 666643) + (jN2 & 2097151)))) - (j38 * 997805)) + j45;
                    long j65 = (j64 + 1048576) >> 21;
                    long j66 = (((j43 * 136657) + (((j48 * 654183) + ((j47 * 470296) + ((j52 * 666643) + (jM3 & 2097151)))) - (j42 * 997805))) - (j38 * 683901)) + j50;
                    long j67 = (j66 + 1048576) >> 21;
                    long j68 = (((j48 * 136657) + (((j52 * 654183) + (j25 - j27)) - (j47 * 997805))) - (j42 * 683901)) + j54;
                    long j69 = (j68 + 1048576) >> 21;
                    long j70 = (((j52 * 136657) + (j28 - j30)) - (j47 * 683901)) + j57;
                    long j71 = (j70 + 1048576) >> 21;
                    long j72 = (j31 - j33) + j60;
                    long j73 = (j72 + 1048576) >> 21;
                    long j74 = j73 << 21;
                    long j75 = (j73 * 666643) + (j39 - j41);
                    long j76 = j75 >> 21;
                    long j77 = j76 << 21;
                    long j78 = (j73 * 470296) + (j62 - (j63 << 21)) + j76;
                    long j79 = j78 >> 21;
                    long j80 = j79 << 21;
                    long j81 = (j73 * 654183) + (j44 - j46) + j63 + j79;
                    long j82 = j81 >> 21;
                    long j83 = j82 << 21;
                    long j84 = ((j64 - (j65 << 21)) - (j73 * 997805)) + j82;
                    long j85 = j84 >> 21;
                    long j86 = j85 << 21;
                    long j87 = (j73 * 136657) + (j49 - j51) + j65 + j85;
                    long j88 = j87 >> 21;
                    long j89 = j88 << 21;
                    long j90 = ((j66 - (j67 << 21)) - (j73 * 683901)) + j88;
                    long j91 = j90 >> 21;
                    long j92 = j91 << 21;
                    long j93 = (j53 - j55) + j67 + j91;
                    long j94 = j93 >> 21;
                    long j95 = j94 << 21;
                    long j96 = (j68 - (j69 << 21)) + j94;
                    long j97 = j96 >> 21;
                    long j98 = j97 << 21;
                    long j99 = (j56 - j58) + j69 + j97;
                    long j100 = j99 >> 21;
                    long j101 = j100 << 21;
                    long j102 = (j70 - (j71 << 21)) + j100;
                    long j103 = j102 >> 21;
                    long j104 = j103 << 21;
                    long j105 = (j59 - j61) + j71 + j103;
                    long j106 = j105 >> 21;
                    long j107 = j106 << 21;
                    long j108 = (j72 - j74) + j106;
                    long j109 = j108 >> 21;
                    long j110 = j109 << 21;
                    long j111 = (666643 * j109) + (j75 - j77);
                    long j112 = j111 >> 21;
                    long j113 = j112 << 21;
                    long j114 = (470296 * j109) + (j78 - j80) + j112;
                    long j115 = j114 >> 21;
                    long j116 = j115 << 21;
                    long j117 = (654183 * j109) + (j81 - j83) + j115;
                    long j118 = j117 >> 21;
                    long j119 = j118 << 21;
                    long j120 = ((j84 - j86) - (997805 * j109)) + j118;
                    long j121 = j120 >> 21;
                    long j122 = j121 << 21;
                    long j123 = (136657 * j109) + (j87 - j89) + j121;
                    long j124 = j123 >> 21;
                    long j125 = j124 << 21;
                    long j126 = ((j90 - j92) - (j109 * 683901)) + j124;
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
                    long j137 = j136 << 21;
                    long j138 = (j102 - j104) + j136;
                    long j139 = j138 >> 21;
                    long j140 = j139 << 21;
                    long j141 = (j105 - j107) + j139;
                    long j142 = j141 >> 21;
                    bArrDigest[0] = (byte) (j111 - j113);
                    long j143 = j132 - j134;
                    long j144 = j129 - j131;
                    long j145 = j126 - j128;
                    long j146 = j123 - j125;
                    long j147 = j120 - j122;
                    long j148 = j117 - j119;
                    long j149 = j114 - j116;
                    bArrDigest[1] = (byte) (r13 >> 8);
                    bArrDigest[2] = (byte) ((r13 >> 16) | (j149 << 5));
                    bArrDigest[3] = (byte) (j149 >> 3);
                    bArrDigest[4] = (byte) (j149 >> 11);
                    bArrDigest[5] = (byte) ((j149 >> 19) | (j148 << 2));
                    bArrDigest[6] = (byte) (j148 >> 6);
                    bArrDigest[7] = (byte) ((j148 >> 14) | (j147 << 7));
                    bArrDigest[8] = (byte) (j147 >> 1);
                    bArrDigest[9] = (byte) (j147 >> 9);
                    bArrDigest[10] = (byte) ((j147 >> 17) | (j146 << 4));
                    bArrDigest[11] = (byte) (j146 >> 4);
                    bArrDigest[12] = (byte) (j146 >> 12);
                    bArrDigest[13] = (byte) ((j146 >> 20) | (j145 + j145));
                    bArrDigest[14] = (byte) (j145 >> 7);
                    bArrDigest[15] = (byte) ((j145 >> 15) | (j144 << 6));
                    bArrDigest[16] = (byte) (j144 >> 2);
                    bArrDigest[17] = (byte) (j144 >> 10);
                    bArrDigest[18] = (byte) ((j144 >> 18) | (j143 << 3));
                    long j150 = j141 - (j142 << 21);
                    long j151 = (j108 - j110) + j142;
                    long j152 = j138 - j140;
                    bArrDigest[19] = (byte) (j143 >> 5);
                    bArrDigest[20] = (byte) (j143 >> 13);
                    bArrDigest[21] = (byte) (j135 - j137);
                    bArrDigest[22] = (byte) (r9 >> 8);
                    bArrDigest[23] = (byte) ((r9 >> 16) | (j152 << 5));
                    bArrDigest[24] = (byte) (j152 >> 3);
                    bArrDigest[25] = (byte) (j152 >> 11);
                    bArrDigest[26] = (byte) ((j152 >> 19) | (j150 << 2));
                    bArrDigest[27] = (byte) (j150 >> 6);
                    bArrDigest[28] = (byte) ((j150 >> 14) | (j151 << 7));
                    bArrDigest[29] = (byte) (j151 >> 1);
                    bArrDigest[30] = (byte) (j151 >> 9);
                    bArrDigest[31] = (byte) (j151 >> 17);
                    long[] jArr = new long[10];
                    long[] jArrM = ls.M(bArrB);
                    long[] jArr2 = new long[10];
                    jArr2[0] = 1;
                    long[] jArr3 = new long[10];
                    long[] jArr4 = new long[10];
                    long[] jArr5 = new long[10];
                    long[] jArr6 = new long[10];
                    long[] jArr7 = new long[10];
                    ls.I(jArr4, jArrM);
                    ls.E(jArr5, jArr4, mc1.f13864a);
                    ls.o(jArr4, jArr4, jArr2);
                    ls.i(jArr5, jArr5, jArr2);
                    long[] jArr8 = new long[10];
                    ls.I(jArr8, jArr5);
                    ls.E(jArr8, jArr8, jArr5);
                    ls.I(jArr, jArr8);
                    ls.E(jArr, jArr, jArr5);
                    ls.E(jArr, jArr, jArr4);
                    long[] jArr9 = new long[10];
                    long[] jArr10 = new long[10];
                    long[] jArr11 = new long[10];
                    ls.I(jArr9, jArr);
                    ls.I(jArr10, jArr9);
                    ls.I(jArr10, jArr10);
                    ls.E(jArr10, jArr, jArr10);
                    ls.E(jArr9, jArr9, jArr10);
                    ls.I(jArr9, jArr9);
                    ls.E(jArr9, jArr10, jArr9);
                    ls.I(jArr10, jArr9);
                    for (int i12 = 1; i12 < 5; i12++) {
                        ls.I(jArr10, jArr10);
                    }
                    ls.E(jArr9, jArr10, jArr9);
                    ls.I(jArr10, jArr9);
                    for (int i13 = 1; i13 < 10; i13++) {
                        ls.I(jArr10, jArr10);
                    }
                    ls.E(jArr10, jArr10, jArr9);
                    ls.I(jArr11, jArr10);
                    for (int i14 = 1; i14 < 20; i14++) {
                        ls.I(jArr11, jArr11);
                    }
                    ls.E(jArr10, jArr11, jArr10);
                    ls.I(jArr10, jArr10);
                    for (int i15 = 1; i15 < 10; i15++) {
                        ls.I(jArr10, jArr10);
                    }
                    ls.E(jArr9, jArr10, jArr9);
                    ls.I(jArr10, jArr9);
                    for (int i16 = 1; i16 < 50; i16++) {
                        ls.I(jArr10, jArr10);
                    }
                    ls.E(jArr10, jArr10, jArr9);
                    ls.I(jArr11, jArr10);
                    for (int i17 = 1; i17 < 100; i17++) {
                        ls.I(jArr11, jArr11);
                    }
                    ls.E(jArr10, jArr11, jArr10);
                    ls.I(jArr10, jArr10);
                    for (int i18 = 1; i18 < 50; i18++) {
                        ls.I(jArr10, jArr10);
                    }
                    ls.E(jArr9, jArr10, jArr9);
                    ls.I(jArr9, jArr9);
                    ls.I(jArr9, jArr9);
                    ls.E(jArr, jArr9, jArr);
                    ls.E(jArr, jArr, jArr8);
                    ls.E(jArr, jArr, jArr4);
                    ls.I(jArr6, jArr);
                    ls.E(jArr6, jArr6, jArr5);
                    ls.o(jArr7, jArr6, jArr4);
                    if (nn1.x(jArr7)) {
                        ls.i(jArr7, jArr6, jArr4);
                        if (nn1.x(jArr7)) {
                            throw new GeneralSecurityException("Cannot convert given bytes to extended projective coordinates. No square root exists for modulo 2^255-19");
                        }
                        ls.E(jArr, jArr, mc1.f13866c);
                    }
                    if (!nn1.x(jArr) && ((bArrB[31] & 255) >> 7) != 0) {
                        throw new GeneralSecurityException("Cannot convert given bytes to extended projective coordinates. Computed x is zero and encoded x's least significant bit is not zero");
                    }
                    if ((ls.O(jArr)[0] & 1) == ((bArrB[31] & 255) >> 7)) {
                        for (int i19 = 0; i19 < 10; i19++) {
                            jArr[i19] = -jArr[i19];
                        }
                    }
                    ls.E(jArr3, jArr, jArrM);
                    av0 av0Var = new av0(jArr, jArrM, jArr2, 6);
                    lc1[] lc1VarArr = new lc1[8];
                    lc1VarArr[0] = new lc1(new l90(22, av0Var, jArr3));
                    rt rtVar = new rt(25, new av0(6), new long[10]);
                    nn1.I(rtVar, av0Var);
                    l90 l90Var = new l90(rtVar);
                    for (int i20 = 1; i20 < 8; i20++) {
                        nn1.C(rtVar, l90Var, lc1VarArr[i20 - 1]);
                        lc1VarArr[i20] = new lc1(new l90(rtVar));
                    }
                    byte[] bArrL = nn1.L(bArrDigest);
                    byte[] bArrL2 = nn1.L(bArrCopyOfRange);
                    rt rtVar2 = new rt(25);
                    l90 l90Var2 = new l90(22);
                    int i21 = 255;
                    while (i21 >= 0 && bArrL[i21] == 0 && bArrL2[i21] == 0) {
                        i21--;
                    }
                    while (i21 >= 0) {
                        nn1.I(rtVar2, new av0(rtVar2));
                        byte b10 = bArrL[i21];
                        if (b10 > 0) {
                            l90.q(l90Var2, rtVar2);
                            nn1.C(rtVar2, l90Var2, lc1VarArr[bArrL[i21] / 2]);
                        } else if (b10 < 0) {
                            l90.q(l90Var2, rtVar2);
                            nn1.F(rtVar2, l90Var2, lc1VarArr[(-bArrL[i21]) / 2]);
                        }
                        byte b11 = bArrL2[i21];
                        if (b11 > 0) {
                            l90.q(l90Var2, rtVar2);
                            nn1.C(rtVar2, l90Var2, mc1.f13868e[bArrL2[i21] / 2]);
                        } else if (b11 < 0) {
                            l90.q(l90Var2, rtVar2);
                            nn1.F(rtVar2, l90Var2, mc1.f13868e[(-bArrL2[i21]) / 2]);
                        }
                        i21--;
                    }
                    byte[] bArrL3 = new av0(rtVar2).l();
                    for (int i22 = 0; i22 < 32; i22++) {
                        if (bArrL3[i22] == bArr[i22]) {
                        }
                    }
                    return;
                }
            }
        }
        throw new GeneralSecurityException("Signature check failed.");
    }

    public xk1(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (!al0.q(1)) {
            throw new IllegalStateException(new GeneralSecurityException("Can not use Ed25519 in FIPS-mode."));
        }
        if (bArr.length != 32) {
            throw new IllegalArgumentException("Given public key's length is not 32.");
        }
        this.f18417d = vl1.a(bArr);
        this.f18415b = bArr2;
        this.f18416c = bArr3;
        if (mc1.f13864a == null) {
            throw new IllegalStateException("Could not initialize Ed25519.");
        }
    }
}
