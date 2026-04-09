package h7;

import android.graphics.Rect;
import android.view.View;

/* loaded from: classes.dex */
public abstract class j0 {

    /* renamed from: a, reason: collision with root package name */
    public int f10098a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f10099b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f10100c;

    public j0(y0 y0Var) {
        this.f10098a = Integer.MIN_VALUE;
        this.f10100c = new Rect();
        this.f10099b = y0Var;
    }

    public static j0 a(y0 y0Var, int i10) {
        if (i10 == 0) {
            return new i0(y0Var, 0);
        }
        if (i10 == 1) {
            return new i0(y0Var, 1);
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

    public abstract void o(int i10);

    public j0(j4.g gVar) {
        this.f10098a = 0;
        this.f10100c = new j4.c();
        this.f10099b = gVar;
    }
}
