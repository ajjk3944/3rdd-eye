package com.applovin.impl.adview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Point;
import android.graphics.PointF;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import com.applovin.impl.AbstractC2128k0;
import com.applovin.impl.l4;
import com.applovin.sdk.AppLovinSdkUtils;

/* loaded from: classes.dex */
public class AppLovinTouchToClickListener implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    private final long f18960a;

    /* renamed from: b, reason: collision with root package name */
    private final int f18961b;

    /* renamed from: c, reason: collision with root package name */
    private final int f18962c;

    /* renamed from: d, reason: collision with root package name */
    private final ClickRecognitionState f18963d;

    /* renamed from: e, reason: collision with root package name */
    private long f18964e;

    /* renamed from: f, reason: collision with root package name */
    private PointF f18965f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f18966g;

    /* renamed from: h, reason: collision with root package name */
    private final Context f18967h;
    private final OnClickListener i;

    public enum ClickRecognitionState {
        DISABLED,
        ACTION_DOWN,
        ACTION_POINTER_UP,
        ACTION_UP
    }

    public interface OnClickListener {
        void onClick(View view, MotionEvent motionEvent);
    }

    public AppLovinTouchToClickListener(com.applovin.impl.sdk.k kVar, l4 l4Var, Context context, OnClickListener onClickListener) {
        this.f18960a = ((Long) kVar.a(l4.f19926g0)).longValue();
        this.f18961b = ((Integer) kVar.a(l4.f19934h0)).intValue();
        this.f18962c = AppLovinSdkUtils.dpToPx(context, ((Integer) kVar.a(l4.f19964l0)).intValue());
        this.f18963d = ClickRecognitionState.values()[((Integer) kVar.a(l4Var)).intValue()];
        this.f18967h = context;
        this.i = onClickListener;
    }

    private void a(View view, MotionEvent motionEvent) {
        this.i.onClick(view, motionEvent);
        this.f18966g = true;
    }

    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 6 && !this.f18966g && this.f18963d == ClickRecognitionState.ACTION_POINTER_UP) {
                    a(view, motionEvent);
                }
            } else if (!this.f18966g && this.f18963d == ClickRecognitionState.ACTION_UP) {
                a(view, motionEvent);
            } else if (this.f18963d == ClickRecognitionState.DISABLED) {
                long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f18964e;
                float fA = a(this.f18965f, new PointF(motionEvent.getX(), motionEvent.getY()));
                if (!this.f18966g) {
                    long j4 = this.f18960a;
                    if ((j4 < 0 || jElapsedRealtime < j4) && ((i = this.f18961b) < 0 || fA < i)) {
                        a(view, motionEvent);
                    }
                }
            }
        } else if (this.f18963d != ClickRecognitionState.ACTION_DOWN) {
            this.f18964e = SystemClock.elapsedRealtime();
            this.f18965f = new PointF(motionEvent.getX(), motionEvent.getY());
            this.f18966g = false;
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
        return f10 / this.f18967h.getResources().getDisplayMetrics().density;
    }

    private boolean a(MotionEvent motionEvent) {
        if (this.f18962c <= 0) {
            return true;
        }
        Point pointB = AbstractC2128k0.b(this.f18967h);
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int i = this.f18962c;
        float f10 = i;
        return rawX >= f10 && rawY >= f10 && rawX <= ((float) (pointB.x - i)) && rawY <= ((float) (pointB.y - i));
    }
}
