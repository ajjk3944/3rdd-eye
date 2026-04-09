package A;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.ui.layout.t;
import f0.c;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.snmp4j.mp.PduHandle;
import p0.C7182c;
import sh.AbstractC7978m;

/* loaded from: classes.dex */
public final class t implements l, B.z {

    /* renamed from: a, reason: collision with root package name */
    private final int f174a;

    /* renamed from: b, reason: collision with root package name */
    private final List f175b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f176c;

    /* renamed from: d, reason: collision with root package name */
    private final c.b f177d;

    /* renamed from: e, reason: collision with root package name */
    private final c.InterfaceC1752c f178e;

    /* renamed from: f, reason: collision with root package name */
    private final Y0.t f179f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f180g;

    /* renamed from: h, reason: collision with root package name */
    private final int f181h;

    /* renamed from: i, reason: collision with root package name */
    private final int f182i;

    /* renamed from: j, reason: collision with root package name */
    private final int f183j;

    /* renamed from: k, reason: collision with root package name */
    private final long f184k;

    /* renamed from: l, reason: collision with root package name */
    private final Object f185l;

    /* renamed from: m, reason: collision with root package name */
    private final Object f186m;

    /* renamed from: n, reason: collision with root package name */
    private final LazyLayoutItemAnimator f187n;

    /* renamed from: o, reason: collision with root package name */
    private final long f188o;

    /* renamed from: p, reason: collision with root package name */
    private int f189p;

    /* renamed from: q, reason: collision with root package name */
    private final int f190q;

    /* renamed from: r, reason: collision with root package name */
    private final int f191r;

    /* renamed from: s, reason: collision with root package name */
    private final int f192s;

    /* renamed from: t, reason: collision with root package name */
    private final int f193t;

    /* renamed from: u, reason: collision with root package name */
    private final int f194u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f195v;

    /* renamed from: w, reason: collision with root package name */
    private int f196w;

    /* renamed from: x, reason: collision with root package name */
    private int f197x;

    /* renamed from: y, reason: collision with root package name */
    private int f198y;

    /* renamed from: z, reason: collision with root package name */
    private final int[] f199z;

