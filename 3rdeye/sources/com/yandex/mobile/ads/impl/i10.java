package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.app.Dialog;

/* loaded from: classes3.dex */
public final class i10 {
    public static final void a(Dialog dialog) {
        kotlin.jvm.internal.l.f(dialog, "<this>");
        Activity ownerActivity = dialog.getOwnerActivity();
        boolean z10 = ownerActivity == null || !(ownerActivity.isFinishing() || ownerActivity.isDestroyed());
        if (dialog.isShowing() && z10) {
            try {
                dialog.dismiss();
            } catch (Exception unused) {
                int i = fp0.f27419b;
            }
        }
    }
}
