package kotlin.jvm.internal;

/* compiled from: ReflectionFactory.java */
/* loaded from: classes3.dex */
public final class y {
    public static String a(i iVar) {
        String string = iVar.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }
}
