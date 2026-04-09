package Jh;

import Bh.InterfaceC2491a;
import Bh.InterfaceC2495e;
import Bh.Y;
import Nh.AbstractC3377d;
import bi.j;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: Jh.s, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3124s implements bi.j {
    @Override // bi.j
    public j.a a() {
        return j.a.BOTH;
    }

    @Override // bi.j
    public j.b b(InterfaceC2491a superDescriptor, InterfaceC2491a subDescriptor, InterfaceC2495e interfaceC2495e) {
        AbstractC6492s.i(superDescriptor, "superDescriptor");
        AbstractC6492s.i(subDescriptor, "subDescriptor");
        if (!(subDescriptor instanceof Y) || !(superDescriptor instanceof Y)) {
            return j.b.UNKNOWN;
        }
        Y y10 = (Y) subDescriptor;
        Y y11 = (Y) superDescriptor;
        return !AbstractC6492s.d(y10.getName(), y11.getName()) ? j.b.UNKNOWN : (AbstractC3377d.a(y10) && AbstractC3377d.a(y11)) ? j.b.OVERRIDABLE : (AbstractC3377d.a(y10) || AbstractC3377d.a(y11)) ? j.b.INCOMPATIBLE : j.b.UNKNOWN;
    }
}
