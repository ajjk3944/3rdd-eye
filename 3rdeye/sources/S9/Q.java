package S9;

import t4.C5606d;

/* compiled from: StringJsonLexer.kt */
/* loaded from: classes3.dex */
public final class Q extends AbstractC1569a {

    /* renamed from: e, reason: collision with root package name */
    public final String f12063e;

    public Q(String source) {
        kotlin.jvm.internal.l.f(source, "source");
        this.f12063e = source;
    }

    @Override // S9.AbstractC1569a
    public final boolean A() {
        int iY = y();
        String str = this.f12063e;
        if (iY == str.length() || iY == -1 || str.charAt(iY) != ',') {
            return false;
        }
        this.f12066a++;
        return true;
    }

    @Override // S9.AbstractC1569a
    public final boolean c() {
        int i = this.f12066a;
        if (i == -1) {
            return false;
        }
        while (true) {
            String str = this.f12063e;
            if (i >= str.length()) {
                this.f12066a = i;
                return false;
            }
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f12066a = i;
                return !(cCharAt == '}' || cCharAt == ']' || cCharAt == ':' || cCharAt == ',');
            }
            i++;
        }
    }

    @Override // S9.AbstractC1569a
    public final String e() {
        i('\"');
        int i = this.f12066a;
        String str = this.f12063e;
        int iF0 = y9.q.f0(str, '\"', i, 4);
        if (iF0 == -1) {
            t((byte) 1);
            throw null;
        }
        for (int i10 = i; i10 < iF0; i10++) {
            if (str.charAt(i10) == '\\') {
                return l(str, this.f12066a, i10);
            }
        }
        this.f12066a = iF0 + 1;
        String strSubstring = str.substring(i, iF0);
        kotlin.jvm.internal.l.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    @Override // S9.AbstractC1569a
    public final String f(String keyToMatch) {
        kotlin.jvm.internal.l.f(keyToMatch, "keyToMatch");
        int i = this.f12066a;
        try {
            if (g() != 6) {
                return null;
            }
            if (!kotlin.jvm.internal.l.b(n(), keyToMatch)) {
                return null;
            }
            if (g() != 5) {
                return null;
            }
            return n();
        } finally {
            this.f12066a = i;
        }
    }

    @Override // S9.AbstractC1569a
    public final byte g() {
        byte bH;
        do {
            int i = this.f12066a;
            if (i == -1) {
                return (byte) 10;
            }
            String str = this.f12063e;
            if (i >= str.length()) {
                return (byte) 10;
            }
            int i10 = this.f12066a;
            this.f12066a = i10 + 1;
            bH = C5606d.h(str.charAt(i10));
        } while (bH == 3);
        return bH;
    }

    @Override // S9.AbstractC1569a
    public final void i(char c10) {
        if (this.f12066a == -1) {
            B(c10);
            throw null;
        }
        while (true) {
            int i = this.f12066a;
            String str = this.f12063e;
            if (i >= str.length()) {
                B(c10);
                throw null;
            }
            int i10 = this.f12066a;
            this.f12066a = i10 + 1;
            char cCharAt = str.charAt(i10);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                if (cCharAt == c10) {
                    return;
                }
                B(c10);
                throw null;
            }
        }
    }

    @Override // S9.AbstractC1569a
    public final CharSequence v() {
        return this.f12063e;
    }

    @Override // S9.AbstractC1569a
    public final int x(int i) {
        if (i < this.f12063e.length()) {
            return i;
        }
        return -1;
    }

    @Override // S9.AbstractC1569a
    public final int y() {
        char cCharAt;
        int i = this.f12066a;
        if (i == -1) {
            return i;
        }
        while (true) {
            String str = this.f12063e;
            if (i >= str.length() || !((cCharAt = str.charAt(i)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
                break;
            }
            i++;
        }
        this.f12066a = i;
        return i;
    }
}
