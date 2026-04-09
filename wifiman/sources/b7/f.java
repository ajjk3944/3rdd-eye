package b7;

import com.tickaroo.tikxml.XmlDataException;
import ej.C5481e;
import ej.InterfaceC5483g;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;

/* loaded from: classes3.dex */
public class f implements Closeable {

    /* renamed from: h, reason: collision with root package name */
    private static final ej.h f32975h = ej.h.j(" >/=\n");

    /* renamed from: i, reason: collision with root package name */
    private static final ej.h f32976i = ej.h.j("]]>");

    /* renamed from: d, reason: collision with root package name */
    private int[] f32980d;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC5483g f32982f;

    /* renamed from: g, reason: collision with root package name */
    private final C5481e f32983g;

    /* renamed from: a, reason: collision with root package name */
    private int f32977a = 0;

    /* renamed from: b, reason: collision with root package name */
    private String[] f32978b = new String[32];

    /* renamed from: c, reason: collision with root package name */
    private int[] f32979c = new int[32];

    /* renamed from: e, reason: collision with root package name */
    private int f32981e = 1;

    public enum a {
        ELEMENT_BEGIN,
        ELEMENT_NAME,
        ELEMENT_END,
        ATTRIBUTE_NAME,
        ATTRIBUTE_VALUE,
        ELEMENT_TEXT_CONTENT,
        END_OF_DOCUMENT
    }

    private f(InterfaceC5483g interfaceC5483g) {
        int[] iArr = new int[32];
        this.f32980d = iArr;
        iArr[0] = 0;
        if (interfaceC5483g == null) {
            throw new NullPointerException("source == null");
        }
        this.f32982f = interfaceC5483g;
        this.f32983g = interfaceC5483g.k();
    }

    private boolean C() {
        return j(9L) && this.f32983g.f0(0L) == 60 && this.f32983g.f0(1L) == 33 && this.f32983g.f0(2L) == 91 && this.f32983g.f0(3L) == 67 && this.f32983g.f0(4L) == 68 && this.f32983g.f0(5L) == 65 && this.f32983g.f0(6L) == 84 && this.f32983g.f0(7L) == 65 && this.f32983g.f0(8L) == 91;
    }

