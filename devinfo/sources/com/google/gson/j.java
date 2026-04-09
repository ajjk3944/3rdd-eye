package com.google.gson;

import b5.e1;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.ArrayTypeAdapter;
import com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import com.google.gson.internal.bind.DefaultDateTypeAdapter;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.internal.bind.NumberTypeAdapter;
import com.google.gson.internal.bind.ObjectTypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class j {

    /* renamed from: h, reason: collision with root package name */
    public static final i f20882h = i.f20732d;

    /* renamed from: i, reason: collision with root package name */
    public static final a f20883i = h.f20730a;
    public static final r j = v.f20895a;

    /* renamed from: k, reason: collision with root package name */
    public static final s f20884k = v.f20896b;

    /* renamed from: a, reason: collision with root package name */
    public final ThreadLocal f20885a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f20886b;

    /* renamed from: c, reason: collision with root package name */
    public final bf.f f20887c;

    /* renamed from: d, reason: collision with root package name */
    public final JsonAdapterAnnotationTypeAdapterFactory f20888d;

    /* renamed from: e, reason: collision with root package name */
    public final List f20889e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f20890f;
    public final i g;

    public j() {
        Excluder excluder = Excluder.f20736c;
        Map map = Collections.EMPTY_MAP;
        List list = Collections.EMPTY_LIST;
        this.f20885a = new ThreadLocal();
        this.f20886b = new ConcurrentHashMap();
        bf.f fVar = new bf.f(10);
        this.f20887c = fVar;
        this.f20890f = true;
        this.g = f20882h;
        ArrayList arrayList = new ArrayList();
        arrayList.add(com.google.gson.internal.bind.e.A);
        arrayList.add(ObjectTypeAdapter.d(j));
        arrayList.add(excluder);
        arrayList.addAll(list);
        arrayList.add(com.google.gson.internal.bind.e.f20823p);
        arrayList.add(com.google.gson.internal.bind.e.g);
        arrayList.add(com.google.gson.internal.bind.e.f20813d);
        arrayList.add(com.google.gson.internal.bind.e.f20814e);
        arrayList.add(com.google.gson.internal.bind.e.f20815f);
        final w wVar = com.google.gson.internal.bind.e.f20818k;
        arrayList.add(com.google.gson.internal.bind.e.b(Long.TYPE, Long.class, wVar));
        arrayList.add(com.google.gson.internal.bind.e.b(Double.TYPE, Double.class, new Gson$1()));
        arrayList.add(com.google.gson.internal.bind.e.b(Float.TYPE, Float.class, new Gson$2()));
        s sVar = v.f20896b;
        s sVar2 = f20884k;
        arrayList.add(sVar2 == sVar ? NumberTypeAdapter.f20769b : NumberTypeAdapter.d(sVar2));
        arrayList.add(com.google.gson.internal.bind.e.f20816h);
        arrayList.add(com.google.gson.internal.bind.e.f20817i);
        arrayList.add(com.google.gson.internal.bind.e.a(AtomicLong.class, new w() { // from class: com.google.gson.Gson$4
            @Override // com.google.gson.w
            public final Object b(yf.b bVar) {
                return new AtomicLong(((Number) wVar.b(bVar)).longValue());
            }

            @Override // com.google.gson.w
            public final void c(yf.c cVar, Object obj) {
                wVar.c(cVar, Long.valueOf(((AtomicLong) obj).get()));
            }
        }.a()));
        arrayList.add(com.google.gson.internal.bind.e.a(AtomicLongArray.class, new w() { // from class: com.google.gson.Gson$5
            @Override // com.google.gson.w
            public final Object b(yf.b bVar) throws IOException {
                ArrayList arrayList2 = new ArrayList();
                bVar.c();
                while (bVar.A()) {
                    arrayList2.add(Long.valueOf(((Number) wVar.b(bVar)).longValue()));
                }
                bVar.p();
                int size = arrayList2.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i4 = 0; i4 < size; i4++) {
                    atomicLongArray.set(i4, ((Long) arrayList2.get(i4)).longValue());
                }
                return atomicLongArray;
            }

            @Override // com.google.gson.w
            public final void c(yf.c cVar, Object obj) throws IOException {
                AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
                cVar.e();
                int length = atomicLongArray.length();
                for (int i4 = 0; i4 < length; i4++) {
                    wVar.c(cVar, Long.valueOf(atomicLongArray.get(i4)));
                }
                cVar.p();
            }
        }.a()));
        arrayList.add(com.google.gson.internal.bind.e.j);
        arrayList.add(com.google.gson.internal.bind.e.f20819l);
        arrayList.add(com.google.gson.internal.bind.e.f20824q);
        arrayList.add(com.google.gson.internal.bind.e.f20825r);
        arrayList.add(com.google.gson.internal.bind.e.a(BigDecimal.class, com.google.gson.internal.bind.e.f20820m));
        arrayList.add(com.google.gson.internal.bind.e.a(BigInteger.class, com.google.gson.internal.bind.e.f20821n));
        arrayList.add(com.google.gson.internal.bind.e.a(com.google.gson.internal.i.class, com.google.gson.internal.bind.e.f20822o));
        arrayList.add(com.google.gson.internal.bind.e.f20826s);
        arrayList.add(com.google.gson.internal.bind.e.f20827t);
        arrayList.add(com.google.gson.internal.bind.e.f20829v);
        arrayList.add(com.google.gson.internal.bind.e.f20830w);
        arrayList.add(com.google.gson.internal.bind.e.f20832y);
        arrayList.add(com.google.gson.internal.bind.e.f20828u);
        arrayList.add(com.google.gson.internal.bind.e.f20811b);
        arrayList.add(DefaultDateTypeAdapter.f20754c);
        arrayList.add(com.google.gson.internal.bind.e.f20831x);
        if (com.google.gson.internal.sql.b.f20877a) {
            arrayList.add(com.google.gson.internal.sql.b.f20879c);
            arrayList.add(com.google.gson.internal.sql.b.f20878b);
            arrayList.add(com.google.gson.internal.sql.b.f20880d);
        }
        arrayList.add(ArrayTypeAdapter.f20748c);
        arrayList.add(com.google.gson.internal.bind.e.f20810a);
        arrayList.add(new CollectionTypeAdapterFactory(fVar));
        arrayList.add(new MapTypeAdapterFactory(fVar));
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = new JsonAdapterAnnotationTypeAdapterFactory(fVar);
        this.f20888d = jsonAdapterAnnotationTypeAdapterFactory;
        arrayList.add(jsonAdapterAnnotationTypeAdapterFactory);
        arrayList.add(com.google.gson.internal.bind.e.B);
        arrayList.add(new ReflectiveTypeAdapterFactory(fVar, f20883i, excluder, jsonAdapterAnnotationTypeAdapterFactory));
        this.f20889e = DesugarCollections.unmodifiableList(arrayList);
    }

    public static void a(double d10) {
        if (Double.isNaN(d10) || Double.isInfinite(d10)) {
            throw new IllegalArgumentException(d10 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    /* JADX WARN: Finally extract failed */
    public final Object b(Reader reader, xf.a aVar) {
        Object objB;
        yf.b bVar = new yf.b(reader);
        bVar.f37600o = 2;
        boolean z3 = true;
        bVar.f37600o = 1;
        try {
            try {
                try {
                    try {
                        bVar.Z();
                        z3 = false;
                        w wVarD = d(aVar);
                        Class cls = aVar.f37087a;
                        objB = wVarD.b(bVar);
                        Class clsL = com.google.gson.internal.g.l(cls);
                        if (objB != null && !clsL.isInstance(objB)) {
                            throw new ClassCastException("Type adapter '" + wVarD + "' returned wrong type; requested " + cls + " but got instance of " + objB.getClass() + "\nVerify that the adapter was registered for the correct type.");
                        }
                        bVar.f37600o = 2;
                    } catch (EOFException e2) {
                        if (!z3) {
                            throw new q(e2);
                        }
                        bVar.f37600o = 2;
                        objB = null;
                    } catch (IOException e10) {
                        throw new q(e10);
                    }
                    if (objB != null) {
                        try {
                            if (bVar.Z() != 10) {
                                throw new q("JSON document was not fully consumed.");
                            }
                        } catch (yf.d e11) {
                            throw new q(e11);
                        } catch (IOException e12) {
                            throw new m(e12);
                        }
                    }
                    return objB;
                } catch (AssertionError e13) {
                    throw new AssertionError("AssertionError (GSON 2.13.2): " + e13.getMessage(), e13);
                }
            } catch (IllegalStateException e14) {
                throw new q(e14);
            }
        } catch (Throwable th2) {
            bVar.f37600o = 2;
            throw th2;
        }
    }

    public final Object c(String str, xf.a aVar) {
        if (str == null) {
            return null;
        }
        return b(new StringReader(str), aVar);
    }

    public final w d(xf.a aVar) {
        boolean z3;
        Objects.requireNonNull(aVar, "type must not be null");
        ConcurrentHashMap concurrentHashMap = this.f20886b;
        w wVar = (w) concurrentHashMap.get(aVar);
        if (wVar != null) {
            return wVar;
        }
        ThreadLocal threadLocal = this.f20885a;
        Map map = (Map) threadLocal.get();
        if (map == null) {
            map = new HashMap();
            threadLocal.set(map);
            z3 = true;
        } else {
            w wVar2 = (w) map.get(aVar);
            if (wVar2 != null) {
                return wVar2;
            }
            z3 = false;
        }
        try {
            Gson$FutureTypeAdapter gson$FutureTypeAdapter = new Gson$FutureTypeAdapter();
            map.put(aVar, gson$FutureTypeAdapter);
            Iterator it = this.f20889e.iterator();
            w wVarA = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                wVarA = ((x) it.next()).a(this, aVar);
                if (wVarA != null) {
                    if (gson$FutureTypeAdapter.f20728a != null) {
                        throw new AssertionError("Delegate is already set");
                    }
                    gson$FutureTypeAdapter.f20728a = wVarA;
                    map.put(aVar, wVarA);
                }
            }
            if (z3) {
                threadLocal.remove();
            }
            if (wVarA != null) {
                if (z3) {
                    concurrentHashMap.putAll(map);
                }
                return wVarA;
            }
            throw new IllegalArgumentException("GSON (2.13.2) cannot handle " + aVar);
        } catch (Throwable th2) {
            if (z3) {
                threadLocal.remove();
            }
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.gson.w e(com.google.gson.x r8, xf.a r9) {
        /*
            r7 = this;
            java.lang.String r0 = "skipPast must not be null"
            j$.util.Objects.requireNonNull(r8, r0)
            java.lang.String r0 = "type must not be null"
            j$.util.Objects.requireNonNull(r9, r0)
            com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory r0 = r7.f20888d
            r0.getClass()
            j$.util.concurrent.ConcurrentHashMap r1 = r0.f20763b
            com.google.gson.x r2 = com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory.f20761c
            r3 = 1
            if (r8 != r2) goto L17
            goto L58
        L17:
            java.lang.Class r2 = r9.f37087a
            java.lang.Object r4 = r1.get(r2)
            com.google.gson.x r4 = (com.google.gson.x) r4
            if (r4 == 0) goto L24
            if (r4 != r8) goto L59
            goto L58
        L24:
            java.lang.Class<uf.a> r4 = uf.a.class
            java.lang.annotation.Annotation r4 = r2.getAnnotation(r4)
            uf.a r4 = (uf.a) r4
            if (r4 != 0) goto L2f
            goto L59
        L2f:
            java.lang.Class r4 = r4.value()
            java.lang.Class<com.google.gson.x> r5 = com.google.gson.x.class
            boolean r5 = r5.isAssignableFrom(r4)
            if (r5 != 0) goto L3c
            goto L59
        L3c:
            bf.f r5 = r0.f20762a
            xf.a r6 = new xf.a
            r6.<init>(r4)
            com.google.gson.internal.n r4 = r5.f(r6, r3)
            java.lang.Object r4 = r4.b()
            com.google.gson.x r4 = (com.google.gson.x) r4
            java.lang.Object r1 = r1.putIfAbsent(r2, r4)
            com.google.gson.x r1 = (com.google.gson.x) r1
            if (r1 == 0) goto L56
            r4 = r1
        L56:
            if (r4 != r8) goto L59
        L58:
            r8 = r0
        L59:
            java.util.List r0 = r7.f20889e
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L60:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L79
            java.lang.Object r2 = r0.next()
            com.google.gson.x r2 = (com.google.gson.x) r2
            if (r1 != 0) goto L72
            if (r2 != r8) goto L60
            r1 = r3
            goto L60
        L72:
            com.google.gson.w r2 = r2.a(r7, r9)
            if (r2 == 0) goto L60
            return r2
        L79:
            if (r1 != 0) goto L80
            com.google.gson.w r8 = r7.d(r9)
            return r8
        L80:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "GSON cannot serialize or deserialize "
            r0.<init>(r1)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.j.e(com.google.gson.x, xf.a):com.google.gson.w");
    }

    public final yf.c f(Writer writer) {
        yf.c cVar = new yf.c(writer);
        cVar.F(this.g);
        cVar.f37611i = this.f20890f;
        cVar.G(2);
        cVar.f37612k = false;
        return cVar;
    }

    public final String g(Object obj) {
        if (obj == null) {
            StringBuilder sb2 = new StringBuilder();
            try {
                i(f(new e1(2, sb2)));
                return sb2.toString();
            } catch (IOException e2) {
                throw new m(e2);
            }
        }
        Class<?> cls = obj.getClass();
        StringBuilder sb3 = new StringBuilder();
        try {
            h(obj, cls, f(new e1(2, sb3)));
            return sb3.toString();
        } catch (IOException e10) {
            throw new m(e10);
        }
    }

    public final void h(Object obj, Class cls, yf.c cVar) {
        w wVarD = d(new xf.a(cls));
        int i4 = cVar.f37610h;
        if (i4 == 2) {
            cVar.f37610h = 1;
        }
        boolean z3 = cVar.f37611i;
        boolean z10 = cVar.f37612k;
        cVar.f37611i = this.f20890f;
        cVar.f37612k = false;
        try {
            try {
                wVarD.c(cVar, obj);
            } catch (IOException e2) {
                throw new m(e2);
            } catch (AssertionError e10) {
                throw new AssertionError("AssertionError (GSON 2.13.2): " + e10.getMessage(), e10);
            }
        } finally {
            cVar.G(i4);
            cVar.f37611i = z3;
            cVar.f37612k = z10;
        }
    }

    public final void i(yf.c cVar) {
        n nVar = n.f20892a;
        int i4 = cVar.f37610h;
        boolean z3 = cVar.f37611i;
        boolean z10 = cVar.f37612k;
        cVar.f37611i = this.f20890f;
        cVar.f37612k = false;
        if (i4 == 2) {
            cVar.f37610h = 1;
        }
        try {
            try {
                com.google.gson.internal.bind.e.f20833z.c(cVar, nVar);
                cVar.G(i4);
                cVar.f37611i = z3;
                cVar.f37612k = z10;
            } catch (IOException e2) {
                throw new m(e2);
            } catch (AssertionError e10) {
                throw new AssertionError("AssertionError (GSON 2.13.2): " + e10.getMessage(), e10);
            }
        } catch (Throwable th2) {
            cVar.G(i4);
            cVar.f37611i = z3;
            cVar.f37612k = z10;
            throw th2;
        }
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + this.f20889e + ",instanceCreators:" + this.f20887c + "}";
    }
}
