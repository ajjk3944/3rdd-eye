package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ve2 implements y32 {
    public boolean f;

    public static int a(Context context, Map map, String str, int i) {
        String str2 = (String) map.get(str);
        if (str2 != null) {
            try {
                j63 j63Var = sv1.f.a;
                i = j63.b(context, Integer.parseInt(str2));
            } catch (NumberFormatException unused) {
                StringBuilder sb = new StringBuilder(str.length() + 34 + str2.length());
                sb.append("Could not parse ");
                sb.append(str);
                sb.append(" in a video GMSG: ");
                sb.append(str2);
                gi2.i0(sb.toString());
            }
        }
        if (gi2.R()) {
            int length = str.length();
            StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + length + 30 + String.valueOf(str2).length() + 6 + 1);
            ex0.q(sb2, "Parse pixels for ", str, ", got string ", str2);
            sb2.append(", int ");
            sb2.append(i);
            sb2.append(".");
            gi2.G(sb2.toString());
        }
        return i;
    }

    public static void b(ee2 ee2Var, Map map) throws NumberFormatException {
        ae2 ae2Var = ee2Var.l;
        String str = (String) map.get("minBufferMs");
        String str2 = (String) map.get("maxBufferMs");
        String str3 = (String) map.get("bufferForPlaybackMs");
        String str4 = (String) map.get("bufferForPlaybackAfterRebufferMs");
        String str5 = (String) map.get("socketReceiveBufferSize");
        if (str != null) {
            try {
                int i = Integer.parseInt(str);
                if (ae2Var != null) {
                    ae2Var.B(i);
                }
            } catch (NumberFormatException unused) {
                gi2.i0("Could not parse buffer parameters in loadControl video GMSG: (" + str + ", " + str2 + ")");
                return;
            }
        }
        if (str2 != null) {
            int i2 = Integer.parseInt(str2);
            if (ae2Var != null) {
                ae2Var.C(i2);
            }
        }
        if (str3 != null) {
            int i3 = Integer.parseInt(str3);
            if (ae2Var != null) {
                ae2Var.a(i3);
            }
        }
        if (str4 != null) {
            int i4 = Integer.parseInt(str4);
            if (ae2Var != null) {
                ae2Var.b(i4);
            }
        }
        if (str5 != null) {
            int i5 = Integer.parseInt(str5);
            if (ae2Var == null) {
                return;
            }
            ae2Var.c(i5);
        }
    }

    @Override // defpackage.y32
    public final void c(Object obj, Map map) throws JSONException, NumberFormatException {
        int iMin;
        int iMin2;
        int i;
        boolean z;
        int i2;
        ee2 ee2Var;
        ae2 ae2Var;
        ag2 ag2Var = (ag2) obj;
        String str = (String) map.get("action");
        if (str == null) {
            gi2.i0("Action missing from video GMSG.");
            return;
        }
        Integer numValueOf = null;
        Integer numValueOf2 = map.containsKey("playerId") ? Integer.valueOf(Integer.parseInt((String) map.get("playerId"))) : null;
        Integer numZ = (ag2Var.f0() == null || (ee2Var = (ee2) ag2Var.f0().k) == null || (ae2Var = ee2Var.l) == null) ? null : ae2Var.z();
        if (numValueOf2 != null && numZ != null && !numValueOf2.equals(numZ) && !str.equals("load")) {
            Locale locale = Locale.US;
            gi2.f0("Event intended for player " + numValueOf2 + ", but sent to player " + numZ + " - event ignored");
            return;
        }
        Integer num = numValueOf2;
        if (gi2.q0(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            String string = jSONObject.toString();
            StringBuilder sb = new StringBuilder(str.length() + 13 + String.valueOf(string).length());
            sb.append("Video GMSG: ");
            sb.append(str);
            sb.append(" ");
            sb.append(string);
            gi2.U(sb.toString());
        }
        if (str.equals("background")) {
            String str2 = (String) map.get("color");
            if (TextUtils.isEmpty(str2)) {
                gi2.i0("Color parameter missing from background video GMSG.");
                return;
            }
            try {
                ag2Var.setBackgroundColor(Color.parseColor(str2));
                return;
            } catch (IllegalArgumentException unused) {
                gi2.i0("Invalid color parameter in background video GMSG.");
                return;
            }
        }
        if (str.equals("playerBackground")) {
            String str3 = (String) map.get("color");
            if (TextUtils.isEmpty(str3)) {
                gi2.i0("Color parameter missing from playerBackground video GMSG.");
                return;
            }
            try {
                ag2Var.Q(Color.parseColor(str3));
                return;
            } catch (IllegalArgumentException unused2) {
                gi2.i0("Invalid color parameter in playerBackground video GMSG.");
                return;
            }
        }
        if (str.equals("decoderProps")) {
            String str4 = (String) map.get("mimeTypes");
            if (str4 == null) {
                gi2.i0("No MIME types specified for decoder properties inspection.");
                HashMap map2 = new HashMap();
                map2.put("event", "decoderProps");
                map2.put("error", "missingMimeTypes");
                ag2Var.a("onVideoEvent", map2);
                return;
            }
            HashMap map3 = new HashMap();
            for (String str5 : str4.split(",")) {
                map3.put(str5, cg2.a(str5.trim()));
            }
            HashMap map4 = new HashMap();
            map4.put("event", "decoderProps");
            map4.put("mimeTypes", map3);
            ag2Var.a("onVideoEvent", map4);
            return;
        }
        g4 g4VarF0 = ag2Var.f0();
        if (g4VarF0 == null) {
            gi2.i0("Could not get underlay container for a video GMSG.");
            return;
        }
        boolean zEquals = str.equals("new");
        boolean zEquals2 = str.equals("position");
        if (zEquals || zEquals2) {
            Context context = ag2Var.getContext();
            int iA = a(context, map, "x", 0);
            int iA2 = a(context, map, "y", 0);
            int iA3 = a(context, map, "w", -1);
            iz1 iz1Var = mz1.k4;
            tw1 tw1Var = tw1.e;
            if (((Boolean) tw1Var.c.a(iz1Var)).booleanValue()) {
                iMin = iA3 == -1 ? ag2Var.d() : Math.min(iA3, ag2Var.d());
            } else {
                if (gi2.R()) {
                    int iD = ag2Var.d();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(iA).length() + ga1.i(String.valueOf(iD), String.valueOf(iA3).length() + 72, 4) + 1);
                    sb2.append("Calculate width with original width ");
                    sb2.append(iA3);
                    sb2.append(", videoHost.getVideoBoundingWidth() ");
                    sb2.append(iD);
                    sb2.append(", x ");
                    sb2.append(iA);
                    sb2.append(".");
                    gi2.G(sb2.toString());
                }
                iMin = Math.min(iA3, ag2Var.d() - iA);
            }
            int iA4 = a(context, map, "h", -1);
            if (((Boolean) tw1Var.c.a(iz1Var)).booleanValue()) {
                iMin2 = iA4 == -1 ? ag2Var.K() : Math.min(iA4, ag2Var.K());
            } else {
                if (gi2.R()) {
                    int iK = ag2Var.K();
                    StringBuilder sb3 = new StringBuilder(String.valueOf(iA2).length() + ga1.i(String.valueOf(iK), String.valueOf(iA4).length() + 75, 4) + 1);
                    sb3.append("Calculate height with original height ");
                    sb3.append(iA4);
                    sb3.append(", videoHost.getVideoBoundingHeight() ");
                    sb3.append(iK);
                    sb3.append(", y ");
                    sb3.append(iA2);
                    sb3.append(".");
                    gi2.G(sb3.toString());
                }
                iMin2 = Math.min(iA4, ag2Var.K() - iA2);
            }
            try {
                i = Integer.parseInt((String) map.get("player"));
            } catch (NumberFormatException unused3) {
                i = 0;
            }
            boolean z2 = Boolean.parseBoolean((String) map.get("spherical"));
            if (!zEquals || ((ee2) g4VarF0.k) != null) {
                ou1.h("The underlay may only be modified from the UI thread.");
                ee2 ee2Var2 = (ee2) g4VarF0.k;
                if (ee2Var2 != null) {
                    ee2Var2.l(iA, iA2, iMin, iMin2);
                    return;
                }
                return;
            }
            je2 je2Var = new je2((String) map.get("flags"));
            if (((ee2) g4VarF0.k) == null) {
                jg2 jg2Var = (jg2) g4VarF0.j;
                og2 og2Var = jg2Var.f;
                pu1.t((tz1) og2Var.Q.h, og2Var.O, "vpr2");
                ee2 ee2Var3 = new ee2((Context) g4VarF0.g, jg2Var, i, z2, (tz1) jg2Var.f.Q.h, je2Var, (mv2) g4VarF0.i);
                g4VarF0.k = ee2Var3;
                ((jg2) g4VarF0.h).addView(ee2Var3, 0, new ViewGroup.LayoutParams(-1, -1));
                ((ee2) g4VarF0.k).l(iA, iA2, iMin, iMin2);
                jg2Var.f.s.q = false;
            }
            ee2 ee2Var4 = (ee2) g4VarF0.k;
            if (ee2Var4 != null) {
                b(ee2Var4, map);
                return;
            }
            return;
        }
        qg2 qg2VarF = ag2Var.f();
        if (qg2VarF != null) {
            if (str.equals("timeupdate")) {
                String str6 = (String) map.get("currentTime");
                if (str6 == null) {
                    gi2.i0("currentTime parameter missing from timeupdate video GMSG.");
                    return;
                }
                try {
                    float f = Float.parseFloat(str6);
                    synchronized (qg2VarF.g) {
                        qg2VarF.o = f;
                    }
                    return;
                } catch (NumberFormatException unused4) {
                    gi2.i0("Could not parse currentTime parameter from timeupdate video GMSG: ".concat(str6));
                    return;
                }
            }
            if (str.equals("skip")) {
                synchronized (qg2VarF.g) {
                    z = qg2VarF.m;
                    i2 = qg2VarF.j;
                    qg2VarF.j = 3;
                }
                md2.f.execute(new pg2(qg2VarF, i2, 3, z, z));
                return;
            }
        }
        ee2 ee2Var5 = (ee2) g4VarF0.k;
        if (ee2Var5 == null) {
            HashMap map5 = new HashMap();
            map5.put("event", "no_video_view");
            ag2Var.a("onVideoEvent", map5);
            return;
        }
        if (str.equals("click")) {
            Context context2 = ag2Var.getContext();
            int iA5 = a(context2, map, "x", 0);
            float fA = a(context2, map, "y", 0);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, iA5, fA, 0);
            ae2 ae2Var2 = ee2Var5.l;
            if (ae2Var2 != null) {
                ae2Var2.dispatchTouchEvent(motionEventObtain);
            }
            motionEventObtain.recycle();
            return;
        }
        if (str.equals("currentTime")) {
            String str7 = (String) map.get("time");
            if (str7 == null) {
                gi2.i0("Time parameter missing from currentTime video GMSG.");
                return;
            }
            try {
                int i3 = (int) (Float.parseFloat(str7) * 1000.0f);
                ae2 ae2Var3 = ee2Var5.l;
                if (ae2Var3 == null) {
                    return;
                }
                ae2Var3.l(i3);
                return;
            } catch (NumberFormatException unused5) {
                gi2.i0("Could not parse time parameter from currentTime video GMSG: ".concat(str7));
                return;
            }
        }
        if (str.equals("hide")) {
            ee2Var5.setVisibility(4);
            return;
        }
        if (str.equals("remove")) {
            ee2Var5.setVisibility(8);
            return;
        }
        if (str.equals("load")) {
            ae2 ae2Var4 = ee2Var5.l;
            if (ae2Var4 == null) {
                return;
            }
            if (TextUtils.isEmpty(ee2Var5.s)) {
                ee2Var5.c("no_src", new String[0]);
                return;
            } else {
                ae2Var4.A(ee2Var5.s, ee2Var5.t, num);
                return;
            }
        }
        if (str.equals("loadControl")) {
            b(ee2Var5, map);
            return;
        }
        if (str.equals("muted")) {
            if (Boolean.parseBoolean((String) map.get("muted"))) {
                ae2 ae2Var5 = ee2Var5.l;
                if (ae2Var5 == null) {
                    return;
                }
                me2 me2Var = ae2Var5.g;
                me2Var.e = true;
                me2Var.a();
                ae2Var5.m();
                return;
            }
            ae2 ae2Var6 = ee2Var5.l;
            if (ae2Var6 == null) {
                return;
            }
            me2 me2Var2 = ae2Var6.g;
            me2Var2.e = false;
            me2Var2.a();
            ae2Var6.m();
            return;
        }
        if (str.equals("pause")) {
            ae2 ae2Var7 = ee2Var5.l;
            if (ae2Var7 == null) {
                return;
            }
            ae2Var7.i();
            return;
        }
        if (str.equals("play")) {
            ae2 ae2Var8 = ee2Var5.l;
            if (ae2Var8 == null) {
                return;
            }
            ae2Var8.h();
            return;
        }
        if (str.equals("show")) {
            ee2Var5.setVisibility(0);
            return;
        }
        if (str.equals("src")) {
            String str8 = (String) map.get("src");
            if (((Boolean) tw1.e.c.a(mz1.j2)).booleanValue() && TextUtils.isEmpty(str8)) {
                gi2.i0("Src parameter missing from src video GMSG.");
                return;
            }
            if (map.containsKey("periodicReportIntervalMs")) {
                try {
                    numValueOf = Integer.valueOf(Integer.parseInt((String) map.get("periodicReportIntervalMs")));
                } catch (NumberFormatException unused6) {
                    gi2.i0("Video gmsg invalid numeric parameter 'periodicReportIntervalMs': ".concat(String.valueOf((String) map.get("periodicReportIntervalMs"))));
                }
            }
            String[] strArr = {str8};
            String str9 = (String) map.get("demuxed");
            if (str9 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str9);
                    ArrayList arrayList = new ArrayList();
                    for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                        String string2 = jSONArray.getString(i4);
                        if (!((Boolean) tw1.e.c.a(mz1.j2)).booleanValue() || !TextUtils.isEmpty(string2)) {
                            arrayList.add(string2);
                        }
                    }
                    if (((Boolean) tw1.e.c.a(mz1.j2)).booleanValue() && arrayList.isEmpty()) {
                        StringBuilder sb4 = new StringBuilder(str9.length() + 41);
                        sb4.append("All demuxed URLs are empty for playback: ");
                        sb4.append(str9);
                        gi2.i0(sb4.toString());
                        return;
                    }
                    strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
                } catch (JSONException unused7) {
                    gi2.i0("Malformed demuxed URL list for playback: ".concat(str9));
                    strArr = new String[]{str8};
                }
            }
            if (numValueOf != null) {
                ag2Var.b1(numValueOf.intValue());
            }
            ee2Var5.s = str8;
            ee2Var5.t = strArr;
            return;
        }
        if (str.equals("touchMove")) {
            Context context3 = ag2Var.getContext();
            int iA6 = a(context3, map, "dx", 0);
            int iA7 = a(context3, map, "dy", 0);
            float f2 = iA6;
            float f3 = iA7;
            ae2 ae2Var9 = ee2Var5.l;
            if (ae2Var9 != null) {
                ae2Var9.n(f2, f3);
            }
            if (this.f) {
                return;
            }
            ag2Var.i();
            this.f = true;
            return;
        }
        if (!str.equals("volume")) {
            if (str.equals("watermark")) {
                ee2Var5.a();
                return;
            } else {
                gi2.i0("Unknown video action: ".concat(str));
                return;
            }
        }
        String str10 = (String) map.get("volume");
        if (str10 == null) {
            gi2.i0("Level parameter missing from volume video GMSG.");
            return;
        }
        try {
            float f4 = Float.parseFloat(str10);
            ae2 ae2Var10 = ee2Var5.l;
            if (ae2Var10 == null) {
                return;
            }
            me2 me2Var3 = ae2Var10.g;
            me2Var3.f = f4;
            me2Var3.a();
            ae2Var10.m();
        } catch (NumberFormatException unused8) {
            gi2.i0("Could not parse volume parameter from volume video GMSG: ".concat(str10));
        }
    }
}
