package h7;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class z0 extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public n1 f10292a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f10293b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f10294c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f10295d;

    public z0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10293b = new Rect();
        this.f10294c = true;
        this.f10295d = false;
    }

    public z0(int i10, int i11) {
        super(i10, i11);
        this.f10293b = new Rect();
        this.f10294c = true;
        this.f10295d = false;
    }

    public z0(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f10293b = new Rect();
        this.f10294c = true;
        this.f10295d = false;
    }

    public z0(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f10293b = new Rect();
        this.f10294c = true;
        this.f10295d = false;
    }

    public z0(z0 z0Var) {
        super((ViewGroup.LayoutParams) z0Var);
        this.f10293b = new Rect();
        this.f10294c = true;
        this.f10295d = false;
    }
}
