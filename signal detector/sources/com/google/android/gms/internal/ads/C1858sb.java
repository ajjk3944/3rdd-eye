package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import t2.AbstractC2907C;
import t2.C2911G;

/* renamed from: com.google.android.gms.internal.ads.sb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1858sb implements InterfaceC0466Db {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16755a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f16756b;

    public /* synthetic */ C1858sb(int i, Object obj) {
        this.f16755a = i;
        this.f16756b = obj;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:183:0x043c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void a(java.lang.Object r14, java.util.Map r15) {
        /*
            Method dump skipped, instructions count: 1364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1858sb.a(java.lang.Object, java.util.Map):void");
    }

    private final /* synthetic */ void b(Object obj, Map map) throws NumberFormatException {
        if (map != null) {
            String str = (String) map.get("height");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                int i = Integer.parseInt(str);
                ViewTreeObserverOnGlobalLayoutListenerC1433kh viewTreeObserverOnGlobalLayoutListenerC1433kh = (ViewTreeObserverOnGlobalLayoutListenerC1433kh) this.f16756b;
                synchronized (viewTreeObserverOnGlobalLayoutListenerC1433kh) {
                    try {
                        if (viewTreeObserverOnGlobalLayoutListenerC1433kh.f15202V != i) {
                            viewTreeObserverOnGlobalLayoutListenerC1433kh.f15202V = i;
                            viewTreeObserverOnGlobalLayoutListenerC1433kh.requestLayout();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Exception e6) {
                u2.k.i("Exception occurred while getting webview content height", e6);
            }
        }
    }

    public static final Bundle c(Map map) throws JSONException {
        Bundle bundle = new Bundle();
        bundle.putString("request_origin", "inspector_ooct");
        if (map.containsKey("networkExtras")) {
            try {
                JSONObject jSONObject = new JSONObject((String) map.get("networkExtras"));
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    Object obj = jSONObject.get(next);
                    if (obj instanceof String) {
                        bundle.putString(next, (String) obj);
                    } else if (obj instanceof Integer) {
                        bundle.putInt(next, ((Integer) obj).intValue());
                    } else if (obj instanceof Boolean) {
                        bundle.putBoolean(next, ((Boolean) obj).booleanValue());
                    } else if (obj instanceof Float) {
                        bundle.putFloat(next, ((Float) obj).floatValue());
                    } else if (obj instanceof Double) {
                        bundle.putDouble(next, ((Double) obj).doubleValue());
                    } else if (obj instanceof Long) {
                        bundle.putLong(next, ((Long) obj).longValue());
                    }
                }
            } catch (JSONException e6) {
                p2.j.f22785C.f22795h.f("OutOfContextTestingGmsgHandler.generateNetworkExtras", e6);
            }
        }
        return bundle;
    }

    public static final ArrayList d(String str, String str2) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.getString(i));
            }
            return arrayList;
        } catch (JSONException e6) {
            p2.j.f22785C.f22795h.f("OutOfContextTestingGmsgHandler.stringArrayToList.".concat(str2), e6);
            return new ArrayList();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0466Db
    public final void e(Object obj, Map map) throws NumberFormatException {
        switch (this.f16755a) {
            case 0:
                InterfaceC1912tb interfaceC1912tb = (InterfaceC1912tb) this.f16756b;
                if (interfaceC1912tb == null) {
                    return;
                }
                String str = (String) map.get("name");
                if (str == null) {
                    u2.k.g("Ad metadata with no name parameter.");
                    str = "";
                }
                String str2 = str;
                Bundle bundleG = null;
                if (map.containsKey("info")) {
                    try {
                        bundleG = a4.p.G(new JSONObject((String) map.get("info")));
                    } catch (JSONException e6) {
                        u2.k.f("Failed to convert ad metadata to JSON.", e6);
                    }
                }
                if (bundleG == null) {
                    u2.k.e("Failed to convert ad metadata to Bundle.");
                    return;
                } else {
                    interfaceC1912tb.u(str2, bundleG);
                    return;
                }
            case 1:
                String str3 = (String) map.get("name");
                if (str3 == null) {
                    u2.k.h("App event with no name parameter.");
                    return;
                } else {
                    ((InterfaceC1966ub) this.f16756b).q0(str3, (String) map.get("info"));
                    return;
                }
            case 2:
                InterfaceC0828Yg interfaceC0828Yg = (InterfaceC0828Yg) obj;
                boolean zEquals = "1".equals(map.get("transparentBackground"));
                boolean zEquals2 = "1".equals(map.get("blur"));
                float f2 = 0.0f;
                try {
                    if (map.get("blurRadius") != null) {
                        f2 = Float.parseFloat((String) map.get("blurRadius"));
                    }
                } catch (NumberFormatException e7) {
                    u2.k.f("Fail to parse float", e7);
                }
                C0500Fb c0500Fb = (C0500Fb) this.f16756b;
                synchronized (c0500Fb) {
                    c0500Fb.f8137a = zEquals;
                    c0500Fb.f8140d.set(true);
                }
                c0500Fb.a(f2, zEquals2);
                interfaceC0828Yg.g1(zEquals);
                return;
            case 3:
                if (map == null || !map.containsKey("id") || TextUtils.isEmpty((CharSequence) map.get("id")) || !map.containsKey("event_type") || TextUtils.isEmpty((CharSequence) map.get("event_type"))) {
                    AbstractC2907C.m("Ignoring onDeviceStorageEvent GMSG: missing required parameters.");
                    return;
                }
                try {
                    long j6 = Long.parseLong((String) map.get("id"));
                    int i = Integer.parseInt((String) map.get("event_type"));
                    p2.j.f22785C.f22797k.getClass();
                    ((C1280ho) this.f16756b).a(j6, System.currentTimeMillis(), i);
                    return;
                } catch (NumberFormatException e8) {
                    AbstractC2907C.n("Ignoring onDeviceStorageEvent GMSG: invalid number format for ID or eventType.", e8);
                    return;
                }
            case 4:
                a(obj, map);
                return;
            case 5:
                InterfaceC0619Mb interfaceC0619Mb = (InterfaceC0619Mb) this.f16756b;
                String str4 = (String) map.get("action");
                if (!"grant".equals(str4)) {
                    if ("video_start".equals(str4)) {
                        interfaceC0619Mb.a();
                        return;
                    } else {
                        if ("video_complete".equals(str4)) {
                            interfaceC0619Mb.s();
                            return;
                        }
                        return;
                    }
                }
                C0520Ge c0520Ge = null;
                try {
                    int i3 = Integer.parseInt((String) map.get("amount"));
                    String str5 = (String) map.get("type");
                    if (!TextUtils.isEmpty(str5)) {
                        c0520Ge = new C0520Ge(str5, i3);
                    }
                } catch (NumberFormatException e9) {
                    u2.k.i("Unable to parse reward amount.", e9);
                }
                interfaceC0619Mb.N(c0520Ge);
                return;
            case 6:
                if (!map.containsKey("text") || TextUtils.isEmpty((CharSequence) map.get("text"))) {
                    return;
                }
                AbstractC2907C.m("Opening Share Sheet with text: ".concat(String.valueOf((String) map.get("text"))));
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                intent.setType("text/plain");
                intent.putExtra("android.intent.extra.TEXT", (String) map.get("text"));
                if (map.containsKey("title")) {
                    intent.putExtra("android.intent.extra.TITLE", (String) map.get("title"));
                }
                try {
                    C2911G c2911g = p2.j.f22785C.f22790c;
                    C2911G.u((Context) this.f16756b, intent);
                    return;
                } catch (RuntimeException e10) {
                    u2.k.i("Failed to open Share Sheet", e10);
                    p2.j.f22785C.f22795h.f("ShareSheetGmsgHandler.onGmsg", e10);
                    return;
                }
            case 7:
                String str6 = (String) map.get("action");
                if (str6 == null) {
                    u2.k.h("Action missing from video GMSG.");
                    return;
                }
                if (str6.equals("src")) {
                    String str7 = (String) map.get("src");
                    if (str7 == null) {
                        u2.k.h("src missing from video GMSG.");
                        return;
                    }
                    Rx rx = (Rx) this.f16756b;
                    rx.getClass();
                    Bundle bundle = new Bundle();
                    bundle.putString("mediaUrl", str7);
                    ((C0657Of) rx.f11090b).b(bundle);
                    return;
                }
                return;
            case 8:
                b(obj, map);
                return;
            default:
                ((C0511Fm) this.f16756b).f8182b.d(map);
                return;
        }
    }
}
