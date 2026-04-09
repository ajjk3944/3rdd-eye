package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.qf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1755qf {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f16386a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f16387b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final Context f16388c;

    /* renamed from: d, reason: collision with root package name */
    public final C0697Ql f16389d;

    public C1755qf(Context context, C0697Ql c0697Ql) {
        this.f16388c = context;
        this.f16389d = c0697Ql;
    }

    public final synchronized void a(C1701pf c1701pf) {
        this.f16387b.add(c1701pf);
    }

    public final synchronized void b(String str) {
        try {
            HashMap map = this.f16386a;
            if (map.containsKey(str)) {
                return;
            }
            SharedPreferences defaultSharedPreferences = Objects.equals(str, "__default__") ? PreferenceManager.getDefaultSharedPreferences(this.f16388c) : this.f16388c.getSharedPreferences(str, 0);
            SharedPreferencesOnSharedPreferenceChangeListenerC1647of sharedPreferencesOnSharedPreferenceChangeListenerC1647of = new SharedPreferencesOnSharedPreferenceChangeListenerC1647of(this, str);
            map.put(str, sharedPreferencesOnSharedPreferenceChangeListenerC1647of);
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(sharedPreferencesOnSharedPreferenceChangeListenerC1647of);
        } catch (Throwable th) {
            throw th;
        }
    }
}
