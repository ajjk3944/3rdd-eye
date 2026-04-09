package Zg;

import ah.C3858h;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;
import kotlin.jvm.internal.AbstractC6492s;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public abstract class e0 {
    public static Set a(Set builder) {
        AbstractC6492s.i(builder, "builder");
        return ((C3858h) builder).j();
    }

    public static Set b() {
        return new C3858h();
    }

    public static Set c(Object obj) {
        Set setSingleton = Collections.singleton(obj);
        AbstractC6492s.h(setSingleton, "singleton(...)");
        return setSingleton;
    }

    public static TreeSet d(Object... elements) {
        AbstractC6492s.i(elements, "elements");
        return (TreeSet) AbstractC3686s.W0(elements, new TreeSet());
    }
}
