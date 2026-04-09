package mi;

import ak.a1;
import ak.b1;
import ak.h0;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.net.TrafficStats;
import android.os.Bundle;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import ni.s0;
import ni.u0;
import org.json.JSONArray;

/* loaded from: classes.dex */
public final class j extends f {
    public final /* synthetic */ int P;
    public final Context Q;
    public final gj.b R;
    public final df.c S;
    public final String T;
    public final String U;
    public final CountDownLatch V;
    public Object W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context, gj.b bVar, df.c cVar, io.sentry.hints.i iVar, fh.f fVar, zh.a aVar, zh.e eVar, xi.j jVar, String str, int i10) {
        super(iVar, fVar, cVar, aVar, eVar, jVar, str);
        this.P = i10;
        switch (i10) {
            case 1:
                br.l.e(str, "taskName");
                super(iVar, fVar, cVar, aVar, eVar, jVar, str);
                this.Q = context;
                this.R = bVar;
                this.S = cVar;
                this.T = "THROUGHPUT_DOWNLOAD";
                this.U = "ThroughputDownloadJob";
                this.V = new CountDownLatch(1);
                break;
            case 2:
                br.l.e(str, "taskName");
                super(iVar, fVar, cVar, aVar, eVar, jVar, str);
                this.Q = context;
                this.R = bVar;
                this.S = cVar;
                this.T = "THROUGHPUT_UPLOAD";
                this.U = "ThroughputUploadJob";
                this.V = new CountDownLatch(1);
                break;
            default:
                br.l.e(str, "taskName");
                this.Q = context;
                this.R = bVar;
                this.S = cVar;
                this.T = "THROUGHPUT_ICMP";
                this.U = "IcmpJob";
                this.V = new CountDownLatch(1);
                break;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:85|(4:89|(4:91|(1:96)|97|(3:99|(2:101|76)|77)(3:102|(0)|77))(15:211|105|106|107|204|108|109|206|110|111|(2:113|114)|121|(1:123)|(1:125)|126)|86|87)|210|105|106|107|204|108|109|206|110|111|(0)|121|(0)|(0)|126) */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0435, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0436, code lost:
    
        r9 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0438, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0476, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0477, code lost:
    
        r10 = r10;
        r9 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x047a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x047b, code lost:
    
        r10 = r10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0457 A[Catch: all -> 0x0431, OutOfMemoryError -> 0x0435, Exception -> 0x0438, TRY_LEAVE, TryCatch #7 {all -> 0x0431, blocks: (B:108:0x0418, B:110:0x0420, B:114:0x0428, B:121:0x043a, B:123:0x0457, B:147:0x04b1, B:150:0x04cc, B:152:0x04db, B:165:0x0511, B:153:0x04e4, B:155:0x04e8, B:156:0x04f1, B:158:0x04f5, B:159:0x04fe, B:161:0x0502, B:162:0x050b, B:164:0x050f), top: B:195:0x02dd }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0463 A[PHI: r2 r9 r10 r28
  0x0463: PHI (r2v10 java.lang.Thread) = (r2v7 java.lang.Thread), (r2v8 java.lang.Thread), (r2v34 java.lang.Thread) binds: [B:149:0x04cb, B:166:0x0521, B:124:0x0461] A[DONT_GENERATE, DONT_INLINE]
  0x0463: PHI (r9v68 ??) = (r9v65 ??), (r9v66 ??), (r9v75 ??) binds: [B:149:0x04cb, B:166:0x0521, B:124:0x0461] A[DONT_GENERATE, DONT_INLINE]
  0x0463: PHI (r10v8 yh.o) = (r10v5 yh.o), (r10v6 yh.o), (r10v16 yh.o) binds: [B:149:0x04cb, B:166:0x0521, B:124:0x0461] A[DONT_GENERATE, DONT_INLINE]
  0x0463: PHI (r28v8 java.io.InputStream) = (r28v5 java.io.InputStream), (r28v6 java.io.InputStream), (r28v19 java.io.InputStream) binds: [B:149:0x04cb, B:166:0x0521, B:124:0x0461] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x04db A[Catch: all -> 0x0431, TryCatch #7 {all -> 0x0431, blocks: (B:108:0x0418, B:110:0x0420, B:114:0x0428, B:121:0x043a, B:123:0x0457, B:147:0x04b1, B:150:0x04cc, B:152:0x04db, B:165:0x0511, B:153:0x04e4, B:155:0x04e8, B:156:0x04f1, B:158:0x04f5, B:159:0x04fe, B:161:0x0502, B:162:0x050b, B:164:0x050f), top: B:195:0x02dd }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x04e4 A[Catch: all -> 0x0431, TryCatch #7 {all -> 0x0431, blocks: (B:108:0x0418, B:110:0x0420, B:114:0x0428, B:121:0x043a, B:123:0x0457, B:147:0x04b1, B:150:0x04cc, B:152:0x04db, B:165:0x0511, B:153:0x04e4, B:155:0x04e8, B:156:0x04f1, B:158:0x04f5, B:159:0x04fe, B:161:0x0502, B:162:0x050b, B:164:0x050f), top: B:195:0x02dd }] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0585  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x05bf  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x05e9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x03a1  */
    /* JADX WARN: Type inference failed for: r2v0, types: [long] */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r9v100 */
    /* JADX WARN: Type inference failed for: r9v101 */
    /* JADX WARN: Type inference failed for: r9v102 */
    /* JADX WARN: Type inference failed for: r9v103 */
    /* JADX WARN: Type inference failed for: r9v104 */
    /* JADX WARN: Type inference failed for: r9v105 */
    /* JADX WARN: Type inference failed for: r9v106 */
    /* JADX WARN: Type inference failed for: r9v107 */
    /* JADX WARN: Type inference failed for: r9v108 */
    /* JADX WARN: Type inference failed for: r9v109 */
    /* JADX WARN: Type inference failed for: r9v110 */
    /* JADX WARN: Type inference failed for: r9v111 */
    /* JADX WARN: Type inference failed for: r9v61, types: [int] */
    /* JADX WARN: Type inference failed for: r9v62 */
    /* JADX WARN: Type inference failed for: r9v63 */
    /* JADX WARN: Type inference failed for: r9v64 */
    /* JADX WARN: Type inference failed for: r9v65 */
    /* JADX WARN: Type inference failed for: r9v66 */
    /* JADX WARN: Type inference failed for: r9v67, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v68 */
    /* JADX WARN: Type inference failed for: r9v73 */
    /* JADX WARN: Type inference failed for: r9v74 */
    /* JADX WARN: Type inference failed for: r9v75, types: [java.io.BufferedInputStream, java.io.Closeable, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r9v80 */
    /* JADX WARN: Type inference failed for: r9v81 */
    /* JADX WARN: Type inference failed for: r9v82 */
    /* JADX WARN: Type inference failed for: r9v83 */
    /* JADX WARN: Type inference failed for: r9v84 */
    /* JADX WARN: Type inference failed for: r9v85 */
    /* JADX WARN: Type inference failed for: r9v86 */
    /* JADX WARN: Type inference failed for: r9v87 */
    /* JADX WARN: Type inference failed for: r9v88 */
    /* JADX WARN: Type inference failed for: r9v89 */
    /* JADX WARN: Type inference failed for: r9v90 */
    /* JADX WARN: Type inference failed for: r9v91 */
    /* JADX WARN: Type inference failed for: r9v92 */
    /* JADX WARN: Type inference failed for: r9v93 */
    /* JADX WARN: Type inference failed for: r9v94 */
    /* JADX WARN: Type inference failed for: r9v95 */
    /* JADX WARN: Type inference failed for: r9v96 */
    /* JADX WARN: Type inference failed for: r9v97 */
    /* JADX WARN: Type inference failed for: r9v98 */
    /* JADX WARN: Type inference failed for: r9v99 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void x(java.lang.String r30, boolean r31, long r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1590
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: mi.j.x(java.lang.String, boolean, long):void");
    }

    @Override // vj.b
    public final String f() {
        switch (this.P) {
        }
        return this.T;
    }

    @Override // mi.f, vj.b
    public final void k(String str, boolean z10, long j) throws Throwable {
        Integer num;
        String str2;
        Integer numValueOf;
        int uploadByteCount;
        int downloadByteCount;
        String str3;
        ApplicationInfo applicationInfo;
        int i10 = this.P;
        Context context = this.Q;
        gj.b bVar = this.R;
        String str4 = this.f23922d;
        String str5 = this.T;
        CountDownLatch countDownLatch = this.V;
        switch (i10) {
            case 0:
                br.l.e(str, "dataEndpoint");
                super.k(str, z10, j);
                StringBuilder sbK = w.g.k(j, "start() called with: taskId = ", ", taskName = ");
                w.g.q(sbK, str4, ", dataEndpoint = ", str, ", isManualExecution = ");
                sbK.append(z10);
                ch.n.b("IcmpJob", sbK.toString());
                ak.x xVar = h().f529f.k;
                this.W = new hh.b(null, null, null, null, yh.m.NOT_PERFORMED.getValue(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
                bVar.getClass();
                io.sentry.t tVar = bVar.f9601m;
                br.l.e(tVar, "handlerThreadFactory");
                br.l.e(context, "context");
                ch.n.b("IcmpTest", "start called");
                ch.n.b("IcmpJob", "onTestStarted() called");
                kc.f.f14288d = context;
                hk.k kVarC = yh.i.c(xVar, tVar, this);
                if (xVar.f766h) {
                    Bundle bundleE = yh.i.e(xVar, (String) kVarC.f10840m, (String) kVarC.f10839l, this);
                    Integer numValueOf2 = Integer.valueOf(bundleE.getInt("ttqos_9", yh.m.COMPLETED.getValue()));
                    String string = bundleE.getString("ttqos_8", null);
                    String string2 = string != null ? new JSONArray(string).toString() : null;
                    numValueOf = bundleE.containsKey("ttqos_7") ? Integer.valueOf(bundleE.getInt("ttqos_7")) : null;
                    num = numValueOf2;
                    str2 = string2;
                } else {
                    num = null;
                    str2 = null;
                    numValueOf = null;
                }
                Integer num2 = (Integer) kVarC.f10836g;
                Integer num3 = (Integer) kVarC.f10837h;
                Integer num4 = (Integer) kVarC.f10838i;
                String str6 = (String) kVarC.f10841n;
                Integer num5 = (Integer) kVarC.k;
                String strN = kVarC.n();
                Double d6 = (Double) kVarC.f10830a;
                Double d10 = (Double) kVarC.f10831b;
                Double d11 = (Double) kVarC.f10832c;
                Double d12 = (Double) kVarC.f10833d;
                Integer numValueOf3 = d12 != null ? Integer.valueOf((int) d12.doubleValue()) : null;
                Double d13 = (Double) kVarC.f10834e;
                Integer numValueOf4 = d13 != null ? Integer.valueOf((int) d13.doubleValue()) : null;
                Double d14 = (Double) kVarC.f10835f;
                Integer num6 = (Integer) kVarC.j;
                int i11 = xVar.f767i;
                int i12 = xVar.f769m;
                int i13 = xVar.k;
                int i14 = xVar.j;
                int i15 = xVar.f770n;
                br.l.b(num5);
                hh.b bVar2 = new hh.b(num2, num3, num4, str6, num5.intValue(), strN, d10, d6, d11, numValueOf3, numValueOf4, d14, num6, num, str2, numValueOf, Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(i15));
                ch.n.b("IcmpJob", "onTestComplete() called");
                this.W = bVar2;
                countDownLatch.countDown();
                countDownLatch.await();
                hk.h hVar = this.E;
                if (hVar != null) {
                    hh.b bVar3 = (hh.b) this.W;
                    if (bVar3 == null) {
                        br.l.l("icmpTestResult");
                        throw null;
                    }
                    hVar.f(str5, u(bVar3, n()));
                }
                super.j(j);
                ch.n.b("IcmpJob", "onFinish() called with: taskId = " + j + ", taskName = " + str4);
                hh.b bVar4 = (hh.b) this.W;
                if (bVar4 == null) {
                    br.l.l("icmpTestResult");
                    throw null;
                }
                bVar4.toString();
                ch.n.a();
                hh.b bVar5 = (hh.b) this.W;
                if (bVar5 == null) {
                    br.l.l("icmpTestResult");
                    throw null;
                }
                ni.v vVarU = u(bVar5, n());
                hk.h hVar2 = this.E;
                if (hVar2 != null) {
                    hVar2.d(str5, vVarU);
                    return;
                }
                return;
            case 1:
                x(str, z10, j);
                return;
            default:
                br.l.e(str, "dataEndpoint");
                super.k(str, z10, j);
                StringBuilder sbK2 = w.g.k(j, "start() called with: taskId = ", ", taskName = ");
                w.g.q(sbK2, str4, ", dataEndpoint = ", str, ", isManualExecution = ");
                sbK2.append(z10);
                ch.n.b("ThroughputUploadJob", sbK2.toString());
                a1 a1Var = h().f529f.f457i;
                this.W = new lh.c(0.0d, 0.0d, null, -1L, -1L, -1, -1, -1, null, null, null, null);
                bVar.getClass();
                io.sentry.internal.debugmeta.c cVar = bVar.f9599i;
                io.sentry.t tVar2 = bVar.f9601m;
                br.l.e(tVar2, "handlerThreadFactory");
                br.l.e(context, "context");
                ch.n.b("ThroughputUploadTest", "start() called");
                a1Var.toString();
                ch.n.a();
                h0 h0VarA = ak.g0.a(mq.o.Q0(a1Var.f426b));
                br.l.c(h0VarA, "null cannot be cast to non-null type com.opensignal.sdk.domain.model.ThroughputUploadTestConfig");
                b1 b1Var = (b1) h0VarA;
                b1Var.toString();
                ch.n.a();
                switch (yh.k.f26327a[b1Var.k.ordinal()]) {
                    case 1:
                        yh.f fVar = yh.f.MICRO_TEST;
                        fVar.getDownloadUrl();
                        uploadByteCount = fVar.getUploadByteCount();
                        downloadByteCount = fVar.getDownloadByteCount();
                        break;
                    case 2:
                        yh.f fVar2 = yh.f.SMALL_TEST;
                        fVar2.getDownloadUrl();
                        uploadByteCount = fVar2.getUploadByteCount();
                        downloadByteCount = fVar2.getDownloadByteCount();
                        break;
                    case 3:
                        yh.f fVar3 = yh.f.MEDIUM_TEST;
                        fVar3.getDownloadUrl();
                        uploadByteCount = fVar3.getUploadByteCount();
                        downloadByteCount = fVar3.getDownloadByteCount();
                        break;
                    case 4:
                        yh.f fVar4 = yh.f.MEDIUM_LARGE_TEST;
                        fVar4.getDownloadUrl();
                        uploadByteCount = fVar4.getUploadByteCount();
                        downloadByteCount = fVar4.getDownloadByteCount();
                        break;
                    case g4.j.STRING_FIELD_NUMBER /* 5 */:
                        yh.f fVar5 = yh.f.THREE_ONE;
                        fVar5.getDownloadUrl();
                        uploadByteCount = fVar5.getUploadByteCount();
                        downloadByteCount = fVar5.getDownloadByteCount();
                        break;
                    case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                        yh.f fVar6 = yh.f.LARGE_TEST;
                        fVar6.getDownloadUrl();
                        uploadByteCount = fVar6.getUploadByteCount();
                        downloadByteCount = fVar6.getDownloadByteCount();
                        break;
                    case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                        yh.f fVar7 = yh.f.HUGE_TEST;
                        fVar7.getDownloadUrl();
                        uploadByteCount = fVar7.getUploadByteCount();
                        downloadByteCount = fVar7.getDownloadByteCount();
                        break;
                    case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                        yh.f fVar8 = yh.f.CONTINUOUS_TEST;
                        fVar8.getDownloadUrl();
                        uploadByteCount = fVar8.getUploadByteCount();
                        downloadByteCount = fVar8.getDownloadByteCount();
                        break;
                    case 9:
                        yh.f fVar9 = yh.f.MASSIVE_TEST2010;
                        fVar9.getDownloadUrl();
                        uploadByteCount = fVar9.getUploadByteCount();
                        downloadByteCount = fVar9.getDownloadByteCount();
                        break;
                    case 10:
                        yh.f fVar10 = yh.f.MASSIVE_TEST3015;
                        fVar10.getDownloadUrl();
                        uploadByteCount = fVar10.getUploadByteCount();
                        downloadByteCount = fVar10.getDownloadByteCount();
                        break;
                    case 11:
                        yh.f fVar11 = yh.f.MASSIVE_TEST5025;
                        fVar11.getDownloadUrl();
                        uploadByteCount = fVar11.getUploadByteCount();
                        downloadByteCount = fVar11.getDownloadByteCount();
                        break;
                    case 12:
                        yh.f fVar12 = yh.f.MASSIVE_TEST205;
                        fVar12.getDownloadUrl();
                        uploadByteCount = fVar12.getUploadByteCount();
                        downloadByteCount = fVar12.getDownloadByteCount();
                        break;
                    case 13:
                        yh.f fVar13 = yh.f.MASSIVE_TEST305;
                        fVar13.getDownloadUrl();
                        uploadByteCount = fVar13.getUploadByteCount();
                        downloadByteCount = fVar13.getDownloadByteCount();
                        break;
                    case 14:
                        yh.f fVar14 = yh.f.MASSIVE_TEST505;
                        fVar14.getDownloadUrl();
                        uploadByteCount = fVar14.getUploadByteCount();
                        downloadByteCount = fVar14.getDownloadByteCount();
                        break;
                    case 15:
                        yh.f fVar15 = yh.f.MASSIVE_TEST3010;
                        fVar15.getDownloadUrl();
                        uploadByteCount = fVar15.getUploadByteCount();
                        downloadByteCount = fVar15.getDownloadByteCount();
                        break;
                    case 16:
                        yh.f fVar16 = yh.f.MASSIVE_TEST5010;
                        fVar16.getDownloadUrl();
                        uploadByteCount = fVar16.getUploadByteCount();
                        downloadByteCount = fVar16.getDownloadByteCount();
                        break;
                    case 17:
                        yh.f fVar17 = yh.f.NR_NSA_TEST_10_1;
                        fVar17.getDownloadUrl();
                        uploadByteCount = fVar17.getUploadByteCount();
                        downloadByteCount = fVar17.getDownloadByteCount();
                        break;
                    case 18:
                        yh.f fVar18 = yh.f.NR_NSA_TEST_20_1;
                        fVar18.getDownloadUrl();
                        uploadByteCount = fVar18.getUploadByteCount();
                        downloadByteCount = fVar18.getDownloadByteCount();
                        break;
                    case 19:
                        yh.f fVar19 = yh.f.NR_NSA_TEST_30_1;
                        fVar19.getDownloadUrl();
                        uploadByteCount = fVar19.getUploadByteCount();
                        downloadByteCount = fVar19.getDownloadByteCount();
                        break;
                    case 20:
                        yh.f fVar20 = yh.f.NR_NSA_TEST_50_1;
                        fVar20.getDownloadUrl();
                        uploadByteCount = fVar20.getUploadByteCount();
                        downloadByteCount = fVar20.getDownloadByteCount();
                        break;
                    case 21:
                        yh.f fVar21 = yh.f.CONTINUOUS_TEST_100_50;
                        fVar21.getDownloadUrl();
                        uploadByteCount = fVar21.getUploadByteCount();
                        downloadByteCount = fVar21.getDownloadByteCount();
                        break;
                    case 22:
                        yh.f fVar22 = yh.f.CONTINUOUS_TEST_1000_50;
                        fVar22.getDownloadUrl();
                        uploadByteCount = fVar22.getUploadByteCount();
                        downloadByteCount = fVar22.getDownloadByteCount();
                        break;
                    case 23:
                        yh.f fVar23 = yh.f.TWO_TWO;
                        fVar23.getDownloadUrl();
                        uploadByteCount = fVar23.getUploadByteCount();
                        downloadByteCount = fVar23.getDownloadByteCount();
                        break;
                    case 24:
                        yh.f fVar24 = yh.f.FIVE_TWO;
                        fVar24.getDownloadUrl();
                        uploadByteCount = fVar24.getUploadByteCount();
                        downloadByteCount = fVar24.getDownloadByteCount();
                        break;
                    case 25:
                        yh.f fVar25 = yh.f.TEN_TWO;
                        fVar25.getDownloadUrl();
                        uploadByteCount = fVar25.getUploadByteCount();
                        downloadByteCount = fVar25.getDownloadByteCount();
                        break;
                    case 26:
                        yh.f fVar26 = yh.f.FIVE_FIVE;
                        fVar26.getDownloadUrl();
                        uploadByteCount = fVar26.getUploadByteCount();
                        downloadByteCount = fVar26.getDownloadByteCount();
                        break;
                    case 27:
                        yh.f fVar27 = yh.f.TEN_TEN;
                        fVar27.getDownloadUrl();
                        uploadByteCount = fVar27.getUploadByteCount();
                        downloadByteCount = fVar27.getDownloadByteCount();
                        break;
                    default:
                        downloadByteCount = 0;
                        uploadByteCount = 0;
                        break;
                }
                yh.m mVar = yh.m.ERROR;
                mVar.getValue();
                ch.n.b("ThroughputUploadJob", "onTestStarted() called");
                t("START", new fh.d[0]);
                kc.f.f14288d = context;
                String str7 = b1Var.f438a;
                try {
                    applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 0);
                } catch (Exception unused) {
                }
                int i16 = applicationInfo != null ? applicationInfo.uid : 0;
                String str8 = yh.e.f26266c;
                int i17 = TrafficStats.getUidRxBytes(i16) == -1 ? TrafficStats.getTotalRxBytes() == -1 ? 3 : 2 : 1;
                long j7 = downloadByteCount;
                long j10 = uploadByteCount;
                yh.o oVar = new yh.o(mVar.getValue(), j7, j10);
                oVar.f26351x = b1Var.f442e;
                yh.e.p(uploadByteCount, str7, i16, i17, b1Var, oVar, cVar, tVar2, this);
                lh.c cVar2 = new lh.c(oVar.f26332c, oVar.f26346s, ic.a.q(new String[]{oVar.f26335f, oVar.f26336g}), oVar.f26347t, j10, oVar.f26338i, oVar.f26339l, oVar.f26340m, oVar.f26349v, oVar.f26343p, oVar.A, oVar.B);
                ch.n.b("ThroughputUploadJob", "onTestComplete() called");
                this.W = cVar2;
                t("STOP", new fh.d[0]);
                countDownLatch.countDown();
                countDownLatch.await();
                hk.h hVar3 = this.E;
                if (hVar3 != null) {
                    lh.c cVar3 = (lh.c) this.W;
                    if (cVar3 == null) {
                        br.l.l("throughputUploadTestResult");
                        throw null;
                    }
                    str3 = str5;
                    hVar3.f(str3, w(cVar3, n()));
                } else {
                    str3 = str5;
                }
                super.j(j);
                ch.n.b("ThroughputUploadJob", "onFinish() called with: taskId = " + j + ", taskName = " + str4);
                lh.c cVar4 = (lh.c) this.W;
                if (cVar4 == null) {
                    br.l.l("throughputUploadTestResult");
                    throw null;
                }
                cVar4.toString();
                ch.n.a();
                lh.c cVar5 = (lh.c) this.W;
                if (cVar5 == null) {
                    br.l.l("throughputUploadTestResult");
                    throw null;
                }
                u0 u0VarW = w(cVar5, n());
                hk.h hVar4 = this.E;
                if (hVar4 != null) {
                    hVar4.d(str3, u0VarW);
                    return;
                }
                return;
        }
    }

    @Override // mi.f, vj.b
    public void l(long j) {
        switch (this.P) {
            case 1:
                super.l(j);
                StringBuilder sbK = w.g.k(j, "stop called with: taskId = ", ", taskName = ");
                sbK.append(this.f23922d);
                ch.n.b("ThroughputDownloadJob", sbK.toString());
                break;
            case 2:
                super.l(j);
                StringBuilder sbK2 = w.g.k(j, "stop called with: taskId = ", ", taskName = ");
                sbK2.append(this.f23922d);
                ch.n.b("ThroughputUploadJob", sbK2.toString());
                break;
            default:
                super.l(j);
                break;
        }
    }

    @Override // mi.f
    public final String o() {
        switch (this.P) {
        }
        return this.U;
    }

    public ni.v u(hh.b bVar, String str) {
        br.l.e(bVar, "result");
        bVar.toString();
        ch.n.a();
        long jG = g();
        long j = this.f23926y;
        this.S.getClass();
        return new ni.v(jG, j, this.f23922d, System.currentTimeMillis(), this.D, this.T, bVar.f10762a, bVar.f10763b, bVar.f10764c, bVar.f10765d, Integer.valueOf(this.M ? yh.m.CONNECTION_CHANGED.getValue() : bVar.f10766e), bVar.f10767f, bVar.f10768g, bVar.f10769h, bVar.f10770i, bVar.j, bVar.k, bVar.f10771l, bVar.f10772m, this.M ? Integer.valueOf(yh.m.CONNECTION_CHANGED.getValue()) : bVar.f10773n, bVar.f10774o, bVar.f10775p, str, bVar.f10776q, bVar.f10777r, bVar.f10778s, bVar.f10779t, bVar.f10780u);
    }

    public s0 v(lh.a aVar, String str) {
        br.l.e(aVar, "result");
        aVar.toString();
        ch.n.a();
        List list = aVar.f15508l;
        String strT = list != null ? ic.a.t(list) : null;
        List list2 = aVar.f15509m;
        String strT2 = list2 != null ? ic.a.t(list2) : null;
        ch.n.a();
        ch.n.a();
        long jG = g();
        long j = this.f23926y;
        this.S.getClass();
        return new s0(jG, j, this.f23922d, System.currentTimeMillis(), this.D, this.T, aVar.f15499a, aVar.f15500b, aVar.f15501c, aVar.f15507i, aVar.f15502d, this.M ? yh.m.CONNECTION_CHANGED.getValue() : aVar.f15503e, aVar.f15504f, aVar.f15505g, aVar.f15506h, aVar.j, aVar.k, strT, strT2, str);
    }

    public u0 w(lh.c cVar, String str) {
        br.l.e(cVar, "result");
        cVar.toString();
        ch.n.a();
        List list = cVar.k;
        String strT = list != null ? ic.a.t(list) : null;
        List list2 = cVar.f15539l;
        String strT2 = list2 != null ? ic.a.t(list2) : null;
        ch.n.a();
        ch.n.a();
        long jG = g();
        long j = this.f23926y;
        this.S.getClass();
        return new u0(jG, j, this.f23922d, System.currentTimeMillis(), this.D, this.T, cVar.f15530a, cVar.f15531b, cVar.f15532c, cVar.f15533d, cVar.f15534e, this.M ? yh.m.CONNECTION_CHANGED.getValue() : cVar.f15535f, cVar.f15536g, cVar.f15537h, cVar.f15538i, cVar.j, strT, strT2, str);
    }
}
