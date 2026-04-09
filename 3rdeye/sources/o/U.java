package o;

import android.content.Context;
import android.content.ContextWrapper;

/* compiled from: TintContextWrapper.java */
/* loaded from: classes.dex */
public final class U extends ContextWrapper {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f44602a = null;

    public static void a(Context context) {
        if ((context instanceof U) || (context.getResources() instanceof W)) {
            return;
        }
        context.getResources();
        int i = e0.f44658a;
    }
}
