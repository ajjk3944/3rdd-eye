package com.yandex.mobile.ads.impl;

import androidx.media3.common.Player;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes3.dex */
public final class v60 {

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashSet f34396a = new LinkedHashSet();

    /* renamed from: b, reason: collision with root package name */
    private Player f34397b;

    public final void a(ll1 listener) {
        kotlin.jvm.internal.l.f(listener, "listener");
        this.f34396a.add(listener);
    }

    public final boolean b() {
        return this.f34397b != null;
    }

    public final Player a() {
        return this.f34397b;
    }

    public final void a(Player player) {
        this.f34397b = player;
        Iterator it = this.f34396a.iterator();
        while (it.hasNext()) {
            ((qi1) it.next()).a(player);
        }
    }
}
