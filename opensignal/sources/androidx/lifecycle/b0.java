package androidx.lifecycle;

/* loaded from: classes.dex */
public abstract class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final e0 f1477a;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1478d;

    /* renamed from: g, reason: collision with root package name */
    public int f1479g = -1;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ c0 f1480r;

    public b0(c0 c0Var, e0 e0Var) {
        this.f1480r = c0Var;
        this.f1477a = e0Var;
    }

    public final void a(boolean z10) {
        if (z10 == this.f1478d) {
            return;
        }
        this.f1478d = z10;
        int i10 = z10 ? 1 : -1;
        c0 c0Var = this.f1480r;
        int i11 = c0Var.f1486c;
        c0Var.f1486c = i10 + i11;
        if (!c0Var.f1487d) {
            c0Var.f1487d = true;
            while (true) {
                try {
                    int i12 = c0Var.f1486c;
                    if (i11 == i12) {
                        break;
                    }
                    boolean z11 = i11 == 0 && i12 > 0;
                    boolean z12 = i11 > 0 && i12 == 0;
                    if (z11) {
                        c0Var.f();
                    } else if (z12) {
                        c0Var.g();
                    }
                    i11 = i12;
                } catch (Throwable th2) {
                    c0Var.f1487d = false;
                    throw th2;
                }
            }
            c0Var.f1487d = false;
        }
        if (this.f1478d) {
            c0Var.c(this);
        }
    }

    public void c() {
    }

    public boolean d(v vVar) {
        return false;
    }

    public abstract boolean e();
}
