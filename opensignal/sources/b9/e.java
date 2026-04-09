package b9;

import a2.g;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.media.AudioAttributes;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import ar.k;
import bc.i;
import br.l;
import cc.f0;
import com.google.android.exoplayer2.source.dash.DashMediaSource;
import com.google.android.exoplayer2.source.dash.DashSegmentIndex;
import com.google.android.exoplayer2.source.hls.j;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.internal.measurement.e5;
import com.staircase3.opensignal.goldstar.speedtest.result.SpeedResultActivity;
import com.staircase3.opensignal.goldstar.speedtest.result.SpeedTestResult;
import com.staircase3.opensignal.models.PlaceType;
import d4.q;
import dd.h;
import dd.r;
import f5.d0;
import g5.m;
import hf.o;
import io.sentry.android.core.e0;
import io.sentry.c4;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;
import lf.t1;
import lq.b0;
import mq.p;
import mq.w;
import org.json.JSONException;
import org.json.JSONObject;
import pb.g0;
import pb.h0;
import pb.j0;
import pb.q0;
import r8.a0;
import u3.f1;
import u3.h1;
import u3.i0;
import u3.n;
import zt.f;

/* loaded from: classes.dex */
public class e implements g0, DashSegmentIndex, j, f, n, i, ff.b, gf.a, qj.a, dd.c, m, g5.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2480a;

    /* renamed from: d, reason: collision with root package name */
    public Object f2481d;

    public e(int i10) {
        this.f2480a = i10;
        switch (i10) {
            case 14:
                this.f2481d = new r();
                break;
            default:
                this.f2481d = new e(14);
                break;
        }
    }

    public static f0 C(p7.b bVar) {
        HashMap map = new HashMap(15);
        map.put("id", new k7.a(1, 1, "id", "INTEGER", null, true));
        map.put("time", new k7.a(0, 1, "time", "INTEGER", null, true));
        map.put("bufferingTime", new k7.a(0, 1, "bufferingTime", "INTEGER", null, true));
        map.put("loadingTime", new k7.a(0, 1, "loadingTime", "INTEGER", null, true));
        map.put("playbackTime", new k7.a(0, 1, "playbackTime", "REAL", null, true));
        map.put("videoResolution", new k7.a(0, 1, "videoResolution", "TEXT", null, false));
        map.put("videoLength", new k7.a(0, 1, "videoLength", "INTEGER", null, true));
        map.put("testLength", new k7.a(0, 1, "testLength", "INTEGER", null, true));
        map.put("latitude", new k7.a(0, 1, "latitude", "REAL", null, true));
        map.put("longitude", new k7.a(0, 1, "longitude", "REAL", null, true));
        map.put("networkType", new k7.a(0, 1, "networkType", "TEXT", null, false));
        map.put("networkProvider", new k7.a(0, 1, "networkProvider", "TEXT", null, false));
        map.put("networkSubtype", new k7.a(0, 1, "networkSubtype", "TEXT", null, false));
        map.put("seen", new k7.a(0, 1, "seen", "INTEGER", null, true));
        map.put("network_generation", new k7.a(0, 1, "network_generation", "TEXT", null, true));
        k7.e eVar = new k7.e("video_test", map, new HashSet(0), new HashSet(0));
        k7.e eVarA = k7.e.a(bVar, "video_test");
        if (!eVar.equals(eVarA)) {
            return new f0(false, "video_test(com.staircase3.opensignal.goldstar.persistence.VideoTestResult).\n Expected:\n" + eVar + "\n Found:\n" + eVarA, 1);
        }
        HashMap map2 = new HashMap(15);
        map2.put("id", new k7.a(1, 1, "id", "INTEGER", null, true));
        map2.put("time", new k7.a(0, 1, "time", "INTEGER", null, true));
        map2.put("dl_speed", new k7.a(0, 1, "dl_speed", "INTEGER", null, true));
        map2.put("ul_speed", new k7.a(0, 1, "ul_speed", "INTEGER", null, true));
        map2.put("latency", new k7.a(0, 1, "latency", "INTEGER", null, true));
        map2.put("network_type", new k7.a(0, 1, "network_type", "TEXT", null, false));
        map2.put("connection_type", new k7.a(0, 1, "connection_type", "INTEGER", null, true));
        map2.put("network_name", new k7.a(0, 1, "network_name", "TEXT", null, false));
        map2.put("ssid", new k7.a(0, 1, "ssid", "TEXT", null, false));
        map2.put("latitude", new k7.a(0, 1, "latitude", "REAL", null, true));
        map2.put("longitude", new k7.a(0, 1, "longitude", "REAL", null, true));
        map2.put("place_type", new k7.a(0, 1, "place_type", "INTEGER", null, true));
        map2.put("seen", new k7.a(0, 1, "seen", "INTEGER", null, true));
        map2.put("network_provider", new k7.a(0, 1, "network_provider", "TEXT", null, true));
        map2.put("network_generation", new k7.a(0, 1, "network_generation", "TEXT", null, true));
        k7.e eVar2 = new k7.e("speed_test", map2, new HashSet(0), new HashSet(0));
        k7.e eVarA2 = k7.e.a(bVar, "speed_test");
        if (eVar2.equals(eVarA2)) {
            return new f0(true, (String) null, 1);
        }
        return new f0(false, "speed_test(com.staircase3.opensignal.goldstar.speedtest.result.SpeedTestResult).\n Expected:\n" + eVar2 + "\n Found:\n" + eVarA2, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004a, code lost:
    
        r8 = r5.get(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004e, code lost:
    
        r9 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0050, code lost:
    
        r7 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0051, code lost:
    
        r9 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
    
        r7 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0054, code lost:
    
        r9 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
    
        ch.n.e("RecipeEvaluator", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0061, code lost:
    
        ch.n.e("RecipeEvaluator", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0041, code lost:
    
        r1 = new bi.b(r7, r9.f2763b, r9.f2764c);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static lq.l E(java.util.List r7, java.lang.Object r8, bi.b r9) throws org.json.JSONException {
        /*
            java.lang.String r0 = "RecipeEvaluator"
            r1 = 2
            java.lang.Object r1 = r7.get(r1)     // Catch: org.json.JSONException -> L56 java.lang.IndexOutOfBoundsException -> L58
            java.lang.String r1 = (java.lang.String) r1     // Catch: org.json.JSONException -> L56 java.lang.IndexOutOfBoundsException -> L58
            r2 = 3
            java.lang.Object r7 = r7.get(r2)     // Catch: org.json.JSONException -> L56 java.lang.IndexOutOfBoundsException -> L58
            java.lang.String r7 = (java.lang.String) r7     // Catch: org.json.JSONException -> L56 java.lang.IndexOutOfBoundsException -> L58
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch: org.json.JSONException -> L56 java.lang.IndexOutOfBoundsException -> L58
            java.lang.String r3 = java.lang.String.valueOf(r8)     // Catch: org.json.JSONException -> L56 java.lang.IndexOutOfBoundsException -> L58
            r2.<init>(r3)     // Catch: org.json.JSONException -> L56 java.lang.IndexOutOfBoundsException -> L58
            int r3 = r2.length()     // Catch: org.json.JSONException -> L56 java.lang.IndexOutOfBoundsException -> L58
            r4 = 0
        L1e:
            if (r4 >= r3) goto L64
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: org.json.JSONException -> L56 java.lang.IndexOutOfBoundsException -> L58
            java.lang.Object r6 = r2.get(r4)     // Catch: org.json.JSONException -> L56 java.lang.IndexOutOfBoundsException -> L58
            java.lang.String r6 = r6.toString()     // Catch: org.json.JSONException -> L56 java.lang.IndexOutOfBoundsException -> L58
            r5.<init>(r6)     // Catch: org.json.JSONException -> L56 java.lang.IndexOutOfBoundsException -> L58
            java.lang.String r6 = "registered"
            boolean r6 = r5.getBoolean(r6)     // Catch: org.json.JSONException -> L56 java.lang.IndexOutOfBoundsException -> L58
            if (r6 == 0) goto L5a
            java.lang.String r6 = "type"
            java.lang.String r6 = r5.getString(r6)     // Catch: org.json.JSONException -> L56 java.lang.IndexOutOfBoundsException -> L58
            boolean r6 = br.l.a(r6, r1)     // Catch: org.json.JSONException -> L56 java.lang.IndexOutOfBoundsException -> L58
            if (r6 == 0) goto L5a
            bi.b r1 = new bi.b     // Catch: org.json.JSONException -> L56 java.lang.IndexOutOfBoundsException -> L58
            java.lang.String r2 = r9.f2763b     // Catch: org.json.JSONException -> L56 java.lang.IndexOutOfBoundsException -> L58
            java.lang.Object r3 = r9.f2764c     // Catch: org.json.JSONException -> L56 java.lang.IndexOutOfBoundsException -> L58
            r1.<init>(r7, r2, r3)     // Catch: org.json.JSONException -> L56 java.lang.IndexOutOfBoundsException -> L58
            java.lang.Object r8 = r5.get(r7)     // Catch: org.json.JSONException -> L50 java.lang.IndexOutOfBoundsException -> L53
            r9 = r1
            goto L64
        L50:
            r7 = move-exception
            r9 = r1
            goto L5d
        L53:
            r7 = move-exception
            r9 = r1
            goto L61
        L56:
            r7 = move-exception
            goto L5d
        L58:
            r7 = move-exception
            goto L61
        L5a:
            int r4 = r4 + 1
            goto L1e
        L5d:
            ch.n.e(r0, r7)
            goto L64
        L61:
            ch.n.e(r0, r7)
        L64:
            lq.l r7 = new lq.l
            r7.<init>(r9, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: b9.e.E(java.util.List, java.lang.Object, bi.b):lq.l");
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0042, code lost:
    
        r9 = r5.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x004f, code lost:
    
        r10 = new bi.b(r8, r10.f2763b, r10.f2764c);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static lq.l F(java.util.List r8, java.lang.Object r9, bi.b r10) throws org.json.JSONException, java.lang.NumberFormatException {
        /*
            java.lang.String r0 = "RecipeEvaluator"
            r1 = 2
            java.lang.Object r1 = r8.get(r1)     // Catch: java.lang.NumberFormatException -> L51 org.json.JSONException -> L53 java.lang.IndexOutOfBoundsException -> L55
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.NumberFormatException -> L51 org.json.JSONException -> L53 java.lang.IndexOutOfBoundsException -> L55
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L51 org.json.JSONException -> L53 java.lang.IndexOutOfBoundsException -> L55
            r2 = 3
            java.lang.Object r8 = r8.get(r2)     // Catch: java.lang.NumberFormatException -> L51 org.json.JSONException -> L53 java.lang.IndexOutOfBoundsException -> L55
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.NumberFormatException -> L51 org.json.JSONException -> L53 java.lang.IndexOutOfBoundsException -> L55
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch: java.lang.NumberFormatException -> L51 org.json.JSONException -> L53 java.lang.IndexOutOfBoundsException -> L55
            java.lang.String r3 = java.lang.String.valueOf(r9)     // Catch: java.lang.NumberFormatException -> L51 org.json.JSONException -> L53 java.lang.IndexOutOfBoundsException -> L55
            r2.<init>(r3)     // Catch: java.lang.NumberFormatException -> L51 org.json.JSONException -> L53 java.lang.IndexOutOfBoundsException -> L55
            int r3 = r2.length()     // Catch: java.lang.NumberFormatException -> L51 org.json.JSONException -> L53 java.lang.IndexOutOfBoundsException -> L55
            r4 = 0
        L22:
            if (r4 >= r3) goto L65
            java.lang.Object r5 = r2.get(r4)     // Catch: java.lang.NumberFormatException -> L51 org.json.JSONException -> L53 java.lang.IndexOutOfBoundsException -> L55
            java.lang.String r6 = "null cannot be cast to non-null type org.json.JSONObject"
            br.l.c(r5, r6)     // Catch: java.lang.NumberFormatException -> L51 org.json.JSONException -> L53 java.lang.IndexOutOfBoundsException -> L55
            org.json.JSONObject r5 = (org.json.JSONObject) r5     // Catch: java.lang.NumberFormatException -> L51 org.json.JSONException -> L53 java.lang.IndexOutOfBoundsException -> L55
            java.lang.String r6 = "endpoint_type"
            java.lang.Object r6 = r5.get(r6)     // Catch: java.lang.NumberFormatException -> L51 org.json.JSONException -> L53 java.lang.IndexOutOfBoundsException -> L55
            java.lang.String r7 = "null cannot be cast to non-null type kotlin.Int"
            br.l.c(r6, r7)     // Catch: java.lang.NumberFormatException -> L51 org.json.JSONException -> L53 java.lang.IndexOutOfBoundsException -> L55
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch: java.lang.NumberFormatException -> L51 org.json.JSONException -> L53 java.lang.IndexOutOfBoundsException -> L55
            int r6 = r6.intValue()     // Catch: java.lang.NumberFormatException -> L51 org.json.JSONException -> L53 java.lang.IndexOutOfBoundsException -> L55
            if (r6 != r1) goto L57
            java.lang.Object r9 = r5.get(r8)     // Catch: java.lang.NumberFormatException -> L51 org.json.JSONException -> L53 java.lang.IndexOutOfBoundsException -> L55
            bi.b r1 = new bi.b     // Catch: java.lang.NumberFormatException -> L51 org.json.JSONException -> L53 java.lang.IndexOutOfBoundsException -> L55
            java.lang.String r2 = r10.f2763b     // Catch: java.lang.NumberFormatException -> L51 org.json.JSONException -> L53 java.lang.IndexOutOfBoundsException -> L55
            java.lang.Object r3 = r10.f2764c     // Catch: java.lang.NumberFormatException -> L51 org.json.JSONException -> L53 java.lang.IndexOutOfBoundsException -> L55
            r1.<init>(r8, r2, r3)     // Catch: java.lang.NumberFormatException -> L51 org.json.JSONException -> L53 java.lang.IndexOutOfBoundsException -> L55
            r10 = r1
            goto L65
        L51:
            r8 = move-exception
            goto L5a
        L53:
            r8 = move-exception
            goto L5e
        L55:
            r8 = move-exception
            goto L62
        L57:
            int r4 = r4 + 1
            goto L22
        L5a:
            ch.n.e(r0, r8)
            goto L65
        L5e:
            ch.n.e(r0, r8)
            goto L65
        L62:
            ch.n.e(r0, r8)
        L65:
            lq.l r8 = new lq.l
            r8.<init>(r10, r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: b9.e.F(java.util.List, java.lang.Object, bi.b):lq.l");
    }

    public static String G(String str, Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01fc, code lost:
    
        if (r2.equals("contained") == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x020b, code lost:
    
        return tt.l.q0(java.lang.String.valueOf(r14), java.lang.String.valueOf(r3), false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0036, code lost:
    
        if (r2.equals(">") == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0055, code lost:
    
        if (r2.equals("<") == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0059, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005a, code lost:
    
        if (r14 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005c, code lost:
    
        r4 = r14.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0060, code lost:
    
        if (r4 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0062, code lost:
    
        r4 = tt.s.o0(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0067, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006a, code lost:
    
        if (r4 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006c, code lost:
    
        r4 = tt.s.o0(java.lang.String.valueOf(r14));
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0076, code lost:
    
        if (r14 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0078, code lost:
    
        r4 = r14.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x007c, code lost:
    
        if (r4 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007e, code lost:
    
        r4 = tt.r.e0(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0083, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0084, code lost:
    
        if (r4 == null) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0086, code lost:
    
        r9 = tt.r.e0(java.lang.String.valueOf(r14));
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0090, code lost:
    
        r13 = r13.f2763b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0092, code lost:
    
        if (r3 == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0094, code lost:
    
        r10 = r3.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0098, code lost:
    
        if (r10 == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009a, code lost:
    
        r10 = tt.s.o0(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x009f, code lost:
    
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a0, code lost:
    
        if (r10 == null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a2, code lost:
    
        r8 = null;
        r2 = tt.s.o0(java.lang.String.valueOf(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ae, code lost:
    
        if (r3 == null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b0, code lost:
    
        r10 = r3.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00b4, code lost:
    
        if (r10 == null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b6, code lost:
    
        r10 = tt.r.e0(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00bb, code lost:
    
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00bc, code lost:
    
        if (r10 == null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00be, code lost:
    
        r8 = tt.r.e0(java.lang.String.valueOf(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c7, code lost:
    
        ch.n.b("RecipeEvaluator", r3 + " is not a number, can't compare");
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00e2, code lost:
    
        if (r4 == null) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e4, code lost:
    
        if (r2 == null) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ea, code lost:
    
        if (r13.equals(">") == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00f4, code lost:
    
        if (r4.intValue() <= r2.intValue()) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00f6, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00fc, code lost:
    
        if (r13.equals("<") == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0106, code lost:
    
        if (r4.intValue() >= r2.intValue()) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0109, code lost:
    
        ch.n.b("RecipeEvaluator", r13 + " can't be used to compare " + r4 + " and " + r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0128, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0129, code lost:
    
        if (r9 == null) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x012b, code lost:
    
        if (r8 == null) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0131, code lost:
    
        if (r13.equals(">") == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x013d, code lost:
    
        if (r9.floatValue() <= r8.floatValue()) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0144, code lost:
    
        if (r13.equals("<") == false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0150, code lost:
    
        if (r9.floatValue() >= r8.floatValue()) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0153, code lost:
    
        ch.n.b("RecipeEvaluator", "Is " + r14 + ' ' + r13 + ' ' + r3 + " = " + r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x017e, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x017f, code lost:
    
        ch.n.b("RecipeEvaluator", r13 + " can't be used to compare " + r4 + " and " + r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x019e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x019f, code lost:
    
        ch.n.b("RecipeEvaluator", r3 + " and " + r14 + " have different types. Comparison not implemented.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01bd, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01be, code lost:
    
        ch.n.b("RecipeEvaluator", r14 + " is not a number, can't compare");
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01d4, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01db, code lost:
    
        if (r2.equals("in") == false) goto L106;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m(bi.b r13, java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 534
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b9.e.m(bi.b, java.lang.Object):boolean");
    }

    public static String p(int i10, String str) {
        if (i10 == 1) {
            return str.concat("=?");
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append(str.concat("=?"));
            if (i11 < i10 - 1) {
                sb2.append(" OR ");
            }
        }
        String string = sb2.toString();
        l.d(string, "toString(...)");
        return string;
    }

    public static String r(List list, List list2) {
        if (list.isEmpty() || list2.isEmpty()) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                e5.Q();
                throw null;
            }
            sb2.append(((String) obj) + " = ?");
            if (i10 < list.size() - 1) {
                sb2.append(" AND ");
            }
            i10 = i11;
        }
        return sb2.toString();
    }

    public void A(PlaceType placeType) {
        SpeedResultActivity speedResultActivity = (SpeedResultActivity) this.f2481d;
        bm.d dVar = speedResultActivity.V;
        if (dVar == null) {
            l.l("presenter");
            throw null;
        }
        l.e(placeType, "placeType");
        ExecutorService executorService = (ExecutorService) dVar.f2828r;
        l.d(executorService, "backgroundExecutor");
        SpeedTestResult speedTestResult = (SpeedTestResult) dVar.f2827g;
        if (speedTestResult == null) {
            l.l("speedTestResult");
            throw null;
        }
        executorService.execute(new ch.a(dVar, speedTestResult, placeType, 6));
        i4.b bVar = speedResultActivity.X;
        if (bVar == null) {
            l.l("placeTypeSurveyWidget");
            throw null;
        }
        g gVar = (g) bVar.f11196a;
        if (gVar == null) {
            l.l("binding");
            throw null;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) gVar.f31a;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(8);
        }
    }

    public void B(Exception exc) {
        a5.a.n("MediaCodecAudioRenderer", "Audio sink error", exc);
        io.sentry.internal.debugmeta.c cVar = ((d0) this.f2481d).Y0;
        Handler handler = (Handler) cVar.f12353d;
        if (handler != null) {
            handler.post(new f5.d(cVar, exc, 1));
        }
    }

    @Override // pb.g0
    public void K(j0 j0Var, long j, long j7) {
        ((DashMediaSource) this.f2481d).onUtcTimestampLoadCompleted((q0) j0Var, j, j7);
    }

    @Override // bc.i
    public void accept(Object obj, Object obj2) {
        h hVar = (h) obj2;
        ec.c cVar = (ec.c) ((ec.e) obj).m();
        TelemetryData telemetryData = (TelemetryData) this.f2481d;
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(cVar.f5252f);
        int i10 = mc.b.f16672a;
        if (telemetryData == null) {
            parcelObtain.writeInt(0);
        } else {
            parcelObtain.writeInt(1);
            telemetryData.writeToParcel(parcelObtain, 0);
        }
        try {
            cVar.f5251e.transact(1, parcelObtain, null, 1);
            parcelObtain.recycle();
            hVar.a(null);
        } catch (Throwable th2) {
            parcelObtain.recycle();
            throw th2;
        }
    }

    @Override // qj.a
    public ArrayList b(hi.a aVar, List list, List list2) throws IOException {
        ArrayList arrayList = new ArrayList();
        v(aVar, "task_id", list, list2, new fi.d(aVar, arrayList, 2));
        return arrayList;
    }

    @Override // gf.a
    public void c(o oVar) {
        this.f2481d = oVar;
        Log.isLoggable("FirebaseCrashlytics", 3);
    }

    @Override // u3.n
    public h1 c0(View view, h1 h1Var) {
        switch (this.f2480a) {
            case 16:
                f1 f1Var = h1Var.f23176a;
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f2481d;
                if (!Objects.equals(coordinatorLayout.J, h1Var)) {
                    coordinatorLayout.J = h1Var;
                    boolean z10 = h1Var.d() > 0;
                    coordinatorLayout.K = z10;
                    coordinatorLayout.setWillNotDraw(!z10 && coordinatorLayout.getBackground() == null);
                    if (!f1Var.n()) {
                        int childCount = coordinatorLayout.getChildCount();
                        for (int i10 = 0; i10 < childCount; i10++) {
                            View childAt = coordinatorLayout.getChildAt(i10);
                            WeakHashMap weakHashMap = i0.f23177a;
                            if (!childAt.getFitsSystemWindows() || ((e3.e) childAt.getLayoutParams()).f7771a == null || !f1Var.n()) {
                            }
                        }
                    }
                    coordinatorLayout.requestLayout();
                    break;
                }
                break;
            default:
                ge.h hVar = (ge.h) this.f2481d;
                hVar.f9547l = h1Var.a();
                hVar.f9548m = h1Var.b();
                hVar.f9549n = h1Var.c();
                hVar.e();
                break;
        }
        return h1Var;
    }

    @Override // qj.a
    public Object d(hi.a aVar, long j) throws IOException {
        SQLiteDatabase readableDatabase = ((SQLiteOpenHelper) this.f2481d).getReadableDatabase();
        l.d(readableDatabase, "getReadableDatabase(...)");
        Cursor cursorQuery = readableDatabase.query(aVar.g(), null, "id=?", new String[]{String.valueOf(j)}, null, null, null);
        l.d(cursorQuery, "query(...)");
        try {
            Object objE = cursorQuery.moveToFirst() ? aVar.e(cursorQuery) : null;
            cursorQuery.close();
            return objE;
        } finally {
        }
    }

    @Override // qj.a
    public ArrayList e(hi.a aVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        fi.d dVar = new fi.d(aVar, arrayList, 3);
        w wVar = w.f16945a;
        v(aVar, "task_name", wVar, wVar, dVar);
        return arrayList;
    }

    @Override // qj.a
    public int f(hi.a aVar, long j) {
        int iDelete = u().delete(aVar.g(), "time_in_millis<?", new String[]{String.valueOf(j)});
        ch.n.b("RawDatabaseDataSource", h0.b.h(iDelete, "trimmedRowsCount: "));
        return iDelete;
    }

    @Override // qj.a
    public long g(hi.a aVar, ContentValues contentValues, long j) {
        l.e(contentValues, "contentValues");
        return u().update(aVar.g(), contentValues, "id=?", new String[]{String.valueOf(j)});
    }

    @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
    public long getAvailableSegmentCount(long j, long j7) {
        return 1L;
    }

    @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
    public long getFirstAvailableSegmentNum(long j, long j7) {
        return 0L;
    }

    @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
    public long getFirstSegmentNum() {
        return 0L;
    }

    @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
    public long getNextSegmentAvailableTimeUs(long j, long j7) {
        return -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
    public long getSegmentCount(long j) {
        return 1L;
    }

    @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
    public long getSegmentNum(long j, long j7) {
        return 0L;
    }

    @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
    public cb.i getSegmentUrl(long j) {
        return (cb.i) this.f2481d;
    }

    @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
    public long getTimeUs(long j) {
        return 0L;
    }

    @Override // qj.a
    public int h(hi.a aVar, List list) {
        if (list.isEmpty()) {
            return 0;
        }
        ArrayList arrayList = new ArrayList(p.a0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).longValue()));
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(arrayList);
        Object[] array = arrayList2.toArray(new String[arrayList2.size()]);
        l.d(array, "toArray(...)");
        String[] strArr = (String[]) array;
        int iDelete = u().delete(aVar.g(), p(strArr.length, "id"), strArr);
        ch.n.b("RawDatabaseDataSource", h0.b.h(iDelete, "deletedRowsCount: "));
        return iDelete;
    }

    @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
    public boolean isExplicit() {
        return true;
    }

    @Override // qj.a
    public ArrayList j(hi.a aVar, List list, List list2) throws IOException {
        l.e(aVar, "databaseTable");
        ArrayList arrayList = new ArrayList();
        String strR = r(list, list2);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(list2);
        Object[] array = arrayList2.toArray(new String[arrayList2.size()]);
        l.d(array, "toArray(...)");
        SQLiteDatabase readableDatabase = ((SQLiteOpenHelper) this.f2481d).getReadableDatabase();
        l.d(readableDatabase, "getReadableDatabase(...)");
        Cursor cursorQuery = readableDatabase.query(aVar.g(), null, strR, (String[]) array, null, null, "id");
        l.d(cursorQuery, "query(...)");
        try {
            if (cursorQuery.moveToFirst()) {
                do {
                    arrayList.add(aVar.e(cursorQuery));
                } while (cursorQuery.moveToNext());
            }
            cursorQuery.close();
            return arrayList;
        } finally {
        }
    }

    @Override // qj.a
    public void k(hi.a aVar, ContentValues contentValues) {
        l.e(aVar, "databaseTable");
        l.e(contentValues, "contentValues");
        u().insertWithOnConflict(aVar.g(), null, contentValues, 5);
    }

    @Override // zt.f
    public Object l(zt.g gVar, pq.c cVar) {
        Object objL = ((xr.a) this.f2481d).l(new q(0, gVar), cVar);
        return objL == qq.a.COROUTINE_SUSPENDED ? objL : b0.f15562a;
    }

    @Override // ff.b
    public void n(String str, Bundle bundle) {
        o oVar = (o) this.f2481d;
        if (oVar != null) {
            try {
                String str2 = "$A$:" + G(str, bundle);
                hf.q qVar = oVar.f10687a;
                qVar.f10704o.f13707a.a(new hf.p(qVar, System.currentTimeMillis() - qVar.f10695d, str2, 0));
            } catch (JSONException unused) {
                e0.q("FirebaseCrashlytics", "Unable to serialize Firebase Analytics event to breadcrumb.", null);
            }
        }
    }

    @Override // qj.a
    public int o(hi.a aVar, String str, List list) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        Object[] array = arrayList.toArray(new String[arrayList.size()]);
        l.d(array, "toArray(...)");
        String[] strArr = (String[]) array;
        int iDelete = u().delete(aVar.g(), p(strArr.length, str), strArr);
        ch.n.b("RawDatabaseDataSource", h0.b.h(iDelete, "deletedRowsCount: "));
        return iDelete;
    }

    @Override // pb.g0
    public h0 q(j0 j0Var, long j, long j7, IOException iOException, int i10) {
        return ((DashMediaSource) this.f2481d).onUtcTimestampLoadError((q0) j0Var, j, j7, iOException);
    }

    @Override // dd.c
    public void s(r rVar) {
        Exception excG = rVar.g();
        if (excG != null) {
            ((wt.g) this.f2481d).g(t1.k(excG));
        } else if (rVar.f7321d) {
            ((wt.g) this.f2481d).q(null);
        } else {
            ((wt.g) this.f2481d).g(rVar.h());
        }
    }

    public a0 t(Context context, String str, InputStream inputStream, String str2, String str3) {
        a0 a0VarG;
        a0 a0VarD;
        b bVar;
        c cVar = (c) this.f2481d;
        if (str2 == null) {
            str2 = "application/json";
        }
        if (str2.contains("application/zip") || str2.contains("application/x-zip") || str2.contains("application/x-zip-compressed") || str.split("\\?")[0].endsWith(".lottie")) {
            e9.c.a();
            b bVar2 = b.ZIP;
            if (str3 != null) {
                File fileW = cVar.w(str, inputStream, bVar2);
                a0VarG = r8.l.g(context, new ZipInputStream(xu.d.j(fileW, new FileInputStream(fileW))), str);
            } else {
                a0VarG = r8.l.g(context, new ZipInputStream(inputStream), null);
            }
            a0VarD = a0VarG;
            bVar = bVar2;
        } else if (str2.contains("application/gzip") || str2.contains("application/x-gzip") || str.split("\\?")[0].endsWith(".tgs")) {
            e9.c.a();
            bVar = b.GZIP;
            if (str3 != null) {
                File fileW2 = cVar.w(str, inputStream, bVar);
                a0VarD = r8.l.d(new GZIPInputStream(xu.d.j(fileW2, new FileInputStream(fileW2))), str);
            } else {
                a0VarD = r8.l.d(new GZIPInputStream(inputStream), null);
            }
        } else {
            e9.c.a();
            bVar = b.JSON;
            if (str3 != null) {
                String absolutePath = cVar.w(str, inputStream, bVar).getAbsolutePath();
                FileInputStream fileInputStream = new FileInputStream(absolutePath);
                if (c4.c().k().isTracingEnabled()) {
                    fileInputStream = new io.sentry.instrumentation.file.e(io.sentry.instrumentation.file.e.b(absolutePath != null ? new File(absolutePath) : null, fileInputStream));
                }
                a0VarD = r8.l.d(fileInputStream, str);
            } else {
                a0VarD = r8.l.d(inputStream, null);
            }
        }
        if (str3 != null && a0VarD.f21304a != null) {
            File file = new File(cVar.u(), c.g(str, bVar, true));
            File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
            boolean zRenameTo = file.renameTo(file2);
            file2.toString();
            e9.c.a();
            if (!zRenameTo) {
                e9.c.b("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + ".");
            }
        }
        return a0VarD;
    }

    public SQLiteDatabase u() {
        SQLiteDatabase writableDatabase = ((SQLiteOpenHelper) this.f2481d).getWritableDatabase();
        l.d(writableDatabase, "getWritableDatabase(...)");
        return writableDatabase;
    }

    public ArrayList v(hi.a aVar, String str, List list, List list2, k kVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        List listH = e5.H("DISTINCT ".concat(str));
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(listH);
        Object[] array = arrayList2.toArray(new String[arrayList2.size()]);
        l.d(array, "toArray(...)");
        String[] strArr = (String[]) array;
        String strR = r(list, list2);
        ArrayList arrayList3 = new ArrayList();
        arrayList3.addAll(list2);
        Object[] array2 = arrayList3.toArray(new String[arrayList3.size()]);
        l.d(array2, "toArray(...)");
        SQLiteDatabase readableDatabase = ((SQLiteOpenHelper) this.f2481d).getReadableDatabase();
        l.d(readableDatabase, "getReadableDatabase(...)");
        Cursor cursorQuery = readableDatabase.query(true, aVar.g(), strArr, strR, (String[]) array2, null, null, "id", null);
        if (cursorQuery == null) {
            return arrayList;
        }
        try {
            if (cursorQuery.moveToFirst()) {
                do {
                    kVar.a(cursorQuery);
                } while (cursorQuery.moveToNext());
            }
            cursorQuery.close();
            return arrayList;
        } finally {
        }
    }

    public ba.b w() {
        return (ba.b) this.f2481d;
    }

    @Override // pb.g0
    public void x(j0 j0Var, long j, long j7, boolean z10) {
        ((DashMediaSource) this.f2481d).onLoadCanceled((q0) j0Var, j, j7);
    }

    public UUID y() {
        return com.google.android.exoplayer2.h.f4166a;
    }

    public int z() {
        return 1;
    }

    public /* synthetic */ e(int i10, Object obj) {
        this.f2480a = i10;
        this.f2481d = obj;
    }

    public /* synthetic */ e(int i10, boolean z10) {
        this.f2480a = i10;
    }

    public /* synthetic */ e(Object obj, int i10, Object obj2) {
        this.f2480a = i10;
        this.f2481d = obj;
    }

    public e(ch.f fVar) {
        Object iVar;
        this.f2480a = 10;
        Integer num = fVar.f3942b;
        if ((num != null ? num.intValue() : 0) >= 3600001) {
            iVar = new sm.m();
        } else if (fVar.g()) {
            iVar = new et.d();
        } else {
            iVar = new io.sentry.hints.i(4);
        }
        this.f2481d = iVar;
    }

    public e(wt.q qVar) {
        this.f2480a = 19;
        l.e(qVar, "dispatcher");
        this.f2481d = a.a.b(Integer.MAX_VALUE, 6, null);
        wt.w.s(wt.w.b(se.b.M(qVar, wt.w.c())), null, null, new au.e(this, (pq.c) null, 6), 3);
    }

    public e(boolean z10) {
        this.f2480a = 29;
        this.f2481d = new AtomicBoolean(z10);
    }

    public e(androidx.media3.common.f fVar) {
        this.f2480a = 2;
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(fVar.f1619a).setFlags(fVar.f1620d).setUsage(fVar.f1621g);
        int i10 = a5.d0.f105a;
        if (i10 >= 29) {
            androidx.media3.common.c.a(usage, fVar.f1622r);
        }
        if (i10 >= 32) {
            androidx.media3.common.e.a(usage, fVar.f1623x);
        }
        this.f2481d = usage.build();
    }

    public void D(ba.d dVar) {
    }

    public void i(ba.d dVar) {
    }

    @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
    public long getDurationUs(long j, long j7) {
        return j7;
    }
}
