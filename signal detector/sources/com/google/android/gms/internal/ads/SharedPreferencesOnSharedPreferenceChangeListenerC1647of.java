package com.google.android.gms.internal.ads;

import a.AbstractC0241a;
import android.content.SharedPreferences;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.of, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class SharedPreferencesOnSharedPreferenceChangeListenerC1647of implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15968a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f15969b;

    /* renamed from: c, reason: collision with root package name */
    public Object f15970c;

    public /* synthetic */ SharedPreferencesOnSharedPreferenceChangeListenerC1647of(C0852Zn c0852Zn, String str) {
        this.f15968a = 1;
        this.f15970c = c0852Zn;
        this.f15969b = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) throws JSONException {
        switch (this.f15968a) {
            case 0:
                C1755qf c1755qf = (C1755qf) this.f15970c;
                synchronized (c1755qf) {
                    try {
                        ArrayList arrayList = c1755qf.f16387b;
                        int size = arrayList.size();
                        int i = 0;
                        while (i < size) {
                            Object obj = arrayList.get(i);
                            i++;
                            C1701pf c1701pf = (C1701pf) obj;
                            String str2 = (String) this.f15969b;
                            C1755qf c1755qf2 = c1701pf.f16183a;
                            HashMap map = c1701pf.f16184b;
                            c1755qf2.getClass();
                            if (map.containsKey(str2) && ((Set) map.get(str2)).contains(str)) {
                                C0697Ql c0697Ql = c1755qf2.f16389d;
                                ((Q2.a) c0697Ql.f10691b).getClass();
                                ((C1217gf) c0697Ql.f10692c).a(-1, System.currentTimeMillis());
                            }
                        }
                    } finally {
                    }
                }
                return;
            case 1:
                C0852Zn c0852Zn = (C0852Zn) this.f15970c;
                String str3 = (String) this.f15969b;
                c0852Zn.f12966j.set(AbstractC0241a.F(c0852Zn.f12959b, str3));
                return;
            default:
                JSONObject jSONObject = (JSONObject) this.f15969b;
                if (str != null && ((List) this.f15970c).contains(str)) {
                    try {
                        Object obj2 = sharedPreferences.getAll().get(str);
                        if (obj2 == null) {
                            jSONObject.remove(str);
                        } else {
                            jSONObject.put(str, obj2);
                        }
                        return;
                    } catch (JSONException e6) {
                        p2.j.f22785C.f22795h.g("InspectorSharedPreferenceCollector.onSharedPreferenceChanged", e6);
                        return;
                    }
                }
                return;
        }
    }

    public SharedPreferencesOnSharedPreferenceChangeListenerC1647of() {
        this.f15968a = 2;
        this.f15969b = new JSONObject();
    }

    public SharedPreferencesOnSharedPreferenceChangeListenerC1647of(C1755qf c1755qf, String str) {
        this.f15968a = 0;
        Objects.requireNonNull(c1755qf);
        this.f15970c = c1755qf;
        this.f15969b = str;
    }
}
