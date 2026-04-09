package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.if2;
import com.yandex.mobile.ads.impl.oh;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class Y0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24321b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f24322c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f24323d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f24324e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f24325f;

    public /* synthetic */ Y0(Object obj, String str, long j4, long j10, int i) {
        this.f24321b = i;
        this.f24325f = obj;
        this.f24322c = str;
        this.f24323d = j4;
        this.f24324e = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f24321b) {
            case 0:
                ((if2.a) this.f24325f).b(this.f24322c, this.f24323d, this.f24324e);
                break;
            default:
                ((oh.a) this.f24325f).b(this.f24322c, this.f24323d, this.f24324e);
                break;
        }
    }
}
