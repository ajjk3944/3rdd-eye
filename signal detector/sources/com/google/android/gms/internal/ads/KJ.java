package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class KJ implements InterfaceC1199gE {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9475a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f9476b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f9477c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f9478d;

    public KJ(InterfaceC1199gE interfaceC1199gE, byte[] bArr, byte[] bArr2) {
        this.f9478d = interfaceC1199gE;
        this.f9476b = bArr;
        this.f9477c = bArr2;
    }

    public static byte[] b(C1631oG c1631oG) {
        EnumC1956uI enumC1956uI = c1631oG.f15926e;
        Integer num = c1631oG.f15927f;
        int iOrdinal = enumC1956uI.ordinal();
        if (iOrdinal == 1) {
            return AbstractC0873aG.b(num.intValue()).b();
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return AbstractC0873aG.f13089a.b();
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("unknown output prefix type");
            }
        }
        return AbstractC0873aG.a(num.intValue()).b();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1199gE
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int i = this.f9475a;
        byte[] bArr3 = this.f9476b;
        byte[] bArr4 = this.f9477c;
        switch (i) {
            case 0:
                InterfaceC1199gE interfaceC1199gE = (InterfaceC1199gE) this.f9478d;
                int length = bArr3.length;
                if (length == 0 && bArr4.length == 0) {
                    interfaceC1199gE.a(bArr, bArr2);
                    return;
                } else {
                    if (!AbstractC2062wG.c(bArr3, bArr)) {
                        throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
                    }
                    if (bArr4.length != 0) {
                        bArr2 = AbstractC0582Jp.q(bArr2, bArr4);
                    }
                    interfaceC1199gE.a(Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
                    return;
                }
            default:
                int length2 = bArr3.length;
                if (length2 == 0 && bArr4.length == 0) {
                    c(bArr, bArr2);
                    return;
                } else {
                    if (!AbstractC2062wG.c(bArr3, bArr)) {
                        throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
                    }
                    if (bArr4.length != 0) {
                        bArr2 = AbstractC0582Jp.q(bArr2, bArr4);
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
        byte[] bArrB = ((C1313iK) this.f9478d).b();
        if (bArr3.length == 64) {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr3, 32, 64);
            int i = 31;
            while (true) {
                if (i < 0) {
                    break;
                }
                int i3 = bArrCopyOfRange[i] & 255;
                int i6 = AbstractC0933bL.f13350C[i] & 255;
                if (i3 == i6) {
                    i--;
                    bArr3 = bArr;
                } else if (i3 < i6) {
                    MessageDigest messageDigest = (MessageDigest) YJ.f12629e.f12632a.c("SHA-512");
                    messageDigest.update(bArr3, 0, 32);
                    messageDigest.update(bArrB);
                    messageDigest.update(bArr2);
                    byte[] bArrDigest = messageDigest.digest();
                    long jP = AbstractC0933bL.P(0, bArrDigest) & 2097151;
                    long jQ = AbstractC0933bL.Q(2, bArrDigest) >> 5;
                    long jP2 = AbstractC0933bL.P(5, bArrDigest) >> 2;
                    long jQ2 = AbstractC0933bL.Q(7, bArrDigest) >> 7;
                    long jQ3 = AbstractC0933bL.Q(10, bArrDigest) >> 4;
                    long jP3 = AbstractC0933bL.P(13, bArrDigest) >> 1;
                    long jQ4 = AbstractC0933bL.Q(15, bArrDigest) >> 6;
                    long jP4 = AbstractC0933bL.P(18, bArrDigest) >> 3;
                    long jP5 = AbstractC0933bL.P(21, bArrDigest) & 2097151;
                    long jQ5 = AbstractC0933bL.Q(23, bArrDigest) >> 5;
                    long jP6 = AbstractC0933bL.P(26, bArrDigest) >> 2;
                    long jQ6 = AbstractC0933bL.Q(28, bArrDigest) >> 7;
                    long jQ7 = AbstractC0933bL.Q(31, bArrDigest) >> 4;
                    long jP7 = AbstractC0933bL.P(34, bArrDigest) >> 1;
                    long jQ8 = AbstractC0933bL.Q(36, bArrDigest) >> 6;
                    long jP8 = AbstractC0933bL.P(39, bArrDigest) >> 3;
                    long jP9 = AbstractC0933bL.P(42, bArrDigest) & 2097151;
                    long jQ9 = AbstractC0933bL.Q(44, bArrDigest) >> 5;
                    long jP10 = (AbstractC0933bL.P(47, bArrDigest) >> 2) & 2097151;
                    long jQ10 = (AbstractC0933bL.Q(49, bArrDigest) >> 7) & 2097151;
                    long jQ11 = (AbstractC0933bL.Q(52, bArrDigest) >> 4) & 2097151;
                    long jP11 = (AbstractC0933bL.P(55, bArrDigest) >> 1) & 2097151;
                    long jQ12 = (AbstractC0933bL.Q(57, bArrDigest) >> 6) & 2097151;
                    long jQ13 = AbstractC0933bL.Q(60, bArrDigest) >> 3;
                    long j6 = (jQ11 * 666643) + jP5;
                    long j7 = (jQ10 * 666643) + jP4;
                    long j8 = (jP10 * 666643) + (jQ4 & 2097151);
                    long j9 = (j8 + 1048576) >> 21;
                    long j10 = j9 << 21;
                    long j11 = (jP10 * 654183) + (jQ10 * 470296) + j6;
                    long j12 = (j11 + 1048576) >> 21;
                    long j13 = j12 << 21;
                    long j14 = (jP10 * 136657) + (((jQ11 * 654183) + ((jP11 * 470296) + ((jQ12 * 666643) + (jP6 & 2097151)))) - (jQ10 * 997805));
                    long j15 = (j14 + 1048576) >> 21;
                    long j16 = j15 << 21;
                    long j17 = ((jQ11 * 136657) + (((jQ12 * 654183) + ((jQ13 * 470296) + (jQ7 & 2097151))) - (jP11 * 997805))) - (jQ10 * 683901);
                    long j18 = (j17 + 1048576) >> 21;
                    long j19 = ((jQ12 * 136657) + ((jQ8 & 2097151) - (jQ13 * 997805))) - (jP11 * 683901);
                    long j20 = (j19 + 1048576) >> 21;
                    long j21 = j20 << 21;
                    long j22 = jP9 - (jQ13 * 683901);
                    long j23 = (j22 + 1048576) >> 21;
                    long j24 = (jP10 * 470296) + j7 + j9;
                    long j25 = (j24 + 1048576) >> 21;
                    long j26 = j25 << 21;
                    long j27 = (((jQ10 * 654183) + ((jQ11 * 470296) + ((jP11 * 666643) + (jQ5 & 2097151)))) - (jP10 * 997805)) + j12;
                    long j28 = (j27 + 1048576) >> 21;
                    long j29 = j28 << 21;
                    long j30 = (((jQ10 * 136657) + (((jP11 * 654183) + ((jQ12 * 470296) + ((jQ13 * 666643) + (jQ6 & 2097151)))) - (jQ11 * 997805))) - (jP10 * 683901)) + j15;
                    long j31 = (j30 + 1048576) >> 21;
                    long j32 = j31 << 21;
                    long j33 = (((jP11 * 136657) + (((jQ13 * 654183) + (jP7 & 2097151)) - (jQ12 * 997805))) - (jQ11 * 683901)) + j18;
                    long j34 = (j33 + 1048576) >> 21;
                    long j35 = (((jQ13 * 136657) + jP8) - (jQ12 * 683901)) + j20;
                    long j36 = (j35 + 1048576) >> 21;
                    long j37 = (j17 - (j18 << 21)) + j31;
                    long j38 = (j37 * 666643) + jP;
                    long j39 = (j38 + 1048576) >> 21;
                    long j40 = j39 << 21;
                    long j41 = (j19 - j21) + j34;
                    long j42 = j33 - (j34 << 21);
                    long j43 = (j37 * 654183) + (j42 * 470296) + (j41 * 666643) + (jP2 & 2097151);
                    long j44 = (j43 + 1048576) >> 21;
                    long j45 = j44 << 21;
                    long j46 = (j22 - (j23 << 21)) + j36;
                    long j47 = j35 - (j36 << 21);
                    long j48 = (j37 * 136657) + (((j41 * 654183) + ((j47 * 470296) + ((j46 * 666643) + (jQ3 & 2097151)))) - (j42 * 997805));
                    long j49 = (j48 + 1048576) >> 21;
                    long j50 = j49 << 21;
                    long j51 = (jQ9 & 2097151) + j23;
                    long j52 = ((j41 * 136657) + (((j46 * 654183) + ((j51 * 470296) + (j8 - j10))) - (j47 * 997805))) - (j42 * 683901);
                    long j53 = (j52 + 1048576) >> 21;
                    long j54 = j53 << 21;
                    long j55 = ((j46 * 136657) + (((j11 - j13) + j25) - (j51 * 997805))) - (j47 * 683901);
                    long j56 = (j55 + 1048576) >> 21;
                    long j57 = j56 << 21;
                    long j58 = ((j14 - j16) + j28) - (j51 * 683901);
                    long j59 = (j58 + 1048576) >> 21;
                    long j60 = j59 << 21;
                    long j61 = (j37 * 470296) + (j42 * 666643) + (jQ & 2097151) + j39;
                    long j62 = (j61 + 1048576) >> 21;
                    long j63 = (((j42 * 654183) + ((j41 * 470296) + ((j47 * 666643) + (jQ2 & 2097151)))) - (j37 * 997805)) + j44;
                    long j64 = (j63 + 1048576) >> 21;
                    long j65 = (((j42 * 136657) + (((j47 * 654183) + ((j46 * 470296) + ((j51 * 666643) + (jP3 & 2097151)))) - (j41 * 997805))) - (j37 * 683901)) + j49;
                    long j66 = (j65 + 1048576) >> 21;
                    long j67 = (((j47 * 136657) + (((j51 * 654183) + (j24 - j26)) - (j46 * 997805))) - (j41 * 683901)) + j53;
                    long j68 = (j67 + 1048576) >> 21;
                    long j69 = (((j51 * 136657) + (j27 - j29)) - (j46 * 683901)) + j56;
                    long j70 = (j69 + 1048576) >> 21;
                    long j71 = (j30 - j32) + j59;
                    long j72 = (j71 + 1048576) >> 21;
                    long j73 = j72 << 21;
                    long j74 = (j72 * 666643) + (j38 - j40);
                    long j75 = j74 >> 21;
                    long j76 = j75 << 21;
                    long j77 = (j72 * 470296) + (j61 - (j62 << 21)) + j75;
                    long j78 = j77 >> 21;
                    long j79 = j78 << 21;
                    long j80 = (j72 * 654183) + (j43 - j45) + j62 + j78;
                    long j81 = j80 >> 21;
                    long j82 = j81 << 21;
                    long j83 = ((j63 - (j64 << 21)) - (j72 * 997805)) + j81;
                    long j84 = j83 >> 21;
                    long j85 = j84 << 21;
                    long j86 = (j72 * 136657) + (j48 - j50) + j64 + j84;
                    long j87 = j86 >> 21;
                    long j88 = j87 << 21;
                    long j89 = ((j65 - (j66 << 21)) - (j72 * 683901)) + j87;
                    long j90 = j89 >> 21;
                    long j91 = j90 << 21;
                    long j92 = (j52 - j54) + j66 + j90;
                    long j93 = j92 >> 21;
                    long j94 = j93 << 21;
                    long j95 = (j67 - (j68 << 21)) + j93;
                    long j96 = j95 >> 21;
                    long j97 = j96 << 21;
                    long j98 = (j55 - j57) + j68 + j96;
                    long j99 = j98 >> 21;
                    long j100 = j99 << 21;
                    long j101 = (j69 - (j70 << 21)) + j99;
                    long j102 = j101 >> 21;
                    long j103 = j102 << 21;
                    long j104 = (j58 - j60) + j70 + j102;
                    long j105 = j104 >> 21;
                    long j106 = j105 << 21;
                    long j107 = (j71 - j73) + j105;
                    long j108 = j107 >> 21;
                    long j109 = j108 << 21;
                    long j110 = (666643 * j108) + (j74 - j76);
                    long j111 = j110 >> 21;
                    long j112 = j111 << 21;
                    long j113 = (470296 * j108) + (j77 - j79) + j111;
                    long j114 = j113 >> 21;
                    long j115 = j114 << 21;
                    long j116 = (654183 * j108) + (j80 - j82) + j114;
                    long j117 = j116 >> 21;
                    long j118 = j117 << 21;
                    long j119 = ((j83 - j85) - (997805 * j108)) + j117;
                    long j120 = j119 >> 21;
                    long j121 = j120 << 21;
                    long j122 = (136657 * j108) + (j86 - j88) + j120;
                    long j123 = j122 >> 21;
                    long j124 = j123 << 21;
                    long j125 = ((j89 - j91) - (j108 * 683901)) + j123;
                    long j126 = j125 >> 21;
                    long j127 = j126 << 21;
                    long j128 = (j92 - j94) + j126;
                    long j129 = j128 >> 21;
                    long j130 = j129 << 21;
                    long j131 = (j95 - j97) + j129;
                    long j132 = j131 >> 21;
                    long j133 = j132 << 21;
                    long j134 = (j98 - j100) + j132;
                    long j135 = j134 >> 21;
                    long j136 = j135 << 21;
                    long j137 = (j101 - j103) + j135;
                    long j138 = j137 >> 21;
                    long j139 = j138 << 21;
                    long j140 = (j104 - j106) + j138;
                    long j141 = j140 >> 21;
                    bArrDigest[0] = (byte) (j110 - j112);
                    long j142 = j131 - j133;
                    long j143 = j128 - j130;
                    long j144 = j125 - j127;
                    long j145 = j122 - j124;
                    long j146 = j119 - j121;
                    long j147 = j116 - j118;
                    long j148 = j113 - j115;
                    bArrDigest[1] = (byte) (r13 >> 8);
                    bArrDigest[2] = (byte) ((r13 >> 16) | (j148 << 5));
                    bArrDigest[3] = (byte) (j148 >> 3);
                    bArrDigest[4] = (byte) (j148 >> 11);
                    bArrDigest[5] = (byte) ((j148 >> 19) | (j147 << 2));
                    bArrDigest[6] = (byte) (j147 >> 6);
                    bArrDigest[7] = (byte) ((j147 >> 14) | (j146 << 7));
                    bArrDigest[8] = (byte) (j146 >> 1);
                    bArrDigest[9] = (byte) (j146 >> 9);
                    bArrDigest[10] = (byte) ((j146 >> 17) | (j145 << 4));
                    bArrDigest[11] = (byte) (j145 >> 4);
                    bArrDigest[12] = (byte) (j145 >> 12);
                    bArrDigest[13] = (byte) ((j145 >> 20) | (j144 + j144));
                    bArrDigest[14] = (byte) (j144 >> 7);
                    bArrDigest[15] = (byte) ((j144 >> 15) | (j143 << 6));
                    bArrDigest[16] = (byte) (j143 >> 2);
                    bArrDigest[17] = (byte) (j143 >> 10);
                    bArrDigest[18] = (byte) ((j143 >> 18) | (j142 << 3));
                    long j149 = j140 - (j141 << 21);
                    long j150 = (j107 - j109) + j141;
                    long j151 = j137 - j139;
                    bArrDigest[19] = (byte) (j142 >> 5);
                    bArrDigest[20] = (byte) (j142 >> 13);
                    bArrDigest[21] = (byte) (j134 - j136);
                    bArrDigest[22] = (byte) (r9 >> 8);
                    bArrDigest[23] = (byte) ((r9 >> 16) | (j151 << 5));
                    bArrDigest[24] = (byte) (j151 >> 3);
                    bArrDigest[25] = (byte) (j151 >> 11);
                    bArrDigest[26] = (byte) ((j151 >> 19) | (j149 << 2));
                    bArrDigest[27] = (byte) (j149 >> 6);
                    bArrDigest[28] = (byte) ((j149 >> 14) | (j150 << 7));
                    bArrDigest[29] = (byte) (j150 >> 1);
                    bArrDigest[30] = (byte) (j150 >> 9);
                    bArrDigest[31] = (byte) (j150 >> 17);
                    long[] jArr = new long[10];
                    long[] jArrO = AbstractC2022vd.O(bArrB);
                    long[] jArr2 = new long[10];
                    jArr2[0] = 1;
                    long[] jArr3 = new long[10];
                    long[] jArr4 = new long[10];
                    long[] jArr5 = new long[10];
                    long[] jArr6 = new long[10];
                    long[] jArr7 = new long[10];
                    AbstractC2022vd.L(jArr4, jArrO);
                    AbstractC2022vd.G(jArr5, jArr4, AbstractC2223zF.f17842a);
                    AbstractC2022vd.q(jArr4, jArr4, jArr2);
                    AbstractC2022vd.j(jArr5, jArr5, jArr2);
                    long[] jArr8 = new long[10];
                    AbstractC2022vd.L(jArr8, jArr5);
                    AbstractC2022vd.G(jArr8, jArr8, jArr5);
                    AbstractC2022vd.L(jArr, jArr8);
                    AbstractC2022vd.G(jArr, jArr, jArr5);
                    AbstractC2022vd.G(jArr, jArr, jArr4);
                    long[] jArr9 = new long[10];
                    long[] jArr10 = new long[10];
                    long[] jArr11 = new long[10];
                    AbstractC2022vd.L(jArr9, jArr);
                    AbstractC2022vd.L(jArr10, jArr9);
                    AbstractC2022vd.L(jArr10, jArr10);
                    AbstractC2022vd.G(jArr10, jArr, jArr10);
                    AbstractC2022vd.G(jArr9, jArr9, jArr10);
                    AbstractC2022vd.L(jArr9, jArr9);
                    AbstractC2022vd.G(jArr9, jArr10, jArr9);
                    AbstractC2022vd.L(jArr10, jArr9);
                    for (int i7 = 1; i7 < 5; i7++) {
                        AbstractC2022vd.L(jArr10, jArr10);
                    }
                    AbstractC2022vd.G(jArr9, jArr10, jArr9);
                    AbstractC2022vd.L(jArr10, jArr9);
                    for (int i8 = 1; i8 < 10; i8++) {
                        AbstractC2022vd.L(jArr10, jArr10);
                    }
                    AbstractC2022vd.G(jArr10, jArr10, jArr9);
                    AbstractC2022vd.L(jArr11, jArr10);
                    for (int i9 = 1; i9 < 20; i9++) {
                        AbstractC2022vd.L(jArr11, jArr11);
                    }
                    AbstractC2022vd.G(jArr10, jArr11, jArr10);
                    AbstractC2022vd.L(jArr10, jArr10);
                    for (int i10 = 1; i10 < 10; i10++) {
                        AbstractC2022vd.L(jArr10, jArr10);
                    }
                    AbstractC2022vd.G(jArr9, jArr10, jArr9);
                    AbstractC2022vd.L(jArr10, jArr9);
                    for (int i11 = 1; i11 < 50; i11++) {
                        AbstractC2022vd.L(jArr10, jArr10);
                    }
                    AbstractC2022vd.G(jArr10, jArr10, jArr9);
                    AbstractC2022vd.L(jArr11, jArr10);
                    for (int i12 = 1; i12 < 100; i12++) {
                        AbstractC2022vd.L(jArr11, jArr11);
                    }
                    AbstractC2022vd.G(jArr10, jArr11, jArr10);
                    AbstractC2022vd.L(jArr10, jArr10);
                    for (int i13 = 1; i13 < 50; i13++) {
                        AbstractC2022vd.L(jArr10, jArr10);
                    }
                    AbstractC2022vd.G(jArr9, jArr10, jArr9);
                    AbstractC2022vd.L(jArr9, jArr9);
                    AbstractC2022vd.L(jArr9, jArr9);
                    AbstractC2022vd.G(jArr, jArr9, jArr);
                    AbstractC2022vd.G(jArr, jArr, jArr8);
                    AbstractC2022vd.G(jArr, jArr, jArr4);
                    AbstractC2022vd.L(jArr6, jArr);
                    AbstractC2022vd.G(jArr6, jArr6, jArr5);
                    AbstractC2022vd.q(jArr7, jArr6, jArr4);
                    if (AbstractC0933bL.B(jArr7)) {
                        AbstractC2022vd.j(jArr7, jArr6, jArr4);
                        if (AbstractC0933bL.B(jArr7)) {
                            throw new GeneralSecurityException("Cannot convert given bytes to extended projective coordinates. No square root exists for modulo 2^255-19");
                        }
                        AbstractC2022vd.G(jArr, jArr, AbstractC2223zF.f17844c);
                    }
                    if (!AbstractC0933bL.B(jArr) && ((bArrB[31] & 255) >> 7) != 0) {
                        throw new GeneralSecurityException("Cannot convert given bytes to extended projective coordinates. Computed x is zero and encoded x's least significant bit is not zero");
                    }
                    if ((AbstractC2022vd.P(jArr)[0] & 1) == ((bArrB[31] & 255) >> 7)) {
                        for (int i14 = 0; i14 < 10; i14++) {
                            jArr[i14] = -jArr[i14];
                        }
                    }
                    AbstractC2022vd.G(jArr3, jArr, jArrO);
                    C2041vw c2041vw = new C2041vw(jArr, jArrO, jArr2, 6);
                    C2169yF[] c2169yFArr = new C2169yF[8];
                    c2169yFArr[0] = new C2169yF(new Vu(c2041vw, jArr3));
                    C1879sw c1879sw = new C1879sw(new C2041vw(6), 2, new long[10]);
                    AbstractC0933bL.L(c1879sw, c2041vw);
                    Vu vu = new Vu(c1879sw);
                    for (int i15 = 1; i15 < 8; i15++) {
                        AbstractC0933bL.G(c1879sw, vu, c2169yFArr[i15 - 1]);
                        c2169yFArr[i15] = new C2169yF(new Vu(c1879sw));
                    }
                    byte[] bArrO = AbstractC0933bL.O(bArrDigest);
                    byte[] bArrO2 = AbstractC0933bL.O(bArrCopyOfRange);
                    C1879sw c1879sw2 = new C1879sw(2);
                    Vu vu2 = new Vu(6);
                    int i16 = 255;
                    while (i16 >= 0 && bArrO[i16] == 0 && bArrO2[i16] == 0) {
                        i16--;
                    }
                    while (i16 >= 0) {
                        AbstractC0933bL.L(c1879sw2, new C2041vw(c1879sw2));
                        byte b5 = bArrO[i16];
                        if (b5 > 0) {
                            Vu.z(vu2, c1879sw2);
                            AbstractC0933bL.G(c1879sw2, vu2, c2169yFArr[bArrO[i16] / 2]);
                        } else if (b5 < 0) {
                            Vu.z(vu2, c1879sw2);
                            AbstractC0933bL.J(c1879sw2, vu2, c2169yFArr[(-bArrO[i16]) / 2]);
                        }
                        byte b6 = bArrO2[i16];
                        if (b6 > 0) {
                            Vu.z(vu2, c1879sw2);
                            AbstractC0933bL.G(c1879sw2, vu2, AbstractC2223zF.f17846e[bArrO2[i16] / 2]);
                        } else if (b6 < 0) {
                            Vu.z(vu2, c1879sw2);
                            AbstractC0933bL.J(c1879sw2, vu2, AbstractC2223zF.f17846e[(-bArrO2[i16]) / 2]);
                        }
                        i16--;
                    }
                    byte[] bArrI = new C2041vw(c1879sw2).i();
                    for (int i17 = 0; i17 < 32; i17++) {
                        if (bArrI[i17] == bArr[i17]) {
                        }
                    }
                    return;
                }
            }
        }
        throw new GeneralSecurityException("Signature check failed.");
    }

    public KJ(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (!Cr.m(1)) {
            throw new IllegalStateException(new GeneralSecurityException("Can not use Ed25519 in FIPS-mode."));
        }
        if (bArr.length != 32) {
            throw new IllegalArgumentException("Given public key's length is not 32.");
        }
        this.f9478d = C1313iK.a(bArr);
        this.f9476b = bArr2;
        this.f9477c = bArr3;
        if (AbstractC2223zF.f17842a == null) {
            throw new IllegalStateException("Could not initialize Ed25519.");
        }
    }
}
