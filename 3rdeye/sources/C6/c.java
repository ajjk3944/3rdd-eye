package C6;

import N7.X9;
import N7.Z;
import b9.C1992A;
import c9.AbstractC2081b;
import c9.C2087h;
import c9.C2092m;
import c9.C2099t;
import i7.C4460a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: DivTreeWalk.kt */
/* loaded from: classes.dex */
public final class c implements x9.g<i7.b> {

    /* renamed from: a, reason: collision with root package name */
    public final Z f929a;

    /* renamed from: b, reason: collision with root package name */
    public final A7.d f930b;

    /* renamed from: c, reason: collision with root package name */
    public final kotlin.jvm.internal.m f931c;

    /* renamed from: d, reason: collision with root package name */
    public final kotlin.jvm.internal.m f932d;

    /* compiled from: DivTreeWalk.kt */
    public static final class a implements d {

        /* renamed from: a, reason: collision with root package name */
        public final i7.b f933a;

        /* renamed from: b, reason: collision with root package name */
        public final kotlin.jvm.internal.m f934b;

        /* renamed from: c, reason: collision with root package name */
        public final kotlin.jvm.internal.m f935c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f936d;

        /* renamed from: e, reason: collision with root package name */
        public Object f937e;

        /* renamed from: f, reason: collision with root package name */
        public int f938f;

        /* JADX WARN: Multi-variable type inference failed */
        public a(i7.b bVar, p9.l<? super Z, Boolean> lVar, p9.l<? super Z, C1992A> lVar2) {
            this.f933a = bVar;
            this.f934b = (kotlin.jvm.internal.m) lVar;
            this.f935c = (kotlin.jvm.internal.m) lVar2;
        }

        @Override // C6.c.d
        public final i7.b getItem() {
            return this.f933a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r0v3, types: [kotlin.jvm.internal.m, p9.l] */
        /* JADX WARN: Type inference failed for: r0v52, types: [kotlin.jvm.internal.m, p9.l] */
        /* JADX WARN: Type inference failed for: r0v62 */
        /* JADX WARN: Type inference failed for: r0v63 */
        /* JADX WARN: Type inference failed for: r4v1, types: [c9.t] */
        /* JADX WARN: Type inference failed for: r4v4, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r4v5 */
        @Override // C6.c.d
        public final i7.b x() {
            Collection collectionK;
            boolean z10 = this.f936d;
            i7.b bVar = this.f933a;
            Z z11 = bVar.f38460a;
            if (z10) {
                Object obj = this.f937e;
                ?? r02 = obj;
                if (obj == null) {
                    boolean z12 = z11 instanceof Z.p;
                    ?? arrayList = C2099t.f18581b;
                    if (z12 || (z11 instanceof Z.f) || (z11 instanceof Z.d) || (z11 instanceof Z.k) || (z11 instanceof Z.g) || (z11 instanceof Z.l) || (z11 instanceof Z.h) || (z11 instanceof Z.b) || (z11 instanceof Z.j) || (z11 instanceof Z.q) || (z11 instanceof Z.n)) {
                        collectionK = arrayList;
                        this.f937e = collectionK;
                        r02 = collectionK;
                    } else {
                        boolean z13 = z11 instanceof Z.a;
                        A7.d resolver = bVar.f38461b;
                        if (z13) {
                            collectionK = C4460a.b(((Z.a) z11).f7813c, resolver);
                        } else if (z11 instanceof Z.e) {
                            collectionK = C4460a.j(((Z.e) z11).f7817c, resolver);
                        } else if (z11 instanceof Z.c) {
                            collectionK = C4460a.c(((Z.c) z11).f7815c, resolver);
                        } else if (z11 instanceof Z.i) {
                            collectionK = C4460a.d(((Z.i) z11).f7821c, resolver);
                        } else if (z11 instanceof Z.o) {
                            collectionK = C4460a.k(((Z.o) z11).f7827c, resolver);
                        } else {
                            if (!(z11 instanceof Z.m)) {
                                throw new b9.j();
                            }
                            X9 x92 = ((Z.m) z11).f7825c;
                            kotlin.jvm.internal.l.f(x92, "<this>");
                            kotlin.jvm.internal.l.f(resolver, "resolver");
                            List<X9.a> list = x92.f7743y;
                            arrayList = new ArrayList();
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                Z z14 = ((X9.a) it.next()).f7747c;
                                i7.b bVarM = z14 != null ? C4460a.m(z14, resolver) : null;
                                if (bVarM != null) {
                                    arrayList.add(bVarM);
                                }
                            }
                            collectionK = arrayList;
                        }
                        this.f937e = collectionK;
                        r02 = collectionK;
                    }
                }
                if (this.f938f < r02.size()) {
                    int i = this.f938f;
                    this.f938f = i + 1;
                    return (i7.b) r02.get(i);
                }
                ?? r03 = this.f935c;
                if (r03 != 0) {
                    r03.invoke(z11);
                }
            } else {
                ?? r04 = this.f934b;
                if (r04 == 0 || ((Boolean) r04.invoke(z11)).booleanValue()) {
                    this.f936d = true;
                    return bVar;
                }
            }
            return null;
        }
    }

