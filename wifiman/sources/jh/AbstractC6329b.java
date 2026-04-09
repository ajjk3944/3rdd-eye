package jh;

import Yg.AbstractC3663g;
import java.io.Closeable;

/* renamed from: jh.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6329b {
    public static final void a(Closeable closeable, Throwable th2) {
        if (closeable != null) {
            if (th2 == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th3) {
                AbstractC3663g.a(th2, th3);
            }
        }
    }
}
