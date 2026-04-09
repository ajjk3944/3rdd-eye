package lf;

import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.location.Location;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.view.View;
import android.view.Window;
import com.google.android.gms.internal.measurement.e5;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.survicate.surveys.entities.survey.questions.SurveyPoint;
import com.survicate.surveys.entities.survey.surveyLogic.SurveyLogicOperator;
import com.survicate.surveys.entities.survey.surveyLogic.date.SurveyLogicDateCondition;
import com.survicate.surveys.entities.survey.surveyLogic.display.DateDisplayLogic;
import com.survicate.surveys.entities.survey.surveyLogic.display.DateDisplayLogicGroup;
import com.survicate.surveys.entities.survey.surveyLogic.display.DisplayLogic;
import com.survicate.surveys.entities.survey.surveyLogic.display.FormDisplayLogic;
import com.survicate.surveys.entities.survey.surveyLogic.display.FormDisplayLogicGroup;
import com.survicate.surveys.entities.survey.surveyLogic.display.MatrixDisplayLogic;
import com.survicate.surveys.entities.survey.surveyLogic.display.MatrixDisplayLogicGroup;
import com.survicate.surveys.entities.survey.surveyLogic.display.MultipleChoiceDisplayLogic;
import com.survicate.surveys.entities.survey.surveyLogic.display.MultipleChoiceDisplayLogicGroup;
import com.survicate.surveys.entities.survey.surveyLogic.display.RangeDisplayLogic;
import com.survicate.surveys.entities.survey.surveyLogic.display.RangeDisplayLogicGroup;
import com.survicate.surveys.entities.survey.surveyLogic.display.SingleChoiceDisplayLogic;
import com.survicate.surveys.entities.survey.surveyLogic.display.SingleChoiceDisplayLogicGroup;
import com.survicate.surveys.entities.survey.surveyLogic.display.TextDisplayLogic;
import com.survicate.surveys.entities.survey.surveyLogic.display.TextDisplayLogicGroup;
import com.survicate.surveys.entities.survey.surveyLogic.form.SurveyLogicFormCondition;
import com.survicate.surveys.entities.survey.surveyLogic.matrix.SurveyLogicMatrixCondition;
import com.survicate.surveys.entities.survey.surveyLogic.multiple.SurveyLogicMultipleCondition;
import com.survicate.surveys.entities.survey.surveyLogic.range.SurveyLogicRangeCondition;
import com.survicate.surveys.entities.survey.surveyLogic.single.SurveyLogicSingleCondition;
import com.survicate.surveys.entities.survey.surveyLogic.text.SurveyLogicTextCondition;
import com.survicate.surveys.infrastructure.network.SurveyAnswer;
import io.sentry.android.core.e0;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class t1 {
    public static String A(SurveyAnswer surveyAnswer) {
        String comment = surveyAnswer.getComment();
        StringBuilder sb2 = new StringBuilder();
        String answer = surveyAnswer.getAnswer();
        if (answer == null) {
            answer = "";
        }
        sb2.append(answer);
        sb2.append(comment != null ? ": ".concat(comment) : "");
        return sb2.toString();
    }

    public static final long B(long j, float f10) {
        long jFloatToRawIntBits = j | (Float.floatToRawIntBits(f10) & 4294967295L);
        t2.l[] lVarArr = t2.k.f22393b;
        return jFloatToRawIntBits;
    }

    public static ms.a C(InputStream inputStream) {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        hr.d dVar = new hr.d(1, dataInputStream.readInt(), 1);
        ArrayList arrayList = new ArrayList(mq.p.a0(dVar, 10));
        Iterator it = dVar.iterator();
        while (true) {
            hr.c cVar = (hr.c) it;
            if (!cVar.f10868g) {
                int[] iArrP0 = mq.o.P0(arrayList);
                return new ms.a(Arrays.copyOf(iArrP0, iArrP0.length));
            }
            cVar.nextInt();
            arrayList.add(Integer.valueOf(dataInputStream.readInt()));
        }
    }

    public static int D(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    public static void E(Window window, boolean z10) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 35) {
            a2.f.f(window, z10);
        } else {
            if (i10 >= 30) {
                a2.f.e(window, z10);
                return;
            }
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z10 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    public static final h4.e F(String str) {
        br.l.e(str, "name");
        return new h4.e(str);
    }

    public static final void G(Object obj) {
        if (obj instanceof lq.n) {
            throw ((lq.n) obj).f15573a;
        }
    }

    public static int[] H(Collection collection) {
        if (collection instanceof qe.a) {
            return Arrays.copyOfRange((int[]) null, 0, 0);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            Object obj = array[i10];
            obj.getClass();
            iArr[i10] = ((Number) obj).intValue();
        }
        return iArr;
    }

    public static final sn.c I(DisplayLogic displayLogic) {
        tn.d dVar;
        tn.h hVar;
        tn.l lVar;
        tn.r rVar;
        tn.o oVar;
        tn.c cVar;
        tn.u uVar;
        br.l.e(displayLogic, "<this>");
        if (displayLogic instanceof TextDisplayLogic) {
            TextDisplayLogic textDisplayLogic = (TextDisplayLogic) displayLogic;
            long pointId = textDisplayLogic.getPointId();
            List<TextDisplayLogicGroup> groups = textDisplayLogic.getGroups();
            ArrayList arrayList = new ArrayList(mq.p.a0(groups, 10));
            for (TextDisplayLogicGroup textDisplayLogicGroup : groups) {
                SurveyLogicTextCondition condition = textDisplayLogicGroup.getCondition();
                br.l.e(condition, "<this>");
                int i10 = pn.h.f20598a[condition.ordinal()];
                if (i10 == 1) {
                    uVar = tn.u.ANSWER_CONTAINS;
                } else if (i10 == 2) {
                    uVar = tn.u.ANSWER_DOES_NOT_CONTAIN;
                } else if (i10 == 3) {
                    uVar = tn.u.QUESTION_IS_ANSWERED;
                } else if (i10 == 4) {
                    uVar = tn.u.QUESTION_IS_NOT_ANSWERED;
                } else {
                    if (i10 != 5) {
                        throw new bf.n();
                    }
                    uVar = tn.u.HAS_ANY_VALUE;
                }
                arrayList.add(new tn.t(uVar, textDisplayLogicGroup.getValue(), J(textDisplayLogicGroup.getValueOperator())));
            }
            return new sn.p(pointId, arrayList, J(textDisplayLogic.getGroupOperator()));
        }
        if (displayLogic instanceof DateDisplayLogic) {
            DateDisplayLogic dateDisplayLogic = (DateDisplayLogic) displayLogic;
            long pointId2 = dateDisplayLogic.getPointId();
            List<DateDisplayLogicGroup> groups2 = dateDisplayLogic.getGroups();
            ArrayList arrayList2 = new ArrayList(mq.p.a0(groups2, 10));
            for (DateDisplayLogicGroup dateDisplayLogicGroup : groups2) {
                SurveyLogicDateCondition condition2 = dateDisplayLogicGroup.getCondition();
                br.l.e(condition2, "<this>");
                int i11 = pn.a.f20591a[condition2.ordinal()];
                if (i11 == 1) {
                    cVar = tn.c.HAS_ANY_VALUE;
                } else if (i11 == 2) {
                    cVar = tn.c.QUESTION_IS_ANSWERED;
                } else {
                    if (i11 != 3) {
                        throw new bf.n();
                    }
                    cVar = tn.c.QUESTION_IS_NOT_ANSWERED;
                }
                arrayList2.add(new tn.b(cVar, dateDisplayLogicGroup.getValue()));
            }
            return new sn.b(pointId2, arrayList2, J(dateDisplayLogic.getGroupOperator()));
        }
        if (displayLogic instanceof RangeDisplayLogic) {
            RangeDisplayLogic rangeDisplayLogic = (RangeDisplayLogic) displayLogic;
            long pointId3 = rangeDisplayLogic.getPointId();
            List<RangeDisplayLogicGroup> groups3 = rangeDisplayLogic.getGroups();
            ArrayList arrayList3 = new ArrayList(mq.p.a0(groups3, 10));
            for (RangeDisplayLogicGroup rangeDisplayLogicGroup : groups3) {
                SurveyLogicRangeCondition condition3 = rangeDisplayLogicGroup.getCondition();
                br.l.e(condition3, "<this>");
                int i12 = pn.f.f20596a[condition3.ordinal()];
                if (i12 == 1) {
                    oVar = tn.o.IS;
                } else if (i12 == 2) {
                    oVar = tn.o.IS_NOT;
                } else if (i12 == 3) {
                    oVar = tn.o.IS_BETWEEN;
                } else {
                    if (i12 != 4) {
                        throw new bf.n();
                    }
                    oVar = tn.o.HAS_ANY_VALUE;
                }
                arrayList3.add(new tn.n(oVar, rangeDisplayLogicGroup.getValue()));
            }
            return new sn.l(pointId3, arrayList3, J(rangeDisplayLogic.getGroupOperator()));
        }
        if (displayLogic instanceof SingleChoiceDisplayLogic) {
            SingleChoiceDisplayLogic singleChoiceDisplayLogic = (SingleChoiceDisplayLogic) displayLogic;
            long pointId4 = singleChoiceDisplayLogic.getPointId();
            List<SingleChoiceDisplayLogicGroup> groups4 = singleChoiceDisplayLogic.getGroups();
            ArrayList arrayList4 = new ArrayList(mq.p.a0(groups4, 10));
            for (SingleChoiceDisplayLogicGroup singleChoiceDisplayLogicGroup : groups4) {
                SurveyLogicSingleCondition condition4 = singleChoiceDisplayLogicGroup.getCondition();
                br.l.e(condition4, "<this>");
                int i13 = pn.g.f20597a[condition4.ordinal()];
                if (i13 == 1) {
                    rVar = tn.r.IS;
                } else if (i13 == 2) {
                    rVar = tn.r.IS_NOT;
                } else {
                    if (i13 != 3) {
                        throw new bf.n();
                    }
                    rVar = tn.r.HAS_ANY_VALUE;
                }
                arrayList4.add(new tn.q(rVar, singleChoiceDisplayLogicGroup.getValue()));
            }
            return new sn.n(pointId4, arrayList4, J(singleChoiceDisplayLogic.getGroupOperator()));
        }
        if (displayLogic instanceof MultipleChoiceDisplayLogic) {
            MultipleChoiceDisplayLogic multipleChoiceDisplayLogic = (MultipleChoiceDisplayLogic) displayLogic;
            long pointId5 = multipleChoiceDisplayLogic.getPointId();
            List<MultipleChoiceDisplayLogicGroup> groups5 = multipleChoiceDisplayLogic.getGroups();
            ArrayList arrayList5 = new ArrayList(mq.p.a0(groups5, 10));
            for (MultipleChoiceDisplayLogicGroup multipleChoiceDisplayLogicGroup : groups5) {
                SurveyLogicMultipleCondition condition5 = multipleChoiceDisplayLogicGroup.getCondition();
                br.l.e(condition5, "<this>");
                int i14 = pn.e.f20595a[condition5.ordinal()];
                if (i14 == 1) {
                    lVar = tn.l.IS_EXACTLY;
                } else if (i14 == 2) {
                    lVar = tn.l.INCLUDES_ALL;
                } else if (i14 == 3) {
                    lVar = tn.l.INCLUDES_ANY;
                } else if (i14 == 4) {
                    lVar = tn.l.DOES_NOT_INCLUDE_ANY;
                } else {
                    if (i14 != 5) {
                        throw new bf.n();
                    }
                    lVar = tn.l.HAS_ANY_VALUE;
                }
                arrayList5.add(new tn.k(lVar, multipleChoiceDisplayLogicGroup.getValue()));
            }
            return new sn.j(pointId5, arrayList5, J(multipleChoiceDisplayLogic.getGroupOperator()));
        }
        if (displayLogic instanceof MatrixDisplayLogic) {
            MatrixDisplayLogic matrixDisplayLogic = (MatrixDisplayLogic) displayLogic;
            long pointId6 = matrixDisplayLogic.getPointId();
            List<MatrixDisplayLogicGroup> groups6 = matrixDisplayLogic.getGroups();
            ArrayList arrayList6 = new ArrayList(mq.p.a0(groups6, 10));
            for (MatrixDisplayLogicGroup matrixDisplayLogicGroup : groups6) {
                SurveyLogicMatrixCondition condition6 = matrixDisplayLogicGroup.getCondition();
                br.l.e(condition6, "<this>");
                int i15 = pn.d.f20594a[condition6.ordinal()];
                if (i15 == 1) {
                    hVar = tn.h.IS;
                } else if (i15 == 2) {
                    hVar = tn.h.IS_NOT;
                } else if (i15 == 3) {
                    hVar = tn.h.IS_BETWEEN;
                } else {
                    if (i15 != 4) {
                        throw new bf.n();
                    }
                    hVar = tn.h.HAS_ANY_VALUE;
                }
                arrayList6.add(new tn.g(hVar, matrixDisplayLogicGroup.getValue(), matrixDisplayLogicGroup.getAnswerId(), J(matrixDisplayLogicGroup.getAnswerIdOperator())));
            }
            return new sn.h(pointId6, arrayList6, J(matrixDisplayLogic.getGroupOperator()));
        }
        if (!(displayLogic instanceof FormDisplayLogic)) {
            throw new bf.n();
        }
        FormDisplayLogic formDisplayLogic = (FormDisplayLogic) displayLogic;
        long pointId7 = formDisplayLogic.getPointId();
        List<FormDisplayLogicGroup> groups7 = formDisplayLogic.getGroups();
        ArrayList arrayList7 = new ArrayList(mq.p.a0(groups7, 10));
        for (FormDisplayLogicGroup formDisplayLogicGroup : groups7) {
            SurveyLogicFormCondition condition7 = formDisplayLogicGroup.getCondition();
            br.l.e(condition7, "<this>");
            int i16 = pn.c.f20593a[condition7.ordinal()];
            if (i16 == 1) {
                dVar = tn.d.IS_FILLED_IN;
            } else if (i16 == 2) {
                dVar = tn.d.IS_NOT_FILLED_IN;
            } else {
                if (i16 != 3) {
                    throw new bf.n();
                }
                dVar = tn.d.HAS_ANY_VALUE;
            }
            arrayList7.add(new tn.f(dVar, J(formDisplayLogicGroup.getFieldIdOperator()), formDisplayLogicGroup.getFieldId()));
        }
        return new sn.f(pointId7, arrayList7, J(formDisplayLogic.getGroupOperator()));
    }

    public static final rn.a J(SurveyLogicOperator surveyLogicOperator) {
        br.l.e(surveyLogicOperator, "<this>");
        int i10 = pn.b.f20592a[surveyLogicOperator.ordinal()];
        if (i10 == 1) {
            return rn.a.AND;
        }
        if (i10 == 2) {
            return rn.a.OR;
        }
        throw new bf.n();
    }

    public static byte K(Boolean bool) {
        if (bool != null) {
            return !bool.booleanValue() ? (byte) 0 : (byte) 1;
        }
        return (byte) -1;
    }

    public static Boolean L(byte b2) {
        if (b2 == 0) {
            return Boolean.FALSE;
        }
        if (b2 != 1) {
            return null;
        }
        return Boolean.TRUE;
    }

    public static final void a(ru.a aVar, ru.b bVar, String str) {
        ru.c.f21811i.fine(bVar.f21805b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + aVar.f21800a);
    }

    public static cj.a b(cj.a aVar) {
        if (((Double) aVar.f3976r) != null) {
            return aVar;
        }
        return new cj.a((Boolean) aVar.f3974d, (Double) aVar.f3975g, c((Boolean) aVar.f3974d, null, (Double) aVar.f3975g), (Boolean) aVar.f3977x, (Double) aVar.f3978y);
    }

    public static Double c(Boolean bool, Double d6, Double d10) {
        if (d6 != null) {
            return d6;
        }
        double dC = io.sentry.util.i.a().c();
        if (d10 == null || bool == null) {
            return Double.valueOf(dC);
        }
        if (bool.booleanValue()) {
            return Double.valueOf(d10.doubleValue() * dC);
        }
        return Double.valueOf(((1.0d - d10.doubleValue()) * dC) + d10.doubleValue());
    }

    public static on.y d(SurveyPoint surveyPoint, List list) {
        String strA = A((SurveyAnswer) list.get(0));
        if (strA.length() == 0) {
            strA = null;
        }
        return new on.y(surveyPoint.getAnswerType(), null, null, strA);
    }

    public static void e(q3.a aVar, LatLng latLng, int i10, Runnable runnable) {
        if (aVar == null || latLng == null) {
            return;
        }
        CameraPosition cameraPosition = new CameraPosition(latLng, i10, 0.0f, 0.0f);
        if (runnable == null) {
            aVar.s0(xu.d.U(cameraPosition));
            return;
        }
        p.l2 l2VarU = xu.d.U(cameraPosition);
        b9.c cVar = new b9.c(12, runnable);
        try {
            vc.g gVar = (vc.g) aVar.f20679d;
            jc.b bVar = (jc.b) l2VarU.f20100d;
            uc.f fVar = new uc.f(cVar);
            Parcel parcelR = gVar.R();
            qc.l.d(parcelR, bVar);
            qc.l.d(parcelR, fVar);
            gVar.S(parcelR, 6);
        } catch (RemoteException e4) {
            throw new bf.n(e4);
        }
    }

    public static int f(long j) {
        int i10 = (int) j;
        if (((long) i10) == j) {
            return i10;
        }
        throw new IllegalArgumentException(y3.D("Out of range: %s", Long.valueOf(j)));
    }

    public static void h(b5.h hVar) {
        if (hVar != null) {
            try {
                hVar.close();
            } catch (IOException unused) {
            }
        }
    }

    public static int i(int i10, int i11) {
        if (i11 <= 1073741823) {
            return Math.min(Math.max(i10, i11), 1073741823);
        }
        throw new IllegalArgumentException(y3.D("min (%s) must be less than or equal to max (%s)", Integer.valueOf(i11), 1073741823));
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static wr.b j(java.lang.Class r14) throws java.lang.IllegalAccessException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lf.t1.j(java.lang.Class):wr.b");
    }

    public static final lq.n k(Throwable th2) {
        br.l.e(th2, "exception");
        return new lq.n(th2);
    }

    public static pb.d0 l(androidx.media3.exoplayer.trackselection.v vVar) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int length = vVar.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            if (vVar.k(i11, jElapsedRealtime)) {
                i10++;
            }
        }
        return new pb.d0(1, 0, length, i10, 1);
    }

    public static final k2.i m(Context context) {
        return new k2.i(new ic.b(context), new k2.a(Build.VERSION.SDK_INT >= 31 ? k2.s.f14005a.a(context) : 0));
    }

    public static final String n(long j) {
        String strN;
        if (j <= -999500000) {
            strN = c7.a.n((j - 500000000) / 1000000000, " s ", new StringBuilder());
        } else if (j <= -999500) {
            strN = c7.a.n((j - 500000) / 1000000, " ms", new StringBuilder());
        } else if (j <= 0) {
            strN = c7.a.n((j - 500) / 1000, " µs", new StringBuilder());
        } else if (j < 999500) {
            strN = c7.a.n((j + 500) / 1000, " µs", new StringBuilder());
        } else if (j < 999500000) {
            strN = c7.a.n((j + 500000) / 1000000, " ms", new StringBuilder());
        } else {
            strN = c7.a.n((j + 500000000) / 1000000000, " s ", new StringBuilder());
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{strN}, 1));
    }

    public static ni.k0 o(String str) {
        if (str == null || str.length() == 0 || tt.l.D0(str)) {
            ch.n.g("SignalStrengthFieldsCoreResult", "Null or blank JSON");
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new ni.k0(xu.d.y("gsm_bit_error_rate", jSONObject), xu.d.y("gsm_signal_strength", jSONObject), xu.d.y("cdma_dbm", jSONObject), xu.d.y("cdma_ecio", jSONObject), xu.d.y("evdo_dbm", jSONObject), xu.d.y("evdo_ecio", jSONObject), xu.d.y("evdo_snr", jSONObject), xu.d.K("signal_strength_string", jSONObject), xu.d.C("signal_strength_time", jSONObject));
        } catch (JSONException unused) {
            ch.n.c("SignalStrengthFieldsCoreResult", "Trying to parse invalid JSON: ".concat(str));
            return null;
        }
    }

    public static final long p(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / 2.0f;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) / 2.0f;
        return (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static float r(sm.k kVar, LatLng latLng) {
        if (kVar != null && latLng != null) {
            float[] fArr = new float[3];
            try {
                Location.distanceBetween(kVar.f22139d, kVar.f22140e, latLng.f5347a, latLng.f5348d, fArr);
                return fArr[0];
            } catch (IllegalArgumentException | NullPointerException unused) {
            }
        }
        return -1.0f;
    }

    public static Set s() {
        try {
            Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (objInvoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) objInvoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, lq.h] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, lq.h] */
    public static final Window t(View view) throws IllegalAccessException, IllegalArgumentException {
        Field field;
        br.l.e(view, "<this>");
        Object obj = io.sentry.android.replay.b0.f11847a;
        View rootView = view.getRootView();
        br.l.d(rootView, "getRootView(...)");
        Class cls = (Class) io.sentry.android.replay.b0.f11847a.getValue();
        if (cls == null || !cls.isInstance(rootView) || (field = (Field) io.sentry.android.replay.b0.f11848b.getValue()) == null) {
            return null;
        }
        Object obj2 = field.get(rootView);
        br.l.c(obj2, "null cannot be cast to non-null type android.view.Window");
        return (Window) obj2;
    }

    public static final long u(double d6) {
        return B(4294967296L, (float) d6);
    }

    public static final long v(int i10) {
        return B(4294967296L, i10);
    }

    public static int w(int[] iArr, int i10, int i11, int i12) {
        while (i11 < i12) {
            if (iArr[i11] == i10) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public static void x(final Context context) {
        Context applicationContext;
        PackageManager packageManager;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        if (se.b.C(context).getBoolean("proxy_notification_initialized", false)) {
            return;
        }
        try {
            applicationContext = context.getApplicationContext();
            packageManager = applicationContext.getPackageManager();
        } catch (PackageManager.NameNotFoundException unused) {
        }
        final boolean z10 = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_notification_delegation_enabled")) ? true : applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
        if (Build.VERSION.SDK_INT < 29) {
            e5.u(null);
        } else {
            final dd.h hVar = new dd.h();
            new Runnable() { // from class: kg.p
                @Override // java.lang.Runnable
                public final void run() {
                    Context context2 = context;
                    dd.h hVar2 = hVar;
                    try {
                        if (!(Binder.getCallingUid() == context2.getApplicationInfo().uid)) {
                            e0.d("FirebaseMessaging", "error configuring notification delegate for package " + context2.getPackageName());
                            return;
                        }
                        SharedPreferences.Editor editorEdit = se.b.C(context2).edit();
                        editorEdit.putBoolean("proxy_notification_initialized", true);
                        editorEdit.apply();
                        NotificationManager notificationManager = (NotificationManager) context2.getSystemService(NotificationManager.class);
                        if (z10) {
                            notificationManager.setNotificationDelegate("com.google.android.gms");
                        } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                            notificationManager.setNotificationDelegate(null);
                        }
                    } finally {
                        hVar2.c(null);
                    }
                }
            }.run();
        }
    }

    public static boolean y(Location location) {
        double latitude = location.getLatitude();
        double longitude = location.getLongitude();
        return -90.0d <= latitude && latitude <= 90.0d && -180.0d <= longitude && longitude <= 180.0d;
    }

    public static boolean z(Double d6, boolean z10) {
        return d6 == null ? z10 : !d6.isNaN() && d6.doubleValue() >= 0.0d && d6.doubleValue() <= 1.0d;
    }

    public abstract List g(String str, List list);

    public abstract void q(ee.u uVar, float f10, float f11);
}
