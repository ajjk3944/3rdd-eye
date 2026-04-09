package com.yandex.mobile.ads.impl;

import com.singular.sdk.internal.Constants;
import com.yandex.mobile.ads.impl.di0;
import com.yandex.mobile.ads.impl.v11;
import java.io.EOFException;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class q11 implements u70 {

    /* renamed from: u, reason: collision with root package name */
    private static final di0.a f31973u = new S1(6);

    /* renamed from: a, reason: collision with root package name */
    private final int f31974a;

    /* renamed from: b, reason: collision with root package name */
    private final long f31975b;

    /* renamed from: c, reason: collision with root package name */
    private final uf1 f31976c;

    /* renamed from: d, reason: collision with root package name */
    private final v11.a f31977d;

    /* renamed from: e, reason: collision with root package name */
    private final ce0 f31978e;

    /* renamed from: f, reason: collision with root package name */
    private final fi0 f31979f;

    /* renamed from: g, reason: collision with root package name */
    private final m40 f31980g;

    /* renamed from: h, reason: collision with root package name */
    private w70 f31981h;
    private n52 i;

    /* renamed from: j, reason: collision with root package name */
    private n52 f31982j;

    /* renamed from: k, reason: collision with root package name */
    private int f31983k;

    /* renamed from: l, reason: collision with root package name */
    private yz0 f31984l;

    /* renamed from: m, reason: collision with root package name */
    private long f31985m;

    /* renamed from: n, reason: collision with root package name */
    private long f31986n;

    /* renamed from: o, reason: collision with root package name */
    private long f31987o;

    /* renamed from: p, reason: collision with root package name */
    private int f31988p;

    /* renamed from: q, reason: collision with root package name */
    private ww1 f31989q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f31990r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f31991s;

    /* renamed from: t, reason: collision with root package name */
    private long f31992t;

    public q11() {
        this(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean a(int i, int i10, int i11, int i12, int i13) {
        if (i10 == 67 && i11 == 79 && i12 == 77 && (i13 == 77 || i == 2)) {
            return true;
        }
        if (i10 == 77 && i11 == 76 && i12 == 76) {
            return i13 == 84 || i == 2;
        }
        return false;
    }

    public q11(int i) {
        this((Object) null);
    }

    private static /* synthetic */ u70[] b() {
        return new u70[]{new q11()};
    }

    public final void a() {
        this.f31990r = true;
    }

    public q11(Object obj) {
        this.f31974a = 0;
        this.f31975b = -9223372036854775807L;
        this.f31976c = new uf1(10);
        this.f31977d = new v11.a();
        this.f31978e = new ce0();
        this.f31985m = -9223372036854775807L;
        this.f31979f = new fi0();
        m40 m40Var = new m40();
        this.f31980g = m40Var;
        this.f31982j = m40Var;
    }

    @Override // com.yandex.mobile.ads.impl.u70
    public final void a(w70 w70Var) {
        this.f31981h = w70Var;
        n52 n52VarA = w70Var.a(0, 1);
        this.i = n52VarA;
        this.f31982j = n52VarA;
        this.f31981h.a();
    }

    private boolean a(rz rzVar) throws IOException {
        ww1 ww1Var = this.f31989q;
        if (ww1Var != null) {
            long jA = ww1Var.a();
            if (jA != -1 && rzVar.d() > jA - 4) {
                return true;
            }
        }
        try {
            return !rzVar.b(this.f31976c.c(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0377 A[PHI: r19
  0x0377: PHI (r19v1 long) = (r19v0 long), (r19v4 long), (r19v4 long) binds: [B:8:0x0019, B:150:0x0375, B:128:0x02d3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a4  */
    @Override // com.yandex.mobile.ads.impl.u70
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(com.yandex.mobile.ads.impl.v70 r32, com.yandex.mobile.ads.impl.jj1 r33) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 983
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.q11.a(com.yandex.mobile.ads.impl.v70, com.yandex.mobile.ads.impl.jj1):int");
    }

    @Override // com.yandex.mobile.ads.impl.u70
    public final void release() {
    }

    @Override // com.yandex.mobile.ads.impl.u70
    public final void a(long j4, long j10) {
        this.f31983k = 0;
        this.f31985m = -9223372036854775807L;
        this.f31986n = 0L;
        this.f31988p = 0;
        this.f31992t = j10;
        ww1 ww1Var = this.f31989q;
        if (!(ww1Var instanceof nk0) || ((nk0) ww1Var).c(j10)) {
            return;
        }
        this.f31991s = true;
        this.f31982j = this.f31980g;
    }

    @Override // com.yandex.mobile.ads.impl.u70
    public final boolean a(v70 v70Var) throws IOException {
        return a((rz) v70Var, true);
    }

    private boolean a(rz rzVar, boolean z10) throws IOException {
        int iD;
        int i;
        int iA;
        int i10 = z10 ? Constants.QUEUE_ELEMENT_MAX_SIZE : 131072;
        rzVar.c();
        if (rzVar.a() == 0) {
            yz0 yz0VarA = this.f31979f.a(rzVar, (this.f31974a & 8) == 0 ? null : f31973u);
            this.f31984l = yz0VarA;
            if (yz0VarA != null) {
                this.f31978e.a(yz0VarA);
            }
            iD = (int) rzVar.d();
            if (!z10) {
                rzVar.a(iD);
            }
            i = 0;
        } else {
            iD = 0;
            i = 0;
        }
        int i11 = i;
        int i12 = i11;
        while (true) {
            if (!a(rzVar)) {
                this.f31976c.e(0);
                int iH = this.f31976c.h();
                if ((i == 0 || ((-128000) & iH) == (i & (-128000))) && (iA = v11.a(iH)) != -1) {
                    i11++;
                    if (i11 != 1) {
                        if (i11 == 4) {
                            break;
                        }
                    } else {
                        this.f31977d.a(iH);
                        i = iH;
                    }
                    rzVar.a(false, iA - 4);
                } else {
                    int i13 = i12 + 1;
                    if (i12 == i10) {
                        if (z10) {
                            return false;
                        }
                        throw yf1.a("Searched too many bytes.", (Exception) null);
                    }
                    if (z10) {
                        rzVar.c();
                        rzVar.a(false, iD + i13);
                    } else {
                        rzVar.a(1);
                    }
                    i11 = 0;
                    i12 = i13;
                    i = 0;
                }
            } else if (i11 <= 0) {
                throw new EOFException();
            }
        }
        if (z10) {
            rzVar.a(iD + i12);
        } else {
            rzVar.c();
        }
        this.f31983k = i;
        return true;
    }
}
