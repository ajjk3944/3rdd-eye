package com.google.android.gms.ads.nativead;

import S2.a;
import S2.b;
import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.internal.ads.H9;
import com.google.android.gms.internal.ads.InterfaceC0703Ra;
import d4.h;
import h2.d;
import q2.C2832n;
import q2.C2834o;
import q2.C2841s;
import q2.r;
import u2.k;

/* loaded from: classes.dex */
public final class NativeAdView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final FrameLayout f6886a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0703Ra f6887b;

    public NativeAdView(Context context) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout);
        this.f6886a = frameLayout;
        this.f6887b = c();
    }

    public final View a(String str) {
        InterfaceC0703Ra interfaceC0703Ra = this.f6887b;
        if (interfaceC0703Ra != null) {
            try {
                a aVarO = interfaceC0703Ra.O(str);
                if (aVarO != null) {
                    return (View) b.n1(aVarO);
                }
            } catch (RemoteException e6) {
                k.f("Unable to call getAssetView on delegate", e6);
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        super.bringChildToFront(this.f6886a);
    }

    public final void b(View view, String str) {
        InterfaceC0703Ra interfaceC0703Ra = this.f6887b;
        if (interfaceC0703Ra == null) {
            return;
        }
        try {
            interfaceC0703Ra.B0(new b(view), str);
        } catch (RemoteException e6) {
            k.f("Unable to call setAssetView on delegate", e6);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void bringChildToFront(View view) {
        super.bringChildToFront(view);
        FrameLayout frameLayout = this.f6886a;
        if (frameLayout != view) {
            super.bringChildToFront(frameLayout);
        }
    }

    public final InterfaceC0703Ra c() {
        if (isInEditMode()) {
            return null;
        }
        C2834o c2834o = r.f23260g.f23262b;
        FrameLayout frameLayout = this.f6886a;
        Context context = frameLayout.getContext();
        c2834o.getClass();
        return (InterfaceC0703Ra) new C2832n(c2834o, this, frameLayout, context).d(context, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        InterfaceC0703Ra interfaceC0703Ra = this.f6887b;
        if (interfaceC0703Ra != null) {
            if (((Boolean) C2841s.f23267e.f23270c.a(H9.Lc)).booleanValue()) {
                try {
                    interfaceC0703Ra.r2(new b(motionEvent));
                } catch (RemoteException e6) {
                    k.f("Unable to call handleTouchEvent on delegate", e6);
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public z2.a getAdChoicesView() {
        a("3011");
        return null;
    }

    public final View getAdvertiserView() {
        return a("3005");
    }

    public final View getBodyView() {
        return a("3004");
    }

    public final View getCallToActionView() {
        return a("3002");
    }

    public final View getHeadlineView() {
        return a("3001");
    }

    public final View getIconView() {
        return a("3003");
    }

    public final View getImageView() {
        return a("3008");
    }

    public final MediaView getMediaView() {
        View viewA = a("3010");
        if (viewA instanceof MediaView) {
            return (MediaView) viewA;
        }
        if (viewA == null) {
            return null;
        }
        k.c("View is not an instance of MediaView");
        return null;
    }

    public final View getPriceView() {
        return a("3007");
    }

    public final View getStarRatingView() {
        return a("3009");
    }

    public final View getStoreView() {
        return a("3006");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        InterfaceC0703Ra interfaceC0703Ra = this.f6887b;
        if (interfaceC0703Ra == null) {
            return;
        }
        try {
            interfaceC0703Ra.n0(new b(view), i);
        } catch (RemoteException e6) {
            k.f("Unable to call onVisibilityChanged on delegate", e6);
        }
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        super.removeAllViews();
        addView(this.f6886a);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.f6886a == view) {
            return;
        }
        super.removeView(view);
    }

    public void setAdChoicesView(z2.a aVar) {
        b(aVar, "3011");
    }

    public final void setAdvertiserView(View view) {
        b(view, "3005");
    }

    public final void setBodyView(View view) {
        b(view, "3004");
    }

    public final void setCallToActionView(View view) {
        b(view, "3002");
    }

    public final void setClickConfirmingView(View view) {
        InterfaceC0703Ra interfaceC0703Ra = this.f6887b;
        if (interfaceC0703Ra == null) {
            return;
        }
        try {
            interfaceC0703Ra.D(new b(view));
        } catch (RemoteException e6) {
            k.f("Unable to call setClickConfirmingView on delegate", e6);
        }
    }

    public final void setHeadlineView(View view) {
        b(view, "3001");
    }

    public final void setIconView(View view) {
        b(view, "3003");
    }

    public final void setImageView(View view) {
        b(view, "3008");
    }

    public final void setMediaView(MediaView mediaView) {
        b(mediaView, "3010");
        if (mediaView == null) {
            return;
        }
        d dVar = new d(this);
        synchronized (mediaView) {
            mediaView.f6882c = dVar;
            if (mediaView.f6881b) {
                dVar.r(mediaView.f6880a);
            }
        }
        mediaView.a(new h(25, this));
    }

    public void setNativeAd(NativeAd nativeAd) {
        InterfaceC0703Ra interfaceC0703Ra = this.f6887b;
        if (interfaceC0703Ra == null) {
            return;
        }
        try {
            interfaceC0703Ra.g2(nativeAd.l());
        } catch (RemoteException e6) {
            k.f("Unable to call setNativeAd on delegate", e6);
        }
    }

    public final void setPriceView(View view) {
        b(view, "3007");
    }

    public final void setStarRatingView(View view) {
        b(view, "3009");
    }

    public final void setStoreView(View view) {
        b(view, "3006");
    }

    public NativeAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout);
        this.f6886a = frameLayout;
        this.f6887b = c();
    }
}
