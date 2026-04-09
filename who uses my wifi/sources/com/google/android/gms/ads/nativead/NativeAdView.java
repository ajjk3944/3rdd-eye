package com.google.android.gms.ads.nativead;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.bu1;
import defpackage.f22;
import defpackage.f23;
import defpackage.gi2;
import defpackage.js1;
import defpackage.mz1;
import defpackage.of3;
import defpackage.oi0;
import defpackage.q2;
import defpackage.sv1;
import defpackage.tw1;
import defpackage.u10;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class NativeAdView extends FrameLayout {
    public final FrameLayout f;
    public final f22 g;

    public NativeAdView(Context context) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout);
        this.f = frameLayout;
        this.g = c();
    }

    public final View a(String str) {
        f22 f22Var = this.g;
        if (f22Var != null) {
            try {
                u10 u10VarP = f22Var.P(str);
                if (u10VarP != null) {
                    return (View) oi0.l1(u10VarP);
                }
            } catch (RemoteException e) {
                gi2.c0("Unable to call getAssetView on delegate", e);
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        super.bringChildToFront(this.f);
    }

    public final void b(View view, String str) {
        f22 f22Var = this.g;
        if (f22Var == null) {
            return;
        }
        try {
            f22Var.V0(new oi0(view), str);
        } catch (RemoteException e) {
            gi2.c0("Unable to call setAssetView on delegate", e);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void bringChildToFront(View view) {
        super.bringChildToFront(view);
        FrameLayout frameLayout = this.f;
        if (frameLayout != view) {
            super.bringChildToFront(frameLayout);
        }
    }

    public final f22 c() {
        if (isInEditMode()) {
            return null;
        }
        bu1 bu1Var = sv1.f.b;
        FrameLayout frameLayout = this.f;
        Context context = frameLayout.getContext();
        bu1Var.getClass();
        return (f22) new js1(bu1Var, this, frameLayout, context).d(context, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        f22 f22Var = this.g;
        if (f22Var != null) {
            if (((Boolean) tw1.e.c.a(mz1.oc)).booleanValue()) {
                try {
                    f22Var.E0(new oi0(motionEvent));
                } catch (RemoteException e) {
                    gi2.c0("Unable to call handleTouchEvent on delegate", e);
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public q2 getAdChoicesView() {
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
        gi2.U("View is not an instance of MediaView");
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
        f22 f22Var = this.g;
        if (f22Var == null) {
            return;
        }
        try {
            f22Var.d0(new oi0(view), i);
        } catch (RemoteException e) {
            gi2.c0("Unable to call onVisibilityChanged on delegate", e);
        }
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        super.removeAllViews();
        addView(this.f);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.f == view) {
            return;
        }
        super.removeView(view);
    }

    public void setAdChoicesView(q2 q2Var) {
        b(q2Var, "3011");
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
        f22 f22Var = this.g;
        if (f22Var == null) {
            return;
        }
        try {
            f22Var.M(new oi0(view));
        } catch (RemoteException e) {
            gi2.c0("Unable to call setClickConfirmingView on delegate", e);
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
        f23 f23Var = new f23(14, this);
        synchronized (mediaView) {
            mediaView.h = f23Var;
            if (mediaView.g) {
                f23Var.k(mediaView.f);
            }
        }
        of3 of3Var = new of3(8, this);
        synchronized (mediaView) {
            mediaView.k = of3Var;
            if (mediaView.j) {
                of3Var.g(mediaView.i);
            }
        }
    }

    public void setNativeAd(NativeAd nativeAd) {
        f22 f22Var = this.g;
        if (f22Var == null) {
            return;
        }
        try {
            f22Var.L0(nativeAd.d());
        } catch (RemoteException e) {
            gi2.c0("Unable to call setNativeAd on delegate", e);
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
        this.f = frameLayout;
        this.g = c();
    }
}
