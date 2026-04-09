package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class S extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public g0 f5377a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f5378b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5379c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f5380d;

    public S(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5378b = new Rect();
        this.f5379c = true;
        this.f5380d = false;
    }

    public S(int i, int i3) {
        super(i, i3);
        this.f5378b = new Rect();
        this.f5379c = true;
        this.f5380d = false;
    }

    public S(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f5378b = new Rect();
        this.f5379c = true;
        this.f5380d = false;
    }

    public S(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f5378b = new Rect();
        this.f5379c = true;
        this.f5380d = false;
    }

    public S(S s5) {
        super((ViewGroup.LayoutParams) s5);
        this.f5378b = new Rect();
        this.f5379c = true;
        this.f5380d = false;
    }
}
