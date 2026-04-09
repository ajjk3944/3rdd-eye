package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import kotlin.KotlinVersion;

/* loaded from: classes3.dex */
public final class no implements View.OnTouchListener, View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    private final View.OnClickListener f30950a;

    /* renamed from: b, reason: collision with root package name */
    private final int f30951b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f30952c;

    /* renamed from: d, reason: collision with root package name */
    private float f30953d;

    /* renamed from: e, reason: collision with root package name */
    private float f30954e;

    public no(Context context, View.OnClickListener onClickListener) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(onClickListener, "onClickListener");
        this.f30950a = onClickListener;
        int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f30951b = scaledTouchSlop * scaledTouchSlop;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f30950a.onClick(view);
    }

    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        kotlin.jvm.internal.l.f(view, "view");
        kotlin.jvm.internal.l.f(motionEvent, "motionEvent");
        int action = motionEvent.getAction();
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        int i = action & KotlinVersion.MAX_COMPONENT_VALUE;
        if (i == 0) {
            this.f30953d = x10;
            this.f30954e = y10;
            this.f30952c = true;
            return false;
        }
        if (i == 1) {
            if (this.f30952c) {
                this.f30950a.onClick(view);
            }
            return true;
        }
        if (i != 2) {
            if (i == 3) {
                this.f30952c = false;
                return false;
            }
        } else if (this.f30952c) {
            int i10 = (int) (x10 - this.f30953d);
            int i11 = (int) (y10 - this.f30954e);
            if ((i11 * i11) + (i10 * i10) > this.f30951b) {
                this.f30952c = false;
            }
        }
        return false;
    }
}
