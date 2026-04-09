package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.r5;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class w4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    protected final com.applovin.impl.sdk.k f21692a;

    /* renamed from: b, reason: collision with root package name */
    protected final String f21693b;

    /* renamed from: c, reason: collision with root package name */
    protected final com.applovin.impl.sdk.o f21694c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f21695d;

    /* renamed from: e, reason: collision with root package name */
    private String f21696e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f21697f;

    public w4(String str, com.applovin.impl.sdk.k kVar) {
        this(str, kVar, false, null);
    }

    public com.applovin.impl.sdk.k b() {
        return this.f21692a;
    }

    public String c() {
        return this.f21693b;
    }

    public boolean d() {
        return this.f21697f;
    }

    public w4(String str, com.applovin.impl.sdk.k kVar, boolean z10) {
        this(str, kVar, z10, null);
    }

    public Context a() {
        return this.f21695d;
    }

    public ScheduledFuture b(Thread thread, long j4) {
        if (j4 <= 0) {
            return null;
        }
        return this.f21692a.q0().b(new f6(this.f21692a, "timeout:" + this.f21693b, new V0(this, thread, j4, 0)), r5.b.TIMEOUT, j4);
    }

    public w4(String str, com.applovin.impl.sdk.k kVar, String str2) {
        this(str, kVar, false, str2);
    }

    public void a(String str) {
        this.f21696e = str;
    }

    public w4(String str, com.applovin.impl.sdk.k kVar, boolean z10, String str2) {
        this.f21693b = str;
        this.f21692a = kVar;
        this.f21694c = kVar.O();
        this.f21695d = com.applovin.impl.sdk.k.o();
        this.f21697f = z10;
        this.f21696e = str2;
    }

    public void a(boolean z10) {
        this.f21697f = z10;
    }

    public void a(Throwable th) {
        Map map = CollectionUtils.map(AdRevenueConstants.SOURCE_KEY, this.f21693b);
        map.put("top_main_method", th.toString());
        map.put("details", StringUtils.emptyIfNull(this.f21696e));
        this.f21692a.E().d(y1.f21756B0, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Thread thread, long j4) {
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap(AppMeasurementSdk.ConditionalUserProperty.NAME, thread.getState().name());
        if (StringUtils.isValidString(this.f21696e)) {
            mapHashMap.put("details", this.f21696e);
        }
        this.f21692a.E().a(y1.f21758C0, this.f21693b, mapHashMap);
        if (com.applovin.impl.sdk.o.a()) {
            this.f21694c.k(this.f21693b, "Task has been executing for over " + TimeUnit.MILLISECONDS.toSeconds(j4) + " seconds");
        }
    }
}
