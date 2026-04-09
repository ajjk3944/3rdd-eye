package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.AbstractC4410n;
import com.google.android.gms.internal.measurement.C4300a2;
import com.google.android.gms.internal.measurement.C4336e2;
import com.google.android.gms.internal.measurement.C4424o5;
import com.google.android.gms.internal.measurement.X1;
import com.google.android.gms.internal.measurement.Z1;
import com.google.android.gms.internal.measurement.zzc;
import com.google.android.gms.internal.measurement.zzkq;
import com.google.android.gms.measurement.internal.C4839e4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import o.C7010a;
import o.C7030v;
import s3.AbstractC7901p;

/* renamed from: com.google.android.gms.measurement.internal.i3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4873i3 extends U6 implements InterfaceC4909n {

    /* renamed from: d, reason: collision with root package name */
    private final Map f36527d;

    /* renamed from: e, reason: collision with root package name */
    private final Map f36528e;

    /* renamed from: f, reason: collision with root package name */
    private final Map f36529f;

    /* renamed from: g, reason: collision with root package name */
    private final Map f36530g;

    /* renamed from: h, reason: collision with root package name */
    private final Map f36531h;

    /* renamed from: i, reason: collision with root package name */
    private final Map f36532i;

    /* renamed from: j, reason: collision with root package name */
    final C7030v f36533j;

    /* renamed from: k, reason: collision with root package name */
    private final com.google.android.gms.internal.measurement.E7 f36534k;

    /* renamed from: l, reason: collision with root package name */
    private final Map f36535l;

    /* renamed from: m, reason: collision with root package name */
    private final Map f36536m;

    /* renamed from: n, reason: collision with root package name */
    private final Map f36537n;

    C4873i3(C4833d7 c4833d7) {
        super(c4833d7);
        this.f36527d = new C7010a();
        this.f36528e = new C7010a();
        this.f36529f = new C7010a();
        this.f36530g = new C7010a();
        this.f36531h = new C7010a();
        this.f36535l = new C7010a();
        this.f36536m = new C7010a();
        this.f36537n = new C7010a();
        this.f36532i = new C7010a();
        this.f36533j = new C4905m3(this, 20);
        this.f36534k = new C4929p3(this);
    }

    private static Map A(C4300a2 c4300a2) {
        C7010a c7010a = new C7010a();
        if (c4300a2 != null) {
            for (C4336e2 c4336e2 : c4300a2.V()) {
                c7010a.put(c4336e2.G(), c4336e2.H());
            }
        }
        return c7010a;
    }

    private final void B(String str, C4300a2.a aVar) {
        HashSet hashSet = new HashSet();
        C7010a c7010a = new C7010a();
        C7010a c7010a2 = new C7010a();
        C7010a c7010a3 = new C7010a();
        if (aVar != null) {
            Iterator it = aVar.E().iterator();
            while (it.hasNext()) {
                hashSet.add(((com.google.android.gms.internal.measurement.Y1) it.next()).G());
            }
            for (int i10 = 0; i10 < aVar.u(); i10++) {
                Z1.a aVarW = (Z1.a) aVar.w(i10).v();
                if (aVarW.x().isEmpty()) {
                    zzj().H().a("EventConfig contained null event name");
                } else {
                    String strX = aVarW.x();
                    String strB = AbstractC4898l4.b(aVarW.x());
                    if (!TextUtils.isEmpty(strB)) {
                        aVarW = aVarW.w(strB);
                        aVar.x(i10, aVarW);
                    }
                    if (aVarW.B() && aVarW.z()) {
                        c7010a.put(strX, Boolean.TRUE);
                    }
                    if (aVarW.D() && aVarW.A()) {
                        c7010a2.put(aVarW.x(), Boolean.TRUE);
                    }
                    if (aVarW.E()) {
                        if (aVarW.u() < 2 || aVarW.u() > 65535) {
                            zzj().H().c("Invalid sampling rate. Event name, sample rate", aVarW.x(), Integer.valueOf(aVarW.u()));
                        } else {
                            c7010a3.put(aVarW.x(), Integer.valueOf(aVarW.u()));
                        }
                    }
                }
            }
        }
        this.f36528e.put(str, hashSet);
        this.f36529f.put(str, c7010a);
        this.f36530g.put(str, c7010a2);
        this.f36532i.put(str, c7010a3);
    }

    private final void C(final String str, C4300a2 c4300a2) {
        if (c4300a2.j() == 0) {
            this.f36533j.e(str);
            return;
        }
        zzj().G().b("EES programs found", Integer.valueOf(c4300a2.j()));
        com.google.android.gms.internal.measurement.M2 m22 = (com.google.android.gms.internal.measurement.M2) c4300a2.U().get(0);
        try {
            com.google.android.gms.internal.measurement.C c10 = new com.google.android.gms.internal.measurement.C();
            c10.d("internal.remoteConfig", new Callable() { // from class: com.google.android.gms.measurement.internal.h3
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new C4424o5("internal.remoteConfig", new C4921o3(this.f36518a, str));
                }
            });
            c10.d("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.l3
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    final C4873i3 c4873i3 = this.f36579a;
                    final String str2 = str;
                    return new com.google.android.gms.internal.measurement.G7("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.n3
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            C4873i3 c4873i32 = c4873i3;
                            String str3 = str2;
                            C4864h2 c4864h2Q0 = c4873i32.m().Q0(str3);
                            HashMap map = new HashMap();
                            map.put("platform", "android");
                            map.put("package_name", str3);
                            map.put("gmp_version", 118003L);
                            if (c4864h2Q0 != null) {
                                String strO = c4864h2Q0.o();
                                if (strO != null) {
                                    map.put("app_version", strO);
                                }
                                map.put("app_version_int", Long.valueOf(c4864h2Q0.V()));
                                map.put("dynamite_version", Long.valueOf(c4864h2Q0.w0()));
                            }
                            return map;
                        }
                    });
                }
            });
            c10.d("internal.logger", new Callable() { // from class: com.google.android.gms.measurement.internal.k3
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return C4873i3.v(this.f36564a);
                }
            });
            c10.c(m22);
            this.f36533j.d(str, c10);
            zzj().G().c("EES program loaded for appId, activities", str, Integer.valueOf(m22.F().j()));
            Iterator it = m22.F().H().iterator();
            while (it.hasNext()) {
                zzj().G().b("EES program activity", ((com.google.android.gms.internal.measurement.L2) it.next()).G());
            }
        } catch (zzc unused) {
            zzj().C().b("Failed to load EES program. appId", str);
        }
    }

    static /* synthetic */ com.google.android.gms.internal.measurement.C F(C4873i3 c4873i3, String str) throws Throwable {
        c4873i3.q();
        AbstractC7901p.f(str);
        C4948s c4948sR0 = c4873i3.m().R0(str);
        if (c4948sR0 == null) {
            return null;
        }
        c4873i3.zzj().G().b("Populate EES config from database on cache miss. appId", str);
        c4873i3.C(str, c4873i3.x(str, c4948sR0.f36719a));
        return (com.google.android.gms.internal.measurement.C) c4873i3.f36533j.h().get(str);
    }

    private final void e0(String str) throws Throwable {
        q();
        j();
        AbstractC7901p.f(str);
        if (this.f36531h.get(str) == null) {
            C4948s c4948sR0 = m().R0(str);
            if (c4948sR0 != null) {
                C4300a2.a aVar = (C4300a2.a) x(str, c4948sR0.f36719a).v();
                B(str, aVar);
                this.f36527d.put(str, A((C4300a2) ((com.google.android.gms.internal.measurement.D4) aVar.p())));
                this.f36531h.put(str, (C4300a2) ((com.google.android.gms.internal.measurement.D4) aVar.p()));
                C(str, (C4300a2) ((com.google.android.gms.internal.measurement.D4) aVar.p()));
                this.f36535l.put(str, aVar.B());
                this.f36536m.put(str, c4948sR0.f36720b);
                this.f36537n.put(str, c4948sR0.f36721c);
                return;
            }
            this.f36527d.put(str, null);
            this.f36529f.put(str, null);
            this.f36528e.put(str, null);
            this.f36530g.put(str, null);
            this.f36531h.put(str, null);
            this.f36535l.put(str, null);
            this.f36536m.put(str, null);
            this.f36537n.put(str, null);
            this.f36532i.put(str, null);
        }
    }

    public static /* synthetic */ AbstractC4410n v(C4873i3 c4873i3) {
        return new com.google.android.gms.internal.measurement.A7(c4873i3.f36534k);
    }

    static /* synthetic */ com.google.android.gms.internal.measurement.C w(C4873i3 c4873i3, String str) throws Throwable {
        c4873i3.q();
        AbstractC7901p.f(str);
        if (!c4873i3.U(str)) {
            return null;
        }
        if (!c4873i3.f36531h.containsKey(str) || c4873i3.f36531h.get(str) == null) {
            c4873i3.e0(str);
        } else {
            c4873i3.C(str, (C4300a2) c4873i3.f36531h.get(str));
        }
        return (com.google.android.gms.internal.measurement.C) c4873i3.f36533j.h().get(str);
    }

    private final C4300a2 x(String str, byte[] bArr) {
        if (bArr == null) {
            return C4300a2.O();
        }
        try {
            C4300a2 c4300a2 = (C4300a2) ((com.google.android.gms.internal.measurement.D4) ((C4300a2.a) s7.C(C4300a2.M(), bArr)).p());
            zzj().G().c("Parsed config. version, gmp_app_id", c4300a2.Z() ? Long.valueOf(c4300a2.K()) : null, c4300a2.X() ? c4300a2.Q() : null);
            return c4300a2;
        } catch (zzkq e10) {
            zzj().H().c("Unable to merge remote config. appId", L2.r(str), e10);
            return C4300a2.O();
        } catch (RuntimeException e11) {
            zzj().H().c("Unable to merge remote config. appId", L2.r(str), e11);
            return C4300a2.O();
        }
    }

    private static C4839e4.a y(X1.e eVar) {
        int i10 = AbstractC4944r3.f36686b[eVar.ordinal()];
        if (i10 == 1) {
            return C4839e4.a.AD_STORAGE;
        }
        if (i10 == 2) {
            return C4839e4.a.ANALYTICS_STORAGE;
        }
        if (i10 == 3) {
            return C4839e4.a.AD_USER_DATA;
        }
        if (i10 != 4) {
            return null;
        }
        return C4839e4.a.AD_PERSONALIZATION;
    }

    protected final boolean D(String str, byte[] bArr, String str2, String str3) {
        q();
        j();
        AbstractC7901p.f(str);
        C4300a2.a aVar = (C4300a2.a) x(str, bArr).v();
        if (aVar == null) {
            return false;
        }
        B(str, aVar);
        C(str, (C4300a2) ((com.google.android.gms.internal.measurement.D4) aVar.p()));
        this.f36531h.put(str, (C4300a2) ((com.google.android.gms.internal.measurement.D4) aVar.p()));
        this.f36535l.put(str, aVar.B());
        this.f36536m.put(str, str2);
        this.f36537n.put(str, str3);
        this.f36527d.put(str, A((C4300a2) ((com.google.android.gms.internal.measurement.D4) aVar.p())));
        m().c0(str, new ArrayList(aVar.D()));
        try {
            aVar.z();
            bArr = ((C4300a2) ((com.google.android.gms.internal.measurement.D4) aVar.p())).i();
        } catch (RuntimeException e10) {
            zzj().H().c("Unable to serialize reduced-size config. Storing full config instead. appId", L2.r(str), e10);
        }
        C4933q c4933qM = m();
        AbstractC7901p.f(str);
        c4933qM.j();
        c4933qM.q();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        contentValues.put("e_tag", str3);
        try {
            if (c4933qM.x().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                c4933qM.zzj().C().b("Failed to update remote config (got 0). appId", L2.r(str));
            }
        } catch (SQLiteException e11) {
            c4933qM.zzj().C().c("Error storing remote config. appId", L2.r(str), e11);
        }
        if (a().p(N.f36105o1)) {
            aVar.A();
        }
        this.f36531h.put(str, (C4300a2) ((com.google.android.gms.internal.measurement.D4) aVar.p()));
        return true;
    }

    final int E(String str, String str2) throws Throwable {
        Integer num;
        j();
        e0(str);
        Map map = (Map) this.f36532i.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    final com.google.android.gms.internal.measurement.X1 G(String str) throws Throwable {
        j();
        e0(str);
        C4300a2 c4300a2J = J(str);
        if (c4300a2J == null || !c4300a2J.W()) {
            return null;
        }
        return c4300a2J.L();
    }

    final C4839e4.a H(String str, C4839e4.a aVar) {
        j();
        e0(str);
        com.google.android.gms.internal.measurement.X1 x1G = G(str);
        if (x1G == null) {
            return null;
        }
        for (X1.c cVar : x1G.J()) {
            if (aVar == y(cVar.H())) {
                return y(cVar.G());
            }
        }
        return null;
    }

    protected final C4300a2 J(String str) {
        q();
        j();
        AbstractC7901p.f(str);
        e0(str);
        return (C4300a2) this.f36531h.get(str);
    }

    final boolean K(String str, C4839e4.a aVar) throws Throwable {
        j();
        e0(str);
        com.google.android.gms.internal.measurement.X1 x1G = G(str);
        if (x1G == null) {
            return false;
        }
        Iterator it = x1G.I().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            X1.a aVar2 = (X1.a) it.next();
            if (aVar == y(aVar2.H())) {
                if (aVar2.G() == X1.d.GRANTED) {
                    return true;
                }
            }
        }
        return false;
    }

    final boolean L(String str, String str2) throws Throwable {
        Boolean bool;
        j();
        e0(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.f36530g.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    protected final String M(String str) {
        j();
        return (String) this.f36537n.get(str);
    }

    final boolean N(String str, String str2) throws Throwable {
        Boolean bool;
        j();
        e0(str);
        if (V(str) && x7.D0(str2)) {
            return true;
        }
        if (X(str) && x7.F0(str2)) {
            return true;
        }
        Map map = (Map) this.f36529f.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    protected final String O(String str) {
        j();
        return (String) this.f36536m.get(str);
    }

    final String P(String str) {
        j();
        e0(str);
        return (String) this.f36535l.get(str);
    }

    final Set Q(String str) {
        j();
        e0(str);
        return (Set) this.f36528e.get(str);
    }

    final SortedSet R(String str) {
        j();
        e0(str);
        TreeSet treeSet = new TreeSet();
        com.google.android.gms.internal.measurement.X1 x1G = G(str);
        if (x1G == null) {
            return treeSet;
        }
        Iterator it = x1G.H().iterator();
        while (it.hasNext()) {
            treeSet.add(((X1.f) it.next()).G());
        }
        return treeSet;
    }

    protected final void S(String str) {
        j();
        this.f36536m.put(str, null);
    }

    final void T(String str) {
        j();
        this.f36531h.remove(str);
    }

    public final boolean U(String str) {
        C4300a2 c4300a2;
        return (TextUtils.isEmpty(str) || (c4300a2 = (C4300a2) this.f36531h.get(str)) == null || c4300a2.j() == 0) ? false : true;
    }

    final boolean V(String str) {
        return "1".equals(d(str, "measurement.upload.blacklist_internal"));
    }

    final boolean W(String str) {
        j();
        e0(str);
        com.google.android.gms.internal.measurement.X1 x1G = G(str);
        return x1G == null || !x1G.M() || x1G.L();
    }

    final boolean X(String str) {
        return "1".equals(d(str, "measurement.upload.blacklist_public"));
    }

    final boolean Y(String str) throws Throwable {
        j();
        e0(str);
        return this.f36528e.get(str) != null && ((Set) this.f36528e.get(str)).contains("app_instance_id");
    }

    final boolean Z(String str) throws Throwable {
        j();
        e0(str);
        if (this.f36528e.get(str) != null) {
            return ((Set) this.f36528e.get(str)).contains("device_model") || ((Set) this.f36528e.get(str)).contains("device_info");
        }
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ C4893l a() {
        return super.a();
    }

    final boolean a0(String str) throws Throwable {
        j();
        e0(str);
        return this.f36528e.get(str) != null && ((Set) this.f36528e.get(str)).contains("enhanced_user_id");
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ F b() {
        return super.b();
    }

    final boolean b0(String str) throws Throwable {
        j();
        e0(str);
        return this.f36528e.get(str) != null && ((Set) this.f36528e.get(str)).contains("google_signals");
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ D2 c() {
        return super.c();
    }

    final boolean c0(String str) throws Throwable {
        j();
        e0(str);
        if (this.f36528e.get(str) != null) {
            return ((Set) this.f36528e.get(str)).contains("os_version") || ((Set) this.f36528e.get(str)).contains("device_info");
        }
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4909n
    public final String d(String str, String str2) throws Throwable {
        j();
        e0(str);
        Map map = (Map) this.f36527d.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    final boolean d0(String str) throws Throwable {
        j();
        e0(str);
        return this.f36528e.get(str) != null && ((Set) this.f36528e.get(str)).contains("user_id");
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

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ void h() {
        super.h();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ void j() {
        super.j();
    }

    @Override // com.google.android.gms.measurement.internal.P6
    public final /* bridge */ /* synthetic */ s7 k() {
        return super.k();
    }

    @Override // com.google.android.gms.measurement.internal.P6
    public final /* bridge */ /* synthetic */ C7 l() {
        return super.l();
    }

    @Override // com.google.android.gms.measurement.internal.P6
    public final /* bridge */ /* synthetic */ C4933q m() {
        return super.m();
    }

    @Override // com.google.android.gms.measurement.internal.P6
    public final /* bridge */ /* synthetic */ C4873i3 n() {
        return super.n();
    }

    @Override // com.google.android.gms.measurement.internal.P6
    public final /* bridge */ /* synthetic */ C4924o6 o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.P6
    public final /* bridge */ /* synthetic */ X6 p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.U6
    protected final boolean t() {
        return false;
    }

    final long u(String str) throws Throwable {
        String strD = d(str, "measurement.account.time_zone_offset_minutes");
        if (TextUtils.isEmpty(strD)) {
            return 0L;
        }
        try {
            return Long.parseLong(strD);
        } catch (NumberFormatException e10) {
            zzj().H().c("Unable to parse timezone offset. appId", L2.r(str), e10);
            return 0L;
        }
    }

    final EnumC4866h4 z(String str, C4839e4.a aVar) {
        j();
        e0(str);
        com.google.android.gms.internal.measurement.X1 x1G = G(str);
        if (x1G == null) {
            return EnumC4866h4.UNINITIALIZED;
        }
        for (X1.a aVar2 : x1G.K()) {
            if (y(aVar2.H()) == aVar) {
                int i10 = AbstractC4944r3.f36687c[aVar2.G().ordinal()];
                return i10 != 1 ? i10 != 2 ? EnumC4866h4.UNINITIALIZED : EnumC4866h4.GRANTED : EnumC4866h4.DENIED;
            }
        }
        return EnumC4866h4.UNINITIALIZED;
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
