package androidx.datastore.preferences.protobuf;

import java.util.List;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public int f1300a;

    /* renamed from: d, reason: collision with root package name */
    public Object f1301d;

    public j(int i10) {
        this.f1300a = i10;
    }

    public abstract long A();

    public abstract boolean B(int i10);

    public void C() {
        int iY;
        do {
            iY = y();
            if (iY == 0) {
                return;
            }
            int i10 = this.f1300a;
            if (i10 >= 100) {
                throw new e0("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
            this.f1300a = i10 + 1;
            this.f1300a--;
        } while (B(iY));
    }

    public abstract void a(int i10);

    public abstract int b();

    public abstract boolean c();

    public abstract void d(u3.u0 u0Var);

    public abstract u3.h1 f(u3.h1 h1Var, List list);

    public abstract void h(int i10);

    public abstract int i(int i10);

    public abstract boolean j();

    public abstract g k();

    public abstract double l();

    public abstract int m();

    public abstract int n();

    public abstract long o();

    public abstract float p();

    public abstract int q();

    public abstract long r();

    public abstract int s();

    public abstract long t();

    public abstract int u();

    public abstract long v();

    public abstract String w();

    public abstract String x();

    public abstract int y();

    public abstract int z();

    public void e() {
    }

    public om.f g(u3.u0 u0Var, om.f fVar) {
        return fVar;
    }
}
