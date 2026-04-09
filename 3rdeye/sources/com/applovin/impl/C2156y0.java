package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.applovin.impl.y0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2156y0 extends k2 {

    /* renamed from: e, reason: collision with root package name */
    private com.applovin.impl.sdk.k f21746e;

    /* renamed from: f, reason: collision with root package name */
    private List f21747f;

    /* renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f21748g;

    /* renamed from: h, reason: collision with root package name */
    private List f21749h;

    /* renamed from: com.applovin.impl.y0$a */
    public enum a {
        RECENT_ADS,
        COUNT
    }

    public C2156y0(Context context) {
        super(context);
        this.f21748g = new AtomicBoolean();
        this.f21749h = new ArrayList();
    }

    public void a(List list, com.applovin.impl.sdk.k kVar) {
        Activity activityU0;
        this.f21746e = kVar;
        this.f21747f = list;
        if (!(this.f19645a instanceof Activity) && (activityU0 = kVar.u0()) != null) {
            this.f19645a = activityU0;
        }
        if (list != null && this.f21748g.compareAndSet(false, true)) {
            this.f21749h = a(this.f21747f);
        }
        AppLovinSdkUtils.runOnUiThread(new L0(this, 7));
    }

    @Override // com.applovin.impl.k2
    public int b() {
        return a.COUNT.ordinal();
    }

    @Override // com.applovin.impl.k2
    public List c(int i) {
        return this.f21749h;
    }

    public List d() {
        return this.f21747f;
    }

    public com.applovin.impl.sdk.k e() {
        return this.f21746e;
    }

    public boolean f() {
        return this.f21749h.size() == 0;
    }

    public void g() {
        this.f21748g.compareAndSet(true, false);
    }

    public String toString() {
        return "CreativeDebuggerListAdapter{isInitialized=" + this.f21748g.get() + "}";
    }

    @Override // com.applovin.impl.k2
    public int d(int i) {
        return this.f21749h.size();
    }

    @Override // com.applovin.impl.k2
    public j2 e(int i) {
        return new j4("RECENT ADS");
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new k1((l1) it.next(), this.f19645a));
        }
        return arrayList;
    }
}
