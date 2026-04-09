package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class El {

    /* renamed from: a, reason: collision with root package name */
    public final Ia f39381a = new Ia();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f39382b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public C4544cm f39383c = null;

    /* renamed from: d, reason: collision with root package name */
    public final Cl f39384d = new Cl(this);

    public static final El a() {
        return Dl.f39315a;
    }

    public final C5108ym a(Context context, C4759l5 c4759l5, Wl wl) {
        C5108ym c5108ym = (C5108ym) this.f39382b.get(c4759l5.f41170a);
        boolean z10 = true;
        if (c5108ym == null) {
            synchronized (this.f39382b) {
                try {
                    c5108ym = (C5108ym) this.f39382b.get(c4759l5.f41170a);
                    if (c5108ym == null) {
                        c5108ym = new C5108ym(new C5133zm(context, c4759l5.f41170a, wl, this.f39384d));
                        c5108ym.f();
                        this.f39382b.put(c4759l5.f41170a, c5108ym);
                        z10 = false;
                    }
                } finally {
                }
            }
        }
        if (z10) {
            c5108ym.a(wl);
        }
        return c5108ym;
    }

    public final void a(C4759l5 c4759l5, Nl nl) {
        synchronized (this.f39382b) {
            try {
                this.f39381a.a(c4759l5.f41170a, nl);
                C4544cm c4544cm = this.f39383c;
                if (c4544cm != null) {
                    nl.a(c4544cm);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
