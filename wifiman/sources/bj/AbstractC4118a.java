package bj;

import Zg.AbstractC3689v;
import java.util.ArrayList;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlinx.serialization.json.internal.JsonDecodingException;

/* renamed from: bj.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4118a {

    /* renamed from: a, reason: collision with root package name */
    public int f33431a;

    /* renamed from: c, reason: collision with root package name */
    private String f33433c;

    /* renamed from: b, reason: collision with root package name */
    public final u f33432b = new u();

    /* renamed from: d, reason: collision with root package name */
    private StringBuilder f33434d = new StringBuilder();

    private final int B(CharSequence charSequence, int i10) {
        char cCharAt = charSequence.charAt(i10);
        if ('0' <= cCharAt && cCharAt < ':') {
            return cCharAt - '0';
        }
        if ('a' <= cCharAt && cCharAt < 'g') {
            return cCharAt - 'W';
        }
        if ('A' <= cCharAt && cCharAt < 'G') {
            return cCharAt - '7';
        }
        z(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    private final String L() {
        String str = this.f33433c;
        AbstractC6492s.f(str);
        this.f33433c = null;
        return str;
    }

    public static /* synthetic */ boolean O(AbstractC4118a abstractC4118a, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryConsumeNull");
        }
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return abstractC4118a.N(z10);
    }

    private final boolean Q() {
        return C().charAt(this.f33431a - 1) != '\"';
    }

    private final int b(int i10) {
        int iH = H(i10);
        if (iH == -1) {
            z(this, "Expected escape sequence to continue, got EOF", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        int i11 = iH + 1;
        char cCharAt = C().charAt(iH);
        if (cCharAt == 'u') {
            return d(C(), i11);
        }
        char cB = AbstractC4119b.b(cCharAt);
        if (cB != 0) {
            this.f33434d.append(cB);
            return i11;
        }
        z(this, "Invalid escaped char '" + cCharAt + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    private final int c(int i10, int i11) {
        e(i10, i11);
        return b(i11 + 1);
    }

    private final int d(CharSequence charSequence, int i10) {
        int i11 = i10 + 4;
        if (i11 < charSequence.length()) {
            this.f33434d.append((char) ((B(charSequence, i10) << 12) + (B(charSequence, i10 + 1) << 8) + (B(charSequence, i10 + 2) << 4) + B(charSequence, i10 + 3)));
            return i11;
        }
        this.f33431a = i10;
        w();
        if (this.f33431a + 4 < charSequence.length()) {
            return d(charSequence, this.f33431a);
        }
        z(this, "Unexpected EOF during unicode escape", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    private final boolean g(int i10) {
        int iH = H(i10);
        if (iH >= C().length() || iH == -1) {
            z(this, "EOF", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        int i11 = iH + 1;
        int iCharAt = C().charAt(iH) | ' ';
        if (iCharAt == 102) {
            i("alse", i11);
            return false;
        }
        if (iCharAt == 116) {
            i("rue", i11);
            return true;
        }
        z(this, "Expected valid boolean literal prefix, but had '" + s() + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    private final void i(String str, int i10) {
        if (C().length() - i10 < str.length()) {
            z(this, "Unexpected end of boolean literal", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            if (str.charAt(i11) != (C().charAt(i10 + i11) | ' ')) {
                z(this, "Expected valid boolean literal prefix, but had '" + s() + '\'', 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
        }
        this.f33431a = i10 + str.length();
    }

    private static final double o(long j10, boolean z10) {
        if (!z10) {
            return Math.pow(10.0d, -j10);
        }
        if (z10) {
            return Math.pow(10.0d, j10);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final String u(int i10, int i11) {
        e(i10, i11);
        String string = this.f33434d.toString();
        AbstractC6492s.h(string, "toString(...)");
        this.f33434d.setLength(0);
        return string;
    }

    public static /* synthetic */ Void z(AbstractC4118a abstractC4118a, String str, int i10, String str2, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fail");
        }
        if ((i11 & 2) != 0) {
            i10 = abstractC4118a.f33431a;
        }
        if ((i11 & 4) != 0) {
            str2 = "";
        }
        return abstractC4118a.y(str, i10, str2);
    }

    public final void A(String key) {
        AbstractC6492s.i(key, "key");
        int iQ0 = kotlin.text.t.q0(K(0, this.f33431a), key, 0, false, 6, null);
        throw new JsonDecodingException("Encountered an unknown key '" + key + "' at offset " + iQ0 + " at path: " + this.f33432b.a() + "\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.\nJSON input: " + ((Object) r.h(C(), iQ0)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract CharSequence C();

    protected final boolean D(char c10) {
        return (c10 == ',' || c10 == ':' || c10 == ']' || c10 == '}') ? false : true;
    }

    public abstract String E(String str, boolean z10);

    public byte F() {
        CharSequence charSequenceC = C();
        int i10 = this.f33431a;
        while (true) {
            int iH = H(i10);
            if (iH == -1) {
                this.f33431a = iH;
                return (byte) 10;
            }
            char cCharAt = charSequenceC.charAt(iH);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
                this.f33431a = iH;
                return AbstractC4119b.a(cCharAt);
            }
            i10 = iH + 1;
        }
    }

    public final String G(boolean z10) {
        String strQ;
        byte bF = F();
        if (z10) {
            if (bF != 1 && bF != 0) {
                return null;
            }
            strQ = s();
        } else {
            if (bF != 1) {
                return null;
            }
            strQ = q();
        }
        this.f33433c = strQ;
        return strQ;
    }

    public abstract int H(int i10);

    public final void I(boolean z10) {
        ArrayList arrayList = new ArrayList();
        byte bF = F();
        if (bF != 8 && bF != 6) {
            s();
            return;
        }
        while (true) {
            byte bF2 = F();
            if (bF2 != 1) {
                if (bF2 == 8 || bF2 == 6) {
                    arrayList.add(Byte.valueOf(bF2));
                } else if (bF2 == 9) {
                    if (((Number) AbstractC3689v.B0(arrayList)).byteValue() != 8) {
                        throw r.e(this.f33431a, "found ] instead of } at path: " + this.f33432b, C());
                    }
                    AbstractC3689v.N(arrayList);
                } else if (bF2 == 7) {
                    if (((Number) AbstractC3689v.B0(arrayList)).byteValue() != 6) {
                        throw r.e(this.f33431a, "found } instead of ] at path: " + this.f33432b, C());
                    }
                    AbstractC3689v.N(arrayList);
                } else if (bF2 == 10) {
                    z(this, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
                k();
                if (arrayList.size() == 0) {
                    return;
                }
            } else if (z10) {
                s();
            } else {
                j();
            }
        }
    }

    public abstract int J();

    public String K(int i10, int i11) {
        return C().subSequence(i10, i11).toString();
    }

    public final boolean M() {
        int iJ = J();
        CharSequence charSequenceC = C();
        if (iJ >= charSequenceC.length() || iJ == -1 || charSequenceC.charAt(iJ) != ',') {
            return false;
        }
        this.f33431a++;
        return true;
    }

    public final boolean N(boolean z10) {
        int iH = H(J());
        int length = C().length() - iH;
        if (length < 4 || iH == -1) {
            return false;
        }
        for (int i10 = 0; i10 < 4; i10++) {
            if ("null".charAt(i10) != C().charAt(iH + i10)) {
                return false;
            }
        }
        if (length > 4 && AbstractC4119b.a(C().charAt(iH + 4)) == 0) {
            return false;
        }
        if (!z10) {
            return true;
        }
        this.f33431a = iH + 4;
        return true;
    }

    protected final void P(char c10) {
        int i10 = this.f33431a;
        if (i10 > 0 && c10 == '\"') {
            try {
                this.f33431a = i10 - 1;
                String strS = s();
                this.f33431a = i10;
                if (AbstractC6492s.d(strS, "null")) {
                    y("Expected string literal but 'null' literal was found", this.f33431a - 1, "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw new KotlinNothingValueException();
                }
            } catch (Throwable th2) {
                this.f33431a = i10;
                throw th2;
            }
        }
        String strC = AbstractC4119b.c(AbstractC4119b.a(c10));
        int i11 = this.f33431a;
        int i12 = i11 - 1;
        z(this, "Expected " + strC + ", but had '" + ((i11 == C().length() || i12 < 0) ? "EOF" : String.valueOf(C().charAt(i12))) + "' instead", i12, null, 4, null);
        throw new KotlinNothingValueException();
    }

    protected void e(int i10, int i11) {
        this.f33434d.append(C(), i10, i11);
    }

    public abstract boolean f();

    public final boolean h() {
        boolean z10;
        int iJ = J();
        if (iJ == C().length()) {
            z(this, "EOF", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        if (C().charAt(iJ) == '\"') {
            iJ++;
            z10 = true;
        } else {
            z10 = false;
        }
        boolean zG = g(iJ);
        if (z10) {
            if (this.f33431a == C().length()) {
                z(this, "EOF", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            if (C().charAt(this.f33431a) != '\"') {
                z(this, "Expected closing quotation mark", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            this.f33431a++;
        }
        return zG;
    }

    public abstract String j();

    public abstract byte k();

    public final byte l(byte b10) {
        byte bK = k();
        if (bK == b10) {
            return bK;
        }
        String strC = AbstractC4119b.c(b10);
        int i10 = this.f33431a;
        int i11 = i10 - 1;
        z(this, "Expected " + strC + ", but had '" + ((i10 == C().length() || i11 < 0) ? "EOF" : String.valueOf(C().charAt(i11))) + "' instead", i11, null, 4, null);
        throw new KotlinNothingValueException();
    }

    public abstract void m(char c10);

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01f6, code lost:
    
        z(r17, "Expected numeric literal", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0206, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:?, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x011d, code lost:
    
        z(r17, "Unexpected symbol '" + r3 + "' in numeric literal", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0141, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0142, code lost:
    
        if (r5 == r0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0144, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0146, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0147, code lost:
    
        if (r0 == r5) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0149, code lost:
    
        if (r10 == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x014d, code lost:
    
        if (r0 == (r5 - 1)) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x014f, code lost:
    
        if (r1 == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0151, code lost:
    
        if (r3 == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x015d, code lost:
    
        if (C().charAt(r5) != '\"') goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x015f, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0162, code lost:
    
        z(r17, "Expected closing quotation mark", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0172, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0173, code lost:
    
        z(r17, "EOF", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0183, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0184, code lost:
    
        r17.f33431a = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0186, code lost:
    
        if (r9 == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0188, code lost:
    
        r0 = r11 * o(r13, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0192, code lost:
    
        if (r0 > 9.223372036854776E18d) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0198, code lost:
    
        if (r0 < (-9.223372036854776E18d)) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01a0, code lost:
    
        if (java.lang.Math.floor(r0) != r0) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01a2, code lost:
    
        r11 = (long) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01a4, code lost:
    
        z(r17, "Can't convert " + r0 + " to Long", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01c8, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01c9, code lost:
    
        z(r17, "Numeric value overflow", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01d9, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01da, code lost:
    
        if (r10 == false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01e1, code lost:
    
        if (r11 == Long.MIN_VALUE) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01e4, code lost:
    
        return -r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01e5, code lost:
    
        z(r17, "Numeric value overflow", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01f5, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long n() {
        /*
            Method dump skipped, instructions count: 536
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: bj.AbstractC4118a.n():long");
    }

    public final long p() {
        long jN = n();
        if (k() == 10) {
            return jN;
        }
        AbstractC4119b.c((byte) 10);
        int i10 = this.f33431a;
        int i11 = i10 - 1;
        z(this, "Expected input to contain a single valid number, but got '" + ((i10 == C().length() || i11 < 0) ? "EOF" : String.valueOf(C().charAt(i11))) + "' after it", i11, null, 4, null);
        throw new KotlinNothingValueException();
    }

    public final String q() {
        return this.f33433c != null ? L() : j();
    }

    protected final String r(CharSequence source, int i10, int i11) {
        int iH;
        AbstractC6492s.i(source, "source");
        char cCharAt = source.charAt(i11);
        boolean z10 = false;
        while (cCharAt != '\"') {
            if (cCharAt == '\\') {
                iH = H(c(i10, i11));
                if (iH == -1) {
                    z(this, "Unexpected EOF", iH, null, 4, null);
                    throw new KotlinNothingValueException();
                }
            } else {
                i11++;
                if (i11 >= source.length()) {
                    e(i10, i11);
                    iH = H(i11);
                    if (iH == -1) {
                        z(this, "Unexpected EOF", iH, null, 4, null);
                        throw new KotlinNothingValueException();
                    }
                } else {
                    continue;
                    cCharAt = source.charAt(i11);
                }
            }
            z10 = true;
            i10 = iH;
            i11 = i10;
            cCharAt = source.charAt(i11);
        }
        String strK = !z10 ? K(i10, i11) : u(i10, i11);
        this.f33431a = i11 + 1;
        return strK;
    }

    public final String s() {
        if (this.f33433c != null) {
            return L();
        }
        int iJ = J();
        if (iJ >= C().length() || iJ == -1) {
            z(this, "EOF", iJ, null, 4, null);
            throw new KotlinNothingValueException();
        }
        byte bA = AbstractC4119b.a(C().charAt(iJ));
        if (bA == 1) {
            return q();
        }
        if (bA != 0) {
            z(this, "Expected beginning of the string, but got " + C().charAt(iJ), 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        boolean z10 = false;
        while (AbstractC4119b.a(C().charAt(iJ)) == 0) {
            iJ++;
            if (iJ >= C().length()) {
                e(this.f33431a, iJ);
                int iH = H(iJ);
                if (iH == -1) {
                    this.f33431a = iJ;
                    return u(0, 0);
                }
                iJ = iH;
                z10 = true;
            }
        }
        String strK = !z10 ? K(this.f33431a, iJ) : u(this.f33431a, iJ);
        this.f33431a = iJ;
        return strK;
    }

    public final String t() {
        String strS = s();
        if (!AbstractC6492s.d(strS, "null") || !Q()) {
            return strS;
        }
        z(this, "Unexpected 'null' value instead of string literal", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public String toString() {
        return "JsonReader(source='" + ((Object) C()) + "', currentPosition=" + this.f33431a + ')';
    }

    public final void v() {
        this.f33433c = null;
    }

    public void w() {
    }

    public final void x() {
        if (k() == 10) {
            return;
        }
        z(this, "Expected EOF after parsing, but had " + C().charAt(this.f33431a - 1) + " instead", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public final Void y(String message, int i10, String hint) {
        String str;
        AbstractC6492s.i(message, "message");
        AbstractC6492s.i(hint, "hint");
        if (hint.length() == 0) {
            str = "";
        } else {
            str = '\n' + hint;
        }
        throw r.e(i10, message + " at path: " + this.f33432b.a() + str, C());
    }
}
