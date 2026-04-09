package Mh;

import Bh.InterfaceC2495e;
import gi.C5921c;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class o implements n {

    /* renamed from: a, reason: collision with root package name */
    public C5921c f13223a;

    @Override // Mh.n
    public InterfaceC2495e a(Qh.g javaClass) {
        AbstractC6492s.i(javaClass, "javaClass");
        return b().b(javaClass);
    }

    public final C5921c b() {
        C5921c c5921c = this.f13223a;
        if (c5921c != null) {
            return c5921c;
        }
        AbstractC6492s.v("resolver");
        return null;
    }

    public final void c(C5921c c5921c) {
        AbstractC6492s.i(c5921c, "<set-?>");
        this.f13223a = c5921c;
    }
}
