package androidx.camera.core.impl;

import C.J;
import N7.C1094a9;
import N7.G8;
import N7.H7;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.impl.H0;
import androidx.camera.core.impl.U;
import androidx.camera.core.impl.U0;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: ImageCaptureConfig.java */
/* renamed from: androidx.camera.core.impl.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1692h0 implements T0<C.J>, InterfaceC1698k0, J.g {

    /* renamed from: H, reason: collision with root package name */
    public static final C1683d f15042H;

    /* renamed from: I, reason: collision with root package name */
    public static final C1683d f15043I;

    /* renamed from: J, reason: collision with root package name */
    public static final C1683d f15044J;

    /* renamed from: K, reason: collision with root package name */
    public static final C1683d f15045K;

    /* renamed from: L, reason: collision with root package name */
    public static final C1683d f15046L;

    /* renamed from: M, reason: collision with root package name */
    public static final C1683d f15047M;

    /* renamed from: N, reason: collision with root package name */
    public static final C1683d f15048N;

    /* renamed from: O, reason: collision with root package name */
    public static final C1683d f15049O;

    /* renamed from: P, reason: collision with root package name */
    public static final C1683d f15050P;

    /* renamed from: Q, reason: collision with root package name */
    public static final C1683d f15051Q;

    /* renamed from: R, reason: collision with root package name */
    public static final C1683d f15052R;

    /* renamed from: G, reason: collision with root package name */
    public final C1717u0 f15053G;

    static {
        Class cls = Integer.TYPE;
        f15042H = U.a.a(cls, "camerax.core.imageCapture.captureMode");
        f15043I = U.a.a(cls, "camerax.core.imageCapture.flashMode");
        f15044J = U.a.a(Q.class, "camerax.core.imageCapture.captureBundle");
        f15045K = U.a.a(Integer.class, "camerax.core.imageCapture.bufferFormat");
        f15046L = U.a.a(Integer.class, "camerax.core.imageCapture.outputFormat");
        U.a.a(Integer.class, "camerax.core.imageCapture.maxCaptureStages");
        f15047M = U.a.a(C.N.class, "camerax.core.imageCapture.imageReaderProxyProvider");
        f15048N = U.a.a(Boolean.TYPE, "camerax.core.imageCapture.useSoftwareJpegEncoder");
        f15049O = U.a.a(cls, "camerax.core.imageCapture.flashType");
        U.a.a(cls, "camerax.core.imageCapture.jpegCompressionQuality");
        f15050P = U.a.a(J.g.class, "camerax.core.imageCapture.screenFlash");
        f15051Q = U.a.a(Q.b.class, "camerax.core.useCase.postviewResolutionSelector");
        f15052R = U.a.a(Boolean.class, "camerax.core.useCase.isPostviewEnabled");
    }

    public C1692h0(C1717u0 c1717u0) {
        this.f15053G = c1717u0;
    }

    @Override // androidx.camera.core.impl.T0
    public final /* synthetic */ U0.b A() {
        return G8.d(this);
    }

    @Override // androidx.camera.core.impl.T0
    public final /* synthetic */ int B() {
        return G8.m(this);
    }

    @Override // J.l
    public final /* synthetic */ String C() {
        return F3.h.d(this);
    }

    @Override // androidx.camera.core.impl.InterfaceC1698k0
    public final boolean D() {
        int i = C1696j0.f15063a;
        return f(InterfaceC1698k0.f15074l);
    }

    @Override // androidx.camera.core.impl.InterfaceC1698k0
    public final /* synthetic */ int E() {
        return C1696j0.d(this);
    }

    @Override // androidx.camera.core.impl.T0
    public final /* synthetic */ int F() {
        return G8.i(this);
    }

    @Override // androidx.camera.core.impl.InterfaceC1698k0
    public final Size G() {
        int i = C1696j0.f15063a;
        return (Size) o(InterfaceC1698k0.f15080r, null);
    }

    @Override // androidx.camera.core.impl.T0
    public final /* synthetic */ boolean H() {
        return G8.o(this);
    }

    @Override // androidx.camera.core.impl.InterfaceC1698k0
    public final /* synthetic */ int I() {
        return C1696j0.a(this);
    }

    @Override // androidx.camera.core.impl.InterfaceC1694i0
    public final /* synthetic */ C.C a() {
        return C1094a9.c(this);
    }

    @Override // androidx.camera.core.impl.U
    public final /* synthetic */ Object b(U.a aVar) {
        return H7.j(this, aVar);
    }

    @Override // androidx.camera.core.impl.InterfaceC1698k0
    public final List c() {
        int i = C1696j0.f15063a;
        return (List) o(InterfaceC1698k0.f15081s, null);
    }

    @Override // androidx.camera.core.impl.InterfaceC1698k0
    public final Q.b d() {
        int i = C1696j0.f15063a;
        return (Q.b) b(InterfaceC1698k0.f15082t);
    }

    @Override // androidx.camera.core.impl.T0
    public final /* synthetic */ Range e() {
        return G8.l(this, null);
    }

    @Override // androidx.camera.core.impl.U
    public final boolean f(U.a aVar) {
        return ((C1717u0) getConfig()).f(aVar);
    }

    @Override // androidx.camera.core.impl.U
    public final /* synthetic */ void g(B.i iVar) {
        H7.d(this, iVar);
    }

    @Override // androidx.camera.core.impl.D0
    public final U getConfig() {
        return this.f15053G;
    }

    @Override // androidx.camera.core.impl.InterfaceC1694i0
    public final int h() {
        return ((Integer) ((C1717u0) getConfig()).b(InterfaceC1694i0.f15057j)).intValue();
    }

    @Override // androidx.camera.core.impl.InterfaceC1698k0
    public final /* synthetic */ int i() {
        return C1696j0.c(this);
    }

    @Override // androidx.camera.core.impl.U
    public final /* synthetic */ Object j(U.a aVar, U.b bVar) {
        return H7.l(this, aVar, bVar);
    }

    @Override // androidx.camera.core.impl.InterfaceC1694i0
    public final boolean k() {
        return f(InterfaceC1694i0.f15058k);
    }

    @Override // androidx.camera.core.impl.U
    public final /* synthetic */ Set l() {
        return H7.i(this);
    }

    @Override // androidx.camera.core.impl.T0
    public final /* synthetic */ H0 m() {
        return G8.f(this);
    }

    @Override // androidx.camera.core.impl.T0
    public final /* synthetic */ int n() {
        return G8.k(this);
    }

    @Override // androidx.camera.core.impl.U
    public final Object o(U.a aVar, Object obj) {
        return ((C1717u0) getConfig()).o(aVar, obj);
    }

    @Override // androidx.camera.core.impl.T0
    public final /* synthetic */ H0.e p() {
        return G8.j(this);
    }

    @Override // androidx.camera.core.impl.T0
    public final /* synthetic */ boolean q() {
        return G8.n(this);
    }

    @Override // androidx.camera.core.impl.InterfaceC1698k0
    public final /* synthetic */ ArrayList r() {
        return C1696j0.b(this);
    }

    @Override // androidx.camera.core.impl.InterfaceC1698k0
    public final Q.b s() {
        int i = C1696j0.f15063a;
        return (Q.b) o(InterfaceC1698k0.f15082t, null);
    }

    @Override // androidx.camera.core.impl.T0
    public final /* synthetic */ H0 t() {
        return G8.h(this);
    }

    @Override // J.l
    public final /* synthetic */ String u(String str) {
        return F3.h.h(this, str);
    }

    @Override // androidx.camera.core.impl.InterfaceC1698k0
    public final Size v() {
        int i = C1696j0.f15063a;
        return (Size) o(InterfaceC1698k0.f15079q, null);
    }

    @Override // androidx.camera.core.impl.U
    public final /* synthetic */ U.b w(U.a aVar) {
        return H7.f(this, aVar);
    }

    @Override // androidx.camera.core.impl.U
    public final /* synthetic */ Set x(U.a aVar) {
        return H7.h(this, aVar);
    }

    @Override // androidx.camera.core.impl.InterfaceC1698k0
    public final /* synthetic */ int y() {
        return C1696j0.e(this);
    }

    @Override // androidx.camera.core.impl.InterfaceC1698k0
    public final Size z() {
        int i = C1696j0.f15063a;
        return (Size) o(InterfaceC1698k0.f15078p, null);
    }
}
