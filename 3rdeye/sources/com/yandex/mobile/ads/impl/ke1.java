package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.List;

/* loaded from: classes3.dex */
public final class ke1 {

    /* renamed from: a, reason: collision with root package name */
    private final be1 f29639a;

    /* renamed from: b, reason: collision with root package name */
    private final ce1 f29640b;

    /* renamed from: c, reason: collision with root package name */
    private final le1 f29641c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f29642d;

    public ke1(Context context, la2 verificationNotExecutedListener, be1 omSdkAdSessionProvider, ce1 omSdkInitializer, le1 omSdkUsageValidator) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(verificationNotExecutedListener, "verificationNotExecutedListener");
        kotlin.jvm.internal.l.f(omSdkAdSessionProvider, "omSdkAdSessionProvider");
        kotlin.jvm.internal.l.f(omSdkInitializer, "omSdkInitializer");
        kotlin.jvm.internal.l.f(omSdkUsageValidator, "omSdkUsageValidator");
        this.f29639a = omSdkAdSessionProvider;
        this.f29640b = omSdkInitializer;
        this.f29641c = omSdkUsageValidator;
        this.f29642d = context.getApplicationContext();
    }

    public final je1 a(List<ja2> verifications) throws IllegalStateException {
        kotlin.jvm.internal.l.f(verifications, "verifications");
        le1 le1Var = this.f29641c;
        Context context = this.f29642d;
        kotlin.jvm.internal.l.e(context, "context");
        if (!le1Var.a(context)) {
            return null;
        }
        ce1 ce1Var = this.f29640b;
        Context context2 = this.f29642d;
        kotlin.jvm.internal.l.e(context2, "context");
        ce1Var.a(context2);
        in2 in2VarA = this.f29639a.a(verifications);
        if (in2VarA == null) {
            return null;
        }
        rv0 rv0VarA = rv0.a(in2VarA);
        kotlin.jvm.internal.l.e(rv0VarA, "createMediaEvents(...)");
        C4079b3 c4079b3A = C4079b3.a(in2VarA);
        kotlin.jvm.internal.l.e(c4079b3A, "createAdEvents(...)");
        return new je1(in2VarA, rv0VarA, c4079b3A);
    }
}
