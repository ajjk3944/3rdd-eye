package wh;

import Bh.InterfaceC2515z;
import Dh.AbstractC2609o;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: wh.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C8366j extends AbstractC2609o {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC8355d0 f65162a;

    public C8366j(AbstractC8355d0 container) {
        AbstractC6492s.i(container, "container");
        this.f65162a = container;
    }

    @Override // Dh.AbstractC2609o, Bh.InterfaceC2505o
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public AbstractC8339A a(InterfaceC2515z descriptor, Yg.J data) {
        AbstractC6492s.i(descriptor, "descriptor");
        AbstractC6492s.i(data, "data");
        return new C8365i0(this.f65162a, descriptor);
    }

    @Override // Bh.InterfaceC2505o
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public AbstractC8339A e(Bh.Y descriptor, Yg.J data) {
        AbstractC6492s.i(descriptor, "descriptor");
        AbstractC6492s.i(data, "data");
        int i10 = (descriptor.d0() != null ? 1 : 0) + (descriptor.k0() != null ? 1 : 0);
        if (descriptor.h0()) {
            if (i10 == 0) {
                return new C8369k0(this.f65162a, descriptor);
            }
            if (i10 == 1) {
                return new C8373m0(this.f65162a, descriptor);
            }
            if (i10 == 2) {
                return new C8377o0(this.f65162a, descriptor);
            }
        } else {
            if (i10 == 0) {
                return new B0(this.f65162a, descriptor);
            }
            if (i10 == 1) {
                return new E0(this.f65162a, descriptor);
            }
            if (i10 == 2) {
                return new H0(this.f65162a, descriptor);
            }
        }
        throw new Y0("Unsupported property: " + descriptor);
    }
}
