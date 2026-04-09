package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.impl.vw0;
import d9.C4285c;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class yg {

    /* renamed from: a, reason: collision with root package name */
    private final List<ag<?>> f35784a;

    /* renamed from: b, reason: collision with root package name */
    private x61 f35785b;

    /* JADX WARN: Multi-variable type inference failed */
    public yg(List<? extends ag<?>> assets) {
        kotlin.jvm.internal.l.f(assets, "assets");
        this.f35784a = assets;
    }

    public final HashMap a() {
        bg<?> bgVarA;
        vw0.a aVarF;
        String strA;
        HashMap map = new HashMap();
        Iterator<ag<?>> it = this.f35784a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ag<?> next = it.next();
            String strB = next.b();
            x61 x61Var = this.f35785b;
            if (x61Var != null && (bgVarA = x61Var.a(next)) != null && bgVarA.b()) {
                HashMap map2 = new HashMap();
                yg2 yg2VarC = bgVarA.c();
                if (yg2VarC != null) {
                    map2.put("width", Integer.valueOf(yg2VarC.b()));
                    map2.put("height", Integer.valueOf(yg2VarC.a()));
                }
                nu0 nu0Var = bgVarA instanceof nu0 ? (nu0) bgVarA : null;
                if (nu0Var != null && (aVarF = nu0Var.f()) != null && (strA = aVarF.a()) != null) {
                    map2.put("value_type", strA);
                }
                map.put(strB, map2);
            }
        }
        x61 x61Var2 = this.f35785b;
        View viewE = x61Var2 != null ? x61Var2.e() : null;
        C4285c c4285c = new C4285c();
        if (viewE != null) {
            c4285c.put("width", Integer.valueOf(viewE.getWidth()));
            c4285c.put("height", Integer.valueOf(viewE.getHeight()));
        }
        C4285c c4285cC = c4285c.c();
        if (!c4285cC.isEmpty()) {
            map.put("superview", c4285cC);
        }
        return map;
    }

    public final void a(x61 x61Var) {
        this.f35785b = x61Var;
    }
}
