package Kh;

import Qh.InterfaceC3444a;
import Qh.InterfaceC3445b;
import Yg.z;
import Zg.AbstractC3689v;
import Zg.U;
import di.AbstractC5398g;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import kotlin.reflect.jvm.internal.impl.builtins.o;

/* loaded from: classes4.dex */
public final class n extends c {

    /* renamed from: h, reason: collision with root package name */
    static final /* synthetic */ th.l[] f10810h = {O.h(new F(O.b(n.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    /* renamed from: g, reason: collision with root package name */
    private final oi.i f10811g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(InterfaceC3444a annotation, Mh.k c10) {
        super(c10, annotation, o.a.f51817H);
        AbstractC6492s.i(annotation, "annotation");
        AbstractC6492s.i(c10, "c");
        this.f10811g = c10.e().f(new m(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map i(n nVar) {
        InterfaceC3445b interfaceC3445bC = nVar.c();
        AbstractC5398g abstractC5398gD = interfaceC3445bC instanceof Qh.e ? f.f10798a.d(((Qh.e) nVar.c()).e()) : interfaceC3445bC instanceof Qh.m ? f.f10798a.d(AbstractC3689v.e(nVar.c())) : null;
        Map mapE = abstractC5398gD != null ? U.e(z.a(d.f10792a.d(), abstractC5398gD)) : null;
        return mapE == null ? U.h() : mapE;
    }

    @Override // Kh.c, kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    public Map a() {
        return (Map) oi.m.a(this.f10811g, this, f10810h[0]);
    }
}
