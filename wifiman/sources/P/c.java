package P;

import E0.AbstractC2640s;
import Ii.N;
import Yg.J;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.C6733v0;
import m0.InterfaceC6739y0;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import o.C7009H;
import o0.InterfaceC7039f;
import y.InterfaceC8556k;
import y.InterfaceC8560o;

/* loaded from: classes.dex */
public final class c extends q {

    /* renamed from: y, reason: collision with root package name */
    private final C7009H f17882y;

    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f17883a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ h f17884b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ c f17885c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC8560o.b f17886d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(h hVar, c cVar, InterfaceC8560o.b bVar, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f17884b = hVar;
            this.f17885c = cVar;
            this.f17886d = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new a(this.f17884b, this.f17885c, this.f17886d, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f17883a;
            try {
                if (i10 == 0) {
                    Yg.v.b(obj);
                    h hVar = this.f17884b;
                    this.f17883a = 1;
                    if (hVar.d(this) == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Yg.v.b(obj);
                }
                this.f17885c.f17882y.p(this.f17886d);
                AbstractC2640s.a(this.f17885c);
                return J.f24997a;
            } catch (Throwable th2) {
                this.f17885c.f17882y.p(this.f17886d);
                AbstractC2640s.a(this.f17885c);
                throw th2;
            }
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    public /* synthetic */ c(InterfaceC8556k interfaceC8556k, boolean z10, float f10, InterfaceC6739y0 interfaceC6739y0, InterfaceC6824a interfaceC6824a, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC8556k, z10, f10, interfaceC6739y0, interfaceC6824a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */
    @Override // P.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void I2(y.InterfaceC8560o.b r18, long r19, float r21) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            o.H r2 = r0.f17882y
            java.lang.Object[] r3 = r2.f54922b
            java.lang.Object[] r4 = r2.f54923c
            long[] r2 = r2.f54921a
            int r5 = r2.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L51
            r6 = 0
            r7 = r6
        L13:
            r8 = r2[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L4c
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L2d:
            if (r12 >= r10) goto L4a
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L46
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r3[r13]
            r13 = r4[r13]
            P.h r13 = (P.h) r13
            y.o$b r14 = (y.InterfaceC8560o.b) r14
            r13.h()
        L46:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L2d
        L4a:
            if (r10 != r11) goto L51
        L4c:
            if (r7 == r5) goto L51
            int r7 = r7 + 1
            goto L13
        L51:
            boolean r2 = r17.K2()
            r3 = 0
            if (r2 == 0) goto L61
            long r4 = r18.a()
            l0.g r2 = l0.C6531g.d(r4)
            goto L62
        L61:
            r2 = r3
        L62:
            P.h r4 = new P.h
            boolean r5 = r17.K2()
            r6 = r21
            r4.<init>(r2, r6, r5, r3)
            o.H r2 = r0.f17882y
            r2.s(r1, r4)
            Ii.N r5 = r17.d2()
            P.c$a r8 = new P.c$a
            r8.<init>(r4, r0, r1, r3)
            r9 = 3
            r10 = 0
            r6 = 0
            r7 = 0
            Ii.AbstractC3059i.d(r5, r6, r7, r8, r9, r10)
            E0.AbstractC2640s.a(r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: P.c.I2(y.o$b, long, float):void");
    }

    @Override // P.q
    public void J2(InterfaceC7039f interfaceC7039f) {
        float f10;
        float f11;
        int i10;
        int i11;
        int i12;
        float fD = ((g) L2().invoke()).d();
        if (fD == 0.0f) {
            return;
        }
        C7009H c7009h = this.f17882y;
        Object[] objArr = c7009h.f54922b;
        Object[] objArr2 = c7009h.f54923c;
        long[] jArr = c7009h.f54921a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i13 = 0;
        while (true) {
            long j10 = jArr[i13];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i14 = 8;
                int i15 = 8 - ((~(i13 - length)) >>> 31);
                long j11 = j10;
                int i16 = 0;
                while (i16 < i15) {
                    if ((j11 & 255) < 128) {
                        int i17 = (i13 << 3) + i16;
                        float f12 = fD;
                        i10 = i16;
                        i11 = i15;
                        f11 = fD;
                        i12 = i14;
                        ((h) objArr2[i17]).e(interfaceC7039f, C6733v0.k(M2(), f12, 0.0f, 0.0f, 0.0f, 14, null));
                    } else {
                        f11 = fD;
                        i10 = i16;
                        i11 = i15;
                        i12 = i14;
                    }
                    j11 >>= i12;
                    i16 = i10 + 1;
                    i14 = i12;
                    fD = f11;
                    i15 = i11;
                }
                f10 = fD;
                if (i15 != i14) {
                    return;
                }
            } else {
                f10 = fD;
            }
            if (i13 == length) {
                return;
            }
            i13++;
            fD = f10;
        }
    }

    @Override // P.q
    public void P2(InterfaceC8560o.b bVar) {
        h hVar = (h) this.f17882y.c(bVar);
        if (hVar != null) {
            hVar.h();
        }
    }

    @Override // androidx.compose.ui.e.c
    public void o2() {
        this.f17882y.i();
    }

    private c(InterfaceC8556k interfaceC8556k, boolean z10, float f10, InterfaceC6739y0 interfaceC6739y0, InterfaceC6824a interfaceC6824a) {
        super(interfaceC8556k, z10, f10, interfaceC6739y0, interfaceC6824a, null);
        this.f17882y = new C7009H(0, 1, null);
    }
}
