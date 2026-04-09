package com.google.protobuf;

/* compiled from: ExtensionRegistryFactory.java */
/* renamed from: com.google.protobuf.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4033p {
    static final Class<?> EXTENSION_REGISTRY_CLASS = reflectExtensionRegistry();
    static final String FULL_REGISTRY_CLASS_NAME = "com.google.protobuf.ExtensionRegistry";

    public static C4034q create() {
        C4034q c4034qInvokeSubclassFactory = invokeSubclassFactory("newInstance");
        return c4034qInvokeSubclassFactory != null ? c4034qInvokeSubclassFactory : new C4034q();
    }

    public static C4034q createEmpty() {
        C4034q c4034qInvokeSubclassFactory = invokeSubclassFactory("getEmptyRegistry");
        return c4034qInvokeSubclassFactory != null ? c4034qInvokeSubclassFactory : C4034q.EMPTY_REGISTRY_LITE;
    }

    private static final C4034q invokeSubclassFactory(String str) {
        Class<?> cls = EXTENSION_REGISTRY_CLASS;
        if (cls == null) {
            return null;
        }
        try {
            return (C4034q) cls.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean isFullRegistry(C4034q c4034q) {
        Class<?> cls = EXTENSION_REGISTRY_CLASS;
        return cls != null && cls.isAssignableFrom(c4034q.getClass());
    }

    public static Class<?> reflectExtensionRegistry() {
        try {
            return Class.forName(FULL_REGISTRY_CLASS_NAME);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
