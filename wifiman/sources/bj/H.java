package bj;

import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public class H extends AbstractC4118a {

    /* renamed from: e, reason: collision with root package name */
    private final String f33428e;

    public H(String source) {
        AbstractC6492s.i(source, "source");
        this.f33428e = source;
    }

    @Override // bj.AbstractC4118a
    public String E(String keyToMatch, boolean z10) {
        AbstractC6492s.i(keyToMatch, "keyToMatch");
        int i10 = this.f33431a;
        try {
            if (k() == 6 && AbstractC6492s.d(G(z10), keyToMatch)) {
                v();
                if (k() == 5) {
                    return G(z10);
                }
            }
            return null;
        } finally {
            this.f33431a = i10;
            v();
        }
    }

    @Override // bj.AbstractC4118a
    public int H(int i10) {
        if (i10 < C().length()) {
            return i10;
        }
        return -1;
    }

    @Override // bj.AbstractC4118a
    public int J() {
        char cCharAt;
        int i10 = this.f33431a;
        if (i10 == -1) {
            return i10;
        }
        String strC = C();
        while (i10 < strC.length() && ((cCharAt = strC.charAt(i10)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
            i10++;
        }
        this.f33431a = i10;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bj.AbstractC4118a
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public String C() {
        return this.f33428e;
    }

    @Override // bj.AbstractC4118a
    public boolean f() {
        int i10 = this.f33431a;
        if (i10 == -1) {
            return false;
        }
        String strC = C();
        while (i10 < strC.length()) {
            char cCharAt = strC.charAt(i10);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f33431a = i10;
                return D(cCharAt);
            }
            i10++;
        }
        this.f33431a = i10;
        return false;
    }

    @Override // bj.AbstractC4118a
    public String j() {
        m('\"');
        int i10 = this.f33431a;
        int iJ0 = kotlin.text.t.j0(C(), '\"', i10, false, 4, null);
        if (iJ0 != -1) {
            for (int i11 = i10; i11 < iJ0; i11++) {
                if (C().charAt(i11) == '\\') {
                    return r(C(), this.f33431a, i11);
                }
            }
            this.f33431a = iJ0 + 1;
            String strSubstring = C().substring(i10, iJ0);
            AbstractC6492s.h(strSubstring, "substring(...)");
            return strSubstring;
        }
        s();
        String strC = AbstractC4119b.c((byte) 1);
        int i12 = this.f33431a;
        AbstractC4118a.z(this, "Expected " + strC + ", but had '" + ((i12 == C().length() || i12 < 0) ? "EOF" : String.valueOf(C().charAt(i12))) + "' instead", i12, null, 4, null);
        throw new KotlinNothingValueException();
    }

    @Override // bj.AbstractC4118a
    public byte k() {
        String strC = C();
        int i10 = this.f33431a;
        while (i10 != -1 && i10 < strC.length()) {
            int i11 = i10 + 1;
            char cCharAt = strC.charAt(i10);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f33431a = i11;
                return AbstractC4119b.a(cCharAt);
            }
            i10 = i11;
        }
        this.f33431a = strC.length();
        return (byte) 10;
    }

    @Override // bj.AbstractC4118a
    public void m(char c10) {
        if (this.f33431a == -1) {
            P(c10);
        }
        String strC = C();
        int i10 = this.f33431a;
        while (i10 < strC.length()) {
            int i11 = i10 + 1;
            char cCharAt = strC.charAt(i10);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f33431a = i11;
                if (cCharAt == c10) {
                    return;
                } else {
                    P(c10);
                }
            }
            i10 = i11;
        }
        this.f33431a = -1;
        P(c10);
    }
}
