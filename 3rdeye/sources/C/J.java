package C;

import E.C0654b;
import N7.B8;
import N7.G8;
import android.graphics.Rect;
import android.util.Log;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.impl.C1683d;
import androidx.camera.core.impl.C1692h0;
import androidx.camera.core.impl.C1697k;
import androidx.camera.core.impl.C1701m;
import androidx.camera.core.impl.C1710q0;
import androidx.camera.core.impl.C1717u0;
import androidx.camera.core.impl.D;
import androidx.camera.core.impl.H0;
import androidx.camera.core.impl.I0;
import androidx.camera.core.impl.InterfaceC1694i0;
import androidx.camera.core.impl.InterfaceC1698k0;
import androidx.camera.core.impl.InterfaceC1708p0;
import androidx.camera.core.impl.L0;
import androidx.camera.core.impl.T0;
import androidx.camera.core.impl.U0;
import androidx.camera.core.internal.compat.quirk.SoftwareJpegEncodingPreferredQuirk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ImageCapture.java */
/* loaded from: classes.dex */
public final class J extends m0 {

    /* renamed from: z, reason: collision with root package name */
    public static final c f636z = new c();

    /* renamed from: p, reason: collision with root package name */
    public final int f637p;

    /* renamed from: q, reason: collision with root package name */
    public final AtomicReference<Integer> f638q;

    /* renamed from: r, reason: collision with root package name */
    public final int f639r;

    /* renamed from: s, reason: collision with root package name */
    public final int f640s;

    /* renamed from: t, reason: collision with root package name */
    public final J.i f641t;

    /* renamed from: u, reason: collision with root package name */
    public H0.b f642u;

    /* renamed from: v, reason: collision with root package name */
    public E.r f643v;

    /* renamed from: w, reason: collision with root package name */
    public E.D f644w;

    /* renamed from: x, reason: collision with root package name */
    public H0.c f645x;

    /* renamed from: y, reason: collision with root package name */
    public final a f646y;

    /* compiled from: ImageCapture.java */
    public class a {
        public a() {
        }

