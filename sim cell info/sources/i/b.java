package i;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: b, reason: collision with root package name */
    c<K, V> f2687b;

    /* renamed from: c, reason: collision with root package name */
    private c<K, V> f2688c;

    /* renamed from: d, reason: collision with root package name */
    private WeakHashMap<f<K, V>, Boolean> f2689d = new WeakHashMap<>();

    /* renamed from: e, reason: collision with root package name */
    private int f2690e = 0;

    static class a<K, V> extends e<K, V> {
        a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // i.b.e
        c<K, V> b(c<K, V> cVar) {
            return cVar.f2694e;
        }

        @Override // i.b.e
        c<K, V> c(c<K, V> cVar) {
            return cVar.f2693d;
        }
    }

    /* renamed from: i.b$b, reason: collision with other inner class name */
    private static class C0031b<K, V> extends e<K, V> {
        C0031b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // i.b.e
        c<K, V> b(c<K, V> cVar) {
            return cVar.f2693d;
        }

        @Override // i.b.e
        c<K, V> c(c<K, V> cVar) {
            return cVar.f2694e;
        }
    }

    static class c<K, V> implements Map.Entry<K, V> {

        /* renamed from: b, reason: collision with root package name */
        final K f2691b;

        /* renamed from: c, reason: collision with root package name */
        final V f2692c;

        /* renamed from: d, reason: collision with root package name */
        c<K, V> f2693d;

        /* renamed from: e, reason: collision with root package name */
        c<K, V> f2694e;

        c(K k2, V v2) {
            this.f2691b = k2;
            this.f2692c = v2;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f2691b.equals(cVar.f2691b) && this.f2692c.equals(cVar.f2692c);
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f2691b;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f2692c;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f2691b.hashCode() ^ this.f2692c.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v2) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f2691b + "=" + this.f2692c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public class d implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: b, reason: collision with root package name */
        private c<K, V> f2695b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f2696c = true;

        d() {
        }

        @Override // i.b.f
        public void a(c<K, V> cVar) {
            c<K, V> cVar2 = this.f2695b;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f2694e;
                this.f2695b = cVar3;
                this.f2696c = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            c<K, V> cVar;
            if (this.f2696c) {
                this.f2696c = false;
                cVar = b.this.f2687b;
            } else {
                c<K, V> cVar2 = this.f2695b;
                cVar = cVar2 != null ? cVar2.f2693d : null;
            }
            this.f2695b = cVar;
            return this.f2695b;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f2696c) {
                return b.this.f2687b != null;
            }
            c<K, V> cVar = this.f2695b;
            return (cVar == null || cVar.f2693d == null) ? false : true;
        }
    }

    private static abstract class e<K, V> implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: b, reason: collision with root package name */
        c<K, V> f2698b;

        /* renamed from: c, reason: collision with root package name */
        c<K, V> f2699c;

        e(c<K, V> cVar, c<K, V> cVar2) {
            this.f2698b = cVar2;
            this.f2699c = cVar;
        }

        private c<K, V> e() {
            c<K, V> cVar = this.f2699c;
            c<K, V> cVar2 = this.f2698b;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return c(cVar);
        }

        @Override // i.b.f
        public void a(c<K, V> cVar) {
            if (this.f2698b == cVar && cVar == this.f2699c) {
                this.f2699c = null;
                this.f2698b = null;
            }
            c<K, V> cVar2 = this.f2698b;
            if (cVar2 == cVar) {
                this.f2698b = b(cVar2);
            }
            if (this.f2699c == cVar) {
                this.f2699c = e();
            }
        }

        abstract c<K, V> b(c<K, V> cVar);

        abstract c<K, V> c(c<K, V> cVar);

        @Override // java.util.Iterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            c<K, V> cVar = this.f2699c;
            this.f2699c = e();
            return cVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f2699c != null;
        }
    }

    interface f<K, V> {
        void a(c<K, V> cVar);
    }

    public Iterator<Map.Entry<K, V>> a() {
        C0031b c0031b = new C0031b(this.f2688c, this.f2687b);
        this.f2689d.put(c0031b, Boolean.FALSE);
        return c0031b;
    }

    public Map.Entry<K, V> b() {
        return this.f2687b;
    }

    protected c<K, V> c(K k2) {
        c<K, V> cVar = this.f2687b;
        while (cVar != null && !cVar.f2691b.equals(k2)) {
            cVar = cVar.f2693d;
        }
        return cVar;
    }

    public b<K, V>.d d() {
        b<K, V>.d dVar = new d();
        this.f2689d.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public Map.Entry<K, V> e() {
        return this.f2688c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (size() != bVar.size()) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = bVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry<K, V> next = it.next();
            Map.Entry<K, V> next2 = it2.next();
            if ((next == null && next2 != null) || (next != null && !next.equals(next2))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    protected c<K, V> f(K k2, V v2) {
        c<K, V> cVar = new c<>(k2, v2);
        this.f2690e++;
        c<K, V> cVar2 = this.f2688c;
        if (cVar2 == null) {
            this.f2687b = cVar;
        } else {
            cVar2.f2693d = cVar;
            cVar.f2694e = cVar2;
        }
        this.f2688c = cVar;
        return cVar;
    }

    public V g(K k2) {
        c<K, V> cVarC = c(k2);
        if (cVarC == null) {
            return null;
        }
        this.f2690e--;
        if (!this.f2689d.isEmpty()) {
            Iterator<f<K, V>> it = this.f2689d.keySet().iterator();
            while (it.hasNext()) {
                it.next().a(cVarC);
            }
        }
        c<K, V> cVar = cVarC.f2694e;
        c<K, V> cVar2 = cVarC.f2693d;
        if (cVar != null) {
            cVar.f2693d = cVar2;
        } else {
            this.f2687b = cVar2;
        }
        c<K, V> cVar3 = cVarC.f2693d;
        if (cVar3 != null) {
            cVar3.f2694e = cVar;
        } else {
            this.f2688c = cVar;
        }
        cVarC.f2693d = null;
        cVarC.f2694e = null;
        return cVarC.f2692c;
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += it.next().hashCode();
        }
        return iHashCode;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f2687b, this.f2688c);
        this.f2689d.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public int size() {
        return this.f2690e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
