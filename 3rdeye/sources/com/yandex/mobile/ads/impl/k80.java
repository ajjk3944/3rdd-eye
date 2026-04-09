package com.yandex.mobile.ads.impl;

import android.content.Context;
import c9.C2097r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONException;

/* loaded from: classes3.dex */
public final class k80 {

    /* renamed from: a, reason: collision with root package name */
    private final cs0 f29556a;

    /* renamed from: b, reason: collision with root package name */
    private final j80 f29557b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static k80 f29558a;

        public static final synchronized k80 a(Context context) {
            k80 k80Var;
            kotlin.jvm.internal.l.f(context, "context");
            k80Var = f29558a;
            if (k80Var == null) {
                k80Var = new k80(context, 0);
                f29558a = k80Var;
            }
            return k80Var;
        }
    }

    private k80(Context context) {
        this(es0.a(context, "FalseClickDataStorage"));
    }

    public final void a() {
        this.f29556a.clear();
    }

    public final List<i80> b() {
        Set<String> setKeySet = this.f29556a.a().keySet();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = setKeySet.iterator();
        while (it.hasNext()) {
            String strD = this.f29556a.d((String) it.next());
            if (strD != null) {
                arrayList.add(strD);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            i80 i80VarA = this.f29557b.a((String) it2.next());
            if (i80VarA != null) {
                arrayList2.add(i80VarA);
            }
        }
        return C2097r.G0(arrayList2);
    }

    public /* synthetic */ k80(Context context, int i) {
        this(context);
    }

    public final void a(long j4) {
        this.f29556a.a(String.valueOf(j4));
    }

    public /* synthetic */ k80(cs0 cs0Var) {
        this(cs0Var, new j80(0));
    }

    public final void a(i80 falseClickData) throws JSONException {
        kotlin.jvm.internal.l.f(falseClickData, "falseClickData");
        this.f29556a.a(String.valueOf(falseClickData.f()), this.f29557b.a(falseClickData));
    }

    public k80(cs0 localStorage, j80 falseClickDataFormatter) {
        kotlin.jvm.internal.l.f(localStorage, "localStorage");
        kotlin.jvm.internal.l.f(falseClickDataFormatter, "falseClickDataFormatter");
        this.f29556a = localStorage;
        this.f29557b = falseClickDataFormatter;
    }
}
