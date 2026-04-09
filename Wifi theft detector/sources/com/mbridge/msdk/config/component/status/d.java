package com.mbridge.msdk.config.component.status;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private SharedPreferences f13703a;

    /* renamed from: b, reason: collision with root package name */
    private final List<String> f13704b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final List<com.mbridge.msdk.config.component.status.a> f13705c = new CopyOnWriteArrayList();

    /* renamed from: d, reason: collision with root package name */
    SharedPreferences.OnSharedPreferenceChangeListener f13706d = new a();

    public class a implements SharedPreferences.OnSharedPreferenceChangeListener {
        public a() {
        }

        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
        public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
            if (d.this.f13703a == null || !d.this.f13703a.contains(str)) {
                return;
            }
            com.mbridge.msdk.config.component.base.b bVar = new com.mbridge.msdk.config.component.base.b();
            bVar.b("916006");
            HashMap map = new HashMap();
            try {
                Object obj = d.this.f13703a.getAll().get(str);
                map.put(com.mbridge.msdk.config.component.common.util.c.a("key"), str);
                map.put(com.mbridge.msdk.config.component.common.util.c.a(AppMeasurementSdk.ConditionalUserProperty.VALUE), obj);
            } catch (Exception unused) {
                map.put(com.mbridge.msdk.config.component.common.util.c.a("key"), str);
                map.put(com.mbridge.msdk.config.component.common.util.c.a(AppMeasurementSdk.ConditionalUserProperty.VALUE), d.this.f13703a.getString(str, ""));
            }
            if (d.this.f13704b.isEmpty()) {
                bVar.a(map);
                d.this.a(bVar);
            } else if (d.this.f13704b.contains(str)) {
                bVar.a(map);
                d.this.a(bVar);
            }
        }
    }

    public d(String str) {
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        if (contextD == null) {
            return;
        }
        Context applicationContext = contextD.getApplicationContext();
        if (TextUtils.isEmpty(str)) {
            str = applicationContext.getPackageName() + "_preferences";
        }
        SharedPreferences sharedPreferences = applicationContext.getSharedPreferences(str, 0);
        this.f13703a = sharedPreferences;
        if (sharedPreferences != null) {
            sharedPreferences.registerOnSharedPreferenceChangeListener(this.f13706d);
        }
    }

    public void b(com.mbridge.msdk.config.component.status.a aVar) {
        if (aVar != null) {
            this.f13705c.remove(aVar);
        }
    }

    public void a(com.mbridge.msdk.config.component.status.a aVar) {
        if (aVar != null) {
            this.f13705c.add(aVar);
        }
    }

    public void a(List<String> list) {
        if (list != null) {
            this.f13704b.addAll(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.config.component.base.b bVar) {
        try {
            Iterator<com.mbridge.msdk.config.component.status.a> it = this.f13705c.iterator();
            while (it.hasNext()) {
                it.next().a(bVar);
            }
        } catch (Throwable th) {
            q0.b("PreferencePublisher", th.getMessage());
        }
    }
}
