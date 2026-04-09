package Sh;

import Bh.InterfaceC2495e;
import Zg.AbstractC3689v;
import java.util.Collection;
import kotlin.jvm.internal.AbstractC6492s;
import pi.S;

/* loaded from: classes4.dex */
public final class H implements G {

    /* renamed from: a, reason: collision with root package name */
    public static final H f20705a = new H();

    private H() {
    }

    @Override // Sh.G
    public void a(S kotlinType, InterfaceC2495e descriptor) {
        AbstractC6492s.i(kotlinType, "kotlinType");
        AbstractC6492s.i(descriptor, "descriptor");
    }

    @Override // Sh.G
    public String b(InterfaceC2495e classDescriptor) {
        AbstractC6492s.i(classDescriptor, "classDescriptor");
        return null;
    }

    @Override // Sh.G
    public S c(Collection types) {
        AbstractC6492s.i(types, "types");
        throw new AssertionError("There should be no intersection type in existing descriptors, but found: " + AbstractC3689v.z0(types, null, null, null, 0, null, null, 63, null));
    }

    @Override // Sh.G
    public S d(S kotlinType) {
        AbstractC6492s.i(kotlinType, "kotlinType");
        return null;
    }

    @Override // Sh.G
    public String e(InterfaceC2495e classDescriptor) {
        AbstractC6492s.i(classDescriptor, "classDescriptor");
        return null;
    }

    @Override // Sh.G
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public s f(InterfaceC2495e classDescriptor) {
        AbstractC6492s.i(classDescriptor, "classDescriptor");
        return null;
    }
}
