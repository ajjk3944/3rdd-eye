package c0;

import android.view.ViewConfiguration;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class f0 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f2413a = ViewConfiguration.getScrollFriction();

    /* renamed from: b, reason: collision with root package name */
    public static final double f2414b;

    /* renamed from: c, reason: collision with root package name */
    public static final double f2415c;

    static {
        double dLog = Math.log(0.78d) / Math.log(0.9d);
        f2414b = dLog;
        f2415c = dLog - 1.0d;
    }
}
