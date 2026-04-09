package defpackage;

import android.os.Handler;
import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class d13 {
    public static final ArrayList b = new ArrayList(50);
    public final Handler a;

    public d13(Handler handler) {
        this.a = handler;
    }

    public static /* synthetic */ void e(v03 v03Var) {
        ArrayList arrayList = b;
        synchronized (arrayList) {
            try {
                if (arrayList.size() < 50) {
                    arrayList.add(v03Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static v03 f() {
        v03 v03Var;
        ArrayList arrayList = b;
        synchronized (arrayList) {
            try {
                v03Var = arrayList.isEmpty() ? new v03() : (v03) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return v03Var;
    }

    public final v03 a(int i, Object obj) {
        v03 v03VarF = f();
        v03VarF.a = this.a.obtainMessage(i, obj);
        return v03VarF;
    }

    public final boolean b(int i) {
        return this.a.sendEmptyMessage(i);
    }

    public final void c(int i) {
        this.a.removeMessages(i);
    }

    public final boolean d(Runnable runnable) {
        return this.a.post(runnable);
    }
}
