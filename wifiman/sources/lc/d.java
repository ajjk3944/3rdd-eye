package Lc;

import Cc.AbstractC2558b;
import Lc.a;
import Yg.J;
import Yg.m;
import Zg.AbstractC3689v;
import android.content.Context;
import com.ui.wifiman.model.vendor.d;
import ee.AbstractC5456b;
import gg.i;
import gg.r;
import h9.C5969a;
import inet.ipaddr.ipv4.C6180b;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kg.InterfaceC6469f;
import kg.n;
import kg.q;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6824a;
import o7.AbstractC7100f;
import r7.C7577a;
import s7.AbstractC7915b;
import t7.C8040d;
import u7.AbstractC8138a;
import u7.InterfaceC8139b;
import w7.C8275d;
import y7.AbstractC8624d;
import y7.C8625e;
import y7.C8626f;
import y7.h;
import y7.j;
import y7.k;

/* loaded from: classes4.dex */
public final class d implements Lc.a {

    /* renamed from: d, reason: collision with root package name */
    public static final a f11557d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final Context f11558a;

    /* renamed from: b, reason: collision with root package name */
    private final m f11559b;

    /* renamed from: c, reason: collision with root package name */
    private final i f11560c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class b extends LinkedHashSet {
        public /* bridge */ int F() {
            return super.size();
        }

        public /* bridge */ boolean S(a.C0455a c0455a) {
            return super.remove(c0455a);
        }

        @Override // java.util.HashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof a.C0455a) {
                return o((a.C0455a) obj);
            }
            return false;
        }

        @Override // java.util.HashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public boolean add(a.C0455a element) {
            boolean zAdd;
            AbstractC6492s.i(element, "element");
            synchronized (this) {
                try {
                    if (contains(element)) {
                        remove(element);
                    }
                    zAdd = super.add(element);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return zAdd;
        }

        public /* bridge */ boolean o(a.C0455a c0455a) {
            return super.contains(c0455a);
        }

        @Override // java.util.HashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final /* bridge */ boolean remove(Object obj) {
            if (obj instanceof a.C0455a) {
                return S((a.C0455a) obj);
            }
            return false;
        }

        @Override // java.util.HashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final /* bridge */ int size() {
            return F();
        }
    }

    private static final class c implements InterfaceC8139b {
        @Override // u7.InterfaceC8139b
        public AbstractC8138a b() {
            return C8275d.f64481a.a();
        }
    }

    /* renamed from: Lc.d$d, reason: collision with other inner class name */
    static final class C0456d implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final C0456d f11561a = new C0456d();

        C0456d() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final r apply(AbstractC7915b it) {
            Object next;
            String strA;
            InetAddress inetAddressB;
            AbstractC6492s.i(it, "it");
            Set setC = it.c();
            ArrayList arrayList = new ArrayList();
            Iterator it2 = setC.iterator();
            while (true) {
                gVarA = null;
                inet.ipaddr.g gVarA = null;
                if (!it2.hasNext()) {
                    break;
                }
                Object objC = ((C7577a) it2.next()).c();
                AbstractC8624d abstractC8624d = objC instanceof AbstractC8624d ? (AbstractC8624d) objC : null;
                if (abstractC8624d != null && (inetAddressB = abstractC8624d.b()) != null) {
                    gVarA = AbstractC5456b.a(inetAddressB);
                }
                if (gVarA != null) {
                    arrayList.add(gVarA);
                }
            }
            List listV0 = AbstractC3689v.V0(arrayList);
            long jCurrentTimeMillis = System.currentTimeMillis();
            Iterator it3 = listV0.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
                if (((inet.ipaddr.g) next) instanceof C6180b) {
                    break;
                }
            }
            inet.ipaddr.g gVar = (inet.ipaddr.g) next;
            C8040d c8040d = (C8040d) it.d(C8040d.class);
            C5969a c5969aE = (c8040d == null || (strA = c8040d.a("")) == null) ? null : C5969a.f48518b.e(strA);
            if (gVar == null || c5969aE == null) {
                return gg.n.h();
            }
            t7.g gVar2 = (t7.g) it.d(t7.g.class);
            Long lValueOf = gVar2 != null ? Long.valueOf(gVar2.a()) : null;
            d.c cVar = new d.c(d.EnumC1510d.MIKROTIK);
            j jVar = (j) it.d(j.class);
            Boolean boolValueOf = jVar != null ? Boolean.valueOf(jVar.a()) : null;
            C8626f c8626f = (C8626f) it.d(C8626f.class);
            String strA2 = c8626f != null ? c8626f.a() : null;
            k kVar = (k) it.d(k.class);
            String strA3 = kVar != null ? kVar.a() : null;
            h hVar = (h) it.d(h.class);
            String strA4 = hVar != null ? hVar.a() : null;
            y7.i iVar = (y7.i) it.d(y7.i.class);
            String strA5 = iVar != null ? iVar.a() : null;
            C8625e c8625e = (C8625e) it.d(C8625e.class);
            return gg.n.o(new a.C0455a(gVar, c5969aE, listV0, jCurrentTimeMillis, cVar, strA2, lValueOf, strA3, strA4, strA5, c8625e != null ? c8625e.a() : null, boolValueOf, AbstractC2558b.g.d.f2496b, jCurrentTimeMillis + 20000));
        }
    }

    static final class e implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final e f11562a = new e();

        e() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List apply(b bVar) {
            AbstractC6492s.f(bVar);
            return AbstractC3689v.i1(bVar);
        }
    }

    static final class f implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final f f11563a = new f();

        f() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable it) {
            AbstractC6492s.i(it, "it");
            Z7.b.f(it, null, 2, null);
        }
    }

    static final class g implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final g f11564a = new g();

        static final class a implements n {

            /* renamed from: a, reason: collision with root package name */
            public static final a f11565a = new a();

            a() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Dj.a apply(Throwable it) {
                AbstractC6492s.i(it, "it");
                return i.K0(J.f24997a).R(3000L, TimeUnit.MILLISECONDS);
            }
        }

        g() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(i errorStream) {
            AbstractC6492s.i(errorStream, "errorStream");
            return errorStream.p0(a.f11565a);
        }
    }

    public d(Context context) {
        AbstractC6492s.i(context, "context");
        this.f11558a = context;
        this.f11559b = Yg.n.b(new InterfaceC6824a() { // from class: Lc.c
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return d.e();
            }
        });
        i iVarI2 = g().o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f11560c = iVarI2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC7100f e() {
        return AbstractC7100f.f55524a.a().a(new c(), 99).b();
    }

    private final AbstractC7100f f() {
        return (AbstractC7100f) this.f11559b.getValue();
    }

    private final i g() {
        i iVarP1 = f().a().v0(C0456d.f11561a).c(2000L, 2000L, TimeUnit.MILLISECONDS, Gg.a.a(), new q() { // from class: Lc.b
            @Override // kg.q
            public final Object get() {
                return d.h();
            }
        }).e1().N0(e.f11562a).d0(f.f11563a).p1(g.f11564a);
        AbstractC6492s.h(iVarP1, "retryWhen(...)");
        return iVarP1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b h() {
        return new b();
    }

    @Override // Ec.t
    public i b() {
        return this.f11560c;
    }
}
