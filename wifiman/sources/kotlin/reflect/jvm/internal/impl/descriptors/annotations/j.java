package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public abstract class j {
    public static final h a(h first, h second) {
        AbstractC6492s.i(first, "first");
        AbstractC6492s.i(second, "second");
        return first.isEmpty() ? second : second.isEmpty() ? first : new o(first, second);
    }
}
