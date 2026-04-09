package com.applovin.impl;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class t8 implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5791a;

    public /* synthetic */ t8(int i4) {
        this.f5791a = i4;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f5791a) {
            case 0:
                return a2.a(view, motionEvent);
            default:
                return com.applovin.impl.adview.b.a(view, motionEvent);
        }
    }
}
