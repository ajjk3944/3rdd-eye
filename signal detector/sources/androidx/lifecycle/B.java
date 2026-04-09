package androidx.lifecycle;

/* loaded from: classes.dex */
public abstract class B {

    /* renamed from: a, reason: collision with root package name */
    public final E f5172a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f5173b;

    /* renamed from: c, reason: collision with root package name */
    public int f5174c = -1;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C f5175d;

    public B(C c6, E e6) {
        this.f5175d = c6;
        this.f5172a = e6;
    }

    public final void c(boolean z6) {
        if (z6 == this.f5173b) {
            return;
        }
        this.f5173b = z6;
        int i = z6 ? 1 : -1;
        C c6 = this.f5175d;
        int i3 = c6.f5179c;
        c6.f5179c = i + i3;
        if (!c6.f5180d) {
            c6.f5180d = true;
            while (true) {
                try {
                    int i6 = c6.f5179c;
                    if (i3 == i6) {
                        break;
                    }
                    boolean z7 = i3 == 0 && i6 > 0;
                    boolean z8 = i3 > 0 && i6 == 0;
                    if (z7) {
                        c6.f();
                    } else if (z8) {
                        c6.g();
                    }
                    i3 = i6;
                } catch (Throwable th) {
                    c6.f5180d = false;
                    throw th;
                }
            }
            c6.f5180d = false;
        }
        if (this.f5173b) {
            c6.c(this);
        }
    }

    public void f() {
    }

    public boolean g(InterfaceC0298u interfaceC0298u) {
        return false;
    }

    public abstract boolean h();
}
