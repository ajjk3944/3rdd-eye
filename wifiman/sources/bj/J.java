package bj;

import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class J extends H {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(String source) {
        super(source);
        AbstractC6492s.i(source, "source");
    }

    @Override // bj.AbstractC4118a
    public byte F() {
        String strC = C();
        int iJ = J();
        if (iJ >= strC.length() || iJ == -1) {
            return (byte) 10;
        }
        this.f33431a = iJ;
        return AbstractC4119b.a(strC.charAt(iJ));
    }

    @Override // bj.H, bj.AbstractC4118a
    public int J() {
        int i10;
        int iJ0 = this.f33431a;
        if (iJ0 == -1) {
            return iJ0;
        }
        String strC = C();
        while (iJ0 < strC.length()) {
            char cCharAt = strC.charAt(iJ0);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                if (cCharAt != '/' || (i10 = iJ0 + 1) >= strC.length()) {
                    break;
                }
                char cCharAt2 = strC.charAt(i10);
                if (cCharAt2 == '*') {
                    int iK0 = kotlin.text.t.k0(strC, "*/", iJ0 + 2, false, 4, null);
                    if (iK0 == -1) {
                        this.f33431a = strC.length();
                        AbstractC4118a.z(this, "Expected end of the block comment: \"*/\", but had EOF instead", 0, null, 6, null);
                        throw new KotlinNothingValueException();
                    }
                    iJ0 = iK0 + 2;
                } else {
                    if (cCharAt2 != '/') {
                        break;
                    }
                    iJ0 = kotlin.text.t.j0(strC, '\n', iJ0 + 2, false, 4, null);
                    if (iJ0 == -1) {
                        iJ0 = strC.length();
                    }
                }
            }
            iJ0++;
        }
        this.f33431a = iJ0;
        return iJ0;
    }

    @Override // bj.H, bj.AbstractC4118a
    public boolean f() {
        int iJ = J();
        if (iJ >= C().length() || iJ == -1) {
            return false;
        }
        return D(C().charAt(iJ));
    }

    @Override // bj.H, bj.AbstractC4118a
    public byte k() {
        String strC = C();
        int iJ = J();
        if (iJ >= strC.length() || iJ == -1) {
            return (byte) 10;
        }
        this.f33431a = iJ + 1;
        return AbstractC4119b.a(strC.charAt(iJ));
    }

    @Override // bj.H, bj.AbstractC4118a
    public void m(char c10) {
        String strC = C();
        int iJ = J();
        if (iJ >= strC.length() || iJ == -1) {
            this.f33431a = -1;
            P(c10);
        }
        char cCharAt = strC.charAt(iJ);
        this.f33431a = iJ + 1;
        if (cCharAt == c10) {
            return;
        }
        P(c10);
    }
}
