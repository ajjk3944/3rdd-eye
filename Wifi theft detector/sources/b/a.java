package b;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: b.a$a, reason: collision with other inner class name */
    public static final class C0056a {

        /* renamed from: a, reason: collision with root package name */
        public final Object f4540a;

        public C0056a(Object obj) {
            this.f4540a = obj;
        }

        public final Object a() {
            return this.f4540a;
        }
    }

    public abstract Intent a(Context context, Object obj);

    public C0056a b(Context context, Object obj) {
        p.e(context, "context");
        return null;
    }

    public abstract Object c(int i10, Intent intent);
}
