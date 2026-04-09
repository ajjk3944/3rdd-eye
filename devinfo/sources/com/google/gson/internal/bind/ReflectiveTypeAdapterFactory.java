package com.google.gson.internal.bind;

import ac.m;
import bf.f;
import com.google.gson.h;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.g;
import com.google.gson.internal.n;
import com.google.gson.j;
import com.google.gson.q;
import com.google.gson.w;
import com.google.gson.x;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import je.u;
import me.t1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ReflectiveTypeAdapterFactory implements x {

    /* renamed from: a, reason: collision with root package name */
    public final f f20776a;

    /* renamed from: b, reason: collision with root package name */
    public final h f20777b;

    /* renamed from: c, reason: collision with root package name */
    public final Excluder f20778c;

    /* renamed from: d, reason: collision with root package name */
    public final JsonAdapterAnnotationTypeAdapterFactory f20779d;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    /* renamed from: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$1, reason: invalid class name */
    class AnonymousClass1 extends w {
        @Override // com.google.gson.w
        public final Object b(yf.b bVar) throws IOException {
            bVar.f0();
            return null;
        }

        @Override // com.google.gson.w
        public final void c(yf.c cVar, Object obj) throws IOException {
            cVar.A();
        }

        public final String toString() {
            return "AnonymousOrNonStaticLocalClassAdapter";
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static abstract class Adapter<T, A> extends w {

        /* renamed from: a, reason: collision with root package name */
        public final d f20780a;

        public Adapter(d dVar) {
            this.f20780a = dVar;
        }

        @Override // com.google.gson.w
        public final Object b(yf.b bVar) throws IOException {
            if (bVar.Z() == 9) {
                bVar.V();
                return null;
            }
            Object objD = d();
            Map map = this.f20780a.f20808a;
            try {
                bVar.e();
                while (bVar.A()) {
                    c cVar = (c) map.get(bVar.T());
                    if (cVar == null) {
                        bVar.f0();
                    } else {
                        f(objD, bVar, cVar);
                    }
                }
                bVar.v();
                return e(objD);
            } catch (IllegalAccessException e2) {
                t1 t1Var = wf.c.f36639a;
                throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.13.2). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e2);
            } catch (IllegalStateException e10) {
                throw new q(e10);
            }
        }

        @Override // com.google.gson.w
        public final void c(yf.c cVar, Object obj) throws IOException {
            if (obj == null) {
                cVar.A();
                return;
            }
            cVar.g();
            try {
                Iterator it = this.f20780a.f20809b.iterator();
                while (it.hasNext()) {
                    ((c) it.next()).a(cVar, obj);
                }
                cVar.v();
            } catch (IllegalAccessException e2) {
                t1 t1Var = wf.c.f36639a;
                throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.13.2). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e2);
            }
        }

        public abstract Object d();

        public abstract Object e(Object obj);

        public abstract void f(Object obj, yf.b bVar, c cVar);
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static final class RecordAdapter<T> extends Adapter<T, Object[]> {

        /* renamed from: e, reason: collision with root package name */
        public static final HashMap f20782e;

        /* renamed from: b, reason: collision with root package name */
        public final Constructor f20783b;

        /* renamed from: c, reason: collision with root package name */
        public final Object[] f20784c;

        /* renamed from: d, reason: collision with root package name */
        public final HashMap f20785d;

        static {
            HashMap map = new HashMap();
            map.put(Byte.TYPE, (byte) 0);
            map.put(Short.TYPE, (short) 0);
            map.put(Integer.TYPE, 0);
            map.put(Long.TYPE, 0L);
            map.put(Float.TYPE, Float.valueOf(0.0f));
            map.put(Double.TYPE, Double.valueOf(0.0d));
            map.put(Character.TYPE, (char) 0);
            map.put(Boolean.TYPE, Boolean.FALSE);
            f20782e = map;
        }

        public RecordAdapter(Class cls, d dVar) {
            super(dVar);
            this.f20785d = new HashMap();
            t1 t1Var = wf.c.f36639a;
            Constructor constructorM = t1Var.m(cls);
            this.f20783b = constructorM;
            wf.c.f(constructorM);
            String[] strArrQ = t1Var.q(cls);
            for (int i4 = 0; i4 < strArrQ.length; i4++) {
                this.f20785d.put(strArrQ[i4], Integer.valueOf(i4));
            }
            Class<?>[] parameterTypes = this.f20783b.getParameterTypes();
            this.f20784c = new Object[parameterTypes.length];
            for (int i10 = 0; i10 < parameterTypes.length; i10++) {
                this.f20784c[i10] = f20782e.get(parameterTypes[i10]);
            }
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public final Object d() {
            return (Object[]) this.f20784c.clone();
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public final Object e(Object obj) {
            Object[] objArr = (Object[]) obj;
            Constructor constructor = this.f20783b;
            try {
                return constructor.newInstance(objArr);
            } catch (IllegalAccessException e2) {
                t1 t1Var = wf.c.f36639a;
                throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.13.2). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e2);
            } catch (IllegalArgumentException e10) {
                e = e10;
                throw new RuntimeException("Failed to invoke constructor '" + wf.c.b(constructor) + "' with args " + Arrays.toString(objArr), e);
            } catch (InstantiationException e11) {
                e = e11;
                throw new RuntimeException("Failed to invoke constructor '" + wf.c.b(constructor) + "' with args " + Arrays.toString(objArr), e);
            } catch (InvocationTargetException e12) {
                throw new RuntimeException("Failed to invoke constructor '" + wf.c.b(constructor) + "' with args " + Arrays.toString(objArr), e12.getCause());
            }
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public final void f(Object obj, yf.b bVar, c cVar) {
            Object[] objArr = (Object[]) obj;
            String str = cVar.f20802c;
            Integer num = (Integer) this.f20785d.get(str);
            if (num == null) {
                throw new IllegalStateException("Could not find the index in the constructor '" + wf.c.b(this.f20783b) + "' for field with name '" + str + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
            }
            int iIntValue = num.intValue();
            Object objB = cVar.f20805f.b(bVar);
            if (objB != null || !cVar.g) {
                objArr[iIntValue] = objB;
            } else {
                StringBuilder sbA = d.h.A("null is not allowed as value for record component '", str, "' of primitive type; at path ");
                sbA.append(bVar.y(false));
                throw new m(sbA.toString());
            }
        }
    }

    public ReflectiveTypeAdapterFactory(f fVar, h hVar, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory) {
        List list = Collections.EMPTY_LIST;
        this.f20776a = fVar;
        this.f20777b = hVar;
        this.f20778c = excluder;
        this.f20779d = jsonAdapterAnnotationTypeAdapterFactory;
    }

    public static void b(Class cls, String str, Field field, Field field2) {
        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + str + "'; conflict is caused by fields " + wf.c.c(field) + " and " + wf.c.c(field2) + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("duplicate-fields"));
    }

    @Override // com.google.gson.x
    public final w a(j jVar, xf.a aVar) {
        Class cls = aVar.f37087a;
        if (!Object.class.isAssignableFrom(cls)) {
            return null;
        }
        t1 t1Var = wf.c.f36639a;
        if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
            return new AnonymousClass1();
        }
        List list = Collections.EMPTY_LIST;
        g.e();
        return wf.c.f36639a.u(cls) ? new RecordAdapter(cls, c(jVar, aVar, cls, true)) : new FieldReflectionAdapter(this.f20776a.f(aVar, true), c(jVar, aVar, cls, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0168  */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.gson.internal.bind.d c(com.google.gson.j r30, xf.a r31, java.lang.Class r32, boolean r33) {
        /*
            Method dump skipped, instructions count: 457
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.c(com.google.gson.j, xf.a, java.lang.Class, boolean):com.google.gson.internal.bind.d");
    }

    public final boolean d(Field field, boolean z3) {
        boolean z10;
        Excluder excluder = this.f20778c;
        excluder.getClass();
        if ((136 & field.getModifiers()) != 0 || field.isSynthetic() || excluder.b(field.getType(), z3)) {
            z10 = true;
        } else {
            List list = z3 ? excluder.f20737a : excluder.f20738b;
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    throw u.o(it);
                }
            }
            z10 = false;
        }
        return !z10;
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static final class FieldReflectionAdapter<T> extends Adapter<T, T> {

        /* renamed from: b, reason: collision with root package name */
        public final n f20781b;

        public FieldReflectionAdapter(n nVar, d dVar) {
            super(dVar);
            this.f20781b = nVar;
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public final Object d() {
            return this.f20781b.b();
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public final void f(Object obj, yf.b bVar, c cVar) throws IllegalAccessException, IllegalArgumentException {
            Field field = cVar.f20801b;
            Object objB = cVar.f20805f.b(bVar);
            if (objB == null && cVar.g) {
                return;
            }
            if (cVar.f20806h) {
                throw new com.google.gson.m(u.t("Cannot set value of 'static final' ", wf.c.d(field, false)));
            }
            field.set(obj, objB);
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public final Object e(Object obj) {
            return obj;
        }
    }
}
