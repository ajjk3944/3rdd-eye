package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f42540a;

    static {
        int[] iArr = new int[ActivityEvent.values().length];
        iArr[ActivityEvent.RESUMED.ordinal()] = 1;
        iArr[ActivityEvent.PAUSED.ordinal()] = 2;
        f42540a = iArr;
    }
}
