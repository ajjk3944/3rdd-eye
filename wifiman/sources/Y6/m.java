package Y6;

import Y6.k;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonEncodingException;
import ej.C5481e;
import ej.InterfaceC5483g;
import java.io.EOFException;
import java.io.IOException;
import java.math.BigDecimal;

/* loaded from: classes3.dex */
final class m extends k {

    /* renamed from: m, reason: collision with root package name */
    private static final ej.h f24669m = ej.h.j("'\\");

    /* renamed from: n, reason: collision with root package name */
    private static final ej.h f24670n = ej.h.j("\"\\");

    /* renamed from: o, reason: collision with root package name */
    private static final ej.h f24671o = ej.h.j("{}[]:, \n\t\r\f/\\;#=");

    /* renamed from: p, reason: collision with root package name */
    private static final ej.h f24672p = ej.h.j("\n\r");

    /* renamed from: q, reason: collision with root package name */
    private static final ej.h f24673q = ej.h.j("*/");

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC5483g f24674g;

    /* renamed from: h, reason: collision with root package name */
    private final C5481e f24675h;

    /* renamed from: i, reason: collision with root package name */
    private int f24676i;

    /* renamed from: j, reason: collision with root package name */
    private long f24677j;

    /* renamed from: k, reason: collision with root package name */
    private int f24678k;

    /* renamed from: l, reason: collision with root package name */
    private String f24679l;

    m(InterfaceC5483g interfaceC5483g) {
        this.f24676i = 0;
        if (interfaceC5483g == null) {
            throw new NullPointerException("source == null");
        }
        this.f24674g = interfaceC5483g;
        this.f24675h = interfaceC5483g.b();
        n0(6);
    }

