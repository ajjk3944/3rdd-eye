package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ew implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10894a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f10895b;

    /* renamed from: c, reason: collision with root package name */
    public Object f10896c;

    public /* synthetic */ ew(ud0 ud0Var, String str) {
        this.f10894a = 1;
        this.f10896c = ud0Var;
        this.f10895b = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) throws JSONException {
        switch (this.f10894a) {
            case 0:
                gw gwVar = (gw) this.f10896c;
                synchronized (gwVar) {
                    try {
                        ArrayList arrayList = gwVar.f11620b;
                        int size = arrayList.size();
                        int i4 = 0;
                        while (i4 < size) {
                            Object obj = arrayList.get(i4);
                            i4++;
                            fw fwVar = (fw) obj;
                            String str2 = (String) this.f10895b;
                            gw gwVar2 = fwVar.f11268a;
                            HashMap map = fwVar.f11269b;
                            gwVar2.getClass();
                            if (map.containsKey(str2) && ((Set) map.get(str2)).contains(str)) {
                                ce1 ce1Var = gwVar2.f11622d;
                                ((tb.a) ce1Var.f10094b).getClass();
                                ((xv) ce1Var.f10095c).a(-1, System.currentTimeMillis());
                            }
                        }
                    } finally {
                    }
                }
                return;
            case 1:
                ud0 ud0Var = (ud0) this.f10896c;
                String str3 = (String) this.f10895b;
                ud0Var.j.set(nh.a.A(ud0Var.f17175b, str3));
                return;
            default:
                JSONObject jSONObject = (JSONObject) this.f10895b;
                if (str != null && ((List) this.f10896c).contains(str)) {
                    try {
                        Object obj2 = sharedPreferences.getAll().get(str);
                        if (obj2 == null) {
                            jSONObject.remove(str);
                        } else {
                            jSONObject.put(str, obj2);
                        }
                        return;
                    } catch (JSONException e2) {
                        ua.j.C.f35265h.g("InspectorSharedPreferenceCollector.onSharedPreferenceChanged", e2);
                        return;
                    }
                }
                return;
        }
    }

    public ew() {
        this.f10894a = 2;
        this.f10895b = new JSONObject();
    }

    public ew(gw gwVar, String str) {
        this.f10894a = 0;
        Objects.requireNonNull(gwVar);
        this.f10896c = gwVar;
        this.f10895b = str;
    }
}
