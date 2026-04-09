package eb;

import android.content.Context;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.internal.ads.bn;
import com.google.android.gms.internal.ads.sk;
import va.n;
import va.o;
import va.r;
import va.s;
import za.i;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final FrameLayout f22530a;

    /* renamed from: b, reason: collision with root package name */
    public final bn f22531b;

    public e(Context context) {
        bn bnVar;
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout);
        this.f22530a = frameLayout;
        if (isInEditMode()) {
            bnVar = null;
        } else {
            o oVar = r.g.f36158b;
            Context context2 = frameLayout.getContext();
            oVar.getClass();
            bnVar = (bn) new n(oVar, this, frameLayout, context2).d(context2, false);
        }
        this.f22531b = bnVar;
    }

    public final View a(String str) {
        bn bnVar = this.f22531b;
        if (bnVar != null) {
            try {
                vb.a aVarX = bnVar.x(str);
                if (aVarX != null) {
                    return (View) vb.b.U0(aVarX);
                }
            } catch (RemoteException e2) {
                i.f("Unable to call getAssetView on delegate", e2);
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i4, layoutParams);
        super.bringChildToFront(this.f22530a);
    }

    public final void b(View view, String str) {
        bn bnVar = this.f22531b;
        if (bnVar == null) {
            return;
        }
        try {
            bnVar.Z2(str, new vb.b(view));
        } catch (RemoteException e2) {
            i.f("Unable to call setAssetView on delegate", e2);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void bringChildToFront(View view) {
        super.bringChildToFront(view);
        FrameLayout frameLayout = this.f22530a;
        if (frameLayout != view) {
            super.bringChildToFront(frameLayout);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        bn bnVar = this.f22531b;
        if (bnVar != null) {
            if (((Boolean) s.f36163e.f36166c.a(sk.Nc)).booleanValue()) {
                try {
                    bnVar.b4(new vb.b(motionEvent));
                } catch (RemoteException e2) {
                    i.f("Unable to call handleTouchEvent on delegate", e2);
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public a getAdChoicesView() {
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

    public final b getMediaView() {
        View viewA = a("3010");
        if (viewA instanceof b) {
            return (b) viewA;
        }
        if (viewA == null) {
            return null;
        }
        i.c("View is not an instance of MediaView");
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
    public final void onVisibilityChanged(View view, int i4) {
        super.onVisibilityChanged(view, i4);
        bn bnVar = this.f22531b;
        if (bnVar == null) {
            return;
        }
        try {
            bnVar.b0(new vb.b(view), i4);
        } catch (RemoteException e2) {
            i.f("Unable to call onVisibilityChanged on delegate", e2);
        }
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        super.removeAllViews();
        addView(this.f22530a);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.f22530a == view) {
            return;
        }
        super.removeView(view);
    }

    public void setAdChoicesView(a aVar) {
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
        bn bnVar = this.f22531b;
        if (bnVar == null) {
            return;
        }
        try {
            bnVar.o(new vb.b(view));
        } catch (RemoteException e2) {
            i.f("Unable to call setClickConfirmingView on delegate", e2);
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

    public final void setMediaView(b bVar) {
        b(bVar, "3010");
        if (bVar == null) {
            return;
        }
        p6.i iVar = new p6.i(this);
        synchronized (bVar) {
            bVar.f22518b = iVar;
            if (bVar.f22517a) {
                iVar.L();
            }
        }
        bVar.a(new o7.d(14, this));
    }

    public void setNativeAd(NativeAd nativeAd) {
        bn bnVar = this.f22531b;
        if (bnVar == null) {
            return;
        }
        try {
            bnVar.z3(nativeAd.d());
        } catch (RemoteException e2) {
            i.f("Unable to call setNativeAd on delegate", e2);
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
}
