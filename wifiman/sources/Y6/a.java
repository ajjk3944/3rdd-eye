package Y6;

import Y6.h;
import Y6.k;
import a7.AbstractC3770c;
import com.squareup.moshi.JsonDataException;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
final class a implements h.d {

    /* renamed from: a, reason: collision with root package name */
    private final List f24606a;

    /* renamed from: b, reason: collision with root package name */
    private final List f24607b;

    /* renamed from: Y6.a$a, reason: collision with other inner class name */
    class C0939a extends h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f24608a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ h f24609b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ r f24610c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ f f24611d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Set f24612e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Type f24613f;

        C0939a(f fVar, h hVar, r rVar, f fVar2, Set set, Type type) {
            this.f24608a = fVar;
            this.f24609b = hVar;
            this.f24610c = rVar;
            this.f24611d = fVar2;
            this.f24612e = set;
            this.f24613f = type;
        }

        @Override // Y6.h
        public Object b(k kVar) throws IOException {
            f fVar = this.f24611d;
            if (fVar == null) {
                return this.f24609b.b(kVar);
            }
            if (!fVar.f24631g && kVar.d0() == k.c.NULL) {
                kVar.T();
                return null;
            }
            try {
                return this.f24611d.b(this.f24610c, kVar);
            } catch (InvocationTargetException e10) {
                Throwable cause = e10.getCause();
                if (cause instanceof IOException) {
                    throw ((IOException) cause);
                }
                throw new JsonDataException(cause + " at " + kVar.getPath(), cause);
            }
        }

        @Override // Y6.h
        public void j(o oVar, Object obj) throws IOException {
            f fVar = this.f24608a;
            if (fVar == null) {
                this.f24609b.j(oVar, obj);
                return;
            }
            if (!fVar.f24631g && obj == null) {
                oVar.P();
                return;
            }
            try {
                fVar.e(this.f24610c, oVar, obj);
            } catch (InvocationTargetException e10) {
                Throwable cause = e10.getCause();
                if (cause instanceof IOException) {
                    throw ((IOException) cause);
                }
                throw new JsonDataException(cause + " at " + oVar.getPath(), cause);
            }
        }

