package ij;

import gj.InterfaceC5924a;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: ij.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6178a extends AbstractMap implements Map {

    /* renamed from: i, reason: collision with root package name */
    protected static final Object f49244i = new Object();

    /* renamed from: a, reason: collision with root package name */
    transient float f49245a;

    /* renamed from: b, reason: collision with root package name */
    transient int f49246b;

    /* renamed from: c, reason: collision with root package name */
    transient b[] f49247c;

    /* renamed from: d, reason: collision with root package name */
    transient int f49248d;

    /* renamed from: e, reason: collision with root package name */
    transient int f49249e;

    /* renamed from: f, reason: collision with root package name */
    transient C1853a f49250f;

    /* renamed from: g, reason: collision with root package name */
    transient c f49251g;

    /* renamed from: h, reason: collision with root package name */
    transient d f49252h;

    /* renamed from: ij.a$a, reason: collision with other inner class name */
    protected static class C1853a extends AbstractSet {

        /* renamed from: a, reason: collision with root package name */
        private final AbstractC6178a f49253a;

        protected C1853a(AbstractC6178a abstractC6178a) {
            this.f49253a = abstractC6178a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.f49253a.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            b bVarC0 = this.f49253a.C0(entry.getKey());
            return bVarC0 != null && bVarC0.equals(entry);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return this.f49253a.K();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry) || !contains(obj)) {
                return false;
            }
            this.f49253a.remove(((Map.Entry) obj).getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f49253a.size();
        }
    }

    /* renamed from: ij.a$b */
    protected static class b implements Map.Entry {

        /* renamed from: a, reason: collision with root package name */
        protected b f49254a;

        /* renamed from: b, reason: collision with root package name */
        protected int f49255b;

        /* renamed from: c, reason: collision with root package name */
        protected Object f49256c;

        /* renamed from: d, reason: collision with root package name */
        protected Object f49257d;

        protected b(b bVar, int i10, Object obj, Object obj2) {
            this.f49254a = bVar;
            this.f49255b = i10;
            this.f49256c = obj;
            this.f49257d = obj2;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (getKey() != null ? getKey().equals(entry.getKey()) : entry.getKey() == null) {
                if (getValue() == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (getValue().equals(entry.getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            Object obj = this.f49256c;
            if (obj == AbstractC6178a.f49244i) {
                return null;
            }
            return obj;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f49257d;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return (getKey() == null ? 0 : getKey().hashCode()) ^ (getValue() != null ? getValue().hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            Object obj2 = this.f49257d;
            this.f49257d = obj;
            return obj2;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getKey());
            sb2.append('=');
            sb2.append(getValue());
            return sb2.toString();
        }
    }

    /* renamed from: ij.a$c */
    protected static class c extends AbstractSet {

        /* renamed from: a, reason: collision with root package name */
        private final AbstractC6178a f49258a;

        protected c(AbstractC6178a abstractC6178a) {
            this.f49258a = abstractC6178a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.f49258a.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f49258a.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return this.f49258a.P();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            boolean zContainsKey = this.f49258a.containsKey(obj);
            this.f49258a.remove(obj);
            return zContainsKey;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f49258a.size();
        }
    }

    /* renamed from: ij.a$d */
    protected static class d extends AbstractCollection {

        /* renamed from: a, reason: collision with root package name */
        private final AbstractC6178a f49259a;

        protected d(AbstractC6178a abstractC6178a) {
            this.f49259a = abstractC6178a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            this.f49259a.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return this.f49259a.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return this.f49259a.S();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f49259a.size();
        }
    }

    protected AbstractC6178a() {
    }

    private void d(Map map) {
        if (map.size() == 0) {
            return;
        }
        f0(n((int) (((this.f49246b + r0) / this.f49245a) + 1.0f)));
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    protected Object B(Object obj) {
        return obj == null ? f49244i : obj;
    }

    protected b C0(Object obj) {
        Object objB = B(obj);
        int iE0 = E0(objB);
        b[] bVarArr = this.f49247c;
        for (b bVar = bVarArr[G0(iE0, bVarArr.length)]; bVar != null; bVar = bVar.f49254a) {
            if (bVar.f49255b == iE0 && N0(objB, bVar.f49256c)) {
                return bVar;
            }
        }
        return null;
    }

    protected abstract b E(b bVar, int i10, Object obj, Object obj2);

    protected int E0(Object obj) {
        int iHashCode = obj.hashCode();
        int i10 = iHashCode + (~(iHashCode << 9));
        int i11 = i10 ^ (i10 >>> 14);
        int i12 = i11 + (i11 << 4);
        return i12 ^ (i12 >>> 10);
    }

    protected int G0(int i10, int i11) {
        return i10 & (i11 - 1);
    }

    protected abstract Iterator K();

    protected abstract void M0();

    protected boolean N0(Object obj, Object obj2) {
        return obj == obj2 || obj.equals(obj2);
    }

    protected abstract Iterator P();

    protected boolean P0(Object obj, Object obj2) {
        return obj == obj2 || obj.equals(obj2);
    }

    protected abstract Iterator S();

    public abstract InterfaceC5924a T0();

    protected void U0(b bVar, int i10, b bVar2) {
        if (bVar2 == null) {
            this.f49247c[i10] = bVar.f49254a;
        } else {
            bVar2.f49254a = bVar.f49254a;
        }
    }

    protected void V0(b bVar, int i10, b bVar2) {
        this.f49249e++;
        U0(bVar, i10, bVar2);
        this.f49246b--;
        d0(bVar);
    }

    protected void W0(b bVar, int i10, int i11, Object obj, Object obj2) {
        bVar.f49254a = this.f49247c[i10];
        bVar.f49255b = i11;
        bVar.f49256c = obj;
        bVar.f49257d = obj2;
    }

    protected abstract void X0(b bVar, Object obj);

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f49249e++;
        b[] bVarArr = this.f49247c;
        for (int length = bVarArr.length - 1; length >= 0; length--) {
            bVarArr[length] = null;
        }
        this.f49246b = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Object objB = B(obj);
        int iE0 = E0(objB);
        b[] bVarArr = this.f49247c;
        for (b bVar = bVarArr[G0(iE0, bVarArr.length)]; bVar != null; bVar = bVar.f49254a) {
            if (bVar.f49255b == iE0 && N0(objB, bVar.f49256c)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public abstract boolean containsValue(Object obj);

    protected void d0(b bVar) {
        bVar.f49254a = null;
        bVar.f49256c = null;
        bVar.f49257d = null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        if (this.f49250f == null) {
            this.f49250f = new C1853a(this);
        }
        return this.f49250f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (map.size() != size()) {
            return false;
        }
        InterfaceC5924a interfaceC5924aT0 = T0();
        while (interfaceC5924aT0.hasNext()) {
            try {
                Object next = interfaceC5924aT0.next();
                Object value = interfaceC5924aT0.getValue();
                if (value == null) {
                    if (map.get(next) != null || !map.containsKey(next)) {
                        return false;
                    }
                } else if (!value.equals(map.get(next))) {
                    return false;
                }
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }
        return true;
    }

    protected void f0(int i10) {
        b[] bVarArr = this.f49247c;
        int length = bVarArr.length;
        if (i10 <= length) {
            return;
        }
        if (this.f49246b == 0) {
            this.f49248d = p(i10, this.f49245a);
            this.f49247c = new b[i10];
            return;
        }
        b[] bVarArr2 = new b[i10];
        this.f49249e++;
        for (int i11 = length - 1; i11 >= 0; i11--) {
            b bVar = bVarArr[i11];
            if (bVar != null) {
                bVarArr[i11] = null;
                while (true) {
                    b bVar2 = bVar.f49254a;
                    int iG0 = G0(bVar.f49255b, i10);
                    bVar.f49254a = bVarArr2[iG0];
                    bVarArr2[iG0] = bVar;
                    if (bVar2 == null) {
                        break;
                    } else {
                        bVar = bVar2;
                    }
                }
            }
        }
        this.f49248d = p(i10, this.f49245a);
        this.f49247c = bVarArr2;
    }

    protected abstract void h(b bVar, int i10);

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        Iterator itK = K();
        int iHashCode = 0;
        while (itK.hasNext()) {
            iHashCode += ((Map.Entry) itK.next()).hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return this.f49246b == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        if (this.f49251g == null) {
            this.f49251g = new c(this);
        }
        return this.f49251g;
    }

    protected void l(int i10, int i11, Object obj, Object obj2) {
        this.f49249e++;
        h(E(this.f49247c[i10], i11, obj, obj2), i10);
        this.f49246b++;
        r();
    }

    protected int n(int i10) {
        if (i10 > 1073741824) {
            return 1073741824;
        }
        int i11 = 1;
        while (i11 < i10) {
            i11 <<= 1;
        }
        if (i11 > 1073741824) {
            return 1073741824;
        }
        return i11;
    }

    protected int p(int i10, float f10) {
        return (int) (i10 * f10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        Object objB = B(obj);
        int iE0 = E0(objB);
        int iG0 = G0(iE0, this.f49247c.length);
        for (b bVar = this.f49247c[iG0]; bVar != null; bVar = bVar.f49254a) {
            if (bVar.f49255b == iE0 && N0(objB, bVar.f49256c)) {
                Object value = bVar.getValue();
                X0(bVar, obj2);
                return value;
            }
        }
        l(iG0, iE0, obj, obj2);
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map map) {
        d(map);
    }

    protected void r() {
        int length;
        if (this.f49246b < this.f49248d || (length = this.f49247c.length * 2) > 1073741824) {
            return;
        }
        f0(length);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        Object objB = B(obj);
        int iE0 = E0(objB);
        int iG0 = G0(iE0, this.f49247c.length);
        b bVar = null;
        for (b bVar2 = this.f49247c[iG0]; bVar2 != null; bVar2 = bVar2.f49254a) {
            if (bVar2.f49255b == iE0 && N0(objB, bVar2.f49256c)) {
                Object value = bVar2.getValue();
                V0(bVar2, iG0, bVar);
                return value;
            }
            bVar = bVar2;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f49246b;
    }

    protected AbstractC6178a t() {
        try {
            AbstractC6178a abstractC6178a = (AbstractC6178a) super.clone();
            abstractC6178a.f49247c = new b[this.f49247c.length];
            abstractC6178a.f49250f = null;
            abstractC6178a.f49251g = null;
            abstractC6178a.f49252h = null;
            abstractC6178a.f49249e = 0;
            abstractC6178a.f49246b = 0;
            abstractC6178a.M0();
            abstractC6178a.putAll(this);
            return abstractC6178a;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.util.AbstractMap
    public String toString() {
        if (size() == 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(size() * 32);
        sb2.append('{');
        InterfaceC5924a interfaceC5924aT0 = T0();
        boolean zHasNext = interfaceC5924aT0.hasNext();
        while (zHasNext) {
            Object next = interfaceC5924aT0.next();
            Object value = interfaceC5924aT0.getValue();
            if (next == this) {
                next = "(this Map)";
            }
            sb2.append(next);
            sb2.append('=');
            if (value == this) {
                value = "(this Map)";
            }
            sb2.append(value);
            zHasNext = interfaceC5924aT0.hasNext();
            if (zHasNext) {
                sb2.append(',');
                sb2.append(' ');
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection values() {
        if (this.f49252h == null) {
            this.f49252h = new d(this);
        }
        return this.f49252h;
    }

    protected AbstractC6178a(int i10, float f10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Initial capacity must be a non negative number");
        }
        if (f10 <= 0.0f || Float.isNaN(f10)) {
            throw new IllegalArgumentException("Load factor must be greater than 0");
        }
        this.f49245a = f10;
        int iN = n(i10);
        this.f49248d = p(iN, f10);
        this.f49247c = new b[iN];
        M0();
    }
}
