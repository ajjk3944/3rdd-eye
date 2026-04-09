package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdError;
import com.facebook.ads.internal.protocol.AdErrorType;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class XE {
    public static AdError A00(C0908Vm c0908Vm) {
        if (c0908Vm.A03().isPublicError()) {
            return new AdError(c0908Vm.A03().getErrorCode(), c0908Vm.A04());
        }
        return new AdError(AdErrorType.UNKNOWN_ERROR.getErrorCode(), AdErrorType.UNKNOWN_ERROR.getDefaultErrorMessage());
    }
}
