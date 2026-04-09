package com.staircase3.opensignal.ui.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import br.l;
import kotlin.Metadata;
import qk.f;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/staircase3/opensignal/ui/views/CustStackedBarConnectionStats;", "Landroid/view/View;", "openSignal_externalRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CustStackedBarConnectionStats extends View {

    /* renamed from: a, reason: collision with root package name */
    public final LayerDrawable f6156a;

    /* renamed from: d, reason: collision with root package name */
    public final ClipDrawable f6157d;

    /* renamed from: g, reason: collision with root package name */
    public final ClipDrawable f6158g;

    /* renamed from: r, reason: collision with root package name */
    public final ClipDrawable f6159r;

    /* renamed from: x, reason: collision with root package name */
    public final ClipDrawable f6160x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustStackedBarConnectionStats(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        l.e(context, "context");
        Drawable drawable = getContext().getDrawable(f.stacked_bar_connection_stats);
        l.c(drawable, "null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
        LayerDrawable layerDrawable = (LayerDrawable) drawable;
        this.f6156a = layerDrawable;
        Drawable drawable2 = layerDrawable.getDrawable(1);
        l.c(drawable2, "null cannot be cast to non-null type android.graphics.drawable.ClipDrawable");
        this.f6157d = (ClipDrawable) drawable2;
        Drawable drawable3 = layerDrawable.getDrawable(2);
        l.c(drawable3, "null cannot be cast to non-null type android.graphics.drawable.ClipDrawable");
        this.f6158g = (ClipDrawable) drawable3;
        Drawable drawable4 = layerDrawable.getDrawable(3);
        l.c(drawable4, "null cannot be cast to non-null type android.graphics.drawable.ClipDrawable");
        this.f6159r = (ClipDrawable) drawable4;
        Drawable drawable5 = layerDrawable.getDrawable(4);
        l.c(drawable5, "null cannot be cast to non-null type android.graphics.drawable.ClipDrawable");
        this.f6160x = (ClipDrawable) drawable5;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        l.e(canvas, "canvas");
        int width = getWidth();
        int height = getHeight();
        LayerDrawable layerDrawable = this.f6156a;
        layerDrawable.setBounds(0, 0, width, height);
        layerDrawable.draw(canvas);
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        super.onMeasure(i10, i11);
    }
}
