package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.monetization.ads.nativeads.CustomizableMediaView;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes3.dex */
public final class dx0 {

    /* renamed from: a, reason: collision with root package name */
    private final C4072a3 f26516a;

    /* renamed from: b, reason: collision with root package name */
    private final dh2 f26517b;

    /* renamed from: c, reason: collision with root package name */
    private final ch2 f26518c;

    /* renamed from: d, reason: collision with root package name */
    private final Executor f26519d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public dx0(Context context, C4072a3 adConfiguration) {
        this(adConfiguration, new dh2(context), new ch2(context, adConfiguration));
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
    }

    public final void a(CustomizableMediaView mediaView, String mediaType) {
        kotlin.jvm.internal.l.f(mediaView, "mediaView");
        kotlin.jvm.internal.l.f(mediaType, "mediaType");
        String strC = this.f26516a.c();
        if (strC != null) {
            int iO = this.f26516a.o();
            ah2 ah2VarA = eh2.a(mediaView, mediaType);
            this.f26519d.execute(new J4.f(this, new fh2(iO, strC), ah2VarA, 8));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ dx0(C4072a3 c4072a3, dh2 dh2Var, ch2 ch2Var) {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        kotlin.jvm.internal.l.e(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor(...)");
        this(c4072a3, dh2Var, ch2Var, executorServiceNewSingleThreadExecutor);
    }

    public dx0(C4072a3 adConfiguration, dh2 viewSizeInfoStorage, ch2 viewSizeInfoReporter, Executor executor) {
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(viewSizeInfoStorage, "viewSizeInfoStorage");
        kotlin.jvm.internal.l.f(viewSizeInfoReporter, "viewSizeInfoReporter");
        kotlin.jvm.internal.l.f(executor, "executor");
        this.f26516a = adConfiguration;
        this.f26517b = viewSizeInfoStorage;
        this.f26518c = viewSizeInfoReporter;
        this.f26519d = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(dx0 this$0, fh2 viewSizeKey, ah2 viewSizeInfo) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        kotlin.jvm.internal.l.f(viewSizeKey, "$viewSizeKey");
        kotlin.jvm.internal.l.f(viewSizeInfo, "$viewSizeInfo");
        this$0.f26517b.a(viewSizeKey, viewSizeInfo);
        this$0.f26518c.a(viewSizeInfo, this$0.f26516a);
    }
}
