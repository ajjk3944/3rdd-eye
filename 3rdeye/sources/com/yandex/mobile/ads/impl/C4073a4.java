package com.yandex.mobile.ads.impl;

import android.content.Context;
import c9.C2097r;
import com.yandex.mobile.ads.impl.C4094d4;
import com.yandex.mobile.ads.impl.ew1;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;

/* renamed from: com.yandex.mobile.ads.impl.a4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4073a4 {

    /* renamed from: a, reason: collision with root package name */
    private final C4094d4 f24427a;

    /* renamed from: b, reason: collision with root package name */
    private final C4080b4 f24428b;

    public /* synthetic */ C4073a4() {
        this(C4094d4.a.a(), new C4080b4());
    }

    public final String a(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        return a(context, this.f24427a.c());
    }

    public final String b(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        return a(context, this.f24427a.d());
    }

    private final String a(Context context, List<String> list) {
        this.f24428b.getClass();
        kotlin.jvm.internal.l.f(context, "context");
        du1 du1VarA = ew1.a.a().a(context);
        int iE = (du1VarA == null || du1VarA.e() == 0) ? 5 : du1VarA.e();
        int size = list.size();
        if (iE > size) {
            iE = size;
        }
        return C2097r.u0(list.subList(list.size() - iE, list.size()), StringUtils.COMMA, null, null, null, 62);
    }

    public C4073a4(C4094d4 adIdStorage, C4080b4 adIdHeaderSizeProvider) {
        kotlin.jvm.internal.l.f(adIdStorage, "adIdStorage");
        kotlin.jvm.internal.l.f(adIdHeaderSizeProvider, "adIdHeaderSizeProvider");
        this.f24427a = adIdStorage;
        this.f24428b = adIdHeaderSizeProvider;
    }
}
