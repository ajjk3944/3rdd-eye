package com.applovin.impl.adview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Point;
import android.graphics.PointF;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import com.applovin.impl.o0;
import com.applovin.impl.x4;
import com.applovin.sdk.AppLovinSdkUtils;

/* loaded from: classes.dex */
public class AppLovinTouchToClickListener implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    private final long f5403a;

    /* renamed from: b, reason: collision with root package name */
    private final int f5404b;

    /* renamed from: c, reason: collision with root package name */
    private final int f5405c;

    /* renamed from: d, reason: collision with root package name */
    private final ClickRecognitionState f5406d;

    /* renamed from: e, reason: collision with root package name */
    private long f5407e;

    /* renamed from: f, reason: collision with root package name */
    private PointF f5408f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f5409g;

    /* renamed from: h, reason: collision with root package name */
    private final Context f5410h;

    /* renamed from: i, reason: collision with root package name */
    private final OnClickListener f5411i;

    public enum ClickRecognitionState {
        DISABLED,
        ACTION_DOWN,
        ACTION_POINTER_UP,
        ACTION_UP
    }

    public interface OnClickListener {
        void onClick(View view, MotionEvent motionEvent);
    }

    public AppLovinTouchToClickListener(com.applovin.impl.sdk.k kVar, x4 x4Var, Context context, OnClickListener onClickListener) {
        this.f5403a = ((Long) kVar.a(x4.f8433c0)).longValue();
        this.f5404b = ((Integer) kVar.a(x4.f8442d0)).intValue();
        this.f5405c = AppLovinSdkUtils.dpToPx(context, ((Integer) kVar.a(x4.f8478h0)).intValue());
        this.f5406d = ClickRecognitionState.values()[((Integer) kVar.a(x4Var)).intValue()];
        this.f5410h = context;
        this.f5411i = onClickListener;
    }

    private void a(View view, MotionEvent motionEvent) {
        this.f5411i.onClick(view, motionEvent);
        this.f5409g = true;
    }

    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int i10;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 6 && !this.f5409g && this.f5406d == ClickRecognitionState.ACTION_POINTER_UP) {
                    a(view, motionEvent);
                }
            } else if (!this.f5409g && this.f5406d == ClickRecognitionState.ACTION_UP) {
                a(view, motionEvent);
            } else if (this.f5406d == ClickRecognitionState.DISABLED) {
                long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f5407e;
                float fA = a(this.f5408f, new PointF(motionEvent.getX(), motionEvent.getY()));
                if (!this.f5409g) {
                    long j10 = this.f5403a;
                    if ((j10 < 0 || jElapsedRealtime < j10) && ((i10 = this.f5404b) < 0 || fA < i10)) {
                        a(view, motionEvent);
                    }
                }
            }
        } else if (this.f5406d != ClickRecognitionState.ACTION_DOWN) {
            this.f5407e = SystemClock.elapsedRealtime();
            this.f5408f = new PointF(motionEvent.getX(), motionEvent.getY());
            this.f5409g = false;
        } else if (a(motionEvent)) {
            a(view, motionEvent);
        }
        return true;
    }

    private float a(PointF pointF, PointF pointF2) {
        float f10 = pointF.x - pointF2.x;
        float f11 = pointF.y - pointF2.y;
        return a((float) Math.sqrt((f10 * f10) + (f11 * f11)));
    }

    private float a(float f10) {
        return f10 / this.f5410h.getResources().getDisplayMetrics().density;
    }

    private boolean a(MotionEvent motionEvent) {
        if (this.f5405c <= 0) {
            return true;
        }
        Point pointB = o0.b(this.f5410h);
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int i10 = this.f5405c;
        float f10 = i10;
        return rawX >= f10 && rawY >= f10 && rawX <= ((float) (pointB.x - i10)) && rawY <= ((float) (pointB.y - i10));
    }
}
