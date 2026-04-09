package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.StrictMode;
import com.applovin.impl.sdk.utils.JsonUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class rk implements SharedPreferences.OnSharedPreferenceChangeListener {
    public Context g;

    /* renamed from: a, reason: collision with root package name */
    public final Object f15669a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final ConditionVariable f15670b = new ConditionVariable();

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f15671c = false;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f15672d = false;

    /* renamed from: e, reason: collision with root package name */
    public SharedPreferences f15673e = null;

    /* renamed from: f, reason: collision with root package name */
    public Bundle f15674f = new Bundle();

    /* renamed from: h, reason: collision with root package name */
    public JSONObject f15675h = new JSONObject();

    /* renamed from: i, reason: collision with root package name */
    public boolean f15676i = false;
    public boolean j = false;

    public final Object a(pk pkVar) {
        if (!this.f15670b.block(5000L)) {
            synchronized (this.f15669a) {
                try {
                    if (!this.f15672d) {
                        throw new IllegalStateException("Flags.initialize() was not called!");
                    }
                } finally {
                }
            }
        }
        if (!this.f15671c || this.f15673e == null || this.j) {
            synchronized (this.f15669a) {
                if (this.f15671c && this.f15673e != null && !this.j) {
                }
                return pkVar.c();
            }
        }
        int i4 = pkVar.f15024a;
        if (i4 != 2) {
            if (i4 == 1 && this.f15675h.has(pkVar.f15025b)) {
                return pkVar.a(this.f15675h);
            }
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                return pkVar.b(this.f15673e);
            } finally {
                StrictMode.setThreadPolicy(threadPolicy);
            }
        }
        Bundle bundle = this.f15674f;
        if (bundle == null) {
            return pkVar.c();
        }
        switch (pkVar.f15028e) {
            case 0:
                String str = pkVar.f15025b;
                return bundle.containsKey("com.google.android.gms.ads.flag.".concat(str)) ? Boolean.valueOf(bundle.getBoolean("com.google.android.gms.ads.flag.".concat(str))) : (Boolean) pkVar.c();
            case 1:
                String str2 = pkVar.f15025b;
                return bundle.containsKey("com.google.android.gms.ads.flag.".concat(str2)) ? Integer.valueOf(bundle.getInt("com.google.android.gms.ads.flag.".concat(str2))) : (Integer) pkVar.c();
            case 2:
                String str3 = pkVar.f15025b;
                return bundle.containsKey("com.google.android.gms.ads.flag.".concat(str3)) ? Long.valueOf(bundle.getLong("com.google.android.gms.ads.flag.".concat(str3))) : (Long) pkVar.c();
            case 3:
                String str4 = pkVar.f15025b;
                return bundle.containsKey("com.google.android.gms.ads.flag.".concat(str4)) ? Float.valueOf(bundle.getFloat("com.google.android.gms.ads.flag.".concat(str4))) : (Float) pkVar.c();
            default:
                String str5 = pkVar.f15025b;
                return bundle.containsKey("com.google.android.gms.ads.flag.".concat(str5)) ? bundle.getString("com.google.android.gms.ads.flag.".concat(str5)) : (String) pkVar.c();
        }
    }

    public final Object b(pk pkVar) {
        return (this.f15671c || this.f15672d) ? a(pkVar) : pkVar.c();
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
                String string = sharedPreferences.getString("flag_configuration", JsonUtils.EMPTY_JSON);
                StrictMode.setThreadPolicy(threadPolicy);
                this.f15675h = new JSONObject(string);
            } catch (Throwable th2) {
                StrictMode.setThreadPolicy(threadPolicy);
                throw th2;
            }
        } catch (JSONException unused) {
        }
    }
}
