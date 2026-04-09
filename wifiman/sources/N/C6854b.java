package n;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: n.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6854b implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    c f54086a;

    /* renamed from: b, reason: collision with root package name */
    private c f54087b;

    /* renamed from: c, reason: collision with root package name */
    private final WeakHashMap f54088c = new WeakHashMap();

    /* renamed from: d, reason: collision with root package name */
    private int f54089d = 0;

    /* renamed from: n.b$a */
    static class a extends e {
        a(c cVar, c cVar2) {
            super(cVar, cVar2);
        }

        @Override // n.C6854b.e
        c c(c cVar) {
            return cVar.f54093d;
        }

        @Override // n.C6854b.e
        c d(c cVar) {
            return cVar.f54092c;
        }
    }

    /* renamed from: n.b$b, reason: collision with other inner class name */
    private static class C1962b extends e {
        C1962b(c cVar, c cVar2) {
            super(cVar, cVar2);
        }

        @Override // n.C6854b.e
        c c(c cVar) {
            return cVar.f54092c;
        }

        @Override // n.C6854b.e
        c d(c cVar) {
            return cVar.f54093d;
        }
    }

    /* renamed from: n.b$c */
    static class c implements Map.Entry {

        /* renamed from: a, reason: collision with root package name */
        final Object f54090a;

        /* renamed from: b, reason: collision with root package name */
        final Object f54091b;

        /* renamed from: c, reason: collision with root package name */
        c f54092c;

        /* renamed from: d, reason: collision with root package name */
        c f54093d;

        c(Object obj, Object obj2) {
            this.f54090a = obj;
            this.f54091b = obj2;
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
            return this.f54090a.equals(cVar.f54090a) && this.f54091b.equals(cVar.f54091b);
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f54090a;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f54091b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f54090a.hashCode() ^ this.f54091b.hashCode();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f54090a + "=" + this.f54091b;
        }
    }

    /* renamed from: n.b$d */
    public class d extends f implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        private c f54094a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f54095b = true;

        d() {
        }

        @Override // n.C6854b.f
        void a(c cVar) {
            c cVar2 = this.f54094a;
            if (cVar == cVar2) {
                c cVar3 = cVar2.f54093d;
                this.f54094a = cVar3;
                this.f54095b = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (this.f54095b) {
                this.f54095b = false;
                this.f54094a = C6854b.this.f54086a;
            } else {
                c cVar = this.f54094a;
                this.f54094a = cVar != null ? cVar.f54092c : null;
            }
            return this.f54094a;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f54095b) {
                return C6854b.this.f54086a != null;
            }
            c cVar = this.f54094a;
            return (cVar == null || cVar.f54092c == null) ? false : true;
        }
    }

    /* renamed from: n.b$e */
    private static abstract class e extends f implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        c f54097a;

        /* renamed from: b, reason: collision with root package name */
        c f54098b;

        e(c cVar, c cVar2) {
            this.f54097a = cVar2;
            this.f54098b = cVar;
        }

        private c f() {
            c cVar = this.f54098b;
            c cVar2 = this.f54097a;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return d(cVar);
        }

        @Override // n.C6854b.f
        public void a(c cVar) {
            if (this.f54097a == cVar && cVar == this.f54098b) {
                this.f54098b = null;
                this.f54097a = null;
            }
            c cVar2 = this.f54097a;
            if (cVar2 == cVar) {
                this.f54097a = c(cVar2);
            }
            if (this.f54098b == cVar) {
                this.f54098b = f();
            }
        }

        abstract c c(c cVar);

        abstract c d(c cVar);

        @Override // java.util.Iterator
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            c cVar = this.f54098b;
            this.f54098b = f();
            return cVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f54098b != null;
        }
    }

    /* renamed from: n.b$f */
    public static abstract class f {
        abstract void a(c cVar);
    }

    public Map.Entry b() {
        return this.f54086a;
    }

    public Iterator descendingIterator() {
        C1962b c1962b = new C1962b(this.f54087b, this.f54086a);
        this.f54088c.put(c1962b, Boolean.FALSE);
        return c1962b;
    }

    protected c e(Object obj) {
        c cVar = this.f54086a;
        while (cVar != null && !cVar.f54090a.equals(obj)) {
            cVar = cVar.f54092c;
        }
        return cVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6854b)) {
            return false;
        }
        C6854b c6854b = (C6854b) obj;
        if (size() != c6854b.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = c6854b.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    public d f() {
        d dVar = new d();
        this.f54088c.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public Map.Entry g() {
        return this.f54087b;
    }

    public int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += ((Map.Entry) it.next()).hashCode();
        }
        return iHashCode;
    }

    c i(Object obj, Object obj2) {
        c cVar = new c(obj, obj2);
        this.f54089d++;
        c cVar2 = this.f54087b;
        if (cVar2 == null) {
            this.f54086a = cVar;
            this.f54087b = cVar;
            return cVar;
        }
        cVar2.f54092c = cVar;
        cVar.f54093d = cVar2;
        this.f54087b = cVar;
        return cVar;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        a aVar = new a(this.f54086a, this.f54087b);
        this.f54088c.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public Object j(Object obj, Object obj2) {
        c cVarE = e(obj);
        if (cVarE != null) {
            return cVarE.f54091b;
        }
        i(obj, obj2);
        return null;
    }

    public Object k(Object obj) {
        c cVarE = e(obj);
        if (cVarE == null) {
            return null;
        }
        this.f54089d--;
        if (!this.f54088c.isEmpty()) {
            Iterator it = this.f54088c.keySet().iterator();
            while (it.hasNext()) {
                ((f) it.next()).a(cVarE);
            }
        }
        c cVar = cVarE.f54093d;
        if (cVar != null) {
            cVar.f54092c = cVarE.f54092c;
        } else {
            this.f54086a = cVarE.f54092c;
        }
        c cVar2 = cVarE.f54092c;
        if (cVar2 != null) {
            cVar2.f54093d = cVar;
        } else {
            this.f54087b = cVar;
        }
        cVarE.f54092c = null;
        cVarE.f54093d = null;
        return cVarE.f54091b;
    }

    public int size() {
        return this.f54089d;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb2.append(((Map.Entry) it.next()).toString());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }
}
