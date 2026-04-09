package T;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;
import o.C7009H;

/* renamed from: T.z0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3568z0 {

    /* renamed from: a, reason: collision with root package name */
    private final List f21292a;

    /* renamed from: b, reason: collision with root package name */
    private final int f21293b;

    /* renamed from: c, reason: collision with root package name */
    private int f21294c;

    /* renamed from: d, reason: collision with root package name */
    private final List f21295d;

    /* renamed from: e, reason: collision with root package name */
    private final o.z f21296e;

    /* renamed from: f, reason: collision with root package name */
    private final Yg.m f21297f;

    /* renamed from: T.z0$a */
    static final class a extends AbstractC6494u implements InterfaceC6824a {
        a() {
            super(0);
        }

        public final C7009H a() {
            C7009H c7009hI = AbstractC3546o.I(C3568z0.this.b().size());
            C3568z0 c3568z0 = C3568z0.this;
            int size = c3568z0.b().size();
            for (int i10 = 0; i10 < size; i10++) {
                C3512a0 c3512a0 = (C3512a0) c3568z0.b().get(i10);
                C3549p0.f(c7009hI, AbstractC3546o.A(c3512a0), c3512a0);
            }
            return c7009hI;
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            return C3549p0.a(a());
        }
    }

    public C3568z0(List list, int i10) {
        this.f21292a = list;
        this.f21293b = i10;
        if (!(i10 >= 0)) {
            B0.a("Invalid start index");
        }
        this.f21295d = new ArrayList();
        o.z zVar = new o.z(0, 1, null);
        int size = list.size();
        int iC = 0;
        for (int i11 = 0; i11 < size; i11++) {
            C3512a0 c3512a0 = (C3512a0) this.f21292a.get(i11);
            zVar.t(c3512a0.b(), new Q(i11, iC, c3512a0.c()));
            iC += c3512a0.c();
        }
        this.f21296e = zVar;
        this.f21297f = Yg.n.b(new a());
    }

    public final int a() {
        return this.f21294c;
    }

    public final List b() {
        return this.f21292a;
    }

    public final C7009H c() {
        return ((C3549p0) this.f21297f.getValue()).h();
    }

    public final C3512a0 d(int i10, Object obj) {
        return (C3512a0) C3549p0.e(c(), obj != null ? new Z(Integer.valueOf(i10), obj) : Integer.valueOf(i10));
    }

    public final int e() {
        return this.f21293b;
    }

    public final List f() {
        return this.f21295d;
    }

    public final int g(C3512a0 c3512a0) {
        Q q10 = (Q) this.f21296e.c(c3512a0.b());
        if (q10 != null) {
            return q10.b();
        }
        return -1;
    }

    public final boolean h(C3512a0 c3512a0) {
        return this.f21295d.add(c3512a0);
    }

    public final void i(C3512a0 c3512a0, int i10) {
        this.f21296e.t(c3512a0.b(), new Q(-1, i10, 0));
    }

    public final void j(int i10, int i11, int i12) {
        char c10 = 7;
        long j10 = -9187201950435737472L;
        if (i10 > i11) {
            o.z zVar = this.f21296e;
            Object[] objArr = zVar.f54983c;
            long[] jArr = zVar.f54981a;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i13 = 0;
            while (true) {
                long j11 = jArr[i13];
                if ((((~j11) << 7) & j11 & j10) != j10) {
                    int i14 = 8 - ((~(i13 - length)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((j11 & 255) < 128) {
                            Q q10 = (Q) objArr[(i13 << 3) + i15];
                            int iB = q10.b();
                            if (i10 <= iB && iB < i10 + i12) {
                                q10.e((iB - i10) + i11);
                            } else if (i11 <= iB && iB < i10) {
                                q10.e(iB + i12);
                            }
                        }
                        j11 >>= 8;
                    }
                    if (i14 != 8) {
                        return;
                    }
                }
                if (i13 == length) {
                    return;
                }
                i13++;
                j10 = -9187201950435737472L;
            }
        } else {
            if (i11 <= i10) {
                return;
            }
            o.z zVar2 = this.f21296e;
            Object[] objArr2 = zVar2.f54983c;
            long[] jArr2 = zVar2.f54981a;
            int length2 = jArr2.length - 2;
            if (length2 < 0) {
                return;
            }
            int i16 = 0;
            while (true) {
                long j12 = jArr2[i16];
                if ((((~j12) << c10) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i17 = 8 - ((~(i16 - length2)) >>> 31);
                    for (int i18 = 0; i18 < i17; i18++) {
                        if ((j12 & 255) < 128) {
                            Q q11 = (Q) objArr2[(i16 << 3) + i18];
                            int iB2 = q11.b();
                            if (i10 <= iB2 && iB2 < i10 + i12) {
                                q11.e((iB2 - i10) + i11);
                            } else if (i10 + 1 <= iB2 && iB2 < i11) {
                                q11.e(iB2 - i12);
                            }
                        }
                        j12 >>= 8;
                    }
                    if (i17 != 8) {
                        return;
                    }
                }
                if (i16 == length2) {
                    return;
                }
                i16++;
                c10 = 7;
            }
        }
    }

    public final void k(int i10, int i11) {
        char c10 = 7;
        long j10 = -9187201950435737472L;
        if (i10 > i11) {
            o.z zVar = this.f21296e;
            Object[] objArr = zVar.f54983c;
            long[] jArr = zVar.f54981a;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i12 = 0;
            while (true) {
                long j11 = jArr[i12];
                if ((((~j11) << 7) & j11 & j10) != j10) {
                    int i13 = 8 - ((~(i12 - length)) >>> 31);
                    for (int i14 = 0; i14 < i13; i14++) {
                        if ((j11 & 255) < 128) {
                            Q q10 = (Q) objArr[(i12 << 3) + i14];
                            int iC = q10.c();
                            if (iC == i10) {
                                q10.f(i11);
                            } else if (i11 <= iC && iC < i10) {
                                q10.f(iC + 1);
                            }
                        }
                        j11 >>= 8;
                    }
                    if (i13 != 8) {
                        return;
                    }
                }
                if (i12 == length) {
                    return;
                }
                i12++;
                j10 = -9187201950435737472L;
            }
        } else {
            if (i11 <= i10) {
                return;
            }
            o.z zVar2 = this.f21296e;
            Object[] objArr2 = zVar2.f54983c;
            long[] jArr2 = zVar2.f54981a;
            int length2 = jArr2.length - 2;
            if (length2 < 0) {
                return;
            }
            int i15 = 0;
            while (true) {
                long j12 = jArr2[i15];
                if ((((~j12) << c10) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i16 = 8 - ((~(i15 - length2)) >>> 31);
                    for (int i17 = 0; i17 < i16; i17++) {
                        if ((j12 & 255) < 128) {
                            Q q11 = (Q) objArr2[(i15 << 3) + i17];
                            int iC2 = q11.c();
                            if (iC2 == i10) {
                                q11.f(i11);
                            } else if (i10 + 1 <= iC2 && iC2 < i11) {
                                q11.f(iC2 - 1);
                            }
                        }
                        j12 >>= 8;
                    }
                    if (i16 != 8) {
                        return;
                    }
                }
                if (i15 == length2) {
                    return;
                }
                i15++;
                c10 = 7;
            }
        }
    }

    public final void l(int i10) {
        this.f21294c = i10;
    }

    public final int m(C3512a0 c3512a0) {
        Q q10 = (Q) this.f21296e.c(c3512a0.b());
        if (q10 != null) {
            return q10.c();
        }
        return -1;
    }

    public final boolean n(int i10, int i11) {
        int iB;
        Q q10 = (Q) this.f21296e.c(i10);
        if (q10 == null) {
            return false;
        }
        int iB2 = q10.b();
        int iA = i11 - q10.a();
        q10.d(i11);
        if (iA == 0) {
            return true;
        }
        o.z zVar = this.f21296e;
        Object[] objArr = zVar.f54983c;
        long[] jArr = zVar.f54981a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i12 = 0;
        while (true) {
            long j10 = jArr[i12];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i13 = 8 - ((~(i12 - length)) >>> 31);
                for (int i14 = 0; i14 < i13; i14++) {
                    if ((255 & j10) < 128) {
                        Q q11 = (Q) objArr[(i12 << 3) + i14];
                        if (q11.b() >= iB2 && !AbstractC6492s.d(q11, q10) && (iB = q11.b() + iA) >= 0) {
                            q11.e(iB);
                        }
                    }
                    j10 >>= 8;
                }
                if (i13 != 8) {
                    return true;
                }
            }
            if (i12 == length) {
                return true;
            }
            i12++;
        }
    }

    public final int o(C3512a0 c3512a0) {
        Q q10 = (Q) this.f21296e.c(c3512a0.b());
        return q10 != null ? q10.a() : c3512a0.c();
    }
}
