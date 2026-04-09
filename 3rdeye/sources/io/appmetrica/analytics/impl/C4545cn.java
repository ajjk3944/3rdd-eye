package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.content.Intent;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;

/* renamed from: io.appmetrica.analytics.impl.cn, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4545cn {

    /* renamed from: a, reason: collision with root package name */
    public final C4986u0 f40665a;

    /* renamed from: b, reason: collision with root package name */
    public final Ao f40666b;

    /* renamed from: c, reason: collision with root package name */
    public final C4805n f40667c;

    /* renamed from: d, reason: collision with root package name */
    public final Uk f40668d;

    /* renamed from: e, reason: collision with root package name */
    public final X5 f40669e;

    /* renamed from: f, reason: collision with root package name */
    public final C5021va f40670f;

    public C4545cn(C4986u0 c4986u0, Ao ao, C4805n c4805n, Uk uk, X5 x52, C5021va c5021va) {
        this.f40665a = c4986u0;
        this.f40666b = ao;
        this.f40667c = c4805n;
        this.f40668d = uk;
        this.f40669e = x52;
        this.f40670f = c5021va;
    }

    public static Intent a(Activity activity) {
        return (Intent) SystemServiceUtils.accessSystemServiceSafely(activity, "getting intent", "activity", new Oo(0));
    }

    public static final Intent b(Activity activity) {
        return activity.getIntent();
    }

    public C4545cn(C4986u0 c4986u0, Ao ao) {
        this(c4986u0, ao, C5065x4.l().a(), C5065x4.l().o(), C5065x4.l().h(), C5065x4.l().k());
    }
}
