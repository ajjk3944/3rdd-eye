package io.appmetrica.analytics.impl;

import android.content.Context;
import b9.C1992A;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.sa, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4945sa {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C4945sa f41632c;

    /* renamed from: a, reason: collision with root package name */
    public final Context f41633a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f41634b = new HashMap();

    public C4945sa(Context context) {
        this.f41633a = context;
    }

    public static final C4945sa a(Context context) {
        if (f41632c == null) {
            synchronized (kotlin.jvm.internal.x.a(C4945sa.class)) {
                try {
                    if (f41632c == null) {
                        f41632c = new C4945sa(context);
                    }
                    C1992A c1992a = C1992A.f18074a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        C4945sa c4945sa = f41632c;
        if (c4945sa != null) {
            return c4945sa;
        }
        kotlin.jvm.internal.l.l("INSTANCE");
        throw null;
    }

    public final synchronized P9 b(String str) {
        Object p92;
        try {
            HashMap map = this.f41634b;
            p92 = map.get(str);
            if (p92 == null) {
                p92 = new P9(this.f41633a, str);
                map.put(str, p92);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (P9) p92;
    }

    public final synchronized void a(String str) {
        this.f41634b.remove(str);
    }
}
