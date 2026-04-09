package Mj;

import Mj.e;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import retrofit2.HttpException;

/* loaded from: classes2.dex */
final class g extends e.a {

    private static final class a implements e {

        /* renamed from: a, reason: collision with root package name */
        private final Type f13328a;

        /* renamed from: Mj.g$a$a, reason: collision with other inner class name */
        private class C0533a implements f {

            /* renamed from: a, reason: collision with root package name */
            private final CompletableFuture f13329a;

            public C0533a(CompletableFuture completableFuture) {
                this.f13329a = completableFuture;
            }

            @Override // Mj.f
            public void a(d dVar, w wVar) {
                if (wVar.f()) {
                    this.f13329a.complete(wVar.a());
                } else {
                    this.f13329a.completeExceptionally(new HttpException(wVar));
                }
            }

            @Override // Mj.f
            public void b(d dVar, Throwable th2) {
                this.f13329a.completeExceptionally(th2);
            }
        }

        a(Type type) {
            this.f13328a = type;
        }

        @Override // Mj.e
        public Type a() {
            return this.f13328a;
        }

        @Override // Mj.e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public CompletableFuture b(d dVar) {
            b bVar = new b(dVar);
            dVar.K0(new C0533a(bVar));
            return bVar;
        }
    }

    private static final class b extends CompletableFuture {

        /* renamed from: a, reason: collision with root package name */
        private final d f13331a;

        b(d dVar) {
            this.f13331a = dVar;
        }

        @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
        public boolean cancel(boolean z10) {
            if (z10) {
                this.f13331a.cancel();
            }
            return super.cancel(z10);
        }
    }

    private static final class c implements e {

        /* renamed from: a, reason: collision with root package name */
        private final Type f13332a;

        private class a implements f {

            /* renamed from: a, reason: collision with root package name */
            private final CompletableFuture f13333a;

            public a(CompletableFuture completableFuture) {
                this.f13333a = completableFuture;
            }

            @Override // Mj.f
            public void a(d dVar, w wVar) {
                this.f13333a.complete(wVar);
            }

            @Override // Mj.f
            public void b(d dVar, Throwable th2) {
                this.f13333a.completeExceptionally(th2);
            }
        }

        c(Type type) {
            this.f13332a = type;
        }

        @Override // Mj.e
        public Type a() {
            return this.f13332a;
        }

        @Override // Mj.e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public CompletableFuture b(d dVar) {
            b bVar = new b(dVar);
            dVar.K0(new a(bVar));
            return bVar;
        }
    }

    g() {
    }

    @Override // Mj.e.a
    public e a(Type type, Annotation[] annotationArr, x xVar) {
        if (e.a.c(type) != CompletableFuture.class) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
        }
        Type typeB = e.a.b(0, (ParameterizedType) type);
        if (e.a.c(typeB) != w.class) {
            return new a(typeB);
        }
        if (typeB instanceof ParameterizedType) {
            return new c(e.a.b(0, (ParameterizedType) typeB));
        }
        throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
    }
}
