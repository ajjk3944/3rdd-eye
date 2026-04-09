package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import Bh.g0;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.c;
import pi.S;

/* loaded from: classes4.dex */
public class d implements c {

    /* renamed from: a, reason: collision with root package name */
    private final S f51905a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f51906b;

    /* renamed from: c, reason: collision with root package name */
    private final g0 f51907c;

    public d(S s10, Map map, g0 g0Var) {
        if (s10 == null) {
            b(0);
        }
        if (map == null) {
            b(1);
        }
        if (g0Var == null) {
            b(2);
        }
        this.f51905a = s10;
        this.f51906b = map;
        this.f51907c = g0Var;
    }

    private static /* synthetic */ void b(int i10) {
        String str = (i10 == 3 || i10 == 4 || i10 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 3 || i10 == 4 || i10 == 5) ? 2 : 3];
        if (i10 == 1) {
            objArr[0] = "valueArguments";
        } else if (i10 == 2) {
            objArr[0] = "source";
        } else if (i10 == 3 || i10 == 4 || i10 == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[0] = "annotationType";
        }
        if (i10 == 3) {
            objArr[1] = "getType";
        } else if (i10 == 4) {
            objArr[1] = "getAllValueArguments";
        } else if (i10 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i10 != 3 && i10 != 4 && i10 != 5) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 3 && i10 != 4 && i10 != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    public Map a() {
        Map map = this.f51906b;
        if (map == null) {
            b(4);
        }
        return map;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    public Zh.c e() {
        return c.a.a(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    public S getType() {
        S s10 = this.f51905a;
        if (s10 == null) {
            b(3);
        }
        return s10;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    public g0 j() {
        g0 g0Var = this.f51907c;
        if (g0Var == null) {
            b(5);
        }
        return g0Var;
    }

    public String toString() {
        return kotlin.reflect.jvm.internal.impl.renderer.n.f52068h.P(this, null);
    }
}
