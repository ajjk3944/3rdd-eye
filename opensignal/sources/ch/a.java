package ch;

import a5.d0;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.os.Bundle;
import android.os.Looper;
import android.os.Process;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.o;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.analytics.AnalyticsCollector;
import com.google.android.exoplayer2.s0;
import com.staircase3.opensignal.goldstar.persistence.OpensignalDatabase;
import com.staircase3.opensignal.goldstar.persistence.OpensignalDatabase_Impl;
import com.staircase3.opensignal.goldstar.persistence.VideoTestResult;
import com.staircase3.opensignal.goldstar.speedtest.result.SpeedResultActivity;
import com.staircase3.opensignal.goldstar.speedtest.result.SpeedTestResult;
import com.staircase3.opensignal.models.NetworkUiState;
import com.staircase3.opensignal.models.PlaceType;
import d5.w;
import i.g0;
import io.sentry.android.core.r;
import io.sentry.android.core.v0;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.b5;
import io.sentry.c4;
import io.sentry.i1;
import io.sentry.k6;
import io.sentry.n6;
import io.sentry.ndk.NativeScope;
import io.sentry.o6;
import io.sentry.p3;
import io.sentry.protocol.t;
import io.sentry.x5;
import ir.f0;
import j4.p;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import lq.q;
import o5.z;
import oe.e0;
import org.json.JSONObject;
import rb.u;
import ya.a0;
import ya.b0;
import ya.v;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3764a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3765d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f3766g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f3767r;

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, int i10) {
        this.f3764a = i10;
        this.f3765d = obj;
        this.f3766g = obj2;
        this.f3767r = obj3;
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, lq.h] */
    @Override // java.lang.Runnable
    public final void run() throws Exception {
        String str;
        bm.d dVarL;
        OpensignalDatabase_Impl opensignalDatabase_Impl;
        com.staircase3.opensignal.utils.l lVar;
        JSONObject jSONObjectOptJSONObject;
        switch (this.f3764a) {
            case 0:
                d dVar = (d) this.f3765d;
                String str2 = (String) this.f3766g;
                ht.g gVar = (ht.g) this.f3767r;
                br.l.e(dVar, "this$0");
                br.l.e(str2, "$apiConfigSecret");
                Context contextD = dVar.d();
                boolean z10 = ah.f.f371a;
                l lVar2 = l.f3962t5;
                Context applicationContext = contextD.getApplicationContext();
                br.l.d(applicationContext, "getApplicationContext(...)");
                if (lVar2.f3775a == null) {
                    lVar2.f3775a = applicationContext;
                }
                a8.f fVarT0 = lVar2.t0();
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) fVarT0.f196b).getRunningAppProcesses();
                if (runningAppProcesses == null) {
                    str = null;
                } else {
                    for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                        if (runningAppProcessInfo.pid == Process.myPid()) {
                            str = runningAppProcessInfo.processName;
                        }
                    }
                    str = null;
                }
                String str3 = ((Context) fVarT0.f195a).getApplicationContext().getApplicationInfo().processName;
                br.l.d(str3, "processName");
                boolean zA = br.l.a(str, str3);
                n.b("BaseServiceLocator", "Device id on initialisation: ".concat(dVar.N().A0()));
                if (zA && dVar.f3786b5.compareAndSet(false, true)) {
                    cj.a aVarR = l.f3962t5.r();
                    ak.b bVar = ((js.e) aVarR.f3975g).e0(str2).f16857b;
                    String str4 = bVar != null ? bVar.f431e : null;
                    n.b("InternalCrashReporterImpl", c7.a.p("initialise: ", str4));
                    if (str4 != null && str4.length() != 0) {
                        try {
                            v0.b((Context) aVarR.f3974d, new r(3), new androidx.media3.exoplayer.trackselection.h(str4, 15, aVarR));
                            c4.j("ndc_vrs", "92.0.0");
                            c4.j("sdk_type", "new_sdk");
                            c4.j("sdk_flavor", "internal");
                        } catch (Exception e4) {
                            n.e("InternalCrashReporterImpl", e4);
                        }
                    }
                    if (((ak.g) dVar.n().f20680g).f529f.f449a.f486q != 2) {
                        if (dVar.f3933y2 == null) {
                            dVar.f3933y2 = new g0(dVar.r());
                        }
                        g0 g0Var = dVar.f3933y2;
                        if (g0Var == null) {
                            br.l.l("_crashCatcher");
                            throw null;
                        }
                        Thread.setDefaultUncaughtExceptionHandler(new oj.a(g0Var));
                    }
                    mj.h hVarE0 = dVar.E0().e0(str2);
                    bm.d dVarF0 = dVar.F0();
                    ak.b bVar2 = hVarE0.f16857b;
                    String str5 = hVarE0.f16856a;
                    if (str5 != null && bVar2 != null) {
                        if (!br.l.a(dVarF0.C(), str5)) {
                            n.b("SecureInfoRepository", "the encrypted key has changed. Updating.");
                            ((om.f) dVarF0.f2826d).u("sdk_secret", str5);
                        }
                        dVarF0.f2828r = bVar2;
                    }
                    dVar.n();
                    ((d) dVar.n().f20679d).U().u("sdk_version", "92.0.0");
                    dVar.Q0().q(false);
                    if (dVar.K2 == null) {
                        dVar.K2 = new uj.a(dVar.O(), dVar.Z(), dVar.E(), dVar.A(), dVar.Q(), dVar.n(), dVar.I());
                    }
                    if (dVar.K2 == null) {
                        br.l.l("_ipWatcher");
                        throw null;
                    }
                }
                n.b("BaseServiceLocator", "initialise() completed");
                gVar.c();
                return;
            case 1:
                cj.n nVar = (cj.n) this.f3765d;
                o oVar = (o) this.f3766g;
                o oVar2 = (o) this.f3767r;
                br.l.e(oVar2, "$commandParameters");
                n.b("CommandExecutor", "Run command ".concat(nVar.getClass().getSimpleName()));
                if (Looper.myLooper() == null) {
                    Looper.prepare();
                }
                nVar.run();
                n.b("CommandExecutor", "Run command finished for ".concat(nVar.getClass().getSimpleName()));
                oVar.Z0(oVar2);
                return;
            case 2:
                ((AnalyticsCollector) ((s0) this.f3765d).j).updateMediaPeriodQueueInfo(((e0) this.f3766g).d(), (v) this.f3767r);
                return;
            case 3:
                ((androidx.media3.exoplayer.analytics.AnalyticsCollector) ((s0) this.f3765d).j).updateMediaPeriodQueueInfo(((e0) this.f3766g).d(), (z) this.f3767r);
                return;
            case 4:
                io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) this.f3765d;
                androidx.media3.common.r rVar = (androidx.media3.common.r) this.f3766g;
                d5.d dVar2 = (d5.d) this.f3767r;
                w wVar = (w) cVar.f12354g;
                int i10 = d0.f105a;
                wVar.getClass();
                d5.z zVar = wVar.f7095a;
                zVar.f7128q0 = rVar;
                zVar.O.onAudioInputFormatChanged(rVar, dVar2);
                return;
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                br.w wVar2 = (br.w) this.f3765d;
                kg.r rVar2 = (kg.r) this.f3766g;
                ak.w wVar3 = (ak.w) this.f3767r;
                br.l.e(wVar2, "$testResult");
                br.l.e(rVar2, "this$0");
                br.l.e(wVar3, "$endpoint");
                wVar2.f2917a = rVar2.x((fh.g) wVar2.f2917a, wVar3);
                return;
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                bm.d dVar3 = (bm.d) this.f3765d;
                SpeedTestResult speedTestResult = (SpeedTestResult) this.f3766g;
                PlaceType placeType = (PlaceType) this.f3767r;
                OpensignalDatabase opensignalDatabaseS = ic.a.s((SpeedResultActivity) dVar3.f2826d);
                if (opensignalDatabaseS == null || (dVarL = opensignalDatabaseS.l()) == null) {
                    return;
                }
                long j = speedTestResult.f6098r;
                long j7 = speedTestResult.f6097g;
                long j10 = speedTestResult.f6099x;
                int intValue = placeType.getIntValue();
                bm.c cVar2 = (bm.c) dVarL.f2828r;
                opensignalDatabase_Impl = (OpensignalDatabase_Impl) dVarL.f2826d;
                i1 i1VarD = c4.d();
                i1VarZ = i1VarD != null ? i1VarD.z("db.sql.room", "com.staircase3.opensignal.goldstar.persistence.SpeedTestResultDao") : null;
                opensignalDatabase_Impl.b();
                OpensignalDatabase_Impl opensignalDatabase_Impl2 = (OpensignalDatabase_Impl) cVar2.f7547b;
                opensignalDatabase_Impl2.a();
                o7.e eVarC = ((AtomicBoolean) cVar2.f7548c).compareAndSet(false, true) ? (o7.e) ((q) cVar2.f7549d).getValue() : opensignalDatabase_Impl2.c("UPDATE speed_test SET place_type = ? WHERE ul_speed = ? AND dl_speed = ? AND latency = ?");
                eVarC.A(1, intValue);
                eVarC.A(2, j);
                eVarC.A(3, j7);
                eVarC.A(4, j10);
                try {
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
                        }
                        return;
                    } finally {
                        opensignalDatabase_Impl.j();
                        if (i1VarZ != null) {
                            i1VarZ.k();
                        }
                    }
                } finally {
                    cVar2.f(eVarC);
                }
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                io.sentry.android.ndk.b bVar3 = (io.sentry.android.ndk.b) this.f3765d;
                String str6 = (String) this.f3766g;
                String str7 = (String) this.f3767r;
                bVar3.f11825b.getClass();
                NativeScope.nativeSetTag(str6, str7);
                return;
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                fj.o oVar3 = (fj.o) this.f3765d;
                io.sentry.android.replay.viewhierarchy.f fVar = (io.sentry.android.replay.viewhierarchy.f) this.f3766g;
                AtomicBoolean atomicBoolean = (AtomicBoolean) oVar3.f8952m;
                x5 x5Var = (x5) oVar3.f8943b;
                Bitmap bitmap = (Bitmap) oVar3.f8948g;
                if (atomicBoolean.get() || bitmap.isRecycled()) {
                    x5Var.getLogger().m(b5.DEBUG, "PixelCopyStrategy is closed, skipping masking", new Object[0]);
                    return;
                }
                ArrayList arrayList = new ArrayList();
                Canvas canvas = new Canvas(bitmap);
                canvas.setMatrix((Matrix) oVar3.f8950i.getValue());
                fVar.a(new c7.b(oVar3, arrayList, canvas));
                x5Var.getReplayController().getClass();
                ((ReplayIntegration) oVar3.f8942a).V(bitmap);
                ((AtomicBoolean) oVar3.j).set(true);
                ((AtomicBoolean) oVar3.f8951l).set(false);
                return;
            case 9:
                io.sentry.cache.f fVar2 = (io.sentry.cache.f) this.f3765d;
                k6 k6Var = (k6) this.f3766g;
                p3 p3Var = (p3) this.f3767r;
                if (k6Var != null) {
                    fVar2.e(k6Var, "trace.json");
                    return;
                }
                io.sentry.k kVar = p3Var.N;
                k6 k6Var2 = new k6((t) kVar.f12397d, (n6) kVar.f12398g, "default", null);
                k6Var2.E = "auto";
                fVar2.e(k6Var2, "trace.json");
                return;
            case 10:
                j4.k kVar2 = (j4.k) this.f3765d;
                kc.f fVar3 = (kc.f) this.f3766g;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f3767r;
                try {
                    j4.q qVarL = f0.l(kVar2.f13220a);
                    if (qVarL == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    p pVar = (p) ((j4.g) qVarL.f10099b);
                    synchronized (pVar.f13232d) {
                        pVar.f13234f = threadPoolExecutor;
                    }
                    ((j4.g) qVarL.f10099b).a(new j4.j(fVar3, threadPoolExecutor));
                    return;
                } catch (Throwable th2) {
                    fVar3.J(th2);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 11:
                kg.h hVar = (kg.h) this.f3765d;
                Intent intent = (Intent) this.f3766g;
                dd.h hVar2 = (dd.h) this.f3767r;
                try {
                    hVar.b(intent);
                    return;
                } finally {
                    hVar2.a(null);
                }
            case 12:
                VideoTestResult videoTestResult = (VideoTestResult) this.f3765d;
                NetworkUiState networkUiState = (NetworkUiState) this.f3766g;
                OpensignalDatabase opensignalDatabase = (OpensignalDatabase) this.f3767r;
                if (networkUiState == null || (lVar = networkUiState.D) == null) {
                    lVar = com.staircase3.opensignal.utils.l.UNKNOWN;
                }
                videoTestResult.getClass();
                br.l.e(lVar, "<set-?>");
                videoTestResult.K = lVar;
                bm.e eVarN = opensignalDatabase.n();
                opensignalDatabase_Impl = (OpensignalDatabase_Impl) eVarN.f2830d;
                i1 i1VarD2 = c4.d();
                i1VarZ = i1VarD2 != null ? i1VarD2.z("db.sql.room", "com.staircase3.opensignal.goldstar.persistence.VideoTestResultDao") : null;
                opensignalDatabase_Impl.b();
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
                    bm.b bVar4 = (bm.b) eVarN.f2831g;
                    OpensignalDatabase_Impl opensignalDatabase_Impl3 = (OpensignalDatabase_Impl) bVar4.f7547b;
                    opensignalDatabase_Impl3.a();
                    o7.e eVarC2 = ((AtomicBoolean) bVar4.f7548c).compareAndSet(false, true) ? (o7.e) ((q) bVar4.f7549d).getValue() : opensignalDatabase_Impl3.c("INSERT OR ABORT INTO `video_test` (`id`,`time`,`bufferingTime`,`loadingTime`,`playbackTime`,`videoResolution`,`videoLength`,`testLength`,`latitude`,`longitude`,`networkType`,`networkProvider`,`networkSubtype`,`seen`,`network_generation`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                    try {
                        bVar4.g(eVarC2, videoTestResult);
                        eVarC2.j0();
                        bVar4.f(eVarC2);
                        opensignalDatabase_Impl.g().I().C();
                        if (i1VarZ != null) {
                            i1VarZ.a(o6.OK);
                        }
                        if (i1VarZ != null) {
                            return;
                        } else {
                            return;
                        }
                    } catch (Throwable th3) {
                        bVar4.f(eVarC2);
                        throw th3;
                    }
                } finally {
                    opensignalDatabase_Impl.j();
                    if (i1VarZ != null) {
                        i1VarZ.k();
                    }
                }
            case 13:
                ViewGroup viewGroup = (ViewGroup) this.f3765d;
                View view = (View) this.f3766g;
                o4.d dVar4 = (o4.d) this.f3767r;
                br.l.e(viewGroup, "$container");
                br.l.e(dVar4, "this$0");
                viewGroup.endViewTransition(view);
                ((o4.s0) dVar4.f18786c.f1504d).c(dVar4);
                return;
            case 14:
                o5.e0 e0Var = (o5.e0) this.f3765d;
                ((o5.f0) this.f3766g).onDownstreamFormatChanged(e0Var.f18922a, e0Var.f18923b, (o5.v) this.f3767r);
                return;
            case 15:
                og.h hVar3 = (og.h) this.f3765d;
                String str8 = (String) this.f3766g;
                pg.d dVar5 = (pg.d) this.f3767r;
                om.f fVar4 = hVar3.f19438a;
                we.b bVar5 = (we.b) ((eg.b) fVar4.f19554d).get();
                if (bVar5 == null) {
                    return;
                }
                JSONObject jSONObject = dVar5.f20502e;
                if (jSONObject.length() < 1) {
                    return;
                }
                JSONObject jSONObject2 = dVar5.f20499b;
                if (jSONObject2.length() >= 1 && (jSONObjectOptJSONObject = jSONObject.optJSONObject(str8)) != null) {
                    String strOptString = jSONObjectOptJSONObject.optString("choiceId");
                    if (strOptString.isEmpty()) {
                        return;
                    }
                    synchronized (((Map) fVar4.f19555g)) {
                        try {
                            if (!strOptString.equals(((Map) fVar4.f19555g).get(str8))) {
                                ((Map) fVar4.f19555g).put(str8, strOptString);
                                Bundle bundle = new Bundle();
                                bundle.putString("arm_key", str8);
                                bundle.putString("arm_value", jSONObject2.optString(str8));
                                bundle.putString("personalization_id", jSONObjectOptJSONObject.optString("personalizationId"));
                                bundle.putInt("arm_index", jSONObjectOptJSONObject.optInt("armIndex", -1));
                                bundle.putString("group", jSONObjectOptJSONObject.optString("group"));
                                we.c cVar3 = (we.c) bVar5;
                                cVar3.a("fp", "personalization_assignment", bundle);
                                Bundle bundle2 = new Bundle();
                                bundle2.putString("_fpid", strOptString);
                                cVar3.a("fp", "_fpc", bundle2);
                            }
                        } finally {
                        }
                    }
                    return;
                }
                return;
            case 16:
                q3.a aVar = (q3.a) this.f3765d;
                Format format = (Format) this.f3766g;
                z9.e eVar = (z9.e) this.f3767r;
                u uVar = (u) aVar.f20680g;
                int i11 = qb.v.f20828a;
                uVar.onVideoInputFormatChanged(format);
                uVar.onVideoInputFormatChanged(format, eVar);
                return;
            case 17:
                q3.a aVar2 = (q3.a) this.f3765d;
                androidx.media3.common.r rVar3 = (androidx.media3.common.r) this.f3766g;
                d5.d dVar6 = (d5.d) this.f3767r;
                w wVar4 = (w) aVar2.f20680g;
                int i12 = d0.f105a;
                wVar4.getClass();
                d5.z zVar2 = wVar4.f7095a;
                zVar2.f7127p0 = rVar3;
                zVar2.O.onVideoInputFormatChanged(rVar3, dVar6);
                return;
            case 18:
                ((wi.a) this.f3765d).onReceiveIntent((Context) this.f3766g, (Intent) this.f3767r);
                n.b("BaseBroadcastReceiver", "finishing pendingResult on thread: " + Thread.currentThread().getName() + "(id: " + Thread.currentThread().getId() + ')');
                return;
            case 19:
                xr.a aVar3 = (xr.a) this.f3765d;
                Format format2 = (Format) this.f3766g;
                z9.e eVar2 = (z9.e) this.f3767r;
                y9.j jVar = (y9.j) aVar3.f25483g;
                int i13 = qb.v.f20828a;
                jVar.onAudioInputFormatChanged(format2);
                jVar.onAudioInputFormatChanged(format2, eVar2);
                return;
            default:
                a0 a0Var = (a0) this.f3765d;
                ((b0) this.f3766g).onDownstreamFormatChanged(a0Var.f26035a, a0Var.f26036b, (ya.r) this.f3767r);
                return;
        }
    }
}
