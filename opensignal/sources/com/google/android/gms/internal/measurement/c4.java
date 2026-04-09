package com.google.android.gms.internal.measurement;

import android.content.Context;

/* loaded from: classes.dex */
public final class c4 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4928a;

    /* renamed from: b, reason: collision with root package name */
    public final ne.n f4929b;

    public c4(Context context, ne.n nVar) {
        this.f4928a = context;
        this.f4929b = nVar;
    }

    public final boolean equals(Object obj) {
        ne.n nVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof c4) {
            c4 c4Var = (c4) obj;
            ne.n nVar2 = c4Var.f4929b;
            if (this.f4928a.equals(c4Var.f4928a) && ((nVar = this.f4929b) != null ? nVar.equals(nVar2) : nVar2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f4928a.hashCode() ^ 1000003;
        ne.n nVar = this.f4929b;
        return (iHashCode * 1000003) ^ (nVar == null ? 0 : nVar.hashCode());
    }

    public final String toString() {
        String string = this.f4928a.toString();
        int length = string.length();
        String strValueOf = String.valueOf(this.f4929b);
        StringBuilder sb2 = new StringBuilder(length + 45 + strValueOf.length() + 1);
        w.g.q(sb2, "FlagsContext{context=", string, ", hermeticFileOverrides=", strValueOf);
        sb2.append("}");
        return sb2.toString();
    }
}
