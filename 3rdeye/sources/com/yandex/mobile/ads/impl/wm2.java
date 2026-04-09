package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ew1;

/* loaded from: classes3.dex */
public final class wm2 implements g92 {

    /* renamed from: a, reason: collision with root package name */
    public static final wm2 f35021a = new wm2();

    /* renamed from: b, reason: collision with root package name */
    private static final Object f35022b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static volatile vm2 f35023c;

    private wm2() {
    }

    @Override // com.yandex.mobile.ads.impl.g92
    public final e92 a(Context context) {
        vm2 vm2Var;
        kotlin.jvm.internal.l.f(context, "context");
        vm2 vm2Var2 = f35023c;
        if (vm2Var2 != null) {
            return vm2Var2;
        }
        synchronized (f35022b) {
            try {
                vm2Var = f35023c;
                if (vm2Var == null) {
                    String str = ba.a(context) ? "322a737a-a0ca-44e0-bc85-649b1c7c1db6" : "478cb909-6ad1-4e12-84cc-b3629a789f93";
                    ne neVar = new ne(context);
                    neVar.a(str);
                    vm2Var = new vm2(neVar, context, ew1.a.a().a(context));
                    f35023c = vm2Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return vm2Var;
    }
}
