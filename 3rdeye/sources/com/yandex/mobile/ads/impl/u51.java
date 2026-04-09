package com.yandex.mobile.ads.impl;

import c9.C2097r;
import c9.C2099t;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class u51 {

    /* renamed from: a, reason: collision with root package name */
    private final rk0 f33938a;

    public /* synthetic */ u51() {
        this(new rk0());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList] */
    public final String a(h61 h61Var) {
        ?? G7;
        if (h61Var instanceof pz1) {
            ArrayList arrayListD = ((pz1) h61Var).d();
            G7 = new ArrayList();
            Iterator it = arrayListD.iterator();
            while (it.hasNext()) {
                String info = ((h61) it.next()).getInfo();
                if (info != null) {
                    G7.add(info);
                }
            }
        } else {
            String info2 = h61Var != null ? h61Var.getInfo() : null;
            G7 = info2 != null ? E.u.G(info2) : C2099t.f18581b;
        }
        List list = G7;
        this.f33938a.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return C2097r.u0(list, StringUtils.COMMA, "[", "]", null, 56);
    }

    public u51(rk0 formatter) {
        kotlin.jvm.internal.l.f(formatter, "formatter");
        this.f33938a = formatter;
    }
}
