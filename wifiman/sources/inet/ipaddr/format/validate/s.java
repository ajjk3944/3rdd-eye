package inet.ipaddr.format.validate;

import ag.AbstractC3844b;
import inet.ipaddr.AddressStringException;
import inet.ipaddr.d;
import inet.ipaddr.format.validate.d;
import inet.ipaddr.g;
import inet.ipaddr.ipv4.Z;
import inet.ipaddr.ipv6.j0;
import inet.ipaddr.o;
import java.math.BigInteger;
import org.snmp4j.smi.Counter32;

/* loaded from: classes4.dex */
public class s implements b {

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f49466b = new int[128];

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f49467c;

    /* renamed from: d, reason: collision with root package name */
    private static final char f49468d;

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f49469e;

    /* renamed from: f, reason: collision with root package name */
    private static final i[] f49470f;

    /* renamed from: g, reason: collision with root package name */
    static final d.j[][] f49471g;

    /* renamed from: h, reason: collision with root package name */
    private static final d.i f49472h;

    /* renamed from: i, reason: collision with root package name */
    private static final h f49473i;

    /* renamed from: j, reason: collision with root package name */
    public static final b f49474j;

    /* renamed from: k, reason: collision with root package name */
    private static final inet.ipaddr.o f49475k;

    /* renamed from: l, reason: collision with root package name */
    private static final inet.ipaddr.o f49476l;

    /* renamed from: m, reason: collision with root package name */
    private static final inet.ipaddr.o f49477m;

    /* renamed from: n, reason: collision with root package name */
    private static final BigInteger[] f49478n;

    /* renamed from: o, reason: collision with root package name */
    private static final BigInteger f49479o;

    /* renamed from: p, reason: collision with root package name */
    private static final long[] f49480p;

    /* renamed from: q, reason: collision with root package name */
    private static final int[][] f49481q;

    static {
        char[] cArr = AbstractC3844b.f26200i;
        for (int i10 = 0; i10 < cArr.length; i10++) {
            f49466b[cArr[i10]] = i10;
        }
        int[] iArr = new int[128];
        f49467c = iArr;
        char c10 = '0';
        int i11 = 0;
        while (i11 < 10) {
            iArr[c10] = i11;
            i11++;
            c10 = (char) (c10 + 1);
        }
        char c11 = 'a';
        char c12 = 'A';
        while (i11 < 26) {
            iArr[c12] = i11;
            iArr[c11] = i11;
            i11++;
            c11 = (char) (c11 + 1);
            c12 = (char) (c12 + 1);
        }
        f49468d = Character.toUpperCase('v');
        int[] iArr2 = new int[0];
        f49469e = iArr2;
        f49470f = new i[129];
        f49471g = new d.j[3][];
        f49472h = new d.i(inet.ipaddr.n.f49774e);
        f49473i = new h("", iArr2, null, h.f49382j);
        f49474j = new s();
        f49475k = new o.a().l(false).k(false).n(false).p(false).o(false).v();
        f49476l = new o.a().m(false).k(false).n(false).p(false).o(false).t().p(false).f().v();
        f49477m = new o.a().l(false).k(false).n(false).p(false).o(false).u().p(false).r(false).f().v();
        BigInteger[] bigIntegerArr = new BigInteger[10];
        f49478n = bigIntegerArr;
        f49479o = BigInteger.valueOf(-1L);
        f49480p = new long[]{0, 255, 65535, 16777215, Counter32.MAX_COUNTER32_VALUE};
        f49481q = new int[][]{new int[]{3, 6, 8, 11}, new int[]{8, 16, 24, 32}, new int[0], new int[0], new int[]{3, 6, 8, 11}, new int[]{3, 5, 8, 10}, new int[0], new int[0], new int[]{2, 4, 6, 8}};
        BigInteger bigIntegerValueOf = BigInteger.valueOf(85L);
        bigIntegerArr[0] = BigInteger.ONE;
        int i12 = 1;
        while (true) {
            BigInteger[] bigIntegerArr2 = f49478n;
            if (i12 >= bigIntegerArr2.length) {
                return;
            }
            bigIntegerArr2[i12] = bigIntegerArr2[i12 - 1].multiply(bigIntegerValueOf);
            i12++;
        }
    }

    private s() {
    }

    private static i A(CharSequence charSequence, inet.ipaddr.o oVar, inet.ipaddr.f fVar, c cVar, int i10) throws AddressStringException {
        int iW0 = cVar.W0();
        boolean zY0 = cVar.U0().y0();
        g.a aVarO0 = cVar.o0();
        if (cVar.X0()) {
            return J(charSequence, null, oVar, fVar, zY0, iW0, i10, aVarO0);
        }
        if (!cVar.h1()) {
            return h.f49382j;
        }
        if (cVar.Z0() && !cVar.d1()) {
            throw new AddressStringException(charSequence, iW0 - 1);
        }
        if (zY0) {
            throw new AddressStringException(charSequence, "ipaddress.error.only.zone");
        }
        return N(charSequence, oVar, zY0, iW0, i10, aVarO0);
    }

    private static BigInteger B(CharSequence charSequence, int i10, int i11) {
        int i12;
        int[] iArr = f49466b;
        BigInteger bigIntegerAdd = BigInteger.ZERO;
        while (true) {
            int i13 = i11 - i10;
            int i14 = 9;
            boolean z10 = i13 <= 9;
            if (z10) {
                i14 = i13;
                i12 = i11;
            } else {
                i12 = i10 + 9;
            }
            long j10 = iArr[charSequence.charAt(i10)];
            while (true) {
                i10++;
                if (i10 >= i12) {
                    break;
                }
                j10 = (j10 * 85) + iArr[charSequence.charAt(i10)];
            }
            bigIntegerAdd = bigIntegerAdd.multiply(f49478n[i14]).add(BigInteger.valueOf(j10));
            if (z10) {
                return bigIntegerAdd;
            }
            i10 = i12;
        }
    }

