package t2;

import ia.C4468d;
import ia.h;
import ia.w;
import java.io.EOFException;
import java.io.IOException;
import t2.AbstractC5601b;
import y9.C5819a;

/* compiled from: JsonUtf8Reader.java */
/* loaded from: classes.dex */
public final class c extends AbstractC5601b {

    /* renamed from: m, reason: collision with root package name */
    public static final h f46390m;

    /* renamed from: n, reason: collision with root package name */
    public static final h f46391n;

    /* renamed from: o, reason: collision with root package name */
    public static final h f46392o;

    /* renamed from: g, reason: collision with root package name */
    public final w f46393g;

    /* renamed from: h, reason: collision with root package name */
    public final C4468d f46394h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public long f46395j;

    /* renamed from: k, reason: collision with root package name */
    public int f46396k;

    /* renamed from: l, reason: collision with root package name */
    public String f46397l;

    static {
        h hVar = h.f38646e;
        f46390m = h.a.c("'\\");
        f46391n = h.a.c("\"\\");
        f46392o = h.a.c("{}[]:, \n\t\r\f/\\;#=");
        h.a.c("\n\r");
        h.a.c("*/");
    }

    public c(w wVar) {
        this.f46385c = new int[32];
        this.f46386d = new String[32];
        this.f46387e = new int[32];
        this.i = 0;
        this.f46393g = wVar;
        this.f46394h = wVar.f38685c;
        W(6);
    }

    @Override // t2.AbstractC5601b
    public final double A() throws IOException {
        int iV0 = this.i;
        if (iV0 == 0) {
            iV0 = v0();
        }
        if (iV0 == 16) {
            this.i = 0;
            int[] iArr = this.f46387e;
            int i = this.f46384b - 1;
            iArr[i] = iArr[i] + 1;
            return this.f46395j;
        }
        if (iV0 == 17) {
            long j4 = this.f46396k;
            C4468d c4468d = this.f46394h;
            c4468d.getClass();
            this.f46397l = c4468d.m0(j4, C5819a.f48359b);
        } else if (iV0 == 9) {
            this.f46397l = D0(f46391n);
        } else if (iV0 == 8) {
            this.f46397l = D0(f46390m);
        } else if (iV0 == 10) {
            this.f46397l = N0();
        } else if (iV0 != 11) {
            throw new I1.c("Expected a double but was " + F() + " at path " + k());
        }
        this.i = 11;
        try {
            double d10 = Double.parseDouble(this.f46397l);
            if (Double.isNaN(d10) || Double.isInfinite(d10)) {
                throw new C5600a("JSON forbids NaN and infinities: " + d10 + " at path " + k());
            }
            this.f46397l = null;
            this.i = 0;
            int[] iArr2 = this.f46387e;
            int i10 = this.f46384b - 1;
            iArr2[i10] = iArr2[i10] + 1;
            return d10;
        } catch (NumberFormatException unused) {
            throw new I1.c("Expected a double but was " + this.f46397l + " at path " + k());
        }
    }

