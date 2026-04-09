package com.tiktok.appevents;

import androidx.lifecycle.n;
import b7.b;
import org.json.JSONException;

/* loaded from: classes3.dex */
class TTActivityLifecycleCallbacksListener extends TTLifeCycleCallbacksAdapter {

    /* renamed from: c, reason: collision with root package name */
    public static boolean f19977c = false;

    /* renamed from: a, reason: collision with root package name */
    public long f19978a;

    /* renamed from: b, reason: collision with root package name */
    public long f19979b;

    @Override // com.tiktok.appevents.TTLifeCycleCallbacksAdapter, androidx.lifecycle.d
    public void b(n nVar) throws JSONException {
        if (!f19977c) {
            f19977c = false;
        } else {
            g(this.f19979b);
            this.f19978a = System.currentTimeMillis();
            throw null;
        }
    }

    @Override // com.tiktok.appevents.TTLifeCycleCallbacksAdapter, androidx.lifecycle.d
    public void c(n nVar) throws JSONException {
        h(this.f19978a);
        this.f19979b = System.currentTimeMillis();
        throw null;
    }

    @Override // com.tiktok.appevents.TTLifeCycleCallbacksAdapter, androidx.lifecycle.d
    public void d(n nVar) {
        throw null;
    }

    @Override // com.tiktok.appevents.TTLifeCycleCallbacksAdapter, androidx.lifecycle.d
    public void e(n nVar) {
        throw null;
    }

    public final void g(long j10) throws JSONException {
        try {
            b.a(Long.valueOf(j10)).put("latency", System.currentTimeMillis() - j10);
            throw null;
        } catch (Exception unused) {
        }
    }

    public final void h(long j10) throws JSONException {
        try {
            b.a(Long.valueOf(j10)).put("latency", System.currentTimeMillis() - j10);
            throw null;
        } catch (Exception unused) {
        }
    }
}
