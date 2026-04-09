package c3;

import a3.C3754b;
import a3.InterfaceC3759g;
import a3.InterfaceC3760h;
import java.util.Set;

/* renamed from: c3.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4216q implements a3.i {

    /* renamed from: a, reason: collision with root package name */
    private final Set f33816a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC4215p f33817b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC4219t f33818c;

    C4216q(Set set, AbstractC4215p abstractC4215p, InterfaceC4219t interfaceC4219t) {
        this.f33816a = set;
        this.f33817b = abstractC4215p;
        this.f33818c = interfaceC4219t;
    }

    @Override // a3.i
    public InterfaceC3760h a(String str, Class cls, C3754b c3754b, InterfaceC3759g interfaceC3759g) {
        if (this.f33816a.contains(c3754b)) {
            return new C4218s(this.f33817b, str, c3754b, interfaceC3759g, this.f33818c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", c3754b, this.f33816a));
    }
}
