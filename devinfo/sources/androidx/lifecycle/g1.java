package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class g1 extends x0 {

    /* renamed from: d, reason: collision with root package name */
    public static g1 f1140d;

    /* renamed from: e, reason: collision with root package name */
    public static final ed.f f1141e = new ed.f(4);

    /* renamed from: c, reason: collision with root package name */
    public final Application f1142c;

    public g1(Application application) {
        super(1);
        this.f1142c = application;
    }

    @Override // androidx.lifecycle.x0, androidx.lifecycle.h1
    public final e1 a(Class cls) {
        Application application = this.f1142c;
        if (application != null) {
            return d(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // androidx.lifecycle.x0, androidx.lifecycle.h1
    public final e1 b(Class cls, h5.c cVar) {
        if (this.f1142c != null) {
            return a(cls);
        }
        Application application = (Application) cVar.f24880a.get(f1141e);
        if (application != null) {
            return d(cls, application);
        }
        if (a.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }
        return com.bumptech.glide.f.j(cls);
    }

    public final e1 d(Class cls, Application application) {
        if (!a.class.isAssignableFrom(cls)) {
            return com.bumptech.glide.f.j(cls);
        }
        try {
            e1 e1Var = (e1) cls.getConstructor(Application.class).newInstance(application);
            nk.k.b(e1Var);
            return e1Var;
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Cannot create an instance of " + cls, e2);
        } catch (InstantiationException e10) {
            throw new RuntimeException("Cannot create an instance of " + cls, e10);
        } catch (NoSuchMethodException e11) {
            throw new RuntimeException("Cannot create an instance of " + cls, e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException("Cannot create an instance of " + cls, e12);
        }
    }
}
