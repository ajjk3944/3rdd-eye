package dj;

import br.l;
import cj.n;

/* loaded from: classes.dex */
public final class f implements n {

    /* renamed from: a, reason: collision with root package name */
    public final om.f f7398a;

    /* renamed from: d, reason: collision with root package name */
    public final String f7399d;

    /* renamed from: g, reason: collision with root package name */
    public final io.sentry.hints.i f7400g;

    public f(om.f fVar, String str, io.sentry.hints.i iVar) {
        l.e(iVar, "registrationKeyValidator");
        this.f7398a = fVar;
        this.f7399d = str;
        this.f7400g = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return l.a(this.f7398a, fVar.f7398a) && l.a(this.f7399d, fVar.f7399d) && l.a(this.f7400g, fVar.f7400g);
    }

    public final int hashCode() {
        int iHashCode = this.f7398a.hashCode() * 31;
        String str = this.f7399d;
        return this.f7400g.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // cj.n
    public final void run() {
        StringBuilder sb2 = new StringBuilder("Set registration key to ");
        String str = this.f7399d;
        sb2.append(str);
        ch.n.b("SetRegistrationKeyCommand", sb2.toString());
        this.f7400g.getClass();
        if (str == null || tt.l.D0(str)) {
            ch.n.c("SetRegistrationKeyCommand", "Registration key provided is not valid, Returning");
        } else {
            this.f7398a.u("registration_key", str);
        }
    }

    public final String toString() {
        return "SetRegistrationKeyCommand(keyValueRepository=" + this.f7398a + ", registrationKey=" + this.f7399d + ", registrationKeyValidator=" + this.f7400g + ')';
    }
}
