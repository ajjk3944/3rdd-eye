package com.iab.omid.library.applovin.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.applovin.internal.d;
import com.iab.omid.library.applovin.walking.TreeWalker;
import java.util.Iterator;

/* loaded from: classes3.dex */
public class i implements d.a, com.iab.omid.library.applovin.devicevolume.c {

    /* renamed from: f, reason: collision with root package name */
    private static i f12243f;

    /* renamed from: a, reason: collision with root package name */
    private float f12244a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.applovin.devicevolume.e f12245b;

    /* renamed from: c, reason: collision with root package name */
    private final com.iab.omid.library.applovin.devicevolume.b f12246c;

    /* renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.applovin.devicevolume.d f12247d;

    /* renamed from: e, reason: collision with root package name */
    private c f12248e;

    public i(com.iab.omid.library.applovin.devicevolume.e eVar, com.iab.omid.library.applovin.devicevolume.b bVar) {
        this.f12245b = eVar;
        this.f12246c = bVar;
    }

    private c a() {
        if (this.f12248e == null) {
            this.f12248e = c.c();
        }
        return this.f12248e;
    }

    public static i c() {
        if (f12243f == null) {
            f12243f = new i(new com.iab.omid.library.applovin.devicevolume.e(), new com.iab.omid.library.applovin.devicevolume.b());
        }
        return f12243f;
    }

    public float b() {
        return this.f12244a;
    }

    public void d() {
        b.g().a(this);
        b.g().e();
        TreeWalker.getInstance().h();
        this.f12247d.c();
    }

    public void e() {
        TreeWalker.getInstance().j();
        b.g().f();
        this.f12247d.d();
    }

    @Override // com.iab.omid.library.applovin.devicevolume.c
    public void a(float f10) {
        this.f12244a = f10;
        Iterator<com.iab.omid.library.applovin.adsession.a> it = a().a().iterator();
        while (it.hasNext()) {
            it.next().d().a(f10);
        }
    }

    public void a(Context context) {
        this.f12247d = this.f12245b.a(new Handler(), context, this.f12246c.a(), this);
    }

    @Override // com.iab.omid.library.applovin.internal.d.a
    public void a(boolean z10) {
        if (z10) {
            TreeWalker.getInstance().h();
        } else {
            TreeWalker.getInstance().g();
        }
    }
}
