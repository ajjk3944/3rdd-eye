package com.google.gson;

import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import t5.C8032c;
import w5.C8268a;
import w5.C8270c;
import w5.EnumC8269b;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: A, reason: collision with root package name */
    static final com.google.gson.d f38944A = com.google.gson.d.f38939d;

    /* renamed from: B, reason: collision with root package name */
    static final String f38945B = null;

    /* renamed from: C, reason: collision with root package name */
    static final com.google.gson.c f38946C = com.google.gson.b.IDENTITY;

    /* renamed from: D, reason: collision with root package name */
    static final o f38947D = n.DOUBLE;

    /* renamed from: E, reason: collision with root package name */
    static final o f38948E = n.LAZILY_PARSED_NUMBER;

    /* renamed from: z, reason: collision with root package name */
    static final m f38949z = null;

    /* renamed from: a, reason: collision with root package name */
    private final ThreadLocal f38950a;

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentMap f38951b;

    /* renamed from: c, reason: collision with root package name */
    private final C8032c f38952c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.gson.internal.bind.d f38953d;

    /* renamed from: e, reason: collision with root package name */
    final List f38954e;

    /* renamed from: f, reason: collision with root package name */
    final t5.d f38955f;

    /* renamed from: g, reason: collision with root package name */
    final com.google.gson.c f38956g;

    /* renamed from: h, reason: collision with root package name */
    final Map f38957h;

    /* renamed from: i, reason: collision with root package name */
    final boolean f38958i;

    /* renamed from: j, reason: collision with root package name */
    final boolean f38959j;

    /* renamed from: k, reason: collision with root package name */
    final boolean f38960k;

    /* renamed from: l, reason: collision with root package name */
    final boolean f38961l;

    /* renamed from: m, reason: collision with root package name */
    final com.google.gson.d f38962m;

    /* renamed from: n, reason: collision with root package name */
    final m f38963n;

    /* renamed from: o, reason: collision with root package name */
    final boolean f38964o;

    /* renamed from: p, reason: collision with root package name */
    final boolean f38965p;

    /* renamed from: q, reason: collision with root package name */
    final String f38966q;

    /* renamed from: r, reason: collision with root package name */
    final int f38967r;

    /* renamed from: s, reason: collision with root package name */
    final int f38968s;

    /* renamed from: t, reason: collision with root package name */
    final k f38969t;

    /* renamed from: u, reason: collision with root package name */
    final List f38970u;

    /* renamed from: v, reason: collision with root package name */
    final List f38971v;

    /* renamed from: w, reason: collision with root package name */
    final o f38972w;

    /* renamed from: x, reason: collision with root package name */
    final o f38973x;

    /* renamed from: y, reason: collision with root package name */
    final List f38974y;

    class a extends p {
        a() {
        }

        @Override // com.google.gson.p
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Double b(C8268a c8268a) throws IOException {
            if (c8268a.v0() != EnumC8269b.NULL) {
                return Double.valueOf(c8268a.m0());
            }
            c8268a.r0();
            return null;
        }

        @Override // com.google.gson.p
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(C8270c c8270c, Number number) throws IOException {
            if (number == null) {
                c8270c.b0();
                return;
            }
            double dDoubleValue = number.doubleValue();
            e.d(dDoubleValue);
            c8270c.t0(dDoubleValue);
        }
    }

    class b extends p {
        b() {
        }

        @Override // com.google.gson.p
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Float b(C8268a c8268a) throws IOException {
            if (c8268a.v0() != EnumC8269b.NULL) {
                return Float.valueOf((float) c8268a.m0());
            }
            c8268a.r0();
            return null;
        }

        @Override // com.google.gson.p
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(C8270c c8270c, Number number) throws IOException {
            if (number == null) {
                c8270c.b0();
                return;
            }
            float fFloatValue = number.floatValue();
            e.d(fFloatValue);
            if (!(number instanceof Float)) {
                number = Float.valueOf(fFloatValue);
            }
            c8270c.w0(number);
        }
    }

    class c extends p {
        c() {
        }

        @Override // com.google.gson.p
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(C8268a c8268a) throws IOException {
            if (c8268a.v0() != EnumC8269b.NULL) {
                return Long.valueOf(c8268a.o0());
            }
            c8268a.r0();
            return null;
        }

        @Override // com.google.gson.p
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(C8270c c8270c, Number number) throws IOException {
            if (number == null) {
                c8270c.b0();
            } else {
                c8270c.x0(number.toString());
            }
        }
    }

    class d extends p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ p f38977a;

        d(p pVar) {
            this.f38977a = pVar;
        }

        @Override // com.google.gson.p
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicLong b(C8268a c8268a) {
            return new AtomicLong(((Number) this.f38977a.b(c8268a)).longValue());
        }

        @Override // com.google.gson.p
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(C8270c c8270c, AtomicLong atomicLong) {
            this.f38977a.d(c8270c, Long.valueOf(atomicLong.get()));
        }
    }

    /* renamed from: com.google.gson.e$e, reason: collision with other inner class name */
    class C1223e extends p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ p f38978a;

        C1223e(p pVar) {
            this.f38978a = pVar;
        }

        @Override // com.google.gson.p
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicLongArray b(C8268a c8268a) throws IOException {
            ArrayList arrayList = new ArrayList();
            c8268a.g();
            while (c8268a.T()) {
                arrayList.add(Long.valueOf(((Number) this.f38978a.b(c8268a)).longValue()));
            }
            c8268a.v();
            int size = arrayList.size();
            AtomicLongArray atomicLongArray = new AtomicLongArray(size);
            for (int i10 = 0; i10 < size; i10++) {
                atomicLongArray.set(i10, ((Long) arrayList.get(i10)).longValue());
            }
            return atomicLongArray;
        }

        @Override // com.google.gson.p
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(C8270c c8270c, AtomicLongArray atomicLongArray) throws IOException {
            c8270c.h();
            int length = atomicLongArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                this.f38978a.d(c8270c, Long.valueOf(atomicLongArray.get(i10)));
            }
            c8270c.s();
        }
    }

    static class f extends com.google.gson.internal.bind.j {

        /* renamed from: a, reason: collision with root package name */
        private p f38979a = null;

        f() {
        }

        private p f() {
            p pVar = this.f38979a;
            if (pVar != null) {
                return pVar;
            }
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }

        @Override // com.google.gson.p
        public Object b(C8268a c8268a) {
            return f().b(c8268a);
        }

        @Override // com.google.gson.p
        public void d(C8270c c8270c, Object obj) {
            f().d(c8270c, obj);
        }

        @Override // com.google.gson.internal.bind.j
        public p e() {
            return f();
        }

        public void g(p pVar) {
            if (this.f38979a != null) {
                throw new AssertionError("Delegate is already set");
            }
            this.f38979a = pVar;
        }
    }

    public e() {
        this(t5.d.f61748g, f38946C, Collections.emptyMap(), false, false, false, true, f38944A, f38949z, false, true, k.DEFAULT, f38945B, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), f38947D, f38948E, Collections.emptyList());
    }

    private static void a(Object obj, C8268a c8268a) {
        if (obj != null) {
            try {
                if (c8268a.v0() == EnumC8269b.END_DOCUMENT) {
                } else {
                    throw new JsonSyntaxException("JSON document was not fully consumed.");
                }
            } catch (MalformedJsonException e10) {
                throw new JsonSyntaxException(e10);
            } catch (IOException e11) {
                throw new JsonIOException(e11);
            }
        }
    }

    private static p b(p pVar) {
        return new d(pVar).a();
    }

    private static p c(p pVar) {
        return new C1223e(pVar).a();
    }

    static void d(double d10) {
        if (Double.isNaN(d10) || Double.isInfinite(d10)) {
            throw new IllegalArgumentException(d10 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    private p e(boolean z10) {
        return z10 ? com.google.gson.internal.bind.l.f39091v : new a();
    }

    private p f(boolean z10) {
        return z10 ? com.google.gson.internal.bind.l.f39090u : new b();
    }

    private static p o(k kVar) {
        return kVar == k.DEFAULT ? com.google.gson.internal.bind.l.f39089t : new c();
    }

    public Object g(Reader reader, com.google.gson.reflect.a aVar) {
        C8268a c8268aP = p(reader);
        Object objK = k(c8268aP, aVar);
        a(objK, c8268aP);
        return objK;
    }

    public Object h(String str, com.google.gson.reflect.a aVar) {
        if (str == null) {
            return null;
        }
        return g(new StringReader(str), aVar);
    }

    public Object i(String str, Class cls) {
        return t5.l.b(cls).cast(h(str, com.google.gson.reflect.a.a(cls)));
    }

    public Object j(String str, Type type) {
        return h(str, com.google.gson.reflect.a.b(type));
    }

    public Object k(C8268a c8268a, com.google.gson.reflect.a aVar) {
        boolean z10;
        m mVarS = c8268a.S();
        m mVar = this.f38963n;
        if (mVar != null) {
            c8268a.A0(mVar);
        } else if (c8268a.S() == m.LEGACY_STRICT) {
            c8268a.A0(m.LENIENT);
        }
        try {
            try {
                try {
                    try {
                        c8268a.v0();
                        z10 = false;
                    } catch (AssertionError e10) {
                        throw new AssertionError("AssertionError (GSON 2.11.0): " + e10.getMessage(), e10);
                    } catch (IllegalStateException e11) {
                        throw new JsonSyntaxException(e11);
                    }
                } catch (IOException e12) {
                    throw new JsonSyntaxException(e12);
                }
            } catch (EOFException e13) {
                e = e13;
                z10 = true;
            }
            try {
                return l(aVar).b(c8268a);
            } catch (EOFException e14) {
                e = e14;
                if (!z10) {
                    throw new JsonSyntaxException(e);
                }
                c8268a.A0(mVarS);
                return null;
            }
        } finally {
            c8268a.A0(mVarS);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        r2.g(r4);
        r0.put(r7, r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.gson.p l(com.google.gson.reflect.a r7) {
        /*
            r6 = this;
            java.lang.String r0 = "type must not be null"
            java.util.Objects.requireNonNull(r7, r0)
            java.util.concurrent.ConcurrentMap r0 = r6.f38951b
            java.lang.Object r0 = r0.get(r7)
            com.google.gson.p r0 = (com.google.gson.p) r0
            if (r0 == 0) goto L11
            return r0
        L11:
            java.lang.ThreadLocal r0 = r6.f38950a
            java.lang.Object r0 = r0.get()
            java.util.Map r0 = (java.util.Map) r0
            if (r0 != 0) goto L27
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.ThreadLocal r1 = r6.f38950a
            r1.set(r0)
            r1 = 1
            goto L31
        L27:
            java.lang.Object r1 = r0.get(r7)
            com.google.gson.p r1 = (com.google.gson.p) r1
            if (r1 == 0) goto L30
            return r1
        L30:
            r1 = 0
        L31:
            com.google.gson.e$f r2 = new com.google.gson.e$f     // Catch: java.lang.Throwable -> L59
            r2.<init>()     // Catch: java.lang.Throwable -> L59
            r0.put(r7, r2)     // Catch: java.lang.Throwable -> L59
            java.util.List r3 = r6.f38954e     // Catch: java.lang.Throwable -> L59
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L59
            r4 = 0
        L40:
            boolean r5 = r3.hasNext()     // Catch: java.lang.Throwable -> L59
            if (r5 == 0) goto L5b
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L59
            com.google.gson.q r4 = (com.google.gson.q) r4     // Catch: java.lang.Throwable -> L59
            com.google.gson.p r4 = r4.b(r6, r7)     // Catch: java.lang.Throwable -> L59
            if (r4 == 0) goto L40
            r2.g(r4)     // Catch: java.lang.Throwable -> L59
            r0.put(r7, r4)     // Catch: java.lang.Throwable -> L59
            goto L5b
        L59:
            r7 = move-exception
            goto L84
        L5b:
            if (r1 == 0) goto L62
            java.lang.ThreadLocal r2 = r6.f38950a
            r2.remove()
        L62:
            if (r4 == 0) goto L6c
            if (r1 == 0) goto L6b
            java.util.concurrent.ConcurrentMap r7 = r6.f38951b
            r7.putAll(r0)
        L6b:
            return r4
        L6c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "GSON (2.11.0) cannot handle "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            throw r0
        L84:
            if (r1 == 0) goto L8b
            java.lang.ThreadLocal r0 = r6.f38950a
            r0.remove()
        L8b:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.e.l(com.google.gson.reflect.a):com.google.gson.p");
    }

    public p m(Class cls) {
        return l(com.google.gson.reflect.a.a(cls));
    }

    public p n(q qVar, com.google.gson.reflect.a aVar) {
        Objects.requireNonNull(qVar, "skipPast must not be null");
        Objects.requireNonNull(aVar, "type must not be null");
        if (this.f38953d.e(aVar, qVar)) {
            qVar = this.f38953d;
        }
        boolean z10 = false;
        for (q qVar2 : this.f38954e) {
            if (z10) {
                p pVarB = qVar2.b(this, aVar);
                if (pVarB != null) {
                    return pVarB;
                }
            } else if (qVar2 == qVar) {
                z10 = true;
            }
        }
        if (!z10) {
            return l(aVar);
        }
        throw new IllegalArgumentException("GSON cannot serialize or deserialize " + aVar);
    }

    public C8268a p(Reader reader) {
        C8268a c8268a = new C8268a(reader);
        m mVar = this.f38963n;
        if (mVar == null) {
            mVar = m.LEGACY_STRICT;
        }
        c8268a.A0(mVar);
        return c8268a;
    }

    public C8270c q(Writer writer) throws IOException {
        if (this.f38960k) {
            writer.write(")]}'\n");
        }
        C8270c c8270c = new C8270c(writer);
        c8270c.o0(this.f38962m);
        c8270c.p0(this.f38961l);
        m mVar = this.f38963n;
        if (mVar == null) {
            mVar = m.LEGACY_STRICT;
        }
        c8270c.r0(mVar);
        c8270c.q0(this.f38958i);
        return c8270c;
    }

    public String r(g gVar) {
        StringWriter stringWriter = new StringWriter();
        u(gVar, stringWriter);
        return stringWriter.toString();
    }

    public String s(Object obj) {
        return obj == null ? r(h.f38981a) : t(obj, obj.getClass());
    }

    public String t(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        w(obj, type, stringWriter);
        return stringWriter.toString();
    }

    public String toString() {
        return "{serializeNulls:" + this.f38958i + ",factories:" + this.f38954e + ",instanceCreators:" + this.f38952c + "}";
    }

    public void u(g gVar, Appendable appendable) {
        try {
            v(gVar, q(t5.n.b(appendable)));
        } catch (IOException e10) {
            throw new JsonIOException(e10);
        }
    }

    public void v(g gVar, C8270c c8270c) {
        m mVarC = c8270c.C();
        boolean zJ = c8270c.J();
        boolean zY = c8270c.y();
        c8270c.p0(this.f38961l);
        c8270c.q0(this.f38958i);
        m mVar = this.f38963n;
        if (mVar != null) {
            c8270c.r0(mVar);
        } else if (c8270c.C() == m.LEGACY_STRICT) {
            c8270c.r0(m.LENIENT);
        }
        try {
            try {
                t5.n.a(gVar, c8270c);
            } catch (IOException e10) {
                throw new JsonIOException(e10);
            } catch (AssertionError e11) {
                throw new AssertionError("AssertionError (GSON 2.11.0): " + e11.getMessage(), e11);
            }
        } finally {
            c8270c.r0(mVarC);
            c8270c.p0(zJ);
            c8270c.q0(zY);
        }
    }

    public void w(Object obj, Type type, Appendable appendable) {
        try {
            x(obj, type, q(t5.n.b(appendable)));
        } catch (IOException e10) {
            throw new JsonIOException(e10);
        }
    }

    public void x(Object obj, Type type, C8270c c8270c) {
        p pVarL = l(com.google.gson.reflect.a.b(type));
        m mVarC = c8270c.C();
        m mVar = this.f38963n;
        if (mVar != null) {
            c8270c.r0(mVar);
        } else if (c8270c.C() == m.LEGACY_STRICT) {
            c8270c.r0(m.LENIENT);
        }
        boolean zJ = c8270c.J();
        boolean zY = c8270c.y();
        c8270c.p0(this.f38961l);
        c8270c.q0(this.f38958i);
        try {
            try {
                try {
                    pVarL.d(c8270c, obj);
                } catch (IOException e10) {
                    throw new JsonIOException(e10);
                }
            } catch (AssertionError e11) {
                throw new AssertionError("AssertionError (GSON 2.11.0): " + e11.getMessage(), e11);
            }
        } finally {
            c8270c.r0(mVarC);
            c8270c.p0(zJ);
            c8270c.q0(zY);
        }
    }

    e(t5.d dVar, com.google.gson.c cVar, Map map, boolean z10, boolean z11, boolean z12, boolean z13, com.google.gson.d dVar2, m mVar, boolean z14, boolean z15, k kVar, String str, int i10, int i11, List list, List list2, List list3, o oVar, o oVar2, List list4) {
        this.f38950a = new ThreadLocal();
        this.f38951b = new ConcurrentHashMap();
        this.f38955f = dVar;
        this.f38956g = cVar;
        this.f38957h = map;
        C8032c c8032c = new C8032c(map, z15, list4);
        this.f38952c = c8032c;
        this.f38958i = z10;
        this.f38959j = z11;
        this.f38960k = z12;
        this.f38961l = z13;
        this.f38962m = dVar2;
        this.f38963n = mVar;
        this.f38964o = z14;
        this.f38965p = z15;
        this.f38969t = kVar;
        this.f38966q = str;
        this.f38967r = i10;
        this.f38968s = i11;
        this.f38970u = list;
        this.f38971v = list2;
        this.f38972w = oVar;
        this.f38973x = oVar2;
        this.f38974y = list4;
        ArrayList arrayList = new ArrayList();
        arrayList.add(com.google.gson.internal.bind.l.f39068W);
        arrayList.add(com.google.gson.internal.bind.h.e(oVar));
        arrayList.add(dVar);
        arrayList.addAll(list3);
        arrayList.add(com.google.gson.internal.bind.l.f39048C);
        arrayList.add(com.google.gson.internal.bind.l.f39082m);
        arrayList.add(com.google.gson.internal.bind.l.f39076g);
        arrayList.add(com.google.gson.internal.bind.l.f39078i);
        arrayList.add(com.google.gson.internal.bind.l.f39080k);
        p pVarO = o(kVar);
        arrayList.add(com.google.gson.internal.bind.l.b(Long.TYPE, Long.class, pVarO));
        arrayList.add(com.google.gson.internal.bind.l.b(Double.TYPE, Double.class, e(z14)));
        arrayList.add(com.google.gson.internal.bind.l.b(Float.TYPE, Float.class, f(z14)));
        arrayList.add(com.google.gson.internal.bind.g.e(oVar2));
        arrayList.add(com.google.gson.internal.bind.l.f39084o);
        arrayList.add(com.google.gson.internal.bind.l.f39086q);
        arrayList.add(com.google.gson.internal.bind.l.a(AtomicLong.class, b(pVarO)));
        arrayList.add(com.google.gson.internal.bind.l.a(AtomicLongArray.class, c(pVarO)));
        arrayList.add(com.google.gson.internal.bind.l.f39088s);
        arrayList.add(com.google.gson.internal.bind.l.f39093x);
        arrayList.add(com.google.gson.internal.bind.l.f39050E);
        arrayList.add(com.google.gson.internal.bind.l.f39052G);
        arrayList.add(com.google.gson.internal.bind.l.a(BigDecimal.class, com.google.gson.internal.bind.l.f39095z));
        arrayList.add(com.google.gson.internal.bind.l.a(BigInteger.class, com.google.gson.internal.bind.l.f39046A));
        arrayList.add(com.google.gson.internal.bind.l.a(t5.g.class, com.google.gson.internal.bind.l.f39047B));
        arrayList.add(com.google.gson.internal.bind.l.f39054I);
        arrayList.add(com.google.gson.internal.bind.l.f39056K);
        arrayList.add(com.google.gson.internal.bind.l.f39060O);
        arrayList.add(com.google.gson.internal.bind.l.f39062Q);
        arrayList.add(com.google.gson.internal.bind.l.f39066U);
        arrayList.add(com.google.gson.internal.bind.l.f39058M);
        arrayList.add(com.google.gson.internal.bind.l.f39073d);
        arrayList.add(com.google.gson.internal.bind.c.f38989c);
        arrayList.add(com.google.gson.internal.bind.l.f39064S);
        if (com.google.gson.internal.sql.d.f39120a) {
            arrayList.add(com.google.gson.internal.sql.d.f39124e);
            arrayList.add(com.google.gson.internal.sql.d.f39123d);
            arrayList.add(com.google.gson.internal.sql.d.f39125f);
        }
        arrayList.add(com.google.gson.internal.bind.a.f38983c);
        arrayList.add(com.google.gson.internal.bind.l.f39071b);
        arrayList.add(new com.google.gson.internal.bind.b(c8032c));
        arrayList.add(new com.google.gson.internal.bind.f(c8032c, z11));
        com.google.gson.internal.bind.d dVar3 = new com.google.gson.internal.bind.d(c8032c);
        this.f38953d = dVar3;
        arrayList.add(dVar3);
        arrayList.add(com.google.gson.internal.bind.l.f39069X);
        arrayList.add(new com.google.gson.internal.bind.i(c8032c, cVar, dVar, dVar3, list4));
        this.f38954e = Collections.unmodifiableList(arrayList);
    }
}
