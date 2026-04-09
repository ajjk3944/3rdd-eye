package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    public final r.k f4006a = new r.k();

    /* renamed from: b, reason: collision with root package name */
    public final r.h f4007b = new r.h();

    public static class a {

        /* renamed from: d, reason: collision with root package name */
        public static r0.f f4008d = new r0.g(20);

        /* renamed from: a, reason: collision with root package name */
        public int f4009a;

        /* renamed from: b, reason: collision with root package name */
        public RecyclerView.ItemAnimator.b f4010b;

        /* renamed from: c, reason: collision with root package name */
        public RecyclerView.ItemAnimator.b f4011c;

        public static void a() {
            while (f4008d.b() != null) {
            }
        }

        public static a b() {
            a aVar = (a) f4008d.b();
            return aVar == null ? new a() : aVar;
        }

        public static void c(a aVar) {
            aVar.f4009a = 0;
            aVar.f4010b = null;
            aVar.f4011c = null;
            f4008d.a(aVar);
        }
    }

    public interface b {
        void a(RecyclerView.c0 c0Var, RecyclerView.ItemAnimator.b bVar, RecyclerView.ItemAnimator.b bVar2);

        void b(RecyclerView.c0 c0Var);

        void c(RecyclerView.c0 c0Var, RecyclerView.ItemAnimator.b bVar, RecyclerView.ItemAnimator.b bVar2);

        void d(RecyclerView.c0 c0Var, RecyclerView.ItemAnimator.b bVar, RecyclerView.ItemAnimator.b bVar2);
    }

    public void a(RecyclerView.c0 c0Var, RecyclerView.ItemAnimator.b bVar) {
        a aVarB = (a) this.f4006a.get(c0Var);
        if (aVarB == null) {
            aVarB = a.b();
            this.f4006a.put(c0Var, aVarB);
        }
        aVarB.f4009a |= 2;
        aVarB.f4010b = bVar;
    }

    public void b(RecyclerView.c0 c0Var) {
        a aVarB = (a) this.f4006a.get(c0Var);
        if (aVarB == null) {
            aVarB = a.b();
            this.f4006a.put(c0Var, aVarB);
        }
        aVarB.f4009a |= 1;
    }

    public void c(long j10, RecyclerView.c0 c0Var) {
        this.f4007b.h(j10, c0Var);
    }

    public void d(RecyclerView.c0 c0Var, RecyclerView.ItemAnimator.b bVar) {
        a aVarB = (a) this.f4006a.get(c0Var);
        if (aVarB == null) {
            aVarB = a.b();
            this.f4006a.put(c0Var, aVarB);
        }
        aVarB.f4011c = bVar;
        aVarB.f4009a |= 8;
    }

    public void e(RecyclerView.c0 c0Var, RecyclerView.ItemAnimator.b bVar) {
        a aVarB = (a) this.f4006a.get(c0Var);
        if (aVarB == null) {
            aVarB = a.b();
            this.f4006a.put(c0Var, aVarB);
        }
        aVarB.f4010b = bVar;
        aVarB.f4009a |= 4;
    }

    public void f() {
        this.f4006a.clear();
        this.f4007b.b();
    }

    public RecyclerView.c0 g(long j10) {
        return (RecyclerView.c0) this.f4007b.d(j10);
    }

    public boolean h(RecyclerView.c0 c0Var) {
        a aVar = (a) this.f4006a.get(c0Var);
        return (aVar == null || (aVar.f4009a & 1) == 0) ? false : true;
    }

    public boolean i(RecyclerView.c0 c0Var) {
        a aVar = (a) this.f4006a.get(c0Var);
        return (aVar == null || (aVar.f4009a & 4) == 0) ? false : true;
    }

    public void j() {
        a.a();
    }

    public void k(RecyclerView.c0 c0Var) {
        p(c0Var);
    }

    public final RecyclerView.ItemAnimator.b l(RecyclerView.c0 c0Var, int i10) {
        a aVar;
        RecyclerView.ItemAnimator.b bVar;
        int iE = this.f4006a.e(c0Var);
        if (iE >= 0 && (aVar = (a) this.f4006a.l(iE)) != null) {
            int i11 = aVar.f4009a;
            if ((i11 & i10) != 0) {
                int i12 = (~i10) & i11;
                aVar.f4009a = i12;
                if (i10 == 4) {
                    bVar = aVar.f4010b;
                } else {
                    if (i10 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    bVar = aVar.f4011c;
                }
                if ((i12 & 12) == 0) {
                    this.f4006a.j(iE);
                    a.c(aVar);
                }
                return bVar;
            }
        }
        return null;
    }

    public RecyclerView.ItemAnimator.b m(RecyclerView.c0 c0Var) {
        return l(c0Var, 8);
    }

    public RecyclerView.ItemAnimator.b n(RecyclerView.c0 c0Var) {
        return l(c0Var, 4);
    }

    public void o(b bVar) {
        for (int size = this.f4006a.size() - 1; size >= 0; size--) {
            RecyclerView.c0 c0Var = (RecyclerView.c0) this.f4006a.h(size);
            a aVar = (a) this.f4006a.j(size);
            int i10 = aVar.f4009a;
            if ((i10 & 3) == 3) {
                bVar.b(c0Var);
            } else if ((i10 & 1) != 0) {
                RecyclerView.ItemAnimator.b bVar2 = aVar.f4010b;
                if (bVar2 == null) {
                    bVar.b(c0Var);
                } else {
                    bVar.c(c0Var, bVar2, aVar.f4011c);
                }
            } else if ((i10 & 14) == 14) {
                bVar.a(c0Var, aVar.f4010b, aVar.f4011c);
            } else if ((i10 & 12) == 12) {
                bVar.d(c0Var, aVar.f4010b, aVar.f4011c);
            } else if ((i10 & 4) != 0) {
                bVar.c(c0Var, aVar.f4010b, null);
            } else if ((i10 & 8) != 0) {
                bVar.a(c0Var, aVar.f4010b, aVar.f4011c);
            }
            a.c(aVar);
        }
    }

    public void p(RecyclerView.c0 c0Var) {
        a aVar = (a) this.f4006a.get(c0Var);
        if (aVar == null) {
            return;
        }
        aVar.f4009a &= -2;
    }

    public void q(RecyclerView.c0 c0Var) {
        int iK = this.f4007b.k() - 1;
        while (true) {
            if (iK < 0) {
                break;
            }
            if (c0Var == this.f4007b.l(iK)) {
                this.f4007b.j(iK);
                break;
            }
            iK--;
        }
        a aVar = (a) this.f4006a.remove(c0Var);
        if (aVar != null) {
            a.c(aVar);
        }
    }
}
