package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.i60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class T0 implements h32 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24261b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f24262c;

    public /* synthetic */ T0(Object obj, int i) {
        this.f24261b = i;
        this.f24262c = obj;
    }

    @Override // com.yandex.mobile.ads.impl.h32
    public final Object get() {
        switch (this.f24261b) {
            case 0:
                return i60.b.c((Context) this.f24262c);
            case 1:
                return i60.b.b((Context) this.f24262c);
            default:
                return ((o60) this.f24262c).e();
        }
    }
}
