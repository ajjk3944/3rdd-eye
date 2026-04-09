package fj;

import android.content.ClipData;
import android.telephony.TelephonyCallback;
import android.view.ContentInfo;
import android.view.View;
import android.window.SplashScreenView;

/* loaded from: classes.dex */
public abstract /* synthetic */ class i {
    public static /* bridge */ /* synthetic */ TelephonyCallback g(Object obj) {
        return (TelephonyCallback) obj;
    }

    public static /* synthetic */ ContentInfo.Builder h(ClipData clipData, int i10) {
        return new ContentInfo.Builder(clipData, i10);
    }

    public static /* bridge */ /* synthetic */ ContentInfo j(Object obj) {
        return (ContentInfo) obj;
    }

    public static /* bridge */ /* synthetic */ SplashScreenView m(View view) {
        return (SplashScreenView) view;
    }

    public static /* bridge */ /* synthetic */ boolean z(View view) {
        return view instanceof SplashScreenView;
    }
}