    public /* synthetic */ t(int i10, List list, boolean z10, c.b bVar, c.InterfaceC1752c interfaceC1752c, Y0.t tVar, boolean z11, int i11, int i12, int i13, long j10, Object obj, Object obj2, LazyLayoutItemAnimator lazyLayoutItemAnimator, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, list, z10, bVar, interfaceC1752c, tVar, z11, i11, i12, i13, j10, obj, obj2, lazyLayoutItemAnimator, j11);
    }

    private final int o(long j10) {
        return i() ? Y0.n.i(j10) : Y0.n.h(j10);
    }

    private final int p(androidx.compose.ui.layout.t tVar) {
        return i() ? tVar.C0() : tVar.I0();
    }

    @Override // A.l
    public int a() {
        return this.f190q;
    }

    @Override // A.l
    public int b() {
        return this.f189p;
    }

    @Override // B.z
    public int c() {
        return this.f175b.size();
    }

    @Override // B.z
    public long d() {
        return this.f188o;
    }

    @Override // B.z
    public void e(boolean z10) {
        this.f195v = z10;
    }

    @Override // B.z
    public int f() {
        return this.f193t;
    }

    @Override // B.z
    public int g() {
        return this.f192s;
    }

    @Override // A.l, B.z
    public int getIndex() {
        return this.f174a;
    }

    @Override // A.l, B.z
    public Object getKey() {
        return this.f185l;
    }

    @Override // B.z
    public Object h(int i10) {
        return ((androidx.compose.ui.layout.t) this.f175b.get(i10)).b();
    }

    @Override // B.z
    public boolean i() {
        return this.f176c;
    }

    @Override // B.z
    public long j(int i10) {
        int[] iArr = this.f199z;
        int i11 = i10 * 2;
        return Y0.o.a(iArr[i11], iArr[i11 + 1]);
    }

    @Override // B.z
    public int k() {
        return this.f191r;
    }

    @Override // B.z
    public void l(int i10, int i11, int i12, int i13) {
        s(i10, i12, i13);
    }

    public final void m(int i10, boolean z10) {
        if (q()) {
            return;
        }
        this.f189p = b() + i10;
        int length = this.f199z.length;
        for (int i11 = 0; i11 < length; i11++) {
            if ((i() && i11 % 2 == 1) || (!i() && i11 % 2 == 0)) {
                int[] iArr = this.f199z;
                iArr[i11] = iArr[i11] + i10;
            }
        }
        if (z10) {
            int iC = c();
            for (int i12 = 0; i12 < iC; i12++) {
                androidx.compose.foundation.lazy.layout.b bVarE = this.f187n.e(getKey(), i12);
                if (bVarE != null) {
                    long jS = bVarE.s();
                    int iH = i() ? Y0.n.h(jS) : Integer.valueOf(Y0.n.h(jS) + i10).intValue();
                    boolean zI = i();
                    int i13 = Y0.n.i(jS);
                    if (zI) {
                        i13 += i10;
                    }
                    bVarE.J(Y0.o.a(iH, i13));
                }
            }
        }
    }

    public final int n() {
        return this.f194u;
    }

    public boolean q() {
        return this.f195v;
    }

    public final void r(t.a aVar, boolean z10) {
        C7182c c7182cP;
        if (this.f196w == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("position() should be called first");
        }
        int iC = c();
        for (int i10 = 0; i10 < iC; i10++) {
            androidx.compose.ui.layout.t tVar = (androidx.compose.ui.layout.t) this.f175b.get(i10);
            int iP = this.f197x - p(tVar);
            int i11 = this.f198y;
            long j10 = j(i10);
            androidx.compose.foundation.lazy.layout.b bVarE = this.f187n.e(getKey(), i10);
            if (bVarE != null) {
                if (z10) {
                    bVarE.F(j10);
                } else {
                    if (!Y0.n.g(bVarE.q(), androidx.compose.foundation.lazy.layout.b.f28264s.a())) {
                        j10 = bVarE.q();
                    }
                    long jL = Y0.n.l(j10, bVarE.r());
                    if ((o(j10) <= iP && o(jL) <= iP) || (o(j10) >= i11 && o(jL) >= i11)) {
                        bVarE.n();
                    }
                    j10 = jL;
                }
                c7182cP = bVarE.p();
            } else {
                c7182cP = null;
            }
            if (this.f180g) {
                j10 = Y0.o.a(i() ? Y0.n.h(j10) : (this.f196w - Y0.n.h(j10)) - p(tVar), i() ? (this.f196w - Y0.n.i(j10)) - p(tVar) : Y0.n.i(j10));
            }
            long jL2 = Y0.n.l(j10, this.f184k);
            if (!z10 && bVarE != null) {
                bVarE.E(jL2);
            }
            if (i()) {
                if (c7182cP != null) {
                    t.a.z(aVar, tVar, jL2, c7182cP, 0.0f, 4, null);
                } else {
                    t.a.y(aVar, tVar, jL2, 0.0f, null, 6, null);
                }
            } else if (c7182cP != null) {
                t.a.t(aVar, tVar, jL2, c7182cP, 0.0f, 4, null);
            } else {
                t.a.s(aVar, tVar, jL2, 0.0f, null, 6, null);
            }
        }
    }

    public final void s(int i10, int i11, int i12) {
        int iI0;
        this.f189p = i10;
        this.f196w = i() ? i12 : i11;
        List list = this.f175b;
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            androidx.compose.ui.layout.t tVar = (androidx.compose.ui.layout.t) list.get(i13);
            int i14 = i13 * 2;
            if (i()) {
                int[] iArr = this.f199z;
                c.b bVar = this.f177d;
                if (bVar == null) {
                    throw new IllegalArgumentException("null horizontalAlignment when isVertical == true");
                }
                iArr[i14] = bVar.a(tVar.I0(), i11, this.f179f);
                this.f199z[i14 + 1] = i10;
                iI0 = tVar.C0();
            } else {
                int[] iArr2 = this.f199z;
                iArr2[i14] = i10;
                int i15 = i14 + 1;
                c.InterfaceC1752c interfaceC1752c = this.f178e;
                if (interfaceC1752c == null) {
                    throw new IllegalArgumentException("null verticalAlignment when isVertical == false");
                }
                iArr2[i15] = interfaceC1752c.a(tVar.C0(), i12);
                iI0 = tVar.I0();
            }
            i10 += iI0;
        }
        this.f197x = -this.f181h;
        this.f198y = this.f196w + this.f182i;
    }

    public final void t(int i10) {
        this.f196w = i10;
        this.f198y = i10 + this.f182i;
    }

    private t(int i10, List list, boolean z10, c.b bVar, c.InterfaceC1752c interfaceC1752c, Y0.t tVar, boolean z11, int i11, int i12, int i13, long j10, Object obj, Object obj2, LazyLayoutItemAnimator lazyLayoutItemAnimator, long j11) {
        this.f174a = i10;
        this.f175b = list;
        this.f176c = z10;
        this.f177d = bVar;
        this.f178e = interfaceC1752c;
        this.f179f = tVar;
        this.f180g = z11;
        this.f181h = i11;
        this.f182i = i12;
        this.f183j = i13;
        this.f184k = j10;
        this.f185l = obj;
        this.f186m = obj2;
        this.f187n = lazyLayoutItemAnimator;
        this.f188o = j11;
        this.f192s = 1;
        this.f196w = PduHandle.NONE;
        int size = list.size();
        int iC0 = 0;
        int iMax = 0;
        for (int i14 = 0; i14 < size; i14++) {
            androidx.compose.ui.layout.t tVar2 = (androidx.compose.ui.layout.t) list.get(i14);
            iC0 += i() ? tVar2.C0() : tVar2.I0();
            iMax = Math.max(iMax, !i() ? tVar2.C0() : tVar2.I0());
        }
        this.f190q = iC0;
        this.f193t = AbstractC7978m.d(a() + this.f183j, 0);
        this.f194u = iMax;
        this.f199z = new int[this.f175b.size() * 2];
    }
}
