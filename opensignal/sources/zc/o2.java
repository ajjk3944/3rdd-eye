package zc;

import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.internal.measurement.zzdf;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class o2 extends w {
    public final ConcurrentHashMap B;
    public zzdf D;
    public volatile boolean E;
    public volatile l2 F;
    public l2 G;
    public boolean H;
    public final Object I;

    /* renamed from: r, reason: collision with root package name */
    public volatile l2 f27055r;

    /* renamed from: x, reason: collision with root package name */
    public volatile l2 f27056x;

    /* renamed from: y, reason: collision with root package name */
    public l2 f27057y;

    public o2(c1 c1Var) {
        super(c1Var);
        this.I = new Object();
        this.B = new ConcurrentHashMap();
    }

    public final void A1(zzdf zzdfVar, Bundle bundle) {
        Bundle bundle2;
        if (!((c1) this.f1504d).f26887r.G1() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.B.put(Integer.valueOf(zzdfVar.f5295a), new l2(bundle2.getLong("id"), bundle2.getString("name"), bundle2.getString("referrer_name")));
    }

    public final void B1(String str, l2 l2Var, boolean z10) {
        l2 l2Var2;
        l2 l2Var3 = this.f27055r == null ? this.f27056x : this.f27055r;
        if (l2Var.f26994b == null) {
            l2Var2 = new l2(l2Var.f26993a, str != null ? z1(str) : null, l2Var.f26995c, l2Var.f26997e, l2Var.f26998f);
        } else {
            l2Var2 = l2Var;
        }
        this.f27056x = this.f27055r;
        this.f27055r = l2Var2;
        c1 c1Var = (c1) this.f1504d;
        c1Var.G.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        a1 a1Var = c1Var.B;
        c1.g(a1Var);
        a1Var.B1(new m2(this, l2Var2, l2Var3, jElapsedRealtime, z10));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void C1(zc.l2 r18, zc.l2 r19, long r20, boolean r22, android.os.Bundle r23) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zc.o2.C1(zc.l2, zc.l2, long, boolean, android.os.Bundle):void");
    }

    @Override // zc.w
    public final boolean v1() {
        return false;
    }

    public final void w1(l2 l2Var, boolean z10, long j) {
        c1 c1Var = (c1) this.f1504d;
        r rVar = c1Var.J;
        c1.d(rVar);
        c1Var.G.getClass();
        rVar.v1(SystemClock.elapsedRealtime());
        boolean z11 = l2Var != null && l2Var.f26996d;
        e3 e3Var = c1Var.D;
        c1.f(e3Var);
        if (!e3Var.B.a(j, z11, z10) || l2Var == null) {
            return;
        }
        l2Var.f26996d = false;
    }

    public final l2 x1(zzdf zzdfVar) {
        cc.s.h(zzdfVar);
        Integer numValueOf = Integer.valueOf(zzdfVar.f5295a);
        ConcurrentHashMap concurrentHashMap = this.B;
        l2 l2Var = (l2) concurrentHashMap.get(numValueOf);
        if (l2Var == null) {
            String strZ1 = z1(zzdfVar.f5296d);
            s3 s3Var = ((c1) this.f1504d).E;
            c1.e(s3Var);
            l2 l2Var2 = new l2(s3Var.o2(), null, strZ1);
            concurrentHashMap.put(numValueOf, l2Var2);
            l2Var = l2Var2;
        }
        return this.F != null ? this.F : l2Var;
    }

    public final l2 y1(boolean z10) {
        t1();
        s1();
        if (!z10) {
            return this.f27057y;
        }
        l2 l2Var = this.f27057y;
        return l2Var != null ? l2Var : this.G;
    }

    public final String z1(String str) {
        if (str == null) {
            return "Activity";
        }
        String[] strArrSplit = str.split("\\.");
        int length = strArrSplit.length;
        String str2 = length > 0 ? strArrSplit[length - 1] : "";
        c1 c1Var = (c1) this.f1504d;
        int length2 = str2.length();
        c1Var.f26887r.getClass();
        if (length2 <= 500) {
            return str2;
        }
        c1Var.f26887r.getClass();
        return str2.substring(0, 500);
    }
}
