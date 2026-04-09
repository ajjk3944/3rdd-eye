package io.appmetrica.analytics.impl;

import c9.C2092m;
import io.appmetrica.analytics.coreutils.internal.toggle.ConjunctiveCompositeThreadSafeToggle;
import io.appmetrica.analytics.coreutils.internal.toggle.OuterStateToggle;
import io.appmetrica.analytics.coreutils.internal.toggle.SavableToggle;

/* loaded from: classes3.dex */
public final class I {

    /* renamed from: a, reason: collision with root package name */
    public final C4769lf f39591a = Ga.j().x();

    /* renamed from: b, reason: collision with root package name */
    public final SavableToggle f39592b;

    /* renamed from: c, reason: collision with root package name */
    public final OuterStateToggle f39593c;

    /* renamed from: d, reason: collision with root package name */
    public final OuterStateToggle f39594d;

    /* renamed from: e, reason: collision with root package name */
    public final ConjunctiveCompositeThreadSafeToggle f39595e;

    /* renamed from: f, reason: collision with root package name */
    public final ConjunctiveCompositeThreadSafeToggle f39596f;

    /* renamed from: g, reason: collision with root package name */
    public final SavableToggle f39597g;

    public I(C4544cm c4544cm) {
        SavableToggle savableToggle = new SavableToggle("advIdsFromClientApi", new H(this));
        this.f39592b = savableToggle;
        OuterStateToggle outerStateToggle = new OuterStateToggle(false, "GAID-remote-config");
        this.f39593c = outerStateToggle;
        OuterStateToggle outerStateToggle2 = new OuterStateToggle(false, "HOAID-remote-config");
        this.f39594d = outerStateToggle2;
        this.f39595e = new ConjunctiveCompositeThreadSafeToggle(C2092m.W(savableToggle, outerStateToggle), "GAID");
        this.f39596f = new ConjunctiveCompositeThreadSafeToggle(C2092m.W(savableToggle, outerStateToggle2), "HOAID");
        this.f39597g = savableToggle;
        a(c4544cm);
    }

    public final void a(C4544cm c4544cm) {
        boolean z10 = c4544cm.f40654p;
        boolean z11 = true;
        this.f39593c.update(!z10 || c4544cm.f40652n.f39477c);
        OuterStateToggle outerStateToggle = this.f39594d;
        if (z10 && !c4544cm.f40652n.f39479e) {
            z11 = false;
        }
        outerStateToggle.update(z11);
    }

    public final F a() {
        int i;
        int i10 = 3;
        int i11 = 4;
        if (this.f39595e.getActualState()) {
            i = 1;
        } else if (this.f39592b.getActualState()) {
            i = !this.f39593c.getActualState() ? 3 : 4;
        } else {
            i = 2;
        }
        if (this.f39596f.getActualState()) {
            i10 = 1;
        } else if (!this.f39592b.getActualState()) {
            i10 = 2;
        } else if (this.f39594d.getActualState()) {
            i10 = 4;
        }
        if (this.f39597g.getActualState()) {
            i11 = 1;
        } else if (!this.f39592b.getActualState()) {
            i11 = 2;
        }
        return new F(i, i10, i11);
    }
}
