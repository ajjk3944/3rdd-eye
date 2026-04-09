package o4;

import A4.C;
import A4.I;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import y4.C8610a;

/* loaded from: classes3.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentMap f55293a;

    /* renamed from: b, reason: collision with root package name */
    private c f55294b;

    /* renamed from: c, reason: collision with root package name */
    private final Class f55295c;

    /* renamed from: d, reason: collision with root package name */
    private final C8610a f55296d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f55297e;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final Class f55298a;

        /* renamed from: b, reason: collision with root package name */
        private ConcurrentMap f55299b;

        /* renamed from: c, reason: collision with root package name */
        private c f55300c;

        /* renamed from: d, reason: collision with root package name */
        private C8610a f55301d;

        private b c(Object obj, Object obj2, C.c cVar, boolean z10) throws GeneralSecurityException {
            if (this.f55299b == null) {
                throw new IllegalStateException("addPrimitive cannot be called after build");
            }
            if (obj == null && obj2 == null) {
                throw new GeneralSecurityException("at least one of the `fullPrimitive` or `primitive` must be set");
            }
            if (cVar.b0() != A4.z.ENABLED) {
                throw new GeneralSecurityException("only ENABLED key is allowed");
            }
            c cVarB = v.b(obj, obj2, cVar, this.f55299b);
            if (z10) {
                if (this.f55300c != null) {
                    throw new IllegalStateException("you cannot set two primary primitives");
                }
                this.f55300c = cVarB;
            }
            return this;
        }

        public b a(Object obj, Object obj2, C.c cVar) {
            return c(obj, obj2, cVar, false);
        }

        public b b(Object obj, Object obj2, C.c cVar) {
            return c(obj, obj2, cVar, true);
        }

        public v d() {
            ConcurrentMap concurrentMap = this.f55299b;
            if (concurrentMap == null) {
                throw new IllegalStateException("build cannot be called twice");
            }
            v vVar = new v(concurrentMap, this.f55300c, this.f55301d, this.f55298a);
            this.f55299b = null;
            return vVar;
        }

        public b e(C8610a c8610a) {
            if (this.f55299b == null) {
                throw new IllegalStateException("setAnnotations cannot be called after build");
            }
            this.f55301d = c8610a;
            return this;
        }

        private b(Class cls) {
            this.f55299b = new ConcurrentHashMap();
            this.f55298a = cls;
            this.f55301d = C8610a.f66361b;
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final Object f55302a;

        /* renamed from: b, reason: collision with root package name */
        private final Object f55303b;

        /* renamed from: c, reason: collision with root package name */
        private final byte[] f55304c;

        /* renamed from: d, reason: collision with root package name */
        private final A4.z f55305d;

        /* renamed from: e, reason: collision with root package name */
        private final I f55306e;

        /* renamed from: f, reason: collision with root package name */
        private final int f55307f;

        /* renamed from: g, reason: collision with root package name */
        private final String f55308g;

        /* renamed from: h, reason: collision with root package name */
        private final AbstractC7072g f55309h;

        c(Object obj, Object obj2, byte[] bArr, A4.z zVar, I i10, int i11, String str, AbstractC7072g abstractC7072g) {
            this.f55302a = obj;
            this.f55303b = obj2;
            this.f55304c = Arrays.copyOf(bArr, bArr.length);
            this.f55305d = zVar;
            this.f55306e = i10;
            this.f55307f = i11;
            this.f55308g = str;
            this.f55309h = abstractC7072g;
        }

        public Object a() {
            return this.f55302a;
        }

        public final byte[] b() {
            byte[] bArr = this.f55304c;
            if (bArr == null) {
                return null;
            }
            return Arrays.copyOf(bArr, bArr.length);
        }

        public AbstractC7072g c() {
            return this.f55309h;
        }

        public int d() {
            return this.f55307f;
        }

        public String e() {
            return this.f55308g;
        }

        public I f() {
            return this.f55306e;
        }

        public Object g() {
            return this.f55303b;
        }

        public A4.z h() {
            return this.f55305d;
        }
    }

    private static class d implements Comparable {

        /* renamed from: a, reason: collision with root package name */
        private final byte[] f55310a;

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            byte[] bArr = this.f55310a;
            int length = bArr.length;
            byte[] bArr2 = dVar.f55310a;
            if (length != bArr2.length) {
                return bArr.length - bArr2.length;
            }
            int i10 = 0;
            while (true) {
                byte[] bArr3 = this.f55310a;
                if (i10 >= bArr3.length) {
                    return 0;
                }
                byte b10 = bArr3[i10];
                byte b11 = dVar.f55310a[i10];
                if (b10 != b11) {
                    return b10 - b11;
                }
                i10++;
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                return Arrays.equals(this.f55310a, ((d) obj).f55310a);
            }
            return false;
        }

        public int hashCode() {
            return Arrays.hashCode(this.f55310a);
        }

        public String toString() {
            return B4.k.b(this.f55310a);
        }

        private d(byte[] bArr) {
            this.f55310a = Arrays.copyOf(bArr, bArr.length);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static c b(Object obj, Object obj2, C.c cVar, ConcurrentMap concurrentMap) {
        Integer numValueOf = Integer.valueOf(cVar.Z());
        if (cVar.a0() == I.RAW) {
            numValueOf = null;
        }
        c cVar2 = new c(obj, obj2, AbstractC7069d.a(cVar), cVar.b0(), cVar.a0(), cVar.Z(), cVar.Y().Z(), v4.i.a().d(v4.o.b(cVar.Y().Z(), cVar.Y().a0(), cVar.Y().Y(), cVar.a0(), numValueOf), AbstractC7071f.a()));
        ArrayList arrayList = new ArrayList();
        arrayList.add(cVar2);
        d dVar = new d(cVar2.b());
        List list = (List) concurrentMap.put(dVar, Collections.unmodifiableList(arrayList));
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(list);
            arrayList2.add(cVar2);
            concurrentMap.put(dVar, Collections.unmodifiableList(arrayList2));
        }
        return cVar2;
    }

    public static b j(Class cls) {
        return new b(cls);
    }

    public Collection c() {
        return this.f55293a.values();
    }

    public C8610a d() {
        return this.f55296d;
    }

    public c e() {
        return this.f55294b;
    }

    public List f(byte[] bArr) {
        List list = (List) this.f55293a.get(new d(bArr));
        return list != null ? list : Collections.emptyList();
    }

    public Class g() {
        return this.f55295c;
    }

    public List h() {
        return f(AbstractC7069d.f55268a);
    }

    public boolean i() {
        return !this.f55296d.b().isEmpty();
    }

    private v(ConcurrentMap concurrentMap, c cVar, C8610a c8610a, Class cls) {
        this.f55293a = concurrentMap;
        this.f55294b = cVar;
        this.f55295c = cls;
        this.f55296d = c8610a;
        this.f55297e = false;
    }
}
