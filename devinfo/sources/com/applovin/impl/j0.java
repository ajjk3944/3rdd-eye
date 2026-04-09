package com.applovin.impl;

import android.content.Context;
import android.view.MotionEvent;
import android.webkit.WebView;
import com.applovin.impl.adview.AppLovinWebViewBase;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class j0 extends AppLovinWebViewBase {

    /* renamed from: b, reason: collision with root package name */
    private static Boolean f4323b;

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference f4324a;

    public j0(Context context) throws NoSuchMethodException, SecurityException {
        super(context);
        this.f4324a = new AtomicReference();
        if (f4323b == null) {
            try {
                WebView.class.getDeclaredMethod("onTouchEvent", MotionEvent.class);
                f4323b = Boolean.TRUE;
            } catch (NoSuchMethodException unused) {
                com.applovin.impl.sdk.o.h("AppLovinSdk", "WebView.onTouchEvent() not implemented");
                f4323b = Boolean.FALSE;
            }
        }
    }

    public boolean a() {
        return this.f4324a.get() != null;
    }

    public MotionEvent getAndClearLastClickEvent() {
        return (MotionEvent) this.f4324a.getAndSet(null);
    }

    public MotionEvent getLastClickEvent() {
        return (MotionEvent) this.f4324a.get();
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f4324a.set(MotionEvent.obtain(motionEvent));
        if (f4323b.booleanValue()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }
}
