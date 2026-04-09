package com.yandex.mobile.ads.impl;

import android.hardware.camera2.TotalCaptureResult;
import com.yandex.mobile.ads.impl.nr0;
import v.C5670z;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class U5 implements nr0.a, I.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24280b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f24281c;

    public /* synthetic */ U5(Object obj, int i) {
        this.f24281c = obj;
        this.f24280b = i;
    }

    @Override // I.a
    public A4.a apply(Object obj) {
        TotalCaptureResult totalCaptureResult = (TotalCaptureResult) obj;
        C5670z.d dVar = (C5670z.d) this.f24281c;
        dVar.getClass();
        if (C5670z.c(totalCaptureResult, this.f24280b)) {
            dVar.f46978g = C5670z.d.f46971k;
        }
        return dVar.i.a(totalCaptureResult);
    }

    @Override // com.yandex.mobile.ads.impl.nr0.a
    public void invoke(Object obj) {
        int i = this.f24280b;
        ((ed) obj).getClass();
    }
}
