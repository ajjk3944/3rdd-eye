package androidx.lifecycle;

import N7.H7;
import j1.C5166b;
import java.lang.reflect.InvocationTargetException;

/* compiled from: ViewModelProvider.android.kt */
/* loaded from: classes.dex */
public class g0 implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public static g0 f16150a;

    @Override // androidx.lifecycle.f0
    public <T extends b0> T a(Class<T> cls) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        try {
            T tNewInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            kotlin.jvm.internal.l.e(tNewInstance, "{\n            modelClass…).newInstance()\n        }");
            return tNewInstance;
        } catch (IllegalAccessException e4) {
            throw new RuntimeException(H7.o(cls, "Cannot create an instance of "), e4);
        } catch (InstantiationException e10) {
            throw new RuntimeException(H7.o(cls, "Cannot create an instance of "), e10);
        } catch (NoSuchMethodException e11) {
            throw new RuntimeException(H7.o(cls, "Cannot create an instance of "), e11);
        }
    }

    @Override // androidx.lifecycle.f0
    public final b0 b(kotlin.jvm.internal.e eVar, C5166b c5166b) {
        return c(E.u.C(eVar), c5166b);
    }

    @Override // androidx.lifecycle.f0
    public b0 c(Class cls, C5166b c5166b) {
        return a(cls);
    }
}
