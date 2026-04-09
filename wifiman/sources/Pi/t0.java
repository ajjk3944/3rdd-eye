package pi;

import kotlin.jvm.internal.AbstractC6492s;
import ri.InterfaceC7618i;

/* loaded from: classes4.dex */
public abstract class t0 {
    public static final InterfaceC7375w a(S s10) {
        AbstractC6492s.i(s10, "<this>");
        InterfaceC7618i interfaceC7618iQ0 = s10.Q0();
        InterfaceC7375w interfaceC7375w = interfaceC7618iQ0 instanceof InterfaceC7375w ? (InterfaceC7375w) interfaceC7618iQ0 : null;
        if (interfaceC7375w == null || !interfaceC7375w.B0()) {
            return null;
        }
        return interfaceC7375w;
    }

    public static final boolean b(S s10) {
        AbstractC6492s.i(s10, "<this>");
        InterfaceC7618i interfaceC7618iQ0 = s10.Q0();
        InterfaceC7375w interfaceC7375w = interfaceC7618iQ0 instanceof InterfaceC7375w ? (InterfaceC7375w) interfaceC7618iQ0 : null;
        if (interfaceC7375w != null) {
            return interfaceC7375w.B0();
        }
        return false;
    }
}
