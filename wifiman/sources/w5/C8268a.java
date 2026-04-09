package w5;

import com.google.gson.m;
import com.google.gson.stream.MalformedJsonException;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;
import t5.f;
import t5.o;

/* renamed from: w5.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C8268a implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    private final Reader f64441a;

    /* renamed from: i, reason: collision with root package name */
    private long f64449i;

    /* renamed from: j, reason: collision with root package name */
    private int f64450j;

    /* renamed from: k, reason: collision with root package name */
    private String f64451k;

    /* renamed from: l, reason: collision with root package name */
    private int[] f64452l;

    /* renamed from: n, reason: collision with root package name */
    private String[] f64454n;

    /* renamed from: o, reason: collision with root package name */
    private int[] f64455o;

    /* renamed from: b, reason: collision with root package name */
    private m f64442b = m.LEGACY_STRICT;

    /* renamed from: c, reason: collision with root package name */
    private final char[] f64443c = new char[1024];

    /* renamed from: d, reason: collision with root package name */
    private int f64444d = 0;

    /* renamed from: e, reason: collision with root package name */
    private int f64445e = 0;

    /* renamed from: f, reason: collision with root package name */
    private int f64446f = 0;

    /* renamed from: g, reason: collision with root package name */
    private int f64447g = 0;

    /* renamed from: h, reason: collision with root package name */
    int f64448h = 0;

    /* renamed from: m, reason: collision with root package name */
    private int f64453m = 1;

    /* renamed from: w5.a$a, reason: collision with other inner class name */
    class C2279a extends f {
        C2279a() {
        }

        @Override // t5.f
        public void a(C8268a c8268a) throws IOException {
            int iS = c8268a.f64448h;
            if (iS == 0) {
                iS = c8268a.s();
            }
            if (iS == 13) {
                c8268a.f64448h = 9;
            } else if (iS == 12) {
                c8268a.f64448h = 8;
            } else {
                if (iS != 14) {
                    throw c8268a.H0("a name");
                }
                c8268a.f64448h = 10;
            }
        }
    }

    static {
        f.f61762a = new C2279a();
    }

    public C8268a(Reader reader) {
        int[] iArr = new int[32];
        this.f64452l = iArr;
        iArr[0] = 6;
        this.f64454n = new String[32];
        this.f64455o = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.f64441a = reader;
    }

    private void B0(char c10) throws MalformedJsonException {
        char[] cArr = this.f64443c;
        do {
            int i10 = this.f64444d;
            int i11 = this.f64445e;
            while (i10 < i11) {
                int i12 = i10 + 1;
                char c11 = cArr[i10];
                if (c11 == c10) {
                    this.f64444d = i12;
                    return;
                }
                if (c11 == '\\') {
                    this.f64444d = i12;
                    z0();
                    i10 = this.f64444d;
                    i11 = this.f64445e;
                } else {
                    if (c11 == '\n') {
                        this.f64446f++;
                        this.f64447g = i12;
                    }
                    i10 = i12;
                }
            }
            this.f64444d = i10;
        } while (C(1));
        throw G0("Unterminated string");
    }

    private boolean C(int i10) throws IOException {
        int i11;
        int i12;
        char[] cArr = this.f64443c;
        int i13 = this.f64447g;
        int i14 = this.f64444d;
        this.f64447g = i13 - i14;
        int i15 = this.f64445e;
        if (i15 != i14) {
            int i16 = i15 - i14;
            this.f64445e = i16;
            System.arraycopy(cArr, i14, cArr, 0, i16);
        } else {
            this.f64445e = 0;
        }
        this.f64444d = 0;
        do {
            Reader reader = this.f64441a;
            int i17 = this.f64445e;
            int i18 = reader.read(cArr, i17, cArr.length - i17);
            if (i18 == -1) {
                return false;
            }
            i11 = this.f64445e + i18;
            this.f64445e = i11;
            if (this.f64446f == 0 && (i12 = this.f64447g) == 0 && i11 > 0 && cArr[0] == 65279) {
                this.f64444d++;
                this.f64447g = i12 + 1;
                i10++;
            }
        } while (i11 < i10);
        return true;
    }

    private boolean C0(String str) {
        int length = str.length();
        while (true) {
            if (this.f64444d + length > this.f64445e && !C(length)) {
                return false;
            }
            char[] cArr = this.f64443c;
            int i10 = this.f64444d;
            if (cArr[i10] != '\n') {
                for (int i11 = 0; i11 < length; i11++) {
                    if (this.f64443c[this.f64444d + i11] != str.charAt(i11)) {
                        break;
                    }
                }
                return true;
            }
            this.f64446f++;
            this.f64447g = i10 + 1;
            this.f64444d++;
        }
    }

    private void D0() {
        char c10;
        do {
            if (this.f64444d >= this.f64445e && !C(1)) {
                return;
            }
            char[] cArr = this.f64443c;
            int i10 = this.f64444d;
            int i11 = i10 + 1;
            this.f64444d = i11;
            c10 = cArr[i10];
            if (c10 == '\n') {
                this.f64446f++;
                this.f64447g = i11;
                return;
            }
        } while (c10 != '\r');
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0048, code lost:
    
        j();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void E0() throws com.google.gson.stream.MalformedJsonException {
        /*
            r4 = this;
        L0:
            r0 = 0
        L1:
            int r1 = r4.f64444d
            int r2 = r1 + r0
            int r3 = r4.f64445e
            if (r2 >= r3) goto L51
            char[] r2 = r4.f64443c
            int r1 = r1 + r0
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L4b
            r2 = 10
            if (r1 == r2) goto L4b
            r2 = 12
            if (r1 == r2) goto L4b
            r2 = 13
            if (r1 == r2) goto L4b
            r2 = 32
            if (r1 == r2) goto L4b
            r2 = 35
            if (r1 == r2) goto L48
            r2 = 44
            if (r1 == r2) goto L4b
            r2 = 47
            if (r1 == r2) goto L48
            r2 = 61
            if (r1 == r2) goto L48
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L4b
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L4b
            r2 = 58
            if (r1 == r2) goto L4b
            r2 = 59
            if (r1 == r2) goto L48
            switch(r1) {
                case 91: goto L4b;
                case 92: goto L48;
                case 93: goto L4b;
                default: goto L45;
            }
        L45:
            int r0 = r0 + 1
            goto L1
        L48:
            r4.j()
        L4b:
            int r1 = r4.f64444d
            int r1 = r1 + r0
            r4.f64444d = r1
            return
        L51:
            int r1 = r1 + r0
            r4.f64444d = r1
            r0 = 1
            boolean r0 = r4.C(r0)
            if (r0 != 0) goto L0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w5.C8268a.E0():void");
    }

    private MalformedJsonException G0(String str) throws MalformedJsonException {
        throw new MalformedJsonException(str + d0() + "\nSee " + o.a("malformed-json"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public IllegalStateException H0(String str) {
        return new IllegalStateException("Expected " + str + " but was " + v0() + d0() + "\nSee " + o.a(v0() == EnumC8269b.NULL ? "adapter-not-null-safe" : "unexpected-json-structure"));
    }

    private String J(boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('$');
        int i10 = 0;
        while (true) {
            int i11 = this.f64453m;
            if (i10 >= i11) {
                return sb2.toString();
            }
            int i12 = this.f64452l[i10];
            switch (i12) {
                case 1:
                case 2:
                    int i13 = this.f64455o[i10];
                    if (z10 && i13 > 0 && i10 == i11 - 1) {
                        i13--;
                    }
                    sb2.append('[');
                    sb2.append(i13);
                    sb2.append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    sb2.append('.');
                    String str = this.f64454n[i10];
                    if (str == null) {
                        break;
                    } else {
                        sb2.append(str);
                        break;
                    }
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    throw new AssertionError("Unknown scope value: " + i12);
            }
            i10++;
        }
    }

    private boolean b0(char c10) throws MalformedJsonException {
        if (c10 == '\t' || c10 == '\n' || c10 == '\f' || c10 == '\r' || c10 == ' ') {
            return false;
        }
        if (c10 != '#') {
            if (c10 == ',') {
                return false;
            }
            if (c10 != '/' && c10 != '=') {
                if (c10 == '{' || c10 == '}' || c10 == ':') {
                    return false;
                }
                if (c10 != ';') {
                    switch (c10) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        j();
        return false;
    }

    private void j() throws MalformedJsonException {
        if (this.f64442b != m.LENIENT) {
            throw G0("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        }
    }

    private void p() throws IOException {
        q0(true);
        int i10 = this.f64444d;
        this.f64444d = i10 - 1;
        if (i10 + 4 <= this.f64445e || C(5)) {
            int i11 = this.f64444d;
            char[] cArr = this.f64443c;
            if (cArr[i11] == ')' && cArr[i11 + 1] == ']' && cArr[i11 + 2] == '}' && cArr[i11 + 3] == '\'' && cArr[i11 + 4] == '\n') {
                this.f64444d = i11 + 5;
            }
        }
    }

    private int q0(boolean z10) throws IOException {
        char[] cArr = this.f64443c;
        int i10 = this.f64444d;
        int i11 = this.f64445e;
        while (true) {
            if (i10 == i11) {
                this.f64444d = i10;
                if (!C(1)) {
                    if (!z10) {
                        return -1;
                    }
                    throw new EOFException("End of input" + d0());
                }
                i10 = this.f64444d;
                i11 = this.f64445e;
            }
            int i12 = i10 + 1;
            char c10 = cArr[i10];
            if (c10 == '\n') {
                this.f64446f++;
                this.f64447g = i12;
            } else if (c10 != ' ' && c10 != '\r' && c10 != '\t') {
                if (c10 == '/') {
                    this.f64444d = i12;
                    if (i12 == i11) {
                        this.f64444d = i10;
                        boolean zC = C(2);
                        this.f64444d++;
                        if (!zC) {
                            return c10;
                        }
                    }
                    j();
                    int i13 = this.f64444d;
                    char c11 = cArr[i13];
                    if (c11 == '*') {
                        this.f64444d = i13 + 1;
                        if (!C0("*/")) {
                            throw G0("Unterminated comment");
                        }
                        i10 = this.f64444d + 2;
                        i11 = this.f64445e;
                    } else {
                        if (c11 != '/') {
                            return c10;
                        }
                        this.f64444d = i13 + 1;
                        D0();
                        i10 = this.f64444d;
                        i11 = this.f64445e;
                    }
                } else {
                    if (c10 != '#') {
                        this.f64444d = i12;
                        return c10;
                    }
                    this.f64444d = i12;
                    j();
                    D0();
                    i10 = this.f64444d;
                    i11 = this.f64445e;
                }
            }
            i10 = i12;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x006d, code lost:
    
        if (r1 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006f, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007d, code lost:
    
        r1.append(r0, r3, r2 - r3);
        r10.f64444d = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String s0(char r11) throws com.google.gson.stream.MalformedJsonException {
        /*
            r10 = this;
            char[] r0 = r10.f64443c
            r1 = 0
        L3:
            int r2 = r10.f64444d
            int r3 = r10.f64445e
        L7:
            r4 = r3
            r3 = r2
        L9:
            r5 = 16
            r6 = 1
            if (r2 >= r4) goto L6d
            int r7 = r2 + 1
            char r2 = r0[r2]
            com.google.gson.m r8 = r10.f64442b
            com.google.gson.m r9 = com.google.gson.m.STRICT
            if (r8 != r9) goto L25
            r8 = 32
            if (r2 < r8) goto L1d
            goto L25
        L1d:
            java.lang.String r11 = "Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode"
            com.google.gson.stream.MalformedJsonException r11 = r10.G0(r11)
            throw r11
        L25:
            if (r2 != r11) goto L3b
            r10.f64444d = r7
            int r7 = r7 - r3
            int r7 = r7 - r6
            if (r1 != 0) goto L33
            java.lang.String r11 = new java.lang.String
            r11.<init>(r0, r3, r7)
            return r11
        L33:
            r1.append(r0, r3, r7)
            java.lang.String r11 = r1.toString()
            return r11
        L3b:
            r8 = 92
            if (r2 != r8) goto L60
            r10.f64444d = r7
            int r7 = r7 - r3
            int r2 = r7 + (-1)
            if (r1 != 0) goto L51
            int r7 = r7 * 2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r4 = java.lang.Math.max(r7, r5)
            r1.<init>(r4)
        L51:
            r1.append(r0, r3, r2)
            char r2 = r10.z0()
            r1.append(r2)
            int r2 = r10.f64444d
            int r3 = r10.f64445e
            goto L7
        L60:
            r5 = 10
            if (r2 != r5) goto L6b
            int r2 = r10.f64446f
            int r2 = r2 + r6
            r10.f64446f = r2
            r10.f64447g = r7
        L6b:
            r2 = r7
            goto L9
        L6d:
            if (r1 != 0) goto L7d
            int r1 = r2 - r3
            int r1 = r1 * 2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r5)
            r4.<init>(r1)
            r1 = r4
        L7d:
            int r4 = r2 - r3
            r1.append(r0, r3, r4)
            r10.f64444d = r2
            boolean r2 = r10.C(r6)
            if (r2 == 0) goto L8c
            goto L3
        L8c:
            java.lang.String r11 = "Unterminated string"
            com.google.gson.stream.MalformedJsonException r11 = r10.G0(r11)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: w5.C8268a.s0(char):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004a, code lost:
    
        j();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String u0() throws com.google.gson.stream.MalformedJsonException {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = r1
        L3:
            int r3 = r6.f64444d
            int r4 = r3 + r2
            int r5 = r6.f64445e
            if (r4 >= r5) goto L4e
            char[] r4 = r6.f64443c
            int r3 = r3 + r2
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L5c
            r4 = 10
            if (r3 == r4) goto L5c
            r4 = 12
            if (r3 == r4) goto L5c
            r4 = 13
            if (r3 == r4) goto L5c
            r4 = 32
            if (r3 == r4) goto L5c
            r4 = 35
            if (r3 == r4) goto L4a
            r4 = 44
            if (r3 == r4) goto L5c
            r4 = 47
            if (r3 == r4) goto L4a
            r4 = 61
            if (r3 == r4) goto L4a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L5c
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L5c
            r4 = 58
            if (r3 == r4) goto L5c
            r4 = 59
            if (r3 == r4) goto L4a
            switch(r3) {
                case 91: goto L5c;
                case 92: goto L4a;
                case 93: goto L5c;
                default: goto L47;
            }
        L47:
            int r2 = r2 + 1
            goto L3
        L4a:
            r6.j()
            goto L5c
        L4e:
            char[] r3 = r6.f64443c
            int r3 = r3.length
            if (r2 >= r3) goto L5e
            int r3 = r2 + 1
            boolean r3 = r6.C(r3)
            if (r3 == 0) goto L5c
            goto L3
        L5c:
            r1 = r2
            goto L7e
        L5e:
            if (r0 != 0) goto L6b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r0.<init>(r3)
        L6b:
            char[] r3 = r6.f64443c
            int r4 = r6.f64444d
            r0.append(r3, r4, r2)
            int r3 = r6.f64444d
            int r3 = r3 + r2
            r6.f64444d = r3
            r2 = 1
            boolean r2 = r6.C(r2)
            if (r2 != 0) goto L2
        L7e:
            if (r0 != 0) goto L8a
            java.lang.String r0 = new java.lang.String
            char[] r2 = r6.f64443c
            int r3 = r6.f64444d
            r0.<init>(r2, r3, r1)
            goto L95
        L8a:
            char[] r2 = r6.f64443c
            int r3 = r6.f64444d
            r0.append(r2, r3, r1)
            java.lang.String r0 = r0.toString()
        L95:
            int r2 = r6.f64444d
            int r2 = r2 + r1
            r6.f64444d = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: w5.C8268a.u0():java.lang.String");
    }

    private int w0() {
        String str;
        String str2;
        int i10;
        char c10 = this.f64443c[this.f64444d];
        if (c10 == 't' || c10 == 'T') {
            str = "true";
            str2 = "TRUE";
            i10 = 5;
        } else if (c10 == 'f' || c10 == 'F') {
            str = "false";
            str2 = "FALSE";
            i10 = 6;
        } else {
            if (c10 != 'n' && c10 != 'N') {
                return 0;
            }
            str = "null";
            str2 = "NULL";
            i10 = 7;
        }
        boolean z10 = this.f64442b != m.STRICT;
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            if (this.f64444d + i11 >= this.f64445e && !C(i11 + 1)) {
                return 0;
            }
            char c11 = this.f64443c[this.f64444d + i11];
            if (c11 != str.charAt(i11) && (!z10 || c11 != str2.charAt(i11))) {
                return 0;
            }
        }
        if ((this.f64444d + length < this.f64445e || C(length + 1)) && b0(this.f64443c[this.f64444d + length])) {
            return 0;
        }
        this.f64444d += length;
        this.f64448h = i10;
        return i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0091, code lost:
    
        if (b0(r14) != false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0093, code lost:
    
        if (r9 != 2) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0095, code lost:
    
        if (r10 == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x009b, code lost:
    
        if (r11 != Long.MIN_VALUE) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x009d, code lost:
    
        if (r13 == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00a3, code lost:
    
        if (r11 != 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00a5, code lost:
    
        if (r13 != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00a7, code lost:
    
        if (r13 == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00aa, code lost:
    
        r11 = -r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00ab, code lost:
    
        r18.f64449i = r11;
        r18.f64444d += r8;
        r18.f64448h = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00b6, code lost:
    
        return 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00b7, code lost:
    
        if (r9 == 2) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00ba, code lost:
    
        if (r9 == 4) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00bd, code lost:
    
        if (r9 != 7) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00c0, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00c2, code lost:
    
        r18.f64450j = r8;
        r18.f64448h = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00c8, code lost:
    
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00c9, code lost:
    
        return 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int x0() {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w5.C8268a.x0():int");
    }

    private void y0(int i10) {
        int i11 = this.f64453m;
        int[] iArr = this.f64452l;
        if (i11 == iArr.length) {
            int i12 = i11 * 2;
            this.f64452l = Arrays.copyOf(iArr, i12);
            this.f64455o = Arrays.copyOf(this.f64455o, i12);
            this.f64454n = (String[]) Arrays.copyOf(this.f64454n, i12);
        }
        int[] iArr2 = this.f64452l;
        int i13 = this.f64453m;
        this.f64453m = i13 + 1;
        iArr2[i13] = i10;
    }

    private char z0() throws MalformedJsonException {
        int i10;
        if (this.f64444d == this.f64445e && !C(1)) {
            throw G0("Unterminated escape sequence");
        }
        char[] cArr = this.f64443c;
        int i11 = this.f64444d;
        int i12 = i11 + 1;
        this.f64444d = i12;
        char c10 = cArr[i11];
        if (c10 != '\n') {
            if (c10 != '\"') {
                if (c10 != '\'') {
                    if (c10 != '/' && c10 != '\\') {
                        if (c10 == 'b') {
                            return '\b';
                        }
                        if (c10 == 'f') {
                            return '\f';
                        }
                        if (c10 == 'n') {
                            return '\n';
                        }
                        if (c10 == 'r') {
                            return '\r';
                        }
                        if (c10 == 't') {
                            return '\t';
                        }
                        if (c10 != 'u') {
                            throw G0("Invalid escape sequence");
                        }
                        if (i11 + 5 > this.f64445e && !C(4)) {
                            throw G0("Unterminated escape sequence");
                        }
                        int i13 = this.f64444d;
                        int i14 = i13 + 4;
                        int i15 = 0;
                        while (i13 < i14) {
                            char c11 = this.f64443c[i13];
                            int i16 = i15 << 4;
                            if (c11 >= '0' && c11 <= '9') {
                                i10 = c11 - '0';
                            } else if (c11 >= 'a' && c11 <= 'f') {
                                i10 = c11 - 'W';
                            } else {
                                if (c11 < 'A' || c11 > 'F') {
                                    throw G0("Malformed Unicode escape \\u" + new String(this.f64443c, this.f64444d, 4));
                                }
                                i10 = c11 - '7';
                            }
                            i15 = i16 + i10;
                            i13++;
                        }
                        this.f64444d += 4;
                        return (char) i15;
                    }
                }
            }
            return c10;
        }
        if (this.f64442b == m.STRICT) {
            throw G0("Cannot escape a newline character in strict mode");
        }
        this.f64446f++;
        this.f64447g = i12;
        if (this.f64442b == m.STRICT) {
            throw G0("Invalid escaped character \"'\" in strict mode");
        }
        return c10;
    }

    public final void A0(m mVar) {
        Objects.requireNonNull(mVar);
        this.f64442b = mVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void F0() throws IOException {
        int i10 = 0;
        do {
            int iS = this.f64448h;
            if (iS == 0) {
                iS = s();
            }
            switch (iS) {
                case 1:
                    y0(3);
                    i10++;
                    this.f64448h = 0;
                    break;
                case 2:
                    if (i10 == 0) {
                        this.f64454n[this.f64453m - 1] = null;
                    }
                    this.f64453m--;
                    i10--;
                    this.f64448h = 0;
                    break;
                case 3:
                    y0(1);
                    i10++;
                    this.f64448h = 0;
                    break;
                case 4:
                    this.f64453m--;
                    i10--;
                    this.f64448h = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 11:
                case 15:
                default:
                    this.f64448h = 0;
                    break;
                case 8:
                    B0('\'');
                    this.f64448h = 0;
                    break;
                case 9:
                    B0('\"');
                    this.f64448h = 0;
                    break;
                case 10:
                    E0();
                    this.f64448h = 0;
                    break;
                case 12:
                    B0('\'');
                    if (i10 == 0) {
                        this.f64454n[this.f64453m - 1] = "<skipped>";
                    }
                    this.f64448h = 0;
                    break;
                case 13:
                    B0('\"');
                    if (i10 == 0) {
                        this.f64454n[this.f64453m - 1] = "<skipped>";
                    }
                    this.f64448h = 0;
                    break;
                case 14:
                    E0();
                    if (i10 == 0) {
                        this.f64454n[this.f64453m - 1] = "<skipped>";
                    }
                    this.f64448h = 0;
                    break;
                case 16:
                    this.f64444d += this.f64450j;
                    this.f64448h = 0;
                    break;
                case 17:
                    break;
            }
            return;
        } while (i10 > 0);
        int[] iArr = this.f64455o;
        int i11 = this.f64453m - 1;
        iArr[i11] = iArr[i11] + 1;
    }

    public String P() {
        return J(true);
    }

    public final m S() {
        return this.f64442b;
    }

    public boolean T() throws IOException {
        int iS = this.f64448h;
        if (iS == 0) {
            iS = s();
        }
        return (iS == 2 || iS == 4 || iS == 17) ? false : true;
    }

    public final boolean Y() {
        return this.f64442b == m.LENIENT;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f64448h = 0;
        this.f64452l[0] = 8;
        this.f64453m = 1;
        this.f64441a.close();
    }

    String d0() {
        return " at line " + (this.f64446f + 1) + " column " + ((this.f64444d - this.f64447g) + 1) + " path " + getPath();
    }

    public boolean f0() throws IOException {
        int iS = this.f64448h;
        if (iS == 0) {
            iS = s();
        }
        if (iS == 5) {
            this.f64448h = 0;
            int[] iArr = this.f64455o;
            int i10 = this.f64453m - 1;
            iArr[i10] = iArr[i10] + 1;
            return true;
        }
        if (iS != 6) {
            throw H0("a boolean");
        }
        this.f64448h = 0;
        int[] iArr2 = this.f64455o;
        int i11 = this.f64453m - 1;
        iArr2[i11] = iArr2[i11] + 1;
        return false;
    }

    public void g() throws IOException {
        int iS = this.f64448h;
        if (iS == 0) {
            iS = s();
        }
        if (iS != 3) {
            throw H0("BEGIN_ARRAY");
        }
        y0(1);
        this.f64455o[this.f64453m - 1] = 0;
        this.f64448h = 0;
    }

    public String getPath() {
        return J(false);
    }

    public void h() throws IOException {
        int iS = this.f64448h;
        if (iS == 0) {
            iS = s();
        }
        if (iS != 1) {
            throw H0("BEGIN_OBJECT");
        }
        y0(3);
        this.f64448h = 0;
    }

    public double m0() throws IOException, NumberFormatException {
        int iS = this.f64448h;
        if (iS == 0) {
            iS = s();
        }
        if (iS == 15) {
            this.f64448h = 0;
            int[] iArr = this.f64455o;
            int i10 = this.f64453m - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f64449i;
        }
        if (iS == 16) {
            this.f64451k = new String(this.f64443c, this.f64444d, this.f64450j);
            this.f64444d += this.f64450j;
        } else if (iS == 8 || iS == 9) {
            this.f64451k = s0(iS == 8 ? '\'' : '\"');
        } else if (iS == 10) {
            this.f64451k = u0();
        } else if (iS != 11) {
            throw H0("a double");
        }
        this.f64448h = 11;
        double d10 = Double.parseDouble(this.f64451k);
        if (this.f64442b != m.LENIENT && (Double.isNaN(d10) || Double.isInfinite(d10))) {
            throw G0("JSON forbids NaN and infinities: " + d10);
        }
        this.f64451k = null;
        this.f64448h = 0;
        int[] iArr2 = this.f64455o;
        int i11 = this.f64453m - 1;
        iArr2[i11] = iArr2[i11] + 1;
        return d10;
    }

    public int n0() throws IOException, NumberFormatException {
        int iS = this.f64448h;
        if (iS == 0) {
            iS = s();
        }
        if (iS == 15) {
            long j10 = this.f64449i;
            int i10 = (int) j10;
            if (j10 == i10) {
                this.f64448h = 0;
                int[] iArr = this.f64455o;
                int i11 = this.f64453m - 1;
                iArr[i11] = iArr[i11] + 1;
                return i10;
            }
            throw new NumberFormatException("Expected an int but was " + this.f64449i + d0());
        }
        if (iS == 16) {
            this.f64451k = new String(this.f64443c, this.f64444d, this.f64450j);
            this.f64444d += this.f64450j;
        } else {
            if (iS != 8 && iS != 9 && iS != 10) {
                throw H0("an int");
            }
            if (iS == 10) {
                this.f64451k = u0();
            } else {
                this.f64451k = s0(iS == 8 ? '\'' : '\"');
            }
            try {
                int i12 = Integer.parseInt(this.f64451k);
                this.f64448h = 0;
                int[] iArr2 = this.f64455o;
                int i13 = this.f64453m - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return i12;
            } catch (NumberFormatException unused) {
            }
        }
        this.f64448h = 11;
        double d10 = Double.parseDouble(this.f64451k);
        int i14 = (int) d10;
        if (i14 != d10) {
            throw new NumberFormatException("Expected an int but was " + this.f64451k + d0());
        }
        this.f64451k = null;
        this.f64448h = 0;
        int[] iArr3 = this.f64455o;
        int i15 = this.f64453m - 1;
        iArr3[i15] = iArr3[i15] + 1;
        return i14;
    }

    public long o0() throws IOException, NumberFormatException {
        int iS = this.f64448h;
        if (iS == 0) {
            iS = s();
        }
        if (iS == 15) {
            this.f64448h = 0;
            int[] iArr = this.f64455o;
            int i10 = this.f64453m - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f64449i;
        }
        if (iS == 16) {
            this.f64451k = new String(this.f64443c, this.f64444d, this.f64450j);
            this.f64444d += this.f64450j;
        } else {
            if (iS != 8 && iS != 9 && iS != 10) {
                throw H0("a long");
            }
            if (iS == 10) {
                this.f64451k = u0();
            } else {
                this.f64451k = s0(iS == 8 ? '\'' : '\"');
            }
            try {
                long j10 = Long.parseLong(this.f64451k);
                this.f64448h = 0;
                int[] iArr2 = this.f64455o;
                int i11 = this.f64453m - 1;
                iArr2[i11] = iArr2[i11] + 1;
                return j10;
            } catch (NumberFormatException unused) {
            }
        }
        this.f64448h = 11;
        double d10 = Double.parseDouble(this.f64451k);
        long j11 = (long) d10;
        if (j11 != d10) {
            throw new NumberFormatException("Expected a long but was " + this.f64451k + d0());
        }
        this.f64451k = null;
        this.f64448h = 0;
        int[] iArr3 = this.f64455o;
        int i12 = this.f64453m - 1;
        iArr3[i12] = iArr3[i12] + 1;
        return j11;
    }

    public String p0() throws IOException {
        String strS0;
        int iS = this.f64448h;
        if (iS == 0) {
            iS = s();
        }
        if (iS == 14) {
            strS0 = u0();
        } else if (iS == 12) {
            strS0 = s0('\'');
        } else {
            if (iS != 13) {
                throw H0("a name");
            }
            strS0 = s0('\"');
        }
        this.f64448h = 0;
        this.f64454n[this.f64453m - 1] = strS0;
        return strS0;
    }

    public void r0() throws IOException {
        int iS = this.f64448h;
        if (iS == 0) {
            iS = s();
        }
        if (iS != 7) {
            throw H0("null");
        }
        this.f64448h = 0;
        int[] iArr = this.f64455o;
        int i10 = this.f64453m - 1;
        iArr[i10] = iArr[i10] + 1;
    }

    int s() throws IOException {
        int iQ0;
        int[] iArr = this.f64452l;
        int i10 = this.f64453m;
        int i11 = iArr[i10 - 1];
        if (i11 == 1) {
            iArr[i10 - 1] = 2;
        } else if (i11 == 2) {
            int iQ02 = q0(true);
            if (iQ02 != 44) {
                if (iQ02 != 59) {
                    if (iQ02 != 93) {
                        throw G0("Unterminated array");
                    }
                    this.f64448h = 4;
                    return 4;
                }
                j();
            }
        } else {
            if (i11 == 3 || i11 == 5) {
                iArr[i10 - 1] = 4;
                if (i11 == 5 && (iQ0 = q0(true)) != 44) {
                    if (iQ0 != 59) {
                        if (iQ0 != 125) {
                            throw G0("Unterminated object");
                        }
                        this.f64448h = 2;
                        return 2;
                    }
                    j();
                }
                int iQ03 = q0(true);
                if (iQ03 == 34) {
                    this.f64448h = 13;
                    return 13;
                }
                if (iQ03 == 39) {
                    j();
                    this.f64448h = 12;
                    return 12;
                }
                if (iQ03 == 125) {
                    if (i11 == 5) {
                        throw G0("Expected name");
                    }
                    this.f64448h = 2;
                    return 2;
                }
                j();
                this.f64444d--;
                if (!b0((char) iQ03)) {
                    throw G0("Expected name");
                }
                this.f64448h = 14;
                return 14;
            }
            if (i11 == 4) {
                iArr[i10 - 1] = 5;
                int iQ04 = q0(true);
                if (iQ04 != 58) {
                    if (iQ04 != 61) {
                        throw G0("Expected ':'");
                    }
                    j();
                    if (this.f64444d < this.f64445e || C(1)) {
                        char[] cArr = this.f64443c;
                        int i12 = this.f64444d;
                        if (cArr[i12] == '>') {
                            this.f64444d = i12 + 1;
                        }
                    }
                }
            } else if (i11 == 6) {
                if (this.f64442b == m.LENIENT) {
                    p();
                }
                this.f64452l[this.f64453m - 1] = 7;
            } else if (i11 == 7) {
                if (q0(false) == -1) {
                    this.f64448h = 17;
                    return 17;
                }
                j();
                this.f64444d--;
            } else if (i11 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        int iQ05 = q0(true);
        if (iQ05 == 34) {
            this.f64448h = 9;
            return 9;
        }
        if (iQ05 == 39) {
            j();
            this.f64448h = 8;
            return 8;
        }
        if (iQ05 != 44 && iQ05 != 59) {
            if (iQ05 == 91) {
                this.f64448h = 3;
                return 3;
            }
            if (iQ05 != 93) {
                if (iQ05 == 123) {
                    this.f64448h = 1;
                    return 1;
                }
                this.f64444d--;
                int iW0 = w0();
                if (iW0 != 0) {
                    return iW0;
                }
                int iX0 = x0();
                if (iX0 != 0) {
                    return iX0;
                }
                if (!b0(this.f64443c[this.f64444d])) {
                    throw G0("Expected value");
                }
                j();
                this.f64448h = 10;
                return 10;
            }
            if (i11 == 1) {
                this.f64448h = 4;
                return 4;
            }
        }
        if (i11 != 1 && i11 != 2) {
            throw G0("Unexpected value");
        }
        j();
        this.f64444d--;
        this.f64448h = 7;
        return 7;
    }

    public String t0() throws IOException {
        String str;
        int iS = this.f64448h;
        if (iS == 0) {
            iS = s();
        }
        if (iS == 10) {
            str = u0();
        } else if (iS == 8) {
            str = s0('\'');
        } else if (iS == 9) {
            str = s0('\"');
        } else if (iS == 11) {
            str = this.f64451k;
            this.f64451k = null;
        } else if (iS == 15) {
            str = Long.toString(this.f64449i);
        } else {
            if (iS != 16) {
                throw H0("a string");
            }
            str = new String(this.f64443c, this.f64444d, this.f64450j);
            this.f64444d += this.f64450j;
        }
        this.f64448h = 0;
        int[] iArr = this.f64455o;
        int i10 = this.f64453m - 1;
        iArr[i10] = iArr[i10] + 1;
        return str;
    }

    public String toString() {
        return getClass().getSimpleName() + d0();
    }

    public void v() throws IOException {
        int iS = this.f64448h;
        if (iS == 0) {
            iS = s();
        }
        if (iS != 4) {
            throw H0("END_ARRAY");
        }
        int i10 = this.f64453m;
        this.f64453m = i10 - 1;
        int[] iArr = this.f64455o;
        int i11 = i10 - 2;
        iArr[i11] = iArr[i11] + 1;
        this.f64448h = 0;
    }

    public EnumC8269b v0() throws IOException {
        int iS = this.f64448h;
        if (iS == 0) {
            iS = s();
        }
        switch (iS) {
            case 1:
                return EnumC8269b.BEGIN_OBJECT;
            case 2:
                return EnumC8269b.END_OBJECT;
            case 3:
                return EnumC8269b.BEGIN_ARRAY;
            case 4:
                return EnumC8269b.END_ARRAY;
            case 5:
            case 6:
                return EnumC8269b.BOOLEAN;
            case 7:
                return EnumC8269b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return EnumC8269b.STRING;
            case 12:
            case 13:
            case 14:
                return EnumC8269b.NAME;
            case 15:
            case 16:
                return EnumC8269b.NUMBER;
            case 17:
                return EnumC8269b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public void y() throws IOException {
        int iS = this.f64448h;
        if (iS == 0) {
            iS = s();
        }
        if (iS != 2) {
            throw H0("END_OBJECT");
        }
        int i10 = this.f64453m;
        int i11 = i10 - 1;
        this.f64453m = i11;
        this.f64454n[i11] = null;
        int[] iArr = this.f64455o;
        int i12 = i10 - 2;
        iArr[i12] = iArr[i12] + 1;
        this.f64448h = 0;
    }
}
