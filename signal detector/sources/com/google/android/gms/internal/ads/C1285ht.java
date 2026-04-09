package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import c3.InterfaceC0402a;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import t2.AbstractC2907C;
import x.AbstractC2984e;

/* renamed from: com.google.android.gms.internal.ads.ht, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1285ht implements InterfaceC1930tt, BD, InterfaceC0402a, ZA, YA, InterfaceC0871aE, InterfaceC1361jG {

    /* renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ C1285ht f14594C;

    /* renamed from: D, reason: collision with root package name */
    public static final /* synthetic */ C1285ht f14595D;

    /* renamed from: E, reason: collision with root package name */
    public static final /* synthetic */ C1285ht f14596E;

    /* renamed from: F, reason: collision with root package name */
    public static final /* synthetic */ C1285ht f14597F;

    /* renamed from: G, reason: collision with root package name */
    public static final /* synthetic */ C1285ht f14598G;

    /* renamed from: H, reason: collision with root package name */
    public static final /* synthetic */ C1285ht f14599H;

    /* renamed from: I, reason: collision with root package name */
    public static final /* synthetic */ C1285ht f14600I;

    /* renamed from: J, reason: collision with root package name */
    public static final /* synthetic */ C1285ht f14601J;

    /* renamed from: K, reason: collision with root package name */
    public static final /* synthetic */ C1285ht f14602K;

    /* renamed from: L, reason: collision with root package name */
    public static final /* synthetic */ C1285ht f14603L;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ C1285ht f14604b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ C1285ht f14605c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ C1285ht f14606d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ C1285ht f14607e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ C1285ht f14608f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ C1285ht f14609g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ C1285ht f14610h;
    public static final /* synthetic */ C1285ht i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ C1285ht f14611j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ C1285ht f14612k;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ C1285ht f14613l;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ C1285ht f14614m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ C1285ht f14615n;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14616a;

    static {
        byte b5 = 0;
        f14604b = new C1285ht(0, b5);
        f14605c = new C1285ht(1, b5);
        f14606d = new C1285ht(2, b5);
        f14607e = new C1285ht(4, b5);
        f14608f = new C1285ht(5, b5);
        f14609g = new C1285ht(6, b5);
        f14610h = new C1285ht(7, b5);
        i = new C1285ht(13, b5);
        f14611j = new C1285ht(14, b5);
        f14612k = new C1285ht(16, b5);
        f14613l = new C1285ht(17, b5);
        f14614m = new C1285ht(18, b5);
        f14615n = new C1285ht(19, b5);
        f14594C = new C1285ht(20, b5);
        f14595D = new C1285ht(21, b5);
        f14596E = new C1285ht(22, b5);
        f14597F = new C1285ht(23, b5);
        f14598G = new C1285ht(24, b5);
        f14599H = new C1285ht(25, b5);
        f14600I = new C1285ht(26, b5);
        f14601J = new C1285ht(27, b5);
        f14602K = new C1285ht(28, b5);
        f14603L = new C1285ht(29, b5);
    }

    public C1285ht(int i3) {
        this.f14616a = 10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0871aE
    /* renamed from: a, reason: collision with other method in class */
    public void mo13a() {
        switch (this.f14616a) {
            case 14:
                break;
            default:
                WF.f12193b.a().getClass();
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1930tt
    public /* synthetic */ void b(Object obj) {
        switch (this.f14616a) {
            case 0:
                ((InterfaceC0526Gk) obj).i();
                break;
            case 1:
                ((s2.k) obj).j2();
                break;
            case 2:
                ((s2.k) obj).N2();
                break;
            case 3:
            default:
                ((E2.a) obj).c();
                break;
            case 4:
                ((InterfaceC0656Oe) obj).k();
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1361jG, com.google.android.gms.internal.ads.KF
    public Object c(Cr cr) throws GeneralSecurityException {
        byte[] bArrB;
        switch (this.f14616a) {
            case 16:
                ZE ze = (ZE) cr;
                CF cf = AbstractC1413kE.f15076a;
                try {
                    C1308iF.b();
                    return new C1845sF(((C1313iK) ze.f12807d.f15314b).b(), ze.f12808e.b(), C1308iF.b().getProvider());
                } catch (GeneralSecurityException unused) {
                    return new C1684pF(((C1313iK) ze.f12807d.f15314b).b(), 3, ze.f12808e.b());
                }
            case 17:
                IE ie = (IE) cr;
                CF cf2 = AbstractC1413kE.f15076a;
                try {
                    C1308iF.b();
                    return new C1308iF(((C1313iK) ie.f9083d.f15314b).b(), ie.f9084e.b(), C1308iF.b().getProvider());
                } catch (GeneralSecurityException unused2) {
                    return new C1684pF(((C1313iK) ie.f9083d.f15314b).b(), 2, ie.f9084e.b());
                }
            case 18:
                return SJ.b((C2114xE) cr);
            case 19:
                CE ce = (CE) cr;
                ce.getClass();
                return new C1684pF(((C1313iK) ce.f7554d.f15314b).b(), ce.f7555e);
            case 20:
                return AbstractC1953uF.b((FE) cr);
            case 21:
                return WJ.b((C1737qE) cr);
            case 22:
                WE we = (WE) cr;
                we.getClass();
                return new C1738qF(((C1313iK) we.f12190d.f15314b).b(), we.f12191e, we.f12189c.f12620b);
            case 23:
                C1631oG c1631oG = ((PF) cr).f10334c;
                int[] iArr = NF.f9982b;
                int i3 = c1631oG.f15925d;
                Integer num = c1631oG.f15927f;
                int i6 = iArr[AbstractC2984e.c(i3)];
                VD vd = (VD) GF.f8340d.b(VD.class, c1631oG.f15922a).a(c1631oG.f15924c);
                EnumC1956uI enumC1956uI = c1631oG.f15926e;
                int iOrdinal = enumC1956uI.ordinal();
                if (iOrdinal == 1) {
                    bArrB = AbstractC0873aG.b(num.intValue()).b();
                } else if (iOrdinal == 2) {
                    bArrB = AbstractC0873aG.a(num.intValue()).b();
                } else if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        throw new GeneralSecurityException("unknown output prefix type ".concat(String.valueOf(enumC1956uI)));
                    }
                    bArrB = AbstractC0873aG.a(num.intValue()).b();
                } else {
                    bArrB = AbstractC0873aG.f13089a.b();
                }
                return new C1684pF(vd, bArrB);
            case 24:
                return WJ.b((C1737qE) cr);
            case 25:
                return SJ.b((C2114xE) cr);
            case 26:
                CE ce2 = (CE) cr;
                ce2.getClass();
                return new C1684pF(((C1313iK) ce2.f7554d.f15314b).b(), ce2.f7555e);
            case 27:
                return AbstractC1953uF.b((FE) cr);
            case 28:
                IE ie2 = (IE) cr;
                C1309iG c1309iG = JE.f9267a;
                try {
                    C1308iF.b();
                    return new C1308iF(((C1313iK) ie2.f9083d.f15314b).b(), ie2.f9084e.b(), C1308iF.b().getProvider());
                } catch (GeneralSecurityException unused3) {
                    return new C1684pF(((C1313iK) ie2.f9083d.f15314b).b(), 2, ie2.f9084e.b());
                }
            default:
                C1309iG c1309iG2 = LE.f9641a;
                AbstractC0980cE.a(((OE) cr).f10171c.f10332a);
                throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.BD
    /* renamed from: d */
    public /* synthetic */ void mo11d(Object obj) {
        AbstractC2907C.m("Notification of cache hit successful.");
    }

    @Override // com.google.android.gms.internal.ads.YA
    public Iterator e(C1448kw c1448kw, CharSequence charSequence) {
        return new WA(charSequence);
    }

    @Override // c3.InterfaceC0402a
    public /* synthetic */ Object l(c3.j jVar) {
        return new Boolean(jVar.e());
    }

    @Override // com.google.android.gms.internal.ads.BD
    public void u(Throwable th) {
        AbstractC2907C.m("Notification of cache hit failed.");
    }

    public /* synthetic */ C1285ht(int i3, byte b5) {
        this.f14616a = i3;
    }

    @Override // com.google.android.gms.internal.ads.ZA
    public /* synthetic */ Object a() {
        switch (this.f14616a) {
            case 7:
                return -1;
            case 8:
                return -1;
            case 9:
            case 10:
            default:
                throw new IllegalStateException();
            case 11:
                HandlerThread handlerThread = new HandlerThread("OverlayDisplayService", 10);
                handlerThread.start();
                return new Handler(handlerThread.getLooper());
        }
    }

    private final /* synthetic */ void f() {
    }
}
