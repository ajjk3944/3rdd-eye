package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* renamed from: io.appmetrica.analytics.impl.f6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4605f6 extends BaseRequestConfig.ComponentLoader {

    /* renamed from: a, reason: collision with root package name */
    public final SafePackageManager f40838a;

    public AbstractC4605f6(Context context, String str) {
        this(context, str, new SafePackageManager());
    }

    @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.RequestConfigLoader
    /* renamed from: a */
    public C4631g6 load(C4579e6 c4579e6) {
        C4631g6 c4631g6 = (C4631g6) super.load((AbstractC4605f6) c4579e6);
        String packageName = getContext().getPackageName();
        ApplicationInfo applicationInfo = this.f40838a.getApplicationInfo(getContext(), getPackageName(), 0);
        if (applicationInfo != null) {
            int i = applicationInfo.flags;
            c4631g6.f40928a = (i & 2) != 0 ? "1" : CommonUrlParts.Values.FALSE_INTEGER;
            c4631g6.f40929b = (i & 1) == 0 ? CommonUrlParts.Values.FALSE_INTEGER : "1";
        } else if (TextUtils.equals(packageName, getPackageName())) {
            c4631g6.f40928a = (getContext().getApplicationInfo().flags & 2) != 0 ? "1" : CommonUrlParts.Values.FALSE_INTEGER;
            c4631g6.f40929b = (getContext().getApplicationInfo().flags & 1) == 0 ? CommonUrlParts.Values.FALSE_INTEGER : "1";
        } else {
            c4631g6.f40928a = CommonUrlParts.Values.FALSE_INTEGER;
            c4631g6.f40929b = CommonUrlParts.Values.FALSE_INTEGER;
        }
        C4544cm c4544cm = c4579e6.f40791a;
        c4631g6.f40930c = c4544cm;
        c4631g6.setRetryPolicyConfig(c4544cm.f40658t);
        return c4631g6;
    }

    public AbstractC4605f6(Context context, String str, SafePackageManager safePackageManager) {
        super(context, str);
        this.f40838a = safePackageManager;
    }
}
