package f8;

import c8.d0;

/* loaded from: classes.dex */
public final class m extends e {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f8701a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8702b;

    /* renamed from: c, reason: collision with root package name */
    public final c8.h f8703c;

    public m(d0 d0Var, String str, c8.h hVar) {
        this.f8701a = d0Var;
        this.f8702b = str;
        this.f8703c = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return br.l.a(this.f8701a, mVar.f8701a) && br.l.a(this.f8702b, mVar.f8702b) && this.f8703c == mVar.f8703c;
    }

    public final int hashCode() {
        int iHashCode = this.f8701a.hashCode() * 31;
        String str = this.f8702b;
        return this.f8703c.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
    }
}
