package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ew1;
import com.yandex.mobile.ads.impl.xz0;
import java.io.File;

/* loaded from: classes3.dex */
public final class x60 {

    /* renamed from: a, reason: collision with root package name */
    private final m10 f35205a;

    /* renamed from: b, reason: collision with root package name */
    private final cy1 f35206b;

    public /* synthetic */ x60() {
        this(new m10(), new cy1());
    }

    public final by1 a(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        this.f35205a.getClass();
        File cacheDir = m10.a(context, "mobileads-video-cache");
        du1 du1VarA = ew1.a.a().a(context);
        br0 br0Var = new br0(xz0.a.a(context, 41943040L, (du1VarA == null || du1VarA.E() == 0) ? 52428800L : du1VarA.E()));
        f60 f60Var = new f60(context);
        this.f35206b.getClass();
        kotlin.jvm.internal.l.f(cacheDir, "cacheDir");
        return new by1(cacheDir, br0Var, f60Var);
    }

    public x60(m10 diskCacheProvider, cy1 simpleCacheFactory) {
        kotlin.jvm.internal.l.f(diskCacheProvider, "diskCacheProvider");
        kotlin.jvm.internal.l.f(simpleCacheFactory, "simpleCacheFactory");
        this.f35205a = diskCacheProvider;
        this.f35206b = simpleCacheFactory;
    }
}
