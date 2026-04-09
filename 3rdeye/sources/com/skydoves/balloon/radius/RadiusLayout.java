package com.skydoves.balloon.radius;

import D9.G;
import V5.a;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.x;
import w9.i;

/* compiled from: RadiusLayout.kt */
/* loaded from: classes2.dex */
public final class RadiusLayout extends FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ i<Object>[] f23795d;

    /* renamed from: b, reason: collision with root package name */
    public final Path f23796b;

    /* renamed from: c, reason: collision with root package name */
    public final G f23797c;

    static {
        n nVar = new n(RadiusLayout.class, "radius", "getRadius()F");
        x.f43661a.getClass();
        f23795d = new i[]{nVar};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RadiusLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        l.f(context, "context");
        this.f23796b = new Path();
        this.f23797c = a.a(this, Float.valueOf(0.0f));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        l.f(canvas, "canvas");
        canvas.clipPath(this.f23796b);
        super.dispatchDraw(canvas);
    }

    public final float getRadius() {
        return ((Number) this.f23797c.g(this, f23795d[0])).floatValue();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i10, int i11, int i12) {
        super.onSizeChanged(i, i10, i11, i12);
        this.f23796b.addRoundRect(new RectF(0.0f, 0.0f, i, i10), getRadius(), getRadius(), Path.Direction.CW);
    }

    public final void setRadius(float f10) {
        this.f23797c.j(this, f23795d[0], Float.valueOf(f10));
    }
}
