package inet.ipaddr.format.validate;

import com.google.ar.core.ImageMetadata;
import java.io.Serializable;
import java.math.BigInteger;
import org.snmp4j.smi.Counter32;

/* loaded from: classes4.dex */
abstract class a implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private int[] f49345a;

    /* renamed from: b, reason: collision with root package name */
    private int f49346b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f49347c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f49348d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f49349e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f49350f;

    /* renamed from: g, reason: collision with root package name */
    private int f49351g = -1;

    /* renamed from: h, reason: collision with root package name */
    private int f49352h = -1;

    /* renamed from: i, reason: collision with root package name */
    private int f49353i;

    /* renamed from: j, reason: collision with root package name */
    protected final CharSequence f49354j;

    a(CharSequence charSequence) {
        this.f49354j = charSequence;
    }

    private static void K0(int i10, int[] iArr, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, long j10, int i26, long j11) {
        iArr[i10 | i11] = i12;
        iArr[i10 | i13] = i14;
        iArr[i10 | i15] = i16;
        iArr[i10 | i17] = i18;
        iArr[i10 | i19] = i20;
        iArr[i10 | i21] = i22;
        iArr[i10 | i23] = i24;
        int i27 = i10 | i25;
        iArr[i27] = (int) (j10 >>> 32);
        iArr[i27 | 1] = (int) j10;
        int i28 = i10 | i26;
        iArr[i28] = (int) (j11 >>> 32);
        iArr[i28 | 1] = (int) j11;
    }

    static int j(int i10, int i11, int[] iArr) {
        return iArr[(i10 << 4) | i11];
    }

    protected static long p(int i10, int i11, int[] iArr) {
        int i12 = (i10 << 4) | i11;
        return (iArr[i12 | 1] & Counter32.MAX_COUNTER32_VALUE) | (iArr[i12] << 32);
    }

    boolean B() {
        return this.f49350f;
    }

    boolean C(int i10) {
        return g(i10, ImageMetadata.CONTROL_AE_ANTIBANDING_MODE);
    }

    void C0(boolean z10) {
        this.f49348d = z10;
    }

    void E() {
        this.f49345a = null;
    }

    void E0() {
        this.f49347c = true;
    }

    void F(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, long j10, int i26, long j11) {
        K0(i10 << 4, m(), i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24, i25, j10, i26, j11);
    }

    void G0(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22) {
        int i23 = i10 << 4;
        int[] iArrM = m();
        iArrM[i11 | i23] = i12;
        iArrM[i23 | i13] = i14;
        iArrM[i23 | i15] = i16;
        iArrM[i23 | i17] = i18;
        iArrM[i23 | i19] = i20;
        iArrM[i23 | i21] = i22;
    }

    void J(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, long j10, int i26, long j11, int i27, long j12, int i28, long j13) {
        int i29 = i10 << 4;
        int[] iArrM = m();
        K0(i29, iArrM, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24, i25, j10, i26, j11);
        int i30 = i29 | i27;
        iArrM[i30] = (int) (j12 >>> 32);
        iArrM[i30 | 1] = (int) j12;
        int i31 = i29 | i28;
        iArrM[i31] = (int) (j13 >>> 32);
        iArrM[i31 | 1] = (int) j13;
    }

    void K(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24) {
        int i25 = i10 << 4;
        int[] iArrM = m();
        iArrM[i25 | i11] = i12;
        iArrM[i25 | i13] = i14;
        iArrM[i25 | i15] = i16;
        iArrM[i25 | i17] = i18;
        iArrM[i25 | i19] = i20;
        iArrM[i25 | i21] = i22;
        iArrM[i25 | i23] = i24;
    }

    void M0() {
        this.f49350f = true;
    }

    void N0(int i10, int i11, long j10) {
        int i12 = (i10 << 4) | i11;
        int[] iArrM = m();
        iArrM[i12] = (int) (j10 >>> 32);
        iArrM[i12 | 1] = (int) j10;
    }

    void P(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, long j10, int i28, long j11) {
        int i29 = i10 << 4;
        int[] iArrM = m();
        K0(i29, iArrM, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24, i27, j10, i28, j11);
        iArrM[i29 | i25] = i26;
    }

    void P0(StringBuilder sb2) {
        char c10;
        BigInteger bigIntegerOr;
        int i10;
        char c11;
        CharSequence charSequenceN = n();
        sb2.append("address string: ");
        sb2.append(charSequenceN);
        char c12 = '\n';
        sb2.append('\n');
        int iA = a();
        if (iA > 0 && iA < charSequenceN.length()) {
            sb2.append("address end: ");
            sb2.append(charSequenceN.subSequence(iA, charSequenceN.length()));
            sb2.append('\n');
        }
        int iZ = Z();
        sb2.append("segment count: ");
        sb2.append(iZ);
        sb2.append('\n');
        if (iZ <= 0) {
            if (y0()) {
                sb2.append("is empty");
                sb2.append('\n');
                return;
            } else {
                if (v()) {
                    sb2.append("is all addresses");
                    sb2.append('\n');
                    return;
                }
                return;
            }
        }
        int i11 = 0;
        while (i11 < iZ) {
            sb2.append("segment ");
            sb2.append(i11);
            sb2.append(":\n");
            if (C(i11)) {
                sb2.append("\tis wildcard");
                sb2.append(c12);
                c11 = c12;
                i10 = iZ;
            } else {
                long jO = o(i11, 2);
                long jO2 = o(i11, c12);
                long jO3 = o(i11, 12);
                long jO4 = o(i11, 4);
                if (jO4 != 0) {
                    bigIntegerOr = BigInteger.valueOf(jO4).shiftLeft(64).or(BigInteger.valueOf(jO));
                    sb2.append("\tvalue: ");
                    sb2.append(bigIntegerOr);
                    c10 = '\n';
                    sb2.append('\n');
                    sb2.append("\tvalue in hex: ");
                    sb2.append(bigIntegerOr.toString(16));
                    sb2.append('\n');
                } else {
                    c10 = '\n';
                    sb2.append("\tvalue: ");
                    sb2.append(jO);
                    sb2.append('\n');
                    sb2.append("\tvalue in hex: ");
                    sb2.append(Long.toHexString(jO));
                    sb2.append('\n');
                    bigIntegerOr = null;
                }
                sb2.append("\tstring: ");
                sb2.append(charSequenceN.subSequence(h(i11, 6), h(i11, 7)));
                sb2.append(c10);
                sb2.append("\tradix: ");
                sb2.append(l(i11, 0));
                sb2.append(c10);
                sb2.append("\tis standard: ");
                sb2.append(g(i11, 262144));
                sb2.append(c10);
                i10 = iZ;
                if (jO3 != 0) {
                    BigInteger bigIntegerOr2 = BigInteger.valueOf(jO3).shiftLeft(64).or(BigInteger.valueOf(jO2));
                    if (bigIntegerOr2.equals(bigIntegerOr)) {
                        c11 = '\n';
                    } else {
                        sb2.append("\tupper value: ");
                        sb2.append(bigIntegerOr2);
                        c11 = '\n';
                        sb2.append('\n');
                        sb2.append("\tupper value in hex: ");
                        sb2.append(bigIntegerOr2.toString(16));
                        sb2.append('\n');
                        sb2.append("\tupper string: ");
                        sb2.append(charSequenceN.subSequence(h(i11, 14), h(i11, 15)));
                        sb2.append('\n');
                        sb2.append("\tupper radix: ");
                        sb2.append(l(i11, 8));
                        sb2.append('\n');
                        sb2.append("\tis standard range: ");
                        sb2.append(g(i11, ImageMetadata.LENS_APERTURE));
                        sb2.append('\n');
                    }
                } else {
                    c11 = '\n';
                    if (jO2 != jO) {
                        sb2.append("\tupper value: ");
                        sb2.append(jO2);
                        sb2.append('\n');
                        sb2.append("\tupper value in hex: ");
                        sb2.append(Long.toHexString(jO2));
                        sb2.append('\n');
                        sb2.append("\tupper string: ");
                        sb2.append(charSequenceN.subSequence(h(i11, 14), h(i11, 15)));
                        sb2.append('\n');
                        sb2.append("\tupper radix: ");
                        sb2.append(l(i11, 8));
                        sb2.append('\n');
                        sb2.append("\tis standard range: ");
                        sb2.append(g(i11, ImageMetadata.LENS_APERTURE));
                        sb2.append('\n');
                    }
                }
                if (g(i11, 131072)) {
                    sb2.append("\thas single wildcard: ");
                    sb2.append(c11);
                }
            }
            i11++;
            c12 = c11;
            iZ = i10;
        }
        char c13 = c12;
        sb2.append("has a wildcard segment: ");
        sb2.append(r());
        sb2.append(c13);
        int iC = c();
        if (iC >= 0) {
            sb2.append("has compressed segment(s) at character ");
            sb2.append(iC + 1);
            sb2.append(c13);
        }
        if (B()) {
            sb2.append("is single segment");
            sb2.append(c13);
        }
    }

    void S(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, long j10, int i28, long j11, int i29, long j12, int i30, long j13) {
        int i31 = i10 << 4;
        int[] iArrM = m();
        K0(i31, iArrM, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24, i27, j10, i28, j11);
        iArrM[i31 | i25] = i26;
        int i32 = i31 | i29;
        iArrM[i32] = (int) (j12 >>> 32);
        iArrM[i32 | 1] = (int) j12;
        int i33 = i31 | i30;
        iArrM[i33] = (int) (j13 >>> 32);
        iArrM[i33 | 1] = (int) j13;
    }

    void T(int i10) {
        this.f49353i = i10;
    }

    public int Z() {
        return this.f49346b;
    }

    int a() {
        return this.f49353i;
    }

    void b0() {
        this.f49349e = true;
    }

    int c() {
        return this.f49351g;
    }

    int d() {
        return this.f49352h;
    }

    void d0(int i10, int i11) {
        int[] iArrM = m();
        int i12 = i10 << 4;
        iArrM[i12] = ((i11 << 8) & 65280) | iArrM[i12];
    }

    void f0(int i10) {
        this.f49351g = i10;
    }

    boolean g(int i10, int i11) {
        return (m()[i10 << 4] & i11) != 0;
    }

    int h(int i10, int i11) {
        return j(i10, i11, m());
    }

    int l(int i10, int i11) {
        int i12 = m()[(i10 << 4) | i11] & 255;
        if (i12 == 0) {
            return 16;
        }
        return i12;
    }

    int[] m() {
        return this.f49345a;
    }

    CharSequence n() {
        return this.f49354j;
    }

    long o(int i10, int i11) {
        return p(i10, i11, m());
    }

    void q0(int i10) {
        this.f49352h = i10;
    }

    boolean r() {
        return this.f49347c;
    }

    void s() {
        this.f49346b++;
    }

    void t(int i10) {
        this.f49345a = new int[i10 == 4 ? 64 : i10 == 8 ? 128 : i10 == 1 ? 16 : i10 * 16];
    }

    boolean v() {
        return this.f49349e;
    }

    boolean y(int i10) {
        return g(i10, 4194304);
    }

    public boolean y0() {
        return this.f49348d;
    }
}
