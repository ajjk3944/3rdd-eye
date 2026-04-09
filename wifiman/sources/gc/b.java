package Gc;

import Gc.a;
import Yg.s;
import Zg.AbstractC3689v;
import android.os.Build;
import com.ui.wifiman.model.vendor.d;
import ed.InterfaceC5453a;
import gg.i;
import h9.C5969a;
import inet.ipaddr.AddressStringException;
import inet.ipaddr.IncompatibleAddressException;
import inet.ipaddr.g;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kg.InterfaceC6465b;
import kg.n;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class b implements Gc.a {

    /* renamed from: c, reason: collision with root package name */
    public static final C0296b f7302c = new C0296b(null);

    /* renamed from: a, reason: collision with root package name */
    private final i f7303a;

    /* renamed from: b, reason: collision with root package name */
    private final i f7304b;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final g f7305a;

        /* renamed from: b, reason: collision with root package name */
        private final C5969a f7306b;

        /* renamed from: c, reason: collision with root package name */
        private final com.ui.wifiman.model.vendor.d f7307c;

        public a(g ip, C5969a mac, com.ui.wifiman.model.vendor.d dVar) {
            AbstractC6492s.i(ip, "ip");
            AbstractC6492s.i(mac, "mac");
            this.f7305a = ip;
            this.f7306b = mac;
            this.f7307c = dVar;
        }

        public final g a() {
            return this.f7305a;
        }

        public final C5969a b() {
            return this.f7306b;
        }

        public final com.ui.wifiman.model.vendor.d c() {
            return this.f7307c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC6492s.d(this.f7305a, aVar.f7305a) && AbstractC6492s.d(this.f7306b, aVar.f7306b) && AbstractC6492s.d(this.f7307c, aVar.f7307c);
        }

        public int hashCode() {
            int iHashCode = ((this.f7305a.hashCode() * 31) + this.f7306b.hashCode()) * 31;
            com.ui.wifiman.model.vendor.d dVar = this.f7307c;
            return iHashCode + (dVar == null ? 0 : dVar.hashCode());
        }

        public String toString() {
            return "CacheItem(ip=" + this.f7305a + ", mac=" + this.f7306b + ", vendor=" + this.f7307c + ")";
        }
    }

    /* renamed from: Gc.b$b, reason: collision with other inner class name */
    public static final class C0296b {
        public /* synthetic */ C0296b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0296b() {
        }
    }

    static final class c implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final c f7308a = new c();

        c() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Set apply(s sVar) {
            AbstractC6492s.i(sVar, "<destruct>");
            Object objA = sVar.a();
            AbstractC6492s.h(objA, "component1(...)");
            Object objC = sVar.c();
            AbstractC6492s.h(objC, "component2(...)");
            d.a aVar = (d.a) objC;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (InterfaceC5453a.C1742a c1742a : (Set) objA) {
                try {
                    g gVarP = new inet.ipaddr.n(c1742a.a()).p();
                    AbstractC6492s.h(gVarP, "toAddress(...)");
                    linkedHashSet.add(new a(gVarP, c1742a.b(), aVar.a(c1742a.b())));
                } catch (AddressStringException e10) {
                    Z7.b.j("Failed to parse IP " + c1742a.a(), e10, null, 4, null);
                } catch (IncompatibleAddressException e11) {
                    Z7.b.j("Failed to parse IP " + c1742a.a(), e11, null, 4, null);
                }
            }
            return linkedHashSet;
        }
    }

    static final class d implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final d f7309a = new d();

        d() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(i it) {
            AbstractC6492s.i(it, "it");
            return it.R(2000L, TimeUnit.MILLISECONDS);
        }
    }

    static final class e implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        public static final e f7310a = new e();

        e() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ConcurrentHashMap apply(ConcurrentHashMap map, Set results) {
            AbstractC6492s.i(map, "map");
            AbstractC6492s.i(results, "results");
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j10 = jCurrentTimeMillis + 6000;
            Iterator it = results.iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                map.put(aVar.b(), new a.C0295a(aVar.a(), aVar.b(), aVar.c(), jCurrentTimeMillis, j10));
            }
            return map;
        }
    }

    static final class f implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final f f7311a = new f();

        f() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List apply(ConcurrentHashMap it) {
            AbstractC6492s.i(it, "it");
            Collection collectionValues = it.values();
            AbstractC6492s.h(collectionValues, "<get-values>(...)");
            return AbstractC3689v.i1(collectionValues);
        }
    }

    public b(InterfaceC5453a networkNeighbours, d.b vendorManager) {
        AbstractC6492s.i(networkNeighbours, "networkNeighbours");
        AbstractC6492s.i(vendorManager, "vendorManager");
        i iVarK = Ag.e.f756a.a(networkNeighbours.b(), vendorManager.a()).A(c.f7308a).K(d.f7309a);
        AbstractC6492s.h(iVarK, "repeatWhen(...)");
        this.f7303a = iVarK;
        i iVarI2 = (Build.VERSION.SDK_INT >= 33 ? i.k0(new IllegalStateException("Arp Discovery doesn't work on Android 13+")) : iVarK).q1(new ConcurrentHashMap(), e.f7310a).N0(f.f7311a).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f7304b = iVarI2;
    }

    @Override // Ec.t
    public i b() {
        return this.f7304b;
    }
}
