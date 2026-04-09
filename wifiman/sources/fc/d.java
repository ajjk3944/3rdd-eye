package Fc;

import Dc.j;
import Fc.a;
import Fc.d;
import Zg.AbstractC3689v;
import a8.C3771a;
import a8.C3772b;
import gg.i;
import inet.ipaddr.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kg.InterfaceC6465b;
import kg.n;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import le.C6588i;
import le.InterfaceC6586g;
import mh.InterfaceC6824a;

/* loaded from: classes4.dex */
public final class d implements Fc.a {

    /* renamed from: c, reason: collision with root package name */
    public static final a f6452c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final i f6453a;

    /* renamed from: b, reason: collision with root package name */
    private final i f6454b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static final class b implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f6455a = new b();

        b() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List apply(C3771a wifiResultLookup, Map discoveryResults) {
            Collection collection;
            AbstractC6492s.i(wifiResultLookup, "wifiResultLookup");
            AbstractC6492s.i(discoveryResults, "discoveryResults");
            List listC = AbstractC3689v.c();
            long jCurrentTimeMillis = System.currentTimeMillis();
            Iterator it = discoveryResults.entrySet().iterator();
            while (it.hasNext()) {
                j jVar = (j) ((Map.Entry) it.next()).getValue();
                C3772b id2 = jVar.getId();
                if (id2 != null && (collection = (Collection) wifiResultLookup.a(id2)) != null && !collection.isEmpty()) {
                    g gVarW = jVar.w();
                    Object objA = wifiResultLookup.a(id2);
                    AbstractC6492s.f(objA);
                    listC.add(new a.b(gVarW, jCurrentTimeMillis, jCurrentTimeMillis + 20000, (List) objA));
                }
            }
            return AbstractC3689v.a(listC);
        }
    }

    static final class c implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final c f6456a = new c();

        c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List c() {
            return new ArrayList();
        }

        @Override // kg.n
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C3771a apply(List signals) {
            AbstractC6492s.i(signals, "signals");
            C3771a c3771a = new C3771a();
            Iterator it = signals.iterator();
            while (it.hasNext()) {
                C6588i c6588i = (C6588i) it.next();
                ((List) c3771a.b(c6588i.i(), new InterfaceC6824a() { // from class: Fc.e
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return d.c.c();
                    }
                })).add(c6588i);
            }
            return c3771a;
        }
    }

    public d(a.C0249a params, InterfaceC6586g wifiScannerService) {
        AbstractC6492s.i(params, "params");
        AbstractC6492s.i(wifiScannerService, "wifiScannerService");
        i iVarN0 = wifiScannerService.a().N0(c.f6456a);
        AbstractC6492s.h(iVarN0, "map(...)");
        this.f6453a = iVarN0;
        i iVarI2 = i.v(iVarN0, params.a().a(), b.f6455a).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f6454b = iVarI2;
    }

    @Override // Ec.t
    public i b() {
        return this.f6454b;
    }
}
