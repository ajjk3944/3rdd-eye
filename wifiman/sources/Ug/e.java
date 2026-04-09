package Ug;

import java.io.PrintStream;

/* loaded from: classes4.dex */
public class e extends PrintStream {

    /* renamed from: a, reason: collision with root package name */
    private static e f22463a = null;

    /* renamed from: b, reason: collision with root package name */
    public static int f22464b = 1;

    public e(PrintStream printStream) {
        super(printStream);
    }

    public static e a() {
        if (f22463a == null) {
            g(System.err);
        }
        return f22463a;
    }

    public static void g(PrintStream printStream) {
        f22463a = new e(printStream);
    }

    public static void h(int i10) {
        f22464b = i10;
    }
}
