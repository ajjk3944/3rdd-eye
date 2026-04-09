package defpackage;

import android.os.Looper;
import android.view.View;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class nf0 {
    public static final Object k = new Object();
    public final Object a = new Object();
    public final os0 b = new os0();
    public int c = 0;
    public boolean d;
    public volatile Object e;
    public volatile Object f;
    public int g;
    public boolean h;
    public boolean i;
    public final a9 j;

    public nf0() {
        Object obj = k;
        this.f = obj;
        this.j = new a9(10, this);
        this.e = obj;
        this.g = -1;
    }

    public static void a(String str) {
        j8.T().D.getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(ex0.h("Cannot invoke ", str, " on a background thread"));
        }
    }

    public final void b(t70 t70Var) {
        if (t70Var.b) {
            int i = t70Var.c;
            int i2 = this.g;
            if (i >= i2) {
                return;
            }
            t70Var.c = i2;
            ug0 ug0Var = t70Var.a;
            Object obj = this.e;
            ug0Var.getClass();
            b60 b60Var = (b60) obj;
            xo xoVar = (xo) ug0Var.g;
            if (b60Var == null || !xoVar.g0) {
                return;
            }
            View viewH = xoVar.H();
            if (viewH.getParent() != null) {
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
            if (xoVar.k0 != null) {
                if (xw.F(3)) {
                    Objects.toString(xoVar.k0);
                }
                xoVar.k0.setContentView(viewH);
            }
        }
    }

    public final void c(t70 t70Var) {
        if (this.h) {
            this.i = true;
            return;
        }
        this.h = true;
        do {
            this.i = false;
            if (t70Var != null) {
                b(t70Var);
                t70Var = null;
            } else {
                os0 os0Var = this.b;
                os0Var.getClass();
                ms0 ms0Var = new ms0(os0Var);
                os0Var.h.put(ms0Var, Boolean.FALSE);
                while (ms0Var.hasNext()) {
                    b((t70) ((Map.Entry) ms0Var.next()).getValue());
                    if (this.i) {
                        break;
                    }
                }
            }
        } while (this.i);
        this.h = false;
    }

    public final void d(Object obj) {
        a("setValue");
        this.g++;
        this.e = obj;
        c(null);
    }
}
