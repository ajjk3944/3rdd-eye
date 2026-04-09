package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import m0.C5313f;
import m0.C5314g;
import m0.C5316i;

/* compiled from: ViewInfoStore.java */
/* loaded from: classes.dex */
public final class I {

    /* renamed from: a, reason: collision with root package name */
    public final C5316i<RecyclerView.F, a> f16404a = new C5316i<>();

    /* renamed from: b, reason: collision with root package name */
    public final C5313f<RecyclerView.F> f16405b = new C5313f<>();

    /* compiled from: ViewInfoStore.java */
    public static class a {

        /* renamed from: d, reason: collision with root package name */
        public static final K0.d f16406d = new K0.d(20);

        /* renamed from: a, reason: collision with root package name */
        public int f16407a;

        /* renamed from: b, reason: collision with root package name */
        public RecyclerView.m.c f16408b;

        /* renamed from: c, reason: collision with root package name */
        public RecyclerView.m.c f16409c;

        public static a a() {
            a aVar = (a) f16406d.a();
            return aVar == null ? new a() : aVar;
        }
    }

    /* compiled from: ViewInfoStore.java */
    public interface b {
    }

    public final void a(RecyclerView.F f10, RecyclerView.m.c cVar) {
        C5316i<RecyclerView.F, a> c5316i = this.f16404a;
        a aVarA = c5316i.get(f10);
        if (aVarA == null) {
            aVarA = a.a();
            c5316i.put(f10, aVarA);
        }
        aVarA.f16409c = cVar;
        aVarA.f16407a |= 8;
    }

    public final RecyclerView.m.c b(RecyclerView.F f10, int i) {
        a aVarL;
        RecyclerView.m.c cVar;
        C5316i<RecyclerView.F, a> c5316i = this.f16404a;
        int iE = c5316i.e(f10);
        if (iE >= 0 && (aVarL = c5316i.l(iE)) != null) {
            int i10 = aVarL.f16407a;
            if ((i10 & i) != 0) {
                int i11 = i10 & (~i);
                aVarL.f16407a = i11;
                if (i == 4) {
                    cVar = aVarL.f16408b;
                } else {
                    if (i != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    cVar = aVarL.f16409c;
                }
                if ((i11 & 12) == 0) {
                    c5316i.j(iE);
                    aVarL.f16407a = 0;
                    aVarL.f16408b = null;
                    aVarL.f16409c = null;
                    a.f16406d.c(aVarL);
                }
                return cVar;
            }
        }
        return null;
    }

    public final void c(RecyclerView.F f10) {
        a aVar = this.f16404a.get(f10);
        if (aVar == null) {
            return;
        }
        aVar.f16407a &= -2;
    }

    public final void d(RecyclerView.F f10) {
        C5313f<RecyclerView.F> c5313f = this.f16405b;
        int iJ = c5313f.j() - 1;
        while (true) {
            if (iJ < 0) {
                break;
            }
            if (f10 == c5313f.k(iJ)) {
                Object[] objArr = c5313f.f44025d;
                Object obj = objArr[iJ];
                Object obj2 = C5314g.f44027a;
                if (obj != obj2) {
                    objArr[iJ] = obj2;
                    c5313f.f44023b = true;
                }
            } else {
                iJ--;
            }
        }
        a aVarRemove = this.f16404a.remove(f10);
        if (aVarRemove != null) {
            aVarRemove.f16407a = 0;
            aVarRemove.f16408b = null;
            aVarRemove.f16409c = null;
            a.f16406d.c(aVarRemove);
        }
    }
}
