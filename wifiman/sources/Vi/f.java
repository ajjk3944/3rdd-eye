package Vi;

import Xi.d;
import Xi.m;
import Yg.J;
import Zg.AbstractC3682n;
import Zg.AbstractC3689v;
import Zi.AbstractC3696b;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.U;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;

/* loaded from: classes4.dex */
public final class f extends AbstractC3696b {

    /* renamed from: a, reason: collision with root package name */
    private final th.d f23451a;

    /* renamed from: b, reason: collision with root package name */
    private List f23452b;

    /* renamed from: c, reason: collision with root package name */
    private final Yg.m f23453c;

    public f(th.d baseClass) {
        AbstractC6492s.i(baseClass, "baseClass");
        this.f23451a = baseClass;
        this.f23452b = AbstractC3689v.l();
        this.f23453c = Yg.n.a(Yg.q.PUBLICATION, new InterfaceC6824a() { // from class: Vi.d
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return f.n(this.f23449a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Xi.f n(final f fVar) {
        return Xi.b.c(Xi.l.d("kotlinx.serialization.Polymorphic", d.a.f24437a, new Xi.f[0], new InterfaceC6835l() { // from class: Vi.e
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return f.o(this.f23450a, (Xi.a) obj);
            }
        }), fVar.k());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J o(f fVar, Xi.a buildSerialDescriptor) {
        AbstractC6492s.i(buildSerialDescriptor, "$this$buildSerialDescriptor");
        Xi.a.b(buildSerialDescriptor, "type", Wi.a.K(U.f51694a).a(), null, false, 12, null);
        Xi.a.b(buildSerialDescriptor, "value", Xi.l.e("kotlinx.serialization.Polymorphic<" + fVar.k().v() + '>', m.a.f24468a, new Xi.f[0], null, 8, null), null, false, 12, null);
        buildSerialDescriptor.h(fVar.f23452b);
        return J.f24997a;
    }

    @Override // Vi.b, Vi.o, Vi.InterfaceC3627a
    public Xi.f a() {
        return (Xi.f) this.f23453c.getValue();
    }

    @Override // Zi.AbstractC3696b
    public th.d k() {
        return this.f23451a;
    }

    public String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + k() + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(th.d baseClass, Annotation[] classAnnotations) {
        this(baseClass);
        AbstractC6492s.i(baseClass, "baseClass");
        AbstractC6492s.i(classAnnotations, "classAnnotations");
        this.f23452b = AbstractC3682n.e(classAnnotations);
    }
}
