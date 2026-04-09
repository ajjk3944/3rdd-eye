package com.google.firebase.remoteconfig.internal;

import android.content.SharedPreferences;
import java.util.Date;

/* compiled from: ConfigMetadataClient.java */
/* loaded from: classes2.dex */
public final class d {

    /* renamed from: e, reason: collision with root package name */
    public static final Date f23324e = new Date(-1);

    /* renamed from: f, reason: collision with root package name */
    public static final Date f23325f = new Date(-1);

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f23326a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f23327b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Object f23328c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final Object f23329d = new Object();

    /* compiled from: ConfigMetadataClient.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f23330a;

        /* renamed from: b, reason: collision with root package name */
        public Date f23331b;
    }

    /* compiled from: ConfigMetadataClient.java */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f23332a;

        /* renamed from: b, reason: collision with root package name */
        public Date f23333b;
    }

    public d(SharedPreferences sharedPreferences) {
        this.f23326a = sharedPreferences;
    }

    public final a a() {
        a aVar;
        synchronized (this.f23328c) {
            int i = this.f23326a.getInt("num_failed_fetches", 0);
            Date date = new Date(this.f23326a.getLong("backoff_end_time_in_millis", -1L));
            aVar = new a();
            aVar.f23330a = i;
            aVar.f23331b = date;
        }
        return aVar;
    }

    public final b b() {
        b bVar;
        synchronized (this.f23329d) {
            int i = this.f23326a.getInt("num_failed_realtime_streams", 0);
            Date date = new Date(this.f23326a.getLong("realtime_backoff_end_time_in_millis", -1L));
            bVar = new b();
            bVar.f23332a = i;
            bVar.f23333b = date;
        }
        return bVar;
    }

    public final void c(int i, Date date) {
        synchronized (this.f23328c) {
            this.f23326a.edit().putInt("num_failed_fetches", i).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    public final void d(String str) {
        synchronized (this.f23327b) {
            this.f23326a.edit().putString("last_fetch_etag", str).apply();
        }
    }

    public final void e(int i, Date date) {
        synchronized (this.f23329d) {
            this.f23326a.edit().putInt("num_failed_realtime_streams", i).putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    public final void f() {
        synchronized (this.f23327b) {
            this.f23326a.edit().putInt("last_fetch_status", 1).apply();
        }
    }

    public final void g() {
        synchronized (this.f23327b) {
            this.f23326a.edit().putInt("last_fetch_status", 2).apply();
        }
    }
}
