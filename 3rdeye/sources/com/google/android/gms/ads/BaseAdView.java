package com.google.android.gms.ads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zzen;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbdc;
import com.google.android.gms.internal.ads.zzbfa;
import com.google.android.gms.internal.ads.zzbul;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes.dex */
public abstract class BaseAdView extends ViewGroup {
    protected final zzen zza;

    public BaseAdView(Context context, int i) {
        super(context);
        this.zza = new zzen(this, i);
    }

    public void destroy() {
        zzbdc.zza(getContext());
        if (((Boolean) zzbfa.zze.zze()).booleanValue()) {
            if (((Boolean) zzbd.zzc().zzb(zzbdc.zzlr)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.zze
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseAdView baseAdView = this.zza;
                        try {
                            baseAdView.zza.zzl();
                        } catch (IllegalStateException e4) {
                            zzbul.zza(baseAdView.getContext()).zzh(e4, "BaseAdView.destroy");
                        }
                    }
                });
                return;
            }
        }
        this.zza.zzl();
    }

    public AdListener getAdListener() {
        return this.zza.zza();
    }

    public AdSize getAdSize() {
        return this.zza.zzb();
    }

    public String getAdUnitId() {
        return this.zza.zzj();
    }

    public OnPaidEventListener getOnPaidEventListener() {
        return this.zza.zzc();
    }

    public ResponseInfo getResponseInfo() {
        return this.zza.zzd();
    }

    public boolean isCollapsible() {
        return this.zza.zzA();
    }

    public boolean isLoading() {
        return this.zza.zzB();
    }

    public void loadAd(final AdRequest adRequest) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzbdc.zza(getContext());
        if (((Boolean) zzbfa.zzf.zze()).booleanValue()) {
            if (((Boolean) zzbd.zzc().zzb(zzbdc.zzlu)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.zzg
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseAdView baseAdView = this.zza;
                        try {
                            baseAdView.zza.zzm(adRequest.zza);
                        } catch (IllegalStateException e4) {
                            zzbul.zza(baseAdView.getContext()).zzh(e4, "BaseAdView.loadAd");
                        }
                    }
                });
                return;
            }
        }
        this.zza.zzm(adRequest.zza);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i, int i10, int i11, int i12) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int i13 = ((i11 - i) - measuredWidth) / 2;
        int i14 = ((i12 - i10) - measuredHeight) / 2;
        childAt.layout(i13, i14, measuredWidth + i13, measuredHeight + i14);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i10) {
        AdSize adSize;
        int heightInPixels;
        int measuredWidth = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            try {
                adSize = getAdSize();
            } catch (NullPointerException e4) {
                zzo.zzh("Unable to retrieve ad size.", e4);
                adSize = null;
            }
            if (adSize != null) {
                Context context = getContext();
                int widthInPixels = adSize.getWidthInPixels(context);
                heightInPixels = adSize.getHeightInPixels(context);
                measuredWidth = widthInPixels;
            } else {
                heightInPixels = 0;
            }
        } else {
            measureChild(childAt, i, i10);
            measuredWidth = childAt.getMeasuredWidth();
            heightInPixels = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(Math.max(measuredWidth, getSuggestedMinimumWidth()), i), View.resolveSize(Math.max(heightInPixels, getSuggestedMinimumHeight()), i10));
    }

    public void pause() {
        zzbdc.zza(getContext());
        if (((Boolean) zzbfa.zzg.zze()).booleanValue()) {
            if (((Boolean) zzbd.zzc().zzb(zzbdc.zzls)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.zzf
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseAdView baseAdView = this.zza;
                        try {
                            baseAdView.zza.zzn();
                        } catch (IllegalStateException e4) {
                            zzbul.zza(baseAdView.getContext()).zzh(e4, "BaseAdView.pause");
                        }
                    }
                });
                return;
            }
        }
        this.zza.zzn();
    }

    public void resume() {
        zzbdc.zza(getContext());
        if (((Boolean) zzbfa.zzh.zze()).booleanValue()) {
            if (((Boolean) zzbd.zzc().zzb(zzbdc.zzlq)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.zzd
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseAdView baseAdView = this.zza;
                        try {
                            baseAdView.zza.zzp();
                        } catch (IllegalStateException e4) {
                            zzbul.zza(baseAdView.getContext()).zzh(e4, "BaseAdView.resume");
                        }
                    }
                });
                return;
            }
        }
        this.zza.zzp();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setAdListener(AdListener adListener) {
        zzen zzenVar = this.zza;
        zzenVar.zzr(adListener);
        if (adListener == 0) {
            zzenVar.zzq(null);
            return;
        }
        if (adListener instanceof com.google.android.gms.ads.internal.client.zza) {
            zzenVar.zzq((com.google.android.gms.ads.internal.client.zza) adListener);
        }
        if (adListener instanceof AppEventListener) {
            zzenVar.zzv((AppEventListener) adListener);
        }
    }

    public void setAdSize(AdSize adSize) {
        this.zza.zzs(adSize);
    }

    public void setAdUnitId(String str) {
        this.zza.zzu(str);
    }

    public void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        this.zza.zzx(onPaidEventListener);
    }

    public BaseAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.zza = new zzen(this, attributeSet, false, i);
    }

    public BaseAdView(Context context, AttributeSet attributeSet, int i, int i10) {
        super(context, attributeSet, i);
        this.zza = new zzen(this, attributeSet, false, i10);
    }

    public BaseAdView(Context context, AttributeSet attributeSet, int i, int i10, boolean z10) {
        super(context, attributeSet, i);
        this.zza = new zzen(this, attributeSet, z10, i10);
    }

    public BaseAdView(Context context, AttributeSet attributeSet, boolean z10) {
        super(context, attributeSet);
        this.zza = new zzen(this, attributeSet, z10);
    }
}