    @Override // t2.AbstractC5601b
    public final int B() throws IOException {
        int iV0 = this.i;
        if (iV0 == 0) {
            iV0 = v0();
        }
        if (iV0 == 16) {
            long j4 = this.f46395j;
            int i = (int) j4;
            if (j4 == i) {
                this.i = 0;
                int[] iArr = this.f46387e;
                int i10 = this.f46384b - 1;
                iArr[i10] = iArr[i10] + 1;
                return i;
            }
            throw new I1.c("Expected an int but was " + this.f46395j + " at path " + k());
        }
        if (iV0 == 17) {
            long j10 = this.f46396k;
            C4468d c4468d = this.f46394h;
            c4468d.getClass();
            this.f46397l = c4468d.m0(j10, C5819a.f48359b);
        } else if (iV0 == 9 || iV0 == 8) {
            String strD0 = iV0 == 9 ? D0(f46391n) : D0(f46390m);
            this.f46397l = strD0;
            try {
                int i11 = Integer.parseInt(strD0);
                this.i = 0;
                int[] iArr2 = this.f46387e;
                int i12 = this.f46384b - 1;
                iArr2[i12] = iArr2[i12] + 1;
                return i11;
            } catch (NumberFormatException unused) {
            }
        } else if (iV0 != 11) {
            throw new I1.c("Expected an int but was " + F() + " at path " + k());
        }
        this.i = 11;
        try {
            double d10 = Double.parseDouble(this.f46397l);
            int i13 = (int) d10;
            if (i13 != d10) {
                throw new I1.c("Expected an int but was " + this.f46397l + " at path " + k());
            }
            this.f46397l = null;
            this.i = 0;
            int[] iArr3 = this.f46387e;
            int i14 = this.f46384b - 1;
            iArr3[i14] = iArr3[i14] + 1;
            return i13;
        } catch (NumberFormatException unused2) {
            throw new I1.c("Expected an int but was " + this.f46397l + " at path " + k());
        }
    }

    public final String B0() throws IOException {
        String strD0;
        int iV0 = this.i;
        if (iV0 == 0) {
            iV0 = v0();
        }
        if (iV0 == 14) {
            strD0 = N0();
        } else if (iV0 == 13) {
            strD0 = D0(f46391n);
        } else if (iV0 == 12) {
            strD0 = D0(f46390m);
        } else {
            if (iV0 != 15) {
                throw new I1.c("Expected a name but was " + F() + " at path " + k());
            }
            strD0 = this.f46397l;
        }
        this.i = 0;
        this.f46386d[this.f46384b - 1] = strD0;
        return strD0;
    }

    public final int C0(boolean z10) throws IOException {
        int i = 0;
        while (true) {
            int i10 = i + 1;
            w wVar = this.f46393g;
            if (!wVar.l0(i10)) {
                if (z10) {
                    throw new EOFException("End of input");
                }
                return -1;
            }
            long j4 = i;
            C4468d c4468d = this.f46394h;
            byte bL = c4468d.l(j4);
            if (bL != 10 && bL != 32 && bL != 13 && bL != 9) {
                c4468d.skip(j4);
                if (bL == 47) {
                    if (wVar.l0(2L)) {
                        u0();
                        throw null;
                    }
                } else if (bL == 35) {
                    u0();
                    throw null;
                }
                return bL;
            }
            i = i10;
        }
    }

    @Override // t2.AbstractC5601b
    public final String D() throws IOException {
        String strM0;
        int iV0 = this.i;
        if (iV0 == 0) {
            iV0 = v0();
        }
        if (iV0 == 10) {
            strM0 = N0();
        } else if (iV0 == 9) {
            strM0 = D0(f46391n);
        } else if (iV0 == 8) {
            strM0 = D0(f46390m);
        } else if (iV0 == 11) {
            strM0 = this.f46397l;
            this.f46397l = null;
        } else if (iV0 == 16) {
            strM0 = Long.toString(this.f46395j);
        } else {
            if (iV0 != 17) {
                throw new I1.c("Expected a string but was " + F() + " at path " + k());
            }
            long j4 = this.f46396k;
            C4468d c4468d = this.f46394h;
            c4468d.getClass();
            strM0 = c4468d.m0(j4, C5819a.f48359b);
        }
        this.i = 0;
        int[] iArr = this.f46387e;
        int i = this.f46384b - 1;
        iArr[i] = iArr[i] + 1;
        return strM0;
    }

