package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.hh, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4668hh extends AbstractC4539ch {

    /* renamed from: b, reason: collision with root package name */
    public final C4933ro f41018b;

    public C4668hh(C4940s5 c4940s5) {
        this(c4940s5, c4940s5.t());
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4539ch
    public final boolean a(C4683i6 c4683i6) {
        C4940s5 c4940s5 = this.f40632a;
        if (this.f41018b.c()) {
            return false;
        }
        if (!this.f41018b.d()) {
            C9 c92 = c4940s5.f41611n;
            c92.f39235c.b(C4683i6.a(c4683i6, EnumC4997ub.EVENT_TYPE_FIRST_ACTIVATION));
        }
        C4933ro c4933ro = this.f41018b;
        synchronized (c4933ro) {
            C4959so c4959so = c4933ro.f41594a;
            c4959so.a(c4959so.a().put("first_event_done", true));
        }
        return false;
    }

    public C4668hh(C4940s5 c4940s5, C4933ro c4933ro) {
        super(c4940s5);
        this.f41018b = c4933ro;
    }
}
