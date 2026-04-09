package sm;

import a5.o;
import a5.q;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.BitmapFactory;
import android.media.MediaCodec;
import android.os.Looper;
import android.os.Parcel;
import android.telephony.ServiceState;
import android.text.TextUtils;
import android.view.View;
import com.google.android.exoplayer2.y0;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.gms.location.LocationRequest;
import com.staircase3.opensignal.activities.MainActivity;
import com.staircase3.opensignal.firebase.NotificationCancelButtonBroadcastReceiver;
import com.staircase3.opensignal.firebase.NotificationSwipeDismissBroadcastReceiver;
import com.survicate.surveys.infrastructure.network.URLRequest;
import g3.p;
import h7.s1;
import h9.t;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import l5.a0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import pb.b0;
import pb.d0;
import pb.e0;
import pb.f0;
import pb.m0;
import pb.y;
import rs.r;
import u3.h1;
import xd.n;

/* loaded from: classes.dex */
public class m implements com.opensignal.sdk.common.measurements.base.c, s1, io.sentry.util.runtime.b, k8.e, n, l5.j, r, f0, vm.a, ya.h {

    /* renamed from: a, reason: collision with root package name */
    public static m f22143a;

    /* renamed from: d, reason: collision with root package name */
    public static pi.a f22144d;

    /* renamed from: g, reason: collision with root package name */
    public static SQLiteDatabase f22145g;

