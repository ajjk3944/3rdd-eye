package com.google.android.gms.internal.measurement;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.measurement.x0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class SharedPreferencesEditorC4490x0 implements SharedPreferences.Editor {

    /* renamed from: a, reason: collision with root package name */
    private boolean f35524a;

    /* renamed from: b, reason: collision with root package name */
    private Set f35525b;

    /* renamed from: c, reason: collision with root package name */
    private Map f35526c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ SharedPreferencesC4466u0 f35527d;

    private final void a(String str, Object obj) {
        if (obj != null) {
            this.f35526c.put(str, obj);
        } else {
            remove(str);
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
        commit();
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor clear() {
        this.f35524a = true;
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        if (this.f35524a) {
            this.f35527d.f35487a.clear();
        }
        this.f35527d.f35487a.keySet().removeAll(this.f35525b);
        for (Map.Entry entry : this.f35526c.entrySet()) {
            this.f35527d.f35487a.put((String) entry.getKey(), entry.getValue());
        }
        for (SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener : this.f35527d.f35488b) {
            com.google.common.collect.S sB = com.google.common.collect.M.c(this.f35525b, this.f35526c.keySet()).iterator();
            while (sB.hasNext()) {
                onSharedPreferenceChangeListener.onSharedPreferenceChanged(this.f35527d, (String) sB.next());
            }
        }
        return (!this.f35524a && this.f35525b.isEmpty() && this.f35526c.isEmpty()) ? false : true;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putBoolean(String str, boolean z10) {
        a(str, Boolean.valueOf(z10));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putFloat(String str, float f10) {
        a(str, Float.valueOf(f10));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putInt(String str, int i10) {
        a(str, Integer.valueOf(i10));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putLong(String str, long j10) {
        a(str, Long.valueOf(j10));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putString(String str, String str2) {
        a(str, str2);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putStringSet(String str, Set set) {
        a(str, set);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor remove(String str) {
        this.f35525b.add(str);
        return this;
    }

    private SharedPreferencesEditorC4490x0(SharedPreferencesC4466u0 sharedPreferencesC4466u0) {
        this.f35527d = sharedPreferencesC4466u0;
        this.f35524a = false;
        this.f35525b = new HashSet();
        this.f35526c = new HashMap();
    }
}
