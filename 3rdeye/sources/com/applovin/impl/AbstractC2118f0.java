package com.applovin.impl;

import android.content.Context;
import android.view.MotionEvent;
import android.webkit.WebView;
import com.applovin.impl.adview.AppLovinWebViewBase;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.applovin.impl.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2118f0 extends AppLovinWebViewBase {

    /* renamed from: b, reason: collision with root package name */
    private static Boolean f19330b;

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference f19331a;

    public AbstractC2118f0(Context context) throws NoSuchMethodException, SecurityException {
        super(context);
        this.f19331a = new AtomicReference();
        if (f19330b == null) {
            try {
                WebView.class.getDeclaredMethod("onTouchEvent", MotionEvent.class);
                f19330b = Boolean.TRUE;
            } catch (NoSuchMethodException unused) {
                com.applovin.impl.sdk.o.h("AppLovinSdk", "WebView.onTouchEvent() not implemented");
                f19330b = Boolean.FALSE;
            }
        }
    }

    public boolean a() {
        return this.f19331a.get() != null;
    }

    public MotionEvent getAndClearLastClickEvent() {
        return (MotionEvent) this.f19331a.getAndSet(null);
    }

    public MotionEvent getLastClickEvent() {
        return (MotionEvent) this.f19331a.get();
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f19331a.set(MotionEvent.obtain(motionEvent));
        if (f19330b.booleanValue()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }
}
