package F;

import L0.C3174d;

/* loaded from: classes.dex */
public abstract class y0 {

    /* renamed from: a, reason: collision with root package name */
    private static final R0.H f5637a = new x0(R0.H.f19391a.a(), 0, 0);

    public static final R0.a0 c(R0.c0 c0Var, C3174d c3174d) {
        R0.a0 a0VarA = c0Var.a(c3174d);
        f(a0VarA, c3174d.length(), 0, 2, null);
        return new R0.a0(a0VarA.b(), new x0(a0VarA.a(), c3174d.length(), a0VarA.b().length()));
    }

    public static final R0.H d() {
        return f5637a;
    }

    public static final void e(R0.a0 a0Var, int i10, int i11) {
        int length = a0Var.b().length();
        int iMin = Math.min(i10, i11);
        for (int i12 = 0; i12 < iMin; i12++) {
            g(a0Var.a().b(i12), length, i12);
        }
        g(a0Var.a().b(i10), length, i10);
        int iMin2 = Math.min(length, i11);
        for (int i13 = 0; i13 < iMin2; i13++) {
            h(a0Var.a().a(i13), i10, i13);
        }
        h(a0Var.a().a(length), i10, length);
    }

    public static /* synthetic */ void f(R0.a0 a0Var, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 100;
        }
        e(a0Var, i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(int i10, int i11, int i12) {
        if (i10 < 0 || i10 > i11) {
            throw new IllegalStateException(("OffsetMapping.originalToTransformed returned invalid mapping: " + i12 + " -> " + i10 + " is not in range of transformed text [0, " + i11 + ']').toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(int i10, int i11, int i12) {
        if (i10 < 0 || i10 > i11) {
            throw new IllegalStateException(("OffsetMapping.transformedToOriginal returned invalid mapping: " + i12 + " -> " + i10 + " is not in range of original text [0, " + i11 + ']').toString());
        }
    }
}
