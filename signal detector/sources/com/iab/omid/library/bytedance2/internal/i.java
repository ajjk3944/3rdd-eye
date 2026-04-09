package com.iab.omid.library.bytedance2.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.bytedance2.internal.d;
import com.iab.omid.library.bytedance2.walking.TreeWalker;
import java.util.Iterator;

/* loaded from: classes.dex */
public class i implements com.iab.omid.library.bytedance2.devicevolume.c, d.a {

    /* renamed from: f, reason: collision with root package name */
    private static i f18677f;

    /* renamed from: a, reason: collision with root package name */
    private float f18678a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.bytedance2.devicevolume.e f18679b;

    /* renamed from: c, reason: collision with root package name */
    private final com.iab.omid.library.bytedance2.devicevolume.b f18680c;

    /* renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.bytedance2.devicevolume.d f18681d;

    /* renamed from: e, reason: collision with root package name */
    private c f18682e;

    public i(com.iab.omid.library.bytedance2.devicevolume.e eVar, com.iab.omid.library.bytedance2.devicevolume.b bVar) {
        this.f18679b = eVar;
        this.f18680c = bVar;
    }

    private c a() {
        if (this.f18682e == null) {
            this.f18682e = c.c();
        }
        return this.f18682e;
    }

    public static i c() {
        if (f18677f == null) {
            f18677f = new i(new com.iab.omid.library.bytedance2.devicevolume.e(), new com.iab.omid.library.bytedance2.devicevolume.b());
        }
        return f18677f;
    }

    public float b() {
        return this.f18678a;
    }

    public void d() {
        b.g().a(this);
        b.g().e();
        TreeWalker.getInstance().h();
        this.f18681d.c();
    }

    public void e() {
        TreeWalker.getInstance().j();
        b.g().f();
        this.f18681d.d();
    }

    @Override // com.iab.omid.library.bytedance2.devicevolume.c
    public void a(float f2) {
        this.f18678a = f2;
        Iterator<com.iab.omid.library.bytedance2.adsession.a> it = a().a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(f2);
        }
    }

    public void a(Context context) {
        this.f18681d = this.f18679b.a(new Handler(), context, this.f18680c.a(), this);
    }

    @Override // com.iab.omid.library.bytedance2.internal.d.a
    public void a(boolean z6) {
        if (z6) {
            TreeWalker.getInstance().h();
        } else {
            TreeWalker.getInstance().g();
        }
    }
}
