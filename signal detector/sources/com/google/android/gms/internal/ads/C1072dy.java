package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.dy, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1072dy {

    /* renamed from: a, reason: collision with root package name */
    public final K4.e f13828a;

    /* renamed from: b, reason: collision with root package name */
    public final C1431kf f13829b;

    /* renamed from: c, reason: collision with root package name */
    public Context f13830c;

    /* renamed from: d, reason: collision with root package name */
    public View f13831d;

    /* renamed from: e, reason: collision with root package name */
    public Activity f13832e;

    /* renamed from: f, reason: collision with root package name */
    public String f13833f;

    /* renamed from: g, reason: collision with root package name */
    public HashMap f13834g;

    /* renamed from: h, reason: collision with root package name */
    public S5 f13835h;
    public EnumC1450ky i;

    public /* synthetic */ C1072dy(K4.e eVar, C1431kf c1431kf) {
        this.f13828a = eVar;
        this.f13829b = c1431kf;
    }

    public final C1014cu a() {
        Cr.A(this.f13830c, Context.class);
        Cr.A(this.f13834g, Map.class);
        Cr.A(this.f13835h, S5.class);
        Cr.A(this.i, EnumC1450ky.class);
        return new C1014cu(this.f13828a, this.f13829b, this.f13830c, this.f13831d, this.f13832e, this.f13833f, this.f13834g, this.f13835h, this.i);
    }
}
