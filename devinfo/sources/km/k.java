package km;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class k extends e {
    @Override // km.e
    public final f a(Type type, Annotation[] annotationArr) {
        if (c1.h(type) != CompletableFuture.class) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
        }
        Type typeG = c1.g(0, (ParameterizedType) type);
        if (c1.h(typeG) != v0.class) {
            return new i(0, typeG);
        }
        if (typeG instanceof ParameterizedType) {
            return new p6.i(c1.g(0, (ParameterizedType) typeG));
        }
        throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
    }
}
