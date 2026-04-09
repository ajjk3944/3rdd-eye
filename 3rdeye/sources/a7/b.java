package A7;

import a7.AbstractC1664a;
import a7.C1665b;
import b9.C1992A;
import c7.C2073a;
import java.util.List;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;
import l7.j;
import p9.InterfaceC5480a;
import y9.q;

/* compiled from: Expression.kt */
/* loaded from: classes.dex */
public abstract class b<T> {

    /* compiled from: Expression.kt */
    public static final class a {
        public static C0000b a(Object value) {
            l.f(value, "value");
            return value instanceof String ? new d((String) value) : new C0000b(value);
        }
    }

    /* compiled from: Expression.kt */
    /* renamed from: A7.b$b, reason: collision with other inner class name */
    public static class C0000b<T> extends b<T> {

        /* renamed from: a, reason: collision with root package name */
        public final T f87a;

        public C0000b(T value) {
            l.f(value, "value");
            this.f87a = value;
        }

        @Override // A7.b
        public T a(A7.d resolver) {
            l.f(resolver, "resolver");
            return this.f87a;
        }

        @Override // A7.b
        public final Object b() {
            T t10 = this.f87a;
            l.d(t10, "null cannot be cast to non-null type kotlin.Any");
            return t10;
        }

        @Override // A7.b
        public final j6.d d(A7.d resolver, p9.l<? super T, C1992A> callback) {
            l.f(resolver, "resolver");
            l.f(callback, "callback");
            return j6.d.f42990m8;
        }

        @Override // A7.b
        public final j6.d e(A7.d resolver, p9.l<? super T, C1992A> lVar) {
            l.f(resolver, "resolver");
            lVar.invoke(this.f87a);
            return j6.d.f42990m8;
        }
    }

    /* compiled from: Expression.kt */
    public static final class c<R, T> extends b<T> {

        /* renamed from: a, reason: collision with root package name */
        public final String f88a;

        /* renamed from: b, reason: collision with root package name */
        public final String f89b;

        /* renamed from: c, reason: collision with root package name */
        public final p9.l<R, T> f90c;

        /* renamed from: d, reason: collision with root package name */
        public final l7.l<T> f91d;

        /* renamed from: e, reason: collision with root package name */
        public final z7.c f92e;

        /* renamed from: f, reason: collision with root package name */
        public final j<T> f93f;

        /* renamed from: g, reason: collision with root package name */
        public final b<T> f94g;

        /* renamed from: h, reason: collision with root package name */
        public final String f95h;
        public AbstractC1664a.c i;

        /* renamed from: j, reason: collision with root package name */
        public T f96j;

        /* compiled from: Expression.kt */
        public static final class a extends m implements InterfaceC5480a<C1992A> {

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ p9.l<T, C1992A> f97g;

            /* renamed from: h, reason: collision with root package name */
            public final /* synthetic */ c<R, T> f98h;
            public final /* synthetic */ A7.d i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(p9.l<? super T, C1992A> lVar, c<R, T> cVar, A7.d dVar) {
                super(0);
                this.f97g = lVar;
                this.f98h = cVar;
                this.i = dVar;
            }

