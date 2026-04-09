package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class d1 extends s2 {

    /* renamed from: e, reason: collision with root package name */
    private com.applovin.impl.sdk.k f3865e;

    /* renamed from: f, reason: collision with root package name */
    private List f3866f;
    private final AtomicBoolean g;

    /* renamed from: h, reason: collision with root package name */
    private List f3867h;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public enum a {
        RECENT_ADS,
        COUNT
    }

    public d1(Context context) {
        super(context);
        this.g = new AtomicBoolean();
        this.f3867h = new ArrayList();
    }

    public void a(List list, com.applovin.impl.sdk.k kVar) {
        Activity activityU0;
        this.f3865e = kVar;
        this.f3866f = list;
        if (!(this.f5283a instanceof Activity) && (activityU0 = kVar.u0()) != null) {
            this.f5283a = activityU0;
        }
        if (list != null && this.g.compareAndSet(false, true)) {
            this.f3867h = a(this.f3866f);
        }
        AppLovinSdkUtils.runOnUiThread(new v9(7, this));
    }

    @Override // com.applovin.impl.s2
    public int b() {
        return a.COUNT.ordinal();
    }

    @Override // com.applovin.impl.s2
    public List c(int i4) {
        return this.f3867h;
    }

    public List d() {
        return this.f3866f;
    }

    public com.applovin.impl.sdk.k e() {
        return this.f3865e;
    }

    public boolean f() {
        return this.f3867h.size() == 0;
    }

    public void g() {
        this.g.compareAndSet(true, false);
    }

    public String toString() {
        return "CreativeDebuggerListAdapter{isInitialized=" + this.g.get() + "}";
    }

    @Override // com.applovin.impl.s2
    public int d(int i4) {
        return this.f3867h.size();
    }

    @Override // com.applovin.impl.s2
    public r2 e(int i4) {
        return new v4("RECENT ADS");
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new p1((q1) it.next(), this.f5283a));
        }
        return arrayList;
    }
}
