package com.yandex.mobile.ads.impl;

import android.content.Context;
import c9.C2092m;
import c9.C2099t;
import com.yandex.mobile.ads.impl.x01;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class mv1 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f30525a;

    /* renamed from: b, reason: collision with root package name */
    private final x01 f30526b;

    public mv1(Context context, x01 integrationChecker) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(integrationChecker, "integrationChecker");
        this.f30525a = context;
        this.f30526b = integrationChecker;
    }

    public final tx a() {
        x01 x01Var = this.f30526b;
        Context context = this.f30525a;
        x01Var.getClass();
        x01.a aVarA = x01.a(context);
        if (kotlin.jvm.internal.l.b(aVarA, x01.a.C0425a.f35142a)) {
            return new tx(true, C2099t.f18581b);
        }
        if (!(aVarA instanceof x01.a.b)) {
            throw new b9.j();
        }
        List<oo0> listA = ((x01.a.b) aVarA).a();
        ArrayList arrayList = new ArrayList(C2092m.T(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(((oo0) it.next()).getMessage());
        }
        return new tx(false, arrayList);
    }
}
