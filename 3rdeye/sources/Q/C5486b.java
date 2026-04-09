package q;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: SafeIterableMap.java */
/* renamed from: q.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5486b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: b, reason: collision with root package name */
    public c<K, V> f45303b;

    /* renamed from: c, reason: collision with root package name */
    public c<K, V> f45304c;

    /* renamed from: d, reason: collision with root package name */
    public final WeakHashMap<f<K, V>, Boolean> f45305d = new WeakHashMap<>();

    /* renamed from: e, reason: collision with root package name */
    public int f45306e = 0;

    /* compiled from: SafeIterableMap.java */
    /* renamed from: q.b$a */
    public static class a<K, V> extends e<K, V> {
        @Override // q.C5486b.e
        public final c<K, V> b(c<K, V> cVar) {
            return cVar.f45310e;
        }

        @Override // q.C5486b.e
        public final c<K, V> c(c<K, V> cVar) {
            return cVar.f45309d;
        }
    }

    /* compiled from: SafeIterableMap.java */
    /* renamed from: q.b$b, reason: collision with other inner class name */
    public static class C0512b<K, V> extends e<K, V> {
        @Override // q.C5486b.e
        public final c<K, V> b(c<K, V> cVar) {
            return cVar.f45309d;
        }

        @Override // q.C5486b.e
        public final c<K, V> c(c<K, V> cVar) {
            return cVar.f45310e;
        }
    }

    /* compiled from: SafeIterableMap.java */
    /* renamed from: q.b$c */
    public static class c<K, V> implements Map.Entry<K, V> {

        /* renamed from: b, reason: collision with root package name */
        public final K f45307b;

        /* renamed from: c, reason: collision with root package name */
        public final V f45308c;

        /* renamed from: d, reason: collision with root package name */
        public c<K, V> f45309d;

        /* renamed from: e, reason: collision with root package name */
        public c<K, V> f45310e;

        public c(K k10, V v10) {
            this.f45307b = k10;
            this.f45308c = v10;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f45307b.equals(cVar.f45307b) && this.f45308c.equals(cVar.f45308c);
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f45307b;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f45308c;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            return this.f45307b.hashCode() ^ this.f45308c.hashCode();
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v10) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public final String toString() {
            return this.f45307b + "=" + this.f45308c;
        }
    }

    /* compiled from: SafeIterableMap.java */
    /* renamed from: q.b$d */
    public class d extends f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* renamed from: b, reason: collision with root package name */
        public c<K, V> f45311b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f45312c = true;

        public d() {
        }

        @Override // q.C5486b.f
        public final void a(c<K, V> cVar) {
            c<K, V> cVar2 = this.f45311b;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f45310e;
                this.f45311b = cVar3;
                this.f45312c = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f45312c) {
                return C5486b.this.f45303b != null;
            }
            c<K, V> cVar = this.f45311b;
            return (cVar == null || cVar.f45309d == null) ? false : true;
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (this.f45312c) {
                this.f45312c = false;
                this.f45311b = C5486b.this.f45303b;
            } else {
                c<K, V> cVar = this.f45311b;
                this.f45311b = cVar != null ? cVar.f45309d : null;
            }
            return this.f45311b;
        }
    }

    /* compiled from: SafeIterableMap.java */
    /* renamed from: q.b$e */
    public static abstract class e<K, V> extends f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* renamed from: b, reason: collision with root package name */
        public c<K, V> f45314b;

        /* renamed from: c, reason: collision with root package name */
        public c<K, V> f45315c;

        public e(c<K, V> cVar, c<K, V> cVar2) {
            this.f45314b = cVar2;
            this.f45315c = cVar;
        }

        @Override // q.C5486b.f
        public final void a(c<K, V> cVar) {
            c<K, V> cVarC = null;
            if (this.f45314b == cVar && cVar == this.f45315c) {
                this.f45315c = null;
                this.f45314b = null;
            }
            c<K, V> cVar2 = this.f45314b;
            if (cVar2 == cVar) {
                this.f45314b = b(cVar2);
            }
            c<K, V> cVar3 = this.f45315c;
            if (cVar3 == cVar) {
                c<K, V> cVar4 = this.f45314b;
                if (cVar3 != cVar4 && cVar4 != null) {
                    cVarC = c(cVar3);
                }
                this.f45315c = cVarC;
            }
        }

        public abstract c<K, V> b(c<K, V> cVar);

        public abstract c<K, V> c(c<K, V> cVar);

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f45315c != null;
        }

        @Override // java.util.Iterator
        public final Object next() {
            c<K, V> cVar = this.f45315c;
            c<K, V> cVar2 = this.f45314b;
            this.f45315c = (cVar == cVar2 || cVar2 == null) ? null : c(cVar);
            return cVar;
        }
    }

    /* compiled from: SafeIterableMap.java */
    /* renamed from: q.b$f */
    public static abstract class f<K, V> {
        public abstract void a(c<K, V> cVar);
    }

    public c<K, V> b(K k10) {
        c<K, V> cVar = this.f45303b;
        while (cVar != null && !cVar.f45307b.equals(k10)) {
            cVar = cVar.f45309d;
        }
        return cVar;
    }

    public V c(K k10) {
        c<K, V> cVarB = b(k10);
        if (cVarB == null) {
            return null;
        }
        this.f45306e--;
        WeakHashMap<f<K, V>, Boolean> weakHashMap = this.f45305d;
        if (!weakHashMap.isEmpty()) {
            Iterator<f<K, V>> it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                it.next().a(cVarB);
            }
        }
        c<K, V> cVar = cVarB.f45310e;
        if (cVar != null) {
            cVar.f45309d = cVarB.f45309d;
        } else {
            this.f45303b = cVarB.f45309d;
        }
        c<K, V> cVar2 = cVarB.f45309d;
        if (cVar2 != null) {
            cVar2.f45310e = cVar;
        } else {
            this.f45304c = cVar;
        }
        cVarB.f45309d = null;
        cVarB.f45310e = null;
        return cVarB.f45308c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        if (((q.C5486b.e) r7).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0052, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof q.C5486b
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            q.b r7 = (q.C5486b) r7
            int r1 = r6.f45306e
            int r3 = r7.f45306e
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L1b:
            r3 = r1
            q.b$e r3 = (q.C5486b.e) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            r4 = r7
            q.b$e r4 = (q.C5486b.e) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L44
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L3b
            if (r4 != 0) goto L43
        L3b:
            if (r3 == 0) goto L1b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L1b
        L43:
            return r2
        L44:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L53
            q.b$e r7 = (q.C5486b.e) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L53
            return r0
        L53:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: q.C5486b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int iHashCode = 0;
        while (true) {
            e eVar = (e) it;
            if (!eVar.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) eVar.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f45303b, this.f45304c);
        this.f45305d.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (true) {
            e eVar = (e) it;
            if (!eVar.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) eVar.next()).toString());
            if (eVar.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