    private static boolean C(inet.ipaddr.o oVar, CharSequence charSequence, int i10, int i11, c cVar, int i12, int i13, int i14) throws AddressStringException {
        long j10;
        long j11;
        long j12;
        int i15;
        long j13;
        int i16;
        int i17;
        long jLongValue;
        long jLongValue2;
        int i18 = i10;
        int i19 = i11;
        int i20 = i12;
        a aVarU0 = cVar.U0();
        int i21 = 0;
        if (i20 < 0) {
            if (i13 == 20) {
                if (!oVar.f49784h) {
                    throw new AddressStringException(charSequence, "ipaddress.error.ipv6");
                }
                cVar.s1(g.a.IPV6);
                BigInteger bigIntegerB = B(charSequence, i10, i11);
                long jLongValue3 = bigIntegerB.and(f49479o).longValue();
                BigInteger bigIntegerShiftRight = bigIntegerB.shiftRight(64);
                long jLongValue4 = bigIntegerShiftRight.longValue();
                if (!bigIntegerShiftRight.shiftRight(64).equals(BigInteger.ZERO)) {
                    throw new AddressStringException(charSequence, "ipaddress.error.address.too.large");
                }
                aVarU0.t(1);
                aVarU0.s();
                e(i10, i11, i10, aVarU0, 0, jLongValue3, jLongValue4, 85);
                cVar.k1(true);
                return true;
            }
        } else if (i13 == 41 || (i13 == 21 && (i20 == 0 || i20 + 1 == i19))) {
            if (!oVar.f49784h) {
                throw new AddressStringException(charSequence, "ipaddress.error.ipv6");
            }
            j0 j0VarR = oVar.r();
            if (!j0VarR.f49297a.d()) {
                throw new AddressStringException(charSequence, "ipaddress.error.no.range");
            }
            cVar.s1(g.a.IPV6);
            if (i20 == i18 + 20) {
                BigInteger bigIntegerB2 = B(charSequence, i18, i20);
                BigInteger bigInteger = f49479o;
                long jLongValue5 = bigIntegerB2.and(bigInteger).longValue();
                long jLongValue6 = bigIntegerB2.shiftRight(64).longValue();
                int i22 = i20 + 1;
                if (i22 < i19) {
                    BigInteger bigIntegerB3 = B(charSequence, i22, i19);
                    jLongValue = bigIntegerB3.and(bigInteger).longValue();
                    BigInteger bigIntegerShiftRight2 = bigIntegerB3.shiftRight(64);
                    jLongValue2 = bigIntegerShiftRight2.longValue();
                    BigInteger bigIntegerShiftRight3 = bigIntegerShiftRight2.shiftRight(64);
                    if (bigIntegerB2.compareTo(bigIntegerB3) > 0) {
                        BigInteger bigIntegerShiftRight4 = bigIntegerShiftRight2.shiftRight(64);
                        if (!j0VarR.f49297a.h()) {
                            throw new AddressStringException(charSequence, "ipaddress.error.invalidRange");
                        }
                        if (!bigIntegerShiftRight4.equals(BigInteger.ZERO)) {
                            throw new AddressStringException(charSequence, "ipaddress.error.address.too.large");
                        }
                    } else {
                        if (!bigIntegerShiftRight3.equals(BigInteger.ZERO)) {
                            throw new AddressStringException(charSequence, "ipaddress.error.address.too.large");
                        }
                        i22 = i18;
                        i18 = i22;
                        i20 = i19;
                        i19 = i20;
                    }
                    int i23 = i20;
                    i20 = i19;
                    i19 = i23;
                } else {
                    if (!j0VarR.f49297a.c()) {
                        throw new AddressStringException(charSequence, "ipaddress.error.empty.segment.at.index", i14);
                    }
                    jLongValue = -1;
                    i21 = 4194304;
                    i22 = i18;
                    i18 = i19;
                    jLongValue2 = -1;
                }
                i15 = i20;
                i17 = i22;
                j13 = jLongValue2;
                j12 = jLongValue;
                j11 = jLongValue6;
                j10 = jLongValue5;
                i16 = i18;
            } else {
                if (i20 != 0) {
                    throw new AddressStringException(charSequence, i20);
                }
                if (!j0VarR.f49297a.c()) {
                    throw new AddressStringException(charSequence, "ipaddress.error.empty.segment.at.index", i14);
                }
                BigInteger bigIntegerB4 = B(charSequence, i20 + 1, i19);
                long jLongValue7 = bigIntegerB4.and(f49479o).longValue();
                BigInteger bigIntegerShiftRight5 = bigIntegerB4.shiftRight(64);
                long jLongValue8 = bigIntegerShiftRight5.longValue();
                if (!bigIntegerShiftRight5.shiftRight(64).equals(BigInteger.ZERO)) {
                    throw new AddressStringException(charSequence, "ipaddress.error.address.too.large");
                }
                j10 = 0;
                j11 = 0;
                j12 = jLongValue7;
                i15 = 0;
                j13 = jLongValue8;
                i16 = 1;
                i17 = 0;
                i21 = 2097152;
            }
            aVarU0.s();
            aVarU0.t(1);
            j(i17, i15, i17, i16, i19, i16, aVarU0, 0, j10, j11, j12, j13, i21 | 1048661, 85);
            cVar.k1(true);
            return true;
        }
        return false;
    }

    private static i D(CharSequence charSequence, inet.ipaddr.o oVar, boolean z10, int i10, int i11, g.a aVar) throws AddressStringException {
        if (i10 == i11 && !oVar.r().f49703k) {
            throw new AddressStringException(charSequence, "ipaddress.error.invalid.zone", i10);
        }
        StringBuilder sb2 = null;
        int i12 = i10;
        while (i12 < i11) {
            char cCharAt = charSequence.charAt(i12);
            if (cCharAt == '%') {
                if (i12 + 2 >= i11) {
                    throw new AddressStringException(charSequence, "ipaddress.error.invalid.zone.encoding", i12);
                }
                if (sb2 == null) {
                    sb2 = new StringBuilder(i11 - i10);
                    sb2.append(charSequence, i10, i12);
                }
                int[] iArr = f49467c;
                char c10 = (char) (iArr[charSequence.charAt(i12 + 1)] << 4);
                i12 += 2;
                cCharAt = (char) (iArr[charSequence.charAt(i12)] | c10);
            } else {
                if (cCharAt == '/') {
                    if (i12 != i10 || oVar.r().f49703k) {
                        return J(charSequence, sb2 != null ? sb2 : charSequence.subSequence(i10, i12), oVar, null, z10, i12 + 1, i11, aVar);
                    }
                    throw new AddressStringException(charSequence, "ipaddress.error.invalid.zone", i10);
                }
                if (x(cCharAt)) {
                    throw new AddressStringException(charSequence, "ipaddress.error.invalid.zone", i12);
                }
            }
            if (sb2 != null) {
                sb2.append(cCharAt);
            }
            i12++;
        }
        return sb2 == null ? new i(charSequence.subSequence(i10, i11)) : new i(sb2);
    }

