package io.appmetrica.analytics.impl;

import android.os.Looper;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.un, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5009un implements InterfaceC5059wn {
    @Override // io.appmetrica.analytics.impl.InterfaceC5059wn
    public final Thread a() {
        return Looper.getMainLooper().getThread();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5059wn
    public final StackTraceElement[] b() {
        return null;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5059wn
    public final Map c() {
        return Thread.getAllStackTraces();
    }
}
