package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import z0.C5848a;

/* compiled from: Store.java */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f23272a;

    /* compiled from: Store.java */
    /* renamed from: com.google.firebase.messaging.a$a, reason: collision with other inner class name */
    public static class C0348a {

        /* renamed from: d, reason: collision with root package name */
        public static final long f23273d = TimeUnit.DAYS.toMillis(7);

        /* renamed from: a, reason: collision with root package name */
        public final String f23274a;

        /* renamed from: b, reason: collision with root package name */
        public final String f23275b;

        /* renamed from: c, reason: collision with root package name */
        public final long f23276c;

        public C0348a(String str, String str2, long j4) {
            this.f23274a = str;
            this.f23275b = str2;
            this.f23276c = j4;
        }

        public static String a(String str, String str2, long j4) throws JSONException {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", str);
                jSONObject.put("appVersion", str2);
                jSONObject.put("timestamp", j4);
                return jSONObject.toString();
            } catch (JSONException e4) {
                Log.w("FirebaseMessaging", "Failed to encode token: " + e4);
                return null;
            }
        }

        public static C0348a b(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (!str.startsWith("{")) {
                return new C0348a(str, null, 0L);
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new C0348a(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
            } catch (JSONException e4) {
                Log.w("FirebaseMessaging", "Failed to parse token: " + e4);
                return null;
            }
        }
    }

    public a(Context context) {
        boolean zIsEmpty;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.f23272a = sharedPreferences;
        File file = new File(C5848a.getNoBackupFilesDir(context), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile()) {
                synchronized (this) {
                    zIsEmpty = sharedPreferences.getAll().isEmpty();
                }
                if (zIsEmpty) {
                    return;
                }
                Log.i("FirebaseMessaging", "App restored, clearing state");
                a();
            }
        } catch (IOException e4) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e4.getMessage());
            }
        }
    }

    public final synchronized void a() {
        this.f23272a.edit().clear().commit();
    }
}
