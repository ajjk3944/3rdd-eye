package v4;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import o4.AbstractC7072g;
import o4.v;
import o4.w;

/* loaded from: classes3.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    private final Map f63453a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f63454b;

    private static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final Class f63457a;

        /* renamed from: b, reason: collision with root package name */
        private final Class f63458b;

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.f63457a.equals(this.f63457a) && cVar.f63458b.equals(this.f63458b);
        }

        public int hashCode() {
            return Objects.hash(this.f63457a, this.f63458b);
        }

        public String toString() {
            return this.f63457a.getSimpleName() + " with primitive type: " + this.f63458b.getSimpleName();
        }

        private c(Class cls, Class cls2) {
            this.f63457a = cls;
            this.f63458b = cls2;
        }
    }

    public Class c(Class cls) throws GeneralSecurityException {
        if (this.f63454b.containsKey(cls)) {
            return ((w) this.f63454b.get(cls)).a();
        }
        throw new GeneralSecurityException("No input primitive class for " + cls + " available");
    }

    public Object d(AbstractC7072g abstractC7072g, Class cls) throws GeneralSecurityException {
        c cVar = new c(abstractC7072g.getClass(), cls);
        if (this.f63453a.containsKey(cVar)) {
            return ((l) this.f63453a.get(cVar)).a(abstractC7072g);
        }
        throw new GeneralSecurityException("No PrimitiveConstructor for " + cVar + " available");
    }

    public Object e(v vVar, Class cls) throws GeneralSecurityException {
        if (!this.f63454b.containsKey(cls)) {
            throw new GeneralSecurityException("No wrapper found for " + cls);
        }
        w wVar = (w) this.f63454b.get(cls);
        if (vVar.g().equals(wVar.a()) && wVar.a().equals(vVar.g())) {
            return wVar.c(vVar);
        }
        throw new GeneralSecurityException("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
    }

    private n(b bVar) {
        this.f63453a = new HashMap(bVar.f63455a);
        this.f63454b = new HashMap(bVar.f63456b);
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final Map f63455a;

        /* renamed from: b, reason: collision with root package name */
        private final Map f63456b;

        public b() {
            this.f63455a = new HashMap();
            this.f63456b = new HashMap();
        }

        n c() {
            return new n(this);
        }

        public b d(l lVar) throws GeneralSecurityException {
            if (lVar == null) {
                throw new NullPointerException("primitive constructor must be non-null");
            }
            c cVar = new c(lVar.c(), lVar.d());
            if (this.f63455a.containsKey(cVar)) {
                l lVar2 = (l) this.f63455a.get(cVar);
                if (!lVar2.equals(lVar) || !lVar.equals(lVar2)) {
                    throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: " + cVar);
                }
            } else {
                this.f63455a.put(cVar, lVar);
            }
            return this;
        }

        public b e(w wVar) throws GeneralSecurityException {
            if (wVar == null) {
                throw new NullPointerException("wrapper must be non-null");
            }
            Class clsB = wVar.b();
            if (this.f63456b.containsKey(clsB)) {
                w wVar2 = (w) this.f63456b.get(clsB);
                if (!wVar2.equals(wVar) || !wVar.equals(wVar2)) {
                    throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type" + clsB);
                }
            } else {
                this.f63456b.put(clsB, wVar);
            }
            return this;
        }

        public b(n nVar) {
            this.f63455a = new HashMap(nVar.f63453a);
            this.f63456b = new HashMap(nVar.f63454b);
        }
    }
}