    /* compiled from: DivTreeWalk.kt */
    public final class b extends AbstractC2081b<i7.b> {

        /* renamed from: d, reason: collision with root package name */
        public final A7.d f939d;

        /* renamed from: e, reason: collision with root package name */
        public final C2087h<d> f940e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ c f941f;

        /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.internal.m, p9.l] */
        /* JADX WARN: Type inference failed for: r3v1, types: [kotlin.jvm.internal.m, p9.l] */
        public b(c cVar, Z root, A7.d resolver) {
            kotlin.jvm.internal.l.f(root, "root");
            kotlin.jvm.internal.l.f(resolver, "resolver");
            this.f941f = cVar;
            this.f939d = resolver;
            C2087h<d> c2087h = new C2087h<>();
            i7.b bVarM = C4460a.m(root, resolver);
            c2087h.e(e.e(bVarM.f38460a) ? new a(bVarM, cVar.f931c, cVar.f932d) : new C0006c(bVarM));
            this.f940e = c2087h;
        }

        /* JADX WARN: Type inference failed for: r3v3, types: [kotlin.jvm.internal.m, p9.l] */
        /* JADX WARN: Type inference failed for: r4v3, types: [kotlin.jvm.internal.m, p9.l] */
        public final i7.b a() {
            C2087h<d> c2087h = this.f940e;
            d dVar = (d) (c2087h.isEmpty() ? null : c2087h.f18573c[c2087h.l(C2092m.V(c2087h) + c2087h.f18572b)]);
            if (dVar == null) {
                return null;
            }
            i7.b bVarX = dVar.x();
            if (bVarX == null) {
                c2087h.o();
                return a();
            }
            if (bVarX != dVar.getItem()) {
                Z z10 = bVarX.f38460a;
                kotlin.jvm.internal.l.f(z10, "<this>");
                if (e.e(z10)) {
                    int i = c2087h.f18574d;
                    c cVar = this.f941f;
                    cVar.getClass();
                    if (i < Integer.MAX_VALUE) {
                        c2087h.e(e.e(z10) ? new a(bVarX, cVar.f931c, cVar.f932d) : new C0006c(bVarX));
                        return a();
                    }
                }
            }
            return bVarX;
        }
    }

    /* compiled from: DivTreeWalk.kt */
    /* renamed from: C6.c$c, reason: collision with other inner class name */
    public static final class C0006c implements d {

        /* renamed from: a, reason: collision with root package name */
        public final i7.b f942a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f943b;

        public C0006c(i7.b bVar) {
            this.f942a = bVar;
        }

        @Override // C6.c.d
        public final i7.b getItem() {
            return this.f942a;
        }

        @Override // C6.c.d
        public final i7.b x() {
            if (this.f943b) {
                return null;
            }
            this.f943b = true;
            return this.f942a;
        }
    }

    /* compiled from: DivTreeWalk.kt */
    public interface d {
        i7.b getItem();

        i7.b x();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(Z z10, A7.d dVar, p9.l lVar, p9.l lVar2) {
        this.f929a = z10;
        this.f930b = dVar;
        this.f931c = (kotlin.jvm.internal.m) lVar;
        this.f932d = (kotlin.jvm.internal.m) lVar2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.internal.m, p9.l] */
    public final c b(p9.l<? super Z, Boolean> predicate) {
        kotlin.jvm.internal.l.f(predicate, "predicate");
        return new c(this.f929a, this.f930b, predicate, this.f932d);
    }

    @Override // x9.g
    public final Iterator<i7.b> iterator() {
        return new b(this, this.f929a, this.f930b);
    }
}
