package Gh;

import Zg.AbstractC3682n;
import Zg.AbstractC3689v;
import Zg.U;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.O;
import lh.AbstractC6596a;
import mh.InterfaceC6824a;
import mh.InterfaceC6825b;
import mh.InterfaceC6826c;
import mh.InterfaceC6827d;
import mh.InterfaceC6828e;
import mh.InterfaceC6829f;
import mh.InterfaceC6830g;
import mh.InterfaceC6831h;
import mh.InterfaceC6832i;
import mh.InterfaceC6833j;
import mh.InterfaceC6834k;
import mh.InterfaceC6835l;
import mh.InterfaceC6836m;
import mh.InterfaceC6837n;
import mh.InterfaceC6838o;
import mh.InterfaceC6839p;
import zi.AbstractC8783m;
import zi.InterfaceC8780j;

/* renamed from: Gh.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2914f {

    /* renamed from: a, reason: collision with root package name */
    private static final List f7473a;

    /* renamed from: b, reason: collision with root package name */
    private static final Map f7474b;

    /* renamed from: c, reason: collision with root package name */
    private static final Map f7475c;

    /* renamed from: d, reason: collision with root package name */
    private static final Map f7476d;

    static {
        int i10 = 0;
        List listO = AbstractC3689v.o(O.b(Boolean.TYPE), O.b(Byte.TYPE), O.b(Character.TYPE), O.b(Double.TYPE), O.b(Float.TYPE), O.b(Integer.TYPE), O.b(Long.TYPE), O.b(Short.TYPE));
        f7473a = listO;
        List<th.d> list = listO;
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(list, 10));
        for (th.d dVar : list) {
            arrayList.add(Yg.z.a(AbstractC6596a.c(dVar), AbstractC6596a.d(dVar)));
        }
        f7474b = U.r(arrayList);
        List<th.d> list2 = f7473a;
        ArrayList arrayList2 = new ArrayList(AbstractC3689v.w(list2, 10));
        for (th.d dVar2 : list2) {
            arrayList2.add(Yg.z.a(AbstractC6596a.d(dVar2), AbstractC6596a.c(dVar2)));
        }
        f7475c = U.r(arrayList2);
        List listO2 = AbstractC3689v.o(InterfaceC6824a.class, InterfaceC6835l.class, InterfaceC6839p.class, mh.q.class, mh.r.class, mh.s.class, mh.t.class, mh.u.class, mh.v.class, mh.w.class, InterfaceC6825b.class, InterfaceC6826c.class, InterfaceC6827d.class, InterfaceC6828e.class, InterfaceC6829f.class, InterfaceC6830g.class, InterfaceC6831h.class, InterfaceC6832i.class, InterfaceC6833j.class, InterfaceC6834k.class, InterfaceC6836m.class, InterfaceC6837n.class, InterfaceC6838o.class);
        ArrayList arrayList3 = new ArrayList(AbstractC3689v.w(listO2, 10));
        for (Object obj : listO2) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC3689v.v();
            }
            arrayList3.add(Yg.z.a((Class) obj, Integer.valueOf(i10)));
            i10 = i11;
        }
        f7476d = U.r(arrayList3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ParameterizedType a(ParameterizedType it) {
        AbstractC6492s.i(it, "it");
        Type ownerType = it.getOwnerType();
        if (ownerType instanceof ParameterizedType) {
            return (ParameterizedType) ownerType;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC8780j b(ParameterizedType it) {
        AbstractC6492s.i(it, "it");
        Type[] actualTypeArguments = it.getActualTypeArguments();
        AbstractC6492s.h(actualTypeArguments, "getActualTypeArguments(...)");
        return AbstractC3682n.Q(actualTypeArguments);
    }

    public static final Zh.b e(Class cls) {
        Zh.b bVarE;
        AbstractC6492s.i(cls, "<this>");
        if (cls.isPrimitive()) {
            throw new IllegalArgumentException("Can't compute ClassId for primitive type: " + cls);
        }
        if (cls.isArray()) {
            throw new IllegalArgumentException("Can't compute ClassId for array type: " + cls);
        }
        if (cls.getEnclosingMethod() == null && cls.getEnclosingConstructor() == null) {
            String simpleName = cls.getSimpleName();
            AbstractC6492s.h(simpleName, "getSimpleName(...)");
            if (simpleName.length() != 0) {
                Class<?> declaringClass = cls.getDeclaringClass();
                if (declaringClass != null && (bVarE = e(declaringClass)) != null) {
                    Zh.f fVarH = Zh.f.h(cls.getSimpleName());
                    AbstractC6492s.h(fVarH, "identifier(...)");
                    Zh.b bVarD = bVarE.d(fVarH);
                    if (bVarD != null) {
                        return bVarD;
                    }
                }
                return Zh.b.f25401d.c(new Zh.c(cls.getName()));
            }
        }
        Zh.c cVar = new Zh.c(cls.getName());
        Zh.c cVarE = cVar.e();
        AbstractC6492s.h(cVarE, "parent(...)");
        Zh.c cVarK = Zh.c.k(cVar.g());
        AbstractC6492s.h(cVarK, "topLevel(...)");
        return new Zh.b(cVarE, cVarK, true);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final String f(Class cls) {
        AbstractC6492s.i(cls, "<this>");
        if (!cls.isPrimitive()) {
            if (cls.isArray()) {
                String name = cls.getName();
                AbstractC6492s.h(name, "getName(...)");
                return kotlin.text.t.K(name, '.', '/', false, 4, null);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append('L');
            String name2 = cls.getName();
            AbstractC6492s.h(name2, "getName(...)");
            sb2.append(kotlin.text.t.K(name2, '.', '/', false, 4, null));
            sb2.append(';');
            return sb2.toString();
        }
        String name3 = cls.getName();
        switch (name3.hashCode()) {
            case -1325958191:
                if (name3.equals("double")) {
                    return "D";
                }
                break;
            case 104431:
                if (name3.equals("int")) {
                    return "I";
                }
                break;
            case 3039496:
                if (name3.equals("byte")) {
                    return "B";
                }
                break;
            case 3052374:
                if (name3.equals("char")) {
                    return "C";
                }
                break;
            case 3327612:
                if (name3.equals("long")) {
                    return "J";
                }
                break;
            case 3625364:
                if (name3.equals("void")) {
                    return "V";
                }
                break;
            case 64711720:
                if (name3.equals("boolean")) {
                    return "Z";
                }
                break;
            case 97526364:
                if (name3.equals("float")) {
                    return "F";
                }
                break;
            case 109413500:
                if (name3.equals("short")) {
                    return "S";
                }
                break;
        }
        throw new IllegalArgumentException("Unsupported primitive type: " + cls);
    }

    public static final Integer g(Class cls) {
        AbstractC6492s.i(cls, "<this>");
        return (Integer) f7476d.get(cls);
    }

    public static final List h(Type type) {
        AbstractC6492s.i(type, "<this>");
        if (!(type instanceof ParameterizedType)) {
            return AbstractC3689v.l();
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType.getOwnerType() != null) {
            return AbstractC8783m.Z(AbstractC8783m.H(AbstractC8783m.n(type, C2912d.f7471a), C2913e.f7472a));
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        AbstractC6492s.h(actualTypeArguments, "getActualTypeArguments(...)");
        return AbstractC3682n.d1(actualTypeArguments);
    }

    public static final Class i(Class cls) {
        AbstractC6492s.i(cls, "<this>");
        return (Class) f7474b.get(cls);
    }

    public static final ClassLoader j(Class cls) {
        AbstractC6492s.i(cls, "<this>");
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        AbstractC6492s.h(systemClassLoader, "getSystemClassLoader(...)");
        return systemClassLoader;
    }

    public static final Class k(Class cls) {
        AbstractC6492s.i(cls, "<this>");
        return (Class) f7475c.get(cls);
    }

    public static final boolean l(Class cls) {
        AbstractC6492s.i(cls, "<this>");
        return Enum.class.isAssignableFrom(cls);
    }
}
