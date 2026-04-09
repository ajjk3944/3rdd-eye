package g4;

import b4.C0344i;
import j$.util.concurrent.ConcurrentHashMap;
import j4.C2570b;
import j4.C2572d;
import j4.C2575g;
import j4.C2579k;
import j4.C2582n;
import j4.C2583o;
import j4.C2584p;
import j4.C2589v;
import j4.C2592y;
import j4.Q;
import j4.T;
import j4.b0;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import n4.C2689a;
import o4.C2764c;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: h, reason: collision with root package name */
    public static final i f20231h = i.f20223d;
    public static final C2337a i = h.f20221a;

    /* renamed from: j, reason: collision with root package name */
    public static final t f20232j = x.f20245a;

    /* renamed from: k, reason: collision with root package name */
    public static final u f20233k = x.f20246b;

    /* renamed from: a, reason: collision with root package name */
    public final ThreadLocal f20234a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f20235b;

    /* renamed from: c, reason: collision with root package name */
    public final C0344i f20236c;

    /* renamed from: d, reason: collision with root package name */
    public final C2579k f20237d;

    /* renamed from: e, reason: collision with root package name */
    public final List f20238e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f20239f;

    /* renamed from: g, reason: collision with root package name */
    public final i f20240g;

    public m() {
        i4.e eVar = i4.e.f20596c;
        Map map = Collections.EMPTY_MAP;
        List list = Collections.EMPTY_LIST;
        this.f20234a = new ThreadLocal();
        this.f20235b = new ConcurrentHashMap();
        C0344i c0344i = new C0344i(17);
        this.f20236c = c0344i;
        this.f20239f = true;
        this.f20240g = f20231h;
        ArrayList arrayList = new ArrayList();
        arrayList.add(b0.f21385A);
        t tVar = x.f20245a;
        t tVar2 = f20232j;
        arrayList.add(tVar2 == tVar ? C2584p.f21437c : new C2582n(1, tVar2));
        arrayList.add(eVar);
        arrayList.addAll(list);
        arrayList.add(b0.f21401p);
        arrayList.add(b0.f21393g);
        arrayList.add(b0.f21390d);
        arrayList.add(b0.f21391e);
        arrayList.add(b0.f21392f);
        C2592y c2592y = b0.f21396k;
        arrayList.add(new T(Long.TYPE, Long.class, c2592y));
        arrayList.add(new T(Double.TYPE, Double.class, new j(0)));
        arrayList.add(new T(Float.TYPE, Float.class, new j(1)));
        u uVar = x.f20246b;
        u uVar2 = f20233k;
        arrayList.add(uVar2 == uVar ? C2583o.f21435b : new C2582n(0, new C2583o(uVar2)));
        arrayList.add(b0.f21394h);
        arrayList.add(b0.i);
        arrayList.add(new Q(AtomicLong.class, new k(c2592y, 0).a(), 0));
        int i3 = 0;
        arrayList.add(new Q(AtomicLongArray.class, new k(c2592y, 1).a(), i3));
        arrayList.add(b0.f21395j);
        arrayList.add(b0.f21397l);
        arrayList.add(b0.f21402q);
        arrayList.add(b0.f21403r);
        arrayList.add(new Q(BigDecimal.class, b0.f21398m, i3));
        arrayList.add(new Q(BigInteger.class, b0.f21399n, i3));
        arrayList.add(new Q(i4.k.class, b0.f21400o, i3));
        arrayList.add(b0.f21404s);
        arrayList.add(b0.f21405t);
        arrayList.add(b0.f21407v);
        arrayList.add(b0.f21408w);
        arrayList.add(b0.f21410y);
        arrayList.add(b0.f21406u);
        arrayList.add(b0.f21388b);
        arrayList.add(C2575g.f21418c);
        arrayList.add(b0.f21409x);
        if (m4.e.f21984a) {
            arrayList.add(m4.e.f21986c);
            arrayList.add(m4.e.f21985b);
            arrayList.add(m4.e.f21987d);
        }
        arrayList.add(C2570b.f21382c);
        arrayList.add(b0.f21387a);
        arrayList.add(new C2572d(c0344i, 0));
        arrayList.add(new C2572d(c0344i, 1));
        C2579k c2579k = new C2579k(c0344i);
        this.f20237d = c2579k;
        arrayList.add(c2579k);
        arrayList.add(b0.f21386B);
        arrayList.add(new C2589v(c0344i, i, eVar, c2579k));
        this.f20238e = Collections.unmodifiableList(arrayList);
    }

    public static void a(double d6) {
        if (Double.isNaN(d6) || Double.isInfinite(d6)) {
            throw new IllegalArgumentException(d6 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public final z b(C2689a c2689a) {
        boolean z6;
        ConcurrentHashMap concurrentHashMap = this.f20235b;
        z zVar = (z) concurrentHashMap.get(c2689a);
        if (zVar != null) {
            return zVar;
        }
        ThreadLocal threadLocal = this.f20234a;
        Map map = (Map) threadLocal.get();
        if (map == null) {
            map = new HashMap();
            threadLocal.set(map);
            z6 = true;
        } else {
            z zVar2 = (z) map.get(c2689a);
            if (zVar2 != null) {
                return zVar2;
            }
            z6 = false;
        }
        try {
            l lVar = new l();
            map.put(c2689a, lVar);
            Iterator it = this.f20238e.iterator();
            z zVarA = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                zVarA = ((InterfaceC2336A) it.next()).a(this, c2689a);
                if (zVarA != null) {
                    if (lVar.f20230a != null) {
                        throw new AssertionError("Delegate is already set");
                    }
                    lVar.f20230a = zVarA;
                    map.put(c2689a, zVarA);
                }
            }
            if (z6) {
                threadLocal.remove();
            }
            if (zVarA != null) {
                if (z6) {
                    concurrentHashMap.putAll(map);
                }
                return zVarA;
            }
            throw new IllegalArgumentException("GSON (2.13.2) cannot handle " + c2689a);
        } catch (Throwable th) {
            if (z6) {
                threadLocal.remove();
            }
            throw th;
        }
    }

    public final void c(List list, Class cls, C2764c c2764c) {
        z zVarB = b(new C2689a(cls));
        int i3 = c2764c.f22725h;
        if (i3 == 2) {
            c2764c.f22725h = 1;
        }
        boolean z6 = c2764c.i;
        boolean z7 = c2764c.f22727k;
        c2764c.i = this.f20239f;
        c2764c.f22727k = false;
        try {
            try {
                zVarB.c(c2764c, list);
            } catch (IOException e6) {
                throw new p(e6);
            } catch (AssertionError e7) {
                throw new AssertionError("AssertionError (GSON 2.13.2): " + e7.getMessage(), e7);
            }
        } finally {
            c2764c.r(i3);
            c2764c.i = z6;
            c2764c.f22727k = z7;
        }
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + this.f20238e + ",instanceCreators:" + this.f20236c + "}";
    }
}
