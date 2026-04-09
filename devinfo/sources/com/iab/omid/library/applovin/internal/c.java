package com.iab.omid.library.applovin.internal;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: c, reason: collision with root package name */
    private static c f20931c = new c();

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.applovin.adsession.a> f20932a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.applovin.adsession.a> f20933b = new ArrayList<>();

    private c() {
    }

    public static c c() {
        return f20931c;
    }

    public Collection<com.iab.omid.library.applovin.adsession.a> a() {
        return DesugarCollections.unmodifiableCollection(this.f20933b);
    }

    public Collection<com.iab.omid.library.applovin.adsession.a> b() {
        return DesugarCollections.unmodifiableCollection(this.f20932a);
    }

    public boolean d() {
        return this.f20933b.size() > 0;
    }

    public void a(com.iab.omid.library.applovin.adsession.a aVar) {
        this.f20932a.add(aVar);
    }

    public void b(com.iab.omid.library.applovin.adsession.a aVar) {
        boolean zD = d();
        this.f20932a.remove(aVar);
        this.f20933b.remove(aVar);
        if (!zD || d()) {
            return;
        }
        i.c().e();
    }

    public void c(com.iab.omid.library.applovin.adsession.a aVar) {
        boolean zD = d();
        this.f20933b.add(aVar);
        if (zD) {
            return;
        }
        i.c().d();
    }
}
