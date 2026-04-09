package io.sentry;

/* loaded from: classes.dex */
public abstract /* synthetic */ class k3 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f12410a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f12411b;

    static {
        int[] iArr = new int[io.sentry.rrweb.c.values().length];
        f12411b = iArr;
        try {
            iArr[io.sentry.rrweb.c.IncrementalSnapshot.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f12411b[io.sentry.rrweb.c.Meta.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f12411b[io.sentry.rrweb.c.Custom.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[io.sentry.rrweb.d.values().length];
        f12410a = iArr2;
        try {
            iArr2[io.sentry.rrweb.d.MouseInteraction.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f12410a[io.sentry.rrweb.d.TouchMove.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
