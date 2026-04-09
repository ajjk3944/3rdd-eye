package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.StrictMode;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class G9 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: g, reason: collision with root package name */
    public Context f8324g;

    /* renamed from: a, reason: collision with root package name */
    public final Object f8318a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final ConditionVariable f8319b = new ConditionVariable();

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f8320c = false;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f8321d = false;

    /* renamed from: e, reason: collision with root package name */
    public SharedPreferences f8322e = null;

    /* renamed from: f, reason: collision with root package name */
    public Bundle f8323f = new Bundle();

    /* renamed from: h, reason: collision with root package name */
    public JSONObject f8325h = new JSONObject();
    public boolean i = false;

    /* renamed from: j, reason: collision with root package name */
    public boolean f8326j = false;

    public final Object a(E9 e9) {
        if (!this.f8319b.block(5000L)) {
            synchronized (this.f8318a) {
                try {
                    if (!this.f8321d) {
                        throw new IllegalStateException("Flags.initialize() was not called!");
                    }
                } finally {
                }
            }
        }
        if (!this.f8320c || this.f8322e == null || this.f8326j) {
            synchronized (this.f8318a) {
                if (this.f8320c && this.f8322e != null && !this.f8326j) {
                }
                return e9.c();
            }
        }
        int i = e9.f7918a;
        if (i != 2) {
            if (i == 1 && this.f8325h.has(e9.f7919b)) {
                return e9.a(this.f8325h);
            }
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                return e9.b(this.f8322e);
            } finally {
                StrictMode.setThreadPolicy(threadPolicy);
            }
        }
        Bundle bundle = this.f8323f;
        if (bundle == null) {
            return e9.c();
        }
        switch (e9.f7922e) {
            case 0:
                String str = e9.f7919b;
                return bundle.containsKey("com.google.android.gms.ads.flag.".concat(str)) ? Boolean.valueOf(bundle.getBoolean("com.google.android.gms.ads.flag.".concat(str))) : (Boolean) e9.c();
            case 1:
                String str2 = e9.f7919b;
                return bundle.containsKey("com.google.android.gms.ads.flag.".concat(str2)) ? Integer.valueOf(bundle.getInt("com.google.android.gms.ads.flag.".concat(str2))) : (Integer) e9.c();
            case 2:
                String str3 = e9.f7919b;
                return bundle.containsKey("com.google.android.gms.ads.flag.".concat(str3)) ? Long.valueOf(bundle.getLong("com.google.android.gms.ads.flag.".concat(str3))) : (Long) e9.c();
            case 3:
                String str4 = e9.f7919b;
                return bundle.containsKey("com.google.android.gms.ads.flag.".concat(str4)) ? Float.valueOf(bundle.getFloat("com.google.android.gms.ads.flag.".concat(str4))) : (Float) e9.c();
            default:
                String str5 = e9.f7919b;
                return bundle.containsKey("com.google.android.gms.ads.flag.".concat(str5)) ? bundle.getString("com.google.android.gms.ads.flag.".concat(str5)) : (String) e9.c();
        }
    }

    public final Object b(E9 e9) {
        return (this.f8320c || this.f8321d) ? a(e9) : e9.c();
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (!"flag_configuration".equals(str) || sharedPreferences == null) {
            return;
        }
        try {
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                String string = sharedPreferences.getString("flag_configuration", "{}");
                StrictMode.setThreadPolicy(threadPolicy);
                this.f8325h = new JSONObject(string);
            } catch (Throwable th) {
                StrictMode.setThreadPolicy(threadPolicy);
                throw th;
            }
        } catch (JSONException unused) {
        }
    }
}
