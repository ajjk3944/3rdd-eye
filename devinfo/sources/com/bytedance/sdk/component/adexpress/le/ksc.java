package com.bytedance.sdk.component.adexpress.le;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.adsdk.vt.bly;
import com.bytedance.adsdk.vt.le;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ksc extends LinearLayout {
    private LinearLayout fkw;

    /* renamed from: le, reason: collision with root package name */
    private com.bytedance.adsdk.vt.le f7330le;

    /* renamed from: lh, reason: collision with root package name */
    private TextView f7331lh;
    private TextView ouw;
    private com.bytedance.sdk.component.adexpress.dynamic.yu.tlj ra;
    private com.bytedance.sdk.component.utils.ex vt;
    private ouw yu;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface ouw {
    }

    public ksc(Context context, View view, com.bytedance.sdk.component.adexpress.dynamic.yu.tlj tljVar) {
        super(context);
        this.ra = tljVar;
        setClipChildren(false);
        addView(view);
        this.fkw = (LinearLayout) findViewById(2097610722);
        this.ouw = (TextView) findViewById(2097610719);
        this.f7331lh = (TextView) findViewById(2097610718);
        com.bytedance.adsdk.vt.le leVar = (com.bytedance.adsdk.vt.le) findViewById(2097610706);
        this.f7330le = leVar;
        leVar.setAnimation("lottie_json/twist_multi_angle.json");
        this.f7330le.setImageAssetsFolder("images/");
        this.f7330le.ouw(true);
    }

    public final TextView getTopTextView() {
        return this.ouw;
    }

    public final LinearLayout getWriggleLayout() {
        return this.fkw;
    }

    public final View getWriggleProgressIv() {
        return this.f7330le;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isShown()) {
            if (this.vt == null) {
                getContext().getApplicationContext();
                this.vt = new com.bytedance.sdk.component.utils.ex();
            }
            new Object() { // from class: com.bytedance.sdk.component.adexpress.le.ksc.2
            };
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            com.bytedance.adsdk.vt.le leVar = this.f7330le;
            if (leVar != null) {
                leVar.vt.add(le.yu.PLAY_OPTION);
                com.bytedance.adsdk.vt.bly blyVar = leVar.ouw;
                blyVar.ra.clear();
                blyVar.vt.cancel();
                if (blyVar.isVisible()) {
                    return;
                }
                blyVar.f7029le = bly.vt.NONE;
            }
        } catch (Exception unused) {
        }
    }

    public final void setOnShakeViewListener(ouw ouwVar) {
        this.yu = ouwVar;
    }

    public final void setShakeText(String str) {
        this.f7331lh.setText(str);
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z3) {
    }
}
