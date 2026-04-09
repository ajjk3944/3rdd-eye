package io.sentry.android.core;

/* loaded from: classes.dex */
public abstract /* synthetic */ class t {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f11773a;

    static {
        int[] iArr = new int[io.sentry.n0.values().length];
        f11773a = iArr;
        try {
            iArr[io.sentry.n0.CONNECTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f11773a[io.sentry.n0.UNKNOWN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f11773a[io.sentry.n0.NO_PERMISSION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
