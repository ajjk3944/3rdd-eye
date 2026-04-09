package km;

import j$.util.Optional;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b extends l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28392a;

    public /* synthetic */ b(int i4) {
        this.f28392a = i4;
    }

    @Override // km.l
    public m a(Type type) {
        switch (this.f28392a) {
            case 0:
                if (rl.x.class.isAssignableFrom(c1.h(type))) {
                    return a.f28384d;
                }
                return null;
            default:
                return super.a(type);
        }
    }

    @Override // km.l
    public final m b(Type type, Annotation[] annotationArr, va.o oVar) {
        switch (this.f28392a) {
            case 0:
                if (type == rl.c0.class) {
                    return c1.k(annotationArr, mm.w.class) ? a.f28385e : a.f28383c;
                }
                if (type == Void.class) {
                    return a.g;
                }
                if (c1.f28401b && type == yj.u.class) {
                    return a.f28386f;
                }
                return null;
            default:
                if (c1.h(type) != Optional.class) {
                    return null;
                }
                return new p6.i(oVar.p(c1.g(0, (ParameterizedType) type), annotationArr));
        }
    }
}
