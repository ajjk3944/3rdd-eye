package B3;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.apm.insight.R;
import d3.AbstractC2266a;
import x3.AbstractC2993B;

/* loaded from: classes.dex */
public final class l extends e {

    /* renamed from: o, reason: collision with root package name */
    public int f612o;

    /* renamed from: p, reason: collision with root package name */
    public int f613p;

    /* renamed from: q, reason: collision with root package name */
    public int f614q;

    /* renamed from: r, reason: collision with root package name */
    public int f615r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f616s;

    public l(Context context, AttributeSet attributeSet, int i, int i3) throws Resources.NotFoundException {
        super(context, attributeSet, i, i3);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_size_medium);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_inset_medium);
        AbstractC2993B.a(context, attributeSet, i, i3);
        int[] iArr = AbstractC2266a.i;
        AbstractC2993B.b(context, attributeSet, iArr, i, i3, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i3);
        this.f612o = typedArrayObtainStyledAttributes.getInt(0, 0);
        this.f613p = Math.max(com.bumptech.glide.c.q(context, typedArrayObtainStyledAttributes, 4, dimensionPixelSize), this.f559a * 2);
        this.f614q = com.bumptech.glide.c.q(context, typedArrayObtainStyledAttributes, 3, dimensionPixelSize2);
        this.f615r = typedArrayObtainStyledAttributes.getInt(2, 0);
        this.f616s = typedArrayObtainStyledAttributes.getBoolean(1, true);
        typedArrayObtainStyledAttributes.recycle();
        d();
    }
}
