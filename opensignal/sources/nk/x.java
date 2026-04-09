package nk;

import java.io.EOFException;
import java.io.IOException;
import java.math.BigDecimal;

/* loaded from: classes.dex */
public final class x extends w {
    public static final cv.j I;
    public static final cv.j J;
    public static final cv.j K;
    public static final cv.j L;
    public static final cv.j M;
    public final cv.i B;
    public final cv.g D;
    public int E = 0;
    public long F;
    public int G;
    public String H;

    static {
        cv.j jVar = cv.j.f6715r;
        I = sm.m.m("'\\");
        J = sm.m.m("\"\\");
        K = sm.m.m("{}[]:, \n\t\r\f/\\;#=");
        L = sm.m.m("\n\r");
        M = sm.m.m("*/");
    }

    public x(cv.i iVar) {
        if (iVar == null) {
            throw new NullPointerException("source == null");
        }
        this.B = iVar;
        this.D = iVar.s();
        n0(6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0026, code lost:
    
        r1.skip(r3);
        r2 = nk.x.L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        if (r6 != 47) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
    
        if (r5.S(2) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003d, code lost:
    
        v0();
        r10 = r1.q(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        if (r10 == 42) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
    
        if (r10 == 47) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004b, code lost:
    
        r1.readByte();
        r1.readByte();
        r5 = r5.b0(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0057, code lost:
    
        if (r5 == (-1)) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0059, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
    
        r5 = r1.f6706d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005d, code lost:
    
        r1.skip(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0061, code lost:
    
        r1.readByte();
        r1.readByte();
        r5 = r5.O(nk.x.M);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006f, code lost:
    
        if (r5 == (-1)) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0071, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0073, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0074, code lost:
    
        if (r3 == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0076, code lost:
    
        r5 = r5 + r2.f6716a.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007c, code lost:
    
        r5 = r1.f6706d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007e, code lost:
    
        r1.skip(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0081, code lost:
    
        if (r3 == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0085, code lost:
    
        t0("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008e, code lost:
    
        if (r6 != 35) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0090, code lost:
    
        v0();
        r5 = r5.b0(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0099, code lost:
    
        if (r5 == (-1)) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009b, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x009d, code lost:
    
        r5 = r1.f6706d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x009f, code lost:
    
        r1.skip(r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int A0(boolean r13) throws androidx.datastore.preferences.protobuf.m, java.io.EOFException {
        /*
            r12 = this;
            r0 = 0
        L1:
            r1 = r0
        L2:
            int r2 = r1 + 1
            long r3 = (long) r2
            cv.i r5 = r12.B
            boolean r3 = r5.S(r3)
            if (r3 == 0) goto La8
            long r3 = (long) r1
            cv.g r1 = r12.D
            byte r6 = r1.q(r3)
            r7 = 10
            if (r6 == r7) goto La5
            r7 = 32
            if (r6 == r7) goto La5
            r7 = 13
            if (r6 == r7) goto La5
            r7 = 9
            if (r6 != r7) goto L26
            goto La5
        L26:
            r1.skip(r3)
            cv.j r2 = nk.x.L
            r3 = -1
            r7 = 1
            r9 = 47
            if (r6 != r9) goto L8c
            r10 = 2
            boolean r10 = r5.S(r10)
            if (r10 != 0) goto L3d
            goto La4
        L3d:
            r12.v0()
            byte r10 = r1.q(r7)
            r11 = 42
            if (r10 == r11) goto L61
            if (r10 == r9) goto L4b
            goto La4
        L4b:
            r1.readByte()
            r1.readByte()
            long r5 = r5.b0(r2)
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 == 0) goto L5b
            long r5 = r5 + r7
            goto L5d
        L5b:
            long r5 = r1.f6706d
        L5d:
            r1.skip(r5)
            goto L1
        L61:
            r1.readByte()
            r1.readByte()
            cv.j r2 = nk.x.M
            long r5 = r5.O(r2)
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 == 0) goto L73
            r3 = 1
            goto L74
        L73:
            r3 = r0
        L74:
            if (r3 == 0) goto L7c
            byte[] r2 = r2.f6716a
            int r2 = r2.length
            long r7 = (long) r2
            long r5 = r5 + r7
            goto L7e
        L7c:
            long r5 = r1.f6706d
        L7e:
            r1.skip(r5)
            if (r3 == 0) goto L85
            goto L1
        L85:
            java.lang.String r13 = "Unterminated comment"
            r12.t0(r13)
            r13 = 0
            throw r13
        L8c:
            r9 = 35
            if (r6 != r9) goto La4
            r12.v0()
            long r5 = r5.b0(r2)
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 == 0) goto L9d
            long r5 = r5 + r7
            goto L9f
        L9d:
            long r5 = r1.f6706d
        L9f:
            r1.skip(r5)
            goto L1
        La4:
            return r6
        La5:
            r1 = r2
            goto L2
        La8:
            if (r13 != 0) goto Lac
            r13 = -1
            return r13
        Lac:
            java.io.EOFException r13 = new java.io.EOFException
            java.lang.String r0 = "End of input"
            r13.<init>(r0)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: nk.x.A0(boolean):int");
    }

    public final String B0(cv.j jVar) throws androidx.datastore.preferences.protobuf.m, EOFException {
        StringBuilder sb2 = null;
        while (true) {
            long jB0 = this.B.b0(jVar);
            if (jB0 == -1) {
                t0("Unterminated string");
                throw null;
            }
            cv.g gVar = this.D;
            if (gVar.q(jB0) != 92) {
                if (sb2 == null) {
                    String strV = gVar.V(jB0, tt.a.f22975a);
                    gVar.readByte();
                    return strV;
                }
                sb2.append(gVar.V(jB0, tt.a.f22975a));
                gVar.readByte();
                return sb2.toString();
            }
            if (sb2 == null) {
                sb2 = new StringBuilder();
            }
            sb2.append(gVar.V(jB0, tt.a.f22975a));
            gVar.readByte();
            sb2.append(D0());
        }
    }

    public final String C0() {
        long jB0 = this.B.b0(K);
        cv.g gVar = this.D;
        if (jB0 == -1) {
            return gVar.Y();
        }
        gVar.getClass();
        return gVar.V(jB0, tt.a.f22975a);
    }

    public final char D0() throws androidx.datastore.preferences.protobuf.m, EOFException {
        int i10;
        cv.i iVar = this.B;
        if (!iVar.S(1L)) {
            t0("Unterminated escape sequence");
            throw null;
        }
        cv.g gVar = this.D;
        byte b2 = gVar.readByte();
        if (b2 == 10 || b2 == 34 || b2 == 39 || b2 == 47 || b2 == 92) {
            return (char) b2;
        }
        if (b2 == 98) {
            return '\b';
        }
        if (b2 == 102) {
            return '\f';
        }
        if (b2 == 110) {
            return '\n';
        }
        if (b2 == 114) {
            return '\r';
        }
        if (b2 == 116) {
            return '\t';
        }
        if (b2 != 117) {
            if (this.f18451x) {
                return (char) b2;
            }
            t0("Invalid escape sequence: \\" + ((char) b2));
            throw null;
        }
        if (!iVar.S(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + q());
        }
        char c4 = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            byte bQ = gVar.q(i11);
            char c10 = (char) (c4 << 4);
            if (bQ >= 48 && bQ <= 57) {
                i10 = bQ - 48;
            } else if (bQ >= 97 && bQ <= 102) {
                i10 = bQ - 87;
            } else {
                if (bQ < 65 || bQ > 70) {
                    t0("\\u".concat(gVar.V(4L, tt.a.f22975a)));
                    throw null;
                }
                i10 = bQ - 55;
            }
            c4 = (char) (i10 + c10);
        }
        gVar.skip(4L);
        return c4;
    }

    public final void E0(cv.j jVar) throws androidx.datastore.preferences.protobuf.m, EOFException {
        while (true) {
            long jB0 = this.B.b0(jVar);
            if (jB0 == -1) {
                t0("Unterminated string");
                throw null;
            }
            cv.g gVar = this.D;
            if (gVar.q(jB0) != 92) {
                gVar.skip(jB0 + 1);
                return;
            } else {
                gVar.skip(jB0 + 1);
                D0();
            }
        }
    }

    @Override // nk.w
    public final double G() throws androidx.datastore.preferences.protobuf.m, NumberFormatException, EOFException {
        int iW0 = this.E;
        if (iW0 == 0) {
            iW0 = w0();
        }
        if (iW0 == 16) {
            this.E = 0;
            int[] iArr = this.f18450r;
            int i10 = this.f18447a - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.F;
        }
        if (iW0 == 17) {
            long j = this.G;
            cv.g gVar = this.D;
            gVar.getClass();
            this.H = gVar.V(j, tt.a.f22975a);
        } else if (iW0 == 9) {
            this.H = B0(J);
        } else if (iW0 == 8) {
            this.H = B0(I);
        } else if (iW0 == 10) {
            this.H = C0();
        } else if (iW0 != 11) {
            throw new bf.n("Expected a double but was " + f0() + " at path " + q());
        }
        this.E = 11;
        try {
            double d6 = Double.parseDouble(this.H);
            if (!this.f18451x && (Double.isNaN(d6) || Double.isInfinite(d6))) {
                throw new androidx.datastore.preferences.protobuf.m("JSON forbids NaN and infinities: " + d6 + " at path " + q());
            }
            this.H = null;
            this.E = 0;
            int[] iArr2 = this.f18450r;
            int i11 = this.f18447a - 1;
            iArr2[i11] = iArr2[i11] + 1;
            return d6;
        } catch (NumberFormatException unused) {
            throw new bf.n("Expected a double but was " + this.H + " at path " + q());
        }
    }

    @Override // nk.w
    public final int L() throws androidx.datastore.preferences.protobuf.m, NumberFormatException, EOFException {
        int iW0 = this.E;
        if (iW0 == 0) {
            iW0 = w0();
        }
        if (iW0 == 16) {
            long j = this.F;
            int i10 = (int) j;
            if (j == i10) {
                this.E = 0;
                int[] iArr = this.f18450r;
                int i11 = this.f18447a - 1;
                iArr[i11] = iArr[i11] + 1;
                return i10;
            }
            throw new bf.n("Expected an int but was " + this.F + " at path " + q());
        }
        if (iW0 == 17) {
            long j7 = this.G;
            cv.g gVar = this.D;
            gVar.getClass();
            this.H = gVar.V(j7, tt.a.f22975a);
        } else if (iW0 == 9 || iW0 == 8) {
            String strB0 = iW0 == 9 ? B0(J) : B0(I);
            this.H = strB0;
            try {
                int i12 = Integer.parseInt(strB0);
                this.E = 0;
                int[] iArr2 = this.f18450r;
                int i13 = this.f18447a - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return i12;
            } catch (NumberFormatException unused) {
            }
        } else if (iW0 != 11) {
            throw new bf.n("Expected an int but was " + f0() + " at path " + q());
        }
        this.E = 11;
        try {
            double d6 = Double.parseDouble(this.H);
            int i14 = (int) d6;
            if (i14 != d6) {
                throw new bf.n("Expected an int but was " + this.H + " at path " + q());
            }
            this.H = null;
            this.E = 0;
            int[] iArr3 = this.f18450r;
            int i15 = this.f18447a - 1;
            iArr3[i15] = iArr3[i15] + 1;
            return i14;
        } catch (NumberFormatException unused2) {
            throw new bf.n("Expected an int but was " + this.H + " at path " + q());
        }
    }

    @Override // nk.w
    public final long R() throws androidx.datastore.preferences.protobuf.m, NumberFormatException, EOFException {
        int iW0 = this.E;
        if (iW0 == 0) {
            iW0 = w0();
        }
        if (iW0 == 16) {
            this.E = 0;
            int[] iArr = this.f18450r;
            int i10 = this.f18447a - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.F;
        }
        if (iW0 == 17) {
            long j = this.G;
            cv.g gVar = this.D;
            gVar.getClass();
            this.H = gVar.V(j, tt.a.f22975a);
        } else if (iW0 == 9 || iW0 == 8) {
            String strB0 = iW0 == 9 ? B0(J) : B0(I);
            this.H = strB0;
            try {
                long j7 = Long.parseLong(strB0);
                this.E = 0;
                int[] iArr2 = this.f18450r;
                int i11 = this.f18447a - 1;
                iArr2[i11] = iArr2[i11] + 1;
                return j7;
            } catch (NumberFormatException unused) {
            }
        } else if (iW0 != 11) {
            throw new bf.n("Expected a long but was " + f0() + " at path " + q());
        }
        this.E = 11;
        try {
            long jLongValueExact = new BigDecimal(this.H).longValueExact();
            this.H = null;
            this.E = 0;
            int[] iArr3 = this.f18450r;
            int i12 = this.f18447a - 1;
            iArr3[i12] = iArr3[i12] + 1;
            return jLongValueExact;
        } catch (ArithmeticException | NumberFormatException unused2) {
            throw new bf.n("Expected a long but was " + this.H + " at path " + q());
        }
    }

    @Override // nk.w
    public final String V() throws androidx.datastore.preferences.protobuf.m, EOFException {
        String strB0;
        int iW0 = this.E;
        if (iW0 == 0) {
            iW0 = w0();
        }
        if (iW0 == 14) {
            strB0 = C0();
        } else if (iW0 == 13) {
            strB0 = B0(J);
        } else if (iW0 == 12) {
            strB0 = B0(I);
        } else {
            if (iW0 != 15) {
                throw new bf.n("Expected a name but was " + f0() + " at path " + q());
            }
            strB0 = this.H;
            this.H = null;
        }
        this.E = 0;
        this.f18449g[this.f18447a - 1] = strB0;
        return strB0;
    }

    @Override // nk.w
    public final void Y() throws androidx.datastore.preferences.protobuf.m, EOFException {
        int iW0 = this.E;
        if (iW0 == 0) {
            iW0 = w0();
        }
        if (iW0 == 7) {
            this.E = 0;
            int[] iArr = this.f18450r;
            int i10 = this.f18447a - 1;
            iArr[i10] = iArr[i10] + 1;
            return;
        }
        throw new bf.n("Expected null but was " + f0() + " at path " + q());
    }

    @Override // nk.w
    public final String Z() throws androidx.datastore.preferences.protobuf.m, EOFException {
        String strV;
        int iW0 = this.E;
        if (iW0 == 0) {
            iW0 = w0();
        }
        if (iW0 == 10) {
            strV = C0();
        } else if (iW0 == 9) {
            strV = B0(J);
        } else if (iW0 == 8) {
            strV = B0(I);
        } else if (iW0 == 11) {
            strV = this.H;
            this.H = null;
        } else if (iW0 == 16) {
            strV = Long.toString(this.F);
        } else {
            if (iW0 != 17) {
                throw new bf.n("Expected a string but was " + f0() + " at path " + q());
            }
            long j = this.G;
            cv.g gVar = this.D;
            gVar.getClass();
            strV = gVar.V(j, tt.a.f22975a);
        }
        this.E = 0;
        int[] iArr = this.f18450r;
        int i10 = this.f18447a - 1;
        iArr[i10] = iArr[i10] + 1;
        return strV;
    }

    @Override // nk.w
    public final void b() throws androidx.datastore.preferences.protobuf.m, EOFException {
        int iW0 = this.E;
        if (iW0 == 0) {
            iW0 = w0();
        }
        if (iW0 == 3) {
            n0(1);
            this.f18450r[this.f18447a - 1] = 0;
            this.E = 0;
        } else {
            throw new bf.n("Expected BEGIN_ARRAY but was " + f0() + " at path " + q());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.E = 0;
        this.f18448d[0] = 8;
        this.f18447a = 1;
        this.D.b();
        this.B.close();
    }

    @Override // nk.w
    public final void f() throws androidx.datastore.preferences.protobuf.m, EOFException {
        int iW0 = this.E;
        if (iW0 == 0) {
            iW0 = w0();
        }
        if (iW0 == 1) {
            n0(3);
            this.E = 0;
        } else {
            throw new bf.n("Expected BEGIN_OBJECT but was " + f0() + " at path " + q());
        }
    }

    @Override // nk.w
    public final v f0() throws androidx.datastore.preferences.protobuf.m, EOFException {
        int iW0 = this.E;
        if (iW0 == 0) {
            iW0 = w0();
        }
        switch (iW0) {
            case 1:
                return v.BEGIN_OBJECT;
            case 2:
                return v.END_OBJECT;
            case 3:
                return v.BEGIN_ARRAY;
            case 4:
                return v.END_ARRAY;
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return v.BOOLEAN;
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return v.NULL;
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
            case 9:
            case 10:
            case 11:
                return v.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return v.NAME;
            case 16:
            case 17:
                return v.NUMBER;
            case 18:
                return v.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    @Override // nk.w
    public final void h() throws androidx.datastore.preferences.protobuf.m, EOFException {
        int iW0 = this.E;
        if (iW0 == 0) {
            iW0 = w0();
        }
        if (iW0 != 4) {
            throw new bf.n("Expected END_ARRAY but was " + f0() + " at path " + q());
        }
        int i10 = this.f18447a;
        this.f18447a = i10 - 1;
        int[] iArr = this.f18450r;
        int i11 = i10 - 2;
        iArr[i11] = iArr[i11] + 1;
        this.E = 0;
    }

    @Override // nk.w
    public final void i() throws androidx.datastore.preferences.protobuf.m, EOFException {
        int iW0 = this.E;
        if (iW0 == 0) {
            iW0 = w0();
        }
        if (iW0 != 2) {
            throw new bf.n("Expected END_OBJECT but was " + f0() + " at path " + q());
        }
        int i10 = this.f18447a;
        int i11 = i10 - 1;
        this.f18447a = i11;
        this.f18449g[i11] = null;
        int[] iArr = this.f18450r;
        int i12 = i10 - 2;
        iArr[i12] = iArr[i12] + 1;
        this.E = 0;
    }

    @Override // nk.w
    public final void i0() {
        if (w()) {
            this.H = V();
            this.E = 11;
        }
    }

    @Override // nk.w
    public final int p0(io.sentry.t tVar) throws androidx.datastore.preferences.protobuf.m, EOFException {
        int iW0 = this.E;
        if (iW0 == 0) {
            iW0 = w0();
        }
        if (iW0 < 12 || iW0 > 15) {
            return -1;
        }
        if (iW0 == 15) {
            return x0(tVar, this.H);
        }
        int iD = this.B.D((cv.v) tVar.f12737d);
        if (iD != -1) {
            this.E = 0;
            this.f18449g[this.f18447a - 1] = ((String[]) tVar.f12736a)[iD];
            return iD;
        }
        String str = this.f18449g[this.f18447a - 1];
        String strV = V();
        int iX0 = x0(tVar, strV);
        if (iX0 == -1) {
            this.E = 15;
            this.H = strV;
            this.f18449g[this.f18447a - 1] = str;
        }
        return iX0;
    }

    @Override // nk.w
    public final int q0(io.sentry.t tVar) throws androidx.datastore.preferences.protobuf.m, EOFException {
        int iW0 = this.E;
        if (iW0 == 0) {
            iW0 = w0();
        }
        if (iW0 < 8 || iW0 > 11) {
            return -1;
        }
        if (iW0 == 11) {
            return y0(tVar, this.H);
        }
        int iD = this.B.D((cv.v) tVar.f12737d);
        if (iD != -1) {
            this.E = 0;
            int[] iArr = this.f18450r;
            int i10 = this.f18447a - 1;
            iArr[i10] = iArr[i10] + 1;
            return iD;
        }
        String strZ = Z();
        int iY0 = y0(tVar, strZ);
        if (iY0 == -1) {
            this.E = 11;
            this.H = strZ;
            this.f18450r[this.f18447a - 1] = r0[r1] - 1;
        }
        return iY0;
    }

    @Override // nk.w
    public final void r0() throws androidx.datastore.preferences.protobuf.m, EOFException {
        if (this.f18452y) {
            v vVarF0 = f0();
            V();
            throw new bf.n("Cannot skip unexpected " + vVarF0 + " at " + q());
        }
        int iW0 = this.E;
        if (iW0 == 0) {
            iW0 = w0();
        }
        if (iW0 == 14) {
            long jB0 = this.B.b0(K);
            cv.g gVar = this.D;
            if (jB0 == -1) {
                jB0 = gVar.f6706d;
            }
            gVar.skip(jB0);
        } else if (iW0 == 13) {
            E0(J);
        } else if (iW0 == 12) {
            E0(I);
        } else if (iW0 != 15) {
            throw new bf.n("Expected a name but was " + f0() + " at path " + q());
        }
        this.E = 0;
        this.f18449g[this.f18447a - 1] = "null";
    }

    @Override // nk.w
    public final void s0() throws androidx.datastore.preferences.protobuf.m, EOFException {
        if (this.f18452y) {
            throw new bf.n("Cannot skip unexpected " + f0() + " at " + q());
        }
        int i10 = 0;
        do {
            int iW0 = this.E;
            if (iW0 == 0) {
                iW0 = w0();
            }
            if (iW0 == 3) {
                n0(1);
            } else if (iW0 == 1) {
                n0(3);
            } else {
                if (iW0 == 4) {
                    i10--;
                    if (i10 < 0) {
                        throw new bf.n("Expected a value but was " + f0() + " at path " + q());
                    }
                    this.f18447a--;
                } else if (iW0 == 2) {
                    i10--;
                    if (i10 < 0) {
                        throw new bf.n("Expected a value but was " + f0() + " at path " + q());
                    }
                    this.f18447a--;
                } else {
                    cv.g gVar = this.D;
                    if (iW0 == 14 || iW0 == 10) {
                        long jB0 = this.B.b0(K);
                        if (jB0 == -1) {
                            jB0 = gVar.f6706d;
                        }
                        gVar.skip(jB0);
                    } else if (iW0 == 9 || iW0 == 13) {
                        E0(J);
                    } else if (iW0 == 8 || iW0 == 12) {
                        E0(I);
                    } else if (iW0 == 17) {
                        gVar.skip(this.G);
                    } else if (iW0 == 18) {
                        throw new bf.n("Expected a value but was " + f0() + " at path " + q());
                    }
                }
                this.E = 0;
            }
            i10++;
            this.E = 0;
        } while (i10 != 0);
        int[] iArr = this.f18450r;
        int i11 = this.f18447a - 1;
        iArr[i11] = iArr[i11] + 1;
        this.f18449g[i11] = "null";
    }

    public final String toString() {
        return "JsonReader(" + this.B + ")";
    }

    public final void v0() throws androidx.datastore.preferences.protobuf.m {
        if (this.f18451x) {
            return;
        }
        t0("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    @Override // nk.w
    public final boolean w() throws androidx.datastore.preferences.protobuf.m, EOFException {
        int iW0 = this.E;
        if (iW0 == 0) {
            iW0 = w0();
        }
        return (iW0 == 2 || iW0 == 4 || iW0 == 18) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:139:0x01b5, code lost:
    
        if (z0(r7) != false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x01b8, code lost:
    
        if (r2 != 2) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x01ba, code lost:
    
        if (r5 == 0) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x01c0, code lost:
    
        if (r18 != Long.MIN_VALUE) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x01c2, code lost:
    
        if (r6 == 0) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x01c5, code lost:
    
        r3 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x01c9, code lost:
    
        if (r18 != r16) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x01cb, code lost:
    
        if (r6 != 0) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x01cd, code lost:
    
        if (r6 == 0) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x01cf, code lost:
    
        r8 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x01d2, code lost:
    
        r8 = -r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x01d5, code lost:
    
        r23.F = r8;
        r11.skip(r4);
        r10 = 16;
        r23.E = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x01e0, code lost:
    
        if (r2 == r3) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x01e3, code lost:
    
        if (r2 == 4) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x01e6, code lost:
    
        if (r2 != 7) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x01e8, code lost:
    
        r23.G = r4;
        r10 = 17;
        r23.E = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0146, code lost:
    
        r3 = 2;
     */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0216 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0134 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int w0() throws androidx.datastore.preferences.protobuf.m, java.io.EOFException {
        /*
            Method dump skipped, instructions count: 733
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: nk.x.w0():int");
    }

    public final int x0(io.sentry.t tVar, String str) {
        int length = ((String[]) tVar.f12736a).length;
        for (int i10 = 0; i10 < length; i10++) {
            if (str.equals(((String[]) tVar.f12736a)[i10])) {
                this.E = 0;
                this.f18449g[this.f18447a - 1] = str;
                return i10;
            }
        }
        return -1;
    }

    @Override // nk.w
    public final boolean y() throws androidx.datastore.preferences.protobuf.m, EOFException {
        int iW0 = this.E;
        if (iW0 == 0) {
            iW0 = w0();
        }
        if (iW0 == 5) {
            this.E = 0;
            int[] iArr = this.f18450r;
            int i10 = this.f18447a - 1;
            iArr[i10] = iArr[i10] + 1;
            return true;
        }
        if (iW0 == 6) {
            this.E = 0;
            int[] iArr2 = this.f18450r;
            int i11 = this.f18447a - 1;
            iArr2[i11] = iArr2[i11] + 1;
            return false;
        }
        throw new bf.n("Expected a boolean but was " + f0() + " at path " + q());
    }

    public final int y0(io.sentry.t tVar, String str) {
        int length = ((String[]) tVar.f12736a).length;
        for (int i10 = 0; i10 < length; i10++) {
            if (str.equals(((String[]) tVar.f12736a)[i10])) {
                this.E = 0;
                int[] iArr = this.f18450r;
                int i11 = this.f18447a - 1;
                iArr[i11] = iArr[i11] + 1;
                return i10;
            }
        }
        return -1;
    }

    public final boolean z0(int i10) throws androidx.datastore.preferences.protobuf.m {
        if (i10 == 9 || i10 == 10 || i10 == 12 || i10 == 13 || i10 == 32) {
            return false;
        }
        if (i10 != 35) {
            if (i10 == 44) {
                return false;
            }
            if (i10 != 47 && i10 != 61) {
                if (i10 == 123 || i10 == 125 || i10 == 58) {
                    return false;
                }
                if (i10 != 59) {
                    switch (i10) {
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
        v0();
        return false;
    }
}
