package S9;

import N7.G8;
import N7.H7;
import io.appmetrica.analytics.impl.Oo;
import t4.C5606d;

/* compiled from: AbstractJsonLexer.kt */
/* renamed from: S9.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1569a {

    /* renamed from: a, reason: collision with root package name */
    public int f12066a;

    /* renamed from: b, reason: collision with root package name */
    public final z f12067b;

    /* renamed from: c, reason: collision with root package name */
    public String f12068c;

    /* renamed from: d, reason: collision with root package name */
    public final StringBuilder f12069d;

    public AbstractC1569a() {
        z zVar = new z();
        zVar.f12111a = new Object[8];
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = -1;
        }
        zVar.f12112b = iArr;
        zVar.f12113c = -1;
        this.f12067b = zVar;
        this.f12069d = new StringBuilder();
    }

    public static /* synthetic */ void s(AbstractC1569a abstractC1569a, String str, int i, int i10) {
        if ((i10 & 2) != 0) {
            i = abstractC1569a.f12066a;
        }
        abstractC1569a.r(i, str, (i10 & 4) != 0 ? "" : "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'");
        throw null;
    }

    public abstract boolean A();

    public final void B(char c10) {
        int i = this.f12066a - 1;
        this.f12066a = i;
        if (i >= 0 && c10 == '\"' && kotlin.jvm.internal.l.b(m(), "null")) {
            r(this.f12066a - 4, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}` builder to coerce nulls to default values.");
            throw null;
        }
        t(C5606d.h(c10));
        throw null;
    }

    public final int a(CharSequence charSequence, int i) {
        int i10 = i + 4;
        if (i10 < charSequence.length()) {
            this.f12069d.append((char) (u(charSequence, i + 3) + (u(charSequence, i) << 12) + (u(charSequence, i + 1) << 8) + (u(charSequence, i + 2) << 4)));
            return i10;
        }
        this.f12066a = i;
        p();
        if (this.f12066a + 4 < charSequence.length()) {
            return a(charSequence, this.f12066a);
        }
        s(this, "Unexpected EOF during unicode escape", 0, 6);
        throw null;
    }

    public void b(int i, int i10) {
        this.f12069d.append(v(), i, i10);
    }

    public abstract boolean c();

    public final void d(int i, String str) {
        if (v().length() - i < str.length()) {
            s(this, "Unexpected end of boolean literal", 0, 6);
            throw null;
        }
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (str.charAt(i10) != (v().charAt(i + i10) | ' ')) {
                s(this, "Expected valid boolean literal prefix, but had '" + m() + '\'', 0, 6);
                throw null;
            }
        }
        this.f12066a = str.length() + i;
    }

    public abstract String e();

    public abstract String f(String str);

    public abstract byte g();

    public final byte h(byte b10) {
        byte bG = g();
        if (bG == b10) {
            return bG;
        }
        t(b10);
        throw null;
    }

    public void i(char c10) {
        p();
        CharSequence charSequenceV = v();
        int i = this.f12066a;
        while (true) {
            int iX = x(i);
            if (iX == -1) {
                this.f12066a = iX;
                B(c10);
                throw null;
            }
            int i10 = iX + 1;
            char cCharAt = charSequenceV.charAt(iX);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f12066a = i10;
                if (cCharAt == c10) {
                    return;
                }
                B(c10);
                throw null;
            }
            i = i10;
        }
    }

    public final long j() {
        boolean z10;
        int iX = x(y());
        int i = 6;
        int i10 = 0;
        if (iX >= v().length() || iX == -1) {
            s(this, "EOF", 0, 6);
            throw null;
        }
        if (v().charAt(iX) == '\"') {
            iX++;
            if (iX == v().length()) {
                s(this, "EOF", 0, 6);
                throw null;
            }
            z10 = true;
        } else {
            z10 = false;
        }
        int i11 = iX;
        boolean z11 = false;
        int i12 = 1;
        long j4 = 0;
        while (i12 != 0) {
            char cCharAt = v().charAt(i11);
            if (cCharAt != '-') {
                if (C5606d.h(cCharAt) != 0) {
                    break;
                }
                i11++;
                i12 = i11 != v().length() ? 1 : i10;
                int i13 = cCharAt - '0';
                if (i13 < 0 || i13 >= 10) {
                    s(this, "Unexpected symbol '" + cCharAt + "' in numeric literal", i10, i);
                    throw null;
                }
                j4 = (j4 * 10) - i13;
                if (j4 > 0) {
                    s(this, "Numeric value overflow", 0, 6);
                    throw null;
                }
                i = 6;
                i10 = 0;
            } else {
                if (i11 != iX) {
                    s(this, "Unexpected symbol '-' in numeric literal", i10, i);
                    throw null;
                }
                i11++;
                z11 = true;
            }
        }
        if (iX == i11 || (z11 && iX == i11 - 1)) {
            s(this, "Expected numeric literal", 0, 6);
            throw null;
        }
        if (z10) {
            if (i12 == 0) {
                s(this, "EOF", 0, 6);
                throw null;
            }
            if (v().charAt(i11) != '\"') {
                s(this, "Expected closing quotation mark", 0, 6);
                throw null;
            }
            i11++;
        }
        this.f12066a = i11;
        if (z11) {
            return j4;
        }
        if (j4 != Long.MIN_VALUE) {
            return -j4;
        }
        s(this, "Numeric value overflow", 0, 6);
        throw null;
    }

    public final String k() {
        String str = this.f12068c;
        if (str == null) {
            return e();
        }
        kotlin.jvm.internal.l.c(str);
        this.f12068c = null;
        return str;
    }

    public final String l(CharSequence source, int i, int i10) {
        kotlin.jvm.internal.l.f(source, "source");
        char cCharAt = source.charAt(i10);
        boolean z10 = false;
        while (cCharAt != '\"') {
            if (cCharAt == '\\') {
                b(i, i10);
                int iX = x(i10 + 1);
                if (iX == -1) {
                    s(this, "Expected escape sequence to continue, got EOF", 0, 6);
                    throw null;
                }
                int iA = iX + 1;
                char cCharAt2 = v().charAt(iX);
                if (cCharAt2 == 'u') {
                    iA = a(v(), iA);
                } else {
                    char c10 = cCharAt2 < 'u' ? C1582n.f12094a[cCharAt2] : (char) 0;
                    if (c10 == 0) {
                        s(this, "Invalid escaped char '" + cCharAt2 + '\'', 0, 6);
                        throw null;
                    }
                    this.f12069d.append(c10);
                }
                i = x(iA);
                if (i == -1) {
                    s(this, "EOF", i, 4);
                    throw null;
                }
            } else {
                i10++;
                if (i10 >= source.length()) {
                    b(i, i10);
                    i = x(i10);
                    if (i == -1) {
                        s(this, "EOF", i, 4);
                        throw null;
                    }
                } else {
                    continue;
                    cCharAt = source.charAt(i10);
                }
            }
            i10 = i;
            z10 = true;
            cCharAt = source.charAt(i10);
        }
        String strZ = !z10 ? z(i, i10) : o(i, i10);
        this.f12066a = i10 + 1;
        return strZ;
    }

    public final String m() {
        String str = this.f12068c;
        if (str != null) {
            kotlin.jvm.internal.l.c(str);
            this.f12068c = null;
            return str;
        }
        int iY = y();
        if (iY >= v().length() || iY == -1) {
            s(this, "EOF", iY, 4);
            throw null;
        }
        byte bH = C5606d.h(v().charAt(iY));
        if (bH == 1) {
            return k();
        }
        if (bH != 0) {
            s(this, "Expected beginning of the string, but got " + v().charAt(iY), 0, 6);
            throw null;
        }
        boolean z10 = false;
        while (C5606d.h(v().charAt(iY)) == 0) {
            iY++;
            if (iY >= v().length()) {
                b(this.f12066a, iY);
                int iX = x(iY);
                if (iX == -1) {
                    this.f12066a = iY;
                    return o(0, 0);
                }
                iY = iX;
                z10 = true;
            }
        }
        String strZ = !z10 ? z(this.f12066a, iY) : o(this.f12066a, iY);
        this.f12066a = iY;
        return strZ;
    }

    public final String n() {
        String strM = m();
        if (!kotlin.jvm.internal.l.b(strM, "null") || v().charAt(this.f12066a - 1) == '\"') {
            return strM;
        }
        s(this, "Unexpected 'null' value instead of string literal", 0, 6);
        throw null;
    }

    public final String o(int i, int i10) {
        b(i, i10);
        StringBuilder sb = this.f12069d;
        String string = sb.toString();
        kotlin.jvm.internal.l.e(string, "escapedString.toString()");
        sb.setLength(0);
        return string;
    }

    public final void q() {
        if (g() == 10) {
            return;
        }
        s(this, "Expected EOF after parsing, but had " + v().charAt(this.f12066a - 1) + " instead", 0, 6);
        throw null;
    }

    public final void r(int i, String message, String hint) {
        kotlin.jvm.internal.l.f(message, "message");
        kotlin.jvm.internal.l.f(hint, "hint");
        String strConcat = hint.length() == 0 ? "" : "\n".concat(hint);
        StringBuilder sbV = G8.v(message, " at path: ");
        sbV.append(this.f12067b.a());
        sbV.append(strConcat);
        throw E.u.i(i, sbV.toString(), v());
    }

    public final void t(byte b10) {
        s(this, Oo.h("Expected ", b10 == 1 ? "quotation mark '\"'" : b10 == 4 ? "comma ','" : b10 == 5 ? "colon ':'" : b10 == 6 ? "start of the object '{'" : b10 == 7 ? "end of the object '}'" : b10 == 8 ? "start of the array '['" : b10 == 9 ? "end of the array ']'" : "valid token", ", but had '", (this.f12066a == v().length() || this.f12066a <= 0) ? "EOF" : String.valueOf(v().charAt(this.f12066a - 1)), "' instead"), this.f12066a - 1, 4);
        throw null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JsonReader(source='");
        sb.append((Object) v());
        sb.append("', currentPosition=");
        return H7.p(sb, this.f12066a, ')');
    }

    public final int u(CharSequence charSequence, int i) {
        char cCharAt = charSequence.charAt(i);
        if ('0' <= cCharAt && cCharAt < ':') {
            return cCharAt - '0';
        }
        if ('a' <= cCharAt && cCharAt < 'g') {
            return cCharAt - 'W';
        }
        if ('A' <= cCharAt && cCharAt < 'G') {
            return cCharAt - '7';
        }
        s(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, 6);
        throw null;
    }

    public abstract CharSequence v();

    public final byte w() {
        CharSequence charSequenceV = v();
        int i = this.f12066a;
        while (true) {
            int iX = x(i);
            if (iX == -1) {
                this.f12066a = iX;
                return (byte) 10;
            }
            char cCharAt = charSequenceV.charAt(iX);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f12066a = iX;
                return C5606d.h(cCharAt);
            }
            i = iX + 1;
        }
    }

    public abstract int x(int i);

    public int y() {
        int iX;
        char cCharAt;
        int i = this.f12066a;
        while (true) {
            iX = x(i);
            if (iX == -1 || !((cCharAt = v().charAt(iX)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
                break;
            }
            i = iX + 1;
        }
        this.f12066a = iX;
        return iX;
    }

    public String z(int i, int i10) {
        return v().subSequence(i, i10).toString();
    }

    public void p() {
    }
}
