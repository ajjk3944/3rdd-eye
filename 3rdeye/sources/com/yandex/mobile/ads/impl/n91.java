package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.zr0;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class n91 {

    /* renamed from: a, reason: collision with root package name */
    private final mp1 f30805a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f30806b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f30807c;

    public static final class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private final a8<String> f30808b;

        /* renamed from: c, reason: collision with root package name */
        private final xq1 f30809c;

        /* renamed from: d, reason: collision with root package name */
        private final p91 f30810d;

        public a(Context context, mp1 reporter, a8<String> adResponse, xq1 responseConverterListener, p91 nativeResponseParser) {
            kotlin.jvm.internal.l.f(context, "context");
            kotlin.jvm.internal.l.f(reporter, "reporter");
            kotlin.jvm.internal.l.f(adResponse, "adResponse");
            kotlin.jvm.internal.l.f(responseConverterListener, "responseConverterListener");
            kotlin.jvm.internal.l.f(nativeResponseParser, "nativeResponseParser");
            this.f30808b = adResponse;
            this.f30809c = responseConverterListener;
            this.f30810d = nativeResponseParser;
        }

        @Override // java.lang.Runnable
        public final void run() {
            p61 p61VarA = this.f30810d.a(this.f30808b);
            if (p61VarA != null) {
                this.f30809c.a(p61VarA);
            } else {
                this.f30809c.a(i7.k());
            }
        }
    }

    public /* synthetic */ n91(Context context, mp1 mp1Var) {
        this(context, mp1Var, zr0.a.a().c());
    }

    public final void a(a8<String> adResponse, xq1 responseConverterListener) {
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(responseConverterListener, "responseConverterListener");
        Context appContext = this.f30807c;
        kotlin.jvm.internal.l.e(appContext, "appContext");
        mp1 mp1Var = this.f30805a;
        this.f30806b.execute(new a(appContext, mp1Var, adResponse, responseConverterListener, new p91(appContext, mp1Var)));
    }

    public n91(Context context, mp1 reporter, Executor executor) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(reporter, "reporter");
        kotlin.jvm.internal.l.f(executor, "executor");
        this.f30805a = reporter;
        this.f30806b = executor;
        this.f30807c = context.getApplicationContext();
    }
}
