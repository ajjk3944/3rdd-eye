package com.google.android.gms.common.api.internal;

import r3.C7566d;
import s3.AbstractC7900o;

/* loaded from: classes.dex */
final class B {

    /* renamed from: a, reason: collision with root package name */
    private final C4273b f34748a;

    /* renamed from: b, reason: collision with root package name */
    private final C7566d f34749b;

    /* synthetic */ B(C4273b c4273b, C7566d c7566d, A a10) {
        this.f34748a = c4273b;
        this.f34749b = c7566d;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof B)) {
            B b10 = (B) obj;
            if (AbstractC7900o.a(this.f34748a, b10.f34748a) && AbstractC7900o.a(this.f34749b, b10.f34749b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC7900o.b(this.f34748a, this.f34749b);
    }

    public final String toString() {
        return AbstractC7900o.c(this).a("key", this.f34748a).a("feature", this.f34749b).toString();
    }
}
