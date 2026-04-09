package y8;

import Cc.InterfaceC2557a;
import Zg.AbstractC3689v;
import a8.C3771a;
import a8.C3772b;
import ch.AbstractC4260a;
import hd.AbstractC5975a;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kg.InterfaceC6465b;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nd.C6934f;
import nd.InterfaceC6935g;
import y8.AbstractC8627a;

/* loaded from: classes3.dex */
public final class b implements AbstractC8627a.b {

    /* renamed from: d, reason: collision with root package name */
    public static final a f66425d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    public static final int f66426e = 8;

    /* renamed from: a, reason: collision with root package name */
    private final gg.i f66427a;

    /* renamed from: b, reason: collision with root package name */
    private final gg.i f66428b;

    /* renamed from: c, reason: collision with root package name */
    private final gg.i f66429c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: y8.b$b, reason: collision with other inner class name */
    static final class C2358b implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        public static final C2358b f66430a = new C2358b();

        /* renamed from: y8.b$b$a */
        public static final class a implements Comparator {
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return AbstractC4260a.e(Long.valueOf(((AbstractC8627a) obj).a()), Long.valueOf(((AbstractC8627a) obj2).a()));
            }
        }

        C2358b() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List apply(List places, List roaming) {
            AbstractC6492s.i(places, "places");
            AbstractC6492s.i(roaming, "roaming");
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(places);
            arrayList.addAll(roaming);
            if (arrayList.size() > 1) {
                AbstractC3689v.B(arrayList, new a());
            }
            return arrayList;
        }
    }

    static final class c implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final c f66431a = new c();

        c() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List apply(List places) {
            AbstractC6492s.i(places, "places");
            long jCurrentTimeMillis = System.currentTimeMillis() - 60000;
            ArrayList arrayList = new ArrayList();
            Iterator it = places.iterator();
            while (it.hasNext()) {
                C6934f c6934f = (C6934f) it.next();
                AbstractC8627a.c cVar = c6934f.e() >= jCurrentTimeMillis ? new AbstractC8627a.c(c6934f.e(), c6934f.j()) : null;
                if (cVar != null) {
                    arrayList.add(cVar);
                }
            }
            return arrayList;
        }
    }

    static final class d implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        public static final d f66432a = new d();

        d() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v14, types: [y8.a$a] */
        /* JADX WARN: Type inference failed for: r4v7, types: [y8.a$a] */
        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List apply(List events, C3771a devices) {
            InterfaceC2557a.b bVar;
            String c2357a;
            InterfaceC2557a.b bVar2;
            AbstractC6492s.i(events, "events");
            AbstractC6492s.i(devices, "devices");
            long jCurrentTimeMillis = System.currentTimeMillis() - 60000;
            ArrayList arrayList = new ArrayList();
            Iterator it = events.iterator();
            while (it.hasNext()) {
                AbstractC5975a abstractC5975a = (AbstractC5975a) it.next();
                String name = null;
                if (abstractC5975a.b() >= jCurrentTimeMillis) {
                    if (abstractC5975a instanceof AbstractC5975a.AbstractC1797a.c) {
                        AbstractC5975a.AbstractC1797a.c cVar = (AbstractC5975a.AbstractC1797a.c) abstractC5975a;
                        long jB = cVar.b();
                        C3772b c3772bA = cVar.c().a().a();
                        if (c3772bA != null && (bVar2 = (InterfaceC2557a.b) devices.a(c3772bA)) != null) {
                            name = bVar2.getName();
                        }
                        c2357a = new AbstractC8627a.C2357a(jB, name, cVar.c().a().c());
                    } else if (abstractC5975a instanceof AbstractC5975a.AbstractC1797a.b) {
                        AbstractC5975a.AbstractC1797a.b bVar3 = (AbstractC5975a.AbstractC1797a.b) abstractC5975a;
                        long jB2 = bVar3.b();
                        C3772b c3772bA2 = bVar3.c().a().a();
                        if (c3772bA2 != null && (bVar = (InterfaceC2557a.b) devices.a(c3772bA2)) != null) {
                            name = bVar.getName();
                        }
                        c2357a = new AbstractC8627a.C2357a(jB2, name, bVar3.c().a().c());
                    }
                    name = c2357a;
                }
                if (name != null) {
                    arrayList.add(name);
                }
            }
            return arrayList;
        }
    }

    public b(AbstractC5975a.c roamingService, Cc.n deviceManager, InterfaceC6935g placesManager) {
        AbstractC6492s.i(roamingService, "roamingService");
        AbstractC6492s.i(deviceManager, "deviceManager");
        AbstractC6492s.i(placesManager, "placesManager");
        gg.i iVarI2 = gg.i.v(roamingService.a(), deviceManager.a(), d.f66432a).W().o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f66427a = iVarI2;
        gg.i iVarI22 = placesManager.h().N0(c.f66431a).W().o1(1).i2();
        AbstractC6492s.h(iVarI22, "refCount(...)");
        this.f66428b = iVarI22;
        gg.i iVarI23 = gg.i.v(iVarI22, iVarI2, C2358b.f66430a).W().o1(1).i2();
        AbstractC6492s.h(iVarI23, "refCount(...)");
        this.f66429c = iVarI23;
    }

    @Override // y8.AbstractC8627a.b
    public gg.i a() {
        return this.f66429c;
    }
}
