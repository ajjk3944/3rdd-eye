package mj;

import br.l;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f16856a;

    /* renamed from: b, reason: collision with root package name */
    public final ak.b f16857b;

    public h(String str, ak.b bVar) {
        this.f16856a = str;
        this.f16857b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return l.a(this.f16856a, hVar.f16856a) && l.a(this.f16857b, hVar.f16857b);
    }

    public final int hashCode() {
        String str = this.f16856a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        ak.b bVar = this.f16857b;
        return iHashCode + (bVar != null ? bVar.hashCode() : 0);
    }

    public final String toString() {
        return "InitialisedSecretsResult(encryptedApiSecrets=" + this.f16856a + ", apiSecret=" + this.f16857b + ')';
    }
}
