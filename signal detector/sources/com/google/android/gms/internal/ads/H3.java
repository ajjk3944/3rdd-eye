package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class H3 implements I3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8543a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f8544b;

    /* renamed from: c, reason: collision with root package name */
    public long f8545c;

    /* renamed from: d, reason: collision with root package name */
    public int f8546d;

    /* renamed from: e, reason: collision with root package name */
    public int f8547e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f8548f;

    /* renamed from: g, reason: collision with root package name */
    public Object f8549g;

    public H3() {
        this.f8543a = 1;
        this.f8548f = new C2036vr(10);
        this.f8545c = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.I3
    public final void a() {
        switch (this.f8543a) {
            case 0:
                this.f8544b = false;
                this.f8545c = -9223372036854775807L;
                break;
            default:
                this.f8544b = false;
                this.f8545c = -9223372036854775807L;
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.I3
    public final void b(boolean z6) {
        int i;
        switch (this.f8543a) {
            case 0:
                if (this.f8544b) {
                    AbstractC0582Jp.h0(this.f8545c != -9223372036854775807L);
                    for (T0 t02 : (T0[]) this.f8549g) {
                        t02.c(this.f8545c, 1, this.f8547e, 0, null);
                    }
                    this.f8544b = false;
                    break;
                }
                break;
            default:
                ((T0) this.f8549g).getClass();
                if (this.f8544b && (i = this.f8546d) != 0 && this.f8547e == i) {
                    AbstractC0582Jp.h0(this.f8545c != -9223372036854775807L);
                    ((T0) this.f8549g).c(this.f8545c, 1, this.f8546d, 0, null);
                    this.f8544b = false;
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.I3
    public final void c(int i, long j6) {
        switch (this.f8543a) {
            case 0:
                if ((i & 4) != 0) {
                    this.f8544b = true;
                    this.f8545c = j6;
                    this.f8547e = 0;
                    this.f8546d = 2;
                    break;
                }
                break;
            default:
                if ((i & 4) != 0) {
                    this.f8544b = true;
                    this.f8545c = j6;
                    this.f8546d = 0;
                    this.f8547e = 0;
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.I3
    public final void d(C2036vr c2036vr) {
        boolean z6;
        boolean z7;
        switch (this.f8543a) {
            case 0:
                if (this.f8544b) {
                    if (this.f8546d == 2) {
                        if (c2036vr.B() == 0) {
                            z7 = false;
                        } else {
                            if (c2036vr.K() != 32) {
                                this.f8544b = false;
                            }
                            this.f8546d--;
                            z7 = this.f8544b;
                        }
                        if (!z7) {
                        }
                    }
                    if (this.f8546d == 1) {
                        if (c2036vr.B() == 0) {
                            z6 = false;
                        } else {
                            if (c2036vr.K() != 0) {
                                this.f8544b = false;
                            }
                            this.f8546d--;
                            z6 = this.f8544b;
                        }
                        if (!z6) {
                        }
                    }
                    int i = c2036vr.f17355b;
                    int iB = c2036vr.B();
                    for (T0 t02 : (T0[]) this.f8549g) {
                        c2036vr.E(i);
                        t02.a(iB, c2036vr);
                    }
                    this.f8547e += iB;
                    break;
                }
                break;
            default:
                ((T0) this.f8549g).getClass();
                if (this.f8544b) {
                    int iB2 = c2036vr.B();
                    int i3 = this.f8547e;
                    if (i3 < 10) {
                        int iMin = Math.min(iB2, 10 - i3);
                        byte[] bArr = c2036vr.f17354a;
                        int i6 = c2036vr.f17355b;
                        C2036vr c2036vr2 = (C2036vr) this.f8548f;
                        System.arraycopy(bArr, i6, c2036vr2.f17354a, this.f8547e, iMin);
                        if (this.f8547e + iMin == 10) {
                            c2036vr2.E(0);
                            if (c2036vr2.K() != 73 || c2036vr2.K() != 68 || c2036vr2.K() != 51) {
                                AbstractC2022vd.v("Id3Reader", "Discarding invalid ID3 tag");
                                this.f8544b = false;
                                break;
                            } else {
                                c2036vr2.G(3);
                                this.f8546d = c2036vr2.g() + 10;
                            }
                        }
                    }
                    int iMin2 = Math.min(iB2, this.f8546d - this.f8547e);
                    ((T0) this.f8549g).a(iMin2, c2036vr);
                    this.f8547e += iMin2;
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.I3
    public final void e(InterfaceC2100x0 interfaceC2100x0, C1189g4 c1189g4) {
        switch (this.f8543a) {
            case 0:
                int i = 0;
                while (true) {
                    T0[] t0Arr = (T0[]) this.f8549g;
                    if (i >= t0Arr.length) {
                        break;
                    } else {
                        C1134f4 c1134f4 = (C1134f4) ((List) this.f8548f).get(i);
                        c1189g4.a();
                        c1189g4.b();
                        T0 t0X = interfaceC2100x0.x(c1189g4.f14197d, 3);
                        C1855sP c1855sP = new C1855sP();
                        c1189g4.b();
                        c1855sP.f16722a = c1189g4.f14198e;
                        c1855sP.d("video/mp2t");
                        c1855sP.e("application/dvbsubs");
                        c1855sP.f16735o = Collections.singletonList(c1134f4.f14029b);
                        c1855sP.f16725d = c1134f4.f14028a;
                        t0X.e(new TP(c1855sP));
                        t0Arr[i] = t0X;
                        i++;
                    }
                }
            default:
                c1189g4.a();
                c1189g4.b();
                T0 t0X2 = interfaceC2100x0.x(c1189g4.f14197d, 5);
                this.f8549g = t0X2;
                C1855sP c1855sP2 = new C1855sP();
                c1189g4.b();
                c1855sP2.f16722a = c1189g4.f14198e;
                c1855sP2.d("video/mp2t");
                c1855sP2.e("application/id3");
                t0X2.e(new TP(c1855sP2));
                break;
        }
    }

    public H3(List list) {
        this.f8543a = 0;
        this.f8548f = list;
        this.f8549g = new T0[list.size()];
        this.f8545c = -9223372036854775807L;
    }
}
