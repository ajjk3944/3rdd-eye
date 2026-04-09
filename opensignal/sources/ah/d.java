package ah;

import android.content.Context;
import android.content.SharedPreferences;
import android.telephony.CellLocation;
import android.telephony.ServiceState;
import android.telephony.SignalStrength;
import android.telephony.TelephonyDisplayInfo;
import androidx.lifecycle.v0;
import as.w;
import bh.k;
import br.l;
import br.n;
import br.x;
import com.google.android.gms.internal.measurement.e5;
import com.opensignal.sdk.data.telephony.TelephonyPhoneStateListener;
import com.survicate.surveys.infrastructure.network.contacts.BackendTargetingRequestBody;
import com.survicate.surveys.infrastructure.network.contacts.SurveyInteractionsRequestBody;
import com.survicate.surveys.infrastructure.network.contacts.SurvicateContactsApi;
import com.survicate.surveys.infrastructure.network.contacts.UserAttributesRequestBody;
import com.survicate.surveys.infrastructure.network.contacts.UserEventsRequestBody;
import com.survicate.surveys.infrastructure.network.contacts.UserVerificationRequestBody;
import e1.p;
import es.s;
import ft.i;
import g4.j;
import h7.h0;
import ht.c1;
import ht.p0;
import ht.z;
import ir.f0;
import ir.y;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import lq.b0;
import lr.d0;
import lr.k1;
import lr.l1;
import lr.m1;
import lr.x1;
import ls.q0;
import ls.t;
import mq.o;
import o2.g;
import p.v2;
import rr.u;
import sr.h;

