package pi;

import java.io.IOException;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC6492s;
import ri.InterfaceC7619j;
import ri.InterfaceC7620k;

/* renamed from: pi.d0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC7346d0 extends M0 implements InterfaceC7619j, InterfaceC7620k {
    public AbstractC7346d0() {
        super(null);
    }

    public abstract AbstractC7346d0 U0(boolean z10);

    public abstract AbstractC7346d0 V0(r0 r0Var);

    public String toString() throws IOException {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = getAnnotations().iterator();
        while (it.hasNext()) {
            kotlin.text.t.m(sb2, "[", kotlin.reflect.jvm.internal.impl.renderer.n.Q(kotlin.reflect.jvm.internal.impl.renderer.n.f52071k, (kotlin.reflect.jvm.internal.impl.descriptors.annotations.c) it.next(), null, 2, null), "] ");
        }
        sb2.append(N0());
        if (!L0().isEmpty()) {
            Zg.H.w0(L0(), sb2, (112 & 2) != 0 ? ", " : ", ", (112 & 4) != 0 ? "" : "<", (112 & 8) == 0 ? ">" : "", (112 & 16) != 0 ? -1 : 0, (112 & 32) != 0 ? "..." : null, (112 & 64) != 0 ? null : null);
        }
        if (O0()) {
            sb2.append("?");
        }
        String string = sb2.toString();
        AbstractC6492s.h(string, "toString(...)");
        return string;
    }
}
