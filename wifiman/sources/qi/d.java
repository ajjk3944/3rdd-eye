package Qi;

import Ii.L;
import Yg.AbstractC3663g;
import dh.InterfaceC5384i;
import java.util.concurrent.CancellationException;

/* loaded from: classes4.dex */
public abstract class d {
    public static final void a(Throwable th2, InterfaceC5384i interfaceC5384i) {
        if (th2 instanceof CancellationException) {
            return;
        }
        try {
            Eg.a.v(th2);
        } catch (Throwable th3) {
            AbstractC3663g.a(th2, th3);
            L.a(interfaceC5384i, th2);
        }
    }
}
