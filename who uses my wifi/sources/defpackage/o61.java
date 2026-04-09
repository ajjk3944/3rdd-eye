package defpackage;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class o61 extends us0 {
    public static o61 k;
    public static final ts0 l = new ts0();
    public final Application j;

    public o61(Application application) {
        this.j = application;
    }

    @Override // defpackage.us0, defpackage.p61
    public final m61 b(Class cls) {
        Application application = this.j;
        if (application != null) {
            return u(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // defpackage.us0, defpackage.p61
    public final m61 h(Class cls, mf0 mf0Var) {
        if (this.j != null) {
            return b(cls);
        }
        Application application = (Application) mf0Var.a.get(l);
        if (application != null) {
            return u(cls, application);
        }
        if (z3.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }
        return yb.i(cls);
    }

    public final m61 u(Class cls, Application application) {
        if (!z3.class.isAssignableFrom(cls)) {
            return yb.i(cls);
        }
        try {
            m61 m61Var = (m61) cls.getConstructor(Application.class).newInstance(application);
            i30.j(m61Var);
            return m61Var;
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Cannot create an instance of " + cls, e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("Cannot create an instance of " + cls, e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("Cannot create an instance of " + cls, e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException("Cannot create an instance of " + cls, e4);
        }
    }
}
