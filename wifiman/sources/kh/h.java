package Kh;

import Qh.InterfaceC3444a;
import Yg.z;
import Zg.U;
import di.x;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import kotlin.reflect.jvm.internal.impl.builtins.o;

/* loaded from: classes4.dex */
public final class h extends c {

    /* renamed from: h, reason: collision with root package name */
    static final /* synthetic */ th.l[] f10802h = {O.h(new F(O.b(h.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    /* renamed from: g, reason: collision with root package name */
    private final oi.i f10803g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(InterfaceC3444a interfaceC3444a, Mh.k c10) {
        super(c10, interfaceC3444a, o.a.f51892y);
        AbstractC6492s.i(c10, "c");
        this.f10803g = c10.e().f(g.f10801a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map i() {
        return U.e(z.a(d.f10792a.b(), new x("Deprecated in Java")));
    }

    @Override // Kh.c, kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    public Map a() {
        return (Map) oi.m.a(this.f10803g, this, f10802h[0]);
    }
}
