package g;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: g.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5837a {

    /* renamed from: g.a$a, reason: collision with other inner class name */
    public static final class C1765a {

        /* renamed from: a, reason: collision with root package name */
        private final Object f47362a;

        public C1765a(Object obj) {
            this.f47362a = obj;
        }

        public final Object a() {
            return this.f47362a;
        }
    }

    public abstract Intent a(Context context, Object obj);

    public C1765a b(Context context, Object obj) {
        AbstractC6492s.i(context, "context");
        return null;
    }

    public abstract Object c(int i10, Intent intent);
}
