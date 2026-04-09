package O2;

import H6.B;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.NavigableMap;
import java.util.TreeMap;
import t4.C5606d;

/* compiled from: LruArrayPool.java */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final e<a, Object> f10180a = new e<>();

    /* renamed from: b, reason: collision with root package name */
    public final b f10181b = new b();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f10182c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f10183d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final int f10184e;

    /* renamed from: f, reason: collision with root package name */
    public int f10185f;

    /* compiled from: LruArrayPool.java */
    public static final class a implements i {

        /* renamed from: a, reason: collision with root package name */
        public final b f10186a;

        /* renamed from: b, reason: collision with root package name */
        public int f10187b;

        /* renamed from: c, reason: collision with root package name */
        public Class<?> f10188c;

        public a(b bVar) {
            this.f10186a = bVar;
        }

        @Override // O2.i
        public final void a() {
            this.f10186a.l(this);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f10187b == aVar.f10187b && this.f10188c == aVar.f10188c) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            int i = this.f10187b * 31;
            Class<?> cls = this.f10188c;
            return i + (cls != null ? cls.hashCode() : 0);
        }

        public final String toString() {
            return "Key{size=" + this.f10187b + "array=" + this.f10188c + '}';
        }
    }

    /* compiled from: LruArrayPool.java */
    public static final class b extends B {
        public final i m() {
            return new a(this);
        }
    }

    public g(int i) {
        this.f10184e = i;
    }

    public final synchronized void a() {
        c(0);
    }

    public final void b(int i, Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMapG = g(cls);
        Integer num = navigableMapG.get(Integer.valueOf(i));
        if (num != null) {
            if (num.intValue() == 1) {
                navigableMapG.remove(Integer.valueOf(i));
                return;
            } else {
                navigableMapG.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + this);
    }

    public final void c(int i) {
        while (this.f10185f > i) {
            Object objC = this.f10180a.c();
            C5606d.k(objC);
            O2.a aVarE = e(objC.getClass());
            this.f10185f -= aVarE.a() * aVarE.b(objC);
            b(aVarE.b(objC), objC.getClass());
            if (Log.isLoggable(aVarE.getTag(), 2)) {
                Log.v(aVarE.getTag(), "evicted: " + aVarE.b(objC));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized <T> T d(int i, Class<T> cls) {
        a aVar;
        int i10;
        try {
            Integer numCeilingKey = g(cls).ceilingKey(Integer.valueOf(i));
            if (numCeilingKey == null || ((i10 = this.f10185f) != 0 && this.f10184e / i10 < 2 && numCeilingKey.intValue() > i * 8)) {
                b bVar = this.f10181b;
                i iVarM = (i) ((ArrayDeque) bVar.f2034b).poll();
                if (iVarM == null) {
                    iVarM = bVar.m();
                }
                aVar = (a) iVarM;
                aVar.f10187b = i;
                aVar.f10188c = cls;
            } else {
                b bVar2 = this.f10181b;
                int iIntValue = numCeilingKey.intValue();
                i iVarM2 = (i) ((ArrayDeque) bVar2.f2034b).poll();
                if (iVarM2 == null) {
                    iVarM2 = bVar2.m();
                }
                aVar = (a) iVarM2;
                aVar.f10187b = iIntValue;
                aVar.f10188c = cls;
            }
        } catch (Throwable th) {
            throw th;
        }
        return (T) f(aVar, cls);
    }

    public final <T> O2.a<T> e(Class<T> cls) {
        O2.a<T> dVar;
        HashMap map = this.f10183d;
        O2.a<T> aVar = (O2.a) map.get(cls);
        if (aVar != null) {
            return aVar;
        }
        if (cls.equals(int[].class)) {
            dVar = new f();
        } else {
            if (!cls.equals(byte[].class)) {
                throw new IllegalArgumentException("No array pool found for: ".concat(cls.getSimpleName()));
            }
            dVar = new d();
        }
        map.put(cls, dVar);
        return dVar;
    }

    public final <T> T f(a aVar, Class<T> cls) {
        O2.a<T> aVarE = e(cls);
        T t10 = (T) this.f10180a.a(aVar);
        if (t10 != null) {
            this.f10185f -= aVarE.a() * aVarE.b(t10);
            b(aVarE.b(t10), cls);
        }
        if (t10 != null) {
            return t10;
        }
        if (Log.isLoggable(aVarE.getTag(), 2)) {
            Log.v(aVarE.getTag(), "Allocated " + aVar.f10187b + " bytes");
        }
        return aVarE.newArray(aVar.f10187b);
    }

    public final NavigableMap<Integer, Integer> g(Class<?> cls) {
        HashMap map = this.f10182c;
        NavigableMap<Integer, Integer> navigableMap = (NavigableMap) map.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(cls, treeMap);
        return treeMap;
    }

    public final synchronized <T> void h(T t10) {
        Class<?> cls = t10.getClass();
        O2.a<T> aVarE = e(cls);
        int iB = aVarE.b(t10);
        int iA = aVarE.a() * iB;
        if (iA <= this.f10184e / 2) {
            b bVar = this.f10181b;
            i iVarM = (i) ((ArrayDeque) bVar.f2034b).poll();
            if (iVarM == null) {
                iVarM = bVar.m();
            }
            a aVar = (a) iVarM;
            aVar.f10187b = iB;
            aVar.f10188c = cls;
            this.f10180a.b(aVar, t10);
            NavigableMap<Integer, Integer> navigableMapG = g(cls);
            Integer num = navigableMapG.get(Integer.valueOf(aVar.f10187b));
            Integer numValueOf = Integer.valueOf(aVar.f10187b);
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapG.put(numValueOf, Integer.valueOf(iIntValue));
            this.f10185f += iA;
            c(this.f10184e);
        }
    }

    public final synchronized void i(int i) {
        try {
            if (i >= 40) {
                a();
            } else if (i >= 20 || i == 15) {
                c(this.f10184e / 2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
