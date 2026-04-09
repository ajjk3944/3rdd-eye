package com.bytedance.sdk.component.adexpress.dynamic.lh;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.le.vpp;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class zih<E extends vpp> implements ra<E> {
    protected int fkw;

    /* renamed from: lh, reason: collision with root package name */
    protected com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw f7271lh;
    protected vpp ouw;
    protected Context vt;
    protected com.bytedance.sdk.component.adexpress.dynamic.yu.ra yu;

    public zih(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw fkwVar, com.bytedance.sdk.component.adexpress.dynamic.yu.ra raVar, int i4) {
        this.fkw = i4;
        this.vt = context;
        this.f7271lh = fkwVar;
        this.yu = raVar;
        yu();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lh.ra
    public final /* bridge */ /* synthetic */ ViewGroup lh() {
        return this.ouw;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lh.ra
    public void ouw() {
        this.ouw.ouw();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lh.ra
    public void vt() {
        this.ouw.vt();
    }

    public void yu() {
        this.ouw = new vpp(this.vt, this.yu.yu.tc);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.vt, 200.0f));
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.vt, 100 - this.fkw);
        this.ouw.setLayoutParams(layoutParams);
        try {
            this.ouw.setGuideText(this.yu.yu.vm);
        } catch (Throwable unused) {
        }
    }

    public zih(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw fkwVar, com.bytedance.sdk.component.adexpress.dynamic.yu.ra raVar) {
        this(context, fkwVar, raVar, 0);
    }
}
