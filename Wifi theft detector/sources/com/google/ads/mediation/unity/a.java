package com.google.ads.mediation.unity;

import android.app.Activity;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.IUnityAdsShowListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.UnityAdsShowOptions;
import java.lang.reflect.InvocationTargetException;
import org.json.JSONException;

/* loaded from: classes.dex */
public class a {
    public UnityAdsLoadOptions a(String str) throws JSONException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        UnityAdsLoadOptions unityAdsLoadOptions = new UnityAdsLoadOptions();
        unityAdsLoadOptions.setObjectId(str);
        return unityAdsLoadOptions;
    }

    public UnityAdsShowOptions b(String str) throws JSONException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        UnityAdsShowOptions unityAdsShowOptions = new UnityAdsShowOptions();
        unityAdsShowOptions.setObjectId(str);
        return unityAdsShowOptions;
    }

    public void c(String str, UnityAdsLoadOptions unityAdsLoadOptions, IUnityAdsLoadListener iUnityAdsLoadListener) {
        UnityAds.load(str, unityAdsLoadOptions, iUnityAdsLoadListener);
    }

    public void d(Activity activity, String str, UnityAdsShowOptions unityAdsShowOptions, IUnityAdsShowListener iUnityAdsShowListener) {
        UnityAds.show(activity, str, unityAdsShowOptions, iUnityAdsShowListener);
    }
}
