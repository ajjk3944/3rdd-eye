package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.w4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5040w4 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f41890a;

    /* renamed from: b, reason: collision with root package name */
    public final C5091y5 f41891b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f41892c;

    /* renamed from: d, reason: collision with root package name */
    public final Ia f41893d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f41894e;

    /* renamed from: f, reason: collision with root package name */
    public final D4 f41895f;

    public C5040w4(Context context, C5091y5 c5091y5) {
        this(context, c5091y5, new D4());
    }

    public final A4 a(C4758l4 c4758l4, K4 k42) {
        A4 a4A;
        synchronized (this.f41890a) {
            try {
                a4A = (A4) this.f41892c.get(c4758l4);
                if (a4A == null) {
                    this.f41895f.getClass();
                    a4A = D4.a(c4758l4).a(this.f41894e, this.f41891b, c4758l4, k42);
                    this.f41892c.put(c4758l4, a4A);
                    this.f41893d.a(new C5015v4(c4758l4.f41166b, c4758l4.f41167c, c4758l4.f41168d), c4758l4);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return a4A;
    }

    public C5040w4(Context context, C5091y5 c5091y5, D4 d42) {
        this.f41890a = new Object();
        this.f41892c = new HashMap();
        this.f41893d = new Ia();
        this.f41894e = context.getApplicationContext();
        this.f41891b = c5091y5;
        this.f41895f = d42;
    }

    public final void a(String str, Integer num, String str2) {
        synchronized (this.f41890a) {
            try {
                Ia ia2 = this.f41893d;
                Collection collection = (Collection) ia2.f39621a.remove(new C5015v4(str, num, str2));
                if (!AbstractC4623fo.a(collection)) {
                    collection.size();
                    ArrayList arrayList = new ArrayList(collection.size());
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        arrayList.add((A4) this.f41892c.remove((C4758l4) it.next()));
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ((A4) it2.next()).a();
                    }
                }
            } finally {
            }
        }
    }
}
