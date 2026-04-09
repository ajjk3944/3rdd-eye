package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class m0 {

    /* renamed from: a, reason: collision with root package name */
    public final f1 f1452a;

    /* renamed from: b, reason: collision with root package name */
    public int f1453b = LinearLayoutManager.INVALID_OFFSET;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f1454c = new Rect();

    public m0(f1 f1Var) {
        this.f1452a = f1Var;
    }

    public static m0 a(f1 f1Var, int i4) {
        if (i4 == 0) {
            return new l0(f1Var, 0);
        }
        if (i4 == 1) {
            return new l0(f1Var, 1);
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

    public abstract void o(int i4);
}
