package k6;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class o extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public int f28020a;

    /* renamed from: b, reason: collision with root package name */
    public n f28021b;

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f28022c;

    /* renamed from: d, reason: collision with root package name */
    public PorterDuff.Mode f28023d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f28024e;

    /* renamed from: f, reason: collision with root package name */
    public Bitmap f28025f;
    public ColorStateList g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f28026h;

    /* renamed from: i, reason: collision with root package name */
    public int f28027i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f28028k;

    /* renamed from: l, reason: collision with root package name */
    public Paint f28029l;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f28020a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new q(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new q(this);
    }
}
