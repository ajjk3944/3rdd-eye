package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreutils.internal.services.FrameworkDetector;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class Mc implements V8 {

    /* renamed from: a, reason: collision with root package name */
    public final C4513bh f39858a;

    /* renamed from: b, reason: collision with root package name */
    public final Cif f39859b;

    /* renamed from: c, reason: collision with root package name */
    public final String f39860c = "activation_unlock_event_sending";

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f39861d;

    public Mc(C4513bh c4513bh, J4 j4, Cif cif) {
        this.f39858a = c4513bh;
        this.f39859b = cif;
        this.f39861d = new AtomicBoolean(cif.a(false) || a(j4));
    }

    public final void a(String str) {
        try {
            Zj zj = AbstractC5105yj.f42147a;
            String str2 = this.f39860c;
            JSONObject jSONObjectPut = new JSONObject().put(AdRevenueConstants.SOURCE_KEY, str).put("framework", FrameworkDetector.framework());
            C4609fa c4609faH = Ga.f39501F.h();
            Bundle applicationMetaData = c4609faH.f40850d.getApplicationMetaData(c4609faH.f40847a);
            JSONObject jSONObjectPut2 = jSONObjectPut.put("appmetrica_plugin_id", applicationMetaData != null ? applicationMetaData.getString("io.appmetrica.analytics.plugin_id") : null);
            C4904qk c4904qk = Ga.f39501F.f39505D;
            String string = jSONObjectPut2.put("activation_offset", TimeUnit.SECONDS.convert(c4904qk.f41489a.currentTimeMillis() - c4904qk.f41490b, TimeUnit.MILLISECONDS)).toString();
            zj.getClass();
            zj.a(new Xj(str2, string));
        } catch (Throwable unused) {
        }
    }

    @Override // io.appmetrica.analytics.impl.V8
    public final boolean b() {
        String str;
        if (!this.f39861d.get() && (str = ((C5028vh) this.f39858a.a()).f41869m) != null && !str.equals("629a824d-c717-4ba5-bc0f-3f3968554d01") && this.f39861d.compareAndSet(false, true)) {
            this.f39859b.b(true);
            a("activation");
        }
        return this.f39861d.get();
    }

    public final void a() {
        if (this.f39861d.compareAndSet(false, true)) {
            this.f39859b.b(true);
            a("timer");
        }
    }

    public static boolean a(J4 j4) {
        String str = j4.f39669a;
        return (str == null || str.equals("629a824d-c717-4ba5-bc0f-3f3968554d01")) ? false : true;
    }
}
