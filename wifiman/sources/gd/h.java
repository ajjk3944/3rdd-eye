package gd;

import Zg.AbstractC3689v;
import Zg.Q;
import gd.C5896a;
import gd.g;
import gd.h;
import gg.y;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import kg.InterfaceC6469f;
import kg.n;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import sh.AbstractC7978m;
import sh.C7974i;

/* loaded from: classes4.dex */
public final class h implements g {

    /* renamed from: c, reason: collision with root package name */
    public static final a f47847c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final C5896a.b f47848a;

    /* renamed from: b, reason: collision with root package name */
    private final y f47849b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static final class b implements n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AtomicInteger f47851b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f47852c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ g.b.C1781b f47853d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ CopyOnWriteArraySet f47854e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ AtomicInteger f47855f;

        static final class a implements InterfaceC6469f {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ h f47856a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ g.b.C1781b f47857b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ CopyOnWriteArraySet f47858c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ AtomicInteger f47859d;

            a(h hVar, g.b.C1781b c1781b, CopyOnWriteArraySet copyOnWriteArraySet, AtomicInteger atomicInteger) {
                this.f47856a = hVar;
                this.f47857b = c1781b;
                this.f47858c = copyOnWriteArraySet;
                this.f47859d = atomicInteger;
            }

            @Override // kg.InterfaceC6469f
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void accept(Integer portToCheck) {
                AbstractC6492s.i(portToCheck, "portToCheck");
                if (this.f47856a.f(this.f47857b.a(), portToCheck.intValue(), this.f47856a.h(portToCheck.intValue()))) {
                    this.f47858c.add(portToCheck);
                }
                this.f47859d.incrementAndGet();
            }
        }

        /* renamed from: gd.h$b$b, reason: collision with other inner class name */
        static final class C1782b implements n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C5896a.InterfaceC1778a f47860a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AtomicInteger f47861b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f47862c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ g.b.C1781b f47863d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ CopyOnWriteArraySet f47864e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ h f47865f;

            C1782b(C5896a.InterfaceC1778a interfaceC1778a, AtomicInteger atomicInteger, int i10, g.b.C1781b c1781b, CopyOnWriteArraySet copyOnWriteArraySet, h hVar) {
                this.f47860a = interfaceC1778a;
                this.f47861b = atomicInteger;
                this.f47862c = i10;
                this.f47863d = c1781b;
                this.f47864e = copyOnWriteArraySet;
                this.f47865f = hVar;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final g.b apply(Integer it) {
                AbstractC6492s.i(it, "it");
                AtomicInteger atomicInteger = this.f47861b;
                int i10 = this.f47862c;
                g.b.C1781b c1781b = this.f47863d;
                CopyOnWriteArraySet copyOnWriteArraySet = this.f47864e;
                h hVar = this.f47865f;
                C5896a.InterfaceC1778a interfaceC1778a = this.f47860a;
                AbstractC6492s.f(interfaceC1778a);
                return h.i(atomicInteger, i10, c1781b, copyOnWriteArraySet, hVar, interfaceC1778a);
            }
        }

