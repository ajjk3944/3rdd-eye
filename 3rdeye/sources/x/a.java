package X;

import A2.l;
import B.i;
import C.C;
import F3.h;
import J.m;
import N7.C1094a9;
import N7.G8;
import N7.H7;
import Q.b;
import W.T;
import W.Z;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.impl.C1683d;
import androidx.camera.core.impl.C1696j0;
import androidx.camera.core.impl.C1717u0;
import androidx.camera.core.impl.H0;
import androidx.camera.core.impl.InterfaceC1694i0;
import androidx.camera.core.impl.InterfaceC1698k0;
import androidx.camera.core.impl.T0;
import androidx.camera.core.impl.U;
import androidx.camera.core.impl.U0;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import r.InterfaceC5503a;

/* compiled from: VideoCaptureConfig.java */
/* loaded from: classes.dex */
public final class a<T extends Z> implements T0<T<T>>, InterfaceC1698k0, m {

    /* renamed from: H, reason: collision with root package name */
    public static final C1683d f13413H = U.a.a(Z.class, "camerax.video.VideoCapture.videoOutput");

    /* renamed from: I, reason: collision with root package name */
    public static final C1683d f13414I = U.a.a(InterfaceC5503a.class, "camerax.video.VideoCapture.videoEncoderInfoFinder");

    /* renamed from: J, reason: collision with root package name */
    public static final C1683d f13415J = U.a.a(Boolean.class, "camerax.video.VideoCapture.forceEnableSurfaceProcessing");

    /* renamed from: G, reason: collision with root package name */
    public final C1717u0 f13416G;

    public a(C1717u0 c1717u0) {
        l.l(c1717u0.f15118G.containsKey(f13413H));
        this.f13416G = c1717u0;
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
        return h.d(this);
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
    public final /* synthetic */ C a() {
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
    public final b d() {
        int i = C1696j0.f15063a;
        return (b) b(InterfaceC1698k0.f15082t);
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
    public final /* synthetic */ void g(i iVar) {
        H7.d(this, iVar);
    }

    @Override // androidx.camera.core.impl.D0
    public final U getConfig() {
        return this.f13416G;
    }

    @Override // androidx.camera.core.impl.InterfaceC1694i0
    public final int h() {
        return 34;
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
    public final b s() {
        int i = C1696j0.f15063a;
        return (b) o(InterfaceC1698k0.f15082t, null);
    }

    @Override // androidx.camera.core.impl.T0
    public final /* synthetic */ H0 t() {
        return G8.h(this);
    }

    @Override // J.l
    public final /* synthetic */ String u(String str) {
        return h.h(this, str);
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
