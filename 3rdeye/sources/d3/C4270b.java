package d3;

import d3.InterfaceC4273e;

/* compiled from: ErrorRequestCoordinator.java */
/* renamed from: d3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4270b implements InterfaceC4273e, InterfaceC4272d {

    /* renamed from: a, reason: collision with root package name */
    public final Object f37387a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f37388b;

    /* renamed from: c, reason: collision with root package name */
    public volatile InterfaceC4272d f37389c;

    /* renamed from: d, reason: collision with root package name */
    public volatile InterfaceC4272d f37390d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC4273e.a f37391e;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC4273e.a f37392f;

    public C4270b(Object obj, InterfaceC4273e interfaceC4273e) {
        InterfaceC4273e.a aVar = InterfaceC4273e.a.CLEARED;
        this.f37391e = aVar;
        this.f37392f = aVar;
        this.f37387a = obj;
        this.f37388b = interfaceC4273e;
    }

    @Override // d3.InterfaceC4273e, d3.InterfaceC4272d
    public final boolean a() {
        boolean z10;
        synchronized (this.f37387a) {
            try {
                z10 = this.f37389c.a() || this.f37390d.a();
            } finally {
            }
        }
        return z10;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [d3.e, java.lang.Object] */
    @Override // d3.InterfaceC4273e
    public final boolean b(InterfaceC4272d interfaceC4272d) {
        boolean z10;
        synchronized (this.f37387a) {
            ?? r12 = this.f37388b;
            z10 = (r12 == 0 || r12.b(this)) && interfaceC4272d.equals(this.f37389c);
        }
        return z10;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [d3.e, java.lang.Object] */
    @Override // d3.InterfaceC4273e
    public final boolean c(InterfaceC4272d interfaceC4272d) {
        boolean z10;
        synchronized (this.f37387a) {
            ?? r02 = this.f37388b;
            z10 = r02 == 0 || r02.c(this);
        }
        return z10;
    }

    @Override // d3.InterfaceC4272d
    public final void clear() {
        synchronized (this.f37387a) {
            try {
                InterfaceC4273e.a aVar = InterfaceC4273e.a.CLEARED;
                this.f37391e = aVar;
                this.f37389c.clear();
                if (this.f37392f != aVar) {
                    this.f37392f = aVar;
                    this.f37390d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [d3.e, java.lang.Object] */
    @Override // d3.InterfaceC4273e
    public final InterfaceC4273e d() {
        InterfaceC4273e interfaceC4273eD;
        synchronized (this.f37387a) {
            try {
                ?? r12 = this.f37388b;
                interfaceC4273eD = r12 != 0 ? r12.d() : this;
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4273eD;
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [d3.e, java.lang.Object] */
    @Override // d3.InterfaceC4273e
    public final void e(InterfaceC4272d interfaceC4272d) {
        synchronized (this.f37387a) {
            try {
                if (interfaceC4272d.equals(this.f37389c)) {
                    this.f37391e = InterfaceC4273e.a.SUCCESS;
                } else if (interfaceC4272d.equals(this.f37390d)) {
                    this.f37392f = InterfaceC4273e.a.SUCCESS;
                }
                ?? r32 = this.f37388b;
                if (r32 != 0) {
                    r32.e(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // d3.InterfaceC4272d
    public final boolean f(InterfaceC4272d interfaceC4272d) {
        if (interfaceC4272d instanceof C4270b) {
            C4270b c4270b = (C4270b) interfaceC4272d;
            if (this.f37389c.f(c4270b.f37389c) && this.f37390d.f(c4270b.f37390d)) {
                return true;
            }
        }
        return false;
    }

    @Override // d3.InterfaceC4272d
    public final boolean g() {
        boolean z10;
        synchronized (this.f37387a) {
            try {
                InterfaceC4273e.a aVar = this.f37391e;
                InterfaceC4273e.a aVar2 = InterfaceC4273e.a.CLEARED;
                z10 = aVar == aVar2 && this.f37392f == aVar2;
            } finally {
            }
        }
        return z10;
    }

    @Override // d3.InterfaceC4272d
    public final void h() {
        synchronized (this.f37387a) {
            try {
                InterfaceC4273e.a aVar = this.f37391e;
                InterfaceC4273e.a aVar2 = InterfaceC4273e.a.RUNNING;
                if (aVar != aVar2) {
                    this.f37391e = aVar2;
                    this.f37389c.h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [d3.e, java.lang.Object] */
    @Override // d3.InterfaceC4273e
    public final void i(InterfaceC4272d interfaceC4272d) {
        synchronized (this.f37387a) {
            try {
                if (interfaceC4272d.equals(this.f37390d)) {
                    this.f37392f = InterfaceC4273e.a.FAILED;
                    ?? r32 = this.f37388b;
                    if (r32 != 0) {
                        r32.i(this);
                    }
                    return;
                }
                this.f37391e = InterfaceC4273e.a.FAILED;
                InterfaceC4273e.a aVar = this.f37392f;
                InterfaceC4273e.a aVar2 = InterfaceC4273e.a.RUNNING;
                if (aVar != aVar2) {
                    this.f37392f = aVar2;
                    this.f37390d.h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // d3.InterfaceC4272d
    public final boolean isRunning() {
        boolean z10;
        synchronized (this.f37387a) {
            try {
                InterfaceC4273e.a aVar = this.f37391e;
                InterfaceC4273e.a aVar2 = InterfaceC4273e.a.RUNNING;
                z10 = aVar == aVar2 || this.f37392f == aVar2;
            } finally {
            }
        }
        return z10;
    }

    @Override // d3.InterfaceC4272d
    public final boolean j() {
        boolean z10;
        synchronized (this.f37387a) {
            try {
                InterfaceC4273e.a aVar = this.f37391e;
                InterfaceC4273e.a aVar2 = InterfaceC4273e.a.SUCCESS;
                z10 = aVar == aVar2 || this.f37392f == aVar2;
            } finally {
            }
        }
        return z10;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [d3.e, java.lang.Object] */
    @Override // d3.InterfaceC4273e
    public final boolean k(InterfaceC4272d interfaceC4272d) {
        boolean z10;
        InterfaceC4273e.a aVar;
        synchronized (this.f37387a) {
            ?? r12 = this.f37388b;
            z10 = false;
            if (r12 == 0 || r12.k(this)) {
                InterfaceC4273e.a aVar2 = this.f37391e;
                InterfaceC4273e.a aVar3 = InterfaceC4273e.a.FAILED;
                if (aVar2 != aVar3 ? interfaceC4272d.equals(this.f37389c) : interfaceC4272d.equals(this.f37390d) && ((aVar = this.f37392f) == InterfaceC4273e.a.SUCCESS || aVar == aVar3)) {
                    z10 = true;
                }
            }
        }
        return z10;
    }

    @Override // d3.InterfaceC4272d
    public final void pause() {
        synchronized (this.f37387a) {
            try {
                InterfaceC4273e.a aVar = this.f37391e;
                InterfaceC4273e.a aVar2 = InterfaceC4273e.a.RUNNING;
                if (aVar == aVar2) {
                    this.f37391e = InterfaceC4273e.a.PAUSED;
                    this.f37389c.pause();
                }
                if (this.f37392f == aVar2) {
                    this.f37392f = InterfaceC4273e.a.PAUSED;
                    this.f37390d.pause();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
