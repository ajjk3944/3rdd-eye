package I4;

import g5.InterfaceC4391a;
import g5.InterfaceC4392b;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: RestrictedComponentContainer.java */
/* loaded from: classes2.dex */
public final class t implements b {

    /* renamed from: a, reason: collision with root package name */
    public final Set<s<?>> f2483a;

    /* renamed from: b, reason: collision with root package name */
    public final Set<s<?>> f2484b;

    /* renamed from: c, reason: collision with root package name */
    public final Set<s<?>> f2485c;

    /* renamed from: d, reason: collision with root package name */
    public final Set<s<?>> f2486d;

    /* renamed from: e, reason: collision with root package name */
    public final b f2487e;

    /* compiled from: RestrictedComponentContainer.java */
    public static class a implements d5.c {

        /* renamed from: a, reason: collision with root package name */
        public final d5.c f2488a;

        public a(d5.c cVar) {
            this.f2488a = cVar;
        }
    }

    public t(I4.a<?> aVar, b bVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (i iVar : aVar.f2435c) {
            int i = iVar.f2467c;
            boolean z10 = i == 0;
            int i10 = iVar.f2466b;
            s<?> sVar = iVar.f2465a;
            if (z10) {
                if (i10 == 2) {
                    hashSet4.add(sVar);
                } else {
                    hashSet.add(sVar);
                }
            } else if (i == 2) {
                hashSet3.add(sVar);
            } else if (i10 == 2) {
                hashSet5.add(sVar);
            } else {
                hashSet2.add(sVar);
            }
        }
        if (!aVar.f2439g.isEmpty()) {
            hashSet.add(s.a(d5.c.class));
        }
        this.f2483a = Collections.unmodifiableSet(hashSet);
        this.f2484b = Collections.unmodifiableSet(hashSet2);
        this.f2485c = Collections.unmodifiableSet(hashSet3);
        this.f2486d = Collections.unmodifiableSet(hashSet4);
        Collections.unmodifiableSet(hashSet5);
        this.f2487e = bVar;
    }

    @Override // I4.b
    public final <T> T a(Class<T> cls) {
        if (this.f2483a.contains(s.a(cls))) {
            T t10 = (T) this.f2487e.a(cls);
            return !cls.equals(d5.c.class) ? t10 : (T) new a((d5.c) t10);
        }
        throw new k("Attempting to request an undeclared dependency " + cls + ".");
    }

    @Override // I4.b
    public final <T> T b(s<T> sVar) {
        if (this.f2483a.contains(sVar)) {
            return (T) this.f2487e.b(sVar);
        }
        throw new k("Attempting to request an undeclared dependency " + sVar + ".");
    }

    @Override // I4.b
    public final <T> InterfaceC4392b<T> c(Class<T> cls) {
        return e(s.a(cls));
    }

    @Override // I4.b
    public final <T> Set<T> d(s<T> sVar) {
        if (this.f2486d.contains(sVar)) {
            return this.f2487e.d(sVar);
        }
        throw new k("Attempting to request an undeclared dependency Set<" + sVar + ">.");
    }

    @Override // I4.b
    public final <T> InterfaceC4392b<T> e(s<T> sVar) {
        if (this.f2484b.contains(sVar)) {
            return this.f2487e.e(sVar);
        }
        throw new k("Attempting to request an undeclared dependency Provider<" + sVar + ">.");
    }

    @Override // I4.b
    public final <T> InterfaceC4391a<T> f(s<T> sVar) {
        if (this.f2485c.contains(sVar)) {
            return this.f2487e.f(sVar);
        }
        throw new k("Attempting to request an undeclared dependency Deferred<" + sVar + ">.");
    }

    public final <T> InterfaceC4391a<T> g(Class<T> cls) {
        return f(s.a(cls));
    }

    public final Set h(Class cls) {
        return d(s.a(cls));
    }
}
