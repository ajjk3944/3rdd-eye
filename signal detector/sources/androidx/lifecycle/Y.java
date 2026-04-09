package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class Y extends P {

    /* renamed from: d, reason: collision with root package name */
    public static Y f5230d;

    /* renamed from: e, reason: collision with root package name */
    public static final S4.r f5231e = new S4.r(18);

    /* renamed from: c, reason: collision with root package name */
    public final Application f5232c;

    public Y(Application application) {
        super(1);
        this.f5232c = application;
    }

    @Override // androidx.lifecycle.P, androidx.lifecycle.Z
    public final X a(Class cls) {
        Application application = this.f5232c;
        if (application != null) {
            return d(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // androidx.lifecycle.P, androidx.lifecycle.Z
    public final X c(Class cls, n0.d dVar) {
        if (this.f5232c != null) {
            return a(cls);
        }
        Application application = (Application) dVar.f22143a.get(f5231e);
        if (application != null) {
            return d(cls, application);
        }
        if (AbstractC0279a.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }
        return com.bumptech.glide.c.j(cls);
    }

    public final X d(Class cls, Application application) {
        if (!AbstractC0279a.class.isAssignableFrom(cls)) {
            return com.bumptech.glide.c.j(cls);
        }
        try {
            X x6 = (X) cls.getConstructor(Application.class).newInstance(application);
            q5.i.d(x6, "{\n                try {\n…          }\n            }");
            return x6;
        } catch (IllegalAccessException e6) {
            throw new RuntimeException("Cannot create an instance of " + cls, e6);
        } catch (InstantiationException e7) {
            throw new RuntimeException("Cannot create an instance of " + cls, e7);
        } catch (NoSuchMethodException e8) {
            throw new RuntimeException("Cannot create an instance of " + cls, e8);
        } catch (InvocationTargetException e9) {
            throw new RuntimeException("Cannot create an instance of " + cls, e9);
        }
    }
}
