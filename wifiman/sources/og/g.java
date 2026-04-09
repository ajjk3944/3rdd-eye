package og;

import gg.x;

/* loaded from: classes4.dex */
public class g extends AbstractC7132b {

    /* renamed from: a, reason: collision with root package name */
    protected final x f55692a;

    /* renamed from: b, reason: collision with root package name */
    protected Object f55693b;

    public g(x xVar) {
        this.f55692a = xVar;
    }

    @Override // Dg.g
    public final void clear() {
        lazySet(32);
        this.f55693b = null;
    }

    public final void d() {
        if ((get() & 54) != 0) {
            return;
        }
        lazySet(2);
        this.f55692a.a();
    }

    @Override // hg.InterfaceC6043c
    public void dispose() {
        set(4);
        this.f55693b = null;
    }

    public final void g(Object obj) {
        int i10 = get();
        if ((i10 & 54) != 0) {
            return;
        }
        x xVar = this.f55692a;
        if (i10 == 8) {
            this.f55693b = obj;
            lazySet(16);
            xVar.h(null);
        } else {
            lazySet(2);
            xVar.h(obj);
        }
        if (get() != 4) {
            xVar.a();
        }
    }

    @Override // hg.InterfaceC6043c
    public final boolean isDisposed() {
        return get() == 4;
    }

    @Override // Dg.g
    public final boolean isEmpty() {
        return get() != 16;
    }

    public final void j(Throwable th2) {
        if ((get() & 54) != 0) {
            Eg.a.v(th2);
        } else {
            lazySet(2);
            this.f55692a.onError(th2);
        }
    }

    @Override // Dg.g
    public final Object poll() {
        if (get() != 16) {
            return null;
        }
        Object obj = this.f55693b;
        this.f55693b = null;
        lazySet(32);
        return obj;
    }

    @Override // Dg.c
    public final int requestFusion(int i10) {
        if ((i10 & 2) == 0) {
            return 0;
        }
        lazySet(8);
        return 2;
    }
}
