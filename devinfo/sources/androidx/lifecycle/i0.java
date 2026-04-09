package androidx.lifecycle;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final m0 f1146a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1147b;

    /* renamed from: c, reason: collision with root package name */
    public int f1148c = -1;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l0 f1149d;

    public i0(l0 l0Var, m0 m0Var) {
        this.f1149d = l0Var;
        this.f1146a = m0Var;
    }

    public final void a(boolean z3) {
        if (z3 == this.f1147b) {
            return;
        }
        this.f1147b = z3;
        int i4 = z3 ? 1 : -1;
        l0 l0Var = this.f1149d;
        int i10 = l0Var.f1163c;
        l0Var.f1163c = i4 + i10;
        if (!l0Var.f1164d) {
            l0Var.f1164d = true;
            while (true) {
                try {
                    int i11 = l0Var.f1163c;
                    if (i10 == i11) {
                        break;
                    }
                    boolean z10 = i10 == 0 && i11 > 0;
                    boolean z11 = i10 > 0 && i11 == 0;
                    if (z10) {
                        l0Var.f();
                    } else if (z11) {
                        l0Var.g();
                    }
                    i10 = i11;
                } catch (Throwable th2) {
                    l0Var.f1164d = false;
                    throw th2;
                }
            }
            l0Var.f1164d = false;
        }
        if (this.f1147b) {
            l0Var.c(this);
        }
    }

    public boolean d(a0 a0Var) {
        return false;
    }

    public abstract boolean f();

    public void b() {
    }
}
