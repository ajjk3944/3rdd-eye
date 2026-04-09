package com.unity3d.ads;

import com.unity3d.ads.core.domain.LegacyLoadUseCase;
import java.lang.reflect.InvocationTargetException;
import org.json.JSONException;

/* loaded from: classes3.dex */
public class UnityAdsLoadOptions extends UnityAdsBaseOptions {
    private String AD_MARKUP = LegacyLoadUseCase.KEY_AD_MARKUP;

    public void setAdMarkup(String str) throws JSONException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        set(this.AD_MARKUP, str);
    }
}
