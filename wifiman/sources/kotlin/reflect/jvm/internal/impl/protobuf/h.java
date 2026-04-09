package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.a;
import kotlin.reflect.jvm.internal.impl.protobuf.g;
import kotlin.reflect.jvm.internal.impl.protobuf.i;
import kotlin.reflect.jvm.internal.impl.protobuf.n;
import kotlin.reflect.jvm.internal.impl.protobuf.v;

/* loaded from: classes4.dex */
public abstract class h extends kotlin.reflect.jvm.internal.impl.protobuf.a implements Serializable {

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f51975a;

        static {
            int[] iArr = new int[v.c.values().length];
            f51975a = iArr;
            try {
                iArr[v.c.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f51975a[v.c.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static abstract class b extends a.AbstractC1921a {

        /* renamed from: a, reason: collision with root package name */
        private kotlin.reflect.jvm.internal.impl.protobuf.d f51976a = kotlin.reflect.jvm.internal.impl.protobuf.d.f51945a;

        protected b() {
        }

        public final kotlin.reflect.jvm.internal.impl.protobuf.d e() {
            return this.f51976a;
        }

        public abstract b f(h hVar);

        public final b i(kotlin.reflect.jvm.internal.impl.protobuf.d dVar) {
            this.f51976a = dVar;
            return this;
        }
    }

    public static abstract class c extends b implements o {

        /* renamed from: b, reason: collision with root package name */
        private g f51977b = g.g();

        /* renamed from: c, reason: collision with root package name */
        private boolean f51978c;

        protected c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public g o() {
            this.f51977b.q();
            this.f51978c = false;
            return this.f51977b;
        }

        private void p() {
            if (this.f51978c) {
                return;
            }
            this.f51977b = this.f51977b.clone();
            this.f51978c = true;
        }

        protected final void q(d dVar) {
            p();
            this.f51977b.r(dVar.f51979b);
        }
    }

    static final class e implements g.b {

        /* renamed from: a, reason: collision with root package name */
        final i.b f51984a;

        /* renamed from: b, reason: collision with root package name */
        final int f51985b;

        /* renamed from: c, reason: collision with root package name */
        final v.b f51986c;

        /* renamed from: d, reason: collision with root package name */
        final boolean f51987d;

        /* renamed from: e, reason: collision with root package name */
        final boolean f51988e;

        e(i.b bVar, int i10, v.b bVar2, boolean z10, boolean z11) {
            this.f51984a = bVar;
            this.f51985b = i10;
            this.f51986c = bVar2;
            this.f51987d = z10;
            this.f51988e = z11;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.g.b
        public n.a F(n.a aVar, n nVar) {
            return ((b) aVar).f((h) nVar);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.g.b
        public v.c M0() {
            return this.f51986c.getJavaType();
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(e eVar) {
            return this.f51985b - eVar.f51985b;
        }

        public i.b b() {
            return this.f51984a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.g.b
        public int getNumber() {
            return this.f51985b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.g.b
        public boolean isPacked() {
            return this.f51988e;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.g.b
        public boolean m() {
            return this.f51987d;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.g.b
        public v.b o() {
            return this.f51986c;
        }
    }

    public static class f {

        /* renamed from: a, reason: collision with root package name */
        final n f51989a;

        /* renamed from: b, reason: collision with root package name */
        final Object f51990b;

        /* renamed from: c, reason: collision with root package name */
        final n f51991c;

        /* renamed from: d, reason: collision with root package name */
        final e f51992d;

        /* renamed from: e, reason: collision with root package name */
        final Class f51993e;

        /* renamed from: f, reason: collision with root package name */
        final Method f51994f;

        f(n nVar, Object obj, n nVar2, e eVar, Class cls) {
            if (nVar == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            }
            if (eVar.o() == v.b.MESSAGE && nVar2 == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            }
            this.f51989a = nVar;
            this.f51990b = obj;
            this.f51991c = nVar2;
            this.f51992d = eVar;
            this.f51993e = cls;
            if (i.a.class.isAssignableFrom(cls)) {
                this.f51994f = h.p(cls, "valueOf", Integer.TYPE);
            } else {
                this.f51994f = null;
            }
        }

        Object a(Object obj) {
            if (!this.f51992d.m()) {
                return e(obj);
            }
            if (this.f51992d.M0() != v.c.ENUM) {
                return obj;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(e(it.next()));
            }
            return arrayList;
        }

        public n b() {
            return this.f51989a;
        }

        public n c() {
            return this.f51991c;
        }

        public int d() {
            return this.f51992d.getNumber();
        }

        Object e(Object obj) {
            return this.f51992d.M0() == v.c.ENUM ? h.r(this.f51994f, null, (Integer) obj) : obj;
        }

        Object f(Object obj) {
            return this.f51992d.M0() == v.c.ENUM ? Integer.valueOf(((i.a) obj).getNumber()) : obj;
        }
    }

    protected h() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean B(kotlin.reflect.jvm.internal.impl.protobuf.g r5, kotlin.reflect.jvm.internal.impl.protobuf.n r6, kotlin.reflect.jvm.internal.impl.protobuf.e r7, kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream r8, kotlin.reflect.jvm.internal.impl.protobuf.f r9, int r10) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 291
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.h.B(kotlin.reflect.jvm.internal.impl.protobuf.g, kotlin.reflect.jvm.internal.impl.protobuf.n, kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream, kotlin.reflect.jvm.internal.impl.protobuf.f, int):boolean");
    }

    static Method p(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e10) {
            String name = cls.getName();
            String strValueOf = String.valueOf(str);
            StringBuilder sb2 = new StringBuilder(name.length() + 45 + strValueOf.length());
            sb2.append("Generated message class \"");
            sb2.append(name);
            sb2.append("\" missing method \"");
            sb2.append(strValueOf);
            sb2.append("\".");
            throw new RuntimeException(sb2.toString(), e10);
        }
    }

    static Object r(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static f t(n nVar, n nVar2, i.b bVar, int i10, v.b bVar2, boolean z10, Class cls) {
        return new f(nVar, Collections.emptyList(), nVar2, new e(bVar, i10, bVar2, true, z10), cls);
    }

    public static f v(n nVar, Object obj, n nVar2, i.b bVar, int i10, v.b bVar2, Class cls) {
        return new f(nVar, obj, nVar2, new e(bVar, i10, bVar2, false, false), cls);
    }

    protected void s() {
    }

    protected boolean y(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, CodedOutputStream codedOutputStream, kotlin.reflect.jvm.internal.impl.protobuf.f fVar, int i10) {
        return eVar.O(i10, codedOutputStream);
    }

    public static abstract class d extends h implements o {

        /* renamed from: b, reason: collision with root package name */
        private final g f51979b;

        protected class a {

            /* renamed from: a, reason: collision with root package name */
            private final Iterator f51980a;

            /* renamed from: b, reason: collision with root package name */
            private Map.Entry f51981b;

            /* renamed from: c, reason: collision with root package name */
            private final boolean f51982c;

            /* synthetic */ a(d dVar, boolean z10, a aVar) {
                this(z10);
            }

            public void a(int i10, CodedOutputStream codedOutputStream) {
                while (true) {
                    Map.Entry entry = this.f51981b;
                    if (entry == null || ((e) entry.getKey()).getNumber() >= i10) {
                        return;
                    }
                    e eVar = (e) this.f51981b.getKey();
                    if (this.f51982c && eVar.M0() == v.c.MESSAGE && !eVar.m()) {
                        codedOutputStream.e0(eVar.getNumber(), (n) this.f51981b.getValue());
                    } else {
                        g.z(eVar, this.f51981b.getValue(), codedOutputStream);
                    }
                    if (this.f51980a.hasNext()) {
                        this.f51981b = (Map.Entry) this.f51980a.next();
                    } else {
                        this.f51981b = null;
                    }
                }
            }

            private a(boolean z10) {
                Iterator itP = d.this.f51979b.p();
                this.f51980a = itP;
                if (itP.hasNext()) {
                    this.f51981b = (Map.Entry) itP.next();
                }
                this.f51982c = z10;
            }
        }

        protected d() {
            this.f51979b = g.t();
        }

        private void d0(f fVar) {
            if (fVar.b() != c()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        protected boolean E() {
            return this.f51979b.n();
        }

        protected int F() {
            return this.f51979b.k();
        }

        public final Object J(f fVar) {
            d0(fVar);
            Object objH = this.f51979b.h(fVar.f51992d);
            return objH == null ? fVar.f51990b : fVar.a(objH);
        }

        public final Object K(f fVar, int i10) {
            d0(fVar);
            return fVar.e(this.f51979b.i(fVar.f51992d, i10));
        }

        public final int P(f fVar) {
            d0(fVar);
            return this.f51979b.j(fVar.f51992d);
        }

        public final boolean S(f fVar) {
            d0(fVar);
            return this.f51979b.m(fVar.f51992d);
        }

        protected a T() {
            return new a(this, false, null);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h
        protected void s() {
            this.f51979b.q();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h
        protected boolean y(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, CodedOutputStream codedOutputStream, kotlin.reflect.jvm.internal.impl.protobuf.f fVar, int i10) {
            return h.B(this.f51979b, c(), eVar, codedOutputStream, fVar, i10);
        }

        protected d(c cVar) {
            this.f51979b = cVar.o();
        }
    }

    protected h(b bVar) {
    }
}
