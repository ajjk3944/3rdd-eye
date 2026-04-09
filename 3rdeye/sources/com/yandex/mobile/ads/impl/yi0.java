package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.aj0;
import com.yandex.mobile.ads.impl.rq1;

/* loaded from: classes3.dex */
final class yi0 implements rq1.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f35801a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ aj0 f35802b;

    public yi0(aj0 aj0Var, String str) {
        this.f35802b = aj0Var;
        this.f35801a = str;
    }

    @Override // com.yandex.mobile.ads.impl.rq1.a
    public final void a(fi2 fi2Var) {
        aj0 aj0Var = this.f35802b;
        String str = this.f35801a;
        aj0.a aVar = (aj0.a) aj0Var.f24696c.remove(str);
        if (aVar != null) {
            aVar.f24702c = fi2Var;
            aj0Var.f24697d.put(str, aVar);
            if (aj0Var.f24699f == null) {
                zi0 zi0Var = new zi0(aj0Var);
                aj0Var.f24699f = zi0Var;
                aj0Var.f24698e.postDelayed(zi0Var, 100);
            }
        }
    }
}
