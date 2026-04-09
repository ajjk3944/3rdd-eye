package k9;

import kotlin.jvm.internal.f;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.t;
import r9.c;

/* loaded from: classes4.dex */
public abstract class a {
    public static final Class a(c cVar) {
        p.e(cVar, "<this>");
        Class clsB = ((f) cVar).b();
        p.c(clsB, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return clsB;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class b(c cVar) {
        p.e(cVar, "<this>");
        Class clsB = ((f) cVar).b();
        if (!clsB.isPrimitive()) {
            p.c(clsB, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
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
        p.c(clsB, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
        return clsB;
    }

    public static final c c(Class cls) {
        p.e(cls, "<this>");
        return t.b(cls);
    }
}
