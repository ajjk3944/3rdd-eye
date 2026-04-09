package d9;

import bf.n;
import cv.g;
import cv.j;
import cv.v;
import cv.z;
import java.io.EOFException;
import sm.m;

/* loaded from: classes.dex */
public final class c extends b {
    public static final j H;
    public static final j I;
    public static final j J;
    public final g B;
    public int D;
    public long E;
    public int F;
    public String G;

    /* renamed from: y, reason: collision with root package name */
    public final z f7182y;

    static {
        j jVar = j.f6715r;
        H = m.m("'\\");
        I = m.m("\"\\");
        J = m.m("{}[]:, \n\t\r\f/\\;#=");
        m.m("\n\r");
        m.m("*/");
    }

    public c(z zVar) {
        this.f7179d = new int[32];
        this.f7180g = new String[32];
        this.f7181r = new int[32];
        this.D = 0;
        this.f7182y = zVar;
        this.B = zVar.f6754d;
        Y(6);
    }

    @Override // d9.b
    public final double G() throws androidx.datastore.preferences.protobuf.m, NumberFormatException, EOFException {
        int iP0 = this.D;
        if (iP0 == 0) {
            iP0 = p0();
        }
        if (iP0 == 16) {
            this.D = 0;
            int[] iArr = this.f7181r;
            int i10 = this.f7178a - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.E;
        }
        if (iP0 == 17) {
            long j = this.F;
            g gVar = this.B;
            gVar.getClass();
            this.G = gVar.V(j, tt.a.f22975a);
        } else if (iP0 == 9) {
            this.G = u0(I);
        } else if (iP0 == 8) {
            this.G = u0(H);
        } else if (iP0 == 10) {
            this.G = v0();
        } else if (iP0 != 11) {
            throw new n("Expected a double but was " + V() + " at path " + q());
        }
        this.D = 11;
        try {
            double d6 = Double.parseDouble(this.G);
            if (Double.isNaN(d6) || Double.isInfinite(d6)) {
                throw new androidx.datastore.preferences.protobuf.m("JSON forbids NaN and infinities: " + d6 + " at path " + q());
            }
            this.G = null;
            this.D = 0;
            int[] iArr2 = this.f7181r;
            int i11 = this.f7178a - 1;
            iArr2[i11] = iArr2[i11] + 1;
            return d6;
        } catch (NumberFormatException unused) {
            throw new n("Expected a double but was " + this.G + " at path " + q());
        }
    }

    @Override // d9.b
    public final int L() {
        int iP0 = this.D;
        if (iP0 == 0) {
            iP0 = p0();
        }
        if (iP0 == 16) {
            long j = this.E;
            int i10 = (int) j;
            if (j == i10) {
                this.D = 0;
                int[] iArr = this.f7181r;
                int i11 = this.f7178a - 1;
                iArr[i11] = iArr[i11] + 1;
                return i10;
            }
            throw new n("Expected an int but was " + this.E + " at path " + q());
        }
        if (iP0 == 17) {
            long j7 = this.F;
            g gVar = this.B;
            gVar.getClass();
            this.G = gVar.V(j7, tt.a.f22975a);
        } else if (iP0 == 9 || iP0 == 8) {
            String strU0 = iP0 == 9 ? u0(I) : u0(H);
            this.G = strU0;
            try {
                int i12 = Integer.parseInt(strU0);
                this.D = 0;
                int[] iArr2 = this.f7181r;
                int i13 = this.f7178a - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return i12;
            } catch (NumberFormatException unused) {
            }
        } else if (iP0 != 11) {
            throw new n("Expected an int but was " + V() + " at path " + q());
        }
        this.D = 11;
        try {
            double d6 = Double.parseDouble(this.G);
            int i14 = (int) d6;
            if (i14 != d6) {
                throw new n("Expected an int but was " + this.G + " at path " + q());
            }
            this.G = null;
            this.D = 0;
            int[] iArr3 = this.f7181r;
            int i15 = this.f7178a - 1;
            iArr3[i15] = iArr3[i15] + 1;
            return i14;
        } catch (NumberFormatException unused2) {
            throw new n("Expected an int but was " + this.G + " at path " + q());
        }
    }

