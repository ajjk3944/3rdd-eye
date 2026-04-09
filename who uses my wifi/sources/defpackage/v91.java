package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class v91 implements yh {
    public static final /* synthetic */ int d = 0;
    public final u91 a;
    public final zh[] b;
    public final Object c;

    static {
        h80.f("WorkConstraintsTracker");
    }

    public v91(Context context, l01 l01Var, u91 u91Var) {
        Context applicationContext = context.getApplicationContext();
        this.a = u91Var;
        this.b = new zh[]{new sa((ta) p21.o(applicationContext, l01Var).f, 0), new sa((ua) p21.o(applicationContext, l01Var).g, 1), new sa((ky0) p21.o(applicationContext, l01Var).i, 4), new sa((zg0) p21.o(applicationContext, l01Var).h, 2), new sa((zg0) p21.o(applicationContext, l01Var).h, 3), new xg0((zg0) p21.o(applicationContext, l01Var).h), new wg0((zg0) p21.o(applicationContext, l01Var).h)};
        this.c = new Object();
    }

    public final boolean a(String str) {
        synchronized (this.c) {
            try {
                for (zh zhVar : this.b) {
                    Object obj = zhVar.b;
                    if (obj != null && zhVar.b(obj) && zhVar.a.contains(str)) {
                        h80.d().a(new Throwable[0]);
                        return false;
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Collection collection) {
        synchronized (this.c) {
            try {
                for (zh zhVar : this.b) {
                    if (zhVar.d != null) {
                        zhVar.d = null;
                        zhVar.d(null, zhVar.b);
                    }
                }
                for (zh zhVar2 : this.b) {
                    zhVar2.c(collection);
                }
                for (zh zhVar3 : this.b) {
                    if (zhVar3.d != this) {
                        zhVar3.d = this;
                        zhVar3.d(this, zhVar3.b);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        synchronized (this.c) {
            try {
                for (zh zhVar : this.b) {
                    ArrayList arrayList = zhVar.a;
                    if (!arrayList.isEmpty()) {
                        arrayList.clear();
                        zhVar.c.b(zhVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
