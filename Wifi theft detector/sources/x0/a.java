package x0;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewGroupKt;
import androidx.core.view.ViewKt;
import java.util.Iterator;
import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f24869a = c.pooling_container_listener_holder_tag;

    /* renamed from: b, reason: collision with root package name */
    public static final int f24870b = c.is_pooling_container_tag;

    public static final void a(View view) {
        p.e(view, "<this>");
        Iterator it = ViewKt.a(view).iterator();
        while (it.hasNext()) {
            c((View) it.next()).a();
        }
    }

    public static final void b(ViewGroup viewGroup) {
        p.e(viewGroup, "<this>");
        Iterator it = ViewGroupKt.a(viewGroup).iterator();
        while (it.hasNext()) {
            c((View) it.next()).a();
        }
    }

    public static final b c(View view) {
        int i10 = f24869a;
        b bVar = (b) view.getTag(i10);
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b();
        view.setTag(i10, bVar2);
        return bVar2;
    }

    public static final void d(View view, boolean z10) {
        p.e(view, "<this>");
        view.setTag(f24870b, Boolean.valueOf(z10));
    }
}