    private boolean J(int i10) {
        if (i10 == 32 || i10 == 47) {
            return false;
        }
        switch (i10) {
            case MqttConnectOptions.KEEP_ALIVE_INTERVAL_DEFAULT /* 60 */:
            case 61:
            case 62:
                return false;
            default:
                return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0024, code lost:
    
        r6.f32983g.d(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        if (r3 != 60) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0032, code lost:
    
        if (C() != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0034, code lost:
    
        r1 = r6.f32983g.f0(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
    
        if (r1 != 33) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0046, code lost:
    
        if (j(4) == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0048, code lost:
    
        r6.f32983g.readByte();
        r6.f32983g.readByte();
        r6.f32983g.readByte();
        r6.f32983g.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
    
        if (s0("-->") == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
    
        r6.f32983g.readByte();
        r6.f32983g.readByte();
        r6.f32983g.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007b, code lost:
    
        throw t0("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007e, code lost:
    
        if (r1 != 63) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0080, code lost:
    
        r6.f32983g.readByte();
        r6.f32983g.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0090, code lost:
    
        if (s0("?>") == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0092, code lost:
    
        r6.f32983g.readByte();
        r6.f32983g.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a5, code lost:
    
        throw t0("Unterminated xml declaration or processing instruction \"<?\"");
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a6, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int T(boolean r7) throws java.io.IOException {
        /*
            r6 = this;
            r0 = 0
        L1:
            r1 = r0
        L2:
            int r2 = r1 + 1
            long r3 = (long) r2
            boolean r3 = r6.j(r3)
            if (r3 == 0) goto Laa
            ej.e r3 = r6.f32983g
            long r4 = (long) r1
            byte r3 = r3.f0(r4)
            r4 = 10
            if (r3 == r4) goto La7
            r4 = 32
            if (r3 == r4) goto La7
            r4 = 13
            if (r3 == r4) goto La7
            r4 = 9
            if (r3 != r4) goto L24
            goto La7
        L24:
            ej.e r2 = r6.f32983g
            long r4 = (long) r1
            r2.d(r4)
            r1 = 60
            if (r3 != r1) goto La6
            boolean r1 = r6.C()
            if (r1 != 0) goto La6
            ej.e r1 = r6.f32983g
            r4 = 1
            byte r1 = r1.f0(r4)
            r2 = 33
            if (r1 != r2) goto L7c
            r4 = 4
            boolean r2 = r6.j(r4)
            if (r2 == 0) goto L7c
            ej.e r1 = r6.f32983g
            r1.readByte()
            ej.e r1 = r6.f32983g
            r1.readByte()
            ej.e r1 = r6.f32983g
            r1.readByte()
            ej.e r1 = r6.f32983g
            r1.readByte()
            java.lang.String r1 = "-->"
            boolean r1 = r6.s0(r1)
            if (r1 == 0) goto L74
            ej.e r1 = r6.f32983g
            r1.readByte()
            ej.e r1 = r6.f32983g
            r1.readByte()
            ej.e r1 = r6.f32983g
            r1.readByte()
            goto L1
        L74:
            java.lang.String r7 = "Unterminated comment"
            java.io.IOException r7 = r6.t0(r7)
            throw r7
        L7c:
            r2 = 63
            if (r1 != r2) goto La6
            ej.e r1 = r6.f32983g
            r1.readByte()
            ej.e r1 = r6.f32983g
            r1.readByte()
            java.lang.String r1 = "?>"
            boolean r1 = r6.s0(r1)
            if (r1 == 0) goto L9e
            ej.e r1 = r6.f32983g
            r1.readByte()
            ej.e r1 = r6.f32983g
            r1.readByte()
            goto L1
        L9e:
            java.lang.String r7 = "Unterminated xml declaration or processing instruction \"<?\""
            java.io.IOException r7 = r6.t0(r7)
            throw r7
        La6:
            return r3
        La7:
            r1 = r2
            goto L2
        Laa:
            if (r7 != 0) goto Lae
            r7 = -1
            return r7
        Lae:
            java.io.EOFException r7 = new java.io.EOFException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unexpected end of input at path "
            r0.append(r1)
            java.lang.String r1 = r6.getPath()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: b7.f.T(boolean):int");
    }

    private String b0() {
        long jM = this.f32982f.M(f32975h);
        return jM != -1 ? this.f32983g.A0(jM) : this.f32983g.z0();
    }

    public static f d0(InterfaceC5483g interfaceC5483g) {
        return new f(interfaceC5483g);
    }

    private int g() throws IOException {
        int[] iArr = this.f32980d;
        int i10 = this.f32981e;
        int i11 = iArr[i10 - 1];
        if (i11 == 3) {
            if (!J((char) T(true))) {
                throw t0("Expected xml element name (literal expected)");
            }
            this.f32977a = 5;
            return 5;
        }
        if (i11 == 4) {
            int iT = T(true);
            if (J(iT)) {
                this.f32977a = 8;
                return 8;
            }
            if (iT == 47) {
                if (!j(2L) || this.f32983g.f0(1L) != 62) {
                    throw t0("Expected closing />");
                }
                m0();
                this.f32983g.readByte();
                this.f32983g.readByte();
                this.f32977a = 2;
                return 2;
            }
            if (iT == 61) {
                this.f32983g.readByte();
                int iT2 = T(true);
                if (iT2 == 34) {
                    this.f32983g.readByte();
                    this.f32977a = 6;
                    return 6;
                }
                if (iT2 != 39) {
                    throw t0("Expected double quote (\") or single quote (') while reading xml elements attribute");
                }
                this.f32983g.readByte();
                this.f32977a = 7;
                return 7;
            }
            if (iT != 62) {
                throw t0("Unexpected character '" + ((char) iT) + "' while trying to read xml elements attribute");
            }
            m0();
            this.f32980d[this.f32981e - 1] = 5;
            this.f32983g.readByte();
            if (T(true) != 60) {
                this.f32977a = 3;
                return 3;
            }
            if (C()) {
                this.f32983g.d(9L);
                this.f32977a = 9;
                return 9;
            }
        } else if (i11 == 5) {
            if (T(true) != 60) {
                this.f32977a = 3;
                return 3;
            }
            if (C()) {
                this.f32983g.d(9L);
                this.f32977a = 9;
                return 9;
            }
        } else if (i11 == 0) {
            iArr[i10 - 1] = 1;
        } else if (i11 == 1) {
            if (T(false) == -1) {
                this.f32977a = 4;
                return 4;
            }
        } else if (i11 == 6) {
            throw new IllegalStateException("XmlReader is closed");
        }
        int iT3 = T(true);
        if (iT3 == 34) {
            this.f32983g.readByte();
            this.f32977a = 6;
            return 6;
        }
        if (iT3 == 39) {
            this.f32983g.readByte();
            this.f32977a = 7;
            return 7;
        }
        if (iT3 != 60) {
            return 0;
        }
        this.f32983g.readByte();
        if (j(1L) && this.f32983g.f0(0L) == 47) {
            this.f32983g.readByte();
            String strB0 = b0();
            if (strB0 == null || !strB0.equals(this.f32978b[this.f32981e - 1])) {
                t0("Expected a closing element tag </" + this.f32978b[this.f32981e - 1] + "> but found </" + strB0 + ">");
            } else {
                if (T(false) == 62) {
                    this.f32983g.readByte();
                    this.f32977a = 2;
                    return 2;
                }
                t0("Missing closing '>' character in </" + this.f32978b[this.f32981e - 1]);
            }
        }
        this.f32977a = 1;
        return 1;
    }

    private boolean j(long j10) {
        return this.f32982f.request(j10);
    }

    private void m0() {
        int[] iArr = this.f32980d;
        int i10 = this.f32981e;
        iArr[i10 - 1] = 0;
        int i11 = i10 - 1;
        this.f32981e = i11;
        this.f32978b[i11] = null;
        int[] iArr2 = this.f32979c;
        int i12 = i10 - 2;
        iArr2[i12] = iArr2[i12] + 1;
    }

    private void n0(int i10) {
        int i11 = this.f32981e;
        int[] iArr = this.f32980d;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[i11 * 2];
            int[] iArr3 = new int[i11 * 2];
            String[] strArr = new String[i11 * 2];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            System.arraycopy(this.f32979c, 0, iArr3, 0, this.f32981e);
            System.arraycopy(this.f32978b, 0, strArr, 0, this.f32981e);
            this.f32980d = iArr2;
            this.f32979c = iArr3;
            this.f32978b = strArr;
        }
        int[] iArr4 = this.f32980d;
        int i12 = this.f32981e;
        this.f32981e = i12 + 1;
        iArr4[i12] = i10;
    }

    private char o0() throws IOException {
        int i10;
        if (!j(1L)) {
            throw t0("Unterminated escape sequence");
        }
        byte b10 = this.f32983g.readByte();
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
            return (char) b10;
        }
        if (!j(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + getPath());
        }
        char c10 = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            byte bF0 = this.f32983g.f0(i11);
            char c11 = (char) (c10 << 4);
            if (bF0 >= 48 && bF0 <= 57) {
                i10 = bF0 - 48;
            } else if (bF0 >= 97 && bF0 <= 102) {
                i10 = bF0 - 87;
            } else {
                if (bF0 < 65 || bF0 > 70) {
                    throw t0("\\u" + this.f32983g.A0(4L));
                }
                i10 = bF0 - 55;
            }
            c10 = (char) (c11 + i10);
        }
        this.f32983g.d(4L);
        return c10;
    }

    private void r0(Byte b10) throws IOException {
        while (true) {
            long jJ0 = this.f32982f.j0(b10.byteValue());
            if (jJ0 == -1) {
                throw t0("Unterminated string");
            }
            if (this.f32983g.f0(jJ0) != 92) {
                this.f32983g.d(jJ0 + 1);
                return;
            } else {
                this.f32983g.d(jJ0 + 1);
                o0();
            }
        }
    }

    private boolean s0(String str) throws EOFException {
        while (true) {
            if (!j(str.length())) {
                return false;
            }
            for (int i10 = 0; i10 < str.length(); i10++) {
                if (this.f32983g.f0(i10) != str.charAt(i10)) {
                    break;
                }
            }
            return true;
            this.f32983g.readByte();
        }
    }

    private IOException t0(String str) throws IOException {
        throw new IOException(str + " at path " + getPath());
    }

    private long y() throws EOFException {
        long jW = this.f32982f.W(f32976i);
        if (jW != -1) {
            return jW;
        }
        throw new EOFException("<![CDATA[ at " + getPath() + " has never been closed with ]]>");
    }

    public String P() throws IOException {
        int iG = this.f32977a;
        if (iG == 0) {
            iG = g();
        }
        if (iG == 8) {
            String strB0 = b0();
            this.f32977a = 0;
            this.f32978b[this.f32981e - 1] = strB0;
            return strB0;
        }
        throw t0("Expected xml element attribute name but was " + f0());
    }

    public String S() throws IOException {
        int iG = this.f32977a;
        if (iG == 0) {
            iG = g();
        }
        if (iG != 5) {
            throw t0("Expected XML Tag Element name, but have " + f0());
        }
        String strB0 = b0();
        this.f32977a = 0;
        this.f32978b[this.f32981e - 1] = strB0;
        n0(4);
        return strB0;
    }

    public String Y() throws IOException {
        int iG = this.f32977a;
        if (iG == 0) {
            iG = g();
        }
        if (iG == 3) {
            this.f32977a = 0;
            long jJ0 = this.f32982f.j0((byte) 60);
            if (jJ0 != -1) {
                return this.f32983g.A0(jJ0);
            }
            throw t0("Unterminated element text content. Expected </" + this.f32978b[this.f32981e - 1] + "> but haven't found");
        }
        if (iG == 9) {
            this.f32977a = 0;
            String strA0 = this.f32983g.A0(y());
            this.f32983g.d(3L);
            return strA0;
        }
        if (iG == 2) {
            return "";
        }
        throw new XmlDataException("Expected xml element text content but was " + f0() + " at path " + getPath());
    }

    public void a() throws IOException {
        int iG = this.f32977a;
        if (iG == 0) {
            iG = g();
        }
        if (iG == 1) {
            n0(3);
            this.f32977a = 0;
            return;
        }
        throw new XmlDataException("Expected " + a.ELEMENT_BEGIN + " but was " + f0() + " at path " + getPath());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws EOFException {
        this.f32977a = 0;
        this.f32983g.clear();
        this.f32982f.close();
    }

    public a f0() throws IOException {
        int iG = this.f32977a;
        if (iG == 0) {
            iG = g();
        }
        switch (iG) {
            case 1:
                return a.ELEMENT_BEGIN;
            case 2:
                return a.ELEMENT_END;
            case 3:
            case 9:
                return a.ELEMENT_TEXT_CONTENT;
            case 4:
                return a.END_OF_DOCUMENT;
            case 5:
                return a.ELEMENT_NAME;
            case 6:
            case 7:
                return a.ATTRIBUTE_VALUE;
            case 8:
                return a.ATTRIBUTE_NAME;
            default:
                throw new AssertionError("Unknown XmlToken: Peeked = " + iG);
        }
    }

    public String getPath() {
        return g.a(this.f32981e, this.f32980d, this.f32978b, this.f32979c);
    }

    public void h() throws IOException {
        int iG = this.f32977a;
        if (iG == 0) {
            iG = g();
        }
        if (iG == 2) {
            m0();
            this.f32977a = 0;
        } else {
            throw t0("Expected end of element but was " + f0());
        }
    }

    public boolean p() throws IOException {
        int iG = this.f32977a;
        if (iG == 0) {
            iG = g();
        }
        return iG == 8;
    }

    public void p0() throws IOException {
        P();
        q0();
    }

    public void q0() throws IOException {
        int iG = this.f32977a;
        if (iG == 0) {
            iG = g();
        }
        if (iG == 6 || iG == 7) {
            this.f32977a = 0;
            this.f32978b[this.f32981e - 1] = null;
            r0(Byte.valueOf(iG == 6 ? (byte) 34 : (byte) 39));
        } else {
            throw new XmlDataException("Expected xml element attribute value (in double quotes or single quotes) but was " + f0() + " at path " + getPath());
        }
    }

    public boolean s() throws IOException {
        int iG = this.f32977a;
        if (iG == 0) {
            iG = g();
        }
        return iG == 1;
    }

    public boolean v() throws IOException {
        int iG = this.f32977a;
        if (iG == 0) {
            iG = g();
        }
        return iG == 3 || iG == 9;
    }
}
