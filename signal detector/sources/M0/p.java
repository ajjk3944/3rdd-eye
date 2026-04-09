package M0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class p extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public int f2683a;

    /* renamed from: b, reason: collision with root package name */
    public o f2684b;

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f2685c;

    /* renamed from: d, reason: collision with root package name */
    public PorterDuff.Mode f2686d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2687e;

    /* renamed from: f, reason: collision with root package name */
    public Bitmap f2688f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f2689g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f2690h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2691j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2692k;

    /* renamed from: l, reason: collision with root package name */
    public Paint f2693l;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f2683a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new r(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new r(this);
    }
}
