package k;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class b implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public c f21786a;

    /* renamed from: b, reason: collision with root package name */
    public c f21787b;

    /* renamed from: c, reason: collision with root package name */
    public final WeakHashMap f21788c = new WeakHashMap();

    /* renamed from: d, reason: collision with root package name */
    public int f21789d = 0;

    public static class a extends e {
        public a(c cVar, c cVar2) {
            super(cVar, cVar2);
        }

        @Override // k.b.e
        public c b(c cVar) {
            return cVar.f21793d;
        }

        @Override // k.b.e
        public c c(c cVar) {
            return cVar.f21792c;
        }
    }

    /* renamed from: k.b$b, reason: collision with other inner class name */
    public static class C0424b extends e {
        public C0424b(c cVar, c cVar2) {
            super(cVar, cVar2);
        }

        @Override // k.b.e
        public c b(c cVar) {
            return cVar.f21792c;
        }

        @Override // k.b.e
        public c c(c cVar) {
            return cVar.f21793d;
        }
    }

    public static class c implements Map.Entry {

        /* renamed from: a, reason: collision with root package name */
        public final Object f21790a;

        /* renamed from: b, reason: collision with root package name */
        public final Object f21791b;

        /* renamed from: c, reason: collision with root package name */
        public c f21792c;

        /* renamed from: d, reason: collision with root package name */
        public c f21793d;

        public c(Object obj, Object obj2) {
            this.f21790a = obj;
            this.f21791b = obj2;
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
            return this.f21790a.equals(cVar.f21790a) && this.f21791b.equals(cVar.f21791b);
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f21790a;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f21791b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f21790a.hashCode() ^ this.f21791b.hashCode();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f21790a + "=" + this.f21791b;
        }
    }

    public class d extends f implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        public c f21794a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f21795b = true;

        public d() {
        }

        @Override // k.b.f
        public void a(c cVar) {
            c cVar2 = this.f21794a;
            if (cVar == cVar2) {
                c cVar3 = cVar2.f21793d;
                this.f21794a = cVar3;
                this.f21795b = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (this.f21795b) {
                this.f21795b = false;
                this.f21794a = b.this.f21786a;
            } else {
                c cVar = this.f21794a;
                this.f21794a = cVar != null ? cVar.f21792c : null;
            }
            return this.f21794a;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f21795b) {
                return b.this.f21786a != null;
            }
            c cVar = this.f21794a;
            return (cVar == null || cVar.f21792c == null) ? false : true;
        }
    }

    public static abstract class e extends f implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        public c f21797a;

        /* renamed from: b, reason: collision with root package name */
        public c f21798b;

        public e(c cVar, c cVar2) {
            this.f21797a = cVar2;
            this.f21798b = cVar;
        }

        @Override // k.b.f
        public void a(c cVar) {
            if (this.f21797a == cVar && cVar == this.f21798b) {
                this.f21798b = null;
                this.f21797a = null;
            }
            c cVar2 = this.f21797a;
            if (cVar2 == cVar) {
                this.f21797a = b(cVar2);
            }
            if (this.f21798b == cVar) {
                this.f21798b = e();
            }
        }

        public abstract c b(c cVar);

        public abstract c c(c cVar);

        @Override // java.util.Iterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            c cVar = this.f21798b;
            this.f21798b = e();
            return cVar;
        }

        public final c e() {
            c cVar = this.f21798b;
            c cVar2 = this.f21797a;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return c(cVar);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f21798b != null;
        }
    }

    public static abstract class f {
        public abstract void a(c cVar);
    }

    public Map.Entry b() {
        return this.f21786a;
    }

    public c c(Object obj) {
        c cVar = this.f21786a;
        while (cVar != null && !cVar.f21790a.equals(obj)) {
            cVar = cVar.f21792c;
        }
        return cVar;
    }

    public d d() {
        d dVar = new d();
        this.f21788c.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public Iterator descendingIterator() {
        C0424b c0424b = new C0424b(this.f21787b, this.f21786a);
        this.f21788c.put(c0424b, Boolean.FALSE);
        return c0424b;
    }

    public Map.Entry e() {
        return this.f21787b;
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
        Iterator it = iterator();
        Iterator it2 = bVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    public c f(Object obj, Object obj2) {
        c cVar = new c(obj, obj2);
        this.f21789d++;
        c cVar2 = this.f21787b;
        if (cVar2 == null) {
            this.f21786a = cVar;
            this.f21787b = cVar;
            return cVar;
        }
        cVar2.f21792c = cVar;
        cVar.f21793d = cVar2;
        this.f21787b = cVar;
        return cVar;
    }

    public Object g(Object obj, Object obj2) {
        c cVarC = c(obj);
        if (cVarC != null) {
            return cVarC.f21791b;
        }
        f(obj, obj2);
        return null;
    }

    public Object h(Object obj) {
        c cVarC = c(obj);
        if (cVarC == null) {
            return null;
        }
        this.f21789d--;
        if (!this.f21788c.isEmpty()) {
            Iterator it = this.f21788c.keySet().iterator();
            while (it.hasNext()) {
                ((f) it.next()).a(cVarC);
            }
        }
        c cVar = cVarC.f21793d;
        if (cVar != null) {
            cVar.f21792c = cVarC.f21792c;
        } else {
            this.f21786a = cVarC.f21792c;
        }
        c cVar2 = cVarC.f21792c;
        if (cVar2 != null) {
            cVar2.f21793d = cVar;
        } else {
            this.f21787b = cVar;
        }
        cVarC.f21792c = null;
        cVarC.f21793d = null;
        return cVarC.f21791b;
    }

    public int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += ((Map.Entry) it.next()).hashCode();
        }
        return iHashCode;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        a aVar = new a(this.f21786a, this.f21787b);
        this.f21788c.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public int size() {
        return this.f21789d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(((Map.Entry) it.next()).toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
