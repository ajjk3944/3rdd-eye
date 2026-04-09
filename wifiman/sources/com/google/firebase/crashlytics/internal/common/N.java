package com.google.firebase.crashlytics.internal.common;

import android.content.Context;

/* loaded from: classes3.dex */
class N {

    /* renamed from: a, reason: collision with root package name */
    private String f38749a;

    N() {
    }

    private static String b(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName == null ? "" : installerPackageName;
    }

    synchronized String a(Context context) {
        try {
            if (this.f38749a == null) {
                this.f38749a = b(context);
            }
        } finally {
        }
        return "".equals(this.f38749a) ? null : this.f38749a;
    }
}