    private static i E(CharSequence charSequence, inet.ipaddr.o oVar, inet.ipaddr.f fVar, boolean z10, boolean z11, c cVar, int i10, int i11) throws AddressStringException {
        boolean zY0 = cVar.U0().y0();
        g.a aVarO0 = cVar.o0();
        if (z10) {
            return J(charSequence, null, oVar, fVar, zY0, i10, i11, aVarO0);
        }
        if (!cVar.h1()) {
            return z11 ? I(charSequence, null, fVar, i10, i11) : h.f49382j;
        }
        if (zY0) {
            throw new AddressStringException(charSequence, "ipaddress.error.only.zone");
        }
        return D(charSequence, oVar, zY0, i10, i11, aVarO0);
    }

    private static i F(CharSequence charSequence, inet.ipaddr.o oVar, inet.ipaddr.f fVar, boolean z10, boolean z11, boolean z12, int i10, int i11, g.a aVar) {
        return z10 ? J(charSequence, null, oVar, fVar, z12, i10, i11, aVar) : z11 ? I(charSequence, null, fVar, i10, i11) : h.f49382j;
    }

    private static long G(CharSequence charSequence, int i10, int i11) {
        long j10 = f49467c[charSequence.charAt(i10)];
        while (true) {
            i10++;
            if (i10 >= i11) {
                return j10;
            }
            j10 = (j10 << 4) | r0[charSequence.charAt(i10)];
        }
    }

