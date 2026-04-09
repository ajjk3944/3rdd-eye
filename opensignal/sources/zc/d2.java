package zc;

import android.app.Application;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.q8;
import com.google.android.gms.measurement.internal.zzoh;
import com.google.android.gms.measurement.internal.zzr;
import java.lang.reflect.InvocationTargetException;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class d2 extends w {
    public boolean B;
    public final AtomicReference D;
    public final Object E;
    public boolean F;
    public int G;
    public t1 H;
    public t1 I;
    public PriorityQueue J;
    public boolean K;
    public o1 L;
    public final AtomicLong M;
    public long N;
    public final y9.u O;
    public boolean P;
    public t1 Q;
    public c2 R;
    public t1 S;
    public final y9.u T;

    /* renamed from: r, reason: collision with root package name */
    public kg.j f26906r;

    /* renamed from: x, reason: collision with root package name */
    public q3.a f26907x;

    /* renamed from: y, reason: collision with root package name */
    public final CopyOnWriteArraySet f26908y;

    public d2(c1 c1Var) {
        super(c1Var);
        this.f26908y = new CopyOnWriteArraySet();
        this.E = new Object();
        this.F = false;
        this.G = 1;
        this.P = true;
        this.T = new y9.u(7, this);
        this.D = new AtomicReference();
        this.L = o1.f27052c;
        this.N = -1L;
        this.M = new AtomicLong(0L);
        this.O = new y9.u(9, c1Var);
    }

    public final void A1(long j, Bundle bundle, String str, String str2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        s1();
        boolean z10 = true;
        if (this.f26907x != null && !s3.Q1(str2)) {
            z10 = false;
        }
        B1(str, str2, j, bundle, true, z10, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:209:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void B1(java.lang.String r29, java.lang.String r30, long r31, android.os.Bundle r33, boolean r34, boolean r35, boolean r36) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 1267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zc.d2.B1(java.lang.String, java.lang.String, long, android.os.Bundle, boolean, boolean, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void C1(java.lang.String r12, java.lang.String r13, java.lang.Object r14, boolean r15, long r16) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zc.d2.C1(java.lang.String, java.lang.String, java.lang.Object, boolean, long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void D1(long r20, java.lang.Object r22, java.lang.String r23, java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zc.d2.D1(long, java.lang.Object, java.lang.String, java.lang.String):void");
    }

    public final void E1() {
        s1();
        t1();
        c1 c1Var = (c1) this.f1504d;
        if (c1Var.c()) {
            f fVar = c1Var.f26887r;
            ((c1) fVar.f1504d).getClass();
            Boolean boolE1 = fVar.E1("google_analytics_deferred_deep_link_enabled");
            if (boolE1 != null && boolE1.booleanValue()) {
                j0 j0Var = c1Var.f26889y;
                c1.g(j0Var);
                j0Var.J.b("Deferred Deep Link feature enabled.");
                a1 a1Var = c1Var.B;
                c1.g(a1Var);
                a1Var.B1(new s1(this, 2));
            }
            x2 x2VarJ = c1Var.j();
            x2VarJ.s1();
            x2VarJ.t1();
            zzr zzrVarI1 = x2VarJ.I1(true);
            x2VarJ.E1();
            c1 c1Var2 = (c1) x2VarJ.f1504d;
            c1Var2.f26887r.C1(null, u.f27166b1);
            c1Var2.i().z1(3, new byte[0]);
            x2VarJ.G1(new s2(x2VarJ, zzrVarI1, 1));
            this.P = false;
            r0 r0Var = c1Var.f26888x;
            c1.e(r0Var);
            r0Var.s1();
            String string = r0Var.w1().getString("previous_os_version", null);
            ((c1) r0Var.f1504d).k().u1();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor editorEdit = r0Var.w1().edit();
                editorEdit.putString("previous_os_version", str);
                editorEdit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            c1Var.k().u1();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            z1("auto", "_ou", bundle);
        }
    }

    public final void F1(Bundle bundle, long j) {
        c1 c1Var = (c1) this.f1504d;
        cc.s.h(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            j0 j0Var = c1Var.f26889y;
            c1.g(j0Var);
            j0Var.F.b("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        p1.e(bundle2, "app_id", String.class, null);
        p1.e(bundle2, "origin", String.class, null);
        p1.e(bundle2, "name", String.class, null);
        p1.e(bundle2, "value", Object.class, null);
        p1.e(bundle2, "trigger_event_name", String.class, null);
        p1.e(bundle2, "trigger_timeout", Long.class, 0L);
        p1.e(bundle2, "timed_out_event_name", String.class, null);
        p1.e(bundle2, "timed_out_event_params", Bundle.class, null);
        p1.e(bundle2, "triggered_event_name", String.class, null);
        p1.e(bundle2, "triggered_event_params", Bundle.class, null);
        p1.e(bundle2, "time_to_live", Long.class, 0L);
        p1.e(bundle2, "expired_event_name", String.class, null);
        p1.e(bundle2, "expired_event_params", Bundle.class, null);
        cc.s.e(bundle2.getString("name"));
        cc.s.e(bundle2.getString("origin"));
        cc.s.h(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        s3 s3Var = c1Var.E;
        f0 f0Var = c1Var.F;
        j0 j0Var2 = c1Var.f26889y;
        c1.e(s3Var);
        if (s3Var.x2(string) != 0) {
            c1.g(j0Var2);
            j0Var2.B.c(f0Var.c(string), "Invalid conditional user property name");
            return;
        }
        c1.e(s3Var);
        if (s3Var.F1(obj, string) != 0) {
            c1.g(j0Var2);
            j0Var2.B.d(f0Var.c(string), obj, "Invalid conditional user property value");
            return;
        }
        Object objG1 = s3Var.G1(obj, string);
        if (objG1 == null) {
            c1.g(j0Var2);
            j0Var2.B.d(f0Var.c(string), obj, "Unable to normalize conditional user property value");
            return;
        }
        p1.c(bundle2, objG1);
        long j7 = bundle2.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name")) && (j7 > 15552000000L || j7 < 1)) {
            c1.g(j0Var2);
            j0Var2.B.d(f0Var.c(string), Long.valueOf(j7), "Invalid conditional user property timeout");
            return;
        }
        long j10 = bundle2.getLong("time_to_live");
        if (j10 > 15552000000L || j10 < 1) {
            c1.g(j0Var2);
            j0Var2.B.d(f0Var.c(string), Long.valueOf(j10), "Invalid conditional user property time to live");
        } else {
            a1 a1Var = c1Var.B;
            c1.g(a1Var);
            a1Var.B1(new y1(this, bundle2, 0));
        }
    }

    public final void G1(String str, String str2, Bundle bundle) {
        c1 c1Var = (c1) this.f1504d;
        c1Var.G.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        cc.s.e(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", jCurrentTimeMillis);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        a1 a1Var = c1Var.B;
        c1.g(a1Var);
        a1Var.B1(new y1(this, bundle2, 1));
    }

    public final String H1() {
        c1 c1Var = (c1) this.f1504d;
        try {
            return p1.b(c1Var.f26884a, c1Var.L);
        } catch (IllegalStateException e4) {
            j0 j0Var = c1Var.f26889y;
            c1.g(j0Var);
            j0Var.B.c(e4, "getGoogleAppId failed with exception");
            return null;
        }
    }

    public final void I1(o1 o1Var, long j, boolean z10) {
        int i10 = o1Var.f27054b;
        s1();
        t1();
        c1 c1Var = (c1) this.f1504d;
        r0 r0Var = c1Var.f26888x;
        j0 j0Var = c1Var.f26889y;
        c1.e(r0Var);
        o1 o1VarZ1 = r0Var.z1();
        if (j <= this.N && o1.l(o1VarZ1.f27054b, i10)) {
            c1.g(j0Var);
            j0Var.I.c(o1Var, "Dropped out-of-date consent setting, proposed settings");
            return;
        }
        r0 r0Var2 = c1Var.f26888x;
        c1.e(r0Var2);
        r0Var2.s1();
        if (!o1.l(i10, r0Var2.w1().getInt("consent_source", 100))) {
            c1.g(j0Var);
            j0Var.I.c(Integer.valueOf(i10), "Lower precedence consent source ignored, proposed source");
            return;
        }
        SharedPreferences.Editor editorEdit = r0Var2.w1().edit();
        editorEdit.putString("consent_settings", o1Var.g());
        editorEdit.putInt("consent_source", i10);
        editorEdit.apply();
        c1.g(j0Var);
        j0Var.K.c(o1Var, "Setting storage consent(FE)");
        this.N = j;
        if (c1Var.j().C1()) {
            x2 x2VarJ = c1Var.j();
            x2VarJ.s1();
            x2VarJ.t1();
            x2VarJ.G1(new v2(x2VarJ, 2));
        } else {
            x2 x2VarJ2 = c1Var.j();
            x2VarJ2.s1();
            x2VarJ2.t1();
            if (x2VarJ2.B1()) {
                x2VarJ2.G1(new s2(x2VarJ2, x2VarJ2.I1(false)));
            }
        }
        if (z10) {
            c1Var.j().w1(new AtomicReference());
        }
    }

    public final void J1(Boolean bool, boolean z10) {
        s1();
        t1();
        c1 c1Var = (c1) this.f1504d;
        j0 j0Var = c1Var.f26889y;
        c1.g(j0Var);
        j0Var.J.c(bool, "Setting app measurement enabled (FE)");
        r0 r0Var = c1Var.f26888x;
        c1.e(r0Var);
        r0Var.s1();
        SharedPreferences.Editor editorEdit = r0Var.w1().edit();
        if (bool != null) {
            editorEdit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            editorEdit.remove("measurement_enabled");
        }
        editorEdit.apply();
        if (z10) {
            r0Var.s1();
            SharedPreferences.Editor editorEdit2 = r0Var.w1().edit();
            if (bool != null) {
                editorEdit2.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                editorEdit2.remove("measurement_enabled_from_api");
            }
            editorEdit2.apply();
        }
        a1 a1Var = c1Var.B;
        c1.g(a1Var);
        a1Var.s1();
        if (c1Var.V || !(bool == null || bool.booleanValue())) {
            K1();
        }
    }

    public final void K1() {
        s1();
        c1 c1Var = (c1) this.f1504d;
        r0 r0Var = c1Var.f26888x;
        j0 j0Var = c1Var.f26889y;
        gc.a aVar = c1Var.G;
        c1.e(r0Var);
        String strN = r0Var.J.n();
        if (strN != null) {
            if ("unset".equals(strN)) {
                aVar.getClass();
                D1(System.currentTimeMillis(), null, "app", "_npa");
            } else {
                Long lValueOf = Long.valueOf(true != "true".equals(strN) ? 0L : 1L);
                aVar.getClass();
                D1(System.currentTimeMillis(), lValueOf, "app", "_npa");
            }
        }
        if (!c1Var.a() || !this.P) {
            c1.g(j0Var);
            j0Var.J.b("Updating Scion state (FE)");
            x2 x2VarJ = c1Var.j();
            x2VarJ.s1();
            x2VarJ.t1();
            x2VarJ.G1(new s2(x2VarJ, x2VarJ.I1(true), 3));
            return;
        }
        c1.g(j0Var);
        j0Var.J.b("Recording app launch after enabling measurement for the first time (FE)");
        E1();
        e3 e3Var = c1Var.D;
        c1.f(e3Var);
        e3Var.f26919y.c();
        a1 a1Var = c1Var.B;
        c1.g(a1Var);
        a1Var.B1(new s1(this, 1));
    }

    public final void L1() {
        c1 c1Var = (c1) this.f1504d;
        if (!(c1Var.f26884a.getApplicationContext() instanceof Application) || this.f26906r == null) {
            return;
        }
        ((Application) c1Var.f26884a.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f26906r);
    }

    public final void M1(Bundle bundle, int i10, long j) {
        Object obj;
        String string;
        c1 c1Var = (c1) this.f1504d;
        t1();
        o1 o1Var = o1.f27052c;
        n1[] n1VarArrZzb = m1.STORAGE.zzb();
        int length = n1VarArrZzb.length;
        int i11 = 0;
        while (true) {
            obj = null;
            if (i11 >= length) {
                break;
            }
            String str = n1VarArrZzb[i11].zze;
            if (bundle.containsKey(str) && (string = bundle.getString(str)) != null) {
                if (string.equals("granted")) {
                    obj = Boolean.TRUE;
                } else if (string.equals("denied")) {
                    obj = Boolean.FALSE;
                }
                if (obj == null) {
                    obj = string;
                    break;
                }
            }
            i11++;
        }
        if (obj != null) {
            j0 j0Var = c1Var.f26889y;
            c1.g(j0Var);
            j0Var.H.c(obj, "Ignoring invalid consent setting");
            j0 j0Var2 = c1Var.f26889y;
            c1.g(j0Var2);
            j0Var2.H.b("Valid consent values are 'granted', 'denied'");
        }
        a1 a1Var = c1Var.B;
        c1.g(a1Var);
        boolean zY1 = a1Var.y1();
        o1 o1VarB = o1.b(i10, bundle);
        Iterator it = o1VarB.f27053a.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (((l1) it.next()) != l1.UNINITIALIZED) {
                O1(o1VarB, zY1);
                break;
            }
        }
        n nVarC = n.c(i10, bundle);
        Iterator it2 = nVarC.f27018e.values().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            } else if (((l1) it2.next()) != l1.UNINITIALIZED) {
                N1(nVarC, zY1);
                break;
            }
        }
        Boolean boolD = n.d(bundle);
        if (boolD != null) {
            String str2 = i10 == -30 ? "tcf" : "app";
            if (zY1) {
                D1(j, boolD.toString(), str2, "allow_personalized_ads");
            } else {
                C1(str2, "allow_personalized_ads", boolD.toString(), false, j);
            }
        }
    }

    public final void N1(n nVar, boolean z10) {
        z1 z1Var = new z1(this, 2, nVar);
        if (z10) {
            s1();
            z1Var.run();
        } else {
            a1 a1Var = ((c1) this.f1504d).B;
            c1.g(a1Var);
            a1Var.B1(z1Var);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:70:0x0116
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1178)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public final void O1(zc.o1 r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zc.d2.O1(zc.o1, boolean):void");
    }

    public final void P1() {
        q8.a();
        c1 c1Var = (c1) this.f1504d;
        f fVar = c1Var.f26887r;
        a1 a1Var = c1Var.B;
        j0 j0Var = c1Var.f26889y;
        if (fVar.C1(null, u.Q0)) {
            c1.g(a1Var);
            if (a1Var.y1()) {
                c1.g(j0Var);
                j0Var.B.b("Cannot get trigger URIs from analytics worker thread");
                return;
            }
            if (d.d()) {
                c1.g(j0Var);
                j0Var.B.b("Cannot get trigger URIs from main thread");
                return;
            }
            t1();
            c1.g(j0Var);
            j0Var.K.b("Getting trigger URIs (FE)");
            AtomicReference atomicReference = new AtomicReference();
            c1.g(a1Var);
            a1Var.C1(atomicReference, 10000L, "get trigger URIs", new x1(this, atomicReference, 5, false));
            List list = (List) atomicReference.get();
            if (list == null) {
                c1.g(j0Var);
                j0Var.E.b("Timed out waiting for get trigger URIs");
            } else {
                c1.g(a1Var);
                a1Var.B1(new z1(this, 4, list));
            }
        }
    }

    public final PriorityQueue Q1() {
        if (this.J == null) {
            this.J = new PriorityQueue(Comparator.comparing(b2.f26874a, sm.i.f22133d));
        }
        return this.J;
    }

    public final void R1() {
        zzoh zzohVar;
        s1();
        this.K = false;
        if (Q1().isEmpty() || this.F || (zzohVar = (zzoh) Q1().poll()) == null) {
            return;
        }
        c1 c1Var = (c1) this.f1504d;
        s3 s3Var = c1Var.E;
        c1.e(s3Var);
        d7.a aVarM1 = s3Var.M1();
        if (aVarM1 != null) {
            this.F = true;
            j0 j0Var = c1Var.f26889y;
            c1.g(j0Var);
            su.b bVar = j0Var.K;
            String str = zzohVar.f5409a;
            bVar.c(str, "Registering trigger URI");
            re.b bVarE = aVarM1.e(Uri.parse(str));
            if (bVarE != null) {
                bVarE.a(new re.a(bVarE, 0, new q3.a(27, this, zzohVar, false)), new dd.p(3, this));
            } else {
                this.F = false;
                Q1().add(zzohVar);
            }
        }
    }

    @Override // zc.w
    public final boolean v1() {
        return false;
    }

    public final void w1(o1 o1Var) {
        s1();
        boolean z10 = (o1Var.i(n1.ANALYTICS_STORAGE) && o1Var.i(n1.AD_STORAGE)) || ((c1) this.f1504d).j().B1();
        c1 c1Var = (c1) this.f1504d;
        a1 a1Var = c1Var.B;
        c1.g(a1Var);
        a1Var.s1();
        if (z10 != c1Var.V) {
            a1 a1Var2 = c1Var.B;
            c1.g(a1Var2);
            a1Var2.s1();
            c1Var.V = z10;
            r0 r0Var = ((c1) this.f1504d).f26888x;
            c1.e(r0Var);
            r0Var.s1();
            Boolean boolValueOf = r0Var.w1().contains("measurement_enabled_from_api") ? Boolean.valueOf(r0Var.w1().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z10 || boolValueOf == null || boolValueOf.booleanValue()) {
                J1(Boolean.valueOf(z10), false);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0055, code lost:
    
        if (r4 > 500) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008c, code lost:
    
        if (r6 > 500) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void x1(java.lang.String r13, java.lang.String r14, android.os.Bundle r15, boolean r16, boolean r17, long r18) {
        /*
            Method dump skipped, instructions count: 477
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zc.d2.x1(java.lang.String, java.lang.String, android.os.Bundle, boolean, boolean, long):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public final void y1() {
        /*
            Method dump skipped, instructions count: 1460
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zc.d2.y1():void");
    }

    public final void z1(String str, String str2, Bundle bundle) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        s1();
        ((c1) this.f1504d).G.getClass();
        A1(System.currentTimeMillis(), bundle, str, str2);
    }
}
