package com.applovin.impl;

import android.content.Context;
import android.view.MotionEvent;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import com.applovin.impl.adview.AppLovinWebViewBase;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class j0 extends AppLovinWebViewBase {

    /* renamed from: b, reason: collision with root package name */
    private static Boolean f6262b;

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference f6263a;

    public j0(Context context) throws NoSuchMethodException, SecurityException {
        super(context);
        this.f6263a = new AtomicReference();
        if (f6262b == null) {
            try {
                WebView.class.getDeclaredMethod("onTouchEvent", MotionEvent.class);
                f6262b = Boolean.TRUE;
            } catch (NoSuchMethodException unused) {
                com.applovin.impl.sdk.o.h("AppLovinSdk", "WebView.onTouchEvent() not implemented");
                f6262b = Boolean.FALSE;
            }
        }
    }

    public boolean a() {
        return this.f6263a.get() != null;
    }

    @Nullable
    public MotionEvent getAndClearLastClickEvent() {
        return (MotionEvent) this.f6263a.getAndSet(null);
    }

    @Nullable
    public MotionEvent getLastClickEvent() {
        return (MotionEvent) this.f6263a.get();
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f6263a.set(MotionEvent.obtain(motionEvent));
        if (f6262b.booleanValue()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }
}
