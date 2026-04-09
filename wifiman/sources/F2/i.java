package F2;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class i implements F2.b {

    /* renamed from: a, reason: collision with root package name */
    private final g f5813a = new g();

    /* renamed from: b, reason: collision with root package name */
    private final b f5814b = new b();

    /* renamed from: c, reason: collision with root package name */
    private final Map f5815c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final Map f5816d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private final int f5817e;

    /* renamed from: f, reason: collision with root package name */
    private int f5818f;

    private static final class a implements l {

        /* renamed from: a, reason: collision with root package name */
        private final b f5819a;

        /* renamed from: b, reason: collision with root package name */
        int f5820b;

        /* renamed from: c, reason: collision with root package name */
        private Class f5821c;

        a(b bVar) {
            this.f5819a = bVar;
        }

        @Override // F2.l
        public void a() {
            this.f5819a.c(this);
        }

        void b(int i10, Class cls) {
            this.f5820b = i10;
            this.f5821c = cls;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f5820b == aVar.f5820b && this.f5821c == aVar.f5821c;
        }

        public int hashCode() {
            int i10 = this.f5820b * 31;
            Class cls = this.f5821c;
            return i10 + (cls != null ? cls.hashCode() : 0);
        }

        public String toString() {
            return "Key{size=" + this.f5820b + "array=" + this.f5821c + '}';
        }
    }

    private static final class b extends c {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // F2.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a a() {
            return new a(this);
        }

        a e(int i10, Class cls) {
            a aVar = (a) b();
            aVar.b(i10, cls);
            return aVar;
        }
    }

    public i(int i10) {
        this.f5817e = i10;
    }

    private void f(int i10, Class cls) {
        NavigableMap navigableMapM = m(cls);
        Integer num = (Integer) navigableMapM.get(Integer.valueOf(i10));
        if (num != null) {
            if (num.intValue() == 1) {
                navigableMapM.remove(Integer.valueOf(i10));
                return;
            } else {
                navigableMapM.put(Integer.valueOf(i10), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i10 + ", this: " + this);
    }

    private void g() {
        h(this.f5817e);
    }

    private void h(int i10) {
        while (this.f5818f > i10) {
            Object objF = this.f5813a.f();
            W2.k.d(objF);
            F2.a aVarI = i(objF);
            this.f5818f -= aVarI.c(objF) * aVarI.b();
            f(aVarI.c(objF), objF.getClass());
            if (Log.isLoggable(aVarI.a(), 2)) {
                Log.v(aVarI.a(), "evicted: " + aVarI.c(objF));
            }
        }
    }

    private F2.a i(Object obj) {
        return j(obj.getClass());
    }

    private F2.a j(Class cls) {
        F2.a fVar = (F2.a) this.f5816d.get(cls);
        if (fVar == null) {
            if (cls.equals(int[].class)) {
                fVar = new h();
            } else {
                if (!cls.equals(byte[].class)) {
                    throw new IllegalArgumentException("No array pool found for: " + cls.getSimpleName());
                }
                fVar = new f();
            }
            this.f5816d.put(cls, fVar);
        }
        return fVar;
    }

    private Object k(a aVar) {
        return this.f5813a.a(aVar);
    }

    private Object l(a aVar, Class cls) {
        F2.a aVarJ = j(cls);
        Object objK = k(aVar);
        if (objK != null) {
            this.f5818f -= aVarJ.c(objK) * aVarJ.b();
            f(aVarJ.c(objK), cls);
        }
        if (objK != null) {
            return objK;
        }
        if (Log.isLoggable(aVarJ.a(), 2)) {
            Log.v(aVarJ.a(), "Allocated " + aVar.f5820b + " bytes");
        }
        return aVarJ.newArray(aVar.f5820b);
    }

    private NavigableMap m(Class cls) {
        NavigableMap navigableMap = (NavigableMap) this.f5815c.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f5815c.put(cls, treeMap);
        return treeMap;
    }

    private boolean n() {
        int i10 = this.f5818f;
        return i10 == 0 || this.f5817e / i10 >= 2;
    }

    private boolean o(int i10) {
        return i10 <= this.f5817e / 2;
    }

    private boolean p(int i10, Integer num) {
        return num != null && (n() || num.intValue() <= i10 * 8);
    }

    @Override // F2.b
    public synchronized void a(int i10) {
        try {
            if (i10 >= 40) {
                b();
            } else if (i10 >= 20 || i10 == 15) {
                h(this.f5817e / 2);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // F2.b
    public synchronized void b() {
        h(0);
    }

    @Override // F2.b
    public synchronized Object c(int i10, Class cls) {
        return l(this.f5814b.e(i10, cls), cls);
    }

    @Override // F2.b
    public synchronized void d(Object obj) {
        Class<?> cls = obj.getClass();
        F2.a aVarJ = j(cls);
        int iC = aVarJ.c(obj);
        int iB = aVarJ.b() * iC;
        if (o(iB)) {
            a aVarE = this.f5814b.e(iC, cls);
            this.f5813a.d(aVarE, obj);
            NavigableMap navigableMapM = m(cls);
            Integer num = (Integer) navigableMapM.get(Integer.valueOf(aVarE.f5820b));
            Integer numValueOf = Integer.valueOf(aVarE.f5820b);
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapM.put(numValueOf, Integer.valueOf(iIntValue));
            this.f5818f += iB;
            g();
        }
    }

    @Override // F2.b
    public synchronized Object e(int i10, Class cls) {
        Integer num;
        try {
            num = (Integer) m(cls).ceilingKey(Integer.valueOf(i10));
        } catch (Throwable th2) {
            throw th2;
        }
        return l(p(i10, num) ? this.f5814b.e(num.intValue(), cls) : this.f5814b.e(i10, cls), cls);
    }
}
