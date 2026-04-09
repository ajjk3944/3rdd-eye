package bj;

/* renamed from: bj.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4124g {

    /* renamed from: a, reason: collision with root package name */
    public static final C4124g f33443a;

    /* renamed from: b, reason: collision with root package name */
    public static final char[] f33444b;

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f33445c;

    static {
        C4124g c4124g = new C4124g();
        f33443a = c4124g;
        f33444b = new char[117];
        f33445c = new byte[126];
        c4124g.f();
        c4124g.e();
    }

    private C4124g() {
    }

    private final void a(char c10, char c11) {
        b(c10, c11);
    }

    private final void b(int i10, char c10) {
        if (c10 != 'u') {
            f33444b[c10] = (char) i10;
        }
    }

    private final void c(char c10, byte b10) {
        d(c10, b10);
    }

    private final void d(int i10, byte b10) {
        f33445c[i10] = b10;
    }

    private final void e() {
        for (int i10 = 0; i10 < 33; i10++) {
            d(i10, (byte) 127);
        }
        d(9, (byte) 3);
        d(10, (byte) 3);
        d(13, (byte) 3);
        d(32, (byte) 3);
        c(',', (byte) 4);
        c(':', (byte) 5);
        c('{', (byte) 6);
        c('}', (byte) 7);
        c('[', (byte) 8);
        c(']', (byte) 9);
        c('\"', (byte) 1);
        c('\\', (byte) 2);
    }

    private final void f() {
        for (int i10 = 0; i10 < 32; i10++) {
            b(i10, 'u');
        }
        b(8, 'b');
        b(9, 't');
        b(10, 'n');
        b(12, 'f');
        b(13, 'r');
        a('/', '/');
        a('\"', '\"');
        a('\\', '\\');
    }
}
