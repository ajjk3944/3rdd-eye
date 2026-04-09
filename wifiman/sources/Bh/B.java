package Bh;

import f.AbstractC5487d;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.reflect.jvm.internal.impl.descriptors.InvalidModuleException;

/* loaded from: classes4.dex */
public abstract class B {

    /* renamed from: a, reason: collision with root package name */
    private static final F f1751a = new F("InvalidModuleNotifier");

    public static final void a(G g10) {
        AbstractC6492s.i(g10, "<this>");
        AbstractC5487d.a(g10.b0(f1751a));
        throw new InvalidModuleException("Accessing invalid module descriptor " + g10);
    }
}
