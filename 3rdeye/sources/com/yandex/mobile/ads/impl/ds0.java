package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import b9.C2001h;
import b9.InterfaceC2000g;
import com.yandex.mobile.ads.impl.cs0;
import io.appmetrica.analytics.impl.Oo;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import p9.InterfaceC5480a;

@SuppressLint({"ApplySharedPref"})
/* loaded from: classes3.dex */
public final class ds0 implements cs0, SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a, reason: collision with root package name */
    private final String f26300a;

    /* renamed from: b, reason: collision with root package name */
    private final qx1 f26301b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f26302c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC2000g f26303d;

    /* renamed from: e, reason: collision with root package name */
    private final LinkedHashSet f26304e;

    public static final class a extends kotlin.jvm.internal.m implements InterfaceC5480a<SharedPreferences> {
        public a() {
            super(0);
        }

        @Override // p9.InterfaceC5480a
        public final SharedPreferences invoke() {
            return qx1.a(ds0.this.f26301b, ds0.this.f26302c, ds0.this.f26300a);
        }
    }

    public ds0(Context context, String fileName, qx1 preferencesFactory) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(fileName, "fileName");
        kotlin.jvm.internal.l.f(preferencesFactory, "preferencesFactory");
        this.f26300a = fileName;
        this.f26301b = preferencesFactory;
        Context applicationContext = context.getApplicationContext();
        this.f26302c = applicationContext != null ? applicationContext : context;
        this.f26303d = C2001h.b(new a());
        this.f26304e = new LinkedHashSet();
    }

    @Override // com.yandex.mobile.ads.impl.cs0
    public final void clear() {
        ((SharedPreferences) this.f26303d.getValue()).edit().clear().apply();
    }

    @Override // com.yandex.mobile.ads.impl.cs0
    public final String d(String key) {
        kotlin.jvm.internal.l.f(key, "key");
        return ((SharedPreferences) this.f26303d.getValue()).getString(key, null);
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (str != null) {
            Iterator it = this.f26304e.iterator();
            while (it.hasNext()) {
                cs0.a aVar = (cs0.a) ((WeakReference) it.next()).get();
                if (aVar != null) {
                    aVar.a(this, str);
                }
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.cs0
    public final Map<String, ?> a() {
        Map<String, ?> all = ((SharedPreferences) this.f26303d.getValue()).getAll();
        kotlin.jvm.internal.l.e(all, "getAll(...)");
        return all;
    }

    @Override // com.yandex.mobile.ads.impl.cs0
    public final int b(int i, String key) {
        kotlin.jvm.internal.l.f(key, "key");
        ((SharedPreferences) this.f26303d.getValue()).contains(key);
        return ((SharedPreferences) this.f26303d.getValue()).getInt(key, i);
    }

    @Override // com.yandex.mobile.ads.impl.cs0
    public final boolean c(String key) {
        kotlin.jvm.internal.l.f(key, "key");
        return ((SharedPreferences) this.f26303d.getValue()).contains(key);
    }

    @Override // com.yandex.mobile.ads.impl.cs0
    public final boolean a(String key, boolean z10) {
        kotlin.jvm.internal.l.f(key, "key");
        return ((SharedPreferences) this.f26303d.getValue()).getBoolean(key, z10);
    }

    @Override // com.yandex.mobile.ads.impl.cs0
    public final Set<String> a(String key, Set<String> set) {
        kotlin.jvm.internal.l.f(key, "key");
        return ((SharedPreferences) this.f26303d.getValue()).getStringSet(key, set);
    }

    @Override // com.yandex.mobile.ads.impl.cs0
    public final long b(String key) {
        kotlin.jvm.internal.l.f(key, "key");
        return ((SharedPreferences) this.f26303d.getValue()).getLong(key, 0L);
    }

    @Override // com.yandex.mobile.ads.impl.cs0
    public final void a(int i, String key) {
        kotlin.jvm.internal.l.f(key, "key");
        ((SharedPreferences) this.f26303d.getValue()).edit().putInt(key, i).apply();
    }

    @Override // com.yandex.mobile.ads.impl.cs0
    public final void b(String key, boolean z10) {
        kotlin.jvm.internal.l.f(key, "key");
        Oo.j((SharedPreferences) this.f26303d.getValue(), key, z10);
    }

    @Override // com.yandex.mobile.ads.impl.cs0
    public final void a(String key, long j4) {
        kotlin.jvm.internal.l.f(key, "key");
        ((SharedPreferences) this.f26303d.getValue()).edit().putLong(key, j4).apply();
    }

    @Override // com.yandex.mobile.ads.impl.cs0
    public final void a(String key, String str) {
        kotlin.jvm.internal.l.f(key, "key");
        ((SharedPreferences) this.f26303d.getValue()).edit().putString(key, str).apply();
    }

    @Override // com.yandex.mobile.ads.impl.cs0
    public final void a(String key, HashSet hashSet) {
        kotlin.jvm.internal.l.f(key, "key");
        ((SharedPreferences) this.f26303d.getValue()).edit().putStringSet(key, hashSet).apply();
    }

    @Override // com.yandex.mobile.ads.impl.cs0
    public final void a(cs0.a listener) {
        kotlin.jvm.internal.l.f(listener, "listener");
        if (this.f26304e.isEmpty()) {
            ((SharedPreferences) this.f26303d.getValue()).registerOnSharedPreferenceChangeListener(this);
        }
        this.f26304e.add(new WeakReference(listener));
    }

    @Override // com.yandex.mobile.ads.impl.cs0
    public final void a(String key) {
        kotlin.jvm.internal.l.f(key, "key");
        ((SharedPreferences) this.f26303d.getValue()).edit().remove(key).apply();
    }
}
