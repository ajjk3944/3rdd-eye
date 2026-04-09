package b3;

import N7.H7;
import java.lang.reflect.InvocationTargetException;

/* compiled from: ManifestParser.java */
@Deprecated
/* renamed from: b3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1849d {
    public static InterfaceC1847b a(String str) throws IllegalAccessException, InstantiationException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        try {
            Class<?> cls = Class.forName(str);
            try {
                Object objNewInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                if (objNewInstance instanceof InterfaceC1847b) {
                    return (InterfaceC1847b) objNewInstance;
                }
                throw new RuntimeException("Expected instanceof GlideModule, but found: " + objNewInstance);
            } catch (IllegalAccessException e4) {
                b(cls, e4);
                throw null;
            } catch (InstantiationException e10) {
                b(cls, e10);
                throw null;
            } catch (NoSuchMethodException e11) {
                b(cls, e11);
                throw null;
            } catch (InvocationTargetException e12) {
                b(cls, e12);
                throw null;
            }
        } catch (ClassNotFoundException e13) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e13);
        }
    }

    public static void b(Class cls, ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException(H7.o(cls, "Unable to instantiate GlideModule implementation for "), reflectiveOperationException);
    }
}
