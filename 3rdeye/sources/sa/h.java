package sa;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;
import sa.c;

/* compiled from: DefaultCallAdapterFactory.java */
/* loaded from: classes3.dex */
public final class h extends c.a {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f46205a;

    /* compiled from: DefaultCallAdapterFactory.java */
    public static final class a<T> implements b<T> {

        /* renamed from: b, reason: collision with root package name */
        public final Executor f46206b;

        /* renamed from: c, reason: collision with root package name */
        public final b<T> f46207c;

        /* compiled from: DefaultCallAdapterFactory.java */
        /* renamed from: sa.h$a$a, reason: collision with other inner class name */
        public class C0531a implements d<T> {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f46208b;

            public C0531a(d dVar) {
                this.f46208b = dVar;
            }

            @Override // sa.d
            public final void c(b<T> bVar, u<T> uVar) {
                a.this.f46206b.execute(new N.d(this, this.f46208b, uVar, 12));
            }

            @Override // sa.d
            public final void i(b<T> bVar, Throwable th) {
                a.this.f46206b.execute(new J4.e(this, this.f46208b, th, 18));
            }
        }

        public a(Executor executor, b<T> bVar) {
            this.f46206b = executor;
            this.f46207c = bVar;
        }

        @Override // sa.b
        public final U9.z A() {
            return this.f46207c.A();
        }

        @Override // sa.b
        public final void c(d<T> dVar) {
            this.f46207c.c(new C0531a(dVar));
        }

        @Override // sa.b
        public final void cancel() {
            this.f46207c.cancel();
        }

        @Override // sa.b
        public final boolean isCanceled() {
            return this.f46207c.isCanceled();
        }

        @Override // sa.b
        public final b<T> clone() {
            return new a(this.f46206b, this.f46207c.clone());
        }
    }

    public h(Executor executor) {
        this.f46205a = executor;
    }

    @Override // sa.c.a
    public final c a(Type type, Annotation[] annotationArr) {
        if (A.e(type) != b.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new g(A.d(0, (ParameterizedType) type), A.h(annotationArr, y.class) ? null : this.f46205a);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
