package Nj;

import Mj.e;
import Mj.w;
import Mj.x;
import gg.AbstractC5912b;
import gg.i;
import gg.n;
import gg.s;
import gg.y;
import gg.z;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* loaded from: classes2.dex */
public final class g extends e.a {

    /* renamed from: a, reason: collision with root package name */
    private final y f16654a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f16655b;

    private g(y yVar, boolean z10) {
        this.f16654a = yVar;
        this.f16655b = z10;
    }

    public static g d() {
        return new g(null, true);
    }

    public static g e() {
        return new g(null, false);
    }

    public static g f(y yVar) {
        if (yVar != null) {
            return new g(yVar, false);
        }
        throw new NullPointerException("scheduler == null");
    }

    @Override // Mj.e.a
    public Mj.e a(Type type, Annotation[] annotationArr, x xVar) {
        Type typeB;
        boolean z10;
        boolean z11;
        Class clsC = e.a.c(type);
        if (clsC == AbstractC5912b.class) {
            return new f(Void.class, this.f16654a, this.f16655b, false, true, false, false, false, true);
        }
        boolean z12 = clsC == i.class;
        boolean z13 = clsC == z.class;
        boolean z14 = clsC == n.class;
        if (clsC != s.class && !z12 && !z13 && !z14) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            String str = !z12 ? !z13 ? z14 ? "Maybe" : "Observable" : "Single" : "Flowable";
            throw new IllegalStateException(str + " return type must be parameterized as " + str + "<Foo> or " + str + "<? extends Foo>");
        }
        Type typeB2 = e.a.b(0, (ParameterizedType) type);
        Class clsC2 = e.a.c(typeB2);
        if (clsC2 == w.class) {
            if (!(typeB2 instanceof ParameterizedType)) {
                throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
            }
            typeB = e.a.b(0, (ParameterizedType) typeB2);
            z11 = false;
            z10 = false;
        } else if (clsC2 != d.class) {
            typeB = typeB2;
            z10 = true;
            z11 = false;
        } else {
            if (!(typeB2 instanceof ParameterizedType)) {
                throw new IllegalStateException("Result must be parameterized as Result<Foo> or Result<? extends Foo>");
            }
            typeB = e.a.b(0, (ParameterizedType) typeB2);
            z11 = true;
            z10 = false;
        }
        return new f(typeB, this.f16654a, this.f16655b, z11, z10, z12, z13, z14, false);
    }
}
