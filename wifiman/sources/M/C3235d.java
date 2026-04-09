package M;

import androidx.compose.ui.platform.w1;
import y0.C8593n;
import y0.C8604y;

/* renamed from: M.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3235d {

    /* renamed from: a, reason: collision with root package name */
    private final w1 f12200a;

    /* renamed from: b, reason: collision with root package name */
    private int f12201b;

    /* renamed from: c, reason: collision with root package name */
    private C8604y f12202c;

    public C3235d(w1 w1Var) {
        this.f12200a = w1Var;
    }

    public final int a() {
        return this.f12201b;
    }

    public final boolean b(C8604y c8604y, C8604y c8604y2) {
        return t.i(this.f12200a, c8604y, c8604y2);
    }

    public final boolean c(C8604y c8604y, C8604y c8604y2) {
        return c8604y2.o() - c8604y.o() < this.f12200a.a();
    }

    public final void d(C8593n c8593n) {
        C8604y c8604y = this.f12202c;
        C8604y c8604y2 = (C8604y) c8593n.c().get(0);
        if (c8604y != null && c(c8604y, c8604y2) && b(c8604y, c8604y2)) {
            this.f12201b++;
        } else {
            this.f12201b = 1;
        }
        this.f12202c = c8604y2;
    }
}
