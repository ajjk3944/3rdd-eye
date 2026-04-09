package androidx.camera.core.impl;

import C.m0;
import android.util.Range;
import androidx.camera.core.impl.H0;
import androidx.camera.core.impl.S;
import androidx.camera.core.impl.U;
import androidx.camera.core.impl.U0;

/* compiled from: UseCaseConfig.java */
/* loaded from: classes.dex */
public interface T0<T extends C.m0> extends J.l<T>, InterfaceC1694i0 {

    /* renamed from: A, reason: collision with root package name */
    public static final C1683d f14965A;

    /* renamed from: B, reason: collision with root package name */
    public static final C1683d f14966B;

    /* renamed from: C, reason: collision with root package name */
    public static final C1683d f14967C;

    /* renamed from: D, reason: collision with root package name */
    public static final C1683d f14968D;

    /* renamed from: E, reason: collision with root package name */
    public static final C1683d f14969E;

    /* renamed from: F, reason: collision with root package name */
    public static final C1683d f14970F;

    /* renamed from: v, reason: collision with root package name */
    public static final C1683d f14971v = U.a.a(H0.class, "camerax.core.useCase.defaultSessionConfig");

    /* renamed from: w, reason: collision with root package name */
    public static final C1683d f14972w = U.a.a(S.class, "camerax.core.useCase.defaultCaptureConfig");

    /* renamed from: x, reason: collision with root package name */
    public static final C1683d f14973x = U.a.a(H0.e.class, "camerax.core.useCase.sessionConfigUnpacker");

    /* renamed from: y, reason: collision with root package name */
    public static final C1683d f14974y = U.a.a(S.b.class, "camerax.core.useCase.captureConfigUnpacker");

    /* renamed from: z, reason: collision with root package name */
    public static final C1683d f14975z;

    /* compiled from: UseCaseConfig.java */
    public interface a<T extends C.m0, C extends T0<T>, B> extends C.D<T> {
        C b();
    }

    static {
        Class cls = Integer.TYPE;
        f14975z = U.a.a(cls, "camerax.core.useCase.surfaceOccupancyPriority");
        f14965A = U.a.a(Range.class, "camerax.core.useCase.targetFrameRate");
        Class cls2 = Boolean.TYPE;
        f14966B = U.a.a(cls2, "camerax.core.useCase.zslDisabled");
        f14967C = U.a.a(cls2, "camerax.core.useCase.highResolutionDisabled");
        f14968D = U.a.a(U0.b.class, "camerax.core.useCase.captureType");
        f14969E = U.a.a(cls, "camerax.core.useCase.previewStabilizationMode");
        f14970F = U.a.a(cls, "camerax.core.useCase.videoStabilizationMode");
    }

    U0.b A();

    int B();

    int F();

    boolean H();

    Range e();

    H0 m();

    int n();

    H0.e p();

    boolean q();

    H0 t();
}
