package com.iab.omid.library.bytedance2.internal;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: c, reason: collision with root package name */
    private static c f21057c = new c();

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.bytedance2.adsession.a> f21058a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList<com.iab.omid.library.bytedance2.adsession.a> f21059b = new ArrayList<>();

    private c() {
    }

    public static c c() {
        return f21057c;
    }

    public Collection<com.iab.omid.library.bytedance2.adsession.a> a() {
        return DesugarCollections.unmodifiableCollection(this.f21059b);
    }

    public Collection<com.iab.omid.library.bytedance2.adsession.a> b() {
        return DesugarCollections.unmodifiableCollection(this.f21058a);
    }

    public boolean d() {
        return this.f21059b.size() > 0;
    }

    public void a(com.iab.omid.library.bytedance2.adsession.a aVar) {
        this.f21058a.add(aVar);
    }

    public void b(com.iab.omid.library.bytedance2.adsession.a aVar) {
        boolean zD = d();
        this.f21058a.remove(aVar);
        this.f21059b.remove(aVar);
        if (!zD || d()) {
            return;
        }
        i.c().e();
    }

    public void c(com.iab.omid.library.bytedance2.adsession.a aVar) {
        boolean zD = d();
        this.f21059b.add(aVar);
        if (zD) {
            return;
        }
        i.c().d();
    }
}
