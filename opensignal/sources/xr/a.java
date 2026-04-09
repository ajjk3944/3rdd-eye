package xr;

import ak.t0;
import ak.w0;
import android.os.Bundle;
import android.os.Handler;
import android.telephony.ServiceState;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.json.JSONObject;
import zc.e3;

/* loaded from: classes.dex */
public final class a implements dd.a, zt.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25481a;

    /* renamed from: d, reason: collision with root package name */
    public Object f25482d;

    /* renamed from: g, reason: collision with root package name */
    public final Object f25483g;

    public /* synthetic */ a(Object obj, int i10, Object obj2) {
        this.f25481a = i10;
        this.f25482d = obj;
        this.f25483g = obj2;
    }

    public void b(z9.b bVar) {
        synchronized (bVar) {
        }
        Handler handler = (Handler) this.f25482d;
        if (handler != null) {
            handler.post(new y9.i(this, bVar, 1));
        }
    }

    public zh.b c(ServiceState serviceState) {
        br.l.e(serviceState, "serviceState");
        a8.f fVar = (a8.f) this.f25483g;
        fVar.C(serviceState, ((ak.g) ((q3.a) this.f25482d).f20680g).f529f.f449a.f472a);
        int state = serviceState.getState();
        Integer num = fVar != null ? (Integer) fVar.f201g : null;
        Integer num2 = fVar != null ? (Integer) fVar.f199e : null;
        Integer num3 = fVar != null ? (Integer) fVar.f202h : null;
        zh.b bVar = new zh.b();
        bVar.f27409a = state;
        bVar.f27410b = num;
        bVar.f27411c = num2;
        bVar.f27412d = num3;
        return bVar;
    }

    public ak.p d(String str) {
        br.l.e(str, "input");
        if (tt.l.D0(str)) {
            return new ak.h(new IllegalArgumentException("Cannot construct config from blank string"));
        }
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONObject("content");
            JSONObject jSONObject2 = jSONObject.getJSONObject("config");
            ak.c0 c0VarA = ak.p.a();
            w0 w0Var = new w0(new t0(), ak.n.f619a, true);
            ak.c0 c0VarB = ((zj.b) this.f25482d).b(jSONObject2, c0VarA, true);
            w0 w0VarD = ((zj.c) this.f25483g).d(jSONObject2, w0Var, c0VarB, new hk.b(0L, 0L, hk.c.f10801a));
            String string = jSONObject.getString("lastModifiedAt");
            br.l.d(string, "getString(...)");
            int i10 = jSONObject.getInt("metaId");
            int i11 = jSONObject.getInt("config_id");
            String string2 = jSONObject.getString("config_hash");
            br.l.d(string2, "getString(...)");
            String strOptString = jSONObject.optString("cohort_id");
            br.l.d(strOptString, "optString(...)");
            return new ak.i(new ak.g(string, i10, i11, string2, strOptString, c0VarB, w0VarD));
        } catch (Exception e4) {
            return new ak.h(e4);
        }
    }

    @Override // dd.a
    public Object j(dd.r rVar) {
        Bundle bundle;
        yb.a aVar = (yb.a) this.f25482d;
        Bundle bundle2 = (Bundle) this.f25483g;
        aVar.getClass();
        return (rVar.j() && (bundle = (Bundle) rVar.h()) != null && bundle.containsKey("google.messenger")) ? aVar.a(bundle2).k(yb.f.f26219g, yb.c.f26215r) : rVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v3, types: [ar.n, rq.j] */
    @Override // zt.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object l(zt.g r7, pq.c r8) {
        /*
            r6 = this;
            int r0 = r6.f25481a
            switch(r0) {
                case 9: goto L23;
                default: goto L5;
            }
        L5:
            br.t r0 = new br.t
            r0.<init>()
            java.lang.Object r1 = r6.f25482d
            zt.f r1 = (zt.f) r1
            au.z r2 = new au.z
            java.lang.Object r3 = r6.f25483g
            rq.j r3 = (rq.j) r3
            r2.<init>(r0, r7, r3)
            java.lang.Object r7 = r1.l(r2, r8)
            qq.a r8 = qq.a.COROUTINE_SUSPENDED
            if (r7 != r8) goto L20
            goto L22
        L20:
            lq.b0 r7 = lq.b0.f15562a
        L22:
            return r7
        L23:
            boolean r0 = r8 instanceof zt.l
            if (r0 == 0) goto L36
            r0 = r8
            zt.l r0 = (zt.l) r0
            int r1 = r0.f27565x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L36
            int r1 = r1 - r2
            r0.f27565x = r1
            goto L3b
        L36:
            zt.l r0 = new zt.l
            r0.<init>(r6, r8)
        L3b:
            java.lang.Object r8 = r0.f27564r
            qq.a r1 = qq.a.COROUTINE_SUSPENDED
            int r2 = r0.f27565x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L61
            if (r2 == r4) goto L55
            if (r2 != r3) goto L4d
            lf.t1.G(r8)
            goto L9b
        L4d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L55:
            au.s r7 = r0.E
            zt.g r2 = r0.D
            xr.a r4 = r0.B
            lf.t1.G(r8)     // Catch: java.lang.Throwable -> L5f
            goto L84
        L5f:
            r8 = move-exception
            goto La2
        L61:
            lf.t1.G(r8)
            au.s r8 = new au.s
            pq.h r2 = r0.f21666d
            br.l.b(r2)
            r8.<init>(r7, r2)
            java.lang.Object r2 = r6.f25482d     // Catch: java.lang.Throwable -> L9e
            d4.m r2 = (d4.m) r2     // Catch: java.lang.Throwable -> L9e
            r0.B = r6     // Catch: java.lang.Throwable -> L9e
            r0.D = r7     // Catch: java.lang.Throwable -> L9e
            r0.E = r8     // Catch: java.lang.Throwable -> L9e
            r0.f27565x = r4     // Catch: java.lang.Throwable -> L9e
            java.lang.Object r2 = r2.w(r8, r0)     // Catch: java.lang.Throwable -> L9e
            if (r2 != r1) goto L81
            goto L9d
        L81:
            r4 = r6
            r2 = r7
            r7 = r8
        L84:
            r7.r()
            java.lang.Object r7 = r4.f25483g
            zt.f r7 = (zt.f) r7
            r8 = 0
            r0.B = r8
            r0.D = r8
            r0.E = r8
            r0.f27565x = r3
            java.lang.Object r7 = r7.l(r2, r0)
            if (r7 != r1) goto L9b
            goto L9d
        L9b:
            lq.b0 r1 = lq.b0.f15562a
        L9d:
            return r1
        L9e:
            r7 = move-exception
            r5 = r8
            r8 = r7
            r7 = r5
        La2:
            r7.r()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: xr.a.l(zt.g, pq.c):java.lang.Object");
    }

    public a(zc.w0 w0Var, String str) {
        this.f25481a = 4;
        this.f25482d = str;
        this.f25483g = w0Var;
    }

    public a(e3 e3Var) {
        this.f25481a = 5;
        this.f25483g = e3Var;
    }

    public a(q3.a aVar, kg.r rVar) {
        this.f25481a = 6;
        this.f25482d = aVar;
        this.f25483g = new a8.f((com.opensignal.sdk.common.measurements.base.e) rVar.f14395a, (ch.f) rVar.f14396d, (com.opensignal.sdk.common.measurements.base.f) rVar.f14397g, (com.opensignal.sdk.common.measurements.base.c) rVar.f14398r);
    }

    public a(cj.a aVar, gi.a aVar2, gi.a aVar3) {
        this.f25481a = 8;
        br.l.e(aVar2, "throughputDownloadTestConfigMapper");
        br.l.e(aVar3, "throughputUploadTestConfigMapper");
        this.f25482d = aVar2;
        this.f25483g = aVar3;
    }

    public a(zj.b bVar, zj.c cVar) {
        this.f25481a = 7;
        br.l.e(cVar, "taskSchedulerConfigMapper");
        this.f25482d = bVar;
        this.f25483g = cVar;
    }

    public a() {
        this.f25481a = 1;
        this.f25482d = new p0.e(new Reference[16]);
        this.f25483g = new ReferenceQueue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(zt.f fVar, ar.n nVar) {
        this.f25481a = 10;
        this.f25482d = fVar;
        this.f25483g = (rq.j) nVar;
    }
}
