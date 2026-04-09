package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;

/* loaded from: classes.dex */
public abstract class A {

    /* renamed from: a, reason: collision with root package name */
    public final Q f5272a;

    /* renamed from: b, reason: collision with root package name */
    public int f5273b = LinearLayoutManager.INVALID_OFFSET;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f5274c = new Rect();

    public A(Q q3) {
        this.f5272a = q3;
    }

    public static A a(Q q3, int i) {
        if (i == 0) {
            return new C0328z(q3, 0);
        }
        if (i == 1) {
            return new C0328z(q3, 1);
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
}
