package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import o.C7028t;
import o.V;

/* loaded from: classes.dex */
class q {

    /* renamed from: a, reason: collision with root package name */
    final V f32262a = new V();

    /* renamed from: b, reason: collision with root package name */
    final C7028t f32263b = new C7028t();

    static class a {

        /* renamed from: d, reason: collision with root package name */
        static E1.e f32264d = new E1.f(20);

        /* renamed from: a, reason: collision with root package name */
        int f32265a;

        /* renamed from: b, reason: collision with root package name */
        RecyclerView.l.b f32266b;

        /* renamed from: c, reason: collision with root package name */
        RecyclerView.l.b f32267c;

        private a() {
        }

        static void a() {
            while (f32264d.b() != null) {
            }
        }

        static a b() {
            a aVar = (a) f32264d.b();
            return aVar == null ? new a() : aVar;
        }

        static void c(a aVar) {
            aVar.f32265a = 0;
            aVar.f32266b = null;
            aVar.f32267c = null;
            f32264d.a(aVar);
        }
    }

    interface b {
        void a(RecyclerView.C c10);

        void b(RecyclerView.C c10, RecyclerView.l.b bVar, RecyclerView.l.b bVar2);

        void c(RecyclerView.C c10, RecyclerView.l.b bVar, RecyclerView.l.b bVar2);

        void d(RecyclerView.C c10, RecyclerView.l.b bVar, RecyclerView.l.b bVar2);
    }

    q() {
    }

    private RecyclerView.l.b l(RecyclerView.C c10, int i10) {
        a aVar;
        RecyclerView.l.b bVar;
        int iF = this.f32262a.f(c10);
        if (iF >= 0 && (aVar = (a) this.f32262a.l(iF)) != null) {
            int i11 = aVar.f32265a;
            if ((i11 & i10) != 0) {
                int i12 = (~i10) & i11;
                aVar.f32265a = i12;
                if (i10 == 4) {
                    bVar = aVar.f32266b;
                } else {
                    if (i10 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    bVar = aVar.f32267c;
                }
                if ((i12 & 12) == 0) {
                    this.f32262a.j(iF);
                    a.c(aVar);
                }
                return bVar;
            }
        }
        return null;
    }

    void a(RecyclerView.C c10, RecyclerView.l.b bVar) {
        a aVarB = (a) this.f32262a.get(c10);
        if (aVarB == null) {
            aVarB = a.b();
            this.f32262a.put(c10, aVarB);
        }
        aVarB.f32265a |= 2;
        aVarB.f32266b = bVar;
    }

    void b(RecyclerView.C c10) {
        a aVarB = (a) this.f32262a.get(c10);
        if (aVarB == null) {
            aVarB = a.b();
            this.f32262a.put(c10, aVarB);
        }
        aVarB.f32265a |= 1;
    }

    void c(long j10, RecyclerView.C c10) {
        this.f32263b.k(j10, c10);
    }

    void d(RecyclerView.C c10, RecyclerView.l.b bVar) {
        a aVarB = (a) this.f32262a.get(c10);
        if (aVarB == null) {
            aVarB = a.b();
            this.f32262a.put(c10, aVarB);
        }
        aVarB.f32267c = bVar;
        aVarB.f32265a |= 8;
    }

    void e(RecyclerView.C c10, RecyclerView.l.b bVar) {
        a aVarB = (a) this.f32262a.get(c10);
        if (aVarB == null) {
            aVarB = a.b();
            this.f32262a.put(c10, aVarB);
        }
        aVarB.f32266b = bVar;
        aVarB.f32265a |= 4;
    }

    void f() {
        this.f32262a.clear();
        this.f32263b.b();
    }

    RecyclerView.C g(long j10) {
        return (RecyclerView.C) this.f32263b.e(j10);
    }

    boolean h(RecyclerView.C c10) {
        a aVar = (a) this.f32262a.get(c10);
        return (aVar == null || (aVar.f32265a & 1) == 0) ? false : true;
    }

    boolean i(RecyclerView.C c10) {
        a aVar = (a) this.f32262a.get(c10);
        return (aVar == null || (aVar.f32265a & 4) == 0) ? false : true;
    }

    void j() {
        a.a();
    }

    public void k(RecyclerView.C c10) {
        p(c10);
    }

    RecyclerView.l.b m(RecyclerView.C c10) {
        return l(c10, 8);
    }

    RecyclerView.l.b n(RecyclerView.C c10) {
        return l(c10, 4);
    }

    void o(b bVar) {
        for (int size = this.f32262a.size() - 1; size >= 0; size--) {
            RecyclerView.C c10 = (RecyclerView.C) this.f32262a.h(size);
            a aVar = (a) this.f32262a.j(size);
            int i10 = aVar.f32265a;
            if ((i10 & 3) == 3) {
                bVar.a(c10);
            } else if ((i10 & 1) != 0) {
                RecyclerView.l.b bVar2 = aVar.f32266b;
                if (bVar2 == null) {
                    bVar.a(c10);
                } else {
                    bVar.c(c10, bVar2, aVar.f32267c);
                }
            } else if ((i10 & 14) == 14) {
                bVar.b(c10, aVar.f32266b, aVar.f32267c);
            } else if ((i10 & 12) == 12) {
                bVar.d(c10, aVar.f32266b, aVar.f32267c);
            } else if ((i10 & 4) != 0) {
                bVar.c(c10, aVar.f32266b, null);
            } else if ((i10 & 8) != 0) {
                bVar.b(c10, aVar.f32266b, aVar.f32267c);
            }
            a.c(aVar);
        }
    }

    void p(RecyclerView.C c10) {
        a aVar = (a) this.f32262a.get(c10);
        if (aVar == null) {
            return;
        }
        aVar.f32265a &= -2;
    }

    void q(RecyclerView.C c10) {
        int iO = this.f32263b.o() - 1;
        while (true) {
            if (iO < 0) {
                break;
            }
            if (c10 == this.f32263b.p(iO)) {
                this.f32263b.n(iO);
                break;
            }
            iO--;
        }
        a aVar = (a) this.f32262a.remove(c10);
        if (aVar != null) {
            a.c(aVar);
        }
    }
}
