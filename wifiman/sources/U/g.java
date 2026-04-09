package U;

import T.B0;
import T.C3525e1;
import T.InterfaceC3526f;
import T.R0;
import Zg.AbstractC3682n;
import java.util.Arrays;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import sh.AbstractC7978m;

/* loaded from: classes.dex */
public final class g extends h {

    /* renamed from: i, reason: collision with root package name */
    public static final a f22101i = new a(null);

    /* renamed from: j, reason: collision with root package name */
    public static final int f22102j = 8;

    /* renamed from: b, reason: collision with root package name */
    private int f22104b;

    /* renamed from: d, reason: collision with root package name */
    private int f22106d;

    /* renamed from: f, reason: collision with root package name */
    private int f22108f;

    /* renamed from: g, reason: collision with root package name */
    private int f22109g;

    /* renamed from: h, reason: collision with root package name */
    private int f22110h;

    /* renamed from: a, reason: collision with root package name */
    private d[] f22103a = new d[16];

    /* renamed from: c, reason: collision with root package name */
    private int[] f22105c = new int[16];

    /* renamed from: e, reason: collision with root package name */
    private Object[] f22107e = new Object[16];

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public final class b implements e {

        /* renamed from: a, reason: collision with root package name */
        private int f22111a;

        /* renamed from: b, reason: collision with root package name */
        private int f22112b;

        /* renamed from: c, reason: collision with root package name */
        private int f22113c;

        public b() {
        }

        @Override // U.e
        public Object a(int i10) {
            return g.this.f22107e[this.f22113c + i10];
        }

        @Override // U.e
        public int b(int i10) {
            return g.this.f22105c[this.f22112b + i10];
        }

        public final d c() {
            d dVar = g.this.f22103a[this.f22111a];
            AbstractC6492s.f(dVar);
            return dVar;
        }

        public final boolean d() {
            if (this.f22111a >= g.this.f22104b) {
                return false;
            }
            d dVarC = c();
            this.f22112b += dVarC.b();
            this.f22113c += dVarC.d();
            int i10 = this.f22111a + 1;
            this.f22111a = i10;
            return i10 < g.this.f22104b;
        }
    }

    public static final class c {
        public static g a(g gVar) {
            return gVar;
        }

        public static final d b(g gVar) {
            return gVar.v();
        }

        public static final void c(g gVar, int i10, int i11) {
            int i12 = 1 << i10;
            if (!((gVar.f22109g & i12) == 0)) {
                B0.b("Already pushed argument " + b(gVar).e(i10));
            }
            gVar.f22109g |= i12;
            gVar.f22105c[gVar.z(i10)] = i11;
        }

        public static final void d(g gVar, int i10, Object obj) {
            int i11 = 1 << i10;
            if (!((gVar.f22110h & i11) == 0)) {
                B0.b("Already pushed argument " + b(gVar).f(i10));
            }
            gVar.f22110h |= i11;
            gVar.f22107e[gVar.A(i10)] = obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int A(int i10) {
        return (this.f22108f - v().d()) + i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int n(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return (-1) >>> (32 - i10);
    }

    private final int o(int i10, int i11) {
        return AbstractC7978m.d(i10 + AbstractC7978m.g(i10, 1024), i11);
    }

    private final void p(int i10) {
        int[] iArr = this.f22105c;
        int length = iArr.length;
        if (i10 > length) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, o(length, i10));
            AbstractC6492s.h(iArrCopyOf, "copyOf(this, newSize)");
            this.f22105c = iArrCopyOf;
        }
    }

    private final void q(int i10) {
        Object[] objArr = this.f22107e;
        int length = objArr.length;
        if (i10 > length) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, o(length, i10));
            AbstractC6492s.h(objArrCopyOf, "copyOf(this, newSize)");
            this.f22107e = objArrCopyOf;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final d v() {
        d dVar = this.f22103a[this.f22104b - 1];
        AbstractC6492s.f(dVar);
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int z(int i10) {
        return (this.f22106d - v().b()) + i10;
    }

    public final void m() {
        this.f22104b = 0;
        this.f22106d = 0;
        AbstractC3682n.v(this.f22107e, null, 0, this.f22108f);
        this.f22108f = 0;
    }

    public final void r(InterfaceC3526f interfaceC3526f, C3525e1 c3525e1, R0 r02) {
        if (u()) {
            b bVar = new b();
            do {
                bVar.c().a(bVar, interfaceC3526f, c3525e1, r02);
            } while (bVar.d());
        }
        m();
    }

    public final int s() {
        return this.f22104b;
    }

    public final boolean t() {
        return s() == 0;
    }

    public String toString() {
        return super.toString();
    }

    public final boolean u() {
        return s() != 0;
    }

    public final void w(g gVar) {
        if (t()) {
            throw new NoSuchElementException("Cannot pop(), because the stack is empty.");
        }
        d[] dVarArr = this.f22103a;
        int i10 = this.f22104b - 1;
        this.f22104b = i10;
        d dVar = dVarArr[i10];
        AbstractC6492s.f(dVar);
        this.f22103a[this.f22104b] = null;
        gVar.y(dVar);
        int i11 = this.f22108f;
        int i12 = gVar.f22108f;
        int iD = dVar.d();
        for (int i13 = 0; i13 < iD; i13++) {
            i12--;
            i11--;
            Object[] objArr = gVar.f22107e;
            Object[] objArr2 = this.f22107e;
            objArr[i12] = objArr2[i11];
            objArr2[i11] = null;
        }
        int i14 = this.f22106d;
        int i15 = gVar.f22106d;
        int iB = dVar.b();
        for (int i16 = 0; i16 < iB; i16++) {
            i15--;
            i14--;
            int[] iArr = gVar.f22105c;
            int[] iArr2 = this.f22105c;
            iArr[i15] = iArr2[i14];
            iArr2[i14] = 0;
        }
        this.f22108f -= dVar.d();
        this.f22106d -= dVar.b();
    }

    public final void x(d dVar) {
        if (!(dVar.b() == 0 && dVar.d() == 0)) {
            B0.a("Cannot push " + dVar + " without arguments because it expects " + dVar.b() + " ints and " + dVar.d() + " objects.");
        }
        y(dVar);
    }

    public final void y(d dVar) {
        this.f22109g = 0;
        this.f22110h = 0;
        int i10 = this.f22104b;
        if (i10 == this.f22103a.length) {
            Object[] objArrCopyOf = Arrays.copyOf(this.f22103a, this.f22104b + AbstractC7978m.g(i10, 1024));
            AbstractC6492s.h(objArrCopyOf, "copyOf(this, newSize)");
            this.f22103a = (d[]) objArrCopyOf;
        }
        p(this.f22106d + dVar.b());
        q(this.f22108f + dVar.d());
        d[] dVarArr = this.f22103a;
        int i11 = this.f22104b;
        this.f22104b = i11 + 1;
        dVarArr[i11] = dVar;
        this.f22106d += dVar.b();
        this.f22108f += dVar.d();
    }
}
