package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ew1;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class t21 {

    /* renamed from: c, reason: collision with root package name */
    public static final a f33379c = new a(0);

    /* renamed from: d, reason: collision with root package name */
    private static volatile t21 f33380d;

    /* renamed from: a, reason: collision with root package name */
    private final int f33381a;

    /* renamed from: b, reason: collision with root package name */
    private final WeakHashMap<ku0, m21> f33382b;

    public static final class a {
        private a() {
        }

        public final t21 a(Context context) {
            t21 t21Var;
            kotlin.jvm.internal.l.f(context, "context");
            t21 t21Var2 = t21.f33380d;
            if (t21Var2 != null) {
                return t21Var2;
            }
            synchronized (this) {
                try {
                    t21Var = t21.f33380d;
                    if (t21Var == null) {
                        du1 du1VarA = ew1.a.a().a(context);
                        t21 t21Var3 = new t21(du1VarA != null ? du1VarA.G() : 0, 0);
                        t21.f33380d = t21Var3;
                        t21Var = t21Var3;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return t21Var;
        }

        public /* synthetic */ a(int i) {
            this();
        }
    }

    private t21(int i) {
        this.f33381a = i;
        this.f33382b = new WeakHashMap<>();
    }

    public final m21 b(ku0 media) {
        kotlin.jvm.internal.l.f(media, "media");
        return this.f33382b.remove(media);
    }

    public final boolean a(ku0 media) {
        kotlin.jvm.internal.l.f(media, "media");
        return this.f33382b.containsKey(media);
    }

    public final boolean b() {
        return this.f33382b.size() == this.f33381a;
    }

    public /* synthetic */ t21(int i, int i10) {
        this(i);
    }

    public final void a(m21 mraidWebView, ku0 media) {
        kotlin.jvm.internal.l.f(media, "media");
        kotlin.jvm.internal.l.f(mraidWebView, "mraidWebView");
        if (this.f33382b.size() < this.f33381a) {
            this.f33382b.put(media, mraidWebView);
        }
    }
}
