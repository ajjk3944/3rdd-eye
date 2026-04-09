package y6;

import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6839p;

/* renamed from: y6.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC8616e {
    public static final Object a(Object obj, Object obj2, InterfaceC6839p onNotNull) {
        AbstractC6492s.i(onNotNull, "onNotNull");
        if (obj == null || obj2 == null) {
            return null;
        }
        return onNotNull.invoke(obj, obj2);
    }
}
