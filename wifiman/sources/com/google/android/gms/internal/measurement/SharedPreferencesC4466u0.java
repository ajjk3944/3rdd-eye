package com.google.android.gms.internal.measurement;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.measurement.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class SharedPreferencesC4466u0 implements SharedPreferences {

    /* renamed from: a, reason: collision with root package name */
    private final Map f35487a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Set f35488b = new HashSet();

    private final Object a(String str, Object obj) {
        Object obj2 = this.f35487a.get(str);
        return obj2 != null ? obj2 : obj;
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        return this.f35487a.containsKey(str);
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        return new SharedPreferencesEditorC4490x0(this);
    }

    @Override // android.content.SharedPreferences
    public final Map getAll() {
        return this.f35487a;
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z10) {
        return ((Boolean) a(str, Boolean.valueOf(z10))).booleanValue();
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f10) {
        return ((Float) a(str, Float.valueOf(f10))).floatValue();
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i10) {
        return ((Integer) a(str, Integer.valueOf(i10))).intValue();
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j10) {
        return ((Long) a(str, Long.valueOf(j10))).longValue();
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        return (String) a(str, str2);
    }

    @Override // android.content.SharedPreferences
    public final Set getStringSet(String str, Set set) {
        return (Set) a(str, set);
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f35488b.add(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f35488b.remove(onSharedPreferenceChangeListener);
    }
}
