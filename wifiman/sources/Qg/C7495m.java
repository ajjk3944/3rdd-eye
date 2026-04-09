package qg;

import kg.InterfaceC6466c;
import xg.AbstractC8532a;

/* renamed from: qg.m, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7495m extends AbstractC7484b {

    /* renamed from: c, reason: collision with root package name */
    final kg.n f59128c;

    /* renamed from: d, reason: collision with root package name */
    final InterfaceC6466c f59129d;

    /* renamed from: qg.m$a */
    static final class a extends AbstractC8532a {

        /* renamed from: f, reason: collision with root package name */
        final kg.n f59130f;

        /* renamed from: g, reason: collision with root package name */
        final InterfaceC6466c f59131g;

        /* renamed from: h, reason: collision with root package name */
        Object f59132h;

        /* renamed from: i, reason: collision with root package name */
        boolean f59133i;

        a(Dg.a aVar, kg.n nVar, InterfaceC6466c interfaceC6466c) {
            super(aVar);
            this.f59130f = nVar;
            this.f59131g = interfaceC6466c;
        }

        @Override // Dj.b
        public void h(Object obj) {
            if (m(obj)) {
                return;
            }
            this.f66069b.request(1L);
        }

        @Override // Dg.a
        public boolean m(Object obj) {
            if (this.f66071d) {
                return false;
            }
            if (this.f66072e != 0) {
                return this.f66068a.m(obj);
            }
            try {
                Object objApply = this.f59130f.apply(obj);
                if (this.f59133i) {
                    boolean zA = this.f59131g.a(this.f59132h, objApply);
                    this.f59132h = objApply;
                    if (zA) {
                        return false;
                    }
                } else {
                    this.f59133i = true;
                    this.f59132h = objApply;
                }
                this.f66068a.h(obj);
                return true;
            } catch (Throwable th2) {
                d(th2);
                return true;
            }
        }

        @Override // Dg.g
        public Object poll() {
            while (true) {
                Object objPoll = this.f66070c.poll();
                if (objPoll == null) {
                    return null;
                }
                Object objApply = this.f59130f.apply(objPoll);
                if (!this.f59133i) {
                    this.f59133i = true;
                    this.f59132h = objApply;
                    return objPoll;
                }
                if (!this.f59131g.a(this.f59132h, objApply)) {
                    this.f59132h = objApply;
                    return objPoll;
                }
                this.f59132h = objApply;
                if (this.f66072e != 1) {
                    this.f66069b.request(1L);
                }
            }
        }

        @Override // Dg.c
        public int requestFusion(int i10) {
            return e(i10);
        }
    }

    /* renamed from: qg.m$b */
    static final class b extends xg.b implements Dg.a {

        /* renamed from: f, reason: collision with root package name */
        final kg.n f59134f;

        /* renamed from: g, reason: collision with root package name */
        final InterfaceC6466c f59135g;

        /* renamed from: h, reason: collision with root package name */
        Object f59136h;

        /* renamed from: i, reason: collision with root package name */
        boolean f59137i;

        b(Dj.b bVar, kg.n nVar, InterfaceC6466c interfaceC6466c) {
            super(bVar);
            this.f59134f = nVar;
            this.f59135g = interfaceC6466c;
        }

        @Override // Dj.b
        public void h(Object obj) {
            if (m(obj)) {
                return;
            }
            this.f66074b.request(1L);
        }

        @Override // Dg.a
        public boolean m(Object obj) {
            if (this.f66076d) {
                return false;
            }
            if (this.f66077e != 0) {
                this.f66073a.h(obj);
                return true;
            }
            try {
                Object objApply = this.f59134f.apply(obj);
                if (this.f59137i) {
                    boolean zA = this.f59135g.a(this.f59136h, objApply);
                    this.f59136h = objApply;
                    if (zA) {
                        return false;
                    }
                } else {
                    this.f59137i = true;
                    this.f59136h = objApply;
                }
                this.f66073a.h(obj);
                return true;
            } catch (Throwable th2) {
                d(th2);
                return true;
            }
        }

        @Override // Dg.g
        public Object poll() {
            while (true) {
                Object objPoll = this.f66075c.poll();
                if (objPoll == null) {
                    return null;
                }
                Object objApply = this.f59134f.apply(objPoll);
                if (!this.f59137i) {
                    this.f59137i = true;
                    this.f59136h = objApply;
                    return objPoll;
                }
                if (!this.f59135g.a(this.f59136h, objApply)) {
                    this.f59136h = objApply;
                    return objPoll;
                }
                this.f59136h = objApply;
                if (this.f66077e != 1) {
                    this.f66074b.request(1L);
                }
            }
        }

        @Override // Dg.c
        public int requestFusion(int i10) {
            return e(i10);
        }
    }

    public C7495m(gg.i iVar, kg.n nVar, InterfaceC6466c interfaceC6466c) {
        super(iVar);
        this.f59128c = nVar;
        this.f59129d = interfaceC6466c;
    }

    @Override // gg.i
    protected void E1(Dj.b bVar) {
        if (bVar instanceof Dg.a) {
            this.f58857b.D1(new a((Dg.a) bVar, this.f59128c, this.f59129d));
        } else {
            this.f58857b.D1(new b(bVar, this.f59128c, this.f59129d));
        }
    }
}
