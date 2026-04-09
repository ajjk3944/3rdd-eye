package Kh;

import Jh.I;
import Nh.C3383j;
import Qh.InterfaceC3444a;
import Qh.InterfaceC3447d;
import Yg.z;
import Zg.U;
import Zh.b;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.reflect.jvm.internal.impl.builtins.o;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f10792a = new d();

    /* renamed from: b, reason: collision with root package name */
    private static final Zh.f f10793b;

    /* renamed from: c, reason: collision with root package name */
    private static final Zh.f f10794c;

    /* renamed from: d, reason: collision with root package name */
    private static final Zh.f f10795d;

    /* renamed from: e, reason: collision with root package name */
    private static final Map f10796e;

    static {
        Zh.f fVarH = Zh.f.h("message");
        AbstractC6492s.h(fVarH, "identifier(...)");
        f10793b = fVarH;
        Zh.f fVarH2 = Zh.f.h("allowedTargets");
        AbstractC6492s.h(fVarH2, "identifier(...)");
        f10794c = fVarH2;
        Zh.f fVarH3 = Zh.f.h("value");
        AbstractC6492s.h(fVarH3, "identifier(...)");
        f10795d = fVarH3;
        f10796e = U.k(z.a(o.a.f51817H, I.f10105d), z.a(o.a.f51825L, I.f10107f), z.a(o.a.f51833P, I.f10110i));
    }

    private d() {
    }

    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.annotations.c f(d dVar, InterfaceC3444a interfaceC3444a, Mh.k kVar, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return dVar.e(interfaceC3444a, kVar, z10);
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.c a(Zh.c kotlinName, InterfaceC3447d annotationOwner, Mh.k c10) {
        InterfaceC3444a interfaceC3444aL;
        AbstractC6492s.i(kotlinName, "kotlinName");
        AbstractC6492s.i(annotationOwner, "annotationOwner");
        AbstractC6492s.i(c10, "c");
        if (AbstractC6492s.d(kotlinName, o.a.f51892y)) {
            Zh.c DEPRECATED_ANNOTATION = I.f10109h;
            AbstractC6492s.h(DEPRECATED_ANNOTATION, "DEPRECATED_ANNOTATION");
            InterfaceC3444a interfaceC3444aL2 = annotationOwner.l(DEPRECATED_ANNOTATION);
            if (interfaceC3444aL2 != null || annotationOwner.h()) {
                return new h(interfaceC3444aL2, c10);
            }
        }
        Zh.c cVar = (Zh.c) f10796e.get(kotlinName);
        if (cVar == null || (interfaceC3444aL = annotationOwner.l(cVar)) == null) {
            return null;
        }
        return f(f10792a, interfaceC3444aL, c10, false, 4, null);
    }

    public final Zh.f b() {
        return f10793b;
    }

    public final Zh.f c() {
        return f10795d;
    }

    public final Zh.f d() {
        return f10794c;
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.c e(InterfaceC3444a annotation, Mh.k c10, boolean z10) {
        AbstractC6492s.i(annotation, "annotation");
        AbstractC6492s.i(c10, "c");
        Zh.b bVarB = annotation.b();
        b.a aVar = Zh.b.f25401d;
        Zh.c TARGET_ANNOTATION = I.f10105d;
        AbstractC6492s.h(TARGET_ANNOTATION, "TARGET_ANNOTATION");
        if (AbstractC6492s.d(bVarB, aVar.c(TARGET_ANNOTATION))) {
            return new n(annotation, c10);
        }
        Zh.c RETENTION_ANNOTATION = I.f10107f;
        AbstractC6492s.h(RETENTION_ANNOTATION, "RETENTION_ANNOTATION");
        if (AbstractC6492s.d(bVarB, aVar.c(RETENTION_ANNOTATION))) {
            return new l(annotation, c10);
        }
        Zh.c DOCUMENTED_ANNOTATION = I.f10110i;
        AbstractC6492s.h(DOCUMENTED_ANNOTATION, "DOCUMENTED_ANNOTATION");
        if (AbstractC6492s.d(bVarB, aVar.c(DOCUMENTED_ANNOTATION))) {
            return new c(c10, annotation, o.a.f51833P);
        }
        Zh.c DEPRECATED_ANNOTATION = I.f10109h;
        AbstractC6492s.h(DEPRECATED_ANNOTATION, "DEPRECATED_ANNOTATION");
        if (AbstractC6492s.d(bVarB, aVar.c(DEPRECATED_ANNOTATION))) {
            return null;
        }
        return new C3383j(c10, annotation, z10);
    }
}
