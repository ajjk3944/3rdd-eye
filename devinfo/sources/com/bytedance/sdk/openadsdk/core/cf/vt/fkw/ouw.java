package com.bytedance.sdk.openadsdk.core.cf.vt.fkw;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class ouw extends com.bytedance.adsdk.ugeno.bly.vt.ouw {

    /* renamed from: lh, reason: collision with root package name */
    private final com.bytedance.adsdk.ugeno.bly.vt.ouw f8159lh;
    private final com.bytedance.adsdk.ugeno.bly.vt.ouw vt;

    public ouw(Context context) {
        super(context);
        com.bytedance.adsdk.ugeno.bly.vt.ouw ouwVar = new com.bytedance.adsdk.ugeno.bly.vt.ouw(context);
        this.vt = ouwVar;
        addView(ouwVar, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.adsdk.ugeno.bly.vt.ouw ouwVar2 = new com.bytedance.adsdk.ugeno.bly.vt.ouw(context);
        this.f8159lh = ouwVar2;
        ouwVar2.setBackgroundColor(0);
        addView(ouwVar2, new FrameLayout.LayoutParams(-1, -1));
    }

    public com.bytedance.adsdk.ugeno.bly.vt.ouw getMarkView() {
        return this.f8159lh;
    }

    public com.bytedance.adsdk.ugeno.bly.vt.ouw getVideoView() {
        return this.vt;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f8159lh.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f8159lh.setOnTouchListener(onTouchListener);
    }
}
