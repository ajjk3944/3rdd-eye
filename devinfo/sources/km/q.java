package km;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class q extends e {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f28452a;

    public q(Executor executor) {
        this.f28452a = executor;
    }

    @Override // km.e
    public final f a(Type type, Annotation[] annotationArr) {
        if (c1.h(type) != d.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new n(0, c1.g(0, (ParameterizedType) type), c1.k(annotationArr, x0.class) ? null : this.f28452a);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
