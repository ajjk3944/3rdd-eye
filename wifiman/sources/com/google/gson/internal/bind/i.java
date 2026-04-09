package com.google.gson.internal.bind;

import com.google.gson.JsonIOException;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.p;
import com.google.gson.q;
import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import t5.C8032c;
import t5.m;
import t5.o;
import v5.AbstractC8192a;
import w5.C8268a;
import w5.C8270c;
import w5.EnumC8269b;

/* loaded from: classes3.dex */
public final class i implements q {

    /* renamed from: a, reason: collision with root package name */
    private final C8032c f39018a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.gson.c f39019b;

    /* renamed from: c, reason: collision with root package name */
    private final t5.d f39020c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.gson.internal.bind.d f39021d;

    /* renamed from: e, reason: collision with root package name */
    private final List f39022e;

    class a extends p {
        a() {
        }

        @Override // com.google.gson.p
        public Object b(C8268a c8268a) throws IOException {
            c8268a.F0();
            return null;
        }

        @Override // com.google.gson.p
        public void d(C8270c c8270c, Object obj) throws IOException {
            c8270c.b0();
        }

        public String toString() {
            return "AnonymousOrNonStaticLocalClassAdapter";
        }
    }

    class b extends d {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f39024d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Method f39025e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ p f39026f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ p f39027g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f39028h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f39029i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, Field field, boolean z10, Method method, p pVar, p pVar2, boolean z11, boolean z12) {
            super(str, field);
            this.f39024d = z10;
            this.f39025e = method;
            this.f39026f = pVar;
            this.f39027g = pVar2;
            this.f39028h = z11;
            this.f39029i = z12;
        }

        @Override // com.google.gson.internal.bind.i.d
        void a(C8268a c8268a, int i10, Object[] objArr) {
            Object objB = this.f39027g.b(c8268a);
            if (objB != null || !this.f39028h) {
                objArr[i10] = objB;
                return;
            }
            throw new JsonParseException("null is not allowed as value for record component '" + this.f39034c + "' of primitive type; at path " + c8268a.getPath());
        }

        @Override // com.google.gson.internal.bind.i.d
        void b(C8268a c8268a, Object obj) throws IllegalAccessException, IllegalArgumentException {
            Object objB = this.f39027g.b(c8268a);
            if (objB == null && this.f39028h) {
                return;
            }
            if (this.f39024d) {
                i.c(obj, this.f39033b);
            } else if (this.f39029i) {
                throw new JsonIOException("Cannot set value of 'static final' " + AbstractC8192a.g(this.f39033b, false));
            }
            this.f39033b.set(obj, objB);
        }

