package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.d6;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class i5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    protected final com.applovin.impl.sdk.k f6218a;

    /* renamed from: b, reason: collision with root package name */
    protected final String f6219b;

    /* renamed from: c, reason: collision with root package name */
    protected final com.applovin.impl.sdk.o f6220c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f6221d;

    /* renamed from: e, reason: collision with root package name */
    private String f6222e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f6223f;

    public i5(String str, com.applovin.impl.sdk.k kVar) {
        this(str, kVar, false, null);
    }

    public com.applovin.impl.sdk.k b() {
        return this.f6218a;
    }

    public String c() {
        return this.f6219b;
    }

    public boolean d() {
        return this.f6223f;
    }

    public i5(String str, com.applovin.impl.sdk.k kVar, boolean z10) {
        this(str, kVar, z10, null);
    }

    public Context a() {
        return this.f6221d;
    }

    public ScheduledFuture b(final Thread thread, final long j10) {
        if (j10 <= 0) {
            return null;
        }
        return this.f6218a.q0().b(new r6(this.f6218a, "timeout:" + this.f6219b, new Runnable() { // from class: com.applovin.impl.eb
            @Override // java.lang.Runnable
            public final void run() {
                this.f5961a.a(thread, j10);
            }
        }), d6.b.TIMEOUT, j10);
    }

    public i5(String str, com.applovin.impl.sdk.k kVar, String str2) {
        this(str, kVar, false, str2);
    }

    public void a(String str) {
        this.f6222e = str;
    }

    public i5(String str, com.applovin.impl.sdk.k kVar, boolean z10, String str2) {
        this.f6219b = str;
        this.f6218a = kVar;
        this.f6220c = kVar.O();
        this.f6221d = com.applovin.impl.sdk.k.o();
        this.f6223f = z10;
        this.f6222e = str2;
    }

    public void a(boolean z10) {
        this.f6223f = z10;
    }

    public void a(Throwable th) {
        Map map = CollectionUtils.map("source", this.f6219b);
        map.put("top_main_method", th.toString());
        map.put("details", StringUtils.emptyIfNull(this.f6222e));
        this.f6218a.D().d(d2.X0, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Thread thread, long j10) {
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("name", thread.getState().name());
        if (StringUtils.isValidString(this.f6222e)) {
            mapHashMap.put("details", this.f6222e);
        }
        this.f6218a.D().a(d2.Y0, this.f6219b, mapHashMap);
        if (com.applovin.impl.sdk.o.a()) {
            this.f6220c.k(this.f6219b, "Task has been executing for over " + TimeUnit.MILLISECONDS.toSeconds(j10) + " seconds");
        }
    }
}
