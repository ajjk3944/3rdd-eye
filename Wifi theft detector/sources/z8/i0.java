package z8;

import java.util.Collections;
import java.util.Set;
import kotlin.collections.builders.SetBuilder;

/* loaded from: classes4.dex */
public abstract class i0 {
    public static Set a(Set builder) {
        kotlin.jvm.internal.p.e(builder, "builder");
        return ((SetBuilder) builder).g();
    }

    public static Set b(int i10) {
        return new SetBuilder(i10);
    }

    public static Set c(Object obj) {
        Set setSingleton = Collections.singleton(obj);
        kotlin.jvm.internal.p.d(setSingleton, "singleton(...)");
        return setSingleton;
    }
}
