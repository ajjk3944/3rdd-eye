package H;

import K.f;
import T.InterfaceC3551q0;
import T.t1;
import Zg.AbstractC3689v;
import androidx.compose.runtime.snapshots.g;
import c0.InterfaceC4182k;
import c0.InterfaceC4184m;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6835l;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: c, reason: collision with root package name */
    public static final a f7575c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f7576d = 8;

    /* renamed from: a, reason: collision with root package name */
    private final K.f f7577a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3551q0 f7578b;

    public static final class a {

        /* renamed from: H.p$a$a, reason: collision with other inner class name */
        public static final class C0303a implements InterfaceC4182k {

            /* renamed from: a, reason: collision with root package name */
            public static final C0303a f7579a = new C0303a();

            /* renamed from: b, reason: collision with root package name */
            private static final InterfaceC4182k f7580b;

            /* renamed from: c, reason: collision with root package name */
            public static final int f7581c;

            /* renamed from: H.p$a$a$a, reason: collision with other inner class name */
            public static final class C0304a implements InterfaceC4182k {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC4182k f7582a;

                public C0304a(InterfaceC4182k interfaceC4182k) {
                    this.f7582a = interfaceC4182k;
                }

                @Override // c0.InterfaceC4182k
                /* renamed from: c, reason: merged with bridge method [inline-methods] */
                public K.f a(Object obj) {
                    AbstractC6492s.g(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                    List list = (List) obj;
                    int iIntValue = ((Number) list.get(0)).intValue();
                    int iIntValue2 = ((Number) list.get(1)).intValue();
                    int iIntValue3 = ((Number) list.get(2)).intValue();
                    InterfaceC4182k interfaceC4182k = this.f7582a;
                    List listC = AbstractC3689v.c();
                    int i10 = 3;
                    while (i10 < iIntValue2 + 3) {
                        Object objA = interfaceC4182k.a(list.get(i10));
                        AbstractC6492s.f(objA);
                        listC.add(objA);
                        i10++;
                    }
                    List listA = AbstractC3689v.a(listC);
                    InterfaceC4182k interfaceC4182k2 = this.f7582a;
                    List listC2 = AbstractC3689v.c();
                    while (i10 < iIntValue2 + iIntValue3 + 3) {
                        Object objA2 = interfaceC4182k2.a(list.get(i10));
                        AbstractC6492s.f(objA2);
                        listC2.add(objA2);
                        i10++;
                    }
                    return new K.f(listA, AbstractC3689v.a(listC2), iIntValue);
                }

                @Override // c0.InterfaceC4182k
                /* renamed from: d, reason: merged with bridge method [inline-methods] */
                public Object b(InterfaceC4184m interfaceC4184m, K.f fVar) {
                    InterfaceC4182k interfaceC4182k = this.f7582a;
                    List listC = AbstractC3689v.c();
                    listC.add(Integer.valueOf(fVar.f10252a));
                    listC.add(Integer.valueOf(fVar.f10253b.size()));
                    listC.add(Integer.valueOf(fVar.f10254c.size()));
                    androidx.compose.runtime.snapshots.k kVar = fVar.f10253b;
                    int size = kVar.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        listC.add(interfaceC4182k.b(interfaceC4184m, kVar.get(i10)));
                    }
                    androidx.compose.runtime.snapshots.k kVar2 = fVar.f10254c;
                    int size2 = kVar2.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        listC.add(interfaceC4182k.b(interfaceC4184m, kVar2.get(i11)));
                    }
                    return AbstractC3689v.a(listC);
                }
            }

            static {
                f.a aVar = K.f.f10250d;
                f7580b = new C0304a(K.d.f10240i.a());
                f7581c = 8;
            }

            private C0303a() {
            }

            @Override // c0.InterfaceC4182k
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public p a(Object obj) {
                AbstractC6492s.g(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
                List list = (List) obj;
                Object obj2 = list.get(0);
                Object obj3 = list.get(1);
                K.d dVar = obj2 != null ? (K.d) K.d.f10240i.a().a(obj2) : null;
                InterfaceC4182k interfaceC4182k = f7580b;
                AbstractC6492s.f(obj3);
                K.f fVar = (K.f) interfaceC4182k.a(obj3);
                AbstractC6492s.f(fVar);
                return new p(dVar, fVar);
            }

            @Override // c0.InterfaceC4182k
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public Object b(InterfaceC4184m interfaceC4184m, p pVar) {
                K.d dVarG = pVar.g();
                return AbstractC3689v.o(dVarG != null ? K.d.f10240i.a().b(interfaceC4184m, dVarG) : null, f7580b.b(interfaceC4184m, pVar.f7577a));
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public p(K.d dVar, K.f fVar) {
        this.f7577a = fVar;
        this.f7578b = t1.d(dVar, null, 2, null);
    }

    private final void d() {
        g.a aVar = androidx.compose.runtime.snapshots.g.f28632e;
        androidx.compose.runtime.snapshots.g gVarD = aVar.d();
        InterfaceC6835l interfaceC6835lH = gVarD != null ? gVarD.h() : null;
        androidx.compose.runtime.snapshots.g gVarF = aVar.f(gVarD);
        try {
            K.d dVarG = g();
            if (dVarG != null) {
                this.f7577a.h(dVarG);
            }
            j(null);
        } finally {
            aVar.m(gVarD, gVarF, interfaceC6835lH);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final K.d g() {
        return (K.d) this.f7578b.getValue();
    }

    private final void j(K.d dVar) {
        this.f7578b.setValue(dVar);
    }

    public final void c() {
        j(null);
        this.f7577a.d();
    }

    public final boolean e() {
        return this.f7577a.e() && g() == null;
    }

    public final boolean f() {
        return this.f7577a.f() || g() != null;
    }

    public final void h(K.d dVar) {
        g.a aVar = androidx.compose.runtime.snapshots.g.f28632e;
        androidx.compose.runtime.snapshots.g gVarD = aVar.d();
        InterfaceC6835l interfaceC6835lH = gVarD != null ? gVarD.h() : null;
        androidx.compose.runtime.snapshots.g gVarF = aVar.f(gVarD);
        try {
            K.d dVarG = g();
            if (dVarG == null) {
                j(dVar);
                return;
            }
            K.d dVarB = q.b(dVarG, dVar);
            if (dVarB != null) {
                j(dVarB);
            } else {
                d();
                j(dVar);
            }
        } finally {
            aVar.m(gVarD, gVarF, interfaceC6835lH);
        }
    }

    public final void i(l lVar) {
        if (e()) {
            K.e.a(lVar, (K.d) this.f7577a.i());
        }
    }

    public final void k(l lVar) {
        if (f()) {
            d();
            K.e.b(lVar, (K.d) this.f7577a.j());
        }
    }

    public /* synthetic */ p(K.d dVar, K.f fVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : dVar, (i10 & 2) != 0 ? new K.f(null, null, 100, 3, null) : fVar);
    }
}
