package Y6;

import Y6.h;
import Y6.k;
import a7.AbstractC3770c;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* loaded from: classes3.dex */
final class d extends h {

    /* renamed from: d, reason: collision with root package name */
    public static final h.d f24645d = new a();

    /* renamed from: a, reason: collision with root package name */
    private final c f24646a;

    /* renamed from: b, reason: collision with root package name */
    private final b[] f24647b;

    /* renamed from: c, reason: collision with root package name */
    private final k.b f24648c;

    class a implements h.d {
        a() {
        }

        private void b(r rVar, Type type, Map map) throws SecurityException {
            g gVar;
            Class clsG = v.g(type);
            boolean zJ = AbstractC3770c.j(clsG);
            for (Field field : clsG.getDeclaredFields()) {
                if (c(zJ, field.getModifiers()) && ((gVar = (g) field.getAnnotation(g.class)) == null || !gVar.ignore())) {
                    Type typeQ = AbstractC3770c.q(type, clsG, field.getGenericType());
                    Set setK = AbstractC3770c.k(field);
                    String name = field.getName();
                    h hVarF = rVar.f(typeQ, setK, name);
                    field.setAccessible(true);
                    String strM = AbstractC3770c.m(name, gVar);
                    b bVar = new b(strM, field, hVarF);
                    b bVar2 = (b) map.put(strM, bVar);
                    if (bVar2 != null) {
                        throw new IllegalArgumentException("Conflicting fields:\n    " + bVar2.f24650b + "\n    " + bVar.f24650b);
                    }
                }
            }
        }

        private boolean c(boolean z10, int i10) {
            if (Modifier.isStatic(i10) || Modifier.isTransient(i10)) {
                return false;
            }
            return Modifier.isPublic(i10) || Modifier.isProtected(i10) || !z10;
        }

        private void d(Type type, Class cls) {
            Class<?> clsG = v.g(type);
            if (cls.isAssignableFrom(clsG)) {
                throw new IllegalArgumentException("No JsonAdapter for " + type + ", you should probably use " + cls.getSimpleName() + " instead of " + clsG.getSimpleName() + " (Moshi only supports the collection interfaces by default) or else register a custom JsonAdapter.");
            }
        }

        @Override // Y6.h.d
        public h a(Type type, Set set, r rVar) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, SecurityException, ClassNotFoundException, IllegalArgumentException {
            if (!(type instanceof Class) && !(type instanceof ParameterizedType)) {
                return null;
            }
            Class clsG = v.g(type);
            if (clsG.isInterface() || clsG.isEnum() || !set.isEmpty()) {
                return null;
            }
            if (AbstractC3770c.j(clsG)) {
                d(type, List.class);
                d(type, Set.class);
                d(type, Map.class);
                d(type, Collection.class);
                String str = "Platform " + clsG;
                if (type instanceof ParameterizedType) {
                    str = str + " in " + type;
                }
                throw new IllegalArgumentException(str + " requires explicit JsonAdapter to be registered");
            }
            if (clsG.isAnonymousClass()) {
                throw new IllegalArgumentException("Cannot serialize anonymous class " + clsG.getName());
            }
            if (clsG.isLocalClass()) {
                throw new IllegalArgumentException("Cannot serialize local class " + clsG.getName());
            }
            if (clsG.getEnclosingClass() != null && !Modifier.isStatic(clsG.getModifiers())) {
                throw new IllegalArgumentException("Cannot serialize non-static nested class " + clsG.getName());
            }
            if (Modifier.isAbstract(clsG.getModifiers())) {
                throw new IllegalArgumentException("Cannot serialize abstract class " + clsG.getName());
            }
            if (AbstractC3770c.i(clsG)) {
                throw new IllegalArgumentException("Cannot serialize Kotlin type " + clsG.getName() + ". Reflective serialization of Kotlin classes without using kotlin-reflect has undefined and unexpected behavior. Please use KotlinJsonAdapterFactory from the moshi-kotlin artifact or use code gen from the moshi-kotlin-codegen artifact.");
            }
            c cVarA = c.a(clsG);
            TreeMap treeMap = new TreeMap();
            while (type != Object.class) {
                b(rVar, type, treeMap);
                type = v.f(type);
            }
            return new d(cVarA, treeMap).g();
        }
    }

    static class b {

        /* renamed from: a, reason: collision with root package name */
        final String f24649a;

        /* renamed from: b, reason: collision with root package name */
        final Field f24650b;

        /* renamed from: c, reason: collision with root package name */
        final h f24651c;

        b(String str, Field field, h hVar) {
            this.f24649a = str;
            this.f24650b = field;
            this.f24651c = hVar;
        }

        void a(k kVar, Object obj) throws IllegalAccessException, IllegalArgumentException {
            this.f24650b.set(obj, this.f24651c.b(kVar));
        }

        void b(o oVar, Object obj) throws IllegalAccessException, IllegalArgumentException {
            this.f24651c.j(oVar, this.f24650b.get(obj));
        }
    }

    d(c cVar, Map map) {
        this.f24646a = cVar;
        this.f24647b = (b[]) map.values().toArray(new b[map.size()]);
        this.f24648c = k.b.a((String[]) map.keySet().toArray(new String[map.size()]));
    }

    @Override // Y6.h
    public Object b(k kVar) throws IllegalArgumentException {
        try {
            Object objB = this.f24646a.b();
            try {
                kVar.g();
                while (kVar.s()) {
                    int iP0 = kVar.p0(this.f24648c);
                    if (iP0 == -1) {
                        kVar.t0();
                        kVar.u0();
                    } else {
                        this.f24647b[iP0].a(kVar, objB);
                    }
                }
                kVar.j();
                return objB;
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        } catch (IllegalAccessException unused2) {
            throw new AssertionError();
        } catch (InstantiationException e10) {
            throw new RuntimeException(e10);
        } catch (InvocationTargetException e11) {
            throw AbstractC3770c.t(e11);
        }
    }

    @Override // Y6.h
    public void j(o oVar, Object obj) throws IllegalArgumentException {
        try {
            oVar.h();
            for (b bVar : this.f24647b) {
                oVar.J(bVar.f24649a);
                bVar.b(oVar, obj);
            }
            oVar.v();
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        }
    }

    public String toString() {
        return "JsonAdapter(" + this.f24646a + ")";
    }
}
