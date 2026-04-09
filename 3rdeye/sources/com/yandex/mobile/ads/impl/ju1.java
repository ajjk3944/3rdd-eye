package com.yandex.mobile.ads.impl;

import android.content.Context;
import b9.C1992A;
import com.yandex.mobile.ads.impl.ew1;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class ju1 {

    /* renamed from: b, reason: collision with root package name */
    private static final Object f29275b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static volatile ju1 f29276c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f29277d = 0;

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f29278a;

    public static final class a {
        public static ju1 a() {
            ju1 ju1Var;
            ju1 ju1Var2 = ju1.f29276c;
            if (ju1Var2 != null) {
                return ju1Var2;
            }
            synchronized (ju1.f29275b) {
                ju1Var = ju1.f29276c;
                if (ju1Var == null) {
                    ju1Var = new ju1(0);
                    ju1.f29276c = ju1Var;
                }
            }
            return ju1Var;
        }
    }

    private ju1() {
        this.f29278a = new HashMap();
    }

    public final void a(Context context, du1 sdkConfiguration) {
        HashSet hashSet;
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(sdkConfiguration, "sdkConfiguration");
        synchronized (f29275b) {
            hashSet = new HashSet(this.f29278a.keySet());
            ew1.a.a().a(context, sdkConfiguration);
            C1992A c1992a = C1992A.f18074a;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((tu1) it.next()).a(context, sdkConfiguration);
        }
    }

    public /* synthetic */ ju1(int i) {
        this();
    }

    public final void a(fu1 listener) {
        kotlin.jvm.internal.l.f(listener, "listener");
        synchronized (f29275b) {
            try {
                if (!this.f29278a.containsKey(listener)) {
                    this.f29278a.put(listener, null);
                }
                C1992A c1992a = C1992A.f18074a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
