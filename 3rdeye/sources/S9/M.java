package S9;

import java.nio.charset.CharacterCodingException;
import t4.C5606d;

/* compiled from: JsonLexer.kt */
/* loaded from: classes3.dex */
public final class M extends AbstractC1569a {

    /* renamed from: e, reason: collision with root package name */
    public final H7.e f12040e;

    /* renamed from: f, reason: collision with root package name */
    public final char[] f12041f;

    /* renamed from: g, reason: collision with root package name */
    public int f12042g;

    /* renamed from: h, reason: collision with root package name */
    public final C1574f f12043h;

    public M(H7.e eVar) throws CharacterCodingException {
        char[] cArrB = C1581m.f12093c.b(16384);
        this.f12040e = eVar;
        this.f12041f = cArrB;
        this.f12042g = 128;
        this.f12043h = new C1574f(cArrB);
        C(0);
    }

    @Override // S9.AbstractC1569a
    public final boolean A() {
        int iY = y();
        C1574f c1574f = this.f12043h;
        if (iY >= c1574f.f12084c || iY == -1 || c1574f.f12083b[iY] != ',') {
            return false;
        }
        this.f12066a++;
        return true;
    }

    public final void C(int i) throws CharacterCodingException {
        C1574f c1574f = this.f12043h;
        char[] cArr = c1574f.f12083b;
        if (i != 0) {
            int i10 = this.f12066a;
            System.arraycopy(cArr, i10, cArr, 0, (i10 + i) - i10);
        }
        int i11 = c1574f.f12084c;
        while (true) {
            if (i == i11) {
                break;
            }
            int iA = ((C1583o) this.f12040e.f2291b).a(cArr, i, i11 - i);
            if (iA == -1) {
                c1574f.f12084c = Math.min(c1574f.f12083b.length, i);
                this.f12042g = -1;
                break;
            }
            i += iA;
        }
        this.f12066a = 0;
    }

    public final void D() {
        C1581m c1581m = C1581m.f12093c;
        c1581m.getClass();
        char[] array = this.f12041f;
        kotlin.jvm.internal.l.f(array, "array");
        if (array.length == 16384) {
            c1581m.a(array);
        } else {
            throw new IllegalArgumentException(("Inconsistent internal invariant: unexpected array size " + array.length).toString());
        }
    }

    @Override // S9.AbstractC1569a
    public final void b(int i, int i10) {
        this.f12069d.append(this.f12043h.f12083b, i, i10 - i);
    }

    @Override // S9.AbstractC1569a
    public final boolean c() throws CharacterCodingException {
        p();
        int i = this.f12066a;
        while (true) {
            int iX = x(i);
            if (iX == -1) {
                this.f12066a = iX;
                return false;
            }
            char c10 = this.f12043h.f12083b[iX];
            if (c10 != ' ' && c10 != '\n' && c10 != '\r' && c10 != '\t') {
                this.f12066a = iX;
                return !(c10 == '}' || c10 == ']' || c10 == ':' || c10 == ',');
            }
            i = iX + 1;
        }
    }

    @Override // S9.AbstractC1569a
    public final String e() throws CharacterCodingException {
        char[] cArr;
        i('\"');
        int i = this.f12066a;
        C1574f c1574f = this.f12043h;
        int i10 = c1574f.f12084c;
        int i11 = i;
        while (true) {
            cArr = c1574f.f12083b;
            if (i11 >= i10) {
                i11 = -1;
                break;
            }
            if (cArr[i11] == '\"') {
                break;
            }
            i11++;
        }
        if (i11 == -1) {
            int iX = x(i);
            if (iX != -1) {
                return l(c1574f, this.f12066a, iX);
            }
            t((byte) 1);
            throw null;
        }
        for (int i12 = i; i12 < i11; i12++) {
            if (cArr[i12] == '\\') {
                return l(c1574f, this.f12066a, i12);
            }
        }
        this.f12066a = i11 + 1;
        return y9.n.S(cArr, i, Math.min(i11, c1574f.f12084c));
    }

    @Override // S9.AbstractC1569a
    public final String f(String keyToMatch) {
        kotlin.jvm.internal.l.f(keyToMatch, "keyToMatch");
        return null;
    }

    @Override // S9.AbstractC1569a
    public final byte g() throws CharacterCodingException {
        p();
        int i = this.f12066a;
        while (true) {
            int iX = x(i);
            if (iX == -1) {
                this.f12066a = iX;
                return (byte) 10;
            }
            int i10 = iX + 1;
            byte bH = C5606d.h(this.f12043h.f12083b[iX]);
            if (bH != 3) {
                this.f12066a = i10;
                return bH;
            }
            i = i10;
        }
    }

    @Override // S9.AbstractC1569a
    public final void p() throws CharacterCodingException {
        int i = this.f12043h.f12084c - this.f12066a;
        if (i > this.f12042g) {
            return;
        }
        C(i);
    }

    @Override // S9.AbstractC1569a
    public final CharSequence v() {
        return this.f12043h;
    }

    @Override // S9.AbstractC1569a
    public final int x(int i) throws CharacterCodingException {
        C1574f c1574f = this.f12043h;
        if (i < c1574f.f12084c) {
            return i;
        }
        this.f12066a = i;
        p();
        return (this.f12066a != 0 || c1574f.length() == 0) ? -1 : 0;
    }

    @Override // S9.AbstractC1569a
    public final String z(int i, int i10) {
        C1574f c1574f = this.f12043h;
        return y9.n.S(c1574f.f12083b, i, Math.min(i10, c1574f.f12084c));
    }
}
