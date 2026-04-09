package gi;

import br.l;
import g4.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mi.n;
import mi.o;
import ni.b1;
import ni.c1;
import ni.f;
import ni.f1;
import ni.g0;
import ni.g1;
import ni.h;
import ni.h0;
import ni.h1;
import ni.o0;
import ni.p;
import ni.s;
import ni.s0;
import ni.t0;
import ni.u;
import ni.u0;
import ni.v;
import ni.w;
import ni.w0;
import ni.x;
import ni.z;
import ni.z0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xj.i;

/* loaded from: classes.dex */
public final class c implements i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9582a = 0;

    /* renamed from: d, reason: collision with root package name */
    public final i f9583d;

    public c(i iVar) {
        l.e(iVar, "deviceConnectionJsonMapper");
        this.f9583d = iVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // xj.h
    public final Object a(Object obj) {
        Object g0Var;
        switch (this.f9582a) {
            case 0:
                rj.b bVar = (rj.b) obj;
                if (bVar != null) {
                    long j = bVar.f21549a;
                    String str = bVar.f21554f;
                    n nVar = o.Companion;
                    String str2 = bVar.f21552d;
                    nVar.getClass();
                    o oVarA = n.a(str2);
                    int i10 = oVarA == null ? -1 : b.f9581a[oVarA.ordinal()];
                    i iVar = this.f9583d;
                    switch (i10) {
                        case -1:
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
                            break;
                        case 0:
                        default:
                            throw new bf.n();
                        case 1:
                            try {
                                ni.n nVar2 = (ni.n) iVar.g(str);
                                if (nVar2 != null) {
                                    return ni.n.i(nVar2, j);
                                }
                            } catch (Exception e4) {
                                ch.n.g("JobResultTableMapper", e4);
                                break;
                            }
                            break;
                        case 2:
                            try {
                                c1 c1Var = (c1) iVar.g(str);
                                if (c1Var != null) {
                                    return c1.i(c1Var, j);
                                }
                            } catch (Exception e10) {
                                ch.n.g("JobResultTableMapper", e10);
                                break;
                            }
                            break;
                        case 3:
                            try {
                                f1 f1Var = (f1) iVar.g(str);
                                if (f1Var != null) {
                                    return f1Var.i(j);
                                }
                            } catch (Exception e11) {
                                ch.n.g("JobResultTableMapper", e11);
                                break;
                            }
                            break;
                        case 4:
                            try {
                                z zVar = (z) iVar.g(str);
                                if (zVar != null) {
                                    return z.i(zVar, j);
                                }
                            } catch (Exception e12) {
                                ch.n.g("JobResultTableMapper", e12);
                                break;
                            }
                            break;
                        case j.STRING_FIELD_NUMBER /* 5 */:
                            try {
                                f fVar = (f) iVar.g(str);
                                long j7 = bVar.f21549a;
                                if (fVar != null) {
                                    long j10 = fVar.f17806b;
                                    String str3 = fVar.f17807c;
                                    String str4 = fVar.f17808d;
                                    String str5 = fVar.f17809e;
                                    long j11 = fVar.f17810f;
                                    List list = fVar.f17811g;
                                    l.e(str3, "taskName");
                                    l.e(str4, "jobType");
                                    l.e(str5, "dataEndpoint");
                                    g0Var = new f(j7, j10, str3, str4, str5, j11, list);
                                    return g0Var;
                                }
                            } catch (Exception e13) {
                                ch.n.g("JobResultTableMapper", e13);
                                break;
                            }
                            break;
                        case j.STRING_SET_FIELD_NUMBER /* 6 */:
                            try {
                                p pVar = (p) iVar.g(str);
                                long j12 = bVar.f21549a;
                                if (pVar != null) {
                                    long j13 = pVar.f18074b;
                                    String str6 = pVar.f18075c;
                                    String str7 = pVar.f18076d;
                                    String str8 = pVar.f18077e;
                                    long j14 = pVar.f18078f;
                                    List list2 = pVar.f18079g;
                                    l.e(str6, "taskName");
                                    l.e(str7, "jobType");
                                    l.e(str8, "dataEndpoint");
                                    g0Var = new p(j12, j13, str6, str7, str8, j14, list2);
                                    return g0Var;
                                }
                            } catch (Exception e14) {
                                ch.n.g("JobResultTableMapper", e14);
                                break;
                            }
                            break;
                        case j.DOUBLE_FIELD_NUMBER /* 7 */:
                            try {
                                h hVar = (h) iVar.g(str);
                                if (hVar != null) {
                                    return h.i(hVar, j);
                                }
                                return null;
                            } catch (Exception e15) {
                                ch.n.g("JobResultTableMapper", e15);
                                return null;
                            }
                        case j.BYTES_FIELD_NUMBER /* 8 */:
                            try {
                                z0 z0Var = (z0) iVar.g(str);
                                if (z0Var != null) {
                                    return z0.i(z0Var, j, null, 2097150);
                                }
                                return null;
                            } catch (Exception e16) {
                                ch.n.g("JobResultTableMapper", e16);
                                return null;
                            }
                        case 9:
                            try {
                                b1 b1Var = (b1) iVar.g(str);
                                if (b1Var != null) {
                                    return b1.i(b1Var, j, null, 262142);
                                }
                                return null;
                            } catch (Exception e17) {
                                ch.n.g("JobResultTableMapper", e17);
                                return null;
                            }
                        case 10:
                            try {
                                g0 g0Var2 = (g0) iVar.g(str);
                                long j15 = bVar.f21549a;
                                if (g0Var2 == null) {
                                    return null;
                                }
                                long j16 = g0Var2.f17847b;
                                String str9 = g0Var2.f17848c;
                                String str10 = g0Var2.f17849d;
                                String str11 = g0Var2.f17850e;
                                long j17 = g0Var2.f17851f;
                                String str12 = g0Var2.f17852g;
                                l.e(str9, "taskName");
                                l.e(str10, "jobType");
                                l.e(str11, "dataEndpoint");
                                g0Var = new g0(j15, j16, j17, str9, str10, str11, str12);
                                return g0Var;
                            } catch (Exception e18) {
                                ch.n.g("JobResultTableMapper", e18);
                                return null;
                            }
                        case 11:
                            try {
                                w0 w0Var = (w0) iVar.g(str);
                                if (w0Var != null) {
                                    return w0.i(w0Var, j);
                                }
                                return null;
                            } catch (Exception e19) {
                                ch.n.g("JobResultTableMapper", e19);
                                return null;
                            }
                        case 12:
                            try {
                                s0 s0Var = (s0) iVar.g(str);
                                if (s0Var != null) {
                                    return s0.i(s0Var, j);
                                }
                                return null;
                            } catch (Exception e20) {
                                ch.n.g("JobResultTableMapper", e20);
                                return null;
                            }
                        case 13:
                            try {
                                u0 u0Var = (u0) iVar.g(str);
                                if (u0Var != null) {
                                    return u0.i(u0Var, j);
                                }
                                return null;
                            } catch (Exception e21) {
                                ch.n.g("JobResultTableMapper", e21);
                                return null;
                            }
                        case 14:
                            try {
                                t0 t0Var = (t0) iVar.g(str);
                                if (t0Var != null) {
                                    return t0.i(t0Var, j);
                                }
                                return null;
                            } catch (Exception e22) {
                                ch.n.g("JobResultTableMapper", e22);
                                return null;
                            }
                        case 15:
                            try {
                                v vVar = (v) iVar.g(str);
                                if (vVar != null) {
                                    return v.i(vVar, j);
                                }
                                return null;
                            } catch (Exception e23) {
                                ch.n.g("JobResultTableMapper", e23);
                                return null;
                            }
                        case 16:
                            try {
                                w wVar = (w) iVar.g(str);
                                if (wVar != null) {
                                    return w.i(wVar, j);
                                }
                                return null;
                            } catch (Exception e24) {
                                ch.n.g("JobResultTableMapper", e24);
                                return null;
                            }
                        case 17:
                            try {
                                x xVar = (x) iVar.g(str);
                                if (xVar != null) {
                                    return x.i(xVar, j);
                                }
                                return null;
                            } catch (Exception e25) {
                                ch.n.g("JobResultTableMapper", e25);
                                return null;
                            }
                        case 18:
                            try {
                                h0 h0Var = (h0) iVar.g(str);
                                long j18 = bVar.f21549a;
                                if (h0Var == null) {
                                    return null;
                                }
                                long j19 = h0Var.f17885b;
                                String str13 = h0Var.f17886c;
                                String str14 = h0Var.f17887d;
                                String str15 = h0Var.f17888e;
                                long j20 = h0Var.f17889f;
                                String str16 = h0Var.f17890g;
                                l.e(str13, "taskName");
                                l.e(str14, "jobType");
                                l.e(str15, "dataEndpoint");
                                g0Var = new h0(j18, j19, j20, str13, str14, str15, str16);
                                return g0Var;
                            } catch (Exception e26) {
                                ch.n.g("JobResultTableMapper", e26);
                                return null;
                            }
                        case 19:
                            try {
                                s sVar = (s) iVar.g(str);
                                long j21 = bVar.f21549a;
                                if (sVar == null) {
                                    return null;
                                }
                                long j22 = sVar.f18122b;
                                String str17 = sVar.f18123c;
                                String str18 = sVar.f18124d;
                                String str19 = sVar.f18125e;
                                long j23 = sVar.f18126f;
                                List list3 = sVar.f18127g;
                                l.e(str17, "taskName");
                                l.e(str18, "jobType");
                                l.e(str19, "dataEndpoint");
                                g0Var = new s(j21, j22, str17, str18, str19, j23, list3);
                                return g0Var;
                            } catch (Exception e27) {
                                ch.n.g("JobResultTableMapper", e27);
                                return null;
                            }
                        case 20:
                            try {
                                h1 h1Var = (h1) iVar.g(str);
                                long j24 = bVar.f21549a;
                                if (h1Var == null) {
                                    return null;
                                }
                                long j25 = h1Var.f17892b;
                                String str20 = h1Var.f17893c;
                                String str21 = h1Var.f17894d;
                                String str22 = h1Var.f17895e;
                                long j26 = h1Var.f17896f;
                                List list4 = h1Var.f17897g;
                                l.e(str20, "taskName");
                                l.e(str21, "jobType");
                                l.e(str22, "dataEndpoint");
                                g0Var = new h1(j24, j25, str20, str21, str22, j26, list4);
                                return g0Var;
                            } catch (Exception e28) {
                                ch.n.g("JobResultTableMapper", e28);
                                return null;
                            }
                        case 21:
                            try {
                                ai.e eVar = (ai.e) iVar.g(str);
                                if (eVar != null) {
                                    return ai.e.i(eVar, j);
                                }
                                return null;
                            } catch (Exception e29) {
                                ch.n.g("JobResultTableMapper", e29);
                                return null;
                            }
                        case 22:
                            try {
                                g1 g1Var = (g1) iVar.g(str);
                                long j27 = bVar.f21549a;
                                if (g1Var == null) {
                                    return null;
                                }
                                long j28 = g1Var.f17854b;
                                String str23 = g1Var.f17855c;
                                long j29 = g1Var.f17856d;
                                String str24 = g1Var.f17857e;
                                String str25 = g1Var.f17858f;
                                String str26 = g1Var.f17859g;
                                l.e(str23, "taskName");
                                l.e(str24, "dataEndpoint");
                                l.e(str25, "jobType");
                                g0Var = new g1(j27, j28, j29, str23, str24, str25, str26);
                                return g0Var;
                            } catch (Exception e30) {
                                ch.n.g("JobResultTableMapper", e30);
                                return null;
                            }
                        case 23:
                            try {
                                u uVar = (u) iVar.g(str);
                                if (uVar != null) {
                                    return u.i(uVar, j, null, 126);
                                }
                                return null;
                            } catch (Exception e31) {
                                ch.n.g("JobResultTableMapper", e31);
                                return null;
                            }
                        case 24:
                            try {
                                o0 o0Var = (o0) iVar.g(str);
                                long j30 = bVar.f21549a;
                                if (o0Var == null) {
                                    return null;
                                }
                                long j31 = o0Var.f18067b;
                                String str27 = o0Var.f18068c;
                                long j32 = o0Var.f18069d;
                                String str28 = o0Var.f18070e;
                                String str29 = o0Var.f18071f;
                                String str30 = o0Var.f18072g;
                                l.e(str27, "taskName");
                                l.e(str28, "dataEndpoint");
                                g0Var = new o0(j30, j31, j32, str27, str28, str29, str30);
                                return g0Var;
                            } catch (Exception e32) {
                                ch.n.g("JobResultTableMapper", e32);
                                return null;
                            }
                    }
                }
                return null;
            default:
                ArrayList arrayList = (ArrayList) obj;
                l.e(arrayList, "input");
                JSONArray jSONArray = new JSONArray();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    jSONArray.put((JSONObject) this.f9583d.a((ak.s) it.next()));
                }
                return jSONArray;
        }
    }

    @Override // xj.g
    public final Object g(Object obj) throws JSONException {
        String str;
        switch (this.f9582a) {
            case 0:
                vj.c cVar = (vj.c) obj;
                if (cVar == null || (str = (String) this.f9583d.a(cVar)) == null) {
                    return null;
                }
                return new rj.b(cVar.b(), cVar.d(), System.currentTimeMillis(), cVar.e(), cVar.c(), str);
            default:
                JSONArray jSONArray = (JSONArray) obj;
                l.e(jSONArray, "input");
                ArrayList arrayList = new ArrayList();
                int length = jSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i10);
                    l.b(jSONObject);
                    arrayList.add((ak.s) this.f9583d.g(jSONObject));
                }
                return arrayList;
        }
    }

    public c(df.c cVar, xj.f fVar) {
        l.e(fVar, "jobResultMapper");
        this.f9583d = fVar;
    }
}
