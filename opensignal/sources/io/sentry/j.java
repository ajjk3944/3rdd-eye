package io.sentry;

/* loaded from: classes.dex */
public abstract /* synthetic */ class j {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f12372a;

    static {
        int[] iArr = new int[t3.values().length];
        f12372a = iArr;
        try {
            iArr[t3.CURRENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f12372a[t3.ISOLATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f12372a[t3.GLOBAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f12372a[t3.COMBINED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
