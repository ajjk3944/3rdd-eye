package com.yandex.mobile.ads.impl;

import c9.C2095p;
import c9.C2099t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class ea1 {

    /* renamed from: a, reason: collision with root package name */
    private final uw0 f26761a = new uw0();

    public final boolean a(j41 nativeAdBlock) {
        kotlin.jvm.internal.l.f(nativeAdBlock, "nativeAdBlock");
        List<w31> listE = nativeAdBlock.c().e();
        ArrayList arrayList = new ArrayList();
        for (w31 w31Var : listE) {
            this.f26761a.getClass();
            C2095p.b0(uw0.a(w31Var), arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ya2 ya2VarC = ((sw0) it.next()).c();
            List<mb2<ab1>> listC = ya2VarC != null ? ya2VarC.c() : null;
            if (listC == null) {
                listC = C2099t.f18581b;
            }
            C2095p.b0(listC, arrayList2);
        }
        if (arrayList2.isEmpty()) {
            return false;
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            if (!((mb2) it2.next()).g().d().isEmpty()) {
                return true;
            }
        }
        return false;
    }
}
