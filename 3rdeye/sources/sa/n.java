package sa;

import U9.F;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import sa.f;

/* compiled from: OptionalConverterFactory.java */
@IgnoreJRERequirement
/* loaded from: classes3.dex */
public final class n extends f.a {

    /* renamed from: a, reason: collision with root package name */
    public static final n f46238a = new n();

    /* compiled from: OptionalConverterFactory.java */
    @IgnoreJRERequirement
    public static final class a<T> implements f<F, Optional<T>> {

        /* renamed from: a, reason: collision with root package name */
        public final f<F, T> f46239a;

        public a(f<F, T> fVar) {
            this.f46239a = fVar;
        }

        @Override // sa.f
        public final Object convert(F f10) throws IOException {
            return Optional.ofNullable(this.f46239a.convert(f10));
        }
    }

    @Override // sa.f.a
    public final f<F, ?> b(Type type, Annotation[] annotationArr, w wVar) {
        if (A.e(type) != G0.n.i()) {
            return null;
        }
        return new a(wVar.c(A.d(0, (ParameterizedType) type), annotationArr));
    }
}
