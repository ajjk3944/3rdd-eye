package lh;

import java.lang.annotation.Annotation;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.InterfaceC6482h;
import kotlin.jvm.internal.O;
import th.d;

/* renamed from: lh.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6596a {
    public static final d a(Annotation annotation) {
        AbstractC6492s.i(annotation, "<this>");
        Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
        AbstractC6492s.h(clsAnnotationType, "annotationType(...)");
        d dVarE = e(clsAnnotationType);
        AbstractC6492s.g(dVarE, "null cannot be cast to non-null type kotlin.reflect.KClass<out T of kotlin.jvm.JvmClassMappingKt.<get-annotationClass>>");
        return dVarE;
    }

    public static final Class b(d dVar) {
        AbstractC6492s.i(dVar, "<this>");
        Class clsB = ((InterfaceC6482h) dVar).b();
        AbstractC6492s.g(clsB, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return clsB;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class c(d dVar) {
        AbstractC6492s.i(dVar, "<this>");
        Class clsB = ((InterfaceC6482h) dVar).b();
        if (!clsB.isPrimitive()) {
            AbstractC6492s.g(clsB, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
            return clsB;
        }
        String name = clsB.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    clsB = Double.class;
                    break;
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    clsB = Integer.class;
                    break;
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    clsB = Byte.class;
                    break;
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    clsB = Character.class;
                    break;
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    clsB = Long.class;
                    break;
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    clsB = Void.class;
                    break;
                }
                break;
            case 64711720:
                if (name.equals("boolean")) {
                    clsB = Boolean.class;
                    break;
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    clsB = Float.class;
                    break;
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    clsB = Short.class;
                    break;
                }
                break;
        }
        AbstractC6492s.g(clsB, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
        return clsB;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final Class d(d dVar) {
        AbstractC6492s.i(dVar, "<this>");
        Class clsB = ((InterfaceC6482h) dVar).b();
        if (clsB.isPrimitive()) {
            AbstractC6492s.g(clsB, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaPrimitiveType>>");
            return clsB;
        }
        String name = clsB.getName();
        switch (name.hashCode()) {
            case -2056817302:
                if (name.equals("java.lang.Integer")) {
                    return Integer.TYPE;
                }
                return null;
            case -527879800:
                if (name.equals("java.lang.Float")) {
                    return Float.TYPE;
                }
                return null;
            case -515992664:
                if (name.equals("java.lang.Short")) {
                    return Short.TYPE;
                }
                return null;
            case 155276373:
                if (name.equals("java.lang.Character")) {
                    return Character.TYPE;
                }
                return null;
            case 344809556:
                if (name.equals("java.lang.Boolean")) {
                    return Boolean.TYPE;
                }
                return null;
            case 398507100:
                if (name.equals("java.lang.Byte")) {
                    return Byte.TYPE;
                }
                return null;
            case 398795216:
                if (name.equals("java.lang.Long")) {
                    return Long.TYPE;
                }
                return null;
            case 399092968:
                if (name.equals("java.lang.Void")) {
                    return Void.TYPE;
                }
                return null;
            case 761287205:
                if (name.equals("java.lang.Double")) {
                    return Double.TYPE;
                }
                return null;
            default:
                return null;
        }
    }

    public static final d e(Class cls) {
        AbstractC6492s.i(cls, "<this>");
        return O.b(cls);
    }
}
