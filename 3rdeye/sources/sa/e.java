package sa;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import sa.c;

/* compiled from: CompletableFutureCallAdapterFactory.java */
@IgnoreJRERequirement
/* loaded from: classes3.dex */
public final class e extends c.a {

    /* renamed from: a, reason: collision with root package name */
    public static final e f46197a = new e();

    /* compiled from: CompletableFutureCallAdapterFactory.java */
    @IgnoreJRERequirement
    public static final class a<R> implements sa.c<R, CompletableFuture<R>> {

        /* renamed from: a, reason: collision with root package name */
        public final Type f46198a;

        /* compiled from: CompletableFutureCallAdapterFactory.java */
        @IgnoreJRERequirement
        /* renamed from: sa.e$a$a, reason: collision with other inner class name */
        public class C0530a implements d<R> {

            /* renamed from: b, reason: collision with root package name */
            public final b f46199b;

            public C0530a(b bVar) {
                this.f46199b = bVar;
            }

            @Override // sa.d
            public final void c(sa.b<R> bVar, u<R> uVar) {
                boolean zD = uVar.f46333a.d();
                b bVar2 = this.f46199b;
                if (zD) {
                    bVar2.complete(uVar.f46334b);
                } else {
                    bVar2.completeExceptionally(new i(uVar));
                }
            }

            @Override // sa.d
            public final void i(sa.b<R> bVar, Throwable th) {
                this.f46199b.completeExceptionally(th);
            }
        }

        public a(Type type) {
            this.f46198a = type;
        }

        @Override // sa.c
        public final Type a() {
            return this.f46198a;
        }

        @Override // sa.c
        public final Object b(m mVar) {
            b bVar = new b(mVar);
            mVar.c(new C0530a(bVar));
            return bVar;
        }
    }

    /* compiled from: CompletableFutureCallAdapterFactory.java */
    @IgnoreJRERequirement
    public static final class b<T> extends CompletableFuture<T> {

        /* renamed from: b, reason: collision with root package name */
        public final m f46200b;

        public b(m mVar) {
            this.f46200b = mVar;
        }

        @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
        public final boolean cancel(boolean z10) {
            if (z10) {
                this.f46200b.cancel();
            }
            return super.cancel(z10);
        }
    }

    /* compiled from: CompletableFutureCallAdapterFactory.java */
    @IgnoreJRERequirement
    public static final class c<R> implements sa.c<R, CompletableFuture<u<R>>> {

        /* renamed from: a, reason: collision with root package name */
        public final Type f46201a;

        /* compiled from: CompletableFutureCallAdapterFactory.java */
        @IgnoreJRERequirement
        public class a implements d<R> {

            /* renamed from: b, reason: collision with root package name */
            public final b f46202b;

            public a(b bVar) {
                this.f46202b = bVar;
            }

            @Override // sa.d
            public final void c(sa.b<R> bVar, u<R> uVar) {
                this.f46202b.complete(uVar);
            }

            @Override // sa.d
            public final void i(sa.b<R> bVar, Throwable th) {
                this.f46202b.completeExceptionally(th);
            }
        }

        public c(Type type) {
            this.f46201a = type;
        }

        @Override // sa.c
        public final Type a() {
            return this.f46201a;
        }

        @Override // sa.c
        public final Object b(m mVar) {
            b bVar = new b(mVar);
            mVar.c(new a(bVar));
            return bVar;
        }
    }

    @Override // sa.c.a
    public final sa.c a(Type type, Annotation[] annotationArr) {
        if (A.e(type) != G0.m.f()) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
        }
        Type typeD = A.d(0, (ParameterizedType) type);
        if (A.e(typeD) != u.class) {
            return new a(typeD);
        }
        if (typeD instanceof ParameterizedType) {
            return new c(A.d(0, (ParameterizedType) typeD));
        }
        throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
    }
}
