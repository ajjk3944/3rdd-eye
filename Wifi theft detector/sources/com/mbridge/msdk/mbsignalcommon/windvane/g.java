package com.mbridge.msdk.mbsignalcommon.windvane;

import android.content.Context;

/* loaded from: classes3.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    protected Context f16267a;

    /* renamed from: b, reason: collision with root package name */
    protected Object f16268b;

    /* renamed from: c, reason: collision with root package name */
    protected WindVaneWebView f16269c;

    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        this.f16267a = context;
        this.f16269c = windVaneWebView;
    }

    public void initialize(Object obj, WindVaneWebView windVaneWebView) {
        this.f16268b = obj;
        this.f16269c = windVaneWebView;
    }
}