    private boolean A0(int i10) throws JsonEncodingException {
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
        w0();
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0025, code lost:
    
        r6.f24675h.d(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
    
        if (r2 != 47) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0037, code lost:
    
        if (r6.f24674g.request(2) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
    
        w0();
        r3 = r6.f24675h.f0(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
    
        if (r3 == 42) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
    
        if (r3 == 47) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
    
        r6.f24675h.readByte();
        r6.f24675h.readByte();
        J0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
    
        r6.f24675h.readByte();
        r6.f24675h.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0068, code lost:
    
        if (I0() == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0072, code lost:
    
        throw v0("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0075, code lost:
    
        if (r2 != 35) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0077, code lost:
    
        w0();
        J0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007e, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int B0(boolean r7) throws java.io.EOFException, com.squareup.moshi.JsonEncodingException {
        /*
            r6 = this;
            r0 = 0
        L1:
            r1 = r0
        L2:
            ej.g r2 = r6.f24674g
            int r3 = r1 + 1
            long r4 = (long) r3
            boolean r2 = r2.request(r4)
            if (r2 == 0) goto L81
            ej.e r2 = r6.f24675h
            long r4 = (long) r1
            byte r2 = r2.f0(r4)
            r4 = 10
            if (r2 == r4) goto L7f
            r4 = 32
            if (r2 == r4) goto L7f
            r4 = 13
            if (r2 == r4) goto L7f
            r4 = 9
            if (r2 != r4) goto L25
            goto L7f
        L25:
            ej.e r3 = r6.f24675h
            long r4 = (long) r1
            r3.d(r4)
            r1 = 47
            if (r2 != r1) goto L73
            ej.g r3 = r6.f24674g
            r4 = 2
            boolean r3 = r3.request(r4)
            if (r3 != 0) goto L3a
            return r2
        L3a:
            r6.w0()
            ej.e r3 = r6.f24675h
            r4 = 1
            byte r3 = r3.f0(r4)
            r4 = 42
            if (r3 == r4) goto L5a
            if (r3 == r1) goto L4c
            return r2
        L4c:
            ej.e r1 = r6.f24675h
            r1.readByte()
            ej.e r1 = r6.f24675h
            r1.readByte()
            r6.J0()
            goto L1
        L5a:
            ej.e r1 = r6.f24675h
            r1.readByte()
            ej.e r1 = r6.f24675h
            r1.readByte()
            boolean r1 = r6.I0()
            if (r1 == 0) goto L6b
            goto L1
        L6b:
            java.lang.String r7 = "Unterminated comment"
            com.squareup.moshi.JsonEncodingException r7 = r6.v0(r7)
            throw r7
        L73:
            r1 = 35
            if (r2 != r1) goto L7e
            r6.w0()
            r6.J0()
            goto L1
        L7e:
            return r2
        L7f:
            r1 = r3
            goto L2
        L81:
            if (r7 != 0) goto L85
            r7 = -1
            return r7
        L85:
            java.io.EOFException r7 = new java.io.EOFException
            java.lang.String r0 = "End of input"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Y6.m.B0(boolean):int");
    }

    private String C0(ej.h hVar) throws EOFException, JsonEncodingException {
        StringBuilder sb2 = null;
        while (true) {
            long jM = this.f24674g.M(hVar);
            if (jM == -1) {
                throw v0("Unterminated string");
            }
            if (this.f24675h.f0(jM) != 92) {
                if (sb2 == null) {
                    String strA0 = this.f24675h.A0(jM);
                    this.f24675h.readByte();
                    return strA0;
                }
                sb2.append(this.f24675h.A0(jM));
                this.f24675h.readByte();
                return sb2.toString();
            }
            if (sb2 == null) {
                sb2 = new StringBuilder();
            }
            sb2.append(this.f24675h.A0(jM));
            this.f24675h.readByte();
            sb2.append(G0());
        }
    }

    private String D0() {
        long jM = this.f24674g.M(f24671o);
        return jM != -1 ? this.f24675h.A0(jM) : this.f24675h.z0();
    }

    private int E0() throws EOFException {
        String str;
        String str2;
        int i10;
        byte bF0 = this.f24675h.f0(0L);
        if (bF0 == 116 || bF0 == 84) {
            str = "true";
            str2 = "TRUE";
            i10 = 5;
        } else if (bF0 == 102 || bF0 == 70) {
            str = "false";
            str2 = "FALSE";
            i10 = 6;
        } else {
            if (bF0 != 110 && bF0 != 78) {
                return 0;
            }
            str = "null";
            str2 = "NULL";
            i10 = 7;
        }
        int length = str.length();
        int i11 = 1;
        while (i11 < length) {
            int i12 = i11 + 1;
            if (!this.f24674g.request(i12)) {
                return 0;
            }
            byte bF02 = this.f24675h.f0(i11);
            if (bF02 != str.charAt(i11) && bF02 != str2.charAt(i11)) {
                return 0;
            }
            i11 = i12;
        }
        if (this.f24674g.request(length + 1) && A0(this.f24675h.f0(length))) {
            return 0;
        }
        this.f24675h.d(length);
        this.f24676i = i10;
        return i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0081, code lost:
    
        if (A0(r11) != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0083, code lost:
    
        if (r6 != 2) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0085, code lost:
    
        if (r7 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008b, code lost:
    
        if (r8 != Long.MIN_VALUE) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x008d, code lost:
    
        if (r10 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0091, code lost:
    
        if (r8 != 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0093, code lost:
    
        if (r10 != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0095, code lost:
    
        if (r10 == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0098, code lost:
    
        r8 = -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0099, code lost:
    
        r16.f24677j = r8;
        r16.f24675h.d(r5);
        r16.f24676i = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00a5, code lost:
    
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00a6, code lost:
    
        if (r6 == 2) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00a9, code lost:
    
        if (r6 == 4) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ac, code lost:
    
        if (r6 != 7) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00af, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00b0, code lost:
    
        r16.f24678k = r5;
        r16.f24676i = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00b6, code lost:
    
        return 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00b7, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int F0() throws java.io.EOFException {
        /*
            Method dump skipped, instructions count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Y6.m.F0():int");
    }

    private char G0() throws EOFException, JsonEncodingException {
        int i10;
        if (!this.f24674g.request(1L)) {
            throw v0("Unterminated escape sequence");
        }
        byte b10 = this.f24675h.readByte();
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
            if (this.f24664e) {
                return (char) b10;
            }
            throw v0("Invalid escape sequence: \\" + ((char) b10));
        }
        if (!this.f24674g.request(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + getPath());
        }
        char c10 = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            byte bF0 = this.f24675h.f0(i11);
            char c11 = (char) (c10 << 4);
            if (bF0 >= 48 && bF0 <= 57) {
                i10 = bF0 - 48;
            } else if (bF0 >= 97 && bF0 <= 102) {
                i10 = bF0 - 87;
            } else {
                if (bF0 < 65 || bF0 > 70) {
                    throw v0("\\u" + this.f24675h.A0(4L));
                }
                i10 = bF0 - 55;
            }
            c10 = (char) (c11 + i10);
        }
        this.f24675h.d(4L);
        return c10;
    }

    private void H0(ej.h hVar) throws EOFException, JsonEncodingException {
        while (true) {
            long jM = this.f24674g.M(hVar);
            if (jM == -1) {
                throw v0("Unterminated string");
            }
            if (this.f24675h.f0(jM) != 92) {
                this.f24675h.d(jM + 1);
                return;
            } else {
                this.f24675h.d(jM + 1);
                G0();
            }
        }
    }

    private boolean I0() throws EOFException {
        long jW = this.f24674g.W(f24673q);
        boolean z10 = jW != -1;
        C5481e c5481e = this.f24675h;
        c5481e.d(z10 ? jW + r1.b0() : c5481e.D0());
        return z10;
    }

    private void J0() throws EOFException {
        long jM = this.f24674g.M(f24672p);
        C5481e c5481e = this.f24675h;
        c5481e.d(jM != -1 ? jM + 1 : c5481e.D0());
    }

    private void K0() throws EOFException {
        long jM = this.f24674g.M(f24671o);
        C5481e c5481e = this.f24675h;
        if (jM == -1) {
            jM = c5481e.D0();
        }
        c5481e.d(jM);
    }

    private void w0() throws JsonEncodingException {
        if (!this.f24664e) {
            throw v0("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private int x0() throws EOFException, JsonEncodingException {
        int[] iArr = this.f24661b;
        int i10 = this.f24660a;
        int i11 = iArr[i10 - 1];
        if (i11 == 1) {
            iArr[i10 - 1] = 2;
        } else if (i11 == 2) {
            int iB0 = B0(true);
            this.f24675h.readByte();
            if (iB0 != 44) {
                if (iB0 != 59) {
                    if (iB0 != 93) {
                        throw v0("Unterminated array");
                    }
                    this.f24676i = 4;
                    return 4;
                }
                w0();
            }
        } else {
            if (i11 == 3 || i11 == 5) {
                iArr[i10 - 1] = 4;
                if (i11 == 5) {
                    int iB02 = B0(true);
                    this.f24675h.readByte();
                    if (iB02 != 44) {
                        if (iB02 != 59) {
                            if (iB02 != 125) {
                                throw v0("Unterminated object");
                            }
                            this.f24676i = 2;
                            return 2;
                        }
                        w0();
                    }
                }
                int iB03 = B0(true);
                if (iB03 == 34) {
                    this.f24675h.readByte();
                    this.f24676i = 13;
                    return 13;
                }
                if (iB03 == 39) {
                    this.f24675h.readByte();
                    w0();
                    this.f24676i = 12;
                    return 12;
                }
                if (iB03 != 125) {
                    w0();
                    if (!A0((char) iB03)) {
                        throw v0("Expected name");
                    }
                    this.f24676i = 14;
                    return 14;
                }
                if (i11 == 5) {
                    throw v0("Expected name");
                }
                this.f24675h.readByte();
                this.f24676i = 2;
                return 2;
            }
            if (i11 == 4) {
                iArr[i10 - 1] = 5;
                int iB04 = B0(true);
                this.f24675h.readByte();
                if (iB04 != 58) {
                    if (iB04 != 61) {
                        throw v0("Expected ':'");
                    }
                    w0();
                    if (this.f24674g.request(1L) && this.f24675h.f0(0L) == 62) {
                        this.f24675h.readByte();
                    }
                }
            } else if (i11 == 6) {
                iArr[i10 - 1] = 7;
            } else if (i11 == 7) {
                if (B0(false) == -1) {
                    this.f24676i = 18;
                    return 18;
                }
                w0();
            } else {
                if (i11 == 9) {
                    throw null;
                }
                if (i11 == 8) {
                    throw new IllegalStateException("JsonReader is closed");
                }
            }
        }
        int iB05 = B0(true);
        if (iB05 == 34) {
            this.f24675h.readByte();
            this.f24676i = 9;
            return 9;
        }
        if (iB05 == 39) {
            w0();
            this.f24675h.readByte();
            this.f24676i = 8;
            return 8;
        }
        if (iB05 != 44 && iB05 != 59) {
            if (iB05 == 91) {
                this.f24675h.readByte();
                this.f24676i = 3;
                return 3;
            }
            if (iB05 != 93) {
                if (iB05 == 123) {
                    this.f24675h.readByte();
                    this.f24676i = 1;
                    return 1;
                }
                int iE0 = E0();
                if (iE0 != 0) {
                    return iE0;
                }
                int iF0 = F0();
                if (iF0 != 0) {
                    return iF0;
                }
                if (!A0(this.f24675h.f0(0L))) {
                    throw v0("Expected value");
                }
                w0();
                this.f24676i = 10;
                return 10;
            }
            if (i11 == 1) {
                this.f24675h.readByte();
                this.f24676i = 4;
                return 4;
            }
        }
        if (i11 != 1 && i11 != 2) {
            throw v0("Unexpected value");
        }
        w0();
        this.f24676i = 7;
        return 7;
    }

    private int y0(String str, k.b bVar) {
        int length = bVar.f24667a.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (str.equals(bVar.f24667a[i10])) {
                this.f24676i = 0;
                this.f24662c[this.f24660a - 1] = str;
                return i10;
            }
        }
        return -1;
    }

    private int z0(String str, k.b bVar) {
        int length = bVar.f24667a.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (str.equals(bVar.f24667a[i10])) {
                this.f24676i = 0;
                int[] iArr = this.f24663d;
                int i11 = this.f24660a - 1;
                iArr[i11] = iArr[i11] + 1;
                return i10;
            }
        }
        return -1;
    }

    @Override // Y6.k
    public double C() throws NumberFormatException, EOFException, JsonEncodingException {
        int iX0 = this.f24676i;
        if (iX0 == 0) {
            iX0 = x0();
        }
        if (iX0 == 16) {
            this.f24676i = 0;
            int[] iArr = this.f24663d;
            int i10 = this.f24660a - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f24677j;
        }
        if (iX0 == 17) {
            this.f24679l = this.f24675h.A0(this.f24678k);
        } else if (iX0 == 9) {
            this.f24679l = C0(f24670n);
        } else if (iX0 == 8) {
            this.f24679l = C0(f24669m);
        } else if (iX0 == 10) {
            this.f24679l = D0();
        } else if (iX0 != 11) {
            throw new JsonDataException("Expected a double but was " + d0() + " at path " + getPath());
        }
        this.f24676i = 11;
        try {
            double d10 = Double.parseDouble(this.f24679l);
            if (this.f24664e || !(Double.isNaN(d10) || Double.isInfinite(d10))) {
                this.f24679l = null;
                this.f24676i = 0;
                int[] iArr2 = this.f24663d;
                int i11 = this.f24660a - 1;
                iArr2[i11] = iArr2[i11] + 1;
                return d10;
            }
            throw new JsonEncodingException("JSON forbids NaN and infinities: " + d10 + " at path " + getPath());
        } catch (NumberFormatException unused) {
            throw new JsonDataException("Expected a double but was " + this.f24679l + " at path " + getPath());
        }
    }

    @Override // Y6.k
    public int J() throws NumberFormatException, EOFException, JsonEncodingException {
        int iX0 = this.f24676i;
        if (iX0 == 0) {
            iX0 = x0();
        }
        if (iX0 == 16) {
            long j10 = this.f24677j;
            int i10 = (int) j10;
            if (j10 == i10) {
                this.f24676i = 0;
                int[] iArr = this.f24663d;
                int i11 = this.f24660a - 1;
                iArr[i11] = iArr[i11] + 1;
                return i10;
            }
            throw new JsonDataException("Expected an int but was " + this.f24677j + " at path " + getPath());
        }
        if (iX0 == 17) {
            this.f24679l = this.f24675h.A0(this.f24678k);
        } else if (iX0 == 9 || iX0 == 8) {
            String strC0 = iX0 == 9 ? C0(f24670n) : C0(f24669m);
            this.f24679l = strC0;
            try {
                int i12 = Integer.parseInt(strC0);
                this.f24676i = 0;
                int[] iArr2 = this.f24663d;
                int i13 = this.f24660a - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return i12;
            } catch (NumberFormatException unused) {
            }
        } else if (iX0 != 11) {
            throw new JsonDataException("Expected an int but was " + d0() + " at path " + getPath());
        }
        this.f24676i = 11;
        try {
            double d10 = Double.parseDouble(this.f24679l);
            int i14 = (int) d10;
            if (i14 == d10) {
                this.f24679l = null;
                this.f24676i = 0;
                int[] iArr3 = this.f24663d;
                int i15 = this.f24660a - 1;
                iArr3[i15] = iArr3[i15] + 1;
                return i14;
            }
            throw new JsonDataException("Expected an int but was " + this.f24679l + " at path " + getPath());
        } catch (NumberFormatException unused2) {
            throw new JsonDataException("Expected an int but was " + this.f24679l + " at path " + getPath());
        }
    }

    @Override // Y6.k
    public long P() throws NumberFormatException, EOFException, JsonEncodingException {
        int iX0 = this.f24676i;
        if (iX0 == 0) {
            iX0 = x0();
        }
        if (iX0 == 16) {
            this.f24676i = 0;
            int[] iArr = this.f24663d;
            int i10 = this.f24660a - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f24677j;
        }
        if (iX0 == 17) {
            this.f24679l = this.f24675h.A0(this.f24678k);
        } else if (iX0 == 9 || iX0 == 8) {
            String strC0 = iX0 == 9 ? C0(f24670n) : C0(f24669m);
            this.f24679l = strC0;
            try {
                long j10 = Long.parseLong(strC0);
                this.f24676i = 0;
                int[] iArr2 = this.f24663d;
                int i11 = this.f24660a - 1;
                iArr2[i11] = iArr2[i11] + 1;
                return j10;
            } catch (NumberFormatException unused) {
            }
        } else if (iX0 != 11) {
            throw new JsonDataException("Expected a long but was " + d0() + " at path " + getPath());
        }
        this.f24676i = 11;
        try {
            long jLongValueExact = new BigDecimal(this.f24679l).longValueExact();
            this.f24679l = null;
            this.f24676i = 0;
            int[] iArr3 = this.f24663d;
            int i12 = this.f24660a - 1;
            iArr3[i12] = iArr3[i12] + 1;
            return jLongValueExact;
        } catch (ArithmeticException | NumberFormatException unused2) {
            throw new JsonDataException("Expected a long but was " + this.f24679l + " at path " + getPath());
        }
    }

    @Override // Y6.k
    public String S() throws EOFException, JsonEncodingException {
        String strC0;
        int iX0 = this.f24676i;
        if (iX0 == 0) {
            iX0 = x0();
        }
        if (iX0 == 14) {
            strC0 = D0();
        } else if (iX0 == 13) {
            strC0 = C0(f24670n);
        } else if (iX0 == 12) {
            strC0 = C0(f24669m);
        } else {
            if (iX0 != 15) {
                throw new JsonDataException("Expected a name but was " + d0() + " at path " + getPath());
            }
            strC0 = this.f24679l;
            this.f24679l = null;
        }
        this.f24676i = 0;
        this.f24662c[this.f24660a - 1] = strC0;
        return strC0;
    }

    @Override // Y6.k
    public Object T() throws EOFException, JsonEncodingException {
        int iX0 = this.f24676i;
        if (iX0 == 0) {
            iX0 = x0();
        }
        if (iX0 == 7) {
            this.f24676i = 0;
            int[] iArr = this.f24663d;
            int i10 = this.f24660a - 1;
            iArr[i10] = iArr[i10] + 1;
            return null;
        }
        throw new JsonDataException("Expected null but was " + d0() + " at path " + getPath());
    }

    @Override // Y6.k
    public String Y() throws EOFException, JsonEncodingException {
        String strA0;
        int iX0 = this.f24676i;
        if (iX0 == 0) {
            iX0 = x0();
        }
        if (iX0 == 10) {
            strA0 = D0();
        } else if (iX0 == 9) {
            strA0 = C0(f24670n);
        } else if (iX0 == 8) {
            strA0 = C0(f24669m);
        } else if (iX0 == 11) {
            strA0 = this.f24679l;
            this.f24679l = null;
        } else if (iX0 == 16) {
            strA0 = Long.toString(this.f24677j);
        } else {
            if (iX0 != 17) {
                throw new JsonDataException("Expected a string but was " + d0() + " at path " + getPath());
            }
            strA0 = this.f24675h.A0(this.f24678k);
        }
        this.f24676i = 0;
        int[] iArr = this.f24663d;
        int i10 = this.f24660a - 1;
        iArr[i10] = iArr[i10] + 1;
        return strA0;
    }

    @Override // Y6.k
    public void a() throws EOFException, JsonEncodingException {
        int iX0 = this.f24676i;
        if (iX0 == 0) {
            iX0 = x0();
        }
        if (iX0 == 3) {
            n0(1);
            this.f24663d[this.f24660a - 1] = 0;
            this.f24676i = 0;
        } else {
            throw new JsonDataException("Expected BEGIN_ARRAY but was " + d0() + " at path " + getPath());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws EOFException {
        this.f24676i = 0;
        this.f24661b[0] = 8;
        this.f24660a = 1;
        this.f24675h.clear();
        this.f24674g.close();
    }

    @Override // Y6.k
    public k.c d0() throws EOFException, JsonEncodingException {
        int iX0 = this.f24676i;
        if (iX0 == 0) {
            iX0 = x0();
        }
        switch (iX0) {
            case 1:
                return k.c.BEGIN_OBJECT;
            case 2:
                return k.c.END_OBJECT;
            case 3:
                return k.c.BEGIN_ARRAY;
            case 4:
                return k.c.END_ARRAY;
            case 5:
            case 6:
                return k.c.BOOLEAN;
            case 7:
                return k.c.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return k.c.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return k.c.NAME;
            case 16:
            case 17:
                return k.c.NUMBER;
            case 18:
                return k.c.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    @Override // Y6.k
    public k f0() {
        return new m(this);
    }

    @Override // Y6.k
    public void g() throws EOFException, JsonEncodingException {
        int iX0 = this.f24676i;
        if (iX0 == 0) {
            iX0 = x0();
        }
        if (iX0 == 1) {
            n0(3);
            this.f24676i = 0;
            return;
        }
        throw new JsonDataException("Expected BEGIN_OBJECT but was " + d0() + " at path " + getPath());
    }

    @Override // Y6.k
    public void h() throws EOFException, JsonEncodingException {
        int iX0 = this.f24676i;
        if (iX0 == 0) {
            iX0 = x0();
        }
        if (iX0 != 4) {
            throw new JsonDataException("Expected END_ARRAY but was " + d0() + " at path " + getPath());
        }
        int i10 = this.f24660a;
        this.f24660a = i10 - 1;
        int[] iArr = this.f24663d;
        int i11 = i10 - 2;
        iArr[i11] = iArr[i11] + 1;
        this.f24676i = 0;
    }

    @Override // Y6.k
    public void j() throws EOFException, JsonEncodingException {
        int iX0 = this.f24676i;
        if (iX0 == 0) {
            iX0 = x0();
        }
        if (iX0 != 2) {
            throw new JsonDataException("Expected END_OBJECT but was " + d0() + " at path " + getPath());
        }
        int i10 = this.f24660a;
        int i11 = i10 - 1;
        this.f24660a = i11;
        this.f24662c[i11] = null;
        int[] iArr = this.f24663d;
        int i12 = i10 - 2;
        iArr[i12] = iArr[i12] + 1;
        this.f24676i = 0;
    }

    @Override // Y6.k
    public void m0() {
        if (s()) {
            this.f24679l = S();
            this.f24676i = 11;
        }
    }

    @Override // Y6.k
    public int p0(k.b bVar) throws EOFException, JsonEncodingException {
        int iX0 = this.f24676i;
        if (iX0 == 0) {
            iX0 = x0();
        }
        if (iX0 < 12 || iX0 > 15) {
            return -1;
        }
        if (iX0 == 15) {
            return y0(this.f24679l, bVar);
        }
        int iE = this.f24674g.E(bVar.f24668b);
        if (iE != -1) {
            this.f24676i = 0;
            this.f24662c[this.f24660a - 1] = bVar.f24667a[iE];
            return iE;
        }
        String str = this.f24662c[this.f24660a - 1];
        String strS = S();
        int iY0 = y0(strS, bVar);
        if (iY0 == -1) {
            this.f24676i = 15;
            this.f24679l = strS;
            this.f24662c[this.f24660a - 1] = str;
        }
        return iY0;
    }

    @Override // Y6.k
    public int q0(k.b bVar) throws EOFException, JsonEncodingException {
        int iX0 = this.f24676i;
        if (iX0 == 0) {
            iX0 = x0();
        }
        if (iX0 < 8 || iX0 > 11) {
            return -1;
        }
        if (iX0 == 11) {
            return z0(this.f24679l, bVar);
        }
        int iE = this.f24674g.E(bVar.f24668b);
        if (iE != -1) {
            this.f24676i = 0;
            int[] iArr = this.f24663d;
            int i10 = this.f24660a - 1;
            iArr[i10] = iArr[i10] + 1;
            return iE;
        }
        String strY = Y();
        int iZ0 = z0(strY, bVar);
        if (iZ0 == -1) {
            this.f24676i = 11;
            this.f24679l = strY;
            this.f24663d[this.f24660a - 1] = r0[r1] - 1;
        }
        return iZ0;
    }

    @Override // Y6.k
    public boolean s() throws EOFException, JsonEncodingException {
        int iX0 = this.f24676i;
        if (iX0 == 0) {
            iX0 = x0();
        }
        return (iX0 == 2 || iX0 == 4 || iX0 == 18) ? false : true;
    }

    @Override // Y6.k
    public void t0() throws EOFException, JsonEncodingException {
        if (this.f24665f) {
            k.c cVarD0 = d0();
            S();
            throw new JsonDataException("Cannot skip unexpected " + cVarD0 + " at " + getPath());
        }
        int iX0 = this.f24676i;
        if (iX0 == 0) {
            iX0 = x0();
        }
        if (iX0 == 14) {
            K0();
        } else if (iX0 == 13) {
            H0(f24670n);
        } else if (iX0 == 12) {
            H0(f24669m);
        } else if (iX0 != 15) {
            throw new JsonDataException("Expected a name but was " + d0() + " at path " + getPath());
        }
        this.f24676i = 0;
        this.f24662c[this.f24660a - 1] = "null";
    }

    public String toString() {
        return "JsonReader(" + this.f24674g + ")";
    }

    @Override // Y6.k
    public void u0() throws EOFException, JsonEncodingException {
        if (this.f24665f) {
            throw new JsonDataException("Cannot skip unexpected " + d0() + " at " + getPath());
        }
        int i10 = 0;
        do {
            int iX0 = this.f24676i;
            if (iX0 == 0) {
                iX0 = x0();
            }
            if (iX0 == 3) {
                n0(1);
            } else if (iX0 == 1) {
                n0(3);
            } else {
                if (iX0 == 4) {
                    i10--;
                    if (i10 < 0) {
                        throw new JsonDataException("Expected a value but was " + d0() + " at path " + getPath());
                    }
                    this.f24660a--;
                } else if (iX0 == 2) {
                    i10--;
                    if (i10 < 0) {
                        throw new JsonDataException("Expected a value but was " + d0() + " at path " + getPath());
                    }
                    this.f24660a--;
                } else if (iX0 == 14 || iX0 == 10) {
                    K0();
                } else if (iX0 == 9 || iX0 == 13) {
                    H0(f24670n);
                } else if (iX0 == 8 || iX0 == 12) {
                    H0(f24669m);
                } else if (iX0 == 17) {
                    this.f24675h.d(this.f24678k);
                } else if (iX0 == 18) {
                    throw new JsonDataException("Expected a value but was " + d0() + " at path " + getPath());
                }
                this.f24676i = 0;
            }
            i10++;
            this.f24676i = 0;
        } while (i10 != 0);
        int[] iArr = this.f24663d;
        int i11 = this.f24660a;
        int i12 = i11 - 1;
        iArr[i12] = iArr[i12] + 1;
        this.f24662c[i11 - 1] = "null";
    }

    @Override // Y6.k
    public boolean y() throws EOFException, JsonEncodingException {
        int iX0 = this.f24676i;
        if (iX0 == 0) {
            iX0 = x0();
        }
        if (iX0 == 5) {
            this.f24676i = 0;
            int[] iArr = this.f24663d;
            int i10 = this.f24660a - 1;
            iArr[i10] = iArr[i10] + 1;
            return true;
        }
        if (iX0 == 6) {
            this.f24676i = 0;
            int[] iArr2 = this.f24663d;
            int i11 = this.f24660a - 1;
            iArr2[i11] = iArr2[i11] + 1;
            return false;
        }
        throw new JsonDataException("Expected a boolean but was " + d0() + " at path " + getPath());
    }

    m(m mVar) {
        super(mVar);
        this.f24676i = 0;
        InterfaceC5483g interfaceC5483gPeek = mVar.f24674g.peek();
        this.f24674g = interfaceC5483gPeek;
        this.f24675h = interfaceC5483gPeek.b();
        this.f24676i = mVar.f24676i;
        this.f24677j = mVar.f24677j;
        this.f24678k = mVar.f24678k;
        this.f24679l = mVar.f24679l;
        try {
            interfaceC5483gPeek.g0(mVar.f24675h.D0());
        } catch (IOException unused) {
            throw new AssertionError();
        }
    }
}
