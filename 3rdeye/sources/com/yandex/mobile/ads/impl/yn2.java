package com.yandex.mobile.ads.impl;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes3.dex */
public abstract class yn2 extends AsyncTask<Object, Void, String> {

    /* renamed from: a, reason: collision with root package name */
    private a f35932a;

    /* renamed from: b, reason: collision with root package name */
    protected final b f35933b;

    public interface a {
    }

    public interface b {
    }

    public yn2(b bVar) {
        this.f35933b = bVar;
    }

    public final void a(a aVar) {
        this.f35932a = aVar;
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        a aVar = this.f35932a;
        if (aVar != null) {
            ((co2) aVar).a();
        }
    }

    public final void a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
