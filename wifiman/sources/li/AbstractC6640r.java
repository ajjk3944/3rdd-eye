package li;

import ii.InterfaceC6164k;
import kotlin.jvm.internal.AbstractC6492s;
import ni.AbstractC6991w;

/* renamed from: li.r, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6640r extends Dh.H {

    /* renamed from: g, reason: collision with root package name */
    private final oi.n f52749g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC6640r(Zh.c fqName, oi.n storageManager, Bh.G module) {
        super(module, fqName);
        AbstractC6492s.i(fqName, "fqName");
        AbstractC6492s.i(storageManager, "storageManager");
        AbstractC6492s.i(module, "module");
        this.f52749g = storageManager;
    }

    public abstract InterfaceC6632j G0();

    public boolean K0(Zh.f name) {
        AbstractC6492s.i(name, "name");
        InterfaceC6164k interfaceC6164kR = r();
        return (interfaceC6164kR instanceof AbstractC6991w) && ((AbstractC6991w) interfaceC6164kR).t().contains(name);
    }

    public abstract void L0(C6636n c6636n);
}
