package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.C4353g1;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import s3.AbstractC7901p;

/* renamed from: com.google.android.gms.measurement.internal.x5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4994x5 extends I2 {

    /* renamed from: c, reason: collision with root package name */
    private volatile C4970u5 f36861c;

    /* renamed from: d, reason: collision with root package name */
    private volatile C4970u5 f36862d;

    /* renamed from: e, reason: collision with root package name */
    protected C4970u5 f36863e;

    /* renamed from: f, reason: collision with root package name */
    private final Map f36864f;

    /* renamed from: g, reason: collision with root package name */
    private C4353g1 f36865g;

    /* renamed from: h, reason: collision with root package name */
    private volatile boolean f36866h;

    /* renamed from: i, reason: collision with root package name */
    private volatile C4970u5 f36867i;

    /* renamed from: j, reason: collision with root package name */
    private C4970u5 f36868j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f36869k;

    /* renamed from: l, reason: collision with root package name */
    private final Object f36870l;

    public C4994x5(C4976v3 c4976v3) {
        super(c4976v3);
        this.f36870l = new Object();
        this.f36864f = new ConcurrentHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void E(com.google.android.gms.measurement.internal.C4970u5 r16, com.google.android.gms.measurement.internal.C4970u5 r17, long r18, boolean r20, android.os.Bundle r21) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            r2 = r17
            r3 = r18
            r5 = r21
            r15.j()
            r6 = 0
            r7 = 1
            if (r2 == 0) goto L2f
            long r8 = r2.f36782c
            long r10 = r1.f36782c
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 != 0) goto L2f
            java.lang.String r8 = r2.f36781b
            java.lang.String r9 = r1.f36781b
            boolean r8 = java.util.Objects.equals(r8, r9)
            if (r8 == 0) goto L2f
            java.lang.String r8 = r2.f36780a
            java.lang.String r9 = r1.f36780a
            boolean r8 = java.util.Objects.equals(r8, r9)
            if (r8 != 0) goto L2d
            goto L2f
        L2d:
            r8 = r6
            goto L30
        L2f:
            r8 = r7
        L30:
            if (r20 == 0) goto L37
            com.google.android.gms.measurement.internal.u5 r9 = r0.f36863e
            if (r9 == 0) goto L37
            r6 = r7
        L37:
            if (r8 == 0) goto Lba
            android.os.Bundle r8 = new android.os.Bundle
            if (r5 == 0) goto L42
            r8.<init>(r5)
        L40:
            r14 = r8
            goto L46
        L42:
            r8.<init>()
            goto L40
        L46:
            com.google.android.gms.measurement.internal.x7.T(r1, r14, r7)
            if (r2 == 0) goto L64
            java.lang.String r5 = r2.f36780a
            if (r5 == 0) goto L54
            java.lang.String r8 = "_pn"
            r14.putString(r8, r5)
        L54:
            java.lang.String r5 = r2.f36781b
            if (r5 == 0) goto L5d
            java.lang.String r8 = "_pc"
            r14.putString(r8, r5)
        L5d:
            java.lang.String r5 = "_pi"
            long r8 = r2.f36782c
            r14.putLong(r5, r8)
        L64:
            r8 = 0
            if (r6 == 0) goto L7d
            com.google.android.gms.measurement.internal.w6 r2 = r15.r()
            com.google.android.gms.measurement.internal.C6 r2 = r2.f36855f
            long r10 = r2.a(r3)
            int r2 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r2 <= 0) goto L7d
            com.google.android.gms.measurement.internal.x7 r2 = r15.g()
            r2.I(r14, r10)
        L7d:
            com.google.android.gms.measurement.internal.l r2 = r15.a()
            boolean r2 = r2.T()
            if (r2 != 0) goto L8e
            java.lang.String r2 = "_mst"
            r10 = 1
            r14.putLong(r2, r10)
        L8e:
            boolean r2 = r1.f36784e
            if (r2 == 0) goto L96
            java.lang.String r2 = "app"
        L94:
            r10 = r2
            goto L99
        L96:
            java.lang.String r2 = "auto"
            goto L94
        L99:
            com.google.android.gms.common.util.d r2 = r15.zzb()
            long r11 = r2.a()
            boolean r2 = r1.f36784e
            r20 = r11
            if (r2 == 0) goto Laf
            long r11 = r1.f36785f
            int r2 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r2 == 0) goto Laf
            r12 = r11
            goto Lb1
        Laf:
            r12 = r20
        Lb1:
            com.google.android.gms.measurement.internal.r4 r9 = r15.n()
            java.lang.String r11 = "_vs"
            r9.g0(r10, r11, r12, r14)
        Lba:
            if (r6 == 0) goto Lc1
            com.google.android.gms.measurement.internal.u5 r2 = r0.f36863e
            r15.F(r2, r7, r3)
        Lc1:
            r0.f36863e = r1
            boolean r2 = r1.f36784e
            if (r2 == 0) goto Lc9
            r0.f36868j = r1
        Lc9:
            com.google.android.gms.measurement.internal.C5 r2 = r15.q()
            r2.J(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4994x5.E(com.google.android.gms.measurement.internal.u5, com.google.android.gms.measurement.internal.u5, long, boolean, android.os.Bundle):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F(C4970u5 c4970u5, boolean z10, long j10) {
        k().s(zzb().c());
        if (!r().B(c4970u5 != null && c4970u5.f36783d, z10, j10) || c4970u5 == null) {
            return;
        }
        c4970u5.f36783d = false;
    }

    static /* synthetic */ void G(C4994x5 c4994x5, Bundle bundle, C4970u5 c4970u5, C4970u5 c4970u52, long j10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (bundle != null) {
            bundle.remove("screen_name");
            bundle.remove("screen_class");
        }
        c4994x5.E(c4970u5, c4970u52, j10, true, c4994x5.g().B(null, "screen_view", bundle, null, false));
    }

    private final void K(String str, C4970u5 c4970u5, boolean z10) {
        C4970u5 c4970u52;
        C4970u5 c4970u53 = this.f36861c == null ? this.f36862d : this.f36861c;
        if (c4970u5.f36781b == null) {
            c4970u52 = new C4970u5(c4970u5.f36780a, str != null ? d(str, "Activity") : null, c4970u5.f36782c, c4970u5.f36784e, c4970u5.f36785f);
        } else {
            c4970u52 = c4970u5;
        }
        this.f36862d = this.f36861c;
        this.f36861c = c4970u52;
        zzl().z(new RunnableC5010z5(this, c4970u52, c4970u53, zzb().c(), z10));
    }

    private final C4970u5 P(C4353g1 c4353g1) {
        AbstractC7901p.l(c4353g1);
        C4970u5 c4970u5 = (C4970u5) this.f36864f.get(Integer.valueOf(c4353g1.f35227a));
        if (c4970u5 == null) {
            C4970u5 c4970u52 = new C4970u5(null, d(c4353g1.f35228b, "Activity"), g().M0());
            this.f36864f.put(Integer.valueOf(c4353g1.f35227a), c4970u52);
            c4970u5 = c4970u52;
        }
        return this.f36867i != null ? this.f36867i : c4970u5;
    }

    private final String d(String str, String str2) {
        if (str == null) {
            return str2;
        }
        String[] strArrSplit = str.split("\\.");
        String str3 = strArrSplit.length > 0 ? strArrSplit[strArrSplit.length - 1] : "";
        return str3.length() > a().n(null, false) ? str3.substring(0, a().n(null, false)) : str3;
    }

    public final void A(Bundle bundle, long j10) {
        String str;
        synchronized (this.f36870l) {
            try {
                if (!this.f36869k) {
                    zzj().I().a("Cannot log screen view event when the app is in the background.");
                    return;
                }
                String strD = null;
                if (bundle != null) {
                    String string = bundle.getString("screen_name");
                    if (string != null && (string.length() <= 0 || string.length() > a().n(null, false))) {
                        zzj().I().b("Invalid screen name length for screen view. Length", Integer.valueOf(string.length()));
                        return;
                    }
                    String string2 = bundle.getString("screen_class");
                    if (string2 != null && (string2.length() <= 0 || string2.length() > a().n(null, false))) {
                        zzj().I().b("Invalid screen class length for screen view. Length", Integer.valueOf(string2.length()));
                        return;
                    } else {
                        str = string;
                        strD = string2;
                    }
                } else {
                    str = null;
                }
                if (strD == null) {
                    C4353g1 c4353g1 = this.f36865g;
                    strD = c4353g1 != null ? d(c4353g1.f35228b, "Activity") : "Activity";
                }
                String str2 = strD;
                C4970u5 c4970u5 = this.f36861c;
                if (this.f36866h && c4970u5 != null) {
                    this.f36866h = false;
                    boolean zEquals = Objects.equals(c4970u5.f36781b, str2);
                    boolean zEquals2 = Objects.equals(c4970u5.f36780a, str);
                    if (zEquals && zEquals2) {
                        zzj().I().a("Ignoring call to log screen view event with duplicate parameters.");
                        return;
                    }
                }
                zzj().G().c("Logging screen view with name, class", str == null ? "null" : str, str2 == null ? "null" : str2);
                C4970u5 c4970u52 = this.f36861c == null ? this.f36862d : this.f36861c;
                C4970u5 c4970u53 = new C4970u5(str, str2, g().M0(), true, j10);
                this.f36861c = c4970u53;
                this.f36862d = c4970u52;
                this.f36867i = c4970u53;
                zzl().z(new RunnableC4986w5(this, bundle, c4970u53, c4970u52, zzb().c()));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void B(C4353g1 c4353g1) {
        synchronized (this.f36870l) {
            try {
                if (Objects.equals(this.f36865g, c4353g1)) {
                    this.f36865g = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (a().T()) {
            this.f36864f.remove(Integer.valueOf(c4353g1.f35227a));
        }
    }

    public final void C(C4353g1 c4353g1, Bundle bundle) {
        Bundle bundle2;
        if (!a().T() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f36864f.put(Integer.valueOf(c4353g1.f35227a), new C4970u5(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    public final void D(C4353g1 c4353g1, String str, String str2) {
        if (!a().T()) {
            zzj().I().a("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        C4970u5 c4970u5 = this.f36861c;
        if (c4970u5 == null) {
            zzj().I().a("setCurrentScreen cannot be called while no activity active");
            return;
        }
        if (this.f36864f.get(Integer.valueOf(c4353g1.f35227a)) == null) {
            zzj().I().a("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if (str2 == null) {
            str2 = d(c4353g1.f35228b, "Activity");
        }
        boolean zEquals = Objects.equals(c4970u5.f36781b, str2);
        boolean zEquals2 = Objects.equals(c4970u5.f36780a, str);
        if (zEquals && zEquals2) {
            zzj().I().a("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if (str != null && (str.length() <= 0 || str.length() > a().n(null, false))) {
            zzj().I().b("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            return;
        }
        if (str2 != null && (str2.length() <= 0 || str2.length() > a().n(null, false))) {
            zzj().I().b("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            return;
        }
        zzj().G().c("Setting current screen to name, class", str == null ? "null" : str, str2);
        C4970u5 c4970u52 = new C4970u5(str, str2, g().M0());
        this.f36864f.put(Integer.valueOf(c4353g1.f35227a), c4970u52);
        K(c4353g1.f35228b, c4970u52, true);
    }

    public final C4970u5 L() {
        return this.f36861c;
    }

    public final void M(C4353g1 c4353g1) {
        synchronized (this.f36870l) {
            this.f36869k = false;
            this.f36866h = true;
        }
        long jC = zzb().c();
        if (!a().T()) {
            this.f36861c = null;
            zzl().z(new B5(this, jC));
        } else {
            C4970u5 c4970u5P = P(c4353g1);
            this.f36862d = this.f36861c;
            this.f36861c = null;
            zzl().z(new A5(this, c4970u5P, jC));
        }
    }

    public final void N(C4353g1 c4353g1, Bundle bundle) {
        C4970u5 c4970u5;
        if (!a().T() || bundle == null || (c4970u5 = (C4970u5) this.f36864f.get(Integer.valueOf(c4353g1.f35227a))) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", c4970u5.f36782c);
        bundle2.putString("name", c4970u5.f36780a);
        bundle2.putString("referrer_name", c4970u5.f36781b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    public final void O(C4353g1 c4353g1) {
        synchronized (this.f36870l) {
            this.f36869k = true;
            if (!Objects.equals(c4353g1, this.f36865g)) {
                synchronized (this.f36870l) {
                    this.f36865g = c4353g1;
                    this.f36866h = false;
                }
                if (a().T()) {
                    this.f36867i = null;
                    zzl().z(new D5(this));
                }
            }
        }
        if (!a().T()) {
            this.f36861c = this.f36867i;
            zzl().z(new RunnableC5002y5(this));
            return;
        }
        K(c4353g1.f35228b, P(c4353g1), false);
        B bK = k();
        bK.zzl().z(new RunnableC4826d0(bK, bK.zzb().c()));
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
        return false;
    }

    public final C4970u5 z(boolean z10) {
        u();
        j();
        if (!z10) {
            return this.f36863e;
        }
        C4970u5 c4970u5 = this.f36863e;
        return c4970u5 != null ? c4970u5 : this.f36868j;
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
