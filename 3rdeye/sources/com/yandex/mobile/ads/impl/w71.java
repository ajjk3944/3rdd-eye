package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class w71 implements k41 {

    /* renamed from: a, reason: collision with root package name */
    private final k51 f34837a;

    public /* synthetic */ w71(vu1 vu1Var) {
        this(vu1Var, new k51(vu1Var));
    }

    @Override // com.yandex.mobile.ads.impl.k41
    public final void a(Context context, j41 nativeAdBlock, ej0 imageProvider, i41 nativeAdBinderFactory, j51 j51Var, v41 v41Var, x41 nativeAdCreationListener) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(nativeAdBlock, "nativeAdBlock");
        kotlin.jvm.internal.l.f(imageProvider, "imageProvider");
        kotlin.jvm.internal.l.f(nativeAdBinderFactory, "nativeAdBinderFactory");
        j51 nativeAdFactoriesProvider = j51Var;
        kotlin.jvm.internal.l.f(nativeAdFactoriesProvider, "nativeAdFactoriesProvider");
        v41 nativeAdControllers = v41Var;
        kotlin.jvm.internal.l.f(nativeAdControllers, "nativeAdControllers");
        kotlin.jvm.internal.l.f(nativeAdCreationListener, "nativeAdCreationListener");
        List<w31> listE = nativeAdBlock.c().e();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listE.iterator();
        while (it.hasNext()) {
            h61 h61VarA = this.f34837a.a(context, nativeAdBlock, imageProvider, nativeAdBinderFactory, nativeAdFactoriesProvider, nativeAdControllers, (w31) it.next());
            if (h61VarA != null) {
                arrayList.add(h61VarA);
            }
            nativeAdFactoriesProvider = j51Var;
            nativeAdControllers = v41Var;
        }
        if (arrayList.isEmpty()) {
            nativeAdCreationListener.a(i7.x());
        } else {
            nativeAdCreationListener.a(arrayList);
        }
    }

    public w71(vu1 sdkEnvironmentModule, k51 nativeAdFactory) {
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        kotlin.jvm.internal.l.f(nativeAdFactory, "nativeAdFactory");
        this.f34837a = nativeAdFactory;
    }
}
