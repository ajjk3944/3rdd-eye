package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.aj0;
import java.util.Iterator;

/* loaded from: classes3.dex */
final class zi0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ aj0 f36513b;

    public zi0(aj0 aj0Var) {
        this.f36513b = aj0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (aj0.a aVar : this.f36513b.f24697d.values()) {
            Iterator it = aVar.f24703d.iterator();
            while (it.hasNext()) {
                aj0.c cVar = (aj0.c) it.next();
                aj0.d dVar = cVar.f24705b;
                if (dVar != null) {
                    fi2 fi2Var = aVar.f24702c;
                    if (fi2Var == null) {
                        cVar.f24704a = aVar.f24701b;
                        dVar.a(cVar, false);
                    } else {
                        dVar.a(fi2Var);
                    }
                }
            }
        }
        this.f36513b.f24697d.clear();
        this.f36513b.f24699f = null;
    }
}
