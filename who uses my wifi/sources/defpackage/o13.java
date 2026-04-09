package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class o13 {
    public final ym a;
    public final t83 b;
    public final eb3 c;
    public final LinkedHashMap d = new LinkedHashMap();
    public final boolean e = ((Boolean) tw1.e.c.a(mz1.h7)).booleanValue();
    public final e03 f;
    public boolean g;
    public long h;
    public long i;

    public o13(ym ymVar, t83 t83Var, e03 e03Var, eb3 eb3Var) {
        this.a = ymVar;
        this.b = t83Var;
        this.f = e03Var;
        this.c = eb3Var;
    }

    public final synchronized void a(List list) {
        this.a.getClass();
        this.i = SystemClock.elapsedRealtime();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a83 a83Var = (a83) it.next();
            String str = a83Var.w;
            if (!TextUtils.isEmpty(str)) {
                this.d.put(a83Var, new n13(str, a83Var.f0, Integer.MAX_VALUE, 0L, null));
            }
        }
    }

    public final synchronized void b(h83 h83Var, a83 a83Var, n70 n70Var, db3 db3Var) {
        c83 c83Var = (c83) h83Var.b.g;
        this.a.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        String str = a83Var.w;
        if (str != null) {
            this.d.put(a83Var, new n13(str, a83Var.f0, 9, 0L, null));
            m13 m13Var = new m13(this, jElapsedRealtime, c83Var, a83Var, str, db3Var, h83Var);
            n70Var.c(new jq3(n70Var, m13Var, 0), md2.g);
        }
    }

    public final synchronized void c(a83 a83Var) {
        n13 n13Var = (n13) this.d.get(a83Var);
        if (n13Var == null || this.g) {
            return;
        }
        n13Var.c = 8;
    }

    public final synchronized String d() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator it = this.d.entrySet().iterator();
            while (it.hasNext()) {
                n13 n13Var = (n13) ((Map.Entry) it.next()).getValue();
                if (n13Var.c != Integer.MAX_VALUE) {
                    arrayList.add(n13Var.toString());
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return TextUtils.join("_", arrayList);
    }
}
