package com.iab.omid.library.applovin.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: c, reason: collision with root package name */
    private static c f12225c = new c();

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.applovin.adsession.a> f12226a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.applovin.adsession.a> f12227b = new ArrayList<>();

    private c() {
    }

    public static c c() {
        return f12225c;
    }

    public Collection<com.iab.omid.library.applovin.adsession.a> a() {
        return Collections.unmodifiableCollection(this.f12227b);
    }

    public Collection<com.iab.omid.library.applovin.adsession.a> b() {
        return Collections.unmodifiableCollection(this.f12226a);
    }

    public boolean d() {
        return this.f12227b.size() > 0;
    }

    public void a(com.iab.omid.library.applovin.adsession.a aVar) {
        this.f12226a.add(aVar);
    }

    public void b(com.iab.omid.library.applovin.adsession.a aVar) {
        boolean zD = d();
        this.f12226a.remove(aVar);
        this.f12227b.remove(aVar);
        if (!zD || d()) {
            return;
        }
        i.c().e();
    }

    public void c(com.iab.omid.library.applovin.adsession.a aVar) {
        boolean zD = d();
        this.f12227b.add(aVar);
        if (zD) {
            return;
        }
        i.c().d();
    }
}
