package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class qs0 {

    /* renamed from: a, reason: collision with root package name */
    private final os0 f32330a;

    /* renamed from: b, reason: collision with root package name */
    private final ng1 f32331b;

    /* renamed from: c, reason: collision with root package name */
    private ps0 f32332c;

    public /* synthetic */ qs0(Context context, String str) {
        this(context, str, new os0(context, str), new ng1(context), null);
    }

    private final ps0 a() {
        be0 be0VarA = this.f32330a.a();
        if (be0VarA == null) {
            return null;
        }
        boolean zA = this.f32331b.a();
        boolean zB = this.f32331b.b();
        if (zA || zB) {
            return be0VarA.a();
        }
        return null;
    }

    public final ps0 b() {
        ps0 ps0Var = this.f32332c;
        return ps0Var != null ? ps0Var : a();
    }

    public final void c() {
        this.f32332c = a();
        this.f32332c = a();
    }

    public qs0(Context context, String locationServicesClassName, os0 locationServices, ng1 permissionExtractor, ps0 ps0Var) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(locationServicesClassName, "locationServicesClassName");
        kotlin.jvm.internal.l.f(locationServices, "locationServices");
        kotlin.jvm.internal.l.f(permissionExtractor, "permissionExtractor");
        this.f32330a = locationServices;
        this.f32331b = permissionExtractor;
        this.f32332c = ps0Var;
    }
}
