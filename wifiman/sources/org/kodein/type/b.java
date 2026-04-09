package org.kodein.type;

import Zg.AbstractC3682n;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.text.t;

/* loaded from: classes3.dex */
public abstract class b {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String d(Class cls) {
        if (AbstractC6492s.d(cls, Boolean.TYPE) ? true : AbstractC6492s.d(cls, Boolean.class)) {
            return "Boolean";
        }
        if (AbstractC6492s.d(cls, Byte.TYPE) ? true : AbstractC6492s.d(cls, Byte.class)) {
            return "Byte";
        }
        if (AbstractC6492s.d(cls, Character.TYPE) ? true : AbstractC6492s.d(cls, Character.class)) {
            return "Char";
        }
        if (AbstractC6492s.d(cls, Short.TYPE) ? true : AbstractC6492s.d(cls, Short.class)) {
            return "Short";
        }
        if (AbstractC6492s.d(cls, Integer.TYPE) ? true : AbstractC6492s.d(cls, Integer.class)) {
            return "Int";
        }
        if (AbstractC6492s.d(cls, Long.TYPE) ? true : AbstractC6492s.d(cls, Long.class)) {
            return "Long";
        }
        if (AbstractC6492s.d(cls, Float.TYPE) ? true : AbstractC6492s.d(cls, Float.class)) {
            return "Float";
        }
        if (AbstractC6492s.d(cls, Double.TYPE) ? true : AbstractC6492s.d(cls, Double.class)) {
            return "Double";
        }
        if (AbstractC6492s.d(cls, Object.class)) {
            return "Any";
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String e(Class cls) {
        TypeVariable[] typeParameters = cls.getTypeParameters();
        AbstractC6492s.h(typeParameters, "typeParameters");
        if (typeParameters.length == 0) {
            return "";
        }
        int length = cls.getTypeParameters().length;
        String[] strArr = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            strArr[i10] = "*";
        }
        return AbstractC3682n.I0(strArr, ", ", "<", ">", 0, null, null, 56, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final String f(String str) {
        if (!t.P(str, "java.", false, 2, null)) {
            return str;
        }
        switch (str.hashCode()) {
            case -2050985813:
                if (!str.equals("java.lang.RuntimeException")) {
                }
                break;
            case -1624170886:
                if (!str.equals("java.lang.AssertionError")) {
                }
                break;
            case -1427677637:
                if (!str.equals("java.util.NoSuchElementException")) {
                }
                break;
            case -1402722386:
                if (!str.equals("java.util.HashMap")) {
                }
                break;
            case -1402716492:
                if (!str.equals("java.util.HashSet")) {
                }
                break;
            case -1383349348:
                if (!str.equals("java.util.Map")) {
                }
                break;
            case -1383343454:
                if (!str.equals("java.util.Set")) {
                }
                break;
            case -1282923287:
                if (!str.equals("java.lang.UnsupportedOperationException")) {
                }
                break;
            case -1114099497:
                if (!str.equals("java.util.ArrayList")) {
                }
                break;
            case -528621260:
                if (!str.equals("java.lang.Error")) {
                }
                break;
            case -310638960:
                if (!str.equals("java.lang.IllegalArgumentException")) {
                }
                break;
            case -37663348:
                if (!str.equals("java.lang.ClassCastException")) {
                }
                break;
            case 65821278:
                if (!str.equals("java.util.List")) {
                }
                break;
            case 72706427:
                if (!str.equals("java.lang.Exception")) {
                }
                break;
            case 75599616:
                if (!str.equals("java.lang.IllegalStateException")) {
                }
                break;
            case 208316054:
                if (!str.equals("java.util.Comparator")) {
                }
                break;
            case 1063877011:
                if (!str.equals("java.lang.Object")) {
                }
                break;
            case 1195259493:
                if (!str.equals("java.lang.String")) {
                }
                break;
            case 1258621781:
                if (!str.equals("java.util.LinkedHashMap")) {
                }
                break;
            case 1258627675:
                if (!str.equals("java.util.LinkedHashSet")) {
                }
                break;
            case 1270017459:
                if (!str.equals("java.lang.IndexOutOfBoundsException")) {
                }
                break;
            case 1630335596:
                if (!str.equals("java.lang.Throwable")) {
                }
                break;
            case 1641150139:
                if (!str.equals("java.lang.NumberFormatException")) {
                }
                break;
            case 1879291277:
                if (!str.equals("java.lang.NullPointerException")) {
                }
                break;
        }
        return str;
    }

    public static final String g(Type type) {
        AbstractC6492s.i(type, "<this>");
        return p.c(m.f56963a, type, false, 2, null);
    }

    public static final String h(Type type) {
        AbstractC6492s.i(type, "<this>");
        return p.c(n.f56964a, type, false, 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String i(java.lang.reflect.Type r3) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.AbstractC6492s.i(r3, r0)
            boolean r0 = r3 instanceof java.lang.Class
            if (r0 == 0) goto L41
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r3 = (java.lang.Class) r3
            java.lang.Class r1 = r3.getEnclosingClass()
            if (r1 == 0) goto L30
            java.lang.String r1 = i(r1)
            if (r1 == 0) goto L30
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r1 = 46
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            if (r1 == 0) goto L30
            goto L32
        L30:
            java.lang.String r1 = ""
        L32:
            r0.append(r1)
            java.lang.String r3 = r3.getSimpleName()
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            goto L7c
        L41:
            boolean r0 = r3 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L50
            java.lang.reflect.ParameterizedType r3 = (java.lang.reflect.ParameterizedType) r3
            java.lang.Class r3 = org.kodein.type.j.f(r3)
            java.lang.String r3 = i(r3)
            goto L7c
        L50:
            boolean r0 = r3 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L65
            java.lang.reflect.GenericArrayType r3 = (java.lang.reflect.GenericArrayType) r3
            java.lang.reflect.Type r3 = r3.getGenericComponentType()
            java.lang.String r0 = "genericComponentType"
            kotlin.jvm.internal.AbstractC6492s.h(r3, r0)
            java.lang.String r3 = i(r3)
            goto L7c
        L65:
            boolean r0 = r3 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L6c
            java.lang.String r3 = "*"
            goto L7c
        L6c:
            boolean r0 = r3 instanceof java.lang.reflect.TypeVariable
            if (r0 == 0) goto L7d
            java.lang.reflect.TypeVariable r3 = (java.lang.reflect.TypeVariable) r3
            java.lang.String r3 = r3.getName()
            java.lang.String r0 = "name"
            kotlin.jvm.internal.AbstractC6492s.h(r3, r0)
        L7c:
            return r3
        L7d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown type "
            r1.append(r2)
            java.lang.Class r2 = r3.getClass()
            r1.append(r2)
            r2 = 32
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.kodein.type.b.i(java.lang.reflect.Type):java.lang.String");
    }
}
