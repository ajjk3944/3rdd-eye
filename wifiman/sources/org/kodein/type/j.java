package org.kodein.type;

import Zg.AbstractC3682n;
import Zg.AbstractC3689v;
import Zg.Q;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public abstract class j {
    private static final boolean a(Type[] typeArr, Type[] typeArr2) {
        if (typeArr.length != typeArr2.length) {
            return false;
        }
        Iterable iterableC0 = AbstractC3682n.c0(typeArr);
        if (!(iterableC0 instanceof Collection) || !((Collection) iterableC0).isEmpty()) {
            Iterator it = iterableC0.iterator();
            while (it.hasNext()) {
                int iD = ((Q) it).d();
                if (!l(typeArr[iD], typeArr2[iD])) {
                    return false;
                }
            }
        }
        return true;
    }

    private static final Type[] b(ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        AbstractC6492s.h(actualTypeArguments, "actualTypeArguments");
        ArrayList arrayList = new ArrayList(actualTypeArguments.length);
        for (Type type : actualTypeArguments) {
            if (type instanceof WildcardType) {
                Type[] upperBounds = ((WildcardType) type).getUpperBounds();
                AbstractC6492s.h(upperBounds, "it.upperBounds");
                type = (Type) AbstractC3682n.a0(upperBounds);
                if (type == null) {
                    type = Object.class;
                }
            }
            arrayList.add(type);
        }
        return (Type[]) arrayList.toArray(new Type[0]);
    }

    public static final Type c(Class cls) {
        Type typeD;
        AbstractC6492s.i(cls, "<this>");
        Type genericSuperclass = cls.getGenericSuperclass();
        if (genericSuperclass == null) {
            return cls.getSuperclass();
        }
        if (!(genericSuperclass instanceof ParameterizedType)) {
            return genericSuperclass;
        }
        ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
        Class clsF = f(parameterizedType);
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        AbstractC6492s.h(actualTypeArguments, "parent.actualTypeArguments");
        ArrayList arrayList = new ArrayList(actualTypeArguments.length);
        for (Type type : actualTypeArguments) {
            TypeVariable typeVariable = type instanceof TypeVariable ? (TypeVariable) type : null;
            if (typeVariable != null && (typeD = d(typeVariable)) != null) {
                type = typeD;
            }
            arrayList.add(type);
        }
        return new l(clsF, (Type[]) arrayList.toArray(new Type[0]), parameterizedType.getOwnerType());
    }

    public static final Type d(TypeVariable typeVariable) {
        Type typeD;
        AbstractC6492s.i(typeVariable, "<this>");
        Type type = typeVariable.getBounds()[0];
        TypeVariable typeVariable2 = type instanceof TypeVariable ? (TypeVariable) type : null;
        if (typeVariable2 != null && (typeD = d(typeVariable2)) != null) {
            return typeD;
        }
        Type type2 = typeVariable.getBounds()[0];
        AbstractC6492s.h(type2, "bounds[0]");
        return type2;
    }

    public static final Type e(q qVar) {
        AbstractC6492s.i(qVar, "<this>");
        if (qVar instanceof i) {
            return ((i) qVar).e();
        }
        throw new IllegalStateException(qVar.getClass().getSimpleName() + " is not a JVM Type Token");
    }

    public static final Class f(ParameterizedType parameterizedType) {
        AbstractC6492s.i(parameterizedType, "<this>");
        Type rawType = parameterizedType.getRawType();
        AbstractC6492s.g(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
        return (Class) rawType;
    }

    public static final Class g(Class cls) throws ClassNotFoundException {
        String str;
        AbstractC6492s.i(cls, "<this>");
        if (!cls.isPrimitive()) {
            str = "[L" + cls.getName() + ';';
        } else if (AbstractC6492s.d(cls, Boolean.TYPE)) {
            str = "[Z";
        } else if (AbstractC6492s.d(cls, Byte.TYPE)) {
            str = "[B";
        } else if (AbstractC6492s.d(cls, Character.TYPE)) {
            str = "[C";
        } else if (AbstractC6492s.d(cls, Short.TYPE)) {
            str = "[S";
        } else if (AbstractC6492s.d(cls, Integer.TYPE)) {
            str = "[I";
        } else if (AbstractC6492s.d(cls, Long.TYPE)) {
            str = "[J";
        } else if (AbstractC6492s.d(cls, Float.TYPE)) {
            str = "[F";
        } else {
            if (!AbstractC6492s.d(cls, Double.TYPE)) {
                throw new IllegalStateException(("Unknown primitive type " + cls).toString());
            }
            str = "[D";
        }
        Class<?> cls2 = Class.forName(str);
        AbstractC6492s.h(cls2, "forName(descriptor)");
        return cls2;
    }

    public static final Type h(Type type) {
        return type instanceof ParameterizedType ? l.f56958d.a((ParameterizedType) type) : type instanceof GenericArrayType ? c.f56946b.a(type) : type;
    }

    public static final Type i(ParameterizedType parameterizedType, Type parent, ParameterizedType parameterizedType2, Type[] typeArr) {
        Class clsF;
        Integer num;
        AbstractC6492s.i(parameterizedType, "<this>");
        AbstractC6492s.i(parent, "parent");
        if (!(parent instanceof ParameterizedType)) {
            return parent;
        }
        ParameterizedType parameterizedType3 = parameterizedType2 == null ? parameterizedType : parameterizedType2;
        if (parameterizedType2 == null || (clsF = f(parameterizedType2)) == null) {
            clsF = f(parameterizedType);
        }
        if (typeArr == null) {
            typeArr = parameterizedType.getActualTypeArguments();
        }
        ParameterizedType parameterizedType4 = (ParameterizedType) parent;
        Class clsF2 = f(parameterizedType4);
        List listC = AbstractC3689v.c();
        Type[] actualTypeArguments = parameterizedType4.getActualTypeArguments();
        AbstractC6492s.h(actualTypeArguments, "parent.actualTypeArguments");
        for (Type arg : actualTypeArguments) {
            if (arg instanceof TypeVariable) {
                TypeVariable[] typeParameters = clsF.getTypeParameters();
                AbstractC6492s.h(typeParameters, "_originRawClass.typeParameters");
                AbstractC6492s.h(arg, "arg");
                Integer numValueOf = Integer.valueOf(AbstractC3682n.m0(typeParameters, arg));
                num = numValueOf.intValue() >= 0 ? numValueOf : null;
                if (num != null) {
                    listC.add(h(typeArr[num.intValue()]));
                }
            } else if (arg instanceof WildcardType) {
                Type type = ((WildcardType) arg).getUpperBounds()[0];
                if (type != null) {
                    AbstractC6492s.h(type, "arg.upperBounds[0]");
                    if (type instanceof ParameterizedType) {
                        listC.add(i((ParameterizedType) type, type, parameterizedType3, typeArr));
                    } else if (type instanceof TypeVariable) {
                        TypeVariable[] typeParameters2 = clsF.getTypeParameters();
                        AbstractC6492s.h(typeParameters2, "_originRawClass.typeParameters");
                        Integer numValueOf2 = Integer.valueOf(AbstractC3682n.m0(typeParameters2, type));
                        num = numValueOf2.intValue() >= 0 ? numValueOf2 : null;
                        if (num != null) {
                            listC.add(h(typeArr[num.intValue()]));
                        }
                    }
                }
            } else if (arg instanceof ParameterizedType) {
                AbstractC6492s.h(arg, "arg");
                listC.add(i((ParameterizedType) arg, arg, parameterizedType3, typeArr));
            } else {
                listC.add(h(arg));
            }
        }
        return new l(clsF2, (Type[]) AbstractC3689v.a(listC).toArray(new Type[0]), h(parameterizedType4.getOwnerType()));
    }

    public static /* synthetic */ Type j(ParameterizedType parameterizedType, Type type, ParameterizedType parameterizedType2, Type[] typeArr, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            parameterizedType2 = null;
        }
        if ((i10 & 4) != 0) {
            typeArr = null;
        }
        return i(parameterizedType, type, parameterizedType2, typeArr);
    }

    public static final Type k(Type type) {
        AbstractC6492s.i(type, "<this>");
        if (!(type instanceof ParameterizedType)) {
            return type;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        Class clsF = f(parameterizedType);
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        AbstractC6492s.h(actualTypeArguments, "actualTypeArguments");
        ArrayList arrayList = new ArrayList(actualTypeArguments.length);
        for (Type type2 : actualTypeArguments) {
            arrayList.add(type2 instanceof TypeVariable ? Object.class : h(type2));
        }
        return new l(clsF, (Type[]) arrayList.toArray(new Type[0]), h(parameterizedType.getOwnerType()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0058, code lost:
    
        if (a(b(r5), b(r6)) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009f, code lost:
    
        if (a(r5, r6) != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean l(java.lang.reflect.Type r5, java.lang.reflect.Type r6) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.AbstractC6492s.i(r5, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.AbstractC6492s.i(r6, r0)
            boolean r0 = r5 instanceof java.lang.Class
            if (r0 == 0) goto L15
            boolean r5 = kotlin.jvm.internal.AbstractC6492s.d(r5, r6)
            goto Lf2
        L15:
            boolean r0 = r5 instanceof java.lang.reflect.ParameterizedType
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L60
            boolean r0 = r6 instanceof java.lang.reflect.ParameterizedType
            if (r0 != 0) goto L20
            return r2
        L20:
            java.lang.reflect.ParameterizedType r5 = (java.lang.reflect.ParameterizedType) r5
            java.lang.Class r0 = f(r5)
            java.lang.reflect.ParameterizedType r6 = (java.lang.reflect.ParameterizedType) r6
            java.lang.Class r3 = f(r6)
            boolean r0 = l(r0, r3)
            if (r0 == 0) goto L5d
            java.lang.reflect.Type[] r0 = r5.getActualTypeArguments()
            java.lang.String r3 = "actualTypeArguments"
            kotlin.jvm.internal.AbstractC6492s.h(r0, r3)
            java.lang.reflect.Type[] r3 = r6.getActualTypeArguments()
            java.lang.String r4 = "other.actualTypeArguments"
            kotlin.jvm.internal.AbstractC6492s.h(r3, r4)
            boolean r0 = a(r0, r3)
            if (r0 != 0) goto L5a
            java.lang.reflect.Type[] r5 = b(r5)
            java.lang.reflect.Type[] r6 = b(r6)
            boolean r5 = a(r5, r6)
            if (r5 == 0) goto L5d
        L5a:
            r5 = r1
            goto Lf2
        L5d:
            r5 = r2
            goto Lf2
        L60:
            boolean r0 = r5 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto La2
            boolean r0 = r6 instanceof java.lang.reflect.WildcardType
            if (r0 != 0) goto L69
            return r2
        L69:
            java.lang.reflect.WildcardType r5 = (java.lang.reflect.WildcardType) r5
            java.lang.reflect.Type[] r0 = r5.getLowerBounds()
            java.lang.String r3 = "lowerBounds"
            kotlin.jvm.internal.AbstractC6492s.h(r0, r3)
            java.lang.reflect.WildcardType r6 = (java.lang.reflect.WildcardType) r6
            java.lang.reflect.Type[] r3 = r6.getLowerBounds()
            java.lang.String r4 = "other.lowerBounds"
            kotlin.jvm.internal.AbstractC6492s.h(r3, r4)
            boolean r0 = a(r0, r3)
            if (r0 == 0) goto L5d
            java.lang.reflect.Type[] r5 = r5.getUpperBounds()
            java.lang.String r0 = "upperBounds"
            kotlin.jvm.internal.AbstractC6492s.h(r5, r0)
            java.lang.reflect.Type[] r6 = r6.getUpperBounds()
            java.lang.String r0 = "other.upperBounds"
            kotlin.jvm.internal.AbstractC6492s.h(r6, r0)
            boolean r5 = a(r5, r6)
            if (r5 == 0) goto L5d
            goto L5a
        La2:
            boolean r0 = r5 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto Lc8
            boolean r0 = r6 instanceof java.lang.reflect.GenericArrayType
            if (r0 != 0) goto Lab
            return r2
        Lab:
            java.lang.reflect.GenericArrayType r5 = (java.lang.reflect.GenericArrayType) r5
            java.lang.reflect.Type r5 = r5.getGenericComponentType()
            java.lang.String r0 = "genericComponentType"
            kotlin.jvm.internal.AbstractC6492s.h(r5, r0)
            java.lang.reflect.GenericArrayType r6 = (java.lang.reflect.GenericArrayType) r6
            java.lang.reflect.Type r6 = r6.getGenericComponentType()
            java.lang.String r0 = "other.genericComponentType"
            kotlin.jvm.internal.AbstractC6492s.h(r6, r0)
            boolean r5 = l(r5, r6)
            goto Lf2
        Lc8:
            boolean r0 = r5 instanceof java.lang.reflect.TypeVariable
            if (r0 == 0) goto Lee
            boolean r0 = r6 instanceof java.lang.reflect.TypeVariable
            if (r0 != 0) goto Ld1
            return r2
        Ld1:
            java.lang.reflect.TypeVariable r5 = (java.lang.reflect.TypeVariable) r5
            java.lang.reflect.Type[] r5 = r5.getBounds()
            java.lang.String r0 = "bounds"
            kotlin.jvm.internal.AbstractC6492s.h(r5, r0)
            java.lang.reflect.TypeVariable r6 = (java.lang.reflect.TypeVariable) r6
            java.lang.reflect.Type[] r6 = r6.getBounds()
            java.lang.String r0 = "other.bounds"
            kotlin.jvm.internal.AbstractC6492s.h(r6, r0)
            boolean r5 = a(r5, r6)
            goto Lf2
        Lee:
            boolean r5 = kotlin.jvm.internal.AbstractC6492s.d(r5, r6)
        Lf2:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: org.kodein.type.j.l(java.lang.reflect.Type, java.lang.reflect.Type):boolean");
    }

    public static final int m(Type type) {
        int iM;
        AbstractC6492s.i(type, "<this>");
        if (type instanceof Class) {
            return type.hashCode();
        }
        int i10 = 0;
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            AbstractC6492s.h(actualTypeArguments, "actualTypeArguments");
            int iM2 = m(f(parameterizedType));
            int length = actualTypeArguments.length;
            while (i10 < length) {
                Type arg = actualTypeArguments[i10];
                AbstractC6492s.h(arg, "arg");
                iM2 = (iM2 * 31) + m(arg);
                i10++;
            }
            return iM2;
        }
        if (type instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) type;
            Type[] upperBounds = wildcardType.getUpperBounds();
            AbstractC6492s.h(upperBounds, "this.upperBounds");
            Type[] lowerBounds = wildcardType.getLowerBounds();
            AbstractC6492s.h(lowerBounds, "this.lowerBounds");
            Object[] objArrE = AbstractC3682n.E(upperBounds, lowerBounds);
            int length2 = objArrE.length;
            iM = 17;
            while (i10 < length2) {
                Type arg2 = (Type) objArrE[i10];
                AbstractC6492s.h(arg2, "arg");
                iM = (iM * 19) + m(arg2);
                i10++;
            }
        } else {
            if (type instanceof GenericArrayType) {
                Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
                AbstractC6492s.h(genericComponentType, "this.genericComponentType");
                return m(genericComponentType) + 53;
            }
            if (!(type instanceof TypeVariable)) {
                return type.hashCode();
            }
            Type[] bounds = ((TypeVariable) type).getBounds();
            AbstractC6492s.h(bounds, "bounds");
            int length3 = bounds.length;
            iM = 23;
            while (i10 < length3) {
                Type arg3 = bounds[i10];
                AbstractC6492s.h(arg3, "arg");
                iM = (iM * 29) + m(arg3);
                i10++;
            }
        }
        return iM;
    }
}
