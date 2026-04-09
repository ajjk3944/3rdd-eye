package io.appmetrica.analytics.impl;

import android.content.Context;
import c9.C2092m;
import c9.C2095p;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentsInitializer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class X7 implements ServiceComponentsInitializer {

    /* renamed from: a, reason: collision with root package name */
    public final List f40378a = C2092m.W("io.appmetrica.analytics.remotepermissions.internal.RemotePermissionsModuleEntryPoint", "io.appmetrica.analytics.apphud.internal.ApphudServiceModuleEntryPoint", "io.appmetrica.analytics.screenshot.internal.ScreenshotServiceModuleEntryPoint");

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentsInitializer
    public final void onCreate(Context context) {
        C4767ld c4767ld = Ga.f39501F.f39524s;
        List list = this.f40378a;
        ArrayList arrayList = new ArrayList(C2092m.T(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new J5((String) it.next()));
        }
        Object[] array = arrayList.toArray(new J5[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        J5[] j5Arr = (J5[]) array;
        InterfaceC4741kd[] interfaceC4741kdArr = (InterfaceC4741kd[]) Arrays.copyOf(j5Arr, j5Arr.length);
        synchronized (c4767ld) {
            C2095p.c0(c4767ld.f41187a, interfaceC4741kdArr);
        }
        Ga.f39501F.f39524s.a(new C4640gf(context, "io.appmetrica.analytics.modules.ads", "lsm"));
    }
}