        b(AtomicInteger atomicInteger, int i10, g.b.C1781b c1781b, CopyOnWriteArraySet copyOnWriteArraySet, AtomicInteger atomicInteger2) {
            this.f47851b = atomicInteger;
            this.f47852c = i10;
            this.f47853d = c1781b;
            this.f47854e = copyOnWriteArraySet;
            this.f47855f = atomicInteger2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(AtomicInteger atomicInteger, int i10, gg.h emitter) {
            AbstractC6492s.i(emitter, "emitter");
            int andIncrement = atomicInteger.getAndIncrement();
            if (andIncrement > i10) {
                emitter.a();
            } else {
                emitter.h(Integer.valueOf(andIncrement));
            }
        }

        @Override // kg.n
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(C5896a.InterfaceC1778a knownServices) {
            AbstractC6492s.i(knownServices, "knownServices");
            C7974i c7974iS = AbstractC7978m.s(0, 50);
            h hVar = h.this;
            final AtomicInteger atomicInteger = this.f47851b;
            final int i10 = this.f47852c;
            g.b.C1781b c1781b = this.f47853d;
            CopyOnWriteArraySet copyOnWriteArraySet = this.f47854e;
            AtomicInteger atomicInteger2 = this.f47855f;
            ArrayList arrayList = new ArrayList(AbstractC3689v.w(c7974iS, 10));
            Iterator it = c7974iS.iterator();
            while (it.hasNext()) {
                ((Q) it).d();
                arrayList.add(gg.i.C0(new InterfaceC6469f() { // from class: gd.i
                    @Override // kg.InterfaceC6469f
                    public final void accept(Object obj) {
                        h.b.c(atomicInteger, i10, (gg.h) obj);
                    }
                }).f0(new a(hVar, c1781b, copyOnWriteArraySet, atomicInteger2)).F1(hVar.f47849b));
            }
            return gg.i.S0(arrayList).z1(-1).N0(new C1782b(knownServices, this.f47855f, this.f47852c, this.f47853d, this.f47854e, h.this)).e1().Y0(Gg.a.a(), false, 1).W();
        }
    }

    public h(C5896a.b servicesLookupManager, y scheduler) {
        AbstractC6492s.i(servicesLookupManager, "servicesLookupManager");
        AbstractC6492s.i(scheduler, "scheduler");
        this.f47848a = servicesLookupManager;
        this.f47849b = scheduler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean f(String str, int i10, int i11) throws IOException {
        try {
            Socket socket = new Socket();
            socket.connect(new InetSocketAddress(str, i10), i11);
            socket.close();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    private final C5896a g(int i10, C5896a.InterfaceC1778a interfaceC1778a) {
        C5896a c5896aA = interfaceC1778a.a(i10);
        return c5896aA == null ? new C5896a(i10, null, null, null) : c5896aA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g.b i(AtomicInteger atomicInteger, int i10, g.b.C1781b c1781b, CopyOnWriteArraySet copyOnWriteArraySet, h hVar, C5896a.InterfaceC1778a interfaceC1778a) {
        TreeMap treeMap = new TreeMap();
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            AbstractC6492s.f(num);
            treeMap.put(num, hVar.g(num.intValue(), interfaceC1778a));
        }
        return atomicInteger.get() >= i10 ? new g.b.a(c1781b.a(), i10, treeMap) : new g.b.C1781b(c1781b.a(), atomicInteger.get(), i10, treeMap);
    }

    @Override // gd.g
    public gg.i a(String host, C7974i portRange) {
        AbstractC6492s.i(host, "host");
        AbstractC6492s.i(portRange, "portRange");
        if (portRange.i() < 0) {
            throw new IllegalStateException("port range start must be positive");
        }
        if (portRange.i() > portRange.j()) {
            throw new IllegalStateException("start port must be lower or equal to end port");
        }
        if (portRange.j() <= 65535) {
            return b(new g.b.C1781b(host, 0, portRange.j(), new TreeMap()));
        }
        throw new IllegalStateException("port range end must be lower than port count 65535");
    }

    @Override // gd.g
    public gg.i b(g.b.C1781b from) {
        AbstractC6492s.i(from, "from");
        AtomicInteger atomicInteger = new AtomicInteger(from.d());
        int iB = from.b();
        AtomicInteger atomicInteger2 = new AtomicInteger(from.d());
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        Iterator it = from.e().entrySet().iterator();
        while (it.hasNext()) {
            copyOnWriteArraySet.add(Integer.valueOf(((C5896a) ((Map.Entry) it.next()).getValue()).b()));
        }
        gg.i iVarW = this.f47848a.a().w(new b(atomicInteger, iB, from, copyOnWriteArraySet, atomicInteger2));
        AbstractC6492s.h(iVarW, "flatMapPublisher(...)");
        return iVarW;
    }

    public final int h(int i10) {
        return 200;
    }
}