        public String toString() {
            return "JsonAdapter" + this.f24612e + "(" + this.f24613f + ")";
        }
    }

    class b extends f {
        b(Type type, Set set, Object obj, Method method, int i10, int i11, boolean z10) {
            super(type, set, obj, method, i10, i11, z10);
        }

        @Override // Y6.a.f
        public void e(r rVar, o oVar, Object obj) {
            d(oVar, obj);
        }
    }

    class c extends f {

        /* renamed from: h, reason: collision with root package name */
        private h f24615h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Type[] f24616i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Type f24617j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Set f24618k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Set f24619l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Type type, Set set, Object obj, Method method, int i10, int i11, boolean z10, Type[] typeArr, Type type2, Set set2, Set set3) {
            super(type, set, obj, method, i10, i11, z10);
            this.f24616i = typeArr;
            this.f24617j = type2;
            this.f24618k = set2;
            this.f24619l = set3;
        }

        @Override // Y6.a.f
        public void a(r rVar, h.d dVar) {
            super.a(rVar, dVar);
            this.f24615h = (v.d(this.f24616i[0], this.f24617j) && this.f24618k.equals(this.f24619l)) ? rVar.h(dVar, this.f24617j, this.f24619l) : rVar.e(this.f24617j, this.f24619l);
        }

        @Override // Y6.a.f
        public void e(r rVar, o oVar, Object obj) {
            this.f24615h.j(oVar, c(obj));
        }
    }

    class d extends f {
        d(Type type, Set set, Object obj, Method method, int i10, int i11, boolean z10) {
            super(type, set, obj, method, i10, i11, z10);
        }

        @Override // Y6.a.f
        public Object b(r rVar, k kVar) {
            return c(kVar);
        }
    }

    class e extends f {

        /* renamed from: h, reason: collision with root package name */
        h f24620h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Type[] f24621i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Type f24622j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Set f24623k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Set f24624l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Type type, Set set, Object obj, Method method, int i10, int i11, boolean z10, Type[] typeArr, Type type2, Set set2, Set set3) {
            super(type, set, obj, method, i10, i11, z10);
            this.f24621i = typeArr;
            this.f24622j = type2;
            this.f24623k = set2;
            this.f24624l = set3;
        }

        @Override // Y6.a.f
        public void a(r rVar, h.d dVar) {
            super.a(rVar, dVar);
            this.f24620h = (v.d(this.f24621i[0], this.f24622j) && this.f24623k.equals(this.f24624l)) ? rVar.h(dVar, this.f24621i[0], this.f24623k) : rVar.e(this.f24621i[0], this.f24623k);
        }

        @Override // Y6.a.f
        public Object b(r rVar, k kVar) {
            return c(this.f24620h.b(kVar));
        }
    }

    static abstract class f {

        /* renamed from: a, reason: collision with root package name */
        final Type f24625a;

        /* renamed from: b, reason: collision with root package name */
        final Set f24626b;

        /* renamed from: c, reason: collision with root package name */
        final Object f24627c;

        /* renamed from: d, reason: collision with root package name */
        final Method f24628d;

        /* renamed from: e, reason: collision with root package name */
        final int f24629e;

        /* renamed from: f, reason: collision with root package name */
        final h[] f24630f;

        /* renamed from: g, reason: collision with root package name */
        final boolean f24631g;

        f(Type type, Set set, Object obj, Method method, int i10, int i11, boolean z10) {
            this.f24625a = AbstractC3770c.a(type);
            this.f24626b = set;
            this.f24627c = obj;
            this.f24628d = method;
            this.f24629e = i11;
            this.f24630f = new h[i10 - i11];
            this.f24631g = z10;
        }

        public void a(r rVar, h.d dVar) {
            if (this.f24630f.length > 0) {
                Type[] genericParameterTypes = this.f24628d.getGenericParameterTypes();
                Annotation[][] parameterAnnotations = this.f24628d.getParameterAnnotations();
                int length = genericParameterTypes.length;
                for (int i10 = this.f24629e; i10 < length; i10++) {
                    Type type = ((ParameterizedType) genericParameterTypes[i10]).getActualTypeArguments()[0];
                    Set setL = AbstractC3770c.l(parameterAnnotations[i10]);
                    this.f24630f[i10 - this.f24629e] = (v.d(this.f24625a, type) && this.f24626b.equals(setL)) ? rVar.h(dVar, type, setL) : rVar.e(type, setL);
                }
            }
        }

        public Object b(r rVar, k kVar) {
            throw new AssertionError();
        }

        protected Object c(Object obj) {
            h[] hVarArr = this.f24630f;
            Object[] objArr = new Object[hVarArr.length + 1];
            objArr[0] = obj;
            System.arraycopy(hVarArr, 0, objArr, 1, hVarArr.length);
            try {
                return this.f24628d.invoke(this.f24627c, objArr);
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        }

        protected Object d(Object obj, Object obj2) {
            h[] hVarArr = this.f24630f;
            Object[] objArr = new Object[hVarArr.length + 2];
            objArr[0] = obj;
            objArr[1] = obj2;
            System.arraycopy(hVarArr, 0, objArr, 2, hVarArr.length);
            try {
                return this.f24628d.invoke(this.f24627c, objArr);
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        }

        public void e(r rVar, o oVar, Object obj) {
            throw new AssertionError();
        }
    }

    a(List list, List list2) {
        this.f24606a = list;
        this.f24607b = list2;
    }

    static f b(Object obj, Method method) throws SecurityException {
        method.setAccessible(true);
        Type genericReturnType = method.getGenericReturnType();
        Set setK = AbstractC3770c.k(method);
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        if (genericParameterTypes.length >= 1 && genericParameterTypes[0] == k.class && genericReturnType != Void.TYPE && e(1, genericParameterTypes)) {
            return new d(genericReturnType, setK, obj, method, genericParameterTypes.length, 1, true);
        }
        if (genericParameterTypes.length == 1 && genericReturnType != Void.TYPE) {
            return new e(genericReturnType, setK, obj, method, genericParameterTypes.length, 1, AbstractC3770c.f(parameterAnnotations[0]), genericParameterTypes, genericReturnType, AbstractC3770c.l(parameterAnnotations[0]), setK);
        }
        throw new IllegalArgumentException("Unexpected signature for " + method + ".\n@FromJson method signatures may have one of the following structures:\n    <any access modifier> R fromJson(JsonReader jsonReader) throws <any>;\n    <any access modifier> R fromJson(JsonReader jsonReader, JsonAdapter<any> delegate, <any more delegates>) throws <any>;\n    <any access modifier> R fromJson(T value) throws <any>;\n");
    }

    private static f c(List list, Type type, Set set) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            f fVar = (f) list.get(i10);
            if (v.d(fVar.f24625a, type) && fVar.f24626b.equals(set)) {
                return fVar;
            }
        }
        return null;
    }

    public static a d(Object obj) throws SecurityException {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Class<?> superclass = obj.getClass(); superclass != Object.class; superclass = superclass.getSuperclass()) {
            for (Method method : superclass.getDeclaredMethods()) {
                if (method.isAnnotationPresent(u.class)) {
                    f fVarF = f(obj, method);
                    f fVarC = c(arrayList, fVarF.f24625a, fVarF.f24626b);
                    if (fVarC != null) {
                        throw new IllegalArgumentException("Conflicting @ToJson methods:\n    " + fVarC.f24628d + "\n    " + fVarF.f24628d);
                    }
                    arrayList.add(fVarF);
                }
                if (method.isAnnotationPresent(Y6.f.class)) {
                    f fVarB = b(obj, method);
                    f fVarC2 = c(arrayList2, fVarB.f24625a, fVarB.f24626b);
                    if (fVarC2 != null) {
                        throw new IllegalArgumentException("Conflicting @FromJson methods:\n    " + fVarC2.f24628d + "\n    " + fVarB.f24628d);
                    }
                    arrayList2.add(fVarB);
                }
            }
        }
        if (!arrayList.isEmpty() || !arrayList2.isEmpty()) {
            return new a(arrayList, arrayList2);
        }
        throw new IllegalArgumentException("Expected at least one @ToJson or @FromJson method on " + obj.getClass().getName());
    }

    private static boolean e(int i10, Type[] typeArr) {
        int length = typeArr.length;
        while (i10 < length) {
            Type type = typeArr[i10];
            if (!(type instanceof ParameterizedType) || ((ParameterizedType) type).getRawType() != h.class) {
                return false;
            }
            i10++;
        }
        return true;
    }

    static f f(Object obj, Method method) throws SecurityException {
        method.setAccessible(true);
        Type genericReturnType = method.getGenericReturnType();
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        if (genericParameterTypes.length >= 2 && genericParameterTypes[0] == o.class && genericReturnType == Void.TYPE && e(2, genericParameterTypes)) {
            return new b(genericParameterTypes[1], AbstractC3770c.l(parameterAnnotations[1]), obj, method, genericParameterTypes.length, 2, true);
        }
        if (genericParameterTypes.length == 1 && genericReturnType != Void.TYPE) {
            Set setK = AbstractC3770c.k(method);
            Set setL = AbstractC3770c.l(parameterAnnotations[0]);
            return new c(genericParameterTypes[0], setL, obj, method, genericParameterTypes.length, 1, AbstractC3770c.f(parameterAnnotations[0]), genericParameterTypes, genericReturnType, setL, setK);
        }
        throw new IllegalArgumentException("Unexpected signature for " + method + ".\n@ToJson method signatures may have one of the following structures:\n    <any access modifier> void toJson(JsonWriter writer, T value) throws <any>;\n    <any access modifier> void toJson(JsonWriter writer, T value, JsonAdapter<any> delegate, <any more delegates>) throws <any>;\n    <any access modifier> R toJson(T value) throws <any>;\n");
    }

    @Override // Y6.h.d
    public h a(Type type, Set set, r rVar) {
        f fVarC = c(this.f24606a, type, set);
        f fVarC2 = c(this.f24607b, type, set);
        h hVarH = null;
        if (fVarC == null && fVarC2 == null) {
            return null;
        }
        if (fVarC == null || fVarC2 == null) {
            try {
                hVarH = rVar.h(this, type, set);
            } catch (IllegalArgumentException e10) {
                throw new IllegalArgumentException("No " + (fVarC == null ? "@ToJson" : "@FromJson") + " adapter for " + AbstractC3770c.u(type, set), e10);
            }
        }
        h hVar = hVarH;
        if (fVarC != null) {
            fVarC.a(rVar, this);
        }
        if (fVarC2 != null) {
            fVarC2.a(rVar, this);
        }
        return new C0939a(fVarC, hVar, rVar, fVarC2, set, type);
    }
}
