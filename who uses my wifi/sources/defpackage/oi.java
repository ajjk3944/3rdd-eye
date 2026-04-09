package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class oi {
    public static final /* synthetic */ int f = 0;
    public final l01 a;
    public final Context b;
    public final Object c = new Object();
    public final LinkedHashSet d = new LinkedHashSet();
    public Object e;

    static {
        h80.f("ConstraintTracker");
    }

    public oi(Context context, l01 l01Var) {
        this.b = context.getApplicationContext();
        this.a = l01Var;
    }

    public abstract Object a();

    public final void b(zh zhVar) {
        synchronized (this.c) {
            try {
                if (this.d.remove(zhVar) && this.d.isEmpty()) {
                    e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(Object obj) {
        synchronized (this.c) {
            try {
                Object obj2 = this.e;
                if (obj2 != obj && (obj2 == null || !obj2.equals(obj))) {
                    this.e = obj;
                    ((ia1) ((xb4) this.a).i).execute(new jq3(this, new ArrayList(this.d), 6, false));
                }
            } finally {
            }
        }
    }

    public abstract void d();

    public abstract void e();
}