    /* JADX WARN: Removed duplicated region for block: B:248:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A(java.util.ArrayList r9, com.survicate.surveys.entities.survey.surveyLogic.form.SurveyLogicFormGroup r10) {
        /*
            Method dump skipped, instructions count: 680
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: sm.m.A(java.util.ArrayList, com.survicate.surveys.entities.survey.surveyLogic.form.SurveyLogicFormGroup):boolean");
    }

    public static String d() {
        StringBuilder sb2 = new StringBuilder("create table tower_cache (");
        l lVar = l.KEY_OPENSIGNAL_ID;
        sb2.append(lVar);
        sb2.append(" INTEGER,");
        sb2.append(l.KEY_NETWORK_ID);
        sb2.append(" INTEGER,");
        l lVar2 = l.KEY_CID;
        sb2.append(lVar2);
        sb2.append(" INTEGER,");
        l lVar3 = l.KEY_LAC;
        sb2.append(lVar3);
        sb2.append(" INTEGER,");
        l lVar4 = l.KEY_PSC;
        sb2.append(lVar4);
        sb2.append(" INTEGER,");
        sb2.append(l.KEY_EST_LAT);
        sb2.append(" REAL,");
        sb2.append(l.KEY_EST_LNG);
        sb2.append(" REAL,");
        sb2.append(l.KEY_EST_ACC);
        sb2.append(" REAL,");
        sb2.append(l.KEY_CONFIDENCE);
        sb2.append(" REAL,");
        sb2.append(l.KEY_IS_2G);
        sb2.append(" NUMERIC,");
        sb2.append(l.KEY_IS_3G);
        sb2.append(" NUMERIC,");
        sb2.append(l.KEY_IS_4G);
        sb2.append(" NUMERIC, UNIQUE(");
        sb2.append(lVar);
        sb2.append(",");
        sb2.append(lVar2);
        sb2.append(",");
        sb2.append(lVar3);
        sb2.append(",");
        sb2.append(lVar4);
        sb2.append(") ON CONFLICT REPLACE )");
        return sb2.toString();
    }

    public static void f(JSONArray jSONArray, HashMap map) throws JSONException {
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                int i11 = jSONObject.getInt("itag");
                String string = jSONObject.getString("url");
                map.put(Integer.valueOf(i11), string);
                ch.n.b("YoutubeJsonParser", "ITAG = [" + i11 + "] URL = " + string);
            } catch (JSONException e4) {
                ch.n.e("YoutubeJsonParser", e4);
                return;
            }
        }
    }

    public static void g(HashMap map, JSONObject jSONObject, String str, int i10) throws JSONException {
        String string;
        try {
            string = jSONObject.getString(str);
        } catch (JSONException unused) {
            ch.n.b("YoutubeJsonParser", h0.b.o("Unable to get manifest ", str, " from response"));
            string = null;
        }
        if (string == null || string.isEmpty()) {
            return;
        }
        map.put(Integer.valueOf(i10), string);
        StringBuilder sb2 = new StringBuilder("ITAG = [");
        sb2.append(i10);
        ch.n.b("YoutubeJsonParser", w.g.j(sb2, "] URL = ", string));
    }

    public static void h(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        t();
        try {
            ContentValues contentValues = new ContentValues();
            try {
                contentValues.put(l.KEY_OPENSIGNAL_ID.name(), Integer.valueOf(jSONObject.getInt("opensignalId")));
            } catch (JSONException unused) {
            }
            try {
                contentValues.put(l.KEY_NETWORK_ID.name(), Integer.valueOf(jSONObject.getInt("networkId")));
            } catch (JSONException unused2) {
            }
            try {
                contentValues.put(l.KEY_CID.name(), Integer.valueOf(jSONObject.getInt("cid")));
            } catch (JSONException unused3) {
            }
            try {
                contentValues.put(l.KEY_LAC.name(), Integer.valueOf(jSONObject.getInt("lac")));
            } catch (JSONException unused4) {
            }
            try {
                contentValues.put(l.KEY_PSC.name(), Integer.valueOf(jSONObject.getInt("psc")));
            } catch (JSONException unused5) {
            }
            try {
                contentValues.put(l.KEY_EST_LAT.name(), Double.valueOf(jSONObject.getDouble("estLat")));
            } catch (JSONException unused6) {
            }
            try {
                contentValues.put(l.KEY_EST_LNG.name(), Double.valueOf(jSONObject.getDouble("estLng")));
            } catch (JSONException unused7) {
            }
            try {
                contentValues.put(l.KEY_EST_ACC.name(), Double.valueOf(jSONObject.getDouble("estAcc")));
            } catch (JSONException unused8) {
            }
            try {
                contentValues.put(l.KEY_CONFIDENCE.name(), Double.valueOf(jSONObject.getDouble("confidence")));
            } catch (JSONException unused9) {
            }
            try {
                contentValues.put(l.KEY_IS_2G.name(), Boolean.valueOf(jSONObject.getBoolean("is2G")));
            } catch (JSONException unused10) {
            }
            try {
                contentValues.put(l.KEY_IS_3G.name(), Boolean.valueOf(jSONObject.getBoolean("is3G")));
            } catch (JSONException unused11) {
            }
            try {
                contentValues.put(l.KEY_IS_4G.name(), Boolean.valueOf(jSONObject.getBoolean("is4G")));
            } catch (JSONException unused12) {
            }
            f22145g.insertWithOnConflict("tower_cache", null, contentValues, 5);
        } catch (Exception unused13) {
        }
    }

    public static MediaCodec j(l5.i iVar) throws IOException {
        iVar.f14717a.getClass();
        String str = iVar.f14717a.f14723a;
        a5.a.b("createCodec:" + str);
        MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
        a5.a.o();
        return mediaCodecCreateByCodecName;
    }

    public static cv.j k(String str) {
        int i10;
        char cCharAt;
        br.l.e(str, "<this>");
        byte[] bArr = cv.a.f6677a;
        int length = str.length();
        while (length > 0 && ((cCharAt = str.charAt(length - 1)) == '=' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == ' ' || cCharAt == '\t')) {
            length--;
        }
        int i11 = (int) ((length * 6) / 8);
        byte[] bArrCopyOf = new byte[i11];
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            if (i12 < length) {
                char cCharAt2 = str.charAt(i12);
                if ('A' <= cCharAt2 && cCharAt2 < '[') {
                    i10 = cCharAt2 - 'A';
                } else if ('a' <= cCharAt2 && cCharAt2 < '{') {
                    i10 = cCharAt2 - 'G';
                } else if ('0' <= cCharAt2 && cCharAt2 < ':') {
                    i10 = cCharAt2 + 4;
                } else if (cCharAt2 != '+' && cCharAt2 != '-') {
                    if (cCharAt2 != '/' && cCharAt2 != '_') {
                        if (cCharAt2 != '\n' && cCharAt2 != '\r' && cCharAt2 != ' ' && cCharAt2 != '\t') {
                            break;
                        }
                        i12++;
                    } else {
                        i10 = 63;
                    }
                } else {
                    i10 = 62;
                }
                i14 = (i14 << 6) | i10;
                i13++;
                if (i13 % 4 == 0) {
                    bArrCopyOf[i15] = (byte) (i14 >> 16);
                    int i16 = i15 + 2;
                    bArrCopyOf[i15 + 1] = (byte) (i14 >> 8);
                    i15 += 3;
                    bArrCopyOf[i16] = (byte) i14;
                }
                i12++;
            } else {
                int i17 = i13 % 4;
                if (i17 != 1) {
                    if (i17 == 2) {
                        bArrCopyOf[i15] = (byte) ((i14 << 12) >> 16);
                        i15++;
                    } else if (i17 == 3) {
                        int i18 = i14 << 6;
                        int i19 = i15 + 1;
                        bArrCopyOf[i15] = (byte) (i18 >> 16);
                        i15 += 2;
                        bArrCopyOf[i19] = (byte) (i18 >> 8);
                    }
                    if (i15 != i11) {
                        bArrCopyOf = Arrays.copyOf(bArrCopyOf, i15);
                        br.l.d(bArrCopyOf, "copyOf(...)");
                    }
                }
            }
        }
        bArrCopyOf = null;
        if (bArrCopyOf != null) {
            return new cv.j(bArrCopyOf);
        }
        return null;
    }

    public static cv.j l(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = i10 * 2;
            bArr[i10] = (byte) (dv.b.a(str.charAt(i11 + 1)) + (dv.b.a(str.charAt(i11)) << 4));
        }
        return new cv.j(bArr);
    }

    public static cv.j m(String str) {
        br.l.e(str, "<this>");
        byte[] bytes = str.getBytes(tt.a.f22975a);
        br.l.d(bytes, "getBytes(...)");
        cv.j jVar = new cv.j(bytes);
        jVar.f6718g = str;
        return jVar;
    }

    public static b9.a n(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod(URLRequest.METHOD_GET);
        httpURLConnection.connect();
        return new b9.a(0, httpURLConnection);
    }

    public static JSONArray p(String str, JSONObject jSONObject) {
        JSONArray jSONArray = new JSONArray();
        try {
            return jSONObject.getJSONArray(str);
        } catch (JSONException unused) {
            ch.n.b("YoutubeJsonParser", h0.b.o("No ", str, " found in json response."));
            return jSONArray;
        }
    }

    public static void t() {
        if (f22143a == null || f22145g == null) {
            synchronized (m.class) {
                try {
                    if (f22143a == null) {
                        m mVar = new m();
                        f22144d = new pi.a((Context) y3.s(Context.class), "tower_cache", null, 1, 3);
                        f22143a = mVar;
                    }
                    if (f22145g == null) {
                        f22145g = f22144d.getWritableDatabase();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public static cv.j u(byte[] bArr) {
        cv.j jVar = cv.j.f6715r;
        int length = bArr.length;
        xu.l.e(bArr.length, 0, length);
        return new cv.j(mq.l.g0(bArr, 0, length));
    }

    public static boolean y(hk.h hVar, List list) {
        br.l.e(hVar, "task");
        br.l.e(list, "triggers");
        String strC = hVar.c();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ik.a aVar = (ik.a) it.next();
            if (!aVar.b(hVar)) {
                StringBuilder sbL = w.g.l(strC, " failed matching trigger ");
                sbL.append(aVar.getClass().getSimpleName());
                sbL.append(" for ");
                sbL.append(aVar.a());
                ch.n.b("TriggerChecker", sbL.toString());
                return false;
            }
        }
        ch.n.b("TriggerChecker", w.g.f(strC, " Can execute"));
        return true;
    }

    public static void z(pc.a aVar, LocationRequest locationRequest, ji.a aVar2, Looper looper) {
        br.l.e(aVar, "fusedLocationProviderClient");
        br.l.d(aVar.e(locationRequest, aVar2, looper), "requestLocationUpdates(...)");
    }

    @Override // com.opensignal.sdk.common.measurements.base.c
    public Integer E(ServiceState serviceState) {
        Integer numValueOf = null;
        if (serviceState == null) {
            return null;
        }
        try {
            Parcel parcelObtain = Parcel.obtain();
            br.l.d(parcelObtain, "obtain(...)");
            serviceState.writeToParcel(parcelObtain, 1);
            parcelObtain.setDataPosition(0);
            parcelObtain.readInt();
            parcelObtain.readInt();
            parcelObtain.readString();
            parcelObtain.readString();
            parcelObtain.readString();
            parcelObtain.readInt();
            parcelObtain.readInt();
            parcelObtain.readInt();
            parcelObtain.readInt();
            List networkRegistrationInfoList = serviceState.getNetworkRegistrationInfoList();
            br.l.d(networkRegistrationInfoList, "getNetworkRegistrationInfoList(...)");
            synchronized (networkRegistrationInfoList) {
                parcelObtain.readList(networkRegistrationInfoList, q.k().getClassLoader());
            }
            parcelObtain.readInt();
            parcelObtain.createIntArray();
            numValueOf = Integer.valueOf(parcelObtain.readInt());
            parcelObtain.readString();
            parcelObtain.readString();
            parcelObtain.readBoolean();
            parcelObtain.readBoolean();
        } catch (Exception e4) {
            ch.n.e("NrFrequencyRangeParcelM", e4);
        }
        ch.n.b("NrFrequencyRangeParcelM", "getNrFrequencyRange() with nrFrequencyRange = [" + numValueOf + ']');
        return numValueOf;
    }

    @Override // io.sentry.util.runtime.b
    public void a(o oVar) {
        oVar.run();
    }

    @Override // xd.n
    public h1 b(View view, h1 h1Var, d0 d0Var) {
        d0Var.f20364e = h1Var.a() + d0Var.f20364e;
        boolean z10 = view.getLayoutDirection() == 1;
        int iB = h1Var.b();
        int iC = h1Var.c();
        int i10 = d0Var.f20361b + (z10 ? iC : iB);
        d0Var.f20361b = i10;
        int i11 = d0Var.f20363d;
        if (!z10) {
            iB = iC;
        }
        int i12 = i11 + iB;
        d0Var.f20363d = i12;
        view.setPaddingRelative(i10, d0Var.f20362c, i12, d0Var.f20364e);
        return h1Var;
    }

    @Override // io.sentry.util.runtime.b
    public Object c(io.sentry.util.runtime.a aVar) {
        return aVar.run();
    }

    @Override // k8.e
    public boolean e() {
        return true;
    }

    @Override // h7.s1
    public long i(long j) {
        return -1L;
    }

    public t o(d0 d0Var, e0 e0Var) {
        IOException iOException = e0Var.f20368a;
        if (!(iOException instanceof b0)) {
            return null;
        }
        int i10 = ((b0) iOException).f20355d;
        if (i10 != 403 && i10 != 404 && i10 != 410 && i10 != 416 && i10 != 500 && i10 != 503) {
            return null;
        }
        if (d0Var.a(1)) {
            return new t(1, 2, 300000L);
        }
        if (d0Var.a(2)) {
            return new t(2, 2, 60000L);
        }
        return null;
    }

    public int q(int i10) {
        return i10 == 7 ? 6 : 3;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a4 A[EDGE_INSN: B:47:0x00a4->B:40:0x00a4 BREAK  A[LOOP:0: B:3:0x000f->B:54:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[LOOP:0: B:3:0x000f->B:54:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Long r(java.lang.Long r11, java.util.List r12) {
        /*
            r10 = this;
            dv.h r0 = new dv.h
            r1 = 19
            r0.<init>(r1)
            java.util.List r12 = mq.o.M0(r12, r0)
            java.util.Iterator r12 = r12.iterator()
        Lf:
            boolean r0 = r12.hasNext()
            r1 = 0
            if (r0 == 0) goto La3
            java.lang.Object r0 = r12.next()
            r2 = r0
            com.survicate.surveys.entities.survey.surveyLogic.range.SurveyPointRangeLogic r2 = (com.survicate.surveys.entities.survey.surveyLogic.range.SurveyPointRangeLogic) r2
            r3 = 1
            r4 = 0
            if (r11 != 0) goto L2e
            com.survicate.surveys.entities.survey.surveyLogic.range.SurveyLogicRangeCondition r2 = r2.getCondition()
            com.survicate.surveys.entities.survey.surveyLogic.range.SurveyLogicRangeCondition r5 = com.survicate.surveys.entities.survey.surveyLogic.range.SurveyLogicRangeCondition.HAS_ANY_VALUE
            if (r2 != r5) goto L2b
            goto La0
        L2b:
            r3 = r4
            goto La0
        L2e:
            com.survicate.surveys.entities.survey.surveyLogic.range.SurveyLogicRangeCondition r5 = r2.getCondition()
            r6 = -1
            if (r5 != 0) goto L37
            r5 = r6
            goto L3f
        L37:
            int[] r7 = qn.a.f20942d
            int r5 = r5.ordinal()
            r5 = r7[r5]
        L3f:
            if (r5 == r6) goto L2b
            if (r5 == r3) goto L98
            r6 = 2
            if (r5 == r6) goto L8d
            r7 = 3
            if (r5 == r7) goto L53
            r2 = 4
            if (r5 != r2) goto L4d
            goto La0
        L4d:
            bf.n r11 = new bf.n
            r11.<init>()
            throw r11
        L53:
            java.util.List r5 = r2.getValues()
            int r5 = r5.size()
            if (r5 != r6) goto L2b
            hr.g r5 = new hr.g
            java.util.List r6 = r2.getValues()
            java.lang.Object r6 = r6.get(r4)
            java.lang.Number r6 = (java.lang.Number) r6
            long r6 = r6.longValue()
            java.util.List r2 = r2.getValues()
            java.lang.Object r2 = r2.get(r3)
            java.lang.Number r2 = (java.lang.Number) r2
            long r8 = r2.longValue()
            r5.<init>(r6, r8)
            long r8 = r11.longValue()
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 > 0) goto L2b
            long r5 = r5.f10872d
            int r2 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r2 > 0) goto L2b
            goto La0
        L8d:
            java.util.List r2 = r2.getValues()
            boolean r2 = r2.contains(r11)
            if (r2 != 0) goto L2b
            goto La0
        L98:
            java.util.List r2 = r2.getValues()
            boolean r3 = r2.contains(r11)
        La0:
            if (r3 == 0) goto Lf
            goto La4
        La3:
            r0 = r1
        La4:
            com.survicate.surveys.entities.survey.surveyLogic.range.SurveyPointRangeLogic r0 = (com.survicate.surveys.entities.survey.surveyLogic.range.SurveyPointRangeLogic) r0
            if (r0 == 0) goto Lb1
            long r11 = r0.getGoTo()
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            return r11
        Lb1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: sm.m.r(java.lang.Long, java.util.List):java.lang.Long");
    }

    public long s(e0 e0Var) {
        IOException iOException = e0Var.f20368a;
        if ((iOException instanceof y0) || (iOException instanceof FileNotFoundException) || (iOException instanceof y) || (iOException instanceof m0)) {
            return -9223372036854775807L;
        }
        return Math.min((e0Var.f20369b - 1) * 1000, 5000);
    }

    @Override // l5.j
    public l5.k v(l5.i iVar) {
        MediaCodec mediaCodecJ = null;
        try {
            mediaCodecJ = j(iVar);
            a5.a.b("configureCodec");
            mediaCodecJ.configure(iVar.f14718b, iVar.f14720d, iVar.f14721e, 0);
            a5.a.o();
            a5.a.b("startCodec");
            mediaCodecJ.start();
            a5.a.o();
            return new a0(mediaCodecJ, 0);
        } catch (IOException | RuntimeException e4) {
            if (mediaCodecJ != null) {
                mediaCodecJ.release();
            }
            throw e4;
        }
    }

    @Override // vm.a
    public void w(Context context, u.e eVar) {
        Intent intent = new Intent(context, (Class<?>) MainActivity.class);
        intent.putExtra("NOTIFICATION_CONGRATULATIONS_TITLE", (String) eVar.get("CongratulationsTitle"));
        intent.putExtra("NOTIFICATION_CONGRATULATIONS_MESSAGE", (String) eVar.get("CongratulationsMessage"));
        intent.putExtra("NOTIFICATION_THANKS_MESSAGE", (String) eVar.get("ThanksMessage"));
        intent.putExtra("NOTIFICATION_EMAIL_TO", (String) eVar.get("EmailTo"));
        intent.putExtra("NOTIFICATION_EMAIL_SUBJECT", (String) eVar.get("EmailSubject"));
        intent.putExtra("NOTIFICATION_EMAIL_MESSAGE", (String) eVar.get("EmailMessage"));
        PendingIntent activity = PendingIntent.getActivity(context, 5315, intent, 201326592);
        Intent intent2 = new Intent(context, (Class<?>) NotificationCancelButtonBroadcastReceiver.class);
        intent2.putExtra("NOTIFICATION_ID", 5315);
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 5315, intent2, 201326592);
        Intent intent3 = new Intent(context, (Class<?>) NotificationSwipeDismissBroadcastReceiver.class);
        intent3.putExtra("NOTIFICATION_ID", 5315);
        PendingIntent broadcast2 = PendingIntent.getBroadcast(context, 5315, intent3, 201326592);
        String str = (String) eVar.get("Title");
        if (str == null) {
            str = "We would like to chat with you!";
        }
        String str2 = (String) eVar.get("Message");
        if (str2 == null) {
            str2 = "Any thoughts about our app? Want to share?";
        }
        String str3 = (String) eVar.get("Primary");
        if (str3 == null) {
            str3 = "YES, PLEASE";
        }
        String str4 = (String) eVar.get("Secondary");
        if (str4 == null) {
            str4 = "NO, THANKS";
        }
        p pVar = new p(context, context.getString(qk.l.default_notification_channel_id));
        pVar.c(true);
        pVar.f9306b.add(new g3.j(0, activity, str3));
        pVar.f9306b.add(new g3.j(0, broadcast, str4));
        pVar.f9311g = activity;
        Notification notification = pVar.f9321s;
        notification.deleteIntent = broadcast2;
        notification.icon = qk.f.logonotification;
        pVar.d(BitmapFactory.decodeResource(context.getResources(), qk.f.iconnotification));
        pVar.f9317o = context.getResources().getColor(qk.d.notification_color_filter);
        pVar.f9309e = p.b(str);
        g3.n nVar = new g3.n(8, false);
        nVar.f9304g = p.b(str2);
        pVar.e(nVar);
        pVar.f9310f = p.b(str2);
        ((NotificationManager) context.getSystemService("notification")).notify(5315, pVar.a());
    }

    public HashMap x(String str) throws JSONException {
        HashMap map = new HashMap();
        if (str != null && !TextUtils.isEmpty(str)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject = new JSONObject(str).getJSONObject("streamingData");
            } catch (JSONException e4) {
                ch.n.e("YoutubeJsonParser", e4);
            }
            f(p("formats", jSONObject), map);
            f(p("adaptiveFormats", jSONObject), map);
            g(map, jSONObject, "dashManifestUrl", -999);
            g(map, jSONObject, "hlsManifestUrl", -998);
        }
        return map;
    }

    @Override // k8.e
    public void shutdown() {
    }
}
