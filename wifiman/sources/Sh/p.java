package Sh;

import kotlin.jvm.internal.AbstractC6492s;
import li.InterfaceC6646x;
import pi.AbstractC7346d0;
import pi.S;
import pi.V;

/* loaded from: classes4.dex */
public final class p implements InterfaceC6646x {

    /* renamed from: a, reason: collision with root package name */
    public static final p f20786a = new p();

    private p() {
    }

    @Override // li.InterfaceC6646x
    public S a(Uh.q proto, String flexibleId, AbstractC7346d0 lowerBound, AbstractC7346d0 upperBound) {
        AbstractC6492s.i(proto, "proto");
        AbstractC6492s.i(flexibleId, "flexibleId");
        AbstractC6492s.i(lowerBound, "lowerBound");
        AbstractC6492s.i(upperBound, "upperBound");
        return !AbstractC6492s.d(flexibleId, "kotlin.jvm.PlatformType") ? kotlin.reflect.jvm.internal.impl.types.error.l.d(kotlin.reflect.jvm.internal.impl.types.error.k.ERROR_FLEXIBLE_TYPE, flexibleId, lowerBound.toString(), upperBound.toString()) : proto.S(Xh.a.f24348g) ? new Oh.k(lowerBound, upperBound) : V.e(lowerBound, upperBound);
    }
}
