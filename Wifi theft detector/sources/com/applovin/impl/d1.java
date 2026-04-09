package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class d1 extends s2 {

    /* renamed from: e, reason: collision with root package name */
    private com.applovin.impl.sdk.k f5708e;

    /* renamed from: f, reason: collision with root package name */
    private List f5709f;

    /* renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f5710g;

    /* renamed from: h, reason: collision with root package name */
    private List f5711h;

    public enum a {
        RECENT_ADS,
        COUNT
    }

    public d1(Context context) {
        super(context);
        this.f5710g = new AtomicBoolean();
        this.f5711h = new ArrayList();
    }

    public void a(List list, com.applovin.impl.sdk.k kVar) {
        Activity activityU0;
        this.f5708e = kVar;
        this.f5709f = list;
        if (!(this.f7531a instanceof Activity) && (activityU0 = kVar.u0()) != null) {
            this.f7531a = activityU0;
        }
        if (list != null && this.f5710g.compareAndSet(false, true)) {
            this.f5711h = a(this.f5709f);
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.o9
            @Override // java.lang.Runnable
            public final void run() {
                this.f7189a.notifyDataSetChanged();
            }
        });
    }

    @Override // com.applovin.impl.s2
    public int b() {
        return a.COUNT.ordinal();
    }

    @Override // com.applovin.impl.s2
    public List c(int i10) {
        return this.f5711h;
    }

    public List d() {
        return this.f5709f;
    }

    public com.applovin.impl.sdk.k e() {
        return this.f5708e;
    }

    public boolean f() {
        return this.f5711h.size() == 0;
    }

    public void g() {
        this.f5710g.compareAndSet(true, false);
    }

    public String toString() {
        return "CreativeDebuggerListAdapter{isInitialized=" + this.f5710g.get() + "}";
    }

    @Override // com.applovin.impl.s2
    public int d(int i10) {
        return this.f5711h.size();
    }

    @Override // com.applovin.impl.s2
    public r2 e(int i10) {
        return new v4("RECENT ADS");
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new p1((q1) it.next(), this.f7531a));
        }
        return arrayList;
    }
}
