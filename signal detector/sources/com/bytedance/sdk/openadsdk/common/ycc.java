package com.bytedance.sdk.openadsdk.common;

import com.bytedance.sdk.openadsdk.api.PAGErrorCode;
import com.bytedance.sdk.openadsdk.api.PAGLoadListener;
import com.bytedance.sdk.openadsdk.api.factory.ISDKTypeFactory;
import com.bytedance.sdk.openadsdk.api.factory.SDKTypeConfig;

/* loaded from: classes.dex */
public class ycc {
    private static boolean emc = false;

    public static void emc(boolean z6) {
        emc = z6;
    }

    public static ISDKTypeFactory emc(PAGLoadListener pAGLoadListener) {
        if (emc) {
            if (pAGLoadListener != null) {
                pAGLoadListener.onError(-1, PAGErrorCode.LOAD_SDK_DISABLE_MSG);
            }
            return null;
        }
        ISDKTypeFactory sdkTypeFactory = SDKTypeConfig.getSdkTypeFactory();
        if (sdkTypeFactory != null) {
            return sdkTypeFactory;
        }
        if (pAGLoadListener != null) {
            pAGLoadListener.onError(PAGErrorCode.LOAD_FACTORY_NULL_CODE, PAGErrorCode.LOAD_FACTORY_NULL_MSG);
        }
        return null;
    }

    public static boolean emc() {
        return emc;
    }
}
