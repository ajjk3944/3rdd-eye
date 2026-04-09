package K1;

import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f10257a = new ArrayList();

    public final void a(b listener) {
        AbstractC6492s.i(listener, "listener");
        this.f10257a.add(listener);
    }

    public final void b(b listener) {
        AbstractC6492s.i(listener, "listener");
        this.f10257a.remove(listener);
    }
}
