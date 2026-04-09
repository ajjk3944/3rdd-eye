package io.sentry.android.replay;

import io.sentry.w3;

/* loaded from: classes.dex */
public abstract /* synthetic */ class r {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f11947a;

    static {
        int[] iArr = new int[w3.values().length];
        try {
            iArr[w3.CANVAS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[w3.PIXEL_COPY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f11947a = iArr;
    }
}
