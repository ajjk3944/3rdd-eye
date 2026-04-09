package androidx.work;

import android.content.Context;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class r {
    public static r d(Context context) {
        return d2.j.k(context);
    }

    public static void e(Context context, a aVar) {
        d2.j.e(context, aVar);
    }

    public abstract m a(String str);

    public final m b(s sVar) {
        return c(Collections.singletonList(sVar));
    }

    public abstract m c(List list);
}
