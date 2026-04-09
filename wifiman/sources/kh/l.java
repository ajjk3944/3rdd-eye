package Kh;

import Qh.InterfaceC3444a;
import Yg.z;
import Zg.U;
import di.AbstractC5398g;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import kotlin.reflect.jvm.internal.impl.builtins.o;

/* loaded from: classes4.dex */
public final class l extends c {

    /* renamed from: h, reason: collision with root package name */
    static final /* synthetic */ th.l[] f10807h = {O.h(new F(O.b(l.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    /* renamed from: g, reason: collision with root package name */
    private final oi.i f10808g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(InterfaceC3444a annotation, Mh.k c10) {
        super(c10, annotation, o.a.f51825L);
        AbstractC6492s.i(annotation, "annotation");
        AbstractC6492s.i(c10, "c");
        this.f10808g = c10.e().f(new k(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map i(l lVar) {
        AbstractC5398g abstractC5398gB = f.f10798a.b(lVar.c());
        Map mapE = abstractC5398gB != null ? U.e(z.a(d.f10792a.c(), abstractC5398gB)) : null;
        return mapE == null ? U.h() : mapE;
    }

    @Override // Kh.c, kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    public Map a() {
        return (Map) oi.m.a(this.f10808g, this, f10807h[0]);
    }
}
