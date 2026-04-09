package E8;

import E8.C2654b;
import E8.InterfaceC2653a;
import Zg.AbstractC3689v;
import ch.AbstractC4260a;
import gg.AbstractC5912b;
import gg.InterfaceC5913c;
import gg.InterfaceC5915e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kg.InterfaceC6465b;
import kg.InterfaceC6469f;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.M;
import mh.InterfaceC6835l;
import rd.b;

/* renamed from: E8.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2654b implements InterfaceC2653a {

    /* renamed from: a, reason: collision with root package name */
    private final rd.b f4133a;

    /* renamed from: b, reason: collision with root package name */
    private final Fg.a f4134b;

    /* renamed from: c, reason: collision with root package name */
    private final gg.i f4135c;

    /* renamed from: d, reason: collision with root package name */
    private final gg.i f4136d;

    /* renamed from: e, reason: collision with root package name */
    private final gg.i f4137e;

    /* renamed from: E8.b$a */
    static final class a implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final a f4138a = new a();

        a() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Set apply(Long it) {
            AbstractC6492s.i(it, "it");
            return new LinkedHashSet();
        }
    }

    /* renamed from: E8.b$b, reason: collision with other inner class name */
    static final class C0178b implements kg.n {

        /* renamed from: E8.b$b$a */
        static final class a implements InterfaceC6465b {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C2654b f4140a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ M f4141b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Set f4142c;

            a(C2654b c2654b, M m10, Set set) {
                this.f4140a = c2654b;
                this.f4141b = m10;
                this.f4142c = set;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final boolean c(List list, String seensId) {
                Object next;
                AbstractC6492s.i(seensId, "seensId");
                AbstractC6492s.f(list);
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (AbstractC6492s.d(((b.a) next).a(), seensId)) {
                        break;
                    }
                }
                return next == null;
            }

            @Override // kg.InterfaceC6465b
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final List apply(final List results, Long contentSeenTimestamp) {
                ArrayList arrayList;
                AbstractC6492s.i(results, "results");
                AbstractC6492s.i(contentSeenTimestamp, "contentSeenTimestamp");
                Fg.a aVar = this.f4140a.f4134b;
                M m10 = this.f4141b;
                Set set = this.f4142c;
                synchronized (aVar) {
                    try {
                        if (contentSeenTimestamp.longValue() != m10.f51688a) {
                            m10.f51688a = contentSeenTimestamp.longValue();
                            List list = results;
                            ArrayList arrayList2 = new ArrayList(AbstractC3689v.w(list, 10));
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(((b.a) it.next()).a());
                            }
                            set.addAll(arrayList2);
                        }
                        AbstractC6492s.f(set);
                        AbstractC3689v.I(set, new InterfaceC6835l() { // from class: E8.c
                            @Override // mh.InterfaceC6835l
                            public final Object invoke(Object obj) {
                                return Boolean.valueOf(C2654b.C0178b.a.c(results, (String) obj));
                            }
                        });
                        List<b.a> list2 = results;
                        arrayList = new ArrayList(AbstractC3689v.w(list2, 10));
                        for (b.a aVar2 : list2) {
                            arrayList.add(new InterfaceC2653a.AbstractC0176a.C0177a(aVar2, set.contains(aVar2.a())));
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return arrayList;
            }
        }

        C0178b() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(Set seenIds) {
            AbstractC6492s.i(seenIds, "seenIds");
            return gg.i.v(C2654b.this.f4133a.a(), C2654b.this.f4135c, new a(C2654b.this, new M(), seenIds));
        }
    }

    /* renamed from: E8.b$c */
    static final class c implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final c f4143a = new c();

        c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Comparable d(InterfaceC2653a.AbstractC0176a.C0177a it) {
            AbstractC6492s.i(it, "it");
            return Boolean.valueOf(it.b());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Comparable e(InterfaceC2653a.AbstractC0176a.C0177a it) {
            AbstractC6492s.i(it, "it");
            return it.a().d();
        }

        @Override // kg.n
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final List apply(List it) {
            AbstractC6492s.i(it, "it");
            return AbstractC3689v.X0(it, AbstractC4260a.c(new InterfaceC6835l() { // from class: E8.d
                @Override // mh.InterfaceC6835l
                public final Object invoke(Object obj) {
                    return C2654b.c.d((InterfaceC2653a.AbstractC0176a.C0177a) obj);
                }
            }, new InterfaceC6835l() { // from class: E8.e
                @Override // mh.InterfaceC6835l
                public final Object invoke(Object obj) {
                    return C2654b.c.e((InterfaceC2653a.AbstractC0176a.C0177a) obj);
                }
            }));
        }
    }

    /* renamed from: E8.b$d */
    public static final class d implements InterfaceC5915e {
        public d() {
        }

        @Override // gg.InterfaceC5915e
        public final void a(InterfaceC5913c interfaceC5913c) {
            try {
                C2654b.this.f4134b.h(Long.valueOf(System.currentTimeMillis()));
                interfaceC5913c.a();
            } catch (Throwable th2) {
                interfaceC5913c.onError(th2);
            }
        }
    }

    /* renamed from: E8.b$e */
    static final class e implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final e f4145a = new e();

        e() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC2653a.AbstractC0176a apply(List items) {
            Object next;
            AbstractC6492s.i(items, "items");
            Iterator it = items.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (!((InterfaceC2653a.AbstractC0176a.C0177a) next).b()) {
                    break;
                }
            }
            return next != null ? new InterfaceC2653a.AbstractC0176a.c(items) : InterfaceC2653a.AbstractC0176a.b.f4131a;
        }
    }

    /* renamed from: E8.b$f */
    static final class f implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final f f4146a = new f();

        f() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(InterfaceC2653a.AbstractC0176a it) {
            AbstractC6492s.i(it, "it");
            Z7.b.h("A2A Popup State: " + it, null, 2, null);
        }
    }

    public C2654b(rd.b discovery) {
        AbstractC6492s.i(discovery, "discovery");
        this.f4133a = discovery;
        Fg.a aVarK2 = Fg.a.k2(0L);
        AbstractC6492s.h(aVarK2, "createDefault(...)");
        this.f4134b = aVarK2;
        gg.i iVarI2 = aVarK2.W().e1().Y0(Gg.a.a(), false, 1).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f4135c = iVarI2;
        gg.i iVarI22 = gg.z.U(3000L, TimeUnit.MILLISECONDS).A(a.f4138a).w(new C0178b()).N0(c.f4143a).o1(1).i2();
        AbstractC6492s.h(iVarI22, "refCount(...)");
        this.f4136d = iVarI22;
        gg.i iVarI23 = iVarI22.N0(e.f4145a).W().f0(f.f4146a).o1(1).i2();
        AbstractC6492s.h(iVarI23, "refCount(...)");
        this.f4137e = iVarI23;
    }

    @Override // E8.InterfaceC2653a
    public AbstractC5912b a() {
        AbstractC5912b abstractC5912bR = AbstractC5912b.r(new d());
        AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
        return abstractC5912bR;
    }

    @Override // E8.InterfaceC2653a
    public gg.i getState() {
        return this.f4137e;
    }
}
