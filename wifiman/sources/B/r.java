package B;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import c0.InterfaceC4176e;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4176e f995a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6824a f996b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f997c = new LinkedHashMap();

    private final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Object f998a;

        /* renamed from: b, reason: collision with root package name */
        private final Object f999b;

        /* renamed from: c, reason: collision with root package name */
        private int f1000c;

        /* renamed from: d, reason: collision with root package name */
        private InterfaceC6839p f1001d;

        /* renamed from: B.r$a$a, reason: collision with other inner class name */
        static final class C0037a extends AbstractC6494u implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ r f1003a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ a f1004b;

            /* renamed from: B.r$a$a$a, reason: collision with other inner class name */
            static final class C0038a extends AbstractC6494u implements InterfaceC6835l {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ a f1005a;

                /* renamed from: B.r$a$a$a$a, reason: collision with other inner class name */
                public static final class C0039a implements T.K {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ a f1006a;

                    public C0039a(a aVar) {
                        this.f1006a = aVar;
                    }

                    @Override // T.K
                    public void dispose() {
                        this.f1006a.f1001d = null;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0038a(a aVar) {
                    super(1);
                    this.f1005a = aVar;
                }

                @Override // mh.InterfaceC6835l
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final T.K invoke(T.L l10) {
                    return new C0039a(this.f1005a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0037a(r rVar, a aVar) {
                super(2);
                this.f1003a = rVar;
                this.f1004b = aVar;
            }

            public final void a(InterfaceC3540l interfaceC3540l, int i10) {
                if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(1403994769, i10, -1, "androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory.CachedItemContent.createContentLambda.<anonymous> (LazyLayoutItemContentFactory.kt:91)");
                }
                InterfaceC2455t interfaceC2455t = (InterfaceC2455t) this.f1003a.d().invoke();
                int iF = this.f1004b.f();
                if ((iF >= interfaceC2455t.a() || !AbstractC6492s.d(interfaceC2455t.b(iF), this.f1004b.g())) && (iF = interfaceC2455t.c(this.f1004b.g())) != -1) {
                    this.f1004b.f1000c = iF;
                }
                int i11 = iF;
                if (i11 != -1) {
                    interfaceC3540l.U(-660479623);
                    AbstractC2454s.a(interfaceC2455t, T.a(this.f1003a.f995a), i11, T.a(this.f1004b.g()), interfaceC3540l, 0);
                    interfaceC3540l.J();
                } else {
                    interfaceC3540l.U(-660272047);
                    interfaceC3540l.J();
                }
                Object objG = this.f1004b.g();
                boolean zL = interfaceC3540l.l(this.f1004b);
                a aVar = this.f1004b;
                Object objF = interfaceC3540l.f();
                if (zL || objF == InterfaceC3540l.f21100a.a()) {
                    objF = new C0038a(aVar);
                    interfaceC3540l.K(objF);
                }
                T.O.c(objG, (InterfaceC6835l) objF, interfaceC3540l, 0);
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.InterfaceC6839p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((InterfaceC3540l) obj, ((Number) obj2).intValue());
                return Yg.J.f24997a;
            }
        }

        public a(int i10, Object obj, Object obj2) {
            this.f998a = obj;
            this.f999b = obj2;
            this.f1000c = i10;
        }

        private final InterfaceC6839p c() {
            return b0.c.c(1403994769, true, new C0037a(r.this, this));
        }

        public final InterfaceC6839p d() {
            InterfaceC6839p interfaceC6839p = this.f1001d;
            if (interfaceC6839p != null) {
                return interfaceC6839p;
            }
            InterfaceC6839p interfaceC6839pC = c();
            this.f1001d = interfaceC6839pC;
            return interfaceC6839pC;
        }

        public final Object e() {
            return this.f999b;
        }

        public final int f() {
            return this.f1000c;
        }

        public final Object g() {
            return this.f998a;
        }
    }

    public r(InterfaceC4176e interfaceC4176e, InterfaceC6824a interfaceC6824a) {
        this.f995a = interfaceC4176e;
        this.f996b = interfaceC6824a;
    }

    public final InterfaceC6839p b(int i10, Object obj, Object obj2) {
        a aVar = (a) this.f997c.get(obj);
        if (aVar != null && aVar.f() == i10 && AbstractC6492s.d(aVar.e(), obj2)) {
            return aVar.d();
        }
        a aVar2 = new a(i10, obj, obj2);
        this.f997c.put(obj, aVar2);
        return aVar2.d();
    }

    public final Object c(Object obj) {
        if (obj == null) {
            return null;
        }
        a aVar = (a) this.f997c.get(obj);
        if (aVar != null) {
            return aVar.e();
        }
        InterfaceC2455t interfaceC2455t = (InterfaceC2455t) this.f996b.invoke();
        int iC = interfaceC2455t.c(obj);
        if (iC != -1) {
            return interfaceC2455t.d(iC);
        }
        return null;
    }

    public final InterfaceC6824a d() {
        return this.f996b;
    }
}