    private static long H(CharSequence charSequence, int i10, int i11) {
        long j10 = f49467c[charSequence.charAt(i10)];
        while (true) {
            i10++;
            if (i10 >= i11) {
                return j10;
            }
            j10 = charSequence.charAt(i10) == '1' ? (j10 << 1) | 1 : j10 << 1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d A[PHI: r12
  0x002d: PHI (r12v5 int) = (r12v2 int), (r12v6 int) binds: [B:19:0x0046, B:10:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static inet.ipaddr.format.validate.i I(java.lang.CharSequence r18, java.lang.CharSequence r19, inet.ipaddr.f r20, int r21, int r22) throws inet.ipaddr.AddressStringException {
        /*
            Method dump skipped, instructions count: 353
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: inet.ipaddr.format.validate.s.I(java.lang.CharSequence, java.lang.CharSequence, inet.ipaddr.f, int, int):inet.ipaddr.format.validate.i");
    }

    private static i J(CharSequence charSequence, CharSequence charSequence2, inet.ipaddr.o oVar, inet.ipaddr.f fVar, boolean z10, int i10, int i11, g.a aVar) throws AddressStringException {
        i iVarZ;
        if (oVar.f49782f && (iVarZ = Z(charSequence, charSequence2, oVar, fVar, i10, i11, aVar)) != null) {
            return iVarZ;
        }
        if (z10) {
            throw new AddressStringException(charSequence, "ipaddress.error.invalid.mask.address.empty");
        }
        if (!oVar.f49783g) {
            throw new AddressStringException(charSequence, oVar.f49782f ? "ipaddress.error.invalidCIDRPrefixOrMask" : "ipaddress.error.CIDRNotAllowed");
        }
        try {
            inet.ipaddr.o oVarU = U(oVar, aVar);
            r rVar = new r(null, charSequence, oVarU);
            X(oVarU, charSequence, i10, i11, rVar, false);
            a aVarU0 = rVar.U0();
            if (aVarU0.y0()) {
                throw new AddressStringException(charSequence, "ipaddress.error.invalid.mask.empty");
            }
            if (aVarU0.v()) {
                throw new AddressStringException(charSequence, "ipaddress.error.invalid.mask.wildcard");
            }
            m(charSequence, oVarU, rVar);
            int iA = aVarU0.a();
            if (iA != i11) {
                throw new AddressStringException(charSequence, "ipaddress.error.invalid.mask.extra.chars", iA + 1);
            }
            g.a aVarO0 = rVar.o0();
            if (aVarO0.isIPv4() && aVarU0.Z() == 1 && !aVarU0.r() && !oVar.p().f49534m) {
                throw new AddressStringException(charSequence, "ipaddress.error.mask.single.segment");
            }
            if (aVar != null && (aVarO0.isIPv4() != aVar.isIPv4() || aVarO0.isIPv6() != aVar.isIPv6())) {
                throw new AddressStringException(charSequence, "ipaddress.error.ipMismatch");
            }
            return new i(rVar, charSequence2);
        } catch (AddressStringException e10) {
            throw new AddressStringException(charSequence, "ipaddress.error.invalidCIDRPrefixOrMask", e10);
        }
    }

    private static void K(long j10, CharSequence charSequence, int i10, int i11, int i12, a aVar, int i13, int i14, d.a aVar2) throws AddressStringException {
        long jG;
        long j11;
        long j12;
        long jG2;
        int i15 = i11 - i12;
        n(charSequence, i10, i11, i15, aVar2);
        if (i12 < 16) {
            int i16 = i11 - 16;
            int i17 = i12 << 2;
            jG = G(charSequence, i16, i15) << i17;
            j11 = (~((-1) << i17)) | jG;
            jG2 = G(charSequence, i10, i16);
            j12 = jG2;
        } else {
            jG = 0;
            if (i12 == 16) {
                jG2 = j10;
                j12 = jG2;
                j11 = -1;
            } else {
                int i18 = (i12 - 16) << 2;
                long j13 = j10 << i18;
                j11 = -1;
                j12 = (~((-1) << i18)) | j13;
                jG2 = j13;
            }
        }
        h(i10, i11, i14, i10, i11, i14, aVar, i13, jG, jG2, j11, j12, 131072);
    }

    private static void L(CharSequence charSequence, int i10, int i11, int i12, a aVar, int i13, int i14, d.a aVar2) throws AddressStringException {
        long jH;
        long jH2;
        long jH3;
        long j10;
        int i15 = i11 - i12;
        n(charSequence, i10, i11, i15, aVar2);
        int i16 = i11 - 64;
        if (i12 < 64) {
            jH2 = H(charSequence, i16, i15) << i12;
            j10 = (~((-1) << i12)) | jH2;
            jH3 = H(charSequence, i10, i16);
            jH = jH3;
        } else if (i12 == 64) {
            jH = H(charSequence, i10, i16);
            j10 = -1;
            jH2 = 0;
            jH3 = jH;
        } else {
            int i17 = i12 - 64;
            long jH4 = H(charSequence, i10, i16 - i17) << i17;
            jH = (~((-1) << i17)) | jH4;
            jH2 = 0;
            jH3 = jH4;
            j10 = -1;
        }
        h(i10, i11, i14, i10, i11, i14, aVar, i13, jH2, jH3, j10, jH, 131072);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0044, code lost:
    
        if (r1 < inet.ipaddr.format.validate.s.f49470f.length) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x007a, code lost:
    
        if (r1 < inet.ipaddr.format.validate.s.f49470f.length) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x007c, code lost:
    
        r2 = inet.ipaddr.format.validate.s.f49470f;
        r3 = r2[r1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0080, code lost:
    
        if (r3 != null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0082, code lost:
    
        r3 = new inet.ipaddr.format.validate.i(l(r1), (java.lang.CharSequence) null);
        r2[r1] = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008d, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:?, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static inet.ipaddr.format.validate.i M(int r1, java.lang.CharSequence r2, java.lang.CharSequence r3, inet.ipaddr.o r4, int r5, int r6, inet.ipaddr.g.a r7) throws inet.ipaddr.AddressStringException {
        /*
            if (r5 != 0) goto L4
            int r6 = r6 + (-1)
        L4:
            java.lang.String r5 = "ipaddress.error.prefixSize"
            r0 = 0
            if (r7 == 0) goto L47
            boolean r7 = r7.isIPv4()
            if (r7 == 0) goto L47
            if (r6 <= 0) goto L26
            inet.ipaddr.ipv4.Z r6 = r4.p()
            boolean r6 = r6.f49800h
            if (r6 == 0) goto L1a
            goto L26
        L1a:
            inet.ipaddr.AddressStringException r1 = new inet.ipaddr.AddressStringException
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "ipaddress.error.ipv4.prefix.leading.zeros"
            r1.<init>(r2, r3)
            throw r1
        L26:
            inet.ipaddr.ipv4.Z r6 = r4.p()
            boolean r6 = r6.f49799g
            if (r6 != 0) goto L41
            r6 = 32
            if (r1 <= r6) goto L41
            boolean r1 = r4.f49295c
            if (r1 == 0) goto L37
            return r0
        L37:
            inet.ipaddr.AddressStringException r1 = new inet.ipaddr.AddressStringException
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r5)
            throw r1
        L41:
            inet.ipaddr.format.validate.i[] r2 = inet.ipaddr.format.validate.s.f49470f
            int r2 = r2.length
            if (r1 >= r2) goto L8e
            goto L7c
        L47:
            if (r6 <= 0) goto L5e
            inet.ipaddr.ipv6.j0 r6 = r4.r()
            boolean r6 = r6.f49800h
            if (r6 == 0) goto L52
            goto L5e
        L52:
            inet.ipaddr.AddressStringException r1 = new inet.ipaddr.AddressStringException
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "ipaddress.error.ipv6.prefix.leading.zeros"
            r1.<init>(r2, r3)
            throw r1
        L5e:
            inet.ipaddr.ipv6.j0 r4 = r4.r()
            boolean r4 = r4.f49799g
            if (r4 != 0) goto L75
            r4 = 128(0x80, float:1.8E-43)
            if (r1 > r4) goto L6b
            goto L75
        L6b:
            inet.ipaddr.AddressStringException r1 = new inet.ipaddr.AddressStringException
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r5)
            throw r1
        L75:
            if (r3 != 0) goto L8e
            inet.ipaddr.format.validate.i[] r2 = inet.ipaddr.format.validate.s.f49470f
            int r2 = r2.length
            if (r1 >= r2) goto L8e
        L7c:
            inet.ipaddr.format.validate.i[] r2 = inet.ipaddr.format.validate.s.f49470f
            r3 = r2[r1]
            if (r3 != 0) goto L8d
            inet.ipaddr.format.validate.i r3 = new inet.ipaddr.format.validate.i
            java.lang.Integer r4 = l(r1)
            r3.<init>(r4, r0)
            r2[r1] = r3
        L8d:
            return r3
        L8e:
            inet.ipaddr.format.validate.i r2 = new inet.ipaddr.format.validate.i
            java.lang.Integer r1 = l(r1)
            r2.<init>(r1, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: inet.ipaddr.format.validate.s.M(int, java.lang.CharSequence, java.lang.CharSequence, inet.ipaddr.o, int, int, inet.ipaddr.g$a):inet.ipaddr.format.validate.i");
    }

    private static i N(CharSequence charSequence, inet.ipaddr.o oVar, boolean z10, int i10, int i11, g.a aVar) throws AddressStringException {
        if (i10 == i11 && !oVar.r().f49703k) {
            throw new AddressStringException(charSequence, "ipaddress.error.invalid.zone", i10);
        }
        for (int i12 = i10; i12 < i11; i12++) {
            char cCharAt = charSequence.charAt(i12);
            if (cCharAt == '/') {
                if (i12 != i10 || oVar.r().f49703k) {
                    return J(charSequence, charSequence.subSequence(i10, i12), oVar, null, z10, i12 + 1, i11, aVar);
                }
                throw new AddressStringException(charSequence, "ipaddress.error.invalid.zone", i10);
            }
            if (cCharAt == ':') {
                throw new AddressStringException(charSequence, "ipaddress.error.invalid.zone", i12);
            }
        }
        return new i(charSequence.subSequence(i10, i11));
    }

    private static void O(long j10, CharSequence charSequence, int i10, int i11, int i12, a aVar, int i13, int i14, d.a aVar2) throws AddressStringException {
        long j11;
        long j12;
        long j13;
        int i15 = i11 - i12;
        n(charSequence, i10, i11, i15, aVar2);
        long jR = i10 < i15 ? R(j10, charSequence, i15 - i10) : 0L;
        if (i12 == 1) {
            j11 = jR * 10;
            j12 = 9;
        } else if (i12 == 2) {
            j11 = jR * 100;
            j12 = 99;
        } else {
            if (i12 != 3) {
                long jPow = (long) Math.pow(10.0d, i12);
                j11 = jR * jPow;
                j13 = (jPow + j11) - 1;
                i(i10, i11, i14, i10, i11, i14, aVar, i13, j11, j13, 131082, 10);
            }
            j11 = jR * 1000;
            j12 = 999;
        }
        j13 = j12 + j11;
        i(i10, i11, i14, i10, i11, i14, aVar, i13, j11, j13, 131082, 10);
    }

    private static void P(long j10, CharSequence charSequence, int i10, int i11, int i12, a aVar, int i13, int i14, d.a aVar2) throws AddressStringException {
        long j11;
        int i15 = i11 - i12;
        n(charSequence, i10, i11, i15, aVar2);
        long jS = (i10 < i15 ? S(j10, charSequence, i15 - i10) : 0L) << i12;
        switch (i12) {
            case 1:
                j11 = 1;
                break;
            case 2:
                j11 = 3;
                break;
            case 3:
                j11 = 7;
                break;
            case 4:
                j11 = 15;
                break;
            case 5:
                j11 = 31;
                break;
            case 6:
                j11 = 63;
                break;
            case 7:
                j11 = 127;
                break;
            case 8:
                j11 = 255;
                break;
            case 9:
                j11 = 511;
                break;
            case 10:
                j11 = 1023;
                break;
            case 11:
                j11 = 2047;
                break;
            case 12:
                j11 = 4095;
                break;
            case 13:
                j11 = 8191;
                break;
            case 14:
                j11 = 16383;
                break;
            case 15:
                j11 = 32767;
                break;
            case 16:
                j11 = 65535;
                break;
            default:
                j11 = ~((-1) << i12);
                break;
        }
        i(i10, i11, i14, i10, i11, i14, aVar, i13, jS, j11 | jS, 131074, 2);
    }

    private static void Q(long j10, CharSequence charSequence, int i10, int i11, int i12, a aVar, int i13, int i14, d.a aVar2) throws AddressStringException {
        long j11;
        long j12;
        long j13;
        long j14;
        int i15 = i11 - i12;
        n(charSequence, i10, i11, i15, aVar2);
        long jT = i10 < i15 ? T(j10, charSequence, i15 - i10) : 0L;
        if (i12 == 1) {
            j11 = jT << 3;
            j12 = 7;
        } else if (i12 == 2) {
            j11 = jT << 6;
            j12 = 63;
        } else {
            if (i12 != 3) {
                int i16 = i12 * 3;
                long j15 = jT << i16;
                j13 = (~((-1) << i16)) | j15;
                j14 = j15;
                i(i10, i11, i14, i10, i11, i14, aVar, i13, j14, j13, 131080, 8);
            }
            j11 = jT << 9;
            j12 = 511;
        }
        j13 = j12 | j11;
        j14 = j11;
        i(i10, i11, i14, i10, i11, i14, aVar, i13, j14, j13, 131080, 8);
    }

    private static long R(long j10, CharSequence charSequence, int i10) throws AddressStringException {
        long j11 = 15;
        long j12 = j10 & 15;
        if (j12 >= 10) {
            throw new AddressStringException(charSequence, "ipaddress.error.ipv4.invalid.decimal.digit");
        }
        int i11 = i10 - 1;
        if (i11 <= 0) {
            return j12;
        }
        long j13 = j12;
        int i12 = 10;
        long j14 = j10;
        while (true) {
            j14 >>>= 4;
            long j15 = j14 & j11;
            if (j15 >= 10) {
                throw new AddressStringException(charSequence, "ipaddress.error.ipv4.invalid.decimal.digit");
            }
            j13 += j15 * i12;
            i11--;
            if (i11 == 0) {
                return j13;
            }
            int i13 = 100;
            if (i12 == 10) {
                i12 = i13;
            } else if (i12 == 100) {
                i13 = 1000;
                i12 = i13;
            } else {
                i12 *= 10;
            }
            j11 = 15;
        }
    }

    private static long S(long j10, CharSequence charSequence, int i10) throws AddressStringException {
        long j11 = j10 & 15;
        if (j11 > 1) {
            throw new AddressStringException(charSequence, "ipaddress.error.ipv4.invalid.binary.digit");
        }
        int i11 = 0;
        while (true) {
            i10--;
            if (i10 <= 0) {
                return j11;
            }
            i11++;
            j10 >>>= 4;
            long j12 = j10 & 15;
            if (j12 >= 1) {
                if (j12 != 1) {
                    throw new AddressStringException(charSequence, "ipaddress.error.ipv4.invalid.binary.digit");
                }
                j11 |= 1 << i11;
            }
        }
    }

    private static long T(long j10, CharSequence charSequence, int i10) throws AddressStringException {
        long j11 = j10 & 15;
        if (j11 >= 8) {
            throw new AddressStringException(charSequence, "ipaddress.error.ipv4.invalid.octal.digit");
        }
        int i11 = 0;
        while (true) {
            i10--;
            if (i10 <= 0) {
                return j11;
            }
            i11 += 3;
            j10 >>>= 4;
            long j12 = j10 & 15;
            if (j12 >= 8) {
                throw new AddressStringException(charSequence, "ipaddress.error.ipv4.invalid.octal.digit");
            }
            j11 |= j12 << i11;
        }
    }

    private static inet.ipaddr.o U(inet.ipaddr.o oVar, g.a aVar) {
        o.a aVarB = null;
        if (aVar == null || aVar.isIPv6()) {
            j0 j0VarR = oVar.r();
            if (!j0VarR.f49297a.t()) {
                aVarB = oVar.B();
                aVarB.u().w(d.c.f49308f);
            }
            if (j0VarR.f49701i && !j0VarR.r().p().f49297a.t()) {
                if (aVarB == null) {
                    aVarB = oVar.B();
                }
                aVarB.u().w(d.c.f49308f);
            }
        }
        if ((aVar == null || aVar.isIPv4()) && !oVar.p().f49297a.t()) {
            if (aVarB == null) {
                aVarB = oVar.B();
            }
            aVarB.t().r(d.c.f49308f);
        }
        if (oVar.f49294b) {
            if (aVarB == null) {
                aVarB = oVar.B();
            }
            aVarB.j(false);
        }
        return aVarB == null ? oVar : aVarB.v();
    }

    /* JADX WARN: Code restructure failed: missing block: B:139:0x03a5, code lost:
    
        throw new inet.ipaddr.AddressStringException(r15, r7, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x047d, code lost:
    
        throw new inet.ipaddr.AddressStringException(r15, "ipaddress.error.empty.segment.at.index", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x0933, code lost:
    
        throw new inet.ipaddr.AddressStringException(r8, r15, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:464:0x0b2c, code lost:
    
        throw new inet.ipaddr.AddressStringException(r8, r14, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:685:0x1039, code lost:
    
        throw new inet.ipaddr.AddressStringException(r8, r0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:749:0x11c3, code lost:
    
        if (r15 <= 19) goto L750;
     */
    /* JADX WARN: Code restructure failed: missing block: B:797:0x126b, code lost:
    
        throw new inet.ipaddr.AddressStringException(r8, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:810:0x12a6, code lost:
    
        throw new inet.ipaddr.AddressStringException(r8, r14);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:210:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0864  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0878  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x08d2  */
    /* JADX WARN: Removed duplicated region for block: B:638:0x0f53  */
    /* JADX WARN: Removed duplicated region for block: B:664:0x0fb1  */
    /* JADX WARN: Removed duplicated region for block: B:669:0x0fd1  */
    /* JADX WARN: Removed duplicated region for block: B:671:0x0fe3  */
    /* JADX WARN: Removed duplicated region for block: B:672:0x0ff7  */
    /* JADX WARN: Removed duplicated region for block: B:739:0x11aa  */
    /* JADX WARN: Removed duplicated region for block: B:775:0x1222  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void V(inet.ipaddr.o r96, inet.ipaddr.p r97, java.lang.CharSequence r98, int r99, int r100, inet.ipaddr.format.validate.c r101, inet.ipaddr.format.validate.e r102, boolean r103) throws inet.ipaddr.AddressStringException {
        /*
            Method dump skipped, instructions count: 4916
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: inet.ipaddr.format.validate.s.V(inet.ipaddr.o, inet.ipaddr.p, java.lang.CharSequence, int, int, inet.ipaddr.format.validate.c, inet.ipaddr.format.validate.e, boolean):void");
    }

    private static void X(inet.ipaddr.o oVar, CharSequence charSequence, int i10, int i11, c cVar, boolean z10) throws AddressStringException {
        V(oVar, null, charSequence, i10, i11, cVar, null, z10);
    }

    private static i Z(CharSequence charSequence, CharSequence charSequence2, inet.ipaddr.o oVar, inet.ipaddr.f fVar, int i10, int i11, g.a aVar) throws AddressStringException {
        i iVar;
        int i12 = i11;
        if (i10 == charSequence.length()) {
            return null;
        }
        int[] iArr = f49467c;
        boolean z10 = false;
        int i13 = i10;
        int i14 = 0;
        int i15 = 0;
        boolean z11 = false;
        while (true) {
            if (i13 >= i12) {
                iVar = null;
                z10 = true;
                break;
            }
            char cCharAt = charSequence.charAt(i13);
            if (cCharAt >= '1' && cCharAt <= '9') {
                i14 = (i14 * 10) + iArr[cCharAt];
                z11 = true;
            } else if (cCharAt == '0') {
                if (z11) {
                    i14 *= 10;
                } else {
                    i15++;
                }
            } else if (cCharAt != ':' || fVar == null || (!(fVar.f49331g || fVar.f49332h) || i13 <= i10)) {
                iVar = null;
            } else {
                try {
                    i iVarI = I(charSequence, charSequence2, fVar, i13 + 1, i12);
                    i12 = i13;
                    z10 = true;
                    iVar = iVarI;
                } catch (AddressStringException unused) {
                    return null;
                }
            }
            i13++;
        }
        if (!z10) {
            return null;
        }
        i iVarM = M(i14, charSequence, charSequence2, oVar, i12 - i10, i15, aVar);
        if (iVar == null) {
            return iVarM;
        }
        iVar.B(iVarM);
        return iVar;
    }

    public static int a0(CharSequence charSequence) {
        int i10 = 0;
        while (i10 < charSequence.length()) {
            char cCharAt = charSequence.charAt(i10);
            if (cCharAt == '/' || cCharAt == ':') {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    private static void c(int i10, int i11, a aVar, int i12, int i13) {
        aVar.G0(i12, 1, i13, 6, i10, 7, i11, 9, i13, 14, i10, 15, i11);
    }

    private static void d(int i10, int i11, int i12, a aVar, int i13, long j10, int i14) {
        aVar.F(i13, 0, i14, 9, i12, 1, i12, 14, i10, 6, i10, 15, i11, 7, i11, 2, j10, 10, j10);
    }

    private static void e(int i10, int i11, int i12, a aVar, int i13, long j10, long j11, int i14) {
        aVar.J(i13, 0, i14, 1, i12, 6, i10, 7, i11, 9, i12, 14, i10, 15, i11, 2, j10, 4, j11, 10, j10, 12, j11);
    }

    private static void f(int i10, int i11, a aVar, int i12, int i13, int i14) {
        aVar.K(i12, 0, i13, 1, i14, 6, i10, 7, i11, 9, i14, 14, i10, 15, i11);
    }

    private static void g(int i10, int i11, int i12, int i13, int i14, int i15, a aVar, int i16, long j10, long j11, int i17) {
        aVar.F(i16, 0, i17, 1, i12, 6, i10, 7, i11, 9, i15, 14, i13, 15, i14, 2, j10, 10, j11);
    }

    private static void h(int i10, int i11, int i12, int i13, int i14, int i15, a aVar, int i16, long j10, long j11, long j12, long j13, int i17) {
        aVar.J(i16, 0, i17, 1, i12, 6, i10, 7, i11, 9, i15, 14, i13, 15, i14, 2, j10, 4, j11, 10, j12, 12, j13);
    }

    private static void i(int i10, int i11, int i12, int i13, int i14, int i15, a aVar, int i16, long j10, long j11, int i17, int i18) {
        aVar.P(i16, 0, i17, 1, i12, 6, i10, 7, i11, 8, i18, 9, i15, 14, i13, 15, i14, 2, j10, 10, j11);
    }

    private static void j(int i10, int i11, int i12, int i13, int i14, int i15, a aVar, int i16, long j10, long j11, long j12, long j13, int i17, int i18) {
        aVar.S(i16, 0, i17, 1, i12, 6, i10, 7, i11, 8, i18, 9, i15, 14, i13, 15, i14, 2, j10, 4, j11, 10, j12, 12, j13);
    }

    private static void k(long j10, CharSequence charSequence, int i10, int i11, int i12, a aVar, int i13, int i14, d.a aVar2) throws AddressStringException {
        n(charSequence, i10, i11, i11 - i12, aVar2);
        int i15 = i12 << 2;
        long j11 = j10 << i15;
        g(i10, i11, i14, i10, i11, i14, aVar, i13, j11, j11 | (~((-1) << i15)), 131072);
    }

    private static Integer l(int i10) {
        return g.a(i10);
    }

    private static void m(CharSequence charSequence, inet.ipaddr.o oVar, c cVar) throws AddressStringException {
        long jT;
        a aVarU0 = cVar.U0();
        int iZ = aVarU0.Z();
        if (!cVar.o0().isIPv4()) {
            if (cVar.g1()) {
                iZ += 2;
            }
            if ((!aVarU0.r() || !oVar.r().f49298b) && iZ != 1 && iZ < 8 && !cVar.a1()) {
                throw new AddressStringException(charSequence, "ipaddress.error.too.few.segments");
            }
            return;
        }
        int i10 = 4 - iZ;
        Z zP = oVar.p();
        boolean z10 = aVarU0.r() && zP.f49298b;
        if (i10 > 0 && iZ > 1) {
            if (zP.f49533l) {
                cVar.v1(true);
            } else if (!z10) {
                throw new AddressStringException(charSequence, "ipaddress.error.ipv4.too.few.segments");
            }
        }
        boolean z11 = zP.f49300d;
        boolean z12 = i10 > 0 && zP.f49533l;
        for (int i11 = 0; i11 < iZ; i11++) {
            if (z12 && i11 == iZ - 1) {
                jT = t(5 - iZ);
                if (aVarU0.y(i11)) {
                    cVar.N0(i11, 10, jT);
                }
            } else {
                jT = 255;
            }
            if (cVar.g(i11, 131072)) {
                if (cVar.o(i11, 2) > jT) {
                    throw new AddressStringException(charSequence, "ipaddress.error.ipv4.segment.too.large");
                }
                if (cVar.o(i11, 10) > jT) {
                    cVar.N0(i11, 10, jT);
                }
                if (z11) {
                    continue;
                } else {
                    int iL = aVarU0.l(i11, 0);
                    if ((cVar.h(i11, 7) - cVar.h(i11, 1)) - u(iL) > s(i10, iL)) {
                        throw new AddressStringException(charSequence, "ipaddress.error.segment.too.long");
                    }
                }
            } else {
                if (cVar.o(i11, 10) > jT) {
                    throw new AddressStringException(charSequence, "ipaddress.error.ipv4.segment.too.large");
                }
                if (z11) {
                    continue;
                } else {
                    int iL2 = aVarU0.l(i11, 0);
                    int iS = s(i10, iL2);
                    int iH = cVar.h(i11, 7);
                    int iH2 = cVar.h(i11, 15);
                    if ((iH - cVar.h(i11, 1)) - u(iL2) > iS) {
                        throw new AddressStringException(charSequence, "ipaddress.error.segment.too.long");
                    }
                    if (iH != iH2) {
                        int iL3 = cVar.l(i11, 8);
                        if ((iH2 - cVar.h(i11, 9)) - u(iL3) > s(i10, iL3)) {
                            throw new AddressStringException(charSequence, "ipaddress.error.segment.too.long");
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
    }

    private static void n(CharSequence charSequence, int i10, int i11, int i12, d.a aVar) throws AddressStringException {
        if (!aVar.f49297a.l()) {
            throw new AddressStringException(charSequence, "ipaddress.error.no.single.wildcard");
        }
        while (i12 < i11) {
            if (charSequence.charAt(i12) != '_') {
                throw new AddressStringException(charSequence, "ipaddress.error.single.wildcard.order");
            }
            i12++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c2 A[Catch: AddressStringException -> 0x00bd, TryCatch #2 {AddressStringException -> 0x00bd, blocks: (B:36:0x0095, B:40:0x00ac, B:46:0x00c2, B:48:0x00d2), top: B:67:0x0095 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static inet.ipaddr.format.validate.h.a o(java.lang.String r18, int r19, inet.ipaddr.format.validate.i r20) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: inet.ipaddr.format.validate.s.o(java.lang.String, int, inet.ipaddr.format.validate.i):inet.ipaddr.format.validate.h$a");
    }

    private static d p(Zf.f fVar, CharSequence charSequence, inet.ipaddr.o oVar, r rVar, i iVar) throws AddressStringException {
        g.a aVarO0 = rVar.o0();
        if (aVarO0 != null) {
            if (rVar.h1() && aVarO0.isIPv4()) {
                throw new AddressStringException(charSequence, "ipaddress.error.only.ipv6.has.zone");
            }
            rVar.q1(iVar);
            m(charSequence, oVar, rVar);
            return rVar;
        }
        g.a aVarP = iVar.p(oVar);
        g.a aVarT = oVar.t();
        if (aVarP == null) {
            rVar.s1(aVarT);
            aVarP = aVarT;
        } else if (aVarT != null && !aVarP.equals(aVarT)) {
            throw new AddressStringException(charSequence, aVarP == g.a.IPV6 ? "ipaddress.error.ipv6" : "ipaddress.error.ipv4");
        }
        if (!rVar.U0().y0()) {
            return new d.f(iVar, aVarP, fVar, oVar);
        }
        Integer numF0 = iVar.F0();
        if (numF0 == null) {
            return oVar.f49781e ? oVar == inet.ipaddr.n.f49774e ? f49472h : new d.i(oVar) : d.f49370r0;
        }
        int iIntValue = numF0.intValue();
        inet.ipaddr.o oVar2 = inet.ipaddr.n.f49774e;
        if (oVar != oVar2 || numF0.intValue() > 128) {
            return new d.j(numF0, aVarP, oVar);
        }
        char c10 = aVarP == null ? (char) 0 : aVarP.isIPv4() ? (char) 1 : (char) 2;
        d.j[][] jVarArr = f49471g;
        d.j[] jVarArr2 = jVarArr[c10];
        if (jVarArr2 == null) {
            jVarArr2 = new d.j[129];
            jVarArr[c10] = jVarArr2;
        }
        d.j jVar = jVarArr2[iIntValue];
        if (jVar != null) {
            return jVar;
        }
        d.j jVar2 = new d.j(numF0, aVarP, oVar2);
        jVarArr2[iIntValue] = jVar2;
        return jVar2;
    }

    private static CharSequence q(String str, int i10) throws AddressStringException {
        StringBuilder sb2 = new StringBuilder(i10);
        int i11 = 0;
        for (int i12 = i10 - 1; i12 > 0; i12--) {
            char cCharAt = str.charAt(i12);
            if (cCharAt == '.') {
                if (i10 - i12 <= 1) {
                    throw new AddressStringException(str, i12);
                }
                for (int i13 = i12 + 1; i13 < i10; i13++) {
                    sb2.append(str.charAt(i13));
                }
                sb2.append(cCharAt);
                i11++;
                i10 = i12;
            }
        }
        for (int i14 = 0; i14 < i10; i14++) {
            sb2.append(str.charAt(i14));
        }
        if (i11 + 1 == 4) {
            return sb2;
        }
        throw new AddressStringException(str, 0);
    }

    private static CharSequence r(String str, int i10) throws AddressStringException {
        boolean z10;
        StringBuilder sb2 = new StringBuilder(i10);
        StringBuilder sb3 = new StringBuilder();
        StringBuilder sb4 = new StringBuilder();
        boolean z11 = true;
        int i11 = i10 - 1;
        int i12 = 0;
        while (i11 >= 0) {
            int i13 = 0;
            boolean z12 = false;
            while (i13 < 4) {
                int i14 = i11 - 1;
                char cCharAt = str.charAt(i11);
                if (i14 >= 0) {
                    int i15 = i11 - 2;
                    char cCharAt2 = str.charAt(i14);
                    if (cCharAt2 == '.') {
                        if (cCharAt == '*') {
                            sb3.append('0');
                            sb4.append('f');
                            z12 = true;
                        } else {
                            if (z12) {
                                throw new AddressStringException(str, i11 - 1);
                            }
                            sb3.append(cCharAt);
                            sb4.append(cCharAt);
                        }
                        z10 = true;
                    } else {
                        if (cCharAt2 != '-') {
                            throw new AddressStringException(str, i11 - 1);
                        }
                        sb4.append(cCharAt);
                        z10 = true;
                        if (i15 < 1) {
                            throw new AddressStringException(str, i15);
                        }
                        int i16 = i11 - 3;
                        char cCharAt3 = str.charAt(i15);
                        sb3.append(cCharAt3);
                        boolean z13 = cCharAt3 == '0' && cCharAt == 'f';
                        if (z12 && !z13) {
                            throw new AddressStringException(str, i11 - 2);
                        }
                        i15 = i11 - 4;
                        if (str.charAt(i16) != '.') {
                            throw new AddressStringException(str, i11 - 3);
                        }
                        z12 = true;
                    }
                    i11 = i15;
                } else {
                    z10 = z11;
                    if (i13 < 3) {
                        throw new AddressStringException(str, i11);
                    }
                    if (cCharAt == '*') {
                        sb3.append('0');
                        sb4.append('f');
                        i11 = i14;
                        z12 = z10;
                    } else {
                        if (z12) {
                            throw new AddressStringException(str, 0);
                        }
                        sb3.append(cCharAt);
                        sb4.append(cCharAt);
                        i11 = i14;
                    }
                }
                i13++;
                z11 = z10;
            }
            i12++;
            if (sb2.length() > 0) {
                sb2.append(':');
            }
            sb2.append((CharSequence) sb3);
            if (z12) {
                sb2.append('-');
                sb2.append((CharSequence) sb4);
            }
            sb3.setLength(0);
            sb4.setLength(0);
        }
        if (i12 == 8) {
            return sb2;
        }
        throw new AddressStringException(str, 0);
    }

    private static int s(int i10, int i11) {
        try {
            return f49481q[i11 >>> 1][i10];
        } catch (ArrayIndexOutOfBoundsException unused) {
            return 0;
        }
    }

    private static long t(int i10) {
        return f49480p[i10];
    }

    private static int u(int i10) {
        if (i10 != 2) {
            if (i10 == 10) {
                return 0;
            }
            if (i10 != 16) {
                return 1;
            }
        }
        return 2;
    }

    private static boolean v(CharSequence charSequence, int i10) {
        char cCharAt = charSequence.charAt(i10);
        return cCharAt == 'b' || cCharAt == 'B';
    }

    private static boolean w(char c10) {
        return c10 == 'x' || c10 == 'X';
    }

    public static boolean x(char c10) {
        return !((c10 >= '0' && c10 <= '9') || (c10 >= 'A' && c10 <= 'Z') || ((c10 >= 'a' && c10 <= 'z') || c10 == '-' || c10 == '.' || c10 == '_' || c10 == '~'));
    }

    private static boolean y(int i10, int i11, boolean z10, int i12, int i13, Z z11) throws AddressStringException {
        boolean z12;
        boolean z13 = i10 <= 11 || ((z12 = z11.f49798f) && i11 == 34) || (z10 && i11 == 0 && (i13 <= 11 || (z12 && i13 == 34)));
        if (!z13 || !z10 || i11 == 0 || i12 <= 11 || ((z11.f49798f && i13 == 34) || i13 == 0)) {
            return z13;
        }
        throw new AddressStringException("ipaddress.error.too.few.segments.digit.count");
    }

    private static boolean z(int i10, boolean z10, int i11, j0 j0Var) throws AddressStringException {
        boolean z11;
        boolean z12 = i10 == 32 || ((z11 = j0Var.f49798f) && i10 == 130) || (z10 && i10 == 0 && (i11 == 32 || (z11 && i11 == 130)));
        if (!z12 || !z10 || i10 == 0 || i11 == 32 || ((j0Var.f49798f && i11 == 130) || i11 == 0)) {
            return z12;
        }
        throw new AddressStringException("ipaddress.error.too.few.segments.digit.count");
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:96)
        */
    public inet.ipaddr.format.validate.h W(inet.ipaddr.e r44) {
        /*
            Method dump skipped, instructions count: 1725
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: inet.ipaddr.format.validate.s.W(inet.ipaddr.e):inet.ipaddr.format.validate.h");
    }

    public d Y(inet.ipaddr.n nVar) throws AddressStringException {
        String string = nVar.toString();
        inet.ipaddr.o oVarH = nVar.h();
        r rVar = new r(nVar, string, oVarH);
        X(oVarH, string, 0, string.length(), rVar, false);
        return p(nVar, string, oVarH, rVar, A(string, oVarH, null, rVar, string.length()));
    }

    @Override // inet.ipaddr.format.validate.b
    public d a(inet.ipaddr.n nVar) {
        return Y(nVar);
    }

    @Override // inet.ipaddr.format.validate.b
    public h b(inet.ipaddr.e eVar) {
        return W(eVar);
    }
}
