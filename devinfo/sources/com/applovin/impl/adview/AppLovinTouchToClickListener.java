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

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class AppLovinTouchToClickListener implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    private final long f3606a;

    /* renamed from: b, reason: collision with root package name */
    private final int f3607b;

    /* renamed from: c, reason: collision with root package name */
    private final int f3608c;

    /* renamed from: d, reason: collision with root package name */
    private final ClickRecognitionState f3609d;

    /* renamed from: e, reason: collision with root package name */
    private long f3610e;

    /* renamed from: f, reason: collision with root package name */
    private PointF f3611f;
    private boolean g;

    /* renamed from: h, reason: collision with root package name */
    private final Context f3612h;

    /* renamed from: i, reason: collision with root package name */
    private final OnClickListener f3613i;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public enum ClickRecognitionState {
        DISABLED,
        ACTION_DOWN,
        ACTION_POINTER_UP,
        ACTION_UP
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface OnClickListener {
        void onClick(View view, MotionEvent motionEvent);
    }

    public AppLovinTouchToClickListener(com.applovin.impl.sdk.k kVar, x4 x4Var, Context context, OnClickListener onClickListener) {
        this.f3606a = ((Long) kVar.a(x4.f6003c0)).longValue();
        this.f3607b = ((Integer) kVar.a(x4.f6012d0)).intValue();
        this.f3608c = AppLovinSdkUtils.dpToPx(context, ((Integer) kVar.a(x4.f6045h0)).intValue());
        this.f3609d = ClickRecognitionState.values()[((Integer) kVar.a(x4Var)).intValue()];
        this.f3612h = context;
        this.f3613i = onClickListener;
    }

    private void a(View view, MotionEvent motionEvent) {
        this.f3613i.onClick(view, motionEvent);
        this.g = true;
    }

    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int i4;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 6 && !this.g && this.f3609d == ClickRecognitionState.ACTION_POINTER_UP) {
                    a(view, motionEvent);
                }
            } else if (!this.g && this.f3609d == ClickRecognitionState.ACTION_UP) {
                a(view, motionEvent);
            } else if (this.f3609d == ClickRecognitionState.DISABLED) {
                long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f3610e;
                float fA = a(this.f3611f, new PointF(motionEvent.getX(), motionEvent.getY()));
                if (!this.g) {
                    long j = this.f3606a;
                    if ((j < 0 || jElapsedRealtime < j) && ((i4 = this.f3607b) < 0 || fA < i4)) {
                        a(view, motionEvent);
                    }
                }
            }
        } else if (this.f3609d != ClickRecognitionState.ACTION_DOWN) {
            this.f3610e = SystemClock.elapsedRealtime();
            this.f3611f = new PointF(motionEvent.getX(), motionEvent.getY());
            this.g = false;
        } else if (a(motionEvent)) {
            a(view, motionEvent);
        }
        return true;
    }

    private float a(PointF pointF, PointF pointF2) {
        float f10 = pointF.x - pointF2.x;
        float f11 = pointF.y - pointF2.y;
        return a((float) Math.sqrt((f11 * f11) + (f10 * f10)));
    }

    private float a(float f10) {
        return f10 / this.f3612h.getResources().getDisplayMetrics().density;
    }

    private boolean a(MotionEvent motionEvent) {
        if (this.f3608c <= 0) {
            return true;
        }
        Point pointB = o0.b(this.f3612h);
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int i4 = this.f3608c;
        float f10 = i4;
        return rawX >= f10 && rawY >= f10 && rawX <= ((float) (pointB.x - i4)) && rawY <= ((float) (pointB.y - i4));
    }
}
