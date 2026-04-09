package io.sentry.android.replay;

import java.io.File;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final File f11937a;

    /* renamed from: b, reason: collision with root package name */
    public final long f11938b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11939c;

    public k(File file, long j, String str) {
        this.f11937a = file;
        this.f11938b = j;
        this.f11939c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return br.l.a(this.f11937a, kVar.f11937a) && this.f11938b == kVar.f11938b && br.l.a(this.f11939c, kVar.f11939c);
    }

    public final int hashCode() {
        int iB = h0.b.b(this.f11937a.hashCode() * 31, 31, this.f11938b);
        String str = this.f11939c;
        return iB + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ReplayFrame(screenshot=");
        sb2.append(this.f11937a);
        sb2.append(", timestamp=");
        sb2.append(this.f11938b);
        sb2.append(", screen=");
        return h0.b.r(sb2, this.f11939c, ')');
    }
}
