package com.yandex.mobile.ads.impl;

import c9.C2097r;
import c9.C2099t;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes3.dex */
public final class ao0 {

    /* renamed from: a, reason: collision with root package name */
    private final ou f24768a;

    public /* synthetic */ ao0() {
        this(new ou());
    }

    public final ud2 a(nu creative, String str) {
        Object next;
        kotlin.jvm.internal.l.f(creative, "creative");
        this.f24768a.getClass();
        Iterator it = ou.a(creative).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (kotlin.jvm.internal.l.b(((ag) next).b(), str)) {
                break;
            }
        }
        ag agVar = (ag) next;
        ir0 ir0VarA = agVar != null ? agVar.a() : null;
        if (ir0VarA != null) {
            return new ud2(ir0VarA.e(), ir0VarA.d());
        }
        String strC = creative.c();
        List list = (List) ((LinkedHashMap) creative.a()).get("clickTracking");
        return new ud2(strC, list != null ? C2097r.n0(list) : C2099t.f18581b);
    }

    public ao0(ou creativeAssetsProvider) {
        kotlin.jvm.internal.l.f(creativeAssetsProvider, "creativeAssetsProvider");
        this.f24768a = creativeAssetsProvider;
    }
}
