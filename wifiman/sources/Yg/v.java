package Yg;

import Yg.u;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public abstract class v {
    public static final Object a(Throwable exception) {
        AbstractC6492s.i(exception, "exception");
        return new u.b(exception);
    }

    public static final void b(Object obj) {
        if (obj instanceof u.b) {
            throw ((u.b) obj).f25019a;
        }
    }
}
