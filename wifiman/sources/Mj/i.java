package Mj;

import Mj.e;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;
import java.util.concurrent.Executor;
import okhttp3.Request;

/* loaded from: classes2.dex */
final class i extends e.a {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f13335a;

    class a implements e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Type f13336a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Executor f13337b;

        a(Type type, Executor executor) {
            this.f13336a = type;
            this.f13337b = executor;
        }

        @Override // Mj.e
        public Type a() {
            return this.f13336a;
        }

        @Override // Mj.e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public d b(d dVar) {
            Executor executor = this.f13337b;
            return executor == null ? dVar : new b(executor, dVar);
        }
    }

    static final class b implements d {

        /* renamed from: a, reason: collision with root package name */
        final Executor f13339a;

        /* renamed from: b, reason: collision with root package name */
        final d f13340b;

        class a implements f {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ f f13341a;

            a(f fVar) {
                this.f13341a = fVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void e(f fVar, Throwable th2) {
                fVar.b(b.this, th2);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void f(f fVar, w wVar) {
                if (b.this.f13340b.v()) {
                    fVar.b(b.this, new IOException("Canceled"));
                } else {
                    fVar.a(b.this, wVar);
                }
            }

            @Override // Mj.f
            public void a(d dVar, final w wVar) {
                Executor executor = b.this.f13339a;
                final f fVar = this.f13341a;
                executor.execute(new Runnable() { // from class: Mj.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f13343a.f(fVar, wVar);
                    }
                });
            }

            @Override // Mj.f
            public void b(d dVar, final Throwable th2) {
                Executor executor = b.this.f13339a;
                final f fVar = this.f13341a;
                executor.execute(new Runnable() { // from class: Mj.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f13346a.e(fVar, th2);
                    }
                });
            }
        }

        b(Executor executor, d dVar) {
            this.f13339a = executor;
            this.f13340b = dVar;
        }

        @Override // Mj.d
        public void K0(f fVar) {
            Objects.requireNonNull(fVar, "callback == null");
            this.f13340b.K0(new a(fVar));
        }

        @Override // Mj.d
        public void cancel() {
            this.f13340b.cancel();
        }

        @Override // Mj.d
        public w g() {
            return this.f13340b.g();
        }

        @Override // Mj.d
        public Request j() {
            return this.f13340b.j();
        }

        @Override // Mj.d
        public boolean v() {
            return this.f13340b.v();
        }

        @Override // Mj.d
        /* renamed from: clone, reason: merged with bridge method [inline-methods] */
        public d m0clone() {
            return new b(this.f13339a, this.f13340b.m0clone());
        }
    }

    i(Executor executor) {
        this.f13335a = executor;
    }

    @Override // Mj.e.a
    public e a(Type type, Annotation[] annotationArr, x xVar) {
        if (e.a.c(type) != d.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new a(B.g(0, (ParameterizedType) type), B.l(annotationArr, z.class) ? null : this.f13335a);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
