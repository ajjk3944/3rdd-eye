package io.appmetrica.analytics.impl;

import c9.C2092m;
import c9.C2095p;
import io.appmetrica.analytics.coreapi.internal.clientcomponents.ClientComponentsInitializer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class U7 implements ClientComponentsInitializer {

    /* renamed from: a, reason: collision with root package name */
    public final List f40229a = C2092m.W("io.appmetrica.analytics.adrevenue.admob.v23.internal.AdMobClientModuleEntryPoint", "io.appmetrica.analytics.adrevenue.applovin.v12.internal.AppLovinClientModuleEntryPoint", "io.appmetrica.analytics.adrevenue.fyber.v3.internal.FyberClientModuleEntryPoint", "io.appmetrica.analytics.adrevenue.ironsource.v7.internal.IronSourceClientModuleEntryPoint", "io.appmetrica.analytics.apphud.internal.ApphudClientModuleEntryPoint", "io.appmetrica.analytics.screenshot.internal.ScreenshotClientModuleEntryPoint", "io.appmetrica.analytics.reporterextension.internal.ReporterExtensionClientModuleEntryPoint");

    @Override // io.appmetrica.analytics.coreapi.internal.clientcomponents.ClientComponentsInitializer
    public final void onCreate() {
        if (C5065x4.l().f42012a.c()) {
            C4767ld c4767ld = C5065x4.l().f42023m;
            List list = this.f40229a;
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
        }
    }
}
