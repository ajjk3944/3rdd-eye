package qg;

import ig.AbstractC6152a;
import io.reactivex.rxjava3.exceptions.CompositeException;
import kg.InterfaceC6464a;
import kg.InterfaceC6469f;
import xg.AbstractC8532a;
import zg.AbstractC8755h;

/* renamed from: qg.o, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7497o extends AbstractC7484b {

    /* renamed from: c, reason: collision with root package name */
    final InterfaceC6469f f59160c;

    /* renamed from: d, reason: collision with root package name */
    final InterfaceC6469f f59161d;

    /* renamed from: e, reason: collision with root package name */
    final InterfaceC6464a f59162e;

    /* renamed from: f, reason: collision with root package name */
    final InterfaceC6464a f59163f;

    /* renamed from: qg.o$a */
    static final class a extends AbstractC8532a {

        /* renamed from: f, reason: collision with root package name */
        final InterfaceC6469f f59164f;

        /* renamed from: g, reason: collision with root package name */
        final InterfaceC6469f f59165g;

        /* renamed from: h, reason: collision with root package name */
        final InterfaceC6464a f59166h;

        /* renamed from: i, reason: collision with root package name */
        final InterfaceC6464a f59167i;

        a(Dg.a aVar, InterfaceC6469f interfaceC6469f, InterfaceC6469f interfaceC6469f2, InterfaceC6464a interfaceC6464a, InterfaceC6464a interfaceC6464a2) {
            super(aVar);
            this.f59164f = interfaceC6469f;
            this.f59165g = interfaceC6469f2;
            this.f59166h = interfaceC6464a;
            this.f59167i = interfaceC6464a2;
        }

        @Override // xg.AbstractC8532a, Dj.b
        public void a() {
            if (this.f66071d) {
                return;
            }
            try {
                this.f59166h.run();
                this.f66071d = true;
                this.f66068a.a();
                try {
                    this.f59167i.run();
                } catch (Throwable th2) {
                    AbstractC6152a.b(th2);
                    Eg.a.v(th2);
                }
            } catch (Throwable th3) {
                d(th3);
            }
        }

        @Override // Dj.b
        public void h(Object obj) {
            if (this.f66071d) {
                return;
            }
            if (this.f66072e != 0) {
                this.f66068a.h(null);
                return;
            }
            try {
                this.f59164f.accept(obj);
                this.f66068a.h(obj);
            } catch (Throwable th2) {
                d(th2);
            }
        }

        @Override // Dg.a
        public boolean m(Object obj) {
            if (this.f66071d) {
                return false;
            }
            try {
                this.f59164f.accept(obj);
                return this.f66068a.m(obj);
            } catch (Throwable th2) {
                d(th2);
                return false;
            }
        }

        @Override // xg.AbstractC8532a, Dj.b
        public void onError(Throwable th2) {
            if (this.f66071d) {
                Eg.a.v(th2);
                return;
            }
            this.f66071d = true;
            try {
                this.f59165g.accept(th2);
                this.f66068a.onError(th2);
            } catch (Throwable th3) {
                AbstractC6152a.b(th3);
                this.f66068a.onError(new CompositeException(th2, th3));
            }
            try {
                this.f59167i.run();
            } catch (Throwable th4) {
                AbstractC6152a.b(th4);
                Eg.a.v(th4);
            }
        }

        @Override // Dg.g
        public Object poll() throws Exception {
            CompositeException compositeException;
            try {
                Object objPoll = this.f66070c.poll();
                if (objPoll != null) {
                    try {
                        this.f59164f.accept(objPoll);
                        this.f59167i.run();
                    } catch (Throwable th2) {
                        try {
                            AbstractC6152a.b(th2);
                            try {
                                this.f59165g.accept(th2);
                                throw AbstractC8755h.f(th2);
                            } finally {
                            }
                        } catch (Throwable th3) {
                            this.f59167i.run();
                            throw th3;
                        }
                    }
                } else if (this.f66072e == 1) {
                    this.f59166h.run();
                    this.f59167i.run();
                }
                return objPoll;
            } catch (Throwable th22) {
                AbstractC6152a.b(th22);
                try {
                    this.f59165g.accept(th22);
                    throw AbstractC8755h.f(th22);
                } finally {
                }
            }
        }

        @Override // Dg.c
        public int requestFusion(int i10) {
            return e(i10);
        }
    }

    /* renamed from: qg.o$b */
    static final class b extends xg.b {

        /* renamed from: f, reason: collision with root package name */
        final InterfaceC6469f f59168f;

        /* renamed from: g, reason: collision with root package name */
        final InterfaceC6469f f59169g;

        /* renamed from: h, reason: collision with root package name */
        final InterfaceC6464a f59170h;

        /* renamed from: i, reason: collision with root package name */
        final InterfaceC6464a f59171i;

        b(Dj.b bVar, InterfaceC6469f interfaceC6469f, InterfaceC6469f interfaceC6469f2, InterfaceC6464a interfaceC6464a, InterfaceC6464a interfaceC6464a2) {
            super(bVar);
            this.f59168f = interfaceC6469f;
            this.f59169g = interfaceC6469f2;
            this.f59170h = interfaceC6464a;
            this.f59171i = interfaceC6464a2;
        }

        @Override // xg.b, Dj.b
        public void a() {
            if (this.f66076d) {
                return;
            }
            try {
                this.f59170h.run();
                this.f66076d = true;
                this.f66073a.a();
                try {
                    this.f59171i.run();
                } catch (Throwable th2) {
                    AbstractC6152a.b(th2);
                    Eg.a.v(th2);
                }
            } catch (Throwable th3) {
                d(th3);
            }
        }

        @Override // Dj.b
        public void h(Object obj) {
            if (this.f66076d) {
                return;
            }
            if (this.f66077e != 0) {
                this.f66073a.h(null);
                return;
            }
            try {
                this.f59168f.accept(obj);
                this.f66073a.h(obj);
            } catch (Throwable th2) {
                d(th2);
            }
        }

        @Override // xg.b, Dj.b
        public void onError(Throwable th2) {
            if (this.f66076d) {
                Eg.a.v(th2);
                return;
            }
            this.f66076d = true;
            try {
                this.f59169g.accept(th2);
                this.f66073a.onError(th2);
            } catch (Throwable th3) {
                AbstractC6152a.b(th3);
                this.f66073a.onError(new CompositeException(th2, th3));
            }
            try {
                this.f59171i.run();
            } catch (Throwable th4) {
                AbstractC6152a.b(th4);
                Eg.a.v(th4);
            }
        }

        @Override // Dg.g
        public Object poll() throws Exception {
            CompositeException compositeException;
            try {
                Object objPoll = this.f66075c.poll();
                if (objPoll != null) {
                    try {
                        this.f59168f.accept(objPoll);
                        this.f59171i.run();
                    } catch (Throwable th2) {
                        try {
                            AbstractC6152a.b(th2);
                            try {
                                this.f59169g.accept(th2);
                                throw AbstractC8755h.f(th2);
                            } finally {
                            }
                        } catch (Throwable th3) {
                            this.f59171i.run();
                            throw th3;
                        }
                    }
                } else if (this.f66077e == 1) {
                    this.f59170h.run();
                    this.f59171i.run();
                }
                return objPoll;
            } catch (Throwable th22) {
                AbstractC6152a.b(th22);
                try {
                    this.f59169g.accept(th22);
                    throw AbstractC8755h.f(th22);
                } finally {
                }
            }
        }

        @Override // Dg.c
        public int requestFusion(int i10) {
            return e(i10);
        }
    }

    public C7497o(gg.i iVar, InterfaceC6469f interfaceC6469f, InterfaceC6469f interfaceC6469f2, InterfaceC6464a interfaceC6464a, InterfaceC6464a interfaceC6464a2) {
        super(iVar);
        this.f59160c = interfaceC6469f;
        this.f59161d = interfaceC6469f2;
        this.f59162e = interfaceC6464a;
        this.f59163f = interfaceC6464a2;
    }

    @Override // gg.i
    protected void E1(Dj.b bVar) {
        if (bVar instanceof Dg.a) {
            this.f58857b.D1(new a((Dg.a) bVar, this.f59160c, this.f59161d, this.f59162e, this.f59163f));
        } else {
            this.f58857b.D1(new b(bVar, this.f59160c, this.f59161d, this.f59162e, this.f59163f));
        }
    }
}
