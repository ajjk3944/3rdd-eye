package Y6;

import Y6.h;
import a7.AbstractC3770c;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class r {

    /* renamed from: e, reason: collision with root package name */
    static final List f24728e;

    /* renamed from: a, reason: collision with root package name */
    private final List f24729a;

    /* renamed from: b, reason: collision with root package name */
    private final int f24730b;

    /* renamed from: c, reason: collision with root package name */
    private final ThreadLocal f24731c = new ThreadLocal();

    /* renamed from: d, reason: collision with root package name */
    private final Map f24732d = new LinkedHashMap();

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        final List f24733a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        int f24734b = 0;

        public a a(h.d dVar) {
            if (dVar == null) {
                throw new IllegalArgumentException("factory == null");
            }
            List list = this.f24733a;
            int i10 = this.f24734b;
            this.f24734b = i10 + 1;
            list.add(i10, dVar);
            return this;
        }

        public a b(Object obj) {
            if (obj != null) {
                return a(Y6.a.d(obj));
            }
            throw new IllegalArgumentException("adapter == null");
        }

        public r c() {
            return new r(this);
        }
    }

    static final class b extends h {

        /* renamed from: a, reason: collision with root package name */
        final Type f24735a;

        /* renamed from: b, reason: collision with root package name */
        final String f24736b;

        /* renamed from: c, reason: collision with root package name */
        final Object f24737c;

        /* renamed from: d, reason: collision with root package name */
        h f24738d;

        b(Type type, String str, Object obj) {
            this.f24735a = type;
            this.f24736b = str;
            this.f24737c = obj;
        }

        @Override // Y6.h
        public Object b(k kVar) {
            h hVar = this.f24738d;
            if (hVar != null) {
                return hVar.b(kVar);
            }
            throw new IllegalStateException("JsonAdapter isn't ready");
        }

        @Override // Y6.h
        public void j(o oVar, Object obj) {
            h hVar = this.f24738d;
            if (hVar == null) {
                throw new IllegalStateException("JsonAdapter isn't ready");
            }
            hVar.j(oVar, obj);
        }

        public String toString() {
            h hVar = this.f24738d;
            return hVar != null ? hVar.toString() : super.toString();
        }
    }

    final class c {

        /* renamed from: a, reason: collision with root package name */
        final List f24739a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        final Deque f24740b = new ArrayDeque();

        /* renamed from: c, reason: collision with root package name */
        boolean f24741c;

        c() {
        }

        void a(h hVar) {
            ((b) this.f24740b.getLast()).f24738d = hVar;
        }

        IllegalArgumentException b(IllegalArgumentException illegalArgumentException) {
            if (this.f24741c) {
                return illegalArgumentException;
            }
            this.f24741c = true;
            if (this.f24740b.size() == 1 && ((b) this.f24740b.getFirst()).f24736b == null) {
                return illegalArgumentException;
            }
            StringBuilder sb2 = new StringBuilder(illegalArgumentException.getMessage());
            Iterator itDescendingIterator = this.f24740b.descendingIterator();
            while (itDescendingIterator.hasNext()) {
                b bVar = (b) itDescendingIterator.next();
                sb2.append("\nfor ");
                sb2.append(bVar.f24735a);
                if (bVar.f24736b != null) {
                    sb2.append(' ');
                    sb2.append(bVar.f24736b);
                }
            }
            return new IllegalArgumentException(sb2.toString(), illegalArgumentException);
        }

        void c(boolean z10) {
            this.f24740b.removeLast();
            if (this.f24740b.isEmpty()) {
                r.this.f24731c.remove();
                if (z10) {
                    synchronized (r.this.f24732d) {
                        try {
                            int size = this.f24739a.size();
                            for (int i10 = 0; i10 < size; i10++) {
                                b bVar = (b) this.f24739a.get(i10);
                                h hVar = (h) r.this.f24732d.put(bVar.f24737c, bVar.f24738d);
                                if (hVar != null) {
                                    bVar.f24738d = hVar;
                                    r.this.f24732d.put(bVar.f24737c, hVar);
                                }
                            }
                        } finally {
                        }
                    }
                }
            }
        }

        h d(Type type, String str, Object obj) {
            int size = this.f24739a.size();
            for (int i10 = 0; i10 < size; i10++) {
                b bVar = (b) this.f24739a.get(i10);
                if (bVar.f24737c.equals(obj)) {
                    this.f24740b.add(bVar);
                    h hVar = bVar.f24738d;
                    return hVar != null ? hVar : bVar;
                }
            }
            b bVar2 = new b(type, str, obj);
            this.f24739a.add(bVar2);
            this.f24740b.add(bVar2);
            return null;
        }
    }

    static {
        ArrayList arrayList = new ArrayList(5);
        f24728e = arrayList;
        arrayList.add(t.f24744a);
        arrayList.add(e.f24652b);
        arrayList.add(q.f24725c);
        arrayList.add(Y6.b.f24632c);
        arrayList.add(s.f24743a);
        arrayList.add(d.f24645d);
    }

    r(a aVar) {
        int size = aVar.f24733a.size();
        List list = f24728e;
        ArrayList arrayList = new ArrayList(size + list.size());
        arrayList.addAll(aVar.f24733a);
        arrayList.addAll(list);
        this.f24729a = Collections.unmodifiableList(arrayList);
        this.f24730b = aVar.f24734b;
    }

    private Object g(Type type, Set set) {
        return set.isEmpty() ? type : Arrays.asList(type, set);
    }

    public h c(Class cls) {
        return e(cls, AbstractC3770c.f25735a);
    }

    public h d(Type type) {
        return e(type, AbstractC3770c.f25735a);
    }

    public h e(Type type, Set set) {
        return f(type, set, null);
    }

    public h f(Type type, Set set, String str) {
        if (type == null) {
            throw new NullPointerException("type == null");
        }
        if (set == null) {
            throw new NullPointerException("annotations == null");
        }
        Type typeP = AbstractC3770c.p(AbstractC3770c.a(type));
        Object objG = g(typeP, set);
        synchronized (this.f24732d) {
            try {
                h hVar = (h) this.f24732d.get(objG);
                if (hVar != null) {
                    return hVar;
                }
                c cVar = (c) this.f24731c.get();
                if (cVar == null) {
                    cVar = new c();
                    this.f24731c.set(cVar);
                }
                h hVarD = cVar.d(typeP, str, objG);
                try {
                    if (hVarD != null) {
                        return hVarD;
                    }
                    try {
                        int size = this.f24729a.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            h hVarA = ((h.d) this.f24729a.get(i10)).a(typeP, set, this);
                            if (hVarA != null) {
                                cVar.a(hVarA);
                                cVar.c(true);
                                return hVarA;
                            }
                        }
                        throw new IllegalArgumentException("No JsonAdapter for " + AbstractC3770c.u(typeP, set));
                    } catch (IllegalArgumentException e10) {
                        throw cVar.b(e10);
                    }
                } finally {
                    cVar.c(false);
                }
            } finally {
            }
        }
    }

    public h h(h.d dVar, Type type, Set set) {
        if (set == null) {
            throw new NullPointerException("annotations == null");
        }
        Type typeP = AbstractC3770c.p(AbstractC3770c.a(type));
        int iIndexOf = this.f24729a.indexOf(dVar);
        if (iIndexOf == -1) {
            throw new IllegalArgumentException("Unable to skip past unknown factory " + dVar);
        }
        int size = this.f24729a.size();
        for (int i10 = iIndexOf + 1; i10 < size; i10++) {
            h hVarA = ((h.d) this.f24729a.get(i10)).a(typeP, set, this);
            if (hVarA != null) {
                return hVarA;
            }
        }
        throw new IllegalArgumentException("No next JsonAdapter for " + AbstractC3770c.u(typeP, set));
    }
}
