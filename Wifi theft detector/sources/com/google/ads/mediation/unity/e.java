package com.google.ads.mediation.unity;

import android.content.Context;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.metadata.MediationMetaData;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class e {

    /* renamed from: b, reason: collision with root package name */
    public static e f9591b;

    /* renamed from: a, reason: collision with root package name */
    public final b f9592a = new b();

    public static synchronized e a() {
        try {
            if (f9591b == null) {
                f9591b = new e();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f9591b;
    }

    public void b(Context context, String str, IUnityAdsInitializationListener iUnityAdsInitializationListener) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (this.f9592a.f()) {
            iUnityAdsInitializationListener.onInitializationComplete();
            return;
        }
        MediationMetaData mediationMetaDataA = this.f9592a.a(context);
        mediationMetaDataA.setName("AdMob");
        mediationMetaDataA.setVersion(this.f9592a.d());
        mediationMetaDataA.set("adapter_version", "4.16.5.0");
        mediationMetaDataA.commit();
        this.f9592a.e(context, str, iUnityAdsInitializationListener);
    }
}
