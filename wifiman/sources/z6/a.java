package Z6;

import Y6.h;
import Y6.k;
import Y6.o;
import Y6.r;
import Y6.v;
import com.squareup.moshi.JsonDataException;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public final class a implements h.d {

    /* renamed from: a, reason: collision with root package name */
    final Class f25176a;

    /* renamed from: b, reason: collision with root package name */
    final String f25177b;

    /* renamed from: c, reason: collision with root package name */
    final List f25178c;

    /* renamed from: d, reason: collision with root package name */
    final List f25179d;

    /* renamed from: e, reason: collision with root package name */
    final h f25180e;

    /* renamed from: Z6.a$a, reason: collision with other inner class name */
    static final class C0965a extends h {

        /* renamed from: a, reason: collision with root package name */
        final String f25181a;

        /* renamed from: b, reason: collision with root package name */
        final List f25182b;

        /* renamed from: c, reason: collision with root package name */
        final List f25183c;

        /* renamed from: d, reason: collision with root package name */
        final List f25184d;

        /* renamed from: e, reason: collision with root package name */
        final h f25185e;

        /* renamed from: f, reason: collision with root package name */
        final k.b f25186f;

        /* renamed from: g, reason: collision with root package name */
        final k.b f25187g;

        C0965a(String str, List list, List list2, List list3, h hVar) {
            this.f25181a = str;
            this.f25182b = list;
            this.f25183c = list2;
            this.f25184d = list3;
            this.f25185e = hVar;
            this.f25186f = k.b.a(str);
            this.f25187g = k.b.a((String[]) list.toArray(new String[0]));
        }

        private int l(k kVar) {
            kVar.g();
            while (kVar.s()) {
                if (kVar.p0(this.f25186f) != -1) {
                    int iQ0 = kVar.q0(this.f25187g);
                    if (iQ0 != -1 || this.f25185e != null) {
                        return iQ0;
                    }
                    throw new JsonDataException("Expected one of " + this.f25182b + " for key '" + this.f25181a + "' but found '" + kVar.Y() + "'. Register a subtype for this label.");
                }
                kVar.t0();
                kVar.u0();
            }
            throw new JsonDataException("Missing label for " + this.f25181a);
        }

        @Override // Y6.h
        public Object b(k kVar) throws IOException {
            k kVarF0 = kVar.f0();
            kVarF0.r0(false);
            try {
                int iL = l(kVarF0);
                kVarF0.close();
                return iL == -1 ? this.f25185e.b(kVar) : ((h) this.f25184d.get(iL)).b(kVar);
            } catch (Throwable th2) {
                kVarF0.close();
                throw th2;
            }
        }

        @Override // Y6.h
        public void j(o oVar, Object obj) {
            h hVar;
            int iIndexOf = this.f25183c.indexOf(obj.getClass());
            if (iIndexOf == -1) {
                hVar = this.f25185e;
                if (hVar == null) {
                    throw new IllegalArgumentException("Expected one of " + this.f25183c + " but found " + obj + ", a " + obj.getClass() + ". Register this subtype.");
                }
            } else {
                hVar = (h) this.f25184d.get(iIndexOf);
            }
            oVar.h();
            if (hVar != this.f25185e) {
                oVar.J(this.f25181a).r0((String) this.f25182b.get(iIndexOf));
            }
            int iG = oVar.g();
            hVar.j(oVar, obj);
            oVar.s(iG);
            oVar.v();
        }

        public String toString() {
            return "PolymorphicJsonAdapter(" + this.f25181a + ")";
        }
    }

    a(Class cls, String str, List list, List list2, h hVar) {
        this.f25176a = cls;
        this.f25177b = str;
        this.f25178c = list;
        this.f25179d = list2;
        this.f25180e = hVar;
    }

    public static a b(Class cls, String str) {
        if (cls == null) {
            throw new NullPointerException("baseType == null");
        }
        if (str != null) {
            return new a(cls, str, Collections.emptyList(), Collections.emptyList(), null);
        }
        throw new NullPointerException("labelKey == null");
    }

    @Override // Y6.h.d
    public h a(Type type, Set set, r rVar) {
        if (v.g(type) != this.f25176a || !set.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(this.f25179d.size());
        int size = this.f25179d.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(rVar.d((Type) this.f25179d.get(i10)));
        }
        return new C0965a(this.f25177b, this.f25178c, this.f25179d, arrayList, this.f25180e).g();
    }

    public a c(Class cls, String str) {
        if (cls == null) {
            throw new NullPointerException("subtype == null");
        }
        if (str == null) {
            throw new NullPointerException("label == null");
        }
        if (this.f25178c.contains(str)) {
            throw new IllegalArgumentException("Labels must be unique.");
        }
        ArrayList arrayList = new ArrayList(this.f25178c);
        arrayList.add(str);
        ArrayList arrayList2 = new ArrayList(this.f25179d);
        arrayList2.add(cls);
        return new a(this.f25176a, this.f25177b, arrayList, arrayList2, this.f25180e);
    }
}
