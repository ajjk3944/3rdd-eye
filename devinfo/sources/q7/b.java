package q7;

import ac.m;
import androidx.datastore.preferences.protobuf.l;
import ec.y;
import hm.e;
import hm.h;
import hm.q;
import java.io.EOFException;
import je.u;
import km.n;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: l, reason: collision with root package name */
    public static final h f32204l;

    /* renamed from: m, reason: collision with root package name */
    public static final h f32205m;

    /* renamed from: n, reason: collision with root package name */
    public static final h f32206n;

    /* renamed from: f, reason: collision with root package name */
    public final q f32207f;
    public final e g;

    /* renamed from: h, reason: collision with root package name */
    public int f32208h;

    /* renamed from: i, reason: collision with root package name */
    public long f32209i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public String f32210k;

    static {
        h hVar = h.f25175d;
        f32204l = y.f("'\\");
        f32205m = y.f("\"\\");
        f32206n = y.f("{}[]:, \n\t\r\f/\\;#=");
        y.f("\n\r");
        y.f("*/");
    }

    public b(q qVar) {
        this.f32201b = new int[32];
        this.f32202c = new String[32];
        this.f32203d = new int[32];
        this.f32208h = 0;
        this.f32207f = qVar;
        this.g = qVar.f25204b;
        G(6);
    }

    @Override // q7.a
    public final int A() {
        int iV = this.f32208h;
        if (iV == 0) {
            iV = V();
        }
        if (iV == 16) {
            long j = this.f32209i;
            int i4 = (int) j;
            if (j == i4) {
                this.f32208h = 0;
                int[] iArr = this.f32203d;
                int i10 = this.f32200a - 1;
                iArr[i10] = iArr[i10] + 1;
                return i4;
            }
            throw new m("Expected an int but was " + this.f32209i + " at path " + p());
        }
        if (iV == 17) {
            long j8 = this.j;
            e eVar = this.g;
            eVar.getClass();
            this.f32210k = eVar.readString(j8, vk.a.f36267a);
        } else if (iV == 9 || iV == 8) {
            String strA0 = iV == 9 ? a0(f32205m) : a0(f32204l);
            this.f32210k = strA0;
            try {
                int i11 = Integer.parseInt(strA0);
                this.f32208h = 0;
                int[] iArr2 = this.f32203d;
                int i12 = this.f32200a - 1;
                iArr2[i12] = iArr2[i12] + 1;
                return i11;
            } catch (NumberFormatException unused) {
            }
        } else if (iV != 11) {
            throw new m("Expected an int but was " + u.D(F()) + " at path " + p());
        }
        this.f32208h = 11;
        try {
            double d10 = Double.parseDouble(this.f32210k);
            int i13 = (int) d10;
            if (i13 != d10) {
                throw new m("Expected an int but was " + this.f32210k + " at path " + p());
            }
            this.f32210k = null;
            this.f32208h = 0;
            int[] iArr3 = this.f32203d;
            int i14 = this.f32200a - 1;
            iArr3[i14] = iArr3[i14] + 1;
            return i13;
        } catch (NumberFormatException unused2) {
            throw new m("Expected an int but was " + this.f32210k + " at path " + p());
        }
    }

    @Override // q7.a
    public final String E() {
        String string;
        int iV = this.f32208h;
        if (iV == 0) {
            iV = V();
        }
        if (iV == 10) {
            string = b0();
        } else if (iV == 9) {
            string = a0(f32205m);
        } else if (iV == 8) {
            string = a0(f32204l);
        } else if (iV == 11) {
            string = this.f32210k;
            this.f32210k = null;
        } else if (iV == 16) {
            string = Long.toString(this.f32209i);
        } else {
            if (iV != 17) {
                throw new m("Expected a string but was " + u.D(F()) + " at path " + p());
            }
            long j = this.j;
            e eVar = this.g;
            eVar.getClass();
            string = eVar.readString(j, vk.a.f36267a);
        }
        this.f32208h = 0;
        int[] iArr = this.f32203d;
        int i4 = this.f32200a - 1;
        iArr[i4] = iArr[i4] + 1;
        return string;
    }

    @Override // q7.a
    public final int F() throws l, EOFException {
        int iV = this.f32208h;
        if (iV == 0) {
            iV = V();
        }
        switch (iV) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
            case 15:
                return 5;
            case 16:
            case 17:
                return 7;
            case 18:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    @Override // q7.a
    public final int L(n nVar) {
        int iV = this.f32208h;
        if (iV == 0) {
            iV = V();
        }
        if (iV < 12 || iV > 15) {
            return -1;
        }
        if (iV == 15) {
            return W(this.f32210k, nVar);
        }
        int iC = this.f32207f.C((hm.n) nVar.f28443c);
        if (iC != -1) {
            this.f32208h = 0;
            this.f32202c[this.f32200a - 1] = ((String[]) nVar.f28442b)[iC];
            return iC;
        }
        String str = this.f32202c[this.f32200a - 1];
        String strY = Y();
        int iW = W(strY, nVar);
        if (iW == -1) {
            this.f32208h = 15;
            this.f32210k = strY;
            this.f32202c[this.f32200a - 1] = str;
        }
        return iW;
    }

    @Override // q7.a
    public final void N() {
        int iV = this.f32208h;
        if (iV == 0) {
            iV = V();
        }
        if (iV == 14) {
            long jC = this.f32207f.c(f32206n);
            e eVar = this.g;
            if (jC == -1) {
                jC = eVar.f25174b;
            }
            eVar.skip(jC);
        } else if (iV == 13) {
            d0(f32205m);
        } else if (iV == 12) {
            d0(f32204l);
        } else if (iV != 15) {
            throw new m("Expected a name but was " + u.D(F()) + " at path " + p());
        }
        this.f32208h = 0;
        this.f32202c[this.f32200a - 1] = "null";
    }

    @Override // q7.a
    public final void O() {
        int i4 = 0;
        do {
            int iV = this.f32208h;
            if (iV == 0) {
                iV = V();
            }
            if (iV == 3) {
                G(1);
            } else if (iV == 1) {
                G(3);
            } else {
                if (iV == 4) {
                    i4--;
                    if (i4 < 0) {
                        throw new m("Expected a value but was " + u.D(F()) + " at path " + p());
                    }
                    this.f32200a--;
                } else if (iV == 2) {
                    i4--;
                    if (i4 < 0) {
                        throw new m("Expected a value but was " + u.D(F()) + " at path " + p());
                    }
                    this.f32200a--;
                } else {
                    e eVar = this.g;
                    if (iV == 14 || iV == 10) {
                        long jC = this.f32207f.c(f32206n);
                        if (jC == -1) {
                            jC = eVar.f25174b;
                        }
                        eVar.skip(jC);
                    } else if (iV == 9 || iV == 13) {
                        d0(f32205m);
                    } else if (iV == 8 || iV == 12) {
                        d0(f32204l);
                    } else if (iV == 17) {
                        eVar.skip(this.j);
                    } else if (iV == 18) {
                        throw new m("Expected a value but was " + u.D(F()) + " at path " + p());
                    }
                }
                this.f32208h = 0;
            }
            i4++;
            this.f32208h = 0;
        } while (i4 != 0);
        int[] iArr = this.f32203d;
        int i10 = this.f32200a - 1;
        iArr[i10] = iArr[i10] + 1;
        this.f32202c[i10] = "null";
    }

    public final void U() throws l {
        T("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x0195, code lost:
    
        if (X(r10) != false) goto L113;
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
    
        r22.f32209i = r8;
        r7.skip(r2);
        r9 = 16;
        r22.f32208h = 16;
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
    
        r22.j = r2;
        r9 = 17;
        r22.f32208h = 17;
     */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01ed A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0115 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int V() throws androidx.datastore.preferences.protobuf.l, java.io.EOFException {
        /*
            Method dump skipped, instructions count: 652
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.b.V():int");
    }

    public final int W(String str, n nVar) {
        int length = ((String[]) nVar.f28442b).length;
        for (int i4 = 0; i4 < length; i4++) {
            if (str.equals(((String[]) nVar.f28442b)[i4])) {
                this.f32208h = 0;
                this.f32202c[this.f32200a - 1] = str;
                return i4;
            }
        }
        return -1;
    }

    public final boolean X(int i4) throws l {
        if (i4 == 9 || i4 == 10 || i4 == 12 || i4 == 13 || i4 == 32) {
            return false;
        }
        if (i4 != 35) {
            if (i4 == 44) {
                return false;
            }
            if (i4 != 47 && i4 != 61) {
                if (i4 == 123 || i4 == 125 || i4 == 58) {
                    return false;
                }
                if (i4 != 59) {
                    switch (i4) {
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
        U();
        throw null;
    }

    public final String Y() {
        String strA0;
        int iV = this.f32208h;
        if (iV == 0) {
            iV = V();
        }
        if (iV == 14) {
            strA0 = b0();
        } else if (iV == 13) {
            strA0 = a0(f32205m);
        } else if (iV == 12) {
            strA0 = a0(f32204l);
        } else {
            if (iV != 15) {
                throw new m("Expected a name but was " + u.D(F()) + " at path " + p());
            }
            strA0 = this.f32210k;
        }
        this.f32208h = 0;
        this.f32202c[this.f32200a - 1] = strA0;
        return strA0;
    }

    public final int Z(boolean z3) throws l, EOFException {
        int i4 = 0;
        while (true) {
            int i10 = i4 + 1;
            q qVar = this.f32207f;
            if (!qVar.request(i10)) {
                if (z3) {
                    throw new EOFException("End of input");
                }
                return -1;
            }
            long j = i4;
            e eVar = this.g;
            byte bP = eVar.p(j);
            if (bP != 10 && bP != 32 && bP != 13 && bP != 9) {
                eVar.skip(j);
                if (bP == 47) {
                    if (qVar.request(2L)) {
                        U();
                        throw null;
                    }
                } else if (bP == 35) {
                    U();
                    throw null;
                }
                return bP;
            }
            i4 = i10;
        }
    }

    public final String a0(h hVar) throws l, EOFException {
        StringBuilder sb2 = null;
        while (true) {
            long jC = this.f32207f.c(hVar);
            if (jC == -1) {
                T("Unterminated string");
                throw null;
            }
            e eVar = this.g;
            if (eVar.p(jC) != 92) {
                if (sb2 == null) {
                    String string = eVar.readString(jC, vk.a.f36267a);
                    eVar.readByte();
                    return string;
                }
                sb2.append(eVar.readString(jC, vk.a.f36267a));
                eVar.readByte();
                return sb2.toString();
            }
            if (sb2 == null) {
                sb2 = new StringBuilder();
            }
            sb2.append(eVar.readString(jC, vk.a.f36267a));
            eVar.readByte();
            sb2.append(c0());
        }
    }

    public final String b0() {
        long jC = this.f32207f.c(f32206n);
        e eVar = this.g;
        if (jC == -1) {
            return eVar.readUtf8();
        }
        eVar.getClass();
        return eVar.readString(jC, vk.a.f36267a);
    }

    @Override // q7.a
    public final void c() {
        int iV = this.f32208h;
        if (iV == 0) {
            iV = V();
        }
        if (iV == 3) {
            G(1);
            this.f32203d[this.f32200a - 1] = 0;
            this.f32208h = 0;
        } else {
            throw new m("Expected BEGIN_ARRAY but was " + u.D(F()) + " at path " + p());
        }
    }

    public final char c0() throws l, EOFException {
        int i4;
        q qVar = this.f32207f;
        if (!qVar.request(1L)) {
            T("Unterminated escape sequence");
            throw null;
        }
        e eVar = this.g;
        byte b10 = eVar.readByte();
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
            T("Invalid escape sequence: \\" + ((char) b10));
            throw null;
        }
        if (!qVar.request(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + p());
        }
        char c9 = 0;
        for (int i10 = 0; i10 < 4; i10++) {
            byte bP = eVar.p(i10);
            char c10 = (char) (c9 << 4);
            if (bP >= 48 && bP <= 57) {
                i4 = bP - 48;
            } else if (bP >= 97 && bP <= 102) {
                i4 = bP - 87;
            } else {
                if (bP < 65 || bP > 70) {
                    T("\\u".concat(eVar.readString(4L, vk.a.f36267a)));
                    throw null;
                }
                i4 = bP - 55;
            }
            c9 = (char) (i4 + c10);
        }
        eVar.skip(4L);
        return c9;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws EOFException {
        this.f32208h = 0;
        this.f32201b[0] = 8;
        this.f32200a = 1;
        this.g.e();
        this.f32207f.close();
    }

    public final void d0(h hVar) throws l, EOFException {
        while (true) {
            long jC = this.f32207f.c(hVar);
            if (jC == -1) {
                T("Unterminated string");
                throw null;
            }
            e eVar = this.g;
            if (eVar.p(jC) != 92) {
                eVar.skip(jC + 1);
                return;
            } else {
                eVar.skip(jC + 1);
                c0();
            }
        }
    }

    @Override // q7.a
    public final void e() {
        int iV = this.f32208h;
        if (iV == 0) {
            iV = V();
        }
        if (iV == 1) {
            G(3);
            this.f32208h = 0;
        } else {
            throw new m("Expected BEGIN_OBJECT but was " + u.D(F()) + " at path " + p());
        }
    }

    @Override // q7.a
    public final void g() {
        int iV = this.f32208h;
        if (iV == 0) {
            iV = V();
        }
        if (iV != 4) {
            throw new m("Expected END_ARRAY but was " + u.D(F()) + " at path " + p());
        }
        int i4 = this.f32200a;
        this.f32200a = i4 - 1;
        int[] iArr = this.f32203d;
        int i10 = i4 - 2;
        iArr[i10] = iArr[i10] + 1;
        this.f32208h = 0;
    }

    @Override // q7.a
    public final void m() {
        int iV = this.f32208h;
        if (iV == 0) {
            iV = V();
        }
        if (iV != 2) {
            throw new m("Expected END_OBJECT but was " + u.D(F()) + " at path " + p());
        }
        int i4 = this.f32200a;
        int i10 = i4 - 1;
        this.f32200a = i10;
        this.f32202c[i10] = null;
        int[] iArr = this.f32203d;
        int i11 = i4 - 2;
        iArr[i11] = iArr[i11] + 1;
        this.f32208h = 0;
    }

    public final String toString() {
        return "JsonReader(" + this.f32207f + ")";
    }

    @Override // q7.a
    public final boolean v() throws l, EOFException {
        int iV = this.f32208h;
        if (iV == 0) {
            iV = V();
        }
        return (iV == 2 || iV == 4 || iV == 18) ? false : true;
    }

    @Override // q7.a
    public final boolean w() {
        int iV = this.f32208h;
        if (iV == 0) {
            iV = V();
        }
        if (iV == 5) {
            this.f32208h = 0;
            int[] iArr = this.f32203d;
            int i4 = this.f32200a - 1;
            iArr[i4] = iArr[i4] + 1;
            return true;
        }
        if (iV == 6) {
            this.f32208h = 0;
            int[] iArr2 = this.f32203d;
            int i10 = this.f32200a - 1;
            iArr2[i10] = iArr2[i10] + 1;
            return false;
        }
        throw new m("Expected a boolean but was " + u.D(F()) + " at path " + p());
    }

    @Override // q7.a
    public final double y() throws l, NumberFormatException, EOFException {
        int iV = this.f32208h;
        if (iV == 0) {
            iV = V();
        }
        if (iV == 16) {
            this.f32208h = 0;
            int[] iArr = this.f32203d;
            int i4 = this.f32200a - 1;
            iArr[i4] = iArr[i4] + 1;
            return this.f32209i;
        }
        if (iV == 17) {
            long j = this.j;
            e eVar = this.g;
            eVar.getClass();
            this.f32210k = eVar.readString(j, vk.a.f36267a);
        } else if (iV == 9) {
            this.f32210k = a0(f32205m);
        } else if (iV == 8) {
            this.f32210k = a0(f32204l);
        } else if (iV == 10) {
            this.f32210k = b0();
        } else if (iV != 11) {
            throw new m("Expected a double but was " + u.D(F()) + " at path " + p());
        }
        this.f32208h = 11;
        try {
            double d10 = Double.parseDouble(this.f32210k);
            if (Double.isNaN(d10) || Double.isInfinite(d10)) {
                throw new l("JSON forbids NaN and infinities: " + d10 + " at path " + p());
            }
            this.f32210k = null;
            this.f32208h = 0;
            int[] iArr2 = this.f32203d;
            int i10 = this.f32200a - 1;
            iArr2[i10] = iArr2[i10] + 1;
            return d10;
        } catch (NumberFormatException unused) {
            throw new m("Expected a double but was " + this.f32210k + " at path " + p());
        }
    }
}
