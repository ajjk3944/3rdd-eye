package com.yandex.mobile.ads.impl;

import android.content.Context;
import c9.C2097r;
import com.yandex.mobile.ads.impl.j82;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class fi {

    /* renamed from: a, reason: collision with root package name */
    private final vf0 f27340a;

    /* renamed from: b, reason: collision with root package name */
    private final tf0 f27341b;

    public /* synthetic */ fi() {
        this(new vf0(), new tf0());
    }

    public final String a(Context context) {
        String str;
        Object next;
        kotlin.jvm.internal.l.f(context, "context");
        List<String> listA = this.f27340a.a(context);
        if (listA.size() > 1) {
            Iterator it = C2097r.m0(listA).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                j82.f29019a.getClass();
                String strA = j82.a.a((String) next);
                if (strA != null && (!y9.q.i0(strA))) {
                    tf0 tf0Var = this.f27341b;
                    int i = tf0.f33571c;
                    if (tf0Var.a(1000, strA)) {
                        break;
                    }
                }
            }
            str = (String) next;
            if (str == null) {
                str = (String) C2097r.v0(listA);
            }
        } else {
            str = (String) C2097r.q0(listA);
        }
        return str == null ? "yandex.ru/ads" : str;
    }

    public fi(vf0 hostsProvider, tf0 hostReachabilityRepository) {
        kotlin.jvm.internal.l.f(hostsProvider, "hostsProvider");
        kotlin.jvm.internal.l.f(hostReachabilityRepository, "hostReachabilityRepository");
        this.f27340a = hostsProvider;
        this.f27341b = hostReachabilityRepository;
    }
}
