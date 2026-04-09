package io.sentry.util;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f12810a;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f12811b;

    static {
        try {
            f12810a = "The Android Project".equals(System.getProperty("java.vendor"));
        } catch (Throwable unused) {
            f12810a = false;
        }
        try {
            String property = System.getProperty("java.specification.version");
            if (property != null) {
                f12811b = Double.valueOf(property).doubleValue() >= 9.0d;
            } else {
                f12811b = false;
            }
        } catch (Throwable unused2) {
            f12811b = false;
        }
    }
}
