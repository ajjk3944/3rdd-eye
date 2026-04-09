package i7;

import H6.C0672i;
import K6.C0713c;
import N7.Z;
import T1.B;
import b9.C1992A;
import b9.q;
import c9.C2092m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.m;
import p9.InterfaceC5480a;
import z6.C5865d;

/* compiled from: DivTreeVisitor.kt */
/* loaded from: classes.dex */
public abstract class i<T> {

    /* compiled from: DivTreeVisitor.kt */
    public static final class a extends m implements InterfaceC5480a<List<? extends q<? extends Z, ? extends C0672i, ? extends C5865d>>> {

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ i<T> f38478g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ Z.b f38479h;
        public final /* synthetic */ C0672i i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ C5865d f38480j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(i<T> iVar, Z.b bVar, C0672i c0672i, C5865d c5865d) {
            super(0);
            this.f38478g = iVar;
            this.f38479h = bVar;
            this.i = c0672i;
            this.f38480j = c5865d;
        }

        @Override // p9.InterfaceC5480a
        public final List<? extends q<? extends Z, ? extends C0672i, ? extends C5865d>> invoke() {
            return i.a(this.f38478g, C4460a.h(this.f38479h.f7814c), this.i, this.f38480j);
        }
    }

    public static final ArrayList a(i iVar, List list, C0672i c0672i, C5865d c5865d) {
        iVar.getClass();
        List list2 = list;
        ArrayList arrayList = new ArrayList(C2092m.T(list2, 10));
        int i = 0;
        for (T t10 : list2) {
            int i10 = i + 1;
            if (i < 0) {
                C2092m.a0();
                throw null;
            }
            Z z10 = (Z) t10;
            arrayList.add(new q(z10, c0672i, C0713c.U(z10.d(), i, c5865d)));
            i = i10;
        }
        return arrayList;
    }

    public static final ArrayList c(i iVar, List list, C0672i c0672i, C5865d c5865d) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(C2092m.T(list2, 10));
        int i = 0;
        for (T t10 : list2) {
            int i10 = i + 1;
            if (i < 0) {
                C2092m.a0();
                throw null;
            }
            b bVar = (b) t10;
            arrayList.add(new q(bVar.f38460a, c0672i.a(bVar.f38461b), C0713c.U(bVar.f38460a.d(), i, c5865d)));
            i = i10;
        }
        return arrayList;
    }

    public abstract C1992A d(C0672i c0672i, Z z10, C5865d c5865d);

    /* JADX WARN: Multi-variable type inference failed */
    public final T e(Z data, C0672i c0672i, C5865d path, InterfaceC5480a<? extends List<? extends q<? extends Z, C0672i, C5865d>>> interfaceC5480a) {
        kotlin.jvm.internal.l.f(data, "data");
        kotlin.jvm.internal.l.f(path, "path");
        T t10 = (T) d(c0672i, data, path);
        Iterator<T> it = interfaceC5480a.invoke().iterator();
        while (it.hasNext()) {
            q qVar = (q) it.next();
            f((C0672i) qVar.f18094c, (Z) qVar.f18093b, (C5865d) qVar.f18095d);
        }
        return t10;
    }

    public final Object f(C0672i parentContext, Z div, C5865d path) {
        kotlin.jvm.internal.l.f(div, "div");
        kotlin.jvm.internal.l.f(parentContext, "parentContext");
        kotlin.jvm.internal.l.f(path, "path");
        C0672i c0672iG = B.g(parentContext, div, path);
        if (div instanceof Z.p) {
            return d(c0672iG, (Z.p) div, path);
        }
        if (div instanceof Z.f) {
            return d(c0672iG, (Z.f) div, path);
        }
        if (div instanceof Z.d) {
            return d(c0672iG, (Z.d) div, path);
        }
        if (div instanceof Z.k) {
            return d(c0672iG, (Z.k) div, path);
        }
        if (div instanceof Z.a) {
            Z.a aVar = (Z.a) div;
            return e(aVar, c0672iG, path, new c(this, aVar, c0672iG, path));
        }
        if (div instanceof Z.e) {
            Z.e eVar = (Z.e) div;
            return e(eVar, c0672iG, path, new d(this, eVar, c0672iG, path));
        }
        if (div instanceof Z.c) {
            Z.c cVar = (Z.c) div;
            return e(cVar, c0672iG, path, new e(this, cVar, c0672iG, path));
        }
        if (div instanceof Z.i) {
            Z.i iVar = (Z.i) div;
            return e(iVar, c0672iG, path, new f(this, iVar, c0672iG, path));
        }
        if (div instanceof Z.o) {
            Z.o oVar = (Z.o) div;
            return e(oVar, c0672iG, path, new g(oVar, c0672iG, path));
        }
        if (div instanceof Z.m) {
            Z.m mVar = (Z.m) div;
            return e(mVar, c0672iG, path, new h(mVar, c0672iG, path));
        }
        if (div instanceof Z.b) {
            return g((Z.b) div, c0672iG, path);
        }
        if (div instanceof Z.g) {
            return d(c0672iG, (Z.g) div, path);
        }
        if (div instanceof Z.l) {
            return d(c0672iG, (Z.l) div, path);
        }
        if (div instanceof Z.h) {
            return d(c0672iG, (Z.h) div, path);
        }
        if (div instanceof Z.j) {
            return d(c0672iG, (Z.j) div, path);
        }
        if (div instanceof Z.q) {
            return i((Z.q) div, c0672iG, path);
        }
        if (div instanceof Z.n) {
            return d(c0672iG, (Z.n) div, path);
        }
        throw new b9.j();
    }

    public T g(Z.b data, C0672i c0672i, C5865d path) {
        kotlin.jvm.internal.l.f(data, "data");
        kotlin.jvm.internal.l.f(path, "path");
        return e(data, c0672i, path, new a(this, data, c0672i, path));
    }

    public T i(Z.q data, C0672i c0672i, C5865d path) {
        kotlin.jvm.internal.l.f(data, "data");
        kotlin.jvm.internal.l.f(path, "path");
        return (T) d(c0672i, data, path);
    }
}
