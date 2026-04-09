package f2;

import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;

/* renamed from: f2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5507f {
    public static final C5506e a(String name, InterfaceC6835l builder) {
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(builder, "builder");
        C5510i c5510i = new C5510i();
        builder.invoke(c5510i);
        return new C5506e(name, c5510i.a());
    }
}
