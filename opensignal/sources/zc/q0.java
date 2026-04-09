package zc;

import android.content.SharedPreferences;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public long f27103a;

    /* renamed from: b, reason: collision with root package name */
    public Object f27104b;

    /* renamed from: c, reason: collision with root package name */
    public Serializable f27105c;

    /* renamed from: d, reason: collision with root package name */
    public Serializable f27106d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k1 f27107e;

    public /* synthetic */ q0(r0 r0Var, long j) {
        this.f27107e = r0Var;
        cc.s.e("health_monitor");
        cc.s.b(j > 0);
        this.f27104b = "health_monitor:start";
        this.f27105c = "health_monitor:count";
        this.f27106d = "health_monitor:value";
        this.f27103a = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(long r11, com.google.android.gms.internal.measurement.z2 r13) {
        /*
            r10 = this;
            java.io.Serializable r0 = r10.f27106d
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 != 0) goto Ld
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.f27106d = r0
        Ld:
            java.io.Serializable r0 = r10.f27105c
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 != 0) goto L1a
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.f27105c = r0
        L1a:
            java.io.Serializable r0 = r10.f27106d
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 != 0) goto L45
            java.io.Serializable r0 = r10.f27106d
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.lang.Object r0 = r0.get(r1)
            com.google.android.gms.internal.measurement.z2 r0 = (com.google.android.gms.internal.measurement.z2) r0
            long r2 = r0.u()
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r4
            r6 = 60
            long r2 = r2 / r6
            long r2 = r2 / r6
            long r8 = r13.u()
            long r8 = r8 / r4
            long r8 = r8 / r6
            long r8 = r8 / r6
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 != 0) goto Lcc
        L45:
            long r2 = r10.f27103a
            int r0 = r13.k()
            long r4 = (long) r0
            long r2 = r2 + r4
            zc.k1 r0 = r10.f27107e
            zc.p3 r0 = (zc.p3) r0
            zc.f r4 = r0.b0()
            zc.t r5 = zc.u.f27172d1
            r6 = 0
            boolean r4 = r4.C1(r6, r5)
            if (r4 == 0) goto L81
            java.io.Serializable r4 = r10.f27106d
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L9a
            r0.b0()
            zc.t r4 = zc.u.j
            java.lang.Object r4 = r4.a(r6)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            int r4 = java.lang.Math.max(r1, r4)
            long r4 = (long) r4
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 >= 0) goto Lcc
            goto L9a
        L81:
            r0.b0()
            zc.t r4 = zc.u.j
            java.lang.Object r4 = r4.a(r6)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            int r4 = java.lang.Math.max(r1, r4)
            long r4 = (long) r4
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 < 0) goto L9a
            goto Lcc
        L9a:
            r10.f27103a = r2
            java.io.Serializable r2 = r10.f27106d
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            r2.add(r13)
            java.io.Serializable r13 = r10.f27105c
            java.util.ArrayList r13 = (java.util.ArrayList) r13
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r13.add(r11)
            java.io.Serializable r11 = r10.f27106d
            java.util.ArrayList r11 = (java.util.ArrayList) r11
            int r11 = r11.size()
            r0.b0()
            zc.t r12 = zc.u.k
            java.lang.Object r12 = r12.a(r6)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            r13 = 1
            int r12 = java.lang.Math.max(r13, r12)
            if (r11 < r12) goto Lcd
        Lcc:
            return r1
        Lcd:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: zc.q0.a(long, com.google.android.gms.internal.measurement.z2):boolean");
    }

    public void b() {
        r0 r0Var = (r0) this.f27107e;
        r0Var.s1();
        ((c1) r0Var.f1504d).G.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor editorEdit = r0Var.w1().edit();
        editorEdit.remove((String) this.f27105c);
        editorEdit.remove((String) this.f27106d);
        editorEdit.putLong((String) this.f27104b, jCurrentTimeMillis);
        editorEdit.apply();
    }

    public /* synthetic */ q0(p3 p3Var) {
        this.f27107e = p3Var;
    }
}
