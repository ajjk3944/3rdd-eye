package com.lefan.signal.ui.noise;

import C0.C0146b;
import C0.l;
import C0.s;
import G0.b;
import L4.e;
import S4.n;
import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import q5.i;

/* loaded from: classes.dex */
public final class NoiseZoom_Impl extends NoiseZoom {

    /* renamed from: m, reason: collision with root package name */
    public volatile n f19047m;

    @Override // C0.p
    public final l d() {
        return new l(this, new HashMap(0), new HashMap(0), "noise");
    }

    @Override // C0.p
    public final b e(C0146b c0146b) {
        s sVar = new s(c0146b, new e(this, 4), "94008e2e42566fb73cc099430dbee2ef", "9f62f3780ca66abeaadc7375333dddef");
        Context context = c0146b.f1030a;
        i.e(context, "context");
        return c0146b.f1032c.j(new A1.s(context, c0146b.f1031b, sVar, false));
    }

    @Override // C0.p
    public final List f(Map map) {
        return new ArrayList();
    }

    @Override // C0.p
    public final Set h() {
        return new HashSet();
    }

    @Override // C0.p
    public final Map i() {
        HashMap map = new HashMap();
        map.put(n.class, Collections.EMPTY_LIST);
        return map;
    }

    @Override // com.lefan.signal.ui.noise.NoiseZoom
    public final n o() {
        n nVar;
        if (this.f19047m != null) {
            return this.f19047m;
        }
        synchronized (this) {
            try {
                if (this.f19047m == null) {
                    this.f19047m = new n(this);
                }
                nVar = this.f19047m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return nVar;
    }
}
