package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdError;
import com.facebook.ads.internal.protocol.AdErrorType;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class XE {
    public static AdError A00(C1286Vm c1286Vm) {
        if (c1286Vm.A03().isPublicError()) {
            return new AdError(c1286Vm.A03().getErrorCode(), c1286Vm.A04());
        }
        return new AdError(AdErrorType.UNKNOWN_ERROR.getErrorCode(), AdErrorType.UNKNOWN_ERROR.getDefaultErrorMessage());
    }
}
