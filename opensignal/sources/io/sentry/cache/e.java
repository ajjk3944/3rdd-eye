package io.sentry.cache;

import a5.d0;
import ak.u;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import androidx.media3.common.h1;
import br.l;
import ch.n;
import com.google.android.exoplayer2.ui.PlayerView;
import com.google.android.gms.internal.measurement.e5;
import com.staircase3.opensignal.activities.MainActivity;
import com.staircase3.opensignal.goldstar.persistence.OpensignalDatabase_Impl;
import com.staircase3.opensignal.goldstar.videotest.result.VideoResultActivity;
import com.staircase3.opensignal.goldstar.videotest.test.VideoTestActivity;
import com.staircase3.opensignal.goldstar.widget.NetworkInfoView;
import com.staircase3.opensignal.models.NetworkUiState;
import com.survicate.surveys.presentation.matrix.micro.MicroSurveyPointMatrixAnswerItem;
import d5.w;
import d5.z;
import dd.h;
import g4.j;
import h7.h0;
import io.sentry.b5;
import io.sentry.c4;
import io.sentry.i1;
import io.sentry.o6;
import io.sentry.protocol.t;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import kf.g;
import kg.m;
import mq.b0;
import mq.o;
import o5.p0;
import on.y;
import p.v2;
import pb.q;
import ph.i;
import ph.k;
import qb.p;
import rb.v;
import u5.x;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12129a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f12130d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f12131g;

    public /* synthetic */ e(Object obj, int i10, Object obj2) {
        this.f12129a = i10;
        this.f12130d = obj;
        this.f12131g = obj2;
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11;
        OpensignalDatabase_Impl opensignalDatabase_Impl;
        i1 i1VarZ;
        boolean z10 = false;
        switch (this.f12129a) {
            case 0:
                ((f) this.f12130d).e((Map) this.f12131g, "tags.json");
                return;
            case 1:
                f fVar = (f) this.f12130d;
                try {
                    ((io.sentry.cache.tape.f) fVar.f12134b.a()).b((io.sentry.e) this.f12131g);
                    return;
                } catch (IOException e4) {
                    fVar.f12133a.getLogger().g(b5.ERROR, "Failed to add breadcrumb to file queue", e4);
                    return;
                }
            case 2:
                ((f) this.f12130d).e((io.sentry.protocol.c) this.f12131g, "contexts.json");
                return;
            case 3:
                ((f) this.f12130d).e((t) this.f12131g, "replay.json");
                return;
            case 4:
                f fVar2 = (f) this.f12130d;
                String str = (String) this.f12131g;
                if (str == null) {
                    fVar2.a("transaction.json");
                    return;
                } else {
                    fVar2.e(str, "transaction.json");
                    return;
                }
            case j.STRING_FIELD_NUMBER /* 5 */:
                f fVar3 = (f) this.f12130d;
                try {
                    ((Runnable) this.f12131g).run();
                    return;
                } catch (Throwable th2) {
                    fVar3.f12133a.getLogger().g(b5.ERROR, "Serialization task failed", th2);
                    return;
                }
            case j.STRING_SET_FIELD_NUMBER /* 6 */:
                ip.b bVar = (ip.b) this.f12130d;
                MicroSurveyPointMatrixAnswerItem microSurveyPointMatrixAnswerItem = (MicroSurveyPointMatrixAnswerItem) this.f12131g;
                l.e(bVar, "this$0");
                bVar.q(microSurveyPointMatrixAnswerItem);
                return;
            case j.DOUBLE_FIELD_NUMBER /* 7 */:
                ((j3.b) this.f12130d).i((Typeface) this.f12131g);
                return;
            case j.BYTES_FIELD_NUMBER /* 8 */:
                bk.f fVar4 = (bk.f) this.f12130d;
                u uVar = (u) this.f12131g;
                l.e(fVar4, "this$0");
                l.e(uVar, "$deviceLocation");
                xi.u uVar2 = (xi.u) fVar4.f2812l;
                if (uVar2 != null) {
                    n.b("SdkLocationRepository", "onLocationReceived time: " + uVar.f725e);
                    synchronized (uVar2) {
                        uVar2.i(uVar);
                    }
                    return;
                }
                return;
            case 9:
                k5.b bVar2 = (k5.b) this.f12130d;
                Uri uri = (Uri) this.f12131g;
                bVar2.E = false;
                bVar2.b(uri);
                return;
            case 10:
                v2 v2Var = (v2) this.f12130d;
                ((g) v2Var.f20201d).h((String) v2Var.f20203r, (List) this.f12131g);
                return;
            case 11:
                ((kg.j) this.f12130d).a((Intent) this.f12131g);
                return;
            case 12:
                m mVar = (m) this.f12130d;
                h hVar = (h) this.f12131g;
                try {
                    hVar.a(mVar.b());
                    return;
                } catch (Exception e10) {
                    hVar.f7294a.n(e10);
                    return;
                }
            case 13:
                lm.a aVar = (lm.a) this.f12130d;
                i iVar = (i) this.f12131g;
                PlayerView playerView = aVar.f15547b;
                if (playerView != null) {
                    playerView.setPlayer(iVar.f20572a);
                    return;
                }
                return;
            case 14:
                VideoResultActivity videoResultActivity = (VideoResultActivity) this.f12130d;
                NetworkUiState networkUiState = (NetworkUiState) this.f12131g;
                io.sentry.t tVar = videoResultActivity.W;
                if (tVar == null) {
                    l.l("videoResultWidget");
                    throw null;
                }
                l.e(networkUiState, "networkUiState");
                al.g gVar = (al.g) tVar.f12736a;
                if (gVar != null) {
                    ((NetworkInfoView) gVar.k).setNetworkInformation(networkUiState);
                    return;
                } else {
                    l.l("binding");
                    throw null;
                }
            case 15:
                VideoTestActivity videoTestActivity = (VideoTestActivity) this.f12130d;
                NetworkUiState networkUiState2 = (NetworkUiState) this.f12131g;
                NetworkInfoView networkInfoView = videoTestActivity.U;
                if (networkInfoView != null) {
                    networkInfoView.setNetworkInformation(networkUiState2);
                    return;
                } else {
                    l.l("networkInfoView");
                    throw null;
                }
            case 16:
                p0 p0Var = (p0) this.f12130d;
                x xVar = (x) this.f12131g;
                p0Var.T = p0Var.M == null ? xVar : new u5.n(-9223372036854775807L);
                p0Var.U = xVar.e();
                if (!p0Var.f19013a0 && xVar.e() == -9223372036854775807L) {
                    z10 = true;
                }
                p0Var.V = z10;
                p0Var.W = z10 ? 7 : 1;
                p0Var.B.b(p0Var.U, xVar.b(), p0Var.V);
                if (p0Var.Q) {
                    return;
                }
                p0Var.x();
                return;
            case 17:
                oh.e eVar = (oh.e) this.f12130d;
                k kVar = (k) this.f12131g;
                synchronized (eVar.f19458r) {
                    i10 = eVar.f19459x;
                }
                kVar.a(i10);
                return;
            case 18:
                io.sentry.k kVar2 = (io.sentry.k) this.f12130d;
                String str2 = (String) this.f12131g;
                l.e(kVar2, "this$0");
                l.e(str2, "$surveyId");
                Iterator it = kVar2.Y().iterator();
                while (it.hasNext()) {
                    kn.c cVar = (kn.c) it.next();
                    cVar.getClass();
                    an.a aVar2 = cVar.f14450b.f14456e;
                    String str3 = cVar.f14451c;
                    ArrayList arrayList = cVar.f14449a;
                    l.e(arrayList, "<this>");
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Iterator it2 = arrayList.iterator();
                    int i12 = 0;
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        int i13 = i12 + 1;
                        if (i12 < 0) {
                            e5.Q();
                            throw null;
                        }
                        on.l lVar = (on.l) next;
                        if (!linkedHashMap.containsKey("survey_name")) {
                            linkedHashMap.put("survey_name", lVar.f19648d);
                        }
                        String strH = h0.b.h(i13, "question_");
                        String str4 = lVar.f19650f;
                        y yVar = lVar.f19651g;
                        linkedHashMap.put(strH, str4);
                        String str5 = yVar.f19653a;
                        String str6 = yVar.f19656d;
                        int iHashCode = str5.hashCode();
                        if (iHashCode != 3148996) {
                            if (iHashCode == 3556653) {
                                linkedHashMap.put(h0.b.h(i13, "answer_"), String.valueOf(str6));
                                break;
                            } else {
                                linkedHashMap.put(h0.b.h(i13, "answer_"), String.valueOf(str6));
                                break;
                            }
                        } else if (str5.equals("form")) {
                            String strValueOf = String.valueOf(str6);
                            if (strValueOf.length() > 0) {
                                int i14 = 6;
                                Iterator it3 = tt.l.N0(strValueOf, new String[]{"|"}, 6).iterator();
                                while (it3.hasNext()) {
                                    List listN0 = tt.l.N0((String) it3.next(), new String[]{":"}, i14);
                                    String string = tt.l.a1((String) o.z0(listN0)).toString();
                                    if (!l.a(string, "null")) {
                                        linkedHashMap.put("answer_" + i13 + '_' + tt.l.a1((String) o.r0(listN0)).toString(), string);
                                    }
                                    i14 = 6;
                                }
                            }
                        }
                        i12 = i13;
                    }
                    aVar2.getClass();
                    l.e(str3, "entityId");
                    aVar2.f882a.d("CATEGORY_OSCA", "osca_survey_completed", b0.S(b0.R(new lq.l("entity_id", str3), new lq.l("connection", aVar2.b())), linkedHashMap));
                    al.c.m(cVar);
                }
                return;
            case 19:
                pf.c cVar2 = (pf.c) this.f12130d;
                CountDownLatch countDownLatch = (CountDownLatch) this.f12131g;
                try {
                    m9.o.a().f16374d.k(((m9.i) cVar2.f20482h.f3974d).b(j9.d.HIGHEST), 1);
                } catch (Exception unused) {
                }
                countDownLatch.countDown();
                return;
            case 20:
                p pVar = (p) this.f12130d;
                q qVar = (q) this.f12131g;
                synchronized (pVar.f20808d) {
                    i11 = pVar.f20805a;
                }
                qVar.a(i11);
                return;
            case 21:
                q3.a aVar3 = (q3.a) this.f12130d;
                v vVar = (v) this.f12131g;
                rb.u uVar3 = (rb.u) aVar3.f20680g;
                int i15 = qb.v.f20828a;
                uVar3.onVideoSizeChanged(vVar);
                return;
            case 22:
                q3.a aVar4 = (q3.a) this.f12130d;
                String str7 = (String) this.f12131g;
                rb.u uVar4 = (rb.u) aVar4.f20680g;
                int i16 = qb.v.f20828a;
                uVar4.onVideoDecoderReleased(str7);
                return;
            case 23:
                q3.a aVar5 = (q3.a) this.f12130d;
                Exception exc = (Exception) this.f12131g;
                rb.u uVar5 = (rb.u) aVar5.f20680g;
                int i17 = qb.v.f20828a;
                uVar5.onVideoCodecError(exc);
                return;
            case 24:
                MainActivity mainActivity = (MainActivity) this.f12130d;
                Context context = (Context) this.f12131g;
                boolean z11 = MainActivity.f5997x0;
                bm.d dVarL = ic.a.s(context).l();
                bm.e eVarN = ic.a.s(context).n();
                hn.b bVar3 = mainActivity.f6017r0;
                OpensignalDatabase_Impl opensignalDatabase_Impl2 = (OpensignalDatabase_Impl) eVarN.f2830d;
                i1 i1VarD = c4.d();
                i1 i1VarZ2 = i1VarD != null ? i1VarD.z("db.sql.room", "com.staircase3.opensignal.goldstar.persistence.VideoTestResultDao") : null;
                i7.n nVarB = i7.n.b("SELECT count(*) FROM video_test");
                opensignalDatabase_Impl2.b();
                Cursor cursorK = opensignalDatabase_Impl2.k(nVarB);
                try {
                    long j = cursorK.moveToFirst() ? cursorK.getLong(0) : 0L;
                    cursorK.close();
                    if (i1VarZ2 != null) {
                        i1VarZ2.k();
                    }
                    nVarB.i();
                    bVar3.f10855d = j;
                    hn.b bVar4 = mainActivity.f6017r0;
                    OpensignalDatabase_Impl opensignalDatabase_Impl3 = (OpensignalDatabase_Impl) dVarL.f2826d;
                    i1 i1VarD2 = c4.d();
                    i1 i1VarZ3 = i1VarD2 != null ? i1VarD2.z("db.sql.room", "com.staircase3.opensignal.goldstar.persistence.SpeedTestResultDao") : null;
                    i7.n nVarB2 = i7.n.b("SELECT count(*) FROM speed_test");
                    opensignalDatabase_Impl3.b();
                    Cursor cursorK2 = opensignalDatabase_Impl3.k(nVarB2);
                    try {
                        long j7 = cursorK2.moveToFirst() ? cursorK2.getLong(0) : 0L;
                        cursorK2.close();
                        if (i1VarZ3 != null) {
                            i1VarZ3.k();
                        }
                        nVarB2.i();
                        bVar4.f10854c = j7;
                        return;
                    } catch (Throwable th3) {
                        cursorK2.close();
                        if (i1VarZ3 != null) {
                            i1VarZ3.k();
                        }
                        nVarB2.i();
                        throw th3;
                    }
                } catch (Throwable th4) {
                    cursorK.close();
                    if (i1VarZ2 != null) {
                        i1VarZ2.k();
                    }
                    nVarB.i();
                    throw th4;
                }
            case 25:
                rk.k kVar3 = (rk.k) this.f12130d;
                ArrayList arrayList2 = (ArrayList) this.f12131g;
                oh.p pVar2 = kVar3.f21639d;
                l.e(arrayList2, "displayedItems");
                opensignalDatabase_Impl = (OpensignalDatabase_Impl) ((bm.d) pVar2.f19481d).f2826d;
                i1 i1VarD3 = c4.d();
                i1VarZ = i1VarD3 != null ? i1VarD3.z("db.sql.room", "com.staircase3.opensignal.goldstar.persistence.SpeedTestResultDao") : null;
                opensignalDatabase_Impl.b();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("UPDATE speed_test SET seen = 1 WHERE id IN (");
                e5.d(arrayList2.size(), sb2);
                sb2.append(")");
                o7.e eVarC = opensignalDatabase_Impl.c(sb2.toString());
                Iterator it4 = arrayList2.iterator();
                int i18 = 1;
                while (it4.hasNext()) {
                    eVarC.A(i18, ((Integer) it4.next()).intValue());
                    i18++;
                }
                opensignalDatabase_Impl.a();
                opensignalDatabase_Impl.a();
                o7.a aVarI = opensignalDatabase_Impl.g().I();
                opensignalDatabase_Impl.f6078d.c(aVarI);
                if (aVarI.c0()) {
                    aVarI.E();
                } else {
                    aVarI.j();
                }
                try {
                    eVarC.n();
                    opensignalDatabase_Impl.g().I().C();
                    if (i1VarZ != null) {
                        i1VarZ.a(o6.OK);
                    }
                    opensignalDatabase_Impl.j();
                    if (i1VarZ != null) {
                        i1VarZ.k();
                        return;
                    }
                    return;
                } finally {
                    opensignalDatabase_Impl.j();
                    if (i1VarZ != null) {
                        i1VarZ.k();
                    }
                }
            case 26:
                rk.p pVar3 = (rk.p) this.f12130d;
                ArrayList arrayList3 = (ArrayList) this.f12131g;
                h0 h0Var = pVar3.f21654d;
                l.e(arrayList3, "displayedItems");
                opensignalDatabase_Impl = (OpensignalDatabase_Impl) ((bm.e) h0Var.f10078a).f2830d;
                i1 i1VarD4 = c4.d();
                i1VarZ = i1VarD4 != null ? i1VarD4.z("db.sql.room", "com.staircase3.opensignal.goldstar.persistence.VideoTestResultDao") : null;
                opensignalDatabase_Impl.b();
                StringBuilder sb3 = new StringBuilder();
                sb3.append("UPDATE video_test SET seen = 1 WHERE id IN (");
                e5.d(arrayList3.size(), sb3);
                sb3.append(")");
                o7.e eVarC2 = opensignalDatabase_Impl.c(sb3.toString());
                Iterator it5 = arrayList3.iterator();
                int i19 = 1;
                while (it5.hasNext()) {
                    eVarC2.A(i19, ((Integer) it5.next()).intValue());
                    i19++;
                }
                opensignalDatabase_Impl.a();
                opensignalDatabase_Impl.a();
                o7.a aVarI2 = opensignalDatabase_Impl.g().I();
                opensignalDatabase_Impl.f6078d.c(aVarI2);
                if (aVarI2.c0()) {
                    aVarI2.E();
                } else {
                    aVarI2.j();
                }
                try {
                    eVarC2.n();
                    opensignalDatabase_Impl.g().I().C();
                    if (i1VarZ != null) {
                        i1VarZ.a(o6.OK);
                    }
                    if (i1VarZ != null) {
                        return;
                    } else {
                        return;
                    }
                } finally {
                    opensignalDatabase_Impl.j();
                    if (i1VarZ != null) {
                        i1VarZ.k();
                    }
                }
            case 27:
                q3.a aVar6 = (q3.a) this.f12130d;
                h1 h1Var = (h1) this.f12131g;
                w wVar = (w) aVar6.f20680g;
                int i20 = d0.f105a;
                z zVar = wVar.f7095a;
                zVar.N0 = h1Var;
                zVar.I.f(25, new bf.a(11, h1Var));
                return;
            case 28:
                q3.a aVar7 = (q3.a) this.f12130d;
                Exception exc2 = (Exception) this.f12131g;
                w wVar2 = (w) aVar7.f20680g;
                int i21 = d0.f105a;
                wVar2.f7095a.O.onVideoCodecError(exc2);
                return;
            default:
                q3.a aVar8 = (q3.a) this.f12130d;
                String str8 = (String) this.f12131g;
                w wVar3 = (w) aVar8.f20680g;
                int i22 = d0.f105a;
                wVar3.f7095a.O.onVideoDecoderReleased(str8);
                return;
        }
    }
}
