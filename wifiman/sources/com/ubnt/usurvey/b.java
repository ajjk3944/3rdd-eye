package com.ubnt.usurvey;

import com.ubnt.usurvey.a;
import gg.i;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;

/* loaded from: classes3.dex */
public final class b implements a.b {

    /* renamed from: a, reason: collision with root package name */
    private a f39673a = new a(false, false, false, false, false, false, false, null, false, false, false, false, false, false, null, null, null, 131071, null);

    /* renamed from: b, reason: collision with root package name */
    private final i f39674b;

    public b() {
        i iVarK0 = i.K0(getConfig());
        AbstractC6492s.h(iVarK0, "just(...)");
        this.f39674b = iVarK0;
    }

    @Override // com.ubnt.usurvey.a.b
    public void a(InterfaceC6835l updater) {
        AbstractC6492s.i(updater, "updater");
        throw new IllegalStateException("app configuration update in production build");
    }

    @Override // com.ubnt.usurvey.a.b
    public i b() {
        return this.f39674b;
    }

    @Override // com.ubnt.usurvey.a.b
    public a getConfig() {
        return this.f39673a;
    }
}
