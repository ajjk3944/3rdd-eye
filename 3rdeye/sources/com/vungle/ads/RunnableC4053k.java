package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk$SDKError;
import com.yandex.mobile.ads.impl.bq1;
import com.yandex.mobile.ads.impl.h7;
import com.yandex.mobile.ads.impl.m61;
import com.yandex.mobile.ads.impl.r91;
import com.yandex.mobile.ads.impl.u91;
import com.yandex.mobile.ads.impl.z51;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.vungle.ads.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC4053k implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f23827b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f23828c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f23829d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f23830e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f23831f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f23832g;

    public /* synthetic */ RunnableC4053k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f23827b = i;
        this.f23828c = obj;
        this.f23829d = obj2;
        this.f23830e = obj3;
        this.f23831f = obj4;
        this.f23832g = obj5;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.f23827b) {
            case 0:
                C4055m.m120logError$lambda2((Sdk$SDKError.b) this.f23828c, (String) this.f23829d, (String) this.f23830e, (String) this.f23831f, (String) this.f23832g);
                break;
            default:
                z51.a((h7) this.f23828c, (r91) this.f23829d, (u91) this.f23830e, (bq1) ((m61) this.f23831f), (z51) this.f23832g);
                break;
        }
    }
}
