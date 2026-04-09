package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.d6;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class i5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    protected final com.applovin.impl.sdk.k f4287a;

    /* renamed from: b, reason: collision with root package name */
    protected final String f4288b;

    /* renamed from: c, reason: collision with root package name */
    protected final com.applovin.impl.sdk.o f4289c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f4290d;

    /* renamed from: e, reason: collision with root package name */
    private String f4291e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f4292f;

    public i5(String str, com.applovin.impl.sdk.k kVar) {
        this(str, kVar, false, null);
    }

    public com.applovin.impl.sdk.k b() {
        return this.f4287a;
    }

    public String c() {
        return this.f4288b;
    }

    public boolean d() {
        return this.f4292f;
    }

    public i5(String str, com.applovin.impl.sdk.k kVar, boolean z3) {
        this(str, kVar, z3, null);
    }

    public Context a() {
        return this.f4290d;
    }

    public ScheduledFuture b(Thread thread, long j) {
        if (j <= 0) {
            return null;
        }
        return this.f4287a.q0().b(new r6(this.f4287a, "timeout:" + this.f4288b, new n9(this, thread, j, 0)), d6.b.TIMEOUT, j);
    }

    public i5(String str, com.applovin.impl.sdk.k kVar, String str2) {
        this(str, kVar, false, str2);
    }

    public void a(String str) {
        this.f4291e = str;
    }

    public i5(String str, com.applovin.impl.sdk.k kVar, boolean z3, String str2) {
        this.f4288b = str;
        this.f4287a = kVar;
        this.f4289c = kVar.O();
        this.f4290d = com.applovin.impl.sdk.k.o();
        this.f4292f = z3;
        this.f4291e = str2;
    }

    public void a(boolean z3) {
        this.f4292f = z3;
    }

    public void a(Throwable th2) {
        Map map = CollectionUtils.map("source", this.f4288b);
        map.put("top_main_method", th2.toString());
        map.put("details", StringUtils.emptyIfNull(this.f4291e));
        this.f4287a.D().d(d2.X0, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Thread thread, long j) {
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("name", thread.getState().name());
        if (StringUtils.isValidString(this.f4291e)) {
            mapHashMap.put("details", this.f4291e);
        }
        this.f4287a.D().a(d2.Y0, this.f4288b, mapHashMap);
        if (com.applovin.impl.sdk.o.a()) {
            this.f4289c.k(this.f4288b, "Task has been executing for over " + TimeUnit.MILLISECONDS.toSeconds(j) + " seconds");
        }
    }
}
