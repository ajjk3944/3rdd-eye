package q7;

import Yg.J;
import Zg.AbstractC3689v;
import gg.AbstractC5912b;
import gg.InterfaceC5913c;
import gg.InterfaceC5915e;
import gg.f;
import gg.i;
import gg.y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kg.n;
import kg.p;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6824a;
import r7.C7577a;
import s7.C7920g;
import s7.j;
import v7.g;
import v7.h;

/* renamed from: q7.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7431a implements InterfaceC7433c {

    /* renamed from: a, reason: collision with root package name */
    private final y f58457a;

    /* renamed from: b, reason: collision with root package name */
    private final v7.e f58458b;

    /* renamed from: c, reason: collision with root package name */
    private final Fg.c f58459c;

    /* renamed from: d, reason: collision with root package name */
    private final Fg.a f58460d;

    /* renamed from: e, reason: collision with root package name */
    private final Fg.c f58461e;

    /* renamed from: f, reason: collision with root package name */
    private final AbstractC5912b f58462f;

    /* renamed from: g, reason: collision with root package name */
    private final AbstractC5912b f58463g;

    /* renamed from: h, reason: collision with root package name */
    private final AbstractC5912b f58464h;

    /* renamed from: i, reason: collision with root package name */
    private final i f58465i;

    /* renamed from: j, reason: collision with root package name */
    private final i f58466j;

    /* renamed from: q7.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC2054a {

        /* renamed from: q7.a$a$a, reason: collision with other inner class name */
        public static final class C2055a extends AbstractC2054a {

            /* renamed from: a, reason: collision with root package name */
            public static final C2055a f58467a = new C2055a();

            private C2055a() {
                super(null);
            }
        }

        /* renamed from: q7.a$a$b */
        public static final class b extends AbstractC2054a {

            /* renamed from: a, reason: collision with root package name */
            private final C7577a f58468a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(C7577a result) {
                super(null);
                AbstractC6492s.i(result, "result");
                this.f58468a = result;
            }

            public final C7577a a() {
                return this.f58468a;
            }
        }

        public /* synthetic */ AbstractC2054a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AbstractC2054a() {
        }
    }

    /* renamed from: q7.a$b */
    public static final class b implements InterfaceC5915e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C7920g f58469a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C7431a f58470b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C7577a f58471c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f58472d;

        public b(C7920g c7920g, C7431a c7431a, C7577a c7577a, long j10) {
            this.f58469a = c7920g;
            this.f58470b = c7431a;
            this.f58471c = c7577a;
            this.f58472d = j10;
        }

        @Override // gg.InterfaceC5915e
        public final void a(InterfaceC5913c it) {
            AbstractC6492s.i(it, "it");
            if (!this.f58469a.c().b()) {
                synchronized (this.f58470b.f58458b) {
                    this.f58470b.f58458b.b(this.f58472d, this.f58471c);
                    J j10 = J.f24997a;
                }
                this.f58470b.f58459c.k2(new AbstractC2054a.b(this.f58471c));
            }
            it.a();
        }
    }

    /* renamed from: q7.a$c */
    static final class c implements n {

        /* renamed from: q7.a$c$a, reason: collision with other inner class name */
        public static final class C2056a implements InterfaceC5915e {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C7431a f58474a;

            public C2056a(C7431a c7431a) {
                this.f58474a = c7431a;
            }

            @Override // gg.InterfaceC5915e
            public final void a(InterfaceC5913c it) {
                AbstractC6492s.i(it, "it");
                this.f58474a.f58459c.h(AbstractC2054a.C2055a.f58467a);
                it.a();
            }
        }

        c() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final f apply(J it) {
            AbstractC6492s.i(it, "it");
            AbstractC5912b abstractC5912bR = AbstractC5912b.r(new C2056a(C7431a.this));
            AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…       it\n        }\n    }");
            return abstractC5912bR;
        }
    }

    /* renamed from: q7.a$d */
    static final class d implements p {

        /* renamed from: a, reason: collision with root package name */
        public static final d f58475a = new d();

        d() {
        }

        @Override // kg.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final boolean test(List it) {
            AbstractC6492s.i(it, "it");
            return !it.isEmpty();
        }
    }

    /* renamed from: q7.a$e */
    static final class e implements n {

        /* renamed from: q7.a$e$a, reason: collision with other inner class name */
        static final class C2057a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            public static final C2057a f58477a = new C2057a();

            C2057a() {
                super(0);
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Discovery result not found in processed map";
            }
        }

        /* renamed from: q7.a$e$b */
        public static final class b implements InterfaceC5915e {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C7431a f58478a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ List f58479b;

            public b(C7431a c7431a, List list) {
                this.f58478a = c7431a;
                this.f58479b = list;
            }

            @Override // gg.InterfaceC5915e
            public final void a(InterfaceC5913c it) {
                AbstractC6492s.i(it, "it");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                synchronized (this.f58478a.f58458b) {
                    try {
                        for (C7577a c7577a : this.f58478a.f58458b.a()) {
                            j jVar = (j) linkedHashMap.get(((C7920g) c7577a.c()).c().a());
                            if (jVar != null) {
                                jVar.i((C7920g) c7577a.c(), c7577a.b());
                            } else {
                                j jVar2 = new j(((C7920g) c7577a.c()).c());
                                jVar2.i((C7920g) c7577a.c(), c7577a.b());
                                linkedHashMap.put(((C7920g) c7577a.c()).c().a(), jVar2);
                            }
                        }
                        J j10 = J.f24997a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                for (AbstractC2054a abstractC2054a : this.f58479b) {
                    if (abstractC2054a instanceof AbstractC2054a.b) {
                        j jVar3 = (j) linkedHashMap.get(((C7920g) ((AbstractC2054a.b) abstractC2054a).a().c()).c().a());
                        if (jVar3 != null) {
                            this.f58478a.f58461e.k2(jVar3.h());
                        } else {
                            v7.d.d(C2057a.f58477a, null, 2, null);
                        }
                    }
                }
                Collection collectionValues = linkedHashMap.values();
                ArrayList arrayList = new ArrayList(AbstractC3689v.w(collectionValues, 10));
                Iterator it2 = collectionValues.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((j) it2.next()).h());
                }
                this.f58478a.f58460d.m2(arrayList);
                it.a();
            }
        }

        e() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final f apply(List events) {
            AbstractC6492s.i(events, "events");
            AbstractC5912b abstractC5912bR = AbstractC5912b.r(new b(C7431a.this, events));
            AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…       it\n        }\n    }");
            return abstractC5912bR;
        }
    }

    public C7431a(long j10, y resultsScheduler, y timedScheduler, g cacheFactory) {
        AbstractC6492s.i(resultsScheduler, "resultsScheduler");
        AbstractC6492s.i(timedScheduler, "timedScheduler");
        AbstractC6492s.i(cacheFactory, "cacheFactory");
        this.f58457a = resultsScheduler;
        v7.e eVarA = cacheFactory.a(timedScheduler);
        this.f58458b = eVarA;
        Fg.c cVarJ2 = Fg.c.j2();
        AbstractC6492s.h(cVarJ2, "create<ResultsEvent>()");
        this.f58459c = cVarJ2;
        Fg.a aVarK2 = Fg.a.k2(AbstractC3689v.l());
        AbstractC6492s.h(aVarK2, "createDefault<List<Device>>(emptyList())");
        this.f58460d = aVarK2;
        Fg.c cVarJ22 = Fg.c.j2();
        AbstractC6492s.h(cVarJ22, "create<Device>()");
        this.f58461e = cVarJ22;
        AbstractC5912b abstractC5912bT0 = eVarA.c().t0(new c());
        AbstractC6492s.h(abstractC5912bT0, "discoveryResultsCache.ex…          }\n            }");
        this.f58462f = abstractC5912bT0;
        AbstractC5912b abstractC5912bT02 = cVarJ2.e(j10, TimeUnit.MILLISECONDS, timedScheduler).e1().X0(resultsScheduler).m0(d.f58475a).t0(new e());
        AbstractC6492s.h(abstractC5912bT02, "resultsEventProcessor\n  …          }\n            }");
        this.f58463g = abstractC5912bT02;
        AbstractC5912b abstractC5912bH = AbstractC5912b.H(AbstractC3689v.o(abstractC5912bT0, abstractC5912bT02));
        AbstractC6492s.h(abstractC5912bH, "merge(\n            listO…r\n            )\n        )");
        this.f58464h = abstractC5912bH;
        i iVarU0 = aVarK2.U0(abstractC5912bH);
        AbstractC6492s.h(iVarU0, "allDevicesProcessor\n    …mergeWith(eventProcessor)");
        this.f58465i = iVarU0;
        i iVarU02 = cVarJ22.U0(abstractC5912bH);
        AbstractC6492s.h(iVarU02, "lastDeviceProcessor\n    …mergeWith(eventProcessor)");
        this.f58466j = iVarU02;
    }

    @Override // q7.InterfaceC7433c
    public AbstractC5912b a(C7920g result, long j10, C7577a priority) {
        AbstractC6492s.i(result, "result");
        AbstractC6492s.i(priority, "priority");
        AbstractC5912b abstractC5912bR = AbstractC5912b.r(new b(result, this, priority, j10));
        AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…       it\n        }\n    }");
        AbstractC5912b abstractC5912bW = abstractC5912bR.W(this.f58457a);
        AbstractC6492s.h(abstractC5912bW, "complete {\n            i…cribeOn(resultsScheduler)");
        return abstractC5912bW;
    }

    @Override // q7.InterfaceC7433c
    public i b() {
        return this.f58465i;
    }

    @Override // q7.InterfaceC7433c
    public i c() {
        return this.f58466j;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C7431a(long j10, y yVar, y TIMED_SCHEDULER, g gVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i10 & 4) != 0) {
            TIMED_SCHEDULER = AbstractC7432b.b();
            AbstractC6492s.h(TIMED_SCHEDULER, "TIMED_SCHEDULER");
        }
        this(j10, yVar, TIMED_SCHEDULER, (i10 & 8) != 0 ? new h() : gVar);
    }
}
