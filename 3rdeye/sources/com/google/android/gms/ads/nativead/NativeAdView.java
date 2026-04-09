package com.google.android.gms.ads.nativead;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zzff;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbdc;
import com.google.android.gms.internal.ads.zzbgr;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes.dex */
public final class NativeAdView extends FrameLayout {
    private final FrameLayout zza;
    private final zzbgr zzb;

    public NativeAdView(Context context) {
        super(context);
        this.zza = zzd(context);
        this.zzb = zze();
    }

    public static /* synthetic */ void zzb(NativeAdView nativeAdView, ImageView.ScaleType scaleType) {
        zzbgr zzbgrVar = nativeAdView.zzb;
        if (zzbgrVar == null || scaleType == null) {
            return;
        }
        try {
            zzbgrVar.zzdA(ObjectWrapper.wrap(scaleType));
        } catch (RemoteException e4) {
            zzo.zzh("Unable to call setMediaViewImageScaleType on delegate", e4);
        }
    }

    public static /* synthetic */ void zzc(NativeAdView nativeAdView, MediaContent mediaContent) {
        zzbgr zzbgrVar = nativeAdView.zzb;
        if (zzbgrVar == null) {
            return;
        }
        try {
            if (mediaContent instanceof zzff) {
                zzbgrVar.zzdz(((zzff) mediaContent).zzc());
            } else if (mediaContent == null) {
                zzbgrVar.zzdz(null);
            } else {
                zzo.zze("Use MediaContent provided by NativeAd.getMediaContent");
            }
        } catch (RemoteException e4) {
            zzo.zzh("Unable to call setMediaContent on delegate", e4);
        }
    }

    private final FrameLayout zzd(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout);
        return frameLayout;
    }

    private final zzbgr zze() {
        if (isInEditMode()) {
            return null;
        }
        FrameLayout frameLayout = this.zza;
        return zzbb.zza().zzj(frameLayout.getContext(), this, frameLayout);
    }

    private final void zzf(String str, View view) {
        zzbgr zzbgrVar = this.zzb;
        if (zzbgrVar == null) {
            return;
        }
        try {
            zzbgrVar.zzdx(str, ObjectWrapper.wrap(view));
        } catch (RemoteException e4) {
            zzo.zzh("Unable to call setAssetView on delegate", e4);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        super.bringChildToFront(this.zza);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void bringChildToFront(View view) {
        super.bringChildToFront(view);
        FrameLayout frameLayout = this.zza;
        if (frameLayout != view) {
            super.bringChildToFront(frameLayout);
        }
    }

    public void destroy() {
        zzbgr zzbgrVar = this.zzb;
        if (zzbgrVar == null) {
            return;
        }
        try {
            zzbgrVar.zzc();
        } catch (RemoteException e4) {
            zzo.zzh("Unable to destroy native ad view", e4);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        zzbgr zzbgrVar = this.zzb;
        if (zzbgrVar != null) {
            if (((Boolean) zzbd.zzc().zzb(zzbdc.zzlM)).booleanValue()) {
                try {
                    zzbgrVar.zzd(ObjectWrapper.wrap(motionEvent));
                } catch (RemoteException e4) {
                    zzo.zzh("Unable to call handleTouchEvent on delegate", e4);
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public AdChoicesView getAdChoicesView() {
        View viewZza = zza("3011");
        if (viewZza instanceof AdChoicesView) {
            return (AdChoicesView) viewZza;
        }
        return null;
    }

    public final View getAdvertiserView() {
        return zza("3005");
    }

    public final View getBodyView() {
        return zza("3004");
    }

    public final View getCallToActionView() {
        return zza("3002");
    }

    public final View getHeadlineView() {
        return zza("3001");
    }

    public final View getIconView() {
        return zza("3003");
    }

    public final View getImageView() {
        return zza("3008");
    }

    public final MediaView getMediaView() {
        View viewZza = zza("3010");
        if (viewZza instanceof MediaView) {
            return (MediaView) viewZza;
        }
        if (viewZza == null) {
            return null;
        }
        zzo.zze("View is not an instance of MediaView");
        return null;
    }

    public final View getPriceView() {
        return zza("3007");
    }

    public final View getStarRatingView() {
        return zza("3009");
    }

    public final View getStoreView() {
        return zza("3006");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        zzbgr zzbgrVar = this.zzb;
        if (zzbgrVar == null) {
            return;
        }
        try {
            zzbgrVar.zze(ObjectWrapper.wrap(view), i);
        } catch (RemoteException e4) {
            zzo.zzh("Unable to call onVisibilityChanged on delegate", e4);
        }
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        super.removeAllViews();
        addView(this.zza);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.zza == view) {
            return;
        }
        super.removeView(view);
    }

    public void setAdChoicesView(AdChoicesView adChoicesView) {
        zzf("3011", adChoicesView);
    }

    public final void setAdvertiserView(View view) {
        zzf("3005", view);
    }

    public final void setBodyView(View view) {
        zzf("3004", view);
    }

    public final void setCallToActionView(View view) {
        zzf("3002", view);
    }

    public final void setClickConfirmingView(View view) {
        zzbgr zzbgrVar = this.zzb;
        if (zzbgrVar == null) {
            return;
        }
        try {
            zzbgrVar.zzdy(ObjectWrapper.wrap(view));
        } catch (RemoteException e4) {
            zzo.zzh("Unable to call setClickConfirmingView on delegate", e4);
        }
    }

    public final void setHeadlineView(View view) {
        zzf("3001", view);
    }

    public final void setIconView(View view) {
        zzf("3003", view);
    }

    public final void setImageView(View view) {
        zzf("3008", view);
    }

    public final void setMediaView(MediaView mediaView) {
        zzf("3010", mediaView);
        if (mediaView == null) {
            return;
        }
        mediaView.zza(new zzb(this));
        mediaView.zzb(new zzc(this));
    }

    public void setNativeAd(NativeAd nativeAd) {
        zzbgr zzbgrVar = this.zzb;
        if (zzbgrVar == null) {
            return;
        }
        try {
            zzbgrVar.zzdB((IObjectWrapper) nativeAd.zza());
        } catch (RemoteException e4) {
            zzo.zzh("Unable to call setNativeAd on delegate", e4);
        }
    }

    public final void setPriceView(View view) {
        zzf("3007", view);
    }

    public final void setStarRatingView(View view) {
        zzf("3009", view);
    }

    public final void setStoreView(View view) {
        zzf("3006", view);
    }

    public final View zza(String str) {
        zzbgr zzbgrVar = this.zzb;
        if (zzbgrVar != null) {
            try {
                IObjectWrapper iObjectWrapperZzb = zzbgrVar.zzb(str);
                if (iObjectWrapperZzb != null) {
                    return (View) ObjectWrapper.unwrap(iObjectWrapperZzb);
                }
            } catch (RemoteException e4) {
                zzo.zzh("Unable to call getAssetView on delegate", e4);
            }
        }
        return null;
    }

    public NativeAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.zza = zzd(context);
        this.zzb = zze();
    }

    public NativeAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.zza = zzd(context);
        this.zzb = zze();
    }

    @TargetApi(21)
    public NativeAdView(Context context, AttributeSet attributeSet, int i, int i10) {
        super(context, attributeSet, i, i10);
        this.zza = zzd(context);
        this.zzb = zze();
    }
}
