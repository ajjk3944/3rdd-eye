package c7;

import Mj.h;
import Mj.x;
import b7.C4073a;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* renamed from: c7.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4227a extends h.a {

    /* renamed from: a, reason: collision with root package name */
    private final C4073a f33888a;

    private C4227a(C4073a c4073a) {
        if (c4073a == null) {
            throw new NullPointerException("TikXml (passed as parameter) is null");
        }
        this.f33888a = c4073a;
    }

    public static C4227a f(C4073a c4073a) {
        return new C4227a(c4073a);
    }

    @Override // Mj.h.a
    public h c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, x xVar) {
        return new C4228b(this.f33888a);
    }

    @Override // Mj.h.a
    public h d(Type type, Annotation[] annotationArr, x xVar) {
        if (!(type instanceof Class)) {
            return null;
        }
        return new c(this.f33888a, (Class) type);
    }
}
