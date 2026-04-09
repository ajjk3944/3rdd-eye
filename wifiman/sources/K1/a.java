package K1;

import F1.AbstractC2739b0;
import android.view.View;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static final int f10255a = d.f10259b;

    /* renamed from: b, reason: collision with root package name */
    private static final int f10256b = d.f10258a;

    public static final void a(View view, b listener) {
        AbstractC6492s.i(view, "<this>");
        AbstractC6492s.i(listener, "listener");
        b(view).a(listener);
    }

    private static final c b(View view) {
        int i10 = f10255a;
        c cVar = (c) view.getTag(i10);
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c();
        view.setTag(i10, cVar2);
        return cVar2;
    }

    public static final boolean c(View view) {
        AbstractC6492s.i(view, "<this>");
        Object tag = view.getTag(f10256b);
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean d(View view) {
        AbstractC6492s.i(view, "<this>");
        for (Object obj : AbstractC2739b0.a(view)) {
            if ((obj instanceof View) && c((View) obj)) {
                return true;
            }
        }
        return false;
    }

    public static final void e(View view, b listener) {
        AbstractC6492s.i(view, "<this>");
        AbstractC6492s.i(listener, "listener");
        b(view).b(listener);
    }
}
