package ol;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.google.android.gms.common.api.internal.a0;
import java.io.Serializable;
import java.util.ArrayList;
import w4.m;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30590a;

    /* renamed from: b, reason: collision with root package name */
    public int f30591b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f30592c;

    /* renamed from: d, reason: collision with root package name */
    public Serializable f30593d;

    /* renamed from: e, reason: collision with root package name */
    public final Serializable f30594e;

    /* renamed from: f, reason: collision with root package name */
    public final Serializable f30595f;

    /* JADX WARN: Type inference failed for: r2v4, types: [double[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r3v2, types: [double[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r9v3, types: [int[], java.io.Serializable] */
    public i(m mVar) {
        this.f30590a = 2;
        ArrayList arrayList = (ArrayList) mVar.f36443b;
        int size = arrayList.size();
        this.f30592c = (String[]) ((ArrayList) mVar.f36442a).toArray(new String[size]);
        int size2 = arrayList.size();
        ?? r32 = new double[size2];
        for (int i4 = 0; i4 < size2; i4++) {
            r32[i4] = ((Double) arrayList.get(i4)).doubleValue();
        }
        this.f30593d = r32;
        ArrayList arrayList2 = (ArrayList) mVar.f36444c;
        int size3 = arrayList2.size();
        ?? r22 = new double[size3];
        for (int i10 = 0; i10 < size3; i10++) {
            r22[i10] = ((Double) arrayList2.get(i10)).doubleValue();
        }
        this.f30594e = r22;
        this.f30595f = new int[size];
        this.f30591b = 0;
    }

    public static /* synthetic */ void k(i iVar, String str, int i4, int i10) {
        if ((i10 & 2) != 0) {
            i4 = iVar.f30591b;
        }
        iVar.j(i4, str, (i10 & 4) != 0 ? "" : "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'");
        throw null;
    }

    public int a(int i4, CharSequence charSequence) {
        int i10 = i4 + 4;
        if (i10 < charSequence.length()) {
            ((StringBuilder) this.f30595f).append((char) (m(i4 + 3, charSequence) + (m(i4, charSequence) << 12) + (m(i4 + 1, charSequence) << 8) + (m(i4 + 2, charSequence) << 4)));
            return i10;
        }
        this.f30591b = i4;
        if (i10 < charSequence.length()) {
            return a(this.f30591b, charSequence);
        }
        k(this, "Unexpected EOF during unicode escape", 0, 6);
        throw null;
    }

    public boolean b() {
        int i4 = this.f30591b;
        if (i4 == -1) {
            return false;
        }
        String str = (String) this.f30594e;
        while (i4 < str.length()) {
            char cCharAt = str.charAt(i4);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f30591b = i4;
                return (cCharAt == ',' || cCharAt == ':' || cCharAt == ']' || cCharAt == '}') ? false : true;
            }
            i4++;
        }
        this.f30591b = i4;
        return false;
    }

    public void c(int i4, String str) {
        String str2 = (String) this.f30594e;
        if (str2.length() - i4 < str.length()) {
            k(this, "Unexpected end of boolean literal", 0, 6);
            throw null;
        }
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (str.charAt(i10) != (str2.charAt(i4 + i10) | ' ')) {
                k(this, "Expected valid boolean literal prefix, but had '" + h() + '\'', 0, 6);
                throw null;
            }
        }
        this.f30591b = str.length() + i4;
    }

    public String d() {
        StringBuilder sb2 = (StringBuilder) this.f30595f;
        String str = (String) this.f30594e;
        e('\"');
        int i4 = this.f30591b;
        int iE0 = vk.i.E0(str, '\"', i4, 4);
        if (iE0 == -1) {
            h();
            l((byte) 1, false);
            throw null;
        }
        int i10 = i4;
        while (i10 < iE0) {
            if (str.charAt(i10) == '\\') {
                int iN = this.f30591b;
                char cCharAt = str.charAt(i10);
                boolean z3 = false;
                while (cCharAt != '\"') {
                    if (cCharAt == '\\') {
                        sb2.append((CharSequence) str, iN, i10);
                        int iN2 = n(i10 + 1);
                        if (iN2 == -1) {
                            k(this, "Expected escape sequence to continue, got EOF", 0, 6);
                            throw null;
                        }
                        int iA = iN2 + 1;
                        char cCharAt2 = str.charAt(iN2);
                        if (cCharAt2 == 'u') {
                            iA = a(iA, str);
                        } else {
                            char c9 = cCharAt2 < 'u' ? c.f30583a[cCharAt2] : (char) 0;
                            if (c9 == 0) {
                                k(this, "Invalid escaped char '" + cCharAt2 + '\'', 0, 6);
                                throw null;
                            }
                            sb2.append(c9);
                        }
                        iN = n(iA);
                        if (iN == -1) {
                            k(this, "Unexpected EOF", iN, 4);
                            throw null;
                        }
                    } else {
                        i10++;
                        if (i10 >= str.length()) {
                            sb2.append((CharSequence) str, iN, i10);
                            iN = n(i10);
                            if (iN == -1) {
                                k(this, "Unexpected EOF", iN, 4);
                                throw null;
                            }
                        } else {
                            continue;
                            cCharAt = str.charAt(i10);
                        }
                    }
                    i10 = iN;
                    z3 = true;
                    cCharAt = str.charAt(i10);
                }
                String string = !z3 ? str.subSequence(iN, i10).toString() : i(iN, i10);
                this.f30591b = i10 + 1;
                return string;
            }
            i10++;
        }
        this.f30591b = iE0 + 1;
        String strSubstring = str.substring(i4, iE0);
        nk.k.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public void e(char c9) {
        int i4 = this.f30591b;
        if (i4 == -1) {
            r(c9);
            throw null;
        }
        String str = (String) this.f30594e;
        while (i4 < str.length()) {
            int i10 = i4 + 1;
            char cCharAt = str.charAt(i4);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f30591b = i10;
                if (cCharAt == c9) {
                    return;
                }
                r(c9);
                throw null;
            }
            i4 = i10;
        }
        this.f30591b = -1;
        r(c9);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0185, code lost:
    
        throw new ac.m();
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0186, code lost:
    
        r10 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0187, code lost:
    
        if (r14 == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0189, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x018e, code lost:
    
        if (r10 == Long.MIN_VALUE) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0191, code lost:
    
        return -r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0192, code lost:
    
        k(r22, "Numeric value overflow", 0, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0197, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0198, code lost:
    
        k(r22, "Expected numeric literal", 0, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x019d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00e9, code lost:
    
        k(r22, "Unexpected symbol '" + r5 + "' in numeric literal", r7, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0100, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0101, code lost:
    
        if (r12 == r1) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0103, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0105, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0106, code lost:
    
        if (r1 == r12) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0108, code lost:
    
        if (r14 == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x010c, code lost:
    
        if (r1 == (r12 - 1)) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0113, code lost:
    
        if (r3 == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0115, code lost:
    
        if (r5 == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x011d, code lost:
    
        if (r2.charAt(r12) != '\"') goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x011f, code lost:
    
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0122, code lost:
    
        k(r22, "Expected closing quotation mark", 0, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0129, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x012a, code lost:
    
        k(r22, "EOF", 0, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x012f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0130, code lost:
    
        r22.f30591b = r12;
        r1 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0134, code lost:
    
        if (r13 == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0136, code lost:
    
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0139, code lost:
    
        if (r11 != 0) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x013b, code lost:
    
        r3 = java.lang.Math.pow(10.0d, -r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0143, code lost:
    
        if (r11 != 1) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0145, code lost:
    
        r3 = java.lang.Math.pow(10.0d, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x014a, code lost:
    
        r1 = r1 * r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x014f, code lost:
    
        if (r1 > 9.223372036854776E18d) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0155, code lost:
    
        if (r1 < (-9.223372036854776E18d)) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x015d, code lost:
    
        if (java.lang.Math.floor(r1) != r1) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x015f, code lost:
    
        r10 = (long) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0161, code lost:
    
        k(r22, "Can't convert " + r1 + " to Long", 0, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0179, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x017a, code lost:
    
        k(r22, "Numeric value overflow", 0, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x017f, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long f() {
        /*
            Method dump skipped, instructions count: 421
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ol.i.f():long");
    }

    public String g() {
        String str = (String) this.f30593d;
        if (str == null) {
            return d();
        }
        nk.k.b(str);
        this.f30593d = null;
        return str;
    }

    public String h() {
        String str = (String) this.f30594e;
        String str2 = (String) this.f30593d;
        if (str2 != null) {
            nk.k.b(str2);
            this.f30593d = null;
            return str2;
        }
        int iP = p();
        if (iP >= str.length() || iP == -1) {
            k(this, "EOF", iP, 4);
            throw null;
        }
        byte b10 = g.b(str.charAt(iP));
        if (b10 == 1) {
            return g();
        }
        if (b10 != 0) {
            k(this, "Expected beginning of the string, but got " + str.charAt(iP), 0, 6);
            throw null;
        }
        boolean z3 = false;
        while (g.b(str.charAt(iP)) == 0) {
            iP++;
            if (iP >= str.length()) {
                ((StringBuilder) this.f30595f).append((CharSequence) str, this.f30591b, iP);
                int iN = n(iP);
                if (iN == -1) {
                    this.f30591b = iP;
                    return i(0, 0);
                }
                iP = iN;
                z3 = true;
            }
        }
        String string = !z3 ? str.subSequence(this.f30591b, iP).toString() : i(this.f30591b, iP);
        this.f30591b = iP;
        return string;
    }

    public String i(int i4, int i10) {
        StringBuilder sb2 = (StringBuilder) this.f30595f;
        sb2.append((CharSequence) this.f30594e, i4, i10);
        String string = sb2.toString();
        nk.k.d(string, "toString(...)");
        sb2.setLength(0);
        return string;
    }

    public void j(int i4, String str, String str2) {
        nk.k.e(str, PglCryptUtils.KEY_MESSAGE);
        nk.k.e(str2, "hint");
        String strConcat = str2.length() == 0 ? "" : "\n".concat(str2);
        StringBuilder sbB = i3.e.b(str, " at path: ");
        sbB.append(((a0) this.f30592c).f());
        sbB.append(strConcat);
        String string = sbB.toString();
        String str3 = (String) this.f30594e;
        nk.k.e(string, PglCryptUtils.KEY_MESSAGE);
        nk.k.e(str3, "input");
        String str4 = string + "\nJSON input: " + ((Object) g.d(i4, str3));
        nk.k.e(str4, PglCryptUtils.KEY_MESSAGE);
        if (i4 >= 0) {
            str4 = "Unexpected JSON token at offset " + i4 + ": " + str4;
        }
        nk.k.e(str4, PglCryptUtils.KEY_MESSAGE);
        throw new e(str4);
    }

    public void l(byte b10, boolean z3) {
        String str = (String) this.f30594e;
        String str2 = b10 == 1 ? "quotation mark '\"'" : b10 == 2 ? "string escape sequence '\\'" : b10 == 4 ? "comma ','" : b10 == 5 ? "colon ':'" : b10 == 6 ? "start of the object '{'" : b10 == 7 ? "end of the object '}'" : b10 == 8 ? "start of the array '['" : b10 == 9 ? "end of the array ']'" : b10 == 10 ? "end of the input" : b10 == 127 ? "invalid token" : "valid token";
        int i4 = z3 ? this.f30591b - 1 : this.f30591b;
        k(this, a0.g.n("Expected ", str2, ", but had '", (this.f30591b == str.length() || i4 < 0) ? "EOF" : String.valueOf(str.charAt(i4)), "' instead"), i4, 4);
        throw null;
    }

    public int m(int i4, CharSequence charSequence) {
        char cCharAt = charSequence.charAt(i4);
        if ('0' <= cCharAt && cCharAt < ':') {
            return cCharAt - '0';
        }
        if ('a' <= cCharAt && cCharAt < 'g') {
            return cCharAt - 'W';
        }
        if ('A' <= cCharAt && cCharAt < 'G') {
            return cCharAt - '7';
        }
        k(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, 6);
        throw null;
    }

    public int n(int i4) {
        if (i4 < ((String) this.f30594e).length()) {
            return i4;
        }
        return -1;
    }

    public void o(float[] fArr, String str) {
        nk.k.e(str, "unit");
        ph.a aVar = new ph.a(fArr[0], str);
        ArrayList arrayList = (ArrayList) this.f30592c;
        arrayList.add(aVar);
        int size = arrayList.size();
        int i4 = this.f30591b;
        if (size > i4) {
            arrayList.remove(0);
        }
        if (fArr.length > 1) {
            ph.a aVar2 = new ph.a(fArr[1], str);
            ArrayList arrayList2 = (ArrayList) this.f30593d;
            arrayList2.add(aVar2);
            if (arrayList2.size() > i4) {
                arrayList2.remove(0);
            }
        }
        if (fArr.length > 2) {
            ph.a aVar3 = new ph.a(fArr[2], str);
            ArrayList arrayList3 = (ArrayList) this.f30594e;
            arrayList3.add(aVar3);
            if (arrayList3.size() > i4) {
                arrayList3.remove(0);
            }
        }
    }

    public int p() {
        char cCharAt;
        int i4 = this.f30591b;
        if (i4 == -1) {
            return i4;
        }
        String str = (String) this.f30594e;
        while (i4 < str.length() && ((cCharAt = str.charAt(i4)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
            i4++;
        }
        this.f30591b = i4;
        return i4;
    }

    public boolean q() {
        int iP = p();
        String str = (String) this.f30594e;
        if (iP >= str.length() || iP == -1 || str.charAt(iP) != ',') {
            return false;
        }
        this.f30591b++;
        return true;
    }

    public void r(char c9) {
        int i4 = this.f30591b;
        if (i4 > 0 && c9 == '\"') {
            try {
                this.f30591b = i4 - 1;
                String strH = h();
                this.f30591b = i4;
                if (nk.k.a(strH, "null")) {
                    j(this.f30591b - 1, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th2) {
                this.f30591b = i4;
                throw th2;
            }
        }
        l(g.b(c9), true);
        throw null;
    }

    public String toString() {
        switch (this.f30590a) {
            case 0:
                StringBuilder sb2 = new StringBuilder("JsonReader(source='");
                sb2.append(this.f30594e);
                sb2.append("', currentPosition=");
                return d.h.u(sb2, this.f30591b, ')');
            default:
                return super.toString();
        }
    }

    public i() {
        this.f30590a = 1;
        this.f30592c = new ArrayList();
        this.f30593d = new ArrayList();
        this.f30594e = new ArrayList();
        this.f30595f = new ArrayList();
        this.f30591b = 50;
    }

    public i(String str) {
        this.f30590a = 0;
        nk.k.e(str, "source");
        a0 a0Var = new a0((char) 0, 6);
        a0Var.f9070c = new Object[8];
        int[] iArr = new int[8];
        for (int i4 = 0; i4 < 8; i4++) {
            iArr[i4] = -1;
        }
        a0Var.f9071d = iArr;
        a0Var.f9069b = -1;
        this.f30592c = a0Var;
        this.f30595f = new StringBuilder();
        this.f30594e = str;
    }
}
