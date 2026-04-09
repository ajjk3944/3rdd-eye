package v4;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import o4.AbstractC7072g;
import o4.y;

/* loaded from: classes3.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private final Map f63465a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f63466b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f63467c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f63468d;

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        private final Class f63473a;

        /* renamed from: b, reason: collision with root package name */
        private final C4.a f63474b;

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.f63473a.equals(this.f63473a) && cVar.f63474b.equals(this.f63474b);
        }

        public int hashCode() {
            return Objects.hash(this.f63473a, this.f63474b);
        }

        public String toString() {
            return this.f63473a.getSimpleName() + ", object identifier: " + this.f63474b;
        }

        private c(Class cls, C4.a aVar) {
            this.f63473a = cls;
            this.f63474b = aVar;
        }
    }

    private static class d {

        /* renamed from: a, reason: collision with root package name */
        private final Class f63475a;

        /* renamed from: b, reason: collision with root package name */
        private final Class f63476b;

        public boolean equals(Object obj) {
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return dVar.f63475a.equals(this.f63475a) && dVar.f63476b.equals(this.f63476b);
        }

        public int hashCode() {
            return Objects.hash(this.f63475a, this.f63476b);
        }

        public String toString() {
            return this.f63475a.getSimpleName() + " with serialization type: " + this.f63476b.getSimpleName();
        }

        private d(Class cls, Class cls2) {
            this.f63475a = cls;
            this.f63476b = cls2;
        }
    }

    public boolean e(q qVar) {
        return this.f63466b.containsKey(new c(qVar.getClass(), qVar.a()));
    }

    public AbstractC7072g f(q qVar, y yVar) throws GeneralSecurityException {
        c cVar = new c(qVar.getClass(), qVar.a());
        if (this.f63466b.containsKey(cVar)) {
            return ((AbstractC8191b) this.f63466b.get(cVar)).d(qVar, yVar);
        }
        throw new GeneralSecurityException("No Key Parser for requested key type " + cVar + " available");
    }

    private r(b bVar) {
        this.f63465a = new HashMap(bVar.f63469a);
        this.f63466b = new HashMap(bVar.f63470b);
        this.f63467c = new HashMap(bVar.f63471c);
        this.f63468d = new HashMap(bVar.f63472d);
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final Map f63469a;

        /* renamed from: b, reason: collision with root package name */
        private final Map f63470b;

        /* renamed from: c, reason: collision with root package name */
        private final Map f63471c;

        /* renamed from: d, reason: collision with root package name */
        private final Map f63472d;

        public b() {
            this.f63469a = new HashMap();
            this.f63470b = new HashMap();
            this.f63471c = new HashMap();
            this.f63472d = new HashMap();
        }

        r e() {
            return new r(this);
        }

        public b f(AbstractC8191b abstractC8191b) throws GeneralSecurityException {
            c cVar = new c(abstractC8191b.c(), abstractC8191b.b());
            if (this.f63470b.containsKey(cVar)) {
                AbstractC8191b abstractC8191b2 = (AbstractC8191b) this.f63470b.get(cVar);
                if (!abstractC8191b2.equals(abstractC8191b) || !abstractC8191b.equals(abstractC8191b2)) {
                    throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + cVar);
                }
            } else {
                this.f63470b.put(cVar, abstractC8191b);
            }
            return this;
        }

        public b g(v4.c cVar) throws GeneralSecurityException {
            d dVar = new d(cVar.b(), cVar.c());
            if (this.f63469a.containsKey(dVar)) {
                v4.c cVar2 = (v4.c) this.f63469a.get(dVar);
                if (!cVar2.equals(cVar) || !cVar.equals(cVar2)) {
                    throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + dVar);
                }
            } else {
                this.f63469a.put(dVar, cVar);
            }
            return this;
        }

        public b h(j jVar) throws GeneralSecurityException {
            c cVar = new c(jVar.c(), jVar.b());
            if (this.f63472d.containsKey(cVar)) {
                j jVar2 = (j) this.f63472d.get(cVar);
                if (!jVar2.equals(jVar) || !jVar.equals(jVar2)) {
                    throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + cVar);
                }
            } else {
                this.f63472d.put(cVar, jVar);
            }
            return this;
        }

        public b i(k kVar) throws GeneralSecurityException {
            d dVar = new d(kVar.b(), kVar.c());
            if (this.f63471c.containsKey(dVar)) {
                k kVar2 = (k) this.f63471c.get(dVar);
                if (!kVar2.equals(kVar) || !kVar.equals(kVar2)) {
                    throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + dVar);
                }
            } else {
                this.f63471c.put(dVar, kVar);
            }
            return this;
        }

        public b(r rVar) {
            this.f63469a = new HashMap(rVar.f63465a);
            this.f63470b = new HashMap(rVar.f63466b);
            this.f63471c = new HashMap(rVar.f63467c);
            this.f63472d = new HashMap(rVar.f63468d);
        }
    }
}
