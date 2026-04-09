package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Set;
import java.util.WeakHashMap;
import q2.C2841s;

/* renamed from: com.google.android.gms.internal.ads.ul, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1976ul extends VL implements M7 {

    /* renamed from: c, reason: collision with root package name */
    public final WeakHashMap f17153c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f17154d;

    /* renamed from: e, reason: collision with root package name */
    public final Qt f17155e;

    public C1976ul(Context context, Set set, Qt qt) {
        super(set);
        this.f17153c = new WeakHashMap(1);
        this.f17154d = context;
        this.f17155e = qt;
    }

    public final synchronized void H1(View view) {
        try {
            WeakHashMap weakHashMap = this.f17153c;
            N7 n7 = (N7) weakHashMap.get(view);
            if (n7 == null) {
                N7 n72 = new N7(this.f17154d, view);
                n72.f9970l.add(this);
                n72.d(3);
                weakHashMap.put(view, n72);
                n7 = n72;
            }
            if (this.f17155e.f10754X) {
                E9 e9 = H9.f8633M1;
                C2841s c2841s = C2841s.f23267e;
                if (((Boolean) c2841s.f23270c.a(e9)).booleanValue()) {
                    n7.i.h(((Long) c2841s.f23270c.a(H9.f8628L1)).longValue());
                    return;
                }
            }
            n7.i.h(N7.f9959C);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.M7
    public final synchronized void K(L7 l7) {
        C1(new L6(17, l7));
    }
}
