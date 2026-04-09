package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.IReporter;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.eh, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4590eh extends AbstractC4539ch {

    /* renamed from: b, reason: collision with root package name */
    public final IReporter f40817b;

    public C4590eh(C4940s5 c4940s5, IReporter iReporter) {
        super(c4940s5);
        this.f40817b = iReporter;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4539ch
    public final boolean a(C4683i6 c4683i6) {
        Zc zc = (Zc) Zc.f40466c.get(c4683i6.f41047d);
        HashMap map = new HashMap();
        map.put("type", zc.f40467a);
        map.put("delivery_method", zc.f40468b);
        this.f40817b.reportEvent("crash_saved", map);
        return false;
    }
}
