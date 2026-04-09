package io.sentry.android.core;

import io.sentry.f3;

/* loaded from: classes.dex */
public abstract /* synthetic */ class f {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f11567a;

    static {
        int[] iArr = new int[f3.values().length];
        f11567a = iArr;
        try {
            iArr[f3.TRACE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f11567a[f3.MANUAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
