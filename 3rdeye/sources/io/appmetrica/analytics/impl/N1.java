package io.appmetrica.analytics.impl;

import android.content.Context;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class N1 {

    /* renamed from: a, reason: collision with root package name */
    public final C4971ta f39885a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f39886b;

    public N1() {
        this(new C4971ta());
    }

    public final synchronized long a(Context context) {
        String strA;
        try {
            this.f39885a.getClass();
            strA = AbstractC4533cb.a(FileUtils.getFileFromAppStorage(context, "metrica_service_settings.dat"));
        } catch (Throwable unused) {
        }
        return !TextUtils.isEmpty(strA) ? new JSONObject(strA).optLong("delay") : 0L;
    }

    public final void b(Context context) {
        synchronized (this) {
        }
        if (this.f39886b) {
            return;
        }
        long jA = a(context);
        if (jA > 0) {
            try {
                Thread.sleep(jA);
            } catch (Throwable unused) {
            }
        }
        this.f39886b = true;
    }

    public N1(C4971ta c4971ta) {
        this.f39886b = false;
        this.f39885a = c4971ta;
    }
}
