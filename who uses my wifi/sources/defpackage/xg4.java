package defpackage;

import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class xg4 extends pg4 {
    public final HashMap h = new HashMap();
    public Handler i;
    public ws3 j;

    @Override // defpackage.pg4
    public final void g() {
        for (wg4 wg4Var : this.h.values()) {
            wg4Var.a.o(wg4Var.b);
        }
    }

    @Override // defpackage.pg4
    public final void i() {
        for (wg4 wg4Var : this.h.values()) {
            wg4Var.a.p(wg4Var.b);
        }
    }

    @Override // defpackage.pg4
    public void j() {
        HashMap map = this.h;
        for (wg4 wg4Var : map.values()) {
            pg4 pg4Var = wg4Var.a;
            pg4Var.q(wg4Var.b);
            vg4 vg4Var = wg4Var.c;
            pg4Var.l(vg4Var);
            pg4Var.m(vg4Var);
        }
        map.clear();
    }

    @Override // defpackage.pg4
    public void r() {
        Iterator it = this.h.values().iterator();
        while (it.hasNext()) {
            ((wg4) it.next()).a.r();
        }
    }

    public abstract void s(Object obj, pg4 pg4Var, oz1 oz1Var);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [lh4, sg4] */
    public final void t(final Integer num, pg4 pg4Var) {
        HashMap map = this.h;
        zt0.D(!map.containsKey(num));
        ?? r1 = new lh4() { // from class: sg4
            @Override // defpackage.lh4
            public final /* synthetic */ void a(pg4 pg4Var2, oz1 oz1Var) {
                this.a.s(num, pg4Var2, oz1Var);
            }
        };
        vg4 vg4Var = new vg4(this, num);
        map.put(num, new wg4(pg4Var, r1, vg4Var));
        Handler handler = this.i;
        handler.getClass();
        wt2 wt2Var = pg4Var.c;
        wt2Var.getClass();
        ((CopyOnWriteArrayList) wt2Var.h).add(new mh4(handler, vg4Var));
        this.i.getClass();
        lv2 lv2Var = pg4Var.d;
        lv2Var.getClass();
        ((CopyOnWriteArrayList) lv2Var.h).add(new jf4(vg4Var));
        ws3 ws3Var = this.j;
        xd4 xd4Var = this.g;
        xd4Var.getClass();
        pg4Var.n(r1, ws3Var, xd4Var);
        if (this.b.isEmpty()) {
            pg4Var.p(r1);
        }
    }

    public abstract kh4 v(Object obj, kh4 kh4Var);

    public void u(Object obj) {
    }

    public void w(long j, Object obj) {
    }
}
