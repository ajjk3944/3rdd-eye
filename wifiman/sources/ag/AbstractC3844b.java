package ag;

import ag.AbstractC3846d;
import bg.d;
import dg.InterfaceC5372b;
import dg.InterfaceC5374d;
import inet.ipaddr.j;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.function.Supplier;

/* renamed from: ag.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3844b implements InterfaceC3848f {

    /* renamed from: d, reason: collision with root package name */
    private static final j.c f26195d;

    /* renamed from: e, reason: collision with root package name */
    private static final j.c f26196e;

    /* renamed from: f, reason: collision with root package name */
    private static final j.c f26197f;

    /* renamed from: g, reason: collision with root package name */
    private static final String[] f26198g;

    /* renamed from: h, reason: collision with root package name */
    protected static final char[] f26199h;

    /* renamed from: i, reason: collision with root package name */
    public static final char[] f26200i;

    /* renamed from: j, reason: collision with root package name */
    protected static final BigInteger f26201j;

    /* renamed from: k, reason: collision with root package name */
    protected static final BigInteger f26202k;

    /* renamed from: l, reason: collision with root package name */
    protected static final char[] f26203l;

    /* renamed from: m, reason: collision with root package name */
    protected static final char[] f26204m;

    /* renamed from: n, reason: collision with root package name */
    private static TreeMap f26205n;

    /* renamed from: o, reason: collision with root package name */
    private static TreeMap f26206o;

    /* renamed from: a, reason: collision with root package name */
    protected transient String f26207a;

    /* renamed from: b, reason: collision with root package name */
    private transient byte[] f26208b;

    /* renamed from: c, reason: collision with root package name */
    private transient byte[] f26209c;

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: ag.b$a */
    public interface a {
        Iterator a(boolean z10, boolean z11, int i10, int i11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: ag.b$b, reason: collision with other inner class name */
    public interface InterfaceC1013b {
        Zf.d a(int i10, int i11);
    }

    static {
        d.i.b bVar = new d.i.b(inet.ipaddr.a.f49277c);
        f26195d = new j.c.a(8).n("0").s(bVar).u();
        f26196e = new j.c.a(16).n("0x").s(bVar).u();
        f26197f = new j.c.a(10).s(bVar).u();
        String[] strArr = new String[20];
        f26198g = strArr;
        strArr[0] = "";
        for (int i10 = 1; i10 < 20; i10++) {
            String[] strArr2 = f26198g;
            strArr2[i10] = strArr2[i10 - 1] + '0';
        }
        f26199h = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '!', '#', '$', '%', '&', '(', ')', '*', '+', '-', ';', '<', '=', '>', '?', '@', '^', '_', '`', '{', '|', '}', '~'};
        f26200i = cArr;
        f26201j = BigInteger.valueOf(2L);
        f26202k = BigInteger.valueOf(85L);
        f26203l = cArr;
        f26204m = new char[]{'0', '0', '0', '1', '0', '2', '0', '3', '0', '4', '0', '5', '0', '6', '0', '7', '0', '8', '0', '9', '1', '0', '1', '1', '1', '2', '1', '3', '1', '4', '1', '5', '1', '6', '1', '7', '1', '8', '1', '9', '2', '0', '2', '1', '2', '2', '2', '3', '2', '4', '2', '5', '2', '6', '2', '7', '2', '8', '2', '9', '3', '0', '3', '1', '3', '2', '3', '3', '3', '4', '3', '5', '3', '6', '3', '7', '3', '8', '3', '9', '4', '0', '4', '1', '4', '2', '4', '3', '4', '4', '4', '5', '4', '6', '4', '7', '4', '8', '4', '9', '5', '0', '5', '1', '5', '2', '5', '3', '5', '4', '5', '5', '5', '6', '5', '7', '5', '8', '5', '9', '6', '0', '6', '1', '6', '2', '6', '3', '6', '4', '6', '5', '6', '6', '6', '7', '6', '8', '6', '9', '7', '0', '7', '1', '7', '2', '7', '3', '7', '4', '7', '5', '7', '6', '7', '7', '7', '8', '7', '9', '8', '0', '8', '1', '8', '2', '8', '3', '8', '4', '8', '5', '8', '6', '8', '7', '8', '8', '8', '9', '9', '0', '9', '1', '9', '2', '9', '3', '9', '4', '9', '5', '9', '6', '9', '7', '9', '8', '9', '9'};
        f26205n = new TreeMap();
        f26206o = new TreeMap();
    }

    protected AbstractC3844b() {
    }

    static int C(int i10, long j10, long j11) {
        long j12 = j10 >>> 32;
        int i11 = (i10 * 31) + ((int) (j12 == 0 ? j10 : j12 ^ j10));
        if (j11 == j10) {
            return i11;
        }
        long j13 = j11 >>> 32;
        if (j13 != 0) {
            j11 ^= j13;
        }
        return (i11 * 31) + ((int) j11);
    }

    protected static AbstractC3846d.b G1(j.c cVar) {
        AbstractC3846d.b bVar = (AbstractC3846d.b) AbstractC3846d.K0(cVar);
        if (bVar != null) {
            return bVar;
        }
        AbstractC3846d.c cVar2 = new AbstractC3846d.c(cVar.f33311d, cVar.f33313f, cVar.f33317j);
        cVar2.u(cVar.f33310c);
        cVar2.O(cVar.f33309b);
        cVar2.K(cVar.f33312e);
        cVar2.G(cVar.f33314g);
        cVar2.I(cVar.f33315h);
        cVar2.M(cVar.f33316i);
        cVar2.H(cVar.f33311d);
        cVar2.N(cVar.f33317j);
        cVar2.L(cVar.f33313f);
        cVar2.P(cVar.f49750m);
        AbstractC3846d.f1(cVar, cVar2);
        return cVar2;
    }

    protected static StringBuilder H1(long j10, int i10, int i11, boolean z10, StringBuilder sb2) {
        if (i10 < 2 || i10 > 85) {
            throw new IllegalArgumentException();
        }
        if (j10 > 65535 || !J1((int) j10, i10, i11, z10, sb2)) {
            N1(j10, i10, i11, z10, sb2);
        }
        return sb2;
    }

    private static boolean I1(int i10, int i11, boolean z10, StringBuilder sb2) {
        int i12 = i10;
        if (i12 <= 1) {
            sb2.append(i12 != 0 ? '1' : '0');
            return true;
        }
        if (i11 != 10) {
            int i13 = 16;
            if (i11 == 16) {
                if (i12 < 16) {
                    sb2.append(e1(z10, i11)[i12]);
                    return true;
                }
                if (i12 < 256) {
                    sb2.append("  ");
                } else if (i12 < 4096) {
                    sb2.append("   ");
                } else {
                    if (i12 == 65535) {
                        sb2.append(z10 ? "FFFF" : "ffff");
                        return true;
                    }
                    sb2.append("    ");
                }
                char[] cArrE1 = e1(z10, i11);
                int length = sb2.length();
                do {
                    int i14 = i12 & 15;
                    i12 >>>= 4;
                    length--;
                    sb2.setCharAt(length, cArrE1[i14]);
                } while (i12 != 0);
                return true;
            }
            if (i11 == 8) {
                char[] cArr = f26199h;
                if (i12 < 8) {
                    sb2.append(cArr[i12]);
                    return true;
                }
                if (i12 < 64) {
                    sb2.append("  ");
                } else if (i12 < 512) {
                    sb2.append("   ");
                } else if (i12 < 4096) {
                    sb2.append("    ");
                } else if (i12 < 32768) {
                    sb2.append("     ");
                } else {
                    sb2.append("      ");
                }
                int length2 = sb2.length();
                do {
                    int i15 = i12 & 7;
                    i12 >>>= 3;
                    length2--;
                    sb2.setCharAt(length2, cArr[i15]);
                } while (i12 != 0);
                return true;
            }
            if (i11 != 2) {
                return false;
            }
            if ((i12 >>> 8) == 0) {
                if (i12 == 255) {
                    sb2.append("11111111");
                    return true;
                }
                i13 = (i12 >>> 4) == 0 ? 4 : 8;
            } else {
                if (i12 == 65535) {
                    sb2.append("1111111111111111");
                    return true;
                }
                if ((i12 >>> 4) == 0) {
                    i13 = 12;
                }
            }
            while (true) {
                i13--;
                if (i13 <= 0) {
                    break;
                }
                if (((i12 >>> i13) & 1) == 1) {
                    sb2.append('1');
                    while (true) {
                        i13--;
                        if (i13 <= 0) {
                            break;
                        }
                        sb2.append(((i12 >>> i13) & 1) == 0 ? '0' : '1');
                    }
                }
            }
            sb2.append((i12 & 1) != 0 ? '1' : '0');
            return true;
        }
        if (i12 < 10) {
            sb2.append(e1(z10, i11)[i12]);
            return true;
        }
        if (i12 < 100) {
            char[] cArr2 = f26204m;
            int i16 = i12 << 1;
            sb2.append(cArr2[i16]);
            sb2.append(cArr2[i16 + 1]);
            return true;
        }
        if (i12 < 200) {
            int length3 = sb2.length();
            sb2.append("127");
            if (i12 != 127) {
                char[] cArr3 = f26204m;
                int i17 = (i12 - 100) << 1;
                sb2.setCharAt(length3 + 1, cArr3[i17]);
                sb2.setCharAt(length3 + 2, cArr3[i17 + 1]);
            }
            return true;
        }
        if (i12 < 300) {
            int length4 = sb2.length();
            sb2.append("255");
            if (i12 != 255) {
                char[] cArr4 = f26204m;
                int i18 = (i12 - 200) << 1;
                sb2.setCharAt(length4 + 1, cArr4[i18]);
                sb2.setCharAt(length4 + 2, cArr4[i18 + 1]);
            }
            return true;
        }
        if (i12 < 1000) {
            sb2.append("   ");
        } else if (i12 < 10000) {
            sb2.append("    ");
        } else {
            sb2.append("     ");
        }
        char[] cArr5 = f26199h;
        int length5 = sb2.length();
        while (true) {
            int i19 = (52429 * i12) >>> 19;
            length5--;
            sb2.setCharAt(length5, cArr5[i12 - ((i19 << 3) + (i19 << 1))]);
            if (i19 == 0) {
                return true;
            }
            i12 = i19;
        }
    }

    private static boolean J1(int i10, int i11, int i12, boolean z10, StringBuilder sb2) {
        if (!I1(i10, i11, z10, sb2)) {
            return false;
        }
        if (i12 <= 0) {
            return true;
        }
        sb2.setLength(sb2.length() - i12);
        return true;
    }

    protected static int K1(long j10, int i10) {
        int iL1;
        if (i10 < 2 || i10 > 85) {
            throw new IllegalArgumentException();
        }
        return (j10 > 65535 || (iL1 = L1((int) j10, i10)) < 0) ? M1(j10, i10) : iL1;
    }

    private static int L1(int i10, int i11) {
        int i12;
        if (i10 <= 1) {
            return 1;
        }
        if (i11 == 10) {
            if (i10 < 10) {
                return 1;
            }
            if (i10 < 100) {
                return 2;
            }
            if (i10 < 1000) {
                return 3;
            }
            return i10 < 10000 ? 4 : 5;
        }
        if (i11 == 16) {
            if (i10 < 16) {
                return 1;
            }
            if (i10 < 256) {
                return 2;
            }
            return i10 < 4096 ? 3 : 4;
        }
        if (i11 == 8) {
            if (i10 < 8) {
                return 1;
            }
            if (i10 < 64) {
                return 2;
            }
            if (i10 < 512) {
                return 3;
            }
            if (i10 < 4096) {
                return 4;
            }
            return i10 < 32768 ? 5 : 6;
        }
        if (i11 != 2) {
            return -1;
        }
        int i13 = i10 >>> 8;
        if (i13 == 0) {
            i12 = 7;
        } else {
            i12 = 15;
            i10 = i13;
        }
        int i14 = i10 >>> 4;
        if (i14 == 0) {
            i12 -= 4;
        } else {
            i10 = i14;
        }
        int i15 = i10 >>> 2;
        if (i15 == 0) {
            i12 -= 2;
        } else {
            i10 = i15;
        }
        return (i10 & 2) != 0 ? i12 + 1 : i12;
    }

    private static int M1(long j10, int i10) {
        boolean z10 = j10 <= 2147483647L;
        int i11 = z10 ? (int) j10 : i10;
        int i12 = 1;
        while (i11 >= i10) {
            if (z10) {
                i11 /= i10;
            } else {
                j10 /= i10;
                if (j10 <= 2147483647L) {
                    i11 = (int) j10;
                    z10 = true;
                }
            }
            i12++;
        }
        return i12;
    }

    private static void N1(long j10, int i10, int i11, boolean z10, StringBuilder sb2) {
        int length = sb2.length();
        q0(j10, i10, i11, z10, sb2);
        for (int length2 = sb2.length() - 1; length < length2; length2--) {
            char cCharAt = sb2.charAt(length);
            sb2.setCharAt(length, sb2.charAt(length2));
            sb2.setCharAt(length2, cCharAt);
            length++;
        }
    }

    protected static InterfaceC5372b U0(Zf.d dVar, int i10, int i11, Supplier supplier, a aVar, InterfaceC1013b interfaceC1013b) {
        return new i(dVar, i10, i11, supplier, aVar, interfaceC1013b);
    }

    private byte[] W0(byte[] bArr, int i10, byte[] bArr2) {
        int iF = (f() + 7) >> 3;
        if (bArr != null && bArr.length >= iF + i10) {
            System.arraycopy(bArr2, 0, bArr, i10, iF);
            return bArr;
        }
        if (i10 <= 0) {
            return (byte[]) bArr2.clone();
        }
        byte[] bArr3 = new byte[iF + i10];
        if (bArr != null) {
            System.arraycopy(bArr, 0, bArr3, 0, Math.min(i10, bArr.length));
        }
        System.arraycopy(bArr2, 0, bArr3, i10, bArr2.length);
        return bArr3;
    }

    private static int c1(int i10, int i11) {
        if (i10 <= 0) {
            if (i10 != 0 || i11 < 2 || i11 > 85) {
                throw new IllegalArgumentException();
            }
            return 1;
        }
        if (i11 == 2) {
            return i10;
        }
        if (i11 == 4) {
            return (i10 + 1) >> 1;
        }
        if (i11 == 8) {
            return (i10 + 2) / 3;
        }
        if (i11 == 10) {
            return -1;
        }
        if (i11 == 16) {
            return (i10 + 3) >> 2;
        }
        if (i11 < 2 || i11 > 85) {
            throw new IllegalArgumentException();
        }
        return -1;
    }

    public static int d1(long j10, int i10) {
        int i11 = 1;
        if (i10 != 16 || j10 < 0) {
            if (i10 != 10 || j10 <= -10) {
                if (i10 == 8 && j10 >= 0) {
                    while (true) {
                        j10 >>>= 3;
                        if (j10 == 0) {
                            return i11;
                        }
                        i11++;
                    }
                } else {
                    if (i10 == 2 && j10 > 0) {
                        return 64 - Long.numberOfLeadingZeros(j10);
                    }
                    if (i10 < 2 || i10 > 85) {
                        throw new IllegalArgumentException();
                    }
                }
            } else {
                if (j10 < 10) {
                    return 1;
                }
                if (j10 < 100) {
                    return 2;
                }
                if (j10 < 1000) {
                    return 3;
                }
                j10 /= 1000;
                i11 = 3;
            }
            while (true) {
                j10 /= i10;
                if (j10 == 0) {
                    return i11;
                }
                i11++;
            }
        } else {
            while (true) {
                j10 >>>= 4;
                if (j10 == 0) {
                    return i11;
                }
                i11++;
            }
        }
    }

    private static char[] e1(boolean z10, int i10) {
        return (z10 || i10 > 36) ? f26203l : f26199h;
    }

    private static int f1(String str, StringBuilder sb2) {
        if (sb2 == null) {
            return str.length();
        }
        sb2.append(str);
        return 0;
    }

    protected static void g1(int i10, StringBuilder sb2) {
        if (i10 > 0) {
            String[] strArr = f26198g;
            if (i10 < strArr.length) {
                sb2.append(strArr[i10]);
                return;
            }
            int length = strArr.length - 1;
            String str = strArr[length];
            while (i10 >= length) {
                sb2.append(str);
                i10 -= length;
            }
            sb2.append(strArr[i10]);
        }
    }

    protected static int l1(int i10, int i11, long j10) {
        long j11 = (i10 << 32) | i11;
        Integer numS = (Integer) f26205n.get(Long.valueOf(j11));
        if (numS == null) {
            int iC1 = c1(i11, i10);
            if (iC1 < 0) {
                iC1 = d1(j10, i10);
            }
            numS = AbstractC3846d.s(iC1);
            TreeMap treeMap = (TreeMap) f26205n.clone();
            treeMap.put(Long.valueOf(j11), numS);
            f26205n = treeMap;
        }
        return numS.intValue();
    }

    private static void q0(long j10, int i10, int i11, boolean z10, StringBuilder sb2) {
        int i12;
        int i13;
        boolean z11 = j10 <= 2147483647L;
        int i14 = z11 ? (int) j10 : i10;
        char[] cArrE1 = e1(z10, i10);
        while (i14 >= i10) {
            if (z11) {
                i12 = i14 / i10;
                if (i11 > 0) {
                    i11--;
                    i14 = i12;
                } else {
                    i13 = i14 % i10;
                }
            } else {
                long j11 = i10;
                long j12 = j10 / j11;
                if (j12 <= 2147483647L) {
                    i14 = (int) j12;
                    z11 = true;
                }
                if (i11 > 0) {
                    i11--;
                    j10 = j12;
                } else {
                    int i15 = (int) (j10 % j11);
                    i12 = i14;
                    i13 = i15;
                    j10 = j12;
                }
            }
            sb2.append(cArrE1[i13]);
            i14 = i12;
        }
        if (i11 == 0) {
            sb2.append(cArrE1[i14]);
        }
    }

    private static void r1(int i10, char c10, char c11, String str, StringBuilder sb2) {
        int length = str.length();
        while (true) {
            int i11 = i10 - 1;
            if (i10 <= 0) {
                sb2.setLength(sb2.length() - 1);
                return;
            }
            if (length > 0) {
                sb2.append(str);
            }
            sb2.append(c11);
            sb2.append(c10);
            i10 = i11;
        }
    }

    private static void s1(int i10, char c10, String str, String str2, StringBuilder sb2) {
        while (true) {
            int i11 = i10 - 1;
            if (i10 <= 0) {
                sb2.setLength(sb2.length() - 1);
                return;
            }
            if (str2.length() > 0) {
                sb2.append(str2);
            }
            sb2.append(str);
            sb2.append(c10);
            i10 = i11;
        }
    }

    private static void t1(int i10, char c10, String str, StringBuilder sb2) {
        r1(i10, c10, '0', str, sb2);
    }

    public byte[] A1(byte[] bArr, int i10) {
        if (!A0()) {
            return V0(bArr, i10);
        }
        byte[] bArrX0 = this.f26209c;
        if (bArrX0 == null) {
            bArrX0 = X0(false);
            this.f26209c = bArrX0;
        }
        return W0(bArr, i10, bArrX0);
    }

    protected abstract void B1(int i10, boolean z10, StringBuilder sb2);

    protected abstract int C1(int i10);

    protected abstract void D1(int i10, boolean z10, StringBuilder sb2);

    protected abstract String E1();

    protected void F1() {
        String strA1;
        if (this.f26207a != null || (strA1 = a1()) == null) {
            return;
        }
        synchronized (this) {
            this.f26207a = strA1;
        }
    }

    @Override // ag.InterfaceC3849g
    public byte[] G(byte[] bArr) {
        return A1(bArr, 0);
    }

    protected abstract int J(int i10, int i11);

    protected void K0(CharSequence charSequence, int i10, StringBuilder sb2) {
        if (i10 <= 10) {
            sb2.append(charSequence);
            return;
        }
        for (int i11 = 0; i11 < charSequence.length(); i11++) {
            char cCharAt = charSequence.charAt(i11);
            if (cCharAt >= 'a' && cCharAt <= 'z') {
                cCharAt = (char) (cCharAt - ' ');
            }
            sb2.append(cCharAt);
        }
    }

    @Override // ag.InterfaceC3849g
    public byte[] R0(byte[] bArr) {
        return V0(bArr, 0);
    }

    int T(int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (!L() || i10 == 1) {
            return i10;
        }
        return 0;
    }

    public byte[] V0(byte[] bArr, int i10) {
        byte[] bArrX0 = this.f26208b;
        if (bArrX0 == null) {
            bArrX0 = X0(true);
            this.f26208b = bArrX0;
        }
        return W0(bArr, i10, bArrX0);
    }

    protected abstract byte[] X0(boolean z10);

    protected abstract String Y0();

    protected abstract String Z0();

    protected abstract String a1();

    protected abstract int b0(int i10, int i11);

    protected abstract int b1();

    public abstract boolean equals(Object obj);

    protected abstract void h1(int i10, int i11, boolean z10, StringBuilder sb2);

    protected abstract void i1(int i10, boolean z10, StringBuilder sb2);

    @Override // cg.InterfaceC4257a
    public int j(int i10, InterfaceC5374d interfaceC5374d, StringBuilder sb2) {
        String str;
        if (A0()) {
            if (!w() || (str = interfaceC5374d.f().f33329b) == null) {
                return p1(i10, interfaceC5374d, sb2);
            }
            if (str.equals(a1())) {
                F1();
            }
            if (!interfaceC5374d.c()) {
                return f1(str, sb2);
            }
            int iH = interfaceC5374d.h();
            if (sb2 == null) {
                return (s(iH) * (str.length() + 1)) - 1;
            }
            s1(s(iH), interfaceC5374d.d() == null ? (char) 0 : interfaceC5374d.d().charValue(), str, "", sb2);
            return 0;
        }
        if (!interfaceC5374d.c()) {
            return v(i10, interfaceC5374d, sb2);
        }
        int iH2 = interfaceC5374d.h();
        int iJ = J(interfaceC5374d.k(i10), iH2);
        String strI = interfaceC5374d.i();
        int length = strI.length();
        if (sb2 == null) {
            int iS = iJ != 0 ? iJ < 0 ? s(iH2) : iJ + j1(iH2) : j1(iH2);
            int i11 = (iS << 1) - 1;
            return length > 0 ? i11 + (iS * length) : i11;
        }
        char cCharValue = interfaceC5374d.d() == null ? (char) 0 : interfaceC5374d.d().charValue();
        boolean zE = interfaceC5374d.e();
        boolean zB = interfaceC5374d.b();
        if (zE) {
            u1(iH2, 0, zB, cCharValue, zE, strI, sb2);
            if (iJ != 0) {
                sb2.append(cCharValue);
                t1(iJ, cCharValue, strI, sb2);
            }
        } else {
            if (iJ != 0) {
                t1(iJ, cCharValue, strI, sb2);
                sb2.append(cCharValue);
            }
            u1(iH2, 0, zB, cCharValue, zE, strI, sb2);
        }
        return 0;
    }

    protected abstract int j1(int i10);

    protected abstract int k1();

    protected abstract int m1(int i10);

    protected int n1(int i10, InterfaceC5374d interfaceC5374d, StringBuilder sb2) {
        int iH = interfaceC5374d.h();
        int iJ = J(interfaceC5374d.k(i10), iH);
        String strI = interfaceC5374d.i();
        int length = strI.length();
        d.i.b bVarF = interfaceC5374d.f();
        int iT = T(m1(iH));
        if (sb2 == null) {
            return j1(iH) + iJ + length;
        }
        if (length > 0) {
            sb2.append(strI);
        }
        if (iJ > 0) {
            g1(iJ, sb2);
        }
        h1(iH, iT, interfaceC5374d.b(), sb2);
        for (int i11 = 0; i11 < iT; i11++) {
            sb2.append(bVarF.f33330c);
        }
        return 0;
    }

    protected int o1(int i10, InterfaceC5374d interfaceC5374d, int i11, int i12, boolean z10, StringBuilder sb2) {
        return q1(interfaceC5374d.f().f33328a, i11, i12, interfaceC5374d.i(), interfaceC5374d.h(), interfaceC5374d.b(), z10, sb2);
    }

    protected int p1(int i10, InterfaceC5374d interfaceC5374d, StringBuilder sb2) {
        boolean zC = interfaceC5374d.c();
        int iH = interfaceC5374d.h();
        int iK = interfaceC5374d.k(i10);
        d.i.b bVarF = interfaceC5374d.f();
        String str = bVarF.f33328a;
        int iM1 = bVarF.f33330c == null ? 0 : m1(iH);
        int iJ = J(iK, iH);
        int iB0 = b0(iK, iH);
        if (iM1 != 0 || iH != b1() || zC || w()) {
            if (zC || iK >= 0 || sb2 != null) {
                return T(iM1) != 0 ? zC ? v1(i10, interfaceC5374d, sb2) : n1(i10, interfaceC5374d, sb2) : zC ? w1(i10, interfaceC5374d, sb2) : o1(i10, interfaceC5374d, iJ, iB0, false, sb2);
            }
            int length = interfaceC5374d.i().length();
            int iS = s(iH);
            if (iM1 != 0) {
                return length > 0 ? iS + length : iS;
            }
            int i11 = iS << 1;
            if (length > 0) {
                i11 += length << 1;
            }
            return i11 + str.length();
        }
        String strE1 = E1();
        String strZ0 = Z0();
        String strI = interfaceC5374d.i();
        int length2 = strI.length();
        if (iJ == 0 && iB0 == 0 && length2 == 0 && str.equals(strZ0)) {
            if (sb2 == null) {
                return strE1.length();
            }
            sb2.append(strE1);
            return 0;
        }
        if (sb2 == null) {
            int length3 = strE1.length() + (str.length() - strZ0.length()) + iJ + iB0;
            return length2 > 0 ? length3 + (length2 << 1) : length3;
        }
        int iIndexOf = strE1.indexOf(strZ0);
        if (length2 > 0) {
            sb2.append(strI);
        }
        if (iJ > 0) {
            g1(iJ, sb2);
        }
        sb2.append(strE1.substring(0, iIndexOf));
        sb2.append(str);
        if (length2 > 0) {
            sb2.append(strI);
        }
        if (iB0 > 0) {
            g1(iB0, sb2);
        }
        sb2.append(strE1.substring(iIndexOf + strZ0.length()));
        return 0;
    }

    protected int q1(String str, int i10, int i11, String str2, int i12, boolean z10, boolean z11, StringBuilder sb2) {
        if (i12 < 2 || i12 > 85) {
            throw new IllegalArgumentException();
        }
        int length = str2.length();
        boolean z12 = length > 0;
        if (sb2 == null) {
            int iJ1 = i10 + i11 + j1(i12) + C1(i12) + str.length();
            return z12 ? iJ1 + (length << 1) : iJ1;
        }
        if (z12) {
            sb2.append(str2);
        }
        if (i10 > 0) {
            g1(i10, sb2);
        }
        i1(i12, z10, sb2);
        sb2.append(str);
        if (z12) {
            sb2.append(str2);
        }
        if (i11 > 0) {
            g1(i11, sb2);
        }
        if (z11) {
            D1(i12, z10, sb2);
        } else {
            B1(i12, z10, sb2);
        }
        return 0;
    }

    public String toString() {
        int iB1 = b1();
        j.c cVarU = iB1 != 8 ? iB1 != 10 ? iB1 != 16 ? new j.c.a(iB1).s(new d.i.b(inet.ipaddr.a.f49277c)).u() : f26196e : f26197f : f26195d;
        StringBuilder sb2 = new StringBuilder(34);
        G1(cVarU).p(this, sb2);
        return sb2.toString();
    }

    protected abstract void u1(int i10, int i11, boolean z10, char c10, boolean z11, String str, StringBuilder sb2);

    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004e  */
    @Override // cg.InterfaceC4257a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int v(int r4, dg.InterfaceC5374d r5, java.lang.StringBuilder r6) {
        /*
            r3 = this;
            java.lang.String r0 = r5.i()
            int r1 = r0.length()
            r2 = 0
            if (r1 <= 0) goto L11
            if (r6 != 0) goto Le
            goto L12
        Le:
            r6.append(r0)
        L11:
            r1 = r2
        L12:
            int r0 = r5.h()
            int r4 = r5.k(r4)
            if (r4 == 0) goto L2f
            if (r6 != 0) goto L28
            if (r4 >= 0) goto L26
            int r4 = r3.s(r0)
        L24:
            int r1 = r1 + r4
            return r1
        L26:
            int r1 = r1 + r4
            goto L2f
        L28:
            int r4 = r3.J(r4, r0)
            g1(r4, r6)
        L2f:
            boolean r4 = r5.b()
            int r5 = r3.b1()
            if (r0 != r5) goto L4e
            java.lang.String r5 = r3.Y0()
            if (r6 != 0) goto L44
            int r4 = r5.length()
            goto L24
        L44:
            if (r4 == 0) goto L4a
            r3.K0(r5, r0, r6)
            goto L58
        L4a:
            r6.append(r5)
            goto L58
        L4e:
            if (r6 != 0) goto L55
            int r4 = r3.j1(r0)
            goto L24
        L55:
            r3.i1(r0, r4, r6)
        L58:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ag.AbstractC3844b.v(int, dg.d, java.lang.StringBuilder):int");
    }

    protected int v1(int i10, InterfaceC5374d interfaceC5374d, StringBuilder sb2) {
        int iH = interfaceC5374d.h();
        int iJ = J(interfaceC5374d.k(i10), iH);
        String strI = interfaceC5374d.i();
        if (sb2 == null) {
            int iJ1 = j1(iH) + iJ;
            int i11 = (iJ1 << 1) - 1;
            int length = strI.length();
            return length > 0 ? i11 + (iJ1 * length) : i11;
        }
        d.i.b bVarF = interfaceC5374d.f();
        int iT = T(m1(iH));
        char cCharValue = interfaceC5374d.d() == null ? (char) 0 : interfaceC5374d.d().charValue();
        boolean zE = interfaceC5374d.e();
        boolean zB = interfaceC5374d.b();
        if (zE) {
            s1(iT, cCharValue, bVarF.f33330c, strI, sb2);
            sb2.append(cCharValue);
            u1(iH, iT, zB, cCharValue, zE, strI, sb2);
            if (iJ > 0) {
                sb2.append(cCharValue);
                t1(iJ, cCharValue, strI, sb2);
            }
        } else {
            if (iJ != 0) {
                t1(iJ, cCharValue, strI, sb2);
                sb2.append(cCharValue);
            }
            u1(iH, iT, zB, cCharValue, zE, strI, sb2);
            sb2.append(cCharValue);
            s1(iT, cCharValue, bVarF.f33330c, strI, sb2);
        }
        return 0;
    }

    protected int w1(int i10, InterfaceC5374d interfaceC5374d, StringBuilder sb2) {
        boolean z10;
        String strI = interfaceC5374d.i();
        int iH = interfaceC5374d.h();
        int iB0 = b0(interfaceC5374d.k(i10), iH);
        d.i.b bVarF = interfaceC5374d.f();
        boolean zB = interfaceC5374d.b();
        char cCharValue = interfaceC5374d.d() == null ? (char) 0 : interfaceC5374d.d().charValue();
        boolean zE = interfaceC5374d.e();
        String str = bVarF.f33328a;
        if (sb2 == null) {
            return y1(str, bVarF.f33329b, iB0, iH, zB, cCharValue, zE, strI);
        }
        boolean z11 = iB0 != 0;
        if (!z11 || zE) {
            z10 = z11;
        } else {
            t1(iB0, cCharValue, strI, sb2);
            sb2.append(cCharValue);
            z10 = false;
        }
        x1(str, bVarF.f33329b, iH, zB, cCharValue, zE, strI, sb2);
        if (z10) {
            sb2.append(cCharValue);
            t1(iB0, cCharValue, strI, sb2);
        }
        return 0;
    }

    protected abstract void x1(String str, String str2, int i10, boolean z10, char c10, boolean z11, String str3, StringBuilder sb2);

    /* JADX INFO: Access modifiers changed from: protected */
    public int y(int i10, InterfaceC5374d interfaceC5374d, StringBuilder sb2) {
        int iK = interfaceC5374d.k(i10);
        int iH = interfaceC5374d.h();
        int iJ = J(iK, iH);
        int iB0 = b0(iK, iH);
        d.i.b bVarF = interfaceC5374d.f();
        String str = bVarF.f33328a;
        int iM1 = bVarF.f33330c == null ? 0 : m1(iH);
        if (iM1 != 0 || iH != b1() || w()) {
            int iT = T(iM1);
            if (iK >= 0 || sb2 != null) {
                return iT != 0 ? n1(i10, interfaceC5374d, sb2) : o1(i10, interfaceC5374d, iJ, iB0, true, sb2);
            }
            int iS = s(iH);
            int length = interfaceC5374d.i().length();
            if (iT != 0) {
                return length > 0 ? iS + length : iS;
            }
            int i11 = iS << 1;
            if (length > 0) {
                i11 += length << 1;
            }
            return i11 + str.length();
        }
        String strZ1 = z1();
        String strZ0 = Z0();
        String strI = interfaceC5374d.i();
        int length2 = strI.length();
        if (iJ == 0 && iB0 == 0 && strZ0.equals(str) && length2 == 0) {
            if (sb2 == null) {
                return strZ1.length();
            }
            if (interfaceC5374d.b()) {
                K0(strZ1, iH, sb2);
            } else {
                sb2.append(strZ1);
            }
            return 0;
        }
        if (sb2 == null) {
            int length3 = strZ1.length() + (str.length() - strZ0.length()) + iJ + iB0;
            return length2 > 0 ? length3 + (length2 << 1) : length3;
        }
        int iIndexOf = strZ1.indexOf(strZ0);
        if (length2 > 0) {
            sb2.append(strI);
        }
        if (iJ > 0) {
            g1(iJ, sb2);
        }
        sb2.append(strZ1.substring(0, iIndexOf));
        sb2.append(str);
        if (length2 > 0) {
            sb2.append(strI);
        }
        if (iB0 > 0) {
            g1(iB0, sb2);
        }
        sb2.append(strZ1.substring(iIndexOf + strZ0.length()));
        return 0;
    }

    protected abstract int y1(String str, String str2, int i10, int i11, boolean z10, char c10, boolean z11, String str3);

    protected abstract String z1();
}
