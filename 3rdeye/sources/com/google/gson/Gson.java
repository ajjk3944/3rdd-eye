package com.google.gson;

import com.google.gson.TypeAdapter;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.ArrayTypeAdapter;
import com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import com.google.gson.internal.bind.DateTypeAdapter;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.internal.bind.ObjectTypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.internal.bind.SqlDateTypeAdapter;
import com.google.gson.internal.bind.TimeTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* loaded from: classes2.dex */
public final class Gson {

    /* renamed from: a, reason: collision with root package name */
    public final ThreadLocal<Map<D5.a<?>, FutureTypeAdapter<?>>> f23358a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f23359b;

    /* renamed from: c, reason: collision with root package name */
    public final com.google.gson.internal.b f23360c;

    /* renamed from: d, reason: collision with root package name */
    public final JsonAdapterAnnotationTypeAdapterFactory f23361d;

    /* renamed from: e, reason: collision with root package name */
    public final List<o> f23362e;

    /* renamed from: f, reason: collision with root package name */
    public final Map<Type, d<?>> f23363f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f23364g;

    /* renamed from: h, reason: collision with root package name */
    public final List<o> f23365h;
    public final List<o> i;

    /* renamed from: com.google.gson.Gson$1, reason: invalid class name */
    class AnonymousClass1 extends TypeAdapter<Number> {
        @Override // com.google.gson.TypeAdapter
        public final Number b(E5.a aVar) throws IOException {
            if (aVar.C0() != E5.b.NULL) {
                return Double.valueOf(aVar.k0());
            }
            aVar.v0();
            return null;
        }

        @Override // com.google.gson.TypeAdapter
        public final void c(E5.c cVar, Number number) throws IOException {
            Number number2 = number;
            if (number2 == null) {
                cVar.B();
            } else {
                Gson.a(number2.doubleValue());
                cVar.m0(number2);
            }
        }
    }

    /* renamed from: com.google.gson.Gson$2, reason: invalid class name */
    class AnonymousClass2 extends TypeAdapter<Number> {
        @Override // com.google.gson.TypeAdapter
        public final Number b(E5.a aVar) throws IOException {
            if (aVar.C0() != E5.b.NULL) {
                return Float.valueOf((float) aVar.k0());
            }
            aVar.v0();
            return null;
        }

        @Override // com.google.gson.TypeAdapter
        public final void c(E5.c cVar, Number number) throws IOException {
            Number number2 = number;
            if (number2 == null) {
                cVar.B();
            } else {
                Gson.a(number2.floatValue());
                cVar.m0(number2);
            }
        }
    }

    /* renamed from: com.google.gson.Gson$3, reason: invalid class name */
    final class AnonymousClass3 extends TypeAdapter<Number> {
        @Override // com.google.gson.TypeAdapter
        public final Number b(E5.a aVar) throws IOException {
            if (aVar.C0() != E5.b.NULL) {
                return Long.valueOf(aVar.p0());
            }
            aVar.v0();
            return null;
        }

        @Override // com.google.gson.TypeAdapter
        public final void c(E5.c cVar, Number number) throws IOException {
            Number number2 = number;
            if (number2 == null) {
                cVar.B();
            } else {
                cVar.p0(number2.toString());
            }
        }
    }

    public static class FutureTypeAdapter<T> extends TypeAdapter<T> {

        /* renamed from: a, reason: collision with root package name */
        public TypeAdapter<T> f23368a;

        @Override // com.google.gson.TypeAdapter
        public final T b(E5.a aVar) throws IOException {
            TypeAdapter<T> typeAdapter = this.f23368a;
            if (typeAdapter != null) {
                return typeAdapter.b(aVar);
            }
            throw new IllegalStateException();
        }

        @Override // com.google.gson.TypeAdapter
        public final void c(E5.c cVar, T t10) throws IOException {
            TypeAdapter<T> typeAdapter = this.f23368a;
            if (typeAdapter == null) {
                throw new IllegalStateException();
            }
            typeAdapter.c(cVar, t10);
        }
    }

    static {
        new D5.a(Object.class);
    }

