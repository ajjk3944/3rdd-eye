package io.sentry.android.core;

import io.sentry.b5;

/* loaded from: classes.dex */
public abstract /* synthetic */ class j {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f11689a;

    static {
        int[] iArr = new int[b5.values().length];
        f11689a = iArr;
        try {
            iArr[b5.INFO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f11689a[b5.WARNING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f11689a[b5.ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f11689a[b5.FATAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f11689a[b5.DEBUG.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
