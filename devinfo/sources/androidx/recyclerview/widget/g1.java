package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class g1 extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public x1 f1374a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f1375b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1376c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1377d;

    public g1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1375b = new Rect();
        this.f1376c = true;
        this.f1377d = false;
    }

    public g1(int i4, int i10) {
        super(i4, i10);
        this.f1375b = new Rect();
        this.f1376c = true;
        this.f1377d = false;
    }

    public g1(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f1375b = new Rect();
        this.f1376c = true;
        this.f1377d = false;
    }

    public g1(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f1375b = new Rect();
        this.f1376c = true;
        this.f1377d = false;
    }

    public g1(g1 g1Var) {
        super((ViewGroup.LayoutParams) g1Var);
        this.f1375b = new Rect();
        this.f1376c = true;
        this.f1377d = false;
    }
}
