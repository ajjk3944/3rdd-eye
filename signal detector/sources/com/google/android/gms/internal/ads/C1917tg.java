package com.google.android.gms.internal.ads;

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
import o4.AbstractC2763b;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q2.C2841s;
import t2.AbstractC2906B;
import t2.AbstractC2907C;

/* renamed from: com.google.android.gms.internal.ads.tg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1917tg implements InterfaceC0466Db {

    /* renamed from: a, reason: collision with root package name */
    public boolean f16959a;

    public static int a(Context context, Map map, String str, int i) {
        String str2 = (String) map.get(str);
        if (str2 != null) {
            try {
                u2.f fVar = q2.r.f23260g.f23261a;
                i = u2.f.b(context, Integer.parseInt(str2));
            } catch (NumberFormatException unused) {
                StringBuilder sb = new StringBuilder(str.length() + 34 + str2.length());
                sb.append("Could not parse ");
                sb.append(str);
                sb.append(" in a video GMSG: ");
                sb.append(str2);
                u2.k.h(sb.toString());
            }
        }
        if (AbstractC2907C.o()) {
            int length = str.length();
            StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + length + 30 + String.valueOf(str2).length() + 6 + 1);
            A.f.w(sb2, "Parse pixels for ", str, ", got string ", str2);
            sb2.append(", int ");
            sb2.append(i);
            sb2.append(".");
            AbstractC2907C.m(sb2.toString());
        }
        return i;
    }

    public static void b(C0946bg c0946bg, Map map) throws NumberFormatException {
        AbstractC0827Yf abstractC0827Yf = c0946bg.f13418g;
        String str = (String) map.get("minBufferMs");
        String str2 = (String) map.get("maxBufferMs");
        String str3 = (String) map.get("bufferForPlaybackMs");
        String str4 = (String) map.get("bufferForPlaybackAfterRebufferMs");
        String str5 = (String) map.get("socketReceiveBufferSize");
        if (str != null) {
            try {
                int i = Integer.parseInt(str);
                if (abstractC0827Yf != null) {
                    abstractC0827Yf.B(i);
                }
            } catch (NumberFormatException unused) {
                u2.k.h("Could not parse buffer parameters in loadControl video GMSG: (" + str + ", " + str2 + ")");
                return;
            }
        }
        if (str2 != null) {
            int i3 = Integer.parseInt(str2);
            if (abstractC0827Yf != null) {
                abstractC0827Yf.C(i3);
            }
        }
        if (str3 != null) {
            int i6 = Integer.parseInt(str3);
            if (abstractC0827Yf != null) {
                abstractC0827Yf.a(i6);
            }
        }
        if (str4 != null) {
            int i7 = Integer.parseInt(str4);
            if (abstractC0827Yf != null) {
                abstractC0827Yf.b(i7);
            }
        }
        if (str5 != null) {
            int i8 = Integer.parseInt(str5);
            if (abstractC0827Yf == null) {
                return;
            }
            abstractC0827Yf.c(i8);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0466Db
    public final void e(Object obj, Map map) throws JSONException, NumberFormatException {
        int iMin;
        int iMin2;
        int i;
        C0946bg c0946bg;
        AbstractC0827Yf abstractC0827Yf;
        InterfaceC0828Yg interfaceC0828Yg = (InterfaceC0828Yg) obj;
        String str = (String) map.get("action");
        if (str == null) {
            u2.k.h("Action missing from video GMSG.");
            return;
        }
        Integer numValueOf = null;
        Integer numValueOf2 = map.containsKey("playerId") ? Integer.valueOf(Integer.parseInt((String) map.get("playerId"))) : null;
        Integer numZ = (interfaceC0828Yg.X0() == null || (c0946bg = (C0946bg) interfaceC0828Yg.X0().f16316f) == null || (abstractC0827Yf = c0946bg.f13418g) == null) ? null : abstractC0827Yf.z();
        if (numValueOf2 != null && numZ != null && !numValueOf2.equals(numZ) && !str.equals("load")) {
            Locale locale = Locale.US;
            u2.k.g("Event intended for player " + numValueOf2 + ", but sent to player " + numZ + " - event ignored");
            return;
        }
        if (u2.k.l(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            String string = jSONObject.toString();
            StringBuilder sb = new StringBuilder(str.length() + 13 + String.valueOf(string).length());
            sb.append("Video GMSG: ");
            sb.append(str);
            sb.append(" ");
            sb.append(string);
            u2.k.c(sb.toString());
        }
        if (str.equals("background")) {
            String str2 = (String) map.get("color");
            if (TextUtils.isEmpty(str2)) {
                u2.k.h("Color parameter missing from background video GMSG.");
                return;
            }
            try {
                interfaceC0828Yg.setBackgroundColor(Color.parseColor(str2));
                return;
            } catch (IllegalArgumentException unused) {
                u2.k.h("Invalid color parameter in background video GMSG.");
                return;
            }
        }
        if (str.equals("playerBackground")) {
            String str3 = (String) map.get("color");
            if (TextUtils.isEmpty(str3)) {
                u2.k.h("Color parameter missing from playerBackground video GMSG.");
                return;
            }
            try {
                interfaceC0828Yg.P(Color.parseColor(str3));
                return;
            } catch (IllegalArgumentException unused2) {
                u2.k.h("Invalid color parameter in playerBackground video GMSG.");
                return;
            }
        }
        if (str.equals("decoderProps")) {
            String str4 = (String) map.get("mimeTypes");
            if (str4 == null) {
                u2.k.h("No MIME types specified for decoder properties inspection.");
                HashMap map2 = new HashMap();
                map2.put("event", "decoderProps");
                map2.put("error", "missingMimeTypes");
                interfaceC0828Yg.a("onVideoEvent", map2);
                return;
            }
            HashMap map3 = new HashMap();
            for (String str5 : str4.split(",")) {
                map3.put(str5, AbstractC2906B.a(str5.trim()));
            }
            HashMap map4 = new HashMap();
            map4.put("event", "decoderProps");
            map4.put("mimeTypes", map3);
            interfaceC0828Yg.a("onVideoEvent", map4);
            return;
        }
        C1726q3 c1726q3X0 = interfaceC0828Yg.X0();
        if (c1726q3X0 == null) {
            u2.k.h("Could not get underlay container for a video GMSG.");
            return;
        }
        boolean zEquals = str.equals("new");
        boolean zEquals2 = str.equals("position");
        if (zEquals || zEquals2) {
            Context context = interfaceC0828Yg.getContext();
            int iA = a(context, map, "x", 0);
            int iA2 = a(context, map, "y", 0);
            int iA3 = a(context, map, "w", -1);
            E9 e9 = H9.f8567B4;
            C2841s c2841s = C2841s.f23267e;
            if (((Boolean) c2841s.f23270c.a(e9)).booleanValue()) {
                iMin = iA3 == -1 ? interfaceC0828Yg.m() : Math.min(iA3, interfaceC0828Yg.m());
            } else {
                if (AbstractC2907C.o()) {
                    int iM = interfaceC0828Yg.m();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(iA).length() + AbstractC2763b.b(String.valueOf(iA3).length() + 72, 4, String.valueOf(iM)) + 1);
                    sb2.append("Calculate width with original width ");
                    sb2.append(iA3);
                    sb2.append(", videoHost.getVideoBoundingWidth() ");
                    sb2.append(iM);
                    sb2.append(", x ");
                    sb2.append(iA);
                    sb2.append(".");
                    AbstractC2907C.m(sb2.toString());
                }
                iMin = Math.min(iA3, interfaceC0828Yg.m() - iA);
            }
            int iA4 = a(context, map, "h", -1);
            if (((Boolean) c2841s.f23270c.a(e9)).booleanValue()) {
                iMin2 = iA4 == -1 ? interfaceC0828Yg.G() : Math.min(iA4, interfaceC0828Yg.G());
            } else {
                if (AbstractC2907C.o()) {
                    int iG = interfaceC0828Yg.G();
                    StringBuilder sb3 = new StringBuilder(String.valueOf(iA2).length() + AbstractC2763b.b(String.valueOf(iA4).length() + 75, 4, String.valueOf(iG)) + 1);
                    sb3.append("Calculate height with original height ");
                    sb3.append(iA4);
                    sb3.append(", videoHost.getVideoBoundingHeight() ");
                    sb3.append(iG);
                    sb3.append(", y ");
                    sb3.append(iA2);
                    sb3.append(".");
                    AbstractC2907C.m(sb3.toString());
                }
                iMin2 = Math.min(iA4, interfaceC0828Yg.G() - iA2);
            }
            try {
                i = Integer.parseInt((String) map.get("player"));
            } catch (NumberFormatException unused3) {
                i = 0;
            }
            boolean z6 = Boolean.parseBoolean((String) map.get("spherical"));
            if (!zEquals || ((C0946bg) c1726q3X0.f16316f) != null) {
                M2.u.c("The underlay may only be modified from the UI thread.");
                C0946bg c0946bg2 = (C0946bg) c1726q3X0.f16316f;
                if (c0946bg2 != null) {
                    c0946bg2.l(iA, iA2, iMin, iMin2);
                    return;
                }
                return;
            }
            C1272hg c1272hg = new C1272hg((String) map.get("flags"));
            if (((C0946bg) c1726q3X0.f16316f) == null) {
                C1273hh c1273hh = (C1273hh) c1726q3X0.f16313c;
                ViewTreeObserverOnGlobalLayoutListenerC1433kh viewTreeObserverOnGlobalLayoutListenerC1433kh = c1273hh.f14532a;
                AbstractC0933bL.g((L9) viewTreeObserverOnGlobalLayoutListenerC1433kh.f15208c0.f13151c, viewTreeObserverOnGlobalLayoutListenerC1433kh.f15205a0, "vpr2");
                C0946bg c0946bg3 = new C0946bg((Context) c1726q3X0.f16312b, c1273hh, i, z6, (L9) c1273hh.f14532a.f15208c0.f13151c, c1272hg, (C0784Vn) c1726q3X0.f16315e);
                c1726q3X0.f16316f = c0946bg3;
                ((C1273hh) c1726q3X0.f16314d).addView(c0946bg3, 0, new ViewGroup.LayoutParams(-1, -1));
                ((C0946bg) c1726q3X0.f16316f).l(iA, iA2, iMin, iMin2);
                c1273hh.f14532a.f15228n.f16018l = false;
            }
            C0946bg c0946bg4 = (C0946bg) c1726q3X0.f16316f;
            if (c0946bg4 != null) {
                b(c0946bg4, map);
                return;
            }
            return;
        }
        BinderC1541mh binderC1541mhG = interfaceC0828Yg.g();
        if (binderC1541mhG != null) {
            if (str.equals("timeupdate")) {
                String str6 = (String) map.get("currentTime");
                if (str6 == null) {
                    u2.k.h("currentTime parameter missing from timeupdate video GMSG.");
                    return;
                }
                try {
                    float f2 = Float.parseFloat(str6);
                    synchronized (binderC1541mhG.f15637b) {
                        binderC1541mhG.f15644j = f2;
                    }
                    return;
                } catch (NumberFormatException unused4) {
                    u2.k.h("Could not parse currentTime parameter from timeupdate video GMSG: ".concat(str6));
                    return;
                }
            }
            if (str.equals("skip")) {
                binderC1541mhG.M3();
                return;
            }
        }
        C0946bg c0946bg5 = (C0946bg) c1726q3X0.f16316f;
        if (c0946bg5 == null) {
            HashMap map5 = new HashMap();
            map5.put("event", "no_video_view");
            interfaceC0828Yg.a("onVideoEvent", map5);
            return;
        }
        if (str.equals("click")) {
            Context context2 = interfaceC0828Yg.getContext();
            int iA5 = a(context2, map, "x", 0);
            float fA = a(context2, map, "y", 0);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, iA5, fA, 0);
            AbstractC0827Yf abstractC0827Yf2 = c0946bg5.f13418g;
            if (abstractC0827Yf2 != null) {
                abstractC0827Yf2.dispatchTouchEvent(motionEventObtain);
            }
            motionEventObtain.recycle();
            return;
        }
        if (str.equals("currentTime")) {
            String str7 = (String) map.get("time");
            if (str7 == null) {
                u2.k.h("Time parameter missing from currentTime video GMSG.");
                return;
            }
            try {
                int i3 = (int) (Float.parseFloat(str7) * 1000.0f);
                AbstractC0827Yf abstractC0827Yf3 = c0946bg5.f13418g;
                if (abstractC0827Yf3 == null) {
                    return;
                }
                abstractC0827Yf3.m(i3);
                return;
            } catch (NumberFormatException unused5) {
                u2.k.h("Could not parse time parameter from currentTime video GMSG: ".concat(str7));
                return;
            }
        }
        if (str.equals("hide")) {
            c0946bg5.setVisibility(4);
            return;
        }
        if (str.equals("remove")) {
            c0946bg5.setVisibility(8);
            return;
        }
        if (str.equals("load")) {
            AbstractC0827Yf abstractC0827Yf4 = c0946bg5.f13418g;
            if (abstractC0827Yf4 == null) {
                return;
            }
            if (TextUtils.isEmpty(c0946bg5.f13424n)) {
                c0946bg5.c("no_src", new String[0]);
                return;
            } else {
                abstractC0827Yf4.A(c0946bg5.f13424n, c0946bg5.f13408C, numValueOf2);
                return;
            }
        }
        if (str.equals("loadControl")) {
            b(c0946bg5, map);
            return;
        }
        if (str.equals("muted")) {
            if (Boolean.parseBoolean((String) map.get("muted"))) {
                AbstractC0827Yf abstractC0827Yf5 = c0946bg5.f13418g;
                if (abstractC0827Yf5 == null) {
                    return;
                }
                C1432kg c1432kg = abstractC0827Yf5.f12647b;
                c1432kg.f15181e = true;
                c1432kg.a();
                abstractC0827Yf5.l();
                return;
            }
            AbstractC0827Yf abstractC0827Yf6 = c0946bg5.f13418g;
            if (abstractC0827Yf6 == null) {
                return;
            }
            C1432kg c1432kg2 = abstractC0827Yf6.f12647b;
            c1432kg2.f15181e = false;
            c1432kg2.a();
            abstractC0827Yf6.l();
            return;
        }
        if (str.equals("pause")) {
            AbstractC0827Yf abstractC0827Yf7 = c0946bg5.f13418g;
            if (abstractC0827Yf7 == null) {
                return;
            }
            abstractC0827Yf7.i();
            return;
        }
        if (str.equals("play")) {
            AbstractC0827Yf abstractC0827Yf8 = c0946bg5.f13418g;
            if (abstractC0827Yf8 == null) {
                return;
            }
            abstractC0827Yf8.h();
            return;
        }
        if (str.equals("show")) {
            c0946bg5.setVisibility(0);
            return;
        }
        if (str.equals("src")) {
            String str8 = (String) map.get("src");
            if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8863y2)).booleanValue() && TextUtils.isEmpty(str8)) {
                u2.k.h("Src parameter missing from src video GMSG.");
                return;
            }
            if (map.containsKey("periodicReportIntervalMs")) {
                try {
                    numValueOf = Integer.valueOf(Integer.parseInt((String) map.get("periodicReportIntervalMs")));
                } catch (NumberFormatException unused6) {
                    u2.k.h("Video gmsg invalid numeric parameter 'periodicReportIntervalMs': ".concat(String.valueOf((String) map.get("periodicReportIntervalMs"))));
                }
            }
            String[] strArr = {str8};
            String str9 = (String) map.get("demuxed");
            if (str9 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str9);
                    ArrayList arrayList = new ArrayList();
                    for (int i6 = 0; i6 < jSONArray.length(); i6++) {
                        String string2 = jSONArray.getString(i6);
                        if (!((Boolean) C2841s.f23267e.f23270c.a(H9.f8863y2)).booleanValue() || !TextUtils.isEmpty(string2)) {
                            arrayList.add(string2);
                        }
                    }
                    if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8863y2)).booleanValue() && arrayList.isEmpty()) {
                        StringBuilder sb4 = new StringBuilder(str9.length() + 41);
                        sb4.append("All demuxed URLs are empty for playback: ");
                        sb4.append(str9);
                        u2.k.h(sb4.toString());
                        return;
                    }
                    strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
                } catch (JSONException unused7) {
                    u2.k.h("Malformed demuxed URL list for playback: ".concat(str9));
                    strArr = new String[]{str8};
                }
            }
            if (numValueOf != null) {
                interfaceC0828Yg.J0(numValueOf.intValue());
            }
            c0946bg5.f13424n = str8;
            c0946bg5.f13408C = strArr;
            return;
        }
        if (str.equals("touchMove")) {
            Context context3 = interfaceC0828Yg.getContext();
            int iA6 = a(context3, map, "dx", 0);
            int iA7 = a(context3, map, "dy", 0);
            float f5 = iA6;
            float f6 = iA7;
            AbstractC0827Yf abstractC0827Yf9 = c0946bg5.f13418g;
            if (abstractC0827Yf9 != null) {
                abstractC0827Yf9.n(f5, f6);
            }
            if (this.f16959a) {
                return;
            }
            interfaceC0828Yg.i();
            this.f16959a = true;
            return;
        }
        if (!str.equals("volume")) {
            if (str.equals("watermark")) {
                c0946bg5.a();
                return;
            } else {
                u2.k.h("Unknown video action: ".concat(str));
                return;
            }
        }
        String str10 = (String) map.get("volume");
        if (str10 == null) {
            u2.k.h("Level parameter missing from volume video GMSG.");
            return;
        }
        try {
            float f7 = Float.parseFloat(str10);
            AbstractC0827Yf abstractC0827Yf10 = c0946bg5.f13418g;
            if (abstractC0827Yf10 == null) {
                return;
            }
            C1432kg c1432kg3 = abstractC0827Yf10.f12647b;
            c1432kg3.f15182f = f7;
            c1432kg3.a();
            abstractC0827Yf10.l();
        } catch (NumberFormatException unused8) {
            u2.k.h("Could not parse volume parameter from volume video GMSG: ".concat(str10));
        }
    }
}