            @Override // p9.InterfaceC5480a
            public final C1992A invoke() {
                this.f97g.invoke(this.f98h.a(this.i));
                return C1992A.f18074a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public c(String expressionKey, String rawExpression, p9.l<? super R, ? extends T> lVar, l7.l<T> validator, z7.c logger, j<T> typeHelper, b<T> bVar) {
            l.f(expressionKey, "expressionKey");
            l.f(rawExpression, "rawExpression");
            l.f(validator, "validator");
            l.f(logger, "logger");
            l.f(typeHelper, "typeHelper");
            this.f88a = expressionKey;
            this.f89b = rawExpression;
            this.f90c = lVar;
            this.f91d = validator;
            this.f92e = logger;
            this.f93f = typeHelper;
            this.f94g = bVar;
            this.f95h = rawExpression;
        }

        @Override // A7.b
        public final T a(A7.d resolver) {
            T tA;
            l.f(resolver, "resolver");
            try {
                T tG = g(resolver);
                this.f96j = tG;
                return tG;
            } catch (z7.d e4) {
                String message = e4.getMessage();
                z7.c cVar = this.f92e;
                if (message != null && message.length() != 0) {
                    cVar.d(e4);
                    resolver.b(e4);
                }
                T t10 = this.f96j;
                if (t10 != null) {
                    return t10;
                }
                try {
                    b<T> bVar = this.f94g;
                    if (bVar == null || (tA = bVar.a(resolver)) == null) {
                        return this.f93f.a();
                    }
                    this.f96j = tA;
                    return tA;
                } catch (z7.d e10) {
                    cVar.d(e10);
                    resolver.b(e10);
                    throw e10;
                }
            }
        }

        @Override // A7.b
        public final Object b() {
            return this.f95h;
        }

        @Override // A7.b
        public final j6.d d(A7.d resolver, p9.l<? super T, C1992A> callback) {
            String str = this.f89b;
            j6.c cVar = j6.d.f42990m8;
            l.f(resolver, "resolver");
            l.f(callback, "callback");
            try {
                List<String> listC = f().c();
                return listC.isEmpty() ? cVar : resolver.c(str, listC, new a(callback, this, resolver));
            } catch (Exception e4) {
                z7.d dVarH = z7.e.h(this.f88a, str, e4);
                this.f92e.d(dVarH);
                resolver.b(dVarH);
                return cVar;
            }
        }

        public final AbstractC1664a f() {
            String expr = this.f89b;
            AbstractC1664a.c cVar = this.i;
            if (cVar != null) {
                return cVar;
            }
            try {
                l.f(expr, "expr");
                AbstractC1664a.c cVar2 = new AbstractC1664a.c(expr);
                this.i = cVar2;
                return cVar2;
            } catch (C1665b e4) {
                throw z7.e.h(this.f88a, expr, e4);
            }
        }

        public final T g(A7.d dVar) {
            T t10 = (T) dVar.a(this.f88a, this.f89b, f(), this.f90c, this.f91d, this.f93f, this.f92e);
            String str = this.f89b;
            String str2 = this.f88a;
            if (t10 == null) {
                throw z7.e.h(str2, str, null);
            }
            if (this.f93f.b(t10)) {
                return t10;
            }
            throw z7.e.j(str2, str, t10, null);
        }
    }

    /* compiled from: Expression.kt */
    public static final class d extends C0000b<String> {

        /* renamed from: b, reason: collision with root package name */
        public final String f99b;

        /* renamed from: c, reason: collision with root package name */
        public final String f100c;

        /* renamed from: d, reason: collision with root package name */
        public final z7.c f101d;

        /* renamed from: e, reason: collision with root package name */
        public String f102e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String value) {
            super(value);
            com.google.android.gms.measurement.internal.a aVar = z7.c.f48475r8;
            l.f(value, "value");
            this.f99b = value;
            this.f100c = "";
            this.f101d = aVar;
        }

        @Override // A7.b.C0000b, A7.b
        public final Object a(A7.d resolver) {
            l.f(resolver, "resolver");
            String str = this.f102e;
            if (str != null) {
                return str;
            }
            try {
                String strA = C2073a.a(this.f99b);
                this.f102e = strA;
                return strA;
            } catch (C1665b e4) {
                this.f101d.d(e4);
                String str2 = this.f100c;
                this.f102e = str2;
                return str2;
            }
        }
    }

    public static final boolean c(Object obj) {
        return (obj instanceof String) && q.b0((CharSequence) obj, "@{", false);
    }

    public abstract T a(A7.d dVar);

    public abstract Object b();

    public abstract j6.d d(A7.d dVar, p9.l<? super T, C1992A> lVar);

    public j6.d e(A7.d resolver, p9.l<? super T, C1992A> lVar) {
        T tA;
        l.f(resolver, "resolver");
        try {
            tA = a(resolver);
        } catch (z7.d unused) {
            tA = null;
        }
        if (tA != null) {
            lVar.invoke(tA);
        }
        return d(resolver, lVar);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return l.b(b(), ((b) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode() * 16;
    }
}
