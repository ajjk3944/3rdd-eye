package p0;

import kotlin.jvm.internal.AbstractC6492s;
import m0.M0;

/* renamed from: p0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7180a {

    /* renamed from: a, reason: collision with root package name */
    private C7182c f57375a;

    /* renamed from: b, reason: collision with root package name */
    private C7182c f57376b;

    /* renamed from: c, reason: collision with root package name */
    private o.I f57377c;

    /* renamed from: d, reason: collision with root package name */
    private o.I f57378d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f57379e;

    public final boolean i(C7182c c7182c) {
        if (!this.f57379e) {
            M0.a("Only add dependencies during a tracking");
        }
        o.I i10 = this.f57377c;
        if (i10 != null) {
            AbstractC6492s.f(i10);
            i10.h(c7182c);
        } else if (this.f57375a != null) {
            o.I iA = o.U.a();
            C7182c c7182c2 = this.f57375a;
            AbstractC6492s.f(c7182c2);
            iA.h(c7182c2);
            iA.h(c7182c);
            this.f57377c = iA;
            this.f57375a = null;
        } else {
            this.f57375a = c7182c;
        }
        o.I i11 = this.f57378d;
        if (i11 != null) {
            AbstractC6492s.f(i11);
            return !i11.x(c7182c);
        }
        if (this.f57376b != c7182c) {
            return true;
        }
        this.f57376b = null;
        return false;
    }
}
