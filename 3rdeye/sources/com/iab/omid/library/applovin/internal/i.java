package com.iab.omid.library.applovin.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.applovin.internal.d;
import com.iab.omid.library.applovin.walking.TreeWalker;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class i implements d.a, com.iab.omid.library.applovin.devicevolume.c {

    /* renamed from: f, reason: collision with root package name */
    private static i f23569f;

    /* renamed from: a, reason: collision with root package name */
    private float f23570a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.applovin.devicevolume.e f23571b;

    /* renamed from: c, reason: collision with root package name */
    private final com.iab.omid.library.applovin.devicevolume.b f23572c;

    /* renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.applovin.devicevolume.d f23573d;

    /* renamed from: e, reason: collision with root package name */
    private c f23574e;

    public i(com.iab.omid.library.applovin.devicevolume.e eVar, com.iab.omid.library.applovin.devicevolume.b bVar) {
        this.f23571b = eVar;
        this.f23572c = bVar;
    }

    private c a() {
        if (this.f23574e == null) {
            this.f23574e = c.c();
        }
        return this.f23574e;
    }

    public static i c() {
        if (f23569f == null) {
            f23569f = new i(new com.iab.omid.library.applovin.devicevolume.e(), new com.iab.omid.library.applovin.devicevolume.b());
        }
        return f23569f;
    }

    public float b() {
        return this.f23570a;
    }

    public void d() {
        b.g().a(this);
        b.g().e();
        TreeWalker.getInstance().h();
        this.f23573d.c();
    }

    public void e() {
        TreeWalker.getInstance().j();
        b.g().f();
        this.f23573d.d();
    }

    @Override // com.iab.omid.library.applovin.devicevolume.c
    public void a(float f10) {
        this.f23570a = f10;
        Iterator<com.iab.omid.library.applovin.adsession.a> it = a().a().iterator();
        while (it.hasNext()) {
            it.next().d().a(f10);
        }
    }

    public void a(Context context) {
        this.f23573d = this.f23571b.a(new Handler(), context, this.f23572c.a(), this);
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
