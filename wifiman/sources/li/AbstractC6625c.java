package li;

import Zg.AbstractC3689v;
import Zg.d0;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;
import xi.AbstractC8534a;

/* renamed from: li.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6625c implements Bh.T {

    /* renamed from: a, reason: collision with root package name */
    private final oi.n f52694a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6598A f52695b;

    /* renamed from: c, reason: collision with root package name */
    private final Bh.G f52696c;

    /* renamed from: d, reason: collision with root package name */
    protected C6636n f52697d;

    /* renamed from: e, reason: collision with root package name */
    private final oi.h f52698e;

    public AbstractC6625c(oi.n storageManager, InterfaceC6598A finder, Bh.G moduleDescriptor) {
        AbstractC6492s.i(storageManager, "storageManager");
        AbstractC6492s.i(finder, "finder");
        AbstractC6492s.i(moduleDescriptor, "moduleDescriptor");
        this.f52694a = storageManager;
        this.f52695b = finder;
        this.f52696c = moduleDescriptor;
        this.f52698e = storageManager.i(new C6624b(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bh.M f(AbstractC6625c abstractC6625c, Zh.c fqName) {
        AbstractC6492s.i(fqName, "fqName");
        AbstractC6640r abstractC6640rE = abstractC6625c.e(fqName);
        if (abstractC6640rE == null) {
            return null;
        }
        abstractC6640rE.L0(abstractC6625c.g());
        return abstractC6640rE;
    }

    @Override // Bh.T
    public void a(Zh.c fqName, Collection packageFragments) {
        AbstractC6492s.i(fqName, "fqName");
        AbstractC6492s.i(packageFragments, "packageFragments");
        AbstractC8534a.a(packageFragments, this.f52698e.invoke(fqName));
    }

    @Override // Bh.T
    public boolean b(Zh.c fqName) {
        AbstractC6492s.i(fqName, "fqName");
        return (this.f52698e.C(fqName) ? (Bh.M) this.f52698e.invoke(fqName) : e(fqName)) == null;
    }

    @Override // Bh.N
    public List c(Zh.c fqName) {
        AbstractC6492s.i(fqName, "fqName");
        return AbstractC3689v.p(this.f52698e.invoke(fqName));
    }

    protected abstract AbstractC6640r e(Zh.c cVar);

    protected final C6636n g() {
        C6636n c6636n = this.f52697d;
        if (c6636n != null) {
            return c6636n;
        }
        AbstractC6492s.v("components");
        return null;
    }

    protected final InterfaceC6598A h() {
        return this.f52695b;
    }

    protected final Bh.G i() {
        return this.f52696c;
    }

    protected final oi.n j() {
        return this.f52694a;
    }

    protected final void k(C6636n c6636n) {
        AbstractC6492s.i(c6636n, "<set-?>");
        this.f52697d = c6636n;
    }

    @Override // Bh.N
    public Collection s(Zh.c fqName, InterfaceC6835l nameFilter) {
        AbstractC6492s.i(fqName, "fqName");
        AbstractC6492s.i(nameFilter, "nameFilter");
        return d0.e();
    }
}
