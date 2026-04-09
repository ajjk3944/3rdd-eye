package sm;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.telephony.NetworkRegistrationInfo;
import android.telephony.ServiceState;
import bf.n;
import com.google.android.gms.internal.measurement.y3;
import com.squareup.picasso.r0;
import com.staircase3.opensignal.activities.MainActivity;
import com.staircase3.opensignal.firebase.NotificationSwipeDismissBroadcastReceiver;
import com.staircase3.opensignal.utils.q;
import io.sentry.b5;
import io.sentry.u0;
import io.sentry.x5;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import jj.y;
import k5.o;
import k5.p;
import l5.w;
import org.json.JSONException;
import org.json.JSONObject;
import rs.r;
import tt.s;

/* loaded from: classes.dex */
public final class f implements com.opensignal.sdk.common.measurements.base.f, p, kc.d, w, r, o9.b, no.b, qf.d, rf.a, com.staircase3.opensignal.utils.d, bk.c, u8.b, vm.a, pq.g {

    /* renamed from: d, reason: collision with root package name */
    public static f f22126d;

    /* renamed from: g, reason: collision with root package name */
    public static pi.a f22127g;

    /* renamed from: r, reason: collision with root package name */
    public static SQLiteDatabase f22128r;

    /* renamed from: x, reason: collision with root package name */
    public static f f22129x;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22130a;

    public /* synthetic */ f(int i10) {
        this.f22130a = i10;
    }

    public static final boolean C(cv.w wVar) {
        cv.w wVar2 = dv.f.f7602e;
        cv.j jVarO = wVar.f6743a;
        int iK = cv.j.k(jVarO, dv.c.f7592a);
        if (iK == -1) {
            iK = cv.j.k(wVar.f6743a, dv.c.f7593b);
        }
        if (iK != -1) {
            jVarO = cv.j.o(jVarO, iK + 1, 0, 2);
        } else if (wVar.f() != null && jVarO.d() == 2) {
            jVarO = cv.j.f6715r;
        }
        return !s.f0(jVarO.q(), ".class", true);
    }

    public static void E(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        I();
        try {
            ContentValues contentValues = new ContentValues();
            try {
                contentValues.put(e.KEY_NETWORK_ID.name(), Integer.valueOf(jSONObject.getInt("networkId")));
            } catch (JSONException unused) {
            }
            try {
                contentValues.put(e.KEY_NETWORK_NAME.name(), jSONObject.getString("name"));
            } catch (JSONException unused2) {
            }
            try {
                contentValues.put(e.KEY_LOGO_URL_SMALL.name(), jSONObject.getString("logoUrlSmall"));
            } catch (JSONException unused3) {
            }
            try {
                contentValues.put(e.KEY_LOGO_URL_LARGE.name(), jSONObject.getString("logoUrlLarge"));
            } catch (JSONException unused4) {
            }
            try {
                contentValues.put(e.KEY_LOGO_HEX_COLOR.name(), jSONObject.optString("hexColor"));
            } catch (Exception unused5) {
            }
            try {
                contentValues.put(e.KEY_TWITTER_HANDLE.name(), jSONObject.optString("twitterHandle"));
            } catch (Exception unused6) {
            }
            f22128r.insertWithOnConflict("logo_cache", null, contentValues, 5);
        } catch (Exception unused7) {
        }
    }

