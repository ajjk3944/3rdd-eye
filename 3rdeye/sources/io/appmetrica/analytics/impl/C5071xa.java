package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentsInitializer;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.xa, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5071xa {

    /* renamed from: d, reason: collision with root package name */
    public static final C5071xa f42063d = new C5071xa();

    /* renamed from: a, reason: collision with root package name */
    public final Gd f42064a = new Gd();

    /* renamed from: b, reason: collision with root package name */
    public final ServiceComponentsInitializer f42065b = AbstractC4645gk.a();

    /* renamed from: c, reason: collision with root package name */
    public boolean f42066c = false;

    public final void a(Context context) {
        Ga.a(context);
        this.f42065b.onCreate(context);
        this.f42064a.getClass();
        Iterator it = Ga.f39501F.f39524s.a().iterator();
        while (it.hasNext()) {
            Object objLoadAndInstantiateClassWithDefaultConstructor = ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor((String) it.next(), ModuleServiceEntryPoint.class);
            if (objLoadAndInstantiateClassWithDefaultConstructor != null) {
                Ga.f39501F.o().a((ModuleServiceEntryPoint<Object>) objLoadAndInstantiateClassWithDefaultConstructor);
            }
        }
        new C4929rk(Ga.j().B().b()).a(context);
        Ga.f39501F.p().a();
    }

    public final void b(Context context) {
        if (this.f42066c) {
            return;
        }
        synchronized (this) {
            try {
                if (!this.f42066c) {
                    a(context);
                    this.f42066c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
