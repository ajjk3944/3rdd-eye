package androidx.camera.core.impl;

import C.G;
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

/* compiled from: ImageAnalysisConfig.java */
/* renamed from: androidx.camera.core.impl.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1690g0 implements T0<C.G>, InterfaceC1698k0, J.m {

    /* renamed from: H, reason: collision with root package name */
    public static final C1683d f15034H = U.a.a(G.a.class, "camerax.core.imageAnalysis.backpressureStrategy");

    /* renamed from: I, reason: collision with root package name */
    public static final C1683d f15035I = U.a.a(Integer.TYPE, "camerax.core.imageAnalysis.imageQueueDepth");

    /* renamed from: J, reason: collision with root package name */
    public static final C1683d f15036J = U.a.a(C.N.class, "camerax.core.imageAnalysis.imageReaderProxyProvider");

    /* renamed from: K, reason: collision with root package name */
    public static final C1683d f15037K = U.a.a(G.d.class, "camerax.core.imageAnalysis.outputImageFormat");

    /* renamed from: L, reason: collision with root package name */
    public static final C1683d f15038L = U.a.a(Boolean.class, "camerax.core.imageAnalysis.onePixelShiftEnabled");

    /* renamed from: M, reason: collision with root package name */
    public static final C1683d f15039M = U.a.a(Boolean.class, "camerax.core.imageAnalysis.outputImageRotationEnabled");

    /* renamed from: G, reason: collision with root package name */
    public final C1717u0 f15040G;

    public C1690g0(C1717u0 c1717u0) {
        this.f15040G = c1717u0;
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
        return H7.c(this, InterfaceC1698k0.f15074l);
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
    public final /* synthetic */ boolean f(U.a aVar) {
        return H7.c(this, aVar);
    }

    @Override // androidx.camera.core.impl.U
    public final /* synthetic */ void g(B.i iVar) {
        H7.d(this, iVar);
    }

    @Override // androidx.camera.core.impl.D0
    public final U getConfig() {
        return this.f15040G;
    }

    @Override // androidx.camera.core.impl.InterfaceC1694i0
    public final int h() {
        return 35;
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
        return H7.c(this, InterfaceC1694i0.f15058k);
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
    public final /* synthetic */ Object o(U.a aVar, Object obj) {
        return H7.k(this, aVar, obj);
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
