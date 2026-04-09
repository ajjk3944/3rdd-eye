package dd;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class m implements n, e, d, b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7308a;

    /* renamed from: d, reason: collision with root package name */
    public final Executor f7309d;

    /* renamed from: g, reason: collision with root package name */
    public final Object f7310g;

    /* renamed from: r, reason: collision with root package name */
    public Object f7311r;

    public m(Executor executor, b bVar) {
        this.f7308a = 0;
        this.f7310g = new Object();
        this.f7309d = executor;
        this.f7311r = bVar;
    }

    @Override // dd.n
    public final void a(r rVar) {
        switch (this.f7308a) {
            case 0:
                if (rVar.f7321d) {
                    synchronized (this.f7310g) {
                        try {
                            if (((b) this.f7311r) != null) {
                                this.f7309d.execute(new b4.e(6, this));
                            }
                        } finally {
                        }
                    }
                    return;
                }
                return;
            case 1:
                synchronized (this.f7310g) {
                    try {
                        if (((c) this.f7311r) == null) {
                            return;
                        }
                        this.f7309d.execute(new re.a(9, this, rVar, false));
                        return;
                    } finally {
                    }
                }
            case 2:
                if (rVar.j() || rVar.f7321d) {
                    return;
                }
                synchronized (this.f7310g) {
                    try {
                        if (((d) this.f7311r) != null) {
                            this.f7309d.execute(new re.a(10, this, rVar, false));
                        }
                    } finally {
                    }
                }
                return;
            case 3:
                if (rVar.j()) {
                    synchronized (this.f7310g) {
                        try {
                            if (((e) this.f7311r) != null) {
                                this.f7309d.execute(new re.a(11, this, rVar, false));
                            }
                        } finally {
                        }
                    }
                    return;
                }
                return;
            default:
                this.f7309d.execute(new re.a(12, this, rVar, false));
                return;
        }
    }

    @Override // dd.n
    public final void b() {
        switch (this.f7308a) {
            case 0:
                synchronized (this.f7310g) {
                    this.f7311r = null;
                }
                return;
            case 1:
                synchronized (this.f7310g) {
                    this.f7311r = null;
                }
                return;
            case 2:
                synchronized (this.f7310g) {
                    this.f7311r = null;
                }
                return;
            case 3:
                synchronized (this.f7310g) {
                    this.f7311r = null;
                }
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // dd.e
    public void h(Object obj) {
        ((r) this.f7311r).l(obj);
    }

    @Override // dd.b
    public void q() {
        ((r) this.f7311r).o();
    }

    @Override // dd.d
    public void y(Exception exc) {
        ((r) this.f7311r).n(exc);
    }

    public m(Executor executor, c cVar) {
        this.f7308a = 1;
        this.f7310g = new Object();
        this.f7309d = executor;
        this.f7311r = cVar;
    }

    public m(Executor executor, d dVar) {
        this.f7308a = 2;
        this.f7310g = new Object();
        this.f7309d = executor;
        this.f7311r = dVar;
    }

    public m(Executor executor, e eVar) {
        this.f7308a = 3;
        this.f7310g = new Object();
        this.f7309d = executor;
        this.f7311r = eVar;
    }

    public m(Executor executor, g gVar, r rVar) {
        this.f7308a = 4;
        this.f7309d = executor;
        this.f7310g = gVar;
        this.f7311r = rVar;
    }
}
