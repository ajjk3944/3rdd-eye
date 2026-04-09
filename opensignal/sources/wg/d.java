package wg;

import au.q;
import au.y;
import com.survicate.surveys.infrastructure.network.URLRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.net.URLConnection;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import lf.t1;
import lq.b0;
import org.json.JSONObject;
import tg.u0;
import wt.t;
import zt.f0;
import zt.h0;
import zt.i0;
import zt.k0;
import zt.l0;
import zt.o0;
import zt.s;
import zt.z;

/* loaded from: classes.dex */
public final class d extends rq.j implements ar.n {
    public /* synthetic */ Object B;
    public final /* synthetic */ Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ Serializable F;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f24499x;

    /* renamed from: y, reason: collision with root package name */
    public int f24500y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, Object obj2, Object obj3, Serializable serializable, pq.c cVar, int i10) {
        super(2, cVar);
        this.f24499x = i10;
        this.D = obj;
        this.B = obj2;
        this.E = obj3;
        this.F = serializable;
    }

    @Override // rq.a
    public final pq.c o(Object obj, pq.c cVar) {
        switch (this.f24499x) {
            case 0:
                return new d((e) this.D, this.B, (a8.h) this.E, (d4.n) this.F, cVar, 0);
            case 1:
                d dVar = new d((zt.f) this.D, (o0) this.E, (Float) this.F, cVar);
                dVar.B = obj;
                return dVar;
            default:
                return new d((l0) this.D, (zt.f) this.B, (o0) this.E, (Float) this.F, cVar, 2);
        }
    }

    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, java.util.Map] */
    @Override // rq.a
    public final Object q(Object obj) throws IOException {
        int i10 = this.f24499x;
        pq.c cVar = null;
        Serializable serializable = this.F;
        Object obj2 = this.D;
        Object obj3 = this.E;
        int i11 = 2;
        b0 b0Var = b0.f15562a;
        int i12 = 1;
        int i13 = 3;
        switch (i10) {
            case 0:
                d4.n nVar = (d4.n) serializable;
                qq.a aVar = qq.a.COROUTINE_SUSPENDED;
                int i14 = this.f24500y;
                try {
                } catch (Exception e4) {
                    String message = e4.getMessage();
                    if (message == null) {
                        message = e4.toString();
                    }
                    this.f24500y = 3;
                    nVar.w(message, this);
                    if (b0Var != aVar) {
                        return b0Var;
                    }
                }
                if (i14 != 0) {
                    if (i14 == 1 || i14 == 2) {
                        t1.G(obj);
                        return b0Var;
                    }
                    if (i14 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.G(obj);
                    return b0Var;
                }
                t1.G(obj);
                URLConnection uRLConnectionOpenConnection = e.a((e) obj2).openConnection();
                br.l.c(uRLConnectionOpenConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLConnectionOpenConnection;
                httpsURLConnection.setRequestMethod(URLRequest.METHOD_GET);
                httpsURLConnection.setRequestProperty("Accept", "application/json");
                for (Map.Entry entry : this.B.entrySet()) {
                    httpsURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                int responseCode = httpsURLConnection.getResponseCode();
                if (responseCode == 200) {
                    InputStream inputStream = httpsURLConnection.getInputStream();
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                    StringBuilder sb2 = new StringBuilder();
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line != null) {
                            sb2.append(line);
                        } else {
                            bufferedReader.close();
                            inputStream.close();
                            JSONObject jSONObject = new JSONObject(sb2.toString());
                            this.f24500y = 1;
                            if (((a8.h) obj3).w(jSONObject, this) != aVar) {
                                return b0Var;
                            }
                        }
                    }
                } else {
                    this.f24500y = 2;
                    nVar.w("Bad response code: " + responseCode, this);
                    if (b0Var != aVar) {
                        return b0Var;
                    }
                }
                return aVar;
            case 1:
                o0 o0Var = (o0) obj3;
                qq.a aVar2 = qq.a.COROUTINE_SUSPENDED;
                int i15 = this.f24500y;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.G(obj);
                    return b0Var;
                }
                t1.G(obj);
                int i16 = z.f27608a[((h0) this.B).ordinal()];
                if (i16 == 1) {
                    this.f24500y = 1;
                    return ((zt.f) obj2).l(o0Var, this) == aVar2 ? aVar2 : b0Var;
                }
                if (i16 == 2) {
                    return b0Var;
                }
                if (i16 != 3) {
                    throw new bf.n();
                }
                Float f10 = (Float) serializable;
                if (f10 == f0.f27543a) {
                    throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
                }
                o0Var.h(null, f10);
                return b0Var;
            default:
                zt.f fVar = (zt.f) this.B;
                o0 o0Var2 = (o0) obj3;
                qq.a aVar3 = qq.a.COROUTINE_SUSPENDED;
                int i17 = this.f24500y;
                if (i17 != 0) {
                    if (i17 != 1) {
                        if (i17 == 2) {
                            t1.G(obj);
                        } else if (i17 != 3 && i17 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }
                    t1.G(obj);
                    return b0Var;
                }
                t1.G(obj);
                l0 l0Var = (l0) obj2;
                if (l0Var == i0.f27554a) {
                    this.f24500y = 1;
                    if (fVar.l(o0Var2, this) != aVar3) {
                        return b0Var;
                    }
                } else if (l0Var == i0.f27555b) {
                    y yVarF = o0Var2.f();
                    zt.y yVar = new zt.y(2, null);
                    this.f24500y = 2;
                    if (f0.h(yVarF, yVar, this) != aVar3) {
                    }
                } else {
                    y yVarF2 = o0Var2.f();
                    k0 k0Var = new k0(l0Var, null);
                    int i18 = s.f27592a;
                    yt.a aVar4 = yt.a.SUSPEND;
                    pq.i iVar = pq.i.f20621a;
                    zt.f fVarF = f0.f(f0.f(new xr.a(new au.l(k0Var, yVarF2, iVar, -2, aVar4), new d4.n(i11, cVar, i13))));
                    d dVar = new d(fVar, o0Var2, (Float) serializable, null);
                    this.f24500y = 4;
                    Object objL = f0.d(new au.l(new u0(dVar, cVar, i12), fVarF, iVar, -2, aVar4), 0).l(q.f2343a, this);
                    if (objL != aVar3) {
                        objL = b0Var;
                    }
                    if (objL != aVar3) {
                        objL = b0Var;
                    }
                    if (objL != aVar3) {
                        return b0Var;
                    }
                }
                return aVar3;
                this.f24500y = 3;
                if (fVar.l(o0Var2, this) != aVar3) {
                    return b0Var;
                }
                return aVar3;
        }
    }

    @Override // ar.n
    public final Object w(Object obj, Object obj2) {
        switch (this.f24499x) {
            case 0:
                return ((d) o((t) obj, (pq.c) obj2)).q(b0.f15562a);
            case 1:
                return ((d) o((h0) obj, (pq.c) obj2)).q(b0.f15562a);
            default:
                return ((d) o((t) obj, (pq.c) obj2)).q(b0.f15562a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(zt.f fVar, o0 o0Var, Float f10, pq.c cVar) {
        super(2, cVar);
        this.f24499x = 1;
        this.D = fVar;
        this.E = o0Var;
        this.F = f10;
    }
}
