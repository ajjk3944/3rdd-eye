package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.Player;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes3.dex */
public final class w60 {

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashSet f34828a = new LinkedHashSet();

    /* renamed from: b, reason: collision with root package name */
    private Player f34829b;

    public final void a(ml1 listener) {
        kotlin.jvm.internal.l.f(listener, "listener");
        this.f34828a.add(listener);
    }

    public final boolean b() {
        return this.f34829b != null;
    }

    public final Player a() {
        return this.f34829b;
    }

    public final void a(Player player) {
        this.f34829b = player;
        Iterator it = this.f34828a.iterator();
        while (it.hasNext()) {
            ((ri1) it.next()).a(player);
        }
    }
}
