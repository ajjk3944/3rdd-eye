package kotlinx.coroutines.debug.internal;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.lang.ref.ReferenceQueue;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.channels.f;
import kotlinx.coroutines.debug.internal.ConcurrentWeakMap;
import l9.p;
import q9.e;
import y8.s;
import z8.g;
import z8.h;

/* loaded from: classes4.dex */
public final class ConcurrentWeakMap extends g {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f22313b = AtomicIntegerFieldUpdater.newUpdater(ConcurrentWeakMap.class, "_size$volatile");

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f22314c = AtomicReferenceFieldUpdater.newUpdater(ConcurrentWeakMap.class, Object.class, "core$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final ReferenceQueue f22315a;
    private volatile /* synthetic */ Object core$volatile;

    public final class a {

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f22316g = AtomicIntegerFieldUpdater.newUpdater(a.class, "load$volatile");

        /* renamed from: a, reason: collision with root package name */
        public final int f22317a;

        /* renamed from: b, reason: collision with root package name */
        public final int f22318b;

        /* renamed from: c, reason: collision with root package name */
        public final int f22319c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ AtomicReferenceArray f22320d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ AtomicReferenceArray f22321e;
        private volatile /* synthetic */ int load$volatile;

        /* renamed from: kotlinx.coroutines.debug.internal.ConcurrentWeakMap$a$a, reason: collision with other inner class name */
        public final class C0428a implements Iterator, m9.a {

            /* renamed from: a, reason: collision with root package name */
            public final p f22323a;

            /* renamed from: b, reason: collision with root package name */
            public int f22324b = -1;

            /* renamed from: c, reason: collision with root package name */
            public Object f22325c;

            /* renamed from: d, reason: collision with root package name */
            public Object f22326d;

            public C0428a(p pVar) {
                this.f22323a = pVar;
                a();
            }

            public final void a() {
                T t10;
                while (true) {
                    int i10 = this.f22324b + 1;
                    this.f22324b = i10;
                    if (i10 >= a.this.f22317a) {
                        return;
                    }
                    kotlinx.coroutines.debug.internal.c cVar = (kotlinx.coroutines.debug.internal.c) a.this.e().get(this.f22324b);
                    if (cVar != null && (t10 = cVar.get()) != 0) {
                        this.f22325c = t10;
                        Object obj = a.this.g().get(this.f22324b);
                        if (obj instanceof d) {
                            obj = ((d) obj).f22349a;
                        }
                        if (obj != null) {
                            this.f22326d = obj;
                            return;
                        }
                    }
                }
            }

            @Override // java.util.Iterator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public Void remove() {
                kotlinx.coroutines.debug.internal.a.e();
                throw new KotlinNothingValueException();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f22324b < a.this.f22317a;
            }

            @Override // java.util.Iterator
            public Object next() {
                if (this.f22324b >= a.this.f22317a) {
                    throw new NoSuchElementException();
                }
                p pVar = this.f22323a;
                Object obj = this.f22325c;
                if (obj == null) {
                    kotlin.jvm.internal.p.t("key");
                    obj = s.f25199a;
                }
                Object obj2 = this.f22326d;
                if (obj2 == null) {
                    kotlin.jvm.internal.p.t(AppMeasurementSdk.ConditionalUserProperty.VALUE);
                    obj2 = s.f25199a;
                }
                Object objInvoke = pVar.invoke(obj, obj2);
                a();
                return objInvoke;
            }
        }

        public a(int i10) {
            this.f22317a = i10;
            this.f22318b = Integer.numberOfLeadingZeros(i10) + 1;
            this.f22319c = (i10 * 2) / 3;
            this.f22320d = new AtomicReferenceArray(i10);
            this.f22321e = new AtomicReferenceArray(i10);
        }

        public static /* synthetic */ Object k(a aVar, Object obj, Object obj2, kotlinx.coroutines.debug.internal.c cVar, int i10, Object obj3) {
            if ((i10 & 4) != 0) {
                cVar = null;
            }
            return aVar.j(obj, obj2, cVar);
        }

        public final Object d(Object obj) {
            int iH = h(obj.hashCode());
            while (true) {
                kotlinx.coroutines.debug.internal.c cVar = (kotlinx.coroutines.debug.internal.c) e().get(iH);
                if (cVar == null) {
                    return null;
                }
                T t10 = cVar.get();
                if (kotlin.jvm.internal.p.a(obj, t10)) {
                    Object obj2 = g().get(iH);
                    return obj2 instanceof d ? ((d) obj2).f22349a : obj2;
                }
                if (t10 == 0) {
                    m(iH);
                }
                if (iH == 0) {
                    iH = this.f22317a;
                }
                iH--;
            }
        }

        public final /* synthetic */ AtomicReferenceArray e() {
            return this.f22320d;
        }

        public final /* synthetic */ AtomicReferenceArray g() {
            return this.f22321e;
        }

        public final int h(int i10) {
            return (i10 * (-1640531527)) >>> this.f22318b;
        }

        public final Iterator i(p pVar) {
            return new C0428a(pVar);
        }

        public final Object j(Object obj, Object obj2, kotlinx.coroutines.debug.internal.c cVar) {
            int i10;
            Object obj3;
            int iH = h(obj.hashCode());
            boolean z10 = false;
            while (true) {
                kotlinx.coroutines.debug.internal.c cVar2 = (kotlinx.coroutines.debug.internal.c) e().get(iH);
                if (cVar2 != null) {
                    T t10 = cVar2.get();
                    if (!kotlin.jvm.internal.p.a(obj, t10)) {
                        if (t10 == 0) {
                            m(iH);
                        }
                        if (iH == 0) {
                            iH = this.f22317a;
                        }
                        iH--;
                    } else if (z10) {
                        f22316g.decrementAndGet(this);
                    }
                } else if (obj2 != null) {
                    if (!z10) {
                        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f22316g;
                        do {
                            i10 = atomicIntegerFieldUpdater.get(this);
                            if (i10 >= this.f22319c) {
                                return kotlinx.coroutines.debug.internal.a.f22334a;
                            }
                        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, i10 + 1));
                        z10 = true;
                    }
                    if (cVar == null) {
                        cVar = new kotlinx.coroutines.debug.internal.c(obj, ConcurrentWeakMap.this.f22315a);
                    }
                    if (f.a(e(), iH, null, cVar)) {
                        break;
                    }
                } else {
                    return null;
                }
            }
            do {
                obj3 = g().get(iH);
                if (obj3 instanceof d) {
                    return kotlinx.coroutines.debug.internal.a.f22334a;
                }
            } while (!f.a(g(), iH, obj3, obj2));
            return obj3;
        }

