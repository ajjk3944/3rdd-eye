package com.google.gson.internal.bind;

import E5.c;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.g;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.internal.e;
import com.google.gson.internal.f;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.m;
import com.google.gson.o;
import java.io.IOException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* loaded from: classes2.dex */
public final class TypeAdapters {

    /* renamed from: A, reason: collision with root package name */
    public static final TypeAdapter<g> f23431A;

    /* renamed from: B, reason: collision with root package name */
    public static final o f23432B;

    /* renamed from: C, reason: collision with root package name */
    public static final o f23433C;

    /* renamed from: a, reason: collision with root package name */
    public static final o f23434a = new AnonymousClass32(Class.class, new TypeAdapter<Class>() { // from class: com.google.gson.internal.bind.TypeAdapters.1
        @Override // com.google.gson.TypeAdapter
        public final Class b(E5.a aVar) throws IOException {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }

        @Override // com.google.gson.TypeAdapter
        public final void c(c cVar, Class cls) throws IOException {
            throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?");
        }
    }.a());

    /* renamed from: b, reason: collision with root package name */
    public static final o f23435b = new AnonymousClass32(BitSet.class, new TypeAdapter<BitSet>() { // from class: com.google.gson.internal.bind.TypeAdapters.2
        /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
        @Override // com.google.gson.TypeAdapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.util.BitSet b(E5.a r8) throws java.io.IOException {
            /*
                r7 = this;
                java.util.BitSet r0 = new java.util.BitSet
                r0.<init>()
                r8.a()
                E5.b r1 = r8.C0()
                r2 = 0
                r3 = r2
            Le:
                E5.b r4 = E5.b.END_ARRAY
                if (r1 == r4) goto L67
                int[] r4 = com.google.gson.internal.bind.TypeAdapters.a.f23472a
                int r5 = r1.ordinal()
                r4 = r4[r5]
                r5 = 1
                if (r4 == r5) goto L55
                r6 = 2
                if (r4 == r6) goto L50
                r6 = 3
                if (r4 != r6) goto L3c
                java.lang.String r1 = r8.y0()
                int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L30
                if (r1 == 0) goto L2e
                goto L5b
            L2e:
                r5 = r2
                goto L5b
            L30:
                com.google.gson.m r8 = new com.google.gson.m
                java.lang.String r0 = "Error: Expecting: bitset number value (1, 0), Found: "
                java.lang.String r0 = androidx.work.s.d(r0, r1)
                r8.<init>(r0)
                throw r8
            L3c:
                com.google.gson.m r8 = new com.google.gson.m
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r2 = "Invalid bitset value type: "
                r0.<init>(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r8.<init>(r0)
                throw r8
            L50:
                boolean r5 = r8.W()
                goto L5b
            L55:
                int r1 = r8.m0()
                if (r1 == 0) goto L2e
            L5b:
                if (r5 == 0) goto L60
                r0.set(r3)
            L60:
                int r3 = r3 + 1
                E5.b r1 = r8.C0()
                goto Le
            L67:
                r8.k()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.TypeAdapters.AnonymousClass2.b(E5.a):java.lang.Object");
        }

        @Override // com.google.gson.TypeAdapter
        public final void c(c cVar, BitSet bitSet) throws IOException {
            BitSet bitSet2 = bitSet;
            cVar.c();
            int length = bitSet2.length();
            for (int i10 = 0; i10 < length; i10++) {
                cVar.k0(bitSet2.get(i10) ? 1L : 0L);
            }
            cVar.k();
        }
    }.a());

    /* renamed from: c, reason: collision with root package name */
    public static final TypeAdapter<Boolean> f23436c;

    /* renamed from: d, reason: collision with root package name */
    public static final o f23437d;

    /* renamed from: e, reason: collision with root package name */
    public static final o f23438e;

    /* renamed from: f, reason: collision with root package name */
    public static final o f23439f;

    /* renamed from: g, reason: collision with root package name */
    public static final o f23440g;

    /* renamed from: h, reason: collision with root package name */
    public static final o f23441h;
    public static final o i;

    /* renamed from: j, reason: collision with root package name */
    public static final o f23442j;

    /* renamed from: k, reason: collision with root package name */
    public static final TypeAdapter<Number> f23443k;

    /* renamed from: l, reason: collision with root package name */
    public static final o f23444l;

    /* renamed from: m, reason: collision with root package name */
    public static final o f23445m;

    /* renamed from: n, reason: collision with root package name */
    public static final TypeAdapter<BigDecimal> f23446n;

    /* renamed from: o, reason: collision with root package name */
    public static final TypeAdapter<BigInteger> f23447o;

    /* renamed from: p, reason: collision with root package name */
    public static final o f23448p;

    /* renamed from: q, reason: collision with root package name */
    public static final o f23449q;

    /* renamed from: r, reason: collision with root package name */
    public static final o f23450r;

    /* renamed from: s, reason: collision with root package name */
    public static final o f23451s;

    /* renamed from: t, reason: collision with root package name */
    public static final o f23452t;

    /* renamed from: u, reason: collision with root package name */
    public static final o f23453u;

    /* renamed from: v, reason: collision with root package name */
    public static final o f23454v;

    /* renamed from: w, reason: collision with root package name */
    public static final o f23455w;

    /* renamed from: x, reason: collision with root package name */
    public static final o f23456x;

    /* renamed from: y, reason: collision with root package name */
    public static final o f23457y;

    /* renamed from: z, reason: collision with root package name */
    public static final o f23458z;

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$29, reason: invalid class name */
    public static class AnonymousClass29 extends TypeAdapter<g> {
        public static g d(E5.a aVar) throws IOException {
            switch (a.f23472a[aVar.C0().ordinal()]) {
                case 1:
                    return new k(new e(aVar.y0()));
                case 2:
                    Boolean boolValueOf = Boolean.valueOf(aVar.W());
                    k kVar = new k();
                    kVar.f(boolValueOf);
                    return kVar;
                case 3:
                    return new k(aVar.y0());
                case 4:
                    aVar.v0();
                    return i.f23371b;
                case 5:
                    com.google.gson.e eVar = new com.google.gson.e();
                    aVar.a();
                    while (aVar.B()) {
                        Object objD = d(aVar);
                        if (objD == null) {
                            objD = i.f23371b;
                        }
                        eVar.f23370b.add(objD);
                    }
                    aVar.k();
                    return eVar;
                case 6:
                    j jVar = new j();
                    aVar.c();
                    while (aVar.B()) {
                        String strQ0 = aVar.q0();
                        g gVarD = d(aVar);
                        if (gVarD == null) {
                            gVarD = i.f23371b;
                        }
                        jVar.f23513b.put(strQ0, gVarD);
                    }
                    aVar.l();
                    return jVar;
                default:
                    throw new IllegalArgumentException();
            }
        }

        public static void e(c cVar, g gVar) throws IOException {
            if (gVar == null || (gVar instanceof i)) {
                cVar.B();
                return;
            }
            boolean z10 = gVar instanceof k;
            if (z10) {
                if (!z10) {
                    throw new IllegalStateException("Not a JSON Primitive: " + gVar);
                }
                k kVar = (k) gVar;
                Serializable serializable = kVar.f23515b;
                if (serializable instanceof Number) {
                    cVar.m0(kVar.c());
                    return;
                } else if (serializable instanceof Boolean) {
                    cVar.q0(kVar.b());
                    return;
                } else {
                    cVar.p0(kVar.d());
                    return;
                }
            }
            boolean z11 = gVar instanceof com.google.gson.e;
            if (z11) {
                cVar.c();
                if (!z11) {
                    throw new IllegalStateException("Not a JSON Array: " + gVar);
                }
                Iterator it = ((com.google.gson.e) gVar).f23370b.iterator();
                while (it.hasNext()) {
                    e(cVar, (g) it.next());
                }
                cVar.k();
                return;
            }
            boolean z12 = gVar instanceof j;
            if (!z12) {
                throw new IllegalArgumentException("Couldn't write " + gVar.getClass());
            }
            cVar.d();
            if (!z12) {
                throw new IllegalStateException("Not a JSON Object: " + gVar);
            }
            Iterator it2 = ((f.b) ((j) gVar).f23513b.entrySet()).iterator();
            while (((f.d) it2).hasNext()) {
                Map.Entry entryA = ((f.b.a) it2).a();
                cVar.n((String) entryA.getKey());
                e(cVar, (g) entryA.getValue());
            }
            cVar.l();
        }

        @Override // com.google.gson.TypeAdapter
        public final /* bridge */ /* synthetic */ g b(E5.a aVar) throws IOException {
            return d(aVar);
        }

        @Override // com.google.gson.TypeAdapter
        public final /* bridge */ /* synthetic */ void c(c cVar, g gVar) throws IOException {
            e(cVar, gVar);
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$31, reason: invalid class name */
    final class AnonymousClass31 implements o {
        @Override // com.google.gson.o
        public final <T> TypeAdapter<T> a(Gson gson, D5.a<T> aVar) {
            aVar.equals(null);
            return null;
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$32, reason: invalid class name */
    public static class AnonymousClass32 implements o {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Class f23460b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ TypeAdapter f23461c;

        public AnonymousClass32(Class cls, TypeAdapter typeAdapter) {
            this.f23460b = cls;
            this.f23461c = typeAdapter;
        }

        @Override // com.google.gson.o
        public final <T> TypeAdapter<T> a(Gson gson, D5.a<T> aVar) {
            if (aVar.f1061a == this.f23460b) {
                return this.f23461c;
            }
            return null;
        }

        public final String toString() {
            return "Factory[type=" + this.f23460b.getName() + ",adapter=" + this.f23461c + "]";
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$33, reason: invalid class name */
    public static class AnonymousClass33 implements o {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Class f23462b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Class f23463c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ TypeAdapter f23464d;

        public AnonymousClass33(Class cls, Class cls2, TypeAdapter typeAdapter) {
            this.f23462b = cls;
            this.f23463c = cls2;
            this.f23464d = typeAdapter;
        }

        @Override // com.google.gson.o
        public final <T> TypeAdapter<T> a(Gson gson, D5.a<T> aVar) {
            Class<? super T> cls = aVar.f1061a;
            if (cls == this.f23462b || cls == this.f23463c) {
                return this.f23464d;
            }
            return null;
        }

        public final String toString() {
            return "Factory[type=" + this.f23463c.getName() + "+" + this.f23462b.getName() + ",adapter=" + this.f23464d + "]";
        }
    }

    public static final class EnumTypeAdapter<T extends Enum<T>> extends TypeAdapter<T> {

        /* renamed from: a, reason: collision with root package name */
        public final HashMap f23470a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        public final HashMap f23471b = new HashMap();

        public EnumTypeAdapter(Class<T> cls) {
            try {
                for (T t10 : cls.getEnumConstants()) {
                    String strName = t10.name();
                    A5.b bVar = (A5.b) cls.getField(strName).getAnnotation(A5.b.class);
                    if (bVar != null) {
                        strName = bVar.value();
                        for (String str : bVar.alternate()) {
                            this.f23470a.put(str, t10);
                        }
                    }
                    this.f23470a.put(strName, t10);
                    this.f23471b.put(t10, strName);
                }
            } catch (NoSuchFieldException e4) {
                throw new AssertionError(e4);
            }
        }

        @Override // com.google.gson.TypeAdapter
        public final Object b(E5.a aVar) throws IOException {
            if (aVar.C0() != E5.b.NULL) {
                return (Enum) this.f23470a.get(aVar.y0());
            }
            aVar.v0();
            return null;
        }

        @Override // com.google.gson.TypeAdapter
        public final void c(c cVar, Object obj) throws IOException {
            Enum r32 = (Enum) obj;
            cVar.p0(r32 == null ? null : (String) this.f23471b.get(r32));
        }
    }

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23472a;

        static {
            int[] iArr = new int[E5.b.values().length];
            f23472a = iArr;
            try {
                iArr[E5.b.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23472a[E5.b.BOOLEAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23472a[E5.b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23472a[E5.b.NULL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23472a[E5.b.BEGIN_ARRAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23472a[E5.b.BEGIN_OBJECT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23472a[E5.b.END_DOCUMENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f23472a[E5.b.NAME.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f23472a[E5.b.END_OBJECT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f23472a[E5.b.END_ARRAY.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    static {
        TypeAdapter<Boolean> typeAdapter = new TypeAdapter<Boolean>() { // from class: com.google.gson.internal.bind.TypeAdapters.3
            @Override // com.google.gson.TypeAdapter
            public final Boolean b(E5.a aVar) throws IOException {
                E5.b bVarC0 = aVar.C0();
                if (bVarC0 != E5.b.NULL) {
                    return bVarC0 == E5.b.STRING ? Boolean.valueOf(Boolean.parseBoolean(aVar.y0())) : Boolean.valueOf(aVar.W());
                }
                aVar.v0();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public final void c(c cVar, Boolean bool) throws IOException {
                Boolean bool2 = bool;
                if (bool2 == null) {
                    cVar.B();
                    return;
                }
                cVar.u0();
                cVar.a();
                cVar.f1439b.write(bool2.booleanValue() ? "true" : "false");
            }
        };
        f23436c = new TypeAdapter<Boolean>() { // from class: com.google.gson.internal.bind.TypeAdapters.4
            @Override // com.google.gson.TypeAdapter
            public final Boolean b(E5.a aVar) throws IOException {
                if (aVar.C0() != E5.b.NULL) {
                    return Boolean.valueOf(aVar.y0());
                }
                aVar.v0();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public final void c(c cVar, Boolean bool) throws IOException {
                Boolean bool2 = bool;
                cVar.p0(bool2 == null ? "null" : bool2.toString());
            }
        };
        f23437d = new AnonymousClass33(Boolean.TYPE, Boolean.class, typeAdapter);
        f23438e = new AnonymousClass33(Byte.TYPE, Byte.class, new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.5
            @Override // com.google.gson.TypeAdapter
            public final Number b(E5.a aVar) throws IOException {
                if (aVar.C0() == E5.b.NULL) {
                    aVar.v0();
                    return null;
                }
                try {
                    return Byte.valueOf((byte) aVar.m0());
                } catch (NumberFormatException e4) {
                    throw new m(e4);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void c(c cVar, Number number) throws IOException {
                cVar.m0(number);
            }
        });
        f23439f = new AnonymousClass33(Short.TYPE, Short.class, new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.6
            @Override // com.google.gson.TypeAdapter
            public final Number b(E5.a aVar) throws IOException {
                if (aVar.C0() == E5.b.NULL) {
                    aVar.v0();
                    return null;
                }
                try {
                    return Short.valueOf((short) aVar.m0());
                } catch (NumberFormatException e4) {
                    throw new m(e4);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void c(c cVar, Number number) throws IOException {
                cVar.m0(number);
            }
        });
        f23440g = new AnonymousClass33(Integer.TYPE, Integer.class, new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.7
            @Override // com.google.gson.TypeAdapter
            public final Number b(E5.a aVar) throws IOException {
                if (aVar.C0() == E5.b.NULL) {
                    aVar.v0();
                    return null;
                }
                try {
                    return Integer.valueOf(aVar.m0());
                } catch (NumberFormatException e4) {
                    throw new m(e4);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void c(c cVar, Number number) throws IOException {
                cVar.m0(number);
            }
        });
        f23441h = new AnonymousClass32(AtomicInteger.class, new TypeAdapter<AtomicInteger>() { // from class: com.google.gson.internal.bind.TypeAdapters.8
            @Override // com.google.gson.TypeAdapter
            public final AtomicInteger b(E5.a aVar) throws IOException {
                try {
                    return new AtomicInteger(aVar.m0());
                } catch (NumberFormatException e4) {
                    throw new m(e4);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void c(c cVar, AtomicInteger atomicInteger) throws IOException {
                cVar.k0(atomicInteger.get());
            }
        }.a());
        i = new AnonymousClass32(AtomicBoolean.class, new TypeAdapter<AtomicBoolean>() { // from class: com.google.gson.internal.bind.TypeAdapters.9
            @Override // com.google.gson.TypeAdapter
            public final AtomicBoolean b(E5.a aVar) throws IOException {
                return new AtomicBoolean(aVar.W());
            }

            @Override // com.google.gson.TypeAdapter
            public final void c(c cVar, AtomicBoolean atomicBoolean) throws IOException {
                cVar.q0(atomicBoolean.get());
            }
        }.a());
        f23442j = new AnonymousClass32(AtomicIntegerArray.class, new TypeAdapter<AtomicIntegerArray>() { // from class: com.google.gson.internal.bind.TypeAdapters.10
            @Override // com.google.gson.TypeAdapter
            public final AtomicIntegerArray b(E5.a aVar) throws IOException {
                ArrayList arrayList = new ArrayList();
                aVar.a();
                while (aVar.B()) {
                    try {
                        arrayList.add(Integer.valueOf(aVar.m0()));
                    } catch (NumberFormatException e4) {
                        throw new m(e4);
                    }
                }
                aVar.k();
                int size = arrayList.size();
                AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
                for (int i10 = 0; i10 < size; i10++) {
                    atomicIntegerArray.set(i10, ((Integer) arrayList.get(i10)).intValue());
                }
                return atomicIntegerArray;
            }

            @Override // com.google.gson.TypeAdapter
            public final void c(c cVar, AtomicIntegerArray atomicIntegerArray) throws IOException {
                cVar.c();
                int length = atomicIntegerArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    cVar.k0(r6.get(i10));
                }
                cVar.k();
            }
        }.a());
        f23443k = new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.11
            @Override // com.google.gson.TypeAdapter
            public final Number b(E5.a aVar) throws IOException {
                if (aVar.C0() == E5.b.NULL) {
                    aVar.v0();
                    return null;
                }
                try {
                    return Long.valueOf(aVar.p0());
                } catch (NumberFormatException e4) {
                    throw new m(e4);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void c(c cVar, Number number) throws IOException {
                cVar.m0(number);
            }
        };
        new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.12
            @Override // com.google.gson.TypeAdapter
            public final Number b(E5.a aVar) throws IOException {
                if (aVar.C0() != E5.b.NULL) {
                    return Float.valueOf((float) aVar.k0());
                }
                aVar.v0();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public final void c(c cVar, Number number) throws IOException {
                cVar.m0(number);
            }
        };
        new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.13
            @Override // com.google.gson.TypeAdapter
            public final Number b(E5.a aVar) throws IOException {
                if (aVar.C0() != E5.b.NULL) {
                    return Double.valueOf(aVar.k0());
                }
                aVar.v0();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public final void c(c cVar, Number number) throws IOException {
                cVar.m0(number);
            }
        };
        f23444l = new AnonymousClass32(Number.class, new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.14
            @Override // com.google.gson.TypeAdapter
            public final Number b(E5.a aVar) throws IOException {
                E5.b bVarC0 = aVar.C0();
                int i10 = a.f23472a[bVarC0.ordinal()];
                if (i10 == 1 || i10 == 3) {
                    return new e(aVar.y0());
                }
                if (i10 == 4) {
                    aVar.v0();
                    return null;
                }
                throw new m("Expecting number, got: " + bVarC0);
            }

            @Override // com.google.gson.TypeAdapter
            public final void c(c cVar, Number number) throws IOException {
                cVar.m0(number);
            }
        });
        f23445m = new AnonymousClass33(Character.TYPE, Character.class, new TypeAdapter<Character>() { // from class: com.google.gson.internal.bind.TypeAdapters.15
            @Override // com.google.gson.TypeAdapter
            public final Character b(E5.a aVar) throws IOException {
                if (aVar.C0() == E5.b.NULL) {
                    aVar.v0();
                    return null;
                }
                String strY0 = aVar.y0();
                if (strY0.length() == 1) {
                    return Character.valueOf(strY0.charAt(0));
                }
                throw new m("Expecting character, got: ".concat(strY0));
            }

            @Override // com.google.gson.TypeAdapter
            public final void c(c cVar, Character ch) throws IOException {
                Character ch2 = ch;
                cVar.p0(ch2 == null ? null : String.valueOf(ch2));
            }
        });
        TypeAdapter<String> typeAdapter2 = new TypeAdapter<String>() { // from class: com.google.gson.internal.bind.TypeAdapters.16
            @Override // com.google.gson.TypeAdapter
            public final String b(E5.a aVar) throws IOException {
                E5.b bVarC0 = aVar.C0();
                if (bVarC0 != E5.b.NULL) {
                    return bVarC0 == E5.b.BOOLEAN ? Boolean.toString(aVar.W()) : aVar.y0();
                }
                aVar.v0();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public final void c(c cVar, String str) throws IOException {
                cVar.p0(str);
            }
        };
        f23446n = new TypeAdapter<BigDecimal>() { // from class: com.google.gson.internal.bind.TypeAdapters.17
            @Override // com.google.gson.TypeAdapter
            public final BigDecimal b(E5.a aVar) throws IOException {
                if (aVar.C0() == E5.b.NULL) {
                    aVar.v0();
                    return null;
                }
                try {
                    return new BigDecimal(aVar.y0());
                } catch (NumberFormatException e4) {
                    throw new m(e4);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void c(c cVar, BigDecimal bigDecimal) throws IOException {
                cVar.m0(bigDecimal);
            }
        };
        f23447o = new TypeAdapter<BigInteger>() { // from class: com.google.gson.internal.bind.TypeAdapters.18
            @Override // com.google.gson.TypeAdapter
            public final BigInteger b(E5.a aVar) throws IOException {
                if (aVar.C0() == E5.b.NULL) {
                    aVar.v0();
                    return null;
                }
                try {
                    return new BigInteger(aVar.y0());
                } catch (NumberFormatException e4) {
                    throw new m(e4);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void c(c cVar, BigInteger bigInteger) throws IOException {
                cVar.m0(bigInteger);
            }
        };
        f23448p = new AnonymousClass32(String.class, typeAdapter2);
        f23449q = new AnonymousClass32(StringBuilder.class, new TypeAdapter<StringBuilder>() { // from class: com.google.gson.internal.bind.TypeAdapters.19
            @Override // com.google.gson.TypeAdapter
            public final StringBuilder b(E5.a aVar) throws IOException {
                if (aVar.C0() != E5.b.NULL) {
                    return new StringBuilder(aVar.y0());
                }
                aVar.v0();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public final void c(c cVar, StringBuilder sb) throws IOException {
                StringBuilder sb2 = sb;
                cVar.p0(sb2 == null ? null : sb2.toString());
            }
        });
        f23450r = new AnonymousClass32(StringBuffer.class, new TypeAdapter<StringBuffer>() { // from class: com.google.gson.internal.bind.TypeAdapters.20
            @Override // com.google.gson.TypeAdapter
            public final StringBuffer b(E5.a aVar) throws IOException {
                if (aVar.C0() != E5.b.NULL) {
                    return new StringBuffer(aVar.y0());
                }
                aVar.v0();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public final void c(c cVar, StringBuffer stringBuffer) throws IOException {
                StringBuffer stringBuffer2 = stringBuffer;
                cVar.p0(stringBuffer2 == null ? null : stringBuffer2.toString());
            }
        });
        f23451s = new AnonymousClass32(URL.class, new TypeAdapter<URL>() { // from class: com.google.gson.internal.bind.TypeAdapters.21
            @Override // com.google.gson.TypeAdapter
            public final URL b(E5.a aVar) throws IOException {
                if (aVar.C0() == E5.b.NULL) {
                    aVar.v0();
                    return null;
                }
                String strY0 = aVar.y0();
                if ("null".equals(strY0)) {
                    return null;
                }
                return new URL(strY0);
            }

            @Override // com.google.gson.TypeAdapter
            public final void c(c cVar, URL url) throws IOException {
                URL url2 = url;
                cVar.p0(url2 == null ? null : url2.toExternalForm());
            }
        });
        f23452t = new AnonymousClass32(URI.class, new TypeAdapter<URI>() { // from class: com.google.gson.internal.bind.TypeAdapters.22
            @Override // com.google.gson.TypeAdapter
            public final URI b(E5.a aVar) throws IOException {
                if (aVar.C0() == E5.b.NULL) {
                    aVar.v0();
                    return null;
                }
                try {
                    String strY0 = aVar.y0();
                    if ("null".equals(strY0)) {
                        return null;
                    }
                    return new URI(strY0);
                } catch (URISyntaxException e4) {
                    throw new h(e4);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void c(c cVar, URI uri) throws IOException {
                URI uri2 = uri;
                cVar.p0(uri2 == null ? null : uri2.toASCIIString());
            }
        });
        final TypeAdapter<InetAddress> typeAdapter3 = new TypeAdapter<InetAddress>() { // from class: com.google.gson.internal.bind.TypeAdapters.23
            @Override // com.google.gson.TypeAdapter
            public final InetAddress b(E5.a aVar) throws IOException {
                if (aVar.C0() != E5.b.NULL) {
                    return InetAddress.getByName(aVar.y0());
                }
                aVar.v0();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public final void c(c cVar, InetAddress inetAddress) throws IOException {
                InetAddress inetAddress2 = inetAddress;
                cVar.p0(inetAddress2 == null ? null : inetAddress2.getHostAddress());
            }
        };
        final Class<InetAddress> cls = InetAddress.class;
        f23453u = new o() { // from class: com.google.gson.internal.bind.TypeAdapters.35
            @Override // com.google.gson.o
            public final <T2> TypeAdapter<T2> a(Gson gson, D5.a<T2> aVar) {
                final Class<? super T2> cls2 = aVar.f1061a;
                if (cls.isAssignableFrom(cls2)) {
                    return (TypeAdapter<T2>) new TypeAdapter<Object>() { // from class: com.google.gson.internal.bind.TypeAdapters.35.1
                        @Override // com.google.gson.TypeAdapter
                        public final Object b(E5.a aVar2) throws IOException {
                            Object objB = typeAdapter3.b(aVar2);
                            if (objB != null) {
                                Class cls3 = cls2;
                                if (!cls3.isInstance(objB)) {
                                    throw new m("Expected a " + cls3.getName() + " but was " + objB.getClass().getName());
                                }
                            }
                            return objB;
                        }

                        @Override // com.google.gson.TypeAdapter
                        public final void c(c cVar, Object obj) throws IOException {
                            typeAdapter3.c(cVar, obj);
                        }
                    };
                }
                return null;
            }

            public final String toString() {
                return "Factory[typeHierarchy=" + cls.getName() + ",adapter=" + typeAdapter3 + "]";
            }
        };
        f23454v = new AnonymousClass32(UUID.class, new TypeAdapter<UUID>() { // from class: com.google.gson.internal.bind.TypeAdapters.24
            @Override // com.google.gson.TypeAdapter
            public final UUID b(E5.a aVar) throws IOException {
                if (aVar.C0() != E5.b.NULL) {
                    return UUID.fromString(aVar.y0());
                }
                aVar.v0();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public final void c(c cVar, UUID uuid) throws IOException {
                UUID uuid2 = uuid;
                cVar.p0(uuid2 == null ? null : uuid2.toString());
            }
        });
        f23455w = new AnonymousClass32(Currency.class, new TypeAdapter<Currency>() { // from class: com.google.gson.internal.bind.TypeAdapters.25
            @Override // com.google.gson.TypeAdapter
            public final Currency b(E5.a aVar) throws IOException {
                return Currency.getInstance(aVar.y0());
            }

            @Override // com.google.gson.TypeAdapter
            public final void c(c cVar, Currency currency) throws IOException {
                cVar.p0(currency.getCurrencyCode());
            }
        }.a());
        f23456x = new o() { // from class: com.google.gson.internal.bind.TypeAdapters.26
            @Override // com.google.gson.o
            public final <T> TypeAdapter<T> a(Gson gson, D5.a<T> aVar) {
                if (aVar.f1061a != Timestamp.class) {
                    return null;
                }
                gson.getClass();
                final TypeAdapter<T> typeAdapterD = gson.d(new D5.a<>(Date.class));
                return (TypeAdapter<T>) new TypeAdapter<Timestamp>() { // from class: com.google.gson.internal.bind.TypeAdapters.26.1
                    @Override // com.google.gson.TypeAdapter
                    public final Timestamp b(E5.a aVar2) throws IOException {
                        Date date = (Date) typeAdapterD.b(aVar2);
                        if (date != null) {
                            return new Timestamp(date.getTime());
                        }
                        return null;
                    }

                    @Override // com.google.gson.TypeAdapter
                    public final void c(c cVar, Timestamp timestamp) throws IOException {
                        typeAdapterD.c(cVar, timestamp);
                    }
                };
            }
        };
        final TypeAdapter<Calendar> typeAdapter4 = new TypeAdapter<Calendar>() { // from class: com.google.gson.internal.bind.TypeAdapters.27
            @Override // com.google.gson.TypeAdapter
            public final Calendar b(E5.a aVar) throws IOException, NumberFormatException {
                if (aVar.C0() == E5.b.NULL) {
                    aVar.v0();
                    return null;
                }
                aVar.c();
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                while (aVar.C0() != E5.b.END_OBJECT) {
                    String strQ0 = aVar.q0();
                    int iM0 = aVar.m0();
                    if ("year".equals(strQ0)) {
                        i10 = iM0;
                    } else if ("month".equals(strQ0)) {
                        i11 = iM0;
                    } else if ("dayOfMonth".equals(strQ0)) {
                        i12 = iM0;
                    } else if ("hourOfDay".equals(strQ0)) {
                        i13 = iM0;
                    } else if ("minute".equals(strQ0)) {
                        i14 = iM0;
                    } else if ("second".equals(strQ0)) {
                        i15 = iM0;
                    }
                }
                aVar.l();
                return new GregorianCalendar(i10, i11, i12, i13, i14, i15);
            }

            @Override // com.google.gson.TypeAdapter
            public final void c(c cVar, Calendar calendar) throws IOException {
                if (calendar == null) {
                    cVar.B();
                    return;
                }
                cVar.d();
                cVar.n("year");
                cVar.k0(r4.get(1));
                cVar.n("month");
                cVar.k0(r4.get(2));
                cVar.n("dayOfMonth");
                cVar.k0(r4.get(5));
                cVar.n("hourOfDay");
                cVar.k0(r4.get(11));
                cVar.n("minute");
                cVar.k0(r4.get(12));
                cVar.n("second");
                cVar.k0(r4.get(13));
                cVar.l();
            }
        };
        f23457y = new o() { // from class: com.google.gson.internal.bind.TypeAdapters.34
            @Override // com.google.gson.o
            public final <T> TypeAdapter<T> a(Gson gson, D5.a<T> aVar) {
                Class<? super T> cls2 = aVar.f1061a;
                if (cls2 == Calendar.class || cls2 == GregorianCalendar.class) {
                    return typeAdapter4;
                }
                return null;
            }

            public final String toString() {
                return "Factory[type=" + Calendar.class.getName() + "+" + GregorianCalendar.class.getName() + ",adapter=" + typeAdapter4 + "]";
            }
        };
        f23458z = new AnonymousClass32(Locale.class, new TypeAdapter<Locale>() { // from class: com.google.gson.internal.bind.TypeAdapters.28
            @Override // com.google.gson.TypeAdapter
            public final Locale b(E5.a aVar) throws IOException {
                if (aVar.C0() == E5.b.NULL) {
                    aVar.v0();
                    return null;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(aVar.y0(), "_");
                String strNextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String strNextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String strNextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                return (strNextToken2 == null && strNextToken3 == null) ? new Locale(strNextToken) : strNextToken3 == null ? new Locale(strNextToken, strNextToken2) : new Locale(strNextToken, strNextToken2, strNextToken3);
            }

            @Override // com.google.gson.TypeAdapter
            public final void c(c cVar, Locale locale) throws IOException {
                Locale locale2 = locale;
                cVar.p0(locale2 == null ? null : locale2.toString());
            }
        });
        final AnonymousClass29 anonymousClass29 = new AnonymousClass29();
        f23431A = anonymousClass29;
        final Class<g> cls2 = g.class;
        f23432B = new o() { // from class: com.google.gson.internal.bind.TypeAdapters.35
            @Override // com.google.gson.o
            public final <T2> TypeAdapter<T2> a(Gson gson, D5.a<T2> aVar) {
                final Class cls22 = aVar.f1061a;
                if (cls2.isAssignableFrom(cls22)) {
                    return (TypeAdapter<T2>) new TypeAdapter<Object>() { // from class: com.google.gson.internal.bind.TypeAdapters.35.1
                        @Override // com.google.gson.TypeAdapter
                        public final Object b(E5.a aVar2) throws IOException {
                            Object objB = anonymousClass29.b(aVar2);
                            if (objB != null) {
                                Class cls3 = cls22;
                                if (!cls3.isInstance(objB)) {
                                    throw new m("Expected a " + cls3.getName() + " but was " + objB.getClass().getName());
                                }
                            }
                            return objB;
                        }

                        @Override // com.google.gson.TypeAdapter
                        public final void c(c cVar, Object obj) throws IOException {
                            anonymousClass29.c(cVar, obj);
                        }
                    };
                }
                return null;
            }

            public final String toString() {
                return "Factory[typeHierarchy=" + cls2.getName() + ",adapter=" + anonymousClass29 + "]";
            }
        };
        f23433C = new o() { // from class: com.google.gson.internal.bind.TypeAdapters.30
            @Override // com.google.gson.o
            public final <T> TypeAdapter<T> a(Gson gson, D5.a<T> aVar) {
                Class<? super T> superclass = aVar.f1061a;
                if (!Enum.class.isAssignableFrom(superclass) || superclass == Enum.class) {
                    return null;
                }
                if (!superclass.isEnum()) {
                    superclass = superclass.getSuperclass();
                }
                return new EnumTypeAdapter(superclass);
            }
        };
    }

    public static <TT> o a(Class<TT> cls, TypeAdapter<TT> typeAdapter) {
        return new AnonymousClass32(cls, typeAdapter);
    }

    public static <TT> o b(Class<TT> cls, Class<TT> cls2, TypeAdapter<? super TT> typeAdapter) {
        return new AnonymousClass33(cls, cls2, typeAdapter);
    }
}
