package e;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: e.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5406a {

    /* renamed from: a, reason: collision with root package name */
    private final Set f46119a = new CopyOnWriteArraySet();

    /* renamed from: b, reason: collision with root package name */
    private volatile Context f46120b;

    public final void a(InterfaceC5407b listener) {
        AbstractC6492s.i(listener, "listener");
        Context context = this.f46120b;
        if (context != null) {
            listener.a(context);
        }
        this.f46119a.add(listener);
    }

    public final void b() {
        this.f46120b = null;
    }

    public final void c(Context context) {
        AbstractC6492s.i(context, "context");
        this.f46120b = context;
        Iterator it = this.f46119a.iterator();
        while (it.hasNext()) {
            ((InterfaceC5407b) it.next()).a(context);
        }
    }
}
