package v;

import N7.C1094a9;
import N7.G8;
import N7.H7;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.C1710q0;
import androidx.camera.core.impl.H0;
import androidx.camera.core.impl.InterfaceC1694i0;
import androidx.camera.core.impl.T0;
import androidx.camera.core.impl.U;
import androidx.camera.core.impl.U0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import w.C5698l;
import z.C5844n;

/* compiled from: MeteringRepeatingSession.java */
/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public C.i0 f46726a;

    /* renamed from: b, reason: collision with root package name */
    public H0 f46727b;

    /* renamed from: c, reason: collision with root package name */
    public final b f46728c;

    /* renamed from: d, reason: collision with root package name */
    public final Size f46729d;

    /* renamed from: e, reason: collision with root package name */
    public final B.f f46730e;

    /* renamed from: f, reason: collision with root package name */
    public H0.c f46731f;

    /* compiled from: MeteringRepeatingSession.java */
    public class a implements I.c<Void> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Surface f46732b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ SurfaceTexture f46733c;

        public a(Surface surface, SurfaceTexture surfaceTexture) {
            this.f46732b = surface;
            this.f46733c = surfaceTexture;
        }

        @Override // I.c
        public final void onFailure(Throwable th) {
            throw new IllegalStateException("Future should never fail. Did it get completed by GC?", th);
        }

        @Override // I.c
        public final void onSuccess(Void r12) {
            this.f46732b.release();
            this.f46733c.release();
        }
    }

    /* compiled from: MeteringRepeatingSession.java */
    public static class b implements T0<C.m0> {

        /* renamed from: G, reason: collision with root package name */
        public final C1710q0 f46734G;

        public b() {
            C1710q0 c1710q0K = C1710q0.K();
            c1710q0K.N(T0.f14973x, new J());
            c1710q0K.N(InterfaceC1694i0.f15057j, 34);
            c1710q0K.N(J.l.f2691c, k0.class);
            c1710q0K.N(J.l.f2690b, k0.class.getCanonicalName() + "-" + UUID.randomUUID());
            this.f46734G = c1710q0K;
        }

        @Override // androidx.camera.core.impl.T0
        public final U0.b A() {
            return U0.b.METERING_REPEATING;
        }

        @Override // androidx.camera.core.impl.T0
        public final /* synthetic */ int B() {
            return G8.m(this);
        }

        @Override // J.l
        public final /* synthetic */ String C() {
            return F3.h.d(this);
        }

        @Override // androidx.camera.core.impl.T0
        public final /* synthetic */ int F() {
            return G8.i(this);
        }

        @Override // androidx.camera.core.impl.T0
        public final /* synthetic */ boolean H() {
            return G8.o(this);
        }

        @Override // androidx.camera.core.impl.InterfaceC1694i0
        public final /* synthetic */ C.C a() {
            return C1094a9.c(this);
        }

        @Override // androidx.camera.core.impl.U
        public final Object b(U.a aVar) {
            return this.f46734G.b(aVar);
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
        public final void g(B.i iVar) {
            this.f46734G.g(iVar);
        }

        @Override // androidx.camera.core.impl.D0
        public final androidx.camera.core.impl.U getConfig() {
            return this.f46734G;
        }

        @Override // androidx.camera.core.impl.InterfaceC1694i0
        public final int h() {
            return ((Integer) b(InterfaceC1694i0.f15057j)).intValue();
        }

        @Override // androidx.camera.core.impl.U
        public final Object j(U.a aVar, U.b bVar) {
            return this.f46734G.j(aVar, bVar);
        }

        @Override // androidx.camera.core.impl.InterfaceC1694i0
        public final boolean k() {
            return H7.c(this, InterfaceC1694i0.f15058k);
        }

        @Override // androidx.camera.core.impl.U
        public final Set l() {
            return this.f46734G.l();
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

        @Override // androidx.camera.core.impl.T0
        public final /* synthetic */ H0 t() {
            return G8.h(this);
        }

        @Override // J.l
        public final /* synthetic */ String u(String str) {
            return F3.h.h(this, str);
        }

        @Override // androidx.camera.core.impl.U
        public final U.b w(U.a aVar) {
            return this.f46734G.w(aVar);
        }

        @Override // androidx.camera.core.impl.U
        public final Set x(U.a aVar) {
            return this.f46734G.x(aVar);
        }
    }

    public k0(C5698l c5698l, c0 c0Var, B.f fVar) {
        Size size;
        C5844n c5844n = new C5844n();
        Size size2 = null;
        this.f46731f = null;
        this.f46728c = new b();
        this.f46730e = fVar;
        Size[] sizeArrA = c5698l.b().a(34);
        if (sizeArrA == null) {
            C.S.b("MeteringRepeating", "Can not get output size list.");
            size = new Size(0, 0);
        } else {
            if (c5844n.f48403a != null && "Huawei".equalsIgnoreCase(Build.BRAND) && "mha-l29".equalsIgnoreCase(Build.MODEL)) {
                ArrayList arrayList = new ArrayList();
                for (Size size3 : sizeArrA) {
                    if (C5844n.f48402c.compare(size3, C5844n.f48401b) >= 0) {
                        arrayList.add(size3);
                    }
                }
                sizeArrA = (Size[]) arrayList.toArray(new Size[0]);
            }
            List listAsList = Arrays.asList(sizeArrA);
            Collections.sort(listAsList, new T4.a(2));
            Size sizeE = c0Var.e();
            long jMin = Math.min(sizeE.getWidth() * sizeE.getHeight(), 307200L);
            int length = sizeArrA.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                Size size4 = sizeArrA[i];
                long width = size4.getWidth() * size4.getHeight();
                if (width == jMin) {
                    size = size4;
                    break;
                } else if (width <= jMin) {
                    i++;
                    size2 = size4;
                } else if (size2 != null) {
                    size = size2;
                }
            }
            size = (Size) listAsList.get(0);
        }
        this.f46729d = size;
        C.S.a("MeteringRepeating", "MeteringSession SurfaceTexture size: " + size);
        this.f46727b = a();
    }

    public final H0 a() {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        Size size = this.f46729d;
        surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
        Surface surface = new Surface(surfaceTexture);
        H0.b bVarE = H0.b.e(this.f46728c, size);
        bVarE.f14887b.f14950c = 1;
        C.i0 i0Var = new C.i0(surface);
        this.f46726a = i0Var;
        I.j.a(I.j.f(i0Var.f14991e), new a(surface, surfaceTexture), E.u.y());
        bVarE.c(this.f46726a, C.C.f616d, -1);
        H0.c cVar = this.f46731f;
        if (cVar != null) {
            cVar.b();
        }
        H0.c cVar2 = new H0.c(new C.F(this, 2));
        this.f46731f = cVar2;
        bVarE.f14891f = cVar2;
        return bVarE.d();
    }
}