    public Gson() {
        Excluder excluder = Excluder.f23372d;
        b bVar = b.IDENTITY;
        Map<Type, d<?>> map = Collections.EMPTY_MAP;
        n nVar = n.DEFAULT;
        List<o> list = Collections.EMPTY_LIST;
        this.f23358a = new ThreadLocal<>();
        this.f23359b = new ConcurrentHashMap();
        this.f23363f = map;
        com.google.gson.internal.b bVar2 = new com.google.gson.internal.b();
        this.f23360c = bVar2;
        this.f23364g = true;
        this.f23365h = list;
        this.i = list;
        ArrayList arrayList = new ArrayList();
        arrayList.add(TypeAdapters.f23432B);
        arrayList.add(ObjectTypeAdapter.f23406b);
        arrayList.add(excluder);
        arrayList.addAll(list);
        arrayList.add(TypeAdapters.f23448p);
        arrayList.add(TypeAdapters.f23440g);
        arrayList.add(TypeAdapters.f23437d);
        arrayList.add(TypeAdapters.f23438e);
        arrayList.add(TypeAdapters.f23439f);
        final TypeAdapter<Number> typeAdapter = TypeAdapters.f23443k;
        arrayList.add(TypeAdapters.b(Long.TYPE, Long.class, typeAdapter));
        arrayList.add(TypeAdapters.b(Double.TYPE, Double.class, new AnonymousClass1()));
        arrayList.add(TypeAdapters.b(Float.TYPE, Float.class, new AnonymousClass2()));
        arrayList.add(TypeAdapters.f23444l);
        arrayList.add(TypeAdapters.f23441h);
        arrayList.add(TypeAdapters.i);
        arrayList.add(TypeAdapters.a(AtomicLong.class, new TypeAdapter.AnonymousClass1()));
        arrayList.add(TypeAdapters.a(AtomicLongArray.class, new TypeAdapter.AnonymousClass1()));
        arrayList.add(TypeAdapters.f23442j);
        arrayList.add(TypeAdapters.f23445m);
        arrayList.add(TypeAdapters.f23449q);
        arrayList.add(TypeAdapters.f23450r);
        arrayList.add(TypeAdapters.a(BigDecimal.class, TypeAdapters.f23446n));
        arrayList.add(TypeAdapters.a(BigInteger.class, TypeAdapters.f23447o));
        arrayList.add(TypeAdapters.f23451s);
        arrayList.add(TypeAdapters.f23452t);
        arrayList.add(TypeAdapters.f23454v);
        arrayList.add(TypeAdapters.f23455w);
        arrayList.add(TypeAdapters.f23458z);
        arrayList.add(TypeAdapters.f23453u);
        arrayList.add(TypeAdapters.f23435b);
        arrayList.add(DateTypeAdapter.f23398b);
        arrayList.add(TypeAdapters.f23457y);
        arrayList.add(TimeTypeAdapter.f23421b);
        arrayList.add(SqlDateTypeAdapter.f23419b);
        arrayList.add(TypeAdapters.f23456x);
        arrayList.add(ArrayTypeAdapter.f23392c);
        arrayList.add(TypeAdapters.f23434a);
        arrayList.add(new CollectionTypeAdapterFactory(bVar2));
        arrayList.add(new MapTypeAdapterFactory(bVar2));
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = new JsonAdapterAnnotationTypeAdapterFactory(bVar2);
        this.f23361d = jsonAdapterAnnotationTypeAdapterFactory;
        arrayList.add(jsonAdapterAnnotationTypeAdapterFactory);
        arrayList.add(TypeAdapters.f23433C);
        arrayList.add(new ReflectiveTypeAdapterFactory(bVar2, bVar, excluder, jsonAdapterAnnotationTypeAdapterFactory));
        this.f23362e = Collections.unmodifiableList(arrayList);
    }