/* loaded from: classes.dex */
public final class d extends n implements ar.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f368d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f369g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f370r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, int i10, Object obj2) {
        super(0);
        this.f368d = i10;
        this.f369g = obj;
        this.f370r = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v112, types: [java.lang.Object, lq.h] */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.Object, lq.h] */
    /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.Object, lq.h] */
    /* JADX WARN: Type inference failed for: r1v70, types: [ar.a, br.n] */
    @Override // ar.a
    public final Object c() throws IOException {
        y yVar;
        switch (this.f368d) {
            case 0:
                ((b) this.f369g).a((k) this.f370r);
                return b0.f15562a;
            case 1:
                am.f fVar = (am.f) this.f369g;
                am.e eVar = (am.e) this.f370r;
                ir.d dVarB = x.f2918a.b(zl.a.class);
                jv.a aVarY = e5.y(fVar);
                l.e(aVarY, "<this>");
                uv.b bVarB = aVarY.f13863a.b();
                bm.e eVar2 = (bm.e) eVar.c();
                v0 v0Var = (v0) eVar2.f2830d;
                Object obj = eVar2.f2831g;
                h0 h0Var = new h0();
                h0Var.f10078a = dVarB;
                i4.b bVar = new i4.b(bVarB, h0Var);
                v4.a aVar = v4.a.f23842b;
                l.e(aVar, "defaultCreationExtras");
                js.e eVar3 = new js.e(v0Var, bVar, aVar);
                ir.d dVarH = f0.H(f0.D(dVarB));
                String strN = dVarH.n();
                if (strN != null) {
                    return eVar3.d0(dVarH, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strN));
                }
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            case 2:
                ht.b0 b0VarQ = ((ds.a) ((cj.a) this.f369g).f3974d).f7458o.n().i(((bs.c) this.f370r).f2925a).q();
                l.d(b0VarQ, "c.module.builtIns.getBui…qName(fqName).defaultType");
                return b0VarQ;
            case 3:
                SurvicateContactsApi survicateContactsApi = (SurvicateContactsApi) this.f369g;
                String strLoadUrlResponse = survicateContactsApi.httpClient.loadUrlResponse(survicateContactsApi.requestFactory.createBackendTargetingRequest((BackendTargetingRequestBody) this.f370r));
                if (strLoadUrlResponse != null) {
                    return survicateContactsApi.serializer.deserializeBackendTargetingResult(strLoadUrlResponse);
                }
                throw new IOException("Failed to check backend targeting: empty API response");
            case 4:
                SurvicateContactsApi survicateContactsApi2 = (SurvicateContactsApi) this.f369g;
                return survicateContactsApi2.httpClient.loadUrlResponse(survicateContactsApi2.requestFactory.createSurveyInteractionsRequest((SurveyInteractionsRequestBody) this.f370r));
            case j.STRING_FIELD_NUMBER /* 5 */:
                SurvicateContactsApi survicateContactsApi3 = (SurvicateContactsApi) this.f369g;
                return survicateContactsApi3.httpClient.loadUrlResponse(survicateContactsApi3.requestFactory.createUserAttributesRequest((UserAttributesRequestBody) this.f370r));
            case j.STRING_SET_FIELD_NUMBER /* 6 */:
                SurvicateContactsApi survicateContactsApi4 = (SurvicateContactsApi) this.f369g;
                return survicateContactsApi4.httpClient.loadUrlResponse(survicateContactsApi4.requestFactory.createUserEventsRequest((UserEventsRequestBody) this.f370r));
            case j.DOUBLE_FIELD_NUMBER /* 7 */:
                SurvicateContactsApi survicateContactsApi5 = (SurvicateContactsApi) this.f369g;
                return survicateContactsApi5.httpClient.loadUrlResponse(survicateContactsApi5.requestFactory.createUserVerificationRequest((UserVerificationRequestBody) this.f370r));
            case j.BYTES_FIELD_NUMBER /* 8 */:
                cj.a aVar2 = (cj.a) this.f369g;
                h annotations = ((rr.h) this.f370r).getAnnotations();
                l.e(aVar2, "<this>");
                l.e(annotations, "additionalAnnotations");
                return ((ds.a) aVar2.f3974d).f7460q.b((w) aVar2.f3977x.getValue(), annotations);
            case 9:
                cj.a aVar3 = (cj.a) this.f369g;
                h hVar = (h) this.f370r;
                l.e(aVar3, "<this>");
                l.e(hVar, "additionalAnnotations");
                return ((ds.a) aVar3.f3974d).f7460q.b((w) aVar3.f3977x.getValue(), hVar);
            case 10:
                return new s(((ds.d) this.f369g).f7474a, (xr.y) this.f370r);
            case 11:
                al.b bVar2 = (al.b) ((v2) this.f369g).f20201d;
                return ((dt.k) bVar2.f810b).f7497e.h((q0) this.f370r, (ns.f) bVar2.f811c);
            case 12:
                ((br.w) this.f369g).f2917a = ((p) this.f370r).d0();
                return b0.f15562a;
            case 13:
                g gVar = ((ds.a) ((cj.a) this.f369g).f3974d).f7447b;
                qs.c cVar = ((es.x) this.f370r).f8338o.f23629y;
                gVar.getClass();
                l.e(cVar, "packageFqName");
                return null;
            case 14:
                SharedPreferences sharedPreferences = ((Context) this.f369g).getSharedPreferences((String) this.f370r, 0);
                l.d(sharedPreferences, "context.getSharedPrefere…me, Context.MODE_PRIVATE)");
                return sharedPreferences;
            case 15:
                ((TelephonyPhoneStateListener) this.f369g).d((List) this.f370r);
                return b0.f15562a;
            case 16:
                ((TelephonyPhoneStateListener) this.f369g).e((CellLocation) this.f370r);
                return b0.f15562a;
            case 17:
                ((TelephonyPhoneStateListener) this.f369g).onDisplayInfoChanged((TelephonyDisplayInfo) this.f370r);
                return b0.f15562a;
            case 18:
                ((TelephonyPhoneStateListener) this.f369g).f((ServiceState) this.f370r);
                return b0.f15562a;
            case 19:
                ((TelephonyPhoneStateListener) this.f369g).g((SignalStrength) this.f370r);
                return b0.f15562a;
            case 20:
                i iVar = (i) this.f369g;
                return o.Q0(((dt.k) iVar.H.f810b).f7497e.p(iVar.R, (t) this.f370r));
            case 21:
                Context context = (Context) this.f369g;
                l.d(context, "applicationContext");
                String str = (String) ((g4.a) this.f370r).f9325a;
                l.e(str, "name");
                return a.a.h(context, str.concat(".preferences_pb"));
            case 22:
                jt.f fVar2 = (jt.f) this.f369g;
                lt.d dVar = (lt.d) ((z) this.f370r).f10959g.c();
                fVar2.getClass();
                l.e(dVar, "type");
                return (ht.x) dVar;
            case 23:
                ((io.sentry.android.sqlite.d) this.f369g).f12053a.l((String) this.f370r);
                return b0.f15562a;
            case 24:
                return ((io.sentry.android.sqlite.d) this.f369g).f12053a.t((o7.d) this.f370r);
            case 25:
                Iterable iterable = (List) ((jt.i) this.f369g).f13854e.getValue();
                if (iterable == null) {
                    iterable = mq.w.f16945a;
                }
                jt.f fVar3 = (jt.f) this.f370r;
                ArrayList arrayList = new ArrayList(mq.p.a0(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((c1) it.next()).q0(fVar3));
                }
                return arrayList;
            case 26:
                jv.a.b(((jv.b) this.f369g).f13866a, (List) this.f370r);
                return b0.f15562a;
            case 27:
                lr.f0 f0Var = (lr.f0) this.f369g;
                d0 d0Var = f0Var.f15612x;
                String str2 = (String) this.f370r;
                String str3 = f0Var.f15613y;
                d0Var.getClass();
                l.e(str3, "signature");
                Collection collectionQ0 = str2.equals("<init>") ? o.Q0(d0Var.g()) : d0Var.h(qs.g.e(str2));
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : collectionQ0) {
                    if (l.a(x1.c((u) obj2).i(), str3)) {
                        arrayList2.add(obj2);
                    }
                }
                if (arrayList2.size() == 1) {
                    return (u) o.I0(arrayList2);
                }
                String strX0 = o.x0(collectionQ0, "\n", null, null, lr.b.B, 30);
                StringBuilder sb2 = new StringBuilder("Function '");
                sb2.append(str2);
                sb2.append("' (JVM signature: ");
                sb2.append(str3);
                sb2.append(") not resolved in ");
                sb2.append(d0Var);
                sb2.append(':');
                sb2.append(strX0.length() == 0 ? " no members found" : "\n".concat(strX0));
                throw new lq.k(sb2.toString(), 1);
            case 28:
                m1 m1Var = (m1) this.f369g;
                List listL = m1Var.f15644a.L();
                if (listL.isEmpty()) {
                    return mq.w.f16945a;
                }
                lq.h hVarE = kc.f.E(lq.j.PUBLICATION, new l1(m1Var, 0));
                ar.a aVar4 = (ar.a) this.f370r;
                ArrayList arrayList3 = new ArrayList(mq.p.a0(listL, 10));
                int i10 = 0;
                for (Object obj3 : listL) {
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        e5.Q();
                        throw null;
                    }
                    p0 p0Var = (p0) obj3;
                    if (p0Var.c()) {
                        yVar = y.f12942c;
                    } else {
                        ht.x xVarB = p0Var.b();
                        l.d(xVarB, "typeProjection.type");
                        m1 m1Var2 = new m1(xVarB, aVar4 != null ? new io.sentry.android.sqlite.a(i10, m1Var, hVarE, 1) : null);
                        int i12 = k1.f15631a[p0Var.a().ordinal()];
                        if (i12 == 1) {
                            yVar = new y(ir.z.INVARIANT, m1Var2);
                        } else if (i12 == 2) {
                            yVar = new y(ir.z.IN, m1Var2);
                        } else {
                            if (i12 != 3) {
                                throw new bf.n();
                            }
                            yVar = new y(ir.z.OUT, m1Var2);
                        }
                    }
                    arrayList3.add(yVar);
                    i10 = i11;
                }
                return arrayList3;
            default:
                Class cls = (Class) this.f369g;
                Map map = (Map) this.f370r;
                StringBuilder sb3 = new StringBuilder();
                sb3.append('@');
                sb3.append(cls.getCanonicalName());
                o.w0(map.entrySet(), sb3, ", ", "(", ")", mr.e.f16963d, 48);
                String string = sb3.toString();
                l.d(string, "StringBuilder().apply(builderAction).toString()");
                return string;
        }
    }
}