        public final a l() {
            int i10;
            Object obj;
            while (true) {
                a aVar = ConcurrentWeakMap.this.new a(Integer.highestOneBit(e.b(ConcurrentWeakMap.this.size(), 4)) * 4);
                int i11 = this.f22317a;
                while (i10 < i11) {
                    kotlinx.coroutines.debug.internal.c cVar = (kotlinx.coroutines.debug.internal.c) e().get(i10);
                    Object obj2 = cVar != null ? cVar.get() : null;
                    if (cVar != null && obj2 == null) {
                        m(i10);
                    }
                    while (true) {
                        obj = g().get(i10);
                        if (obj instanceof d) {
                            obj = ((d) obj).f22349a;
                            break;
                        }
                        if (f.a(g(), i10, obj, kotlinx.coroutines.debug.internal.a.d(obj))) {
                            break;
                        }
                    }
                    i10 = (obj2 == null || obj == null || aVar.j(obj2, obj, cVar) != kotlinx.coroutines.debug.internal.a.f22334a) ? i10 + 1 : 0;
                }
                return aVar;
            }
        }

        public final void m(int i10) {
            Object obj;
            do {
                obj = g().get(i10);
                if (obj == null || (obj instanceof d)) {
                    return;
                }
            } while (!f.a(g(), i10, obj, null));
            ConcurrentWeakMap.this.j();
        }
    }

    public static final class b implements Map.Entry, m9.a {

        /* renamed from: a, reason: collision with root package name */
        public final Object f22328a;

        /* renamed from: b, reason: collision with root package name */
        public final Object f22329b;

        public b(Object obj, Object obj2) {
            this.f22328a = obj;
            this.f22329b = obj2;
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f22328a;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f22329b;
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            kotlinx.coroutines.debug.internal.a.e();
            throw new KotlinNothingValueException();
        }
    }

    public final class c extends h {

        /* renamed from: a, reason: collision with root package name */
        public final p f22330a;

        public c(p pVar) {
            this.f22330a = pVar;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean add(Object obj) {
            kotlinx.coroutines.debug.internal.a.e();
            throw new KotlinNothingValueException();
        }

        @Override // z8.h
        public int d() {
            return ConcurrentWeakMap.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return ((a) ConcurrentWeakMap.k().get(ConcurrentWeakMap.this)).i(this.f22330a);
        }
    }

    public /* synthetic */ ConcurrentWeakMap(boolean z10, int i10, i iVar) {
        this((i10 & 1) != 0 ? false : z10);
    }

    public static final /* synthetic */ AtomicReferenceFieldUpdater k() {
        return f22314c;
    }

    @Override // z8.g
    public Set a() {
        return new c(new p() { // from class: kotlinx.coroutines.debug.internal.ConcurrentWeakMap$entries$1
            @Override // l9.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Map.Entry invoke(Object obj, Object obj2) {
                return new ConcurrentWeakMap.b(obj, obj2);
            }
        });
    }

    @Override // z8.g
    public Set c() {
        return new c(new p() { // from class: kotlinx.coroutines.debug.internal.ConcurrentWeakMap$keys$1
            @Override // l9.p
            public final Object invoke(Object obj, Object obj2) {
                return obj;
            }
        });
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Iterator it = keySet().iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    @Override // z8.g
    public int d() {
        return f22313b.get(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return ((a) f22314c.get(this)).d(obj);
    }

    public final void j() {
        f22313b.decrementAndGet(this);
    }

    public final synchronized Object m(Object obj, Object obj2) {
        Object objK;
        a aVarL = (a) f22314c.get(this);
        while (true) {
            Object obj3 = obj;
            Object obj4 = obj2;
            objK = a.k(aVarL, obj3, obj4, null, 4, null);
            if (objK == kotlinx.coroutines.debug.internal.a.f22334a) {
                aVarL = aVarL.l();
                f22314c.set(this, aVarL);
                obj = obj3;
                obj2 = obj4;
            }
        }
        return objK;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        Object objK = a.k((a) f22314c.get(this), obj, obj2, null, 4, null);
        if (objK == kotlinx.coroutines.debug.internal.a.f22334a) {
            objK = m(obj, obj2);
        }
        if (objK == null) {
            f22313b.incrementAndGet(this);
        }
        return objK;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        if (obj == null) {
            return null;
        }
        Object objK = a.k((a) f22314c.get(this), obj, null, null, 4, null);
        if (objK == kotlinx.coroutines.debug.internal.a.f22334a) {
            objK = m(obj, null);
        }
        if (objK != null) {
            f22313b.decrementAndGet(this);
        }
        return objK;
    }

    public ConcurrentWeakMap(boolean z10) {
        this.core$volatile = new a(16);
        this.f22315a = z10 ? new ReferenceQueue() : null;
    }
}
