package Kh;

import Bh.g0;
import Qh.InterfaceC3444a;
import Qh.InterfaceC3445b;
import Zg.AbstractC3689v;
import Zg.U;
import java.util.Collection;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import pi.AbstractC7346d0;

/* loaded from: classes4.dex */
public class c implements Lh.g {

    /* renamed from: f, reason: collision with root package name */
    static final /* synthetic */ th.l[] f10786f = {O.h(new F(O.b(c.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;"))};

    /* renamed from: a, reason: collision with root package name */
    private final Zh.c f10787a;

    /* renamed from: b, reason: collision with root package name */
    private final g0 f10788b;

    /* renamed from: c, reason: collision with root package name */
    private final oi.i f10789c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3445b f10790d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f10791e;

    public c(Mh.k c10, InterfaceC3444a interfaceC3444a, Zh.c fqName) {
        g0 NO_SOURCE;
        Collection collectionJ;
        AbstractC6492s.i(c10, "c");
        AbstractC6492s.i(fqName, "fqName");
        this.f10787a = fqName;
        if (interfaceC3444a == null || (NO_SOURCE = c10.a().t().a(interfaceC3444a)) == null) {
            NO_SOURCE = g0.f1784a;
            AbstractC6492s.h(NO_SOURCE, "NO_SOURCE");
        }
        this.f10788b = NO_SOURCE;
        this.f10789c = c10.e().f(new b(c10, this));
        this.f10790d = (interfaceC3444a == null || (collectionJ = interfaceC3444a.j()) == null) ? null : (InterfaceC3445b) AbstractC3689v.r0(collectionJ);
        boolean z10 = false;
        if (interfaceC3444a != null && interfaceC3444a.d()) {
            z10 = true;
        }
        this.f10791e = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC7346d0 g(Mh.k kVar, c cVar) {
        AbstractC7346d0 abstractC7346d0U = kVar.d().q().o(cVar.e()).u();
        AbstractC6492s.h(abstractC7346d0U, "getDefaultType(...)");
        return abstractC7346d0U;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    public Map a() {
        return U.h();
    }

    protected final InterfaceC3445b c() {
        return this.f10790d;
    }

    @Override // Lh.g
    public boolean d() {
        return this.f10791e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    public Zh.c e() {
        return this.f10787a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public AbstractC7346d0 getType() {
        return (AbstractC7346d0) oi.m.a(this.f10789c, this, f10786f[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    public g0 j() {
        return this.f10788b;
    }
}
