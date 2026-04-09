package t2;

import N7.G8;
import ia.s;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: JsonReader.java */
/* renamed from: t2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5601b implements Closeable {

    /* renamed from: f, reason: collision with root package name */
    public static final String[] f46383f = new String[128];

    /* renamed from: b, reason: collision with root package name */
    public int f46384b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f46385c;

    /* renamed from: d, reason: collision with root package name */
    public String[] f46386d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f46387e;

    /* compiled from: JsonReader.java */
    /* renamed from: t2.b$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String[] f46388a;

        /* renamed from: b, reason: collision with root package name */
        public final s f46389b;

        public a(String[] strArr, s sVar) {
            this.f46388a = strArr;
            this.f46389b = sVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x003a A[Catch: IOException -> 0x006b, TryCatch #0 {IOException -> 0x006b, blocks: (B:2:0x0000, B:3:0x000a, B:5:0x000d, B:7:0x001e, B:9:0x0026, B:21:0x0042, B:19:0x003a, B:20:0x003d, B:23:0x0047, B:24:0x004a, B:25:0x005b), top: B:30:0x0000 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static t2.AbstractC5601b.a a(java.lang.String... r12) {
            /*
                int r0 = r12.length     // Catch: java.io.IOException -> L6b
                ia.h[] r0 = new ia.h[r0]     // Catch: java.io.IOException -> L6b
                ia.d r1 = new ia.d     // Catch: java.io.IOException -> L6b
                r1.<init>()     // Catch: java.io.IOException -> L6b
                r2 = 0
                r3 = r2
            La:
                int r4 = r12.length     // Catch: java.io.IOException -> L6b
                if (r3 >= r4) goto L5b
                r4 = r12[r3]     // Catch: java.io.IOException -> L6b
                java.lang.String[] r5 = t2.AbstractC5601b.f46383f     // Catch: java.io.IOException -> L6b
                r6 = 34
                r1.C0(r6)     // Catch: java.io.IOException -> L6b
                int r7 = r4.length()     // Catch: java.io.IOException -> L6b
                r8 = r2
                r9 = r8
            L1c:
                if (r8 >= r7) goto L45
                char r10 = r4.charAt(r8)     // Catch: java.io.IOException -> L6b
                r11 = 128(0x80, float:1.8E-43)
                if (r10 >= r11) goto L2b
                r10 = r5[r10]     // Catch: java.io.IOException -> L6b
                if (r10 != 0) goto L38
                goto L42
            L2b:
                r11 = 8232(0x2028, float:1.1535E-41)
                if (r10 != r11) goto L32
                java.lang.String r10 = "\\u2028"
                goto L38
            L32:
                r11 = 8233(0x2029, float:1.1537E-41)
                if (r10 != r11) goto L42
                java.lang.String r10 = "\\u2029"
            L38:
                if (r9 >= r8) goto L3d
                r1.Q0(r9, r8, r4)     // Catch: java.io.IOException -> L6b
            L3d:
                r1.R0(r10)     // Catch: java.io.IOException -> L6b
                int r9 = r8 + 1
            L42:
                int r8 = r8 + 1
                goto L1c
            L45:
                if (r9 >= r7) goto L4a
                r1.Q0(r9, r7, r4)     // Catch: java.io.IOException -> L6b
            L4a:
                r1.C0(r6)     // Catch: java.io.IOException -> L6b
                r1.readByte()     // Catch: java.io.IOException -> L6b
                long r4 = r1.f38643c     // Catch: java.io.IOException -> L6b
                ia.h r4 = r1.g(r4)     // Catch: java.io.IOException -> L6b
                r0[r3] = r4     // Catch: java.io.IOException -> L6b
                int r3 = r3 + 1
                goto La
            L5b:
                t2.b$a r1 = new t2.b$a     // Catch: java.io.IOException -> L6b
                java.lang.Object r12 = r12.clone()     // Catch: java.io.IOException -> L6b
                java.lang.String[] r12 = (java.lang.String[]) r12     // Catch: java.io.IOException -> L6b
                ia.s r0 = ia.s.a.b(r0)     // Catch: java.io.IOException -> L6b
                r1.<init>(r12, r0)     // Catch: java.io.IOException -> L6b
                return r1
            L6b:
                r12 = move-exception
                java.lang.AssertionError r0 = new java.lang.AssertionError
                r0.<init>(r12)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: t2.AbstractC5601b.a.a(java.lang.String[]):t2.b$a");
        }
    }

    /* compiled from: JsonReader.java */
    /* renamed from: t2.b$b, reason: collision with other inner class name */
    public enum EnumC0535b {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    static {
        for (int i = 0; i <= 31; i++) {
            f46383f[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = f46383f;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public abstract double A() throws IOException;

    public abstract int B() throws IOException;

    public abstract String D() throws IOException;

    public abstract EnumC0535b F() throws IOException;

    public final void W(int i) {
        int i10 = this.f46384b;
        int[] iArr = this.f46385c;
        if (i10 == iArr.length) {
            if (i10 == 256) {
                throw new I1.c("Nesting too deep at " + k());
            }
            this.f46385c = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f46386d;
            this.f46386d = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f46387e;
            this.f46387e = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f46385c;
        int i11 = this.f46384b;
        this.f46384b = i11 + 1;
        iArr3[i11] = i;
    }

    public abstract void a() throws IOException;

    public abstract void c() throws IOException;

    public abstract void d() throws IOException;

    public abstract void e() throws IOException;

    public final String k() {
        int i = this.f46384b;
        int[] iArr = this.f46385c;
        String[] strArr = this.f46386d;
        int[] iArr2 = this.f46387e;
        StringBuilder sb = new StringBuilder("$");
        for (int i10 = 0; i10 < i; i10++) {
            int i11 = iArr[i10];
            if (i11 == 1 || i11 == 2) {
                sb.append('[');
                sb.append(iArr2[i10]);
                sb.append(']');
            } else if (i11 == 3 || i11 == 4 || i11 == 5) {
                sb.append('.');
                String str = strArr[i10];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    public abstract int k0(a aVar) throws IOException;

    public abstract boolean l() throws IOException;

    public abstract void m0() throws IOException;

    public abstract boolean n() throws IOException;

    public abstract void p0() throws IOException;

    public final void q0(String str) throws C5600a {
        StringBuilder sbV = G8.v(str, " at path ");
        sbV.append(k());
        throw new C5600a(sbV.toString());
    }
}
