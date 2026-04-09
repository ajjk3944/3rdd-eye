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
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ly implements oo {

    /* renamed from: a, reason: collision with root package name */
    public boolean f13679a;

    public static int a(Context context, Map map, String str, int i4) {
        String str2 = (String) map.get(str);
        if (str2 != null) {
            try {
                za.d dVar = va.r.g.f36157a;
                i4 = za.d.b(Integer.parseInt(str2), context);
            } catch (NumberFormatException unused) {
                StringBuilder sb2 = new StringBuilder(str.length() + 34 + str2.length());
                sb2.append("Could not parse ");
                sb2.append(str);
                sb2.append(" in a video GMSG: ");
                sb2.append(str2);
                za.i.h(sb2.toString());
            }
        }
        if (ya.a0.o()) {
            int length = str.length();
            StringBuilder sb3 = new StringBuilder(String.valueOf(i4).length() + length + 30 + String.valueOf(str2).length() + 6 + 1);
            je.u.B(sb3, "Parse pixels for ", str, ", got string ", str2);
            sb3.append(", int ");
            sb3.append(i4);
            sb3.append(".");
            ya.a0.m(sb3.toString());
        }
        return i4;
    }

    public static void b(sx sxVar, Map map) throws NumberFormatException {
        px pxVar = sxVar.g;
        String str = (String) map.get("minBufferMs");
        String str2 = (String) map.get("maxBufferMs");
        String str3 = (String) map.get("bufferForPlaybackMs");
        String str4 = (String) map.get("bufferForPlaybackAfterRebufferMs");
        String str5 = (String) map.get("socketReceiveBufferSize");
        if (str != null) {
            try {
                int i4 = Integer.parseInt(str);
                if (pxVar != null) {
                    pxVar.A(i4);
                }
            } catch (NumberFormatException unused) {
                za.i.h("Could not parse buffer parameters in loadControl video GMSG: (" + str + ", " + str2 + ")");
                return;
            }
        }
        if (str2 != null) {
            int i10 = Integer.parseInt(str2);
            if (pxVar != null) {
                pxVar.B(i10);
            }
        }
        if (str3 != null) {
            int i11 = Integer.parseInt(str3);
            if (pxVar != null) {
                pxVar.a(i11);
            }
        }
        if (str4 != null) {
            int i12 = Integer.parseInt(str4);
            if (pxVar != null) {
                pxVar.b(i12);
            }
        }
        if (str5 != null) {
            int i13 = Integer.parseInt(str5);
            if (pxVar == null) {
                return;
            }
            pxVar.c(i13);
        }
    }

    @Override // com.google.android.gms.internal.ads.oo
    public final void k(Object obj, Map map) throws JSONException, NumberFormatException {
        int iMin;
        int iMin2;
        int i4;
        sx sxVar;
        px pxVar;
        qz qzVar = (qz) obj;
        String str = (String) map.get("action");
        if (str == null) {
            za.i.h("Action missing from video GMSG.");
            return;
        }
        Integer numValueOf = null;
        Integer numValueOf2 = map.containsKey("playerId") ? Integer.valueOf(Integer.parseInt((String) map.get("playerId"))) : null;
        Integer numY = (qzVar.M0() == null || (sxVar = (sx) qzVar.M0().f15561f) == null || (pxVar = sxVar.g) == null) ? null : pxVar.y();
        if (numValueOf2 != null && numY != null && !numValueOf2.equals(numY) && !str.equals("load")) {
            Locale locale = Locale.US;
            za.i.g("Event intended for player " + numValueOf2 + ", but sent to player " + numY + " - event ignored");
            return;
        }
        if (za.i.l(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            String string = jSONObject.toString();
            StringBuilder sb2 = new StringBuilder(str.length() + 13 + String.valueOf(string).length());
            sb2.append("Video GMSG: ");
            sb2.append(str);
            sb2.append(" ");
            sb2.append(string);
            za.i.c(sb2.toString());
        }
        if (str.equals("background")) {
            String str2 = (String) map.get("color");
            if (TextUtils.isEmpty(str2)) {
                za.i.h("Color parameter missing from background video GMSG.");
                return;
            }
            try {
                qzVar.setBackgroundColor(Color.parseColor(str2));
                return;
            } catch (IllegalArgumentException unused) {
                za.i.h("Invalid color parameter in background video GMSG.");
                return;
            }
        }
        if (str.equals("playerBackground")) {
            String str3 = (String) map.get("color");
            if (TextUtils.isEmpty(str3)) {
                za.i.h("Color parameter missing from playerBackground video GMSG.");
                return;
            }
            try {
                qzVar.A(Color.parseColor(str3));
                return;
            } catch (IllegalArgumentException unused2) {
                za.i.h("Invalid color parameter in playerBackground video GMSG.");
                return;
            }
        }
        if (str.equals("decoderProps")) {
            String str4 = (String) map.get("mimeTypes");
            if (str4 == null) {
                za.i.h("No MIME types specified for decoder properties inspection.");
                HashMap map2 = new HashMap();
                map2.put("event", "decoderProps");
                map2.put("error", "missingMimeTypes");
                qzVar.a("onVideoEvent", map2);
                return;
            }
            HashMap map3 = new HashMap();
            for (String str5 : str4.split(",")) {
                map3.put(str5, ya.z.a(str5.trim()));
            }
            HashMap map4 = new HashMap();
            map4.put("event", "decoderProps");
            map4.put("mimeTypes", map3);
            qzVar.a("onVideoEvent", map4);
            return;
        }
        r7 r7VarM0 = qzVar.M0();
        if (r7VarM0 == null) {
            za.i.h("Could not get underlay container for a video GMSG.");
            return;
        }
        boolean zEquals = str.equals("new");
        boolean zEquals2 = str.equals("position");
        if (zEquals || zEquals2) {
            Context context = qzVar.getContext();
            int iA = a(context, map, "x", 0);
            int iA2 = a(context, map, "y", 0);
            int iA3 = a(context, map, "w", -1);
            pk pkVar = sk.B4;
            va.s sVar = va.s.f36163e;
            if (((Boolean) sVar.f36166c.a(pkVar)).booleanValue()) {
                iMin = iA3 == -1 ? qzVar.z() : Math.min(iA3, qzVar.z());
            } else {
                if (ya.a0.o()) {
                    int iZ = qzVar.z();
                    StringBuilder sb3 = new StringBuilder(String.valueOf(iA).length() + r5.c.f(String.valueOf(iA3).length() + 72, 4, String.valueOf(iZ)) + 1);
                    sb3.append("Calculate width with original width ");
                    sb3.append(iA3);
                    sb3.append(", videoHost.getVideoBoundingWidth() ");
                    sb3.append(iZ);
                    sb3.append(", x ");
                    sb3.append(iA);
                    sb3.append(".");
                    ya.a0.m(sb3.toString());
                }
                iMin = Math.min(iA3, qzVar.z() - iA);
            }
            int iA4 = a(context, map, "h", -1);
            if (((Boolean) sVar.f36166c.a(pkVar)).booleanValue()) {
                iMin2 = iA4 == -1 ? qzVar.O1() : Math.min(iA4, qzVar.O1());
            } else {
                if (ya.a0.o()) {
                    int iO1 = qzVar.O1();
                    StringBuilder sb4 = new StringBuilder(String.valueOf(iA2).length() + r5.c.f(String.valueOf(iA4).length() + 75, 4, String.valueOf(iO1)) + 1);
                    sb4.append("Calculate height with original height ");
                    sb4.append(iA4);
                    sb4.append(", videoHost.getVideoBoundingHeight() ");
                    sb4.append(iO1);
                    sb4.append(", y ");
                    sb4.append(iA2);
                    sb4.append(".");
                    ya.a0.m(sb4.toString());
                }
                iMin2 = Math.min(iA4, qzVar.O1() - iA2);
            }
            try {
                i4 = Integer.parseInt((String) map.get("player"));
            } catch (NumberFormatException unused3) {
                i4 = 0;
            }
            boolean z3 = Boolean.parseBoolean((String) map.get("spherical"));
            if (!zEquals || ((sx) r7VarM0.f15561f) != null) {
                pb.y.d("The underlay may only be modified from the UI thread.");
                sx sxVar2 = (sx) r7VarM0.f15561f;
                if (sxVar2 != null) {
                    sxVar2.l(iA, iA2, iMin, iMin2);
                    return;
                }
                return;
            }
            yx yxVar = new yx((String) map.get("flags"));
            if (((sx) r7VarM0.f15561f) == null) {
                b00 b00Var = (b00) r7VarM0.f15558c;
                e00 e00Var = b00Var.f9521a;
                a80.h((vk) e00Var.L.f15754c, e00Var.J, "vpr2");
                sx sxVar3 = new sx((Context) r7VarM0.f15557b, b00Var, i4, z3, (vk) b00Var.f9521a.L.f15754c, yxVar, (qd0) r7VarM0.f15560e);
                r7VarM0.f15561f = sxVar3;
                ((b00) r7VarM0.f15559d).addView(sxVar3, 0, new ViewGroup.LayoutParams(-1, -1));
                ((sx) r7VarM0.f15561f).l(iA, iA2, iMin, iMin2);
                b00Var.f9521a.f10645n.f12090l = false;
            }
            sx sxVar4 = (sx) r7VarM0.f15561f;
            if (sxVar4 != null) {
                b(sxVar4, map);
                return;
            }
            return;
        }
        g00 g00VarZ1 = qzVar.z1();
        if (g00VarZ1 != null) {
            if (str.equals("timeupdate")) {
                String str6 = (String) map.get("currentTime");
                if (str6 == null) {
                    za.i.h("currentTime parameter missing from timeupdate video GMSG.");
                    return;
                }
                try {
                    float f10 = Float.parseFloat(str6);
                    synchronized (g00VarZ1.f11330b) {
                        g00VarZ1.j = f10;
                    }
                    return;
                } catch (NumberFormatException unused4) {
                    za.i.h("Could not parse currentTime parameter from timeupdate video GMSG: ".concat(str6));
                    return;
                }
            }
            if (str.equals("skip")) {
                g00VarZ1.j4();
                return;
            }
        }
        sx sxVar5 = (sx) r7VarM0.f15561f;
        if (sxVar5 == null) {
            HashMap map5 = new HashMap();
            map5.put("event", "no_video_view");
            qzVar.a("onVideoEvent", map5);
            return;
        }
        if (str.equals("click")) {
            Context context2 = qzVar.getContext();
            int iA5 = a(context2, map, "x", 0);
            float fA = a(context2, map, "y", 0);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, iA5, fA, 0);
            px pxVar2 = sxVar5.g;
            if (pxVar2 != null) {
                pxVar2.dispatchTouchEvent(motionEventObtain);
            }
            motionEventObtain.recycle();
            return;
        }
        if (str.equals("currentTime")) {
            String str7 = (String) map.get("time");
            if (str7 == null) {
                za.i.h("Time parameter missing from currentTime video GMSG.");
                return;
            }
            try {
                int i10 = (int) (Float.parseFloat(str7) * 1000.0f);
                px pxVar3 = sxVar5.g;
                if (pxVar3 == null) {
                    return;
                }
                pxVar3.q(i10);
                return;
            } catch (NumberFormatException unused5) {
                za.i.h("Could not parse time parameter from currentTime video GMSG: ".concat(str7));
                return;
            }
        }
        if (str.equals("hide")) {
            sxVar5.setVisibility(4);
            return;
        }
        if (str.equals("remove")) {
            sxVar5.setVisibility(8);
            return;
        }
        if (str.equals("load")) {
            px pxVar4 = sxVar5.g;
            if (pxVar4 == null) {
                return;
            }
            if (TextUtils.isEmpty(sxVar5.f16578n)) {
                sxVar5.c("no_src", new String[0]);
                return;
            } else {
                pxVar4.z(sxVar5.f16578n, sxVar5.f16579o, numValueOf2);
                return;
            }
        }
        if (str.equals("loadControl")) {
            b(sxVar5, map);
            return;
        }
        if (str.equals("muted")) {
            if (Boolean.parseBoolean((String) map.get("muted"))) {
                px pxVar5 = sxVar5.g;
                if (pxVar5 == null) {
                    return;
                }
                cy cyVar = pxVar5.f15133b;
                cyVar.f10257e = true;
                cyVar.a();
                pxVar5.E1();
                return;
            }
            px pxVar6 = sxVar5.g;
            if (pxVar6 == null) {
                return;
            }
            cy cyVar2 = pxVar6.f15133b;
            cyVar2.f10257e = false;
            cyVar2.a();
            pxVar6.E1();
            return;
        }
        if (str.equals("pause")) {
            px pxVar7 = sxVar5.g;
            if (pxVar7 == null) {
                return;
            }
            pxVar7.n();
            return;
        }
        if (str.equals("play")) {
            px pxVar8 = sxVar5.g;
            if (pxVar8 == null) {
                return;
            }
            pxVar8.h();
            return;
        }
        if (str.equals("show")) {
            sxVar5.setVisibility(0);
            return;
        }
        if (str.equals("src")) {
            String str8 = (String) map.get("src");
            if (((Boolean) va.s.f36163e.f36166c.a(sk.f16413y2)).booleanValue() && TextUtils.isEmpty(str8)) {
                za.i.h("Src parameter missing from src video GMSG.");
                return;
            }
            if (map.containsKey("periodicReportIntervalMs")) {
                try {
                    numValueOf = Integer.valueOf(Integer.parseInt((String) map.get("periodicReportIntervalMs")));
                } catch (NumberFormatException unused6) {
                    za.i.h("Video gmsg invalid numeric parameter 'periodicReportIntervalMs': ".concat(String.valueOf((String) map.get("periodicReportIntervalMs"))));
                }
            }
            String[] strArr = {str8};
            String str9 = (String) map.get("demuxed");
            if (str9 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str9);
                    ArrayList arrayList = new ArrayList();
                    for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                        String string2 = jSONArray.getString(i11);
                        if (!((Boolean) va.s.f36163e.f36166c.a(sk.f16413y2)).booleanValue() || !TextUtils.isEmpty(string2)) {
                            arrayList.add(string2);
                        }
                    }
                    if (((Boolean) va.s.f36163e.f36166c.a(sk.f16413y2)).booleanValue() && arrayList.isEmpty()) {
                        StringBuilder sb5 = new StringBuilder(str9.length() + 41);
                        sb5.append("All demuxed URLs are empty for playback: ");
                        sb5.append(str9);
                        za.i.h(sb5.toString());
                        return;
                    }
                    strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
                } catch (JSONException unused7) {
                    za.i.h("Malformed demuxed URL list for playback: ".concat(str9));
                    strArr = new String[]{str8};
                }
            }
            if (numValueOf != null) {
                qzVar.y0(numValueOf.intValue());
            }
            sxVar5.f16578n = str8;
            sxVar5.f16579o = strArr;
            return;
        }
        if (str.equals("touchMove")) {
            Context context3 = qzVar.getContext();
            int iA6 = a(context3, map, "dx", 0);
            int iA7 = a(context3, map, "dy", 0);
            float f11 = iA6;
            float f12 = iA7;
            px pxVar9 = sxVar5.g;
            if (pxVar9 != null) {
                pxVar9.r(f11, f12);
            }
            if (this.f13679a) {
                return;
            }
            qzVar.B1();
            this.f13679a = true;
            return;
        }
        if (!str.equals("volume")) {
            if (str.equals("watermark")) {
                sxVar5.a();
                return;
            } else {
                za.i.h("Unknown video action: ".concat(str));
                return;
            }
        }
        String str10 = (String) map.get("volume");
        if (str10 == null) {
            za.i.h("Level parameter missing from volume video GMSG.");
            return;
        }
        try {
            float f13 = Float.parseFloat(str10);
            px pxVar10 = sxVar5.g;
            if (pxVar10 == null) {
                return;
            }
            cy cyVar3 = pxVar10.f15133b;
            cyVar3.f10258f = f13;
            cyVar3.a();
            pxVar10.E1();
        } catch (NumberFormatException unused8) {
            za.i.h("Could not parse volume parameter from volume video GMSG: ".concat(str10));
        }
    }
}
