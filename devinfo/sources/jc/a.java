package jc;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final LinearInterpolator f27482a = new LinearInterpolator();

    /* renamed from: b, reason: collision with root package name */
    public static final d5.a f27483b = new d5.a(1);

    /* renamed from: c, reason: collision with root package name */
    public static final d5.a f27484c = new d5.a(0);

    /* renamed from: d, reason: collision with root package name */
    public static final d5.a f27485d = new d5.a(2);

    /* renamed from: e, reason: collision with root package name */
    public static final DecelerateInterpolator f27486e = new DecelerateInterpolator();

    public static float a(float f10, float f11, float f12) {
        return r5.c.c(f11, f10, f12, f10);
    }

    public static float b(float f10, float f11, float f12, float f13, float f14) {
        return f14 <= f12 ? f10 : f14 >= f13 ? f11 : a(f10, f11, (f14 - f12) / (f13 - f12));
    }

    public static int c(float f10, int i4, int i10) {
        return Math.round(f10 * (i10 - i4)) + i4;
    }
}
