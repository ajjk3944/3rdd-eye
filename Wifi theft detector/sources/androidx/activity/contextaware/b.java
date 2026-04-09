package androidx.activity.contextaware;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Set f258a = new CopyOnWriteArraySet();

    /* renamed from: b, reason: collision with root package name */
    public volatile Context f259b;

    public final void a(d listener) {
        p.e(listener, "listener");
        Context context = this.f259b;
        if (context != null) {
            listener.a(context);
        }
        this.f258a.add(listener);
    }

    public final void b() {
        this.f259b = null;
    }

    public final void c(Context context) {
        p.e(context, "context");
        this.f259b = context;
        Iterator it = this.f258a.iterator();
        while (it.hasNext()) {
            ((d) it.next()).a(context);
        }
    }

    public final Context d() {
        return this.f259b;
    }

    public final void e(d listener) {
        p.e(listener, "listener");
        this.f258a.remove(listener);
    }
}
