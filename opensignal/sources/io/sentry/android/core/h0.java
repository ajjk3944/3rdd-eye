package io.sentry.android.core;

/* loaded from: classes.dex */
public abstract /* synthetic */ class h0 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f11590a;

    static {
        int[] iArr = new int[io.sentry.n0.values().length];
        f11590a = iArr;
        try {
            iArr[io.sentry.n0.DISCONNECTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f11590a[io.sentry.n0.CONNECTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
