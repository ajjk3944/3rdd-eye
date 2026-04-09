package androidx.lifecycle;

import android.app.Application;
import b2.AbstractC4056a;
import b2.C4059d;
import d2.C5285d;
import d2.g;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lh.AbstractC6596a;

/* loaded from: classes.dex */
public class P {

    /* renamed from: b, reason: collision with root package name */
    public static final b f31623b = new b(null);

    /* renamed from: c, reason: collision with root package name */
    public static final AbstractC4056a.b f31624c = g.a.f45728a;

    /* renamed from: a, reason: collision with root package name */
    private final C4059d f31625a;

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ P c(b bVar, S s10, c cVar, AbstractC4056a abstractC4056a, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                cVar = d2.g.f45727a.b(s10);
            }
            if ((i10 & 4) != 0) {
                abstractC4056a = d2.g.f45727a.a(s10);
            }
            return bVar.b(s10, cVar, abstractC4056a);
        }

        public final P a(Q store, c factory, AbstractC4056a extras) {
            AbstractC6492s.i(store, "store");
            AbstractC6492s.i(factory, "factory");
            AbstractC6492s.i(extras, "extras");
            return new P(store, factory, extras);
        }

        public final P b(S owner, c factory, AbstractC4056a extras) {
            AbstractC6492s.i(owner, "owner");
            AbstractC6492s.i(factory, "factory");
            AbstractC6492s.i(extras, "extras");
            return new P(owner.o(), factory, extras);
        }

        private b() {
        }
    }

    public interface c {

        /* renamed from: a, reason: collision with root package name */
        public static final a f31630a = a.f31631a;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            static final /* synthetic */ a f31631a = new a();

            private a() {
            }
        }

        default N a(Class modelClass) {
            AbstractC6492s.i(modelClass, "modelClass");
            return d2.g.f45727a.d();
        }

        default N b(Class modelClass, AbstractC4056a extras) {
            AbstractC6492s.i(modelClass, "modelClass");
            AbstractC6492s.i(extras, "extras");
            return a(modelClass);
        }

        default N c(th.d modelClass, AbstractC4056a extras) {
            AbstractC6492s.i(modelClass, "modelClass");
            AbstractC6492s.i(extras, "extras");
            return b(AbstractC6596a.b(modelClass), extras);
        }
    }

    public static class d implements c {

        /* renamed from: c, reason: collision with root package name */
        private static d f31633c;

        /* renamed from: b, reason: collision with root package name */
        public static final a f31632b = new a(null);

        /* renamed from: d, reason: collision with root package name */
        public static final AbstractC4056a.b f31634d = g.a.f45728a;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final d a() {
                if (d.f31633c == null) {
                    d.f31633c = new d();
                }
                d dVar = d.f31633c;
                AbstractC6492s.f(dVar);
                return dVar;
            }

            private a() {
            }
        }

        @Override // androidx.lifecycle.P.c
        public N a(Class modelClass) {
            AbstractC6492s.i(modelClass, "modelClass");
            return C5285d.f45722a.a(modelClass);
        }

        @Override // androidx.lifecycle.P.c
        public N b(Class modelClass, AbstractC4056a extras) {
            AbstractC6492s.i(modelClass, "modelClass");
            AbstractC6492s.i(extras, "extras");
            return a(modelClass);
        }

        @Override // androidx.lifecycle.P.c
        public N c(th.d modelClass, AbstractC4056a extras) {
            AbstractC6492s.i(modelClass, "modelClass");
            AbstractC6492s.i(extras, "extras");
            return b(AbstractC6596a.b(modelClass), extras);
        }
    }

    public static class e {
        public abstract void d(N n10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public P(Q store, c factory) {
        this(store, factory, null, 4, null);
        AbstractC6492s.i(store, "store");
        AbstractC6492s.i(factory, "factory");
    }

    public N a(Class modelClass) {
        AbstractC6492s.i(modelClass, "modelClass");
        return d(AbstractC6596a.e(modelClass));
    }

    public N b(String key, Class modelClass) {
        AbstractC6492s.i(key, "key");
        AbstractC6492s.i(modelClass, "modelClass");
        return this.f31625a.a(AbstractC6596a.e(modelClass), key);
    }

    public final N c(String key, th.d modelClass) {
        AbstractC6492s.i(key, "key");
        AbstractC6492s.i(modelClass, "modelClass");
        return this.f31625a.a(modelClass, key);
    }

    public final N d(th.d modelClass) {
        AbstractC6492s.i(modelClass, "modelClass");
        return C4059d.b(this.f31625a, modelClass, null, 2, null);
    }

    public static class a extends d {

        /* renamed from: g, reason: collision with root package name */
        private static a f31627g;

        /* renamed from: e, reason: collision with root package name */
        private final Application f31629e;

        /* renamed from: f, reason: collision with root package name */
        public static final b f31626f = new b(null);

        /* renamed from: h, reason: collision with root package name */
        public static final AbstractC4056a.b f31628h = new C1109a();

        /* renamed from: androidx.lifecycle.P$a$a, reason: collision with other inner class name */
        public static final class C1109a implements AbstractC4056a.b {
            C1109a() {
            }
        }

        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a a(Application application) {
                AbstractC6492s.i(application, "application");
                if (a.f31627g == null) {
                    a.f31627g = new a(application);
                }
                a aVar = a.f31627g;
                AbstractC6492s.f(aVar);
                return aVar;
            }

            private b() {
            }
        }

        private a(Application application, int i10) {
            this.f31629e = application;
        }

        private final N h(Class cls, Application application) {
            if (!AbstractC4004b.class.isAssignableFrom(cls)) {
                return super.a(cls);
            }
            try {
                N n10 = (N) cls.getConstructor(Application.class).newInstance(application);
                AbstractC6492s.h(n10, "{\n                try {\n…          }\n            }");
                return n10;
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

        @Override // androidx.lifecycle.P.d, androidx.lifecycle.P.c
        public N a(Class modelClass) {
            AbstractC6492s.i(modelClass, "modelClass");
            Application application = this.f31629e;
            if (application != null) {
                return h(modelClass, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        @Override // androidx.lifecycle.P.d, androidx.lifecycle.P.c
        public N b(Class modelClass, AbstractC4056a extras) {
            AbstractC6492s.i(modelClass, "modelClass");
            AbstractC6492s.i(extras, "extras");
            if (this.f31629e != null) {
                return a(modelClass);
            }
            Application application = (Application) extras.a(f31628h);
            if (application != null) {
                return h(modelClass, application);
            }
            if (AbstractC4004b.class.isAssignableFrom(modelClass)) {
                throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
            }
            return super.a(modelClass);
        }

        public a() {
            this(null, 0);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(Application application) {
            this(application, 0);
            AbstractC6492s.i(application, "application");
        }
    }

    private P(C4059d c4059d) {
        this.f31625a = c4059d;
    }

    public /* synthetic */ P(Q q10, c cVar, AbstractC4056a abstractC4056a, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(q10, cVar, (i10 & 4) != 0 ? AbstractC4056a.C1139a.f32794b : abstractC4056a);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public P(Q store, c factory, AbstractC4056a defaultCreationExtras) {
        this(new C4059d(store, factory, defaultCreationExtras));
        AbstractC6492s.i(store, "store");
        AbstractC6492s.i(factory, "factory");
        AbstractC6492s.i(defaultCreationExtras, "defaultCreationExtras");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public P(S owner, c factory) {
        this(owner.o(), factory, d2.g.f45727a.a(owner));
        AbstractC6492s.i(owner, "owner");
        AbstractC6492s.i(factory, "factory");
    }
}
