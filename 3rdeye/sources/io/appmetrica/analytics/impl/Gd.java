package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class Gd {
    public static void a() {
        Iterator it = C5065x4.l().f42023m.a().iterator();
        while (it.hasNext()) {
            Object objLoadAndInstantiateClassWithDefaultConstructor = ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor((String) it.next(), ModuleClientEntryPoint.class);
            if (objLoadAndInstantiateClassWithDefaultConstructor != null) {
                C5065x4.l().m().f41704b.add((ModuleClientEntryPoint) objLoadAndInstantiateClassWithDefaultConstructor);
            }
        }
    }
}