    public final String D0(h hVar) throws IOException {
        StringBuilder sb = null;
        while (true) {
            long jC = this.f46393g.c(hVar);
            if (jC == -1) {
                q0("Unterminated string");
                throw null;
            }
            C4468d c4468d = this.f46394h;
            if (c4468d.l(jC) != 92) {
                if (sb == null) {
                    String strM0 = c4468d.m0(jC, C5819a.f48359b);
                    c4468d.readByte();
                    return strM0;
                }
                sb.append(c4468d.m0(jC, C5819a.f48359b));
                c4468d.readByte();
                return sb.toString();
            }
            if (sb == null) {
                sb = new StringBuilder();
            }
            sb.append(c4468d.m0(jC, C5819a.f48359b));
            c4468d.readByte();
            sb.append(O0());
        }
    }

    @Override // t2.AbstractC5601b
    public final AbstractC5601b.EnumC0535b F() throws IOException {
        int iV0 = this.i;
        if (iV0 == 0) {
            iV0 = v0();
        }
        switch (iV0) {
            case 1:
                return AbstractC5601b.EnumC0535b.BEGIN_OBJECT;
            case 2:
                return AbstractC5601b.EnumC0535b.END_OBJECT;
            case 3:
                return AbstractC5601b.EnumC0535b.BEGIN_ARRAY;
            case 4:
                return AbstractC5601b.EnumC0535b.END_ARRAY;
            case 5:
            case 6:
                return AbstractC5601b.EnumC0535b.BOOLEAN;
            case 7:
                return AbstractC5601b.EnumC0535b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return AbstractC5601b.EnumC0535b.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return AbstractC5601b.EnumC0535b.NAME;
            case 16:
            case 17:
                return AbstractC5601b.EnumC0535b.NUMBER;
            case 18:
                return AbstractC5601b.EnumC0535b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public final String N0() throws IOException {
        long jC = this.f46393g.c(f46392o);
        C4468d c4468d = this.f46394h;
        if (jC == -1) {
            return c4468d.p0();
        }
        c4468d.getClass();
        return c4468d.m0(jC, C5819a.f48359b);
    }

    public final char O0() throws IOException {
        int i;
        w wVar = this.f46393g;
        if (!wVar.l0(1L)) {
            q0("Unterminated escape sequence");
            throw null;
        }
        C4468d c4468d = this.f46394h;
        byte b10 = c4468d.readByte();
        if (b10 == 10 || b10 == 34 || b10 == 39 || b10 == 47 || b10 == 92) {
            return (char) b10;
        }
        if (b10 == 98) {
            return '\b';
        }
        if (b10 == 102) {
            return '\f';
        }
        if (b10 == 110) {
            return '\n';
        }
        if (b10 == 114) {
            return '\r';
        }
        if (b10 == 116) {
            return '\t';
        }
        if (b10 != 117) {
            q0("Invalid escape sequence: \\" + ((char) b10));
            throw null;
        }
        if (!wVar.l0(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + k());
        }
        char c10 = 0;
        for (int i10 = 0; i10 < 4; i10++) {
            byte bL = c4468d.l(i10);
            char c11 = (char) (c10 << 4);
            if (bL >= 48 && bL <= 57) {
                i = bL - 48;
            } else if (bL >= 97 && bL <= 102) {
                i = bL - 87;
            } else {
                if (bL < 65 || bL > 70) {
                    q0("\\u".concat(c4468d.m0(4L, C5819a.f48359b)));
                    throw null;
                }
                i = bL - 55;
            }
            c10 = (char) (i + c11);
        }
        c4468d.skip(4L);
        return c10;
    }

    public final void P0(h hVar) throws IOException {
        while (true) {
            long jC = this.f46393g.c(hVar);
            if (jC == -1) {
                q0("Unterminated string");
                throw null;
            }
            C4468d c4468d = this.f46394h;
            if (c4468d.l(jC) != 92) {
                c4468d.skip(jC + 1);
                return;
            } else {
                c4468d.skip(jC + 1);
                O0();
            }
        }
    }

    @Override // t2.AbstractC5601b
    public final void a() throws IOException {
        int iV0 = this.i;
        if (iV0 == 0) {
            iV0 = v0();
        }
        if (iV0 == 3) {
            W(1);
            this.f46387e[this.f46384b - 1] = 0;
            this.i = 0;
        } else {
            throw new I1.c("Expected BEGIN_ARRAY but was " + F() + " at path " + k());
        }
    }

    @Override // t2.AbstractC5601b
    public final void c() throws IOException {
        int iV0 = this.i;
        if (iV0 == 0) {
            iV0 = v0();
        }
        if (iV0 == 1) {
            W(3);
            this.i = 0;
        } else {
            throw new I1.c("Expected BEGIN_OBJECT but was " + F() + " at path " + k());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.i = 0;
        this.f46385c[0] = 8;
        this.f46384b = 1;
        this.f46394h.a();
        this.f46393g.close();
    }

    @Override // t2.AbstractC5601b
    public final void d() throws IOException {
        int iV0 = this.i;
        if (iV0 == 0) {
            iV0 = v0();
        }
        if (iV0 != 4) {
            throw new I1.c("Expected END_ARRAY but was " + F() + " at path " + k());
        }
        int i = this.f46384b;
        this.f46384b = i - 1;
        int[] iArr = this.f46387e;
        int i10 = i - 2;
        iArr[i10] = iArr[i10] + 1;
        this.i = 0;
    }

    @Override // t2.AbstractC5601b
    public final void e() throws IOException {
        int iV0 = this.i;
        if (iV0 == 0) {
            iV0 = v0();
        }
        if (iV0 != 2) {
            throw new I1.c("Expected END_OBJECT but was " + F() + " at path " + k());
        }
        int i = this.f46384b;
        int i10 = i - 1;
        this.f46384b = i10;
        this.f46386d[i10] = null;
        int[] iArr = this.f46387e;
        int i11 = i - 2;
        iArr[i11] = iArr[i11] + 1;
        this.i = 0;
    }

    @Override // t2.AbstractC5601b
    public final int k0(AbstractC5601b.a aVar) throws IOException {
        int iV0 = this.i;
        if (iV0 == 0) {
            iV0 = v0();
        }
        if (iV0 < 12 || iV0 > 15) {
            return -1;
        }
        if (iV0 == 15) {
            return w0(this.f46397l, aVar);
        }
        int iX0 = this.f46393g.x0(aVar.f46389b);
        if (iX0 != -1) {
            this.i = 0;
            this.f46386d[this.f46384b - 1] = aVar.f46388a[iX0];
            return iX0;
        }
        String str = this.f46386d[this.f46384b - 1];
        String strB0 = B0();
        int iW0 = w0(strB0, aVar);
        if (iW0 == -1) {
            this.i = 15;
            this.f46397l = strB0;
            this.f46386d[this.f46384b - 1] = str;
        }
        return iW0;
    }

    @Override // t2.AbstractC5601b
    public final boolean l() throws IOException {
        int iV0 = this.i;
        if (iV0 == 0) {
            iV0 = v0();
        }
        return (iV0 == 2 || iV0 == 4 || iV0 == 18) ? false : true;
    }

    @Override // t2.AbstractC5601b
    public final void m0() throws IOException {
        int iV0 = this.i;
        if (iV0 == 0) {
            iV0 = v0();
        }
        if (iV0 == 14) {
            long jC = this.f46393g.c(f46392o);
            C4468d c4468d = this.f46394h;
            if (jC == -1) {
                jC = c4468d.f38643c;
            }
            c4468d.skip(jC);
        } else if (iV0 == 13) {
            P0(f46391n);
        } else if (iV0 == 12) {
            P0(f46390m);
        } else if (iV0 != 15) {
            throw new I1.c("Expected a name but was " + F() + " at path " + k());
        }
        this.i = 0;
        this.f46386d[this.f46384b - 1] = "null";
    }

    @Override // t2.AbstractC5601b
    public final boolean n() throws IOException {
        int iV0 = this.i;
        if (iV0 == 0) {
            iV0 = v0();
        }
        if (iV0 == 5) {
            this.i = 0;
            int[] iArr = this.f46387e;
            int i = this.f46384b - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iV0 == 6) {
            this.i = 0;
            int[] iArr2 = this.f46387e;
            int i10 = this.f46384b - 1;
            iArr2[i10] = iArr2[i10] + 1;
            return false;
        }
        throw new I1.c("Expected a boolean but was " + F() + " at path " + k());
    }

    @Override // t2.AbstractC5601b
    public final void p0() throws IOException {
        int i = 0;
        do {
            int iV0 = this.i;
            if (iV0 == 0) {
                iV0 = v0();
            }
            if (iV0 == 3) {
                W(1);
            } else if (iV0 == 1) {
                W(3);
            } else {
                if (iV0 == 4) {
                    i--;
                    if (i < 0) {
                        throw new I1.c("Expected a value but was " + F() + " at path " + k());
                    }
                    this.f46384b--;
                } else if (iV0 == 2) {
                    i--;
                    if (i < 0) {
                        throw new I1.c("Expected a value but was " + F() + " at path " + k());
                    }
                    this.f46384b--;
                } else {
                    C4468d c4468d = this.f46394h;
                    if (iV0 == 14 || iV0 == 10) {
                        long jC = this.f46393g.c(f46392o);
                        if (jC == -1) {
                            jC = c4468d.f38643c;
                        }
                        c4468d.skip(jC);
                    } else if (iV0 == 9 || iV0 == 13) {
                        P0(f46391n);
                    } else if (iV0 == 8 || iV0 == 12) {
                        P0(f46390m);
                    } else if (iV0 == 17) {
                        c4468d.skip(this.f46396k);
                    } else if (iV0 == 18) {
                        throw new I1.c("Expected a value but was " + F() + " at path " + k());
                    }
                }
                this.i = 0;
            }
            i++;
            this.i = 0;
        } while (i != 0);
        int[] iArr = this.f46387e;
        int i10 = this.f46384b - 1;
        iArr[i10] = iArr[i10] + 1;
        this.f46386d[i10] = "null";
    }

    public final String toString() {
        return "JsonReader(" + this.f46393g + ")";
    }

    public final void u0() throws IOException {
        q0("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x0195, code lost:
    
        if (y0(r10) != false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0197, code lost:
    
        if (r1 != 2) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0199, code lost:
    
        if (r4 == false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x019f, code lost:
    
        if (r12 != Long.MIN_VALUE) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x01a1, code lost:
    
        if (r9 == false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x01a5, code lost:
    
        if (r12 != r17) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x01a7, code lost:
    
        if (r9 != false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x01a9, code lost:
    
        if (r9 == false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x01ac, code lost:
    
        r12 = -r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x01ad, code lost:
    
        r22.f46395j = r12;
        r7.skip(r2);
        r9 = 16;
        r22.i = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x01b8, code lost:
    
        if (r1 == 2) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x01bb, code lost:
    
        if (r1 == 4) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x01be, code lost:
    
        if (r1 != 7) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x01c0, code lost:
    
        r22.f46396k = r2;
        r9 = 17;
        r22.i = 17;
     */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01ed A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0115 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int v0() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 652
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t2.c.v0():int");
    }

    public final int w0(String str, AbstractC5601b.a aVar) {
        int length = aVar.f46388a.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(aVar.f46388a[i])) {
                this.i = 0;
                this.f46386d[this.f46384b - 1] = str;
                return i;
            }
        }
        return -1;
    }

    public final boolean y0(int i) throws IOException {
        if (i == 9 || i == 10 || i == 12 || i == 13 || i == 32) {
            return false;
        }
        if (i != 35) {
            if (i == 44) {
                return false;
            }
            if (i != 47 && i != 61) {
                if (i == 123 || i == 125 || i == 58) {
                    return false;
                }
                if (i != 59) {
                    switch (i) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        u0();
        throw null;
    }
}
