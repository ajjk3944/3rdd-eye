package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: OrientationHelper.java */
/* loaded from: classes.dex */
public abstract class A {

    /* renamed from: a, reason: collision with root package name */
    public final RecyclerView.p f16364a;

    /* renamed from: b, reason: collision with root package name */
    public int f16365b = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f16366c = new Rect();

    public A(RecyclerView.p pVar) {
        this.f16364a = pVar;
    }

    public static A a(RecyclerView.p pVar, int i) {
        if (i == 0) {
            return new y(pVar);
        }
        if (i == 1) {
            return new z(pVar);
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
