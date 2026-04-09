package defpackage;

import android.graphics.Rect;
import android.view.View;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class nr {
    public int a;
    public final Object b;
    public final Object c;

    public nr(ho0 ho0Var) {
        this.a = Integer.MIN_VALUE;
        this.c = new Rect();
        this.b = ho0Var;
    }

    public static nr a(ho0 ho0Var, int i) {
        if (i == 0) {
            return new vj0(ho0Var, 0);
        }
        if (i == 1) {
            return new vj0(ho0Var, 1);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m(View view);

    public abstract int n(View view);

    public abstract void o(int i);

    public nr(qr qrVar) {
        this.a = 0;
        this.c = new cn();
        this.b = qrVar;
    }
}
