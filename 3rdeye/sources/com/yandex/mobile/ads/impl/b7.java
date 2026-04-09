package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.monetization.ads.mediation.base.model.MediatedAdObjectInfo;
import com.monetization.ads.quality.base.result.AdQualityVerificationResult;
import f9.InterfaceC4347e;

/* loaded from: classes3.dex */
public interface b7 {
    Object a(Context context, Object obj, a8<?> a8Var, C4072a3 c4072a3, MediatedAdObjectInfo mediatedAdObjectInfo, InterfaceC4347e<? super AdQualityVerificationResult> interfaceC4347e);

    void onAdClicked();

    void onAdClosed();

    void onAdWillDisplay();

    void onInvalidated();
}
