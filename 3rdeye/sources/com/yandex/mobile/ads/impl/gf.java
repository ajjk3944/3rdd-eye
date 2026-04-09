package com.yandex.mobile.ads.impl;

import android.content.Context;
import b9.C2001h;
import io.appmetrica.analytics.AppMetrica;

/* loaded from: classes3.dex */
public final class gf implements le {
    @Override // com.yandex.mobile.ads.impl.le
    public final hf a(Context context, String apiKey, zd appAdAnalyticsActivator) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(apiKey, "apiKey");
        kotlin.jvm.internal.l.f(appAdAnalyticsActivator, "appAdAnalyticsActivator");
        try {
            return new hf(C2001h.b(new ff(appAdAnalyticsActivator, context, this, apiKey)));
        } catch (Throwable unused) {
            fp0.c(new Object[0]);
            return null;
        }
    }

    @Override // com.yandex.mobile.ads.impl.le
    public final String b(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        try {
            return AppMetrica.getDeviceId(context);
        } catch (Throwable unused) {
            fp0.c(new Object[0]);
            return null;
        }
    }

    @Override // com.yandex.mobile.ads.impl.le
    public final String a(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        try {
            return AppMetrica.getUuid(context);
        } catch (Throwable unused) {
            fp0.c(new Object[0]);
            return null;
        }
    }

    @Override // com.yandex.mobile.ads.impl.le
    public final void a(oe listener) {
        kotlin.jvm.internal.l.f(listener, "listener");
        listener.a("AppMetrica SDK does not support autograb feature since version 6.0.0");
    }

    @Override // com.yandex.mobile.ads.impl.le
    public final void a(Context context, ef listener) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(listener, "listener");
        try {
            AppMetrica.requestStartupParams(context, new Cif(listener), jf.a());
        } catch (Throwable unused) {
            fp0.c(new Object[0]);
            listener.a(df.f26153b);
        }
    }

    @Override // com.yandex.mobile.ads.impl.le
    public final String a() {
        try {
            return AppMetrica.getLibraryVersion();
        } catch (Throwable unused) {
            fp0.c(new Object[0]);
            return null;
        }
    }
}
