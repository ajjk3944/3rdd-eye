package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.res.Resources;
import o.C7011b;
import r3.C7564b;
import r3.C7567e;
import s3.AbstractC7901p;

/* loaded from: classes.dex */
public final class r extends Z {

    /* renamed from: e, reason: collision with root package name */
    private final C7011b f34850e;

    /* renamed from: f, reason: collision with root package name */
    private final C4276e f34851f;

    r(InterfaceC4279h interfaceC4279h, C4276e c4276e, C7567e c7567e) {
        super(interfaceC4279h, c7567e);
        this.f34850e = new C7011b();
        this.f34851f = c4276e;
        this.mLifecycleFragment.a("ConnectionlessLifecycleHelper", this);
    }

    public static void j(Activity activity, C4276e c4276e, C4273b c4273b) {
        InterfaceC4279h fragment = AbstractC4278g.getFragment(activity);
        r rVar = (r) fragment.c("ConnectionlessLifecycleHelper", r.class);
        if (rVar == null) {
            rVar = new r(fragment, c4276e, C7567e.n());
        }
        AbstractC7901p.m(c4273b, "ApiKey cannot be null");
        rVar.f34850e.add(c4273b);
        c4276e.a(rVar);
    }

    private final void k() {
        if (this.f34850e.isEmpty()) {
            return;
        }
        this.f34851f.a(this);
    }

    @Override // com.google.android.gms.common.api.internal.Z
    protected final void b(C7564b c7564b, int i10) throws Resources.NotFoundException {
        this.f34851f.B(c7564b, i10);
    }

    @Override // com.google.android.gms.common.api.internal.Z
    protected final void c() {
        this.f34851f.C();
    }

    final C7011b i() {
        return this.f34850e;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC4278g
    public final void onResume() {
        super.onResume();
        k();
    }

    @Override // com.google.android.gms.common.api.internal.Z, com.google.android.gms.common.api.internal.AbstractC4278g
    public final void onStart() {
        super.onStart();
        k();
    }

    @Override // com.google.android.gms.common.api.internal.Z, com.google.android.gms.common.api.internal.AbstractC4278g
    public final void onStop() {
        super.onStop();
        this.f34851f.b(this);
    }
}