    public static void a(double d10) {
        if (Double.isNaN(d10) || Double.isInfinite(d10)) {
            throw new IllegalArgumentException(d10 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public final Object b(Class cls, String str) throws m {
        Object objC = c(str, cls);
        Class<?> cls2 = com.google.gson.internal.h.f23505a.get(cls);
        if (cls2 != null) {
            cls = cls2;
        }
        return cls.cast(objC);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x005a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <T> T c(java.lang.String r5, java.lang.reflect.Type r6) throws com.google.gson.m {
        /*
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            java.io.StringReader r1 = new java.io.StringReader
            r1.<init>(r5)
            E5.a r5 = new E5.a
            r5.<init>(r1)
            java.lang.String r1 = "AssertionError (GSON 2.8.5): "
            r2 = 1
            r5.f1424c = r2
            r3 = 0
            r5.C0()     // Catch: java.lang.Throwable -> L27 java.lang.AssertionError -> L29 java.io.IOException -> L2b java.lang.IllegalStateException -> L2d java.io.EOFException -> L54
            D5.a r2 = new D5.a     // Catch: java.lang.Throwable -> L27 java.lang.AssertionError -> L29 java.io.IOException -> L2b java.lang.IllegalStateException -> L2d java.io.EOFException -> L2f
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L27 java.lang.AssertionError -> L29 java.io.IOException -> L2b java.lang.IllegalStateException -> L2d java.io.EOFException -> L2f
            com.google.gson.TypeAdapter r6 = r4.d(r2)     // Catch: java.lang.Throwable -> L27 java.lang.AssertionError -> L29 java.io.IOException -> L2b java.lang.IllegalStateException -> L2d java.io.EOFException -> L2f
            java.lang.Object r0 = r6.b(r5)     // Catch: java.lang.Throwable -> L27 java.lang.AssertionError -> L29 java.io.IOException -> L2b java.lang.IllegalStateException -> L2d java.io.EOFException -> L2f
        L24:
            r5.f1424c = r3
            goto L58
        L27:
            r6 = move-exception
            goto L82
        L29:
            r6 = move-exception
            goto L32
        L2b:
            r6 = move-exception
            goto L48
        L2d:
            r6 = move-exception
            goto L4e
        L2f:
            r6 = move-exception
            r2 = r3
            goto L55
        L32:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L27
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L27
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L27
            java.lang.String r1 = r6.getMessage()     // Catch: java.lang.Throwable -> L27
            r2.append(r1)     // Catch: java.lang.Throwable -> L27
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> L27
            r0.<init>(r1, r6)     // Catch: java.lang.Throwable -> L27
            throw r0     // Catch: java.lang.Throwable -> L27
        L48:
            com.google.gson.m r0 = new com.google.gson.m     // Catch: java.lang.Throwable -> L27
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L27
            throw r0     // Catch: java.lang.Throwable -> L27
        L4e:
            com.google.gson.m r0 = new com.google.gson.m     // Catch: java.lang.Throwable -> L27
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L27
            throw r0     // Catch: java.lang.Throwable -> L27
        L54:
            r6 = move-exception
        L55:
            if (r2 == 0) goto L7c
            goto L24
        L58:
            if (r0 == 0) goto L7b
            E5.b r5 = r5.C0()     // Catch: java.io.IOException -> L6b E5.d -> L6d
            E5.b r6 = E5.b.END_DOCUMENT     // Catch: java.io.IOException -> L6b E5.d -> L6d
            if (r5 != r6) goto L63
            goto L7b
        L63:
            com.google.gson.h r5 = new com.google.gson.h     // Catch: java.io.IOException -> L6b E5.d -> L6d
            java.lang.String r6 = "JSON document was not fully consumed."
            r5.<init>(r6)     // Catch: java.io.IOException -> L6b E5.d -> L6d
            throw r5     // Catch: java.io.IOException -> L6b E5.d -> L6d
        L6b:
            r5 = move-exception
            goto L6f
        L6d:
            r5 = move-exception
            goto L75
        L6f:
            com.google.gson.h r6 = new com.google.gson.h
            r6.<init>(r5)
            throw r6
        L75:
            com.google.gson.m r6 = new com.google.gson.m
            r6.<init>(r5)
            throw r6
        L7b:
            return r0
        L7c:
            com.google.gson.m r0 = new com.google.gson.m     // Catch: java.lang.Throwable -> L27
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L27
            throw r0     // Catch: java.lang.Throwable -> L27
        L82:
            r5.f1424c = r3
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.Gson.c(java.lang.String, java.lang.reflect.Type):java.lang.Object");
    }

    public final <T> TypeAdapter<T> d(D5.a<T> aVar) {
        boolean z10;
        ConcurrentHashMap concurrentHashMap = this.f23359b;
        TypeAdapter<T> typeAdapter = (TypeAdapter) concurrentHashMap.get(aVar);
        if (typeAdapter != null) {
            return typeAdapter;
        }
        ThreadLocal<Map<D5.a<?>, FutureTypeAdapter<?>>> threadLocal = this.f23358a;
        Map<D5.a<?>, FutureTypeAdapter<?>> map = threadLocal.get();
        if (map == null) {
            map = new HashMap<>();
            threadLocal.set(map);
            z10 = true;
        } else {
            z10 = false;
        }
        FutureTypeAdapter<?> futureTypeAdapter = map.get(aVar);
        if (futureTypeAdapter != null) {
            return futureTypeAdapter;
        }
        try {
            FutureTypeAdapter<?> futureTypeAdapter2 = new FutureTypeAdapter<>();
            map.put(aVar, futureTypeAdapter2);
            Iterator<o> it = this.f23362e.iterator();
            while (it.hasNext()) {
                TypeAdapter<T> typeAdapterA = it.next().a(this, aVar);
                if (typeAdapterA != null) {
                    if (futureTypeAdapter2.f23368a != null) {
                        throw new AssertionError();
                    }
                    futureTypeAdapter2.f23368a = typeAdapterA;
                    concurrentHashMap.put(aVar, typeAdapterA);
                    map.remove(aVar);
                    if (z10) {
                        threadLocal.remove();
                    }
                    return typeAdapterA;
                }
            }
            throw new IllegalArgumentException("GSON (2.8.5) cannot handle " + aVar);
        } catch (Throwable th) {
            map.remove(aVar);
            if (z10) {
                threadLocal.remove();
            }
            throw th;
        }
    }

    public final <T> TypeAdapter<T> e(o oVar, D5.a<T> aVar) {
        List<o> list = this.f23362e;
        if (!list.contains(oVar)) {
            oVar = this.f23361d;
        }
        boolean z10 = false;
        for (o oVar2 : list) {
            if (z10) {
                TypeAdapter<T> typeAdapterA = oVar2.a(this, aVar);
                if (typeAdapterA != null) {
                    return typeAdapterA;
                }
            } else if (oVar2 == oVar) {
                z10 = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + aVar);
    }

    public final E5.c f(Writer writer) throws IOException {
        E5.c cVar = new E5.c(writer);
        cVar.i = false;
        return cVar;
    }

    public final String g(Object obj) throws h {
        if (obj == null) {
            i iVar = i.f23371b;
            StringWriter stringWriter = new StringWriter();
            try {
                h(iVar, f(stringWriter));
                return stringWriter.toString();
            } catch (IOException e4) {
                throw new h(e4);
            }
        }
        Class cls = obj.getClass();
        StringWriter stringWriter2 = new StringWriter();
        try {
            i(obj, cls, f(stringWriter2));
            return stringWriter2.toString();
        } catch (IOException e10) {
            throw new h(e10);
        }
    }

    public final void h(i iVar, E5.c cVar) throws h {
        boolean z10 = cVar.f1443f;
        cVar.f1443f = true;
        boolean z11 = cVar.f1444g;
        cVar.f1444g = this.f23364g;
        boolean z12 = cVar.i;
        cVar.i = false;
        try {
            try {
                TypeAdapters.f23431A.c(cVar, iVar);
                cVar.f1443f = z10;
                cVar.f1444g = z11;
                cVar.i = z12;
            } catch (IOException e4) {
                throw new h(e4);
            } catch (AssertionError e10) {
                throw new AssertionError("AssertionError (GSON 2.8.5): " + e10.getMessage(), e10);
            }
        } catch (Throwable th) {
            cVar.f1443f = z10;
            cVar.f1444g = z11;
            cVar.i = z12;
            throw th;
        }
    }

    public final void i(Object obj, Class cls, E5.c cVar) throws h {
        TypeAdapter typeAdapterD = d(new D5.a(cls));
        boolean z10 = cVar.f1443f;
        cVar.f1443f = true;
        boolean z11 = cVar.f1444g;
        cVar.f1444g = this.f23364g;
        boolean z12 = cVar.i;
        cVar.i = false;
        try {
            try {
                try {
                    typeAdapterD.c(cVar, obj);
                } catch (AssertionError e4) {
                    throw new AssertionError("AssertionError (GSON 2.8.5): " + e4.getMessage(), e4);
                }
            } catch (IOException e10) {
                throw new h(e10);
            }
        } finally {
            cVar.f1443f = z10;
            cVar.f1444g = z11;
            cVar.i = z12;
        }
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + this.f23362e + ",instanceCreators:" + this.f23360c + "}";
    }
}
