package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.measurement.internal.C4839e4;
import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
import java.util.List;
import java.util.Locale;
import s3.AbstractC7901p;

/* renamed from: com.google.android.gms.measurement.internal.z2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5007z2 extends I2 {

    /* renamed from: c, reason: collision with root package name */
    private String f36889c;

    /* renamed from: d, reason: collision with root package name */
    private String f36890d;

    /* renamed from: e, reason: collision with root package name */
    private int f36891e;

    /* renamed from: f, reason: collision with root package name */
    private String f36892f;

    /* renamed from: g, reason: collision with root package name */
    private String f36893g;

    /* renamed from: h, reason: collision with root package name */
    private long f36894h;

    /* renamed from: i, reason: collision with root package name */
    private long f36895i;

    /* renamed from: j, reason: collision with root package name */
    private List f36896j;

    /* renamed from: k, reason: collision with root package name */
    private String f36897k;

    /* renamed from: l, reason: collision with root package name */
    private int f36898l;

    /* renamed from: m, reason: collision with root package name */
    private String f36899m;

    /* renamed from: n, reason: collision with root package name */
    private String f36900n;

    /* renamed from: o, reason: collision with root package name */
    private String f36901o;

    /* renamed from: p, reason: collision with root package name */
    private long f36902p;

    /* renamed from: q, reason: collision with root package name */
    private String f36903q;

    C5007z2(C4976v3 c4976v3, long j10) {
        super(c4976v3);
        this.f36902p = 0L;
        this.f36903q = null;
        this.f36895i = j10;
    }

    private final String H() throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        if (com.google.android.gms.internal.measurement.t7.a() && a().p(N.f36022G0)) {
            zzj().G().a("Disabled IID for tests.");
            return null;
        }
        try {
            Class<?> clsLoadClass = zza().getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
            if (clsLoadClass == null) {
                return null;
            }
            try {
                Object objInvoke = clsLoadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, zza());
                if (objInvoke == null) {
                    return null;
                }
                try {
                    return (String) clsLoadClass.getDeclaredMethod("getFirebaseInstanceId", null).invoke(objInvoke, null);
                } catch (Exception unused) {
                    zzj().I().a("Failed to retrieve Firebase Instance Id");
                    return null;
                }
            } catch (Exception unused2) {
                zzj().J().a("Failed to obtain Firebase Analytics instance");
                return null;
            }
        } catch (ClassNotFoundException unused3) {
        }
    }

    final int A() {
        u();
        return this.f36891e;
    }

    final String B() {
        u();
        return this.f36900n;
    }

    final String C() {
        u();
        AbstractC7901p.l(this.f36889c);
        return this.f36889c;
    }

    final String D() {
        u();
        AbstractC7901p.l(this.f36893g);
        return this.f36893g;
    }

    final String E() {
        j();
        u();
        AbstractC7901p.l(this.f36899m);
        return this.f36899m;
    }

    final List F() {
        return this.f36896j;
    }

    final void G() {
        String str;
        j();
        if (e().J().m(C4839e4.a.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            g().Q0().nextBytes(bArr);
            str = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            zzj().B().a("Analytics Storage consent is not granted");
            str = null;
        }
        zzj().B().a(String.format("Resetting session stitching token to %s", str == null ? "null" : "not null"));
        this.f36901o = str;
        this.f36902p = zzb().a();
    }

    final boolean I(String str) {
        String str2 = this.f36903q;
        boolean z10 = (str2 == null || str2.equals(str)) ? false : true;
        this.f36903q = str;
        return z10;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ C4893l a() {
        return super.a();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ F b() {
        return super.b();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ D2 c() {
        return super.c();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ X2 e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ C4915n5 f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ x7 g() {
        return super.g();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4845f1, com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ void h() {
        super.h();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4845f1, com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4845f1, com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ void j() {
        super.j();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4845f1
    public final /* bridge */ /* synthetic */ B k() {
        return super.k();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4845f1
    public final /* bridge */ /* synthetic */ C5007z2 l() {
        return super.l();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4845f1
    public final /* bridge */ /* synthetic */ C2 m() {
        return super.m();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4845f1
    public final /* bridge */ /* synthetic */ C4945r4 n() {
        return super.n();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4845f1
    public final /* bridge */ /* synthetic */ C4939q5 o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4845f1
    public final /* bridge */ /* synthetic */ C4994x5 p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4845f1
    public final /* bridge */ /* synthetic */ C5 q() {
        return super.q();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4845f1
    public final /* bridge */ /* synthetic */ C4987w6 r() {
        return super.r();
    }

    @Override // com.google.android.gms.measurement.internal.I2
    protected final boolean t() {
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:0|2|(1:4)(22:95|6|(1:10)(2:11|(1:13))|93|14|(4:16|(1:18)(1:20)|99|21)|26|(1:31)(1:30)|32|(1:(2:35|(2:37|(2:39|(2:41|(2:43|(1:45)(1:46))(1:47))(1:48))(1:49))(1:50))(1:51))(1:52)|(1:55)|56|(1:58)|97|59|(1:61)(1:62)|63|(1:65)|(3:69|(1:71)(1:72)|73)|76|(1:87)(2:78|(1:80)(4:81|(3:84|(1:102)(1:103)|82)|101|87))|(2:89|90)(2:91|92))|5|26|(2:28|31)(0)|32|(0)(0)|(0)|56|(0)|97|59|(0)(0)|63|(0)|(0)|76|(0)(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x019f, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01c0, code lost:
    
        zzj().C().c("Fetching Google App Id failed with exception. appId", com.google.android.gms.measurement.internal.L2.r(r0), r3);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0187 A[Catch: IllegalStateException -> 0x019f, TryCatch #2 {IllegalStateException -> 0x019f, blocks: (B:59:0x0162, B:63:0x017f, B:65:0x0187, B:69:0x01a3, B:71:0x01b7, B:73:0x01bc, B:72:0x01ba), top: B:97:0x0162 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01a3 A[Catch: IllegalStateException -> 0x019f, TryCatch #2 {IllegalStateException -> 0x019f, blocks: (B:59:0x0162, B:63:0x017f, B:65:0x0187, B:69:0x01a3, B:71:0x01b7, B:73:0x01bc, B:72:0x01ba), top: B:97:0x0162 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0220  */
    @Override // com.google.android.gms.measurement.internal.I2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void x() throws android.content.res.Resources.NotFoundException, android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 547
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C5007z2.x():void");
    }

    final t7 y(String str) {
        long j10;
        long j11;
        boolean z10;
        boolean z11;
        String str2;
        int iV0;
        j();
        String strC = C();
        String strE = E();
        u();
        String str3 = this.f36890d;
        long jA = A();
        u();
        AbstractC7901p.l(this.f36892f);
        String str4 = this.f36892f;
        u();
        j();
        if (this.f36894h == 0) {
            this.f36894h = this.f36331a.K().v(zza(), zza().getPackageName());
        }
        long j12 = this.f36894h;
        boolean zN = this.f36331a.n();
        boolean z12 = !e().f36280t;
        j();
        String strH = !this.f36331a.n() ? null : H();
        C4976v3 c4976v3 = this.f36331a;
        long jA2 = c4976v3.C().f36267g.a();
        long jMin = jA2 == 0 ? c4976v3.f36807G : Math.min(c4976v3.f36807G, jA2);
        int iZ = z();
        boolean zS = a().S();
        X2 x2E = e();
        x2E.j();
        boolean z13 = x2E.G().getBoolean("deferred_analytics_collection", false);
        String strB = B();
        Boolean boolValueOf = Boolean.valueOf(a().z("google_analytics_default_allow_ad_personalization_signals", true) != EnumC4866h4.GRANTED);
        long j13 = this.f36895i;
        List list = this.f36896j;
        String strV = e().J().v();
        if (this.f36897k == null) {
            this.f36897k = g().O0();
        }
        String str5 = this.f36897k;
        if (e().J().m(C4839e4.a.ANALYTICS_STORAGE)) {
            j();
            j10 = j13;
            j11 = 0;
            if (this.f36902p != 0) {
                z10 = zN;
                z11 = z12;
                long jA3 = zzb().a() - this.f36902p;
                if (this.f36901o != null && jA3 > 86400000 && this.f36903q == null) {
                    G();
                }
            } else {
                z10 = zN;
                z11 = z12;
            }
            if (this.f36901o == null) {
                G();
            }
            str2 = this.f36901o;
        } else {
            j10 = j13;
            z10 = zN;
            z11 = z12;
            j11 = 0;
            str2 = null;
        }
        boolean zR = a().r();
        long jW0 = g().w0(C());
        int iB = e().J().b();
        String strJ = e().I().j();
        if (com.google.android.gms.internal.measurement.U6.a() && a().p(N.f36054W0)) {
            g();
            iV0 = x7.v0();
        } else {
            iV0 = 0;
        }
        return new t7(strC, strE, str3, jA, str4, 118003L, j12, str, z10, z11, strH, jMin, iZ, zS, z13, strB, boolValueOf, j10, list, (String) null, strV, str5, str2, zR, jW0, iB, strJ, iV0, (com.google.android.gms.internal.measurement.U6.a() && a().p(N.f36054W0)) ? g().L0() : j11, a().R(), new G1(a().z("google_analytics_default_allow_ad_personalization_signals", true)).c(), this.f36331a.f36807G, a().p(N.f36044R0) ? o().z().zza() : 0);
    }

    final int z() {
        u();
        return this.f36898l;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4, com.google.android.gms.measurement.internal.InterfaceC4821c4
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4, com.google.android.gms.measurement.internal.InterfaceC4821c4
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.util.d zzb() {
        return super.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4, com.google.android.gms.measurement.internal.InterfaceC4821c4
    public final /* bridge */ /* synthetic */ C4834e zzd() {
        return super.zzd();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4, com.google.android.gms.measurement.internal.InterfaceC4821c4
    public final /* bridge */ /* synthetic */ L2 zzj() {
        return super.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4, com.google.android.gms.measurement.internal.InterfaceC4821c4
    public final /* bridge */ /* synthetic */ C4952s3 zzl() {
        return super.zzl();
    }
}
