package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;

/* renamed from: com.yandex.mobile.ads.impl.e1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4098e1 {

    /* renamed from: b, reason: collision with root package name */
    private static final String f26612b = "com.yandex.mobile.ads.common.AdActivity";

    /* renamed from: c, reason: collision with root package name */
    private static final String f26613c = "There is no presence of com.yandex.mobile.ads.common.AdActivity activity in AndroidManifest file.";

    /* renamed from: a, reason: collision with root package name */
    private final C4222w0 f26614a = new C4222w0();

    @SuppressLint({"WrongConstant"})
    public final void a(Context context) throws PackageManager.NameNotFoundException, oo0 {
        kotlin.jvm.internal.l.f(context, "context");
        try {
            ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(new ComponentName(context.getPackageName(), f26612b), 0);
            kotlin.jvm.internal.l.e(activityInfo, "getActivityInfo(...)");
            this.f26614a.getClass();
            C4222w0.a(activityInfo);
        } catch (PackageManager.NameNotFoundException unused) {
            String str = f26613c;
            throw new oo0(str, str);
        }
    }
}
