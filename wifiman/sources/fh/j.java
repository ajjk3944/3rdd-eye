package Fh;

import Bh.InterfaceC2492b;
import Bh.InterfaceC2495e;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import li.InterfaceC6645w;

/* loaded from: classes4.dex */
public final class j implements InterfaceC6645w {

    /* renamed from: b, reason: collision with root package name */
    public static final j f6678b = new j();

    private j() {
    }

    @Override // li.InterfaceC6645w
    public void a(InterfaceC2492b descriptor) {
        AbstractC6492s.i(descriptor, "descriptor");
        throw new IllegalStateException("Cannot infer visibility for " + descriptor);
    }

    @Override // li.InterfaceC6645w
    public void b(InterfaceC2495e descriptor, List unresolvedSuperClasses) {
        AbstractC6492s.i(descriptor, "descriptor");
        AbstractC6492s.i(unresolvedSuperClasses, "unresolvedSuperClasses");
        throw new IllegalStateException("Incomplete hierarchy for class " + descriptor.getName() + ", unresolved classes " + unresolvedSuperClasses);
    }
}