    @Override // d9.b
    public final String R() {
        String strV;
        int iP0 = this.D;
        if (iP0 == 0) {
            iP0 = p0();
        }
        if (iP0 == 10) {
            strV = v0();
        } else if (iP0 == 9) {
            strV = u0(I);
        } else if (iP0 == 8) {
            strV = u0(H);
        } else if (iP0 == 11) {
            strV = this.G;
            this.G = null;
        } else if (iP0 == 16) {
            strV = Long.toString(this.E);
        } else {
            if (iP0 != 17) {
                throw new n("Expected a string but was " + V() + " at path " + q());
            }
            long j = this.F;
            g gVar = this.B;
            gVar.getClass();
            strV = gVar.V(j, tt.a.f22975a);
        }
        this.D = 0;
        int[] iArr = this.f7181r;
        int i10 = this.f7178a - 1;
        iArr[i10] = iArr[i10] + 1;
        return strV;
    }

    @Override // d9.b
    public final a V() throws androidx.datastore.preferences.protobuf.m, EOFException {
        int iP0 = this.D;
        if (iP0 == 0) {
            iP0 = p0();
        }
        switch (iP0) {
            case 1:
                return a.BEGIN_OBJECT;
            case 2:
                return a.END_OBJECT;
            case 3:
                return a.BEGIN_ARRAY;
            case 4:
                return a.END_ARRAY;
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return a.BOOLEAN;
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return a.NULL;
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
            case 9:
            case 10:
            case 11:
                return a.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return a.NAME;
            case 16:
            case 17:
                return a.NUMBER;
            case 18:
                return a.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    @Override // d9.b
    public final int Z(io.sentry.internal.debugmeta.c cVar) {
        int iP0 = this.D;
        if (iP0 == 0) {
            iP0 = p0();
        }
        if (iP0 < 12 || iP0 > 15) {
            return -1;
        }
        if (iP0 == 15) {
            return q0(this.G, cVar);
        }
        int iD = this.f7182y.D((v) cVar.f12354g);
        if (iD != -1) {
            this.D = 0;
            this.f7180g[this.f7178a - 1] = ((String[]) cVar.f12353d)[iD];
            return iD;
        }
        String str = this.f7180g[this.f7178a - 1];
        String strS0 = s0();
        int iQ0 = q0(strS0, cVar);
        if (iQ0 == -1) {
            this.D = 15;
            this.G = strS0;
            this.f7180g[this.f7178a - 1] = str;
        }
        return iQ0;
    }

    @Override // d9.b
    public final void b() {
        int iP0 = this.D;
        if (iP0 == 0) {
            iP0 = p0();
        }
        if (iP0 == 3) {
            Y(1);
            this.f7181r[this.f7178a - 1] = 0;
            this.D = 0;
        } else {
            throw new n("Expected BEGIN_ARRAY but was " + V() + " at path " + q());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws EOFException {
        this.D = 0;
        this.f7179d[0] = 8;
        this.f7178a = 1;
        this.B.b();
        this.f7182y.close();
    }

    @Override // d9.b
    public final void f() {
        int iP0 = this.D;
        if (iP0 == 0) {
            iP0 = p0();
        }
        if (iP0 == 1) {
            Y(3);
            this.D = 0;
        } else {
            throw new n("Expected BEGIN_OBJECT but was " + V() + " at path " + q());
        }
    }

    @Override // d9.b
    public final void f0() {
        int iP0 = this.D;
        if (iP0 == 0) {
            iP0 = p0();
        }
        if (iP0 == 14) {
            long jB0 = this.f7182y.b0(J);
            g gVar = this.B;
            if (jB0 == -1) {
                jB0 = gVar.f6706d;
            }
            gVar.skip(jB0);
        } else if (iP0 == 13) {
            x0(I);
        } else if (iP0 == 12) {
            x0(H);
        } else if (iP0 != 15) {
            throw new n("Expected a name but was " + V() + " at path " + q());
        }
        this.D = 0;
        this.f7180g[this.f7178a - 1] = "null";
    }

    @Override // d9.b
    public final void h() {
        int iP0 = this.D;
        if (iP0 == 0) {
            iP0 = p0();
        }
        if (iP0 != 4) {
            throw new n("Expected END_ARRAY but was " + V() + " at path " + q());
        }
        int i10 = this.f7178a;
        this.f7178a = i10 - 1;
        int[] iArr = this.f7181r;
        int i11 = i10 - 2;
        iArr[i11] = iArr[i11] + 1;
        this.D = 0;
    }

    @Override // d9.b
    public final void i() {
        int iP0 = this.D;
        if (iP0 == 0) {
            iP0 = p0();
        }
        if (iP0 != 2) {
            throw new n("Expected END_OBJECT but was " + V() + " at path " + q());
        }
        int i10 = this.f7178a;
        int i11 = i10 - 1;
        this.f7178a = i11;
        this.f7180g[i11] = null;
        int[] iArr = this.f7181r;
        int i12 = i10 - 2;
        iArr[i12] = iArr[i12] + 1;
        this.D = 0;
    }

    @Override // d9.b
    public final void i0() {
        int i10 = 0;
        do {
            int iP0 = this.D;
            if (iP0 == 0) {
                iP0 = p0();
            }
            if (iP0 == 3) {
                Y(1);
            } else if (iP0 == 1) {
                Y(3);
            } else {
                if (iP0 == 4) {
                    i10--;
                    if (i10 < 0) {
                        throw new n("Expected a value but was " + V() + " at path " + q());
                    }
                    this.f7178a--;
                } else if (iP0 == 2) {
                    i10--;
                    if (i10 < 0) {
                        throw new n("Expected a value but was " + V() + " at path " + q());
                    }
                    this.f7178a--;
                } else {
                    g gVar = this.B;
                    if (iP0 == 14 || iP0 == 10) {
                        long jB0 = this.f7182y.b0(J);
                        if (jB0 == -1) {
                            jB0 = gVar.f6706d;
                        }
                        gVar.skip(jB0);
                    } else if (iP0 == 9 || iP0 == 13) {
                        x0(I);
                    } else if (iP0 == 8 || iP0 == 12) {
                        x0(H);
                    } else if (iP0 == 17) {
                        gVar.skip(this.F);
                    } else if (iP0 == 18) {
                        throw new n("Expected a value but was " + V() + " at path " + q());
                    }
                }
                this.D = 0;
            }
            i10++;
            this.D = 0;
        } while (i10 != 0);
        int[] iArr = this.f7181r;
        int i11 = this.f7178a - 1;
        iArr[i11] = iArr[i11] + 1;
        this.f7180g[i11] = "null";
    }

    public final void o0() throws androidx.datastore.preferences.protobuf.m {
        n0("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x0195, code lost:
    
        if (r0(r10) != false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0197, code lost:
    
        if (r1 != 2) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0199, code lost:
    
        if (r4 == false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x019f, code lost:
    
        if (r8 != Long.MIN_VALUE) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x01a1, code lost:
    
        if (r13 == false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x01a5, code lost:
    
        if (r8 != r17) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x01a7, code lost:
    
        if (r13 != false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x01a9, code lost:
    
        if (r13 == false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x01ac, code lost:
    
        r8 = -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x01ad, code lost:
    
        r22.E = r8;
        r7.skip(r2);
        r9 = 16;
        r22.D = 16;
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
    
        r22.F = r2;
        r9 = 17;
        r22.D = 17;
     */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01ed A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0115 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int p0() throws androidx.datastore.preferences.protobuf.m, java.io.EOFException {
        /*
            Method dump skipped, instructions count: 652
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d9.c.p0():int");
    }

    public final int q0(String str, io.sentry.internal.debugmeta.c cVar) {
        int length = ((String[]) cVar.f12353d).length;
        for (int i10 = 0; i10 < length; i10++) {
            if (str.equals(((String[]) cVar.f12353d)[i10])) {
                this.D = 0;
                this.f7180g[this.f7178a - 1] = str;
                return i10;
            }
        }
        return -1;
    }

    public final boolean r0(int i10) throws androidx.datastore.preferences.protobuf.m {
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
        o0();
        throw null;
    }

    public final String s0() {
        String strU0;
        int iP0 = this.D;
        if (iP0 == 0) {
            iP0 = p0();
        }
        if (iP0 == 14) {
            strU0 = v0();
        } else if (iP0 == 13) {
            strU0 = u0(I);
        } else if (iP0 == 12) {
            strU0 = u0(H);
        } else {
            if (iP0 != 15) {
                throw new n("Expected a name but was " + V() + " at path " + q());
            }
            strU0 = this.G;
        }
        this.D = 0;
        this.f7180g[this.f7178a - 1] = strU0;
        return strU0;
    }

    public final int t0(boolean z10) throws androidx.datastore.preferences.protobuf.m, EOFException {
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            z zVar = this.f7182y;
            if (!zVar.S(i11)) {
                if (z10) {
                    throw new EOFException("End of input");
                }
                return -1;
            }
            long j = i10;
            g gVar = this.B;
            byte bQ = gVar.q(j);
            if (bQ != 10 && bQ != 32 && bQ != 13 && bQ != 9) {
                gVar.skip(j);
                if (bQ == 47) {
                    if (zVar.S(2L)) {
                        o0();
                        throw null;
                    }
                } else if (bQ == 35) {
                    o0();
                    throw null;
                }
                return bQ;
            }
            i10 = i11;
        }
    }

    public final String toString() {
        return "JsonReader(" + this.f7182y + ")";
    }

    public final String u0(j jVar) throws androidx.datastore.preferences.protobuf.m, EOFException {
        StringBuilder sb2 = null;
        while (true) {
            long jB0 = this.f7182y.b0(jVar);
            if (jB0 == -1) {
                n0("Unterminated string");
                throw null;
            }
            g gVar = this.B;
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
            sb2.append(w0());
        }
    }

    public final String v0() {
        long jB0 = this.f7182y.b0(J);
        g gVar = this.B;
        if (jB0 == -1) {
            return gVar.Y();
        }
        gVar.getClass();
        return gVar.V(jB0, tt.a.f22975a);
    }

    @Override // d9.b
    public final boolean w() throws androidx.datastore.preferences.protobuf.m, EOFException {
        int iP0 = this.D;
        if (iP0 == 0) {
            iP0 = p0();
        }
        return (iP0 == 2 || iP0 == 4 || iP0 == 18) ? false : true;
    }

    public final char w0() throws androidx.datastore.preferences.protobuf.m, EOFException {
        int i10;
        z zVar = this.f7182y;
        if (!zVar.S(1L)) {
            n0("Unterminated escape sequence");
            throw null;
        }
        g gVar = this.B;
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
            n0("Invalid escape sequence: \\" + ((char) b2));
            throw null;
        }
        if (!zVar.S(4L)) {
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
                    n0("\\u".concat(gVar.V(4L, tt.a.f22975a)));
                    throw null;
                }
                i10 = bQ - 55;
            }
            c4 = (char) (i10 + c10);
        }
        gVar.skip(4L);
        return c4;
    }

    public final void x0(j jVar) throws androidx.datastore.preferences.protobuf.m, EOFException {
        while (true) {
            long jB0 = this.f7182y.b0(jVar);
            if (jB0 == -1) {
                n0("Unterminated string");
                throw null;
            }
            g gVar = this.B;
            if (gVar.q(jB0) != 92) {
                gVar.skip(jB0 + 1);
                return;
            } else {
                gVar.skip(jB0 + 1);
                w0();
            }
        }
    }

    @Override // d9.b
    public final boolean y() {
        int iP0 = this.D;
        if (iP0 == 0) {
            iP0 = p0();
        }
        if (iP0 == 5) {
            this.D = 0;
            int[] iArr = this.f7181r;
            int i10 = this.f7178a - 1;
            iArr[i10] = iArr[i10] + 1;
            return true;
        }
        if (iP0 == 6) {
            this.D = 0;
            int[] iArr2 = this.f7181r;
            int i11 = this.f7178a - 1;
            iArr2[i11] = iArr2[i11] + 1;
            return false;
        }
        throw new n("Expected a boolean but was " + V() + " at path " + q());
    }
}
