package ig;

import zg.AbstractC8755h;

/* renamed from: ig.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6152a {
    public static RuntimeException a(Throwable th2) {
        throw AbstractC8755h.h(th2);
    }

    public static void b(Throwable th2) {
        if (th2 instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th2);
        }
        if (th2 instanceof ThreadDeath) {
            throw ((ThreadDeath) th2);
        }
        if (th2 instanceof LinkageError) {
            throw ((LinkageError) th2);
        }
    }
}
