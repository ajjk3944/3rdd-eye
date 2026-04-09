package kh;

import Zg.AbstractC3672d;
import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import java.nio.charset.Charset;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C6510d;
import org.snmp4j.mp.MPv3;

/* renamed from: kh.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6470a {

    /* renamed from: d, reason: collision with root package name */
    public static final C1917a f51470d = new C1917a(null);

    /* renamed from: e, reason: collision with root package name */
    private static final byte[] f51471e = {13, 10};

    /* renamed from: f, reason: collision with root package name */
    private static final C6470a f51472f;

    /* renamed from: g, reason: collision with root package name */
    private static final C6470a f51473g;

    /* renamed from: a, reason: collision with root package name */
    private final boolean f51474a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f51475b;

    /* renamed from: c, reason: collision with root package name */
    private final b f51476c;

    /* renamed from: kh.a$a, reason: collision with other inner class name */
    public static final class C1917a extends C6470a {
        public /* synthetic */ C1917a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private C1917a() {
            boolean z10 = false;
            super(z10, z10, b.PRESENT, null);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: kh.a$b */
    public static final class b {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b PRESENT = new b("PRESENT", 0);
        public static final b ABSENT = new b("ABSENT", 1);
        public static final b PRESENT_OPTIONAL = new b("PRESENT_OPTIONAL", 2);
        public static final b ABSENT_OPTIONAL = new b("ABSENT_OPTIONAL", 3);

        private static final /* synthetic */ b[] $values() {
            return new b[]{PRESENT, ABSENT, PRESENT_OPTIONAL, ABSENT_OPTIONAL};
        }

        static {
            b[] bVarArr$values = $values();
            $VALUES = bVarArr$values;
            $ENTRIES = AbstractC5827b.a(bVarArr$values);
        }

        private b(String str, int i10) {
        }

        public static InterfaceC5826a getEntries() {
            return $ENTRIES;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    static {
        b bVar = b.PRESENT;
        f51472f = new C6470a(true, false, bVar);
        f51473g = new C6470a(false, true, bVar);
    }

    public /* synthetic */ C6470a(boolean z10, boolean z11, b bVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, z11, bVar);
    }

    private final void b(int i10, int i11, int i12) {
        if (i11 < 0 || i11 > i10) {
            throw new IndexOutOfBoundsException("destination offset: " + i11 + ", destination size: " + i10);
        }
        int i13 = i11 + i12;
        if (i13 < 0 || i13 > i10) {
            throw new IndexOutOfBoundsException("The destination array does not have enough capacity, destination offset: " + i11 + ", destination size: " + i10 + ", capacity needed: " + i12);
        }
    }

    private final void c(int i10) {
        if (this.f51476c != b.ABSENT) {
            return;
        }
        throw new IllegalArgumentException("The padding option is set to ABSENT, but the input has a pad character at index " + i10);
    }

    public static /* synthetic */ byte[] g(C6470a c6470a, CharSequence charSequence, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decode");
        }
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = charSequence.length();
        }
        return c6470a.e(charSequence, i10, i11);
    }

    public static /* synthetic */ byte[] h(C6470a c6470a, byte[] bArr, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decode");
        }
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = bArr.length;
        }
        return c6470a.f(bArr, i10, i11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d0, code lost:
    
        if (r7 == (-2)) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d3, code lost:
    
        if (r7 == (-8)) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d5, code lost:
    
        if (r4 != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00db, code lost:
    
        if (r18.f51476c == kh.C6470a.b.PRESENT) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e5, code lost:
    
        throw new java.lang.IllegalArgumentException("The padding option is set to PRESENT, but the input is not properly padded");
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e6, code lost:
    
        if (r8 != 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e8, code lost:
    
        r3 = r(r19, r6, r23);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ec, code lost:
    
        if (r3 < r23) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f0, code lost:
    
        return r9 - r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f1, code lost:
    
        r1 = r19[r3] & 255;
        r4 = new java.lang.StringBuilder();
        r4.append("Symbol '");
        r4.append((char) r1);
        r4.append("'(");
        r1 = java.lang.Integer.toString(r1, kotlin.text.AbstractC6507a.a(8));
        kotlin.jvm.internal.AbstractC6492s.h(r1, "toString(...)");
        r4.append(r1);
        r4.append(") at index ");
        r4.append(r3 - 1);
        r4.append(" is prohibited after the pad character");
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x012c, code lost:
    
        throw new java.lang.IllegalArgumentException(r4.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0134, code lost:
    
        throw new java.lang.IllegalArgumentException("The pad bits must be zeros");
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x013c, code lost:
    
        throw new java.lang.IllegalArgumentException("The last unit of input does not have enough bits");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int i(byte[] r19, byte[] r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kh.C6470a.i(byte[], byte[], int, int, int):int");
    }

    public static /* synthetic */ String l(C6470a c6470a, byte[] bArr, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encode");
        }
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = bArr.length;
        }
        return c6470a.k(bArr, i10, i11);
    }

    private final int p(byte[] bArr, int i10, int i11, int i12) {
        if (i12 == -8) {
            throw new IllegalArgumentException("Redundant pad character at index " + i10);
        }
        if (i12 == -6) {
            c(i10);
        } else if (i12 == -4) {
            c(i10);
            i10 = r(bArr, i10 + 1, i11);
            if (i10 == i11 || bArr[i10] != 61) {
                throw new IllegalArgumentException("Missing one pad character at index " + i10);
            }
        } else if (i12 != -2) {
            throw new IllegalStateException("Unreachable");
        }
        return i10 + 1;
    }

    private final boolean q() {
        b bVar = this.f51476c;
        return bVar == b.PRESENT || bVar == b.PRESENT_OPTIONAL;
    }

    private final int r(byte[] bArr, int i10, int i11) {
        if (!this.f51475b) {
            return i10;
        }
        while (i10 < i11) {
            if (AbstractC6471b.f51478b[bArr[i10] & 255] != -1) {
                return i10;
            }
            i10++;
        }
        return i10;
    }

    public final byte[] a(CharSequence source, int i10, int i11) {
        AbstractC6492s.i(source, "source");
        d(source.length(), i10, i11);
        byte[] bArr = new byte[i11 - i10];
        int i12 = 0;
        while (i10 < i11) {
            char cCharAt = source.charAt(i10);
            if (cCharAt <= 255) {
                bArr[i12] = (byte) cCharAt;
                i12++;
            } else {
                bArr[i12] = 63;
                i12++;
            }
            i10++;
        }
        return bArr;
    }

    public final void d(int i10, int i11, int i12) {
        AbstractC3672d.f25361a.a(i11, i12, i10);
    }

    public final byte[] e(CharSequence source, int i10, int i11) {
        byte[] bArrA;
        AbstractC6492s.i(source, "source");
        if (source instanceof String) {
            String str = (String) source;
            d(str.length(), i10, i11);
            String strSubstring = str.substring(i10, i11);
            AbstractC6492s.h(strSubstring, "substring(...)");
            Charset charset = C6510d.f52220g;
            AbstractC6492s.g(strSubstring, "null cannot be cast to non-null type java.lang.String");
            bArrA = strSubstring.getBytes(charset);
            AbstractC6492s.h(bArrA, "getBytes(...)");
        } else {
            bArrA = a(source, i10, i11);
        }
        return h(this, bArrA, 0, 0, 6, null);
    }

    public final byte[] f(byte[] source, int i10, int i11) {
        AbstractC6492s.i(source, "source");
        d(source.length, i10, i11);
        int iJ = j(source, i10, i11);
        byte[] bArr = new byte[iJ];
        if (i(source, bArr, 0, i10, i11) == iJ) {
            return bArr;
        }
        throw new IllegalStateException("Check failed.");
    }

    public final int j(byte[] source, int i10, int i11) {
        AbstractC6492s.i(source, "source");
        int i12 = i11 - i10;
        if (i12 == 0) {
            return 0;
        }
        if (i12 == 1) {
            throw new IllegalArgumentException("Input should have at least 2 symbols for Base64 decoding, startIndex: " + i10 + ", endIndex: " + i11);
        }
        if (this.f51475b) {
            while (true) {
                if (i10 >= i11) {
                    break;
                }
                int i13 = AbstractC6471b.f51478b[source[i10] & 255];
                if (i13 < 0) {
                    if (i13 == -2) {
                        i12 -= i11 - i10;
                        break;
                    }
                    i12--;
                }
                i10++;
            }
        } else if (source[i11 - 1] == 61) {
            i12 = source[i11 + (-2)] == 61 ? i12 - 2 : i12 - 1;
        }
        return (int) ((i12 * 6) / 8);
    }

    public final String k(byte[] source, int i10, int i11) {
        AbstractC6492s.i(source, "source");
        return new String(o(source, i10, i11), C6510d.f52220g);
    }

    public final int m(byte[] source, byte[] destination, int i10, int i11, int i12) {
        int i13 = i11;
        AbstractC6492s.i(source, "source");
        AbstractC6492s.i(destination, "destination");
        d(source.length, i13, i12);
        b(destination.length, i10, n(i12 - i13));
        byte[] bArr = this.f51474a ? AbstractC6471b.f51479c : AbstractC6471b.f51477a;
        int i14 = this.f51475b ? 19 : MPv3.MAX_MESSAGE_ID;
        int i15 = i10;
        while (i13 + 2 < i12) {
            int iMin = Math.min((i12 - i13) / 3, i14);
            for (int i16 = 0; i16 < iMin; i16++) {
                int i17 = source[i13] & 255;
                int i18 = i13 + 2;
                int i19 = source[i13 + 1] & 255;
                i13 += 3;
                int i20 = (i19 << 8) | (i17 << 16) | (source[i18] & 255);
                destination[i15] = bArr[i20 >>> 18];
                destination[i15 + 1] = bArr[(i20 >>> 12) & 63];
                int i21 = i15 + 3;
                destination[i15 + 2] = bArr[(i20 >>> 6) & 63];
                i15 += 4;
                destination[i21] = bArr[i20 & 63];
            }
            if (iMin == i14 && i13 != i12) {
                int i22 = i15 + 1;
                byte[] bArr2 = f51471e;
                destination[i15] = bArr2[0];
                i15 += 2;
                destination[i22] = bArr2[1];
            }
        }
        int i23 = i12 - i13;
        if (i23 == 1) {
            int i24 = i13 + 1;
            int i25 = (source[i13] & 255) << 4;
            destination[i15] = bArr[i25 >>> 6];
            int i26 = i15 + 2;
            destination[i15 + 1] = bArr[i25 & 63];
            if (q()) {
                int i27 = i15 + 3;
                destination[i26] = 61;
                i15 += 4;
                destination[i27] = 61;
                i13 = i24;
            } else {
                i13 = i24;
                i15 = i26;
            }
        } else if (i23 == 2) {
            int i28 = i13 + 1;
            int i29 = source[i13] & 255;
            i13 += 2;
            int i30 = ((source[i28] & 255) << 2) | (i29 << 10);
            destination[i15] = bArr[i30 >>> 12];
            destination[i15 + 1] = bArr[(i30 >>> 6) & 63];
            int i31 = i15 + 3;
            destination[i15 + 2] = bArr[i30 & 63];
            if (q()) {
                i15 += 4;
                destination[i31] = 61;
            } else {
                i15 = i31;
            }
        }
        if (i13 == i12) {
            return i15 - i10;
        }
        throw new IllegalStateException("Check failed.");
    }

    public final int n(int i10) {
        int i11 = i10 / 3;
        int i12 = i10 % 3;
        int i13 = i11 * 4;
        if (i12 != 0) {
            i13 += q() ? 4 : i12 + 1;
        }
        if (this.f51475b) {
            i13 += ((i13 - 1) / 76) * 2;
        }
        if (i13 >= 0) {
            return i13;
        }
        throw new IllegalArgumentException("Input is too big");
    }

    public final byte[] o(byte[] source, int i10, int i11) {
        AbstractC6492s.i(source, "source");
        d(source.length, i10, i11);
        byte[] bArr = new byte[n(i11 - i10)];
        m(source, bArr, 0, i10, i11);
        return bArr;
    }

    private C6470a(boolean z10, boolean z11, b bVar) {
        this.f51474a = z10;
        this.f51475b = z11;
        this.f51476c = bVar;
        if (z10 && z11) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }
}
