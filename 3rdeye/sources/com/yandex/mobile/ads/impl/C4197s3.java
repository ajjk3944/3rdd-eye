package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.impl.nn0;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.mobile.ads.impl.s3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4197s3 {

    /* renamed from: d, reason: collision with root package name */
    private static final long f32854d = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: a, reason: collision with root package name */
    private final C4163n3 f32855a;

    /* renamed from: b, reason: collision with root package name */
    private final nn0 f32856b;

    /* renamed from: c, reason: collision with root package name */
    private final Handler f32857c;

    public C4197s3(C4163n3 adGroupController) {
        kotlin.jvm.internal.l.f(adGroupController, "adGroupController");
        this.f32855a = adGroupController;
        this.f32856b = nn0.a.a();
        this.f32857c = new Handler(Looper.getMainLooper());
    }

    public final void a() {
        qn0 qn0VarA;
        C4225w3 c4225w3E = this.f32855a.e();
        if (c4225w3E != null && (qn0VarA = c4225w3E.a()) != null) {
            qn0VarA.a();
        }
        this.f32857c.removeCallbacksAndMessages(null);
    }

    public final void c() {
        C4225w3 c4225w3E = this.f32855a.e();
        if (c4225w3E != null) {
            dd2 dd2VarB = c4225w3E.b();
            qn0 qn0VarA = c4225w3E.a();
            int iOrdinal = dd2VarB.a().ordinal();
            if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 6 || iOrdinal == 7) {
                qn0VarA.g();
            }
        }
        this.f32857c.removeCallbacksAndMessages(null);
    }

    public final void b() {
        C4225w3 c4225w3E;
        if (!this.f32856b.d() || (c4225w3E = this.f32855a.e()) == null) {
            return;
        }
        this.f32857c.postDelayed(new L4(17, this, c4225w3E), f32854d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4197s3 this$0, C4225w3 nextAd) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        kotlin.jvm.internal.l.f(nextAd, "$nextAd");
        if (kotlin.jvm.internal.l.b(this$0.f32855a.e(), nextAd)) {
            dd2 dd2VarB = nextAd.b();
            qn0 qn0VarA = nextAd.a();
            if (dd2VarB.a().ordinal() != 0) {
                return;
            }
            qn0VarA.d();
        }
    }
}
