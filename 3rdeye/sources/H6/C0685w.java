package H6;

import N7.C1363t5;
import N7.C1447z5;
import N7.Ka;
import N7.N2;
import N7.Z;
import b9.C1992A;
import j6.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: DivImagePreloader.kt */
/* renamed from: H6.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0685w {

    /* renamed from: a, reason: collision with root package name */
    public final D9.G f2257a;

    /* compiled from: DivImagePreloader.kt */
    /* renamed from: H6.w$a */
    public final class a extends i7.j<C1992A> {

        /* renamed from: a, reason: collision with root package name */
        public final q.b f2258a;

        /* renamed from: b, reason: collision with root package name */
        public final A7.d f2259b;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList<w6.e> f2260c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ C0685w f2261d;

        public a(C0685w c0685w, q.b bVar, A7.d resolver) {
            kotlin.jvm.internal.l.f(resolver, "resolver");
            this.f2261d = c0685w;
            this.f2258a = bVar;
            this.f2259b = resolver;
            this.f2260c = new ArrayList<>();
        }

        @Override // i7.j
        public final /* bridge */ /* synthetic */ C1992A a(Z z10, A7.d dVar) {
            o(z10, dVar);
            return C1992A.f18074a;
        }

        @Override // i7.j
        public final C1992A b(Z.a data, A7.d dVar) {
            kotlin.jvm.internal.l.f(data, "data");
            o(data, dVar);
            return C1992A.f18074a;
        }

        @Override // i7.j
        public final C1992A d(Z.c data, A7.d dVar) {
            kotlin.jvm.internal.l.f(data, "data");
            o(data, dVar);
            return C1992A.f18074a;
        }

        @Override // i7.j
        public final C1992A e(Z.d data, A7.d dVar) {
            kotlin.jvm.internal.l.f(data, "data");
            o(data, dVar);
            C1363t5 c1363t5 = data.f7816c;
            if (c1363t5.f9229E.a(dVar).booleanValue()) {
                String string = c1363t5.f9269u.a(dVar).toString();
                kotlin.jvm.internal.l.e(string, "data.value.gifUrl.evaluate(resolver).toString()");
                ArrayList<w6.e> arrayList = this.f2260c;
                C0685w c0685w = this.f2261d;
                q.b bVar = this.f2258a;
                arrayList.add(c0685w.f2257a.loadImageBytes(string, bVar));
                if (o7.d.a()) {
                    bVar.f43047b++;
                } else {
                    o7.d.f44878a.post(new C2.f(bVar, 4));
                }
            }
            return C1992A.f18074a;
        }

        @Override // i7.j
        public final C1992A f(Z.e data, A7.d dVar) {
            kotlin.jvm.internal.l.f(data, "data");
            o(data, dVar);
            return C1992A.f18074a;
        }

        @Override // i7.j
        public final C1992A g(Z.f data, A7.d dVar) {
            kotlin.jvm.internal.l.f(data, "data");
            o(data, dVar);
            C1447z5 c1447z5 = data.f7818c;
            if (c1447z5.f10041H.a(dVar).booleanValue()) {
                String string = c1447z5.f10035B.a(dVar).toString();
                kotlin.jvm.internal.l.e(string, "data.value.imageUrl.evaluate(resolver).toString()");
                ArrayList<w6.e> arrayList = this.f2260c;
                C0685w c0685w = this.f2261d;
                q.b bVar = this.f2258a;
                arrayList.add(c0685w.f2257a.loadImage(string, bVar));
                if (o7.d.a()) {
                    bVar.f43047b++;
                } else {
                    o7.d.f44878a.post(new C2.f(bVar, 4));
                }
            }
            return C1992A.f18074a;
        }

        @Override // i7.j
        public final C1992A h(Z.i data, A7.d dVar) {
            kotlin.jvm.internal.l.f(data, "data");
            o(data, dVar);
            return C1992A.f18074a;
        }

        @Override // i7.j
        public final C1992A j(Z.m data, A7.d dVar) {
            kotlin.jvm.internal.l.f(data, "data");
            o(data, dVar);
            return C1992A.f18074a;
        }

        @Override // i7.j
        public final C1992A k(Z.o data, A7.d dVar) {
            kotlin.jvm.internal.l.f(data, "data");
            o(data, dVar);
            return C1992A.f18074a;
        }

        @Override // i7.j
        public final C1992A l(Z.p data, A7.d dVar) {
            kotlin.jvm.internal.l.f(data, "data");
            o(data, dVar);
            List<Ka.b> list = data.f7828c.f5632F;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    String string = ((Ka.b) it.next()).i.a(dVar).toString();
                    kotlin.jvm.internal.l.e(string, "it.url.evaluate(resolver).toString()");
                    ArrayList<w6.e> arrayList = this.f2260c;
                    C0685w c0685w = this.f2261d;
                    q.b bVar = this.f2258a;
                    arrayList.add(c0685w.f2257a.loadImage(string, bVar));
                    if (o7.d.a()) {
                        bVar.f43047b++;
                    } else {
                        o7.d.f44878a.post(new C2.f(bVar, 4));
                    }
                }
            }
            return C1992A.f18074a;
        }

        public final void o(Z data, A7.d resolver) {
            kotlin.jvm.internal.l.f(data, "data");
            kotlin.jvm.internal.l.f(resolver, "resolver");
            List<N2> listB = data.d().b();
            if (listB != null) {
                for (N2 n22 : listB) {
                    if (n22 instanceof N2.a) {
                        N2.a background = (N2.a) n22;
                        kotlin.jvm.internal.l.f(background, "background");
                        if (background.f5887b.f4769f.a(resolver).booleanValue()) {
                            String string = ((N2.a) n22).f5887b.f4768e.a(resolver).toString();
                            kotlin.jvm.internal.l.e(string, "background.value.imageUr…uate(resolver).toString()");
                            ArrayList<w6.e> arrayList = this.f2260c;
                            C0685w c0685w = this.f2261d;
                            q.b bVar = this.f2258a;
                            arrayList.add(c0685w.f2257a.loadImage(string, bVar));
                            if (o7.d.a()) {
                                bVar.f43047b++;
                            } else {
                                o7.d.f44878a.post(new C2.f(bVar, 4));
                            }
                        }
                    }
                }
            }
        }
    }

    public C0685w(D9.G imageLoader) {
        kotlin.jvm.internal.l.f(imageLoader, "imageLoader");
        this.f2257a = imageLoader;
    }

    public final ArrayList a(Z div, A7.d resolver, q.b bVar) {
        kotlin.jvm.internal.l.f(div, "div");
        kotlin.jvm.internal.l.f(resolver, "resolver");
        a aVar = new a(this, bVar, resolver);
        aVar.n(div, resolver);
        return aVar.f2260c;
    }
}
