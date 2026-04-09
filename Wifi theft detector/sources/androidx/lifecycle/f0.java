package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;
import k1.a;

/* loaded from: classes.dex */
public class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f3508a;

    /* renamed from: b, reason: collision with root package name */
    public final b f3509b;

    /* renamed from: c, reason: collision with root package name */
    public final k1.a f3510c;

    public interface b {
        e0 a(Class cls);

        e0 b(Class cls, k1.a aVar);
    }

    public static class c implements b {

        /* renamed from: b, reason: collision with root package name */
        public static c f3517b;

        /* renamed from: a, reason: collision with root package name */
        public static final a f3516a = new a(null);

        /* renamed from: c, reason: collision with root package name */
        public static final a.b f3518c = a.C0035a.f3519a;

        public static final class a {

            /* renamed from: androidx.lifecycle.f0$c$a$a, reason: collision with other inner class name */
            public static final class C0035a implements a.b {

                /* renamed from: a, reason: collision with root package name */
                public static final C0035a f3519a = new C0035a();
            }

            public /* synthetic */ a(kotlin.jvm.internal.i iVar) {
                this();
            }

            public final c a() {
                if (c.f3517b == null) {
                    c.f3517b = new c();
                }
                c cVar = c.f3517b;
                kotlin.jvm.internal.p.b(cVar);
                return cVar;
            }

            public a() {
            }
        }

        @Override // androidx.lifecycle.f0.b
        public e0 a(Class modelClass) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
            kotlin.jvm.internal.p.e(modelClass, "modelClass");
            try {
                Object objNewInstance = modelClass.getDeclaredConstructor(null).newInstance(null);
                kotlin.jvm.internal.p.d(objNewInstance, "{\n                modelC…wInstance()\n            }");
                return (e0) objNewInstance;
            } catch (IllegalAccessException e10) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e11);
            } catch (NoSuchMethodException e12) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e12);
            }
        }

        @Override // androidx.lifecycle.f0.b
        public /* synthetic */ e0 b(Class cls, k1.a aVar) {
            return g0.b(this, cls, aVar);
        }
    }

    public static class d {
        public abstract void c(e0 e0Var);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f0(i0 store, b factory) {
        this(store, factory, null, 4, null);
        kotlin.jvm.internal.p.e(store, "store");
        kotlin.jvm.internal.p.e(factory, "factory");
    }

    public e0 a(Class modelClass) {
        kotlin.jvm.internal.p.e(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, modelClass);
    }

    public e0 b(String key, Class modelClass) {
        e0 e0VarA;
        kotlin.jvm.internal.p.e(key, "key");
        kotlin.jvm.internal.p.e(modelClass, "modelClass");
        e0 e0VarB = this.f3508a.b(key);
        if (!modelClass.isInstance(e0VarB)) {
            k1.d dVar = new k1.d(this.f3510c);
            dVar.c(c.f3518c, key);
            try {
                e0VarA = this.f3509b.b(modelClass, dVar);
            } catch (AbstractMethodError unused) {
                e0VarA = this.f3509b.a(modelClass);
            }
            this.f3508a.d(key, e0VarA);
            return e0VarA;
        }
        Object obj = this.f3509b;
        d dVar2 = obj instanceof d ? (d) obj : null;
        if (dVar2 != null) {
            kotlin.jvm.internal.p.b(e0VarB);
            dVar2.c(e0VarB);
        }
        kotlin.jvm.internal.p.c(e0VarB, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
        return e0VarB;
    }

    public static class a extends c {

        /* renamed from: f, reason: collision with root package name */
        public static a f3512f;

        /* renamed from: d, reason: collision with root package name */
        public final Application f3514d;

        /* renamed from: e, reason: collision with root package name */
        public static final C0033a f3511e = new C0033a(null);

        /* renamed from: g, reason: collision with root package name */
        public static final a.b f3513g = C0033a.C0034a.f3515a;

        /* renamed from: androidx.lifecycle.f0$a$a, reason: collision with other inner class name */
        public static final class C0033a {

            /* renamed from: androidx.lifecycle.f0$a$a$a, reason: collision with other inner class name */
            public static final class C0034a implements a.b {

                /* renamed from: a, reason: collision with root package name */
                public static final C0034a f3515a = new C0034a();
            }

            public /* synthetic */ C0033a(kotlin.jvm.internal.i iVar) {
                this();
            }

            public final a a(Application application) {
                kotlin.jvm.internal.p.e(application, "application");
                if (a.f3512f == null) {
                    a.f3512f = new a(application);
                }
                a aVar = a.f3512f;
                kotlin.jvm.internal.p.b(aVar);
                return aVar;
            }

            public C0033a() {
            }
        }

        public a(Application application, int i10) {
            this.f3514d = application;
        }

        @Override // androidx.lifecycle.f0.c, androidx.lifecycle.f0.b
        public e0 a(Class modelClass) {
            kotlin.jvm.internal.p.e(modelClass, "modelClass");
            Application application = this.f3514d;
            if (application != null) {
                return g(modelClass, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        @Override // androidx.lifecycle.f0.c, androidx.lifecycle.f0.b
        public e0 b(Class modelClass, k1.a extras) {
            kotlin.jvm.internal.p.e(modelClass, "modelClass");
            kotlin.jvm.internal.p.e(extras, "extras");
            if (this.f3514d != null) {
                return a(modelClass);
            }
            Application application = (Application) extras.a(f3513g);
            if (application != null) {
                return g(modelClass, application);
            }
            if (androidx.lifecycle.a.class.isAssignableFrom(modelClass)) {
                throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
            }
            return super.a(modelClass);
        }

        public final e0 g(Class cls, Application application) {
            if (!androidx.lifecycle.a.class.isAssignableFrom(cls)) {
                return super.a(cls);
            }
            try {
                e0 e0Var = (e0) cls.getConstructor(Application.class).newInstance(application);
                kotlin.jvm.internal.p.d(e0Var, "{\n                try {\n…          }\n            }");
                return e0Var;
            } catch (IllegalAccessException e10) {
                throw new RuntimeException("Cannot create an instance of " + cls, e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException("Cannot create an instance of " + cls, e11);
            } catch (NoSuchMethodException e12) {
                throw new RuntimeException("Cannot create an instance of " + cls, e12);
            } catch (InvocationTargetException e13) {
                throw new RuntimeException("Cannot create an instance of " + cls, e13);
            }
        }

        public a() {
            this(null, 0);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(Application application) {
            this(application, 0);
            kotlin.jvm.internal.p.e(application, "application");
        }
    }

    public f0(i0 store, b factory, k1.a defaultCreationExtras) {
        kotlin.jvm.internal.p.e(store, "store");
        kotlin.jvm.internal.p.e(factory, "factory");
        kotlin.jvm.internal.p.e(defaultCreationExtras, "defaultCreationExtras");
        this.f3508a = store;
        this.f3509b = factory;
        this.f3510c = defaultCreationExtras;
    }

    public /* synthetic */ f0(i0 i0Var, b bVar, k1.a aVar, int i10, kotlin.jvm.internal.i iVar) {
        this(i0Var, bVar, (i10 & 4) != 0 ? a.C0426a.f21800b : aVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f0(j0 owner, b factory) {
        this(owner.getViewModelStore(), factory, h0.a(owner));
        kotlin.jvm.internal.p.e(owner, "owner");
        kotlin.jvm.internal.p.e(factory, "factory");
    }
}
