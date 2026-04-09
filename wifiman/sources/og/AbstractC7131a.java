package og;

import gg.x;
import hg.InterfaceC6043c;
import ig.AbstractC6152a;
import lg.EnumC6592b;

/* renamed from: og.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC7131a implements x, Dg.b {

    /* renamed from: a, reason: collision with root package name */
    protected final x f55679a;

    /* renamed from: b, reason: collision with root package name */
    protected InterfaceC6043c f55680b;

    /* renamed from: c, reason: collision with root package name */
    protected Dg.b f55681c;

    /* renamed from: d, reason: collision with root package name */
    protected boolean f55682d;

    /* renamed from: e, reason: collision with root package name */
    protected int f55683e;

    public AbstractC7131a(x xVar) {
        this.f55679a = xVar;
    }

    @Override // gg.x
    public void a() {
        if (this.f55682d) {
            return;
        }
        this.f55682d = true;
        this.f55679a.a();
    }

    protected void b() {
    }

    @Override // gg.x
    public final void c(InterfaceC6043c interfaceC6043c) {
        if (EnumC6592b.validate(this.f55680b, interfaceC6043c)) {
            this.f55680b = interfaceC6043c;
            if (interfaceC6043c instanceof Dg.b) {
                this.f55681c = (Dg.b) interfaceC6043c;
            }
            if (d()) {
                this.f55679a.c(this);
                b();
            }
        }
    }

    @Override // Dg.g
    public void clear() {
        this.f55681c.clear();
    }

    protected boolean d() {
        return true;
    }

    @Override // hg.InterfaceC6043c
    public void dispose() {
        this.f55680b.dispose();
    }

    protected final void e(Throwable th2) {
        AbstractC6152a.b(th2);
        this.f55680b.dispose();
        onError(th2);
    }

    protected final int f(int i10) {
        Dg.b bVar = this.f55681c;
        if (bVar == null || (i10 & 4) != 0) {
            return 0;
        }
        int iRequestFusion = bVar.requestFusion(i10);
        if (iRequestFusion != 0) {
            this.f55683e = iRequestFusion;
        }
        return iRequestFusion;
    }

    @Override // hg.InterfaceC6043c
    public boolean isDisposed() {
        return this.f55680b.isDisposed();
    }

    @Override // Dg.g
    public boolean isEmpty() {
        return this.f55681c.isEmpty();
    }

    @Override // Dg.g
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // gg.x
    public void onError(Throwable th2) {
        if (this.f55682d) {
            Eg.a.v(th2);
        } else {
            this.f55682d = true;
            this.f55679a.onError(th2);
        }
    }
}
