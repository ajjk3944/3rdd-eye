package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.a92;
import com.yandex.mobile.ads.impl.ew1;

/* loaded from: classes3.dex */
public final class d71 implements ea {

    /* renamed from: a, reason: collision with root package name */
    private final Context f26013a;

    /* renamed from: b, reason: collision with root package name */
    private final q71 f26014b;

    /* renamed from: c, reason: collision with root package name */
    private final n71 f26015c;

    /* renamed from: d, reason: collision with root package name */
    private final ew1 f26016d;

    public /* synthetic */ d71(Context context, q71 q71Var, n71 n71Var) {
        this(context, q71Var, n71Var, ew1.a.a());
    }

    @Override // com.yandex.mobile.ads.impl.ea
    public final boolean a() {
        this.f26015c.getClass();
        du1 du1VarA = this.f26016d.a(this.f26013a);
        return du1VarA == null || !du1VarA.A0() || this.f26014b.a(false, false).b() == a92.a.f24561c;
    }

    public d71(Context context, q71 nativeAssetsValidator, n71 nativeAdsConfiguration, ew1 sdkSettings) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(nativeAssetsValidator, "nativeAssetsValidator");
        kotlin.jvm.internal.l.f(nativeAdsConfiguration, "nativeAdsConfiguration");
        kotlin.jvm.internal.l.f(sdkSettings, "sdkSettings");
        this.f26013a = context;
        this.f26014b = nativeAssetsValidator;
        this.f26015c = nativeAdsConfiguration;
        this.f26016d = sdkSettings;
    }
}
