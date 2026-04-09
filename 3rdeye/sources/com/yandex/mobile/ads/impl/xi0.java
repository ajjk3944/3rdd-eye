package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import com.yandex.mobile.ads.impl.aj0;
import com.yandex.mobile.ads.impl.rq1;

/* loaded from: classes3.dex */
final class xi0 implements rq1.b<Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f35321a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ aj0 f35322b;

    public xi0(aj0 aj0Var, String str) {
        this.f35322b = aj0Var;
        this.f35321a = str;
    }

    @Override // com.yandex.mobile.ads.impl.rq1.b
    public final void a(Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        aj0 aj0Var = this.f35322b;
        String str = this.f35321a;
        aj0Var.f24695b.a(str, bitmap2);
        aj0.a aVar = (aj0.a) aj0Var.f24696c.remove(str);
        if (aVar != null) {
            aVar.f24701b = bitmap2;
            aj0Var.f24697d.put(str, aVar);
            if (aj0Var.f24699f == null) {
                zi0 zi0Var = new zi0(aj0Var);
                aj0Var.f24699f = zi0Var;
                aj0Var.f24698e.postDelayed(zi0Var, 100);
            }
        }
    }
}
