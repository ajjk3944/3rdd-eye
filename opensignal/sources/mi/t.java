package mi;

import ak.q0;
import android.content.Context;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes.dex */
public final class t extends f {
    public final Context P;
    public final gj.b Q;
    public final df.c R;
    public final jk.c S;
    public final xi.u T;
    public lh.b U;
    public final String V;
    public final String W;
    public final CountDownLatch X;
    public q0 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(Context context, gj.b bVar, df.c cVar, jk.c cVar2, io.sentry.hints.i iVar, fh.f fVar, zh.a aVar, zh.e eVar, xi.u uVar, xi.j jVar, String str) {
        super(iVar, fVar, cVar, aVar, eVar, jVar, str);
        br.l.e(cVar2, "packetValidatorV3");
        br.l.e(str, "taskName");
        this.P = context;
        this.Q = bVar;
        this.R = cVar;
        this.S = cVar2;
        this.T = uVar;
        this.V = "THROUGHPUT_SERVER_RESPONSE";
        this.W = "ThroughputServerResponseJob";
        this.X = new CountDownLatch(1);
    }

    @Override // vj.b
    public final String f() {
        return this.V;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:162:0x034a A[Catch: all -> 0x020c, TryCatch #18 {all -> 0x020c, blocks: (B:60:0x01e0, B:62:0x01e6, B:66:0x01f1, B:70:0x01fc, B:73:0x0206, B:79:0x0216, B:81:0x0220, B:83:0x022d, B:82:0x0227, B:85:0x0232, B:86:0x023b, B:99:0x026d, B:101:0x0285, B:103:0x028b, B:105:0x02a8, B:106:0x02aa, B:108:0x02b3, B:109:0x02bc, B:110:0x02c3, B:160:0x0340, B:162:0x034a, B:166:0x035f, B:163:0x0353, B:165:0x0357), top: B:219:0x014a }] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0353 A[Catch: all -> 0x020c, TryCatch #18 {all -> 0x020c, blocks: (B:60:0x01e0, B:62:0x01e6, B:66:0x01f1, B:70:0x01fc, B:73:0x0206, B:79:0x0216, B:81:0x0220, B:83:0x022d, B:82:0x0227, B:85:0x0232, B:86:0x023b, B:99:0x026d, B:101:0x0285, B:103:0x028b, B:105:0x02a8, B:106:0x02aa, B:108:0x02b3, B:109:0x02bc, B:110:0x02c3, B:160:0x0340, B:162:0x034a, B:166:0x035f, B:163:0x0353, B:165:0x0357), top: B:219:0x014a }] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x037a A[Catch: all -> 0x0386, TryCatch #16 {all -> 0x0386, blocks: (B:215:0x04ab, B:202:0x0485, B:204:0x048c, B:206:0x0492, B:208:0x0499, B:210:0x049f, B:211:0x04a4, B:212:0x04a7, B:169:0x0373, B:171:0x037a, B:173:0x0380, B:177:0x038b, B:179:0x0390, B:180:0x0395), top: B:225:0x014a }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x038b A[Catch: all -> 0x0386, TryCatch #16 {all -> 0x0386, blocks: (B:215:0x04ab, B:202:0x0485, B:204:0x048c, B:206:0x0492, B:208:0x0499, B:210:0x049f, B:211:0x04a4, B:212:0x04a7, B:169:0x0373, B:171:0x037a, B:173:0x0380, B:177:0x038b, B:179:0x0390, B:180:0x0395), top: B:225:0x014a }] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0390 A[Catch: all -> 0x0386, TryCatch #16 {all -> 0x0386, blocks: (B:215:0x04ab, B:202:0x0485, B:204:0x048c, B:206:0x0492, B:208:0x0499, B:210:0x049f, B:211:0x04a4, B:212:0x04a7, B:169:0x0373, B:171:0x037a, B:173:0x0380, B:177:0x038b, B:179:0x0390, B:180:0x0395), top: B:225:0x014a }] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x048c A[Catch: all -> 0x0386, TryCatch #16 {all -> 0x0386, blocks: (B:215:0x04ab, B:202:0x0485, B:204:0x048c, B:206:0x0492, B:208:0x0499, B:210:0x049f, B:211:0x04a4, B:212:0x04a7, B:169:0x0373, B:171:0x037a, B:173:0x0380, B:177:0x038b, B:179:0x0390, B:180:0x0395), top: B:225:0x014a }] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0499 A[Catch: all -> 0x0386, TryCatch #16 {all -> 0x0386, blocks: (B:215:0x04ab, B:202:0x0485, B:204:0x048c, B:206:0x0492, B:208:0x0499, B:210:0x049f, B:211:0x04a4, B:212:0x04a7, B:169:0x0373, B:171:0x037a, B:173:0x0380, B:177:0x038b, B:179:0x0390, B:180:0x0395), top: B:225:0x014a }] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x049f A[Catch: all -> 0x0386, TryCatch #16 {all -> 0x0386, blocks: (B:215:0x04ab, B:202:0x0485, B:204:0x048c, B:206:0x0492, B:208:0x0499, B:210:0x049f, B:211:0x04a4, B:212:0x04a7, B:169:0x0373, B:171:0x037a, B:173:0x0380, B:177:0x038b, B:179:0x0390, B:180:0x0395), top: B:225:0x014a }] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x014a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x013b  */
    /* JADX WARN: Type inference failed for: r2v0, types: [long] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Thread] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26, types: [java.lang.Thread] */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Thread] */
    /* JADX WARN: Type inference failed for: r6v3, types: [io.sentry.internal.debugmeta.c] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12, types: [yh.h] */
    /* JADX WARN: Type inference failed for: r7v14, types: [yh.h] */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Object, yh.i] */
    /* JADX WARN: Type inference failed for: r7v9, types: [yh.h] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v34 */
    /* JADX WARN: Type inference failed for: r8v35 */
    /* JADX WARN: Type inference failed for: r8v36 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.util.concurrent.Future] */
    @Override // mi.f, vj.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(java.lang.String r53, boolean r54, long r55) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1197
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: mi.t.k(java.lang.String, boolean, long):void");
    }

    @Override // mi.f, vj.b
    public final void l(long j) {
        super.l(j);
        StringBuilder sbK = w.g.k(j, "stop called with: taskId = ", ", taskName = ");
        sbK.append(this.f23922d);
        ch.n.b("ThroughputServerResponseJob", sbK.toString());
    }

    @Override // mi.f
    public final String o() {
        return this.W;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0154  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ni.t0 u(lh.b r50, java.lang.String r51) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: mi.t.u(lh.b, java.lang.String):ni.t0");
    }

    public final q0 v() {
        q0 q0Var = this.Y;
        if (q0Var != null) {
            return q0Var;
        }
        br.l.l("serverResponseTestConfig");
        throw null;
    }
}
