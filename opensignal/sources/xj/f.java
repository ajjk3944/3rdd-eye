package xj;

import ch.n;
import mi.o;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* loaded from: classes.dex */
public final class f implements i {
    public final i B;
    public final i D;
    public final i E;
    public final i F;
    public final i G;
    public final i H;
    public final i I;
    public final i J;
    public final i K;
    public final i L;
    public final i M;
    public final i N;
    public final i O;
    public final i P;
    public final i Q;
    public final i R;
    public final i S;
    public final i T;

    /* renamed from: a, reason: collision with root package name */
    public final i f25387a;

    /* renamed from: d, reason: collision with root package name */
    public final i f25388d;

    /* renamed from: g, reason: collision with root package name */
    public final i f25389g;

    /* renamed from: r, reason: collision with root package name */
    public final i f25390r;

    /* renamed from: x, reason: collision with root package name */
    public final i f25391x;

    /* renamed from: y, reason: collision with root package name */
    public final i f25392y;

    public f(ai.f fVar, ai.f fVar2, ai.f fVar3, c cVar, c cVar2, ai.f fVar4, ai.f fVar5, i iVar, d dVar, ai.f fVar6, ai.f fVar7, i iVar2, i iVar3, i iVar4, i iVar5, i iVar6, i iVar7, i iVar8, i iVar9, c cVar3, ai.f fVar8, ai.f fVar9, d dVar2, i iVar10, cj.a aVar) {
        br.l.e(fVar, "downloadSpeedResultMapper");
        br.l.e(fVar2, "uploadSpeedResultMapper");
        br.l.e(fVar3, "videoResultMapper");
        br.l.e(cVar, "coreResultMapper");
        br.l.e(cVar2, "endCoreResultMapper");
        br.l.e(fVar4, "dailyResultMapper");
        br.l.e(fVar5, "udpResultMapper");
        br.l.e(iVar, "udpVerificationResultMapper");
        br.l.e(dVar, "latencyResultMapper");
        br.l.e(fVar6, "publicIpResultMapper");
        br.l.e(fVar7, "tracerouteResultMapper");
        br.l.e(iVar2, "throughputDownloadJobResultMapper");
        br.l.e(iVar3, "throughputUploadJobResultMapper");
        br.l.e(iVar4, "throughputServerResponseJobResultMapper");
        br.l.e(iVar5, "icmpJobResultMapper");
        br.l.e(iVar6, "icmpPingJobResultMapper");
        br.l.e(iVar7, "icmpTracerouteJobResultMapper");
        br.l.e(iVar8, "schedulerInfoResultMapper");
        br.l.e(iVar9, "flushConnectionJobResultMapper");
        br.l.e(cVar3, "wifiScanResultMapper");
        br.l.e(fVar8, "assistantJobResultMapper");
        br.l.e(fVar9, "wifiInformationElementsJobResultMapper");
        br.l.e(dVar2, "httpHeadLatencyJobResultMapper");
        br.l.e(iVar10, "taskLoggerMapper");
        this.f25387a = fVar;
        this.f25388d = fVar2;
        this.f25389g = fVar3;
        this.f25390r = cVar;
        this.f25391x = cVar2;
        this.f25392y = fVar4;
        this.B = fVar5;
        this.D = iVar;
        this.E = dVar;
        this.F = fVar6;
        this.G = fVar7;
        this.H = iVar2;
        this.I = iVar3;
        this.J = iVar4;
        this.K = iVar5;
        this.L = iVar6;
        this.M = iVar7;
        this.N = iVar8;
        this.O = iVar9;
        this.P = cVar3;
        this.Q = fVar8;
        this.R = fVar9;
        this.S = dVar2;
        this.T = iVar10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0005  */
    @Override // xj.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r6) {
        /*
            Method dump skipped, instructions count: 600
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: xj.f.a(java.lang.Object):java.lang.Object");
    }

    public final vj.c b(o oVar, JSONObject jSONObject) {
        vj.c cVar;
        switch (e.f25386a[oVar.ordinal()]) {
            case 1:
                try {
                    cVar = (vj.c) this.f25387a.g(jSONObject);
                    break;
                } catch (Exception e4) {
                    n.d("JobResultMapper", "Error mapping from download speed result", e4);
                    return null;
                }
            case 2:
                try {
                    cVar = (vj.c) this.f25388d.g(jSONObject);
                    break;
                } catch (Exception e10) {
                    n.d("JobResultMapper", "Error mapping from upload speed result", e10);
                    return null;
                }
            case 3:
                try {
                    cVar = (vj.c) this.f25389g.g(jSONObject);
                    break;
                } catch (Exception e11) {
                    n.d("JobResultMapper", "Error mapping from video result", e11);
                    return null;
                }
            case 4:
                try {
                    cVar = (vj.c) this.f25390r.g(jSONObject);
                    break;
                } catch (Exception e12) {
                    n.d("JobResultMapper", "Error mapping from core result", e12);
                    return null;
                }
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                try {
                    cVar = (vj.c) this.f25391x.g(jSONObject);
                    break;
                } catch (Exception e13) {
                    n.d("JobResultMapper", "Error mapping from core result", e13);
                    return null;
                }
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                try {
                    cVar = (vj.c) this.f25392y.g(jSONObject);
                    break;
                } catch (Exception e14) {
                    n.d("JobResultMapper", "Error mapping from daily result", e14);
                    return null;
                }
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                try {
                    cVar = (vj.c) this.B.g(jSONObject);
                    break;
                } catch (Exception e15) {
                    n.d("JobResultMapper", "Error mapping from udp result", e15);
                    return null;
                }
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                try {
                    cVar = (vj.c) this.D.g(jSONObject);
                    break;
                } catch (Exception e16) {
                    n.d("JobResultMapper", "Error mapping from udpVerification result", e16);
                    return null;
                }
            case 9:
                try {
                    cVar = (vj.c) this.E.g(jSONObject);
                    break;
                } catch (Exception e17) {
                    n.d("JobResultMapper", "Error mapping from latency result", e17);
                    return null;
                }
            case 10:
                try {
                    cVar = (vj.c) this.F.g(jSONObject);
                    break;
                } catch (Exception e18) {
                    n.d("JobResultMapper", "Error mapping from public ip result", e18);
                    return null;
                }
            case 11:
                try {
                    cVar = (vj.c) this.G.g(jSONObject);
                    break;
                } catch (Exception e19) {
                    n.d("JobResultMapper", "Error mapping from traceroute result", e19);
                    return null;
                }
            case 12:
                try {
                    cVar = (vj.c) this.H.g(jSONObject);
                    break;
                } catch (Exception e20) {
                    n.d("JobResultMapper", "Error mapping from throughput download result", e20);
                    return null;
                }
            case 13:
                try {
                    cVar = (vj.c) this.I.g(jSONObject);
                    break;
                } catch (Exception e21) {
                    n.d("JobResultMapper", "Error mapping from throughput upload result", e21);
                    return null;
                }
            case 14:
                try {
                    cVar = (vj.c) this.J.g(jSONObject);
                    break;
                } catch (Exception e22) {
                    n.d("JobResultMapper", "Error mapping from throughput server response result", e22);
                    return null;
                }
            case 15:
                try {
                    cVar = (vj.c) this.K.g(jSONObject);
                    break;
                } catch (Exception e23) {
                    n.d("JobResultMapper", "Error mapping from icmp result", e23);
                    return null;
                }
            case 16:
                try {
                    cVar = (vj.c) this.L.g(jSONObject);
                    break;
                } catch (Exception e24) {
                    n.d("JobResultMapper", "Error mapping from icmp result", e24);
                    return null;
                }
            case 17:
                try {
                    cVar = (vj.c) this.M.g(jSONObject);
                    break;
                } catch (Exception e25) {
                    n.d("JobResultMapper", "Error mapping from icmp result", e25);
                    return null;
                }
            case 18:
                try {
                    cVar = (vj.c) this.N.g(jSONObject);
                    break;
                } catch (Exception e26) {
                    n.d("JobResultMapper", "Error mapping from Scheduler info result", e26);
                    return null;
                }
            case 19:
                try {
                    cVar = (vj.c) this.O.g(jSONObject);
                    break;
                } catch (Exception e27) {
                    n.d("JobResultMapper", "Error mapping from connection job result", e27);
                    return null;
                }
            case 20:
                try {
                    cVar = (vj.c) this.P.g(jSONObject);
                    break;
                } catch (Exception e28) {
                    n.d("JobResultMapper", "Error mapping from wifi scan result", e28);
                    return null;
                }
            case 21:
                try {
                    cVar = (vj.c) this.Q.g(jSONObject);
                    break;
                } catch (Exception e29) {
                    n.d("JobResultMapper", "Error mapping from connectivity assistant job result", e29);
                    return null;
                }
            case 22:
                try {
                    cVar = (vj.c) this.R.g(jSONObject);
                    break;
                } catch (Exception e30) {
                    n.d("JobResultMapper", "Error mapping from connectivity assistant job result", e30);
                    return null;
                }
            case 23:
                try {
                    cVar = (vj.c) this.S.g(jSONObject);
                    break;
                } catch (Exception e31) {
                    n.d("JobResultMapper", "Error mapping from HttpHeadLatencyJob result", e31);
                    return null;
                }
            case 24:
                try {
                    cVar = (vj.c) this.T.g(jSONObject);
                    break;
                } catch (Exception e32) {
                    n.d("JobResultMapper", "Error mapping from task logger result", e32);
                    return null;
                }
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
                return null;
            default:
                throw new bf.n();
        }
        return cVar;
    }

    @Override // xj.g
    public final Object g(Object obj) throws JSONException {
        JSONObject jSONObject;
        o oVar;
        String str = (String) obj;
        if (str != null && !tt.l.D0(str)) {
            try {
                Object objNextValue = new JSONTokener(str).nextValue();
                if (objNextValue != null) {
                    int i10 = 0;
                    if (objNextValue instanceof JSONArray) {
                        jSONObject = ((JSONArray) objNextValue).getJSONObject(0);
                        br.l.d(jSONObject, "getJSONObject(...)");
                    } else {
                        jSONObject = new JSONObject(str);
                    }
                    try {
                        String string = jSONObject.getString("job_type");
                        br.l.b(string);
                        o[] oVarArrValues = o.values();
                        int length = oVarArrValues.length;
                        while (true) {
                            if (i10 >= length) {
                                oVar = null;
                                break;
                            }
                            oVar = oVarArrValues[i10];
                            if (br.l.a(oVar.name(), string)) {
                                break;
                            }
                            i10++;
                        }
                        if (oVar != null) {
                            return b(oVar, jSONObject);
                        }
                        n.g("JobResultMapper", "JobType " + string + " not found");
                    } catch (IllegalArgumentException e4) {
                        n.d("JobResultMapper", "Error mapping job result: " + jSONObject, e4);
                        cj.a.F("Error mapping job result: " + jSONObject + " : " + e4);
                    }
                }
            } catch (JSONException e10) {
                n.d("JobResultMapper", "Error mapping job result string - ".concat(str), e10);
                cj.a.F("Error mapping job result string - " + str + " : " + e10);
            }
        }
        return null;
    }
}
