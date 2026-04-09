package ec;

import android.os.Bundle;
import android.os.SystemClock;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b3 extends f0 {

    /* renamed from: d, reason: collision with root package name */
    public volatile y2 f22587d;

    /* renamed from: e, reason: collision with root package name */
    public volatile y2 f22588e;

    /* renamed from: f, reason: collision with root package name */
    public y2 f22589f;
    public final ConcurrentHashMap g;

    /* renamed from: h, reason: collision with root package name */
    public com.google.android.gms.internal.measurement.v0 f22590h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f22591i;
    public volatile y2 j;

    /* renamed from: k, reason: collision with root package name */
    public y2 f22592k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f22593l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f22594m;

    public b3(o1 o1Var) {
        super(o1Var);
        this.f22594m = new Object();
        this.g = new ConcurrentHashMap();
    }

    @Override // ec.f0
    public final boolean E() {
        return false;
    }

    public final void F(y2 y2Var, boolean z3, long j) {
        o1 o1Var = (o1) this.f218b;
        w wVar = o1Var.f22960n;
        o1.j(wVar);
        o1Var.f22957k.getClass();
        wVar.E(SystemClock.elapsedRealtime());
        boolean z10 = y2Var != null && y2Var.f23207d;
        r3 r3Var = o1Var.f22955h;
        o1.l(r3Var);
        if (!r3Var.g.b(j, z10, z3) || y2Var == null) {
            return;
        }
        y2Var.f23207d = false;
    }

    public final y2 G(com.google.android.gms.internal.measurement.v0 v0Var) {
        pb.y.h(v0Var);
        Integer numValueOf = Integer.valueOf(v0Var.f19965a);
        ConcurrentHashMap concurrentHashMap = this.g;
        y2 y2Var = (y2) concurrentHashMap.get(numValueOf);
        if (y2Var == null) {
            String strI = I(v0Var.f19966b);
            l4 l4Var = ((o1) this.f218b).f22956i;
            o1.k(l4Var);
            y2 y2Var2 = new y2(null, strI, l4Var.y0());
            concurrentHashMap.put(numValueOf, y2Var2);
            y2Var = y2Var2;
        }
        return this.j != null ? this.j : y2Var;
    }

    public final y2 H(boolean z3) {
        C();
        B();
        if (!z3) {
            return this.f22589f;
        }
        y2 y2Var = this.f22589f;
        return y2Var != null ? y2Var : this.f22592k;
    }

    public final String I(String str) {
        if (str == null) {
            return "Activity";
        }
        String[] strArrSplit = str.split("\\.");
        int length = strArrSplit.length;
        String str2 = length > 0 ? strArrSplit[length - 1] : "";
        o1 o1Var = (o1) this.f218b;
        int length2 = str2.length();
        o1Var.f22952d.getClass();
        if (length2 <= 500) {
            return str2;
        }
        o1Var.f22952d.getClass();
        return str2.substring(0, 500);
    }

    public final void J(com.google.android.gms.internal.measurement.v0 v0Var, Bundle bundle) {
        Bundle bundle2;
        if (!((o1) this.f218b).f22952d.P() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.g.put(Integer.valueOf(v0Var.f19965a), new y2(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong(FacebookMediationAdapter.KEY_ID)));
    }

    public final void K(String str, y2 y2Var, boolean z3) {
        y2 y2Var2;
        y2 y2Var3 = this.f22587d == null ? this.f22588e : this.f22587d;
        if (y2Var.f23205b == null) {
            y2Var2 = new y2(y2Var.f23204a, str != null ? I(str) : null, y2Var.f23206c, y2Var.f23208e, y2Var.f23209f);
        } else {
            y2Var2 = y2Var;
        }
        this.f22588e = this.f22587d;
        this.f22587d = y2Var2;
        o1 o1Var = (o1) this.f218b;
        o1Var.f22957k.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        l1 l1Var = o1Var.g;
        o1.m(l1Var);
        l1Var.K(new z2(this, y2Var2, y2Var3, jElapsedRealtime, z3));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void L(ec.y2 r18, ec.y2 r19, long r20, boolean r22, android.os.Bundle r23) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ec.b3.L(ec.y2, ec.y2, long, boolean, android.os.Bundle):void");
    }
}
