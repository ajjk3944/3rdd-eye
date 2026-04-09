package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.yandex.mobile.ads.impl.e12;
import com.yandex.mobile.ads.impl.hf1;

/* loaded from: classes3.dex */
final class g52 extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, hf1.a {

    /* renamed from: c, reason: collision with root package name */
    private final a f27547c;

    /* renamed from: e, reason: collision with root package name */
    private final GestureDetector f27549e;

    /* renamed from: a, reason: collision with root package name */
    private final PointF f27545a = new PointF();

    /* renamed from: b, reason: collision with root package name */
    private final PointF f27546b = new PointF();

    /* renamed from: d, reason: collision with root package name */
    private final float f27548d = 25.0f;

    /* renamed from: f, reason: collision with root package name */
    private volatile float f27550f = 3.1415927f;

    public interface a {
    }

    public g52(Context context, a aVar) {
        this.f27547c = aVar;
        this.f27549e = new GestureDetector(context, this);
    }

    @Override // com.yandex.mobile.ads.impl.hf1.a
    public final void a(float[] fArr, float f10) {
        this.f27550f = -f10;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.f27545a.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        float x10 = (motionEvent2.getX() - this.f27545a.x) / this.f27548d;
        float y10 = motionEvent2.getY();
        PointF pointF = this.f27545a;
        float f12 = (y10 - pointF.y) / this.f27548d;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d10 = this.f27550f;
        float fCos = (float) Math.cos(d10);
        float fSin = (float) Math.sin(d10);
        PointF pointF2 = this.f27546b;
        pointF2.x -= (fCos * x10) - (fSin * f12);
        float f13 = (fCos * f12) + (fSin * x10) + pointF2.y;
        pointF2.y = f13;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f13));
        ((e12.a) this.f27547c).a(this.f27546b);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return ((e12.a) this.f27547c).a(motionEvent);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f27549e.onTouchEvent(motionEvent);
    }
}