    public static cv.d F() throws InterruptedException {
        cv.d dVar = cv.d.f6698l;
        br.l.b(dVar);
        cv.d dVar2 = dVar.f6700f;
        if (dVar2 == null) {
            long jNanoTime = System.nanoTime();
            cv.d.f6697i.await(cv.d.j, TimeUnit.MILLISECONDS);
            cv.d dVar3 = cv.d.f6698l;
            br.l.b(dVar3);
            if (dVar3.f6700f != null || System.nanoTime() - jNanoTime < cv.d.k) {
                return null;
            }
            return cv.d.f6698l;
        }
        long jNanoTime2 = dVar2.f6701g - System.nanoTime();
        if (jNanoTime2 > 0) {
            cv.d.f6697i.await(jNanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        cv.d dVar4 = cv.d.f6698l;
        br.l.b(dVar4);
        dVar4.f6700f = dVar2.f6700f;
        dVar2.f6700f = null;
        dVar2.f6699e = 2;
        return dVar2;
    }

    public static cj.a G(int i10) {
        I();
        SQLiteDatabase sQLiteDatabase = f22128r;
        StringBuilder sb2 = new StringBuilder("select ");
        e eVar = e.KEY_NETWORK_ID;
        sb2.append(eVar);
        sb2.append(", ");
        sb2.append(e.KEY_NETWORK_NAME);
        sb2.append(", ");
        sb2.append(e.KEY_LOGO_URL_SMALL);
        sb2.append(", ");
        sb2.append(e.KEY_LOGO_URL_LARGE);
        sb2.append(", ");
        sb2.append(e.KEY_LOGO_HEX_COLOR);
        sb2.append(", ");
        sb2.append(e.KEY_TWITTER_HANDLE);
        sb2.append(" from logo_cache where ");
        sb2.append(eVar);
        sb2.append("=");
        sb2.append(i10);
        String string = sb2.toString();
        cj.a aVar = null;
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery(string, null);
        if (cursorRawQuery == null) {
            return null;
        }
        if (cursorRawQuery.moveToFirst()) {
            cursorRawQuery.getString(0);
            aVar = new cj.a(cursorRawQuery.getString(1), cursorRawQuery.getString(2), cursorRawQuery.getString(3), cursorRawQuery.getString(4), cursorRawQuery.getString(5), 27);
        }
        cursorRawQuery.close();
        return aVar;
    }

    public static wi.a H(wi.h hVar) {
        switch (wi.b.f24531a[hVar.ordinal()]) {
            case 1:
                return new wi.d(0);
            case 2:
                return new wi.d(3);
            case 3:
                return new wi.d(2);
            case 4:
                return new wi.d(5);
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                return new wi.d(1);
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return new wi.d(4);
            default:
                throw new n();
        }
    }

    public static void I() {
        if (f22126d == null || f22128r == null) {
            synchronized (f.class) {
                try {
                    if (f22126d == null) {
                        f fVar = new f(0);
                        f22127g = new pi.a((Context) y3.s(Context.class), "logo_cache", null, 2, 2);
                        f22126d = fVar;
                    }
                    if (f22128r == null) {
                        f22128r = f22127g.getWritableDatabase();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public static boolean J(u0 u0Var, String str) {
        return L(u0Var, str) != null;
    }

    public static boolean K(x5 x5Var, String str) {
        return J(x5Var != null ? x5Var.getLogger() : null, str);
    }

    public static Class L(u0 u0Var, String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            if (u0Var == null) {
                return null;
            }
            u0Var.m(b5.INFO, "Class not available: ".concat(str), new Object[0]);
            return null;
        } catch (UnsatisfiedLinkError e4) {
            if (u0Var == null) {
                return null;
            }
            u0Var.g(b5.ERROR, "Failed to load (UnsatisfiedLinkError) ".concat(str), e4);
            return null;
        } catch (Throwable th2) {
            if (u0Var == null) {
                return null;
            }
            u0Var.g(b5.ERROR, "Failed to initialize ".concat(str), th2);
            return null;
        }
    }

    public static final void z(cv.d dVar, long j, boolean z10) {
        cv.d dVar2;
        ReentrantLock reentrantLock = cv.d.f6696h;
        if (cv.d.f6698l == null) {
            cv.d.f6698l = new cv.d();
            r0 r0Var = new r0("Okio Watchdog");
            r0Var.setDaemon(true);
            r0Var.start();
        }
        long jNanoTime = System.nanoTime();
        if (j != 0 && z10) {
            dVar.f6701g = Math.min(j, dVar.c() - jNanoTime) + jNanoTime;
        } else if (j != 0) {
            dVar.f6701g = j + jNanoTime;
        } else {
            if (!z10) {
                throw new AssertionError();
            }
            dVar.f6701g = dVar.c();
        }
        long j7 = dVar.f6701g - jNanoTime;
        cv.d dVar3 = cv.d.f6698l;
        br.l.b(dVar3);
        while (true) {
            dVar2 = dVar3.f6700f;
            if (dVar2 == null || j7 < dVar2.f6701g - jNanoTime) {
                break;
            }
            br.l.b(dVar2);
            dVar3 = dVar2;
        }
        dVar.f6700f = dVar2;
        dVar3.f6700f = dVar;
        if (dVar3 == cv.d.f6698l) {
            cv.d.f6697i.signal();
        }
    }

    @Override // com.opensignal.sdk.common.measurements.base.f
    public Integer A(NetworkRegistrationInfo networkRegistrationInfo) {
        return null;
    }

    @Override // com.opensignal.sdk.common.measurements.base.f
    public Integer B(ServiceState serviceState) {
        return null;
    }

    public void M(String str) {
        br.l.e(str, "message");
    }

    public void N(Exception exc, String str) {
        br.l.e(str, "message");
        br.l.e(exc, "cause");
    }

    @Override // l5.w, oa.i
    public MediaCodecInfo a(int i10) {
        return MediaCodecList.getCodecInfoAt(i10);
    }

    @Override // l5.w, oa.i
    public boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && "video/avc".equals(str2);
    }

    @Override // l5.w, oa.i
    public boolean c(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // l5.w, oa.i
    public int d() {
        return MediaCodecList.getCodecCount();
    }

    @Override // l5.w, oa.i
    public boolean e() {
        return false;
    }

    @Override // k5.p
    public r5.p g() {
        return new o(k5.l.f14089n, null);
    }

    @Override // kq.a
    public Object get() {
        return new dd.p(2, Executors.newSingleThreadExecutor());
    }

    @Override // kc.d
    public kc.c h(Context context, String str, kc.b bVar) {
        int iC;
        kc.c cVar = new kc.c();
        int iD = bVar.d(context, str);
        cVar.f14269a = iD;
        int i10 = 1;
        int i11 = 0;
        if (iD != 0) {
            iC = bVar.c(context, str, false);
            cVar.f14270b = iC;
        } else {
            iC = bVar.c(context, str, true);
            cVar.f14270b = iC;
        }
        int i12 = cVar.f14269a;
        if (i12 == 0) {
            if (iC == 0) {
                i10 = 0;
            }
            cVar.f14271c = i10;
            return cVar;
        }
        i11 = i12;
        if (i11 >= iC) {
            i10 = -1;
        }
        cVar.f14271c = i10;
        return cVar;
    }

    @Override // u8.b
    public boolean i(float f10) {
        throw new IllegalStateException("not implemented");
    }

    @Override // u8.b
    public boolean isEmpty() {
        return true;
    }

    @Override // u8.b
    public f9.a j() {
        throw new IllegalStateException("not implemented");
    }

    @Override // qf.d
    public qf.b l(ee.f fVar, JSONObject jSONObject) throws JSONException {
        jSONObject.optInt("settings_version", 0);
        int iOptInt = jSONObject.optInt("cache_duration", 3600);
        double dOptDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double dOptDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int iOptInt2 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        c9.l lVar = jSONObject.has("session") ? new c9.l(jSONObject.getJSONObject("session").optInt("max_custom_exception_events", 8)) : new c9.l(new JSONObject().optInt("max_custom_exception_events", 8));
        JSONObject jSONObject2 = jSONObject.getJSONObject("features");
        return new qf.b(jSONObject.has("expires_at") ? jSONObject.optLong("expires_at") : (iOptInt * 1000) + System.currentTimeMillis(), lVar, new qf.a(jSONObject2.optBoolean("collect_reports", true), jSONObject2.optBoolean("collect_anrs", false), jSONObject2.optBoolean("collect_build_ids", false)), dOptDouble, dOptDouble2, iOptInt2);
    }

    @Override // u8.b
    public boolean m(float f10) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    @Override // rf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.StackTraceElement[] q(java.lang.StackTraceElement[] r15) {
        /*
            r14 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            int r1 = r15.length
            java.lang.StackTraceElement[] r1 = new java.lang.StackTraceElement[r1]
            r2 = 0
            r3 = 1
            r4 = r2
            r5 = r4
            r6 = r3
        Ld:
            int r7 = r15.length
            if (r4 >= r7) goto L61
            r7 = r15[r4]
            java.lang.Object r8 = r0.get(r7)
            java.lang.Integer r8 = (java.lang.Integer) r8
            if (r8 == 0) goto L4f
            int r9 = r8.intValue()
            int r10 = r4 - r9
            int r11 = r4 + r10
            int r12 = r15.length
            if (r11 <= r12) goto L26
            goto L4f
        L26:
            r11 = r2
        L27:
            if (r11 >= r10) goto L3b
            int r12 = r9 + r11
            r12 = r15[r12]
            int r13 = r4 + r11
            r13 = r15[r13]
            boolean r12 = r12.equals(r13)
            if (r12 != 0) goto L38
            goto L4f
        L38:
            int r11 = r11 + 1
            goto L27
        L3b:
            int r8 = r8.intValue()
            int r8 = r4 - r8
            r9 = 10
            if (r6 >= r9) goto L4b
            java.lang.System.arraycopy(r15, r4, r1, r5, r8)
            int r5 = r5 + r8
            int r6 = r6 + 1
        L4b:
            int r8 = r8 + (-1)
            int r8 = r8 + r4
            goto L57
        L4f:
            r6 = r15[r4]
            r1[r5] = r6
            int r5 = r5 + 1
            r6 = r3
            r8 = r4
        L57:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.put(r7, r4)
            int r4 = r8 + 1
            goto Ld
        L61:
            java.lang.StackTraceElement[] r0 = new java.lang.StackTraceElement[r5]
            java.lang.System.arraycopy(r1, r2, r0, r2, r5)
            int r1 = r15.length
            if (r5 >= r1) goto L6a
            return r0
        L6a:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: sm.f.q(java.lang.StackTraceElement[]):java.lang.StackTraceElement[]");
    }

    @Override // com.opensignal.sdk.common.measurements.base.f
    public String t() {
        return "EmptyServiceStateParcel";
    }

    public String toString() {
        switch (this.f22130a) {
            case 29:
                return "CompositionErrorContext";
            default:
                return super.toString();
        }
    }

    @Override // k5.p
    public r5.p u(k5.l lVar, k5.i iVar) {
        return new o(lVar, iVar);
    }

    @Override // u8.b
    public float v() {
        return 1.0f;
    }

    @Override // vm.a
    public void w(Context context, u.e eVar) {
        Intent intent = new Intent(context, (Class<?>) MainActivity.class);
        intent.setAction("shortcuts.action.run_speed_test");
        intent.putExtra("shortcuts.action.run_speed_test", "BoostSpeedtestNotification");
        PendingIntent activity = PendingIntent.getActivity(context, 4123, intent, 201326592);
        Intent intent2 = new Intent(context, (Class<?>) NotificationSwipeDismissBroadcastReceiver.class);
        intent2.putExtra("NOTIFICATION_ID", 4123);
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 4123, intent2, 201326592);
        String str = (String) eVar.get("Title");
        String str2 = (String) eVar.get("Message");
        String str3 = (String) eVar.get("Primary");
        g3.p pVar = new g3.p(context, context.getString(qk.l.default_notification_channel_id));
        pVar.c(true);
        pVar.f9321s.deleteIntent = broadcast;
        pVar.f9306b.add(new g3.j(0, activity, str3));
        pVar.f9311g = activity;
        pVar.f9321s.icon = qk.f.logonotification;
        pVar.f9317o = context.getResources().getColor(qk.d.notification_color_filter);
        pVar.f9309e = g3.p.b(str);
        g3.n nVar = new g3.n(8, false);
        nVar.f9304g = g3.p.b(str2);
        pVar.e(nVar);
        pVar.f9310f = g3.p.b(str2);
        ((NotificationManager) context.getSystemService("notification")).notify(4123, pVar.a());
        q.a(context).putLong("prefs_last_time_notification_sent", System.currentTimeMillis()).commit();
    }

    @Override // u8.b
    public float y() {
        return 0.0f;
    }

    public f(oh.p pVar) {
        this.f22130a = 21;
    }

    @Override // com.staircase3.opensignal.utils.d
    public void D() {
    }

    @Override // bk.c
    public void f(y yVar) {
    }

    @Override // bk.c
    public void k(y yVar) {
    }

    @Override // bk.c
    public void n(ek.g gVar) {
    }

    @Override // bk.c
    public void o(ek.h hVar) {
    }

    @Override // bk.c
    public void p(ek.g gVar) {
    }

    @Override // bk.c
    public void r(ek.h hVar) {
    }

    @Override // bk.c
    public void s(xi.q qVar) {
    }

    @Override // bk.c
    public void x(xi.q qVar) {
    }
}
