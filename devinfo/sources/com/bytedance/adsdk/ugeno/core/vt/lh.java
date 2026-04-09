package com.bytedance.adsdk.ugeno.core.vt;

import android.content.Context;
import android.view.ViewConfiguration;
import com.bytedance.adsdk.ugeno.core.mwh;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class lh {
    public final int fkw;

    /* renamed from: le, reason: collision with root package name */
    private Context f6871le;

    /* renamed from: lh, reason: collision with root package name */
    public mwh f6872lh;
    public float ouw;
    public float vt;
    public boolean yu;

    public lh(Context context, mwh mwhVar) {
        this.f6871le = context;
        this.f6872lh = mwhVar;
        this.fkw = ViewConfiguration.get(context).getScaledTouchSlop();
    }
}
