package defpackage;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class zj3 implements yj3, ng3 {
    public final /* synthetic */ int a;
    public final Context b;
    public final gk3 c;
    public final pq3 d;
    public final vf3 e;
    public final AtomicBoolean f;
    public n70 g;

    public zj3(Context context, gk3 gk3Var, vf3 vf3Var, pq3 pq3Var) {
        this.a = 0;
        this.f = new AtomicBoolean(false);
        this.g = pu1.r("E");
        this.b = context;
        this.c = gk3Var;
        this.e = vf3Var;
        this.d = pq3Var;
    }

    @Override // defpackage.ng3
    public final n70 a() {
        switch (this.a) {
            case 0:
                if (this.f.getAndSet(true)) {
                    return lq3.g;
                }
                return ((ld2) this.d).c(new w53(9, this));
            default:
                if (this.f.getAndSet(true) || !this.e.F()) {
                    return lq3.g;
                }
                return ((ld2) this.d).a(new bh3(1, this));
        }
    }

    @Override // defpackage.yj3
    public final void b(HashMap map, Context context, View view) {
        switch (this.a) {
            case 0:
                e(map);
                break;
            default:
                map.put("gs", this.g);
                break;
        }
    }

    @Override // defpackage.yj3
    public final void c(HashMap map) {
        switch (this.a) {
            case 0:
                e(map);
                break;
            default:
                map.put("gs", this.g);
                break;
        }
    }

    @Override // defpackage.yj3
    public final void d(HashMap map) {
        switch (this.a) {
            case 0:
                e(map);
                break;
            default:
                map.put("gs", this.g);
                break;
        }
    }

    public void e(HashMap map) {
        synchronized (this) {
            map.put("ai", this.g);
        }
    }

    public zj3(Context context, gk3 gk3Var, pq3 pq3Var, vf3 vf3Var) {
        this.a = 1;
        this.f = new AtomicBoolean(false);
        this.g = lq3.g;
        this.b = context;
        this.c = gk3Var;
        this.d = pq3Var;
        this.e = vf3Var;
    }
}
