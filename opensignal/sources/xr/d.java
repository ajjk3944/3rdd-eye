package xr;

import com.google.android.gms.internal.measurement.e5;
import ir.f0;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final List f25493a;

    /* renamed from: b, reason: collision with root package name */
    public static final Map f25494b;

    /* renamed from: c, reason: collision with root package name */
    public static final Map f25495c;

    /* renamed from: d, reason: collision with root package name */
    public static final Map f25496d;

    static {
        br.y yVar = br.x.f2918a;
        int i10 = 0;
        List<ir.d> listI = e5.I(yVar.b(Boolean.TYPE), yVar.b(Byte.TYPE), yVar.b(Character.TYPE), yVar.b(Double.TYPE), yVar.b(Float.TYPE), yVar.b(Integer.TYPE), yVar.b(Long.TYPE), yVar.b(Short.TYPE));
        f25493a = listI;
        ArrayList arrayList = new ArrayList(mq.p.a0(listI, 10));
        for (ir.d dVar : listI) {
            arrayList.add(new lq.l(f0.E(dVar), f0.F(dVar)));
        }
        f25494b = mq.b0.V(arrayList);
        List<ir.d> list = f25493a;
        ArrayList arrayList2 = new ArrayList(mq.p.a0(list, 10));
        for (ir.d dVar2 : list) {
            arrayList2.add(new lq.l(f0.F(dVar2), f0.E(dVar2)));
        }
        f25495c = mq.b0.V(arrayList2);
        List listI2 = e5.I(ar.a.class, ar.k.class, ar.n.class, ar.o.class, ar.p.class, ar.q.class, ar.r.class, ar.s.class, ar.t.class, ar.u.class, ar.b.class, ar.c.class, lr.e.class, ar.d.class, ar.e.class, ar.f.class, ar.g.class, ar.h.class, ar.i.class, ar.j.class, ar.l.class, ar.m.class, lr.e.class);
        ArrayList arrayList3 = new ArrayList(mq.p.a0(listI2, 10));
        for (Object obj : listI2) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                e5.Q();
                throw null;
            }
            arrayList3.add(new lq.l((Class) obj, Integer.valueOf(i10)));
            i10 = i11;
        }
        f25496d = mq.b0.V(arrayList3);
    }

    public static final qs.b a(Class cls) {
        br.l.e(cls, "<this>");
        if (cls.isPrimitive()) {
            throw new IllegalArgumentException("Can't compute ClassId for primitive type: " + cls);
        }
        if (cls.isArray()) {
            throw new IllegalArgumentException("Can't compute ClassId for array type: " + cls);
        }
        if (cls.getEnclosingMethod() == null && cls.getEnclosingConstructor() == null && cls.getSimpleName().length() != 0) {
            Class<?> declaringClass = cls.getDeclaringClass();
            return declaringClass != null ? a(declaringClass).d(qs.g.e(cls.getSimpleName())) : qs.b.j(new qs.c(cls.getName()));
        }
        qs.c cVar = new qs.c(cls.getName());
        return new qs.b(cVar.e(), qs.c.j(cVar.f()), true);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final String b(Class cls) {
        br.l.e(cls, "<this>");
        if (!cls.isPrimitive()) {
            if (cls.isArray()) {
                return tt.s.k0(cls.getName(), '.', '/');
            }
            return "L" + tt.s.k0(cls.getName(), '.', '/') + ';';
        }
        String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    return "D";
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    return "I";
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    return "B";
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    return "C";
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    return "J";
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    return "V";
                }
                break;
            case 64711720:
                if (name.equals("boolean")) {
                    return "Z";
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    return "F";
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    return "S";
                }
                break;
        }
        throw new IllegalArgumentException("Unsupported primitive type: " + cls);
    }

    public static final List c(Type type) {
        br.l.e(type, "<this>");
        if (!(type instanceof ParameterizedType)) {
            return mq.w.f16945a;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType.getOwnerType() != null) {
            return st.l.d0(new st.g(st.l.a0(type, c.f25487g), c.f25488r, st.n.E));
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        br.l.d(actualTypeArguments, "actualTypeArguments");
        return mq.l.A0(actualTypeArguments);
    }

    public static final ClassLoader d(Class cls) {
        br.l.e(cls, "<this>");
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        br.l.d(systemClassLoader, "getSystemClassLoader()");
        return systemClassLoader;
    }
}
