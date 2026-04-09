package com.google.android.gms.common.util;

import android.os.StrictMode;

/* loaded from: classes.dex */
abstract class t {
    static StrictMode.VmPolicy.Builder a(StrictMode.VmPolicy.Builder builder) {
        return builder.permitUnsafeIntentLaunch();
    }
}