        @Override // com.google.gson.internal.bind.i.d
        void c(C8270c c8270c, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            Object objInvoke;
            if (this.f39024d) {
                Method method = this.f39025e;
                if (method == null) {
                    i.c(obj, this.f39033b);
                } else {
                    i.c(obj, method);
                }
            }
            Method method2 = this.f39025e;
            if (method2 != null) {
                try {
                    objInvoke = method2.invoke(obj, null);
                } catch (InvocationTargetException e10) {
                    throw new JsonIOException("Accessor " + AbstractC8192a.g(this.f39025e, false) + " threw exception", e10.getCause());
                }
            } else {
                objInvoke = this.f39033b.get(obj);
            }
            if (objInvoke == obj) {
                return;
            }
            c8270c.T(this.f39032a);
            this.f39026f.d(c8270c, objInvoke);
        }
    }

    public static abstract class c extends p {

        /* renamed from: a, reason: collision with root package name */
        private final f f39031a;

        c(f fVar) {
            this.f39031a = fVar;
        }

        @Override // com.google.gson.p
        public Object b(C8268a c8268a) throws IOException {
            if (c8268a.v0() == EnumC8269b.NULL) {
                c8268a.r0();
                return null;
            }
            Object objE = e();
            Map map = this.f39031a.f39037a;
            try {
                c8268a.h();
                while (c8268a.T()) {
                    d dVar = (d) map.get(c8268a.p0());
                    if (dVar == null) {
                        c8268a.F0();
                    } else {
                        g(objE, c8268a, dVar);
                    }
                }
                c8268a.y();
                return f(objE);
            } catch (IllegalAccessException e10) {
                throw AbstractC8192a.e(e10);
            } catch (IllegalStateException e11) {
                throw new JsonSyntaxException(e11);
            }
        }

        @Override // com.google.gson.p
        public void d(C8270c c8270c, Object obj) throws IOException {
            if (obj == null) {
                c8270c.b0();
                return;
            }
            c8270c.j();
            try {
                Iterator it = this.f39031a.f39038b.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).c(c8270c, obj);
                }
                c8270c.v();
            } catch (IllegalAccessException e10) {
                throw AbstractC8192a.e(e10);
            }
        }

        abstract Object e();

        abstract Object f(Object obj);

        abstract void g(Object obj, C8268a c8268a, d dVar);
    }

    static abstract class d {

        /* renamed from: a, reason: collision with root package name */
        final String f39032a;

        /* renamed from: b, reason: collision with root package name */
        final Field f39033b;

        /* renamed from: c, reason: collision with root package name */
        final String f39034c;

        protected d(String str, Field field) {
            this.f39032a = str;
            this.f39033b = field;
            this.f39034c = field.getName();
        }

        abstract void a(C8268a c8268a, int i10, Object[] objArr);

        abstract void b(C8268a c8268a, Object obj);

        abstract void c(C8270c c8270c, Object obj);
    }

    private static final class e extends c {

        /* renamed from: b, reason: collision with root package name */
        private final t5.j f39035b;

        e(t5.j jVar, f fVar) {
            super(fVar);
            this.f39035b = jVar;
        }

        @Override // com.google.gson.internal.bind.i.c
        Object e() {
            return this.f39035b.a();
        }

        @Override // com.google.gson.internal.bind.i.c
        Object f(Object obj) {
            return obj;
        }

        @Override // com.google.gson.internal.bind.i.c
        void g(Object obj, C8268a c8268a, d dVar) {
            dVar.b(c8268a, obj);
        }
    }

    private static class f {

        /* renamed from: c, reason: collision with root package name */
        public static final f f39036c = new f(Collections.emptyMap(), Collections.emptyList());

        /* renamed from: a, reason: collision with root package name */
        public final Map f39037a;

        /* renamed from: b, reason: collision with root package name */
        public final List f39038b;

        public f(Map map, List list) {
            this.f39037a = map;
            this.f39038b = list;
        }
    }

    private static final class g extends c {

        /* renamed from: e, reason: collision with root package name */
        static final Map f39039e = j();

        /* renamed from: b, reason: collision with root package name */
        private final Constructor f39040b;

        /* renamed from: c, reason: collision with root package name */
        private final Object[] f39041c;

        /* renamed from: d, reason: collision with root package name */
        private final Map f39042d;

        g(Class cls, f fVar, boolean z10) throws SecurityException {
            super(fVar);
            this.f39042d = new HashMap();
            Constructor constructorI = AbstractC8192a.i(cls);
            this.f39040b = constructorI;
            if (z10) {
                i.c(null, constructorI);
            } else {
                AbstractC8192a.o(constructorI);
            }
            String[] strArrK = AbstractC8192a.k(cls);
            for (int i10 = 0; i10 < strArrK.length; i10++) {
                this.f39042d.put(strArrK[i10], Integer.valueOf(i10));
            }
            Class<?>[] parameterTypes = this.f39040b.getParameterTypes();
            this.f39041c = new Object[parameterTypes.length];
            for (int i11 = 0; i11 < parameterTypes.length; i11++) {
                this.f39041c[i11] = f39039e.get(parameterTypes[i11]);
            }
        }

        private static Map j() {
            HashMap map = new HashMap();
            map.put(Byte.TYPE, (byte) 0);
            map.put(Short.TYPE, (short) 0);
            map.put(Integer.TYPE, 0);
            map.put(Long.TYPE, 0L);
            map.put(Float.TYPE, Float.valueOf(0.0f));
            map.put(Double.TYPE, Double.valueOf(0.0d));
            map.put(Character.TYPE, (char) 0);
            map.put(Boolean.TYPE, Boolean.FALSE);
            return map;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.gson.internal.bind.i.c
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Object[] e() {
            return (Object[]) this.f39041c.clone();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.gson.internal.bind.i.c
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public Object f(Object[] objArr) {
            try {
                return this.f39040b.newInstance(objArr);
            } catch (IllegalAccessException e10) {
                throw AbstractC8192a.e(e10);
            } catch (IllegalArgumentException e11) {
                e = e11;
                throw new RuntimeException("Failed to invoke constructor '" + AbstractC8192a.c(this.f39040b) + "' with args " + Arrays.toString(objArr), e);
            } catch (InstantiationException e12) {
                e = e12;
                throw new RuntimeException("Failed to invoke constructor '" + AbstractC8192a.c(this.f39040b) + "' with args " + Arrays.toString(objArr), e);
            } catch (InvocationTargetException e13) {
                throw new RuntimeException("Failed to invoke constructor '" + AbstractC8192a.c(this.f39040b) + "' with args " + Arrays.toString(objArr), e13.getCause());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.gson.internal.bind.i.c
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void g(Object[] objArr, C8268a c8268a, d dVar) {
            Integer num = (Integer) this.f39042d.get(dVar.f39034c);
            if (num != null) {
                dVar.a(c8268a, num.intValue(), objArr);
                return;
            }
            throw new IllegalStateException("Could not find the index in the constructor '" + AbstractC8192a.c(this.f39040b) + "' for field with name '" + dVar.f39034c + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
        }
    }

    public i(C8032c c8032c, com.google.gson.c cVar, t5.d dVar, com.google.gson.internal.bind.d dVar2, List list) {
        this.f39018a = c8032c;
        this.f39019b = cVar;
        this.f39020c = dVar;
        this.f39021d = dVar2;
        this.f39022e = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static void c(Object obj, AccessibleObject accessibleObject) {
        if (Modifier.isStatic(((Member) accessibleObject).getModifiers())) {
            obj = null;
        }
        if (m.a(accessibleObject, obj)) {
            return;
        }
        throw new JsonIOException(AbstractC8192a.g(accessibleObject, true) + " is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type.");
    }

    private d d(com.google.gson.e eVar, Field field, Method method, String str, com.google.gson.reflect.a aVar, boolean z10, boolean z11) {
        p kVar;
        boolean zA = t5.l.a(aVar.c());
        int modifiers = field.getModifiers();
        boolean z12 = Modifier.isStatic(modifiers) && Modifier.isFinal(modifiers);
        s5.b bVar = (s5.b) field.getAnnotation(s5.b.class);
        p pVarD = bVar != null ? this.f39021d.d(this.f39018a, eVar, aVar, bVar, false) : null;
        boolean z13 = pVarD != null;
        if (pVarD == null) {
            pVarD = eVar.l(aVar);
        }
        p pVar = pVarD;
        if (z10) {
            kVar = z13 ? pVar : new k(eVar, pVar, aVar.d());
        } else {
            kVar = pVar;
        }
        return new b(str, field, z11, method, kVar, pVar, zA, z12);
    }

    private static IllegalArgumentException e(Class cls, String str, Field field, Field field2) {
        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + str + "'; conflict is caused by fields " + AbstractC8192a.f(field) + " and " + AbstractC8192a.f(field2) + "\nSee " + o.a("duplicate-fields"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x013d A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.google.gson.internal.bind.i.f f(com.google.gson.e r24, com.google.gson.reflect.a r25, java.lang.Class r26, boolean r27, boolean r28) throws java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 365
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.i.f(com.google.gson.e, com.google.gson.reflect.a, java.lang.Class, boolean, boolean):com.google.gson.internal.bind.i$f");
    }

    private List g(Field field) {
        s5.c cVar = (s5.c) field.getAnnotation(s5.c.class);
        if (cVar == null) {
            return Collections.singletonList(this.f39019b.translateName(field));
        }
        String strValue = cVar.value();
        String[] strArrAlternate = cVar.alternate();
        if (strArrAlternate.length == 0) {
            return Collections.singletonList(strValue);
        }
        ArrayList arrayList = new ArrayList(strArrAlternate.length + 1);
        arrayList.add(strValue);
        Collections.addAll(arrayList, strArrAlternate);
        return arrayList;
    }

    private boolean h(Field field, boolean z10) {
        return !this.f39020c.e(field, z10);
    }

    @Override // com.google.gson.q
    public p b(com.google.gson.e eVar, com.google.gson.reflect.a aVar) {
        Class clsC = aVar.c();
        if (!Object.class.isAssignableFrom(clsC)) {
            return null;
        }
        if (AbstractC8192a.l(clsC)) {
            return new a();
        }
        com.google.gson.l lVarB = m.b(this.f39022e, clsC);
        if (lVarB != com.google.gson.l.BLOCK_ALL) {
            boolean z10 = lVarB == com.google.gson.l.BLOCK_INACCESSIBLE;
            return AbstractC8192a.m(clsC) ? new g(clsC, f(eVar, aVar, clsC, z10, true), z10) : new e(this.f39018a.b(aVar), f(eVar, aVar, clsC, z10, false));
        }
        throw new JsonIOException("ReflectionAccessFilter does not permit using reflection for " + clsC + ". Register a TypeAdapter for this type or adjust the access filter.");
    }
}
