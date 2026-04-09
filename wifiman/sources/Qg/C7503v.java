package qg;

import xg.AbstractC8532a;

/* renamed from: qg.v, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7503v extends AbstractC7484b {

    /* renamed from: c, reason: collision with root package name */
    final kg.p f59267c;

    /* renamed from: qg.v$a */
    static final class a extends AbstractC8532a {

        /* renamed from: f, reason: collision with root package name */
        final kg.p f59268f;

        a(Dg.a aVar, kg.p pVar) {
            super(aVar);
            this.f59268f = pVar;
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
                return this.f66068a.m(null);
            }
            try {
                return this.f59268f.test(obj) && this.f66068a.m(obj);
            } catch (Throwable th2) {
                d(th2);
                return true;
            }
        }

        @Override // Dg.g
        public Object poll() {
            Dg.d dVar = this.f66070c;
            kg.p pVar = this.f59268f;
            while (true) {
                Object objPoll = dVar.poll();
                if (objPoll == null) {
                    return null;
                }
                if (pVar.test(objPoll)) {
                    return objPoll;
                }
                if (this.f66072e == 2) {
                    dVar.request(1L);
                }
            }
        }

        @Override // Dg.c
        public int requestFusion(int i10) {
            return e(i10);
        }
    }

    /* renamed from: qg.v$b */
    static final class b extends xg.b implements Dg.a {

        /* renamed from: f, reason: collision with root package name */
        final kg.p f59269f;

        b(Dj.b bVar, kg.p pVar) {
            super(bVar);
            this.f59269f = pVar;
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
                this.f66073a.h(null);
                return true;
            }
            try {
                boolean zTest = this.f59269f.test(obj);
                if (zTest) {
                    this.f66073a.h(obj);
                }
                return zTest;
            } catch (Throwable th2) {
                d(th2);
                return true;
            }
        }

        @Override // Dg.g
        public Object poll() {
            Dg.d dVar = this.f66075c;
            kg.p pVar = this.f59269f;
            while (true) {
                Object objPoll = dVar.poll();
                if (objPoll == null) {
                    return null;
                }
                if (pVar.test(objPoll)) {
                    return objPoll;
                }
                if (this.f66077e == 2) {
                    dVar.request(1L);
                }
            }
        }

        @Override // Dg.c
        public int requestFusion(int i10) {
            return e(i10);
        }
    }

    public C7503v(gg.i iVar, kg.p pVar) {
        super(iVar);
        this.f59267c = pVar;
    }

    @Override // gg.i
    protected void E1(Dj.b bVar) {
        if (bVar instanceof Dg.a) {
            this.f58857b.D1(new a((Dg.a) bVar, this.f59267c));
        } else {
            this.f58857b.D1(new b(bVar, this.f59267c));
        }
    }
}
