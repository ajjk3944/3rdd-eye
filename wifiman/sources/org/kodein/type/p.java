package org.kodein.type;

import Zg.AbstractC3682n;
import Zg.AbstractC3689v;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
abstract class p {
    public static /* synthetic */ String c(p pVar, Type type, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dispString");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return pVar.b(type, z10);
    }

    public abstract String a(Class cls, boolean z10);

    public final String b(Type type, boolean z10) {
        String strC;
        AbstractC6492s.i(type, "type");
        if (type instanceof Class) {
            return a((Class) type, z10);
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            TypeVariable[] typeParameters = j.f(parameterizedType).getTypeParameters();
            AbstractC6492s.h(typeParameters, "type.rawClass.typeParameters");
            ArrayList arrayList = new ArrayList(typeParameters.length);
            int length = typeParameters.length;
            int i10 = 0;
            int i11 = 0;
            while (i10 < length) {
                TypeVariable typeVariable = typeParameters[i10];
                int i12 = i11 + 1;
                Type argument = parameterizedType.getActualTypeArguments()[i11];
                if (argument instanceof WildcardType) {
                    Type[] bounds = typeVariable.getBounds();
                    AbstractC6492s.h(bounds, "variable.bounds");
                    for (Type type2 : bounds) {
                        Type[] upperBounds = ((WildcardType) argument).getUpperBounds();
                        AbstractC6492s.h(upperBounds, "argument.upperBounds");
                        if (AbstractC3682n.U(upperBounds, type2)) {
                            strC = "*";
                            break;
                        }
                    }
                    AbstractC6492s.h(argument, "argument");
                    strC = c(this, argument, false, 2, null);
                } else {
                    AbstractC6492s.h(argument, "argument");
                    strC = c(this, argument, false, 2, null);
                }
                arrayList.add(strC);
                i10++;
                i11 = i12;
            }
            return b(j.f(parameterizedType), true) + '<' + AbstractC3689v.z0(arrayList, ", ", null, null, 0, null, null, 62, null) + '>';
        }
        if (!(type instanceof WildcardType)) {
            if (type instanceof GenericArrayType) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(d());
                sb2.append('<');
                Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
                AbstractC6492s.h(genericComponentType, "type.genericComponentType");
                sb2.append(c(this, genericComponentType, false, 2, null));
                sb2.append('>');
                return sb2.toString();
            }
            if (type instanceof TypeVariable) {
                String name = ((TypeVariable) type).getName();
                AbstractC6492s.h(name, "type.name");
                return name;
            }
            throw new IllegalStateException("Unknown type " + getClass());
        }
        WildcardType wildcardType = (WildcardType) type;
        Type[] lowerBounds = wildcardType.getLowerBounds();
        AbstractC6492s.h(lowerBounds, "type.lowerBounds");
        if (!(lowerBounds.length == 0)) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("in ");
            Type type3 = wildcardType.getLowerBounds()[0];
            AbstractC6492s.h(type3, "type.lowerBounds[0]");
            sb3.append(c(this, type3, false, 2, null));
            return sb3.toString();
        }
        Type[] upperBounds2 = wildcardType.getUpperBounds();
        AbstractC6492s.h(upperBounds2, "type.upperBounds");
        if ((upperBounds2.length == 0) || AbstractC6492s.d(wildcardType.getUpperBounds()[0], Object.class)) {
            return "*";
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append("out ");
        Type type4 = wildcardType.getUpperBounds()[0];
        AbstractC6492s.h(type4, "type.upperBounds[0]");
        sb4.append(c(this, type4, false, 2, null));
        return sb4.toString();
    }

    public abstract String d();
}
