package kotlinx.serialization.json.internal;

import kotlin.KotlinNothingValueException;

/* loaded from: classes4.dex */
public final class j0 extends a {

    /* renamed from: e, reason: collision with root package name */
    public final String f23032e;

    public j0(String source) {
        kotlin.jvm.internal.p.e(source, "source");
        this.f23032e = source;
    }

    @Override // kotlinx.serialization.json.internal.a
    public int G(int i10) {
        if (i10 < C().length()) {
            return i10;
        }
        return -1;
    }

    @Override // kotlinx.serialization.json.internal.a
    public int I() {
        char cCharAt;
        int i10 = this.f22987a;
        if (i10 == -1) {
            return i10;
        }
        while (i10 < C().length() && ((cCharAt = C().charAt(i10)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
            i10++;
        }
        this.f22987a = i10;
        return i10;
    }

    @Override // kotlinx.serialization.json.internal.a
    public boolean L() {
        int I = I();
        if (I == C().length() || I == -1 || C().charAt(I) != ',') {
            return false;
        }
        this.f22987a++;
        return true;
    }

    @Override // kotlinx.serialization.json.internal.a
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public String C() {
        return this.f23032e;
    }

    @Override // kotlinx.serialization.json.internal.a
    public boolean f() {
        int i10 = this.f22987a;
        if (i10 == -1) {
            return false;
        }
        while (i10 < C().length()) {
            char cCharAt = C().charAt(i10);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f22987a = i10;
                return D(cCharAt);
            }
            i10++;
        }
        this.f22987a = i10;
        return false;
    }

    @Override // kotlinx.serialization.json.internal.a
    public String k() {
        o('\"');
        int i10 = this.f22987a;
        int iA0 = s9.u.a0(C(), '\"', i10, false, 4, null);
        if (iA0 == -1) {
            z((byte) 1);
            throw new KotlinNothingValueException();
        }
        for (int i11 = i10; i11 < iA0; i11++) {
            if (C().charAt(i11) == '\\') {
                return r(C(), this.f22987a, i11);
            }
        }
        this.f22987a = iA0 + 1;
        String strSubstring = C().substring(i10, iA0);
        kotlin.jvm.internal.p.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    @Override // kotlinx.serialization.json.internal.a
    public String l(String keyToMatch, boolean z10) {
        kotlin.jvm.internal.p.e(keyToMatch, "keyToMatch");
        int i10 = this.f22987a;
        try {
            if (m() != 6) {
                this.f22987a = i10;
                return null;
            }
            if (!kotlin.jvm.internal.p.a(z10 ? k() : t(), keyToMatch)) {
                this.f22987a = i10;
                return null;
            }
            if (m() != 5) {
                this.f22987a = i10;
                return null;
            }
            String strQ = z10 ? q() : t();
            this.f22987a = i10;
            return strQ;
        } catch (Throwable th) {
            this.f22987a = i10;
            throw th;
        }
    }

    @Override // kotlinx.serialization.json.internal.a
    public byte m() {
        byte bA;
        String strC = C();
        do {
            int i10 = this.f22987a;
            if (i10 == -1 || i10 >= strC.length()) {
                return (byte) 10;
            }
            int i11 = this.f22987a;
            this.f22987a = i11 + 1;
            bA = b.a(strC.charAt(i11));
        } while (bA == 3);
        return bA;
    }

    @Override // kotlinx.serialization.json.internal.a
    public void o(char c10) {
        if (this.f22987a == -1) {
            N(c10);
        }
        String strC = C();
        while (this.f22987a < strC.length()) {
            int i10 = this.f22987a;
            this.f22987a = i10 + 1;
            char cCharAt = strC.charAt(i10);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                if (cCharAt == c10) {
                    return;
                } else {
                    N(c10);
                }
            }
        }
        N(c10);
    }
}
