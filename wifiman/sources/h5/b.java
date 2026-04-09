package H5;

import Mj.h;
import Mj.x;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import kotlin.jvm.internal.AbstractC6492s;
import okhttp3.MediaType;

/* loaded from: classes3.dex */
public final class b extends h.a {

    /* renamed from: a, reason: collision with root package name */
    private final MediaType f7625a;

    /* renamed from: b, reason: collision with root package name */
    private final e f7626b;

    public b(MediaType contentType, e serializer) {
        AbstractC6492s.i(contentType, "contentType");
        AbstractC6492s.i(serializer, "serializer");
        this.f7625a = contentType;
        this.f7626b = serializer;
    }

    @Override // Mj.h.a
    public h c(Type type, Annotation[] parameterAnnotations, Annotation[] methodAnnotations, x retrofit) {
        AbstractC6492s.i(type, "type");
        AbstractC6492s.i(parameterAnnotations, "parameterAnnotations");
        AbstractC6492s.i(methodAnnotations, "methodAnnotations");
        AbstractC6492s.i(retrofit, "retrofit");
        return new d(this.f7625a, this.f7626b.c(type), this.f7626b);
    }

    @Override // Mj.h.a
    public h d(Type type, Annotation[] annotations, x retrofit) {
        AbstractC6492s.i(type, "type");
        AbstractC6492s.i(annotations, "annotations");
        AbstractC6492s.i(retrofit, "retrofit");
        return new a(this.f7626b.c(type), this.f7626b);
    }
}
