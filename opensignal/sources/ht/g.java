package ht;

import android.content.Context;
import android.graphics.Matrix;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.os.Bundle;
import android.util.Range;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.ui.graphics.vector.VectorPainter;
import com.staircase3.opensignal.goldstar.persistence.OpensignalDatabase_Impl;
import com.staircase3.opensignal.goldstar.widget.NetworkInfoView;
import com.survicate.surveys.presentation.multiple.micro.MicroSurveyPointMultipleAnswerItem;
import com.survicate.surveys.presentation.multiple.micro.MicroSurveyPointMultipleContentView;
import com.survicate.surveys.presentation.widget.MicroSurvicateCommentField;
import h7.n1;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.b5;
import io.sentry.x5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import lr.m1;
import lr.o1;
import lr.q1;
import n0.x1;

/* loaded from: classes.dex */
public final class g extends br.n implements ar.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10900d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f10901g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i10, Object obj) {
        super(0);
        this.f10900d = i10;
        this.f10901g = obj;
    }

    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object, java.util.List] */
    @Override // ar.a
    public final Object c() {
        int i10 = this.f10900d;
        int iHashCode = 0;
        lq.b0 b0Var = lq.b0.f15562a;
        Object obj = this.f10901g;
        switch (i10) {
            case 0:
                return new f(((h) obj).b());
            case 1:
                return c.r((rr.r0) ((g0) obj).f10903b);
            case 2:
                return kt.k.c(kt.j.CANNOT_COMPUTE_ERASED_BOUND, ((io.sentry.internal.debugmeta.c) obj).toString());
            case 3:
                dt.w wVar = (dt.w) obj;
                return ((OpensignalDatabase_Impl) wVar.f7547b).c(wVar.a());
            case 4:
                ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new io.sentry.j0(2));
                br.l.b(scheduledExecutorServiceNewSingleThreadScheduledExecutor);
                x5 x5Var = ((ReplayIntegration) obj).f11829g;
                if (x5Var != null) {
                    return new io.sentry.android.replay.util.b(scheduledExecutorServiceNewSingleThreadScheduledExecutor, x5Var);
                }
                br.l.l("options");
                throw null;
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor2 = Executors.newSingleThreadScheduledExecutor(new io.sentry.j0(3));
                br.l.b(scheduledExecutorServiceNewSingleThreadScheduledExecutor2);
                return new io.sentry.android.replay.util.b(scheduledExecutorServiceNewSingleThreadScheduledExecutor2, ((io.sentry.android.replay.capture.c) obj).f11861a);
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                Matrix matrix = new Matrix();
                io.sentry.android.replay.t tVar = ((io.sentry.android.replay.screenshot.b) obj).f11958d;
                matrix.preScale(tVar.f11987c, tVar.f11988d);
                return matrix;
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                a8.f fVar = (a8.f) obj;
                io.sentry.android.replay.video.a aVar = (io.sentry.android.replay.video.a) fVar.f196b;
                x5 x5Var2 = (x5) fVar.f195a;
                String str = aVar.f12008f;
                int iIntValue = aVar.f12007e;
                try {
                    MediaCodecInfo.VideoCapabilities videoCapabilities = ((MediaCodec) fVar.f198d).getCodecInfo().getCapabilitiesForType(str).getVideoCapabilities();
                    if (!videoCapabilities.getBitrateRange().contains((Range<Integer>) Integer.valueOf(iIntValue))) {
                        x5Var2.getLogger().m(b5.DEBUG, "Encoder doesn't support the provided bitRate: " + iIntValue + ", the value will be clamped to the closest one", new Object[0]);
                        Object objClamp = videoCapabilities.getBitrateRange().clamp(Integer.valueOf(iIntValue));
                        br.l.d(objClamp, "clamp(...)");
                        iIntValue = ((Number) objClamp).intValue();
                    }
                } catch (Throwable th2) {
                    x5Var2.getLogger().g(b5.DEBUG, "Could not retrieve MediaCodec info", th2);
                }
                MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(str, aVar.f12004b, aVar.f12005c);
                br.l.d(mediaFormatCreateVideoFormat, "createVideoFormat(...)");
                mediaFormatCreateVideoFormat.setInteger("color-format", 2130708361);
                mediaFormatCreateVideoFormat.setInteger("bitrate", iIntValue);
                mediaFormatCreateVideoFormat.setFloat("frame-rate", aVar.f12006d);
                mediaFormatCreateVideoFormat.setInteger("i-frame-interval", 6);
                return mediaFormatCreateVideoFormat;
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                return Integer.valueOf(((io.sentry.android.sqlite.c) obj).f12049a.getCount());
            case 9:
                ip.d dVar = ((ip.b) obj).f12894h;
                if (dVar != null) {
                    dVar.c();
                }
                return b0Var;
            case 10:
                ip.e eVar = (ip.e) obj;
                eVar.g0().g(eVar.l());
                return b0Var;
            case 11:
                return a.a.r((jn.c) obj).f13863a.b().a(null, br.x.f2918a.b(com.staircase3.opensignal.utils.o.class), null);
            case 12:
                ar.a aVar2 = ((jt.i) obj).f13851b;
                if (aVar2 != null) {
                    return (List) aVar2.c();
                }
                return null;
            case 13:
                ((jv.b) obj).f13866a.a();
                return b0Var;
            case 14:
                kp.d dVar2 = (kp.d) ((kp.b) obj).f14468h;
                if (dVar2 != null) {
                    dVar2.c();
                }
                return b0Var;
            case 15:
                MicroSurveyPointMultipleContentView microSurveyPointMultipleContentView = (MicroSurveyPointMultipleContentView) obj;
                MicroSurveyPointMultipleAnswerItem microSurveyPointMultipleAnswerItem = microSurveyPointMultipleContentView.D;
                if (microSurveyPointMultipleAnswerItem != null) {
                    n1 n1VarI = microSurveyPointMultipleContentView.f6447g.I(microSurveyPointMultipleContentView.f6445a.indexOf(microSurveyPointMultipleAnswerItem) + 1);
                    kp.h hVar = n1VarI instanceof kp.h ? (kp.h) n1VarI : null;
                    MicroSurvicateCommentField microSurvicateCommentField = hVar != null ? hVar.f14483v : null;
                    if (microSurvicateCommentField != null && microSurvicateCommentField.isAttachedToWindow()) {
                        microSurvicateCommentField.d();
                    }
                }
                return b0Var;
            case 16:
                kp.e eVar2 = (kp.e) obj;
                eVar2.g0().g(eVar2.l());
                return b0Var;
            case 17:
                Object systemService = ((a2.d) obj).f29a.getContext().getSystemService("input_method");
                br.l.c(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                return (InputMethodManager) systemService;
            case 18:
                return new BaseInputConnection((View) ((i4.b) obj).f11196a, false);
            case 19:
                return q1.a(((lr.d0) obj).a());
            case 20:
                return new lr.g0((lr.h0) obj);
            case 21:
                return new lr.i0((lr.j0) obj);
            case 22:
                return new lr.k0((lr.l0) obj);
            case 23:
                List upperBounds = ((o1) obj).f15659a.getUpperBounds();
                br.l.d(upperBounds, "descriptor.upperBounds");
                ArrayList arrayList = new ArrayList(mq.p.a0(upperBounds, 10));
                Iterator it = upperBounds.iterator();
                while (it.hasNext()) {
                    arrayList.add(new m1((x) it.next(), null));
                }
                return arrayList;
            case 24:
                VectorPainter vectorPainter = (VectorPainter) obj;
                int i11 = vectorPainter.k;
                x1 x1Var = vectorPainter.f1144h;
                if (i11 == x1Var.l()) {
                    x1Var.n(x1Var.l() + 1);
                }
                return b0Var;
            case 25:
                AtomicBoolean atomicBoolean = mj.g.f16855b;
                Context context = (Context) obj;
                br.l.e(context, "context");
                ch.n.b("SdkApi", "serviceLocatorInitialised() called with: context = " + context);
                boolean z10 = ah.f.f371a;
                ch.l lVar = ch.l.f3962t5;
                Context applicationContext = context.getApplicationContext();
                br.l.d(applicationContext, "getApplicationContext(...)");
                if (lVar.f3775a == null) {
                    lVar.f3775a = applicationContext;
                }
                if (lVar.s0().D()) {
                    ch.n.b("SdkApi", "Consent has been given.");
                    lVar.k();
                    Bundle bundle = new Bundle();
                    ic.a.F(bundle, "EXECUTION_TYPE", cj.e.INITIALISE_TASKS);
                    cj.t.a(context, bundle);
                } else {
                    ch.n.b("SdkApi", "Consent has not been given.");
                }
                return b0Var;
            case 26:
                mp.e eVar3 = (mp.e) obj;
                eVar3.g0().g(eVar3.l());
                return b0Var;
            case 27:
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    String str2 = (String) entry.getKey();
                    Object value = entry.getValue();
                    iHashCode += (value instanceof boolean[] ? Arrays.hashCode((boolean[]) value) : value instanceof char[] ? Arrays.hashCode((char[]) value) : value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value instanceof short[] ? Arrays.hashCode((short[]) value) : value instanceof int[] ? Arrays.hashCode((int[]) value) : value instanceof float[] ? Arrays.hashCode((float[]) value) : value instanceof long[] ? Arrays.hashCode((long[]) value) : value instanceof double[] ? Arrays.hashCode((double[]) value) : value instanceof Object[] ? Arrays.hashCode((Object[]) value) : value.hashCode()) ^ (str2.hashCode() * 127);
                }
                return Integer.valueOf(iHashCode);
            case 28:
                return ((NetworkInfoView) obj).getKoin().f13863a.b().a(null, br.x.f2918a.b(com.staircase3.opensignal.utils.o.class), null);
            default:
                p7.i iVar = (p7.i) obj;
                Context context2 = iVar.f20329a;
                String str3 = iVar.f20330d;
                p7.c cVar = new p7.c();
                cVar.f20317a = null;
                p7.h hVar2 = new p7.h(context2, str3, cVar, iVar.f20331g);
                hVar2.setWriteAheadLoggingEnabled(iVar.f20333x);
                return hVar2;
        }
    }
}
