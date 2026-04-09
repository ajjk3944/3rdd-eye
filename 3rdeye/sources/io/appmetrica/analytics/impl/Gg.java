package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;

/* loaded from: classes3.dex */
public final class Gg {
    public Gg(InterfaceC4662hb interfaceC4662hb) {
    }

    public static InterfaceC4662hb a(Context context, IHandlerExecutor iHandlerExecutor) {
        C4977tg c4977tg;
        if (ReflectionUtils.detectClassExists("com.android.installreferrer.api.InstallReferrerClient")) {
            try {
                c4977tg = new C4977tg(context, iHandlerExecutor);
            } catch (Throwable unused) {
            }
        } else {
            c4977tg = null;
        }
        return c4977tg == null ? new Fg() : c4977tg;
    }
}
