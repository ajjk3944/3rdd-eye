package androidx.camera.core.impl;

import C.C0617d;
import android.util.Size;
import androidx.camera.core.impl.U;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ImageOutputConfig.java */
/* renamed from: androidx.camera.core.impl.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1698k0 extends D0 {

    /* renamed from: l, reason: collision with root package name */
    public static final C1683d f15074l = U.a.a(C0617d.class, "camerax.core.imageOutput.targetAspectRatio");

    /* renamed from: m, reason: collision with root package name */
    public static final C1683d f15075m;

    /* renamed from: n, reason: collision with root package name */
    public static final C1683d f15076n;

    /* renamed from: o, reason: collision with root package name */
    public static final C1683d f15077o;

    /* renamed from: p, reason: collision with root package name */
    public static final C1683d f15078p;

    /* renamed from: q, reason: collision with root package name */
    public static final C1683d f15079q;

    /* renamed from: r, reason: collision with root package name */
    public static final C1683d f15080r;

    /* renamed from: s, reason: collision with root package name */
    public static final C1683d f15081s;

    /* renamed from: t, reason: collision with root package name */
    public static final C1683d f15082t;

    /* renamed from: u, reason: collision with root package name */
    public static final C1683d f15083u;

    static {
        Class cls = Integer.TYPE;
        f15075m = U.a.a(cls, "camerax.core.imageOutput.targetRotation");
        f15076n = U.a.a(cls, "camerax.core.imageOutput.appTargetRotation");
        f15077o = U.a.a(cls, "camerax.core.imageOutput.mirrorMode");
        f15078p = U.a.a(Size.class, "camerax.core.imageOutput.targetResolution");
        f15079q = U.a.a(Size.class, "camerax.core.imageOutput.defaultResolution");
        f15080r = U.a.a(Size.class, "camerax.core.imageOutput.maxResolution");
        f15081s = U.a.a(List.class, "camerax.core.imageOutput.supportedResolutions");
        f15082t = U.a.a(Q.b.class, "camerax.core.imageOutput.resolutionSelector");
        f15083u = U.a.a(List.class, "camerax.core.imageOutput.customOrderedResolutions");
    }

    boolean D();

    int E();

    Size G();

    int I();

    List c();

    Q.b d();

    int i();

    ArrayList r();

    Q.b s();

    Size v();

    int y();

    Size z();
}
