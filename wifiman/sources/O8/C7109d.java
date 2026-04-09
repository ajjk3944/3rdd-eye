package o8;

import Ke.l;
import Ke.m;
import Yg.J;
import Zg.AbstractC3689v;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.E;
import com.ubnt.usurvey.R;
import gd.C5896a;
import gd.g;
import gg.AbstractC5912b;
import gg.InterfaceC5913c;
import gg.InterfaceC5915e;
import gg.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;
import kg.InterfaceC6469f;
import kg.n;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l9.C6556a;
import mh.InterfaceC6839p;
import s9.d;

/* renamed from: o8.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7109d implements InterfaceC7106a {

    /* renamed from: h, reason: collision with root package name */
    public static final a f55575h = new a(null);

    /* renamed from: i, reason: collision with root package name */
    public static final int f55576i = 8;

    /* renamed from: a, reason: collision with root package name */
    private final gd.g f55577a;

    /* renamed from: b, reason: collision with root package name */
    private final Fg.a f55578b;

    /* renamed from: c, reason: collision with root package name */
    private final Fg.a f55579c;

    /* renamed from: d, reason: collision with root package name */
    private final i f55580d;

    /* renamed from: e, reason: collision with root package name */
    private final AbstractC5912b f55581e;

    /* renamed from: f, reason: collision with root package name */
    private final i f55582f;

    /* renamed from: g, reason: collision with root package name */
    private final i f55583g;

    /* renamed from: o8.d$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: o8.d$b */
    private static abstract class b {

        /* renamed from: o8.d$b$a */
        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            private final g.b f55584a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(g.b from) {
                super(null);
                AbstractC6492s.i(from, "from");
                this.f55584a = from;
            }

            public final g.b a() {
                return this.f55584a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && AbstractC6492s.d(this.f55584a, ((a) obj).f55584a);
            }

            public int hashCode() {
                return this.f55584a.hashCode();
            }

            public String toString() {
                return "Resume(from=" + this.f55584a + ")";
            }
        }

        /* renamed from: o8.d$b$b, reason: collision with other inner class name */
        public static final class C2006b extends b {

            /* renamed from: a, reason: collision with root package name */
            private final String f55585a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2006b(String host) {
                super(null);
                AbstractC6492s.i(host, "host");
                this.f55585a = host;
            }

            public final String a() {
                return this.f55585a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2006b) && AbstractC6492s.d(this.f55585a, ((C2006b) obj).f55585a);
            }

            public int hashCode() {
                return this.f55585a.hashCode();
            }

            public String toString() {
                return "Start(host=" + this.f55585a + ")";
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* renamed from: o8.d$c */
    static final class c implements InterfaceC6469f {
        c() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(g.b it) {
            AbstractC6492s.i(it, "it");
            C7109d.this.f55579c.h(new C6556a(it));
        }
    }

    /* renamed from: o8.d$d, reason: collision with other inner class name */
    static final class C2007d implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final C2007d f55587a = new C2007d();

        C2007d() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List apply(C6556a c6556a) {
            AbstractC6492s.i(c6556a, "<destruct>");
            g.b bVar = (g.b) c6556a.a();
            if (bVar == null) {
                return AbstractC3689v.l();
            }
            if (!(bVar instanceof g.b.a) && !(bVar instanceof g.b.C1781b)) {
                throw new NoWhenBranchMatchedException();
            }
            TreeMap treeMapE = bVar.e();
            ArrayList arrayList = new ArrayList(treeMapE.size());
            Iterator it = treeMapE.entrySet().iterator();
            while (it.hasNext()) {
                C5896a c5896a = (C5896a) ((Map.Entry) it.next()).getValue();
                Integer numValueOf = Integer.valueOf(c5896a.b());
                String strA = c5896a.a();
                if (strA == null) {
                    strA = c5896a.d();
                }
                arrayList.add(new l(numValueOf, strA != null ? new d.c(strA) : new d.b(R.string.port_scan_unknown_service), bVar.a()));
            }
            return arrayList;
        }
    }

    /* renamed from: o8.d$e */
    static final class e implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final e f55588a = new e();

        e() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final m apply(C6556a c6556a) {
            AbstractC6492s.i(c6556a, "<destruct>");
            g.b bVar = (g.b) c6556a.a();
            if (bVar == null) {
                return m.b.f10729a;
            }
            if (bVar instanceof g.b.C1781b) {
                g.b.C1781b c1781b = (g.b.C1781b) bVar;
                return new m.c(c1781b.c(), c1781b.d());
            }
            if (bVar instanceof g.b.a) {
                return m.a.f10728a;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: o8.d$f */
    public static final class f implements InterfaceC5915e {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f55590b;

        public f(String str) {
            this.f55590b = str;
        }

        @Override // gg.InterfaceC5915e
        public final void a(InterfaceC5913c interfaceC5913c) {
            try {
                C7109d.this.f55578b.h(new C6556a(new b.C2006b(this.f55590b)));
                interfaceC5913c.a();
            } catch (Throwable th2) {
                interfaceC5913c.onError(th2);
            }
        }
    }

    /* renamed from: o8.d$g */
    static final class g implements n {
        g() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(C6556a c6556a) {
            AbstractC6492s.i(c6556a, "<destruct>");
            b bVar = (b) c6556a.a();
            if (!(bVar instanceof b.a)) {
                if (bVar instanceof b.C2006b) {
                    C7109d c7109d = C7109d.this;
                    return c7109d.l(g.a.a(c7109d.f55577a, ((b.C2006b) bVar).a(), null, 2, null));
                }
                if (bVar != null) {
                    throw new NoWhenBranchMatchedException();
                }
                i iVarJ0 = i.j0();
                AbstractC6492s.h(iVarJ0, "empty(...)");
                return iVarJ0;
            }
            b.a aVar = (b.a) bVar;
            g.b bVarA = aVar.a();
            if (bVarA instanceof g.b.a) {
                i iVarJ02 = i.j0();
                AbstractC6492s.h(iVarJ02, "empty(...)");
                return iVarJ02;
            }
            if (!(bVarA instanceof g.b.C1781b)) {
                throw new NoWhenBranchMatchedException();
            }
            C7109d c7109d2 = C7109d.this;
            return c7109d2.l(c7109d2.f55577a.b((g.b.C1781b) aVar.a()));
        }
    }

    public C7109d(gd.g portScan) {
        AbstractC6492s.i(portScan, "portScan");
        this.f55577a = portScan;
        Fg.a aVarK2 = Fg.a.k2(new C6556a(null));
        AbstractC6492s.h(aVarK2, "createDefault(...)");
        this.f55578b = aVarK2;
        Fg.a aVarK22 = Fg.a.k2(new C6556a(null));
        AbstractC6492s.h(aVarK22, "createDefault(...)");
        this.f55579c = aVarK22;
        i iVarI2 = aVarK22.e1().Y0(Gg.a.a(), false, 1).W().o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f55580d = iVarI2;
        AbstractC5912b abstractC5912bE0 = aVarK2.e1().Y0(Gg.a.a(), false, 1).W().I1(new g()).o1(1).i2().E0();
        AbstractC6492s.h(abstractC5912bE0, "ignoreElements(...)");
        this.f55581e = abstractC5912bE0;
        i iVarI22 = iVarI2.N0(C2007d.f55587a).W().U0(abstractC5912bE0).o1(1).i2();
        AbstractC6492s.h(iVarI22, "refCount(...)");
        this.f55582f = iVarI22;
        i iVarI23 = iVarI2.N0(e.f55588a).W().U0(abstractC5912bE0).o1(1).i2();
        AbstractC6492s.h(iVarI23, "refCount(...)");
        this.f55583g = iVarI23;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final i l(i iVar) {
        i iVarF0 = iVar.X1(200L, TimeUnit.MILLISECONDS, true).e1().Y0(Gg.a.a(), false, 1).f0(new c());
        AbstractC6492s.h(iVarF0, "doOnNext(...)");
        return iVarF0;
    }

    private final C5896a m(Bundle bundle) {
        return new C5896a(bundle.getInt("port"), bundle.getString("name"), bundle.getString("protocol"), bundle.getString("description"));
    }

    private final g.b n(Bundle bundle) {
        if (bundle.getBoolean("isDone")) {
            String string = bundle.getString("host");
            if (string != null) {
                return new g.b.a(string, bundle.getInt("toScanNum"), o(bundle));
            }
            throw new IllegalStateException("key host not available");
        }
        String string2 = bundle.getString("host");
        if (string2 == null) {
            throw new IllegalStateException("key host not available");
        }
        return new g.b.C1781b(string2, bundle.getInt("scannedNum"), bundle.getInt("toScanNum"), o(bundle));
    }

    private final TreeMap o(Bundle bundle) {
        ArrayList<Bundle> parcelableArrayList = bundle.getParcelableArrayList("services");
        if (parcelableArrayList == null) {
            return new TreeMap();
        }
        TreeMap treeMap = new TreeMap();
        for (Bundle bundle2 : parcelableArrayList) {
            AbstractC6492s.f(bundle2);
            C5896a c5896aM = m(bundle2);
            treeMap.put(Integer.valueOf(c5896aM.b()), c5896aM);
        }
        return treeMap;
    }

    private final Bundle p(C5896a c5896a) {
        Bundle bundle = new Bundle();
        bundle.putInt("port", c5896a.b());
        bundle.putString("name", c5896a.d());
        bundle.putString("protocol", c5896a.c());
        bundle.putString("description", c5896a.a());
        return bundle;
    }

    private final Bundle q(g.b bVar) {
        boolean z10;
        Bundle bundle = new Bundle();
        if (bVar instanceof g.b.C1781b) {
            z10 = false;
        } else {
            if (!(bVar instanceof g.b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            z10 = true;
        }
        bundle.putBoolean("isDone", z10);
        bundle.putString("host", bVar.a());
        bundle.putInt("scannedNum", bVar.d());
        bundle.putInt("toScanNum", bVar.b());
        final ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        TreeMap treeMapE = bVar.e();
        final InterfaceC6839p interfaceC6839p = new InterfaceC6839p() { // from class: o8.b
            @Override // mh.InterfaceC6839p
            public final Object invoke(Object obj, Object obj2) {
                return C7109d.r(arrayList, this, (Integer) obj, (C5896a) obj2);
            }
        };
        treeMapE.forEach(new BiConsumer() { // from class: o8.c
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                C7109d.s(interfaceC6839p, obj, obj2);
            }
        });
        J j10 = J.f24997a;
        bundle.putParcelableArrayList("services", arrayList);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J r(ArrayList arrayList, C7109d c7109d, Integer num, C5896a service) {
        AbstractC6492s.i(num, "<unused var>");
        AbstractC6492s.i(service, "service");
        arrayList.add(c7109d.p(service));
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(InterfaceC6839p interfaceC6839p, Object obj, Object obj2) {
        interfaceC6839p.invoke(obj, obj2);
    }

    @Override // o8.InterfaceC7106a
    public AbstractC5912b a(String host) {
        AbstractC6492s.i(host, "host");
        AbstractC5912b abstractC5912bR = AbstractC5912b.r(new f(host));
        AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
        return abstractC5912bR;
    }

    @Override // o8.InterfaceC7106a
    public i b() {
        return this.f55583g;
    }

    @Override // o8.InterfaceC7106a
    public i c() {
        return this.f55582f;
    }

    @Override // o8.InterfaceC7106a
    public void d(E savedState) {
        AbstractC6492s.i(savedState, "savedState");
        Bundle bundle = (Bundle) savedState.d("portScan");
        g.b bVarN = bundle != null ? n(bundle) : null;
        if (bVarN != null) {
            this.f55579c.h(new C6556a(bVarN));
            this.f55578b.h(new C6556a(new b.a(bVarN)));
        }
    }

    @Override // o8.InterfaceC7106a
    public void e(E savedState) {
        g.b bVar;
        AbstractC6492s.i(savedState, "savedState");
        C6556a c6556a = (C6556a) this.f55579c.l2();
        if (c6556a == null || (bVar = (g.b) c6556a.b()) == null) {
            return;
        }
        savedState.i("portScan", q(bVar));
    }
}
