package d3;

import d3.InterfaceC4273e;

/* compiled from: ThumbnailRequestCoordinator.java */
/* loaded from: classes.dex */
public final class i implements InterfaceC4273e, InterfaceC4272d {

    /* renamed from: a, reason: collision with root package name */
    public final Object f37420a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f37421b;

    /* renamed from: c, reason: collision with root package name */
    public volatile h f37422c;

    /* renamed from: d, reason: collision with root package name */
    public volatile InterfaceC4272d f37423d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC4273e.a f37424e;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC4273e.a f37425f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f37426g;

    public i(Object obj, InterfaceC4273e interfaceC4273e) {
        InterfaceC4273e.a aVar = InterfaceC4273e.a.CLEARED;
        this.f37424e = aVar;
        this.f37425f = aVar;
        this.f37421b = obj;
        this.f37420a = interfaceC4273e;
    }

    @Override // d3.InterfaceC4273e, d3.InterfaceC4272d
    public final boolean a() {
        boolean z10;
        synchronized (this.f37421b) {
            try {
                z10 = this.f37423d.a() || this.f37422c.a();
            } finally {
            }
        }
        return z10;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [d3.e, java.lang.Object] */
    @Override // d3.InterfaceC4273e
    public final boolean b(InterfaceC4272d interfaceC4272d) {
        boolean z10;
        synchronized (this.f37421b) {
            try {
                ?? r12 = this.f37420a;
                z10 = (r12 == 0 || r12.b(this)) && interfaceC4272d.equals(this.f37422c) && this.f37424e != InterfaceC4273e.a.PAUSED;
            } finally {
            }
        }
        return z10;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [d3.e, java.lang.Object] */
    @Override // d3.InterfaceC4273e
    public final boolean c(InterfaceC4272d interfaceC4272d) {
        boolean z10;
        synchronized (this.f37421b) {
            try {
                ?? r12 = this.f37420a;
                z10 = (r12 == 0 || r12.c(this)) && (interfaceC4272d.equals(this.f37422c) || this.f37424e != InterfaceC4273e.a.SUCCESS);
            } finally {
            }
        }
        return z10;
    }

    @Override // d3.InterfaceC4272d
    public final void clear() {
        synchronized (this.f37421b) {
            this.f37426g = false;
            InterfaceC4273e.a aVar = InterfaceC4273e.a.CLEARED;
            this.f37424e = aVar;
            this.f37425f = aVar;
            this.f37423d.clear();
            this.f37422c.clear();
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [d3.e, java.lang.Object] */
    @Override // d3.InterfaceC4273e
    public final InterfaceC4273e d() {
        InterfaceC4273e interfaceC4273eD;
        synchronized (this.f37421b) {
            try {
                ?? r12 = this.f37420a;
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
        synchronized (this.f37421b) {
            try {
                if (interfaceC4272d.equals(this.f37423d)) {
                    this.f37425f = InterfaceC4273e.a.SUCCESS;
                    return;
                }
                this.f37424e = InterfaceC4273e.a.SUCCESS;
                ?? r32 = this.f37420a;
                if (r32 != 0) {
                    r32.e(this);
                }
                if (!this.f37425f.isComplete()) {
                    this.f37423d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // d3.InterfaceC4272d
    public final boolean f(InterfaceC4272d interfaceC4272d) {
        if (!(interfaceC4272d instanceof i)) {
            return false;
        }
        i iVar = (i) interfaceC4272d;
        if (this.f37422c == null) {
            if (iVar.f37422c != null) {
                return false;
            }
        } else if (!this.f37422c.f(iVar.f37422c)) {
            return false;
        }
        return this.f37423d == null ? iVar.f37423d == null : this.f37423d.f(iVar.f37423d);
    }

    @Override // d3.InterfaceC4272d
    public final boolean g() {
        boolean z10;
        synchronized (this.f37421b) {
            z10 = this.f37424e == InterfaceC4273e.a.CLEARED;
        }
        return z10;
    }

    @Override // d3.InterfaceC4272d
    public final void h() {
        synchronized (this.f37421b) {
            try {
                this.f37426g = true;
                try {
                    if (this.f37424e != InterfaceC4273e.a.SUCCESS) {
                        InterfaceC4273e.a aVar = this.f37425f;
                        InterfaceC4273e.a aVar2 = InterfaceC4273e.a.RUNNING;
                        if (aVar != aVar2) {
                            this.f37425f = aVar2;
                            this.f37423d.h();
                        }
                    }
                    if (this.f37426g) {
                        InterfaceC4273e.a aVar3 = this.f37424e;
                        InterfaceC4273e.a aVar4 = InterfaceC4273e.a.RUNNING;
                        if (aVar3 != aVar4) {
                            this.f37424e = aVar4;
                            this.f37422c.h();
                        }
                    }
                    this.f37426g = false;
                } catch (Throwable th) {
                    this.f37426g = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [d3.e, java.lang.Object] */
    @Override // d3.InterfaceC4273e
    public final void i(InterfaceC4272d interfaceC4272d) {
        synchronized (this.f37421b) {
            try {
                if (!interfaceC4272d.equals(this.f37422c)) {
                    this.f37425f = InterfaceC4273e.a.FAILED;
                    return;
                }
                this.f37424e = InterfaceC4273e.a.FAILED;
                ?? r32 = this.f37420a;
                if (r32 != 0) {
                    r32.i(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // d3.InterfaceC4272d
    public final boolean isRunning() {
        boolean z10;
        synchronized (this.f37421b) {
            z10 = this.f37424e == InterfaceC4273e.a.RUNNING;
        }
        return z10;
    }

    @Override // d3.InterfaceC4272d
    public final boolean j() {
        boolean z10;
        synchronized (this.f37421b) {
            z10 = this.f37424e == InterfaceC4273e.a.SUCCESS;
        }
        return z10;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [d3.e, java.lang.Object] */
    @Override // d3.InterfaceC4273e
    public final boolean k(InterfaceC4272d interfaceC4272d) {
        boolean z10;
        synchronized (this.f37421b) {
            try {
                ?? r12 = this.f37420a;
                z10 = (r12 == 0 || r12.k(this)) && interfaceC4272d.equals(this.f37422c) && !a();
            } finally {
            }
        }
        return z10;
    }

    @Override // d3.InterfaceC4272d
    public final void pause() {
        synchronized (this.f37421b) {
            try {
                if (!this.f37425f.isComplete()) {
                    this.f37425f = InterfaceC4273e.a.PAUSED;
                    this.f37423d.pause();
                }
                if (!this.f37424e.isComplete()) {
                    this.f37424e = InterfaceC4273e.a.PAUSED;
                    this.f37422c.pause();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
