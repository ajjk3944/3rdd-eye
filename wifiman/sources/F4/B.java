package F4;

import com.google.firebase.components.DependencyException;
import f5.InterfaceC5535a;
import f5.InterfaceC5536b;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes3.dex */
final class B implements d {

    /* renamed from: a, reason: collision with root package name */
    private final Set f5947a;

    /* renamed from: b, reason: collision with root package name */
    private final Set f5948b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f5949c;

    /* renamed from: d, reason: collision with root package name */
    private final Set f5950d;

    /* renamed from: e, reason: collision with root package name */
    private final Set f5951e;

    /* renamed from: f, reason: collision with root package name */
    private final Set f5952f;

    /* renamed from: g, reason: collision with root package name */
    private final d f5953g;

    private static class a implements d5.c {

        /* renamed from: a, reason: collision with root package name */
        private final Set f5954a;

        /* renamed from: b, reason: collision with root package name */
        private final d5.c f5955b;

        public a(Set set, d5.c cVar) {
            this.f5954a = set;
            this.f5955b = cVar;
        }
    }

    B(c cVar, d dVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (q qVar : cVar.g()) {
            if (qVar.e()) {
                if (qVar.g()) {
                    hashSet4.add(qVar.c());
                } else {
                    hashSet.add(qVar.c());
                }
            } else if (qVar.d()) {
                hashSet3.add(qVar.c());
            } else if (qVar.g()) {
                hashSet5.add(qVar.c());
            } else {
                hashSet2.add(qVar.c());
            }
        }
        if (!cVar.k().isEmpty()) {
            hashSet.add(A.b(d5.c.class));
        }
        this.f5947a = Collections.unmodifiableSet(hashSet);
        this.f5948b = Collections.unmodifiableSet(hashSet2);
        this.f5949c = Collections.unmodifiableSet(hashSet3);
        this.f5950d = Collections.unmodifiableSet(hashSet4);
        this.f5951e = Collections.unmodifiableSet(hashSet5);
        this.f5952f = cVar.k();
        this.f5953g = dVar;
    }

    @Override // F4.d
    public Object a(Class cls) {
        if (!this.f5947a.contains(A.b(cls))) {
            throw new DependencyException(String.format("Attempting to request an undeclared dependency %s.", cls));
        }
        Object objA = this.f5953g.a(cls);
        return !cls.equals(d5.c.class) ? objA : new a(this.f5952f, (d5.c) objA);
    }

    @Override // F4.d
    public Set b(A a10) {
        if (this.f5950d.contains(a10)) {
            return this.f5953g.b(a10);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Set<%s>.", a10));
    }

    @Override // F4.d
    public InterfaceC5535a c(A a10) {
        if (this.f5949c.contains(a10)) {
            return this.f5953g.c(a10);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Deferred<%s>.", a10));
    }

    @Override // F4.d
    public InterfaceC5536b d(A a10) {
        if (this.f5948b.contains(a10)) {
            return this.f5953g.d(a10);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<%s>.", a10));
    }

    @Override // F4.d
    public InterfaceC5536b e(Class cls) {
        return d(A.b(cls));
    }

    @Override // F4.d
    public Object f(A a10) {
        if (this.f5947a.contains(a10)) {
            return this.f5953g.f(a10);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency %s.", a10));
    }

    @Override // F4.d
    public InterfaceC5536b h(A a10) {
        if (this.f5951e.contains(a10)) {
            return this.f5953g.h(a10);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", a10));
    }

    @Override // F4.d
    public InterfaceC5535a i(Class cls) {
        return c(A.b(cls));
    }
}
