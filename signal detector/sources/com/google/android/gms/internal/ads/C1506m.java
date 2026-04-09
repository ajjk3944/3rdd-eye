package com.google.android.gms.internal.ads;

import d5.AbstractC2281i;
import java.nio.charset.Charset;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1506m implements InterfaceC1292i {

    /* renamed from: a, reason: collision with root package name */
    public int f15502a;

    /* renamed from: b, reason: collision with root package name */
    public int f15503b;

    /* renamed from: c, reason: collision with root package name */
    public int f15504c;

    /* renamed from: d, reason: collision with root package name */
    public Object f15505d;

    public C1506m(int i) {
        switch (i) {
            case 3:
                int iHighestOneBit = Integer.bitCount(8) != 1 ? Integer.highestOneBit(7) << 1 : 8;
                this.f15504c = iHighestOneBit - 1;
                this.f15505d = new int[iHighestOneBit];
                break;
            default:
                this.f15504c = 0;
                this.f15505d = new C1238h[100];
                break;
        }
    }

    public static final void A(int i) throws C1636oL {
        if ((i & 3) != 0) {
            throw new C1636oL("Failed to parse the message.");
        }
    }

    public static final void B(int i) throws C1636oL {
        if ((i & 7) != 0) {
            throw new C1636oL("Failed to parse the message.");
        }
    }

    public int C() {
        int iN = this.f15504c;
        if (iN != 0) {
            this.f15502a = iN;
            this.f15504c = 0;
        } else {
            iN = ((D5.b) this.f15505d).n();
            this.f15502a = iN;
        }
        if (iN == 0 || iN == this.f15503b) {
            return Integer.MAX_VALUE;
        }
        return iN >>> 3;
    }

    public synchronized void D(int i) {
        int i3 = this.f15502a;
        this.f15502a = i;
        if (i < i3) {
            m();
        }
    }

    public QK E() {
        v(2);
        return ((D5.b) this.f15505d).A();
    }

    public void F(InterfaceC1474lL interfaceC1474lL) throws C1636oL {
        int iN;
        D5.b bVar = (D5.b) this.f15505d;
        int i = this.f15502a & 7;
        if (i == 1) {
            do {
                interfaceC1474lL.add(Double.valueOf(bVar.q()));
                if (bVar.g()) {
                    return;
                } else {
                    iN = bVar.n();
                }
            } while (iN == this.f15502a);
            this.f15504c = iN;
            return;
        }
        if (i != 2) {
            throw new C1582nL();
        }
        int iB = bVar.B();
        B(iB);
        int iH = bVar.h() + iB;
        do {
            interfaceC1474lL.add(Double.valueOf(bVar.q()));
        } while (bVar.h() < iH);
    }

    public void G(InterfaceC1474lL interfaceC1474lL) throws C1636oL {
        int iN;
        D5.b bVar = (D5.b) this.f15505d;
        int i = this.f15502a & 7;
        if (i == 2) {
            int iB = bVar.B();
            A(iB);
            int iH = bVar.h() + iB;
            do {
                interfaceC1474lL.add(Float.valueOf(bVar.r()));
            } while (bVar.h() < iH);
            return;
        }
        if (i != 5) {
            throw new C1582nL();
        }
        do {
            interfaceC1474lL.add(Float.valueOf(bVar.r()));
            if (bVar.g()) {
                return;
            } else {
                iN = bVar.n();
            }
        } while (iN == this.f15502a);
        this.f15504c = iN;
    }

    public void H(InterfaceC1474lL interfaceC1474lL) throws C1636oL {
        int iN;
        int iN2;
        D5.b bVar = (D5.b) this.f15505d;
        if (interfaceC1474lL instanceof C1851sL) {
            C1851sL c1851sL = (C1851sL) interfaceC1474lL;
            int i = this.f15502a & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new C1582nL();
                }
                int iH = bVar.h() + bVar.B();
                do {
                    c1851sL.c(bVar.s());
                } while (bVar.h() < iH);
                z(iH);
                return;
            }
            do {
                c1851sL.c(bVar.s());
                if (bVar.g()) {
                    return;
                } else {
                    iN2 = bVar.n();
                }
            } while (iN2 == this.f15502a);
        } else {
            int i3 = this.f15502a & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new C1582nL();
                }
                int iH2 = bVar.h() + bVar.B();
                do {
                    interfaceC1474lL.add(Long.valueOf(bVar.s()));
                } while (bVar.h() < iH2);
                z(iH2);
                return;
            }
            do {
                interfaceC1474lL.add(Long.valueOf(bVar.s()));
                if (bVar.g()) {
                    return;
                } else {
                    iN = bVar.n();
                }
            } while (iN == this.f15502a);
            iN2 = iN;
        }
        this.f15504c = iN2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1292i
    public synchronized C1238h a() {
        C1238h c1238h;
        try {
            int i = this.f15503b + 1;
            this.f15503b = i;
            int i3 = this.f15504c;
            if (i3 > 0) {
                C1238h[] c1238hArr = (C1238h[]) this.f15505d;
                int i6 = i3 - 1;
                this.f15504c = i6;
                c1238h = c1238hArr[i6];
                if (c1238h == null) {
                    throw null;
                }
                c1238hArr[i6] = null;
            } else {
                c1238h = new C1238h(new byte[65536]);
                C1238h[] c1238hArr2 = (C1238h[]) this.f15505d;
                int length = c1238hArr2.length;
                if (i > length) {
                    this.f15505d = (C1238h[]) Arrays.copyOf(c1238hArr2, length + length);
                    return c1238h;
                }
            }
            return c1238h;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void b(int i) {
        int[] iArr = (int[]) this.f15505d;
        int i3 = this.f15503b;
        iArr[i3] = i;
        int i6 = this.f15504c & (i3 + 1);
        this.f15503b = i6;
        int i7 = this.f15502a;
        if (i6 == i7) {
            int length = iArr.length;
            int i8 = length - i7;
            int i9 = length << 1;
            if (i9 < 0) {
                throw new RuntimeException("Max array capacity exceeded");
            }
            int[] iArr2 = new int[i9];
            AbstractC2281i.R(0, i7, length, iArr, iArr2);
            AbstractC2281i.R(i8, 0, this.f15502a, (int[]) this.f15505d, iArr2);
            this.f15505d = iArr2;
            this.f15502a = 0;
            this.f15503b = length;
            this.f15504c = i9 - 1;
        }
    }

    public void c(InterfaceC1474lL interfaceC1474lL) throws C1636oL {
        int iN;
        int iN2;
        D5.b bVar = (D5.b) this.f15505d;
        if (interfaceC1474lL instanceof C1851sL) {
            C1851sL c1851sL = (C1851sL) interfaceC1474lL;
            int i = this.f15502a & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new C1582nL();
                }
                int iH = bVar.h() + bVar.B();
                do {
                    c1851sL.c(bVar.t());
                } while (bVar.h() < iH);
                z(iH);
                return;
            }
            do {
                c1851sL.c(bVar.t());
                if (bVar.g()) {
                    return;
                } else {
                    iN2 = bVar.n();
                }
            } while (iN2 == this.f15502a);
        } else {
            int i3 = this.f15502a & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new C1582nL();
                }
                int iH2 = bVar.h() + bVar.B();
                do {
                    interfaceC1474lL.add(Long.valueOf(bVar.t()));
                } while (bVar.h() < iH2);
                z(iH2);
                return;
            }
            do {
                interfaceC1474lL.add(Long.valueOf(bVar.t()));
                if (bVar.g()) {
                    return;
                } else {
                    iN = bVar.n();
                }
            } while (iN == this.f15502a);
            iN2 = iN;
        }
        this.f15504c = iN2;
    }

    public void d(InterfaceC1474lL interfaceC1474lL) throws C1636oL {
        int iN;
        int iN2;
        D5.b bVar = (D5.b) this.f15505d;
        if (interfaceC1474lL instanceof C1151fL) {
            C1151fL c1151fL = (C1151fL) interfaceC1474lL;
            int i = this.f15502a & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new C1582nL();
                }
                int iH = bVar.h() + bVar.B();
                do {
                    c1151fL.d(bVar.u());
                } while (bVar.h() < iH);
                z(iH);
                return;
            }
            do {
                c1151fL.d(bVar.u());
                if (bVar.g()) {
                    return;
                } else {
                    iN2 = bVar.n();
                }
            } while (iN2 == this.f15502a);
        } else {
            int i3 = this.f15502a & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new C1582nL();
                }
                int iH2 = bVar.h() + bVar.B();
                do {
                    interfaceC1474lL.add(Integer.valueOf(bVar.u()));
                } while (bVar.h() < iH2);
                z(iH2);
                return;
            }
            do {
                interfaceC1474lL.add(Integer.valueOf(bVar.u()));
                if (bVar.g()) {
                    return;
                } else {
                    iN = bVar.n();
                }
            } while (iN == this.f15502a);
            iN2 = iN;
        }
        this.f15504c = iN2;
    }

    public void e(InterfaceC1474lL interfaceC1474lL) throws C1636oL {
        int iN;
        int iN2;
        D5.b bVar = (D5.b) this.f15505d;
        if (interfaceC1474lL instanceof C1851sL) {
            C1851sL c1851sL = (C1851sL) interfaceC1474lL;
            int i = this.f15502a & 7;
            if (i != 1) {
                if (i != 2) {
                    throw new C1582nL();
                }
                int iB = bVar.B();
                B(iB);
                int iH = bVar.h() + iB;
                do {
                    c1851sL.c(bVar.v());
                } while (bVar.h() < iH);
                return;
            }
            do {
                c1851sL.c(bVar.v());
                if (bVar.g()) {
                    return;
                } else {
                    iN2 = bVar.n();
                }
            } while (iN2 == this.f15502a);
        } else {
            int i3 = this.f15502a & 7;
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new C1582nL();
                }
                int iB2 = bVar.B();
                B(iB2);
                int iH2 = bVar.h() + iB2;
                do {
                    interfaceC1474lL.add(Long.valueOf(bVar.v()));
                } while (bVar.h() < iH2);
                return;
            }
            do {
                interfaceC1474lL.add(Long.valueOf(bVar.v()));
                if (bVar.g()) {
                    return;
                } else {
                    iN = bVar.n();
                }
            } while (iN == this.f15502a);
            iN2 = iN;
        }
        this.f15504c = iN2;
    }

    public void f(InterfaceC1474lL interfaceC1474lL) throws C1636oL {
        int iN;
        int iN2;
        D5.b bVar = (D5.b) this.f15505d;
        if (interfaceC1474lL instanceof C1151fL) {
            C1151fL c1151fL = (C1151fL) interfaceC1474lL;
            int i = this.f15502a & 7;
            if (i == 2) {
                int iB = bVar.B();
                A(iB);
                int iH = bVar.h() + iB;
                do {
                    c1151fL.d(bVar.w());
                } while (bVar.h() < iH);
                return;
            }
            if (i != 5) {
                throw new C1582nL();
            }
            do {
                c1151fL.d(bVar.w());
                if (bVar.g()) {
                    return;
                } else {
                    iN2 = bVar.n();
                }
            } while (iN2 == this.f15502a);
        } else {
            int i3 = this.f15502a & 7;
            if (i3 == 2) {
                int iB2 = bVar.B();
                A(iB2);
                int iH2 = bVar.h() + iB2;
                do {
                    interfaceC1474lL.add(Integer.valueOf(bVar.w()));
                } while (bVar.h() < iH2);
                return;
            }
            if (i3 != 5) {
                throw new C1582nL();
            }
            do {
                interfaceC1474lL.add(Integer.valueOf(bVar.w()));
                if (bVar.g()) {
                    return;
                } else {
                    iN = bVar.n();
                }
            } while (iN == this.f15502a);
            iN2 = iN;
        }
        this.f15504c = iN2;
    }

    public void g(InterfaceC1474lL interfaceC1474lL) throws C1636oL {
        int iN;
        D5.b bVar = (D5.b) this.f15505d;
        int i = this.f15502a & 7;
        if (i == 0) {
            do {
                interfaceC1474lL.add(Boolean.valueOf(bVar.x()));
                if (bVar.g()) {
                    return;
                } else {
                    iN = bVar.n();
                }
            } while (iN == this.f15502a);
            this.f15504c = iN;
            return;
        }
        if (i != 2) {
            throw new C1582nL();
        }
        int iH = bVar.h() + bVar.B();
        do {
            interfaceC1474lL.add(Boolean.valueOf(bVar.x()));
        } while (bVar.h() < iH);
        z(iH);
    }

    public void h(InterfaceC1474lL interfaceC1474lL, boolean z6) throws C1582nL {
        String strY;
        int iN;
        D5.b bVar = (D5.b) this.f15505d;
        if ((this.f15502a & 7) != 2) {
            throw new C1582nL();
        }
        do {
            if (z6) {
                v(2);
                strY = bVar.z();
            } else {
                v(2);
                strY = bVar.y();
            }
            interfaceC1474lL.add(strY);
            if (bVar.g()) {
                return;
            } else {
                iN = bVar.n();
            }
        } while (iN == this.f15502a);
        this.f15504c = iN;
    }

    public void i(InterfaceC1474lL interfaceC1474lL, JL jl, XK xk) throws C1636oL {
        int iN;
        int i = this.f15502a;
        if ((i & 7) != 2) {
            throw new C1582nL();
        }
        do {
            AbstractC1096eL abstractC1096eLA = jl.a();
            w(abstractC1096eLA, jl, xk);
            jl.e(abstractC1096eLA);
            interfaceC1474lL.add(abstractC1096eLA);
            D5.b bVar = (D5.b) this.f15505d;
            if (bVar.g() || this.f15504c != 0) {
                return;
            } else {
                iN = bVar.n();
            }
        } while (iN == i);
        this.f15504c = iN;
    }

    public void j(InterfaceC1474lL interfaceC1474lL, JL jl, XK xk) throws C1582nL {
        int iN;
        int i = this.f15502a;
        if ((i & 7) != 3) {
            throw new C1582nL();
        }
        do {
            AbstractC1096eL abstractC1096eLA = jl.a();
            x(abstractC1096eLA, jl, xk);
            jl.e(abstractC1096eLA);
            interfaceC1474lL.add(abstractC1096eLA);
            D5.b bVar = (D5.b) this.f15505d;
            if (bVar.g() || this.f15504c != 0) {
                return;
            } else {
                iN = bVar.n();
            }
        } while (iN == i);
        this.f15504c = iN;
    }

    public void k(InterfaceC1474lL interfaceC1474lL) throws C1582nL {
        int iN;
        if ((this.f15502a & 7) != 2) {
            throw new C1582nL();
        }
        do {
            interfaceC1474lL.add(E());
            D5.b bVar = (D5.b) this.f15505d;
            if (bVar.g()) {
                return;
            } else {
                iN = bVar.n();
            }
        } while (iN == this.f15502a);
        this.f15504c = iN;
    }

    public void l(InterfaceC1474lL interfaceC1474lL) throws C1636oL {
        int iN;
        int iN2;
        D5.b bVar = (D5.b) this.f15505d;
        if (interfaceC1474lL instanceof C1151fL) {
            C1151fL c1151fL = (C1151fL) interfaceC1474lL;
            int i = this.f15502a & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new C1582nL();
                }
                int iH = bVar.h() + bVar.B();
                do {
                    c1151fL.d(bVar.B());
                } while (bVar.h() < iH);
                z(iH);
                return;
            }
            do {
                c1151fL.d(bVar.B());
                if (bVar.g()) {
                    return;
                } else {
                    iN2 = bVar.n();
                }
            } while (iN2 == this.f15502a);
        } else {
            int i3 = this.f15502a & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new C1582nL();
                }
                int iH2 = bVar.h() + bVar.B();
                do {
                    interfaceC1474lL.add(Integer.valueOf(bVar.B()));
                } while (bVar.h() < iH2);
                z(iH2);
                return;
            }
            do {
                interfaceC1474lL.add(Integer.valueOf(bVar.B()));
                if (bVar.g()) {
                    return;
                } else {
                    iN = bVar.n();
                }
            } while (iN == this.f15502a);
            iN2 = iN;
        }
        this.f15504c = iN2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1292i
    public synchronized void m() {
        int i = this.f15502a;
        String str = Vt.f12096a;
        int iMax = Math.max(0, ((i + 65535) / 65536) - this.f15503b);
        int i3 = this.f15504c;
        if (iMax >= i3) {
            return;
        }
        Arrays.fill((C1238h[]) this.f15505d, iMax, i3, (Object) null);
        this.f15504c = iMax;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1292i
    public synchronized void n(C1238h c1238h) {
        C1238h[] c1238hArr = (C1238h[]) this.f15505d;
        int i = this.f15504c;
        this.f15504c = i + 1;
        c1238hArr[i] = c1238h;
        this.f15503b--;
        notifyAll();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1292i
    public synchronized void o(C1187g2 c1187g2) {
        while (c1187g2 != null) {
            try {
                C1238h[] c1238hArr = (C1238h[]) this.f15505d;
                int i = this.f15504c;
                this.f15504c = i + 1;
                C1238h c1238h = (C1238h) c1187g2.f14188c;
                c1238h.getClass();
                c1238hArr[i] = c1238h;
                this.f15503b--;
                c1187g2 = (C1187g2) c1187g2.f14189d;
                if (c1187g2 == null || ((C1238h) c1187g2.f14188c) == null) {
                    c1187g2 = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        notifyAll();
    }

    public void p(InterfaceC1474lL interfaceC1474lL) throws C1636oL {
        int iN;
        int iN2;
        D5.b bVar = (D5.b) this.f15505d;
        if (interfaceC1474lL instanceof C1151fL) {
            C1151fL c1151fL = (C1151fL) interfaceC1474lL;
            int i = this.f15502a & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new C1582nL();
                }
                int iH = bVar.h() + bVar.B();
                do {
                    c1151fL.d(bVar.C());
                } while (bVar.h() < iH);
                z(iH);
                return;
            }
            do {
                c1151fL.d(bVar.C());
                if (bVar.g()) {
                    return;
                } else {
                    iN2 = bVar.n();
                }
            } while (iN2 == this.f15502a);
        } else {
            int i3 = this.f15502a & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new C1582nL();
                }
                int iH2 = bVar.h() + bVar.B();
                do {
                    interfaceC1474lL.add(Integer.valueOf(bVar.C()));
                } while (bVar.h() < iH2);
                z(iH2);
                return;
            }
            do {
                interfaceC1474lL.add(Integer.valueOf(bVar.C()));
                if (bVar.g()) {
                    return;
                } else {
                    iN = bVar.n();
                }
            } while (iN == this.f15502a);
            iN2 = iN;
        }
        this.f15504c = iN2;
    }

    public void q(InterfaceC1474lL interfaceC1474lL) throws C1636oL {
        int iN;
        int iN2;
        D5.b bVar = (D5.b) this.f15505d;
        if (interfaceC1474lL instanceof C1151fL) {
            C1151fL c1151fL = (C1151fL) interfaceC1474lL;
            int i = this.f15502a & 7;
            if (i == 2) {
                int iB = bVar.B();
                A(iB);
                int iH = bVar.h() + iB;
                do {
                    c1151fL.d(bVar.D());
                } while (bVar.h() < iH);
                return;
            }
            if (i != 5) {
                throw new C1582nL();
            }
            do {
                c1151fL.d(bVar.D());
                if (bVar.g()) {
                    return;
                } else {
                    iN2 = bVar.n();
                }
            } while (iN2 == this.f15502a);
        } else {
            int i3 = this.f15502a & 7;
            if (i3 == 2) {
                int iB2 = bVar.B();
                A(iB2);
                int iH2 = bVar.h() + iB2;
                do {
                    interfaceC1474lL.add(Integer.valueOf(bVar.D()));
                } while (bVar.h() < iH2);
                return;
            }
            if (i3 != 5) {
                throw new C1582nL();
            }
            do {
                interfaceC1474lL.add(Integer.valueOf(bVar.D()));
                if (bVar.g()) {
                    return;
                } else {
                    iN = bVar.n();
                }
            } while (iN == this.f15502a);
            iN2 = iN;
        }
        this.f15504c = iN2;
    }

    public void r(InterfaceC1474lL interfaceC1474lL) throws C1636oL {
        int iN;
        int iN2;
        D5.b bVar = (D5.b) this.f15505d;
        if (interfaceC1474lL instanceof C1851sL) {
            C1851sL c1851sL = (C1851sL) interfaceC1474lL;
            int i = this.f15502a & 7;
            if (i != 1) {
                if (i != 2) {
                    throw new C1582nL();
                }
                int iB = bVar.B();
                B(iB);
                int iH = bVar.h() + iB;
                do {
                    c1851sL.c(bVar.E());
                } while (bVar.h() < iH);
                return;
            }
            do {
                c1851sL.c(bVar.E());
                if (bVar.g()) {
                    return;
                } else {
                    iN2 = bVar.n();
                }
            } while (iN2 == this.f15502a);
        } else {
            int i3 = this.f15502a & 7;
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new C1582nL();
                }
                int iB2 = bVar.B();
                B(iB2);
                int iH2 = bVar.h() + iB2;
                do {
                    interfaceC1474lL.add(Long.valueOf(bVar.E()));
                } while (bVar.h() < iH2);
                return;
            }
            do {
                interfaceC1474lL.add(Long.valueOf(bVar.E()));
                if (bVar.g()) {
                    return;
                } else {
                    iN = bVar.n();
                }
            } while (iN == this.f15502a);
            iN2 = iN;
        }
        this.f15504c = iN2;
    }

    public void s(InterfaceC1474lL interfaceC1474lL) throws C1636oL {
        int iN;
        int iN2;
        D5.b bVar = (D5.b) this.f15505d;
        if (interfaceC1474lL instanceof C1151fL) {
            C1151fL c1151fL = (C1151fL) interfaceC1474lL;
            int i = this.f15502a & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new C1582nL();
                }
                int iH = bVar.h() + bVar.B();
                do {
                    c1151fL.d(bVar.F());
                } while (bVar.h() < iH);
                z(iH);
                return;
            }
            do {
                c1151fL.d(bVar.F());
                if (bVar.g()) {
                    return;
                } else {
                    iN2 = bVar.n();
                }
            } while (iN2 == this.f15502a);
        } else {
            int i3 = this.f15502a & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new C1582nL();
                }
                int iH2 = bVar.h() + bVar.B();
                do {
                    interfaceC1474lL.add(Integer.valueOf(bVar.F()));
                } while (bVar.h() < iH2);
                z(iH2);
                return;
            }
            do {
                interfaceC1474lL.add(Integer.valueOf(bVar.F()));
                if (bVar.g()) {
                    return;
                } else {
                    iN = bVar.n();
                }
            } while (iN == this.f15502a);
            iN2 = iN;
        }
        this.f15504c = iN2;
    }

    public void t(InterfaceC1474lL interfaceC1474lL) throws C1636oL {
        int iN;
        int iN2;
        D5.b bVar = (D5.b) this.f15505d;
        if (interfaceC1474lL instanceof C1851sL) {
            C1851sL c1851sL = (C1851sL) interfaceC1474lL;
            int i = this.f15502a & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new C1582nL();
                }
                int iH = bVar.h() + bVar.B();
                do {
                    c1851sL.c(bVar.G());
                } while (bVar.h() < iH);
                z(iH);
                return;
            }
            do {
                c1851sL.c(bVar.G());
                if (bVar.g()) {
                    return;
                } else {
                    iN2 = bVar.n();
                }
            } while (iN2 == this.f15502a);
        } else {
            int i3 = this.f15502a & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new C1582nL();
                }
                int iH2 = bVar.h() + bVar.B();
                do {
                    interfaceC1474lL.add(Long.valueOf(bVar.G()));
                } while (bVar.h() < iH2);
                z(iH2);
                return;
            }
            do {
                interfaceC1474lL.add(Long.valueOf(bVar.G()));
                if (bVar.g()) {
                    return;
                } else {
                    iN = bVar.n();
                }
            } while (iN == this.f15502a);
            iN2 = iN;
        }
        this.f15504c = iN2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x007e, code lost:
    
        r12.put(r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0081, code lost:
    
        r1.f(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0084, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void u(com.google.android.gms.internal.ads.C1959uL r12, com.google.android.gms.internal.ads.C2041vw r13, com.google.android.gms.internal.ads.XK r14) {
        /*
            r11 = this;
            r0 = 2
            r11.v(r0)
            java.lang.Object r1 = r11.f15505d
            D5.b r1 = (D5.b) r1
            int r2 = r1.B()
            int r2 = r1.H(r2)
            java.lang.Object r3 = r13.f17371d
            java.lang.String r4 = ""
            r5 = r3
        L15:
            int r6 = r11.C()     // Catch: java.lang.Throwable -> L49
            r7 = 2147483647(0x7fffffff, float:NaN)
            if (r6 == r7) goto L7e
            boolean r7 = r1.g()     // Catch: java.lang.Throwable -> L49
            if (r7 == 0) goto L25
            goto L7e
        L25:
            r7 = 1
            r8 = 0
            java.lang.String r9 = "Unable to parse map entry."
            if (r6 == r7) goto L5a
            if (r6 == r0) goto L4d
            boolean r6 = r1.g()     // Catch: java.lang.Throwable -> L49 com.google.android.gms.internal.ads.C1582nL -> L4b
            if (r6 != 0) goto L3f
            int r6 = r11.f15502a     // Catch: java.lang.Throwable -> L49 com.google.android.gms.internal.ads.C1582nL -> L4b
            int r7 = r11.f15503b     // Catch: java.lang.Throwable -> L49 com.google.android.gms.internal.ads.C1582nL -> L4b
            if (r6 != r7) goto L3a
            goto L3f
        L3a:
            boolean r6 = r1.p(r6)     // Catch: java.lang.Throwable -> L49 com.google.android.gms.internal.ads.C1582nL -> L4b
            goto L40
        L3f:
            r6 = r8
        L40:
            if (r6 == 0) goto L43
            goto L15
        L43:
            com.google.android.gms.internal.ads.oL r6 = new com.google.android.gms.internal.ads.oL     // Catch: java.lang.Throwable -> L49 com.google.android.gms.internal.ads.C1582nL -> L4b
            r6.<init>(r9)     // Catch: java.lang.Throwable -> L49 com.google.android.gms.internal.ads.C1582nL -> L4b
            throw r6     // Catch: java.lang.Throwable -> L49 com.google.android.gms.internal.ads.C1582nL -> L4b
        L49:
            r12 = move-exception
            goto L85
        L4b:
            r6 = move-exception
            goto L64
        L4d:
            java.lang.Object r6 = r13.f17370c     // Catch: java.lang.Throwable -> L49 com.google.android.gms.internal.ads.C1582nL -> L4b
            com.google.android.gms.internal.ads.ZL r6 = (com.google.android.gms.internal.ads.ZL) r6     // Catch: java.lang.Throwable -> L49 com.google.android.gms.internal.ads.C1582nL -> L4b
            java.lang.Class r7 = r3.getClass()     // Catch: java.lang.Throwable -> L49 com.google.android.gms.internal.ads.C1582nL -> L4b
            java.lang.Object r5 = r11.y(r6, r7, r14)     // Catch: java.lang.Throwable -> L49 com.google.android.gms.internal.ads.C1582nL -> L4b
            goto L15
        L5a:
            java.lang.Object r6 = r13.f17369b     // Catch: java.lang.Throwable -> L49 com.google.android.gms.internal.ads.C1582nL -> L4b
            com.google.android.gms.internal.ads.ZL r6 = (com.google.android.gms.internal.ads.ZL) r6     // Catch: java.lang.Throwable -> L49 com.google.android.gms.internal.ads.C1582nL -> L4b
            r7 = 0
            java.lang.Object r4 = r11.y(r6, r7, r7)     // Catch: java.lang.Throwable -> L49 com.google.android.gms.internal.ads.C1582nL -> L4b
            goto L15
        L64:
            boolean r7 = r1.g()     // Catch: java.lang.Throwable -> L49
            if (r7 != 0) goto L75
            int r7 = r11.f15502a     // Catch: java.lang.Throwable -> L49
            int r10 = r11.f15503b     // Catch: java.lang.Throwable -> L49
            if (r7 != r10) goto L71
            goto L75
        L71:
            boolean r8 = r1.p(r7)     // Catch: java.lang.Throwable -> L49
        L75:
            if (r8 == 0) goto L78
            goto L15
        L78:
            com.google.android.gms.internal.ads.oL r12 = new com.google.android.gms.internal.ads.oL     // Catch: java.lang.Throwable -> L49
            r12.<init>(r9, r6)     // Catch: java.lang.Throwable -> L49
            throw r12     // Catch: java.lang.Throwable -> L49
        L7e:
            r12.put(r4, r5)     // Catch: java.lang.Throwable -> L49
            r1.f(r2)
            return
        L85:
            r1.f(r2)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1506m.u(com.google.android.gms.internal.ads.uL, com.google.android.gms.internal.ads.vw, com.google.android.gms.internal.ads.XK):void");
    }

    public void v(int i) {
        if ((this.f15502a & 7) != i) {
            throw new C1582nL();
        }
    }

    public void w(Object obj, JL jl, XK xk) throws C1636oL {
        D5.b bVar = (D5.b) this.f15505d;
        int iB = bVar.B();
        if (bVar.f1294a + bVar.f1295b >= 100) {
            throw new C1636oL("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iH = bVar.H(iB);
        bVar.f1294a++;
        jl.h(obj, this, xk);
        bVar.o(0);
        bVar.f1294a--;
        bVar.f(iH);
    }

    public void x(Object obj, JL jl, XK xk) {
        int i = this.f15503b;
        this.f15503b = ((this.f15502a >>> 3) << 3) | 4;
        try {
            jl.h(obj, this, xk);
            if (this.f15502a == this.f15503b) {
            } else {
                throw new C1636oL("Failed to parse the message.");
            }
        } finally {
            this.f15503b = i;
        }
    }

    public Object y(ZL zl, Class cls, XK xk) throws C1636oL {
        D5.b bVar = (D5.b) this.f15505d;
        ZL zl2 = ZL.f12823c;
        switch (zl.ordinal()) {
            case 0:
                v(1);
                return Double.valueOf(bVar.q());
            case 1:
                v(5);
                return Float.valueOf(bVar.r());
            case 2:
                v(0);
                return Long.valueOf(bVar.t());
            case 3:
                v(0);
                return Long.valueOf(bVar.s());
            case 4:
                v(0);
                return Integer.valueOf(bVar.u());
            case 5:
                v(1);
                return Long.valueOf(bVar.v());
            case 6:
                v(5);
                return Integer.valueOf(bVar.w());
            case 7:
                v(0);
                return Boolean.valueOf(bVar.x());
            case 8:
                v(2);
                return bVar.z();
            case 9:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case 10:
                v(2);
                JL jlA = EL.f7942c.a(cls);
                AbstractC1096eL abstractC1096eLA = jlA.a();
                w(abstractC1096eLA, jlA, xk);
                jlA.e(abstractC1096eLA);
                return abstractC1096eLA;
            case 11:
                return E();
            case 12:
                v(0);
                return Integer.valueOf(bVar.B());
            case 13:
                v(0);
                return Integer.valueOf(bVar.C());
            case 14:
                v(5);
                return Integer.valueOf(bVar.D());
            case 15:
                v(1);
                return Long.valueOf(bVar.E());
            case 16:
                v(0);
                return Integer.valueOf(bVar.F());
            case 17:
                v(0);
                return Long.valueOf(bVar.G());
        }
    }

    public void z(int i) throws C1636oL {
        if (((D5.b) this.f15505d).h() != i) {
            throw new C1636oL("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public C1506m(D5.b bVar) {
        this.f15504c = 0;
        Charset charset = AbstractC1528mL.f15610a;
        if (bVar == null) {
            throw new NullPointerException("input");
        }
        this.f15505d = bVar;
        bVar.f1296c = this;
    }
}
