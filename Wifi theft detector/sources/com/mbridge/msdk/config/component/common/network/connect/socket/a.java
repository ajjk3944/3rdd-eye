package com.mbridge.msdk.config.component.common.network.connect.socket;

import android.text.TextUtils;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.config.component.nori.model.a f13234a;

    /* renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.result.a f13235b;

    /* renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.a f13236c;

    /* renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.retry.a f13237d;

    /* renamed from: e, reason: collision with root package name */
    private b f13238e;

    /* renamed from: f, reason: collision with root package name */
    private com.mbridge.msdk.config.component.nori.monitor.a f13239f;

    public a(com.mbridge.msdk.config.component.nori.model.a aVar, com.mbridge.msdk.config.component.common.network.result.a aVar2, com.mbridge.msdk.config.component.common.network.a aVar3) {
        this.f13234a = aVar;
        this.f13235b = aVar2;
        this.f13236c = aVar3;
        this.f13239f = aVar2.b();
    }

    public com.mbridge.msdk.config.component.common.network.result.a a(String str) {
        if (TextUtils.isEmpty(str)) {
            return a(1008, 1008, "URL cannot be empty");
        }
        b bVar = new b(this.f13234a, this.f13235b, this.f13236c);
        this.f13238e = bVar;
        bVar.c(str);
        this.f13238e.a(this.f13237d);
        c.a().a(this.f13238e, this.f13239f);
        return this.f13235b;
    }

    public void a() {
        b bVar = this.f13238e;
        if (bVar != null) {
            bVar.a();
        }
    }

    public void a(com.mbridge.msdk.config.component.common.network.retry.a aVar) {
        this.f13237d = aVar;
    }

    private com.mbridge.msdk.config.component.common.network.result.a a(int i10, int i11, String str) {
        this.f13235b.a(str);
        this.f13235b.c(i10);
        this.f13235b.a(i11);
        this.f13235b.b(2);
        return this.f13235b;
    }
}
