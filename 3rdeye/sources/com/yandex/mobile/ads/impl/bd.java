package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ew1;
import com.yandex.mobile.ads.impl.ip1;
import java.util.Map;

/* loaded from: classes3.dex */
public final class bd {

    /* renamed from: a, reason: collision with root package name */
    private final Context f25225a;

    /* renamed from: b, reason: collision with root package name */
    private final ce f25226b;

    /* renamed from: c, reason: collision with root package name */
    private final lp1 f25227c;

    public /* synthetic */ bd(Context context) {
        this(context, cd.a(), new lp1());
    }

    public final void a(ip1.b reportType, Map<String, ? extends Object> reportData, String str, C4108f4 c4108f4) {
        kotlin.jvm.internal.l.f(reportType, "reportType");
        kotlin.jvm.internal.l.f(reportData, "reportData");
        ew1 ew1VarA = ew1.a.a();
        du1 du1VarA = ew1VarA.a(this.f25225a);
        if (ew1VarA.f()) {
            if (du1VarA == null || du1VarA.l()) {
                this.f25227c.getClass();
                ae aeVarA = lp1.a(reportType, reportData, str, c4108f4);
                if (aeVarA != null) {
                    this.f25226b.a(aeVarA);
                }
            }
        }
    }

    public bd(Context context, ce reporter, lp1 mapper) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(reporter, "reporter");
        kotlin.jvm.internal.l.f(mapper, "mapper");
        this.f25225a = context;
        this.f25226b = reporter;
        this.f25227c = mapper;
    }
}
