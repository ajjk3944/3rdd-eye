package com.google.android.gms.common.api;

import android.app.Activity;
import android.content.IntentSender;

/* loaded from: classes.dex */
public class ResolvableApiException extends ApiException {
    public ResolvableApiException(Status status) {
        super(status);
    }

    public void a(Activity activity, int i10) throws IntentSender.SendIntentException {
        getStatus().j(activity, i10);
    }
}
