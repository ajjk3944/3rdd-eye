package com.mbridge.msdk.out.strategy.base;

import android.app.Activity;
import android.content.Context;
import com.mbridge.msdk.out.strategy.IBaseVideoAdStrategy;
import com.mbridge.msdk.out.strategy.IVideoAdStrategy;

/* loaded from: classes3.dex */
public abstract class NonBidAdHandler extends BaseAdHandler {
    protected IVideoAdStrategy videoAdStrategy;

    public NonBidAdHandler(Context context, String str, String str2) {
        super(context, str, str2);
        IBaseVideoAdStrategy iBaseVideoAdStrategy = this.iBaseVideoAdStrategy;
        if (iBaseVideoAdStrategy instanceof IVideoAdStrategy) {
            this.videoAdStrategy = (IVideoAdStrategy) iBaseVideoAdStrategy;
        }
    }

    public boolean isReady() {
        IVideoAdStrategy iVideoAdStrategy = this.videoAdStrategy;
        if (iVideoAdStrategy == null) {
            return false;
        }
        return iVideoAdStrategy.isReady();
    }

    public void load() {
        IVideoAdStrategy iVideoAdStrategy = this.videoAdStrategy;
        if (iVideoAdStrategy != null) {
            iVideoAdStrategy.load();
        }
    }

    public void loadFormSelfFilling() {
        IVideoAdStrategy iVideoAdStrategy = this.videoAdStrategy;
        if (iVideoAdStrategy != null) {
            iVideoAdStrategy.loadFormSelfFilling();
        }
    }

    public void show() {
        IVideoAdStrategy iVideoAdStrategy = this.videoAdStrategy;
        if (iVideoAdStrategy != null) {
            iVideoAdStrategy.show();
        }
    }

    public void show(Activity activity) {
        IVideoAdStrategy iVideoAdStrategy = this.videoAdStrategy;
        if (iVideoAdStrategy != null) {
            iVideoAdStrategy.show(activity);
        }
    }

    public NonBidAdHandler(String str, String str2) {
        super(str, str2);
        IBaseVideoAdStrategy iBaseVideoAdStrategy = this.iBaseVideoAdStrategy;
        if (iBaseVideoAdStrategy instanceof IVideoAdStrategy) {
            this.videoAdStrategy = (IVideoAdStrategy) iBaseVideoAdStrategy;
        }
    }

    public void show(String str) {
        IVideoAdStrategy iVideoAdStrategy = this.videoAdStrategy;
        if (iVideoAdStrategy != null) {
            iVideoAdStrategy.show(str);
        }
    }

    public void show(String str, String str2) {
        IVideoAdStrategy iVideoAdStrategy = this.videoAdStrategy;
        if (iVideoAdStrategy != null) {
            iVideoAdStrategy.show(str, str2);
        }
    }

    public void show(Activity activity, String str) {
        IVideoAdStrategy iVideoAdStrategy = this.videoAdStrategy;
        if (iVideoAdStrategy != null) {
            iVideoAdStrategy.show(activity, str);
        }
    }

    public void show(Activity activity, String str, String str2) {
        IVideoAdStrategy iVideoAdStrategy = this.videoAdStrategy;
        if (iVideoAdStrategy != null) {
            iVideoAdStrategy.show(activity, str, str2);
        }
    }
}
