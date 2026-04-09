package E5;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;

/* compiled from: JsonWriter.java */
/* loaded from: classes2.dex */
public class c implements Closeable, Flushable {

    /* renamed from: j, reason: collision with root package name */
    public static final String[] f1437j = new String[128];

    /* renamed from: k, reason: collision with root package name */
    public static final String[] f1438k;

    /* renamed from: b, reason: collision with root package name */
    public final Writer f1439b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f1440c = new int[32];

    /* renamed from: d, reason: collision with root package name */
    public int f1441d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final String f1442e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1443f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1444g;

    /* renamed from: h, reason: collision with root package name */
    public String f1445h;
    public boolean i;

    static {
        for (int i = 0; i <= 31; i++) {
            f1437j[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = f1437j;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f1438k = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public c(Writer writer) {
        F(6);
        this.f1442e = StringUtils.PROCESS_POSTFIX_DELIMITER;
        this.i = true;
        if (writer == null) {
            throw new NullPointerException("out == null");
        }
        this.f1439b = writer;
    }

    public c B() throws IOException {
        if (this.f1445h != null) {
            if (!this.i) {
                this.f1445h = null;
                return this;
            }
            u0();
        }
        a();
        this.f1439b.write("null");
        return this;
    }

    public final int D() {
        int i = this.f1441d;
        if (i != 0) {
            return this.f1440c[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void F(int i) {
        int i10 = this.f1441d;
        int[] iArr = this.f1440c;
        if (i10 == iArr.length) {
            int[] iArr2 = new int[i10 * 2];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            this.f1440c = iArr2;
        }
        int[] iArr3 = this.f1440c;
        int i11 = this.f1441d;
        this.f1441d = i11 + 1;
        iArr3[i11] = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void W(java.lang.String r9) throws java.io.IOException {
        /*
            r8 = this;
            boolean r0 = r8.f1444g
            if (r0 == 0) goto L7
            java.lang.String[] r0 = E5.c.f1438k
            goto L9
        L7:
            java.lang.String[] r0 = E5.c.f1437j
        L9:
            java.io.Writer r1 = r8.f1439b
            java.lang.String r2 = "\""
            r1.write(r2)
            int r3 = r9.length()
            r4 = 0
            r5 = r4
        L16:
            if (r4 >= r3) goto L41
            char r6 = r9.charAt(r4)
            r7 = 128(0x80, float:1.8E-43)
            if (r6 >= r7) goto L25
            r6 = r0[r6]
            if (r6 != 0) goto L32
            goto L3e
        L25:
            r7 = 8232(0x2028, float:1.1535E-41)
            if (r6 != r7) goto L2c
            java.lang.String r6 = "\\u2028"
            goto L32
        L2c:
            r7 = 8233(0x2029, float:1.1537E-41)
            if (r6 != r7) goto L3e
            java.lang.String r6 = "\\u2029"
        L32:
            if (r5 >= r4) goto L39
            int r7 = r4 - r5
            r1.write(r9, r5, r7)
        L39:
            r1.write(r6)
            int r5 = r4 + 1
        L3e:
            int r4 = r4 + 1
            goto L16
        L41:
            if (r5 >= r3) goto L47
            int r3 = r3 - r5
            r1.write(r9, r5, r3)
        L47:
            r1.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: E5.c.W(java.lang.String):void");
    }

    public final void a() throws IOException {
        int iD = D();
        if (iD == 1) {
            this.f1440c[this.f1441d - 1] = 2;
            A();
            return;
        }
        Writer writer = this.f1439b;
        if (iD == 2) {
            writer.append(',');
            A();
        } else {
            if (iD == 4) {
                writer.append((CharSequence) this.f1442e);
                this.f1440c[this.f1441d - 1] = 5;
                return;
            }
            if (iD != 6) {
                if (iD != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (!this.f1443f) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            this.f1440c[this.f1441d - 1] = 7;
        }
    }

    public void c() throws IOException {
        u0();
        a();
        F(1);
        this.f1439b.write("[");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f1439b.close();
        int i = this.f1441d;
        if (i > 1 || (i == 1 && this.f1440c[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f1441d = 0;
    }

    public void d() throws IOException {
        u0();
        a();
        F(3);
        this.f1439b.write("{");
    }

    public final void e(int i, int i10, String str) throws IOException {
        int iD = D();
        if (iD != i10 && iD != i) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f1445h != null) {
            throw new IllegalStateException("Dangling name: " + this.f1445h);
        }
        this.f1441d--;
        if (iD == i10) {
            A();
        }
        this.f1439b.write(str);
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.f1441d == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f1439b.flush();
    }

    public void k() throws IOException {
        e(1, 2, "]");
    }

    public void k0(long j4) throws IOException {
        u0();
        a();
        this.f1439b.write(Long.toString(j4));
    }

    public void l() throws IOException {
        e(3, 5, "}");
    }

    public void m0(Number number) throws IOException {
        if (number == null) {
            B();
            return;
        }
        u0();
        String string = number.toString();
        if (this.f1443f || !(string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN"))) {
            a();
            this.f1439b.append((CharSequence) string);
        } else {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
        }
    }

    public void n(String str) throws IOException {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.f1445h != null) {
            throw new IllegalStateException();
        }
        if (this.f1441d == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f1445h = str;
    }

    public void p0(String str) throws IOException {
        if (str == null) {
            B();
            return;
        }
        u0();
        a();
        W(str);
    }

    public void q0(boolean z10) throws IOException {
        u0();
        a();
        this.f1439b.write(z10 ? "true" : "false");
    }

    public final void u0() throws IOException {
        if (this.f1445h != null) {
            int iD = D();
            if (iD == 5) {
                this.f1439b.write(44);
            } else if (iD != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            A();
            this.f1440c[this.f1441d - 1] = 4;
            W(this.f1445h);
            this.f1445h = null;
        }
    }

    public final void A() throws IOException {
    }
}
