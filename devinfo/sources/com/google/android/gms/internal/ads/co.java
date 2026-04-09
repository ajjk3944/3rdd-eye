package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.applovin.sdk.AppLovinEventParameters;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class co implements oo {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10180a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f10181b;

    public /* synthetic */ co(int i4, Object obj) {
        this.f10180a = i4;
        this.f10181b = obj;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void a(Object obj, Map map) {
        boolean z3;
        eb.d dVar;
        pa.k iVar;
        pa.g gVar;
        pa.h hVar;
        pa.t tVar;
        pk pkVar = sk.Fa;
        va.s sVar = va.s.f36163e;
        if (((Boolean) sVar.f36166c.a(pkVar)).booleanValue()) {
            pa.h hVar2 = pa.h.f31527i;
            pa.g gVar2 = new pa.g((pa.f) new pa.f(7).l(r5.c.g("request_origin", "inspector_ooct")));
            String str = (String) map.get("adUnitId");
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            String str2 = (String) map.get("format");
            String str3 = TextUtils.isEmpty(str2) ? "" : str2;
            pa.t tVar2 = null;
            if (((Boolean) sVar.f36166c.a(sk.Ha)).booleanValue()) {
                boolean z10 = map.containsKey("isGamRequest") && ((String) map.get("isGamRequest")).equals("1");
                if (z10) {
                    qa.a aVar = new qa.a(7);
                    if (map.containsKey("keywords")) {
                        ArrayList arrayListD = d((String) map.get("keywords"), "keywords");
                        int size = arrayListD.size();
                        int i4 = 0;
                        while (i4 < size) {
                            Object obj2 = arrayListD.get(i4);
                            i4++;
                            ((HashSet) ((p.t0) aVar.f218b).f30867d).add((String) obj2);
                        }
                    }
                    aVar.l(c(map));
                    if (map.containsKey("customTargeting")) {
                        try {
                            JSONObject jSONObject = new JSONObject((String) map.get("customTargeting"));
                            Iterator<String> itKeys = jSONObject.keys();
                            while (itKeys.hasNext()) {
                                String next = itKeys.next();
                                aVar.k(next, jSONObject.getString(next));
                            }
                        } catch (JSONException e2) {
                            ua.j.C.f35265h.f("OutOfContextTestingGmsgHandler.generateAdManagerAdRequest", e2);
                        }
                    }
                    if (map.containsKey("contentUrl")) {
                        aVar.x((String) map.get("contentUrl"));
                    }
                    if (map.containsKey("neighboringContentUrlStrings")) {
                        aVar.y(d((String) map.get("neighboringContentUrlStrings"), "neighboringContentUrlStrings"));
                    }
                    if (map.containsKey("requestAgent")) {
                        ((p.t0) aVar.f218b).f30874m = (String) map.get("requestAgent");
                    }
                    if (map.containsKey("publisherProvidedId")) {
                        ((p.t0) aVar.f218b).f30873l = (String) map.get("publisherProvidedId");
                    }
                    if (map.containsKey("categoryExclusions")) {
                        ArrayList arrayListD2 = d((String) map.get("categoryExclusions"), "categoryExclusions");
                        int size2 = arrayListD2.size();
                        int i10 = 0;
                        while (i10 < size2) {
                            Object obj3 = arrayListD2.get(i10);
                            i10++;
                            ((HashSet) ((p.t0) aVar.f218b).f30871i).add((String) obj3);
                        }
                    }
                    gVar = new qa.b(aVar);
                } else {
                    pa.f fVar = new pa.f(7);
                    if (map.containsKey("keywords")) {
                        ArrayList arrayListD3 = d((String) map.get("keywords"), "keywords");
                        int size3 = arrayListD3.size();
                        int i11 = 0;
                        while (i11 < size3) {
                            Object obj4 = arrayListD3.get(i11);
                            i11++;
                            ((HashSet) ((p.t0) fVar.f218b).f30867d).add((String) obj4);
                        }
                    }
                    fVar.l(c(map));
                    if (map.containsKey("customTargeting")) {
                        try {
                            JSONObject jSONObject2 = new JSONObject((String) map.get("customTargeting"));
                            Iterator<String> itKeys2 = jSONObject2.keys();
                            while (itKeys2.hasNext()) {
                                String next2 = itKeys2.next();
                                fVar.k(next2, jSONObject2.getString(next2));
                            }
                        } catch (JSONException e10) {
                            ua.j.C.f35265h.f("OutOfContextTestingGmsgHandler.generateAdMobAdRequest", e10);
                        }
                    }
                    if (map.containsKey("contentUrl")) {
                        fVar.x((String) map.get("contentUrl"));
                    }
                    if (map.containsKey("neighboringContentUrlStrings")) {
                        fVar.y(d((String) map.get("neighboringContentUrlStrings"), "neighboringContentUrlStrings"));
                    }
                    if (map.containsKey("requestAgent")) {
                        ((p.t0) fVar.f218b).f30874m = (String) map.get("requestAgent");
                    }
                    gVar = new pa.g(fVar);
                }
                gVar2 = gVar;
                String str4 = (String) map.get("width");
                String str5 = (String) map.get("height");
                if (TextUtils.isEmpty(str4) || TextUtils.isEmpty(str5)) {
                    hVar = pa.h.f31527i;
                } else {
                    try {
                        hVar = new pa.h(Integer.parseInt(str4), Integer.parseInt(str5));
                    } catch (NumberFormatException e11) {
                        ua.j.C.f35265h.f("OutOfContextTestingGmsgHandler.generateAdSize", e11);
                        hVar = pa.h.f31527i;
                    }
                }
                if (map.containsKey("clickToExpandRequested") || map.containsKey("customControlsRequested") || map.containsKey("startMuted")) {
                    j5 j5Var = new j5();
                    j5Var.f12633a = true;
                    j5Var.f12634b = false;
                    j5Var.f12635c = false;
                    if (map.containsKey("startMuted")) {
                        j5Var.f12633a = ((String) map.get("startMuted")).equals("1");
                    }
                    if (map.containsKey("customControlsRequested")) {
                        j5Var.f12634b = ((String) map.get("customControlsRequested")).equals("1");
                    }
                    if (map.containsKey("clickToExpandRequested")) {
                        j5Var.f12635c = ((String) map.get("clickToExpandRequested")).equals("1");
                    }
                    tVar = new pa.t(j5Var);
                } else {
                    tVar = null;
                }
                if (map.containsKey("customMuteThisAdRequested") || map.containsKey("disableImageLoading") || map.containsKey("mediaAspectRatio") || map.containsKey("preferredAdChoicesPosition") || map.containsKey("shouldRequestMultipleImages") || (tVar != null && str3.equals("NATIVE"))) {
                    eb.d dVar2 = new eb.d();
                    if (map.containsKey("disableImageLoading")) {
                        dVar2.f22522a = ((String) map.get("disableImageLoading")).equals("1");
                    }
                    if (map.containsKey("mediaAspectRatio")) {
                        String str6 = (String) map.get("mediaAspectRatio");
                        if (!TextUtils.isEmpty(str6)) {
                            try {
                                dVar2.f22523b = Integer.parseInt(str6);
                            } catch (NumberFormatException e12) {
                                ua.j.C.f35265h.f("OutOfContextTestingGmsgHandler.generateNativeAdOptionsBuilder.mediaAspectRatio", e12);
                            }
                        }
                    }
                    if (map.containsKey("shouldRequestMultipleImages")) {
                        dVar2.f22524c = ((String) map.get("shouldRequestMultipleImages")).equals("1");
                    }
                    if (map.containsKey("preferredAdChoicesPosition")) {
                        String str7 = (String) map.get("preferredAdChoicesPosition");
                        if (!TextUtils.isEmpty(str7)) {
                            try {
                                dVar2.f22525d = Integer.parseInt(str7);
                            } catch (NumberFormatException e13) {
                                ua.j.C.f35265h.f("OutOfContextTestingGmsgHandler.generateNativeAdOptionsBuilder.preferredAdChoicesPosition", e13);
                            }
                        }
                    }
                    if (map.containsKey("customMuteThisAdRequested")) {
                        dVar2.f22527f = ((String) map.get("customMuteThisAdRequested")).equals("1");
                    }
                    if (tVar != null) {
                        dVar2.f22526e = tVar;
                    }
                    dVar = new eb.d(dVar2);
                } else {
                    dVar = null;
                }
                tVar2 = tVar;
                z3 = z10;
                hVar2 = hVar;
            } else {
                z3 = false;
                dVar = null;
            }
            String str8 = (String) map.get("action");
            if (TextUtils.isEmpty(str8) || TextUtils.isEmpty(str)) {
                return;
            }
            if (!str8.equals("load") || TextUtils.isEmpty(str3)) {
                if (str8.equals("show")) {
                    ((pf0) this.f10181b).h4(str);
                    return;
                }
                return;
            }
            pf0 pf0Var = (pf0) this.f10181b;
            synchronized (pf0Var) {
                try {
                    switch (str3.hashCode()) {
                        case -1999289321:
                            if (str3.equals("NATIVE")) {
                                pa.d dVar3 = new pa.d(pf0Var.l4(), str);
                                try {
                                    dVar3.f31523b.o0(new bo(1, new l90(14, pf0Var, str)));
                                } catch (RemoteException e14) {
                                    za.i.i("Failed to add google native ad listener", e14);
                                }
                                dVar3.b(new nf0(pf0Var));
                                if (((Boolean) va.s.f36163e.f36166c.a(sk.Ha)).booleanValue() && dVar != null) {
                                    dVar3.c(dVar);
                                }
                                dVar3.a().a(gVar2);
                                return;
                            }
                            return;
                        case -1372958932:
                            if (str3.equals("INTERSTITIAL")) {
                                ab.a.a(pf0Var.l4(), str, gVar2, new kf0(pf0Var, str));
                            }
                            return;
                        case -428325382:
                            if (str3.equals("APP_OPEN_AD")) {
                                oh.a(pf0Var.l4(), str, gVar2, new if0(pf0Var, str));
                                return;
                            }
                            return;
                        case 543046670:
                            if (str3.equals("REWARDED")) {
                                lv.a(pf0Var.l4(), str, gVar2, new lf0(pf0Var, str));
                                return;
                            }
                            return;
                        case 1854800829:
                            if (str3.equals("REWARDED_INTERSTITIAL")) {
                                rv.a(pf0Var.l4(), str, gVar2, new mf0(pf0Var, str));
                                return;
                            }
                            return;
                        case 1951953708:
                            if (str3.equals("BANNER")) {
                                pk pkVar2 = sk.Ha;
                                va.s sVar2 = va.s.f36163e;
                                if (((Boolean) sVar2.f36166c.a(pkVar2)).booleanValue() && z3) {
                                    Context contextL4 = pf0Var.l4();
                                    iVar = new qa.c(contextL4);
                                    pb.y.i(contextL4, "Context cannot be null");
                                } else {
                                    iVar = new pa.i(pf0Var.l4());
                                }
                                iVar.setAdSize(hVar2);
                                iVar.setAdUnitId(str);
                                iVar.setAdListener(new jf0(pf0Var, str, iVar));
                                if (((Boolean) sVar2.f36166c.a(pkVar2)).booleanValue() && z3 && tVar2 != null) {
                                    ((qa.c) iVar).setVideoOptions(tVar2);
                                }
                                iVar.b(gVar2);
                                return;
                            }
                            return;
                        default:
                            return;
                    }
                } finally {
                }
            }
        }
    }

    private final /* synthetic */ void b(Object obj, Map map) throws NumberFormatException {
        if (map != null) {
            String str = (String) map.get("height");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                int i4 = Integer.parseInt(str);
                e00 e00Var = (e00) this.f10181b;
                synchronized (e00Var) {
                    try {
                        if (e00Var.H != i4) {
                            e00Var.H = i4;
                            e00Var.requestLayout();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Exception e2) {
                za.i.i("Exception occurred while getting webview content height", e2);
            }
        }
    }

    public static final Bundle c(Map map) throws JSONException {
        Bundle bundleG = r5.c.g("request_origin", "inspector_ooct");
        if (map.containsKey("networkExtras")) {
            try {
                JSONObject jSONObject = new JSONObject((String) map.get("networkExtras"));
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    Object obj = jSONObject.get(next);
                    if (obj instanceof String) {
                        bundleG.putString(next, (String) obj);
                    } else if (obj instanceof Integer) {
                        bundleG.putInt(next, ((Integer) obj).intValue());
                    } else if (obj instanceof Boolean) {
                        bundleG.putBoolean(next, ((Boolean) obj).booleanValue());
                    } else if (obj instanceof Float) {
                        bundleG.putFloat(next, ((Float) obj).floatValue());
                    } else if (obj instanceof Double) {
                        bundleG.putDouble(next, ((Double) obj).doubleValue());
                    } else if (obj instanceof Long) {
                        bundleG.putLong(next, ((Long) obj).longValue());
                    }
                }
            } catch (JSONException e2) {
                ua.j.C.f35265h.f("OutOfContextTestingGmsgHandler.generateNetworkExtras", e2);
            }
        }
        return bundleG;
    }

    public static final ArrayList d(String str, String str2) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            ArrayList arrayList = new ArrayList();
            for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                arrayList.add(jSONArray.getString(i4));
            }
            return arrayList;
        } catch (JSONException e2) {
            ua.j.C.f35265h.f("OutOfContextTestingGmsgHandler.stringArrayToList.".concat(str2), e2);
            return new ArrayList();
        }
    }

    @Override // com.google.android.gms.internal.ads.oo
    public final void k(Object obj, Map map) throws NumberFormatException {
        switch (this.f10180a) {
            case 0:
                eo eoVar = (eo) this.f10181b;
                if (eoVar == null) {
                    return;
                }
                String str = (String) map.get("name");
                if (str == null) {
                    za.i.g("Ad metadata with no name parameter.");
                    str = "";
                }
                String str2 = str;
                Bundle bundleD = null;
                if (map.containsKey("info")) {
                    try {
                        bundleD = pd.b.D(new JSONObject((String) map.get("info")));
                    } catch (JSONException e2) {
                        za.i.f("Failed to convert ad metadata to JSON.", e2);
                    }
                }
                if (bundleD == null) {
                    za.i.e("Failed to convert ad metadata to Bundle.");
                    return;
                } else {
                    eoVar.b(bundleD, str2);
                    return;
                }
            case 1:
                String str3 = (String) map.get("name");
                if (str3 == null) {
                    za.i.h("App event with no name parameter.");
                    return;
                } else {
                    ((fo) this.f10181b).Y(str3, (String) map.get("info"));
                    return;
                }
            case 2:
                qz qzVar = (qz) obj;
                boolean zEquals = "1".equals(map.get("transparentBackground"));
                boolean zEquals2 = "1".equals(map.get("blur"));
                float f10 = 0.0f;
                try {
                    if (map.get("blurRadius") != null) {
                        f10 = Float.parseFloat((String) map.get("blurRadius"));
                    }
                } catch (NumberFormatException e10) {
                    za.i.f("Fail to parse float", e10);
                }
                qo qoVar = (qo) this.f10181b;
                synchronized (qoVar) {
                    qoVar.f15382a = zEquals;
                    qoVar.f15385d.set(true);
                }
                qoVar.a(f10, zEquals2);
                qzVar.S0(zEquals);
                return;
            case 3:
                if (map == null || !map.containsKey(FacebookMediationAdapter.KEY_ID) || TextUtils.isEmpty((CharSequence) map.get(FacebookMediationAdapter.KEY_ID)) || !map.containsKey("event_type") || TextUtils.isEmpty((CharSequence) map.get("event_type"))) {
                    ya.a0.m("Ignoring onDeviceStorageEvent GMSG: missing required parameters.");
                    return;
                }
                try {
                    long j = Long.parseLong((String) map.get(FacebookMediationAdapter.KEY_ID));
                    int i4 = Integer.parseInt((String) map.get("event_type"));
                    ua.j.C.f35267k.getClass();
                    ((be0) this.f10181b).a(j, System.currentTimeMillis(), i4);
                    return;
                } catch (NumberFormatException e11) {
                    ya.a0.n("Ignoring onDeviceStorageEvent GMSG: invalid number format for ID or eventType.", e11);
                    return;
                }
            case 4:
                a(obj, map);
                return;
            case 5:
                xo xoVar = (xo) this.f10181b;
                String str4 = (String) map.get("action");
                if (!"grant".equals(str4)) {
                    if ("video_start".equals(str4)) {
                        xoVar.a();
                        return;
                    } else {
                        if ("video_complete".equals(str4)) {
                            xoVar.h();
                            return;
                        }
                        return;
                    }
                }
                xu xuVar = null;
                try {
                    int i10 = Integer.parseInt((String) map.get(AppLovinEventParameters.REVENUE_AMOUNT));
                    String str5 = (String) map.get("type");
                    if (!TextUtils.isEmpty(str5)) {
                        xuVar = new xu(str5, i10);
                    }
                } catch (NumberFormatException e12) {
                    za.i.i("Unable to parse reward amount.", e12);
                }
                xoVar.E(xuVar);
                return;
            case 6:
                if (!map.containsKey("text") || TextUtils.isEmpty((CharSequence) map.get("text"))) {
                    return;
                }
                ya.a0.m("Opening Share Sheet with text: ".concat(String.valueOf((String) map.get("text"))));
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                intent.setType("text/plain");
                intent.putExtra("android.intent.extra.TEXT", (String) map.get("text"));
                if (map.containsKey("title")) {
                    intent.putExtra("android.intent.extra.TITLE", (String) map.get("title"));
                }
                try {
                    ya.f0 f0Var = ua.j.C.f35261c;
                    ya.f0.u((Context) this.f10181b, intent);
                    return;
                } catch (RuntimeException e13) {
                    za.i.i("Failed to open Share Sheet", e13);
                    ua.j.C.f35265h.f("ShareSheetGmsgHandler.onGmsg", e13);
                    return;
                }
            case 7:
                String str6 = (String) map.get("action");
                if (str6 == null) {
                    za.i.h("Action missing from video GMSG.");
                    return;
                }
                if (str6.equals("src")) {
                    String str7 = (String) map.get("src");
                    if (str7 == null) {
                        za.i.h("src missing from video GMSG.");
                        return;
                    }
                    rq rqVar = (rq) this.f10181b;
                    rqVar.getClass();
                    Bundle bundle = new Bundle();
                    bundle.putString("mediaUrl", str7);
                    rqVar.f15729a.b(bundle);
                    return;
                }
                return;
            case 8:
                b(obj, map);
                return;
            default:
                ((ab0) this.f10181b).f9294b.d(map);
                return;
        }
    }
}