        public final void a() {
            J j4 = J.this;
            synchronized (j4.f638q) {
                try {
                    Integer andSet = j4.f638q.getAndSet(null);
                    if (andSet == null) {
                        return;
                    }
                    if (andSet.intValue() != j4.E()) {
                        j4.G();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* compiled from: ImageCapture.java */
    public static final class b implements T0.a<J, C1692h0, b> {

        /* renamed from: a, reason: collision with root package name */
        public final C1710q0 f648a;

        public b() {
            this(C1710q0.K());
        }

        @Override // C.D
        public final InterfaceC1708p0 a() {
            return this.f648a;
        }

        @Override // androidx.camera.core.impl.T0.a
        public final T0 b() {
            return new C1692h0(C1717u0.J(this.f648a));
        }

        public b(C1710q0 c1710q0) {
            Object objB;
            this.f648a = c1710q0;
            Object objB2 = null;
            try {
                objB = c1710q0.b(J.l.f2691c);
            } catch (IllegalArgumentException unused) {
                objB = null;
            }
            Class cls = (Class) objB;
            if (cls != null && !cls.equals(J.class)) {
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
            }
            this.f648a.N(T0.f14968D, U0.b.IMAGE_CAPTURE);
            C1683d c1683d = J.l.f2691c;
            C1710q0 c1710q02 = this.f648a;
            c1710q02.N(c1683d, J.class);
            try {
                objB2 = c1710q02.b(J.l.f2690b);
            } catch (IllegalArgumentException unused2) {
            }
            if (objB2 == null) {
                this.f648a.N(J.l.f2690b, J.class.getCanonicalName() + "-" + UUID.randomUUID());
            }
        }
    }

    /* compiled from: ImageCapture.java */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public static final C1692h0 f649a;

        static {
            Q.b bVar = new Q.b(Q.a.f10849a, Q.c.f10852c);
            C c10 = C.f616d;
            b bVar2 = new b();
            C1683d c1683d = T0.f14975z;
            C1710q0 c1710q0 = bVar2.f648a;
            c1710q0.N(c1683d, 4);
            c1710q0.N(InterfaceC1698k0.f15074l, 0);
            c1710q0.N(InterfaceC1698k0.f15082t, bVar);
            c1710q0.N(C1692h0.f15046L, 0);
            c1710q0.N(InterfaceC1694i0.f15058k, c10);
            f649a = new C1692h0(C1717u0.J(c1710q0));
        }
    }

    /* compiled from: ImageCapture.java */
    public static abstract class d {
    }

    /* compiled from: ImageCapture.java */
    public interface e {
        void a();

        void b();

        void c();

        void onError();
    }

    /* compiled from: ImageCapture.java */
    public static final class f {
    }

    /* compiled from: ImageCapture.java */
    public interface g {
        void a(long j4, h hVar);

        void clear();
    }

    /* compiled from: ImageCapture.java */
    public interface h {
        void a();
    }

    public J(C1692h0 c1692h0) {
        super(c1692h0);
        this.f638q = new AtomicReference<>(null);
        this.f640s = -1;
        this.f646y = new a();
        C1692h0 c1692h02 = (C1692h0) this.f753f;
        C1683d c1683d = C1692h0.f15042H;
        if (c1692h02.f(c1683d)) {
            this.f637p = ((Integer) ((C1717u0) c1692h02.getConfig()).b(c1683d)).intValue();
        } else {
            this.f637p = 1;
        }
        this.f639r = ((Integer) c1692h02.o(C1692h0.f15049O, 0)).intValue();
        this.f641t = new J.i((g) c1692h02.o(C1692h0.f15050P, null));
    }

    public static boolean F(int i, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((Integer) ((Pair) it.next()).first).equals(Integer.valueOf(i))) {
                return true;
            }
        }
        return false;
    }

    public final void C(boolean z10) {
        E.D d10;
        Log.d("ImageCapture", "clearPipeline");
        G.n.a();
        H0.c cVar = this.f645x;
        if (cVar != null) {
            cVar.b();
            this.f645x = null;
        }
        E.r rVar = this.f643v;
        if (rVar != null) {
            rVar.a();
            this.f643v = null;
        }
        if (z10 || (d10 = this.f644w) == null) {
            return;
        }
        d10.a();
        this.f644w = null;
    }

    public final H0.b D(String str, C1692h0 c1692h0, L0 l02) {
        I0 i0J;
        G.n.a();
        Log.d("ImageCapture", String.format("createPipeline(cameraId: %s, streamSpec: %s)", str, l02));
        Size sizeD = l02.d();
        androidx.camera.core.impl.J jB = b();
        Objects.requireNonNull(jB);
        boolean z10 = !jB.l();
        Size size = null;
        if (this.f643v != null) {
            A2.l.q(null, z10);
            this.f643v.a();
        }
        int i = 35;
        if (((Boolean) this.f753f.o(C1692h0.f15052R, Boolean.FALSE)).booleanValue() && (i0J = ((D.a) b().g()).J()) != null) {
            Q.b bVar = (Q.b) this.f753f.o(C1692h0.f15051Q, null);
            i0J.h();
            Map map = Collections.EMPTY_MAP;
            List list = (List) map.get(35);
            if (list == null || list.isEmpty()) {
                i = 256;
                list = (List) map.get(256);
            }
            List list2 = list;
            if (list2 != null && !list2.isEmpty()) {
                if (bVar != null) {
                    Collections.sort(list2, new G.d(true));
                    androidx.camera.core.impl.J jB2 = b();
                    Rect rectD = jB2.f().d();
                    androidx.camera.core.impl.I iN = jB2.n();
                    ArrayList arrayListE = J.j.e(bVar, list2, null, ((InterfaceC1698k0) this.f753f).y(), new Rational(rectD.width(), rectD.height()), iN.b(), iN.g());
                    if (arrayListE.isEmpty()) {
                        throw new IllegalArgumentException("The postview ResolutionSelector cannot select a valid size for the postview.");
                    }
                    size = (Size) arrayListE.get(0);
                } else {
                    size = (Size) Collections.max(list2, new G.d(false));
                }
            }
        }
        this.f643v = new E.r(c1692h0, sizeD, this.f759m, z10, size, i);
        if (this.f644w == null) {
            this.f644w = new E.D(this.f646y);
        }
        E.D d10 = this.f644w;
        E.r rVar = this.f643v;
        d10.getClass();
        G.n.a();
        d10.f1290c = rVar;
        rVar.getClass();
        G.n.a();
        E.o oVar = rVar.f1339c;
        oVar.getClass();
        G.n.a();
        A2.l.q("The ImageReader is not initialized.", oVar.f1325b != null);
        androidx.camera.core.e eVar = oVar.f1325b;
        synchronized (eVar.f14856a) {
            eVar.f14861f = d10;
        }
        E.r rVar2 = this.f643v;
        H0.b bVarE = H0.b.e(rVar2.f1337a, l02.d());
        C0654b c0654b = rVar2.f1341e;
        i0 i0Var = c0654b.f1333b;
        Objects.requireNonNull(i0Var);
        C c10 = C.f616d;
        C1697k.a aVarA = H0.f.a(i0Var);
        aVarA.f15073e = c10;
        bVarE.f14886a.add(aVarA.a());
        i0 i0Var2 = c0654b.f1334c;
        if (i0Var2 != null) {
            bVarE.f14893h = H0.f.a(i0Var2).a();
        }
        if (this.f637p == 2 && !l02.e()) {
            c().f(bVarE);
        }
        if (l02.c() != null) {
            bVarE.b(l02.c());
        }
        H0.c cVar = this.f645x;
        if (cVar != null) {
            cVar.b();
        }
        H0.c cVar2 = new H0.c(new H0.d() { // from class: C.H
            @Override // androidx.camera.core.impl.H0.d
            public final void a(H0 h02, H0.g gVar) {
                J j4 = this.f634a;
                if (j4.b() == null) {
                    return;
                }
                E.D d11 = j4.f644w;
                d11.getClass();
                G.n.a();
                d11.f1293f = true;
                E.B b10 = d11.f1291d;
                if (b10 != null) {
                    G.n.a();
                    if (!b10.f1281d.f44804c.isDone()) {
                        K k10 = new K("The request is aborted silently and retried.", null);
                        G.n.a();
                        b10.f1284g = true;
                        I.b bVar2 = b10.i;
                        Objects.requireNonNull(bVar2);
                        bVar2.cancel(true);
                        b10.f1282e.d(k10);
                        b10.f1283f.b(null);
                        E.D d12 = b10.f1279b;
                        E.E e4 = b10.f1278a;
                        G.n.a();
                        S.a("TakePictureManager", "Add a new request for retrying.");
                        d12.f1288a.addFirst(e4);
                        d12.b();
                    }
                }
                j4.C(true);
                String strD = j4.d();
                C1692h0 c1692h02 = (C1692h0) j4.f753f;
                L0 l03 = j4.f754g;
                l03.getClass();
                H0.b bVarD = j4.D(strD, c1692h02, l03);
                j4.f642u = bVarD;
                Object[] objArr = {bVarD.d()};
                ArrayList arrayList = new ArrayList(1);
                Object obj = objArr[0];
                Objects.requireNonNull(obj);
                arrayList.add(obj);
                j4.B(Collections.unmodifiableList(arrayList));
                j4.o();
                E.D d13 = j4.f644w;
                d13.getClass();
                G.n.a();
                d13.f1293f = false;
                d13.b();
            }
        });
        this.f645x = cVar2;
        bVarE.f14891f = cVar2;
        return bVarE;
    }

    public final int E() {
        int iIntValue;
        synchronized (this.f638q) {
            iIntValue = this.f640s;
            if (iIntValue == -1) {
                iIntValue = ((Integer) ((C1692h0) this.f753f).o(C1692h0.f15043I, 2)).intValue();
            }
        }
        return iIntValue;
    }

    public final void G() {
        synchronized (this.f638q) {
            try {
                if (this.f638q.get() != null) {
                    return;
                }
                c().e(E());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // C.m0
    public final T0<?> e(boolean z10, U0 u02) {
        f636z.getClass();
        C1692h0 c1692h0 = c.f649a;
        c1692h0.getClass();
        androidx.camera.core.impl.U uA = u02.a(G8.d(c1692h0), this.f637p);
        if (z10) {
            uA = B8.m(uA, c1692h0);
        }
        if (uA == null) {
            return null;
        }
        return new C1692h0(C1717u0.J(((b) j(uA)).f648a));
    }

    @Override // C.m0
    public final Set<Integer> i() {
        HashSet hashSet = new HashSet();
        hashSet.add(4);
        return hashSet;
    }

    @Override // C.m0
    public final T0.a<?, ?, ?> j(androidx.camera.core.impl.U u8) {
        return new b(C1710q0.L(u8));
    }

    @Override // C.m0
    public final void q() {
        A2.l.p(b(), "Attached camera cannot be null");
        if (E() == 3) {
            androidx.camera.core.impl.J jB = b();
            if ((jB != null ? jB.a().g() : -1) != 0) {
                throw new IllegalArgumentException("Not a front camera despite setting FLASH_MODE_SCREEN in ImageCapture");
            }
        }
    }

    @Override // C.m0
    public final void r() {
        S.a("ImageCapture", "onCameraControlReady");
        G();
        c().b(this.f641t);
    }

    @Override // C.m0
    public final T0<?> s(androidx.camera.core.impl.I i, T0.a<?, ?, ?> aVar) {
        boolean z10;
        Object objB;
        Object objB2;
        Object objB3;
        if (i.l().d(SoftwareJpegEncodingPreferredQuirk.class)) {
            Boolean bool = Boolean.FALSE;
            Object objA = aVar.a();
            C1683d c1683d = C1692h0.f15048N;
            Object objB4 = Boolean.TRUE;
            C1717u0 c1717u0 = (C1717u0) objA;
            c1717u0.getClass();
            try {
                objB4 = c1717u0.b(c1683d);
            } catch (IllegalArgumentException unused) {
            }
            if (bool.equals(objB4)) {
                S.g("ImageCapture", "Device quirk suggests software JPEG encoder, but it has been explicitly disabled.");
            } else {
                String strF = S.f("ImageCapture");
                if (S.e(4, strF)) {
                    Log.i(strF, "Requesting software JPEG due to device quirk.");
                }
                ((C1710q0) aVar.a()).N(C1692h0.f15048N, Boolean.TRUE);
            }
        }
        Object objA2 = aVar.a();
        Boolean bool2 = Boolean.TRUE;
        C1683d c1683d2 = C1692h0.f15048N;
        Object objB5 = Boolean.FALSE;
        C1717u0 c1717u02 = (C1717u0) objA2;
        c1717u02.getClass();
        try {
            objB5 = c1717u02.b(c1683d2);
        } catch (IllegalArgumentException unused2) {
        }
        boolean zEquals = bool2.equals(objB5);
        Object objB6 = null;
        boolean z11 = true;
        if (zEquals) {
            if (b() == null || ((D.a) b().g()).J() == null) {
                z10 = true;
            } else {
                S.g("ImageCapture", "Software JPEG cannot be used with Extensions.");
                z10 = false;
            }
            try {
                objB3 = c1717u02.b(C1692h0.f15045K);
            } catch (IllegalArgumentException unused3) {
                objB3 = null;
            }
            Integer num = (Integer) objB3;
            if (num != null && num.intValue() != 256) {
                S.g("ImageCapture", "Software JPEG cannot be used with non-JPEG output buffer format.");
                z10 = false;
            }
            if (!z10) {
                S.g("ImageCapture", "Unable to support software JPEG. Disabling.");
                ((C1710q0) objA2).N(C1692h0.f15048N, Boolean.FALSE);
            }
        } else {
            z10 = false;
        }
        Object objA3 = aVar.a();
        C1683d c1683d3 = C1692h0.f15045K;
        C1717u0 c1717u03 = (C1717u0) objA3;
        c1717u03.getClass();
        try {
            objB = c1717u03.b(c1683d3);
        } catch (IllegalArgumentException unused4) {
            objB = null;
        }
        Integer num2 = (Integer) objB;
        if (num2 != null) {
            if (b() != null && ((D.a) b().g()).J() != null && num2.intValue() != 256) {
                z11 = false;
            }
            A2.l.k("Cannot set non-JPEG buffer format with Extensions enabled.", z11);
            ((C1710q0) aVar.a()).N(InterfaceC1694i0.f15057j, Integer.valueOf(z10 ? 35 : num2.intValue()));
        } else {
            Object objA4 = aVar.a();
            C1683d c1683d4 = C1692h0.f15046L;
            C1717u0 c1717u04 = (C1717u0) objA4;
            c1717u04.getClass();
            try {
                objB2 = c1717u04.b(c1683d4);
            } catch (IllegalArgumentException unused5) {
                objB2 = null;
            }
            if (Objects.equals(objB2, 1)) {
                ((C1710q0) aVar.a()).N(InterfaceC1694i0.f15057j, 4101);
                ((C1710q0) aVar.a()).N(InterfaceC1694i0.f15058k, C.f615c);
            } else if (z10) {
                ((C1710q0) aVar.a()).N(InterfaceC1694i0.f15057j, 35);
            } else {
                Object objA5 = aVar.a();
                C1683d c1683d5 = InterfaceC1698k0.f15081s;
                C1717u0 c1717u05 = (C1717u0) objA5;
                c1717u05.getClass();
                try {
                    objB6 = c1717u05.b(c1683d5);
                } catch (IllegalArgumentException unused6) {
                }
                List list = (List) objB6;
                if (list == null) {
                    ((C1710q0) aVar.a()).N(InterfaceC1694i0.f15057j, 256);
                } else if (F(256, list)) {
                    ((C1710q0) aVar.a()).N(InterfaceC1694i0.f15057j, 256);
                } else if (F(35, list)) {
                    ((C1710q0) aVar.a()).N(InterfaceC1694i0.f15057j, 35);
                }
            }
        }
        return aVar.b();
    }

    public final String toString() {
        return "ImageCapture:".concat(f());
    }

    @Override // C.m0
    public final void u() {
        J.i iVar = this.f641t;
        iVar.c();
        iVar.b();
        E.D d10 = this.f644w;
        if (d10 != null) {
            d10.a();
        }
    }

    @Override // C.m0
    public final C1701m v(androidx.camera.core.impl.U u8) {
        this.f642u.f14887b.c(u8);
        Object[] objArr = {this.f642u.d()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        B(Collections.unmodifiableList(arrayList));
        C1701m.a aVarF = this.f754g.f();
        aVarF.f15093d = u8;
        return aVarF.a();
    }

    @Override // C.m0
    public final L0 w(L0 l02, L0 l03) {
        H0.b bVarD = D(d(), (C1692h0) this.f753f, l02);
        this.f642u = bVarD;
        Object[] objArr = {bVarD.d()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        B(Collections.unmodifiableList(arrayList));
        n();
        return l02;
    }

    @Override // C.m0
    public final void x() {
        J.i iVar = this.f641t;
        iVar.c();
        iVar.b();
        E.D d10 = this.f644w;
        if (d10 != null) {
            d10.a();
        }
        C(false);
        c().b(null);
    }
}
