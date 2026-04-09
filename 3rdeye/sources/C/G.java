package C;

import N7.B8;
import N7.G8;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.impl.C1683d;
import androidx.camera.core.impl.C1690g0;
import androidx.camera.core.impl.C1701m;
import androidx.camera.core.impl.C1710q0;
import androidx.camera.core.impl.C1717u0;
import androidx.camera.core.impl.H0;
import androidx.camera.core.impl.InterfaceC1694i0;
import androidx.camera.core.impl.InterfaceC1698k0;
import androidx.camera.core.impl.InterfaceC1708p0;
import androidx.camera.core.impl.T0;
import androidx.camera.core.impl.U0;
import androidx.camera.core.internal.compat.quirk.OnePixelShiftQuirk;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.UUID;

/* compiled from: ImageAnalysis.java */
/* loaded from: classes.dex */
public final class G extends m0 {

    /* renamed from: s, reason: collision with root package name */
    public static final c f628s = new c();

    /* renamed from: p, reason: collision with root package name */
    public H0.b f629p;

    /* renamed from: q, reason: collision with root package name */
    public i0 f630q;

    /* renamed from: r, reason: collision with root package name */
    public H0.c f631r;

    /* compiled from: ImageAnalysis.java */
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    /* compiled from: ImageAnalysis.java */
    public static final class b implements T0.a<G, C1690g0, b> {

        /* renamed from: a, reason: collision with root package name */
        public final C1710q0 f632a;

        public b(C1710q0 c1710q0) {
            Object objB;
            this.f632a = c1710q0;
            Object objB2 = null;
            try {
                objB = c1710q0.b(J.l.f2691c);
            } catch (IllegalArgumentException unused) {
                objB = null;
            }
            Class cls = (Class) objB;
            if (cls != null && !cls.equals(G.class)) {
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
            }
            this.f632a.N(T0.f14968D, U0.b.IMAGE_ANALYSIS);
            C1683d c1683d = J.l.f2691c;
            C1710q0 c1710q02 = this.f632a;
            c1710q02.N(c1683d, G.class);
            try {
                objB2 = c1710q02.b(J.l.f2690b);
            } catch (IllegalArgumentException unused2) {
            }
            if (objB2 == null) {
                c1710q02.N(J.l.f2690b, G.class.getCanonicalName() + "-" + UUID.randomUUID());
            }
        }

        @Override // C.D
        public final InterfaceC1708p0 a() {
            return this.f632a;
        }

        @Override // androidx.camera.core.impl.T0.a
        public final T0 b() {
            return new C1690g0(C1717u0.J(this.f632a));
        }
    }

    /* compiled from: ImageAnalysis.java */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public static final C1690g0 f633a;

        static {
            Size size = new Size(640, 480);
            C c10 = C.f616d;
            Q.a aVar = Q.a.f10849a;
            Size size2 = M.c.f4112c;
            Q.c cVar = new Q.c();
            cVar.f10853a = size2;
            cVar.f10854b = 1;
            Q.b bVar = new Q.b(aVar, cVar);
            C1710q0 c1710q0K = C1710q0.K();
            new b(c1710q0K);
            c1710q0K.N(InterfaceC1698k0.f15079q, size);
            c1710q0K.N(T0.f14975z, 1);
            c1710q0K.N(InterfaceC1698k0.f15074l, 0);
            c1710q0K.N(InterfaceC1698k0.f15082t, bVar);
            if (!c10.equals(c10)) {
                throw new UnsupportedOperationException("ImageAnalysis currently only supports SDR");
            }
            c1710q0K.N(InterfaceC1694i0.f15058k, c10);
            f633a = new C1690g0(C1717u0.J(c1710q0K));
        }
    }

    /* compiled from: ImageAnalysis.java */
    @Retention(RetentionPolicy.SOURCE)
    public @interface d {
    }

    @Override // C.m0
    public final T0<?> e(boolean z10, U0 u02) {
        f628s.getClass();
        C1690g0 c1690g0 = c.f633a;
        c1690g0.getClass();
        androidx.camera.core.impl.U uA = u02.a(G8.d(c1690g0), 1);
        if (z10) {
            uA = B8.m(uA, c1690g0);
        }
        if (uA == null) {
            return null;
        }
        return new C1690g0(C1717u0.J(((b) j(uA)).f632a));
    }

    @Override // C.m0
    public final T0.a<?, ?, ?> j(androidx.camera.core.impl.U u8) {
        return new b(C1710q0.L(u8));
    }

    @Override // C.m0
    public final void q() {
        throw null;
    }

    @Override // C.m0
    public final T0<?> s(androidx.camera.core.impl.I i, T0.a<?, ?, ?> aVar) {
        C1690g0 c1690g0 = (C1690g0) this.f753f;
        c1690g0.getClass();
        i.l().d(OnePixelShiftQuirk.class);
        throw null;
    }

    public final String toString() {
        return "ImageAnalysis:".concat(f());
    }

    @Override // C.m0
    public final C1701m v(androidx.camera.core.impl.U u8) {
        this.f629p.f14887b.c(u8);
        Object[] objArr = {this.f629p.d()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        B(Collections.unmodifiableList(arrayList));
        C1701m.a aVarF = this.f754g.f();
        aVarF.f15093d = u8;
        return aVarF.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0191  */
    @Override // C.m0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.camera.core.impl.L0 w(androidx.camera.core.impl.L0 r17, androidx.camera.core.impl.L0 r18) {
        /*
            Method dump skipped, instructions count: 581
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: C.G.w(androidx.camera.core.impl.L0, androidx.camera.core.impl.L0):androidx.camera.core.impl.L0");
    }

    @Override // C.m0
    public final void x() {
        G.n.a();
        H0.c cVar = this.f631r;
        if (cVar != null) {
            cVar.b();
            this.f631r = null;
        }
        i0 i0Var = this.f630q;
        if (i0Var == null) {
            throw null;
        }
        i0Var.a();
        this.f630q = null;
        throw null;
    }

    @Override // C.m0
    public final void y(Matrix matrix) {
        super.y(matrix);
        throw null;
    }

    @Override // C.m0
    public final void z(Rect rect) {
        this.i = rect;
        throw null;
    }
}
