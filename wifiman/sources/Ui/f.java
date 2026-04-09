package ui;

import Bh.InterfaceC2515z;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public interface f {

    public static final class a {
        public static String a(f fVar, InterfaceC2515z functionDescriptor) {
            AbstractC6492s.i(functionDescriptor, "functionDescriptor");
            if (fVar.b(functionDescriptor)) {
                return null;
            }
            return fVar.a();
        }
    }

    String a();

    boolean b(InterfaceC2515z interfaceC2515z);

    String c(InterfaceC2515z interfaceC2515z);
}
