package com.ui.wifiman.model.support;

import com.ui.wifiman.model.support.a;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class d extends a.AbstractC1437a {

    /* renamed from: a, reason: collision with root package name */
    private final List f43185a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(List neigh) {
        super(null);
        AbstractC6492s.i(neigh, "neigh");
        this.f43185a = neigh;
    }

    public final List b() {
        return this.f43185a;
    }
}
