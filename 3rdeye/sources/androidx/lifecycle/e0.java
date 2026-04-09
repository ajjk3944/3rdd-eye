package androidx.lifecycle;

import N7.H7;
import android.app.Application;
import j1.C5166b;
import java.lang.reflect.InvocationTargetException;

/* compiled from: ViewModelProvider.android.kt */
/* loaded from: classes.dex */
public final class e0 extends g0 {

    /* renamed from: c, reason: collision with root package name */
    public static e0 f16143c;

    /* renamed from: d, reason: collision with root package name */
    public static final a f16144d = new a();

    /* renamed from: b, reason: collision with root package name */
    public final Application f16145b;

    /* compiled from: ViewModelProvider.android.kt */
    public static final class a {
    }

    public e0(Application application) {
        this.f16145b = application;
    }

    @Override // androidx.lifecycle.g0, androidx.lifecycle.f0
    public final <T extends b0> T a(Class<T> cls) {
        Application application = this.f16145b;
        if (application != null) {
            return (T) d(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // androidx.lifecycle.g0, androidx.lifecycle.f0
    public final b0 c(Class cls, C5166b c5166b) {
        if (this.f16145b != null) {
            return a(cls);
        }
        Application application = (Application) c5166b.f42676a.get(f16144d);
        if (application != null) {
            return d(cls, application);
        }
        if (C1768a.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }
        return super.a(cls);
    }

    public final <T extends b0> T d(Class<T> cls, Application application) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        if (!C1768a.class.isAssignableFrom(cls)) {
            return (T) super.a(cls);
        }
        try {
            T tNewInstance = cls.getConstructor(Application.class).newInstance(application);
            kotlin.jvm.internal.l.e(tNewInstance, "{\n                try {\n…          }\n            }");
            return tNewInstance;
        } catch (IllegalAccessException e4) {
            throw new RuntimeException(H7.o(cls, "Cannot create an instance of "), e4);
        } catch (InstantiationException e10) {
            throw new RuntimeException(H7.o(cls, "Cannot create an instance of "), e10);
        } catch (NoSuchMethodException e11) {
            throw new RuntimeException(H7.o(cls, "Cannot create an instance of "), e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(H7.o(cls, "Cannot create an instance of "), e12);
        }
    }
}
