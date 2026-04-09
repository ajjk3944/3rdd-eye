package com.yandex.varioqub.appmetricaadapter;

import android.content.Context;
import c9.C2097r;
import c9.C2101v;
import com.yandex.varioqub.analyticadapter.AdapterIdentifiersCallback;
import com.yandex.varioqub.analyticadapter.VarioqubConfigAdapter;
import com.yandex.varioqub.analyticadapter.data.ConfigData;
import com.yandex.varioqub.appmetricaadapter.impl.c;
import com.yandex.varioqub.appmetricaadapter.impl.d;
import com.yandex.varioqub.appmetricaadapter.impl.f;
import com.yandex.varioqub.appmetricaadapter.impl.i;
import com.yandex.varioqub.appmetricaadapter.impl.j;
import com.yandex.varioqub.appmetricaadapter.impl.k;
import com.yandex.varioqub.protobuf.nano.MessageNano;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes3.dex */
public final class AppMetricaAdapter implements VarioqubConfigAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final Context f36947a;

    /* renamed from: b, reason: collision with root package name */
    public final d f36948b;

    /* renamed from: c, reason: collision with root package name */
    public String f36949c;

    /* renamed from: d, reason: collision with root package name */
    public Set f36950d;

    /* renamed from: e, reason: collision with root package name */
    public final String f36951e;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i) {
            this();
        }
    }

    static {
        new Companion(0);
    }

    public AppMetricaAdapter(Context context) {
        Class<?> cls;
        d iVar;
        this.f36947a = context;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("io.appmetrica.analytics.AppMetrica", false, j.class.getClassLoader());
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls != null) {
            iVar = new c();
        } else {
            try {
                cls2 = Class.forName("com.yandex.metrica.YandexMetrica", false, j.class.getClassLoader());
            } catch (Throwable unused2) {
            }
            iVar = cls2 != null ? new i() : new f();
        }
        this.f36948b = iVar;
        this.f36949c = "";
        this.f36950d = C2101v.f18583b;
        this.f36951e = "AppMetricaAdapter";
    }

    @Override // com.yandex.varioqub.analyticadapter.VarioqubConfigAdapter
    public final String getAdapterName() {
        return this.f36951e;
    }

    @Override // com.yandex.varioqub.analyticadapter.VarioqubConfigReporter
    public final void reportConfigChanged(ConfigData configData) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("old_config", configData.getOldConfigVersion());
        linkedHashMap.put("new_config", configData.getNewConfigVersion());
        linkedHashMap.put("timestamp", Long.valueOf(configData.getConfigLoadTimestamp()));
        this.f36948b.b(linkedHashMap);
    }

    @Override // com.yandex.varioqub.analyticadapter.VarioqubConfigClientIdentifiersProvider
    public final void requestDeviceId(AdapterIdentifiersCallback adapterIdentifiersCallback) {
        this.f36948b.c(this.f36947a, adapterIdentifiersCallback);
    }

    @Override // com.yandex.varioqub.analyticadapter.VarioqubConfigClientIdentifiersProvider
    public final void requestUserId(AdapterIdentifiersCallback adapterIdentifiersCallback) {
        this.f36948b.a(this.f36947a, adapterIdentifiersCallback);
    }

    @Override // com.yandex.varioqub.analyticadapter.VarioqubConfigReporter
    public final void setExperiments(String str) {
        this.f36949c = str;
        Objects.toString(this.f36950d);
        k kVar = new k();
        kVar.f36957a = this.f36949c;
        kVar.f36958b = C2097r.H0(this.f36950d);
        this.f36948b.a(MessageNano.toByteArray(kVar));
    }

    @Override // com.yandex.varioqub.analyticadapter.VarioqubConfigReporter
    public final void setTriggeredTestIds(Set<Long> set) {
        Objects.toString(set);
        Set setL0 = C2097r.L0(set);
        this.f36950d = setL0;
        Objects.toString(setL0);
        k kVar = new k();
        kVar.f36957a = this.f36949c;
        kVar.f36958b = C2097r.H0(this.f36950d);
        this.f36948b.a(MessageNano.toByteArray(kVar));
    }
}
