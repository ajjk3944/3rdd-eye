package t5;

import com.google.gson.JsonIOException;
import f.AbstractC5487d;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import v5.AbstractC8192a;

/* renamed from: t5.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8032c {

    /* renamed from: a, reason: collision with root package name */
    private final Map f61732a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f61733b;

    /* renamed from: c, reason: collision with root package name */
    private final List f61734c;

    /* renamed from: t5.c$a */
    class a implements t5.j {
        a() {
        }

        @Override // t5.j
        public Object a() {
            return new TreeSet();
        }
    }

    /* renamed from: t5.c$b */
    class b implements t5.j {
        b() {
        }

        @Override // t5.j
        public Object a() {
            return new LinkedHashSet();
        }
    }

    /* renamed from: t5.c$c, reason: collision with other inner class name */
    class C2171c implements t5.j {
        C2171c() {
        }

        @Override // t5.j
        public Object a() {
            return new ArrayDeque();
        }
    }

    /* renamed from: t5.c$d */
    class d implements t5.j {
        d() {
        }

        @Override // t5.j
        public Object a() {
            return new ArrayList();
        }
    }

    /* renamed from: t5.c$e */
    class e implements t5.j {
        e() {
        }

        @Override // t5.j
        public Object a() {
            return new ConcurrentSkipListMap();
        }
    }

    /* renamed from: t5.c$f */
    class f implements t5.j {
        f() {
        }

        @Override // t5.j
        public Object a() {
            return new ConcurrentHashMap();
        }
    }

    /* renamed from: t5.c$g */
    class g implements t5.j {
        g() {
        }

        @Override // t5.j
        public Object a() {
            return new TreeMap();
        }
    }

    /* renamed from: t5.c$h */
    class h implements t5.j {
        h() {
        }

        @Override // t5.j
        public Object a() {
            return new LinkedHashMap();
        }
    }

    /* renamed from: t5.c$i */
    class i implements t5.j {
        i() {
        }

        @Override // t5.j
        public Object a() {
            return new t5.h();
        }
    }

    /* renamed from: t5.c$j */
    class j implements t5.j {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Class f61735a;

        j(Class cls) {
            this.f61735a = cls;
        }

        @Override // t5.j
        public Object a() {
            try {
                return t5.p.f61796a.d(this.f61735a);
            } catch (Exception e10) {
                throw new RuntimeException("Unable to create instance of " + this.f61735a + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e10);
            }
        }
    }

    /* renamed from: t5.c$k */
    class k implements t5.j {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f61737a;

        k(String str) {
            this.f61737a = str;
        }

        @Override // t5.j
        public Object a() {
            throw new JsonIOException(this.f61737a);
        }
    }

    /* renamed from: t5.c$l */
    class l implements t5.j {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f61739a;

        l(String str) {
            this.f61739a = str;
        }

        @Override // t5.j
        public Object a() {
            throw new JsonIOException(this.f61739a);
        }
    }

    /* renamed from: t5.c$m */
    class m implements t5.j {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f61741a;

        m(String str) {
            this.f61741a = str;
        }

        @Override // t5.j
        public Object a() {
            throw new JsonIOException(this.f61741a);
        }
    }

    /* renamed from: t5.c$n */
    class n implements t5.j {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Type f61743a;

        n(Type type) {
            this.f61743a = type;
        }

        @Override // t5.j
        public Object a() {
            Type type = this.f61743a;
            if (!(type instanceof ParameterizedType)) {
                throw new JsonIOException("Invalid EnumSet type: " + this.f61743a.toString());
            }
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return EnumSet.noneOf((Class) type2);
            }
            throw new JsonIOException("Invalid EnumSet type: " + this.f61743a.toString());
        }
    }

    /* renamed from: t5.c$o */
    class o implements t5.j {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Type f61744a;

        o(Type type) {
            this.f61744a = type;
        }

        @Override // t5.j
        public Object a() {
            Type type = this.f61744a;
            if (!(type instanceof ParameterizedType)) {
                throw new JsonIOException("Invalid EnumMap type: " + this.f61744a.toString());
            }
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return new EnumMap((Class) type2);
            }
            throw new JsonIOException("Invalid EnumMap type: " + this.f61744a.toString());
        }
    }

    /* renamed from: t5.c$p */
    class p implements t5.j {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f61745a;

        p(String str) {
            this.f61745a = str;
        }

        @Override // t5.j
        public Object a() {
            throw new JsonIOException(this.f61745a);
        }
    }

    /* renamed from: t5.c$q */
    class q implements t5.j {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f61746a;

        q(String str) {
            this.f61746a = str;
        }

        @Override // t5.j
        public Object a() {
            throw new JsonIOException(this.f61746a);
        }
    }

    /* renamed from: t5.c$r */
    class r implements t5.j {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Constructor f61747a;

        r(Constructor constructor) {
            this.f61747a = constructor;
        }

        @Override // t5.j
        public Object a() {
            try {
                return this.f61747a.newInstance(null);
            } catch (IllegalAccessException e10) {
                throw AbstractC8192a.e(e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException("Failed to invoke constructor '" + AbstractC8192a.c(this.f61747a) + "' with no args", e11);
            } catch (InvocationTargetException e12) {
                throw new RuntimeException("Failed to invoke constructor '" + AbstractC8192a.c(this.f61747a) + "' with no args", e12.getCause());
            }
        }
    }

    public C8032c(Map map, boolean z10, List list) {
        this.f61732a = map;
        this.f61733b = z10;
        this.f61734c = list;
    }

    static String a(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: " + cls.getName();
        }
        if (!Modifier.isAbstract(modifiers)) {
            return null;
        }
        return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + t5.o.a("r8-abstract-class");
    }

    private static t5.j c(Class cls, com.google.gson.l lVar) throws NoSuchMethodException, SecurityException {
        String strP;
        if (Modifier.isAbstract(cls.getModifiers())) {
            return null;
        }
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            com.google.gson.l lVar2 = com.google.gson.l.ALLOW;
            if (lVar == lVar2 || (t5.m.a(declaredConstructor, null) && (lVar != com.google.gson.l.BLOCK_ALL || Modifier.isPublic(declaredConstructor.getModifiers())))) {
                return (lVar != lVar2 || (strP = AbstractC8192a.p(declaredConstructor)) == null) ? new r(declaredConstructor) : new q(strP);
            }
            return new p("Unable to invoke no-args constructor of " + cls + "; constructor is not accessible and ReflectionAccessFilter does not permit making it accessible. Register an InstanceCreator or a TypeAdapter for this type, change the visibility of the constructor or adjust the access filter.");
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private static t5.j d(Type type, Class cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            return SortedSet.class.isAssignableFrom(cls) ? new a() : Set.class.isAssignableFrom(cls) ? new b() : Queue.class.isAssignableFrom(cls) ? new C2171c() : new d();
        }
        if (Map.class.isAssignableFrom(cls)) {
            return ConcurrentNavigableMap.class.isAssignableFrom(cls) ? new e() : ConcurrentMap.class.isAssignableFrom(cls) ? new f() : SortedMap.class.isAssignableFrom(cls) ? new g() : (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(com.google.gson.reflect.a.b(((ParameterizedType) type).getActualTypeArguments()[0]).c())) ? new i() : new h();
        }
        return null;
    }

    private static t5.j e(Type type, Class cls) {
        if (EnumSet.class.isAssignableFrom(cls)) {
            return new n(type);
        }
        if (cls == EnumMap.class) {
            return new o(type);
        }
        return null;
    }

    private t5.j f(Class cls) {
        if (this.f61733b) {
            return new j(cls);
        }
        String str = "Unable to create instance of " + cls + "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem.";
        if (cls.getDeclaredConstructors().length == 0) {
            str = str + " Or adjust your R8 configuration to keep the no-args constructor of the class.";
        }
        return new k(str);
    }

    public t5.j b(com.google.gson.reflect.a aVar) throws NoSuchMethodException, SecurityException {
        Type typeD = aVar.d();
        Class clsC = aVar.c();
        AbstractC5487d.a(this.f61732a.get(typeD));
        AbstractC5487d.a(this.f61732a.get(clsC));
        t5.j jVarE = e(typeD, clsC);
        if (jVarE != null) {
            return jVarE;
        }
        com.google.gson.l lVarB = t5.m.b(this.f61734c, clsC);
        t5.j jVarC = c(clsC, lVarB);
        if (jVarC != null) {
            return jVarC;
        }
        t5.j jVarD = d(typeD, clsC);
        if (jVarD != null) {
            return jVarD;
        }
        String strA = a(clsC);
        if (strA != null) {
            return new l(strA);
        }
        if (lVarB == com.google.gson.l.ALLOW) {
            return f(clsC);
        }
        return new m("Unable to create instance of " + clsC + "; ReflectionAccessFilter does not permit using reflection or Unsafe. Register an InstanceCreator or a TypeAdapter for this type or adjust the access filter to allow using reflection.");
    }

    public String toString() {
        return this.f61732a.toString();
    }
}
