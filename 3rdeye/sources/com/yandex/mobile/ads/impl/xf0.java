package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public abstract class xf0 extends sj<String> implements InterfaceC4086c3 {

    /* renamed from: d, reason: collision with root package name */
    private final f8 f35288d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public xf0(Context context, a8<String> adResponse) {
        this(context, adResponse, new f8());
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
    }

    @Override // com.yandex.mobile.ads.impl.sj
    public synchronized void b() {
        this.f35288d.a(null);
    }

    public final f8 i() {
        return this.f35288d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xf0(Context context, a8<String> adResponse, f8 adResultReceiver) {
        super(context, adResponse);
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(adResultReceiver, "adResultReceiver");
        this.f35288d = adResultReceiver;
        adResultReceiver.a(this);
    }
}
